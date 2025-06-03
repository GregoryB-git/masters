package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo.Builder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(31)
final class ContentInfoCompat$BuilderCompat31Impl
  implements ContentInfoCompat.BuilderCompat
{
  @NonNull
  private final ContentInfo.Builder mPlatformBuilder;
  
  public ContentInfoCompat$BuilderCompat31Impl(@NonNull ClipData paramClipData, int paramInt)
  {
    mPlatformBuilder = new ContentInfo.Builder(paramClipData, paramInt);
  }
  
  public ContentInfoCompat$BuilderCompat31Impl(@NonNull ContentInfoCompat paramContentInfoCompat)
  {
    mPlatformBuilder = new ContentInfo.Builder(paramContentInfoCompat.toContentInfo());
  }
  
  @NonNull
  public ContentInfoCompat build()
  {
    return new ContentInfoCompat(new ContentInfoCompat.Compat31Impl(mPlatformBuilder.build()));
  }
  
  public void setClip(@NonNull ClipData paramClipData)
  {
    mPlatformBuilder.setClip(paramClipData);
  }
  
  public void setExtras(@Nullable Bundle paramBundle)
  {
    mPlatformBuilder.setExtras(paramBundle);
  }
  
  public void setFlags(int paramInt)
  {
    mPlatformBuilder.setFlags(paramInt);
  }
  
  public void setLinkUri(@Nullable Uri paramUri)
  {
    mPlatformBuilder.setLinkUri(paramUri);
  }
  
  public void setSource(int paramInt)
  {
    mPlatformBuilder.setSource(paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ContentInfoCompat.BuilderCompat31Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */