package com.facebook.datasource;

import android.util.Pair;
import com.facebook.common.internal.Preconditions;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public abstract class AbstractDataSource<T>
  implements DataSource<T>
{
  @GuardedBy("this")
  private DataSourceStatus mDataSourceStatus = DataSourceStatus.IN_PROGRESS;
  @GuardedBy("this")
  private Throwable mFailureThrowable = null;
  @GuardedBy("this")
  private boolean mIsClosed = false;
  @GuardedBy("this")
  private float mProgress = 0.0F;
  @Nullable
  @GuardedBy("this")
  private T mResult = null;
  private final ConcurrentLinkedQueue<Pair<DataSubscriber<T>, Executor>> mSubscribers = new ConcurrentLinkedQueue();
  
  private void notifyDataSubscriber(final DataSubscriber<T> paramDataSubscriber, Executor paramExecutor, final boolean paramBoolean1, final boolean paramBoolean2)
  {
    paramExecutor.execute(new Runnable()
    {
      public void run()
      {
        if (paramBoolean1) {
          paramDataSubscriber.onFailure(AbstractDataSource.this);
        } else if (paramBoolean2) {
          paramDataSubscriber.onCancellation(AbstractDataSource.this);
        } else {
          paramDataSubscriber.onNewResult(AbstractDataSource.this);
        }
      }
    });
  }
  
  private void notifyDataSubscribers()
  {
    boolean bool1 = hasFailed();
    boolean bool2 = wasCancelled();
    Iterator localIterator = mSubscribers.iterator();
    while (localIterator.hasNext())
    {
      Pair localPair = (Pair)localIterator.next();
      notifyDataSubscriber((DataSubscriber)first, (Executor)second, bool1, bool2);
    }
  }
  
  private boolean setFailureInternal(Throwable paramThrowable)
  {
    try
    {
      if ((!mIsClosed) && (mDataSourceStatus == DataSourceStatus.IN_PROGRESS))
      {
        mDataSourceStatus = DataSourceStatus.FAILURE;
        mFailureThrowable = paramThrowable;
        return true;
      }
      return false;
    }
    finally {}
  }
  
  private boolean setProgressInternal(float paramFloat)
  {
    try
    {
      if ((!mIsClosed) && (mDataSourceStatus == DataSourceStatus.IN_PROGRESS))
      {
        float f = mProgress;
        if (paramFloat < f) {
          return false;
        }
        mProgress = paramFloat;
        return true;
      }
      return false;
    }
    finally {}
  }
  
  /* Error */
  private boolean setResultInternal(@Nullable T paramT, boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: aload_0
    //   6: monitorenter
    //   7: aload 4
    //   9: astore_3
    //   10: aload_0
    //   11: getfield 44	com/facebook/datasource/AbstractDataSource:mIsClosed	Z
    //   14: ifne +95 -> 109
    //   17: aload 4
    //   19: astore_3
    //   20: aload_0
    //   21: getfield 49	com/facebook/datasource/AbstractDataSource:mDataSourceStatus	Lcom/facebook/datasource/AbstractDataSource$DataSourceStatus;
    //   24: getstatic 47	com/facebook/datasource/AbstractDataSource$DataSourceStatus:IN_PROGRESS	Lcom/facebook/datasource/AbstractDataSource$DataSourceStatus;
    //   27: if_acmpeq +6 -> 33
    //   30: goto +79 -> 109
    //   33: iload_2
    //   34: ifeq +21 -> 55
    //   37: aload 4
    //   39: astore_3
    //   40: aload_0
    //   41: getstatic 113	com/facebook/datasource/AbstractDataSource$DataSourceStatus:SUCCESS	Lcom/facebook/datasource/AbstractDataSource$DataSourceStatus;
    //   44: putfield 49	com/facebook/datasource/AbstractDataSource:mDataSourceStatus	Lcom/facebook/datasource/AbstractDataSource$DataSourceStatus;
    //   47: aload 4
    //   49: astore_3
    //   50: aload_0
    //   51: fconst_1
    //   52: putfield 42	com/facebook/datasource/AbstractDataSource:mProgress	F
    //   55: aload 4
    //   57: astore_3
    //   58: aload_0
    //   59: getfield 38	com/facebook/datasource/AbstractDataSource:mResult	Ljava/lang/Object;
    //   62: astore 4
    //   64: aload 4
    //   66: aload_1
    //   67: if_acmpeq +24 -> 91
    //   70: aload_0
    //   71: aload_1
    //   72: putfield 38	com/facebook/datasource/AbstractDataSource:mResult	Ljava/lang/Object;
    //   75: aload 4
    //   77: astore_1
    //   78: goto +15 -> 93
    //   81: astore_3
    //   82: aload 4
    //   84: astore_1
    //   85: aload_3
    //   86: astore 4
    //   88: goto +51 -> 139
    //   91: aconst_null
    //   92: astore_1
    //   93: aload_1
    //   94: astore 4
    //   96: aload_0
    //   97: monitorexit
    //   98: aload_1
    //   99: ifnull +8 -> 107
    //   102: aload_0
    //   103: aload_1
    //   104: invokevirtual 117	com/facebook/datasource/AbstractDataSource:closeResult	(Ljava/lang/Object;)V
    //   107: iconst_1
    //   108: ireturn
    //   109: aload_1
    //   110: astore 4
    //   112: aload_0
    //   113: monitorexit
    //   114: aload_1
    //   115: ifnull +8 -> 123
    //   118: aload_0
    //   119: aload_1
    //   120: invokevirtual 117	com/facebook/datasource/AbstractDataSource:closeResult	(Ljava/lang/Object;)V
    //   123: iconst_0
    //   124: ireturn
    //   125: astore_3
    //   126: aload 4
    //   128: astore_1
    //   129: aload_3
    //   130: astore 4
    //   132: goto +7 -> 139
    //   135: astore 4
    //   137: aload_3
    //   138: astore_1
    //   139: aload_1
    //   140: astore_3
    //   141: aload_0
    //   142: monitorexit
    //   143: aload_1
    //   144: astore_3
    //   145: aload 4
    //   147: athrow
    //   148: astore_1
    //   149: aload_3
    //   150: ifnull +8 -> 158
    //   153: aload_0
    //   154: aload_3
    //   155: invokevirtual 117	com/facebook/datasource/AbstractDataSource:closeResult	(Ljava/lang/Object;)V
    //   158: aload_1
    //   159: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	160	0	this	AbstractDataSource
    //   0	160	1	paramT	T
    //   0	160	2	paramBoolean	boolean
    //   1	57	3	localObject1	Object
    //   81	5	3	localObject2	Object
    //   125	13	3	localObject3	Object
    //   140	15	3	?	T
    //   3	128	4	localObject4	Object
    //   135	11	4	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   70	75	81	finally
    //   96	98	125	finally
    //   112	114	125	finally
    //   10	17	135	finally
    //   20	30	135	finally
    //   40	47	135	finally
    //   50	55	135	finally
    //   58	64	135	finally
    //   141	143	135	finally
    //   5	7	148	finally
    //   145	148	148	finally
  }
  
  private boolean wasCancelled()
  {
    try
    {
      if (isClosed())
      {
        bool = isFinished();
        if (!bool)
        {
          bool = true;
          break label25;
        }
      }
      boolean bool = false;
      label25:
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public boolean close()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 44	com/facebook/datasource/AbstractDataSource:mIsClosed	Z
    //   6: ifeq +7 -> 13
    //   9: aload_0
    //   10: monitorexit
    //   11: iconst_0
    //   12: ireturn
    //   13: aload_0
    //   14: iconst_1
    //   15: putfield 44	com/facebook/datasource/AbstractDataSource:mIsClosed	Z
    //   18: aload_0
    //   19: getfield 38	com/facebook/datasource/AbstractDataSource:mResult	Ljava/lang/Object;
    //   22: astore_1
    //   23: aload_0
    //   24: aconst_null
    //   25: putfield 38	com/facebook/datasource/AbstractDataSource:mResult	Ljava/lang/Object;
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_1
    //   31: ifnull +8 -> 39
    //   34: aload_0
    //   35: aload_1
    //   36: invokevirtual 117	com/facebook/datasource/AbstractDataSource:closeResult	(Ljava/lang/Object;)V
    //   39: aload_0
    //   40: invokevirtual 125	com/facebook/datasource/AbstractDataSource:isFinished	()Z
    //   43: ifne +7 -> 50
    //   46: aload_0
    //   47: invokespecial 128	com/facebook/datasource/AbstractDataSource:notifyDataSubscribers	()V
    //   50: aload_0
    //   51: monitorenter
    //   52: aload_0
    //   53: getfield 54	com/facebook/datasource/AbstractDataSource:mSubscribers	Ljava/util/concurrent/ConcurrentLinkedQueue;
    //   56: invokevirtual 131	java/util/concurrent/ConcurrentLinkedQueue:clear	()V
    //   59: aload_0
    //   60: monitorexit
    //   61: iconst_1
    //   62: ireturn
    //   63: astore_1
    //   64: aload_0
    //   65: monitorexit
    //   66: aload_1
    //   67: athrow
    //   68: astore_1
    //   69: aload_0
    //   70: monitorexit
    //   71: aload_1
    //   72: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	73	0	this	AbstractDataSource
    //   22	14	1	localObject1	Object
    //   63	4	1	localObject2	Object
    //   68	4	1	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   52	61	63	finally
    //   64	66	63	finally
    //   2	11	68	finally
    //   13	30	68	finally
    //   69	71	68	finally
  }
  
  public void closeResult(@Nullable T paramT) {}
  
  @Nullable
  public Throwable getFailureCause()
  {
    try
    {
      Throwable localThrowable = mFailureThrowable;
      return localThrowable;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public float getProgress()
  {
    try
    {
      float f = mProgress;
      return f;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  @Nullable
  public T getResult()
  {
    try
    {
      Object localObject1 = mResult;
      return (T)localObject1;
    }
    finally
    {
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  public boolean hasFailed()
  {
    try
    {
      DataSourceStatus localDataSourceStatus1 = mDataSourceStatus;
      DataSourceStatus localDataSourceStatus2 = DataSourceStatus.FAILURE;
      boolean bool;
      if (localDataSourceStatus1 == localDataSourceStatus2) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean hasResult()
  {
    try
    {
      Object localObject1 = mResult;
      boolean bool;
      if (localObject1 != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    finally
    {
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  public boolean isClosed()
  {
    try
    {
      boolean bool = mIsClosed;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean isFinished()
  {
    try
    {
      DataSourceStatus localDataSourceStatus1 = mDataSourceStatus;
      DataSourceStatus localDataSourceStatus2 = DataSourceStatus.IN_PROGRESS;
      boolean bool;
      if (localDataSourceStatus1 != localDataSourceStatus2) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void notifyProgressUpdate()
  {
    Iterator localIterator = mSubscribers.iterator();
    while (localIterator.hasNext())
    {
      Pair localPair = (Pair)localIterator.next();
      final DataSubscriber localDataSubscriber = (DataSubscriber)first;
      ((Executor)second).execute(new Runnable()
      {
        public void run()
        {
          localDataSubscriber.onProgressUpdate(AbstractDataSource.this);
        }
      });
    }
  }
  
  public boolean setFailure(Throwable paramThrowable)
  {
    boolean bool = setFailureInternal(paramThrowable);
    if (bool) {
      notifyDataSubscribers();
    }
    return bool;
  }
  
  public boolean setProgress(float paramFloat)
  {
    boolean bool = setProgressInternal(paramFloat);
    if (bool) {
      notifyProgressUpdate();
    }
    return bool;
  }
  
  public boolean setResult(@Nullable T paramT, boolean paramBoolean)
  {
    paramBoolean = setResultInternal(paramT, paramBoolean);
    if (paramBoolean) {
      notifyDataSubscribers();
    }
    return paramBoolean;
  }
  
  public void subscribe(DataSubscriber<T> paramDataSubscriber, Executor paramExecutor)
  {
    Preconditions.checkNotNull(paramDataSubscriber);
    Preconditions.checkNotNull(paramExecutor);
    try
    {
      if (mIsClosed) {
        return;
      }
      if (mDataSourceStatus == DataSourceStatus.IN_PROGRESS) {
        mSubscribers.add(Pair.create(paramDataSubscriber, paramExecutor));
      }
      int i;
      if ((!hasResult()) && (!isFinished()) && (!wasCancelled())) {
        i = 0;
      } else {
        i = 1;
      }
      if (i != 0) {
        notifyDataSubscriber(paramDataSubscriber, paramExecutor, hasFailed(), wasCancelled());
      }
      return;
    }
    finally {}
  }
  
  public static enum DataSourceStatus
  {
    static
    {
      DataSourceStatus localDataSourceStatus1 = new DataSourceStatus("IN_PROGRESS", 0);
      IN_PROGRESS = localDataSourceStatus1;
      DataSourceStatus localDataSourceStatus2 = new DataSourceStatus("SUCCESS", 1);
      SUCCESS = localDataSourceStatus2;
      DataSourceStatus localDataSourceStatus3 = new DataSourceStatus("FAILURE", 2);
      FAILURE = localDataSourceStatus3;
      $VALUES = new DataSourceStatus[] { localDataSourceStatus1, localDataSourceStatus2, localDataSourceStatus3 };
    }
    
    private DataSourceStatus() {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.datasource.AbstractDataSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */