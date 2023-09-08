// https://projectlombok.org/setup/maven

# Erstellt ein neues Java-Projekt in IntelliJ und nutzt Lombok, um eine einfache Shop-Entität zu erstellen.

#### _Schritt 1:_  
Fügt die Lombok-Abhängigkeit zu eurem Projekt hinzu und konfiguriert IntelliJ, um Lombok zu unterstützen.

#### _Schritt 2:_  
Erstellt eine einfache Klasse "Student" mit den folgenden Attributen: id, name, adress, grade.

#### _Schritt 2.1:_ 
Verwendet die passenden Lombok-Annotationen, um Getter, Setter, Equals, HashCode, ToString und Konstruktoren für die Entität zu generieren.

#### _Schritt 3:_   
Erstelle einen Teacher Record mit den folgenden Attributen: id, name, subject.

#### _Schritt 4:_   
Erstelle eine Klasse Course mit den folgenden Attributen: id, name, teacher, students.

#### _Schritt 4.1:_ 
Verwendet die passenden Lombok-Annotationen, um Getter, Setter, Equals, HashCode, ToString und Konstruktoren für die Entität zu generieren.

#### _Schritt 5:_   
Schreibt eine "Main"-Klasse, in der ihr einige Beispiele für das Erstellen von Students, Teachers und Courses mit den Konstruktoren anwendet.

#### _Schritt 6:_   
Prüft in der "Main"-Klasse ob die generierten Lombok Methoden korrekt funktionieren (getter, setter, toString,...).


BONUSAUFGABEN:

* Finde herraus was die Lombok Annotation @Value macht und nutze diese für die Klasse Course.

* Erstelle einen Record University mit den folgenden Attributen: id, name, courses.

* Erstelle eine Klasse UniversityService und implementiere dort folgende Methoden:

* Schreibe eine Funktion um die Durschnittsnote eines Courses zu berechnen(Übergebt den Course als Parameter).

* Schreibe eine Funktion um die Durschschnittsnote der ganzen Universität zu berechnen(Übergebe ein Universitäts-Objekt als Parameter).

* Schreibe eine Funktion die aus einer Universität alle Schüler mit mindestens der Note 2/"Gut" raussucht und als Liste zurück gibt(Übergebt ein Universitäts-Objekt als Parameter).
