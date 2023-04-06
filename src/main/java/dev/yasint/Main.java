package dev.yasint;

import org.alicebot.ab.*;
import org.alicebot.ab.utils.IOUtils;

import java.io.File;

public class Main {

    private static final boolean TRACE_MODE = false;
    static String botName = "super";

    public static void main(String[] args) {
        try {

            String resourcesPath = getResourcesPath();
            System.out.println(resourcesPath);
            MagicBooleans.trace_mode = TRACE_MODE;
            Bot bot = new Bot(botName, resourcesPath);

            bot.brain.nodeStats();
            bot.writeAIMLFiles();

            Chat chatSession = new Chat(bot);

            String textLine;

            while (true) {
                System.out.print("Human : ");
                textLine = IOUtils.readInputTextLine();
                if ((textLine == null) || (textLine.length() < 1))
                    textLine = MagicStrings.null_input;
                if (textLine.equals("q")) {
                    System.exit(0);
                } else if (textLine.equals("wq")) {
                    bot.writeQuit();
                    System.exit(0);
                } else {
                    if (MagicBooleans.trace_mode)
                        System.out.println(
                                "STATE=" + textLine + ":THAT=" + chatSession.thatHistory.get(0).get(0)
                                        + ":TOPIC=" + chatSession.predicates.get("topic"));
                    String response = chatSession.multisentenceRespond(textLine);
                    while (response.contains("&lt;"))
                        response = response.replace("&lt;", "<");
                    while (response.contains("&gt;"))
                        response = response.replace("&gt;", ">");
                    System.out.println("Robot : " + response);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getResourcesPath() {
        File currDir = new File(".");
        String path = currDir.getAbsolutePath();
        path = path.substring(0, path.length() - 2);
        System.out.println(path);
        return path + File.separator + "src"
                + File.separator + "main"
                + File.separator + "resources";
    }

}