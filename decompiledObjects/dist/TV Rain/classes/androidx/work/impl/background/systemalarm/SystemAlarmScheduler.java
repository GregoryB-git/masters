package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.Scheduler;
import androidx.work.impl.model.WorkSpec;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class SystemAlarmScheduler
  implements Scheduler
{
  private static final String TAG = Logger.tagWithPrefix("SystemAlarmScheduler");
  private final Context mContext;
  
  public SystemAlarmScheduler(@NonNull Context paramContext)
  {
    mContext = paramContext.getApplicationContext();
  }
  
  private void scheduleWorkSpec(@NonNull WorkSpec paramWorkSpec)
  {
    Logger.get().debug(TAG, String.format("Scheduling work with workSpecId %s", new Object[] { id }), new Throwable[0]);
    paramWorkSpec = CommandHandler.createScheduleWorkIntent(mContext, id);
    mContext.startService(paramWorkSpec);
  }
  
  public void cancel(@NonNull String paramString)
  {
    paramString = CommandHandler.createStopWorkIntent(mContext, paramString);
    mContext.startService(paramString);
  }
  
  public boolean hasLimitedSchedulingSlots()
  {
    return true;
  }
  
  public void schedule(@NonNull WorkSpec... paramVarArgs)
  {
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++) {
      scheduleWorkSpec(paramVarArgs[j]);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.background.systemalarm.SystemAlarmScheduler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */