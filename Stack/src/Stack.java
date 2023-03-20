import java.util.ArrayList;

public class Stack<T> {
    private T[] stack;

    private int stackPointer;
    private int stackSize;

    private void initializeStack(){
        this.stack        = (T[]) new Object[this.stackSize];
        this.stackPointer = 0;
    }

    private void scrollStack(int count){
        for(int i=0;i<count;i++){
            for(int j=0;j<this.stackSize-1;j++){
                this.stack[j] = this.stack[j+1];
            }
        }
        for(int i=this.stackSize-1;i>(this.stackSize - count);i--){
            this.stack[i] = null;
        }
    }

    public Stack(){
        this.stackSize = 10;
        this.initializeStack();
    }

    public Stack(int stackSize){
        this.stackSize = stackSize;
        this.initializeStack();
    }

    public void push(T data){
        if(this.stackPointer < this.stackSize){
            this.stack[this.stackPointer] = data;
            this.stackPointer++;
        }else {
            this.scrollStack(1);
            this.stack[this.stackSize-1] = data;
        }
    }

    public T pop(){
        this.stackPointer--;
        if(this.stackPointer < 0){
            this.stackPointer = 0;
            return null;
        }else {
            T resultValue = this.stack[this.stackPointer];
            this.stack[this.stackPointer] = null;
            return resultValue;
        }
    }

    public int size(){
        return this.stackPointer;
    }

    public boolean isEmpty(){
        return this.stackPointer == 0;
    }

    public boolean isFull(){
        return this.stackPointer == this.stackSize;
    }

    @Override
    public String toString(){
        StringBuilder resultValue = new StringBuilder();
        for(T data : this.stack){
            if(data != null){
                resultValue.append(" " + data.toString());
            }else {
                resultValue.append(" " + "null");
            }

        }
        return resultValue.toString();
    }
}
