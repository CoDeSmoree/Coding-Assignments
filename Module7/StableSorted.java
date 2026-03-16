package Module7;

class StableSort{

    static class Item {
        int value;
        char id;

        Item(int value, char id){
            this.value = value;
            this.id = id;
        }
    }

    public static void main(String[] args) {

        Item arr[] = {
                new Item(5,'A'),
                new Item(3,'B'),
                new Item(5,'C'),
                new Item(2,'D')
        };

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){

                if(arr[j].value > arr[j+1].value){

                    Item temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(Item x : arr){
            System.out.println(x.value + " " + x.id);
        }
    }
}