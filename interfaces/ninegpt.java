// Concept: Composition in OOP
// Composition is a design principle where one class contains references to objects of other classes,
//  creating a "has-a" relationship. Unlike inheritance (an "is-a" relationship), composition lets you build complex
//   objects by including other objects as members.
// For example, consider a Computer class composed of Processor, RAM, and Storage objects. 
// The Computer class does not inherit from Processor, RAM, or Storage but rather "has a" processor, RAM, and storage.
class Processor {
    private String model;
    Processor(String model) {
        this.model = model;
    }
    void showProcessor() {
        System.out.println("Processor Model: " + model);
    }
}

class Memory {
    private int size;
    Memory(int size) {
        this.size = size;
    }
    void showMemory() {
        System.out.println("Memory Size: " + size + "GB");
    }
}

class Computer {
    private Processor processor;
    private Memory memory;

    Computer(Processor processor, Memory memory) {
        this.processor = processor;
        this.memory = memory;
    }

    void showConfig() {
        processor.showProcessor();
        memory.showMemory();
    }
}

public class ninegpt {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel i7");
        Memory memory = new Memory(16);
        Computer myComputer = new Computer(processor, memory);
        
        myComputer.showConfig();  // Displays the computer's processor and memory
    }
}
