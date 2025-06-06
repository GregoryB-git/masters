package com.facebook.drawee.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Objects.ToStringHelper;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.drawee.components.DraweeEventTracker;
import com.facebook.drawee.components.DraweeEventTracker.Event;
import com.facebook.drawee.drawable.VisibilityAwareDrawable;
import com.facebook.drawee.drawable.VisibilityCallback;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import javax.annotation.Nullable;

public class DraweeHolder<DH extends DraweeHierarchy>
  implements VisibilityCallback
{
  private DraweeController mController = null;
  private final DraweeEventTracker mEventTracker = DraweeEventTracker.newInstance();
  private DH mHierarchy;
  private boolean mIsControllerAttached = false;
  private boolean mIsHolderAttached = false;
  private boolean mIsVisible = true;
  
  public DraweeHolder(@Nullable DH paramDH)
  {
    if (paramDH != null) {
      setHierarchy(paramDH);
    }
  }
  
  private void attachController()
  {
    if (mIsControllerAttached) {
      return;
    }
    mEventTracker.recordEvent(DraweeEventTracker.Event.ON_ATTACH_CONTROLLER);
    mIsControllerAttached = true;
    DraweeController localDraweeController = mController;
    if ((localDraweeController != null) && (localDraweeController.getHierarchy() != null)) {
      mController.onAttach();
    }
  }
  
  private void attachOrDetachController()
  {
    if ((mIsHolderAttached) && (mIsVisible)) {
      attachController();
    } else {
      detachController();
    }
  }
  
  public static <DH extends DraweeHierarchy> DraweeHolder<DH> create(@Nullable DH paramDH, Context paramContext)
  {
    paramDH = new DraweeHolder(paramDH);
    paramDH.registerWithContext(paramContext);
    return paramDH;
  }
  
  private void detachController()
  {
    if (!mIsControllerAttached) {
      return;
    }
    mEventTracker.recordEvent(DraweeEventTracker.Event.ON_DETACH_CONTROLLER);
    mIsControllerAttached = false;
    if (isControllerValid()) {
      mController.onDetach();
    }
  }
  
  private boolean isControllerValid()
  {
    DraweeController localDraweeController = mController;
    boolean bool;
    if ((localDraweeController != null) && (localDraweeController.getHierarchy() == mHierarchy)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void setVisibilityCallback(@Nullable VisibilityCallback paramVisibilityCallback)
  {
    Drawable localDrawable = getTopLevelDrawable();
    if ((localDrawable instanceof VisibilityAwareDrawable)) {
      ((VisibilityAwareDrawable)localDrawable).setVisibilityCallback(paramVisibilityCallback);
    }
  }
  
  @Nullable
  public DraweeController getController()
  {
    return mController;
  }
  
  public DraweeEventTracker getDraweeEventTracker()
  {
    return mEventTracker;
  }
  
  public DH getHierarchy()
  {
    return (DraweeHierarchy)Preconditions.checkNotNull(mHierarchy);
  }
  
  public Drawable getTopLevelDrawable()
  {
    Object localObject = mHierarchy;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((DraweeHierarchy)localObject).getTopLevelDrawable();
    }
    return (Drawable)localObject;
  }
  
  public boolean hasHierarchy()
  {
    boolean bool;
    if (mHierarchy != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isAttached()
  {
    return mIsHolderAttached;
  }
  
  public void onAttach()
  {
    mEventTracker.recordEvent(DraweeEventTracker.Event.ON_HOLDER_ATTACH);
    mIsHolderAttached = true;
    attachOrDetachController();
  }
  
  public void onDetach()
  {
    mEventTracker.recordEvent(DraweeEventTracker.Event.ON_HOLDER_DETACH);
    mIsHolderAttached = false;
    attachOrDetachController();
  }
  
  public void onDraw()
  {
    if (mIsControllerAttached) {
      return;
    }
    FLog.w(DraweeEventTracker.class, "%x: Draw requested for a non-attached controller %x. %s", new Object[] { Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(mController)), toString() });
    mIsHolderAttached = true;
    mIsVisible = true;
    attachOrDetachController();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!isControllerValid()) {
      return false;
    }
    return mController.onTouchEvent(paramMotionEvent);
  }
  
  public void onVisibilityChange(boolean paramBoolean)
  {
    if (mIsVisible == paramBoolean) {
      return;
    }
    DraweeEventTracker localDraweeEventTracker = mEventTracker;
    DraweeEventTracker.Event localEvent;
    if (paramBoolean) {
      localEvent = DraweeEventTracker.Event.ON_DRAWABLE_SHOW;
    } else {
      localEvent = DraweeEventTracker.Event.ON_DRAWABLE_HIDE;
    }
    localDraweeEventTracker.recordEvent(localEvent);
    mIsVisible = paramBoolean;
    attachOrDetachController();
  }
  
  public void registerWithContext(Context paramContext) {}
  
  public void setController(@Nullable DraweeController paramDraweeController)
  {
    boolean bool = mIsControllerAttached;
    if (bool) {
      detachController();
    }
    if (isControllerValid())
    {
      mEventTracker.recordEvent(DraweeEventTracker.Event.ON_CLEAR_OLD_CONTROLLER);
      mController.setHierarchy(null);
    }
    mController = paramDraweeController;
    if (paramDraweeController != null)
    {
      mEventTracker.recordEvent(DraweeEventTracker.Event.ON_SET_CONTROLLER);
      mController.setHierarchy(mHierarchy);
    }
    else
    {
      mEventTracker.recordEvent(DraweeEventTracker.Event.ON_CLEAR_CONTROLLER);
    }
    if (bool) {
      attachController();
    }
  }
  
  public void setHierarchy(DH paramDH)
  {
    mEventTracker.recordEvent(DraweeEventTracker.Event.ON_SET_HIERARCHY);
    boolean bool1 = isControllerValid();
    setVisibilityCallback(null);
    Object localObject = (DraweeHierarchy)Preconditions.checkNotNull(paramDH);
    mHierarchy = ((DraweeHierarchy)localObject);
    localObject = ((DraweeHierarchy)localObject).getTopLevelDrawable();
    boolean bool2;
    if ((localObject != null) && (!((Drawable)localObject).isVisible())) {
      bool2 = false;
    } else {
      bool2 = true;
    }
    onVisibilityChange(bool2);
    setVisibilityCallback(this);
    if (bool1) {
      mController.setHierarchy(paramDH);
    }
  }
  
  public String toString()
  {
    return Objects.toStringHelper(this).add("controllerAttached", mIsControllerAttached).add("holderAttached", mIsHolderAttached).add("drawableVisible", mIsVisible).add("events", mEventTracker.toString()).toString();
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.view.DraweeHolder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */