class Stack {
    private String stck[];
    private int tos;

    Stack(int size){
        stck = new String[size];
        tos = -1;
    }

    public void push(String item){
        if(tos == stck.length - 1)
            increaseSize(item);
        else
            stck[++tos] = item;
    }

    public String pop(){
        if(tos < 0)
            return "empty";
        else
            System.out.println(stck.length-1);
            return stck[tos--];
    }

    private void increaseSize(String item){
        int tempSize = (stck.length-1) * 2;
        String [] tempArray = new String[tempSize];

        for(int i = 0; i < stck.length-1; i++){
            tempArray[i] = stck[i];
        }

        stck = tempArray;
        stck[++tos] = item;
    }
}
