package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.MediaDescription;
import android.media.session.MediaSession.QueueItem;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
public final class MediaSessionCompat$QueueItem
  implements Parcelable
{
  public static final Parcelable.Creator<QueueItem> CREATOR = new a();
  public final MediaDescriptionCompat o;
  public final long p;
  public MediaSession.QueueItem q;
  
  public MediaSessionCompat$QueueItem(MediaSession.QueueItem paramQueueItem, MediaDescriptionCompat paramMediaDescriptionCompat, long paramLong)
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
  
  public MediaSessionCompat$QueueItem(Parcel paramParcel)
  {
    o = ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel));
    p = paramParcel.readLong();
  }
  
  public MediaSessionCompat$QueueItem(MediaDescriptionCompat paramMediaDescriptionCompat, long paramLong)
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

/* Location:
 * Qualified Name:     android.support.v4.media.session.MediaSessionCompat.QueueItem
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */