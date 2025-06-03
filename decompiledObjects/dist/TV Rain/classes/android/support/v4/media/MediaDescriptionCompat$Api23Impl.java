package android.support.v4.media;

import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
class MediaDescriptionCompat$Api23Impl
{
  @DoNotInline
  @Nullable
  public static Uri getMediaUri(MediaDescription paramMediaDescription)
  {
    return paramMediaDescription.getMediaUri();
  }
  
  @DoNotInline
  public static void setMediaUri(MediaDescription.Builder paramBuilder, @Nullable Uri paramUri)
  {
    paramBuilder.setMediaUri(paramUri);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaDescriptionCompat.Api23Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */