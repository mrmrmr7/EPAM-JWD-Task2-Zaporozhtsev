package com.mrmrmr7.task.data_actions;

import com.mrmrmr7.task.symbol_structuries.interfaces.SymbolInterface;

import java.util.Comparator;

public class DataComparator implements Comparator<SymbolInterface> {

    @Override
    public int compare(SymbolInterface symbolInterface, SymbolInterface t1) {
        return symbolInterface.getChildCount() - t1.getChildCount();
    }
}
