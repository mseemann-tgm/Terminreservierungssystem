# Data Dokumentation
Data beinhaltet die Daten des Projektes. 

## JPA
Die Daten sollen mittels JPA persistiert und veröffentlicht werden.
JPA wird für dieses Projekt von Hibernate implementiert. Es sollen aber keine Hibernate-spezifischen
Funktionalitäten benutzt werden.

## Benutzte Technologien
  * Apache Maven
  * JPA mit Hibernate Implementierung
  * Junit

  Mehr dazu: [Technologien Überblick](./Technologien_Overview.md)

## Design
Siehe Astah

## Ausführen
Duch Maven kann man das Projekt auf folgende weise kompeliert werden:
```
mvn package
```
Daraufhin kann man `Main` über IntelliJ Ausführen;


## Testing

Duch JUnit kann man die Persistierung und mögliche Constraints testen.
