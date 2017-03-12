package ru.leventel8.lessons;

class ArraySh {

    private long[] theArray;            //Переменная приватного типа, объявление массива
    private int nElems;                 //Переменная приватного типа, объявление счетчика элементов массива


    /**
     * Конструктор при инициализации
     * принимает параметр max
     * @param max
     *      размер массива
     */
    public ArraySh(int max){

        theArray = new long[max];       //новый объект массива размером max
        nElems = 0;                     // счетчик элементов массива

    }

    /**
     * вставка в массив
     * @param value
     */
    public void insert(long value){

        theArray[nElems] = value;      // вставка value в ячейку nElems
        nElems++;                      // имнкримент nElems

    }// end insert()

    /**
     * вывод содержимого массива
     */
    public void display(){

        System.out.print("A=");
        for(int j=0; j<nElems; j++)                 // перебор элементов массива в цикле
            System.out.print(theArray[j]+ " ");     // вывод содержимого массива
        System.out.println("");

    }// end display()

    /**
     * сортировка Шелла
     */
    public void shellSort(){

        int inner, outer;                           // переменные алгоритма
        long temp;
        int h = 1;
        while(h <= nElems/3)
            h = h*3 +1;
        while(h>0){

            for(outer = h; outer<nElems; outer++){                  // реализация алгоритма сортировки Шелла

                temp = theArray[outer];
                inner = outer;

                while(inner > h-1 && theArray[inner - h]>= temp){

                    theArray[inner] = theArray[inner-h];
                    inner -= h;

                }
                theArray[inner] = temp;
            }
            h = (h-1)/3;
        }


    }// end shellSort()

    public long getFirst(){
        long first = theArray[0];
        return first;

    }//end getFirst()

}// end class ArraySh
