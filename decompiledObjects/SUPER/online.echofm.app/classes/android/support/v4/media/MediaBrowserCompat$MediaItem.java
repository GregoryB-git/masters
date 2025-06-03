package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

@SuppressLint({"BanParcelableUsage"})
public class MediaBrowserCompat$MediaItem
  implements Parcelable
{
  public static final Parcelable.Creator<MediaItem> CREATOR = new a();
  public final int o;
  public final MediaDescriptionCompat p;
  
  public MediaBrowserCompat$MediaItem(Parcel paramParcel)
  {
    o = paramParcel.readInt();
    p = ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel));
  }
  
  public MediaBrowserCompat$MediaItem(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
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

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.MediaItem
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */