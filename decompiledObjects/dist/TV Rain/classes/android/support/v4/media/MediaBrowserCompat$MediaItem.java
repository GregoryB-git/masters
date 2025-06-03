package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.browse.MediaBrowser.MediaItem;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
public class MediaBrowserCompat$MediaItem
  implements Parcelable
{
  public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator()
  {
    public MediaBrowserCompat.MediaItem createFromParcel(Parcel paramAnonymousParcel)
    {
      return new MediaBrowserCompat.MediaItem(paramAnonymousParcel);
    }
    
    public MediaBrowserCompat.MediaItem[] newArray(int paramAnonymousInt)
    {
      return new MediaBrowserCompat.MediaItem[paramAnonymousInt];
    }
  };
  public static final int FLAG_BROWSABLE = 1;
  public static final int FLAG_PLAYABLE = 2;
  private final MediaDescriptionCompat mDescription;
  private final int mFlags;
  
  public MediaBrowserCompat$MediaItem(Parcel paramParcel)
  {
    mFlags = paramParcel.readInt();
    mDescription = ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel));
  }
  
  public MediaBrowserCompat$MediaItem(@NonNull MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
  {
    if (paramMediaDescriptionCompat != null)
    {
      if (!TextUtils.isEmpty(paramMediaDescriptionCompat.getMediaId()))
      {
        mFlags = paramInt;
        mDescription = paramMediaDescriptionCompat;
        return;
      }
      throw new IllegalArgumentException("description must have a non-empty media id");
    }
    throw new IllegalArgumentException("description cannot be null");
  }
  
  public static MediaItem fromMediaItem(Object paramObject)
  {
    if (paramObject != null)
    {
      paramObject = (MediaBrowser.MediaItem)paramObject;
      int i = MediaBrowserCompat.Api21Impl.getFlags((MediaBrowser.MediaItem)paramObject);
      return new MediaItem(MediaDescriptionCompat.fromMediaDescription(MediaBrowserCompat.Api21Impl.getDescription((MediaBrowser.MediaItem)paramObject)), i);
    }
    return null;
  }
  
  public static List<MediaItem> fromMediaItemList(List<?> paramList)
  {
    if (paramList != null)
    {
      ArrayList localArrayList = new ArrayList(paramList.size());
      paramList = paramList.iterator();
      while (paramList.hasNext()) {
        localArrayList.add(fromMediaItem(paramList.next()));
      }
      return localArrayList;
    }
    return null;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  @NonNull
  public MediaDescriptionCompat getDescription()
  {
    return mDescription;
  }
  
  public int getFlags()
  {
    return mFlags;
  }
  
  @Nullable
  public String getMediaId()
  {
    return mDescription.getMediaId();
  }
  
  public boolean isBrowsable()
  {
    int i = mFlags;
    boolean bool = true;
    if ((i & 0x1) == 0) {
      bool = false;
    }
    return bool;
  }
  
  public boolean isPlayable()
  {
    boolean bool;
    if ((mFlags & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @NonNull
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("MediaItem{");
    localStringBuilder.append("mFlags=");
    localStringBuilder.append(mFlags);
    localStringBuilder.append(", mDescription=");
    localStringBuilder.append(mDescription);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(mFlags);
    mDescription.writeToParcel(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.MediaItem
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */