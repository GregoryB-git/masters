package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.Bundle;

public abstract class MediaDescriptionCompat$b
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

/* Location:
 * Qualified Name:     android.support.v4.media.MediaDescriptionCompat.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */