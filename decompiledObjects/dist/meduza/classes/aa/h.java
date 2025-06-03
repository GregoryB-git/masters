package aa;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import io.flutter.plugins.firebase.auth.n;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v3.x0;

public abstract class h
  extends Service
{
  public static final long MESSAGE_TIMEOUT_S = 20L;
  private static final String TAG = "EnhancedIntentService";
  private Binder binder;
  public final ExecutorService executor;
  private int lastStartId;
  private final Object lock;
  private int runningTasks;
  
  public h()
  {
    Object localObject = new w6.a("Firebase-Messaging-Intent-Handle");
    localObject = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), (ThreadFactory)localObject);
    ((ThreadPoolExecutor)localObject).allowCoreThreadTimeOut(true);
    executor = Executors.unconfigurableExecutorService((ExecutorService)localObject);
    lock = new Object();
    runningTasks = 0;
  }
  
  private void finishTask(Intent arg1)
  {
    if (??? != null) {
      l0.a(???);
    }
    synchronized (lock)
    {
      int i = runningTasks - 1;
      runningTasks = i;
      if (i == 0) {
        stopSelfResultHook(lastStartId);
      }
      return;
    }
  }
  
  private Task<Void> processIntent(Intent paramIntent)
  {
    if (handleIntentOnMainThread(paramIntent)) {
      return Tasks.forResult(null);
    }
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    executor.execute(new x0(this, paramIntent, localTaskCompletionSource, 7));
    return localTaskCompletionSource.getTask();
  }
  
  public Intent getStartCommandIntent(Intent paramIntent)
  {
    return paramIntent;
  }
  
  public abstract void handleIntent(Intent paramIntent);
  
  public boolean handleIntentOnMainThread(Intent paramIntent)
  {
    return false;
  }
  
  public final IBinder onBind(Intent paramIntent)
  {
    try
    {
      if (Log.isLoggable("EnhancedIntentService", 3)) {
        Log.d("EnhancedIntentService", "Service received bind request");
      }
      if (binder == null)
      {
        paramIntent = new aa/n0;
        a locala = new aa/h$a;
        locala.<init>(this);
        paramIntent.<init>(locala);
        binder = paramIntent;
      }
      paramIntent = binder;
      return paramIntent;
    }
    finally {}
  }
  
  public void onDestroy()
  {
    executor.shutdown();
    super.onDestroy();
  }
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    synchronized (lock)
    {
      lastStartId = paramInt2;
      runningTasks += 1;
      ??? = getStartCommandIntent(paramIntent);
      if (??? == null)
      {
        finishTask(paramIntent);
        return 2;
      }
      ??? = processIntent((Intent)???);
      if (((Task)???).isComplete())
      {
        finishTask(paramIntent);
        return 2;
      }
      ((Task)???).addOnCompleteListener(new m.a(6), new n(2, this, paramIntent));
      return 3;
    }
  }
  
  public boolean stopSelfResultHook(int paramInt)
  {
    return stopSelfResult(paramInt);
  }
  
  public final class a
    implements n0.a
  {
    public a() {}
  }
}

/* Location:
 * Qualified Name:     aa.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */