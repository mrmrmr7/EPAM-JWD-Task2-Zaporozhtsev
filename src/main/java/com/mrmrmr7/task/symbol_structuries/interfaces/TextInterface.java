package com.mrmrmr7.task.symbol_structuries.interfaces;

import java.util.List;

public interface TextInterface extends SymbolInterface {
    void add(List<SymbolInterface> toAdd);
    String getData();
}
