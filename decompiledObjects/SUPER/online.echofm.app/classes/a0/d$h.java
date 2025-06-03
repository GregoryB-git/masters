package a0;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.media.session.MediaSession.Token;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.service.media.MediaBrowserService.BrowserRoot;
import android.service.media.MediaBrowserService.Result;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.media.session.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import t.a;
import t.h;

public abstract class d$h
  implements d.g
{
  public final List a = new ArrayList();
  public MediaBrowserService b;
  public Messenger c;
  
  public d$h(d paramd) {}
  
  public IBinder b(Intent paramIntent)
  {
    return b.onBind(paramIntent);
  }
  
  public void c(String paramString, Bundle paramBundle)
  {
    g(paramString, paramBundle);
    e(paramString, paramBundle);
  }
  
  public void d(final MediaSessionCompat.Token paramToken)
  {
    d.u.a(new a(paramToken));
  }
  
  public void e(final String paramString, final Bundle paramBundle)
  {
    d.u.post(new c(paramString, paramBundle));
  }
  
  public void f(d.f paramf, String paramString, Bundle paramBundle)
  {
    Object localObject = (List)g.get(paramString);
    if (localObject != null)
    {
      Iterator localIterator = ((List)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (H.d)localIterator.next();
        if (c.b(paramBundle, (Bundle)b)) {
          d.o(paramString, paramf, (Bundle)b, paramBundle);
        }
      }
    }
  }
  
  public void g(String paramString, Bundle paramBundle)
  {
    b.notifyChildrenChanged(paramString);
  }
  
  public d.e h(String paramString, int paramInt, Bundle paramBundle)
  {
    int i = -1;
    if ((paramBundle != null) && (paramBundle.getInt("extra_client_version", 0) != 0))
    {
      paramBundle.remove("extra_client_version");
      c = new Messenger(d.u);
      localObject1 = new Bundle();
      ((BaseBundle)localObject1).putInt("extra_service_version", 2);
      w.d.b((Bundle)localObject1, "extra_messenger", c.getBinder());
      localObject2 = d.v;
      if (localObject2 != null)
      {
        localObject2 = ((MediaSessionCompat.Token)localObject2).c();
        if (localObject2 == null) {
          localObject2 = null;
        } else {
          localObject2 = ((IInterface)localObject2).asBinder();
        }
        w.d.b((Bundle)localObject1, "extra_session_binder", (IBinder)localObject2);
      }
      else
      {
        a.add(localObject1);
      }
      i = paramBundle.getInt("extra_calling_pid", -1);
      paramBundle.remove("extra_calling_pid");
    }
    for (Object localObject2 = localObject1;; localObject2 = null) {
      break;
    }
    Object localObject1 = new d.f(d, paramString, i, paramInt, paramBundle, null);
    d locald = d;
    t = ((d.f)localObject1);
    paramBundle = locald.g(paramString, paramInt, paramBundle);
    paramString = d;
    t = null;
    if (paramBundle == null) {
      return null;
    }
    if (c != null) {
      r.add(localObject1);
    }
    if (localObject2 == null)
    {
      paramString = paramBundle.c();
    }
    else
    {
      paramString = (String)localObject2;
      if (paramBundle.c() != null)
      {
        ((Bundle)localObject2).putAll(paramBundle.c());
        paramString = (String)localObject2;
      }
    }
    return new d.e(paramBundle.d(), paramString);
  }
  
  public void i(String paramString, final d.m paramm)
  {
    b localb = new b(paramString, paramm);
    paramm = d;
    t = q;
    paramm.h(paramString, localb);
    d.t = null;
  }
  
  public void j(MediaSessionCompat.Token paramToken)
  {
    if (!a.isEmpty())
    {
      b localb = paramToken.c();
      if (localb != null)
      {
        Iterator localIterator = a.iterator();
        while (localIterator.hasNext()) {
          w.d.b((Bundle)localIterator.next(), "extra_session_binder", localb.asBinder());
        }
      }
      a.clear();
    }
    b.setSessionToken((MediaSession.Token)paramToken.e());
  }
  
  public class a
    implements Runnable
  {
    public a(MediaSessionCompat.Token paramToken) {}
    
    public void run()
    {
      j(paramToken);
    }
  }
  
  public class b
    extends d.l
  {
    public b(Object paramObject, d.m paramm)
    {
      super();
    }
    
    public void a()
    {
      paramm.a();
    }
    
    public void h(List paramList)
    {
      if (paramList == null)
      {
        if (Build.VERSION.SDK_INT >= 24) {
          paramList = null;
        } else {
          paramList = Collections.emptyList();
        }
      }
      else
      {
        ArrayList localArrayList = new ArrayList(paramList.size());
        Iterator localIterator = paramList.iterator();
        while (localIterator.hasNext())
        {
          MediaBrowserCompat.MediaItem localMediaItem = (MediaBrowserCompat.MediaItem)localIterator.next();
          paramList = Parcel.obtain();
          localMediaItem.writeToParcel(paramList, 0);
          localArrayList.add(paramList);
        }
        paramList = localArrayList;
      }
      paramm.c(paramList);
    }
  }
  
  public class c
    implements Runnable
  {
    public c(String paramString, Bundle paramBundle) {}
    
    public void run()
    {
      Iterator localIterator = d.s.keySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (IBinder)localIterator.next();
        localObject = (d.f)d.s.get(localObject);
        f((d.f)localObject, paramString, paramBundle);
      }
    }
  }
  
  public abstract class d
    extends MediaBrowserService
  {
    public d(Context paramContext)
    {
      attachBaseContext(paramContext);
    }
    
    public MediaBrowserService.BrowserRoot onGetRoot(String paramString, int paramInt, Bundle paramBundle)
    {
      MediaSessionCompat.a(paramBundle);
      d.h localh = d.h.this;
      Object localObject = null;
      if (paramBundle == null) {
        paramBundle = null;
      } else {
        paramBundle = new Bundle(paramBundle);
      }
      paramString = localh.h(paramString, paramInt, paramBundle);
      if (paramString == null) {
        paramString = (String)localObject;
      } else {
        paramString = new MediaBrowserService.BrowserRoot(d.e.a(paramString), d.e.b(paramString));
      }
      return paramString;
    }
    
    public void onLoadChildren(String paramString, MediaBrowserService.Result paramResult)
    {
      i(paramString, new d.m(paramResult));
    }
  }
}

/* Location:
 * Qualified Name:     a0.d.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */