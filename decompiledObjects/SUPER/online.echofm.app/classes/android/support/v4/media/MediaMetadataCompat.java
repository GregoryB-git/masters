package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import t.a;
import t.h;

@SuppressLint({"BanParcelableUsage"})
public final class MediaMetadataCompat
  implements Parcelable
{
  public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new a();
  public static final a r;
  public static final String[] s;
  public static final String[] t;
  public static final String[] u;
  public final Bundle o;
  public MediaMetadata p;
  public MediaDescriptionCompat q;
  
  static
  {
    a locala = new a();
    r = locala;
    Integer localInteger1 = Integer.valueOf(1);
    locala.put("android.media.metadata.TITLE", localInteger1);
    locala.put("android.media.metadata.ARTIST", localInteger1);
    Integer localInteger2 = Integer.valueOf(0);
    locala.put("android.media.metadata.DURATION", localInteger2);
    locala.put("android.media.metadata.ALBUM", localInteger1);
    locala.put("android.media.metadata.AUTHOR", localInteger1);
    locala.put("android.media.metadata.WRITER", localInteger1);
    locala.put("android.media.metadata.COMPOSER", localInteger1);
    locala.put("android.media.metadata.COMPILATION", localInteger1);
    locala.put("android.media.metadata.DATE", localInteger1);
    locala.put("android.media.metadata.YEAR", localInteger2);
    locala.put("android.media.metadata.GENRE", localInteger1);
    locala.put("android.media.metadata.TRACK_NUMBER", localInteger2);
    locala.put("android.media.metadata.NUM_TRACKS", localInteger2);
    locala.put("android.media.metadata.DISC_NUMBER", localInteger2);
    locala.put("android.media.metadata.ALBUM_ARTIST", localInteger1);
    Integer localInteger3 = Integer.valueOf(2);
    locala.put("android.media.metadata.ART", localInteger3);
    locala.put("android.media.metadata.ART_URI", localInteger1);
    locala.put("android.media.metadata.ALBUM_ART", localInteger3);
    locala.put("android.media.metadata.ALBUM_ART_URI", localInteger1);
    Integer localInteger4 = Integer.valueOf(3);
    locala.put("android.media.metadata.USER_RATING", localInteger4);
    locala.put("android.media.metadata.RATING", localInteger4);
    locala.put("android.media.metadata.DISPLAY_TITLE", localInteger1);
    locala.put("android.media.metadata.DISPLAY_SUBTITLE", localInteger1);
    locala.put("android.media.metadata.DISPLAY_DESCRIPTION", localInteger1);
    locala.put("android.media.metadata.DISPLAY_ICON", localInteger3);
    locala.put("android.media.metadata.DISPLAY_ICON_URI", localInteger1);
    locala.put("android.media.metadata.MEDIA_ID", localInteger1);
    locala.put("android.media.metadata.BT_FOLDER_TYPE", localInteger2);
    locala.put("android.media.metadata.MEDIA_URI", localInteger1);
    locala.put("android.media.metadata.ADVERTISEMENT", localInteger2);
    locala.put("android.media.metadata.DOWNLOAD_STATUS", localInteger2);
    s = new String[] { "android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER" };
    t = new String[] { "android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART" };
    u = new String[] { "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI" };
  }
  
  public MediaMetadataCompat(Bundle paramBundle)
  {
    paramBundle = new Bundle(paramBundle);
    o = paramBundle;
    MediaSessionCompat.a(paramBundle);
  }
  
  public MediaMetadataCompat(Parcel paramParcel)
  {
    o = paramParcel.readBundle(MediaSessionCompat.class.getClassLoader());
  }
  
  public static MediaMetadataCompat b(Object paramObject)
  {
    if (paramObject != null)
    {
      Parcel localParcel = Parcel.obtain();
      MediaMetadata localMediaMetadata = (MediaMetadata)paramObject;
      localMediaMetadata.writeToParcel(localParcel, 0);
      localParcel.setDataPosition(0);
      paramObject = (MediaMetadataCompat)CREATOR.createFromParcel(localParcel);
      localParcel.recycle();
      p = localMediaMetadata;
      return (MediaMetadataCompat)paramObject;
    }
    return null;
  }
  
  public boolean a(String paramString)
  {
    return o.containsKey(paramString);
  }
  
  public Bitmap c(String paramString)
  {
    try
    {
      paramString = (Bitmap)o.getParcelable(paramString);
    }
    catch (Exception paramString)
    {
      Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", paramString);
      paramString = null;
    }
    return paramString;
  }
  
  public Bundle d()
  {
    return new Bundle(o);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public MediaDescriptionCompat e()
  {
    Object localObject1 = q;
    if (localObject1 != null) {
      return (MediaDescriptionCompat)localObject1;
    }
    String str = i("android.media.metadata.MEDIA_ID");
    CharSequence[] arrayOfCharSequence = new CharSequence[3];
    localObject1 = j("android.media.metadata.DISPLAY_TITLE");
    int i;
    if (!TextUtils.isEmpty((CharSequence)localObject1))
    {
      arrayOfCharSequence[0] = localObject1;
      arrayOfCharSequence[1] = j("android.media.metadata.DISPLAY_SUBTITLE");
      arrayOfCharSequence[2] = j("android.media.metadata.DISPLAY_DESCRIPTION");
    }
    else
    {
      i = 0;
      j = i;
      while (i < 3)
      {
        localObject1 = s;
        if (j >= localObject1.length) {
          break;
        }
        localObject1 = j(localObject1[j]);
        int k = i;
        if (!TextUtils.isEmpty((CharSequence)localObject1))
        {
          arrayOfCharSequence[i] = localObject1;
          k = i + 1;
        }
        j++;
        i = k;
      }
    }
    Uri localUri;
    for (int j = 0;; j++)
    {
      localObject1 = t;
      i = localObject1.length;
      localUri = null;
      if (j >= i) {
        break;
      }
      localObject1 = c(localObject1[j]);
      if (localObject1 != null) {
        break label172;
      }
    }
    localObject1 = null;
    label172:
    for (j = 0;; j++)
    {
      localObject2 = u;
      if (j >= localObject2.length) {
        break;
      }
      localObject2 = i(localObject2[j]);
      if (!TextUtils.isEmpty((CharSequence)localObject2))
      {
        localObject2 = Uri.parse((String)localObject2);
        break label226;
      }
    }
    Object localObject2 = null;
    label226:
    Object localObject3 = i("android.media.metadata.MEDIA_URI");
    if (!TextUtils.isEmpty((CharSequence)localObject3)) {
      localUri = Uri.parse((String)localObject3);
    }
    localObject3 = new MediaDescriptionCompat.d();
    ((MediaDescriptionCompat.d)localObject3).f(str);
    ((MediaDescriptionCompat.d)localObject3).i(arrayOfCharSequence[0]);
    ((MediaDescriptionCompat.d)localObject3).h(arrayOfCharSequence[1]);
    ((MediaDescriptionCompat.d)localObject3).b(arrayOfCharSequence[2]);
    ((MediaDescriptionCompat.d)localObject3).d((Bitmap)localObject1);
    ((MediaDescriptionCompat.d)localObject3).e((Uri)localObject2);
    ((MediaDescriptionCompat.d)localObject3).g(localUri);
    localObject1 = new Bundle();
    if (o.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
      ((BaseBundle)localObject1).putLong("android.media.extra.BT_FOLDER_TYPE", f("android.media.metadata.BT_FOLDER_TYPE"));
    }
    if (o.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
      ((BaseBundle)localObject1).putLong("android.media.extra.DOWNLOAD_STATUS", f("android.media.metadata.DOWNLOAD_STATUS"));
    }
    if (!((BaseBundle)localObject1).isEmpty()) {
      ((MediaDescriptionCompat.d)localObject3).c((Bundle)localObject1);
    }
    localObject1 = ((MediaDescriptionCompat.d)localObject3).a();
    q = ((MediaDescriptionCompat)localObject1);
    return (MediaDescriptionCompat)localObject1;
  }
  
  public long f(String paramString)
  {
    return o.getLong(paramString, 0L);
  }
  
  public Object g()
  {
    if (p == null)
    {
      Parcel localParcel = Parcel.obtain();
      writeToParcel(localParcel, 0);
      localParcel.setDataPosition(0);
      p = ((MediaMetadata)MediaMetadata.CREATOR.createFromParcel(localParcel));
      localParcel.recycle();
    }
    return p;
  }
  
  public RatingCompat h(String paramString)
  {
    try
    {
      paramString = RatingCompat.a(o.getParcelable(paramString));
    }
    catch (Exception paramString)
    {
      Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", paramString);
      paramString = null;
    }
    return paramString;
  }
  
  public String i(String paramString)
  {
    paramString = o.getCharSequence(paramString);
    if (paramString != null) {
      return paramString.toString();
    }
    return null;
  }
  
  public CharSequence j(String paramString)
  {
    return o.getCharSequence(paramString);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeBundle(o);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public MediaMetadataCompat a(Parcel paramParcel)
    {
      return new MediaMetadataCompat(paramParcel);
    }
    
    public MediaMetadataCompat[] b(int paramInt)
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
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaMetadataCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */