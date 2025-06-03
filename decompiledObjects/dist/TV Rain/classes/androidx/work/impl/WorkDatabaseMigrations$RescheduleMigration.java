package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import androidx.annotation.NonNull;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

public class WorkDatabaseMigrations$RescheduleMigration
  extends Migration
{
  public final Context mContext;
  
  public WorkDatabaseMigrations$RescheduleMigration(@NonNull Context paramContext, int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    mContext = paramContext;
  }
  
  public void migrate(@NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    if (endVersion >= 10) {
      paramSupportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[] { "reschedule_needed", Integer.valueOf(1) });
    } else {
      mContext.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.WorkDatabaseMigrations.RescheduleMigration
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */