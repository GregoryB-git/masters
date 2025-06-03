package com.facebook.common.lifecycle;

import android.view.View;

public abstract interface AttachDetachListener
{
  public abstract void onAttachToView(View paramView);
  
  public abstract void onDetachFromView(View paramView);
}

/* Location:
 * Qualified Name:     com.facebook.common.lifecycle.AttachDetachListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */