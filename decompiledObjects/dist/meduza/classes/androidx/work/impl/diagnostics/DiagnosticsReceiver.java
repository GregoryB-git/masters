package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import o2.j;
import o2.l;
import o2.l.a;
import o2.p;
import o2.q.a;
import p2.k0;

public class DiagnosticsReceiver
  extends BroadcastReceiver
{
  public static final String a = j.f("DiagnosticsRcvr");
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null) {
      return;
    }
    j.d().a(a, "Requesting diagnostics");
    try
    {
      paramContext = k0.d(paramContext);
      paramIntent = new o2/l$a;
      paramIntent.<init>(DiagnosticsWorker.class);
      paramContext.a((l)paramIntent.a());
    }
    catch (IllegalStateException paramContext)
    {
      j.d().c(a, "WorkManager is not initialized", paramContext);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.diagnostics.DiagnosticsReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */