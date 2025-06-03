package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import o5;

@RequiresApi(22)
class ViewUtilsApi22
  extends ViewUtilsApi21
{
  private static boolean sTryHiddenSetLeftTopRightBottom = true;
  
  @SuppressLint({"NewApi"})
  public void setLeftTopRightBottom(@NonNull View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (sTryHiddenSetLeftTopRightBottom) {
      try
      {
        o5.g(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
      }
      catch (NoSuchMethodError paramView)
      {
        sTryHiddenSetLeftTopRightBottom = false;
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ViewUtilsApi22
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */