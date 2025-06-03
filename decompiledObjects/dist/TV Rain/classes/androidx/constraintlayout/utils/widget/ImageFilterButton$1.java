package androidx.constraintlayout.utils.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

class ImageFilterButton$1
  extends ViewOutlineProvider
{
  public ImageFilterButton$1(ImageFilterButton paramImageFilterButton) {}
  
  public void getOutline(View paramView, Outline paramOutline)
  {
    int i = this$0.getWidth();
    int j = this$0.getHeight();
    float f = Math.min(i, j);
    paramOutline.setRoundRect(0, 0, i, j, ImageFilterButton.access$000(this$0) * f / 2.0F);
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.utils.widget.ImageFilterButton.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */