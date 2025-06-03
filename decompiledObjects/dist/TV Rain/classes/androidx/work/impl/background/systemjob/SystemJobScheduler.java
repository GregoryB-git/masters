package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.BaseBundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.room.RoomDatabase;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.WorkInfo.State;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.IdGenerator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@RequiresApi(23)
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class SystemJobScheduler
  implements Scheduler
{
  private static final String TAG = Logger.tagWithPrefix("SystemJobScheduler");
  private final Context mContext;
  private final JobScheduler mJobScheduler;
  private final SystemJobInfoConverter mSystemJobInfoConverter;
  private final WorkManagerImpl mWorkManager;
  
  public SystemJobScheduler(@NonNull Context paramContext, @NonNull WorkManagerImpl paramWorkManagerImpl)
  {
    this(paramContext, paramWorkManagerImpl, (JobScheduler)paramContext.getSystemService("jobscheduler"), new SystemJobInfoConverter(paramContext));
  }
  
  @VisibleForTesting
  public SystemJobScheduler(Context paramContext, WorkManagerImpl paramWorkManagerImpl, JobScheduler paramJobScheduler, SystemJobInfoConverter paramSystemJobInfoConverter)
  {
    mContext = paramContext;
    mWorkManager = paramWorkManagerImpl;
    mJobScheduler = paramJobScheduler;
    mSystemJobInfoConverter = paramSystemJobInfoConverter;
  }
  
  public static void cancelAll(@NonNull Context paramContext)
  {
    JobScheduler localJobScheduler = (JobScheduler)paramContext.getSystemService("jobscheduler");
    if (localJobScheduler != null)
    {
      paramContext = getPendingJobs(paramContext, localJobScheduler);
      if ((paramContext != null) && (!paramContext.isEmpty()))
      {
        paramContext = paramContext.iterator();
        while (paramContext.hasNext()) {
          cancelJobById(localJobScheduler, ((JobInfo)paramContext.next()).getId());
        }
      }
    }
  }
  
  /* Error */
  private static void cancelJobById(@NonNull JobScheduler paramJobScheduler, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: invokevirtual 107	android/app/job/JobScheduler:cancel	(I)V
    //   5: goto +40 -> 45
    //   8: astore_0
    //   9: invokestatic 111	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   12: getstatic 34	androidx/work/impl/background/systemjob/SystemJobScheduler:TAG	Ljava/lang/String;
    //   15: invokestatic 117	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   18: ldc 119
    //   20: iconst_1
    //   21: anewarray 4	java/lang/Object
    //   24: dup
    //   25: iconst_0
    //   26: iload_1
    //   27: invokestatic 125	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   30: aastore
    //   31: invokestatic 131	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   34: iconst_1
    //   35: anewarray 133	java/lang/Throwable
    //   38: dup
    //   39: iconst_0
    //   40: aload_0
    //   41: aastore
    //   42: invokevirtual 137	androidx/work/Logger:error	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   45: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	46	0	paramJobScheduler	JobScheduler
    //   0	46	1	paramInt	int
    // Exception table:
    //   from	to	target	type
    //   0	5	8	finally
  }
  
  @Nullable
  private static List<Integer> getPendingJobIds(@NonNull Context paramContext, @NonNull JobScheduler paramJobScheduler, @NonNull String paramString)
  {
    paramJobScheduler = getPendingJobs(paramContext, paramJobScheduler);
    if (paramJobScheduler == null) {
      return null;
    }
    paramContext = new ArrayList(2);
    paramJobScheduler = paramJobScheduler.iterator();
    while (paramJobScheduler.hasNext())
    {
      JobInfo localJobInfo = (JobInfo)paramJobScheduler.next();
      if (paramString.equals(getWorkSpecIdFromJobInfo(localJobInfo))) {
        paramContext.add(Integer.valueOf(localJobInfo.getId()));
      }
    }
    return paramContext;
  }
  
  /* Error */
  @Nullable
  private static List<JobInfo> getPendingJobs(@NonNull Context paramContext, @NonNull JobScheduler paramJobScheduler)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 161	android/app/job/JobScheduler:getAllPendingJobs	()Ljava/util/List;
    //   4: astore_1
    //   5: goto +25 -> 30
    //   8: astore_1
    //   9: invokestatic 111	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   12: getstatic 34	androidx/work/impl/background/systemjob/SystemJobScheduler:TAG	Ljava/lang/String;
    //   15: ldc -93
    //   17: iconst_1
    //   18: anewarray 133	java/lang/Throwable
    //   21: dup
    //   22: iconst_0
    //   23: aload_1
    //   24: aastore
    //   25: invokevirtual 137	androidx/work/Logger:error	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   28: aconst_null
    //   29: astore_1
    //   30: aload_1
    //   31: ifnonnull +5 -> 36
    //   34: aconst_null
    //   35: areturn
    //   36: new 142	java/util/ArrayList
    //   39: dup
    //   40: aload_1
    //   41: invokeinterface 166 1 0
    //   46: invokespecial 144	java/util/ArrayList:<init>	(I)V
    //   49: astore_2
    //   50: new 168	android/content/ComponentName
    //   53: dup
    //   54: aload_0
    //   55: ldc -86
    //   57: invokespecial 173	android/content/ComponentName:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   60: astore_0
    //   61: aload_1
    //   62: invokeinterface 84 1 0
    //   67: astore_1
    //   68: aload_1
    //   69: invokeinterface 89 1 0
    //   74: ifeq +33 -> 107
    //   77: aload_1
    //   78: invokeinterface 93 1 0
    //   83: checkcast 95	android/app/job/JobInfo
    //   86: astore_3
    //   87: aload_0
    //   88: aload_3
    //   89: invokevirtual 177	android/app/job/JobInfo:getService	()Landroid/content/ComponentName;
    //   92: invokevirtual 178	android/content/ComponentName:equals	(Ljava/lang/Object;)Z
    //   95: ifeq -27 -> 68
    //   98: aload_2
    //   99: aload_3
    //   100: invokevirtual 155	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   103: pop
    //   104: goto -36 -> 68
    //   107: aload_2
    //   108: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	109	0	paramContext	Context
    //   0	109	1	paramJobScheduler	JobScheduler
    //   49	59	2	localArrayList	ArrayList
    //   86	14	3	localJobInfo	JobInfo
    // Exception table:
    //   from	to	target	type
    //   0	5	8	finally
  }
  
  @Nullable
  private static String getWorkSpecIdFromJobInfo(@NonNull JobInfo paramJobInfo)
  {
    paramJobInfo = paramJobInfo.getExtras();
    if (paramJobInfo != null) {}
    try
    {
      if (paramJobInfo.containsKey("EXTRA_WORK_SPEC_ID"))
      {
        paramJobInfo = paramJobInfo.getString("EXTRA_WORK_SPEC_ID");
        return paramJobInfo;
      }
    }
    catch (NullPointerException paramJobInfo)
    {
      for (;;) {}
    }
    return null;
  }
  
  public static boolean reconcileJobs(@NonNull Context paramContext, @NonNull WorkManagerImpl paramWorkManagerImpl)
  {
    Object localObject1 = (JobScheduler)paramContext.getSystemService("jobscheduler");
    Object localObject2 = getPendingJobs(paramContext, (JobScheduler)localObject1);
    paramContext = paramWorkManagerImpl.getWorkDatabase().systemIdInfoDao().getWorkSpecIds();
    boolean bool1 = false;
    int i;
    if (localObject2 != null) {
      i = ((List)localObject2).size();
    } else {
      i = 0;
    }
    HashSet localHashSet = new HashSet(i);
    if ((localObject2 != null) && (!((List)localObject2).isEmpty()))
    {
      Iterator localIterator = ((List)localObject2).iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (JobInfo)localIterator.next();
        String str = getWorkSpecIdFromJobInfo((JobInfo)localObject2);
        if (!TextUtils.isEmpty(str)) {
          localHashSet.add(str);
        } else {
          cancelJobById((JobScheduler)localObject1, ((JobInfo)localObject2).getId());
        }
      }
    }
    localObject1 = paramContext.iterator();
    do
    {
      bool2 = bool1;
      if (!((Iterator)localObject1).hasNext()) {
        break;
      }
    } while (localHashSet.contains((String)((Iterator)localObject1).next()));
    Logger.get().debug(TAG, "Reconciling jobs", new Throwable[0]);
    boolean bool2 = true;
    if (bool2)
    {
      paramWorkManagerImpl = paramWorkManagerImpl.getWorkDatabase();
      paramWorkManagerImpl.beginTransaction();
      try
      {
        localObject1 = paramWorkManagerImpl.workSpecDao();
        paramContext = paramContext.iterator();
        while (paramContext.hasNext()) {
          ((WorkSpecDao)localObject1).markWorkSpecScheduled((String)paramContext.next(), -1L);
        }
        paramWorkManagerImpl.setTransactionSuccessful();
      }
      finally
      {
        paramWorkManagerImpl.endTransaction();
      }
    }
    return bool2;
  }
  
  public void cancel(@NonNull String paramString)
  {
    Object localObject = getPendingJobIds(mContext, mJobScheduler, paramString);
    if ((localObject != null) && (!((List)localObject).isEmpty()))
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        int i = ((Integer)((Iterator)localObject).next()).intValue();
        cancelJobById(mJobScheduler, i);
      }
      mWorkManager.getWorkDatabase().systemIdInfoDao().removeSystemIdInfo(paramString);
    }
  }
  
  public boolean hasLimitedSchedulingSlots()
  {
    return true;
  }
  
  public void schedule(@NonNull WorkSpec... paramVarArgs)
  {
    WorkDatabase localWorkDatabase = mWorkManager.getWorkDatabase();
    IdGenerator localIdGenerator = new IdGenerator(localWorkDatabase);
    int i = paramVarArgs.length;
    int j = 0;
    while (j < i)
    {
      WorkSpec localWorkSpec = paramVarArgs[j];
      localWorkDatabase.beginTransaction();
      try
      {
        Object localObject1 = localWorkDatabase.workSpecDao().getWorkSpec(id);
        Object localObject2;
        Object localObject3;
        if (localObject1 == null)
        {
          localObject1 = Logger.get();
          localObject2 = TAG;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          ((StringBuilder)localObject3).append("Skipping scheduling ");
          ((StringBuilder)localObject3).append(id);
          ((StringBuilder)localObject3).append(" because it's no longer in the DB");
          ((Logger)localObject1).warning((String)localObject2, ((StringBuilder)localObject3).toString(), new Throwable[0]);
          localWorkDatabase.setTransactionSuccessful();
        }
        else if (state != WorkInfo.State.ENQUEUED)
        {
          localObject3 = Logger.get();
          localObject1 = TAG;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          ((StringBuilder)localObject2).append("Skipping scheduling ");
          ((StringBuilder)localObject2).append(id);
          ((StringBuilder)localObject2).append(" because it is no longer enqueued");
          ((Logger)localObject3).warning((String)localObject1, ((StringBuilder)localObject2).toString(), new Throwable[0]);
          localWorkDatabase.setTransactionSuccessful();
        }
        else
        {
          localObject1 = localWorkDatabase.systemIdInfoDao().getSystemIdInfo(id);
          int k;
          if (localObject1 != null) {
            k = systemId;
          } else {
            k = localIdGenerator.nextJobSchedulerIdWithRange(mWorkManager.getConfiguration().getMinJobSchedulerId(), mWorkManager.getConfiguration().getMaxJobSchedulerId());
          }
          if (localObject1 == null)
          {
            localObject1 = new androidx/work/impl/model/SystemIdInfo;
            ((SystemIdInfo)localObject1).<init>(id, k);
            mWorkManager.getWorkDatabase().systemIdInfoDao().insertSystemIdInfo((SystemIdInfo)localObject1);
          }
          scheduleInternal(localWorkSpec, k);
          localWorkDatabase.setTransactionSuccessful();
        }
        localWorkDatabase.endTransaction();
        j++;
      }
      finally
      {
        localWorkDatabase.endTransaction();
      }
    }
  }
  
  /* Error */
  @VisibleForTesting
  public void scheduleInternal(WorkSpec paramWorkSpec, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 68	androidx/work/impl/background/systemjob/SystemJobScheduler:mSystemJobInfoConverter	Landroidx/work/impl/background/systemjob/SystemJobInfoConverter;
    //   4: aload_1
    //   5: iload_2
    //   6: invokevirtual 353	androidx/work/impl/background/systemjob/SystemJobInfoConverter:convert	(Landroidx/work/impl/model/WorkSpec;I)Landroid/app/job/JobInfo;
    //   9: astore_3
    //   10: invokestatic 111	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   13: astore 4
    //   15: getstatic 34	androidx/work/impl/background/systemjob/SystemJobScheduler:TAG	Ljava/lang/String;
    //   18: astore 5
    //   20: aload 4
    //   22: aload 5
    //   24: ldc_w 355
    //   27: iconst_2
    //   28: anewarray 4	java/lang/Object
    //   31: dup
    //   32: iconst_0
    //   33: aload_1
    //   34: getfield 277	androidx/work/impl/model/WorkSpec:id	Ljava/lang/String;
    //   37: aastore
    //   38: dup
    //   39: iconst_1
    //   40: iload_2
    //   41: invokestatic 125	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   44: aastore
    //   45: invokestatic 358	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   48: iconst_0
    //   49: anewarray 133	java/lang/Throwable
    //   52: invokevirtual 232	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   55: aload_0
    //   56: getfield 66	androidx/work/impl/background/systemjob/SystemJobScheduler:mJobScheduler	Landroid/app/job/JobScheduler;
    //   59: aload_3
    //   60: invokevirtual 361	android/app/job/JobScheduler:schedule	(Landroid/app/job/JobInfo;)I
    //   63: ifne +128 -> 191
    //   66: invokestatic 111	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   69: aload 5
    //   71: ldc_w 363
    //   74: iconst_1
    //   75: anewarray 4	java/lang/Object
    //   78: dup
    //   79: iconst_0
    //   80: aload_1
    //   81: getfield 277	androidx/work/impl/model/WorkSpec:id	Ljava/lang/String;
    //   84: aastore
    //   85: invokestatic 358	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   88: iconst_0
    //   89: anewarray 133	java/lang/Throwable
    //   92: invokevirtual 299	androidx/work/Logger:warning	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   95: aload_1
    //   96: getfield 367	androidx/work/impl/model/WorkSpec:expedited	Z
    //   99: ifeq +92 -> 191
    //   102: aload_1
    //   103: getfield 371	androidx/work/impl/model/WorkSpec:outOfQuotaPolicy	Landroidx/work/OutOfQuotaPolicy;
    //   106: getstatic 376	androidx/work/OutOfQuotaPolicy:RUN_AS_NON_EXPEDITED_WORK_REQUEST	Landroidx/work/OutOfQuotaPolicy;
    //   109: if_acmpne +82 -> 191
    //   112: aload_1
    //   113: iconst_0
    //   114: putfield 367	androidx/work/impl/model/WorkSpec:expedited	Z
    //   117: ldc_w 378
    //   120: iconst_1
    //   121: anewarray 4	java/lang/Object
    //   124: dup
    //   125: iconst_0
    //   126: aload_1
    //   127: getfield 277	androidx/work/impl/model/WorkSpec:id	Ljava/lang/String;
    //   130: aastore
    //   131: invokestatic 358	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   134: astore_3
    //   135: invokestatic 111	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   138: aload 5
    //   140: aload_3
    //   141: iconst_0
    //   142: anewarray 133	java/lang/Throwable
    //   145: invokevirtual 232	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   148: aload_0
    //   149: aload_1
    //   150: iload_2
    //   151: invokevirtual 347	androidx/work/impl/background/systemjob/SystemJobScheduler:scheduleInternal	(Landroidx/work/impl/model/WorkSpec;I)V
    //   154: goto +37 -> 191
    //   157: astore 5
    //   159: invokestatic 111	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   162: getstatic 34	androidx/work/impl/background/systemjob/SystemJobScheduler:TAG	Ljava/lang/String;
    //   165: ldc_w 380
    //   168: iconst_1
    //   169: anewarray 4	java/lang/Object
    //   172: dup
    //   173: iconst_0
    //   174: aload_1
    //   175: aastore
    //   176: invokestatic 358	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   179: iconst_1
    //   180: anewarray 133	java/lang/Throwable
    //   183: dup
    //   184: iconst_0
    //   185: aload 5
    //   187: aastore
    //   188: invokevirtual 137	androidx/work/Logger:error	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   191: return
    //   192: astore_1
    //   193: aload_0
    //   194: getfield 62	androidx/work/impl/background/systemjob/SystemJobScheduler:mContext	Landroid/content/Context;
    //   197: aload_0
    //   198: getfield 66	androidx/work/impl/background/systemjob/SystemJobScheduler:mJobScheduler	Landroid/app/job/JobScheduler;
    //   201: invokestatic 74	androidx/work/impl/background/systemjob/SystemJobScheduler:getPendingJobs	(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/List;
    //   204: astore 5
    //   206: aload 5
    //   208: ifnull +14 -> 222
    //   211: aload 5
    //   213: invokeinterface 166 1 0
    //   218: istore_2
    //   219: goto +5 -> 224
    //   222: iconst_0
    //   223: istore_2
    //   224: invokestatic 117	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   227: ldc_w 382
    //   230: iconst_3
    //   231: anewarray 4	java/lang/Object
    //   234: dup
    //   235: iconst_0
    //   236: iload_2
    //   237: invokestatic 125	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   240: aastore
    //   241: dup
    //   242: iconst_1
    //   243: aload_0
    //   244: getfield 64	androidx/work/impl/background/systemjob/SystemJobScheduler:mWorkManager	Landroidx/work/impl/WorkManagerImpl;
    //   247: invokevirtual 204	androidx/work/impl/WorkManagerImpl:getWorkDatabase	()Landroidx/work/impl/WorkDatabase;
    //   250: invokevirtual 241	androidx/work/impl/WorkDatabase:workSpecDao	()Landroidx/work/impl/model/WorkSpecDao;
    //   253: invokeinterface 385 1 0
    //   258: invokeinterface 166 1 0
    //   263: invokestatic 125	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   266: aastore
    //   267: dup
    //   268: iconst_2
    //   269: aload_0
    //   270: getfield 64	androidx/work/impl/background/systemjob/SystemJobScheduler:mWorkManager	Landroidx/work/impl/WorkManagerImpl;
    //   273: invokevirtual 324	androidx/work/impl/WorkManagerImpl:getConfiguration	()Landroidx/work/Configuration;
    //   276: invokevirtual 388	androidx/work/Configuration:getMaxSchedulerLimit	()I
    //   279: invokestatic 125	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   282: aastore
    //   283: invokestatic 131	java/lang/String:format	(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   286: astore 5
    //   288: invokestatic 111	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   291: getstatic 34	androidx/work/impl/background/systemjob/SystemJobScheduler:TAG	Ljava/lang/String;
    //   294: aload 5
    //   296: iconst_0
    //   297: anewarray 133	java/lang/Throwable
    //   300: invokevirtual 137	androidx/work/Logger:error	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   303: new 349	java/lang/IllegalStateException
    //   306: dup
    //   307: aload 5
    //   309: aload_1
    //   310: invokespecial 391	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   313: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	314	0	this	SystemJobScheduler
    //   0	314	1	paramWorkSpec	WorkSpec
    //   0	314	2	paramInt	int
    //   9	132	3	localObject1	Object
    //   13	8	4	localLogger	Logger
    //   18	121	5	str	String
    //   157	29	5	localObject2	Object
    //   204	104	5	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   55	154	157	finally
    //   55	154	192	java/lang/IllegalStateException
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.background.systemjob.SystemJobScheduler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */