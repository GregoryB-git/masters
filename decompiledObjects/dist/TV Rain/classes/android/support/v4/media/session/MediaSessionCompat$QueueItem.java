package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.MediaDescription;
import android.media.session.MediaSession.QueueItem;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import z2;

@SuppressLint({"BanParcelableUsage"})
public final class MediaSessionCompat$QueueItem
  implements Parcelable
{
  public static final Parcelable.Creator<QueueItem> CREATOR = new Parcelable.Creator()
  {
    public MediaSessionCompat.QueueItem createFromParcel(Parcel paramAnonymousParcel)
    {
      return new MediaSessionCompat.QueueItem(paramAnonymousParcel);
    }
    
    public MediaSessionCompat.QueueItem[] newArray(int paramAnonymousInt)
    {
      return new MediaSessionCompat.QueueItem[paramAnonymousInt];
    }
  };
  public static final int UNKNOWN_ID = -1;
  private final MediaDescriptionCompat mDescription;
  private final long mId;
  private MediaSession.QueueItem mItemFwk;
  
  private MediaSessionCompat$QueueItem(MediaSession.QueueItem paramQueueItem, MediaDescriptionCompat paramMediaDescriptionCompat, long paramLong)
  {
    if (paramMediaDescriptionCompat != null)
    {
      if (paramLong != -1L)
      {
        mDescription = paramMediaDescriptionCompat;
        mId = paramLong;
        mItemFwk = paramQueueItem;
        return;
      }
      throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
    }
    throw new IllegalArgumentException("Description cannot be null");
  }
  
  public MediaSessionCompat$QueueItem(Parcel paramParcel)
  {
    mDescription = ((MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel));
    mId = paramParcel.readLong();
  }
  
  public MediaSessionCompat$QueueItem(MediaDescriptionCompat paramMediaDescriptionCompat, long paramLong)
  {
    this(null, paramMediaDescriptionCompat, paramLong);
  }
  
  public static QueueItem fromQueueItem(Object paramObject)
  {
    if (paramObject != null)
    {
      paramObject = (MediaSession.QueueItem)paramObject;
      return new QueueItem((MediaSession.QueueItem)paramObject, MediaDescriptionCompat.fromMediaDescription(Api21Impl.getDescription((MediaSession.QueueItem)paramObject)), Api21Impl.getQueueId((MediaSession.QueueItem)paramObject));
    }
    return null;
  }
  
  public static List<QueueItem> fromQueueItemList(List<?> paramList)
  {
    if (paramList != null)
    {
      ArrayList localArrayList = new ArrayList(paramList.size());
      paramList = paramList.iterator();
      while (paramList.hasNext()) {
        localArrayList.add(fromQueueItem(paramList.next()));
      }
      return localArrayList;
    }
    return null;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public MediaDescriptionCompat getDescription()
  {
    return mDescription;
  }
  
  public long getQueueId()
  {
    return mId;
  }
  
  public Object getQueueItem()
  {
    MediaSession.QueueItem localQueueItem1 = mItemFwk;
    MediaSession.QueueItem localQueueItem2 = localQueueItem1;
    if (localQueueItem1 == null)
    {
      localQueueItem2 = Api21Impl.createQueueItem((MediaDescription)mDescription.getMediaDescription(), mId);
      mItemFwk = localQueueItem2;
    }
    return localQueueItem2;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("MediaSession.QueueItem {Description=");
    localStringBuilder.append(mDescription);
    localStringBuilder.append(", Id=");
    return z2.r(localStringBuilder, mId, " }");
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    mDescription.writeToParcel(paramParcel, paramInt);
    paramParcel.writeLong(mId);
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    @DoNotInline
    public static MediaSession.QueueItem createQueueItem(MediaDescription paramMediaDescription, long paramLong)
    {
      return new MediaSession.QueueItem(paramMediaDescription, paramLong);
    }
    
    @DoNotInline
    public static MediaDescription getDescription(MediaSession.QueueItem paramQueueItem)
    {
      return paramQueueItem.getDescription();
    }
    
    @DoNotInline
    public static long getQueueId(MediaSession.QueueItem paramQueueItem)
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