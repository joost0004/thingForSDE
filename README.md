# SDE Program

Wij hebben voor ons programma twee games gemaakt. Je kan vanuit main.java kiezen welke je wilt spelen.

Als eerste hebben we een hoger of lager spelletje gemaakt. Hier krijg je een cijfer tussen de 1 en de 10 en dan moet je zeggen of het volgende getal hoger of lager is. Heb je het goed dan gaat je score +1. 
Heb je het fout, dan gaat er een leven vanaf. Na 3 levens verloren te zijn ben je af en krijg je je score. 

Het tweede spel is een spelletje steen papier schaar. Het concept hiervan is vast bekend. Je antwoord met steen papier of schaar en de tegenstander doet hetzelfde. 
Steen wint van schaar, papier wint van steen en schaar wint van papier. Je hebt hier ook 3 levens. Als je alle levens kwijt bent krijg je je score en ben je klaar.

# Creational 

## Singleton

Om de speler een tegenstander te geven in dit spel hebben we een Opponnent class gemaakt. Deze class gebruikt het singleton design pattern. Er hoeft namelijk maar een opponent te zijn.
De class gebruikt een van de twee, door de user bepaalde, moveStrategy's om een passende zet te maken bij het gekozen spel.

![image](https://media.discordapp.net/attachments/808434220967788544/934152439353999450/unknown.png)


# Structural

## Adapter

De ConsoleReader class die we gebruiken om een input van de user te accepteren geeft aan de gebruikende class een string terug. Echter willen we voor de vergelijking in de strattegy een integer gebruiken.
Daarom is deze adapter gemaakt om de waarde om te zetten naar iets wat onze vergelijking kan gebruiken.
We weten dat dit geen gebruikelijke manier is om een adapter te implementeren. Echter hopen we hiermee wel te laten zien dat we het concept van een adapter begrijpen en dit kunnen implementeren.

![image](https://media.discordapp.net/attachments/808434220967788544/934152279760719912/unknown.png)

# Behavioural

## Strategy
Beide spelletjes hebben ongeveer dezelfde layout. Eerst word er om een input van de user gevraagd, daarna worden de berekeningen gemaakt en dan word de output gegeven.
Hierdoor was het voor ons logisch om voor een strategie te kiezen. Vanuit de strategy word je naar 1 van 2 files gestuurd. Dit word bepaald aan de hand van welke game je gekozen hebt. 
In die files staat wat de computer moet doen, wat voor tekst er geprint moet worden en welke berekeningen gemaakt moeten worden. 
Dit is voor beide spelletjes verschillend. Aan het eind word de score toegerekend. Een punt erbij, een leven eraf of niks. Als je aantal levens 0 is stopt het spel en word je uit de loop gegooid. 
De strategy zorgt er hier voor dat je vanuit de desbetreffende class naar 1 file hoeft te verwijzen. Deze regelt alles voor beide spelletjes.

![image](https://media.discordapp.net/attachments/808434220967788544/934152220935602196/unknown.png)


