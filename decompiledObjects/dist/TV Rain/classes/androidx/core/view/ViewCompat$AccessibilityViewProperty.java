package androidx.core.view;

import android.os.Build.VERSION;
import android.view.View;

abstract class ViewCompat$AccessibilityViewProperty<T>
{
  private final int mContentChangeType;
  private final int mFrameworkMinimumSdk;
  private final int mTagKey;
  private final Class<T> mType;
  
  public ViewCompat$AccessibilityViewProperty(int paramInt1, Class<T> paramClass, int paramInt2)
  {
    this(paramInt1, paramClass, 0, paramInt2);
  }
  
  public ViewCompat$AccessibilityViewProperty(int paramInt1, Class<T> paramClass, int paramInt2, int paramInt3)
  {
    mTagKey = paramInt1;
    mType = paramClass;
    mContentChangeType = paramInt2;
    mFrameworkMinimumSdk = paramInt3;
  }
  
  private boolean extrasAvailable()
  {
    return true;
  }
  
  private boolean frameworkAvailable()
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= mFrameworkMinimumSdk) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean booleanNullToFalseEquals(Boolean paramBoolean1, Boolean paramBoolean2)
  {
    boolean bool = true;
    int i;
    if ((paramBoolean1 != null) && (paramBoolean1.booleanValue())) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if ((paramBoolean2 != null) && (paramBoolean2.booleanValue())) {
      j = 1;
    } else {
      j = 0;
    }
    if (i != j) {
      bool = false;
    }
    return bool;
  }
  
  public abstract T frameworkGet(View paramView);
  
  public abstract void frameworkSet(View paramView, T paramT);
  
  public T get(View paramView)
  {
    if (frameworkAvailable()) {
      return (T)frameworkGet(paramView);
    }
    if (extrasAvailable())
    {
      paramView = paramView.getTag(mTagKey);
      if (mType.isInstance(paramView)) {
        return paramView;
      }
    }
    return null;
  }
  
  public void set(View paramView, T paramT)
  {
    if (frameworkAvailable())
    {
      frameworkSet(paramView, paramT);
    }
    else if ((extrasAvailable()) && (shouldUpdate(get(paramView), paramT)))
    {
      ViewCompat.ensureAccessibilityDelegateCompat(paramView);
      paramView.setTag(mTagKey, paramT);
      ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(paramView, mContentChangeType);
    }
  }
  
  public boolean shouldUpdate(T paramT1, T paramT2)
  {
    return paramT2.equals(paramT1) ^ true;
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewCompat.AccessibilityViewProperty
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */