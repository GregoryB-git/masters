package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import g;
import r.b;
import r.h;

public final class MediaMetadataCompat
  implements Parcelable
{
  public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new a();
  public static final b<String, Integer> d;
  public static final String[] e;
  public static final String[] f;
  public static final String[] o;
  public final Bundle a;
  public MediaMetadata b;
  public MediaDescriptionCompat c;
  
  static
  {
    b localb = new b();
    d = localb;
    Integer localInteger1 = Integer.valueOf(1);
    localb.put("android.media.metadata.TITLE", localInteger1);
    localb.put("android.media.metadata.ARTIST", localInteger1);
    Integer localInteger2 = Integer.valueOf(0);
    localb.put("android.media.metadata.DURATION", localInteger2);
    localb.put("android.media.metadata.ALBUM", localInteger1);
    localb.put("android.media.metadata.AUTHOR", localInteger1);
    localb.put("android.media.metadata.WRITER", localInteger1);
    localb.put("android.media.metadata.COMPOSER", localInteger1);
    localb.put("android.media.metadata.COMPILATION", localInteger1);
    localb.put("android.media.metadata.DATE", localInteger1);
    localb.put("android.media.metadata.YEAR", localInteger2);
    localb.put("android.media.metadata.GENRE", localInteger1);
    localb.put("android.media.metadata.TRACK_NUMBER", localInteger2);
    localb.put("android.media.metadata.NUM_TRACKS", localInteger2);
    localb.put("android.media.metadata.DISC_NUMBER", localInteger2);
    localb.put("android.media.metadata.ALBUM_ARTIST", localInteger1);
    Integer localInteger3 = Integer.valueOf(2);
    localb.put("android.media.metadata.ART", localInteger3);
    localb.put("android.media.metadata.ART_URI", localInteger1);
    localb.put("android.media.metadata.ALBUM_ART", localInteger3);
    localb.put("android.media.metadata.ALBUM_ART_URI", localInteger1);
    Integer localInteger4 = Integer.valueOf(3);
    localb.put("android.media.metadata.USER_RATING", localInteger4);
    localb.put("android.media.metadata.RATING", localInteger4);
    localb.put("android.media.metadata.DISPLAY_TITLE", localInteger1);
    localb.put("android.media.metadata.DISPLAY_SUBTITLE", localInteger1);
    localb.put("android.media.metadata.DISPLAY_DESCRIPTION", localInteger1);
    localb.put("android.media.metadata.DISPLAY_ICON", localInteger3);
    localb.put("android.media.metadata.DISPLAY_ICON_URI", localInteger1);
    localb.put("android.media.metadata.MEDIA_ID", localInteger1);
    localb.put("android.media.metadata.BT_FOLDER_TYPE", localInteger2);
    localb.put("android.media.metadata.MEDIA_URI", localInteger1);
    localb.put("android.media.metadata.ADVERTISEMENT", localInteger2);
    localb.put("android.media.metadata.DOWNLOAD_STATUS", localInteger2);
    e = new String[] { "android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER" };
    f = new String[] { "android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART" };
    o = new String[] { "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI" };
  }
  
  public MediaMetadataCompat(Bundle paramBundle)
  {
    paramBundle = new Bundle(paramBundle);
    a = paramBundle;
    MediaSessionCompat.a(paramBundle);
  }
  
  public MediaMetadataCompat(Parcel paramParcel)
  {
    a = paramParcel.readBundle(MediaSessionCompat.class.getClassLoader());
  }
  
  public final MediaDescriptionCompat a()
  {
    Object localObject1 = c;
    if (localObject1 != null) {
      return (MediaDescriptionCompat)localObject1;
    }
    String str = b("android.media.metadata.MEDIA_ID");
    Object localObject3 = new CharSequence[3];
    localObject1 = a.getCharSequence("android.media.metadata.DISPLAY_TITLE");
    int i;
    if (!TextUtils.isEmpty((CharSequence)localObject1))
    {
      localObject3[0] = localObject1;
      localObject3[1] = a.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
      localObject3[2] = a.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
    }
    else
    {
      i = 0;
      j = i;
      while (i < 3)
      {
        localObject1 = e;
        if (j >= localObject1.length) {
          break;
        }
        localObject1 = localObject1[j];
        localObject1 = a.getCharSequence((String)localObject1);
        int k = i;
        if (!TextUtils.isEmpty((CharSequence)localObject1))
        {
          localObject3[i] = localObject1;
          k = i + 1;
        }
        j++;
        i = k;
      }
    }
    Object localObject4;
    for (int j = 0;; j++)
    {
      localObject1 = f;
      i = localObject1.length;
      localObject4 = null;
      if (j >= i) {
        break;
      }
      localObject1 = localObject1[j];
      try
      {
        localObject1 = (Bitmap)a.getParcelable((String)localObject1);
      }
      catch (Exception localException)
      {
        Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", localException);
        localObject2 = null;
      }
      if (localObject2 != null) {
        break label209;
      }
    }
    Object localObject2 = null;
    label209:
    for (j = 0;; j++)
    {
      localObject5 = o;
      if (j >= localObject5.length) {
        break;
      }
      localObject5 = b(localObject5[j]);
      if (!TextUtils.isEmpty((CharSequence)localObject5))
      {
        localObject5 = Uri.parse((String)localObject5);
        break label263;
      }
    }
    Object localObject5 = null;
    label263:
    Object localObject6 = b("android.media.metadata.MEDIA_URI");
    if (!TextUtils.isEmpty((CharSequence)localObject6)) {
      localObject6 = Uri.parse((String)localObject6);
    } else {
      localObject6 = null;
    }
    CharSequence localCharSequence1 = localObject3[0];
    CharSequence localCharSequence2 = localObject3[1];
    CharSequence localCharSequence3 = localObject3[2];
    localObject3 = new Bundle();
    if (a.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
      ((BaseBundle)localObject3).putLong("android.media.extra.BT_FOLDER_TYPE", a.getLong("android.media.metadata.BT_FOLDER_TYPE", 0L));
    }
    if (a.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
      ((BaseBundle)localObject3).putLong("android.media.extra.DOWNLOAD_STATUS", a.getLong("android.media.metadata.DOWNLOAD_STATUS", 0L));
    }
    if (!((BaseBundle)localObject3).isEmpty()) {
      localObject4 = localObject3;
    }
    localObject2 = new MediaDescriptionCompat(str, localCharSequence1, localCharSequence2, localCharSequence3, (Bitmap)localObject2, (Uri)localObject5, (Bundle)localObject4, (Uri)localObject6);
    c = ((MediaDescriptionCompat)localObject2);
    return (MediaDescriptionCompat)localObject2;
  }
  
  public final String b(String paramString)
  {
    paramString = a.getCharSequence(paramString);
    if (paramString != null) {
      return paramString.toString();
    }
    return null;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeBundle(a);
  }
  
  public final class a
    implements Parcelable.Creator<MediaMetadataCompat>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return new MediaMetadataCompat(paramParcel);
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new MediaMetadataCompat[paramInt];
    }
  }
  
  public static final class b
  {
    public final Bundle a;
    
    public b()
    {
      a = new Bundle();
    }
    
    public b(MediaMetadataCompat paramMediaMetadataCompat)
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
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaMetadataCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */