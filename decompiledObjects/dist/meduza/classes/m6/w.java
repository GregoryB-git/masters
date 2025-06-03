package m6;

import b.a0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;
import k6.g;
import k6.g.a;

public final class w
  implements g.a
{
  public w(g paramg, TaskCompletionSource paramTaskCompletionSource, i parami) {}
  
  public final void a(Status paramStatus)
  {
    if (paramStatus.D())
    {
      paramStatus = a.await(0L, TimeUnit.MILLISECONDS);
      b.setResult(c.d(paramStatus));
      return;
    }
    b.setException(a0.r(paramStatus));
  }
}

/* Location:
 * Qualified Name:     m6.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */