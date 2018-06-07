# Server Dokumentation
Der Server bildet die Verbindung zwischen den persistierten Daten und dem Client.
Die Kommunikation zu dem Client erfolgt über eine REST Schnittstelle, die zu den Daten durch JPQL und JPA.

## REST Schnittstelle
Die Hauptaufgabe des Servers ist es, dem Client über die REST Schnittstelle Daten zu liefern.
Hierfür wird Spring REST verwendet. Dieses kümmert sich auch um das Umwandeln von Java Objekten in JSON Objekte und umgekehrt.

Auch die Speicherung der SessionTolkens, also der Anmeldung, soll von dem Server übernommen werden.

## Benutzte Technologien
  * Apache Maven
  * Spring REST Api
  * JPA mit Hibernate Implementierung
  * Junit

  Mehr dazu: [Technologien Überblick](./Technologien_Overview.md)

## Ausführen
Duch Maven kann man das Projekt auf folgende weise kompeliert werden:
```
mvn package
```
Daraufhin kann man `Main` über IntelliJ Ausführen;


## Testing

Durch JUnit kann die Verbindung zu den persistierten Daten getestet werden (Mittels JPA/JPQL).
