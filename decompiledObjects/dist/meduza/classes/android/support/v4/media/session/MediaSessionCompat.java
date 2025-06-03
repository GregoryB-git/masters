package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.media.session.MediaSession.Callback;
import android.media.session.MediaSession.QueueItem;
import android.media.session.PlaybackState.Builder;
import android.media.session.PlaybackState.CustomAction;
import android.media.session.PlaybackState.CustomAction.Builder;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.BaseBundle;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.versionedparcelable.ParcelImpl;
import b2.e;
import f;
import g1.t;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class MediaSessionCompat
{
  public static int d;
  public final d a;
  public final MediaControllerCompat b;
  public final ArrayList<g> c = new ArrayList();
  
  public MediaSessionCompat(Context paramContext, String paramString, PendingIntent paramPendingIntent)
  {
    if (paramContext != null)
    {
      if (!TextUtils.isEmpty(paramString))
      {
        Object localObject1 = null;
        int i = i1.a.a;
        Object localObject2 = new Intent("android.intent.action.MEDIA_BUTTON");
        ((Intent)localObject2).setPackage(paramContext.getPackageName());
        List localList = paramContext.getPackageManager().queryBroadcastReceivers((Intent)localObject2, 0);
        if (localList.size() == 1)
        {
          localObject1 = get0activityInfo;
          localObject2 = new ComponentName(packageName, name);
        }
        else
        {
          localObject2 = localObject1;
          if (localList.size() > 1)
          {
            Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
            localObject2 = localObject1;
          }
        }
        if (localObject2 == null) {
          Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
        }
        localObject1 = paramPendingIntent;
        if (localObject2 != null)
        {
          localObject1 = paramPendingIntent;
          if (paramPendingIntent == null)
          {
            paramPendingIntent = new Intent("android.intent.action.MEDIA_BUTTON");
            paramPendingIntent.setComponent((ComponentName)localObject2);
            if (Build.VERSION.SDK_INT >= 31) {
              i = 33554432;
            } else {
              i = 0;
            }
            localObject1 = PendingIntent.getBroadcast(paramContext, 0, paramPendingIntent, i);
          }
        }
        i = Build.VERSION.SDK_INT;
        if (i >= 29) {
          paramString = new f(paramContext, paramString);
        } else if (i >= 28) {
          paramString = new e(paramContext, paramString);
        } else {
          paramString = new d(paramContext, paramString);
        }
        a = paramString;
        if (Looper.myLooper() != null) {
          paramPendingIntent = Looper.myLooper();
        } else {
          paramPendingIntent = Looper.getMainLooper();
        }
        paramPendingIntent = new Handler(paramPendingIntent);
        f(new a(), paramPendingIntent);
        a.setMediaButtonReceiver((PendingIntent)localObject1);
        b = new MediaControllerCompat(paramContext, this);
        if (d == 0) {
          d = (int)(TypedValue.applyDimension(1, 320.0F, paramContext.getResources().getDisplayMetrics()) + 0.5F);
        }
        return;
      }
      throw new IllegalArgumentException("tag must not be null or empty");
    }
    throw new IllegalArgumentException("context must not be null");
  }
  
  public static void a(Bundle paramBundle)
  {
    if (paramBundle != null) {
      paramBundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
    }
  }
  
  public static PlaybackStateCompat b(PlaybackStateCompat paramPlaybackStateCompat, MediaMetadataCompat paramMediaMetadataCompat)
  {
    Object localObject1 = paramPlaybackStateCompat;
    if (paramPlaybackStateCompat != null)
    {
      long l1 = b;
      long l2 = -1L;
      if (l1 == -1L)
      {
        localObject1 = paramPlaybackStateCompat;
      }
      else
      {
        int i = a;
        if ((i != 3) && (i != 4))
        {
          localObject1 = paramPlaybackStateCompat;
          if (i != 5) {}
        }
        else
        {
          l1 = p;
          localObject1 = paramPlaybackStateCompat;
          if (l1 > 0L)
          {
            long l3 = SystemClock.elapsedRealtime();
            long l4 = (d * (float)(l3 - l1)) + b;
            l1 = l2;
            if (paramMediaMetadataCompat != null)
            {
              l1 = l2;
              if (a.containsKey("android.media.metadata.DURATION")) {
                l1 = a.getLong("android.media.metadata.DURATION", 0L);
              }
            }
            if ((l1 < 0L) || (l4 <= l1)) {
              if (l4 < 0L) {
                l1 = 0L;
              } else {
                l1 = l4;
              }
            }
            localObject1 = new ArrayList();
            long l5 = c;
            l4 = e;
            i = f;
            paramMediaMetadataCompat = o;
            Object localObject2 = q;
            if (localObject2 != null) {
              ((ArrayList)localObject1).addAll((Collection)localObject2);
            }
            l2 = r;
            localObject2 = s;
            localObject1 = new PlaybackStateCompat(a, l1, l5, d, l4, i, paramMediaMetadataCompat, l3, (ArrayList)localObject1, l2, (Bundle)localObject2);
          }
        }
      }
    }
    return (PlaybackStateCompat)localObject1;
  }
  
  public static Bundle l(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return null;
    }
    a(paramBundle);
    try
    {
      paramBundle.isEmpty();
      return paramBundle;
    }
    catch (BadParcelableException paramBundle)
    {
      Log.e("MediaSessionCompat", "Could not unparcel the data.");
    }
    return null;
  }
  
  public final boolean c()
  {
    return a.a.isActive();
  }
  
  public final void d()
  {
    d locald = a;
    e = true;
    f.kill();
    if (Build.VERSION.SDK_INT == 27) {
      try
      {
        Object localObject = a.getClass().getDeclaredField("mCallback");
        ((AccessibleObject)localObject).setAccessible(true);
        localObject = (Handler)((Field)localObject).get(a);
        if (localObject != null) {
          ((Handler)localObject).removeCallbacksAndMessages(null);
        }
      }
      catch (Exception localException)
      {
        Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", localException);
      }
    }
    a.setCallback(null);
    a.release();
  }
  
  public final void e(boolean paramBoolean)
  {
    a.a.setActive(paramBoolean);
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext()) {
      ((g)localIterator.next()).a();
    }
  }
  
  public final void f(a parama, Handler paramHandler)
  {
    d locald = a;
    if (paramHandler == null) {
      paramHandler = new Handler();
    }
    locald.g(parama, paramHandler);
  }
  
  public final void g(MediaMetadataCompat paramMediaMetadataCompat)
  {
    Object localObject = a;
    i = paramMediaMetadataCompat;
    localObject = a;
    if (paramMediaMetadataCompat == null)
    {
      paramMediaMetadataCompat = null;
    }
    else
    {
      if (b == null)
      {
        Parcel localParcel = Parcel.obtain();
        paramMediaMetadataCompat.writeToParcel(localParcel, 0);
        localParcel.setDataPosition(0);
        b = ((MediaMetadata)MediaMetadata.CREATOR.createFromParcel(localParcel));
        localParcel.recycle();
      }
      paramMediaMetadataCompat = b;
    }
    ((MediaSession)localObject).setMetadata(paramMediaMetadataCompat);
  }
  
  public final void h(PlaybackStateCompat paramPlaybackStateCompat)
  {
    Object localObject1 = a;
    g = paramPlaybackStateCompat;
    for (;;)
    {
      synchronized (c)
      {
        int i = f.beginBroadcast();
        i--;
        if (i >= 0) {
          localObject3 = (IMediaControllerCallback)f.getBroadcastItem(i);
        }
        try
        {
          ((IMediaControllerCallback)localObject3).X2(paramPlaybackStateCompat);
        }
        catch (RemoteException localRemoteException) {}
        f.finishBroadcast();
        Object localObject3 = a;
        if (t == null)
        {
          PlaybackState.Builder localBuilder = PlaybackStateCompat.b.d();
          PlaybackStateCompat.b.x(localBuilder, a, b, d, p);
          PlaybackStateCompat.b.u(localBuilder, c);
          PlaybackStateCompat.b.s(localBuilder, e);
          PlaybackStateCompat.b.v(localBuilder, o);
          Iterator localIterator = q.iterator();
          if (localIterator.hasNext())
          {
            PlaybackStateCompat.CustomAction localCustomAction = (PlaybackStateCompat.CustomAction)localIterator.next();
            localObject1 = e;
            ??? = localObject1;
            if (localObject1 == null)
            {
              ??? = PlaybackStateCompat.b.e(a, b, c);
              PlaybackStateCompat.b.w((PlaybackState.CustomAction.Builder)???, d);
              ??? = PlaybackStateCompat.b.b((PlaybackState.CustomAction.Builder)???);
            }
            PlaybackStateCompat.b.a(localBuilder, (PlaybackState.CustomAction)???);
            continue;
          }
          PlaybackStateCompat.b.t(localBuilder, r);
          PlaybackStateCompat.c.b(localBuilder, s);
          t = PlaybackStateCompat.b.c(localBuilder);
        }
        ((MediaSession)localObject3).setPlaybackState(t);
        return;
      }
    }
  }
  
  public final void i(List<QueueItem> paramList)
  {
    Object localObject1;
    Object localObject3;
    Object localObject4;
    if (paramList != null)
    {
      localObject1 = new HashSet();
      localObject2 = paramList.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (QueueItem)((Iterator)localObject2).next();
        if (localObject3 != null)
        {
          if (((HashSet)localObject1).contains(Long.valueOf(b)))
          {
            localObject4 = f.l("Found duplicate queue id: ");
            ((StringBuilder)localObject4).append(b);
            Log.e("MediaSessionCompat", ((StringBuilder)localObject4).toString(), new IllegalArgumentException("id of each queue item should be unique"));
          }
          ((HashSet)localObject1).add(Long.valueOf(b));
        }
        else
        {
          throw new IllegalArgumentException("queue shouldn't have null items");
        }
      }
    }
    Object localObject2 = a;
    h = paramList;
    if (paramList == null)
    {
      paramList = a;
      localObject1 = null;
    }
    else
    {
      localObject1 = new ArrayList(paramList.size());
      localObject4 = paramList.iterator();
      while (((Iterator)localObject4).hasNext())
      {
        QueueItem localQueueItem = (QueueItem)((Iterator)localObject4).next();
        localObject3 = c;
        paramList = (List<QueueItem>)localObject3;
        if (localObject3 == null)
        {
          paramList = MediaSessionCompat.QueueItem.b.a(a.b(), b);
          c = paramList;
        }
        ((ArrayList)localObject1).add(paramList);
      }
      paramList = a;
    }
    paramList.setQueue((List)localObject1);
  }
  
  public final void j(int paramInt)
  {
    d locald = a;
    if (k != paramInt) {
      k = paramInt;
    }
    for (;;)
    {
      synchronized (c)
      {
        int i = f.beginBroadcast();
        i--;
        IMediaControllerCallback localIMediaControllerCallback;
        if (i >= 0) {
          localIMediaControllerCallback = (IMediaControllerCallback)f.getBroadcastItem(i);
        }
        try
        {
          localIMediaControllerCallback.q(paramInt);
        }
        catch (RemoteException localRemoteException) {}
        f.finishBroadcast();
      }
      return;
    }
  }
  
  public final void k(int paramInt)
  {
    d locald = a;
    if (l != paramInt) {
      l = paramInt;
    }
    for (;;)
    {
      synchronized (c)
      {
        int i = f.beginBroadcast();
        i--;
        IMediaControllerCallback localIMediaControllerCallback;
        if (i >= 0) {
          localIMediaControllerCallback = (IMediaControllerCallback)f.getBroadcastItem(i);
        }
        try
        {
          localIMediaControllerCallback.g2(paramInt);
        }
        catch (RemoteException localRemoteException) {}
        f.finishBroadcast();
      }
      return;
    }
  }
  
  public static final class QueueItem
    implements Parcelable
  {
    public static final Parcelable.Creator<QueueItem> CREATOR = new a();
    public final MediaDescriptionCompat a;
    public final long b;
    public MediaSession.QueueItem c;
    
    public QueueItem(MediaSession.QueueItem paramQueueItem, MediaDescriptionCompat paramMediaDescriptionCompat, long paramLong)
    {
      if (paramMediaDescriptionCompat != null)
      {
        if (paramLong != -1L)
        {
          a = paramMediaDescriptionCompat;
          b = paramLong;
          c = paramQueueItem;
          return;
        }
        throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
      }
      throw new IllegalArgumentException("Description cannot be null");
    }
    
    public QueueItem(Parcel paramParcel)
    {
      a = ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel));
      b = paramParcel.readLong();
    }
    
    public static ArrayList a(List paramList)
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
            paramList = (MediaSession.QueueItem)paramList;
            paramList = new QueueItem(paramList, MediaDescriptionCompat.a(b.b(paramList)), b.c(paramList));
          }
          else
          {
            paramList = null;
          }
          localArrayList.add(paramList);
        }
        return localArrayList;
      }
      return null;
    }
    
    public final int describeContents()
    {
      return 0;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = f.l("MediaSession.QueueItem {Description=");
      localStringBuilder.append(a);
      localStringBuilder.append(", Id=");
      localStringBuilder.append(b);
      localStringBuilder.append(" }");
      return localStringBuilder.toString();
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      a.writeToParcel(paramParcel, paramInt);
      paramParcel.writeLong(b);
    }
    
    public final class a
      implements Parcelable.Creator<MediaSessionCompat.QueueItem>
    {
      public final Object createFromParcel(Parcel paramParcel)
      {
        return new MediaSessionCompat.QueueItem(paramParcel);
      }
      
      public final Object[] newArray(int paramInt)
      {
        return new MediaSessionCompat.QueueItem[paramInt];
      }
    }
    
    public static final class b
    {
      public static MediaSession.QueueItem a(MediaDescription paramMediaDescription, long paramLong)
      {
        return new MediaSession.QueueItem(paramMediaDescription, paramLong);
      }
      
      public static MediaDescription b(MediaSession.QueueItem paramQueueItem)
      {
        return paramQueueItem.getDescription();
      }
      
      public static long c(MediaSession.QueueItem paramQueueItem)
      {
        return paramQueueItem.getQueueId();
      }
    }
  }
  
  public static final class ResultReceiverWrapper
    implements Parcelable
  {
    public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();
    public ResultReceiver a;
    
    public ResultReceiverWrapper(Parcel paramParcel)
    {
      a = ((ResultReceiver)ResultReceiver.CREATOR.createFromParcel(paramParcel));
    }
    
    public final int describeContents()
    {
      return 0;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      a.writeToParcel(paramParcel, paramInt);
    }
    
    public final class a
      implements Parcelable.Creator<MediaSessionCompat.ResultReceiverWrapper>
    {
      public final Object createFromParcel(Parcel paramParcel)
      {
        return new MediaSessionCompat.ResultReceiverWrapper(paramParcel);
      }
      
      public final Object[] newArray(int paramInt)
      {
        return new MediaSessionCompat.ResultReceiverWrapper[paramInt];
      }
    }
  }
  
  public static final class Token
    implements Parcelable
  {
    public static final Parcelable.Creator<Token> CREATOR = new a();
    public final Object a = new Object();
    public final Object b;
    public IMediaSession c;
    public e d;
    
    public Token(Object paramObject, IMediaSession paramIMediaSession, e parame)
    {
      b = paramObject;
      c = paramIMediaSession;
      d = parame;
    }
    
    public final IMediaSession a()
    {
      synchronized (a)
      {
        IMediaSession localIMediaSession = c;
        return localIMediaSession;
      }
    }
    
    public final Bundle b()
    {
      Bundle localBundle1 = new Bundle();
      localBundle1.putParcelable("android.support.v4.media.session.TOKEN", this);
      synchronized (a)
      {
        Object localObject3 = c;
        if (localObject3 != null) {
          localBundle1.putBinder("android.support.v4.media.session.EXTRA_BINDER", ((IInterface)localObject3).asBinder());
        }
        localObject3 = d;
        if (localObject3 != null)
        {
          Bundle localBundle2 = new android/os/Bundle;
          localBundle2.<init>();
          ParcelImpl localParcelImpl = new androidx/versionedparcelable/ParcelImpl;
          localParcelImpl.<init>((e)localObject3);
          localBundle2.putParcelable("a", localParcelImpl);
          localBundle1.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", localBundle2);
        }
        return localBundle1;
      }
    }
    
    public final int describeContents()
    {
      return 0;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof Token)) {
        return false;
      }
      Object localObject = (Token)paramObject;
      paramObject = b;
      localObject = b;
      if (paramObject == null)
      {
        if (localObject != null) {
          bool = false;
        }
        return bool;
      }
      if (localObject == null) {
        return false;
      }
      return paramObject.equals(localObject);
    }
    
    public final int hashCode()
    {
      Object localObject = b;
      if (localObject == null) {
        return 0;
      }
      return localObject.hashCode();
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeParcelable((Parcelable)b, paramInt);
    }
    
    public final class a
      implements Parcelable.Creator<MediaSessionCompat.Token>
    {
      public final Object createFromParcel(Parcel paramParcel)
      {
        return new MediaSessionCompat.Token(paramParcel.readParcelable(null), null, null);
      }
      
      public final Object[] newArray(int paramInt)
      {
        return new MediaSessionCompat.Token[paramInt];
      }
    }
  }
  
  public static abstract class a
  {
    public final Object a = new Object();
    public final b b = new b();
    public boolean c;
    public WeakReference<MediaSessionCompat.b> d = new WeakReference(null);
    public a e;
    
    public void A0(int paramInt) {}
    
    public final void B(MediaSessionCompat.b paramb, a parama)
    {
      if (!c) {
        return;
      }
      int i = 0;
      c = false;
      parama.removeMessages(1);
      paramb = paramb.d();
      long l;
      if (paramb == null) {
        l = 0L;
      } else {
        l = e;
      }
      int j;
      if ((paramb != null) && (a == 3)) {
        j = 1;
      } else {
        j = 0;
      }
      int k;
      if ((0x204 & l) != 0L) {
        k = 1;
      } else {
        k = 0;
      }
      if ((l & 0x202) != 0L) {
        i = 1;
      }
      if ((j != 0) && (i != 0)) {
        U();
      } else if ((j == 0) && (k != 0)) {
        V();
      }
    }
    
    public void B0() {}
    
    public void C0() {}
    
    public void D0(long paramLong) {}
    
    public void E(MediaDescriptionCompat paramMediaDescriptionCompat) {}
    
    public void E0() {}
    
    public final void F0(MediaSessionCompat.b paramb, Handler paramHandler)
    {
      synchronized (a)
      {
        Object localObject2 = new java/lang/ref/WeakReference;
        ((WeakReference)localObject2).<init>(paramb);
        d = ((WeakReference)localObject2);
        localObject2 = e;
        Object localObject3 = null;
        if (localObject2 != null) {
          ((Handler)localObject2).removeCallbacksAndMessages(null);
        }
        localObject2 = localObject3;
        if (paramb != null) {
          if (paramHandler == null) {
            localObject2 = localObject3;
          } else {
            localObject2 = new a(paramHandler.getLooper());
          }
        }
        e = ((a)localObject2);
        return;
      }
    }
    
    public void H(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt) {}
    
    public void M(String paramString, Bundle paramBundle, ResultReceiver paramResultReceiver) {}
    
    public void O(String paramString, Bundle paramBundle) {}
    
    public void P() {}
    
    public boolean Q(Intent paramIntent)
    {
      if (Build.VERSION.SDK_INT >= 27) {
        return false;
      }
      synchronized (a)
      {
        MediaSessionCompat.b localb = (MediaSessionCompat.b)d.get();
        a locala = e;
        if ((localb != null) && (locala != null))
        {
          ??? = (KeyEvent)paramIntent.getParcelableExtra("android.intent.extra.KEY_EVENT");
          if ((??? != null) && (((KeyEvent)???).getAction() == 0))
          {
            paramIntent = localb.c();
            int i = ((KeyEvent)???).getKeyCode();
            if ((i != 79) && (i != 85))
            {
              B(localb, locala);
              return false;
            }
            if (((KeyEvent)???).getRepeatCount() == 0)
            {
              if (c)
              {
                locala.removeMessages(1);
                c = false;
                paramIntent = localb.d();
                long l;
                if (paramIntent == null) {
                  l = 0L;
                } else {
                  l = e;
                }
                if ((l & 0x20) != 0L) {
                  B0();
                }
              }
              else
              {
                c = true;
                locala.sendMessageDelayed(locala.obtainMessage(1, paramIntent), ViewConfiguration.getDoubleTapTimeout());
              }
            }
            else {
              B(localb, locala);
            }
            return true;
          }
        }
        return false;
      }
    }
    
    public void U() {}
    
    public void V() {}
    
    public void f0(String paramString, Bundle paramBundle) {}
    
    public void h0(String paramString, Bundle paramBundle) {}
    
    public void j0(Uri paramUri, Bundle paramBundle) {}
    
    public void n0() {}
    
    public void o0(String paramString, Bundle paramBundle) {}
    
    public void q0(String paramString, Bundle paramBundle) {}
    
    public void r0(Uri paramUri, Bundle paramBundle) {}
    
    public void s0(MediaDescriptionCompat paramMediaDescriptionCompat) {}
    
    public void t0() {}
    
    public void u0(long paramLong) {}
    
    public void v0(boolean paramBoolean) {}
    
    public void w0(float paramFloat) {}
    
    public void x0(RatingCompat paramRatingCompat) {}
    
    public void y0(RatingCompat paramRatingCompat, Bundle paramBundle) {}
    
    public void z0(int paramInt) {}
    
    public final class a
      extends Handler
    {
      public a(Looper paramLooper)
      {
        super();
      }
      
      public final void handleMessage(Message paramMessage)
      {
        if (what == 1) {
          synchronized (a)
          {
            MediaSessionCompat.b localb = (MediaSessionCompat.b)d.get();
            MediaSessionCompat.a locala = MediaSessionCompat.a.this;
            a locala1 = e;
            if ((localb != null) && (locala == localb.a()) && (locala1 != null))
            {
              localb.b((t)obj);
              B(localb, locala1);
              localb.b(null);
            }
            else {}
          }
        }
      }
    }
    
    public final class b
      extends MediaSession.Callback
    {
      public b() {}
      
      public static void b(MediaSessionCompat.c paramc)
      {
        if (Build.VERSION.SDK_INT >= 28) {
          return;
        }
        String str1 = paramc.f();
        String str2 = str1;
        if (TextUtils.isEmpty(str1)) {
          str2 = "android.media.session.MediaController";
        }
        paramc.b(new t(str2, -1, -1));
      }
      
      public final MediaSessionCompat.c a()
      {
        synchronized (a)
        {
          MediaSessionCompat.c localc = (MediaSessionCompat.c)d.get();
          if ((localc == null) || (MediaSessionCompat.a.this != localc.a())) {
            localc = null;
          }
          return localc;
        }
      }
      
      public final void onCommand(String arg1, Bundle paramBundle, ResultReceiver paramResultReceiver)
      {
        MediaSessionCompat.c localc = a();
        if (localc == null) {
          return;
        }
        MediaSessionCompat.a(paramBundle);
        b(localc);
        try
        {
          if (???.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER"))
          {
            paramBundle = new android/os/Bundle;
            paramBundle.<init>();
            Object localObject = b;
            ??? = ((MediaSessionCompat.Token)localObject).a();
            if (??? == null) {
              ??? = null;
            } else {
              ??? = ???.asBinder();
            }
            paramBundle.putBinder("android.support.v4.media.session.EXTRA_BINDER", ???);
            synchronized (a)
            {
              localObject = d;
              if (localObject != null)
              {
                Bundle localBundle = new android/os/Bundle;
                localBundle.<init>();
                ??? = new androidx/versionedparcelable/ParcelImpl;
                ???.<init>((e)localObject);
                localBundle.putParcelable("a", ???);
                paramBundle.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", localBundle);
              }
              paramResultReceiver.send(0, paramBundle);
            }
          }
          boolean bool = ???.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM");
          if (bool)
          {
            E((MediaDescriptionCompat)paramBundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
          }
          else
          {
            bool = ???.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT");
            if (bool) {
              H((MediaDescriptionCompat)paramBundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), paramBundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
            } else if (???.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
              s0((MediaDescriptionCompat)paramBundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
            } else if (???.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT"))
            {
              if (h != null)
              {
                int i = paramBundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                if ((i >= 0) && (i < h.size())) {
                  ??? = (MediaSessionCompat.QueueItem)h.get(i);
                } else {
                  ??? = null;
                }
                if (??? != null) {
                  s0(a);
                }
              }
            }
            else {
              M(???, paramBundle, paramResultReceiver);
            }
          }
        }
        catch (BadParcelableException ???)
        {
          Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        localc.b(null);
      }
      
      public final void onCustomAction(String paramString, Bundle paramBundle)
      {
        MediaSessionCompat.c localc = a();
        if (localc == null) {
          return;
        }
        MediaSessionCompat.a(paramBundle);
        b(localc);
        try
        {
          boolean bool = paramString.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
          if (bool)
          {
            paramString = (Uri)paramBundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
            paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
            MediaSessionCompat.a(paramBundle);
            j0(paramString, paramBundle);
          }
          else if (paramString.equals("android.support.v4.media.session.action.PREPARE"))
          {
            n0();
          }
          else if (paramString.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID"))
          {
            paramString = paramBundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
            paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
            MediaSessionCompat.a(paramBundle);
            o0(paramString, paramBundle);
          }
          else if (paramString.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH"))
          {
            paramString = paramBundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
            paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
            MediaSessionCompat.a(paramBundle);
            q0(paramString, paramBundle);
          }
          else if (paramString.equals("android.support.v4.media.session.action.PREPARE_FROM_URI"))
          {
            paramString = (Uri)paramBundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
            paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
            MediaSessionCompat.a(paramBundle);
            r0(paramString, paramBundle);
          }
          else if (paramString.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED"))
          {
            bool = paramBundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
            v0(bool);
          }
          else
          {
            int i;
            if (paramString.equals("android.support.v4.media.session.action.SET_REPEAT_MODE"))
            {
              i = paramBundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
              z0(i);
            }
            else if (paramString.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE"))
            {
              i = paramBundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
              A0(i);
            }
            else if (paramString.equals("android.support.v4.media.session.action.SET_RATING"))
            {
              paramString = (RatingCompat)paramBundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
              paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
              MediaSessionCompat.a(paramBundle);
              y0(paramString, paramBundle);
            }
            else if (paramString.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED"))
            {
              float f = paramBundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0F);
              w0(f);
            }
            else
            {
              O(paramString, paramBundle);
            }
          }
        }
        catch (BadParcelableException paramString)
        {
          Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        localc.b(null);
      }
      
      public final void onFastForward()
      {
        MediaSessionCompat.c localc = a();
        if (localc == null) {
          return;
        }
        b(localc);
        P();
        localc.b(null);
      }
      
      public final boolean onMediaButtonEvent(Intent paramIntent)
      {
        MediaSessionCompat.c localc = a();
        boolean bool1 = false;
        if (localc == null) {
          return false;
        }
        b(localc);
        boolean bool2 = Q(paramIntent);
        localc.b(null);
        if ((bool2) || (super.onMediaButtonEvent(paramIntent))) {
          bool1 = true;
        }
        return bool1;
      }
      
      public final void onPause()
      {
        MediaSessionCompat.c localc = a();
        if (localc == null) {
          return;
        }
        b(localc);
        U();
        localc.b(null);
      }
      
      public final void onPlay()
      {
        MediaSessionCompat.c localc = a();
        if (localc == null) {
          return;
        }
        b(localc);
        V();
        localc.b(null);
      }
      
      public final void onPlayFromMediaId(String paramString, Bundle paramBundle)
      {
        MediaSessionCompat.c localc = a();
        if (localc == null) {
          return;
        }
        MediaSessionCompat.a(paramBundle);
        b(localc);
        f0(paramString, paramBundle);
        localc.b(null);
      }
      
      public final void onPlayFromSearch(String paramString, Bundle paramBundle)
      {
        MediaSessionCompat.c localc = a();
        if (localc == null) {
          return;
        }
        MediaSessionCompat.a(paramBundle);
        b(localc);
        h0(paramString, paramBundle);
        localc.b(null);
      }
      
      public final void onPlayFromUri(Uri paramUri, Bundle paramBundle)
      {
        MediaSessionCompat.c localc = a();
        if (localc == null) {
          return;
        }
        MediaSessionCompat.a(paramBundle);
        b(localc);
        j0(paramUri, paramBundle);
        localc.b(null);
      }
      
      public final void onPrepare()
      {
        MediaSessionCompat.c localc = a();
        if (localc == null) {
          return;
        }
        b(localc);
        n0();
        localc.b(null);
      }
      
      public final void onPrepareFromMediaId(String paramString, Bundle paramBundle)
      {
        MediaSessionCompat.c localc = a();
        if (localc == null) {
          return;
        }
        MediaSessionCompat.a(paramBundle);
        b(localc);
        o0(paramString, paramBundle);
        localc.b(null);
      }
      
      public final void onPrepareFromSearch(String paramString, Bundle paramBundle)
      {
        MediaSessionCompat.c localc = a();
        if (localc == null) {
          return;
        }
        MediaSessionCompat.a(paramBundle);
        b(localc);
        q0(paramString, paramBundle);
        localc.b(null);
      }
      
      public final void onPrepareFromUri(Uri paramUri, Bundle paramBundle)
      {
        MediaSessionCompat.c localc = a();
        if (localc == null) {
          return;
        }
        MediaSessionCompat.a(paramBundle);
        b(localc);
        r0(paramUri, paramBundle);
        localc.b(null);
      }
      
      public final void onRewind()
      {
        MediaSessionCompat.c localc = a();
        if (localc == null) {
          return;
        }
        b(localc);
        t0();
        localc.b(null);
      }
      
      public final void onSeekTo(long paramLong)
      {
        MediaSessionCompat.c localc = a();
        if (localc == null) {
          return;
        }
        b(localc);
        u0(paramLong);
        localc.b(null);
      }
      
      public final void onSetPlaybackSpeed(float paramFloat)
      {
        MediaSessionCompat.c localc = a();
        if (localc == null) {
          return;
        }
        b(localc);
        w0(paramFloat);
        localc.b(null);
      }
      
      public final void onSetRating(Rating paramRating)
      {
        MediaSessionCompat.c localc = a();
        if (localc == null) {
          return;
        }
        b(localc);
        x0(RatingCompat.a(paramRating));
        localc.b(null);
      }
      
      public final void onSkipToNext()
      {
        MediaSessionCompat.c localc = a();
        if (localc == null) {
          return;
        }
        b(localc);
        B0();
        localc.b(null);
      }
      
      public final void onSkipToPrevious()
      {
        MediaSessionCompat.c localc = a();
        if (localc == null) {
          return;
        }
        b(localc);
        C0();
        localc.b(null);
      }
      
      public final void onSkipToQueueItem(long paramLong)
      {
        MediaSessionCompat.c localc = a();
        if (localc == null) {
          return;
        }
        b(localc);
        D0(paramLong);
        localc.b(null);
      }
      
      public final void onStop()
      {
        MediaSessionCompat.c localc = a();
        if (localc == null) {
          return;
        }
        b(localc);
        E0();
        localc.b(null);
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract MediaSessionCompat.a a();
    
    public abstract void b(t paramt);
    
    public abstract t c();
    
    public abstract PlaybackStateCompat d();
  }
  
  public static class c
    implements MediaSessionCompat.b
  {
    public final MediaSession a;
    public final MediaSessionCompat.Token b;
    public final Object c = new Object();
    public Bundle d;
    public boolean e = false;
    public final RemoteCallbackList<IMediaControllerCallback> f = new RemoteCallbackList();
    public PlaybackStateCompat g;
    public List<MediaSessionCompat.QueueItem> h;
    public MediaMetadataCompat i;
    public boolean j;
    public int k;
    public int l;
    public MediaSessionCompat.a m;
    public t n;
    
    public c(Context paramContext, String paramString)
    {
      paramContext = e(paramContext, paramString);
      a = paramContext;
      b = new MediaSessionCompat.Token(paramContext.getSessionToken(), new a((MediaSessionCompat.d)this), null);
      d = null;
      paramContext.setFlags(3);
    }
    
    public final MediaSessionCompat.a a()
    {
      synchronized (c)
      {
        MediaSessionCompat.a locala = m;
        return locala;
      }
    }
    
    public void b(t paramt)
    {
      synchronized (c)
      {
        n = paramt;
        return;
      }
    }
    
    public t c()
    {
      synchronized (c)
      {
        t localt = n;
        return localt;
      }
    }
    
    public final PlaybackStateCompat d()
    {
      return g;
    }
    
    public MediaSession e(Context paramContext, String paramString)
    {
      return new MediaSession(paramContext, paramString);
    }
    
    public final String f()
    {
      if (Build.VERSION.SDK_INT < 24) {
        return null;
      }
      try
      {
        String str = (String)a.getClass().getMethod("getCallingPackage", new Class[0]).invoke(a, new Object[0]);
        return str;
      }
      catch (Exception localException)
      {
        Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", localException);
      }
      return null;
    }
    
    public final void g(MediaSessionCompat.a parama, Handler paramHandler)
    {
      synchronized (c)
      {
        m = parama;
        MediaSession localMediaSession = a;
        MediaSessionCompat.a.b localb;
        if (parama == null) {
          localb = null;
        } else {
          localb = b;
        }
        localMediaSession.setCallback(localb, paramHandler);
        if (parama != null) {
          parama.F0(this, paramHandler);
        }
        return;
      }
    }
    
    public final class a
      extends IMediaSession.Stub
    {
      public a() {}
      
      public final void B2(long paramLong)
      {
        throw new AssertionError();
      }
      
      public final CharSequence C0()
      {
        throw new AssertionError();
      }
      
      public final void C1(RatingCompat paramRatingCompat, Bundle paramBundle)
      {
        throw new AssertionError();
      }
      
      public final ParcelableVolumeInfo E2()
      {
        throw new AssertionError();
      }
      
      public final void F0(Bundle paramBundle, String paramString)
      {
        throw new AssertionError();
      }
      
      public final void F1(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
      {
        throw new AssertionError();
      }
      
      public final void G(IMediaControllerCallback arg1)
      {
        if (e) {
          return;
        }
        t localt = new t("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid());
        f.register(???, localt);
        synchronized (c)
        {
          getClass();
          return;
        }
      }
      
      public final MediaMetadataCompat H0()
      {
        throw new AssertionError();
      }
      
      public final void J0(IMediaControllerCallback arg1)
      {
        f.unregister(???);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (c)
        {
          getClass();
          return;
        }
      }
      
      public final void J1(boolean paramBoolean)
      {
        throw new AssertionError();
      }
      
      public final void L2(int paramInt)
      {
        throw new AssertionError();
      }
      
      public final void M() {}
      
      public final void N(RatingCompat paramRatingCompat)
      {
        throw new AssertionError();
      }
      
      public final void O(Bundle paramBundle, String paramString)
      {
        throw new AssertionError();
      }
      
      public final String Q2()
      {
        throw new AssertionError();
      }
      
      public final void R(Uri paramUri, Bundle paramBundle)
      {
        throw new AssertionError();
      }
      
      public final void R0(int paramInt1, int paramInt2)
      {
        throw new AssertionError();
      }
      
      public final void V0(Uri paramUri, Bundle paramBundle)
      {
        throw new AssertionError();
      }
      
      public final void W2(Bundle paramBundle, String paramString)
      {
        throw new AssertionError();
      }
      
      public final void Y(MediaDescriptionCompat paramMediaDescriptionCompat)
      {
        throw new AssertionError();
      }
      
      public final boolean Z()
      {
        throw new AssertionError();
      }
      
      public final void a()
      {
        throw new AssertionError();
      }
      
      public final void a0() {}
      
      public final int a2()
      {
        return l;
      }
      
      public final void b()
      {
        throw new AssertionError();
      }
      
      public final void b0(MediaDescriptionCompat paramMediaDescriptionCompat)
      {
        throw new AssertionError();
      }
      
      public final void b2(int paramInt)
      {
        throw new AssertionError();
      }
      
      public final void c1(long paramLong)
      {
        throw new AssertionError();
      }
      
      public final PlaybackStateCompat d()
      {
        MediaSessionCompat.c localc = MediaSessionCompat.c.this;
        return MediaSessionCompat.b(g, i);
      }
      
      public final PendingIntent d0()
      {
        throw new AssertionError();
      }
      
      public final boolean e2()
      {
        return j;
      }
      
      public final Bundle getExtras()
      {
        throw new AssertionError();
      }
      
      public final void i0()
      {
        getClass();
      }
      
      public final Bundle j()
      {
        Bundle localBundle;
        if (d == null) {
          localBundle = null;
        } else {
          localBundle = new Bundle(d);
        }
        return localBundle;
      }
      
      public final void k2(Bundle paramBundle, String paramString)
      {
        throw new AssertionError();
      }
      
      public final void l()
      {
        throw new AssertionError();
      }
      
      public final void n2(String paramString, Bundle paramBundle, MediaSessionCompat.ResultReceiverWrapper paramResultReceiverWrapper)
      {
        throw new AssertionError();
      }
      
      public final void next()
      {
        throw new AssertionError();
      }
      
      public final List<MediaSessionCompat.QueueItem> o2()
      {
        return null;
      }
      
      public final String p()
      {
        throw new AssertionError();
      }
      
      public final void pause()
      {
        throw new AssertionError();
      }
      
      public final void previous()
      {
        throw new AssertionError();
      }
      
      public final void r1(float paramFloat)
      {
        throw new AssertionError();
      }
      
      public final void stop()
      {
        throw new AssertionError();
      }
      
      public final void u(int paramInt)
      {
        throw new AssertionError();
      }
      
      public final boolean u1(KeyEvent paramKeyEvent)
      {
        throw new AssertionError();
      }
      
      public final void v()
      {
        throw new AssertionError();
      }
      
      public final long w()
      {
        throw new AssertionError();
      }
      
      public final int x()
      {
        return k;
      }
      
      public final void x2(Bundle paramBundle, String paramString)
      {
        throw new AssertionError();
      }
      
      public final void y0(int paramInt1, int paramInt2)
      {
        throw new AssertionError();
      }
    }
  }
  
  public static class d
    extends MediaSessionCompat.c
  {
    public d(Context paramContext, String paramString)
    {
      super(paramString);
    }
  }
  
  public static class e
    extends MediaSessionCompat.d
  {
    public e(Context paramContext, String paramString)
    {
      super(paramString);
    }
    
    public final void b(t paramt) {}
    
    public final t c()
    {
      return new t(b.d(a));
    }
  }
  
  public static final class f
    extends MediaSessionCompat.e
  {
    public f(Context paramContext, String paramString)
    {
      super(paramString);
    }
    
    public final MediaSession e(Context paramContext, String paramString)
    {
      return new MediaSession(paramContext, paramString, null);
    }
  }
  
  public static abstract interface g
  {
    public abstract void a();
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */