package android.support.v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.media.browse.MediaBrowser.ConnectionCallback;
import android.os.BadParcelableException;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.media.session.b.a;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import t.h;
import w.d;

public final class MediaBrowserCompat
{
  public static final boolean b = Log.isLoggable("MediaBrowserCompat", 3);
  public final c a;
  
  public MediaBrowserCompat(Context paramContext, ComponentName paramComponentName, b paramb, Bundle paramBundle)
  {
    if (Build.VERSION.SDK_INT >= 26) {}
    for (paramContext = new f(paramContext, paramComponentName, paramb, paramBundle);; paramContext = new e(paramContext, paramComponentName, paramb, paramBundle))
    {
      a = paramContext;
      break;
    }
  }
  
  public void a()
  {
    Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
    a.a();
  }
  
  public void b()
  {
    a.c();
  }
  
  public MediaSessionCompat.Token c()
  {
    return a.b();
  }
  
  public static class CustomActionResultReceiver
    extends b.b
  {
    public void a(int paramInt, Bundle paramBundle) {}
  }
  
  public static class ItemReceiver
    extends b.b
  {
    public void a(int paramInt, Bundle paramBundle)
    {
      Bundle localBundle = paramBundle;
      if (paramBundle != null) {
        localBundle = MediaSessionCompat.u(paramBundle);
      }
      if ((paramInt == 0) && (localBundle != null) && (localBundle.containsKey("media_item")))
      {
        paramBundle = localBundle.getParcelable("media_item");
        if ((paramBundle != null) && (!(paramBundle instanceof MediaBrowserCompat.MediaItem))) {
          throw null;
        }
        paramBundle = (MediaBrowserCompat.MediaItem)paramBundle;
        throw null;
      }
      throw null;
    }
  }
  
  @SuppressLint({"BanParcelableUsage"})
  public static class MediaItem
    implements Parcelable
  {
    public static final Parcelable.Creator<MediaItem> CREATOR = new a();
    public final int o;
    public final MediaDescriptionCompat p;
    
    public MediaItem(Parcel paramParcel)
    {
      o = paramParcel.readInt();
      p = ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel));
    }
    
    public MediaItem(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
    {
      if (paramMediaDescriptionCompat != null)
      {
        if (!TextUtils.isEmpty(paramMediaDescriptionCompat.g()))
        {
          o = paramInt;
          p = paramMediaDescriptionCompat;
          return;
        }
        throw new IllegalArgumentException("description must have a non-empty media id");
      }
      throw new IllegalArgumentException("description cannot be null");
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("MediaItem{");
      localStringBuilder.append("mFlags=");
      localStringBuilder.append(o);
      localStringBuilder.append(", mDescription=");
      localStringBuilder.append(p);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(o);
      p.writeToParcel(paramParcel, paramInt);
    }
    
    public class a
      implements Parcelable.Creator
    {
      public MediaBrowserCompat.MediaItem a(Parcel paramParcel)
      {
        return new MediaBrowserCompat.MediaItem(paramParcel);
      }
      
      public MediaBrowserCompat.MediaItem[] b(int paramInt)
      {
        return new MediaBrowserCompat.MediaItem[paramInt];
      }
    }
  }
  
  public static class SearchResultReceiver
    extends b.b
  {
    public void a(int paramInt, Bundle paramBundle)
    {
      Object localObject = paramBundle;
      if (paramBundle != null) {
        localObject = MediaSessionCompat.u(paramBundle);
      }
      if ((paramInt == 0) && (localObject != null) && (((BaseBundle)localObject).containsKey("search_results")))
      {
        paramBundle = ((Bundle)localObject).getParcelableArray("search_results");
        paramBundle.getClass();
        localObject = new ArrayList(paramBundle.length);
        int i = paramBundle.length;
        for (paramInt = 0; paramInt < i; paramInt++) {
          ((List)localObject).add((MediaBrowserCompat.MediaItem)paramBundle[paramInt]);
        }
        throw null;
      }
      throw null;
    }
  }
  
  public static class a
    extends Handler
  {
    public final WeakReference a;
    public WeakReference b;
    
    public a(MediaBrowserCompat.g paramg)
    {
      a = new WeakReference(paramg);
    }
    
    public void a(Messenger paramMessenger)
    {
      b = new WeakReference(paramMessenger);
    }
    
    public void handleMessage(Message paramMessage)
    {
      Object localObject1 = b;
      if ((localObject1 != null) && (((Reference)localObject1).get() != null) && (a.get() != null))
      {
        Object localObject2 = paramMessage.getData();
        MediaSessionCompat.a((Bundle)localObject2);
        MediaBrowserCompat.g localg = (MediaBrowserCompat.g)a.get();
        localObject1 = (Messenger)b.get();
        try
        {
          int i = what;
          Bundle localBundle2;
          if (i != 1)
          {
            if (i != 2)
            {
              if (i != 3)
              {
                localObject2 = new java/lang/StringBuilder;
                ((StringBuilder)localObject2).<init>();
                ((StringBuilder)localObject2).append("Unhandled message: ");
                ((StringBuilder)localObject2).append(paramMessage);
                ((StringBuilder)localObject2).append("\n  Client version: ");
                ((StringBuilder)localObject2).append(1);
                ((StringBuilder)localObject2).append("\n  Service version: ");
                ((StringBuilder)localObject2).append(arg1);
                Log.w("MediaBrowserCompat", ((StringBuilder)localObject2).toString());
              }
              else
              {
                Bundle localBundle1 = ((Bundle)localObject2).getBundle("data_options");
                MediaSessionCompat.a(localBundle1);
                localBundle2 = ((Bundle)localObject2).getBundle("data_notify_children_changed_options");
                MediaSessionCompat.a(localBundle2);
                localg.h((Messenger)localObject1, ((BaseBundle)localObject2).getString("data_media_item_id"), ((Bundle)localObject2).getParcelableArrayList("data_media_item_list"), localBundle1, localBundle2);
              }
            }
            else {
              localg.d((Messenger)localObject1);
            }
          }
          else
          {
            localBundle2 = ((Bundle)localObject2).getBundle("data_root_hints");
            MediaSessionCompat.a(localBundle2);
            localg.e((Messenger)localObject1, ((BaseBundle)localObject2).getString("data_media_item_id"), (MediaSessionCompat.Token)((Bundle)localObject2).getParcelable("data_media_session_token"), localBundle2);
          }
        }
        catch (BadParcelableException localBadParcelableException)
        {
          Log.e("MediaBrowserCompat", "Could not unparcel the data.");
          if (what == 1) {
            localg.d((Messenger)localObject1);
          }
        }
      }
    }
  }
  
  public static abstract class b
  {
    public final MediaBrowser.ConnectionCallback a = new a();
    public b b;
    
    public abstract void a();
    
    public abstract void b();
    
    public abstract void c();
    
    public void d(b paramb)
    {
      b = paramb;
    }
    
    public class a
      extends MediaBrowser.ConnectionCallback
    {
      public a() {}
      
      public void onConnected()
      {
        MediaBrowserCompat.b.b localb = b;
        if (localb != null) {
          localb.f();
        }
        a();
      }
      
      public void onConnectionFailed()
      {
        MediaBrowserCompat.b.b localb = b;
        if (localb != null) {
          localb.g();
        }
        b();
      }
      
      public void onConnectionSuspended()
      {
        MediaBrowserCompat.b.b localb = b;
        if (localb != null) {
          localb.i();
        }
        c();
      }
    }
    
    public static abstract interface b
    {
      public abstract void f();
      
      public abstract void g();
      
      public abstract void i();
    }
  }
  
  public static abstract interface c
  {
    public abstract void a();
    
    public abstract MediaSessionCompat.Token b();
    
    public abstract void c();
  }
  
  public static abstract class d
    implements MediaBrowserCompat.c, MediaBrowserCompat.g, MediaBrowserCompat.b.b
  {
    public final Context a;
    public final MediaBrowser b;
    public final Bundle c;
    public final MediaBrowserCompat.a d = new MediaBrowserCompat.a(this);
    public final t.a e = new t.a();
    public int f;
    public MediaBrowserCompat.h g;
    public Messenger h;
    public MediaSessionCompat.Token i;
    
    public d(Context paramContext, ComponentName paramComponentName, MediaBrowserCompat.b paramb, Bundle paramBundle)
    {
      a = paramContext;
      Bundle localBundle = new android/os/Bundle;
      if (paramBundle != null) {
        localBundle.<init>(paramBundle);
      } else {
        localBundle.<init>();
      }
      c = localBundle;
      localBundle.putInt("extra_client_version", 1);
      localBundle.putInt("extra_calling_pid", Process.myPid());
      paramb.d(this);
      b = new MediaBrowser(paramContext, paramComponentName, a, localBundle);
    }
    
    public void a()
    {
      b.connect();
    }
    
    public MediaSessionCompat.Token b()
    {
      if (i == null) {
        i = MediaSessionCompat.Token.a(b.getSessionToken());
      }
      return i;
    }
    
    public void c()
    {
      MediaBrowserCompat.h localh = g;
      if (localh != null)
      {
        Messenger localMessenger = h;
        if (localMessenger != null) {
          try
          {
            localh.c(localMessenger);
          }
          catch (RemoteException localRemoteException)
          {
            Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
          }
        }
      }
      b.disconnect();
    }
    
    public void d(Messenger paramMessenger) {}
    
    public void e(Messenger paramMessenger, String paramString, MediaSessionCompat.Token paramToken, Bundle paramBundle) {}
    
    public void f()
    {
      try
      {
        Object localObject1 = b.getExtras();
        if (localObject1 == null) {
          return;
        }
        f = ((BaseBundle)localObject1).getInt("extra_service_version", 0);
        Object localObject2 = d.a((Bundle)localObject1, "extra_messenger");
        if (localObject2 != null)
        {
          g = new MediaBrowserCompat.h((IBinder)localObject2, c);
          localObject2 = new Messenger(d);
          h = ((Messenger)localObject2);
          d.a((Messenger)localObject2);
          try
          {
            g.a(a, h);
          }
          catch (RemoteException localRemoteException)
          {
            Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
          }
        }
        localObject1 = b.a.n(d.a((Bundle)localObject1, "extra_session_binder"));
        if (localObject1 != null) {
          i = MediaSessionCompat.Token.b(b.getSessionToken(), (android.support.v4.media.session.b)localObject1);
        }
        return;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", localIllegalStateException);
      }
    }
    
    public void g() {}
    
    public void h(Messenger paramMessenger, String paramString, List paramList, Bundle paramBundle1, Bundle paramBundle2)
    {
      if (h != paramMessenger) {
        return;
      }
      a.a(e.get(paramString));
      if (MediaBrowserCompat.b)
      {
        paramMessenger = new StringBuilder();
        paramMessenger.append("onLoadChildren for id that isn't subscribed id=");
        paramMessenger.append(paramString);
        Log.d("MediaBrowserCompat", paramMessenger.toString());
      }
    }
    
    public void i()
    {
      g = null;
      h = null;
      i = null;
      d.a(null);
    }
  }
  
  public static class e
    extends MediaBrowserCompat.d
  {
    public e(Context paramContext, ComponentName paramComponentName, MediaBrowserCompat.b paramb, Bundle paramBundle)
    {
      super(paramComponentName, paramb, paramBundle);
    }
  }
  
  public static class f
    extends MediaBrowserCompat.e
  {
    public f(Context paramContext, ComponentName paramComponentName, MediaBrowserCompat.b paramb, Bundle paramBundle)
    {
      super(paramComponentName, paramb, paramBundle);
    }
  }
  
  public static abstract interface g
  {
    public abstract void d(Messenger paramMessenger);
    
    public abstract void e(Messenger paramMessenger, String paramString, MediaSessionCompat.Token paramToken, Bundle paramBundle);
    
    public abstract void h(Messenger paramMessenger, String paramString, List paramList, Bundle paramBundle1, Bundle paramBundle2);
  }
  
  public static class h
  {
    public Messenger a;
    public Bundle b;
    
    public h(IBinder paramIBinder, Bundle paramBundle)
    {
      a = new Messenger(paramIBinder);
      b = paramBundle;
    }
    
    public void a(Context paramContext, Messenger paramMessenger)
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("data_package_name", paramContext.getPackageName());
      localBundle.putInt("data_calling_pid", Process.myPid());
      localBundle.putBundle("data_root_hints", b);
      b(6, localBundle, paramMessenger);
    }
    
    public final void b(int paramInt, Bundle paramBundle, Messenger paramMessenger)
    {
      Message localMessage = Message.obtain();
      what = paramInt;
      arg1 = 1;
      localMessage.setData(paramBundle);
      replyTo = paramMessenger;
      a.send(localMessage);
    }
    
    public void c(Messenger paramMessenger)
    {
      b(7, null, paramMessenger);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */