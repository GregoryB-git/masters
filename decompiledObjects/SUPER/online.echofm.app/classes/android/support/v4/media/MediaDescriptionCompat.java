package android.support.v4.media;

import android.annotation.SuppressLint;
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

@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat
  implements Parcelable
{
  public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();
  public final String o;
  public final CharSequence p;
  public final CharSequence q;
  public final CharSequence r;
  public final Bitmap s;
  public final Uri t;
  public final Bundle u;
  public final Uri v;
  public MediaDescription w;
  
  public MediaDescriptionCompat(String paramString, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, Bitmap paramBitmap, Uri paramUri1, Bundle paramBundle, Uri paramUri2)
  {
    o = paramString;
    p = paramCharSequence1;
    q = paramCharSequence2;
    r = paramCharSequence3;
    s = paramBitmap;
    t = paramUri1;
    u = paramBundle;
    v = paramUri2;
  }
  
  public static MediaDescriptionCompat a(Object paramObject)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    if (paramObject != null)
    {
      d locald = new d();
      MediaDescription localMediaDescription = (MediaDescription)paramObject;
      locald.f(b.g(localMediaDescription));
      locald.i(b.i(localMediaDescription));
      locald.h(b.h(localMediaDescription));
      locald.b(b.c(localMediaDescription));
      locald.d(b.e(localMediaDescription));
      locald.e(b.f(localMediaDescription));
      localObject1 = b.d(localMediaDescription);
      paramObject = localObject1;
      if (localObject1 != null) {
        paramObject = MediaSessionCompat.u((Bundle)localObject1);
      }
      if (paramObject != null) {
        localObject1 = (Uri)((Bundle)paramObject).getParcelable("android.support.v4.media.description.MEDIA_URI");
      } else {
        localObject1 = null;
      }
      if (localObject1 != null) {
        if ((((BaseBundle)paramObject).containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG")) && (((BaseBundle)paramObject).size() == 2))
        {
          paramObject = localObject2;
        }
        else
        {
          ((Bundle)paramObject).remove("android.support.v4.media.description.MEDIA_URI");
          ((Bundle)paramObject).remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
        }
      }
      locald.c((Bundle)paramObject);
      if (localObject1 != null) {
        locald.g((Uri)localObject1);
      } else {
        locald.g(c.a(localMediaDescription));
      }
      localObject1 = locald.a();
      w = localMediaDescription;
    }
    return (MediaDescriptionCompat)localObject1;
  }
  
  public CharSequence b()
  {
    return r;
  }
  
  public Bundle c()
  {
    return u;
  }
  
  public Bitmap d()
  {
    return s;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Uri e()
  {
    return t;
  }
  
  public Object f()
  {
    MediaDescription localMediaDescription = w;
    Object localObject = localMediaDescription;
    if (localMediaDescription == null)
    {
      localObject = b.b();
      b.n((MediaDescription.Builder)localObject, o);
      b.p((MediaDescription.Builder)localObject, p);
      b.o((MediaDescription.Builder)localObject, q);
      b.j((MediaDescription.Builder)localObject, r);
      b.l((MediaDescription.Builder)localObject, s);
      b.m((MediaDescription.Builder)localObject, t);
      b.k((MediaDescription.Builder)localObject, u);
      c.b((MediaDescription.Builder)localObject, v);
      localObject = b.a((MediaDescription.Builder)localObject);
      w = ((MediaDescription)localObject);
    }
    return localObject;
  }
  
  public String g()
  {
    return o;
  }
  
  public Uri h()
  {
    return v;
  }
  
  public CharSequence i()
  {
    return q;
  }
  
  public CharSequence j()
  {
    return p;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(p);
    localStringBuilder.append(", ");
    localStringBuilder.append(q);
    localStringBuilder.append(", ");
    localStringBuilder.append(r);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((MediaDescription)f()).writeToParcel(paramParcel, paramInt);
  }
  
  public class a
    implements Parcelable.Creator
  {
    public MediaDescriptionCompat a(Parcel paramParcel)
    {
      return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(paramParcel));
    }
    
    public MediaDescriptionCompat[] b(int paramInt)
    {
      return new MediaDescriptionCompat[paramInt];
    }
  }
  
  public static abstract class b
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
  
  public static abstract class c
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
  
  public static final class d
  {
    public String a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public Bitmap e;
    public Uri f;
    public Bundle g;
    public Uri h;
    
    public MediaDescriptionCompat a()
    {
      return new MediaDescriptionCompat(a, b, c, d, e, f, g, h);
    }
    
    public d b(CharSequence paramCharSequence)
    {
      d = paramCharSequence;
      return this;
    }
    
    public d c(Bundle paramBundle)
    {
      g = paramBundle;
      return this;
    }
    
    public d d(Bitmap paramBitmap)
    {
      e = paramBitmap;
      return this;
    }
    
    public d e(Uri paramUri)
    {
      f = paramUri;
      return this;
    }
    
    public d f(String paramString)
    {
      a = paramString;
      return this;
    }
    
    public d g(Uri paramUri)
    {
      h = paramUri;
      return this;
    }
    
    public d h(CharSequence paramCharSequence)
    {
      c = paramCharSequence;
      return this;
    }
    
    public d i(CharSequence paramCharSequence)
    {
      b = paramCharSequence;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaDescriptionCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */