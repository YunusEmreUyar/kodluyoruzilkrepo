public class MyList <T>{

    private T[] value;

    public MyList() {
        value = (T[]) new Object[10];
    }

    public MyList(int size) {
        value = (T[]) new Object[size];
    }

    public int getCapacity() {
        return this.value.length;
    }

    public void add(T data) {
        if (size() == getCapacity()) {
            T[] temp = (T[]) new Object[getCapacity()*2]; 
            for (int i=0; i<this.value.length; i++) {
                temp[i] = this.value[i];
            }
            this.value = temp;
            add(data);
        } else {    
           this.value[size()] = data;
        }
    }

    public T get(int index) {
        
        if (index <= getCapacity()) {
            return this.value[index];
        } else {
            return null;
        }
    }

    public T[] remove(int index) {
        if (index <= getCapacity()) {
            this.value[index] = null;
            for (int i=index; i<size(); i++) {
                this.value[i] = this.value[i+1];
            }
            return this.value;
        } else {
            return null;
        }
    }

    public T[] set(int index, T data) {
        if (index <= getCapacity()) {
            this.value[index] = data;
            return this.value;
        } else {
            return null;
        }
    }

    public int indexOf(T data) {
        int counter = 0;
        for (int i=0; i<size();i++) {
            if (data.equals(this.value[i])) {
                return counter; 
            }
            counter++;
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        int counter = size();
        for (int i=size(); i>=0; i--) {
            if (data.equals(this.value[i])) {
                return counter; 
            }
            counter--;
        }
        return -1;
    }

    public boolean isEmpty() {
        for (T item: this.value) {
            if (item != null) {
                return false;
            }
        }
        return true;
    }

    public T[] toArray() {
        return this.value;
    }

    public void clear() {
        this.value = (T[]) new Object[getCapacity()];
    }

    public MyList<T> subList(int start, int finish) {
        // Finish value included.
        MyList<T> val = new MyList<>(finish-start+1);
        
        for (int i=start; i<=finish; i++) {
            val.add(this.value[i]);
        }
        return val; 
    }

    public boolean contains(T data) {
        for (int i=0; i<size(); i++) {
            if (this.value[i].equals(data)) {
                return true;
            }
        }
        return false;
    }


    public String toString() {
        String val = "[";
        for(int i=0; i<size(); i++) {
            val += this.value[i] + " ";
        }
        val += "]";
        
        return val;
    }

    public int size() {
        int counter = 0;
        for (T item: value) {
            if (item != null) {
                counter++;
            }
        }
        return counter;
    }

}