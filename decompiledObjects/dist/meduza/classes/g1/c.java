package g1;

import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.browse.MediaBrowser.MediaItem;
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
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.service.media.MediaBrowserService.BrowserRoot;
import android.service.media.MediaBrowserService.Result;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.os.a;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import r.h;

public abstract class c
  extends Service
{
  public static final boolean o = Log.isLoggable("MBServiceCompat", 3);
  public f a;
  public final c b = new c("android.media.session.MediaController", -1, -1, null);
  public final ArrayList<c> c = new ArrayList();
  public final r.b<IBinder, c> d = new r.b();
  public final n e = new n();
  public MediaSessionCompat.Token f;
  
  public static List a(List paramList, Bundle paramBundle)
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
      i = m;
      if (m > paramList.size()) {
        i = paramList.size();
      }
      return paramList.subList(k, i);
    }
    return Collections.emptyList();
  }
  
  public abstract b b(Bundle paramBundle);
  
  public void c(Bundle paramBundle, i parami, String paramString)
  {
    e = 1;
    d(paramString, parami);
  }
  
  public abstract void d(String paramString, i<List<MediaBrowserCompat.MediaItem>> parami);
  
  public final void dump(FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {}
  
  public void e(String paramString, i<MediaBrowserCompat.MediaItem> parami)
  {
    e = 2;
    parami.f(null);
  }
  
  public void f(Bundle paramBundle, e parame, String paramString)
  {
    e = 4;
    parame.f(null);
  }
  
  public final void g(final String paramString, final c paramc, final Bundle paramBundle1, final Bundle paramBundle2)
  {
    paramBundle2 = new a(paramString, paramc, paramString, paramBundle1, paramBundle2);
    if (paramBundle1 == null) {
      d(paramString, paramBundle2);
    } else {
      c(paramBundle1, paramBundle2, paramString);
    }
    if (paramBundle2.b()) {
      return;
    }
    paramBundle1 = f.l("onLoadChildren must call detach() or sendResult() before returning for package=");
    paramBundle1.append(a);
    paramBundle1.append(" id=");
    paramBundle1.append(paramString);
    throw new IllegalStateException(paramBundle1.toString());
  }
  
  public final IBinder onBind(Intent paramIntent)
  {
    return a.b.onBind(paramIntent);
  }
  
  public void onCreate()
  {
    super.onCreate();
    int i = Build.VERSION.SDK_INT;
    Object localObject;
    if (i >= 28) {
      localObject = new h();
    } else if (i >= 26) {
      localObject = new g();
    } else {
      localObject = new f();
    }
    a = ((f)localObject);
    ((d)localObject).onCreate();
  }
  
  public final class a
    extends c.i<List<MediaBrowserCompat.MediaItem>>
  {
    public a(Object paramObject, c.c paramc, String paramString, Bundle paramBundle1, Bundle paramBundle2)
    {
      super();
    }
    
    public final void d(Object paramObject)
    {
      Object localObject1 = (List)paramObject;
      if (d.getOrDefault(((c.m)paramcd).a(), null) != paramc)
      {
        if (c.o)
        {
          paramObject = f.l("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
          ((StringBuilder)paramObject).append(paramca);
          ((StringBuilder)paramObject).append(" id=");
          ((StringBuilder)paramObject).append(paramString);
          Log.d("MBServiceCompat", ((StringBuilder)paramObject).toString());
        }
      }
      else
      {
        paramObject = localObject1;
        Object localObject2;
        if ((e & 0x1) != 0)
        {
          localObject2 = c.this;
          paramObject = paramBundle1;
          localObject2.getClass();
          paramObject = c.a((List)localObject1, (Bundle)paramObject);
        }
        try
        {
          localObject2 = paramcd;
          String str = paramString;
          localObject1 = paramBundle1;
          Bundle localBundle = paramBundle2;
          ((c.m)localObject2).b(str, (List)paramObject, (Bundle)localObject1, localBundle);
        }
        catch (RemoteException paramObject)
        {
          paramObject = f.l("Calling onLoadChildren() failed for id=");
          ((StringBuilder)paramObject).append(paramString);
          ((StringBuilder)paramObject).append(" package=");
          ((StringBuilder)paramObject).append(paramca);
          Log.w("MBServiceCompat", ((StringBuilder)paramObject).toString());
        }
      }
    }
  }
  
  public static final class b
  {
    public final String a;
    public final Bundle b;
    
    public b(Bundle paramBundle, String paramString)
    {
      if (paramString != null)
      {
        a = paramString;
        b = paramBundle;
        return;
      }
      throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
    }
  }
  
  public final class c
    implements IBinder.DeathRecipient
  {
    public final String a;
    public final int b;
    public final int c;
    public final c.l d;
    public final HashMap<String, List<d0.b<IBinder, Bundle>>> e = new HashMap();
    public c.b f;
    
    public c(String paramString, int paramInt1, int paramInt2, c.l paraml)
    {
      a = paramString;
      b = paramInt1;
      c = paramInt2;
      if (paramString != null)
      {
        if (!TextUtils.isEmpty(paramString))
        {
          if (Build.VERSION.SDK_INT >= 28) {
            new u(paramString, paramInt1, paramInt2);
          }
          d = paraml;
          return;
        }
        throw new IllegalArgumentException("packageName should be nonempty");
      }
      throw new NullPointerException("package shouldn't be null");
    }
    
    public final void binderDied()
    {
      e.post(new a());
    }
    
    public final class a
      implements Runnable
    {
      public a() {}
      
      public final void run()
      {
        c.c localc = c.c.this;
        g.d.remove(((c.m)d).a());
      }
    }
  }
  
  public static abstract interface d
  {
    public abstract void onCreate();
  }
  
  public class e
    implements c.d
  {
    public final ArrayList a = new ArrayList();
    public a b;
    public Messenger c;
    
    public e() {}
    
    public void a(Bundle paramBundle, String paramString)
    {
      b.notifyChildrenChanged(paramString);
    }
    
    public class a
      extends MediaBrowserService
    {
      public a(c paramc)
      {
        attachBaseContext(paramc);
      }
      
      public final MediaBrowserService.BrowserRoot onGetRoot(String paramString, int paramInt, Bundle paramBundle)
      {
        MediaSessionCompat.a(paramBundle);
        c.e locale = c.e.this;
        Object localObject1 = null;
        if (paramBundle == null) {
          localObject2 = null;
        } else {
          localObject2 = new Bundle(paramBundle);
        }
        Bundle localBundle;
        if (localObject2 != null)
        {
          locale.getClass();
          if (((BaseBundle)localObject2).getInt("extra_client_version", 0) != 0)
          {
            ((Bundle)localObject2).remove("extra_client_version");
            c = new Messenger(d.e);
            localBundle = new Bundle();
            localBundle.putInt("extra_service_version", 2);
            localBundle.putBinder("extra_messenger", c.getBinder());
            paramBundle = d.f;
            if (paramBundle != null)
            {
              paramBundle = paramBundle.a();
              if (paramBundle == null) {
                paramBundle = null;
              } else {
                paramBundle = paramBundle.asBinder();
              }
              localBundle.putBinder("extra_session_binder", paramBundle);
            }
            else
            {
              a.add(localBundle);
            }
            i = ((BaseBundle)localObject2).getInt("extra_calling_pid", -1);
            ((Bundle)localObject2).remove("extra_calling_pid");
            paramBundle = localBundle;
            break label198;
          }
        }
        int i = -1;
        paramBundle = null;
        label198:
        paramString = new c.c(d, paramString, i, paramInt, null);
        d.getClass();
        Object localObject2 = d.b((Bundle)localObject2);
        d.getClass();
        if (localObject2 == null)
        {
          paramString = null;
        }
        else
        {
          if (c != null) {
            d.c.add(paramString);
          }
          if (paramBundle == null)
          {
            paramString = b;
          }
          else
          {
            localBundle = b;
            paramString = paramBundle;
            if (localBundle != null)
            {
              paramBundle.putAll(localBundle);
              paramString = paramBundle;
            }
          }
          paramString = new c.b(paramString, a);
        }
        if (paramString == null) {
          paramString = (String)localObject1;
        } else {
          paramString = new MediaBrowserService.BrowserRoot(a, b);
        }
        return paramString;
      }
      
      public final void onLoadChildren(String paramString, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> paramResult)
      {
        c.e locale = c.e.this;
        paramResult = new c.j(paramResult);
        locale.getClass();
        paramResult = new g(paramString, paramResult);
        c localc = d;
        c.c localc1 = b;
        localc.d(paramString, paramResult);
        d.getClass();
      }
    }
  }
  
  public class f
    extends c.e
  {
    public f()
    {
      super();
    }
    
    public void onCreate()
    {
      a locala = new a(c.this);
      b = locala;
      locala.onCreate();
    }
    
    public class a
      extends c.e.a
    {
      public a(c paramc)
      {
        super(paramc);
      }
      
      public final void onLoadItem(String paramString, MediaBrowserService.Result<MediaBrowser.MediaItem> paramResult)
      {
        c.f localf = c.f.this;
        paramResult = new c.j(paramResult);
        localf.getClass();
        paramResult = new i(paramString, paramResult);
        c localc = e;
        c.c localc1 = b;
        localc.e(paramString, paramResult);
        e.getClass();
      }
    }
  }
  
  public class g
    extends c.f
  {
    public g()
    {
      super();
    }
    
    public final void a(Bundle paramBundle, String paramString)
    {
      b0.f.j(b, paramString, paramBundle);
    }
    
    public final void onCreate()
    {
      a locala = new a(c.this);
      b = locala;
      locala.onCreate();
    }
    
    public final class a
      extends c.f.a
    {
      public a(c paramc)
      {
        super(paramc);
      }
      
      public final void onLoadChildren(String paramString, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> paramResult, Bundle paramBundle)
      {
        MediaSessionCompat.a(paramBundle);
        Object localObject1 = c.this;
        Object localObject2 = b;
        localObject1.getClass();
        localObject1 = c.g.this;
        paramResult = new c.j(paramResult);
        localObject1.getClass();
        j localj = new j((c.g)localObject1, paramString, paramResult, paramBundle);
        localObject2 = f;
        paramResult = b;
        ((c)localObject2).c(paramBundle, localj, paramString);
        f.getClass();
        getClass();
      }
    }
  }
  
  public final class h
    extends c.g
  {
    public h()
    {
      super();
    }
  }
  
  public static class i<T>
  {
    public final Object a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    
    public i(Object paramObject)
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
          localStringBuilder = f.l("detach() called when sendError() had already been called for: ");
          localStringBuilder.append(a);
          throw new IllegalStateException(localStringBuilder.toString());
        }
        localStringBuilder = f.l("detach() called when sendResult() had already been called for: ");
        localStringBuilder.append(a);
        throw new IllegalStateException(localStringBuilder.toString());
      }
      StringBuilder localStringBuilder = f.l("detach() called when detach() had already been called for: ");
      localStringBuilder.append(a);
      throw new IllegalStateException(localStringBuilder.toString());
    }
    
    public final boolean b()
    {
      boolean bool;
      if ((!b) && (!c) && (!d)) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public void c(Bundle paramBundle)
    {
      paramBundle = f.l("It is not supported to send an error for ");
      paramBundle.append(a);
      throw new UnsupportedOperationException(paramBundle.toString());
    }
    
    public void d(T paramT)
    {
      throw null;
    }
    
    public final void e(Bundle paramBundle)
    {
      if ((!c) && (!d))
      {
        d = true;
        c(paramBundle);
        throw null;
      }
      paramBundle = f.l("sendError() called when either sendResult() or sendError() had already been called for: ");
      paramBundle.append(a);
      throw new IllegalStateException(paramBundle.toString());
    }
    
    public final void f(T paramT)
    {
      if ((!c) && (!d))
      {
        c = true;
        d(paramT);
        return;
      }
      paramT = f.l("sendResult() called when either sendResult() or sendError() had already been called for: ");
      paramT.append(a);
      throw new IllegalStateException(paramT.toString());
    }
  }
  
  public static final class j<T>
  {
    public MediaBrowserService.Result a;
    
    public j(MediaBrowserService.Result paramResult)
    {
      a = paramResult;
    }
    
    public final void a(T paramT)
    {
      boolean bool = paramT instanceof List;
      ArrayList localArrayList = null;
      if (bool)
      {
        MediaBrowserService.Result localResult = a;
        paramT = (List)paramT;
        if (paramT == null)
        {
          paramT = localArrayList;
        }
        else
        {
          localArrayList = new ArrayList(paramT.size());
          Iterator localIterator = paramT.iterator();
          for (;;)
          {
            paramT = localArrayList;
            if (!localIterator.hasNext()) {
              break;
            }
            paramT = (Parcel)localIterator.next();
            paramT.setDataPosition(0);
            localArrayList.add((MediaBrowser.MediaItem)MediaBrowser.MediaItem.CREATOR.createFromParcel(paramT));
            paramT.recycle();
          }
        }
        localResult.sendResult(paramT);
      }
      else if ((paramT instanceof Parcel))
      {
        paramT = (Parcel)paramT;
        paramT.setDataPosition(0);
        a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(paramT));
        paramT.recycle();
      }
      else
      {
        a.sendResult(null);
      }
    }
  }
  
  public final class k
  {
    public k() {}
  }
  
  public static abstract interface l {}
  
  public static final class m
    implements c.l
  {
    public final Messenger a;
    
    public m(Messenger paramMessenger)
    {
      a = paramMessenger;
    }
    
    public final IBinder a()
    {
      return a.getBinder();
    }
    
    public final void b(String paramString, List<MediaBrowserCompat.MediaItem> paramList, Bundle paramBundle1, Bundle paramBundle2)
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
      c(3, localBundle);
    }
    
    public final void c(int paramInt, Bundle paramBundle)
    {
      Message localMessage = Message.obtain();
      what = paramInt;
      arg1 = 2;
      localMessage.setData(paramBundle);
      a.send(localMessage);
    }
  }
  
  public final class n
    extends Handler
  {
    public final c.k a;
    
    public n()
    {
      a = new c.k(this$1);
    }
    
    public final void a(Runnable paramRunnable)
    {
      if (Thread.currentThread() == getLooper().getThread()) {
        paramRunnable.run();
      } else {
        post(paramRunnable);
      }
    }
    
    public final void handleMessage(Message paramMessage)
    {
      Object localObject1 = paramMessage.getData();
      Object localObject2;
      Object localObject3;
      Object localObject4;
      int i;
      int j;
      switch (what)
      {
      default: 
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("Unhandled message: ");
        ((StringBuilder)localObject1).append(paramMessage);
        ((StringBuilder)localObject1).append("\n  Service version: ");
        ((StringBuilder)localObject1).append(2);
        ((StringBuilder)localObject1).append("\n  Client version: ");
        ((StringBuilder)localObject1).append(arg1);
        Log.w("MBServiceCompat", ((StringBuilder)localObject1).toString());
        break;
      case 9: 
        localObject2 = ((Bundle)localObject1).getBundle("data_custom_action_extras");
        MediaSessionCompat.a((Bundle)localObject2);
        localObject3 = a;
        localObject4 = ((BaseBundle)localObject1).getString("data_custom_action");
        localObject1 = (a)((Bundle)localObject1).getParcelable("data_result_receiver");
        paramMessage = new c.m(replyTo);
        localObject3.getClass();
        if ((!TextUtils.isEmpty((CharSequence)localObject4)) && (localObject1 != null)) {
          a.e.a(new s((c.k)localObject3, paramMessage, (String)localObject4, (Bundle)localObject2, (a)localObject1));
        }
        break;
      case 8: 
        localObject4 = ((Bundle)localObject1).getBundle("data_search_extras");
        MediaSessionCompat.a((Bundle)localObject4);
        localObject3 = a;
        localObject2 = ((BaseBundle)localObject1).getString("data_search_query");
        localObject1 = (a)((Bundle)localObject1).getParcelable("data_result_receiver");
        paramMessage = new c.m(replyTo);
        localObject3.getClass();
        if ((!TextUtils.isEmpty((CharSequence)localObject2)) && (localObject1 != null)) {
          a.e.a(new r((c.k)localObject3, paramMessage, (String)localObject2, (Bundle)localObject4, (a)localObject1));
        }
        break;
      case 7: 
        localObject1 = a;
        paramMessage = new c.m(replyTo);
        a.e.a(new q((c.k)localObject1, paramMessage));
        break;
      case 6: 
        localObject4 = ((Bundle)localObject1).getBundle("data_root_hints");
        MediaSessionCompat.a((Bundle)localObject4);
        localObject2 = a;
        localObject3 = new c.m(replyTo);
        paramMessage = ((BaseBundle)localObject1).getString("data_package_name");
        i = ((BaseBundle)localObject1).getInt("data_calling_pid");
        j = ((BaseBundle)localObject1).getInt("data_calling_uid");
        a.e.a(new p(j, i, (Bundle)localObject4, (c.k)localObject2, (c.m)localObject3, paramMessage));
        break;
      case 5: 
        localObject4 = a;
        localObject2 = ((BaseBundle)localObject1).getString("data_media_item_id");
        localObject1 = (a)((Bundle)localObject1).getParcelable("data_result_receiver");
        paramMessage = new c.m(replyTo);
        localObject4.getClass();
        if ((!TextUtils.isEmpty((CharSequence)localObject2)) && (localObject1 != null)) {
          a.e.a(new o((c.k)localObject4, paramMessage, (String)localObject2, (a)localObject1));
        }
        break;
      case 4: 
        localObject2 = a;
        localObject4 = ((BaseBundle)localObject1).getString("data_media_item_id");
        localObject1 = ((Bundle)localObject1).getBinder("data_callback_token");
        paramMessage = new c.m(replyTo);
        a.e.a(new n((c.k)localObject2, paramMessage, (String)localObject4, (IBinder)localObject1));
        break;
      case 3: 
        localObject2 = ((Bundle)localObject1).getBundle("data_options");
        MediaSessionCompat.a((Bundle)localObject2);
        localObject3 = a;
        localObject4 = ((BaseBundle)localObject1).getString("data_media_item_id");
        localObject1 = ((Bundle)localObject1).getBinder("data_callback_token");
        paramMessage = new c.m(replyTo);
        a.e.a(new m((c.k)localObject3, paramMessage, (String)localObject4, (IBinder)localObject1, (Bundle)localObject2));
        break;
      case 2: 
        localObject1 = a;
        paramMessage = new c.m(replyTo);
        a.e.a(new l((c.k)localObject1, paramMessage));
        break;
      case 1: 
        localObject3 = ((Bundle)localObject1).getBundle("data_root_hints");
        MediaSessionCompat.a((Bundle)localObject3);
        localObject4 = a;
        localObject2 = ((BaseBundle)localObject1).getString("data_package_name");
        int k = ((BaseBundle)localObject1).getInt("data_calling_pid");
        int m = ((BaseBundle)localObject1).getInt("data_calling_uid");
        paramMessage = new c.m(replyTo);
        localObject1 = a;
        int n = 0;
        if (localObject2 == null)
        {
          localObject1.getClass();
          i = n;
        }
        else
        {
          localObject1 = ((Context)localObject1).getPackageManager().getPackagesForUid(m);
          int i1 = localObject1.length;
          for (j = 0;; j++)
          {
            i = n;
            if (j >= i1) {
              break;
            }
            if (localObject1[j].equals(localObject2))
            {
              i = 1;
              break;
            }
          }
        }
        if (i != 0)
        {
          a.e.a(new k(k, m, (Bundle)localObject3, (c.k)localObject4, paramMessage, (String)localObject2));
        }
        else
        {
          paramMessage = new StringBuilder();
          paramMessage.append("Package/uid mismatch: uid=");
          paramMessage.append(m);
          paramMessage.append(" package=");
          paramMessage.append((String)localObject2);
          throw new IllegalArgumentException(paramMessage.toString());
        }
        break;
      }
    }
    
    public final boolean sendMessageAtTime(Message paramMessage, long paramLong)
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
 * Qualified Name:     g1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */