package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import o5;

@RequiresApi(19)
class ViewUtilsApi19
  extends ViewUtilsBase
{
  private static boolean sTryHiddenTransitionAlpha = true;
  
  public void clearNonTransitionAlpha(@NonNull View paramView) {}
  
  @SuppressLint({"NewApi"})
  public float getTransitionAlpha(@NonNull View paramView)
  {
    if (sTryHiddenTransitionAlpha) {
      try
      {
        float f = o5.a(paramView);
        return f;
      }
      catch (NoSuchMethodError localNoSuchMethodError)
      {
        sTryHiddenTransitionAlpha = false;
      }
    }
    return paramView.getAlpha();
  }
  
  public void saveNonTransitionAlpha(@NonNull View paramView) {}
  
  @SuppressLint({"NewApi"})
  public void setTransitionAlpha(@NonNull View paramView, float paramFloat)
  {
    if (sTryHiddenTransitionAlpha) {
      try
      {
        o5.f(paramView, paramFloat);
        return;
      }
      catch (NoSuchMethodError localNoSuchMethodError)
      {
        sTryHiddenTransitionAlpha = false;
      }
    }
    paramView.setAlpha(paramFloat);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ViewUtilsApi19
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */