param(
    [string]$main = "HelloWorld"
)

if (-Not (Test-Path -Path "bin")) {
    Write-Host "No existe bin/. Compila primero (scripts\build_all.ps1)." -ForegroundColor Red
    exit 1
}

Write-Host "Ejecutando $main desde bin..." -ForegroundColor Cyan
& java -cp bin $main
