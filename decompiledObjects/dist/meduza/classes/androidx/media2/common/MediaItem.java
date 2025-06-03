package androidx.media2.common;

import android.os.BaseBundle;
import android.os.Bundle;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.util.ArrayList;

public class MediaItem
  extends CustomVersionedParcelable
{
  public final Object a = new Object();
  public MediaMetadata b;
  public long c = 0L;
  public long d = 576460752303423487L;
  
  public MediaItem()
  {
    new ArrayList();
  }
  
  public MediaItem(MediaMetadata paramMediaMetadata, long paramLong1, long paramLong2)
  {
    new ArrayList();
    if (paramLong1 <= paramLong2)
    {
      if ((paramMediaMetadata != null) && (a.containsKey("android.media.metadata.DURATION")))
      {
        long l = a.getLong("android.media.metadata.DURATION", 0L);
        if ((l != Long.MIN_VALUE) && (paramLong2 != 576460752303423487L) && (paramLong2 > l))
        {
          paramMediaMetadata = new StringBuilder();
          paramMediaMetadata.append("endPositionMs shouldn't be greater than duration in the metdata, endPositionMs=");
          paramMediaMetadata.append(paramLong2);
          paramMediaMetadata.append(", durationMs=");
          paramMediaMetadata.append(l);
          throw new IllegalStateException(paramMediaMetadata.toString());
        }
      }
      b = paramMediaMetadata;
      c = paramLong1;
      d = paramLong2;
      return;
    }
    paramMediaMetadata = new StringBuilder();
    paramMediaMetadata.append("Illegal start/end position: ");
    paramMediaMetadata.append(paramLong1);
    paramMediaMetadata.append(" : ");
    paramMediaMetadata.append(paramLong2);
    throw new IllegalStateException(paramMediaMetadata.toString());
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(getClass().getSimpleName());
    synchronized (a)
    {
      localStringBuilder.append("{Media Id=");
      synchronized (a)
      {
        Object localObject3 = b;
        Object localObject4 = null;
        Object localObject5 = localObject4;
        if (localObject3 != null)
        {
          localObject3 = a.getCharSequence("android.media.metadata.MEDIA_ID");
          localObject5 = localObject4;
          if (localObject3 != null) {
            localObject5 = ((CharSequence)localObject3).toString();
          }
        }
        localStringBuilder.append((String)localObject5);
        localStringBuilder.append(", mMetadata=");
        localStringBuilder.append(b);
        localStringBuilder.append(", mStartPositionMs=");
        localStringBuilder.append(c);
        localStringBuilder.append(", mEndPositionMs=");
        localStringBuilder.append(d);
        localStringBuilder.append('}');
        return localStringBuilder.toString();
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media2.common.MediaItem
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */