<div align="center">

<!-- Banner placeholder - replace with your own banner image if desired -->
<img src="https://via.placeholder.com/800x220/2D2D2D/F5F5F5?text=Fast+Workstations" alt="Fast Workstations Banner" width="100%" style="max-width: 800px; border-radius: 12px;" />

<h1>🔥 Fast Workstations</h1>

<p>
  <a href="https://minecraft.net">
    <img src="https://img.shields.io/badge/Minecraft-1.21.1-62B47A?style=for-the-badge&logo=minecraft&logoColor=white" alt="Minecraft 1.21.1" />
  </a>
  <a href="https://fabricmc.net/">
    <img src="https://img.shields.io/badge/Fabric-0.116.12-DBB068?style=for-the-badge&logo=fabric&logoColor=white" alt="Fabric API" />
  </a>
  <a href="https://www.java.com/">
    <img src="https://img.shields.io/badge/Java-21-EA2D2E?style=for-the-badge&logo=java&logoColor=white" alt="Java 21" />
  </a>
  <a href="LICENSE">
    <img src="https://img.shields.io/badge/License-CC0--1.0-8A8A8A?style=for-the-badge&logo=creativecommons&logoColor=white" alt="License CC0-1.0" />
  </a>
</p>

<p><strong>A lightweight Fabric mod that accelerates furnaces and hoppers to their practical limit while keeping fuel behavior intact.</strong></p>

</div>

---

## 📋 Overview

**Fast Workstations** removes the unnecessary waiting time from two of Minecraft's most-used automation blocks:

- **Furnaces** (including Blast Furnaces and Smokers) now smelt **one item per tick**, but fuel still burns for its default duration.
- **Hoppers** now move items with a cooldown of **one tick**, making item transport eight times faster than vanilla.

Everything is handled server-side through clean Mixin injections, so the mod is compatible with vanilla clients and most modded recipes or containers.

---

## ✨ Features

<div align="center">

<table>
  <tr>
    <td align="center" width="50%">
      <h3>⚡ 1 Item = 1 Tick</h3>
      <p>Every furnace-compatible recipe — vanilla or modded — finishes in a single tick.</p>
    </td>
    <td align="center" width="50%">
      <h3>🪵 Default Fuel Duration</h3>
      <p>Coal, blaze rods, lava buckets and every other fuel last exactly as long as in vanilla.</p>
    </td>
  </tr>
  <tr>
    <td align="center" width="50%">
      <h3>📦 Faster Hoppers</h3>
      <p>Hoppers transfer one item every tick instead of every eight ticks.</p>
    </td>
    <td align="center" width="50%">
      <h3>🔌 Broad Compatibility</h3>
      <p>Works with Furnace, Blast Furnace, Smoker and any modded subclass of <code>AbstractFurnaceBlockEntity</code>.</p>
    </td>
  </tr>
</table>

</div>

---

## 📦 Requirements

| Dependency        | Version  |
|-------------------|----------|
| Minecraft         | 1.21.1   |
| Fabric Loader     | ≥ 0.19.3 |
| Fabric API        | 0.116.12+|
| Java              | 21+      |

---

## 🚀 Installation

1. Download the latest release from the [Releases](https://github.com/YOUR_USERNAME/fast-workstations/releases) page.
2. Install [Fabric Loader](https://fabricmc.net/use/) for Minecraft **1.21.1**.
3. Place the downloaded `fast-workstations-1.0.0.jar` into your `.minecraft/mods` folder.
4. Launch the game. No configuration needed.

---

## ⚙️ How It Works

The mod uses two small Mixin injections:

1. **`AbstractFurnaceBlockEntityMixin`** — sets the cook time target to `1` at the start of each server tick. The actual fuel consumption logic is left untouched.
2. **`HopperBlockEntityMixin`** — caps the post-transfer cooldown to `1` tick, turning the vanilla 8-tick delay into a 1-tick delay.

No recipes, blocks or items are added, keeping the mod lightweight and conflict-free.

---

## 🤝 Compatibility

- ✅ Vanilla Furnace, Blast Furnace and Smoker
- ✅ Modded items and smelting recipes
- ✅ Modded containers interacting with hoppers
- ⚠️ Other mods that heavily modify furnace or hopper tick logic may require testing

---

## 🛠️ Building from Source

```bash
# Clone the repository
git clone https://github.com/YOUR_USERNAME/fast-workstations.git
cd fast-workstations

# Build the mod JAR
./gradlew build
```

The compiled JAR will be available at:

```
build/libs/fast-workstations-1.0.0.jar
```

---

## 📄 License

This project is released under the [CC0-1.0 License](LICENSE). You are free to use, modify and distribute it as you wish.

---

<div align="center">

<p><sub>Made with ❤️ for the Fabric community.</sub></p>

</div>
