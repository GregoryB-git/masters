package androidx.constraintlayout.utils.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

class MotionButton$2
  extends ViewOutlineProvider
{
  public MotionButton$2(MotionButton paramMotionButton) {}
  
  public void getOutline(View paramView, Outline paramOutline)
  {
    paramOutline.setRoundRect(0, 0, this$0.getWidth(), this$0.getHeight(), MotionButton.access$100(this$0));
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.utils.widget.MotionButton.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */