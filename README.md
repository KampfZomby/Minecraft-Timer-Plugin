# Minecraft-Timer-Plugin

A 1.18.1 plugin for your next minecraft challenge

## Table of contents

 * [How to build](#how-to-build)
    * [Git](#git)
    * [IntelliJ IDEA](#IntelliJIDEA)
    * [Cloning and generating the plugun](#cloning-and-generating-the-plugin)
 * [Staying Up To Date](#staying-up-to-date)
 * [Project Structure](#project-structure)
 * [Features](#features)
 * [Contributing](#contributing)

## How to build

Requirements:

 * [Git](#Git)
 * [IntelliJ IDEA](#IntelliJIDEA)

If you have both of the above requirements you can skip to [cloning the git repo and generating the project files](#cloning-and-generating-project-files).

### Git

If you haven't installed git on your system go and do so it is **REQUIRED** for setting up a working build environment.

[Download Link](https://git-scm.com/download/win)

### IntelliJ IDEA

IntelliJ IDEA is an integrated development environment and used to generate the plugin, if you haven't used it before we will need to download and install it.

[Download Link](https://www.jetbrains.com/idea/download/)

### Cloning and generating project files

- Make sure that you have installed Git and IntelliJ IDEA.

- Clone the repository:
  ```bash
  git clone https://github.com/KampfZomby/Minecraft-Timer-Plugin.git
  ```

#### Generate the plugin

- IntelliJ IDEA

## Staying Up To Date

Pull the latest changes from this repository.

With a command line it is as easy as:

```bash
git pull
```

## Project Structure

- `listener/` all features that are waiting for something like someone joinig are here
- `timer/` includes everything related to the timer
- `Plugin.java/` main file

## Features

 - `/timer` opens a menu
 - `/timer resume/start/run`
 - `/timer pause/stop`
 - `/timer set <time>`
 - `/timer reset`
 - `/timer show/hide`
 - `/timer mode`

## Contributing
