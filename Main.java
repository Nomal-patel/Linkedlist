public class Main {

    public static void main(String args[])  //static method
    {
        Assingment3.Linkedlist StormList = new Assingment3.Linkedlist();

        Assingment3.Storm S1 = new Assingment3.Storm("Hurricane Chantal",80,"July",1);
        Assingment3.Storm S2 = new Assingment3.Storm("Hurricane Gabrielle",145,"August",4);
        Assingment3.Storm S3 = new Assingment3.Storm("Hurricane Hugo",160,"September",5);
        Assingment3.Storm S4 = new Assingment3.Storm("Hurricane Felix",85,"August",1);
        Assingment3.Storm S5 = new Assingment3.Storm("Hurricane Erin",105,"August",2);

         StormList.push_back(S1);
         StormList.push_back(S2);
         StormList.push_back(S3);
         StormList.push_back(S4);
         StormList.insert(S5,4);

         StormList.printListData();


    }




}
