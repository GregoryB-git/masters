package m9;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.f;
import com.google.firebase.firestore.f.a;
import eb.e.a;
import eb.e1;
import eb.s0;
import javax.net.ssl.SSLHandshakeException;
import n9.o;

public final class u
  extends e.a<Object>
{
  public u(v paramv, TaskCompletionSource paramTaskCompletionSource) {}
  
  public final void a(s0 params0, e1 parame1)
  {
    if (parame1.e())
    {
      if (a.getTask().isComplete()) {
        return;
      }
      parame1 = a;
      params0 = new f("Received onClose with status OK, but no message.", f.a.r);
    }
    else
    {
      TaskCompletionSource localTaskCompletionSource = a;
      b.getClass();
      params0 = j.d;
      params0 = c;
      if ((params0 instanceof SSLHandshakeException)) {
        params0.getMessage().contains("no ciphers available");
      }
      params0 = o.g(parame1);
      parame1 = localTaskCompletionSource;
    }
    parame1.setException(params0);
  }
  
  public final void c(Object paramObject)
  {
    a.setResult(paramObject);
  }
}

/* Location:
 * Qualified Name:     m9.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */