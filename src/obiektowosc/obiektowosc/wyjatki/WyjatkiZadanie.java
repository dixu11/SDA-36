package obiektowosc.obiektowosc.wyjatki;

import java.util.ArrayList;

public class WyjatkiZadanie {

    public static void main(String[] args) {
        FileConnection connection = new FileConnection();
        try {
            connection.connect();
            System.out.println("Połączono");
            ArrayList<String> lines = connection.getData();
            System.out.println(lines);
        } catch (FileConnectionException e) {
            System.out.println("Błąd połączenia");
        } catch (NoDataException e) {
            System.out.println("Brak danych po połączeniu");
        }finally {
            connection.disconnect();
        }

        System.out.println(connection);

    }


}

   /*
        Przygotuj klasę FileConnection, pozwalającą łączyć się z plikiem i pobierać z niego dane. Wywołanie metody connect
        ma ustawiać stan bazy na połączony, jednak ma istnieć 25% szans na to że połączenie się nie powiedzie i zostanie
        rzucony Twój własny wyjątek FileConnectionException.
        Stwórz również metodę umożliwiającą pobranie danych z bazy (jako działanie tej metody wykorzystaj wcześniej przygotowane
        czytanie pliku z książkami) wynik zwracaj jako String lub List<String> . Jeśli brakuje plików lub plik tekstowy
        jest pusty należy również rzucić wyjątek FileDbConnectionException z odpowiednią wiadomością.
        Zaimplementuj również metodę “disconnect” zmieniający stan obiektu na nie połączony. Wywołaj tę metodę w bloku
        finally w main.*/

