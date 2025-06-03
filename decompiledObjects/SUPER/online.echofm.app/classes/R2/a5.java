package R2;

import A2.c;
import A2.c.a;
import A2.c.b;
import A2.n;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;

public final class a5
  implements ServiceConnection, c.a, c.b
{
  public volatile boolean a;
  public volatile Z1 b;
  
  public a5(D4 paramD4) {}
  
  public final void a()
  {
    c.n();
    Context localContext1 = c.a();
    label148:
    try
    {
      if (a)
      {
        c.j().K().a("Connection attempt already in progress");
        return;
      }
    }
    finally
    {
      break label148;
      if ((b != null) && ((b.i()) || (b.a())))
      {
        c.j().K().a("Already awaiting connection attempt");
        return;
      }
      Z1 localZ1 = new R2/Z1;
      localZ1.<init>(localContext2, Looper.getMainLooper(), this, this);
      b = localZ1;
      c.j().K().a("Connecting to remote service");
      a = true;
      n.i(b);
      b.q();
      return;
    }
  }
  
  public final void c(Intent paramIntent)
  {
    c.n();
    Context localContext = c.a();
    D2.b localb = D2.b.b();
    label90:
    try
    {
      if (a)
      {
        c.j().K().a("Connection attempt already in progress");
        return;
      }
    }
    finally
    {
      break label90;
      c.j().K().a("Using local app measurement service");
      a = true;
      localb.a(localContext, paramIntent, D4.i0(c), 129);
      return;
    }
  }
  
  public final void d()
  {
    if ((b != null) && ((b.a()) || (b.i()))) {
      b.c();
    }
    b = null;
  }
  
  public final void n(int paramInt)
  {
    n.d("MeasurementServiceConnection.onConnectionSuspended");
    c.j().F().a("Service connection suspended");
    c.e().D(new e5(this));
  }
  
  public final void o(x2.b paramb)
  {
    n.d("MeasurementServiceConnection.onConnectionFailed");
    Y1 localY1 = c.a.E();
    if (localY1 != null) {
      localY1.L().b("Service connection failed", paramb);
    }
    try
    {
      a = false;
      b = null;
      c.e().D(new d5(this));
      return;
    }
    finally {}
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    n.d("MeasurementServiceConnection.onServiceConnected");
    if (paramIBinder == null) {
      try
      {
        a = false;
        c.j().G().a("Service connected with null binder");
        return;
      }
      finally
      {
        break label238;
      }
    }
    IInterface localIInterface = null;
    G2 localG2 = null;
    paramComponentName = localG2;
    try
    {
      String str = paramIBinder.getInterfaceDescriptor();
      paramComponentName = localG2;
      if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(str))
      {
        paramComponentName = localG2;
        localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        paramComponentName = localG2;
        if ((localIInterface instanceof R1)) {
          paramComponentName = localG2;
        }
        for (paramIBinder = (R1)localIInterface;; paramIBinder = new T1(paramIBinder))
        {
          break;
          paramComponentName = localG2;
        }
        paramComponentName = paramIBinder;
        c.j().K().a("Bound to IMeasurementService interface");
        paramComponentName = paramIBinder;
      }
      else
      {
        paramComponentName = localG2;
        c.j().G().b("Got binder with a wrong descriptor", str);
        paramComponentName = localIInterface;
      }
    }
    catch (RemoteException paramIBinder)
    {
      c.j().G().a("Service connect failed to get IMeasurementService");
    }
    if (paramComponentName == null) {
      a = false;
    }
    try
    {
      D2.b.b().c(c.a(), D4.i0(c));
    }
    catch (IllegalArgumentException paramComponentName)
    {
      for (;;) {}
    }
    localG2 = c.e();
    paramIBinder = new R2/Z4;
    paramIBinder.<init>(this, paramComponentName);
    localG2.D(paramIBinder);
    return;
    label238:
    throw paramComponentName;
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    n.d("MeasurementServiceConnection.onServiceDisconnected");
    c.j().F().a("Service disconnected");
    c.e().D(new c5(this, paramComponentName));
  }
  
  /* Error */
  public final void v(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: ldc -32
    //   2: invokestatic 110	A2/n:d	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 54	R2/a5:b	LR2/Z1;
    //   11: invokestatic 82	A2/n:i	(Ljava/lang/Object;)Ljava/lang/Object;
    //   14: pop
    //   15: aload_0
    //   16: getfield 54	R2/a5:b	LR2/Z1;
    //   19: invokevirtual 227	A2/c:D	()Landroid/os/IInterface;
    //   22: checkcast 186	R2/R1
    //   25: astore_2
    //   26: aload_0
    //   27: getfield 20	R2/a5:c	LR2/D4;
    //   30: invokevirtual 119	R2/m3:e	()LR2/G2;
    //   33: astore_3
    //   34: new 229	R2/b5
    //   37: astore_1
    //   38: aload_1
    //   39: aload_0
    //   40: aload_2
    //   41: invokespecial 230	R2/b5:<init>	(LR2/a5;LR2/R1;)V
    //   44: aload_3
    //   45: aload_1
    //   46: invokevirtual 130	R2/G2:D	(Ljava/lang/Runnable;)V
    //   49: goto +18 -> 67
    //   52: astore_1
    //   53: goto +17 -> 70
    //   56: astore_1
    //   57: aload_0
    //   58: aconst_null
    //   59: putfield 54	R2/a5:b	LR2/Z1;
    //   62: aload_0
    //   63: iconst_0
    //   64: putfield 27	R2/a5:a	Z
    //   67: aload_0
    //   68: monitorexit
    //   69: return
    //   70: aload_0
    //   71: monitorexit
    //   72: aload_1
    //   73: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	this	a5
    //   0	74	1	paramBundle	android.os.Bundle
    //   25	16	2	localR1	R1
    //   33	12	3	localG2	G2
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
 * Qualified Name:     R2.a5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */