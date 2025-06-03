package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import b.d;
import ec.i;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p1.e;
import p1.e.c;
import u.a;
import x0.q0;

public final class MultiInstanceInvalidationClient
{
  public final String a;
  public final e b;
  public final Executor c;
  public int d;
  public e.c e;
  public IMultiInstanceInvalidationService f;
  public final callback.1 g;
  public final AtomicBoolean h;
  public final a i;
  public final d j;
  
  public MultiInstanceInvalidationClient(Context paramContext, String paramString, Intent paramIntent, e parame, Executor paramExecutor)
  {
    a = paramString;
    b = parame;
    c = paramExecutor;
    paramContext = paramContext.getApplicationContext();
    g = new IMultiInstanceInvalidationCallback.Stub()
    {
      public final void j0(String[] paramAnonymousArrayOfString)
      {
        i.e(paramAnonymousArrayOfString, "tables");
        MultiInstanceInvalidationClient localMultiInstanceInvalidationClient = a;
        c.execute(new q0(2, localMultiInstanceInvalidationClient, paramAnonymousArrayOfString));
      }
    };
    h = new AtomicBoolean(false);
    paramString = new b(this);
    i = new a(this, 3);
    j = new d(this, 4);
    parame = d.keySet().toArray(new String[0]);
    i.c(parame, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    e = new a(this, (String[])parame);
    paramContext.bindService(paramIntent, paramString, 1);
  }
  
  public static final class a
    extends e.c
  {
    public a(MultiInstanceInvalidationClient paramMultiInstanceInvalidationClient, String[] paramArrayOfString)
    {
      super();
    }
    
    public final void a(Set<String> paramSet)
    {
      i.e(paramSet, "tables");
      if (b.h.get()) {
        return;
      }
      try
      {
        MultiInstanceInvalidationClient localMultiInstanceInvalidationClient = b;
        IMultiInstanceInvalidationService localIMultiInstanceInvalidationService = f;
        if (localIMultiInstanceInvalidationService != null)
        {
          int i = d;
          paramSet = paramSet.toArray(new String[0]);
          i.c(paramSet, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
          localIMultiInstanceInvalidationService.K2(i, (String[])paramSet);
        }
      }
      catch (RemoteException paramSet)
      {
        Log.w("ROOM", "Cannot broadcast invalidation", paramSet);
      }
    }
  }
  
  public static final class b
    implements ServiceConnection
  {
    public b(MultiInstanceInvalidationClient paramMultiInstanceInvalidationClient) {}
    
    public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
    {
      i.e(paramComponentName, "name");
      i.e(paramIBinder, "service");
      a.f = IMultiInstanceInvalidationService.Stub.asInterface(paramIBinder);
      paramComponentName = a;
      c.execute(i);
    }
    
    public final void onServiceDisconnected(ComponentName paramComponentName)
    {
      i.e(paramComponentName, "name");
      paramComponentName = a;
      c.execute(j);
      a.f = null;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.room.MultiInstanceInvalidationClient
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */