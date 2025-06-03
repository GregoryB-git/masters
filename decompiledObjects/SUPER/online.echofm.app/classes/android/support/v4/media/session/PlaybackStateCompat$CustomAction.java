package android.support.v4.media.session;

import android.media.session.PlaybackState.CustomAction;
import android.media.session.PlaybackState.CustomAction.Builder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class PlaybackStateCompat$CustomAction
  implements Parcelable
{
  public static final Parcelable.Creator<CustomAction> CREATOR = new a();
  public final String o;
  public final CharSequence p;
  public final int q;
  public final Bundle r;
  public PlaybackState.CustomAction s;
  
  public PlaybackStateCompat$CustomAction(Parcel paramParcel)
  {
    o = paramParcel.readString();
    p = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    q = paramParcel.readInt();
    r = paramParcel.readBundle(MediaSessionCompat.class.getClassLoader());
  }
  
  public PlaybackStateCompat$CustomAction(String paramString, CharSequence paramCharSequence, int paramInt, Bundle paramBundle)
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

/* Location:
 * Qualified Name:     android.support.v4.media.session.PlaybackStateCompat.CustomAction
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */