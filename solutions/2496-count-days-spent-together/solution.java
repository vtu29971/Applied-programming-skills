class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

    int[] calendar2026 = new int[366];

    int aliceArrDay = Integer.parseInt(arriveAlice.substring(3,5));
    int aliceArrMon = Integer.parseInt(arriveAlice.substring(0,2)); 
    int aliceDepDay = Integer.parseInt(leaveAlice.substring(3,5)); 
    int aliceDepMon = Integer.parseInt(leaveAlice.substring(0,2)); 

    int bobArrDay = Integer.parseInt(arriveBob.substring(3,5)); 
    int bobArrMon = Integer.parseInt(arriveBob.substring(0,2)); 
    int bobDepDay = Integer.parseInt(leaveBob.substring(3,5)); 
    int bobDepMon = Integer.parseInt(leaveBob.substring(0,2)); 

    int aliceArrdate = ((275 * aliceArrMon)/9) - 2*((aliceArrMon + 9)/12) + aliceArrDay - 30;
    int aliceDepdate = ((275 * aliceDepMon)/9) - 2*((aliceDepMon + 9)/12) + aliceDepDay - 30;
    int bobArrdate = ((275 * bobArrMon)/9) - 2*((bobArrMon + 9)/12) + bobArrDay - 30;
    int bobDepdate = ((275 * bobDepMon)/9) - 2*((bobDepMon + 9)/12) + bobDepDay - 30;

    System.out.println(aliceArrDay + " " +aliceArrMon + " " +aliceDepDay +" " +aliceDepMon + " "+ aliceArrdate +" " + aliceDepdate +" " );
    System.out.println(bobDepdate);

    for(int i = aliceArrdate ; i <= aliceDepdate && i <= 365 ; i++){
        calendar2026[i]++;
    }

    for(int i = bobArrdate ; i <= bobDepdate && i <= 365 ; i++){
        calendar2026[i]++;
    }

    int res = 0;


    for(int i = 0;  i <= 365 ; ++i){
       if(calendar2026[i] == 2){
        res++;
       }
    }


    return res;

    }
}
