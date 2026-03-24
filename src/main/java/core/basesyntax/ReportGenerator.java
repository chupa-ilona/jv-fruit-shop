package core.basesyntax;

public interface ReportGenerator {
    String generate(Storage storage);

    String fruitTxToFile(FruitTransaction fruitTx);
}
