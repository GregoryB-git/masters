package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class ContentInfoCompat$Builder
{
  @NonNull
  private final ContentInfoCompat.BuilderCompat mBuilderCompat;
  
  public ContentInfoCompat$Builder(@NonNull ClipData paramClipData, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 31) {
      mBuilderCompat = new ContentInfoCompat.BuilderCompat31Impl(paramClipData, paramInt);
    } else {
      mBuilderCompat = new ContentInfoCompat.BuilderCompatImpl(paramClipData, paramInt);
    }
  }
  
  public ContentInfoCompat$Builder(@NonNull ContentInfoCompat paramContentInfoCompat)
  {
    if (Build.VERSION.SDK_INT >= 31) {
      mBuilderCompat = new ContentInfoCompat.BuilderCompat31Impl(paramContentInfoCompat);
    } else {
      mBuilderCompat = new ContentInfoCompat.BuilderCompatImpl(paramContentInfoCompat);
    }
  }
  
  @NonNull
  public ContentInfoCompat build()
  {
    return mBuilderCompat.build();
  }
  
  @NonNull
  public Builder setClip(@NonNull ClipData paramClipData)
  {
    mBuilderCompat.setClip(paramClipData);
    return this;
  }
  
  @NonNull
  public Builder setExtras(@Nullable Bundle paramBundle)
  {
    mBuilderCompat.setExtras(paramBundle);
    return this;
  }
  
  @NonNull
  public Builder setFlags(int paramInt)
  {
    mBuilderCompat.setFlags(paramInt);
    return this;
  }
  
  @NonNull
  public Builder setLinkUri(@Nullable Uri paramUri)
  {
    mBuilderCompat.setLinkUri(paramUri);
    return this;
  }
  
  @NonNull
  public Builder setSource(int paramInt)
  {
    mBuilderCompat.setSource(paramInt);
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ContentInfoCompat.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */