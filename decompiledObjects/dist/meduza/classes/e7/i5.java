package e7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.b;
import i6.t;
import j6.b;
import m6.j;
import u6.a;

public final class i5
  implements ServiceConnection, a.a, a.b
{
  public volatile boolean a;
  public volatile z0 b;
  
  public i5(w4 paramw4) {}
  
  public final void g(b paramb)
  {
    j.d("MeasurementServiceConnection.onConnectionFailed");
    a1 locala1 = c.b).q;
    if ((locala1 == null) || (!c)) {
      locala1 = null;
    }
    if (locala1 != null) {
      r.c("Service connection failed", paramb);
    }
    try
    {
      a = false;
      b = null;
      c.zzl().u(new j5(this, 0));
      return;
    }
    finally {}
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    j.d("MeasurementServiceConnection.onServiceConnected");
    if (paramIBinder == null) {
      try
      {
        a = false;
        c.zzj().o.b("Service connected with null binder");
        return;
      }
      finally
      {
        break label236;
      }
    }
    IInterface localIInterface = null;
    e2 locale2 = null;
    paramComponentName = locale2;
    try
    {
      String str = paramIBinder.getInterfaceDescriptor();
      paramComponentName = locale2;
      if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(str))
      {
        paramComponentName = locale2;
        localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        paramComponentName = locale2;
        if ((localIInterface instanceof n0))
        {
          paramComponentName = locale2;
          paramIBinder = (n0)localIInterface;
        }
        else
        {
          paramComponentName = locale2;
          paramIBinder = new q0(paramIBinder);
        }
        paramComponentName = paramIBinder;
        c.zzj().w.b("Bound to IMeasurementService interface");
        paramComponentName = paramIBinder;
      }
      else
      {
        paramComponentName = locale2;
        c.zzj().o.c("Got binder with a wrong descriptor", str);
        paramComponentName = localIInterface;
      }
    }
    catch (RemoteException paramIBinder)
    {
      c.zzj().o.b("Service connect failed to get IMeasurementService");
    }
    if (paramComponentName == null) {
      a = false;
    }
    try
    {
      a.b().c(c.zza(), c.d);
    }
    catch (IllegalArgumentException paramComponentName)
    {
      for (;;) {}
    }
    locale2 = c.zzl();
    paramIBinder = new i6/t;
    paramIBinder.<init>(3, this, paramComponentName);
    locale2.u(paramIBinder);
    return;
    label236:
    throw paramComponentName;
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    j.d("MeasurementServiceConnection.onServiceDisconnected");
    c.zzj().v.b("Service disconnected");
    c.zzl().u(new s2(4, this, paramComponentName));
  }
  
  public final void r(int paramInt)
  {
    j.d("MeasurementServiceConnection.onConnectionSuspended");
    c.zzj().v.b("Service connection suspended");
    c.zzl().u(new i6.q(this, 4));
  }
  
  /* Error */
  public final void s(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: ldc -72
    //   2: invokestatic 34	m6/j:d	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 66	e7/i5:b	Le7/z0;
    //   11: invokestatic 188	m6/j:i	(Ljava/lang/Object;)V
    //   14: aload_0
    //   15: getfield 66	e7/i5:b	Le7/z0;
    //   18: invokevirtual 194	com/google/android/gms/common/internal/a:getService	()Landroid/os/IInterface;
    //   21: checkcast 120	e7/n0
    //   24: astore_2
    //   25: aload_0
    //   26: getfield 20	e7/i5:c	Le7/w4;
    //   29: invokevirtual 70	d2/q:zzl	()Le7/e2;
    //   32: astore_1
    //   33: new 196	l6/q0
    //   36: astore_3
    //   37: aload_3
    //   38: iconst_4
    //   39: aload_0
    //   40: aload_2
    //   41: invokespecial 197	l6/q0:<init>	(ILjava/lang/Object;Ljava/lang/Object;)V
    //   44: aload_1
    //   45: aload_3
    //   46: invokevirtual 81	e7/e2:u	(Ljava/lang/Runnable;)V
    //   49: goto +18 -> 67
    //   52: astore_1
    //   53: goto +17 -> 70
    //   56: astore_1
    //   57: aload_0
    //   58: aconst_null
    //   59: putfield 66	e7/i5:b	Le7/z0;
    //   62: aload_0
    //   63: iconst_0
    //   64: putfield 64	e7/i5:a	Z
    //   67: aload_0
    //   68: monitorexit
    //   69: return
    //   70: aload_0
    //   71: monitorexit
    //   72: aload_1
    //   73: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	i5
    //   0	74	1	paramBundle	android.os.Bundle
    //   24	17	2	localn0	n0
    //   36	10	3	localq0	l6.q0
    // Exception table:
    //   from	to	target	type
    //   7	49	52	finally
    //   57	67	52	finally
    //   67	69	52	finally
    //   70	72	52	finally
    //   7	49	56	android/os/DeadObjectException
    //   7	49	56	java/lang/IllegalStateException
  }
}

/* Location:
 * Qualified Name:     e7.i5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */