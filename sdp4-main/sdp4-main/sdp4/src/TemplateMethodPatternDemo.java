// Abstract Class
abstract class DataProcessor {
    // Template method
    public final void processData() {
        readData();
        processDataLogic();
        saveData();
    }

    protected abstract void readData();

    protected abstract void processDataLogic();

    protected abstract void saveData();
}

// Concrete Class
class CSVDataProcessor extends DataProcessor {
    @Override
    protected void readData() {
        System.out.println("Reading data from CSV file.");
    }

    @Override
    protected void processDataLogic() {
        System.out.println("Processing CSV data.");
    }

    @Override
    protected void saveData() {
        System.out.println("Saving processed data to CSV file.");
    }
}

// Example Usage
public class TemplateMethodPatternDemo {
    public static void main(String[] args) {
        DataProcessor processor = new CSVDataProcessor();
        processor.processData();
    }
}
