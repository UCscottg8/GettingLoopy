public class Capital_Letter_Initial {
        public static void main(String[] args) {
            int height = 7, width = 5;

            for(int i = 0; i < height; i++) {
                for(int j = 0; j < width; j++) {
                    // print top and bottom line
                    if(i == 0 || i == height-1) {
                        System.out.print("*");
                        continue;
                    }

                    // print the first and last vertical lines
                    if(j == 0 || (j == width-1 && (i > 2 || i == 1))) {
                        System.out.print("*");
                    } else if(i == 3 && j > 1) { // print the middle horizontal line
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

