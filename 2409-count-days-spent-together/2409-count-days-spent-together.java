class Solution {
    int[] tDays=new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aaMon=Integer.parseInt(arriveAlice.substring(0,2));
        int aaDay=Integer.parseInt(arriveAlice.substring(3,5));

        int laMon=Integer.parseInt(leaveAlice.substring(0,2));
        int laDay=Integer.parseInt(leaveAlice.substring(3,5));

        int abMon=Integer.parseInt(arriveBob.substring(0,2));
        int abDay=Integer.parseInt(arriveBob.substring(3,5));

        int lbMon=Integer.parseInt(leaveBob.substring(0,2));
        int lbDay=Integer.parseInt(leaveBob.substring(3,5));

        int aaDays=findDays(aaMon,aaDay);
        int laDays=findDays(laMon,laDay);


        int abDays=findDays(abMon,abDay);
        int lbDays=findDays(lbMon,lbDay);

        int stDate=Math.max(aaDays,abDays);
        int enDate=Math.min(laDays,lbDays);

        if(stDate>enDate)return 0;

        int days=Math.abs(enDate-stDate);
        return days+1;
        
    
    }

    public int findDays(int months,int days){
        int total=0;

        for(int i=0;i<months-1;i++){
            total+=tDays[i];

        }
        total+=days;
        return total;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna