package com.facebook.core.internal.logging.dumpsys;

import android.view.View;
import java.util.List;

public abstract interface AndroidRootResolver$Listener
{
  public abstract void onRootAdded(View paramView);
  
  public abstract void onRootRemoved(View paramView);
  
  public abstract void onRootsChanged(List<View> paramList);
}

/* Location:
 * Qualified Name:     com.facebook.core.internal.logging.dumpsys.AndroidRootResolver.Listener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */