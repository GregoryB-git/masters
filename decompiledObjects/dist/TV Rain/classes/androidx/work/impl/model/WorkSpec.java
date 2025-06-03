package androidx.work.impl.model;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.arch.core.util.Function;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.Relation;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.WorkInfo.State;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@Entity(indices={@androidx.room.Index({"schedule_requested_at"}), @androidx.room.Index({"period_start_time"})})
public final class WorkSpec
{
  public static final long SCHEDULE_NOT_REQUESTED_YET = -1L;
  private static final String TAG = Logger.tagWithPrefix("WorkSpec");
  public static final Function<List<WorkInfoPojo>, List<WorkInfo>> WORK_INFO_MAPPER = new Function()
  {
    public List<WorkInfo> apply(List<WorkSpec.WorkInfoPojo> paramAnonymousList)
    {
      if (paramAnonymousList == null) {
        return null;
      }
      ArrayList localArrayList = new ArrayList(paramAnonymousList.size());
      paramAnonymousList = paramAnonymousList.iterator();
      while (paramAnonymousList.hasNext()) {
        localArrayList.add(((WorkSpec.WorkInfoPojo)paramAnonymousList.next()).toWorkInfo());
      }
      return localArrayList;
    }
  };
  @ColumnInfo(name="backoff_delay_duration")
  public long backoffDelayDuration;
  @NonNull
  @ColumnInfo(name="backoff_policy")
  public BackoffPolicy backoffPolicy;
  @NonNull
  @Embedded
  public Constraints constraints;
  @ColumnInfo(name="run_in_foreground")
  public boolean expedited;
  @ColumnInfo(name="flex_duration")
  public long flexDuration;
  @NonNull
  @ColumnInfo(name="id")
  @PrimaryKey
  public String id;
  @ColumnInfo(name="initial_delay")
  public long initialDelay;
  @NonNull
  @ColumnInfo(name="input")
  public Data input;
  @ColumnInfo(name="input_merger_class_name")
  public String inputMergerClassName;
  @ColumnInfo(name="interval_duration")
  public long intervalDuration;
  @ColumnInfo(name="minimum_retention_duration")
  public long minimumRetentionDuration;
  @NonNull
  @ColumnInfo(name="out_of_quota_policy")
  public OutOfQuotaPolicy outOfQuotaPolicy;
  @NonNull
  @ColumnInfo(name="output")
  public Data output;
  @ColumnInfo(name="period_start_time")
  public long periodStartTime;
  @IntRange(from=0L)
  @ColumnInfo(name="run_attempt_count")
  public int runAttemptCount;
  @ColumnInfo(name="schedule_requested_at")
  public long scheduleRequestedAt;
  @NonNull
  @ColumnInfo(name="state")
  public WorkInfo.State state = WorkInfo.State.ENQUEUED;
  @NonNull
  @ColumnInfo(name="worker_class_name")
  public String workerClassName;
  
  public WorkSpec(@NonNull WorkSpec paramWorkSpec)
  {
    Data localData = Data.EMPTY;
    input = localData;
    output = localData;
    constraints = Constraints.NONE;
    backoffPolicy = BackoffPolicy.EXPONENTIAL;
    backoffDelayDuration = 30000L;
    scheduleRequestedAt = -1L;
    outOfQuotaPolicy = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
    id = id;
    workerClassName = workerClassName;
    state = state;
    inputMergerClassName = inputMergerClassName;
    input = new Data(input);
    output = new Data(output);
    initialDelay = initialDelay;
    intervalDuration = intervalDuration;
    flexDuration = flexDuration;
    constraints = new Constraints(constraints);
    runAttemptCount = runAttemptCount;
    backoffPolicy = backoffPolicy;
    backoffDelayDuration = backoffDelayDuration;
    periodStartTime = periodStartTime;
    minimumRetentionDuration = minimumRetentionDuration;
    scheduleRequestedAt = scheduleRequestedAt;
    expedited = expedited;
    outOfQuotaPolicy = outOfQuotaPolicy;
  }
  
  public WorkSpec(@NonNull String paramString1, @NonNull String paramString2)
  {
    Data localData = Data.EMPTY;
    input = localData;
    output = localData;
    constraints = Constraints.NONE;
    backoffPolicy = BackoffPolicy.EXPONENTIAL;
    backoffDelayDuration = 30000L;
    scheduleRequestedAt = -1L;
    outOfQuotaPolicy = OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
    id = paramString1;
    workerClassName = paramString2;
  }
  
