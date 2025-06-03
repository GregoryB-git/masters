package a0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import b.b;
import java.util.ArrayList;
import java.util.Iterator;
import t.h;

public class d$n
{
  public d$n(d paramd) {}
  
  public void a(final String paramString, final IBinder paramIBinder, final Bundle paramBundle, final d.o paramo)
  {
    a.u.a(new c(paramo, paramString, paramIBinder, paramBundle));
  }
  
  public void b(final String paramString, final int paramInt1, final int paramInt2, final Bundle paramBundle, final d.o paramo)
  {
    if (a.d(paramString, paramInt2))
    {
      a.u.a(new a(paramo, paramString, paramInt1, paramInt2, paramBundle));
      return;
    }
    paramBundle = new StringBuilder();
    paramBundle.append("Package/uid mismatch: uid=");
    paramBundle.append(paramInt2);
    paramBundle.append(" package=");
    paramBundle.append(paramString);
    throw new IllegalArgumentException(paramBundle.toString());
  }
  
  public void c(final d.o paramo)
  {
    a.u.a(new b(paramo));
  }
  
  public void d(final String paramString, final b paramb, final d.o paramo)
  {
    if ((!TextUtils.isEmpty(paramString)) && (paramb != null)) {
      a.u.a(new e(paramo, paramString, paramb));
    }
  }
  
  public void e(final d.o paramo, final String paramString, final int paramInt1, final int paramInt2, final Bundle paramBundle)
  {
    a.u.a(new f(paramo, paramInt2, paramString, paramInt1, paramBundle));
  }
  
  public void f(final String paramString, final IBinder paramIBinder, final d.o paramo)
  {
    a.u.a(new d(paramo, paramString, paramIBinder));
  }
  
  public void g(final String paramString, final Bundle paramBundle, final b paramb, final d.o paramo)
  {
    if ((!TextUtils.isEmpty(paramString)) && (paramb != null)) {
      a.u.a(new h(paramo, paramString, paramBundle, paramb));
    }
  }
  
  public void h(final String paramString, final Bundle paramBundle, final b paramb, final d.o paramo)
  {
    if ((!TextUtils.isEmpty(paramString)) && (paramb != null)) {
      a.u.a(new i(paramo, paramString, paramBundle, paramb));
    }
  }
  
  public void i(final d.o paramo)
  {
    a.u.a(new g(paramo));
  }
  
  public class a
    implements Runnable
  {
    public a(d.o paramo, String paramString, int paramInt1, int paramInt2, Bundle paramBundle) {}
    
    public void run()
    {
      Object localObject1 = paramo.asBinder();
      a.s.remove(localObject1);
      d.f localf = new d.f(a, paramString, paramInt1, paramInt2, paramBundle, paramo);
      Object localObject2 = a;
      t = localf;
      localObject2 = ((d)localObject2).g(paramString, paramInt2, paramBundle);
      h = ((d.e)localObject2);
      d locald = a;
      t = null;
      StringBuilder localStringBuilder1;
      if (localObject2 == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("No root for client ");
        ((StringBuilder)localObject1).append(paramString);
        ((StringBuilder)localObject1).append(" from service ");
        ((StringBuilder)localObject1).append(getClass().getName());
        Log.i("MBServiceCompat", ((StringBuilder)localObject1).toString());
        try
        {
          paramo.a();
        }
        catch (RemoteException localRemoteException1)
        {
          localStringBuilder1 = new StringBuilder();
          localStringBuilder1.append("Calling onConnectFailed() failed. Ignoring. pkg=");
          localStringBuilder1.append(paramString);
          Log.w("MBServiceCompat", localStringBuilder1.toString());
        }
      }
      else
      {
        try
        {
          s.put(localStringBuilder1, localf);
          localStringBuilder1.linkToDeath(localf, 0);
          if (a.v != null) {
            paramo.b(h.d(), a.v, h.c());
          }
        }
        catch (RemoteException localRemoteException2)
        {
          StringBuilder localStringBuilder2 = new StringBuilder();
          localStringBuilder2.append("Calling onConnect() failed. Dropping client. pkg=");
          localStringBuilder2.append(paramString);
          Log.w("MBServiceCompat", localStringBuilder2.toString());
          a.s.remove(localStringBuilder1);
        }
      }
    }
  }
  
  public class b
    implements Runnable
  {
    public b(d.o paramo) {}
    
    public void run()
    {
      Object localObject = paramo.asBinder();
      localObject = (d.f)a.s.remove(localObject);
      if (localObject != null) {
        f.asBinder().unlinkToDeath((IBinder.DeathRecipient)localObject, 0);
      }
    }
  }
  
