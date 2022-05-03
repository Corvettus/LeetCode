package solution448;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        LinkedList<Integer> missed = new LinkedList<>();    // result
        boolean[] map = new boolean[nums.length];           // карта появления чисел

        // [{0: false};{1: true}] <=> число 1 мы не встретили, а 2 встретили.
        // map, потому что ключи - индексы массива, а значения - true/false в ячейках.

        for (int n : nums) {    // идем по массиву
            map[n - 1] = true;      // встречаем число => в "его" ячейке true
        }

        for (int i = 0; i < nums.length; i++) { // перебираем все числа (но уменьшенные на 1)
            if (!map[i]) {                          // если число ни разу не встретилось
                missed.add(i + 1);                      // оно появляется в исходном листе
            }
        }

        return missed;
    }
}