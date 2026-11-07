# Fire-Einstellungen

Mini-App für Fire TV: öffnet beim Start direkt die vollständigen Fire-TV-Einstellungen
(`com.amazon.tv.launcher/.ui.MainSettingsActivity`) und schließt sich wieder.

Gedacht für Launcher-Ersatz wie Projectivy, der den üblichen Weg zu den Einstellungen
abfängt. Auf anderen Geräten öffnet sie die normalen Android-Einstellungen.

## Bauen

GitHub Actions, Workflow „APK“ (Push auf `main` oder von Hand). Signiert mit den
Repository-Secrets `ANDROID_KEYSTORE_BASE64`, `ANDROID_STORE_PASSWORD`,
`ANDROID_KEY_PASSWORD`, `ANDROID_KEY_ALIAS`. Ergebnis: Artefakt `fire-einstellungen-apk`.

## Installieren

```
adb install fire-einstellungen.apk
```
Danach erscheint „Fire-Einstellungen“ in der App-Liste und kann in Projectivy angeheftet werden.
