package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.media.session.PlaybackState.Builder;
import android.media.session.PlaybackState.CustomAction;
import android.media.session.PlaybackState.CustomAction.Builder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat
  implements Parcelable
{
  public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
  public final int o;
  public final long p;
  public final long q;
  public final float r;
  public final long s;
  public final int t;
  public final CharSequence u;
  public final long v;
  public List w;
  public final long x;
  public final Bundle y;
  public PlaybackState z;
  
  public PlaybackStateCompat(int paramInt1, long paramLong1, long paramLong2, float paramFloat, long paramLong3, int paramInt2, CharSequence paramCharSequence, long paramLong4, List paramList, long paramLong5, Bundle paramBundle)
  {
    o = paramInt1;
    p = paramLong1;
    q = paramLong2;
    r = paramFloat;
    s = paramLong3;
    t = paramInt2;
    u = paramCharSequence;
    v = paramLong4;
    w = new ArrayList(paramList);
    x = paramLong5;
    y = paramBundle;
  }
  
  public PlaybackStateCompat(Parcel paramParcel)
  {
    o = paramParcel.readInt();
    p = paramParcel.readLong();
    r = paramParcel.readFloat();
    v = paramParcel.readLong();
    q = paramParcel.readLong();
    s = paramParcel.readLong();
    u = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    w = paramParcel.createTypedArrayList(CustomAction.CREATOR);
    x = paramParcel.readLong();
    y = paramParcel.readBundle(MediaSessionCompat.class.getClassLoader());
    t = paramParcel.readInt();
  }
  
  public static PlaybackStateCompat a(Object paramObject)
  {
    Object localObject = null;
    Iterator localIterator = null;
    if (paramObject != null)
    {
      PlaybackState localPlaybackState = (PlaybackState)paramObject;
      List localList = b.j(localPlaybackState);
      paramObject = localIterator;
      if (localList != null)
      {
        localObject = new ArrayList(localList.size());
        localIterator = localList.iterator();
        for (;;)
        {
          paramObject = localObject;
          if (!localIterator.hasNext()) {
            break;
          }
          ((List)localObject).add(CustomAction.a(localIterator.next()));
        }
      }
      localObject = c.a(localPlaybackState);
      MediaSessionCompat.a((Bundle)localObject);
      localObject = new PlaybackStateCompat(b.r(localPlaybackState), b.q(localPlaybackState), b.i(localPlaybackState), b.p(localPlaybackState), b.g(localPlaybackState), 0, b.k(localPlaybackState), b.n(localPlaybackState), (List)paramObject, b.h(localPlaybackState), (Bundle)localObject);
      z = localPlaybackState;
    }
    return (PlaybackStateCompat)localObject;
  }
  
  public static int h(long paramLong)
  {
    if (paramLong == 4L) {
      return 126;
    }
    if (paramLong == 2L) {
      return 127;
    }
    if (paramLong == 32L) {
      return 87;
    }
    if (paramLong == 16L) {
      return 88;
    }
    if (paramLong == 1L) {
      return 86;
    }
    if (paramLong == 64L) {
      return 90;
    }
    if (paramLong == 8L) {
      return 89;
    }
    if (paramLong == 512L) {
      return 85;
    }
    return 0;
  }
  
  public long b()
  {
    return s;
  }
  
  public long c()
  {
    return v;
  }
  
  public float d()
  {
    return r;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Object e()
  {
    if (z == null)
    {
      PlaybackState.Builder localBuilder = b.d();
      b.x(localBuilder, o, p, r, v);
      b.u(localBuilder, q);
      b.s(localBuilder, s);
      b.v(localBuilder, u);
      Iterator localIterator = w.iterator();
      while (localIterator.hasNext()) {
        b.a(localBuilder, (PlaybackState.CustomAction)((CustomAction)localIterator.next()).b());
      }
      b.t(localBuilder, x);
      c.b(localBuilder, y);
      z = b.c(localBuilder);
    }
    return z;
  }
  
  public long f()
  {
    return p;
  }
  
  public int g()
  {
    return o;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("PlaybackState {");
    localStringBuilder.append("state=");
    localStringBuilder.append(o);
    localStringBuilder.append(", position=");
    localStringBuilder.append(p);
    localStringBuilder.append(", buffered position=");
    localStringBuilder.append(q);
    localStringBuilder.append(", speed=");
    localStringBuilder.append(r);
    localStringBuilder.append(", updated=");
    localStringBuilder.append(v);
    localStringBuilder.append(", actions=");
    localStringBuilder.append(s);
    localStringBuilder.append(", error code=");
    localStringBuilder.append(t);
    localStringBuilder.append(", error message=");
    localStringBuilder.append(u);
    localStringBuilder.append(", custom actions=");
    localStringBuilder.append(w);
    localStringBuilder.append(", active item id=");
    localStringBuilder.append(x);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(o);
    paramParcel.writeLong(p);
    paramParcel.writeFloat(r);
    paramParcel.writeLong(v);
    paramParcel.writeLong(q);
    paramParcel.writeLong(s);
    TextUtils.writeToParcel(u, paramParcel, paramInt);
    paramParcel.writeTypedList(w);
    paramParcel.writeLong(x);
    paramParcel.writeBundle(y);
    paramParcel.writeInt(t);
  }
  
  public static final class CustomAction
    implements Parcelable
  {
    public static final Parcelable.Creator<CustomAction> CREATOR = new a();
    public final String o;
    public final CharSequence p;
    public final int q;
    public final Bundle r;
    public PlaybackState.CustomAction s;
    
    public CustomAction(Parcel paramParcel)
    {
      o = paramParcel.readString();
      p = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
      q = paramParcel.readInt();
      r = paramParcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
    
    public CustomAction(String paramString, CharSequence paramCharSequence, int paramInt, Bundle paramBundle)
    {
      o = paramString;
      p = paramCharSequence;
      q = paramInt;
      r = paramBundle;
    }
    
    public static CustomAction a(Object paramObject)
    {
      if (paramObject != null)
      {
        paramObject = (PlaybackState.CustomAction)paramObject;
        Object localObject = PlaybackStateCompat.b.l((PlaybackState.CustomAction)paramObject);
        MediaSessionCompat.a((Bundle)localObject);
        localObject = new CustomAction(PlaybackStateCompat.b.f((PlaybackState.CustomAction)paramObject), PlaybackStateCompat.b.o((PlaybackState.CustomAction)paramObject), PlaybackStateCompat.b.m((PlaybackState.CustomAction)paramObject), (Bundle)localObject);
        s = ((PlaybackState.CustomAction)paramObject);
        return (CustomAction)localObject;
      }
      return null;
    }
    
    public Object b()
    {
      PlaybackState.CustomAction localCustomAction = s;
      Object localObject = localCustomAction;
      if (localCustomAction == null)
      {
        localObject = PlaybackStateCompat.b.e(o, p, q);
        PlaybackStateCompat.b.w((PlaybackState.CustomAction.Builder)localObject, r);
        localObject = PlaybackStateCompat.b.b((PlaybackState.CustomAction.Builder)localObject);
      }
      return localObject;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Action:mName='");
      localStringBuilder.append(p);
      localStringBuilder.append(", mIcon=");
      localStringBuilder.append(q);
      localStringBuilder.append(", mExtras=");
      localStringBuilder.append(r);
      return localStringBuilder.toString();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeString(o);
      TextUtils.writeToParcel(p, paramParcel, paramInt);
      paramParcel.writeInt(q);
      paramParcel.writeBundle(r);
    }
    
    public class a
      implements Parcelable.Creator
    {
      public PlaybackStateCompat.CustomAction a(Parcel paramParcel)
      {
        return new PlaybackStateCompat.CustomAction(paramParcel);
      }
      
      public PlaybackStateCompat.CustomAction[] b(int paramInt)
      {
        return new PlaybackStateCompat.CustomAction[paramInt];
      }
    }
    
    public static final class b
    {
      public final String a;
      public final CharSequence b;
      public final int c;
      public Bundle d;
      
      public b(String paramString, CharSequence paramCharSequence, int paramInt)
      {
        if (!TextUtils.isEmpty(paramString))
        {
          if (!TextUtils.isEmpty(paramCharSequence))
          {
            if (paramInt != 0)
            {
              a = paramString;
              b = paramCharSequence;
              c = paramInt;
              return;
            }
            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
          }
          throw new IllegalArgumentException("You must specify a name to build a CustomAction");
        }
        throw new IllegalArgumentException("You must specify an action to build a CustomAction");
      }
      
      public PlaybackStateCompat.CustomAction a()
      {
        return new PlaybackStateCompat.CustomAction(a, b, c, d);
      }
      
      public b b(Bundle paramBundle)
      {
        d = paramBundle;
        return this;
      }
    }
  }
  
  public class a
    implements Parcelable.Creator
  {
    public PlaybackStateCompat a(Parcel paramParcel)
    {
      return new PlaybackStateCompat(paramParcel);
    }
    
    public PlaybackStateCompat[] b(int paramInt)
    {
      return new PlaybackStateCompat[paramInt];
    }
  }
  
  public static abstract class b
  {
    public static void a(PlaybackState.Builder paramBuilder, PlaybackState.CustomAction paramCustomAction)
    {
      paramBuilder.addCustomAction(paramCustomAction);
    }
    
    public static PlaybackState.CustomAction b(PlaybackState.CustomAction.Builder paramBuilder)
    {
      return paramBuilder.build();
    }
    
    public static PlaybackState c(PlaybackState.Builder paramBuilder)
    {
      return paramBuilder.build();
    }
    
    public static PlaybackState.Builder d()
    {
      return new PlaybackState.Builder();
    }
    
    public static PlaybackState.CustomAction.Builder e(String paramString, CharSequence paramCharSequence, int paramInt)
    {
      return new PlaybackState.CustomAction.Builder(paramString, paramCharSequence, paramInt);
    }
    
    public static String f(PlaybackState.CustomAction paramCustomAction)
    {
      return paramCustomAction.getAction();
    }
    
    public static long g(PlaybackState paramPlaybackState)
    {
      return paramPlaybackState.getActions();
    }
    
    public static long h(PlaybackState paramPlaybackState)
    {
      return paramPlaybackState.getActiveQueueItemId();
    }
    
    public static long i(PlaybackState paramPlaybackState)
    {
      return paramPlaybackState.getBufferedPosition();
    }
    
    public static List<PlaybackState.CustomAction> j(PlaybackState paramPlaybackState)
    {
      return paramPlaybackState.getCustomActions();
    }
    
    public static CharSequence k(PlaybackState paramPlaybackState)
    {
      return paramPlaybackState.getErrorMessage();
    }
    
    public static Bundle l(PlaybackState.CustomAction paramCustomAction)
    {
      return paramCustomAction.getExtras();
    }
    
    public static int m(PlaybackState.CustomAction paramCustomAction)
    {
      return paramCustomAction.getIcon();
    }
    
    public static long n(PlaybackState paramPlaybackState)
    {
      return paramPlaybackState.getLastPositionUpdateTime();
    }
    
    public static CharSequence o(PlaybackState.CustomAction paramCustomAction)
    {
      return paramCustomAction.getName();
    }
    
    public static float p(PlaybackState paramPlaybackState)
    {
      return paramPlaybackState.getPlaybackSpeed();
    }
    
    public static long q(PlaybackState paramPlaybackState)
    {
      return paramPlaybackState.getPosition();
    }
    
    public static int r(PlaybackState paramPlaybackState)
    {
      return paramPlaybackState.getState();
    }
    
    public static void s(PlaybackState.Builder paramBuilder, long paramLong)
    {
      paramBuilder.setActions(paramLong);
    }
    
    public static void t(PlaybackState.Builder paramBuilder, long paramLong)
    {
      paramBuilder.setActiveQueueItemId(paramLong);
    }
    
    public static void u(PlaybackState.Builder paramBuilder, long paramLong)
    {
      paramBuilder.setBufferedPosition(paramLong);
    }
    
    public static void v(PlaybackState.Builder paramBuilder, CharSequence paramCharSequence)
    {
      paramBuilder.setErrorMessage(paramCharSequence);
    }
    
    public static void w(PlaybackState.CustomAction.Builder paramBuilder, Bundle paramBundle)
    {
      paramBuilder.setExtras(paramBundle);
    }
    
    public static void x(PlaybackState.Builder paramBuilder, int paramInt, long paramLong1, float paramFloat, long paramLong2)
    {
      paramBuilder.setState(paramInt, paramLong1, paramFloat, paramLong2);
    }
  }
  
  public static abstract class c
  {
    public static Bundle a(PlaybackState paramPlaybackState)
    {
      return paramPlaybackState.getExtras();
    }
    
    public static void b(PlaybackState.Builder paramBuilder, Bundle paramBundle)
    {
      paramBuilder.setExtras(paramBundle);
    }
  }
  
  public static final class d
  {
    public final List a;
    public int b;
    public long c;
    public long d;
    public float e;
    public long f;
    public int g;
    public CharSequence h;
    public long i;
    public long j;
    public Bundle k;
    
    public d()
    {
      a = new ArrayList();
      j = -1L;
    }
    
    public d(PlaybackStateCompat paramPlaybackStateCompat)
    {
      ArrayList localArrayList = new ArrayList();
      a = localArrayList;
      j = -1L;
      b = o;
      c = p;
      e = r;
      i = v;
      d = q;
      f = s;
      g = t;
      h = u;
      List localList = w;
      if (localList != null) {
        localArrayList.addAll(localList);
      }
      j = x;
      k = y;
    }
    
    public d a(PlaybackStateCompat.CustomAction paramCustomAction)
    {
      if (paramCustomAction != null)
      {
        a.add(paramCustomAction);
        return this;
      }
      throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat");
    }
    
    public PlaybackStateCompat b()
    {
      return new PlaybackStateCompat(b, c, d, e, f, g, h, i, a, j, k);
    }
    
    public d c(long paramLong)
    {
      f = paramLong;
      return this;
    }
    
    public d d(long paramLong)
    {
      j = paramLong;
      return this;
    }
    
    public d e(long paramLong)
    {
      d = paramLong;
      return this;
    }
    
    public d f(int paramInt, CharSequence paramCharSequence)
    {
      g = paramInt;
      h = paramCharSequence;
      return this;
    }
    
    public d g(Bundle paramBundle)
    {
      k = paramBundle;
      return this;
    }
    
    public d h(int paramInt, long paramLong1, float paramFloat, long paramLong2)
    {
      b = paramInt;
      c = paramLong1;
      i = paramLong2;
      e = paramFloat;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.PlaybackStateCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */