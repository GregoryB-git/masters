package androidx.transition;

import android.view.View;
import android.view.WindowId;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
class WindowIdApi18
  implements WindowIdImpl
{
  private final WindowId mWindowId;
  
  public WindowIdApi18(@NonNull View paramView)
  {
    mWindowId = paramView.getWindowId();
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof WindowIdApi18)) && (mWindowId.equals(mWindowId))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return mWindowId.hashCode();
  }
}

/* Location:
 * Qualified Name:     androidx.transition.WindowIdApi18
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */