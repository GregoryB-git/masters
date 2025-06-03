package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Preference;
import androidx.work.impl.model.PreferenceDao;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class IdGenerator
{
  public static final int INITIAL_ID = 0;
  public static final String NEXT_ALARM_MANAGER_ID_KEY = "next_alarm_manager_id";
  public static final String NEXT_JOB_SCHEDULER_ID_KEY = "next_job_scheduler_id";
  public static final String PREFERENCE_FILE_KEY = "androidx.work.util.id";
  private final WorkDatabase mWorkDatabase;
  
  public IdGenerator(@NonNull WorkDatabase paramWorkDatabase)
  {
    mWorkDatabase = paramWorkDatabase;
  }
  
  public static void migrateLegacyIdGenerator(@NonNull Context paramContext, @NonNull SupportSQLiteDatabase paramSupportSQLiteDatabase)
  {
    paramContext = paramContext.getSharedPreferences("androidx.work.util.id", 0);
    int i;
    int j;
    if ((paramContext.contains("next_job_scheduler_id")) || (paramContext.contains("next_job_scheduler_id")))
    {
      i = paramContext.getInt("next_job_scheduler_id", 0);
      j = paramContext.getInt("next_alarm_manager_id", 0);
      paramSupportSQLiteDatabase.beginTransaction();
    }
    try
    {
      paramSupportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[] { "next_job_scheduler_id", Integer.valueOf(i) });
      paramSupportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[] { "next_alarm_manager_id", Integer.valueOf(j) });
      paramContext.edit().clear().apply();
      paramSupportSQLiteDatabase.setTransactionSuccessful();
      return;
    }
    finally
    {
      paramSupportSQLiteDatabase.endTransaction();
    }
  }
  
  private int nextId(String paramString)
  {
    mWorkDatabase.beginTransaction();
    try
    {
      Long localLong = mWorkDatabase.preferenceDao().getLongValue(paramString);
      int i = 0;
      int j;
      if (localLong != null) {
        j = localLong.intValue();
      } else {
        j = 0;
      }
      if (j != Integer.MAX_VALUE) {
        i = j + 1;
      }
      update(paramString, i);
      mWorkDatabase.setTransactionSuccessful();
      return j;
    }
    finally
    {
      mWorkDatabase.endTransaction();
    }
  }
  
  private void update(String paramString, int paramInt)
  {
    mWorkDatabase.preferenceDao().insertPreference(new Preference(paramString, paramInt));
  }
  
  public int nextAlarmManagerId()
  {
    try
    {
      int i = nextId("next_alarm_manager_id");
      return i;
    }
    finally {}
  }
  
  public int nextJobSchedulerIdWithRange(int paramInt1, int paramInt2)
  {
    try
    {
      int i = nextId("next_job_scheduler_id");
      if ((i >= paramInt1) && (i <= paramInt2)) {
        paramInt1 = i;
      } else {
        update("next_job_scheduler_id", paramInt1 + 1);
      }
      return paramInt1;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.IdGenerator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */