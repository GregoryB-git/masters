package android.support.v4.media.session;

import a0.f;
import a0.o;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.AudioAttributes.Builder;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.MediaSession.Callback;
import android.media.session.MediaSession.QueueItem;
import android.media.session.MediaSession.Token;
import android.media.session.PlaybackState;
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
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class MediaSessionCompat
{
  public static int d;
  public final c a;
  public final MediaControllerCompat b;
  public final ArrayList c = new ArrayList();
  
  public MediaSessionCompat(Context paramContext, String paramString)
  {
    this(paramContext, paramString, null, null);
  }
  
  public MediaSessionCompat(Context paramContext, String paramString, ComponentName paramComponentName, PendingIntent paramPendingIntent)
  {
    this(paramContext, paramString, paramComponentName, paramPendingIntent, null);
  }
  
  public MediaSessionCompat(Context paramContext, String paramString, ComponentName paramComponentName, PendingIntent paramPendingIntent, Bundle paramBundle)
  {
    this(paramContext, paramString, paramComponentName, paramPendingIntent, paramBundle, null);
  }
  
  public MediaSessionCompat(Context paramContext, String paramString, ComponentName paramComponentName, PendingIntent paramPendingIntent, Bundle paramBundle, v1.d paramd)
  {
    if (paramContext != null)
    {
      if (!TextUtils.isEmpty(paramString))
      {
        ComponentName localComponentName = paramComponentName;
        if (paramComponentName == null)
        {
          paramComponentName = c0.d.a(paramContext);
          localComponentName = paramComponentName;
          if (paramComponentName == null)
          {
            Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
            localComponentName = paramComponentName;
          }
        }
        paramComponentName = paramPendingIntent;
        if (localComponentName != null)
        {
          paramComponentName = paramPendingIntent;
          if (paramPendingIntent == null)
          {
            paramComponentName = new Intent("android.intent.action.MEDIA_BUTTON");
            paramComponentName.setComponent(localComponentName);
            if (Build.VERSION.SDK_INT >= 31) {
              i = 33554432;
            } else {
              i = 0;
            }
            paramComponentName = PendingIntent.getBroadcast(paramContext, 0, paramComponentName, i);
          }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
          paramString = new g(paramContext, paramString, paramd, paramBundle);
        }
        for (;;)
        {
          a = paramString;
          break;
          if (i >= 28) {
            paramString = new f(paramContext, paramString, paramd, paramBundle);
          } else {
            paramString = new e(paramContext, paramString, paramd, paramBundle);
          }
        }
        if (Looper.myLooper() != null) {
          paramString = Looper.myLooper();
        } else {
          paramString = Looper.getMainLooper();
        }
        paramString = new Handler(paramString);
        i(new a(), paramString);
        a.q(paramComponentName);
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
  
  public static PlaybackStateCompat d(PlaybackStateCompat paramPlaybackStateCompat, MediaMetadataCompat paramMediaMetadataCompat)
  {
    PlaybackStateCompat localPlaybackStateCompat = paramPlaybackStateCompat;
    if (paramPlaybackStateCompat != null)
    {
      long l1 = paramPlaybackStateCompat.f();
      long l2 = -1L;
      if (l1 == -1L)
      {
        localPlaybackStateCompat = paramPlaybackStateCompat;
      }
      else if ((paramPlaybackStateCompat.g() != 3) && (paramPlaybackStateCompat.g() != 4))
      {
        localPlaybackStateCompat = paramPlaybackStateCompat;
        if (paramPlaybackStateCompat.g() != 5) {}
      }
      else
      {
        l1 = paramPlaybackStateCompat.c();
        localPlaybackStateCompat = paramPlaybackStateCompat;
        if (l1 > 0L)
        {
          long l3 = SystemClock.elapsedRealtime();
          long l4 = (paramPlaybackStateCompat.d() * (float)(l3 - l1)) + paramPlaybackStateCompat.f();
          l1 = l2;
          if (paramMediaMetadataCompat != null)
          {
            l1 = l2;
            if (paramMediaMetadataCompat.a("android.media.metadata.DURATION")) {
              l1 = paramMediaMetadataCompat.f("android.media.metadata.DURATION");
            }
          }
          if ((l1 < 0L) || (l4 <= l1)) {
            if (l4 < 0L) {
              l1 = 0L;
            } else {
              l1 = l4;
            }
          }
          localPlaybackStateCompat = new PlaybackStateCompat.d(paramPlaybackStateCompat).h(paramPlaybackStateCompat.g(), l1, paramPlaybackStateCompat.d(), l3).b();
        }
      }
    }
    return localPlaybackStateCompat;
  }
  
  public static Bundle u(Bundle paramBundle)
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
  
  public MediaControllerCompat b()
  {
    return b;
  }
  
  public Token c()
  {
    return a.b();
  }
  
  public boolean e()
  {
    return a.a();
  }
  
  public void f()
  {
    a.release();
  }
  
  public void g(boolean paramBoolean)
  {
    a.g(paramBoolean);
    Iterator localIterator = c.iterator();
    if (!localIterator.hasNext()) {
      return;
    }
    android.support.v4.media.a.a(localIterator.next());
    throw null;
  }
  
  public void h(b paramb)
  {
    i(paramb, null);
  }
  
  public void i(b paramb, Handler paramHandler)
  {
    if (paramb == null)
    {
      a.m(null, null);
    }
    else
    {
      c localc = a;
      if (paramHandler == null) {
        paramHandler = new Handler();
      }
      localc.m(paramb, paramHandler);
    }
  }
  
  public void j(boolean paramBoolean)
  {
    a.k(paramBoolean);
  }
  
  public void k(int paramInt)
  {
    a.c(paramInt);
  }
  
  public void l(PendingIntent paramPendingIntent)
  {
    a.q(paramPendingIntent);
  }
  
  public void m(MediaMetadataCompat paramMediaMetadataCompat)
  {
    a.p(paramMediaMetadataCompat);
  }
  
  public void n(PlaybackStateCompat paramPlaybackStateCompat)
  {
    a.l(paramPlaybackStateCompat);
  }
  
  public void o(int paramInt)
  {
    a.n(paramInt);
  }
  
  public void p(o paramo)
  {
    if (paramo != null)
    {
      a.r(paramo);
      return;
    }
    throw new IllegalArgumentException("volumeProvider may not be null!");
  }
  
  public void q(List paramList)
  {
    if (paramList != null)
    {
      HashSet localHashSet = new HashSet();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        QueueItem localQueueItem = (QueueItem)localIterator.next();
        if (localQueueItem != null)
        {
          if (localHashSet.contains(Long.valueOf(localQueueItem.d())))
          {
            StringBuilder localStringBuilder = new StringBuilder();
            localStringBuilder.append("Found duplicate queue id: ");
            localStringBuilder.append(localQueueItem.d());
            Log.e("MediaSessionCompat", localStringBuilder.toString(), new IllegalArgumentException("id of each queue item should be unique"));
          }
          localHashSet.add(Long.valueOf(localQueueItem.d()));
        }
        else
        {
          throw new IllegalArgumentException("queue shouldn't have null items");
        }
      }
    }
    a.e(paramList);
  }
  
  public void r(int paramInt)
  {
    a.i(paramInt);
  }
  
  public void s(PendingIntent paramPendingIntent)
  {
    a.j(paramPendingIntent);
  }
  
  public void t(int paramInt)
  {
    a.s(paramInt);
  }
  
  @SuppressLint({"BanParcelableUsage"})
  public static final class QueueItem
    implements Parcelable
  {
    public static final Parcelable.Creator<QueueItem> CREATOR = new a();
    public final MediaDescriptionCompat o;
    public final long p;
    public MediaSession.QueueItem q;
    
    public QueueItem(MediaSession.QueueItem paramQueueItem, MediaDescriptionCompat paramMediaDescriptionCompat, long paramLong)
    {
      if (paramMediaDescriptionCompat != null)
      {
        if (paramLong != -1L)
        {
          o = paramMediaDescriptionCompat;
          p = paramLong;
          q = paramQueueItem;
          return;
        }
        throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
      }
      throw new IllegalArgumentException("Description cannot be null");
    }
    
    public QueueItem(Parcel paramParcel)
    {
      o = ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel));
      p = paramParcel.readLong();
    }
    
    public QueueItem(MediaDescriptionCompat paramMediaDescriptionCompat, long paramLong)
    {
      this(null, paramMediaDescriptionCompat, paramLong);
    }
    
    public static QueueItem a(Object paramObject)
    {
      if (paramObject != null)
      {
        paramObject = (MediaSession.QueueItem)paramObject;
        return new QueueItem((MediaSession.QueueItem)paramObject, MediaDescriptionCompat.a(b.b((MediaSession.QueueItem)paramObject)), b.c((MediaSession.QueueItem)paramObject));
      }
      return null;
    }
    
    public static List b(List paramList)
    {
      if (paramList != null)
      {
        ArrayList localArrayList = new ArrayList(paramList.size());
        paramList = paramList.iterator();
        while (paramList.hasNext()) {
          localArrayList.add(a(paramList.next()));
        }
        return localArrayList;
      }
      return null;
    }
    
    public MediaDescriptionCompat c()
    {
      return o;
    }
    
    public long d()
    {
      return p;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public Object e()
    {
      MediaSession.QueueItem localQueueItem1 = q;
      MediaSession.QueueItem localQueueItem2 = localQueueItem1;
      if (localQueueItem1 == null)
      {
        localQueueItem2 = b.a((MediaDescription)o.f(), p);
        q = localQueueItem2;
      }
      return localQueueItem2;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("MediaSession.QueueItem {Description=");
      localStringBuilder.append(o);
      localStringBuilder.append(", Id=");
      localStringBuilder.append(p);
      localStringBuilder.append(" }");
      return localStringBuilder.toString();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      o.writeToParcel(paramParcel, paramInt);
      paramParcel.writeLong(p);
    }
    
    public class a
      implements Parcelable.Creator
    {
      public MediaSessionCompat.QueueItem a(Parcel paramParcel)
      {
        return new MediaSessionCompat.QueueItem(paramParcel);
      }
      
      public MediaSessionCompat.QueueItem[] b(int paramInt)
      {
        return new MediaSessionCompat.QueueItem[paramInt];
      }
    }
    
    public static abstract class b
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
  
  @SuppressLint({"BanParcelableUsage"})
  public static final class ResultReceiverWrapper
    implements Parcelable
  {
    public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();
    public ResultReceiver o;
    
    public ResultReceiverWrapper(Parcel paramParcel)
    {
      o = ((ResultReceiver)ResultReceiver.CREATOR.createFromParcel(paramParcel));
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      o.writeToParcel(paramParcel, paramInt);
    }
    
    public class a
      implements Parcelable.Creator
    {
      public MediaSessionCompat.ResultReceiverWrapper a(Parcel paramParcel)
      {
        return new MediaSessionCompat.ResultReceiverWrapper(paramParcel);
      }
      
      public MediaSessionCompat.ResultReceiverWrapper[] b(int paramInt)
      {
        return new MediaSessionCompat.ResultReceiverWrapper[paramInt];
      }
    }
  }
  
  @SuppressLint({"BanParcelableUsage"})
  public static final class Token
    implements Parcelable
  {
    public static final Parcelable.Creator<Token> CREATOR = new a();
    public final Object o = new Object();
    public final Object p;
    public b q;
    public v1.d r;
    
    public Token(Object paramObject)
    {
      this(paramObject, null, null);
    }
    
    public Token(Object paramObject, b paramb)
    {
      this(paramObject, paramb, null);
    }
    
    public Token(Object paramObject, b paramb, v1.d paramd)
    {
      p = paramObject;
      q = paramb;
      r = paramd;
    }
    
    public static Token a(Object paramObject)
    {
      return b(paramObject, null);
    }
    
    public static Token b(Object paramObject, b paramb)
    {
      if (paramObject != null)
      {
        if ((paramObject instanceof MediaSession.Token)) {
          return new Token(paramObject, paramb);
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
      }
      return null;
    }
    
    public b c()
    {
      synchronized (o)
      {
        b localb = q;
        return localb;
      }
    }
    
    public v1.d d()
    {
      synchronized (o)
      {
        v1.d locald = r;
        return locald;
      }
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public Object e()
    {
      return p;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof Token)) {
        return false;
      }
      Object localObject = (Token)paramObject;
      paramObject = p;
      localObject = p;
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
    
    public void f(b paramb)
    {
      synchronized (o)
      {
        q = paramb;
        return;
      }
    }
    
    public void g(v1.d paramd)
    {
      synchronized (o)
      {
        r = paramd;
        return;
      }
    }
    
    public int hashCode()
    {
      Object localObject = p;
      if (localObject == null) {
        return 0;
      }
      return localObject.hashCode();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeParcelable((Parcelable)p, paramInt);
    }
    
    public class a
      implements Parcelable.Creator
    {
      public MediaSessionCompat.Token a(Parcel paramParcel)
      {
        return new MediaSessionCompat.Token(paramParcel.readParcelable(null));
      }
      
      public MediaSessionCompat.Token[] b(int paramInt)
      {
        return new MediaSessionCompat.Token[paramInt];
      }
    }
  }
  
  public class a
    extends MediaSessionCompat.b
  {
    public a() {}
  }
  
  public static abstract class b
  {
    public final Object a = new Object();
    public final MediaSession.Callback b = new b();
    public boolean c;
    public WeakReference d = new WeakReference(null);
    public a e;
    
    public void A() {}
    
    public void B(long paramLong) {}
    
    public void C() {}
    
    public void D(MediaSessionCompat.c paramc, Handler paramHandler)
    {
      Object localObject3;
      synchronized (a)
      {
        localObject2 = new java/lang/ref/WeakReference;
        ((WeakReference)localObject2).<init>(paramc);
        d = ((WeakReference)localObject2);
        localObject2 = e;
        localObject3 = null;
        if (localObject2 != null) {
          ((Handler)localObject2).removeCallbacksAndMessages(null);
        }
      }
      Object localObject2 = localObject3;
      if (paramc != null) {
        if (paramHandler == null) {
          localObject2 = localObject3;
        } else {
          localObject2 = new a(paramHandler.getLooper());
        }
      }
      e = ((a)localObject2);
    }
    
    public void a(MediaSessionCompat.c paramc, Handler paramHandler)
    {
      if (!c) {
        return;
      }
      int i = 0;
      c = false;
      paramHandler.removeMessages(1);
      paramc = paramc.f();
      long l;
      if (paramc == null) {
        l = 0L;
      } else {
        l = paramc.b();
      }
      int j;
      if ((paramc != null) && (paramc.g() == 3)) {
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
        h();
      } else if ((j == 0) && (k != 0)) {
        i();
      }
    }
    
    public void b(MediaDescriptionCompat paramMediaDescriptionCompat) {}
    
    public void c(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt) {}
    
    public void d(String paramString, Bundle paramBundle, ResultReceiver paramResultReceiver) {}
    
    public void e(String paramString, Bundle paramBundle) {}
    
    public void f() {}
    
    public boolean g(Intent paramIntent)
    {
      if (Build.VERSION.SDK_INT >= 27) {
        return false;
      }
      synchronized (a)
      {
        MediaSessionCompat.c localc = (MediaSessionCompat.c)d.get();
        a locala = e;
        if ((localc != null) && (locala != null))
        {
          ??? = (KeyEvent)paramIntent.getParcelableExtra("android.intent.extra.KEY_EVENT");
          if ((??? != null) && (((KeyEvent)???).getAction() == 0))
          {
            paramIntent = localc.t();
            int i = ((KeyEvent)???).getKeyCode();
            if ((i != 79) && (i != 85))
            {
              a(localc, locala);
              return false;
            }
            if (((KeyEvent)???).getRepeatCount() == 0)
            {
              if (c)
              {
                locala.removeMessages(1);
                c = false;
                paramIntent = localc.f();
                long l;
                if (paramIntent == null) {
                  l = 0L;
                } else {
                  l = paramIntent.b();
                }
                if ((l & 0x20) != 0L) {
                  z();
                }
              }
              else
              {
                c = true;
                locala.sendMessageDelayed(locala.obtainMessage(1, paramIntent), ViewConfiguration.getDoubleTapTimeout());
              }
            }
            else {
              a(localc, locala);
            }
            return true;
          }
        }
        return false;
      }
    }
    
    public void h() {}
    
    public void i() {}
    
    public void j(String paramString, Bundle paramBundle) {}
    
    public void k(String paramString, Bundle paramBundle) {}
    
    public void l(Uri paramUri, Bundle paramBundle) {}
    
    public void m() {}
    
    public void n(String paramString, Bundle paramBundle) {}
    
    public void o(String paramString, Bundle paramBundle) {}
    
    public void p(Uri paramUri, Bundle paramBundle) {}
    
    public void q(MediaDescriptionCompat paramMediaDescriptionCompat) {}
    
    public void r() {}
    
    public void s(long paramLong) {}
    
    public void t(boolean paramBoolean) {}
    
    public void u(float paramFloat) {}
    
    public void v(RatingCompat paramRatingCompat) {}
    
    public void w(RatingCompat paramRatingCompat, Bundle paramBundle) {}
    
    public void x(int paramInt) {}
    
    public void y(int paramInt) {}
    
    public void z() {}
    
    public class a
      extends Handler
    {
      public a(Looper paramLooper)
      {
        super();
      }
      
      public void handleMessage(Message paramMessage)
      {
        if (what == 1) {
          synchronized (a)
          {
            MediaSessionCompat.c localc = (MediaSessionCompat.c)d.get();
            MediaSessionCompat.b localb = MediaSessionCompat.b.this;
            a locala = e;
            if ((localc != null) && (localb == localc.o()) && (locala != null))
            {
              localc.d((f)obj);
              a(localc, locala);
              localc.d(null);
            }
            else {}
          }
        }
      }
    }
    
    public class b
      extends MediaSession.Callback
    {
      public b() {}
      
      public final void a(MediaSessionCompat.c paramc)
      {
        paramc.d(null);
      }
      
      public final MediaSessionCompat.d b()
      {
        synchronized (a)
        {
          MediaSessionCompat.d locald = (MediaSessionCompat.d)d.get();
          if ((locald == null) || (MediaSessionCompat.b.this != locald.o())) {
            locald = null;
          }
          return locald;
        }
      }
      
      public final void c(MediaSessionCompat.c paramc)
      {
        if (Build.VERSION.SDK_INT >= 28) {
          return;
        }
        String str1 = paramc.h();
        String str2 = str1;
        if (TextUtils.isEmpty(str1)) {
          str2 = "android.media.session.MediaController";
        }
        paramc.d(new f(str2, -1, -1));
      }
      
      public void onCommand(String paramString, Bundle paramBundle, ResultReceiver paramResultReceiver)
      {
        MediaSessionCompat.d locald = b();
        if (locald == null) {
          return;
        }
        MediaSessionCompat.a(paramBundle);
        c(locald);
        try
        {
          boolean bool = paramString.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER");
          Bundle localBundle = null;
          Object localObject = null;
          if (bool)
          {
            localBundle = new android/os/Bundle;
            localBundle.<init>();
            paramBundle = locald.b();
            paramString = paramBundle.c();
            if (paramString == null) {
              paramString = (String)localObject;
            } else {
              paramString = paramString.asBinder();
            }
            w.d.b(localBundle, "android.support.v4.media.session.EXTRA_BINDER", paramString);
            v1.a.c(localBundle, "android.support.v4.media.session.SESSION_TOKEN2", paramBundle.d());
            paramResultReceiver.send(0, localBundle);
          }
          else
          {
            bool = paramString.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM");
            if (bool)
            {
              b((MediaDescriptionCompat)paramBundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
            }
            else
            {
              bool = paramString.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT");
              if (bool)
              {
                c((MediaDescriptionCompat)paramBundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), paramBundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
              }
              else
              {
                if (paramString.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                  paramString = MediaSessionCompat.b.this;
                }
                for (paramBundle = (MediaDescriptionCompat)paramBundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");; paramBundle = paramResultReceiver)
                {
                  paramString.q(paramBundle);
                  break label321;
                  if (!paramString.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                    break;
                  }
                  if (i == null) {
                    break label321;
                  }
                  int i = paramBundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                  paramString = localBundle;
                  if (i >= 0)
                  {
                    paramString = localBundle;
                    if (i < i.size()) {
                      paramString = (MediaSessionCompat.QueueItem)i.get(i);
                    }
                  }
                  if (paramString == null) {
                    break label321;
                  }
                  paramBundle = MediaSessionCompat.b.this;
                  paramResultReceiver = paramString.c();
                  paramString = paramBundle;
                }
                d(paramString, paramBundle, paramResultReceiver);
              }
            }
          }
        }
        catch (BadParcelableException paramString)
        {
          Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        label321:
        a(locald);
      }
      
      public void onCustomAction(String paramString, Bundle paramBundle)
      {
        MediaSessionCompat.d locald = b();
        if (locald == null) {
          return;
        }
        MediaSessionCompat.a(paramBundle);
        c(locald);
        try
        {
          boolean bool = paramString.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
          if (bool)
          {
            paramString = (Uri)paramBundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
            paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
            MediaSessionCompat.a(paramBundle);
            l(paramString, paramBundle);
          }
          else if (paramString.equals("android.support.v4.media.session.action.PREPARE"))
          {
            m();
          }
          else if (paramString.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID"))
          {
            paramString = paramBundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
            paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
            MediaSessionCompat.a(paramBundle);
            n(paramString, paramBundle);
          }
          else if (paramString.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH"))
          {
            paramString = paramBundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
            paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
            MediaSessionCompat.a(paramBundle);
            o(paramString, paramBundle);
          }
          else if (paramString.equals("android.support.v4.media.session.action.PREPARE_FROM_URI"))
          {
            paramString = (Uri)paramBundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
            paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
            MediaSessionCompat.a(paramBundle);
            p(paramString, paramBundle);
          }
          else if (paramString.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED"))
          {
            bool = paramBundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
            t(bool);
          }
          else
          {
            int i;
            if (paramString.equals("android.support.v4.media.session.action.SET_REPEAT_MODE"))
            {
              i = paramBundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
              x(i);
            }
            else if (paramString.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE"))
            {
              i = paramBundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
              y(i);
            }
            else if (paramString.equals("android.support.v4.media.session.action.SET_RATING"))
            {
              paramString = (RatingCompat)paramBundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
              paramBundle = paramBundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
              MediaSessionCompat.a(paramBundle);
              w(paramString, paramBundle);
            }
            else if (paramString.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED"))
            {
              float f = paramBundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0F);
              u(f);
            }
            else
            {
              e(paramString, paramBundle);
            }
          }
        }
        catch (BadParcelableException paramString)
        {
          Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        a(locald);
      }
      
      public void onFastForward()
      {
        MediaSessionCompat.d locald = b();
        if (locald == null) {
          return;
        }
        c(locald);
        f();
        a(locald);
      }
      
      public boolean onMediaButtonEvent(Intent paramIntent)
      {
        MediaSessionCompat.d locald = b();
        boolean bool1 = false;
        if (locald == null) {
          return false;
        }
        c(locald);
        boolean bool2 = g(paramIntent);
        a(locald);
        if ((bool2) || (super.onMediaButtonEvent(paramIntent))) {
          bool1 = true;
        }
        return bool1;
      }
      
      public void onPause()
      {
        MediaSessionCompat.d locald = b();
        if (locald == null) {
          return;
        }
        c(locald);
        h();
        a(locald);
      }
      
      public void onPlay()
      {
        MediaSessionCompat.d locald = b();
        if (locald == null) {
          return;
        }
        c(locald);
        i();
        a(locald);
      }
      
      public void onPlayFromMediaId(String paramString, Bundle paramBundle)
      {
        MediaSessionCompat.d locald = b();
        if (locald == null) {
          return;
        }
        MediaSessionCompat.a(paramBundle);
        c(locald);
        j(paramString, paramBundle);
        a(locald);
      }
      
      public void onPlayFromSearch(String paramString, Bundle paramBundle)
      {
        MediaSessionCompat.d locald = b();
        if (locald == null) {
          return;
        }
        MediaSessionCompat.a(paramBundle);
        c(locald);
        k(paramString, paramBundle);
        a(locald);
      }
      
      public void onPlayFromUri(Uri paramUri, Bundle paramBundle)
      {
        MediaSessionCompat.d locald = b();
        if (locald == null) {
          return;
        }
        MediaSessionCompat.a(paramBundle);
        c(locald);
        l(paramUri, paramBundle);
        a(locald);
      }
      
      public void onPrepare()
      {
        MediaSessionCompat.d locald = b();
        if (locald == null) {
          return;
        }
        c(locald);
        m();
        a(locald);
      }
      
      public void onPrepareFromMediaId(String paramString, Bundle paramBundle)
      {
        MediaSessionCompat.d locald = b();
        if (locald == null) {
          return;
        }
        MediaSessionCompat.a(paramBundle);
        c(locald);
        n(paramString, paramBundle);
        a(locald);
      }
      
      public void onPrepareFromSearch(String paramString, Bundle paramBundle)
      {
        MediaSessionCompat.d locald = b();
        if (locald == null) {
          return;
        }
        MediaSessionCompat.a(paramBundle);
        c(locald);
        o(paramString, paramBundle);
        a(locald);
      }
      
      public void onPrepareFromUri(Uri paramUri, Bundle paramBundle)
      {
        MediaSessionCompat.d locald = b();
        if (locald == null) {
          return;
        }
        MediaSessionCompat.a(paramBundle);
        c(locald);
        p(paramUri, paramBundle);
        a(locald);
      }
      
      public void onRewind()
      {
        MediaSessionCompat.d locald = b();
        if (locald == null) {
          return;
        }
        c(locald);
        r();
        a(locald);
      }
      
      public void onSeekTo(long paramLong)
      {
        MediaSessionCompat.d locald = b();
        if (locald == null) {
          return;
        }
        c(locald);
        s(paramLong);
        a(locald);
      }
      
      public void onSetPlaybackSpeed(float paramFloat)
      {
        MediaSessionCompat.d locald = b();
        if (locald == null) {
          return;
        }
        c(locald);
        u(paramFloat);
        a(locald);
      }
      
      public void onSetRating(Rating paramRating)
      {
        MediaSessionCompat.d locald = b();
        if (locald == null) {
          return;
        }
        c(locald);
        v(RatingCompat.a(paramRating));
        a(locald);
      }
      
      public void onSkipToNext()
      {
        MediaSessionCompat.d locald = b();
        if (locald == null) {
          return;
        }
        c(locald);
        z();
        a(locald);
      }
      
      public void onSkipToPrevious()
      {
        MediaSessionCompat.d locald = b();
        if (locald == null) {
          return;
        }
        c(locald);
        A();
        a(locald);
      }
      
      public void onSkipToQueueItem(long paramLong)
      {
        MediaSessionCompat.d locald = b();
        if (locald == null) {
          return;
        }
        c(locald);
        B(paramLong);
        a(locald);
      }
      
      public void onStop()
      {
        MediaSessionCompat.d locald = b();
        if (locald == null) {
          return;
        }
        c(locald);
        C();
        a(locald);
      }
    }
  }
  
  public static abstract interface c
  {
    public abstract boolean a();
    
    public abstract MediaSessionCompat.Token b();
    
    public abstract void c(int paramInt);
    
    public abstract void d(f paramf);
    
    public abstract void e(List paramList);
    
    public abstract PlaybackStateCompat f();
    
    public abstract void g(boolean paramBoolean);
    
    public abstract String h();
    
    public abstract void i(int paramInt);
    
    public abstract void j(PendingIntent paramPendingIntent);
    
    public abstract void k(boolean paramBoolean);
    
    public abstract void l(PlaybackStateCompat paramPlaybackStateCompat);
    
    public abstract void m(MediaSessionCompat.b paramb, Handler paramHandler);
    
    public abstract void n(int paramInt);
    
    public abstract MediaSessionCompat.b o();
    
    public abstract void p(MediaMetadataCompat paramMediaMetadataCompat);
    
    public abstract void q(PendingIntent paramPendingIntent);
    
    public abstract void r(o paramo);
    
    public abstract void release();
    
    public abstract void s(int paramInt);
    
    public abstract f t();
  }
  
  public static abstract class d
    implements MediaSessionCompat.c
  {
    public final MediaSession a;
    public final a b;
    public final MediaSessionCompat.Token c;
    public final Object d = new Object();
    public Bundle e;
    public boolean f = false;
    public final RemoteCallbackList g = new RemoteCallbackList();
    public PlaybackStateCompat h;
    public List i;
    public MediaMetadataCompat j;
    public int k;
    public boolean l;
    public int m;
    public int n;
    public MediaSessionCompat.b o;
    public f p;
    
    public d(Context paramContext, String paramString, v1.d paramd, Bundle paramBundle)
    {
      paramContext = u(paramContext, paramString, paramBundle);
      a = paramContext;
      paramString = new a(this);
      b = paramString;
      c = new MediaSessionCompat.Token(paramContext.getSessionToken(), paramString, paramd);
      e = paramBundle;
      c(3);
    }
    
    public boolean a()
    {
      return a.isActive();
    }
    
    public MediaSessionCompat.Token b()
    {
      return c;
    }
    
    public void c(int paramInt)
    {
      a.setFlags(paramInt | 0x3);
    }
    
    public void d(f paramf)
    {
      synchronized (d)
      {
        p = paramf;
        return;
      }
    }
    
    public void e(List paramList)
    {
      i = paramList;
      Object localObject;
      if (paramList == null)
      {
        localObject = a;
        paramList = null;
      }
      for (;;)
      {
        ((MediaSession)localObject).setQueue(paramList);
        return;
        localObject = new ArrayList(paramList.size());
        paramList = paramList.iterator();
        while (paramList.hasNext()) {
          ((ArrayList)localObject).add((MediaSession.QueueItem)((MediaSessionCompat.QueueItem)paramList.next()).e());
        }
        MediaSession localMediaSession = a;
        paramList = (List)localObject;
        localObject = localMediaSession;
      }
    }
    
    public PlaybackStateCompat f()
    {
      return h;
    }
    
    public void g(boolean paramBoolean)
    {
      a.setActive(paramBoolean);
    }
    
    public String h()
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
    
    public void i(int paramInt)
    {
      if (m != paramInt)
      {
        m = paramInt;
        for (;;)
        {
          int i1;
          a locala;
          synchronized (d)
          {
            i1 = g.beginBroadcast() - 1;
            if (i1 < 0) {
              break;
            }
            locala = (a)g.getBroadcastItem(i1);
          }
          i1--;
        }
        g.finishBroadcast();
        break label86;
        throw ((Throwable)localObject2);
      }
      label86:
    }
    
    public void j(PendingIntent paramPendingIntent)
    {
      a.setSessionActivity(paramPendingIntent);
    }
    
    public void k(boolean paramBoolean)
    {
      if (l != paramBoolean)
      {
        l = paramBoolean;
        for (;;)
        {
          int i1;
          a locala;
          synchronized (d)
          {
            i1 = g.beginBroadcast() - 1;
            if (i1 < 0) {
              break;
            }
            locala = (a)g.getBroadcastItem(i1);
          }
          i1--;
        }
        g.finishBroadcast();
        break label86;
        throw ((Throwable)localObject2);
      }
      label86:
    }
    
    public void l(PlaybackStateCompat paramPlaybackStateCompat)
    {
      h = paramPlaybackStateCompat;
      for (;;)
      {
        int i1;
        a locala;
        synchronized (d)
        {
          i1 = g.beginBroadcast() - 1;
          if (i1 < 0) {
            break;
          }
          locala = (a)g.getBroadcastItem(i1);
        }
        i1--;
      }
      g.finishBroadcast();
      ??? = a;
      if (paramPlaybackStateCompat == null) {
        paramPlaybackStateCompat = null;
      } else {
        paramPlaybackStateCompat = (PlaybackState)paramPlaybackStateCompat.e();
      }
      ((MediaSession)???).setPlaybackState(paramPlaybackStateCompat);
      return;
      throw paramPlaybackStateCompat;
    }
    
    public void m(MediaSessionCompat.b paramb, Handler paramHandler)
    {
      synchronized (d)
      {
        o = paramb;
        MediaSession localMediaSession = a;
        MediaSession.Callback localCallback;
        if (paramb == null) {
          localCallback = null;
        } else {
          localCallback = b;
        }
        localMediaSession.setCallback(localCallback, paramHandler);
        if (paramb != null) {
          paramb.D(this, paramHandler);
        }
      }
    }
    
    public void n(int paramInt)
    {
      AudioAttributes.Builder localBuilder = new AudioAttributes.Builder();
      localBuilder.setLegacyStreamType(paramInt);
      a.setPlaybackToLocal(localBuilder.build());
    }
    
    public MediaSessionCompat.b o()
    {
      synchronized (d)
      {
        MediaSessionCompat.b localb = o;
        return localb;
      }
    }
    
    public void p(MediaMetadataCompat paramMediaMetadataCompat)
    {
      j = paramMediaMetadataCompat;
      MediaSession localMediaSession = a;
      if (paramMediaMetadataCompat == null) {
        paramMediaMetadataCompat = null;
      } else {
        paramMediaMetadataCompat = (MediaMetadata)paramMediaMetadataCompat.g();
      }
      localMediaSession.setMetadata(paramMediaMetadataCompat);
    }
    
    public void q(PendingIntent paramPendingIntent)
    {
      a.setMediaButtonReceiver(paramPendingIntent);
    }
    
    public void r(o paramo)
    {
      a.setPlaybackToRemote((VolumeProvider)paramo.c());
    }
    
    public void release()
    {
      f = true;
      g.kill();
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
      b.o();
      a.release();
    }
    
    public void s(int paramInt)
    {
      if (n != paramInt)
      {
        n = paramInt;
        for (;;)
        {
          int i1;
          a locala;
          synchronized (d)
          {
            i1 = g.beginBroadcast() - 1;
            if (i1 < 0) {
              break;
            }
            locala = (a)g.getBroadcastItem(i1);
          }
          i1--;
        }
        g.finishBroadcast();
        break label86;
        throw ((Throwable)localObject2);
      }
      label86:
    }
    
    public f t()
    {
      synchronized (d)
      {
        f localf = p;
        return localf;
      }
    }
    
    public MediaSession u(Context paramContext, String paramString, Bundle paramBundle)
    {
      return new MediaSession(paramContext, paramString);
    }
    
    public static class a
      extends b.a
    {
      public final AtomicReference b;
      
      public a(MediaSessionCompat.d paramd)
      {
        b = new AtomicReference(paramd);
      }
      
      public void A(a parama)
      {
        MediaSessionCompat.d locald = (MediaSessionCompat.d)b.get();
        if (locald == null) {
          return;
        }
        ??? = new f("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid());
        g.register(parama, ???);
        synchronized (d) {}
      }
      
      public void A0(String paramString, Bundle paramBundle)
      {
        throw new AssertionError();
      }
      
      public void B(RatingCompat paramRatingCompat, Bundle paramBundle)
      {
        throw new AssertionError();
      }
      
      public ParcelableVolumeInfo C0()
      {
        throw new AssertionError();
      }
      
      public void D(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
      {
        throw new AssertionError();
      }
      
      public void E0()
      {
        throw new AssertionError();
      }
      
      public void G0(Uri paramUri, Bundle paramBundle)
      {
        throw new AssertionError();
      }
      
      public boolean H()
      {
        return false;
      }
      
      public void H0(long paramLong)
      {
        throw new AssertionError();
      }
      
      public void I(RatingCompat paramRatingCompat)
      {
        throw new AssertionError();
      }
      
      public void J(int paramInt1, int paramInt2, String paramString)
      {
        throw new AssertionError();
      }
      
      public void M(Uri paramUri, Bundle paramBundle)
      {
        throw new AssertionError();
      }
      
      public String N0()
      {
        throw new AssertionError();
      }
      
      public void Q(MediaDescriptionCompat paramMediaDescriptionCompat)
      {
        throw new AssertionError();
      }
      
      public boolean R()
      {
        throw new AssertionError();
      }
      
      public void S(MediaDescriptionCompat paramMediaDescriptionCompat)
      {
        throw new AssertionError();
      }
      
      public PendingIntent T()
      {
        throw new AssertionError();
      }
      
      public int U()
      {
        MediaSessionCompat.d locald = (MediaSessionCompat.d)b.get();
        int i;
        if (locald != null) {
          i = n;
        } else {
          i = -1;
        }
        return i;
      }
      
      public void V(int paramInt)
      {
        throw new AssertionError();
      }
      
      public int X()
      {
        MediaSessionCompat.d locald = (MediaSessionCompat.d)b.get();
        int i;
        if (locald != null) {
          i = k;
        } else {
          i = 0;
        }
        return i;
      }
      
      public void Y(String paramString, Bundle paramBundle)
      {
        throw new AssertionError();
      }
      
      public boolean Y0(KeyEvent paramKeyEvent)
      {
        throw new AssertionError();
      }
      
      public boolean b0()
      {
        MediaSessionCompat.d locald = (MediaSessionCompat.d)b.get();
        boolean bool;
        if ((locald != null) && (l)) {
          bool = true;
        } else {
          bool = false;
        }
        return bool;
      }
      
      public String e()
      {
        throw new AssertionError();
      }
      
      public PlaybackStateCompat f()
      {
        MediaSessionCompat.d locald = (MediaSessionCompat.d)b.get();
        if (locald != null) {
          return MediaSessionCompat.d(h, j);
        }
        return null;
      }
      
      public void g()
      {
        throw new AssertionError();
      }
      
      public void i(int paramInt)
      {
        throw new AssertionError();
      }
      
      public void j()
      {
        throw new AssertionError();
      }
      
      public void j0(String paramString, Bundle paramBundle, MediaSessionCompat.ResultReceiverWrapper paramResultReceiverWrapper)
      {
        throw new AssertionError();
      }
      
      public void k(boolean paramBoolean)
      {
        throw new AssertionError();
      }
      
      public List k0()
      {
        return null;
      }
      
      public void next()
      {
        throw new AssertionError();
      }
      
      public void o()
      {
        b.set(null);
      }
      
      public void o0()
      {
        throw new AssertionError();
      }
      
      public void p()
      {
        throw new AssertionError();
      }
      
      public CharSequence p0()
      {
        throw new AssertionError();
      }
      
      public void previous()
      {
        throw new AssertionError();
      }
      
      public int q()
      {
        MediaSessionCompat.d locald = (MediaSessionCompat.d)b.get();
        int i;
        if (locald != null) {
          i = m;
        } else {
          i = -1;
        }
        return i;
      }
      
      public Bundle r()
      {
        throw new AssertionError();
      }
      
      public MediaMetadataCompat r0()
      {
        throw new AssertionError();
      }
      
      public void s(int paramInt)
      {
        throw new AssertionError();
      }
      
      public void s0(String paramString, Bundle paramBundle)
      {
        throw new AssertionError();
      }
      
      public void stop()
      {
        throw new AssertionError();
      }
      
      public Bundle t0()
      {
        Object localObject = (MediaSessionCompat.d)b.get();
        if (e == null) {
          localObject = null;
        } else {
          localObject = new Bundle(e);
        }
        return (Bundle)localObject;
      }
      
      public void u(float paramFloat)
      {
        throw new AssertionError();
      }
      
      public void u0(a arg1)
      {
        MediaSessionCompat.d locald = (MediaSessionCompat.d)b.get();
        if (locald == null) {
          return;
        }
        g.unregister(???);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (d) {}
      }
      
      public void v0(String paramString, Bundle paramBundle)
      {
        throw new AssertionError();
      }
      
      public long w0()
      {
        throw new AssertionError();
      }
      
      public void y(String paramString, Bundle paramBundle)
      {
        throw new AssertionError();
      }
      
      public void y0(long paramLong)
      {
        throw new AssertionError();
      }
      
      public void z(int paramInt1, int paramInt2, String paramString)
      {
        throw new AssertionError();
      }
      
      public void z0(boolean paramBoolean) {}
    }
  }
  
  public static class e
    extends MediaSessionCompat.d
  {
    public e(Context paramContext, String paramString, v1.d paramd, Bundle paramBundle)
    {
      super(paramString, paramd, paramBundle);
    }
  }
  
  public static class f
    extends MediaSessionCompat.e
  {
    public f(Context paramContext, String paramString, v1.d paramd, Bundle paramBundle)
    {
      super(paramString, paramd, paramBundle);
    }
    
    public void d(f paramf) {}
    
    public final f t()
    {
      return new f(c.a(a));
    }
  }
  
  public static class g
    extends MediaSessionCompat.f
  {
    public g(Context paramContext, String paramString, v1.d paramd, Bundle paramBundle)
    {
      super(paramString, paramd, paramBundle);
    }
    
    public MediaSession u(Context paramContext, String paramString, Bundle paramBundle)
    {
      return d.a(paramContext, paramString, paramBundle);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */