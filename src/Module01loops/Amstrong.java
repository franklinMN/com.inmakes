class Amstrong {
    public static void main( String[] args ) {


        int value = 121;
        int amstrong=0;
        int quo=value, rem=0;

        while(quo!=0) {
            rem = quo % 10;
            amstrong += (int)Math.pow(rem,3);
            quo = quo / 10;
        }

        System.out.println("Original value : " + value);
        System.out.println("Amstrong value : " + amstrong);

        if( value==amstrong )
            System.out.println("It is a Amstrong Number.");
        else
            System.out.println("It is NOT a Amstrong Number.");

    }
}