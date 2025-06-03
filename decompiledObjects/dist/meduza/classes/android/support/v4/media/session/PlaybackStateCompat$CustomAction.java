package android.support.v4.media.session;

import android.media.session.PlaybackState.CustomAction;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import f;

public final class PlaybackStateCompat$CustomAction
  implements Parcelable
{
  public static final Parcelable.Creator<CustomAction> CREATOR = new a();
  public final String a;
  public final CharSequence b;
  public final int c;
  public final Bundle d;
  public PlaybackState.CustomAction e;
  
  public PlaybackStateCompat$CustomAction(Parcel paramParcel)
  {
    a = paramParcel.readString();
    b = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    c = paramParcel.readInt();
    d = paramParcel.readBundle(MediaSessionCompat.class.getClassLoader());
  }
  
  public PlaybackStateCompat$CustomAction(String paramString, CharSequence paramCharSequence, int paramInt, Bundle paramBundle)
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

/* Location:
 * Qualified Name:     android.support.v4.media.session.PlaybackStateCompat.CustomAction
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */