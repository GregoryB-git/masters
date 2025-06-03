package androidx.drawerlayout.widget;

import android.view.View;
import androidx.annotation.NonNull;

public abstract interface DrawerLayout$DrawerListener
{
  public abstract void onDrawerClosed(@NonNull View paramView);
  
  public abstract void onDrawerOpened(@NonNull View paramView);
  
  public abstract void onDrawerSlide(@NonNull View paramView, float paramFloat);
  
  public abstract void onDrawerStateChanged(int paramInt);
}

/* Location:
 * Qualified Name:     androidx.drawerlayout.widget.DrawerLayout.DrawerListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */