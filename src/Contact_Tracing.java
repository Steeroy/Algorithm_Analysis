/*
* Siyanda Mvunyiswa
* Contact Tracing: Checks which babies are in the crèche simultaneously
*/

public class Contact_Tracing {
    public static void main(String[] args){
        int[] Baby = {1,2,3,4,5};               // Array of babies
        int[] arrivalTime = {2,3,8,10,7};       // Array of arrival times, each index beings to each child index in array of babies
        int[] departureTime = {4,6,9,11,11};    // Array of departure times, same as arrival times in terms of positions

        System.out.println("The distinct pairs of children being at the creche at the same time are:");

        for(int i = 0; i < Baby.length;i++){
            for(int j = i; j < Baby.length;j++){
                if(i == j){
                    continue;
                }
                else if(arrivalTime[j] <= departureTime[i]){
                    // This prints the babies in pairs
                    System.out.println("("+ Baby[i] +","+ Baby[j] +")");
                }
            }
        }
    }

}
