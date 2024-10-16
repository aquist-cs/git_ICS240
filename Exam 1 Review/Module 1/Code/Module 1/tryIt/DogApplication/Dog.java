public class Dog {
    private boolean isBulldog; 
    private int age; 
    private int id = 0; 
    static int counter = 0; 

    public Dog(boolean b, int a) {
        isBulldog = b;
        age = a; 
        this.id = ++counter; 
    }

    public boolean getIsBulldog() {
        return isBulldog; 
    }

    public int getAge() {
        return age; 
    }

    public void setIsBulldog(boolean isBulldog) {
        isBulldog = this.isBulldog; 
    }

    public void setAge(int age) {
        age = this.age; 
    }

    public String toString() {
        String output = "";
        output += "Is this a bulldog? " + isBulldog; 
        output += ". This dog is: " + age + " years old."; 
        output += " and this dog is ID: " + id; 
        return output; 
    }
    
    public boolean equals(Dog other) {
        return this.id == other.id; 
    }
}