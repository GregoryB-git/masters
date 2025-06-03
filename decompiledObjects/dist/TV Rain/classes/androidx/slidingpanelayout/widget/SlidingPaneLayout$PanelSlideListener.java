package androidx.slidingpanelayout.widget;

import android.view.View;
import androidx.annotation.NonNull;

public abstract interface SlidingPaneLayout$PanelSlideListener
{
  public abstract void onPanelClosed(@NonNull View paramView);
  
  public abstract void onPanelOpened(@NonNull View paramView);
  
  public abstract void onPanelSlide(@NonNull View paramView, float paramFloat);
}

/* Location:
 * Qualified Name:     androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */