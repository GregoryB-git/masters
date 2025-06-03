package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.media.session.PlaybackState.Builder;
import android.media.session.PlaybackState.CustomAction;
import android.media.session.PlaybackState.CustomAction.Builder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class PlaybackStateCompat
  implements Parcelable
{
  public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
  public final int a;
  public final long b;
  public final long c;
  public final float d;
  public final long e;
  public final int f;
  public final CharSequence o;
  public final long p;
  public ArrayList q;
  public final long r;
  public final Bundle s;
  public PlaybackState t;
  
  public PlaybackStateCompat(int paramInt1, long paramLong1, long paramLong2, float paramFloat, long paramLong3, int paramInt2, CharSequence paramCharSequence, long paramLong4, ArrayList paramArrayList, long paramLong5, Bundle paramBundle)
  {
    a = paramInt1;
    b = paramLong1;
    c = paramLong2;
    d = paramFloat;
    e = paramLong3;
    f = paramInt2;
    o = paramCharSequence;
    p = paramLong4;
    q = new ArrayList(paramArrayList);
    r = paramLong5;
    s = paramBundle;
  }
  
  public PlaybackStateCompat(Parcel paramParcel)
  {
    a = paramParcel.readInt();
    b = paramParcel.readLong();
    d = paramParcel.readFloat();
    p = paramParcel.readLong();
    c = paramParcel.readLong();
    e = paramParcel.readLong();
    o = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    q = paramParcel.createTypedArrayList(CustomAction.CREATOR);
    r = paramParcel.readLong();
    s = paramParcel.readBundle(MediaSessionCompat.class.getClassLoader());
    f = paramParcel.readInt();
  }
  
  public static PlaybackStateCompat a(Object paramObject)
  {
    Object localObject = null;
    if (paramObject != null)
    {
      PlaybackState localPlaybackState = (PlaybackState)paramObject;
      paramObject = b.j(localPlaybackState);
      if (paramObject != null)
      {
        localObject = new ArrayList(((List)paramObject).size());
        Iterator localIterator = ((List)paramObject).iterator();
        while (localIterator.hasNext())
        {
          paramObject = localIterator.next();
          if (paramObject != null)
          {
            PlaybackState.CustomAction localCustomAction = (PlaybackState.CustomAction)paramObject;
            paramObject = b.l(localCustomAction);
            MediaSessionCompat.a((Bundle)paramObject);
            paramObject = new CustomAction(b.f(localCustomAction), b.o(localCustomAction), b.m(localCustomAction), (Bundle)paramObject);
            e = localCustomAction;
          }
          else
          {
            paramObject = null;
          }
          ((ArrayList)localObject).add(paramObject);
        }
        paramObject = localObject;
      }
      else
      {
        paramObject = null;
      }
      localObject = c.a(localPlaybackState);
      MediaSessionCompat.a((Bundle)localObject);
      localObject = new PlaybackStateCompat(b.r(localPlaybackState), b.q(localPlaybackState), b.i(localPlaybackState), b.p(localPlaybackState), b.g(localPlaybackState), 0, b.k(localPlaybackState), b.n(localPlaybackState), (ArrayList)paramObject, b.h(localPlaybackState), (Bundle)localObject);
      t = localPlaybackState;
    }
    return (PlaybackStateCompat)localObject;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("PlaybackState {");
    localStringBuilder.append("state=");
    localStringBuilder.append(a);
    localStringBuilder.append(", position=");
    localStringBuilder.append(b);
    localStringBuilder.append(", buffered position=");
    localStringBuilder.append(c);
    localStringBuilder.append(", speed=");
    localStringBuilder.append(d);
    localStringBuilder.append(", updated=");
    localStringBuilder.append(p);
    localStringBuilder.append(", actions=");
    localStringBuilder.append(e);
    localStringBuilder.append(", error code=");
    localStringBuilder.append(f);
    localStringBuilder.append(", error message=");
    localStringBuilder.append(o);
    localStringBuilder.append(", custom actions=");
    localStringBuilder.append(q);
    localStringBuilder.append(", active item id=");
    localStringBuilder.append(r);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(a);
    paramParcel.writeLong(b);
    paramParcel.writeFloat(d);
    paramParcel.writeLong(p);
    paramParcel.writeLong(c);
    paramParcel.writeLong(e);
    TextUtils.writeToParcel(o, paramParcel, paramInt);
    paramParcel.writeTypedList(q);
    paramParcel.writeLong(r);
    paramParcel.writeBundle(s);
    paramParcel.writeInt(f);
  }
  
  public static final class CustomAction
    implements Parcelable
  {
    public static final Parcelable.Creator<CustomAction> CREATOR = new a();
    public final String a;
    public final CharSequence b;
    public final int c;
    public final Bundle d;
    public PlaybackState.CustomAction e;
    
    public CustomAction(Parcel paramParcel)
    {
      a = paramParcel.readString();
      b = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
      c = paramParcel.readInt();
      d = paramParcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
    
    public CustomAction(String paramString, CharSequence paramCharSequence, int paramInt, Bundle paramBundle)
    {
      a = paramString;
      b = paramCharSequence;
      c = paramInt;
      d = paramBundle;
    }
    
    public final int describeContents()
    {
      return 0;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = f.l("Action:mName='");
      localStringBuilder.append(b);
      localStringBuilder.append(", mIcon=");
      localStringBuilder.append(c);
      localStringBuilder.append(", mExtras=");
      localStringBuilder.append(d);
      return localStringBuilder.toString();
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeString(a);
      TextUtils.writeToParcel(b, paramParcel, paramInt);
      paramParcel.writeInt(c);
      paramParcel.writeBundle(d);
    }
    
    public final class a
      implements Parcelable.Creator<PlaybackStateCompat.CustomAction>
    {
      public final Object createFromParcel(Parcel paramParcel)
      {
        return new PlaybackStateCompat.CustomAction(paramParcel);
      }
      
      public final Object[] newArray(int paramInt)
      {
        return new PlaybackStateCompat.CustomAction[paramInt];
      }
    }
  }
  
  public final class a
    implements Parcelable.Creator<PlaybackStateCompat>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new PlaybackStateCompat(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new PlaybackStateCompat[paramInt];
    }
  }
  
  public static final class b
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
  
  public static final class c
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
    public final ArrayList a = new ArrayList();
    public long b;
    public long c = -1L;
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.session.PlaybackStateCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */