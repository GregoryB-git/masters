package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import z2;

@RequiresApi(31)
final class ContentInfoCompat$Compat31Impl
  implements ContentInfoCompat.Compat
{
  @NonNull
  private final ContentInfo mWrapped;
  
  public ContentInfoCompat$Compat31Impl(@NonNull ContentInfo paramContentInfo)
  {
    mWrapped = ((ContentInfo)Preconditions.checkNotNull(paramContentInfo));
  }
  
  @NonNull
  public ClipData getClip()
  {
    return mWrapped.getClip();
  }
  
  @Nullable
  public Bundle getExtras()
  {
    return mWrapped.getExtras();
  }
  
  public int getFlags()
  {
    return mWrapped.getFlags();
  }
  
  @Nullable
  public Uri getLinkUri()
  {
    return mWrapped.getLinkUri();
  }
  
  public int getSource()
  {
    return mWrapped.getSource();
  }
  
  @NonNull
  public ContentInfo getWrapped()
  {
    return mWrapped;
  }
  
  @NonNull
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("ContentInfoCompat{");
    localStringBuilder.append(mWrapped);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ContentInfoCompat.Compat31Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */