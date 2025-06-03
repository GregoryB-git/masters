package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

final class InputContentInfoCompat$InputContentInfoCompatBaseImpl
  implements InputContentInfoCompat.InputContentInfoCompatImpl
{
  @NonNull
  private final Uri mContentUri;
  @NonNull
  private final ClipDescription mDescription;
  @Nullable
  private final Uri mLinkUri;
  
  public InputContentInfoCompat$InputContentInfoCompatBaseImpl(@NonNull Uri paramUri1, @NonNull ClipDescription paramClipDescription, @Nullable Uri paramUri2)
  {
    mContentUri = paramUri1;
    mDescription = paramClipDescription;
    mLinkUri = paramUri2;
  }
  
  @NonNull
  public Uri getContentUri()
  {
    return mContentUri;
  }
  
  @NonNull
  public ClipDescription getDescription()
  {
    return mDescription;
  }
  
  @Nullable
  public Object getInputContentInfo()
  {
    return null;
  }
  
  @Nullable
  public Uri getLinkUri()
  {
    return mLinkUri;
  }
  
  public void releasePermission() {}
  
  public void requestPermission() {}
}

/* Location:
 * Qualified Name:     androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatBaseImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */