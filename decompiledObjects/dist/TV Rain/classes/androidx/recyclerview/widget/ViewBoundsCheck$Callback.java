package androidx.recyclerview.widget;

import android.view.View;

abstract interface ViewBoundsCheck$Callback
{
  public abstract View getChildAt(int paramInt);
  
  public abstract int getChildEnd(View paramView);
  
  public abstract int getChildStart(View paramView);
  
  public abstract int getParentEnd();
  
  public abstract int getParentStart();
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ViewBoundsCheck.Callback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */