package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class MediaDescriptionCompat$Api21Impl
{
  @DoNotInline
  public static MediaDescription build(MediaDescription.Builder paramBuilder)
  {
    return paramBuilder.build();
  }
  
  @DoNotInline
  public static MediaDescription.Builder createBuilder()
  {
    return new MediaDescription.Builder();
  }
  
  @DoNotInline
  @Nullable
  public static CharSequence getDescription(MediaDescription paramMediaDescription)
  {
    return paramMediaDescription.getDescription();
  }
  
  @DoNotInline
  @Nullable
  public static Bundle getExtras(MediaDescription paramMediaDescription)
  {
    return paramMediaDescription.getExtras();
  }
  
  @DoNotInline
  @Nullable
  public static Bitmap getIconBitmap(MediaDescription paramMediaDescription)
  {
    return paramMediaDescription.getIconBitmap();
  }
  
  @DoNotInline
  @Nullable
  public static Uri getIconUri(MediaDescription paramMediaDescription)
  {
    return paramMediaDescription.getIconUri();
  }
  
  @DoNotInline
  @Nullable
  public static String getMediaId(MediaDescription paramMediaDescription)
  {
    return paramMediaDescription.getMediaId();
  }
  
  @DoNotInline
  @Nullable
  public static CharSequence getSubtitle(MediaDescription paramMediaDescription)
  {
    return paramMediaDescription.getSubtitle();
  }
  
  @DoNotInline
  @Nullable
  public static CharSequence getTitle(MediaDescription paramMediaDescription)
  {
    return paramMediaDescription.getTitle();
  }
  
  @DoNotInline
  public static void setDescription(MediaDescription.Builder paramBuilder, @Nullable CharSequence paramCharSequence)
  {
    paramBuilder.setDescription(paramCharSequence);
  }
  
  @DoNotInline
  public static void setExtras(MediaDescription.Builder paramBuilder, @Nullable Bundle paramBundle)
  {
    paramBuilder.setExtras(paramBundle);
  }
  
  @DoNotInline
  public static void setIconBitmap(MediaDescription.Builder paramBuilder, @Nullable Bitmap paramBitmap)
  {
    paramBuilder.setIconBitmap(paramBitmap);
  }
  
  @DoNotInline
  public static void setIconUri(MediaDescription.Builder paramBuilder, @Nullable Uri paramUri)
  {
    paramBuilder.setIconUri(paramUri);
  }
  
  @DoNotInline
  public static void setMediaId(MediaDescription.Builder paramBuilder, @Nullable String paramString)
  {
    paramBuilder.setMediaId(paramString);
  }
  
  @DoNotInline
  public static void setSubtitle(MediaDescription.Builder paramBuilder, @Nullable CharSequence paramCharSequence)
  {
    paramBuilder.setSubtitle(paramCharSequence);
  }
  
  @DoNotInline
  public static void setTitle(MediaDescription.Builder paramBuilder, @Nullable CharSequence paramCharSequence)
  {
    paramBuilder.setTitle(paramCharSequence);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.media.MediaDescriptionCompat.Api21Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */