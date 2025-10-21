[![CI](https://github.com/RivasCalderonChristian/JavaU/actions/workflows/ci.yml/badge.svg)](https://github.com/RivasCalderonChristian/JavaU/actions)

# JavaM - Proyecto Java simple

Este workspace contiene varios programas Java de ejemplo.

Requisitos:

- JDK instalado y la variable `java` disponible en PATH (por ejemplo, OpenJDK o Oracle JDK).

Compilar y ejecutar un archivo Java (PowerShell):

```powershell
# Compilar (archivo en src/)
javac -d bin src\NombreArchivo.java
# Ejecutar
java -cp bin NombreArchivo
```

Compilar todos los archivos .java en `src/` (PowerShell):

```powershell
javac -d bin src\*.java
java -cp bin NombreArchivoPrincipal
```

También puedes usar los scripts en `scripts/`:

```powershell
# Compilar todos (se compilan archivo por archivo para tolerar errores individuales)
Set-ExecutionPolicy -Scope Process -ExecutionPolicy Bypass -Force; .\scripts\build_all.ps1

# Limpiar bin
.\scripts\clean.ps1

# Ejecutar clase desde bin (por defecto HelloWorld)
.\scripts\run.ps1 -main HelloWorld
```

Si quieres usar tareas de VS Code, ya incluí `tasks.json` y `launch.json` en `.vscode`.

