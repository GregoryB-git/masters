package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.arch.core.util.Function;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.RawWorkInfoDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpec.WorkInfoPojo;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.UUID;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public abstract class StatusRunnable<T>
  implements Runnable
{
  private final SettableFuture<T> mFuture = SettableFuture.create();
  
  @NonNull
  public static StatusRunnable<List<WorkInfo>> forStringIds(@NonNull WorkManagerImpl paramWorkManagerImpl, @NonNull final List<String> paramList)
  {
    new StatusRunnable()
    {
      public List<WorkInfo> runInternal()
      {
        List localList = getWorkDatabase().workSpecDao().getWorkStatusPojoForIds(paramList);
        return (List)WorkSpec.WORK_INFO_MAPPER.apply(localList);
      }
    };
  }
  
  @NonNull
  public static StatusRunnable<List<WorkInfo>> forTag(@NonNull WorkManagerImpl paramWorkManagerImpl, @NonNull final String paramString)
  {
    new StatusRunnable()
    {
      public List<WorkInfo> runInternal()
      {
        List localList = getWorkDatabase().workSpecDao().getWorkStatusPojoForTag(paramString);
        return (List)WorkSpec.WORK_INFO_MAPPER.apply(localList);
      }
    };
  }
  
  @NonNull
  public static StatusRunnable<WorkInfo> forUUID(@NonNull WorkManagerImpl paramWorkManagerImpl, @NonNull final UUID paramUUID)
  {
    new StatusRunnable()
    {
      public WorkInfo runInternal()
      {
        Object localObject = getWorkDatabase().workSpecDao().getWorkStatusPojoForId(paramUUID.toString());
        if (localObject != null) {
          localObject = ((WorkSpec.WorkInfoPojo)localObject).toWorkInfo();
        } else {
          localObject = null;
        }
        return (WorkInfo)localObject;
      }
    };
  }
  
  @NonNull
  public static StatusRunnable<List<WorkInfo>> forUniqueWork(@NonNull WorkManagerImpl paramWorkManagerImpl, @NonNull final String paramString)
  {
    new StatusRunnable()
    {
      public List<WorkInfo> runInternal()
      {
        List localList = getWorkDatabase().workSpecDao().getWorkStatusPojoForName(paramString);
        return (List)WorkSpec.WORK_INFO_MAPPER.apply(localList);
      }
    };
  }
  
  @NonNull
  public static StatusRunnable<List<WorkInfo>> forWorkQuerySpec(@NonNull WorkManagerImpl paramWorkManagerImpl, @NonNull final WorkQuery paramWorkQuery)
  {
    new StatusRunnable()
    {
      public List<WorkInfo> runInternal()
      {
        List localList = getWorkDatabase().rawWorkInfoDao().getWorkInfoPojos(RawQueries.workQueryToRawQuery(paramWorkQuery));
        return (List)WorkSpec.WORK_INFO_MAPPER.apply(localList);
      }
    };
  }
  
  @NonNull
  public ListenableFuture<T> getFuture()
  {
    return mFuture;
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 75	androidx/work/impl/utils/StatusRunnable:runInternal	()Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_0
    //   6: getfield 36	androidx/work/impl/utils/StatusRunnable:mFuture	Landroidx/work/impl/utils/futures/SettableFuture;
    //   9: aload_1
    //   10: invokevirtual 79	androidx/work/impl/utils/futures/SettableFuture:set	(Ljava/lang/Object;)Z
    //   13: pop
    //   14: goto +13 -> 27
    //   17: astore_1
    //   18: aload_0
    //   19: getfield 36	androidx/work/impl/utils/StatusRunnable:mFuture	Landroidx/work/impl/utils/futures/SettableFuture;
    //   22: aload_1
    //   23: invokevirtual 83	androidx/work/impl/utils/futures/SettableFuture:setException	(Ljava/lang/Throwable;)Z
    //   26: pop
    //   27: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	28	0	this	StatusRunnable
    //   4	6	1	localObject	Object
    //   17	6	1	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   0	14	17	finally
  }
  
  @WorkerThread
  public abstract T runInternal();
}

/* Location:
 * Qualified Name:     androidx.work.impl.utils.StatusRunnable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */