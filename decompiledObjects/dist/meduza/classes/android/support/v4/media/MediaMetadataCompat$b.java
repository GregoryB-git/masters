package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.Rating;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import g;
import r.b;
import r.h;

public final class MediaMetadataCompat$b
{
  public final Bundle a;
  
  public MediaMetadataCompat$b()
  {
    a = new Bundle();
  }
  
  public MediaMetadataCompat$b(MediaMetadataCompat paramMediaMetadataCompat)
  {
    paramMediaMetadataCompat = new Bundle(a);
    a = paramMediaMetadataCompat;
    MediaSessionCompat.a(paramMediaMetadataCompat);
  }
  
  public final void a(Bitmap paramBitmap, String paramString)
  {
    b localb = MediaMetadataCompat.d;
    if ((localb.containsKey(paramString)) && (((Integer)localb.getOrDefault(paramString, null)).intValue() != 2)) {
      throw new IllegalArgumentException(g.e("The ", paramString, " key cannot be used to put a Bitmap"));
    }
    a.putParcelable(paramString, paramBitmap);
  }
  
  public final void b(String paramString, long paramLong)
  {
    b localb = MediaMetadataCompat.d;
    if ((localb.containsKey(paramString)) && (((Integer)localb.getOrDefault(paramString, null)).intValue() != 0)) {
      throw new IllegalArgumentException(g.e("The ", paramString, " key cannot be used to put a long"));
    }
    a.putLong(paramString, paramLong);
  }
  
  public final void c(String paramString, RatingCompat paramRatingCompat)
  {
    Object localObject = MediaMetadataCompat.d;
    boolean bool1 = ((h)localObject).containsKey(paramString);
    Rating localRating = null;
    if ((bool1) && (((Integer)((h)localObject).getOrDefault(paramString, null)).intValue() != 3)) {
      throw new IllegalArgumentException(g.e("The ", paramString, " key cannot be used to put a Rating"));
    }
    localObject = a;
    if (c == null)
    {
      float f = b;
      int i = 1;
      boolean bool2 = true;
      boolean bool3 = true;
      int j = 1;
      boolean bool4 = false;
      bool1 = false;
      int k;
      if (f >= 0.0F) {
        k = 1;
      } else {
        k = 0;
      }
      if (k != 0)
      {
        int m = a;
        switch (m)
        {
        default: 
          paramRatingCompat = localRating;
          break;
        case 6: 
          if (m == 6)
          {
            if (f >= 0.0F) {
              k = j;
            } else {
              k = 0;
            }
            if (k != 0) {}
          }
          else
          {
            f = -1.0F;
          }
          localRating = RatingCompat.b.h(f);
          break;
        case 3: 
        case 4: 
        case 5: 
          if ((m == 3) || (m == 4) || (m == 5))
          {
            if (f >= 0.0F) {
              k = i;
            } else {
              k = 0;
            }
            if (k != 0) {}
          }
          else
          {
            f = -1.0F;
          }
          localRating = RatingCompat.b.i(m, f);
          break;
        case 2: 
          if (m == 2) {
            if (f == 1.0F) {
              bool1 = bool2;
            } else {
              bool1 = false;
            }
          }
          localRating = RatingCompat.b.j(bool1);
          break;
        case 1: 
          if (m != 1) {
            bool1 = bool4;
          } else if (f == 1.0F) {
            bool1 = bool3;
          } else {
            bool1 = false;
          }
          localRating = RatingCompat.b.g(bool1);
          break;
        }
      }
      else
      {
        localRating = RatingCompat.b.k(a);
      }
      c = localRating;
    }
    paramRatingCompat = c;
    ((Bundle)localObject).putParcelable(paramString, (Parcelable)paramRatingCompat);
  }
  
  public final void d(String paramString1, String paramString2)
  {
    b localb = MediaMetadataCompat.d;
    if ((localb.containsKey(paramString1)) && (((Integer)localb.getOrDefault(paramString1, null)).intValue() != 1)) {
      throw new IllegalArgumentException(g.e("The ", paramString1, " key cannot be used to put a String"));
    }
    a.putCharSequence(paramString1, paramString2);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaMetadataCompat.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */