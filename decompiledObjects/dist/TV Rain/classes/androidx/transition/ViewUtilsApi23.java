package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import o5;

@RequiresApi(23)
class ViewUtilsApi23
  extends ViewUtilsApi22
{
  private static boolean sTryHiddenSetTransitionVisibility = true;
  
  @SuppressLint({"NewApi"})
  public void setTransitionVisibility(@NonNull View paramView, int paramInt)
  {
    if (Build.VERSION.SDK_INT == 28) {
      super.setTransitionVisibility(paramView, paramInt);
    } else if (sTryHiddenSetTransitionVisibility) {
      try
      {
        o5.e(paramInt, paramView);
      }
      catch (NoSuchMethodError paramView)
      {
        sTryHiddenSetTransitionVisibility = false;
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ViewUtilsApi23
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */