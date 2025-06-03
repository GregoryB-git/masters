package a0;

import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.browse.MediaBrowser.MediaItem;
import android.media.session.MediaSession.Token;
import android.os.BaseBundle;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.service.media.MediaBrowserService.BrowserRoot;
import android.service.media.MediaBrowserService.Result;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import t.a;
import t.h;

public abstract class d
  extends Service
{
  public static final boolean w = Log.isLoggable("MBServiceCompat", 3);
  public g o;
  public final n p = new n();
  public final f q = new f("android.media.session.MediaController", -1, -1, null, null);
  public final ArrayList r = new ArrayList();
  public final a s = new a();
  public f t;
  public final q u = new q(this);
  public MediaSessionCompat.Token v;
  
  public void a(String paramString, f paramf, IBinder paramIBinder, Bundle paramBundle)
  {
    Object localObject1 = (List)g.get(paramString);
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = new ArrayList();
    }
    localObject1 = ((List)localObject2).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      H.d locald = (H.d)((Iterator)localObject1).next();
      if ((paramIBinder == a) && (c.a(paramBundle, (Bundle)b))) {
        return;
      }
    }
    ((List)localObject2).add(new H.d(paramIBinder, paramBundle));
    g.put(paramString, localObject2);
    o(paramString, paramf, paramBundle, null);
    t = paramf;
    l(paramString, paramBundle);
    t = null;
  }
  
  public List b(List paramList, Bundle paramBundle)
  {
    if (paramList == null) {
      return null;
    }
    int i = paramBundle.getInt("android.media.browse.extra.PAGE", -1);
    int j = paramBundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
    if ((i == -1) && (j == -1)) {
      return paramList;
    }
    int k = j * i;
    int m = k + j;
    if ((i >= 0) && (j >= 1) && (k < paramList.size()))
    {
      j = m;
      if (m > paramList.size()) {
        j = paramList.size();
      }
      return paramList.subList(k, j);
    }
    return Collections.emptyList();
  }
  
  public void c(Message paramMessage)
  {
    Object localObject = paramMessage.getData();
    Bundle localBundle;
    switch (what)
    {
    default: 
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Unhandled message: ");
      ((StringBuilder)localObject).append(paramMessage);
      ((StringBuilder)localObject).append("\n  Service version: ");
      ((StringBuilder)localObject).append(2);
      ((StringBuilder)localObject).append("\n  Client version: ");
      ((StringBuilder)localObject).append(arg1);
      Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
      break;
    case 9: 
      localBundle = ((Bundle)localObject).getBundle("data_custom_action_extras");
      MediaSessionCompat.a(localBundle);
      p.h(((BaseBundle)localObject).getString("data_custom_action"), localBundle, (b.b)((Bundle)localObject).getParcelable("data_result_receiver"), new p(replyTo));
      break;
    case 8: 
      localBundle = ((Bundle)localObject).getBundle("data_search_extras");
      MediaSessionCompat.a(localBundle);
      p.g(((BaseBundle)localObject).getString("data_search_query"), localBundle, (b.b)((Bundle)localObject).getParcelable("data_result_receiver"), new p(replyTo));
      break;
    case 7: 
      p.i(new p(replyTo));
      break;
    case 6: 
      localBundle = ((Bundle)localObject).getBundle("data_root_hints");
      MediaSessionCompat.a(localBundle);
      p.e(new p(replyTo), ((BaseBundle)localObject).getString("data_package_name"), ((BaseBundle)localObject).getInt("data_calling_pid"), ((BaseBundle)localObject).getInt("data_calling_uid"), localBundle);
      break;
    case 5: 
      p.d(((BaseBundle)localObject).getString("data_media_item_id"), (b.b)((Bundle)localObject).getParcelable("data_result_receiver"), new p(replyTo));
      break;
    case 4: 
      p.f(((BaseBundle)localObject).getString("data_media_item_id"), w.d.a((Bundle)localObject, "data_callback_token"), new p(replyTo));
      break;
    case 3: 
      localBundle = ((Bundle)localObject).getBundle("data_options");
      MediaSessionCompat.a(localBundle);
      p.a(((BaseBundle)localObject).getString("data_media_item_id"), w.d.a((Bundle)localObject, "data_callback_token"), localBundle, new p(replyTo));
      break;
    case 2: 
      p.c(new p(replyTo));
      break;
    case 1: 
      localBundle = ((Bundle)localObject).getBundle("data_root_hints");
      MediaSessionCompat.a(localBundle);
      p.b(((BaseBundle)localObject).getString("data_package_name"), ((BaseBundle)localObject).getInt("data_calling_pid"), ((BaseBundle)localObject).getInt("data_calling_uid"), localBundle, new p(replyTo));
    }
  }
  
  public boolean d(String paramString, int paramInt)
  {
    if (paramString == null) {
      return false;
    }
    String[] arrayOfString = getPackageManager().getPackagesForUid(paramInt);
    int i = arrayOfString.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      if (arrayOfString[paramInt].equals(paramString)) {
        return true;
      }
    }
    return false;
  }
  
  public void dump(FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {}
  
  public void e(String paramString, Bundle paramBundle)
  {
    if (paramString != null)
    {
      if (paramBundle != null)
      {
        o.c(paramString, paramBundle);
        return;
      }
      throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
    }
    throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
  }
  
  public void f(String paramString, Bundle paramBundle, l paraml)
  {
    paraml.f(null);
  }
  
  public abstract e g(String paramString, int paramInt, Bundle paramBundle);
  
  public abstract void h(String paramString, l paraml);
  
  public abstract void i(String paramString, l paraml, Bundle paramBundle);
  
  public abstract void j(String paramString, l paraml);
  
  public abstract void k(String paramString, Bundle paramBundle, l paraml);
  
  public void l(String paramString, Bundle paramBundle) {}
  
  public void m(String paramString) {}
  
  public void n(String paramString, Bundle paramBundle, f paramf, final b.b paramb)
  {
    paramb = new d(paramString, paramb);
    t = paramf;
    f(paramString, paramBundle, paramb);
    t = null;
    if (paramb.c()) {
      return;
    }
    paramf = new StringBuilder();
    paramf.append("onCustomAction must call detach() or sendResult() or sendError() before returning for action=");
    paramf.append(paramString);
    paramf.append(" extras=");
    paramf.append(paramBundle);
    throw new IllegalStateException(paramf.toString());
  }
  
  public void o(final String paramString, final f paramf, final Bundle paramBundle1, final Bundle paramBundle2)
  {
    paramBundle2 = new a(paramString, paramf, paramString, paramBundle1, paramBundle2);
    t = paramf;
    if (paramBundle1 == null) {
      h(paramString, paramBundle2);
    } else {
      i(paramString, paramBundle2, paramBundle1);
    }
    t = null;
    if (paramBundle2.c()) {
      return;
    }
    paramBundle1 = new StringBuilder();
    paramBundle1.append("onLoadChildren must call detach() or sendResult() before returning for package=");
    paramBundle1.append(a);
    paramBundle1.append(" id=");
    paramBundle1.append(paramString);
    throw new IllegalStateException(paramBundle1.toString());
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return o.b(paramIntent);
  }
  
  public void onCreate()
  {
    super.onCreate();
    int i = Build.VERSION.SDK_INT;
    Object localObject;
    if (i >= 28) {
      localObject = new k();
    }
    for (;;)
    {
      o = ((g)localObject);
      break;
      if (i >= 26) {
        localObject = new j();
      } else {
        localObject = new i();
      }
    }
    o.a();
  }
  
  public void onDestroy()
  {
    u.b();
  }
  
  public void p(String paramString, f paramf, final b.b paramb)
  {
    paramb = new b(paramString, paramb);
    t = paramf;
    j(paramString, paramb);
    t = null;
    if (paramb.c()) {
      return;
    }
    paramf = new StringBuilder();
    paramf.append("onLoadItem must call detach() or sendResult() before returning for id=");
    paramf.append(paramString);
    throw new IllegalStateException(paramf.toString());
  }
  
  public void q(String paramString, Bundle paramBundle, f paramf, final b.b paramb)
  {
    paramb = new c(paramString, paramb);
    t = paramf;
    k(paramString, paramBundle, paramb);
    t = null;
    if (paramb.c()) {
      return;
    }
    paramBundle = new StringBuilder();
    paramBundle.append("onSearch must call detach() or sendResult() before returning for query=");
    paramBundle.append(paramString);
    throw new IllegalStateException(paramBundle.toString());
  }
  
  public boolean r(String paramString, f paramf, IBinder paramIBinder)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    if (paramIBinder == null) {}
    for (;;)
    {
      try
      {
        paramIBinder = g.remove(paramString);
        if (paramIBinder != null) {
          bool2 = true;
        }
        t = paramf;
        m(paramString);
        t = null;
        return bool2;
      }
      finally
      {
        break;
      }
      List localList = (List)g.get(paramString);
      if (localList != null)
      {
        Iterator localIterator = localList.iterator();
        while (localIterator.hasNext()) {
          if (paramIBinder == nexta)
          {
            localIterator.remove();
            bool1 = true;
          }
        }
        bool2 = bool1;
        if (localList.size() == 0)
        {
          g.remove(paramString);
          bool2 = bool1;
        }
      }
    }
    t = paramf;
    m(paramString);
    t = null;
    throw paramIBinder;
  }
  
  public void s(MediaSessionCompat.Token paramToken)
  {
    if (paramToken != null)
    {
      if (v == null)
      {
        v = paramToken;
        o.d(paramToken);
        return;
      }
      throw new IllegalStateException("The session token has already been set");
    }
    throw new IllegalArgumentException("Session token may not be null");
  }
  
  public class a
    extends d.l
  {
    public a(Object paramObject, d.f paramf, String paramString, Bundle paramBundle1, Bundle paramBundle2)
    {
      super();
    }
    
    public void h(List paramList)
    {
      if (s.get(paramff.asBinder()) != paramf)
      {
        if (d.w)
        {
          paramList = new StringBuilder();
          paramList.append("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
          paramList.append(paramfa);
          paramList.append(" id=");
          paramList.append(paramString);
          Log.d("MBServiceCompat", paramList.toString());
        }
        return;
      }
      List localList = paramList;
      if ((b() & 0x1) != 0) {
        localList = b(paramList, paramBundle1);
      }
      try
      {
        paramff.c(paramString, localList, paramBundle1, paramBundle2);
      }
      catch (RemoteException paramList)
      {
        paramList = new StringBuilder();
        paramList.append("Calling onLoadChildren() failed for id=");
        paramList.append(paramString);
        paramList.append(" package=");
        paramList.append(paramfa);
        Log.w("MBServiceCompat", paramList.toString());
      }
    }
  }
  
  public class b
    extends d.l
  {
    public b(Object paramObject, b.b paramb)
    {
      super();
    }
    
    public void h(MediaBrowserCompat.MediaItem paramMediaItem)
    {
      if ((b() & 0x2) != 0)
      {
        paramb.b(-1, null);
        return;
      }
      Bundle localBundle = new Bundle();
      localBundle.putParcelable("media_item", paramMediaItem);
      paramb.b(0, localBundle);
    }
  }
  
  public class c
    extends d.l
  {
    public c(Object paramObject, b.b paramb)
    {
      super();
    }
    
    public void h(List paramList)
    {
      if (((b() & 0x4) == 0) && (paramList != null))
      {
        Bundle localBundle = new Bundle();
        localBundle.putParcelableArray("search_results", (Parcelable[])paramList.toArray(new MediaBrowserCompat.MediaItem[0]));
        paramb.b(0, localBundle);
        return;
      }
      paramb.b(-1, null);
    }
  }
  
  public class d
    extends d.l
  {
    public d(Object paramObject, b.b paramb)
    {
      super();
    }
    
    public void d(Bundle paramBundle)
    {
      paramb.b(-1, paramBundle);
    }
    
    public void h(Bundle paramBundle)
    {
      paramb.b(0, paramBundle);
    }
  }
  
  public static final class e
  {
    public final String a;
    public final Bundle b;
    
    public e(String paramString, Bundle paramBundle)
    {
      if (paramString != null)
      {
        a = paramString;
        b = paramBundle;
        return;
      }
      throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
    }
    
    public Bundle c()
    {
      return b;
    }
    
    public String d()
    {
      return a;
    }
  }
  
  public class f
    implements IBinder.DeathRecipient
  {
    public final String a;
    public final int b;
    public final int c;
    public final f d;
    public final Bundle e;
    public final d.o f;
    public final HashMap g = new HashMap();
    public d.e h;
    
    public f(String paramString, int paramInt1, int paramInt2, Bundle paramBundle, d.o paramo)
    {
      a = paramString;
      b = paramInt1;
      c = paramInt2;
      d = new f(paramString, paramInt1, paramInt2);
      e = paramBundle;
      f = paramo;
    }
    
    public void binderDied()
    {
      u.post(new a());
    }
    
    public class a
      implements Runnable
    {
      public a() {}
      
      public void run()
      {
        d.f localf = d.f.this;
        i.s.remove(f.asBinder());
      }
    }
  }
  
  public static abstract interface g
  {
    public abstract void a();
    
    public abstract IBinder b(Intent paramIntent);
    
    public abstract void c(String paramString, Bundle paramBundle);
    
    public abstract void d(MediaSessionCompat.Token paramToken);
  }
  
  public abstract class h
    implements d.g
  {
    public final List a = new ArrayList();
    public MediaBrowserService b;
    public Messenger c;
    
    public h() {}
    
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
      u.a(new a(paramToken));
    }
    
    public void e(final String paramString, final Bundle paramBundle)
    {
      u.post(new c(paramString, paramBundle));
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
            o(paramString, paramf, (Bundle)b, paramBundle);
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
        c = new Messenger(u);
        localObject1 = new Bundle();
        ((BaseBundle)localObject1).putInt("extra_service_version", 2);
        w.d.b((Bundle)localObject1, "extra_messenger", c.getBinder());
        localObject2 = v;
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
      Object localObject1 = new d.f(d.this, paramString, i, paramInt, paramBundle, null);
      d locald = d.this;
      t = ((d.f)localObject1);
      paramBundle = locald.g(paramString, paramInt, paramBundle);
      paramString = d.this;
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
      paramm = d.this;
      t = q;
      paramm.h(paramString, localb);
      t = null;
    }
    
    public void j(MediaSessionCompat.Token paramToken)
    {
      if (!a.isEmpty())
      {
        android.support.v4.media.session.b localb = paramToken.c();
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
        Iterator localIterator = s.keySet().iterator();
        while (localIterator.hasNext())
        {
          Object localObject = (IBinder)localIterator.next();
          localObject = (d.f)s.get(localObject);
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
  
  public class i
    extends d.h
  {
    public i()
    {
      super();
    }
    
    public void a()
    {
      b localb = new b(d.this);
      b = localb;
      localb.onCreate();
    }
    
    public void k(String paramString, final d.m paramm)
    {
      paramm = new a(paramString, paramm);
      d locald = d.this;
      t = q;
      locald.j(paramString, paramm);
      t = null;
    }
    
    public class a
      extends d.l
    {
      public a(Object paramObject, d.m paramm)
      {
        super();
      }
      
      public void a()
      {
        paramm.a();
      }
      
      public void h(MediaBrowserCompat.MediaItem paramMediaItem)
      {
        Object localObject;
        if (paramMediaItem == null)
        {
          localObject = paramm;
          paramMediaItem = null;
        }
        for (;;)
        {
          ((d.m)localObject).c(paramMediaItem);
          break;
          localObject = Parcel.obtain();
          paramMediaItem.writeToParcel((Parcel)localObject, 0);
          d.m localm = paramm;
          paramMediaItem = (MediaBrowserCompat.MediaItem)localObject;
          localObject = localm;
        }
      }
    }
    
    public class b
      extends d.h.d
    {
      public b(Context paramContext)
      {
        super(paramContext);
      }
      
      public void onLoadItem(String paramString, MediaBrowserService.Result paramResult)
      {
        k(paramString, new d.m(paramResult));
      }
    }
  }
  
  public class j
    extends d.i
  {
    public j()
    {
      super();
    }
    
    public void a()
    {
      b localb = new b(d.this);
      b = localb;
      localb.onCreate();
    }
    
    public void g(String paramString, Bundle paramBundle)
    {
      if (paramBundle != null) {
        e.a(b, paramString, paramBundle);
      } else {
        super.g(paramString, paramBundle);
      }
    }
    
    public void l(String paramString, final d.m paramm, final Bundle paramBundle)
    {
      a locala = new a(paramString, paramm, paramBundle);
      paramm = d.this;
      t = q;
      paramm.i(paramString, locala, paramBundle);
      t = null;
    }
    
    public class a
      extends d.l
    {
      public a(Object paramObject, d.m paramm, Bundle paramBundle)
      {
        super();
      }
      
      public void a()
      {
        paramm.a();
      }
      
      public void h(List paramList)
      {
        Object localObject1;
        if (paramList == null)
        {
          paramList = paramm;
          localObject1 = null;
        }
        for (;;)
        {
          paramList.c(localObject1);
          return;
          localObject1 = paramList;
          if ((b() & 0x1) != 0) {
            localObject1 = b(paramList, paramBundle);
          }
          paramList = new ArrayList(((List)localObject1).size());
          Object localObject2 = ((List)localObject1).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject1 = (MediaBrowserCompat.MediaItem)((Iterator)localObject2).next();
            Parcel localParcel = Parcel.obtain();
            ((MediaBrowserCompat.MediaItem)localObject1).writeToParcel(localParcel, 0);
            paramList.add(localParcel);
          }
          localObject2 = paramm;
          localObject1 = paramList;
          paramList = (List)localObject2;
        }
      }
    }
    
    public class b
      extends d.i.b
    {
      public b(Context paramContext)
      {
        super(paramContext);
      }
      
      public void onLoadChildren(String paramString, MediaBrowserService.Result paramResult, Bundle paramBundle)
      {
        MediaSessionCompat.a(paramBundle);
        d.j localj = d.j.this;
        d locald = f;
        t = q;
        localj.l(paramString, new d.m(paramResult), paramBundle);
        t = null;
      }
    }
  }
  
  public class k
    extends d.j
  {
    public k()
    {
      super();
    }
  }
  
  public static abstract class l
  {
    public final Object a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    
    public l(Object paramObject)
    {
      a = paramObject;
    }
    
    public void a()
    {
      if (!b)
      {
        if (!c)
        {
          if (!d)
          {
            b = true;
            return;
          }
          localStringBuilder = new StringBuilder();
          localStringBuilder.append("detach() called when sendError() had already been called for: ");
          localStringBuilder.append(a);
          throw new IllegalStateException(localStringBuilder.toString());
        }
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("detach() called when sendResult() had already been called for: ");
        localStringBuilder.append(a);
        throw new IllegalStateException(localStringBuilder.toString());
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("detach() called when detach() had already been called for: ");
      localStringBuilder.append(a);
      throw new IllegalStateException(localStringBuilder.toString());
    }
    
    public int b()
    {
      return e;
    }
    
    public boolean c()
    {
      boolean bool;
      if ((!b) && (!c) && (!d)) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public void d(Bundle paramBundle)
    {
      paramBundle = new StringBuilder();
      paramBundle.append("It is not supported to send an error for ");
      paramBundle.append(a);
      throw new UnsupportedOperationException(paramBundle.toString());
    }
    
    public abstract void e(Object paramObject);
    
    public void f(Bundle paramBundle)
    {
      if ((!c) && (!d))
      {
        d = true;
        d(paramBundle);
        return;
      }
      paramBundle = new StringBuilder();
      paramBundle.append("sendError() called when either sendResult() or sendError() had already been called for: ");
      paramBundle.append(a);
      throw new IllegalStateException(paramBundle.toString());
    }
    
    public void g(Object paramObject)
    {
      if ((!c) && (!d))
      {
        c = true;
        e(paramObject);
        return;
      }
      paramObject = new StringBuilder();
      ((StringBuilder)paramObject).append("sendResult() called when either sendResult() or sendError() had already been called for: ");
      ((StringBuilder)paramObject).append(a);
      throw new IllegalStateException(((StringBuilder)paramObject).toString());
    }
  }
  
  public static class m
  {
    public MediaBrowserService.Result a;
    
    public m(MediaBrowserService.Result paramResult)
    {
      a = paramResult;
    }
    
    public void a()
    {
      a.detach();
    }
    
    public List b(List paramList)
    {
      if (paramList == null) {
        return null;
      }
      ArrayList localArrayList = new ArrayList(paramList.size());
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        paramList = (Parcel)localIterator.next();
        paramList.setDataPosition(0);
        localArrayList.add((MediaBrowser.MediaItem)MediaBrowser.MediaItem.CREATOR.createFromParcel(paramList));
        paramList.recycle();
      }
      return localArrayList;
    }
    
    public void c(Object paramObject)
    {
      if ((paramObject instanceof List))
      {
        a.sendResult(b((List)paramObject));
      }
      else if ((paramObject instanceof Parcel))
      {
        paramObject = (Parcel)paramObject;
        ((Parcel)paramObject).setDataPosition(0);
        a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel((Parcel)paramObject));
        ((Parcel)paramObject).recycle();
      }
      else
      {
        a.sendResult(null);
      }
    }
  }
  
  public class n
  {
    public n() {}
    
    public void a(final String paramString, final IBinder paramIBinder, final Bundle paramBundle, final d.o paramo)
    {
      u.a(new c(paramo, paramString, paramIBinder, paramBundle));
    }
    
    public void b(final String paramString, final int paramInt1, final int paramInt2, final Bundle paramBundle, final d.o paramo)
    {
      if (d(paramString, paramInt2))
      {
        u.a(new a(paramo, paramString, paramInt1, paramInt2, paramBundle));
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
      u.a(new b(paramo));
    }
    
    public void d(final String paramString, final b.b paramb, final d.o paramo)
    {
      if ((!TextUtils.isEmpty(paramString)) && (paramb != null)) {
        u.a(new e(paramo, paramString, paramb));
      }
    }
    
    public void e(final d.o paramo, final String paramString, final int paramInt1, final int paramInt2, final Bundle paramBundle)
    {
      u.a(new f(paramo, paramInt2, paramString, paramInt1, paramBundle));
    }
    
    public void f(final String paramString, final IBinder paramIBinder, final d.o paramo)
    {
      u.a(new d(paramo, paramString, paramIBinder));
    }
    
    public void g(final String paramString, final Bundle paramBundle, final b.b paramb, final d.o paramo)
    {
      if ((!TextUtils.isEmpty(paramString)) && (paramb != null)) {
        u.a(new h(paramo, paramString, paramBundle, paramb));
      }
    }
    
    public void h(final String paramString, final Bundle paramBundle, final b.b paramb, final d.o paramo)
    {
      if ((!TextUtils.isEmpty(paramString)) && (paramb != null)) {
        u.a(new i(paramo, paramString, paramBundle, paramb));
      }
    }
    
    public void i(final d.o paramo)
    {
      u.a(new g(paramo));
    }
    
    public class a
      implements Runnable
    {
      public a(d.o paramo, String paramString, int paramInt1, int paramInt2, Bundle paramBundle) {}
      
      public void run()
      {
        Object localObject1 = paramo.asBinder();
        s.remove(localObject1);
        d.f localf = new d.f(d.this, paramString, paramInt1, paramInt2, paramBundle, paramo);
        Object localObject2 = d.this;
        t = localf;
        localObject2 = ((d)localObject2).g(paramString, paramInt2, paramBundle);
        h = ((d.e)localObject2);
        d locald = d.this;
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
            if (v != null) {
              paramo.b(h.d(), v, h.c());
            }
          }
          catch (RemoteException localRemoteException2)
          {
            StringBuilder localStringBuilder2 = new StringBuilder();
            localStringBuilder2.append("Calling onConnect() failed. Dropping client. pkg=");
            localStringBuilder2.append(paramString);
            Log.w("MBServiceCompat", localStringBuilder2.toString());
            s.remove(localStringBuilder1);
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
        localObject = (d.f)s.remove(localObject);
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
        localObject = (d.f)s.get(localObject);
        if (localObject == null)
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("addSubscription for callback that isn't registered id=");
          ((StringBuilder)localObject).append(paramString);
          Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
          return;
        }
        a(paramString, (d.f)localObject, paramIBinder, paramBundle);
      }
    }
    
    public class d
      implements Runnable
    {
      public d(d.o paramo, String paramString, IBinder paramIBinder) {}
      
      public void run()
      {
        Object localObject = paramo.asBinder();
        localObject = (d.f)s.get(localObject);
        if (localObject == null)
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("removeSubscription for callback that isn't registered id=");
          ((StringBuilder)localObject).append(paramString);
          Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
          return;
        }
        if (!r(paramString, (d.f)localObject, paramIBinder))
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
      public e(d.o paramo, String paramString, b.b paramb) {}
      
      public void run()
      {
        Object localObject = paramo.asBinder();
        localObject = (d.f)s.get(localObject);
        if (localObject == null)
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("getMediaItem for callback that isn't registered id=");
          ((StringBuilder)localObject).append(paramString);
          Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
          return;
        }
        p(paramString, (d.f)localObject, paramb);
      }
    }
    
    public class f
      implements Runnable
    {
      public f(d.o paramo, int paramInt1, String paramString, int paramInt2, Bundle paramBundle) {}
      
      public void run()
      {
        IBinder localIBinder = paramo.asBinder();
        s.remove(localIBinder);
        Iterator localIterator = r.iterator();
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
          localObject1 = new d.f(d.this, a, b, c, paramBundle, paramo);
        }
        localIterator.remove();
        Object localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new d.f(d.this, paramString, paramInt1, paramInt2, paramBundle, paramo);
        }
        s.put(localIBinder, localObject2);
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
        d.f localf = (d.f)s.remove(localIBinder);
        if (localf != null) {
          localIBinder.unlinkToDeath(localf, 0);
        }
      }
    }
    
    public class h
      implements Runnable
    {
      public h(d.o paramo, String paramString, Bundle paramBundle, b.b paramb) {}
      
      public void run()
      {
        Object localObject = paramo.asBinder();
        localObject = (d.f)s.get(localObject);
        if (localObject == null)
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("search for callback that isn't registered query=");
          ((StringBuilder)localObject).append(paramString);
          Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
          return;
        }
        q(paramString, paramBundle, (d.f)localObject, paramb);
      }
    }
    
    public class i
      implements Runnable
    {
      public i(d.o paramo, String paramString, Bundle paramBundle, b.b paramb) {}
      
      public void run()
      {
        Object localObject = paramo.asBinder();
        localObject = (d.f)s.get(localObject);
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
        n(paramString, paramBundle, (d.f)localObject, paramb);
      }
    }
  }
  
  public static abstract interface o
  {
    public abstract void a();
    
    public abstract IBinder asBinder();
    
    public abstract void b(String paramString, MediaSessionCompat.Token paramToken, Bundle paramBundle);
    
    public abstract void c(String paramString, List paramList, Bundle paramBundle1, Bundle paramBundle2);
  }
  
  public static class p
    implements d.o
  {
    public final Messenger a;
    
    public p(Messenger paramMessenger)
    {
      a = paramMessenger;
    }
    
    public void a()
    {
      d(2, null);
    }
    
    public IBinder asBinder()
    {
      return a.getBinder();
    }
    
    public void b(String paramString, MediaSessionCompat.Token paramToken, Bundle paramBundle)
    {
      Bundle localBundle = paramBundle;
      if (paramBundle == null) {
        localBundle = new Bundle();
      }
      localBundle.putInt("extra_service_version", 2);
      paramBundle = new Bundle();
      paramBundle.putString("data_media_item_id", paramString);
      paramBundle.putParcelable("data_media_session_token", paramToken);
      paramBundle.putBundle("data_root_hints", localBundle);
      d(1, paramBundle);
    }
    
    public void c(String paramString, List paramList, Bundle paramBundle1, Bundle paramBundle2)
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("data_media_item_id", paramString);
      localBundle.putBundle("data_options", paramBundle1);
      localBundle.putBundle("data_notify_children_changed_options", paramBundle2);
      if (paramList != null)
      {
        if ((paramList instanceof ArrayList)) {
          paramString = (ArrayList)paramList;
        } else {
          paramString = new ArrayList(paramList);
        }
        localBundle.putParcelableArrayList("data_media_item_list", paramString);
      }
      d(3, localBundle);
    }
    
    public final void d(int paramInt, Bundle paramBundle)
    {
      Message localMessage = Message.obtain();
      what = paramInt;
      arg1 = 2;
      localMessage.setData(paramBundle);
      a.send(localMessage);
    }
  }
  
  public static final class q
    extends Handler
  {
    public d a;
    
    public q(d paramd)
    {
      a = paramd;
    }
    
    public void a(Runnable paramRunnable)
    {
      if (Thread.currentThread() == getLooper().getThread()) {
        paramRunnable.run();
      } else {
        post(paramRunnable);
      }
    }
    
    public void b()
    {
      a = null;
    }
    
    public void handleMessage(Message paramMessage)
    {
      d locald = a;
      if (locald != null) {
        locald.c(paramMessage);
      } else {
        removeCallbacksAndMessages(null);
      }
    }
    
    public boolean sendMessageAtTime(Message paramMessage, long paramLong)
    {
      Bundle localBundle = paramMessage.getData();
      localBundle.setClassLoader(MediaBrowserCompat.class.getClassLoader());
      localBundle.putInt("data_calling_uid", Binder.getCallingUid());
      int i = Binder.getCallingPid();
      if (i > 0) {}
      for (;;)
      {
        localBundle.putInt("data_calling_pid", i);
        break;
        if (localBundle.containsKey("data_calling_pid")) {
          break;
        }
        i = -1;
      }
      return super.sendMessageAtTime(paramMessage, paramLong);
    }
  }
}

/* Location:
 * Qualified Name:     a0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */