package algonquin.cst2335.soma0036;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import algonquin.cst2335.soma0036.ChatMessage;
import algonquin.cst2335.soma0036.ChatMessageDAO;

@Database(entities = {ChatMessage.class}, version = 1)
public abstract class MessageDatabase extends RoomDatabase {
    public abstract ChatMessageDAO cmDAO();
}
