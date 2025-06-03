package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import o5;

@RequiresApi(21)
class ViewUtilsApi21
  extends ViewUtilsApi19
{
  private static boolean sTryHiddenSetAnimationMatrix = true;
  private static boolean sTryHiddenTransformMatrixToGlobal = true;
  private static boolean sTryHiddenTransformMatrixToLocal = true;
  
  @SuppressLint({"NewApi"})
  public void setAnimationMatrix(@NonNull View paramView, @Nullable Matrix paramMatrix)
  {
    if (sTryHiddenSetAnimationMatrix) {
      try
      {
        o5.h(paramView, paramMatrix);
      }
      catch (NoSuchMethodError paramView)
      {
        sTryHiddenSetAnimationMatrix = false;
      }
    }
  }
  
  @SuppressLint({"NewApi"})
  public void transformMatrixToGlobal(@NonNull View paramView, @NonNull Matrix paramMatrix)
  {
    if (sTryHiddenTransformMatrixToGlobal) {
      try
      {
        o5.o(paramView, paramMatrix);
      }
      catch (NoSuchMethodError paramView)
      {
        sTryHiddenTransformMatrixToGlobal = false;
      }
    }
  }
  
  @SuppressLint({"NewApi"})
  public void transformMatrixToLocal(@NonNull View paramView, @NonNull Matrix paramMatrix)
  {
    if (sTryHiddenTransformMatrixToLocal) {
      try
      {
        o5.l(paramView, paramMatrix);
      }
      catch (NoSuchMethodError paramView)
      {
        sTryHiddenTransformMatrixToLocal = false;
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ViewUtilsApi21
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */