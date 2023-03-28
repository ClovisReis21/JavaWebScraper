## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Available commands

### npm run build
create .class and .jar files from .java and libs

### npm run start
run node application

### npm run test
run build and start

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies
- `src/drivers`: the folder to maintain webDrivers

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


There is a path conflict between debug running and npm run *, so please use only npm run *

## result expected (terminal):

    App iniciado...
    Starting ChromeDriver 111.0.5563.64 (c710e93d5b63b7095afe8c2c17df34408078439d-refs/branch-heads/5563@{#995}) on port 41013
    Only local connections are allowed.
    Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
    ChromeDriver was started successfully.
    mar 28, 2023 12:39:07 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
    Title: Google
    Titulo confere
    App finalizado!
