# Fastest Stations

Server-side Minecraft mod that makes processing blocks work at **1 item per tick** while keeping fuel consumption unchanged.

## Supported versions

- **1.20.1** — Forge (`fastest-stations-1.20.1/`)
- **1.21.1** — Fabric (`fastest-stations-1.21.1/`)

## What it does

- Furnaces, blast furnaces, smokers and any modded furnace that extends `AbstractFurnaceBlockEntity` smelt one item per tick. Fuel still lasts the same amount of ticks.
- Hoppers (and filter hoppers that extend the vanilla hopper) transfer items with a 1-tick cooldown.
- Brewing stands finish brewing in a single tick.

## Server-side only

The mod is designed to run **only on the server**. Players do **not** need to install it on their clients to join.

## Limitations

Machines from other mods that do not extend the vanilla block entity classes covered above will require dedicated mixins to be accelerated.
