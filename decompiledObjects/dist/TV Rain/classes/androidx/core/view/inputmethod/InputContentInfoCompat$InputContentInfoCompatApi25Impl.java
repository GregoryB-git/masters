package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(25)
final class InputContentInfoCompat$InputContentInfoCompatApi25Impl
  implements InputContentInfoCompat.InputContentInfoCompatImpl
{
  @NonNull
  public final InputContentInfo mObject;
  
  public InputContentInfoCompat$InputContentInfoCompatApi25Impl(@NonNull Uri paramUri1, @NonNull ClipDescription paramClipDescription, @Nullable Uri paramUri2)
  {
    mObject = new InputContentInfo(paramUri1, paramClipDescription, paramUri2);
  }
  
  public InputContentInfoCompat$InputContentInfoCompatApi25Impl(@NonNull Object paramObject)
  {
    mObject = ((InputContentInfo)paramObject);
  }
  
  @NonNull
  public Uri getContentUri()
  {
    return mObject.getContentUri();
  }
  
  @NonNull
  public ClipDescription getDescription()
  {
    return mObject.getDescription();
  }
  
  @NonNull
  public Object getInputContentInfo()
  {
    return mObject;
  }
  
  @Nullable
  public Uri getLinkUri()
  {
    return mObject.getLinkUri();
  }
  
  public void releasePermission()
  {
    mObject.releasePermission();
  }
  
  public void requestPermission()
  {
    mObject.requestPermission();
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatApi25Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */