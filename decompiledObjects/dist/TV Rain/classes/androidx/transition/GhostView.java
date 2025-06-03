package androidx.transition;

import android.view.View;
import android.view.ViewGroup;

abstract interface GhostView
{
  public abstract void reserveEndViewTransition(ViewGroup paramViewGroup, View paramView);
  
  public abstract void setVisibility(int paramInt);
}

/* Location:
 * Qualified Name:     androidx.transition.GhostView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */