package android.support.v4.media;

import android.media.browse.MediaBrowser.MediaItem;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MediaBrowserCompat$MediaItem
  implements Parcelable
{
  public static final Parcelable.Creator<MediaItem> CREATOR = new a();
  public final int a;
  public final MediaDescriptionCompat b;
  
  public MediaBrowserCompat$MediaItem(Parcel paramParcel)
  {
    a = paramParcel.readInt();
    b = ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel));
  }
  
  public MediaBrowserCompat$MediaItem(MediaDescriptionCompat paramMediaDescriptionCompat, int paramInt)
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

/* Location:
 * Qualified Name:     android.support.v4.media.MediaBrowserCompat.MediaItem
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */