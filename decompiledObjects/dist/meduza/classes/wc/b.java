package wc;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import nc.k;
import nc.l;
import rb.f;
import ub.e;

public final class b<TResult>
  implements OnCompleteListener
{
  public b(l paraml) {}
  
  public final void onComplete(Task<Object> paramTask)
  {
    Exception localException = paramTask.getException();
    if (localException == null)
    {
      if (paramTask.isCanceled()) {
        a.cancel(null);
      } else {
        a.resumeWith(paramTask.getResult());
      }
    }
    else {
      a.resumeWith(f.a(localException));
    }
  }
}

/* Location:
 * Qualified Name:     wc.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */