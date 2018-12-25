package symbol_structuries;

import java.util.List;

public interface TextInterface extends SymbolInterface {
    void add(List<SymbolInterface> toAdd);
    void remove(int id);
    String getText();
}
