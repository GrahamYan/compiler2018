package grahamcompiler.utility;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class ERROR {
    private List<Pair<location, String>> error = new ArrayList<>();

    public void addError(location pos, String reason) {
        error.add(new Pair<>(pos, reason));
        throw new RuntimeException("Line " + pos.getLine() + ":" + reason);
    }
}
