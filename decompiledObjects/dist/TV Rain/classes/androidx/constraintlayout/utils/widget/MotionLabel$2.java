package androidx.constraintlayout.utils.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

class MotionLabel$2
  extends ViewOutlineProvider
{
  public MotionLabel$2(MotionLabel paramMotionLabel) {}
  
  public void getOutline(View paramView, Outline paramOutline)
  {
    paramOutline.setRoundRect(0, 0, this$0.getWidth(), this$0.getHeight(), MotionLabel.access$100(this$0));
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.utils.widget.MotionLabel.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */