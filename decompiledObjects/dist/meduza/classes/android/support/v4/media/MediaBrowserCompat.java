package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.media.browse.MediaBrowser.ConnectionCallback;
import android.media.browse.MediaBrowser.MediaItem;
import android.media.browse.MediaBrowser.SubscriptionCallback;
import android.media.session.MediaSession.Token;
import android.os.BadParcelableException;
import android.os.BaseBundle;
import android.os.Binder;
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
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.IMediaSession.Stub;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Token;
import android.support.v4.os.a;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p2.m0;
import r.b;
import r.h;

public final class MediaBrowserCompat
{
  public static final boolean b = Log.isLoggable("MediaBrowserCompat", 3);
  public final e a;
  
  public MediaBrowserCompat(Context paramContext, ComponentName paramComponentName, c paramc)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      paramContext = new f(paramContext, paramComponentName, paramc);
    } else {
      paramContext = new e(paramContext, paramComponentName, paramc);
    }
    a = paramContext;
  }
  
  public final void a()
  {
    e locale = a;
    h localh = f;
    if (localh != null)
    {
      Messenger localMessenger = g;
      if (localMessenger != null) {
        try
        {
          localh.a(7, null, localMessenger);
        }
        catch (RemoteException localRemoteException)
        {
          Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
        }
      }
    }
    b.disconnect();
  }
  
  public static class CustomActionResultReceiver
    extends a
  {
    public final void a(int paramInt, Bundle paramBundle) {}
  }
  
  public static class ItemReceiver
    extends a
  {
    public final void a(int paramInt, Bundle paramBundle)
    {
      Bundle localBundle = paramBundle;
      if (paramBundle != null) {
        localBundle = MediaSessionCompat.l(paramBundle);
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
  
  public static class MediaItem
    implements Parcelable
  {
    public static final Parcelable.Creator<MediaItem> CREATOR = new a();
    public final int a;
    public final MediaDescriptionCompat b;
    
    public MediaItem(Parcel paramParcel)
    {
      a = paramParcel.readInt();
      b = ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel));
    }
    
    public MediaItem(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
    {
      if (paramMediaDescriptionCompat != null)
      {
        if (!TextUtils.isEmpty(a))
        {
          a = paramInt;
          b = paramMediaDescriptionCompat;
          return;
        }
        throw new IllegalArgumentException("description must have a non-empty media id");
      }
      throw new IllegalArgumentException("description cannot be null");
    }
    
    public static void a(List paramList)
    {
      if (paramList != null)
      {
        ArrayList localArrayList = new ArrayList(paramList.size());
        Iterator localIterator = paramList.iterator();
        while (localIterator.hasNext())
        {
          paramList = localIterator.next();
          if (paramList != null)
          {
            paramList = (MediaBrowser.MediaItem)paramList;
            int i = MediaBrowserCompat.a.b(paramList);
            paramList = new MediaItem(MediaDescriptionCompat.a(MediaBrowserCompat.a.a(paramList)), i);
          }
          else
          {
            paramList = null;
          }
          localArrayList.add(paramList);
        }
      }
    }
    
    public final int describeContents()
    {
      return 0;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("MediaItem{");
      localStringBuilder.append("mFlags=");
      localStringBuilder.append(a);
      localStringBuilder.append(", mDescription=");
      localStringBuilder.append(b);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(a);
      b.writeToParcel(paramParcel, paramInt);
    }
    
    public final class a
      implements Parcelable.Creator<MediaBrowserCompat.MediaItem>
    {
      public final Object createFromParcel(Parcel paramParcel)
      {
        return new MediaBrowserCompat.MediaItem(paramParcel);
      }
      
      public final Object[] newArray(int paramInt)
      {
        return new MediaBrowserCompat.MediaItem[paramInt];
      }
    }
  }
  
  public static class SearchResultReceiver
    extends a
  {
    public final void a(int paramInt, Bundle paramBundle)
    {
      Object localObject = paramBundle;
      if (paramBundle != null) {
        localObject = MediaSessionCompat.l(paramBundle);
      }
      if ((paramInt == 0) && (localObject != null) && (((BaseBundle)localObject).containsKey("search_results")))
      {
        paramBundle = ((Bundle)localObject).getParcelableArray("search_results");
        paramBundle.getClass();
        localObject = new ArrayList(paramBundle.length);
        int i = paramBundle.length;
        for (paramInt = 0; paramInt < i; paramInt++) {
          ((ArrayList)localObject).add((MediaBrowserCompat.MediaItem)paramBundle[paramInt]);
        }
        throw null;
      }
      throw null;
    }
  }
  
  public static final class a
  {
    public static MediaDescription a(MediaBrowser.MediaItem paramMediaItem)
    {
      return paramMediaItem.getDescription();
    }
    
    public static int b(MediaBrowser.MediaItem paramMediaItem)
    {
      return paramMediaItem.getFlags();
    }
  }
  
  public static final class b
    extends Handler
  {
    public final WeakReference<MediaBrowserCompat.g> a;
    public WeakReference<Messenger> b;
    
    public b(MediaBrowserCompat.g paramg)
    {
      a = new WeakReference(paramg);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      Object localObject1 = b;
      if ((localObject1 != null) && (((Reference)localObject1).get() != null) && (a.get() != null))
      {
        Bundle localBundle = paramMessage.getData();
        MediaSessionCompat.a(localBundle);
        localObject1 = (MediaBrowserCompat.g)a.get();
        Messenger localMessenger = (Messenger)b.get();
        try
        {
          int i = what;
          Object localObject2;
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
                localObject2 = localBundle.getBundle("data_options");
                MediaSessionCompat.a((Bundle)localObject2);
                MediaSessionCompat.a(localBundle.getBundle("data_notify_children_changed_options"));
                String str = localBundle.getString("data_media_item_id");
                localBundle.getParcelableArrayList("data_media_item_list");
                ((MediaBrowserCompat.g)localObject1).c(localMessenger, str, (Bundle)localObject2);
              }
            }
            else {
              ((MediaBrowserCompat.g)localObject1).a();
            }
          }
          else
          {
            MediaSessionCompat.a(localBundle.getBundle("data_root_hints"));
            localBundle.getString("data_media_item_id");
            localObject2 = (MediaSessionCompat.Token)localBundle.getParcelable("data_media_session_token");
            ((MediaBrowserCompat.g)localObject1).b();
          }
        }
        catch (BadParcelableException localBadParcelableException)
        {
          Log.e("MediaBrowserCompat", "Could not unparcel the data.");
          if (what == 1) {
            ((MediaBrowserCompat.g)localObject1).a();
          }
        }
      }
    }
  }
  
  public static class c
  {
    public final a a = new a();
    public b b;
    
    public void a()
    {
      throw null;
    }
    
    public void b()
    {
      throw null;
    }
    
    public void c()
    {
      throw null;
    }
    
    public final class a
      extends MediaBrowser.ConnectionCallback
    {
      public a() {}
      
      public final void onConnected()
      {
        Object localObject1 = b;
        if (localObject1 != null)
        {
          MediaBrowserCompat.d locald = (MediaBrowserCompat.d)localObject1;
          try
          {
            localObject1 = b.getExtras();
            if (localObject1 != null)
            {
              ((BaseBundle)localObject1).getInt("extra_service_version", 0);
              Object localObject2 = ((Bundle)localObject1).getBinder("extra_messenger");
              if (localObject2 != null)
              {
                f = new MediaBrowserCompat.h((IBinder)localObject2, c);
                localObject3 = new Messenger(d);
                g = ((Messenger)localObject3);
                localObject2 = d;
                localObject2.getClass();
                b = new WeakReference(localObject3);
                try
                {
                  localObject2 = f;
                  localObject3 = a;
                  Messenger localMessenger = g;
                  localObject2.getClass();
                  Bundle localBundle = new android/os/Bundle;
                  localBundle.<init>();
                  localBundle.putString("data_package_name", ((Context)localObject3).getPackageName());
                  localBundle.putInt("data_calling_pid", Process.myPid());
                  localBundle.putBundle("data_root_hints", b);
                  ((MediaBrowserCompat.h)localObject2).a(6, localBundle, localMessenger);
                }
                catch (RemoteException localRemoteException)
                {
                  Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                }
              }
              Object localObject3 = IMediaSession.Stub.asInterface(((Bundle)localObject1).getBinder("extra_session_binder"));
              if (localObject3 != null)
              {
                MediaSession.Token localToken = b.getSessionToken();
                localObject1 = null;
                if (localToken != null) {
                  localObject1 = new MediaSessionCompat.Token(localToken, (IMediaSession)localObject3, null);
                }
                h = ((MediaSessionCompat.Token)localObject1);
              }
            }
          }
          catch (IllegalStateException localIllegalStateException)
          {
            Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", localIllegalStateException);
          }
        }
        a();
      }
      
      public final void onConnectionFailed()
      {
        MediaBrowserCompat.c.b localb = b;
        if (localb != null) {
          localb.getClass();
        }
        b();
      }
      
      public final void onConnectionSuspended()
      {
        Object localObject = b;
        if (localObject != null)
        {
          localObject = (MediaBrowserCompat.d)localObject;
          f = null;
          g = null;
          h = null;
          localObject = d;
          localObject.getClass();
          b = new WeakReference(null);
        }
        c();
      }
    }
    
    public static abstract interface b {}
  }
  
  public static class d
    implements MediaBrowserCompat.g, MediaBrowserCompat.c.b
  {
    public final Context a;
    public final MediaBrowser b;
    public final Bundle c;
    public final MediaBrowserCompat.b d = new MediaBrowserCompat.b(this);
    public final b<String, MediaBrowserCompat.i> e = new b();
    public MediaBrowserCompat.h f;
    public Messenger g;
    public MediaSessionCompat.Token h;
    
    public d(Context paramContext, ComponentName paramComponentName, MediaBrowserCompat.c paramc)
    {
      a = paramContext;
      Bundle localBundle = new Bundle();
      c = localBundle;
      localBundle.putInt("extra_client_version", 1);
      localBundle.putInt("extra_calling_pid", Process.myPid());
      b = this;
      b = new MediaBrowser(paramContext, paramComponentName, a, localBundle);
    }
    
    public final void a() {}
    
    public final void b() {}
    
    public final void c(Messenger paramMessenger, String paramString, Bundle paramBundle)
    {
      if (g != paramMessenger) {
        return;
      }
      paramMessenger = (MediaBrowserCompat.i)e.getOrDefault(paramString, null);
      if (paramMessenger == null)
      {
        if (MediaBrowserCompat.b)
        {
          paramMessenger = new StringBuilder();
          paramMessenger.append("onLoadChildren for id that isn't subscribed id=");
          paramMessenger.append(paramString);
          Log.d("MediaBrowserCompat", paramMessenger.toString());
        }
        return;
      }
      for (int i = 0; i < b.size(); i++) {
        if (m0.h((Bundle)b.get(i), paramBundle))
        {
          paramMessenger = (MediaBrowserCompat.j)a.get(i);
          break;
        }
      }
    }
  }
  
  public static class e
    extends MediaBrowserCompat.d
  {
    public e(Context paramContext, ComponentName paramComponentName, MediaBrowserCompat.c paramc)
    {
      super(paramComponentName, paramc);
    }
  }
  
  public static final class f
    extends MediaBrowserCompat.e
  {
    public f(Context paramContext, ComponentName paramComponentName, MediaBrowserCompat.c paramc)
    {
      super(paramComponentName, paramc);
    }
  }
  
  public static abstract interface g
  {
    public abstract void a();
    
    public abstract void b();
    
    public abstract void c(Messenger paramMessenger, String paramString, Bundle paramBundle);
  }
  
  public static final class h
  {
    public Messenger a;
    public Bundle b;
    
    public h(IBinder paramIBinder, Bundle paramBundle)
    {
      a = new Messenger(paramIBinder);
      b = paramBundle;
    }
    
    public final void a(int paramInt, Bundle paramBundle, Messenger paramMessenger)
    {
      Message localMessage = Message.obtain();
      what = paramInt;
      arg1 = 1;
      localMessage.setData(paramBundle);
      replyTo = paramMessenger;
      a.send(localMessage);
    }
  }
  
  public static final class i
  {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
  }
  
  public static abstract class j
  {
    public j()
    {
      new Binder();
      if (Build.VERSION.SDK_INT >= 26) {
        new b();
      } else {
        new a();
      }
    }
    
    public class a
      extends MediaBrowser.SubscriptionCallback
    {
      public a() {}
      
      public final void onChildrenLoaded(String paramString, List<MediaBrowser.MediaItem> paramList)
      {
        getClass();
        paramString = MediaBrowserCompat.j.this;
        MediaBrowserCompat.MediaItem.a(paramList);
        paramString.getClass();
      }
      
      public final void onError(String paramString)
      {
        getClass();
      }
    }
    
    public final class b
      extends MediaBrowserCompat.j.a
    {
      public b()
      {
        super();
      }
      
      public final void onChildrenLoaded(String paramString, List<MediaBrowser.MediaItem> paramList, Bundle paramBundle)
      {
        MediaSessionCompat.a(paramBundle);
        paramString = MediaBrowserCompat.j.this;
        MediaBrowserCompat.MediaItem.a(paramList);
        paramString.getClass();
      }
      
      public final void onError(String paramString, Bundle paramBundle)
      {
        MediaSessionCompat.a(paramBundle);
        getClass();
      }
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */