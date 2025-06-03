package com.facebook.drawee.interfaces;

import android.graphics.drawable.Drawable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public abstract interface SettableDraweeHierarchy
  extends DraweeHierarchy
{
  public abstract void reset();
  
  public abstract void setControllerOverlay(Drawable paramDrawable);
  
  public abstract void setFailure(Throwable paramThrowable);
  
  public abstract void setImage(Drawable paramDrawable, float paramFloat, boolean paramBoolean);
  
  public abstract void setProgress(float paramFloat, boolean paramBoolean);
  
  public abstract void setRetry(Throwable paramThrowable);
}

/* Location:
 * Qualified Name:     com.facebook.drawee.interfaces.SettableDraweeHierarchy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */