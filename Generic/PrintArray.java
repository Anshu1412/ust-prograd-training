class Printer<A>{
    public <A> void printArray(A[] size) {
        for(A element : size){
            System.out.print(element);
        }
    }
}

class PrintArray {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Integer[] intArray = {1,2,3};
        String[] stringArray = {"Hey","Hello","ust"};
        // printer.printArray(intArray);
        // printer.printArray(stringArray);
        for(int i=intArray.length-1;i>=0;i--)
            System.out.print(intArray[i] + "  ");
        System.out.println("\n");
        for(int i=stringArray.length-1;i>=0;i--)
            System.out.print(stringArray[i] + "  ");
    }
}