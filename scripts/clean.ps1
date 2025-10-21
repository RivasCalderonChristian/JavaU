# Limpia la carpeta bin
if (Test-Path -Path "bin") {
    Remove-Item -Recurse -Force -Path "bin"
    Write-Host "Directorio bin eliminado." -ForegroundColor Yellow
} else {
    Write-Host "No existe directorio bin." -ForegroundColor Gray
}
