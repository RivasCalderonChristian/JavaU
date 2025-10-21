# Compila todos los .java en el directorio actual a bin\
# Compila por separado cada archivo para evitar que errores en unos impidan compilar otros

$ErrorActionPreference = 'Continue'

if (-Not (Test-Path -Path "bin")) { New-Item -ItemType Directory -Path "bin" | Out-Null }

$files = Get-ChildItem -Path . -Filter *.java
$success = @()
$failed = @()

foreach ($f in $files) {
    Write-Host "Compilando $($f.Name)..." -ForegroundColor Cyan
    & javac -d bin $f.FullName
    if ($LASTEXITCODE -eq 0) {
        $success += $f.Name
    } else {
        $failed += $f.Name
    }
}

Write-Host "\nResumen:" -ForegroundColor Green
Write-Host "Compilados: $($success.Count)" -ForegroundColor Green
foreach ($s in $success) { Write-Host "  - $s" }
Write-Host "Fallaron: $($failed.Count)" -ForegroundColor Red
foreach ($s in $failed) { Write-Host "  - $s" }
