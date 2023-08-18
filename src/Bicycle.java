public class Bicycle extends Transport {
    @Override
    public void doService() {
        System.out.println("Обслуживаем " + this.getModelName());
        updateTyre();
    }
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void updateTyre() {
        for (int i = 0; i < this.getWheelsCount(); i++) {
            System.out.println("Меняем покрышку");
        }
    }
}