  public long calculateNextRunTime()
  {
    boolean bool = isBackedOff();
    int i = 0;
    int j = 0;
    long l1;
    long l2;
    if (bool)
    {
      if (backoffPolicy == BackoffPolicy.LINEAR) {
        j = 1;
      }
      if (j != 0) {
        l1 = backoffDelayDuration * runAttemptCount;
      } else {
        l1 = Math.scalb((float)backoffDelayDuration, runAttemptCount - 1);
      }
      l2 = periodStartTime;
      l1 = Math.min(18000000L, l1);
    }
    for (;;)
    {
      return l1 + l2;
      bool = isPeriodic();
      l2 = 0L;
      if (bool)
      {
        l1 = System.currentTimeMillis();
        long l3 = periodStartTime;
        if (l3 == 0L) {
          l1 += initialDelay;
        } else {
          l1 = l3;
        }
        long l4 = flexDuration;
        long l5 = intervalDuration;
        j = i;
        if (l4 != l5) {
          j = 1;
        }
        if (j != 0)
        {
          if (l3 == 0L) {
            l2 = l4 * -1L;
          }
          return l1 + l5 + l2;
        }
        if (l3 != 0L) {
          l2 = l5;
        }
        return l1 + l2;
      }
      l2 = periodStartTime;
      l1 = l2;
      if (l2 == 0L) {
        l1 = System.currentTimeMillis();
      }
      l2 = initialDelay;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (WorkSpec.class == paramObject.getClass()))
    {
      paramObject = (WorkSpec)paramObject;
      if (initialDelay != initialDelay) {
        return false;
      }
      if (intervalDuration != intervalDuration) {
        return false;
      }
      if (flexDuration != flexDuration) {
        return false;
      }
      if (runAttemptCount != runAttemptCount) {
        return false;
      }
      if (backoffDelayDuration != backoffDelayDuration) {
        return false;
      }
      if (periodStartTime != periodStartTime) {
        return false;
      }
      if (minimumRetentionDuration != minimumRetentionDuration) {
        return false;
      }
      if (scheduleRequestedAt != scheduleRequestedAt) {
        return false;
      }
      if (expedited != expedited) {
        return false;
      }
      if (!id.equals(id)) {
        return false;
      }
      if (state != state) {
        return false;
      }
      if (!workerClassName.equals(workerClassName)) {
        return false;
      }
      String str = inputMergerClassName;
      if (str != null ? !str.equals(inputMergerClassName) : inputMergerClassName != null) {
        return false;
      }
      if (!input.equals(input)) {
        return false;
      }
      if (!output.equals(output)) {
        return false;
      }
      if (!constraints.equals(constraints)) {
        return false;
      }
      if (backoffPolicy != backoffPolicy) {
        return false;
      }
      if (outOfQuotaPolicy != outOfQuotaPolicy) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public boolean hasConstraints()
  {
    return Constraints.NONE.equals(constraints) ^ true;
  }
  
  public int hashCode()
  {
    int i = id.hashCode();
    int j = state.hashCode();
    j = z2.c(workerClassName, (j + i * 31) * 31, 31);
    String str = inputMergerClassName;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    int k = input.hashCode();
    int m = output.hashCode();
    long l = initialDelay;
    int n = (int)(l ^ l >>> 32);
    l = intervalDuration;
    int i1 = (int)(l ^ l >>> 32);
    l = flexDuration;
    int i2 = (int)(l ^ l >>> 32);
    int i3 = constraints.hashCode();
    int i4 = runAttemptCount;
    int i5 = backoffPolicy.hashCode();
    l = backoffDelayDuration;
    int i6 = (int)(l ^ l >>> 32);
    l = periodStartTime;
    int i7 = (int)(l ^ l >>> 32);
    l = minimumRetentionDuration;
    int i8 = (int)(l ^ l >>> 32);
    l = scheduleRequestedAt;
    int i9 = (int)(l ^ l >>> 32);
    int i10 = expedited;
    return outOfQuotaPolicy.hashCode() + ((((((i5 + ((i3 + ((((m + (k + (j + i) * 31) * 31) * 31 + n) * 31 + i1) * 31 + i2) * 31) * 31 + i4) * 31) * 31 + i6) * 31 + i7) * 31 + i8) * 31 + i9) * 31 + i10) * 31;
  }
  
  public boolean isBackedOff()
  {
    boolean bool;
    if ((state == WorkInfo.State.ENQUEUED) && (runAttemptCount > 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isPeriodic()
  {
    boolean bool;
    if (intervalDuration != 0L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void setBackoffDelayDuration(long paramLong)
  {
    long l = paramLong;
    if (paramLong > 18000000L)
    {
      Logger.get().warning(TAG, "Backoff delay duration exceeds maximum value", new Throwable[0]);
      l = 18000000L;
    }
    paramLong = l;
    if (l < 10000L)
    {
      Logger.get().warning(TAG, "Backoff delay duration less than minimum value", new Throwable[0]);
      paramLong = 10000L;
    }
    backoffDelayDuration = paramLong;
  }
  
  public void setPeriodic(long paramLong)
  {
    long l = paramLong;
    if (paramLong < 900000L)
    {
      Logger.get().warning(TAG, String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[] { Long.valueOf(900000L) }), new Throwable[0]);
      l = 900000L;
    }
    setPeriodic(l, l);
  }
  
  public void setPeriodic(long paramLong1, long paramLong2)
  {
    long l = paramLong1;
    if (paramLong1 < 900000L)
    {
      Logger.get().warning(TAG, String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[] { Long.valueOf(900000L) }), new Throwable[0]);
      l = 900000L;
    }
    paramLong1 = paramLong2;
    if (paramLong2 < 300000L)
    {
      Logger.get().warning(TAG, String.format("Flex duration lesser than minimum allowed value; Changed to %s", new Object[] { Long.valueOf(300000L) }), new Throwable[0]);
      paramLong1 = 300000L;
    }
    paramLong2 = paramLong1;
    if (paramLong1 > l)
    {
      Logger.get().warning(TAG, String.format("Flex duration greater than interval duration; Changed to %s", new Object[] { Long.valueOf(l) }), new Throwable[0]);
      paramLong2 = l;
    }
    intervalDuration = l;
    flexDuration = paramLong2;
  }
  
  @NonNull
  public String toString()
  {
    return z2.s(z2.t("{WorkSpec: "), id, "}");
  }
  
  public static class IdAndState
  {
    @ColumnInfo(name="id")
    public String id;
    @ColumnInfo(name="state")
    public WorkInfo.State state;
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof IdAndState)) {
        return false;
      }
      paramObject = (IdAndState)paramObject;
      if (state != state) {
        return false;
      }
      return id.equals(id);
    }
    
    public int hashCode()
    {
      int i = id.hashCode();
      return state.hashCode() + i * 31;
    }
  }
  
  public static class WorkInfoPojo
  {
    @ColumnInfo(name="id")
    public String id;
    @ColumnInfo(name="output")
    public Data output;
    @Relation(entity=WorkProgress.class, entityColumn="work_spec_id", parentColumn="id", projection={"progress"})
    public List<Data> progress;
    @ColumnInfo(name="run_attempt_count")
    public int runAttemptCount;
    @ColumnInfo(name="state")
    public WorkInfo.State state;
    @Relation(entity=WorkTag.class, entityColumn="work_spec_id", parentColumn="id", projection={"tag"})
    public List<String> tags;
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof WorkInfoPojo)) {
        return false;
      }
      paramObject = (WorkInfoPojo)paramObject;
      if (runAttemptCount != runAttemptCount) {
        return false;
      }
      Object localObject = id;
      if (localObject != null ? !((String)localObject).equals(id) : id != null) {
        return false;
      }
      if (state != state) {
        return false;
      }
      localObject = output;
      if (localObject != null ? !((Data)localObject).equals(output) : output != null) {
        return false;
      }
      localObject = tags;
      if (localObject != null ? !((List)localObject).equals(tags) : tags != null) {
        return false;
      }
      localObject = progress;
      paramObject = progress;
      if (localObject != null) {
        bool = ((List)localObject).equals(paramObject);
      } else if (paramObject != null) {
        bool = false;
      }
      return bool;
    }
    
    public int hashCode()
    {
      Object localObject = id;
      int i = 0;
      int j;
      if (localObject != null) {
        j = ((String)localObject).hashCode();
      } else {
        j = 0;
      }
      localObject = state;
      int k;
      if (localObject != null) {
        k = localObject.hashCode();
      } else {
        k = 0;
      }
      localObject = output;
      int m;
      if (localObject != null) {
        m = ((Data)localObject).hashCode();
      } else {
        m = 0;
      }
      int n = runAttemptCount;
      localObject = tags;
      int i1;
      if (localObject != null) {
        i1 = ((List)localObject).hashCode();
      } else {
        i1 = 0;
      }
      localObject = progress;
      if (localObject != null) {
        i = ((List)localObject).hashCode();
      }
      return ((((j * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i;
    }
    
    @NonNull
    public WorkInfo toWorkInfo()
    {
      Object localObject = progress;
      if ((localObject != null) && (!((List)localObject).isEmpty())) {
        localObject = (Data)progress.get(0);
      } else {
        localObject = Data.EMPTY;
      }
      return new WorkInfo(UUID.fromString(id), state, output, tags, (Data)localObject, runAttemptCount);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.model.WorkSpec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */