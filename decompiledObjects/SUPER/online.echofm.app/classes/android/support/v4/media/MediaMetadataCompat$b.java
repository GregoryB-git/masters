package android.support.v4.media;

import android.graphics.Bitmap;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import t.a;
import t.h;

public final class MediaMetadataCompat$b
{
  public final Bundle a;
  
  public MediaMetadataCompat$b()
  {
    a = new Bundle();
  }
  
  public MediaMetadataCompat$b(MediaMetadataCompat paramMediaMetadataCompat)
  {
    paramMediaMetadataCompat = new Bundle(o);
    a = paramMediaMetadataCompat;
    MediaSessionCompat.a(paramMediaMetadataCompat);
  }
  
  public MediaMetadataCompat a()
  {
    return new MediaMetadataCompat(a);
  }
  
  public b b(String paramString, Bitmap paramBitmap)
  {
    a locala = MediaMetadataCompat.r;
    if ((locala.containsKey(paramString)) && (((Integer)locala.get(paramString)).intValue() != 2))
    {
      paramBitmap = new StringBuilder();
      paramBitmap.append("The ");
      paramBitmap.append(paramString);
      paramBitmap.append(" key cannot be used to put a Bitmap");
      throw new IllegalArgumentException(paramBitmap.toString());
    }
    a.putParcelable(paramString, paramBitmap);
    return this;
  }
  
  public b c(String paramString, long paramLong)
  {
    Object localObject = MediaMetadataCompat.r;
    if ((((h)localObject).containsKey(paramString)) && (((Integer)((h)localObject).get(paramString)).intValue() != 0))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("The ");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append(" key cannot be used to put a long");
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    a.putLong(paramString, paramLong);
    return this;
  }
  
  public b d(String paramString, RatingCompat paramRatingCompat)
  {
    a locala = MediaMetadataCompat.r;
    if ((locala.containsKey(paramString)) && (((Integer)locala.get(paramString)).intValue() != 3))
    {
      paramRatingCompat = new StringBuilder();
      paramRatingCompat.append("The ");
      paramRatingCompat.append(paramString);
      paramRatingCompat.append(" key cannot be used to put a Rating");
      throw new IllegalArgumentException(paramRatingCompat.toString());
    }
    a.putParcelable(paramString, (Parcelable)paramRatingCompat.c());
    return this;
  }
  
  public b e(String paramString1, String paramString2)
  {
    a locala = MediaMetadataCompat.r;
    if ((locala.containsKey(paramString1)) && (((Integer)locala.get(paramString1)).intValue() != 1))
    {
      paramString2 = new StringBuilder();
      paramString2.append("The ");
      paramString2.append(paramString1);
      paramString2.append(" key cannot be used to put a String");
      throw new IllegalArgumentException(paramString2.toString());
    }
    a.putCharSequence(paramString1, paramString2);
    return this;
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaMetadataCompat.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */