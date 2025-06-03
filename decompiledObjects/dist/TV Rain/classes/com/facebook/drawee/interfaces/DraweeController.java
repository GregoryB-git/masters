package com.facebook.drawee.interfaces;

import android.graphics.drawable.Animatable;
import android.view.MotionEvent;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public abstract interface DraweeController
{
  public abstract Animatable getAnimatable();
  
  public abstract String getContentDescription();
  
  @Nullable
  public abstract DraweeHierarchy getHierarchy();
  
  public abstract void onAttach();
  
  public abstract void onDetach();
  
  public abstract boolean onTouchEvent(MotionEvent paramMotionEvent);
  
  public abstract void onViewportVisibilityHint(boolean paramBoolean);
  
  public abstract void setContentDescription(String paramString);
  
  public abstract void setHierarchy(@Nullable DraweeHierarchy paramDraweeHierarchy);
}

/* Location:
 * Qualified Name:     com.facebook.drawee.interfaces.DraweeController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */