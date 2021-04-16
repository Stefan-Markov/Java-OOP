package word;

import java.util.Deque;

public class CutTransform implements TextTransform {
    private Deque<String> memory;

    public CutTransform(Deque<String> memory) {
        this.memory = memory;
    }

    @Override
    public void invokeOn(StringBuilder text, int startIndex, int endIndex) {

        this.memory.clear();
        String removeText = "";
        if (text.length() > 2) {
            removeText = text.toString().substring(startIndex, endIndex - 1);
        }
        if (!removeText.isEmpty()) {
            this.memory.push(removeText);
        }
        text.replace(startIndex, endIndex, "");
    }
}
