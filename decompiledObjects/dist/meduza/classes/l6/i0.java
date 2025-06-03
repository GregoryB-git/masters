package l6;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicReference;
import l.l;

public final class i0
  extends BroadcastReceiver
{
  public Context a;
  public final l b;
  
  public i0(l paraml)
  {
    b = paraml;
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = paramIntent.getData();
    if (paramContext != null) {
      paramContext = paramContext.getSchemeSpecificPart();
    } else {
      paramContext = null;
    }
    if ("com.google.android.gms".equals(paramContext))
    {
      paramContext = b;
      paramIntent = c).b;
      b.set(null);
      paramIntent = f.v;
      paramIntent.sendMessage(paramIntent.obtainMessage(3));
      if (((Dialog)b).isShowing()) {
        ((Dialog)b).dismiss();
      }
      try
      {
        paramContext = a;
        if (paramContext != null) {
          paramContext.unregisterReceiver(this);
        }
        a = null;
      }
      finally {}
    }
  }
}

/* Location:
 * Qualified Name:     l6.i0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */