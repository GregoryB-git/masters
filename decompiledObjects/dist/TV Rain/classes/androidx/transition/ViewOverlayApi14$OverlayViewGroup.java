package androidx.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

class ViewOverlayApi14$OverlayViewGroup
  extends ViewGroup
{
  public static Method sInvalidateChildInParentFastMethod;
  private boolean mDisposed;
  public ArrayList<Drawable> mDrawables = null;
  public ViewGroup mHostView;
  public View mRequestingView;
  public ViewOverlayApi14 mViewOverlay;
  
  static
  {
    try
    {
      Class localClass = Integer.TYPE;
      sInvalidateChildInParentFastMethod = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", new Class[] { localClass, localClass, Rect.class });
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
  }
  
  public ViewOverlayApi14$OverlayViewGroup(Context paramContext, ViewGroup paramViewGroup, View paramView, ViewOverlayApi14 paramViewOverlayApi14)
  {
    super(paramContext);
    mHostView = paramViewGroup;
    mRequestingView = paramView;
    setRight(paramViewGroup.getWidth());
    setBottom(paramViewGroup.getHeight());
    paramViewGroup.addView(this);
    mViewOverlay = paramViewOverlayApi14;
  }
  
  private void assertNotDisposed()
  {
    if (!mDisposed) {
      return;
    }
    throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
  }
  
  private void disposeIfEmpty()
  {
    if (getChildCount() == 0)
    {
      ArrayList localArrayList = mDrawables;
      if ((localArrayList == null) || (localArrayList.size() == 0))
      {
        mDisposed = true;
        mHostView.removeView(this);
      }
    }
  }
  
  private void getOffset(int[] paramArrayOfInt)
  {
    int[] arrayOfInt1 = new int[2];
    int[] arrayOfInt2 = new int[2];
    mHostView.getLocationOnScreen(arrayOfInt1);
    mRequestingView.getLocationOnScreen(arrayOfInt2);
    arrayOfInt2[0] -= arrayOfInt1[0];
    arrayOfInt2[1] -= arrayOfInt1[1];
  }
  
  public void add(Drawable paramDrawable)
  {
    assertNotDisposed();
    if (mDrawables == null) {
      mDrawables = new ArrayList();
    }
    if (!mDrawables.contains(paramDrawable))
    {
      mDrawables.add(paramDrawable);
      invalidate(paramDrawable.getBounds());
      paramDrawable.setCallback(this);
    }
  }
  
  public void add(View paramView)
  {
    assertNotDisposed();
    if ((paramView.getParent() instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView.getParent();
      if ((localViewGroup != mHostView) && (localViewGroup.getParent() != null) && (ViewCompat.isAttachedToWindow(localViewGroup)))
      {
        int[] arrayOfInt1 = new int[2];
        int[] arrayOfInt2 = new int[2];
        localViewGroup.getLocationOnScreen(arrayOfInt1);
        mHostView.getLocationOnScreen(arrayOfInt2);
        ViewCompat.offsetLeftAndRight(paramView, arrayOfInt1[0] - arrayOfInt2[0]);
        ViewCompat.offsetTopAndBottom(paramView, arrayOfInt1[1] - arrayOfInt2[1]);
      }
      localViewGroup.removeView(paramView);
      if (paramView.getParent() != null) {
        localViewGroup.removeView(paramView);
      }
    }
    super.addView(paramView);
  }
  
  public void dispatchDraw(Canvas paramCanvas)
  {
    int[] arrayOfInt = new int[2];
    Object localObject = new int[2];
    mHostView.getLocationOnScreen(arrayOfInt);
    mRequestingView.getLocationOnScreen((int[])localObject);
    int i = 0;
    paramCanvas.translate(localObject[0] - arrayOfInt[0], localObject[1] - arrayOfInt[1]);
    paramCanvas.clipRect(new Rect(0, 0, mRequestingView.getWidth(), mRequestingView.getHeight()));
    super.dispatchDraw(paramCanvas);
    localObject = mDrawables;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = ((ArrayList)localObject).size();
    }
    while (i < j)
    {
      ((Drawable)mDrawables.get(i)).draw(paramCanvas);
      i++;
    }
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public ViewParent invalidateChildInParent(int[] paramArrayOfInt, Rect paramRect)
  {
    if (mHostView != null)
    {
      paramRect.offset(paramArrayOfInt[0], paramArrayOfInt[1]);
      if ((mHostView instanceof ViewGroup))
      {
        paramArrayOfInt[0] = 0;
        paramArrayOfInt[1] = 0;
        int[] arrayOfInt = new int[2];
        getOffset(arrayOfInt);
        paramRect.offset(arrayOfInt[0], arrayOfInt[1]);
        return super.invalidateChildInParent(paramArrayOfInt, paramRect);
      }
      invalidate(paramRect);
    }
    return null;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public ViewParent invalidateChildInParentFast(int paramInt1, int paramInt2, Rect paramRect)
  {
    if (((mHostView instanceof ViewGroup)) && (sInvalidateChildInParentFastMethod != null)) {
      try
      {
        getOffset(new int[2]);
        sInvalidateChildInParentFastMethod.invoke(mHostView, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramRect });
      }
      catch (InvocationTargetException paramRect)
      {
        paramRect.printStackTrace();
      }
      catch (IllegalAccessException paramRect)
      {
        paramRect.printStackTrace();
      }
    }
    return null;
  }
  
  public void invalidateDrawable(@NonNull Drawable paramDrawable)
  {
    invalidate(paramDrawable.getBounds());
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void remove(Drawable paramDrawable)
  {
    ArrayList localArrayList = mDrawables;
    if (localArrayList != null)
    {
      localArrayList.remove(paramDrawable);
      invalidate(paramDrawable.getBounds());
      paramDrawable.setCallback(null);
      disposeIfEmpty();
    }
  }
  
  public void remove(View paramView)
  {
    super.removeView(paramView);
    disposeIfEmpty();
  }
  
  public boolean verifyDrawable(@NonNull Drawable paramDrawable)
  {
    if (!super.verifyDrawable(paramDrawable))
    {
      ArrayList localArrayList = mDrawables;
      if ((localArrayList == null) || (!localArrayList.contains(paramDrawable))) {
        return false;
      }
    }
    boolean bool = true;
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ViewOverlayApi14.OverlayViewGroup
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */