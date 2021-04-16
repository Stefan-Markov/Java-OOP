package word;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class CommandLogic extends CommandImpl {
    private Deque<String> memory;

    public CommandLogic(StringBuilder text) {
        super(text);
        this.memory = new ArrayDeque<>();
    }

    @Override
    public List<Command> initCommands() {
        List<Command> list = super.initCommands();

        list.add(new Command("cut", new CutTransform(memory)));
        list.add(new Command("paste", new PasteTransform(memory)));

        return list;
    }
}
