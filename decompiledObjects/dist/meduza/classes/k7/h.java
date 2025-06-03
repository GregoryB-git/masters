package k7;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j7.f;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

public final class h
  extends e
{
  public h(n paramn, TaskCompletionSource paramTaskCompletionSource1, TaskCompletionSource paramTaskCompletionSource2, f paramf)
  {
    super(paramTaskCompletionSource1);
  }
  
  public final void a()
  {
    synchronized (d.f)
    {
      n localn = d;
      TaskCompletionSource localTaskCompletionSource = b;
      e.add(localTaskCompletionSource);
      Task localTask = localTaskCompletionSource.getTask();
      g localg = new k7/g;
      localg.<init>(localn, localTaskCompletionSource);
      localTask.addOnCompleteListener(localg);
      if (d.k.getAndIncrement() > 0) {
        d.b.a("Already connected to the service.", new Object[0]);
      }
      n.b(d, c);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     k7.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */