package androidx.room;

import androidx.annotation.NonNull;
import androidx.sqlite.db.SupportSQLiteDatabase;

public abstract class RoomDatabase$Callback
{
  public void onCreate(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase) {}
  
  public void onDestructiveMigration(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase) {}
  
  public void onOpen(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase) {}
}

/* Location:
 * Qualified Name:     androidx.room.RoomDatabase.Callback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */