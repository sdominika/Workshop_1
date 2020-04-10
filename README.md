###GAME1 - Gra w zgadywanie liczb
Gra w zgadywanie liczb
Napisz prostą grę w zgadywanie liczb. Komputer ma wylosować liczbę w zakresie od 1 do 100.
Następnie:
1. wypisać: "Zgadnij liczbę" i pobrać liczbę z klawiatury;
2. sprawdzić, czy wprowadzony napis, to rzeczywiście liczba i w razie błędu wyświetlić komunikat: "To
nie jest liczba"
, po czym wrócić do pkt. 1;
3. jeśli liczba podana przez użytkownika jest mniejsza niż wylosowana, wyświetlić komunikat: "Za
mało!"
, po czym wrócić do pkt. 1;
4. jeśli liczba podana przez użytkownika jest większa niż wylosowana, wyświetlić komunikat: "Za
dużo!"
, po czym wrócić do pkt. 1;
5. jeśli liczba podana przez użytkownika jest równa wylosowanej, wyświetlić komunikat: "Zgadłeś!"
,
po czym zakończyć działanie programu.

<b><u>Przykład:</u></b>

Zgadnij liczbę: cześć<br>
To nie jest liczba.<br>
Zgadnij liczbę: 50<br>
Za mało!<br>
Zgadnij liczbę: 75<br>
Za dużo!<br>
Zgadnij liczbę: 63<br>
Zgadłeś!

###GAME2 - Symulator LOTTO
Jak wszystkim wiadomo, LOTTO to gra liczbowa polegająca na losowaniu 6 liczb z zakresu od 1 do 49.
Zadaniem gracza jest poprawne wytypowanie losowanych liczb. Nagradzane jest traenie 3, 4, 5 lub 6
poprawnych liczb.<br>
Napisz program, który:<br>
1. zapyta o typowane liczby, przy okazji sprawdzi następujące warunki:
- czy wprowadzony ciąg znaków jest poprawną liczbą,
- czy użytkownik nie wpisał tej liczby już poprzednio,
- czy liczba należy do zakresu 1-49,
2. po wprowadzeniu 6 liczb, posortuje je rosnąco i wyświetli na ekranie,
3. wylosuje 6 liczb z zakresu i wyświetli je na ekranie,
4. poinformuje gracza, czy trał przynajmniej "trójkę"

Aby wylosować 6 liczb z zakresu 1-49 bez powtórzeń możemy utworzyć tablicę z wartościami z tego
zakresu, wymieszać jej zawartość i pobrać pierwsze 6 elementów.
Poniższy kod powinien Ci pomóc:
```
Integer[] arr = new Integer[49];
for (int i = 0; i < arr.length; i++) {
arr[i] = i + 1;
}
System.out.println(Arrays.toString(arr));
Collections.shuffle(Arrays.asList(arr));
System.out.println(Arrays.toString(arr));
```
Możesz również losować liczby z określonego zakresu przy użyciu klasy ```Random``` (sprawdź w
snippetach jak to wykonać) – jeżeli wybierzesz takie rozwiązanie, pamiętaj o sprawdzaniu czy dana
wartość nie została wcześniej wylosowana

###GAME3 - Gra w zgadywanie liczb 2

Odwróćmy teraz sytuację z warsztatu "Gra w zgadywanie liczb": to użytkownik pomyśli sobie liczbę z
zakresu 1-1000, a komputer będzie zgadywał i zrobi to maksymalnie w 10 ruchach (pod warunkiem,
że gracz nie będzie oszukiwał).Zadaniem gracza będzie udzielanie odpowiedzi "więcej", "mniej", "trałeś".
Na następnym slajdzie znajduje się schemat blokowy algorytmu.<br>
Dostępny jest także pod adresem: <br>
 https://gist.github.com/arek-jozwiak-coderslab/4783d45e75a71793a123673cc0998ae3<br>
Zaimplementuj go w Javie.

