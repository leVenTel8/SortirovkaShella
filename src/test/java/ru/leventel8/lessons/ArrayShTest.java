package ru.leventel8.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayShTest {

    /**
     * проверка вставки
     */
    @Test
    public void testInsert() {
        ArraySh arraySh = new ArraySh(7);           //создаем объект массива
        arraySh.insert(8);                         // вставляем элемент
        assertEquals(8, arraySh.getFirst());    // сравниваем ожидаемое значение с приходящим

    }//end testInsert()

    /**
     * проверка сортировки Шелла
     */
    @Test
    public void testShellSort() {
        ArraySh arraySh = new ArraySh(7);
        arraySh.insert(8);
        arraySh.insert(5);
        arraySh.insert(4);
        arraySh.insert(3);
        arraySh.insert(1);
        arraySh.shellSort();                            // сортируем массив после вставки элементов
        assertEquals(1,arraySh.getFirst());

    }//end testShellSort()

}//end class ArrayShTest