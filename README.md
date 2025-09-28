## Goal: Move game object registration logic from `fabric`/`forge`/`neoforge` projects to `common`

---

What does registering new game objects look like traditionally (for mod-loader specific project)?

> Reference tutorials created by Kaupenjoe
> for [NeoForge](https://github.com/Tutorials-By-Kaupenjoe/NeoForge-Tutorial-1.21.X/blob/main/src/main/java/net/kaupenjoe/tutorialmod/TutorialMod.java)

---

### What are our options?

We'll review, ordered by complexity of updating our project:

1. Mimicking `Botania`, no extra dependencies
2. Adding `RegistrationUtils`, soft-dependency which shadows itself into our final jar
3. Adding `Bookshelf`, hard-dependency which has very accessible content registration
4. Moving to `Architectury`, another project like MultiLoader-Template but adds more functionality

---


How can we achieve a traditional approach to registering game objects in our MultiLoader-Template
based project?

### 1. Mimicking [Botania](https://www.curseforge.com/minecraft/mc-mods/botania)

---

1. Game objects (Blocks, Items, Entities, etc.) are defined as public static fields in `common`
2. Those game objects are added to a bi-consumer in a public method in `common` along with a
   ResourceLocation
3. Our mod loader entrypoints consumes that public method (i.e. `ModBlocks#register`) to bind
   game objects keyed to a ResourceLocation to a Minecraft registry
4. Our game objects are registered!

### 2. Adding [RegistrationUtils](https://github.com/Matyrobbrt/RegistrationUtils)

---

1. `RegistrationUtils` is added
   as [a plugin from the Gradle plugin portal](https://plugins.gradle.org/plugin/com.matyrobbrt.mc.registrationutils)
   to our root `build.gradle` file, along
   with [configuration](https://github.com/Matyrobbrt/RegistrationUtils)
2. We define a RegistrationProvider in `common` which is similar to Forge's DeferredRegister
3. We define new game objects as public static fields of RegistryObject created from registering to
   a RegistrationProvider
4. RegistrationUtils handles the rest, as long as our fields are loaded via class access or other
   means

### 3. Adding [Bookshelf](https://www.curseforge.com/minecraft/mc-mods/bookshelf)

---

1. `Bookshelf` is added as a dependency for `common` and mod-loader-specific projects
2. We define a new class implementing IContentProvider from Bookshelf, and define our game objects
3. We create a
   new [provider-configuration file](https://docs.oracle.com/javase/8/docs/api/java/util/ServiceLoader.html)
   for our content provider with the fully-qualified binary name of the service's type (i.e.
   `net.darkhax.bookshelf.common.api.registry.IContentProvider`)
4. Bookshelf handles the rest!

### 4. Moving to [Architectury](https://www.curseforge.com/minecraft/mc-mods/architectury-api)

---

1. Generate a new `Architectury` project via
   the [Architectury Template Generator](https://generate.architectury.dev/) with matching mod name,
   ID, package name, version, etc., along with Architectury API dependency (should default to be
   enabled)
2. Copy the generated project over, and delete `buildSrc` directory
3. Define new game object registration classes using Architectury's DeferredRegister and RegistrySupplier classes
4. Architectury handles the rest, as long as our fields are loaded via class access or other
   means
