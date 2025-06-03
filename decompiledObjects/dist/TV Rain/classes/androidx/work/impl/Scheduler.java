package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.impl.model.WorkSpec;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public abstract interface Scheduler
{
  public static final int MAX_GREEDY_SCHEDULER_LIMIT = 200;
  public static final int MAX_SCHEDULER_LIMIT = 50;
  
  public abstract void cancel(@NonNull String paramString);
  
  public abstract boolean hasLimitedSchedulingSlots();
  
  public abstract void schedule(@NonNull WorkSpec... paramVarArgs);
}

/* Location:
 * Qualified Name:     androidx.work.impl.Scheduler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */