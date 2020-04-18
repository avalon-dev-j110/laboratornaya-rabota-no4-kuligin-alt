package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;
import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        
        Cat[] cats = new Cat[4];
        
        cats[0] = new Cat("Barsik", 9);
        cats[1] = new Cat("Murzik", 7);
        cats[2] = new Cat("Bibbo", 4);
        cats[3] = new Cat("Vasyka", 11);
        /*
         * TODO(Студент): Проинициализируйте массив strings
         *
         * Массив слелдует проинициализировать таким образом,
         * чтобы он содержал 20 строк, расположенных не
         * по порядку.
         */
	    String[] strings = {"Str03", "Str02", "Str05", "Str09", "Str20",
                                "Str14", "Str08", "Str04", "Str18", "Str07",
                                "Str17", "Str01", "Str19", "Str12", "Str16",
                                "Str13", "Str11", "Str10", "Str06", "Str15",};

	    /*
	     * TODO(Студент): Проинициализируйте массив persons
	     *
	     * 1. Создайте класс, реализующий интерфейс Person.
	     *
	     * 2. Проинициализируйте массив persons 20
	     *    экземплярыми созданного класса.
	     */
	    Person[] persons = new Person[20];
            
            persons[0] = new Persons("Ivan", LocalDate.of(1989, 4, 25));
            persons[1] = new Persons("Ilya", LocalDate.of(1995, 1, 21));
            persons[2] = new Persons("Petr", LocalDate.of(1988, 3, 14));
            persons[3] = new Persons("Aleksey", LocalDate.of(1978, 4, 26));
            persons[4] = new Persons("Denis", LocalDate.of(1996, 5, 28));
            persons[5] = new Persons("Kirill", LocalDate.of(1983, 7, 11));
            persons[6] = new Persons("Ivan", LocalDate.of(1991, 8, 15));
            persons[7] = new Persons("Gleb", LocalDate.of(1988, 11, 14));
            persons[8] = new Persons("Ruslan", LocalDate.of(1994, 3, 17));
            persons[9] = new Persons("Dmitriy", LocalDate.of(1987, 6, 16));
            persons[10] = new Persons("Aleksander", LocalDate.of(1997, 2, 10));
            persons[11] = new Persons("Igor", LocalDate.of(1996, 9, 14));
            persons[12] = new Persons("Kirill", LocalDate.of(1991, 7, 19));
            persons[13] = new Persons("Artem", LocalDate.of(1988, 4, 29));
            persons[14] = new Persons("Ilya", LocalDate.of(1992, 10, 25));
            persons[15] = new Persons("Semen", LocalDate.of(1996, 8, 16));
            persons[16] = new Persons("Andrey", LocalDate.of(1997, 4, 18));
            persons[17] = new Persons("Daniil", LocalDate.of(1987, 5, 28));
            persons[18] = new Persons("Vladislav", LocalDate.of(1979, 5, 26));
            persons[19] = new Persons("Artur", LocalDate.of(1991, 1, 18));
            
        /*
         * TODO(Студент): Проинициализируйте переменную sort
         *
         * 1. Создайте класс, реализующий интерфейс Sort
         *
         * 2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */
        Sort sort = new MySort();
        
        /*
         * TODO(Студент): Проинициализируйте переменную comparator
         *
         * 1. Создайте класс, реализующий интерфейс Comparator.
         *    Подумайте о контексте, в котором будет
         *    использоваться экземпляр.
         *
         * 2. Проинициализируйте переменную comparator
         *    экземпляром созданного класса.
         */
        Comparator comparator = new MyComparator();
        
        sort.sort(cats);
        
        System.out.println();

        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        
        sort.sort(persons);
        
        System.out.println();

        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(strings);
        
        System.out.println();

        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
        sort.sort(strings, new MyComparator());
    }
}
