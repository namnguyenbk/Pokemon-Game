package algorithms;

import main.Main;

import java.util.Random;

public class Shuffle {
    private static int[][] mapDefault = new int[11][18];

    public static final int[][] initMapdefault() {
        //       int id = 1;
//        for (int i = 0; i < 9 ; i++) {
//            for (int j = 0; j < 16; j+= 2) {
//                for (int k = 0; k < 2 ; k++) {
//                    if (id > 36) id =1;
//                    mapDefault[i][j+k] = id;
//                }
//                id++;
//            }
//        }

        mapDefault[0] = new int[]{0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
        mapDefault[1] = new int[]{0,  1,  5,  2,  7,  2,  3,  8,  4,  1,  5,  10, 14, 19, 23, 28, 32, 0};
        mapDefault[2] = new int[]{0,  5,  1,  6,  6,  3,  7,  4,  8,  1,  6,  10, 15, 29, 24, 28, 33, 0};
        mapDefault[3] = new int[]{0,  9,  10, 9,  10, 11, 15, 12, 12, 2,  6,  11, 16, 20, 24, 19, 34, 0};
        mapDefault[4] = new int[]{0,  13, 13, 14, 14, 15, 11, 16, 16, 2,  7,  12, 16, 20, 25, 29, 33, 0};
        mapDefault[5] = new int[]{0,  17, 21, 18, 19, 18, 23, 3,  20, 3,  20, 12, 15, 21, 21, 30, 34, 0};
        mapDefault[6] = new int[]{0,  21, 17, 22, 22, 27, 19, 24, 24, 7,  8,  11, 17, 25, 26, 30, 31, 0};
        mapDefault[7] = new int[]{0,  25, 30, 26, 4,  23, 27, 28, 28, 26, 35, 17, 13, 22, 26, 8,  35, 0};
        mapDefault[8] = new int[]{0,  29, 33, 30, 34, 31, 35, 32, 32, 4,  9,  13, 18, 22, 27, 31, 32, 0};
        mapDefault[9] = new int[]{0,  33, 29, 25, 34, 35, 31, 36, 36, 5,  9,  14, 18, 23, 27, 36, 36, 0};
        mapDefault[10]= new int[]{0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};

//        mapDefault[0] = new int[]{0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};
//        mapDefault[1] = new int[]{0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0, 23, 21,  0,  0,  0,  0,  0};
//        mapDefault[2] = new int[]{0,  6,  0,  0,  0,  0,  0,  0,  0,  0,  0, 22,  9,  0,  0,  0,  0,  0};
//        mapDefault[3] = new int[]{0,  3,  2,  0,  0,  0,  0,  0,  0,  0,  0, 24,  0,  0,  0,  0,  0,  0};
//        mapDefault[4] = new int[]{0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 25,  0,  0,  0,  0,  0,  0};
//        mapDefault[5] = new int[]{0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 26, 31,  0,  0,  0,  0,  0};
//        mapDefault[6] = new int[]{0,  0,  0, 12,  0,  0,  0,  0,  0,  0,  0, 27, 30,  0,  0,  0,  0,  0};
//        mapDefault[7] = new int[]{0,  0,  0, 11,  0,  0,  0,  0,  0,  0,  0, 30, 29, 33,  0,  0,  0,  0};
//        mapDefault[8] = new int[]{0,  4,  7,  8,  0,  0,  0,  0,  0,  0,  0, 20, 19, 32,  0,  0,  0,  0};
//        mapDefault[9] = new int[]{0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 18,  0,  0,  0,  0,  0};
//        mapDefault[10]= new int[]{0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0};

//        mapDefault[0]  = new int[]{0 ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0,  0  ,0  ,0  ,0  ,0};
//        mapDefault[1]  = new int[]{0 ,1  ,0  ,0  ,7  ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,8,  19 ,23 ,28 ,32 ,0};
//        mapDefault[2]  = new int[]{0 ,5  ,1  ,0  ,0  ,3  ,0  ,0  ,0  ,0  ,0  ,0  ,15 ,29 ,0  ,28 ,33 ,0};
//        mapDefault[3]  = new int[]{0 ,9  ,10 ,9  ,10 ,11 ,15 ,12 ,12 ,0  ,0  ,0  ,16 ,20 ,0  ,29 ,34 ,0};
//        mapDefault[4]  = new int[]{0 ,13 ,13 ,14 ,14 ,15 ,11 ,16 ,16 ,0  ,7  ,0  ,16 ,20 ,25 ,29 ,33 ,0};
//        mapDefault[5]  = new int[]{0 ,17 ,0  ,18 ,19 ,18 ,23 ,3  ,20 ,3  ,20 ,0  ,15 ,21 ,21 ,30 ,34 ,0};
//        mapDefault[6]  = new int[]{0 ,21 ,0  ,27 ,0  ,27 ,19 ,0  ,0  ,7  ,8  ,0  ,17 ,25 ,26 ,30 ,31 ,0};
//        mapDefault[7]  = new int[]{0 ,25 ,0  ,0  ,0  ,18 ,27 ,28 ,28 ,26 ,35 ,17 ,13 ,0  ,26  ,8 ,35 ,0};
//        mapDefault[8]  = new int[]{0 ,29 ,33 ,30 ,0  ,31 ,35 ,32 ,32 ,4  ,9  ,13 ,0,  0  ,27 ,31 ,32 ,0};
//        mapDefault[9]  = new int[]{0 ,33 ,29 ,25 ,0  ,35 ,31 ,0  ,0  ,5  ,9  ,14 ,0,  23 ,27 ,0  ,0  ,0};
//        mapDefault[10] = new int[]{0 ,0  , 0 ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0  ,0,  0  ,0  ,0  ,0  ,0};
        return mapDefault;
    }

    private static final int[][] shuffleMapDefault(int[][] map) {
        Random rand = new Random();
        int row;
        int col;
        int lengthCol = map[0].length;
        int lengthRow = map.length;
        for (int i = 0; i < 50; i++) {
            row = rand.nextInt(8) + 1;
            if (row != 0 && row != 10)
            reverseRow(map, row, lengthCol);
            col = rand.nextInt(15) + 1;
            reverseCol(map, col, lengthRow);
        }
        return map;
    }

    public static final int[][] shuffleByRow( int[][] map){
        int x1,x2,y1,y2;
        x1 = 0;
        x2 = 10;
        y1 = 0;
        y2 = 17;
        while(!(((x2 <= x1)&&(y2 <= y1))||((y2 >= y1) &&(x2 < x1)))){
            if((map[x2][y2] != 0)&&(map[x1][y1] != 0)){
                swap(map,x1,y1,x2,y2);
                y2 = y2 -1;
                if(y2 < 0){
                    x2 = x2 -1;
                    y2 = 17;
                    if(x2 < 0){
                        break;
                    }
                }


                y1 = y1 + 1;
                if(y1 > 17){
                    x1 = x1 + 1;
                    y1 = 0;
                    if(x1 > 10){
                        break;
                    }
                }


            }else {
                if(map[x2][y2] == 0){

                    y2 = y2 -1;
                    if(y2 < 0){
                        x2 = x2 -1;
                        y2 = 17;
                        if(x2 < 0){
                            break;
                        }
                    }
                }
                if(map[x1][y1] == 0){

                    if(map[x1][y1] == 0){
                        y1 = y1 + 1;
                        if(y1 > 17){
                            x1 = x1 + 1;
                            y1 = 0;
                            if(x1 > 10){
                                break;
                            }
                        }
                    }
                }
            }
        }
        return removeSymmetric(map);
    }

    public static final int[][] shuffleByCol(int[][] map){
        int x1,x2,y1,y2;
        x1 = 0;
        x2 = 10;
        y1 = 0;
        y2 = 17;
        while(!((x2 <= x1)&& (y2 <= y1))||((x2 >= x1)&&(y2 < y1))){
            if((map[x2][y2] != 0)&&(map[x1][y1] != 0)){
                swap(map,x1,y1,x2,y2);
                x2 = x2 -1;
                if(x2 < 0){
                    y2 = y2 - 1;
                    x2 = 10;
                    if(y2 < 0){
                        break;
                    }
                }
                x1 = x1 + 1;
                if(x1 > 10){
                    y1 = y1 + 1;
                    x1 = 0;
                    if(y1 > 17){
                        break;
                    }
                }
            }else {
                if(map[x2][y2] == 0){
                    x2 = x2 -1;
                    if(x2 < 0){
                        y2 = y2 - 1;
                        x2 = 10;
                        if(y2 < 0){
                            break;
                        }
                    }
                }
                if(map[x1][y1] == 0){
                    x1 = x1 + 1;
                    if(x1 > 10){
                        y1 = y1 + 1;
                        x1 = 0;
                        if(y1 > 17){
                            break;
                        }
                    }
                }
            }
        }
        return removeSymmetric(map);
    }

    public static int[][] removeSymmetric(int[][] map){
        int x1,x2,y1,y2;
        x1 = 0;
        x2 = 10;
        y1 = 0;
        y2 = 17;
        while(!(((x2 <= x1)&&(y2 <= y1))||((y2 >= y1) &&(x2 < x1)))){
            if((map[x1][y1] != 0)&& (map[x1][y1] == map[x2][y2])&&(x2 == map.length - (x1 + 1))&&(y2 == map[1].length - (y1 + 1))){
                //System.out.println("find: ("+x1+","+y1+")"+" x ("+x2+","+y2+")");
                swap(map,x2,y2,x1,y2);
                y2 = y2 -1;
                if(y2 < 0){
                    x2 = x2 -1;
                    y2 = 17;
                    if(x2 < 0){
                        break;
                    }
                }


                y1 = y1 + 1;
                if(y1 > 17){
                    x1 = x1 + 1;
                    y1 = 0;
                    if(x1 > 10){
                        break;
                    }
                }
            }else {
                y2 = y2 -1;
                if(y2 < 0){
                    x2 = x2 -1;
                    y2 = 17;
                    if(x2 < 0){
                        break;
                    }
                }


                y1 = y1 + 1;
                if(y1 > 17){
                    x1 = x1 + 1;
                    y1 = 0;
                    if(x1 > 10){
                        break;
                    }
                }
            }
        }
        return map;
    }
    private static final int[][] reverseRow(int[][] map, int row, int colLength) {
        for (int i = 1; i < colLength / 2; i++) {
            swap(map, row, i, row, colLength - i - 1);
        }
        return map;
    }

    private static final int[][] reverseCol(int[][] map, int col, int rowLength) {
        for (int i = 1; i < rowLength / 2; i++) {
            swap(map, i, col, rowLength - i - 1, col);
        }
        return map;
    }

    private static final int[][] swap(int[][] listItem, int row1, int col1, int row2, int col2) {
        int temp = listItem[row1][col1];
        listItem[row1][col1] = listItem[row2][col2];
        listItem[row2][col2] = temp;
        return listItem;
    }

    public static final int[][] changeStateMapLV2( int[][] map, int row1, int col1, int row2, int col2){
        int start1 = row1;
        int start2 = row2;
        if ( col1 != col2){
            for (int i = start1; i > 1; i--) {
                swap(map, i, col1, i -1, col1);
            }
            for (int i = start2; i > 1 ; i--) {
                swap(map, i, col2, i-1, col2);
            }
        }

        else {
            start1  = row1 < row2? row1 : row2;
            for (int i = start1; i > 1; i--) {
                swap(map, i, col1, i -1, col1);
            }
            start2 = row1 < row2? row2 : row1;
            for (int i = start2; i > 1; i--) {
                swap(map, i, col1, i -1, col1);
            }

        }
        return map;
    }

    public static final int[][] changeStateMapLV3( int[][] map, int row1, int col1, int row2, int col2){
        int start1 = col1;
        int start2 = col2;
        if ( row1 != row2){
            for (int i = start1; i > 1; i--) {
                swap(map, row1, i, row1, i-1);
            }
            for (int j = start2; j > 1 ; j--) {
                swap(map, row2, j, row2, j-1);
            }
        }else {
            start1 = col1 > col2? col2 : col1;
            for (int i = start1; i > 1 ; i--) {
                swap(map, row1, i, row1, i -1);
            }
            start2 = col1 > col2? col1 : col2;
            for (int i = start2; i > 1 ; i--) {
                swap(map, row1, i, row1, i -1);
            }
        }

        return map;
    }
    public static final int[][] updateCurrentMap( int[][] map ){
        map = shuffleByCol(map);
        map = shuffleByRow(map);
        return map;
    }
    public static final int[][] init() {
        return initMapdefault();
//        return shuffleMapDefault(mapDefault);
    }
//    public static void main(String[] args) {
//        initMapdefault();
//        mapDefault = shuffleMapDefault(mapDefault);
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 16 ; j++) {
//                System.out.printf("%3d",mapDefault[i][j]);
//            }
//            System.out.println("\n");
//        }
//    }

}