package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

final class ContentInfoCompat$BuilderCompatImpl
  implements ContentInfoCompat.BuilderCompat
{
  @NonNull
  public ClipData mClip;
  @Nullable
  public Bundle mExtras;
  public int mFlags;
  @Nullable
  public Uri mLinkUri;
  public int mSource;
  
  public ContentInfoCompat$BuilderCompatImpl(@NonNull ClipData paramClipData, int paramInt)
  {
    mClip = paramClipData;
    mSource = paramInt;
  }
  
  public ContentInfoCompat$BuilderCompatImpl(@NonNull ContentInfoCompat paramContentInfoCompat)
  {
    mClip = paramContentInfoCompat.getClip();
    mSource = paramContentInfoCompat.getSource();
    mFlags = paramContentInfoCompat.getFlags();
    mLinkUri = paramContentInfoCompat.getLinkUri();
    mExtras = paramContentInfoCompat.getExtras();
  }
  
  @NonNull
  public ContentInfoCompat build()
  {
    return new ContentInfoCompat(new ContentInfoCompat.CompatImpl(this));
  }
  
  public void setClip(@NonNull ClipData paramClipData)
  {
    mClip = paramClipData;
  }
  
  public void setExtras(@Nullable Bundle paramBundle)
  {
    mExtras = paramBundle;
  }
  
  public void setFlags(int paramInt)
  {
    mFlags = paramInt;
  }
  
  public void setLinkUri(@Nullable Uri paramUri)
  {
    mLinkUri = paramUri;
  }
  
  public void setSource(int paramInt)
  {
    mSource = paramInt;
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ContentInfoCompat.BuilderCompatImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */