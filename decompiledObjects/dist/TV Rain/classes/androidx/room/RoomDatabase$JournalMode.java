package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

public enum RoomDatabase$JournalMode
{
  static
  {
    JournalMode localJournalMode1 = new JournalMode("AUTOMATIC", 0);
    AUTOMATIC = localJournalMode1;
    JournalMode localJournalMode2 = new JournalMode("TRUNCATE", 1);
    TRUNCATE = localJournalMode2;
    JournalMode localJournalMode3 = new JournalMode("WRITE_AHEAD_LOGGING", 2);
    WRITE_AHEAD_LOGGING = localJournalMode3;
    $VALUES = new JournalMode[] { localJournalMode1, localJournalMode2, localJournalMode3 };
  }
  
  private RoomDatabase$JournalMode() {}
  
  private static boolean isLowRamDevice(@NonNull ActivityManager paramActivityManager)
  {
    return paramActivityManager.isLowRamDevice();
  }
  
  @SuppressLint({"NewApi"})
  public JournalMode resolve(Context paramContext)
  {
    if (this != AUTOMATIC) {
      return this;
    }
    paramContext = (ActivityManager)paramContext.getSystemService("activity");
    if ((paramContext != null) && (!isLowRamDevice(paramContext))) {
      return WRITE_AHEAD_LOGGING;
    }
    return TRUNCATE;
  }
}

/* Location:
 * Qualified Name:     androidx.room.RoomDatabase.JournalMode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */