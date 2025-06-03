package m7;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

public final class z
  extends w
{
  public z(e parame, TaskCompletionSource paramTaskCompletionSource1, TaskCompletionSource paramTaskCompletionSource2, w paramw)
  {
    super(paramTaskCompletionSource1);
  }
  
  public final void b()
  {
    synchronized (q.f)
    {
      e locale = q;
      TaskCompletionSource localTaskCompletionSource = o;
      e.add(localTaskCompletionSource);
      Task localTask = localTaskCompletionSource.getTask();
      y localy = new m7/y;
      localy.<init>(locale, localTaskCompletionSource);
      localTask.addOnCompleteListener(localy);
      if (q.l.getAndIncrement() > 0) {
        q.b.b("Already connected to the service.", new Object[0]);
      }
      e.b(q, p);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     m7.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */