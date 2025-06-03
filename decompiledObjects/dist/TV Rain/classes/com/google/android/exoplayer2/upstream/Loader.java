package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class Loader
  implements LoaderErrorThrower
{
  private static final int ACTION_TYPE_DONT_RETRY = 2;
  private static final int ACTION_TYPE_DONT_RETRY_FATAL = 3;
  private static final int ACTION_TYPE_RETRY = 0;
  private static final int ACTION_TYPE_RETRY_AND_RESET_ERROR_COUNT = 1;
  public static final LoadErrorAction DONT_RETRY = new LoadErrorAction(2, -9223372036854775807L, null);
  public static final LoadErrorAction DONT_RETRY_FATAL = new LoadErrorAction(3, -9223372036854775807L, null);
  public static final LoadErrorAction RETRY = createRetryAction(false, -9223372036854775807L);
  public static final LoadErrorAction RETRY_RESET_ERROR_COUNT = createRetryAction(true, -9223372036854775807L);
  private LoadTask<? extends Loadable> currentTask;
  private final ExecutorService downloadExecutorService;
  private IOException fatalError;
  
  public Loader(String paramString)
  {
    downloadExecutorService = Util.newSingleThreadExecutor(paramString);
  }
  
  public static LoadErrorAction createRetryAction(boolean paramBoolean, long paramLong)
  {
    return new LoadErrorAction(paramBoolean, paramLong, null);
  }
  
  public void cancelLoading()
  {
    currentTask.cancel(false);
  }
  
  public boolean isLoading()
  {
    boolean bool;
    if (currentTask != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void maybeThrowError()
    throws IOException
  {
    maybeThrowError(Integer.MIN_VALUE);
  }
  
  public void maybeThrowError(int paramInt)
    throws IOException
  {
    Object localObject = fatalError;
    if (localObject == null)
    {
      localObject = currentTask;
      if (localObject != null)
      {
        int i = paramInt;
        if (paramInt == Integer.MIN_VALUE) {
          i = defaultMinRetryCount;
        }
        ((LoadTask)localObject).maybeThrowError(i);
      }
      return;
    }
    throw ((Throwable)localObject);
  }
  
  public void release()
  {
    release(null);
  }
  
  public void release(@Nullable ReleaseCallback paramReleaseCallback)
  {
    LoadTask localLoadTask = currentTask;
    if (localLoadTask != null) {
      localLoadTask.cancel(true);
    }
    if (paramReleaseCallback != null) {
      downloadExecutorService.execute(new ReleaseTask(paramReleaseCallback));
    }
    downloadExecutorService.shutdown();
  }
  
  public <T extends Loadable> long startLoading(T paramT, Callback<T> paramCallback, int paramInt)
  {
    Looper localLooper = Looper.myLooper();
    boolean bool;
    if (localLooper != null) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
    fatalError = null;
    long l = SystemClock.elapsedRealtime();
    new LoadTask(localLooper, paramT, paramCallback, paramInt, l).start(0L);
    return l;
  }
  
  public static abstract interface Callback<T extends Loader.Loadable>
  {
    public abstract void onLoadCanceled(T paramT, long paramLong1, long paramLong2, boolean paramBoolean);
    
    public abstract void onLoadCompleted(T paramT, long paramLong1, long paramLong2);
    
    public abstract Loader.LoadErrorAction onLoadError(T paramT, long paramLong1, long paramLong2, IOException paramIOException, int paramInt);
  }
  
  public static final class LoadErrorAction
  {
    private final long retryDelayMillis;
    private final int type;
    
    private LoadErrorAction(int paramInt, long paramLong)
    {
      type = paramInt;
      retryDelayMillis = paramLong;
    }
    
    public boolean isRetry()
    {
      int i = type;
      boolean bool1 = true;
      boolean bool2 = bool1;
      if (i != 0) {
        if (i == 1) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
      }
      return bool2;
    }
  }
  
  @SuppressLint({"HandlerLeak"})
  public final class LoadTask<T extends Loader.Loadable>
    extends Handler
    implements Runnable
  {
    private static final int MSG_CANCEL = 1;
    private static final int MSG_END_OF_SOURCE = 2;
    private static final int MSG_FATAL_ERROR = 4;
    private static final int MSG_IO_EXCEPTION = 3;
    private static final int MSG_START = 0;
    private static final String TAG = "LoadTask";
    @Nullable
    private Loader.Callback<T> callback;
    private volatile boolean canceled;
    private IOException currentError;
    public final int defaultMinRetryCount;
    private int errorCount;
    private volatile Thread executorThread;
    private final T loadable;
    private volatile boolean released;
    private final long startTimeMs;
    
    public LoadTask(T paramT, Loader.Callback<T> paramCallback, int paramInt, long paramLong)
    {
      super();
      loadable = paramCallback;
      callback = paramInt;
      defaultMinRetryCount = paramLong;
      Object localObject;
      startTimeMs = localObject;
    }
    
    private void execute()
    {
      currentError = null;
      Loader.access$500(Loader.this).execute(Loader.access$100(Loader.this));
    }
    
    private void finish()
    {
      Loader.access$102(Loader.this, null);
    }
    
    private long getRetryDelayMillis()
    {
      return Math.min((errorCount - 1) * 1000, 5000);
    }
    
    public void cancel(boolean paramBoolean)
    {
      released = paramBoolean;
      currentError = null;
      if (hasMessages(0))
      {
        removeMessages(0);
        if (!paramBoolean) {
          sendEmptyMessage(1);
        }
      }
      else
      {
        canceled = true;
        loadable.cancelLoad();
        if (executorThread != null) {
          executorThread.interrupt();
        }
      }
      if (paramBoolean)
      {
        finish();
        long l = SystemClock.elapsedRealtime();
        callback.onLoadCanceled(loadable, l, l - startTimeMs, true);
        callback = null;
      }
    }
    
    public void handleMessage(Message paramMessage)
    {
      if (released) {
        return;
      }
      int i = what;
      if (i == 0)
      {
        execute();
        return;
      }
      if (i != 4)
      {
        finish();
        long l1 = SystemClock.elapsedRealtime();
        long l2 = l1 - startTimeMs;
        if (canceled)
        {
          callback.onLoadCanceled(loadable, l1, l2, false);
          return;
        }
        i = what;
        if (i != 1)
        {
          if (i != 2)
          {
            if (i == 3)
            {
              paramMessage = (IOException)obj;
              currentError = paramMessage;
              i = errorCount + 1;
              errorCount = i;
              paramMessage = callback.onLoadError(loadable, l1, l2, paramMessage, i);
              if (Loader.LoadErrorAction.access$300(paramMessage) == 3)
              {
                Loader.access$202(Loader.this, currentError);
              }
              else if (Loader.LoadErrorAction.access$300(paramMessage) != 2)
              {
                if (Loader.LoadErrorAction.access$300(paramMessage) == 1) {
                  errorCount = 1;
                }
                if (Loader.LoadErrorAction.access$400(paramMessage) != -9223372036854775807L) {
                  l1 = Loader.LoadErrorAction.access$400(paramMessage);
                } else {
                  l1 = getRetryDelayMillis();
                }
                start(l1);
              }
            }
          }
          else {
            try
            {
              callback.onLoadCompleted(loadable, l1, l2);
            }
            catch (RuntimeException paramMessage)
            {
              Log.e("LoadTask", "Unexpected exception handling load completed", paramMessage);
              Loader.access$202(Loader.this, new Loader.UnexpectedLoaderException(paramMessage));
            }
          }
        }
        else {
          callback.onLoadCanceled(loadable, l1, l2, false);
        }
        return;
      }
      throw ((Error)obj);
    }
    
    public void maybeThrowError(int paramInt)
      throws IOException
    {
      IOException localIOException = currentError;
      if ((localIOException != null) && (errorCount > paramInt)) {
        throw localIOException;
      }
    }
    
    /* Error */
    public void run()
    {
      // Byte code:
      //   0: aload_0
      //   1: invokestatic 214	java/lang/Thread:currentThread	()Ljava/lang/Thread;
      //   4: putfield 121	com/google/android/exoplayer2/upstream/Loader$LoadTask:executorThread	Ljava/lang/Thread;
      //   7: aload_0
      //   8: getfield 114	com/google/android/exoplayer2/upstream/Loader$LoadTask:canceled	Z
      //   11: ifne +61 -> 72
      //   14: new 216	java/lang/StringBuilder
      //   17: astore_1
      //   18: aload_1
      //   19: invokespecial 218	java/lang/StringBuilder:<init>	()V
      //   22: aload_1
      //   23: ldc -36
      //   25: invokevirtual 224	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   28: pop
      //   29: aload_1
      //   30: aload_0
      //   31: getfield 56	com/google/android/exoplayer2/upstream/Loader$LoadTask:loadable	Lcom/google/android/exoplayer2/upstream/Loader$Loadable;
      //   34: invokevirtual 230	java/lang/Object:getClass	()Ljava/lang/Class;
      //   37: invokevirtual 236	java/lang/Class:getSimpleName	()Ljava/lang/String;
      //   40: invokevirtual 224	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   43: pop
      //   44: aload_1
      //   45: invokevirtual 239	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   48: invokestatic 245	com/google/android/exoplayer2/util/TraceUtil:beginSection	(Ljava/lang/String;)V
      //   51: aload_0
      //   52: getfield 56	com/google/android/exoplayer2/upstream/Loader$LoadTask:loadable	Lcom/google/android/exoplayer2/upstream/Loader$Loadable;
      //   55: invokeinterface 248 1 0
      //   60: invokestatic 251	com/google/android/exoplayer2/util/TraceUtil:endSection	()V
      //   63: goto +9 -> 72
      //   66: astore_1
      //   67: invokestatic 251	com/google/android/exoplayer2/util/TraceUtil:endSection	()V
      //   70: aload_1
      //   71: athrow
      //   72: aload_0
      //   73: getfield 101	com/google/android/exoplayer2/upstream/Loader$LoadTask:released	Z
      //   76: ifne +152 -> 228
      //   79: aload_0
      //   80: iconst_2
      //   81: invokevirtual 112	android/os/Handler:sendEmptyMessage	(I)Z
      //   84: pop
      //   85: goto +143 -> 228
      //   88: astore_1
      //   89: ldc 27
      //   91: ldc -3
      //   93: aload_1
      //   94: invokestatic 194	com/google/android/exoplayer2/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
      //   97: aload_0
      //   98: getfield 101	com/google/android/exoplayer2/upstream/Loader$LoadTask:released	Z
      //   101: ifne +12 -> 113
      //   104: aload_0
      //   105: iconst_4
      //   106: aload_1
      //   107: invokevirtual 257	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
      //   110: invokevirtual 260	android/os/Message:sendToTarget	()V
      //   113: aload_1
      //   114: athrow
      //   115: astore_1
      //   116: ldc 27
      //   118: ldc_w 262
      //   121: aload_1
      //   122: invokestatic 194	com/google/android/exoplayer2/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
      //   125: aload_0
      //   126: getfield 101	com/google/android/exoplayer2/upstream/Loader$LoadTask:released	Z
      //   129: ifne +99 -> 228
      //   132: aload_0
      //   133: iconst_3
      //   134: new 196	com/google/android/exoplayer2/upstream/Loader$UnexpectedLoaderException
      //   137: dup
      //   138: aload_1
      //   139: invokespecial 199	com/google/android/exoplayer2/upstream/Loader$UnexpectedLoaderException:<init>	(Ljava/lang/Throwable;)V
      //   142: invokevirtual 257	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
      //   145: invokevirtual 260	android/os/Message:sendToTarget	()V
      //   148: goto +80 -> 228
      //   151: astore_1
      //   152: ldc 27
      //   154: ldc_w 264
      //   157: aload_1
      //   158: invokestatic 194	com/google/android/exoplayer2/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
      //   161: aload_0
      //   162: getfield 101	com/google/android/exoplayer2/upstream/Loader$LoadTask:released	Z
      //   165: ifne +63 -> 228
      //   168: aload_0
      //   169: iconst_3
      //   170: new 196	com/google/android/exoplayer2/upstream/Loader$UnexpectedLoaderException
      //   173: dup
      //   174: aload_1
      //   175: invokespecial 199	com/google/android/exoplayer2/upstream/Loader$UnexpectedLoaderException:<init>	(Ljava/lang/Throwable;)V
      //   178: invokevirtual 257	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
      //   181: invokevirtual 260	android/os/Message:sendToTarget	()V
      //   184: goto +44 -> 228
      //   187: astore_1
      //   188: aload_0
      //   189: getfield 114	com/google/android/exoplayer2/upstream/Loader$LoadTask:canceled	Z
      //   192: invokestatic 269	com/google/android/exoplayer2/util/Assertions:checkState	(Z)V
      //   195: aload_0
      //   196: getfield 101	com/google/android/exoplayer2/upstream/Loader$LoadTask:released	Z
      //   199: ifne +29 -> 228
      //   202: aload_0
      //   203: iconst_2
      //   204: invokevirtual 112	android/os/Handler:sendEmptyMessage	(I)Z
      //   207: pop
      //   208: goto +20 -> 228
      //   211: astore_1
      //   212: aload_0
      //   213: getfield 101	com/google/android/exoplayer2/upstream/Loader$LoadTask:released	Z
      //   216: ifne +12 -> 228
      //   219: aload_0
      //   220: iconst_3
      //   221: aload_1
      //   222: invokevirtual 257	android/os/Handler:obtainMessage	(ILjava/lang/Object;)Landroid/os/Message;
      //   225: invokevirtual 260	android/os/Message:sendToTarget	()V
      //   228: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	229	0	this	LoadTask
      //   17	28	1	localStringBuilder	StringBuilder
      //   66	5	1	localObject	Object
      //   88	26	1	localError	Error
      //   115	24	1	localOutOfMemoryError	OutOfMemoryError
      //   151	24	1	localException	Exception
      //   187	1	1	localInterruptedException	InterruptedException
      //   211	11	1	localIOException	IOException
      // Exception table:
      //   from	to	target	type
      //   51	60	66	finally
      //   0	51	88	java/lang/Error
      //   60	63	88	java/lang/Error
      //   67	72	88	java/lang/Error
      //   72	85	88	java/lang/Error
      //   0	51	115	java/lang/OutOfMemoryError
      //   60	63	115	java/lang/OutOfMemoryError
      //   67	72	115	java/lang/OutOfMemoryError
      //   72	85	115	java/lang/OutOfMemoryError
      //   0	51	151	java/lang/Exception
      //   60	63	151	java/lang/Exception
      //   67	72	151	java/lang/Exception
      //   72	85	151	java/lang/Exception
      //   0	51	187	java/lang/InterruptedException
      //   60	63	187	java/lang/InterruptedException
      //   67	72	187	java/lang/InterruptedException
      //   72	85	187	java/lang/InterruptedException
      //   0	51	211	java/io/IOException
      //   60	63	211	java/io/IOException
      //   67	72	211	java/io/IOException
      //   72	85	211	java/io/IOException
    }
    
    public void start(long paramLong)
    {
      boolean bool;
      if (Loader.access$100(Loader.this) == null) {
        bool = true;
      } else {
        bool = false;
      }
      Assertions.checkState(bool);
      Loader.access$102(Loader.this, this);
      if (paramLong > 0L) {
        sendEmptyMessageDelayed(0, paramLong);
      } else {
        execute();
      }
    }
  }
  
  public static abstract interface Loadable
  {
    public abstract void cancelLoad();
    
    public abstract void load()
      throws IOException, InterruptedException;
  }
  
  public static abstract interface ReleaseCallback
  {
    public abstract void onLoaderReleased();
  }
  
  public static final class ReleaseTask
    implements Runnable
  {
    private final Loader.ReleaseCallback callback;
    
    public ReleaseTask(Loader.ReleaseCallback paramReleaseCallback)
    {
      callback = paramReleaseCallback;
    }
    
    public void run()
    {
      callback.onLoaderReleased();
    }
  }
  
  public static final class UnexpectedLoaderException
    extends IOException
  {
    public UnexpectedLoaderException(Throwable paramThrowable)
    {
      super(paramThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.Loader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */