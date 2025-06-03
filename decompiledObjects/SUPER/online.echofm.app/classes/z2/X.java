package z2;

import K2.i;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;
import t0.f;
import x2.b;
import x2.j;

public abstract class X
  extends LifecycleCallback
  implements DialogInterface.OnCancelListener
{
  public volatile boolean p;
  public final AtomicReference q = new AtomicReference(null);
  public final Handler r = new i(Looper.getMainLooper());
  public final j s;
  
  public X(g paramg, j paramj)
  {
    super(paramg);
    s = paramj;
  }
  
  public static final int p(U paramU)
  {
    if (paramU == null) {
      return -1;
    }
    return paramU.a();
  }
  
  public final void e(int paramInt1, int paramInt2, Intent paramIntent)
  {
    U localU = (U)q.get();
    if (paramInt1 != 1)
    {
      if (paramInt1 == 2)
      {
        paramInt1 = s.g(b());
        if (paramInt1 == 0)
        {
          o();
          return;
        }
        if (localU == null) {
          return;
        }
        if ((localU.b().a() != 18) || (paramInt1 != 18)) {}
      }
    }
    else
    {
      if (paramInt2 == -1)
      {
        o();
        return;
      }
      if (paramInt2 == 0)
      {
        if (localU == null) {
          return;
        }
        paramInt1 = 13;
        if (paramIntent != null) {
          paramInt1 = paramIntent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
        }
        l(new b(paramInt1, null, localU.b().toString()), p(localU));
        return;
      }
    }
    if (localU != null) {
      l(localU.b(), localU.a());
    }
  }
  
  public final void f(Bundle paramBundle)
  {
    super.f(paramBundle);
    if (paramBundle != null)
    {
      AtomicReference localAtomicReference = q;
      if (paramBundle.getBoolean("resolving_error", false)) {
        paramBundle = new U(new b(paramBundle.getInt("failed_status"), (PendingIntent)paramBundle.getParcelable("failed_resolution")), paramBundle.getInt("failed_client_id", -1));
      } else {
        paramBundle = null;
      }
      localAtomicReference.set(paramBundle);
    }
  }
  
  public final void i(Bundle paramBundle)
  {
    super.i(paramBundle);
    U localU = (U)q.get();
    if (localU == null) {
      return;
    }
    paramBundle.putBoolean("resolving_error", true);
    paramBundle.putInt("failed_client_id", localU.a());
    paramBundle.putInt("failed_status", localU.b().a());
    paramBundle.putParcelable("failed_resolution", localU.b().f());
  }
  
  public void j()
  {
    super.j();
    p = true;
  }
  
  public void k()
  {
    super.k();
    p = false;
  }
  
  public final void l(b paramb, int paramInt)
  {
    q.set(null);
    m(paramb, paramInt);
  }
  
  public abstract void m(b paramb, int paramInt);
  
  public abstract void n();
  
  public final void o()
  {
    q.set(null);
    n();
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    l(new b(13, null), p((U)q.get()));
  }
  
  public final void s(b paramb, int paramInt)
  {
    paramb = new U(paramb, paramInt);
    AtomicReference localAtomicReference = q;
    do
    {
      if (f.a(localAtomicReference, null, paramb))
      {
        r.post(new W(this, paramb));
        return;
      }
    } while (localAtomicReference.get() == null);
  }
}

/* Location:
 * Qualified Name:     z2.X
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */