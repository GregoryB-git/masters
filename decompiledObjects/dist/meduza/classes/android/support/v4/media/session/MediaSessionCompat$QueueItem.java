package android.support.v4.media.session;

import android.media.MediaDescription;
import android.media.session.MediaSession.QueueItem;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.media.MediaDescriptionCompat;
import f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class MediaSessionCompat$QueueItem
  implements Parcelable
{
  public static final Parcelable.Creator<QueueItem> CREATOR = new a();
  public final MediaDescriptionCompat a;
  public final long b;
  public MediaSession.QueueItem c;
  
  public MediaSessionCompat$QueueItem(MediaSession.QueueItem paramQueueItem, MediaDescriptionCompat paramMediaDescriptionCompat, long paramLong)
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
  
  public MediaSessionCompat$QueueItem(Parcel paramParcel)
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

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.QueueItem
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */