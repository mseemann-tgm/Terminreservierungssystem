# Dokumentation Terminreservierung
  Die Terminreservierungssoftware ist in 3 Teile aufgeteilt.

  * ## Client
  Der Client ist die Benutzeroberfläche.

  GitHub-Ordner: [/Sources/Client](./../Sources/Client)

  * ##  Server

   Der Server verbindet den Client über eine REST-Schnittstelle mit der Datenspeicherung.

  GitHub-Ordner: [/Sources/Server](./../Sources/Server)

  Dokumentation: [Server Dokumentation](./Dokumentation_Server.md)

  * ## Data
  Data sind die Gespeicherten Daten der Applikation, implementiert mittels JPA.

  GitHub-Ordner: [/Sources/Data](./../Sources/Data)

  Dokumentation: [Data Dokumentation](./Dokumentation_Data.md)

# Benutzte Technologien
  Das Projekt benutzt mehrere Technologien.

  Folgende werden möglicherweise benutzt:
  * Apache Maven
  * Spring REST Api
  * JPA mit Hibernate Implementierung
  * Mockito
  * Junit

  Diese und deren Benutzung werden hier genauer beschrieben: [Technologien Überblick](./Technologien_Overview.md)

# Ausführung
  Zum funktionsfähigen Ausführen des Programmes, muss man die Komponenten in folgender Reihenfolge starten:
  1. Data
  2. Server(s)
  3. Clients

  Das Ausführen dieser Komponenten wird in den jeweiligen Dokumentationen beschrieben.

# Weitere Informationen
  * Überblick über den Aufbau der Software findet in den Astah-UML-Files: [/Design](./../Design)

# Protokollrichtlinien
  * Dieses Protokoll soll keine, von dem Projekt kopierten, Grafiken oder Codesnippets enthalten
  * Dieses Protokoll soll sich hauptsächlich auf die Struktur und den Aufbau,
    und nicht auf die Implementierung der einzelnen Komponenten fokusieren.
    Ausnahmen sind sehr projektspezifische Einzelheiten.
