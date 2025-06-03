package androidx.mediarouter.app;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

class MediaRouteDynamicControllerDialog$RecyclerAdapter$1
  extends Animation
{
  public MediaRouteDynamicControllerDialog$RecyclerAdapter$1(MediaRouteDynamicControllerDialog.RecyclerAdapter paramRecyclerAdapter, int paramInt1, int paramInt2, View paramView) {}
  
  public void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    int i = val$endValue;
    int j = val$startValue;
    i = (int)((i - j) * paramFloat);
    MediaRouteDynamicControllerDialog.setLayoutHeight(val$view, j + i);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteDynamicControllerDialog.RecyclerAdapter.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */