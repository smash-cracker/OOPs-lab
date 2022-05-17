class string_sort {
    public static void main(String[] args) {
        int i,j,k;
        String[] sArray = {"Harry", "Ron", "Hermoine", "Voldemort", "Snape"};
        String temp;
        for(j=0; j<sArray.length; j++) {
            for(i=0; i<sArray.length; i++) {
                k = sArray[j].compareToIgnoreCase(sArray[i]);
                if(k<0) {
                    temp = sArray[j];
                    sArray[j] = sArray[i];
                    sArray[i] = temp;
                } 
            }
        }
        for(i=0; i<sArray.length; i++) {
            System.out.println(sArray[i]);
        }
    }
}
