# Introductie

Deze oefening is deel van de DEA Course aan de Hogeschool Arnhem/Nijmegen. Onderwerp is
het bekend raken met jUnit als testsframework voor het schrijven van unittests.

# Oefeningen
In deze oefening gaan we nogmaals de FizzBuzz kata uitwerken. Echter gaan we er deze keer voor zorgen
dat we ook de bijbehorende unittests schrijven. 
Daarbij beginnen we steeds met het schrijven van een unittest voor een specifieke requirement van 
FizzBuzz. Pas daarna implementeren we de requirement zelf. 

## Oefening 1: Toevoegen van een jUnit aan een Maven project
Om gebruik te kunnen maken van jUnit moet een dependency aan de POM worden toegevoegd. Kies hierbij voor de laatste 
versie van [jUnit 5](https://junit.org/junit5/). 

## Oefening 2: Het maken van een testklasse
Het project bevat twee klassen. Een `FizzBuzzRunner` en een `FizzbuzzExecutor`. De `FizzBuzzExecutor`
zal de code gaan bevatten die de daadwerkelijke checks doet. De `FizzBuzzRunner` bevat enkele een `main`
methode die een reeks van getallen genereert en daarmee de `FizzbuzzExecutor` laat bepalen of er `Fizz`, 
`Buzz` of het getal zelf moet worden geprint.

In deze oefening gaan we de methode `execute` van de `FizzBuzzExecutor` implementeren. Maar natuurlijk 
beginnen we met het schrijven van een unittests.

* Voeg een testklasse toe voor de klasse `FizzBuzzExecutor` aan je project. Volg hierbij de volgende aanwijzingen:
    * Voor het antwoord op de vraag: 'Wat is eigenlijk een testklasse?', bekijk de 
    [Userguide](https://junit.org/junit5/docs/current/user-guide/) van jUnit 5
    * Voor het antwoord op de vraag: 'Waar moet ik mijn tests plaatsen?', lees het volgende onderdeel van 
    de [jUnit 4 FAQ](https://junit.org/junit4/faq.html#organize_1). 
    
## Oefening 3: Schrijf een eerste unittest
* Voeg aan je testklasse onderstaande unittest toe en zorg ervoor dat je hem kunt uitvoeren en dat hij slaagt.
```$xslt
    void executeWithValidIntTest(){
        // Setup
            var sut = new FizzbuzzExecutor();
            
        // Test
            var testValue = sut.execute(37);
            
        // Verify
            Assertions.assertEquals("37", testValue);
    }
```

De afkorting **sut** staat hierbij voor **S**ystem **U**nder **T**est. Een handige naamgeving voor de klasse die je daadwerkelijk aan het 
testen bent.

Om van de methode een unittest te maken zul je hem moeten annoteren met de annotatie `@Test`. Wanneer je de test
daarna uitvoert zul je zien dat deze faalt. Om hem te laten slagen zul je de methode `execute(int)` correct moeten 
implementeren. Bouw op dit moment nog geen FizzBuzz gedrag in, zorg er enkel voor dat je test slaagt. Enkele aanwijzingen:
    
    * Voor het antwoord op de vraag: 'Hoe run ik mijn Unittest met Maven?', lees deze 
        [tutorial](https://www.mkyong.com/maven/how-to-run-unit-test-with-maven/).
    * Het uitvoeren van een Unittest kan binnen IntelliJ door met de rechtermuisknop op de unittest te klikken en
    dan de optie `Run executeWithValidIntTest()`. IntelliJ zal in dat geval enkele de gekozen unittest uitvoeren.
    
## Oefening 4: Schrijf een tweede unittest voor Fizz
* Voeg een tweede unittest toe die test of de methode `execute(int)` de string `Fizz` teruggeeft wanneer `int` deelbaar is 
door 3 en zorg ervoor dat deze unittest slaagt.

## Oefening 5: Voeg een setup methode toe aan je testklasse
In beide unittests die je nu hebt gemaakt instantieer je een `FizzbuzzExecutor`. Je hebt hier dus herhalende code. Om dit
op te lossen voegen we een *setup*

* Voeg de volgende methode toe aan je testklasse en annoteer hem met `@BeforeEach`. Verwijder hierbij ook de *setup* code uit
de twee tests. Die is nu overbodig geworden.
```$xslt

    private FizzbuzzExecutor sut;
    
    void setup(){
        sut = new FizzbuzzExecutor();
    }
```

## Oefening 6: Schrijf een derde unittest voor Buzz
* Voeg een derde unittest toe die test of de methode `execute(int)` de string `Buzz` teruggeeft wanneer `int` deelbaar is 
door 5 en zorg ervoor dat deze unittest slaagt.

## Oefening 7: Schrijf een derde unittest voor FizzBuzz
* Voeg een vierde unittest toe die test of de methode `execute(int)` de string `FizzBuzz` teruggeeft wanneer `int` deelbaar is 
door 15 en zorg ervoor dat deze unittest slaagt.

## Oefening 8: Voer alle unittests uit met Maven
Mogelijk heb je dit al eerder gedaan, maar zorg ervoor dat je alle unittests kunt uitvoeren met Maven

## Oefening 9: Run with Coverage
Gebruik IntelliJ om je Unittests uit te voeren en gelijktijdig inzichtelijk te maken welk percentage van je code
wordt ge-unittest. Ook dit kan via het contextmenu. Echter moet je daarvoor niet met de rechter-muisklik op de unittest klikken, 
maar op de testklasse.
