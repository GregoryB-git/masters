package n9;

import android.os.AsyncTask;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.Executor;
import m.a;

public final class f
{
  public static final Executor a = TaskExecutors.MAIN_THREAD;
  public static final a b = new a(5);
  public static final m c = new m(AsyncTask.THREAD_POOL_EXECUTOR);
}

/* Location:
 * Qualified Name:     n9.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */