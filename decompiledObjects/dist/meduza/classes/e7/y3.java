package e7;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import b.z;
import java.util.LinkedList;

public final class y3
  extends v
{
  public final void c()
  {
    switch (e)
    {
    default: 
      break;
    case 1: 
      ((k3)f).M();
      return;
    case 0: 
      ((k3)f).N();
      return;
    }
    ((i6)f).zzl().l();
    String str = (String)f).y.pollFirst();
    if (str != null)
    {
      Object localObject = (i6)f;
      ((z)((i6)localObject).zzb()).getClass();
      Q = SystemClock.elapsedRealtime();
      f).zzj().w.c("Sending trigger URI notification to app", str);
      localObject = new Intent();
      ((Intent)localObject).setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
      ((Intent)localObject).setPackage(str);
      f).t.a.sendBroadcast((Intent)localObject);
    }
    ((i6)f).E();
  }
}

/* Location:
 * Qualified Name:     e7.y3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */