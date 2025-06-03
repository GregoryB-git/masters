package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.media.session.MediaSessionCompat;

public final class MediaDescriptionCompat
  implements Parcelable
{
  public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();
  public final String a;
  public final CharSequence b;
  public final CharSequence c;
  public final CharSequence d;
  public final Bitmap e;
  public final Uri f;
  public final Bundle o;
  public final Uri p;
  public MediaDescription q;
  
  public MediaDescriptionCompat() {}
  
  public MediaDescriptionCompat(String paramString, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, Bitmap paramBitmap, Uri paramUri1, Bundle paramBundle, Uri paramUri2)
  {
    a = paramString;
    b = paramCharSequence1;
    c = paramCharSequence2;
    d = paramCharSequence3;
    e = paramBitmap;
    f = paramUri1;
    o = paramBundle;
    p = paramUri2;
  }
  
  public static MediaDescriptionCompat a(Object paramObject)
  {
    Object localObject = null;
    if (paramObject != null)
    {
      MediaDescription localMediaDescription = (MediaDescription)paramObject;
      String str = b.g(localMediaDescription);
      CharSequence localCharSequence1 = b.i(localMediaDescription);
      CharSequence localCharSequence2 = b.h(localMediaDescription);
      CharSequence localCharSequence3 = b.c(localMediaDescription);
      Bitmap localBitmap = b.e(localMediaDescription);
      Uri localUri = b.f(localMediaDescription);
      localObject = b.d(localMediaDescription);
      paramObject = localObject;
      if (localObject != null) {
        paramObject = MediaSessionCompat.l((Bundle)localObject);
      }
      if (paramObject != null) {
        localObject = (Uri)((Bundle)paramObject).getParcelable("android.support.v4.media.description.MEDIA_URI");
      } else {
        localObject = null;
      }
      if (localObject != null) {
        if ((((BaseBundle)paramObject).containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG")) && (((BaseBundle)paramObject).size() == 2))
        {
          paramObject = null;
        }
        else
        {
          ((Bundle)paramObject).remove("android.support.v4.media.description.MEDIA_URI");
          ((Bundle)paramObject).remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
        }
      }
      if (localObject == null) {
        localObject = c.a(localMediaDescription);
      }
      localObject = new MediaDescriptionCompat(str, localCharSequence1, localCharSequence2, localCharSequence3, localBitmap, localUri, (Bundle)paramObject, (Uri)localObject);
      q = localMediaDescription;
    }
    return (MediaDescriptionCompat)localObject;
  }
  
  public final MediaDescription b()
  {
    MediaDescription localMediaDescription = q;
    Object localObject = localMediaDescription;
    if (localMediaDescription == null)
    {
      localObject = b.b();
      b.n((MediaDescription.Builder)localObject, a);
      b.p((MediaDescription.Builder)localObject, b);
      b.o((MediaDescription.Builder)localObject, c);
      b.j((MediaDescription.Builder)localObject, d);
      b.l((MediaDescription.Builder)localObject, e);
      b.m((MediaDescription.Builder)localObject, f);
      b.k((MediaDescription.Builder)localObject, o);
      c.b((MediaDescription.Builder)localObject, p);
      localObject = b.a((MediaDescription.Builder)localObject);
      q = ((MediaDescription)localObject);
    }
    return (MediaDescription)localObject;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(b);
    localStringBuilder.append(", ");
    localStringBuilder.append(c);
    localStringBuilder.append(", ");
    localStringBuilder.append(d);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b().writeToParcel(paramParcel, paramInt);
  }
  
  public final class a
    implements Parcelable.Creator<MediaDescriptionCompat>
  {
    public final Object createFromParcel(Parcel paramParcel)
    {
      return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(paramParcel));
    }
    
    public final Object[] newArray(int paramInt)
    {
      return new MediaDescriptionCompat[paramInt];
    }
  }
  
  public static final class b
  {
    public static MediaDescription a(MediaDescription.Builder paramBuilder)
    {
      return paramBuilder.build();
    }
    
    public static MediaDescription.Builder b()
    {
      return new MediaDescription.Builder();
    }
    
    public static CharSequence c(MediaDescription paramMediaDescription)
    {
      return paramMediaDescription.getDescription();
    }
    
    public static Bundle d(MediaDescription paramMediaDescription)
    {
      return paramMediaDescription.getExtras();
    }
    
    public static Bitmap e(MediaDescription paramMediaDescription)
    {
      return paramMediaDescription.getIconBitmap();
    }
    
    public static Uri f(MediaDescription paramMediaDescription)
    {
      return paramMediaDescription.getIconUri();
    }
    
    public static String g(MediaDescription paramMediaDescription)
    {
      return paramMediaDescription.getMediaId();
    }
    
    public static CharSequence h(MediaDescription paramMediaDescription)
    {
      return paramMediaDescription.getSubtitle();
    }
    
    public static CharSequence i(MediaDescription paramMediaDescription)
    {
      return paramMediaDescription.getTitle();
    }
    
    public static void j(MediaDescription.Builder paramBuilder, CharSequence paramCharSequence)
    {
      paramBuilder.setDescription(paramCharSequence);
    }
    
    public static void k(MediaDescription.Builder paramBuilder, Bundle paramBundle)
    {
      paramBuilder.setExtras(paramBundle);
    }
    
    public static void l(MediaDescription.Builder paramBuilder, Bitmap paramBitmap)
    {
      paramBuilder.setIconBitmap(paramBitmap);
    }
    
    public static void m(MediaDescription.Builder paramBuilder, Uri paramUri)
    {
      paramBuilder.setIconUri(paramUri);
    }
    
    public static void n(MediaDescription.Builder paramBuilder, String paramString)
    {
      paramBuilder.setMediaId(paramString);
    }
    
    public static void o(MediaDescription.Builder paramBuilder, CharSequence paramCharSequence)
    {
      paramBuilder.setSubtitle(paramCharSequence);
    }
    
    public static void p(MediaDescription.Builder paramBuilder, CharSequence paramCharSequence)
    {
      paramBuilder.setTitle(paramCharSequence);
    }
  }
  
  public static final class c
  {
    public static Uri a(MediaDescription paramMediaDescription)
    {
      return paramMediaDescription.getMediaUri();
    }
    
    public static void b(MediaDescription.Builder paramBuilder, Uri paramUri)
    {
      paramBuilder.setMediaUri(paramUri);
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaDescriptionCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */