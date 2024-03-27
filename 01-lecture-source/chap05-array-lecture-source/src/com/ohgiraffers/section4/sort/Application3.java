package com.ohgiraffers.section4.sort;

public class Application3 {
    public static void main(String[] args) {
        /* 선택정렬
        * 배열을 전부 탐색하여 최소값을 고르고 외노쪽부터 채워가는 방식
        * 데이터양이 적을 때 좋은 성능을 나타낸다.
        * 데이터가 많으면 속도가 저하된다.
        * */
        int[] iarr = {2,5,4,6,1,3};
        int min;
        int temp;

        for(int i = 0; i<iarr.length -1; i++ ){
            min = i;
            for(int j= i+1; j<iarr.length; j++){
                if(iarr[min] > iarr[j]){
                    min = j;
                }
            }
            temp = iarr[min];
            iarr[min] = iarr[i];
            iarr[i] = temp;
            System.out.println( iarr[min] +" 자리교체 " +  iarr[i]);

        }
        for(int i : iarr){
            System.out.print(i + " ");
        }
        System.out.println();


    }
}
