package androidx.constraintlayout.utils.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

class ImageFilterButton$2
  extends ViewOutlineProvider
{
  public ImageFilterButton$2(ImageFilterButton paramImageFilterButton) {}
  
  public void getOutline(View paramView, Outline paramOutline)
  {
    paramOutline.setRoundRect(0, 0, this$0.getWidth(), this$0.getHeight(), ImageFilterButton.access$100(this$0));
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.utils.widget.ImageFilterButton.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */