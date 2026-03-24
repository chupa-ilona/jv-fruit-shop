package core.basesyntax;

public interface ReportGenerator {
    String generate(Storage storage);

    String FruitTxToFile(FruitTransaction fruitTx);
}