  public class c
    implements Runnable
  {
    public c(d.o paramo, String paramString, IBinder paramIBinder, Bundle paramBundle) {}
    
    public void run()
    {
      Object localObject = paramo.asBinder();
      localObject = (d.f)a.s.get(localObject);
      if (localObject == null)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("addSubscription for callback that isn't registered id=");
        ((StringBuilder)localObject).append(paramString);
        Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
        return;
      }
      a.a(paramString, (d.f)localObject, paramIBinder, paramBundle);
    }
  }
  
  public class d
    implements Runnable
  {
    public d(d.o paramo, String paramString, IBinder paramIBinder) {}
    
    public void run()
    {
      Object localObject = paramo.asBinder();
      localObject = (d.f)a.s.get(localObject);
      if (localObject == null)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("removeSubscription for callback that isn't registered id=");
        ((StringBuilder)localObject).append(paramString);
        Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
        return;
      }
      if (!a.r(paramString, (d.f)localObject, paramIBinder))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("removeSubscription called for ");
        ((StringBuilder)localObject).append(paramString);
        ((StringBuilder)localObject).append(" which is not subscribed");
        Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
      }
    }
  }
  
  public class e
    implements Runnable
  {
    public e(d.o paramo, String paramString, b paramb) {}
    
    public void run()
    {
      Object localObject = paramo.asBinder();
      localObject = (d.f)a.s.get(localObject);
      if (localObject == null)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("getMediaItem for callback that isn't registered id=");
        ((StringBuilder)localObject).append(paramString);
        Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
        return;
      }
      a.p(paramString, (d.f)localObject, paramb);
    }
  }
  
  public class f
    implements Runnable
  {
    public f(d.o paramo, int paramInt1, String paramString, int paramInt2, Bundle paramBundle) {}
    
    public void run()
    {
      IBinder localIBinder = paramo.asBinder();
      a.s.remove(localIBinder);
      Iterator localIterator = a.r.iterator();
      Object localObject1;
      d.f localf;
      do
      {
        boolean bool = localIterator.hasNext();
        localObject1 = null;
        localObject2 = null;
        if (!bool) {
          break;
        }
        localf = (d.f)localIterator.next();
      } while (c != paramInt2);
      if (!TextUtils.isEmpty(paramString))
      {
        localObject1 = localObject2;
        if (paramInt1 > 0) {}
      }
      else
      {
        localObject1 = new d.f(a, a, b, c, paramBundle, paramo);
      }
      localIterator.remove();
      Object localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = new d.f(a, paramString, paramInt1, paramInt2, paramBundle, paramo);
      }
      a.s.put(localIBinder, localObject2);
      try
      {
        localIBinder.linkToDeath((IBinder.DeathRecipient)localObject2, 0);
      }
      catch (RemoteException localRemoteException)
      {
        Log.w("MBServiceCompat", "IBinder is already dead.");
      }
    }
  }
  
  public class g
    implements Runnable
  {
    public g(d.o paramo) {}
    
    public void run()
    {
      IBinder localIBinder = paramo.asBinder();
      d.f localf = (d.f)a.s.remove(localIBinder);
      if (localf != null) {
        localIBinder.unlinkToDeath(localf, 0);
      }
    }
  }
  
  public class h
    implements Runnable
  {
    public h(d.o paramo, String paramString, Bundle paramBundle, b paramb) {}
    
    public void run()
    {
      Object localObject = paramo.asBinder();
      localObject = (d.f)a.s.get(localObject);
      if (localObject == null)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("search for callback that isn't registered query=");
        ((StringBuilder)localObject).append(paramString);
        Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
        return;
      }
      a.q(paramString, paramBundle, (d.f)localObject, paramb);
    }
  }
  
  public class i
    implements Runnable
  {
    public i(d.o paramo, String paramString, Bundle paramBundle, b paramb) {}
    
    public void run()
    {
      Object localObject = paramo.asBinder();
      localObject = (d.f)a.s.get(localObject);
      if (localObject == null)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("sendCustomAction for callback that isn't registered action=");
        ((StringBuilder)localObject).append(paramString);
        ((StringBuilder)localObject).append(", extras=");
        ((StringBuilder)localObject).append(paramBundle);
        Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
        return;
      }
      a.n(paramString, paramBundle, (d.f)localObject, paramb);
    }
  }
}

/* Location:
 * Qualified Name:     a0.d.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */