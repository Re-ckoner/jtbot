import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Andy on 19.09.2017.
 */
public class Jtbot extends TelegramLongPollingBot {

    public void onUpdateReceived(Update update) {
        // TODO
    }


    public String getBotUsername() {
        // TODO
        return "C0Pbot";
    }

    @Override
    public String getBotToken()  {
       try{
        return getTokenFromFile("C:\\jtbotToken");
    }
    catch (Exception e){
        System.out.print(e);
        return null;
    }
    }

    String getTokenFromFile(String path) throws IOException{
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded);
    }
}
