package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import o5;

@RequiresApi(29)
class ViewUtilsApi29
  extends ViewUtilsApi23
{
  public float getTransitionAlpha(@NonNull View paramView)
  {
    return o5.a(paramView);
  }
  
  public void setAnimationMatrix(@NonNull View paramView, @Nullable Matrix paramMatrix)
  {
    o5.h(paramView, paramMatrix);
  }
  
  public void setLeftTopRightBottom(@NonNull View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    o5.g(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setTransitionAlpha(@NonNull View paramView, float paramFloat)
  {
    o5.f(paramView, paramFloat);
  }
  
  public void setTransitionVisibility(@NonNull View paramView, int paramInt)
  {
    o5.e(paramInt, paramView);
  }
  
  public void transformMatrixToGlobal(@NonNull View paramView, @NonNull Matrix paramMatrix)
  {
    o5.o(paramView, paramMatrix);
  }
  
  public void transformMatrixToLocal(@NonNull View paramView, @NonNull Matrix paramMatrix)
  {
    o5.l(paramView, paramMatrix);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ViewUtilsApi29
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */