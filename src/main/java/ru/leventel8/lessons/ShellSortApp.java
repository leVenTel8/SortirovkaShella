package ru.leventel8.lessons;

class ShellSortApp {

    public static void main(String[] args){

        int maxSize = 10;                               // максимальный размер массива
        ArraySh arr;
        arr = new ArraySh(maxSize);                     // создание нового массива размера maxSize

        for(int j=0; j<maxSize; j++){                   // вставка рандомных элемнтов в массив

            long n = (int)(java.lang.Math.random()*99);
            arr.insert(n);

        }
        arr.display();                                  // вывод содержимого
        arr.shellSort();                                // сортировка Шелла
        arr.display();                                  // вывод содержимого
    }// end main()

}// end class SelectSortApp
