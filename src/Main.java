import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

       // Java 8 үчүн практикалык тапшырма
//
//        1. Жаңы массив тизмесин түзүү үчүн Java программасын жазыңыз,
//        бир нече шаарларды  кошуп, аларды консольго чыгарыныз


        ArrayList<String> strings = new ArrayList<>();
        strings.add("Batken");
        strings.add("Osh");
        strings.add("Bishkek");
        System.out.println(strings);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


//        2. Массив тизмесине элементти биринчи орунга киргизүү үчүн Java программасын жаз.


        ArrayList<String> strings1 = new ArrayList<>();
        strings1.add("Nurseyit");
        strings1.add("Baiysh");
        strings1.add("Syimyk");
        strings1.add("Ilim");
        strings1.add("Iskak");
        strings1.add(0,"Hello world" );
        System.out.println(strings1);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


//        3. Берилген массивдердин тизмесинен элементти (белгиленген индексте) алуу үчүн Java программасын жазыңыз.


        ArrayList<Integer> integers  = new ArrayList<>();
        integers.add(10);
        integers.add(9);
        integers.add(8);
        integers.add(7);
        integers.add(6);
        integers.add(5);
        System.out.println(integers.get(3));
        System.out.println(integers);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`");


//        4. Берилген элемент боюнча белгилүү бир массив элементин озгортуу үчүн Java программасын жазыңыз.


//
        ArrayList<Integer> integers1 = new ArrayList<>();
        integers1.add(100);
        integers1.add(101);
        integers1.add(102);
        integers1.add(103);
        integers1.add(104);
        integers1.add(105);
        integers1.add(106);
        integers1.add(107);
        integers1.add(108);
        integers1.add(109);
        integers1.add(110);
        System.out.println(integers1.set(4, 9999));
        System.out.println(integers1);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~ ");


//        5. Массив тизмесинен үчүнчү элементти очуруп салуу үчүн Java программасын жазыңыз.



        ArrayList<Integer> integers2 = new ArrayList<>();
        integers2.add(234);
        integers2.add(235);
        integers2.add(236);
        integers2.add(237);
        integers2.add(238);
        System.out.println(integers2.remove(3));
        System.out.println(integers2);


//        6. Массив тизмесиндеги элементти издөө үчүн Java программасын жазыңыз.


        ArrayList<String> futbal = new ArrayList<>();
        futbal.add("Lionel Messi");
        futbal.add("Neymar JR");
        futbal.add("Cristiano Ronaldo");
        futbal.add("Muhamad Salax");
        futbal.add("Karim Benzema");
        futbal.add("Ederson");
        System.out.println(futbal.lastIndexOf("Ederson"));
        System.out.println(futbal);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~ ");


//        7. Берилген массивдердин тизмесин сорттоо үчүн Java программасын жазыңыз.


        ArrayList<Integer> itn = new ArrayList<>(Arrays.asList(123, 12, 21, 34, 54, 453));
        System.out.println(itn);
        Collections.sort(itn);
        System.out.println(itn);
        System.out.println("\n~~~~~~~~~~~~~~\n");


//        8. Бир массив тизмесин экинчи масивге көчүрүү үчүн Java программасын жазыңыз.


        ArrayList<String> boys = new ArrayList<>();
        boys.add("Baitik");
        boys.add("Davran");
        boys.add("Baiysh");
        boys.add("Nurseyit");
        ArrayList<String> girls = new ArrayList<>();
        girls.add("Saltanat");
        girls.add("Kanykey");
        girls.add("Aigerim");
        girls.add("Madina");

        System.out.println(boys);
        System.out.println(girls);
        boys.addAll(girls);
        System.out.println(boys);
        System.out.println("boys.addAll() = " + boys.addAll(girls));
        System.out.println(boys);


//        9. Массив тизмесиндеги элементтерди аралаштыруу үчүн Java программасын жазып.
//        Маанилерин консольго чыгарыныз.
        try{

            ArrayList<Integer> integers3 = new ArrayList<>();
            integers3.add(1);
            integers3.add(4);
            integers3.add(3);
            integers3.add(2);
            integers3.add(6);
            integers3.add(5);
            integers3.add(8);
            integers3.add(587);
            integers3.add(576);
            Collections.shuffle(integers3);
            System.out.println(integers3);

        }catch (RuntimeException e){
            System.out.println("Hello");
        }

//        10. Массив тизмесиндеги элементтерди тескери өзгөртүү үчүн Java программасын жазыңыз.


        Collections.reverse(integers);
        System.out.println(integers);


////        11. Аррейлисттин бир бөлүгүн алуу үчүн Java программасын жазыңы


        System.out.println(integers.subList(1, 3));

    }
}


