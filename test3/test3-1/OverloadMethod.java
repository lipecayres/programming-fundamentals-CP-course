
 // Overloaded Method 

    public int concatenateString(String x, String y, String z) {

        String fullString = x+y+z;
        int  fullStringLength = fullString.length();

        for (int i=0; i<fullStringLength; i =i+2){

            System.out.println(fullString.charAt(i));
        }

        if (fullString.endsWith("house")){
            return 9999;
        } else {
            return 8888;
        }
    }
    
    public int concatenateString(char x, char y, char z) {

        String fullString = "";
        int  fullStringLength = fullString.length(); 
        fullString += x;
        fullString += y;
        fullString += z;

        for (int i=0; i<fullStringLength; i =i+2){

            System.out.println(fullString.charAt(i));
        }

        if (fullString.endsWith("house")){
            return 9999;
        } else {
            return 8888;
        }
    }

