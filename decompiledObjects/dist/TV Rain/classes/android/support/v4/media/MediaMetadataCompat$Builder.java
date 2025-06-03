package android.support.v4.media;

import android.graphics.Bitmap;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import java.util.Iterator;
import java.util.Set;
import z2;

public final class MediaMetadataCompat$Builder
{
  private final Bundle mBundle;
  
  public MediaMetadataCompat$Builder()
  {
    mBundle = new Bundle();
  }
  
  public MediaMetadataCompat$Builder(MediaMetadataCompat paramMediaMetadataCompat)
  {
    paramMediaMetadataCompat = new Bundle(mBundle);
    mBundle = paramMediaMetadataCompat;
    MediaSessionCompat.ensureClassLoader(paramMediaMetadataCompat);
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public MediaMetadataCompat$Builder(MediaMetadataCompat paramMediaMetadataCompat, int paramInt)
  {
    this(paramMediaMetadataCompat);
    Iterator localIterator = mBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      paramMediaMetadataCompat = (String)localIterator.next();
      Object localObject = mBundle.get(paramMediaMetadataCompat);
      if ((localObject instanceof Bitmap))
      {
        localObject = (Bitmap)localObject;
        if ((((Bitmap)localObject).getHeight() > paramInt) || (((Bitmap)localObject).getWidth() > paramInt)) {
          putBitmap(paramMediaMetadataCompat, scaleBitmap((Bitmap)localObject, paramInt));
        }
      }
    }
  }
  
  private Bitmap scaleBitmap(Bitmap paramBitmap, int paramInt)
  {
    float f = paramInt;
    f = Math.min(f / paramBitmap.getWidth(), f / paramBitmap.getHeight());
    paramInt = (int)(paramBitmap.getHeight() * f);
    return Bitmap.createScaledBitmap(paramBitmap, (int)(paramBitmap.getWidth() * f), paramInt, true);
  }
  
  public MediaMetadataCompat build()
  {
    return new MediaMetadataCompat(mBundle);
  }
  
  public Builder putBitmap(String paramString, Bitmap paramBitmap)
  {
    ArrayMap localArrayMap = MediaMetadataCompat.METADATA_KEYS_TYPE;
    if ((localArrayMap.containsKey(paramString)) && (((Integer)localArrayMap.get(paramString)).intValue() != 2)) {
      throw new IllegalArgumentException(z2.p("The ", paramString, " key cannot be used to put a Bitmap"));
    }
    mBundle.putParcelable(paramString, paramBitmap);
    return this;
  }
  
  public Builder putLong(String paramString, long paramLong)
  {
    ArrayMap localArrayMap = MediaMetadataCompat.METADATA_KEYS_TYPE;
    if ((localArrayMap.containsKey(paramString)) && (((Integer)localArrayMap.get(paramString)).intValue() != 0)) {
      throw new IllegalArgumentException(z2.p("The ", paramString, " key cannot be used to put a long"));
    }
    mBundle.putLong(paramString, paramLong);
    return this;
  }
  
  public Builder putRating(String paramString, RatingCompat paramRatingCompat)
  {
    ArrayMap localArrayMap = MediaMetadataCompat.METADATA_KEYS_TYPE;
    if ((localArrayMap.containsKey(paramString)) && (((Integer)localArrayMap.get(paramString)).intValue() != 3)) {
      throw new IllegalArgumentException(z2.p("The ", paramString, " key cannot be used to put a Rating"));
    }
    mBundle.putParcelable(paramString, (Parcelable)paramRatingCompat.getRating());
    return this;
  }
  
  public Builder putString(String paramString1, String paramString2)
  {
    ArrayMap localArrayMap = MediaMetadataCompat.METADATA_KEYS_TYPE;
    if ((localArrayMap.containsKey(paramString1)) && (((Integer)localArrayMap.get(paramString1)).intValue() != 1)) {
      throw new IllegalArgumentException(z2.p("The ", paramString1, " key cannot be used to put a String"));
    }
    mBundle.putCharSequence(paramString1, paramString2);
    return this;
  }
  
  public Builder putText(String paramString, CharSequence paramCharSequence)
  {
    ArrayMap localArrayMap = MediaMetadataCompat.METADATA_KEYS_TYPE;
    if ((localArrayMap.containsKey(paramString)) && (((Integer)localArrayMap.get(paramString)).intValue() != 1)) {
      throw new IllegalArgumentException(z2.p("The ", paramString, " key cannot be used to put a CharSequence"));
    }
    mBundle.putCharSequence(paramString, paramCharSequence);
    return this;
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaMetadataCompat.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */