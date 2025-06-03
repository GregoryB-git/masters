package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import z2;

final class ContentInfoCompat$CompatImpl
  implements ContentInfoCompat.Compat
{
  @NonNull
  private final ClipData mClip;
  @Nullable
  private final Bundle mExtras;
  private final int mFlags;
  @Nullable
  private final Uri mLinkUri;
  private final int mSource;
  
  public ContentInfoCompat$CompatImpl(ContentInfoCompat.BuilderCompatImpl paramBuilderCompatImpl)
  {
    mClip = ((ClipData)Preconditions.checkNotNull(mClip));
    mSource = Preconditions.checkArgumentInRange(mSource, 0, 5, "source");
    mFlags = Preconditions.checkFlagsArgument(mFlags, 1);
    mLinkUri = mLinkUri;
    mExtras = mExtras;
  }
  
  @NonNull
  public ClipData getClip()
  {
    return mClip;
  }
  
  @Nullable
  public Bundle getExtras()
  {
    return mExtras;
  }
  
  public int getFlags()
  {
    return mFlags;
  }
  
  @Nullable
  public Uri getLinkUri()
  {
    return mLinkUri;
  }
  
  public int getSource()
  {
    return mSource;
  }
  
  @Nullable
  public ContentInfo getWrapped()
  {
    return null;
  }
  
  @NonNull
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("ContentInfoCompat{clip=");
    localStringBuilder.append(mClip.getDescription());
    localStringBuilder.append(", source=");
    localStringBuilder.append(ContentInfoCompat.sourceToString(mSource));
    localStringBuilder.append(", flags=");
    localStringBuilder.append(ContentInfoCompat.flagsToString(mFlags));
    Object localObject = mLinkUri;
    String str = "";
    if (localObject == null)
    {
      localObject = "";
    }
    else
    {
      localObject = z2.t(", hasLinkUri(");
      ((StringBuilder)localObject).append(mLinkUri.toString().length());
      ((StringBuilder)localObject).append(")");
      localObject = ((StringBuilder)localObject).toString();
    }
    localStringBuilder.append((String)localObject);
    if (mExtras == null) {
      localObject = str;
    } else {
      localObject = ", hasExtras";
    }
    return z2.s(localStringBuilder, (String)localObject, "}");
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ContentInfoCompat.CompatImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */