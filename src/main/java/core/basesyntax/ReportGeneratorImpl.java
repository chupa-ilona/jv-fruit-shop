package core.basesyntax;

public class ReportGeneratorImpl implements ReportGenerator {
    private String report;

    @Override
    public String generate(Storage storage) {
        StringBuilder stringBuilder = new StringBuilder("fruit,quantity\n");
        storage.getStorage().forEach((fruit, quantity) -> stringBuilder.append(fruit)
                .append(",").append(quantity).append("\n"));
        report = stringBuilder.toString();
        return report;
    }

    public String getReport() {
        return report;
    }

    @Override
    public String fruitTxToFile(FruitTransaction fruitTx) {
        return fruitTx.getFruit() + ","
                + fruitTx.getQuantity();
    }
}
