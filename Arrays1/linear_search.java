// time complexity = O(n)
// TC -> loop and loop runs for n times
public class linear_search {
    public static int linearSearch(String menu[], String key){
        for(int i=0; i<menu.length; i++){
            if(menu[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        String menu[] = {"Idli" , "Samosa", "Vadapav"};
        // int key = 20;
        String key = "Vadapav";

        // int index = linearSearch(numbers, key);
        int index = linearSearch(menu, key);
        if(index == -1){
            System.out.println("Key does not found");
        }
        else{
            System.out.println("Key is at index : "+ index);
        }
    }
}
