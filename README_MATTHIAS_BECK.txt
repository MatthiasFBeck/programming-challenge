Ich will hier zusammenfassen, wie meine Lösung aussieht:

UtilityCSV ist zuständig für das Laden und Abspeichern der .csv Dateien. Die Daten werden jeweils in ArrayLists abgelegt. Die Methoden minDist/maxDist sind für die Berechnung der gewünschten Tage/Teams zuständig. Diese erhalten als Input jeweils 2 Spaltenindizes.

Leider besitze ich bisher noch keine praktische Erfahrung mit Test-Driven Development und habe es nicht geschafft, mit den JUnit Tests zu arbeiten. Natürlich habe ich die einzelnen Komponenten für mich selbst getestet.