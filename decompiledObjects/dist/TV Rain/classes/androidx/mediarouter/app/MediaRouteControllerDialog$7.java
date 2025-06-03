package androidx.mediarouter.app;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

class MediaRouteControllerDialog$7
  extends Animation
{
  public MediaRouteControllerDialog$7(MediaRouteControllerDialog paramMediaRouteControllerDialog, int paramInt1, int paramInt2, View paramView) {}
  
  public void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    int i = val$startValue;
    int j = (int)((i - val$endValue) * paramFloat);
    MediaRouteControllerDialog.setLayoutHeight(val$view, i - j);
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteControllerDialog.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */