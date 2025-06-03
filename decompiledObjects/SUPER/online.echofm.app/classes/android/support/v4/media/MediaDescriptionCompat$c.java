package android.support.v4.media;

import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;

public abstract class MediaDescriptionCompat$c
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

/* Location:
 * Qualified Name:     android.support.v4.media.MediaDescriptionCompat.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */