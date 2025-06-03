package l6;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.base.zau;
import j6.b;
import j6.e;
import java.util.concurrent.atomic.AtomicReference;

public abstract class e1
  extends f
  implements DialogInterface.OnCancelListener
{
  public volatile boolean a;
  public final AtomicReference b = new AtomicReference(null);
  public final zau c = new zau(Looper.getMainLooper());
  public final e d;
  
  public e1(g paramg, e parame)
  {
    super(paramg);
    d = parame;
  }
  
  public final void a(b paramb, int paramInt)
  {
    b.set(null);
    f.h(paramb, paramInt);
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    c1 localc1 = (c1)b.get();
    if (paramInt1 != 1)
    {
      if (paramInt1 == 2)
      {
        paramInt1 = d.b(getActivity());
        if (paramInt1 == 0)
        {
          b.set(null);
          paramIntent = f.v;
          paramIntent.sendMessage(paramIntent.obtainMessage(3));
          return;
        }
        if (localc1 == null) {
          return;
        }
        if ((b.b == 18) && (paramInt1 == 18)) {
          return;
        }
      }
    }
    else
    {
      if (paramInt2 == -1)
      {
        b.set(null);
        paramIntent = f.v;
        paramIntent.sendMessage(paramIntent.obtainMessage(3));
        return;
      }
      if (paramInt2 == 0)
      {
        if (localc1 == null) {
          return;
        }
        paramInt1 = 13;
        if (paramIntent != null) {
          paramInt1 = paramIntent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
        }
        a(new b(1, paramInt1, null, b.toString()), a);
        return;
      }
    }
    if (localc1 != null) {
      a(b, a);
    }
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    b localb = new b(13, null);
    paramDialogInterface = (c1)b.get();
    int i;
    if (paramDialogInterface == null) {
      i = -1;
    } else {
      i = a;
    }
    a(localb, i);
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null)
    {
      AtomicReference localAtomicReference = b;
      if (paramBundle.getBoolean("resolving_error", false)) {
        paramBundle = new c1(new b(paramBundle.getInt("failed_status"), (PendingIntent)paramBundle.getParcelable("failed_resolution")), paramBundle.getInt("failed_client_id", -1));
      } else {
        paramBundle = null;
      }
      localAtomicReference.set(paramBundle);
    }
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    c1 localc1 = (c1)b.get();
    if (localc1 == null) {
      return;
    }
    paramBundle.putBoolean("resolving_error", true);
    paramBundle.putInt("failed_client_id", a);
    paramBundle.putInt("failed_status", b.b);
    paramBundle.putParcelable("failed_resolution", b.c);
  }
  
  public void onStart()
  {
    super.onStart();
    a = true;
  }
  
  public void onStop()
  {
    super.onStop();
    a = false;
  }
}

/* Location:
 * Qualified Name:     l6.e1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */