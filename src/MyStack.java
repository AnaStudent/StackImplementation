public class MyStack {
    Student studs[];
    int top;        //indicates the index of the top most element

    public MyStack(){
        studs = new Student[10];
        top = -1;   //indicate that the array is empty
    }

    public void push(Student element){
        top = top + 1;  //index = 0
        studs[top] = element;
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else return false;
    }

    public Student peak(){
        return studs[top];    //returning the top most element of the array in the stack
    }

    public Student pop(){
        Student element = studs[top];
        top = top - 1;
        return element;
    }
}
