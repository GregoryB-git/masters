package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

abstract interface InputContentInfoCompat$InputContentInfoCompatImpl
{
  @NonNull
  public abstract Uri getContentUri();
  
  @NonNull
  public abstract ClipDescription getDescription();
  
  @Nullable
  public abstract Object getInputContentInfo();
  
  @Nullable
  public abstract Uri getLinkUri();
  
  public abstract void releasePermission();
  
  public abstract void requestPermission();
}

/* Location:
 * Qualified Name:     androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */