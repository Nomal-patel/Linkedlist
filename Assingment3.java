

public class Assingment3 {

    //Crates tthe basic class and structure for Storm
    public static class Storm{
        public String name;                 //name of the huricane
        public String monthFormed;          //the month of which the storm formed
        public int maxWind;                 //the maximum recorded wind speed
        public int category;                //The storm's category (1-5) for named tropical storm (0)

        public Storm(String n, int w, String m, int c){
            this.name = n;
            this.maxWind = w;
            this.monthFormed = m;
            this.category = c;
        }//end Storm

        /***********************************************************************************
         * getter
         */
        public String getName() {
            return name;
        }

        public String getMonthFormed() {
            return monthFormed;
        }

        public int getMaxWind() {
            return maxWind;
        }

        public int getCategory() {
            return category;
        }

        /***********************************************************************************
         * setter
         */
        public void setName(String name) {
            this.name = name;
        }

        public void setMonthFormed(String monthFormed) {
            this.monthFormed = monthFormed;
        }

        public void setMaxWind(int maxWind) {
            this.maxWind = maxWind;
        }

        public void setCategory(int category) {
            this.category = category;
        }
    }//end class Storm

    //begin node class which is gonna take care of the one sepration of nodes

    public static class Node{
        public Storm s;
        public Node next;

        Node(){
            s = null;
            next = null;
        }

        public Storm getS(){
            return s;
        }

        public  Node getNext(){
            return next;
        }
    }

    //This is the list with the format for the list and also the
    // inster function and push back function
    public static class Linkedlist{
        private Node head;
        private Node tail;
                   //Pointer to the end of the list
        //Constructor. Sets the head and tail to NULL
         Linkedlist() {
             Node head;
             Node tail;

        }

        public Linkedlist(Node head, Node tail) {
            this.head = head;
            this.tail = tail;

        }

        public void push_back(Storm newS) {
            Node temp = new Node();
            temp.s = newS;
            temp.next = null;
            if(head == null) {
                head = temp;
                tail = temp;
            }
            else {
                tail.next = temp;
                tail = tail.next;
            }
        }

        public  void insert(Storm newS, int index) {
            Node temp = head;
            int counter = 0;
            while(counter < index-1 && temp != null) {
                temp = temp.next;
                counter++;
            }
            if(temp == null || temp.next == null) {
                return;
            }
            else {
                Node newNode = new Node();
                newNode.s = newS;
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }

        //The function to print the data

        public void printListData(){
             Node tempPtr;
             tempPtr = head;
             while (tempPtr != null){
                 System.out.println("Hurricane: " + tempPtr.s.getName() + "\n" +
                         "Wind speed: " + tempPtr.s.getMaxWind() + " MPH\n"+
                         "Month formed: " + tempPtr.s.getMonthFormed() + "\n" +
                         "Category: " + tempPtr.s.getCategory() + "\n");
                 System.out.println("------------------------------------------");
                 tempPtr =  tempPtr.next;
             }
        }










    }



}

