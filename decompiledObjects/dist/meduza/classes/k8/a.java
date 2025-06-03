package k8;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import r3.o;

public final class a
{
  public static final m.a a = new m.a(4);
  
  public static <T> Task<T> a(Task<T> paramTask1, Task<T> paramTask2)
  {
    Object localObject = new CancellationTokenSource();
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource(((CancellationTokenSource)localObject).getToken());
    o localo = new o(localTaskCompletionSource, new AtomicBoolean(false), localObject);
    localObject = a;
    paramTask1.continueWithTask((Executor)localObject, localo);
    paramTask2.continueWithTask((Executor)localObject, localo);
    return localTaskCompletionSource.getTask();
  }
}

/* Location:
 * Qualified Name:     k8.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */