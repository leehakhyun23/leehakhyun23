package com.ohgiraffers.section3.copy;

import java.util.Arrays;

public class Application3 {
    public static void main(String[] args) {
        /* 깊은 복사에 대해 이해할 수 있다.
        *
        * 깊은 복사는 haep에 생성된 배열이 가지고 있는 값을
        * 또 다른배열에 복사를 해놓은 것이다.
        * 서로 같은 값을 가지고 있지만,두 배열은 서로 다른 배열이기 때문에
        * 하나의 배열을 변경 하더라도 다른 배열에는 영향을 주지 않는다.*/

        /* 깊은 복사를 하는 방법은 4가지
        * 1. for문을 이용한 동일한 인덱스 값 복사
        * 2. object의 clone()을 이용한 복사
        * 3. System의 arraycopy()를 이용한 복사
        * 4. Array의 copyOf()를 이용한 복사
        * 이중에서 가장 높은 성능을 보이는건 arrycopy()이다
        * 가장 많이 사용되는 방식은 copyOf()메소드이다
        * clone()은 이전 배열과 같은 배열밖에 만들수 없다
        * 그 외 3가지 방법은 복사하는 배열의 길이를 마음대로 조절 할수 있따.*/

        int[] originArr = new int[]{1,2,3,4,5}; //1283928880
        print(originArr);
        /* 1. for문을 통해서 통일한 인덱스 값 복사 */

        int[] copy1 = new int[10]; //1989780873
        for(int i= 0; i<originArr.length; i++){
            copy1[i] = originArr[i];

        }
        print(copy1);

        /* 2번째 방법 clone()을 이용한 복사 */
        int[] copy2 = originArr.clone(); //1480010240

        /* 3번째 방법 System의 arraycopy()을 이용한 복사
        * 원본배열. 복사를 시작할 인덱스, 복사할 배열, 복사를 시작할 인덱스 , 복사할 길이의 의미를 가진다. */

        int[] copy3 = new int[10];
        System.arraycopy(originArr, 0 , copy3 , 3 , originArr.length);
        print(copy3);

        /* 4.Arrays의 copyOf()를 이용한 복사 */
        int[] copy4 = Arrays.copyOf(originArr, 7);
        print(copy4);

    }
    public static void print(int[] iarr){
        System.out.println("iarr의해시코드 = " + iarr.hashCode());
        for(int i = 0; i < iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

    }
}
