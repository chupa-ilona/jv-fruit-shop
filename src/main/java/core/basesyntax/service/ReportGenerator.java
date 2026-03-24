package core.basesyntax.service;

import core.basesyntax.db.Storage;
import core.basesyntax.model.FruitTransaction;

public interface ReportGenerator {
    String generate(Storage storage);

}
