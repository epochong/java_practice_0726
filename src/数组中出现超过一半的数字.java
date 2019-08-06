/**
 * @author epochong
 * @date 2019/7/26 22:42
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class 数组中出现超过一半的数字 {
    public int MoreThanHalfNum_Solution(int [] array) {
        int card = 0;
        int  time = 0;
        for (int i = 0; i < array.length; i++) {
            if(time == 0) {
                card = array[i];
                time = 1;
            } else if(card == array[i]) {
                time++;
            } else {
                time--;
            }
        }
        time = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == card) {
                time++;
            }
        }
        if(time > array.length / 2) {
            return card;
        } else {
            return 0;
        }
    }
}
