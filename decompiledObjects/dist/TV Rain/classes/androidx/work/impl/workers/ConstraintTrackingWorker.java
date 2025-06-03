package androidx.work.impl.workers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.ListenableWorker;
import androidx.work.ListenableWorker.Result;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class ConstraintTrackingWorker
  extends ListenableWorker
  implements WorkConstraintsCallback
{
  public static final String ARGUMENT_CLASS_NAME = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME";
  private static final String TAG = Logger.tagWithPrefix("ConstraintTrkngWrkr");
  public volatile boolean mAreConstraintsUnmet;
  @Nullable
  private ListenableWorker mDelegate;
  public SettableFuture<ListenableWorker.Result> mFuture;
  public final Object mLock;
  private WorkerParameters mWorkerParameters;
  
  public ConstraintTrackingWorker(@NonNull Context paramContext, @NonNull WorkerParameters paramWorkerParameters)
  {
    super(paramContext, paramWorkerParameters);
    mWorkerParameters = paramWorkerParameters;
    mLock = new Object();
    mAreConstraintsUnmet = false;
    mFuture = SettableFuture.create();
  }
  
  @Nullable
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  @VisibleForTesting
  public ListenableWorker getDelegate()
  {
    return mDelegate;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  @VisibleForTesting
  public TaskExecutor getTaskExecutor()
  {
    return WorkManagerImpl.getInstance(getApplicationContext()).getWorkTaskExecutor();
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  @VisibleForTesting
  public WorkDatabase getWorkDatabase()
  {
    return WorkManagerImpl.getInstance(getApplicationContext()).getWorkDatabase();
  }
  
  public boolean isRunInForeground()
  {
    ListenableWorker localListenableWorker = mDelegate;
    boolean bool;
    if ((localListenableWorker != null) && (localListenableWorker.isRunInForeground())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void onAllConstraintsMet(@NonNull List<String> paramList) {}
  
  public void onAllConstraintsNotMet(@NonNull List<String> paramList)
  {
    Logger.get().debug(TAG, String.format("Constraints changed for %s", new Object[] { paramList }), new Throwable[0]);
    synchronized (mLock)
    {
      mAreConstraintsUnmet = true;
      return;
    }
  }
  
  public void onStopped()
  {
    super.onStopped();
    ListenableWorker localListenableWorker = mDelegate;
    if ((localListenableWorker != null) && (!localListenableWorker.isStopped())) {
      mDelegate.stop();
    }
  }
  
  public void setFutureFailed()
  {
    mFuture.set(ListenableWorker.Result.failure());
  }
  
  public void setFutureRetry()
  {
    mFuture.set(ListenableWorker.Result.retry());
  }
  
  /* Error */
  public void setupAndRunConstraintTrackingWork()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 149	androidx/work/ListenableWorker:getInputData	()Landroidx/work/Data;
    //   4: ldc 18
    //   6: invokevirtual 154	androidx/work/Data:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   9: astore_1
    //   10: aload_1
    //   11: invokestatic 160	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   14: ifeq +23 -> 37
    //   17: invokestatic 106	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   20: getstatic 43	androidx/work/impl/workers/ConstraintTrackingWorker:TAG	Ljava/lang/String;
    //   23: ldc -94
    //   25: iconst_0
    //   26: anewarray 116	java/lang/Throwable
    //   29: invokevirtual 165	androidx/work/Logger:error	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   32: aload_0
    //   33: invokevirtual 167	androidx/work/impl/workers/ConstraintTrackingWorker:setFutureFailed	()V
    //   36: return
    //   37: aload_0
    //   38: invokevirtual 171	androidx/work/ListenableWorker:getWorkerFactory	()Landroidx/work/WorkerFactory;
    //   41: aload_0
    //   42: invokevirtual 80	androidx/work/ListenableWorker:getApplicationContext	()Landroid/content/Context;
    //   45: aload_1
    //   46: aload_0
    //   47: getfield 51	androidx/work/impl/workers/ConstraintTrackingWorker:mWorkerParameters	Landroidx/work/WorkerParameters;
    //   50: invokevirtual 177	androidx/work/WorkerFactory:createWorkerWithDefaultFallback	(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/ListenableWorker;
    //   53: astore_2
    //   54: aload_0
    //   55: aload_2
    //   56: putfield 73	androidx/work/impl/workers/ConstraintTrackingWorker:mDelegate	Landroidx/work/ListenableWorker;
    //   59: aload_2
    //   60: ifnonnull +23 -> 83
    //   63: invokestatic 106	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   66: getstatic 43	androidx/work/impl/workers/ConstraintTrackingWorker:TAG	Ljava/lang/String;
    //   69: ldc -94
    //   71: iconst_0
    //   72: anewarray 116	java/lang/Throwable
    //   75: invokevirtual 120	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   78: aload_0
    //   79: invokevirtual 167	androidx/work/impl/workers/ConstraintTrackingWorker:setFutureFailed	()V
    //   82: return
    //   83: aload_0
    //   84: invokevirtual 178	androidx/work/impl/workers/ConstraintTrackingWorker:getWorkDatabase	()Landroidx/work/impl/WorkDatabase;
    //   87: invokevirtual 184	androidx/work/impl/WorkDatabase:workSpecDao	()Landroidx/work/impl/model/WorkSpecDao;
    //   90: aload_0
    //   91: invokevirtual 188	androidx/work/ListenableWorker:getId	()Ljava/util/UUID;
    //   94: invokevirtual 194	java/util/UUID:toString	()Ljava/lang/String;
    //   97: invokeinterface 200 2 0
    //   102: astore_2
    //   103: aload_2
    //   104: ifnonnull +8 -> 112
    //   107: aload_0
    //   108: invokevirtual 167	androidx/work/impl/workers/ConstraintTrackingWorker:setFutureFailed	()V
    //   111: return
    //   112: new 202	androidx/work/impl/constraints/WorkConstraintsTracker
    //   115: dup
    //   116: aload_0
    //   117: invokevirtual 80	androidx/work/ListenableWorker:getApplicationContext	()Landroid/content/Context;
    //   120: aload_0
    //   121: invokevirtual 204	androidx/work/impl/workers/ConstraintTrackingWorker:getTaskExecutor	()Landroidx/work/impl/utils/taskexecutor/TaskExecutor;
    //   124: aload_0
    //   125: invokespecial 207	androidx/work/impl/constraints/WorkConstraintsTracker:<init>	(Landroid/content/Context;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/constraints/WorkConstraintsCallback;)V
    //   128: astore_3
    //   129: aload_3
    //   130: aload_2
    //   131: invokestatic 213	java/util/Collections:singletonList	(Ljava/lang/Object;)Ljava/util/List;
    //   134: invokevirtual 217	androidx/work/impl/constraints/WorkConstraintsTracker:replace	(Ljava/lang/Iterable;)V
    //   137: aload_3
    //   138: aload_0
    //   139: invokevirtual 188	androidx/work/ListenableWorker:getId	()Ljava/util/UUID;
    //   142: invokevirtual 194	java/util/UUID:toString	()Ljava/lang/String;
    //   145: invokevirtual 221	androidx/work/impl/constraints/WorkConstraintsTracker:areAllConstraintsMet	(Ljava/lang/String;)Z
    //   148: ifeq +146 -> 294
    //   151: invokestatic 106	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   154: getstatic 43	androidx/work/impl/workers/ConstraintTrackingWorker:TAG	Ljava/lang/String;
    //   157: ldc -33
    //   159: iconst_1
    //   160: anewarray 53	java/lang/Object
    //   163: dup
    //   164: iconst_0
    //   165: aload_1
    //   166: aastore
    //   167: invokestatic 114	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   170: iconst_0
    //   171: anewarray 116	java/lang/Throwable
    //   174: invokevirtual 120	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   177: aload_0
    //   178: getfield 73	androidx/work/impl/workers/ConstraintTrackingWorker:mDelegate	Landroidx/work/ListenableWorker;
    //   181: invokevirtual 227	androidx/work/ListenableWorker:startWork	()Lcom/google/common/util/concurrent/ListenableFuture;
    //   184: astore_3
    //   185: new 10	androidx/work/impl/workers/ConstraintTrackingWorker$2
    //   188: astore_2
    //   189: aload_2
    //   190: aload_0
    //   191: aload_3
    //   192: invokespecial 230	androidx/work/impl/workers/ConstraintTrackingWorker$2:<init>	(Landroidx/work/impl/workers/ConstraintTrackingWorker;Lcom/google/common/util/concurrent/ListenableFuture;)V
    //   195: aload_3
    //   196: aload_2
    //   197: aload_0
    //   198: invokevirtual 234	androidx/work/ListenableWorker:getBackgroundExecutor	()Ljava/util/concurrent/Executor;
    //   201: invokeinterface 240 3 0
    //   206: goto +118 -> 324
    //   209: astore 4
    //   211: invokestatic 106	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   214: astore_3
    //   215: getstatic 43	androidx/work/impl/workers/ConstraintTrackingWorker:TAG	Ljava/lang/String;
    //   218: astore_2
    //   219: aload_3
    //   220: aload_2
    //   221: ldc -14
    //   223: iconst_1
    //   224: anewarray 53	java/lang/Object
    //   227: dup
    //   228: iconst_0
    //   229: aload_1
    //   230: aastore
    //   231: invokestatic 114	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   234: iconst_1
    //   235: anewarray 116	java/lang/Throwable
    //   238: dup
    //   239: iconst_0
    //   240: aload 4
    //   242: aastore
    //   243: invokevirtual 120	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   246: aload_0
    //   247: getfield 57	androidx/work/impl/workers/ConstraintTrackingWorker:mLock	Ljava/lang/Object;
    //   250: astore_1
    //   251: aload_1
    //   252: monitorenter
    //   253: aload_0
    //   254: getfield 59	androidx/work/impl/workers/ConstraintTrackingWorker:mAreConstraintsUnmet	Z
    //   257: ifeq +23 -> 280
    //   260: invokestatic 106	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   263: aload_2
    //   264: ldc -12
    //   266: iconst_0
    //   267: anewarray 116	java/lang/Throwable
    //   270: invokevirtual 120	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   273: aload_0
    //   274: invokevirtual 246	androidx/work/impl/workers/ConstraintTrackingWorker:setFutureRetry	()V
    //   277: goto +7 -> 284
    //   280: aload_0
    //   281: invokevirtual 167	androidx/work/impl/workers/ConstraintTrackingWorker:setFutureFailed	()V
    //   284: aload_1
    //   285: monitorexit
    //   286: goto +38 -> 324
    //   289: astore_2
    //   290: aload_1
    //   291: monitorexit
    //   292: aload_2
    //   293: athrow
    //   294: invokestatic 106	androidx/work/Logger:get	()Landroidx/work/Logger;
    //   297: getstatic 43	androidx/work/impl/workers/ConstraintTrackingWorker:TAG	Ljava/lang/String;
    //   300: ldc -8
    //   302: iconst_1
    //   303: anewarray 53	java/lang/Object
    //   306: dup
    //   307: iconst_0
    //   308: aload_1
    //   309: aastore
    //   310: invokestatic 114	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   313: iconst_0
    //   314: anewarray 116	java/lang/Throwable
    //   317: invokevirtual 120	androidx/work/Logger:debug	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
    //   320: aload_0
    //   321: invokevirtual 246	androidx/work/impl/workers/ConstraintTrackingWorker:setFutureRetry	()V
    //   324: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	325	0	this	ConstraintTrackingWorker
    //   53	211	2	localObject2	Object
    //   289	4	2	localObject3	Object
    //   128	92	3	localObject4	Object
    //   209	32	4	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   177	206	209	finally
    //   253	277	289	finally
    //   280	284	289	finally
    //   284	286	289	finally
    //   290	292	289	finally
  }
  
  @NonNull
  public ListenableFuture<ListenableWorker.Result> startWork()
  {
    getBackgroundExecutor().execute(new Runnable()
    {
      public void run()
      {
        setupAndRunConstraintTrackingWork();
      }
    });
    return mFuture;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.workers.ConstraintTrackingWorker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */