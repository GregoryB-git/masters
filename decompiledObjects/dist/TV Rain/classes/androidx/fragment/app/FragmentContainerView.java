package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.R.styleable;
import java.util.ArrayList;
import z2;

public final class FragmentContainerView
  extends FrameLayout
{
  private View.OnApplyWindowInsetsListener mApplyWindowInsetsListener;
  private ArrayList<View> mDisappearingFragmentChildren;
  private boolean mDrawDisappearingViewsFirst = true;
  private ArrayList<View> mTransitioningFragmentViews;
  
  public FragmentContainerView(@NonNull Context paramContext)
  {
    super(paramContext);
  }
  
  public FragmentContainerView(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public FragmentContainerView(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    if (paramAttributeSet != null)
    {
      Object localObject = paramAttributeSet.getClassAttribute();
      TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.FragmentContainerView);
      if (localObject == null)
      {
        paramContext = localTypedArray.getString(R.styleable.FragmentContainerView_android_name);
        paramAttributeSet = "android:name";
      }
      else
      {
        paramAttributeSet = "class";
        paramContext = (Context)localObject;
      }
      localTypedArray.recycle();
      if ((paramContext != null) && (!isInEditMode()))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("FragmentContainerView must be within a FragmentActivity to use ");
        ((StringBuilder)localObject).append(paramAttributeSet);
        ((StringBuilder)localObject).append("=\"");
        ((StringBuilder)localObject).append(paramContext);
        ((StringBuilder)localObject).append("\"");
        throw new UnsupportedOperationException(((StringBuilder)localObject).toString());
      }
    }
  }
  
  public FragmentContainerView(@NonNull Context paramContext, @NonNull AttributeSet paramAttributeSet, @NonNull FragmentManager paramFragmentManager)
  {
    super(paramContext, paramAttributeSet);
    String str = paramAttributeSet.getClassAttribute();
    Object localObject1 = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.FragmentContainerView);
    Object localObject2 = str;
    if (str == null) {
      localObject2 = ((TypedArray)localObject1).getString(R.styleable.FragmentContainerView_android_name);
    }
    str = ((TypedArray)localObject1).getString(R.styleable.FragmentContainerView_android_tag);
    ((TypedArray)localObject1).recycle();
    int i = getId();
    localObject1 = paramFragmentManager.findFragmentById(i);
    if ((localObject2 != null) && (localObject1 == null))
    {
      if (i <= 0)
      {
        if (str != null) {
          paramContext = z2.o(" with tag ", str);
        } else {
          paramContext = "";
        }
        throw new IllegalStateException(z2.p("FragmentContainerView must have an android:id to add Fragment ", (String)localObject2, paramContext));
      }
      localObject2 = paramFragmentManager.getFragmentFactory().instantiate(paramContext.getClassLoader(), (String)localObject2);
      ((Fragment)localObject2).onInflate(paramContext, paramAttributeSet, null);
      paramFragmentManager.beginTransaction().setReorderingAllowed(true).add(this, (Fragment)localObject2, str).commitNowAllowingStateLoss();
    }
    paramFragmentManager.onContainerAvailable(this);
  }
  
  private void addDisappearingFragmentView(@NonNull View paramView)
  {
    ArrayList localArrayList = mTransitioningFragmentViews;
    if ((localArrayList != null) && (localArrayList.contains(paramView)))
    {
      if (mDisappearingFragmentChildren == null) {
        mDisappearingFragmentChildren = new ArrayList();
      }
      mDisappearingFragmentChildren.add(paramView);
    }
  }
  
  public void addView(@NonNull View paramView, int paramInt, @Nullable ViewGroup.LayoutParams paramLayoutParams)
  {
    if (FragmentManager.getViewFragment(paramView) != null)
    {
      super.addView(paramView, paramInt, paramLayoutParams);
      return;
    }
    paramLayoutParams = new StringBuilder();
    paramLayoutParams.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
    paramLayoutParams.append(paramView);
    paramLayoutParams.append(" is not associated with a Fragment.");
    throw new IllegalStateException(paramLayoutParams.toString());
  }
  
  public boolean addViewInLayout(@NonNull View paramView, int paramInt, @Nullable ViewGroup.LayoutParams paramLayoutParams, boolean paramBoolean)
  {
    if (FragmentManager.getViewFragment(paramView) != null) {
      return super.addViewInLayout(paramView, paramInt, paramLayoutParams, paramBoolean);
    }
    paramLayoutParams = new StringBuilder();
    paramLayoutParams.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
    paramLayoutParams.append(paramView);
    paramLayoutParams.append(" is not associated with a Fragment.");
    throw new IllegalStateException(paramLayoutParams.toString());
  }
  
  @NonNull
  @RequiresApi(20)
  public WindowInsets dispatchApplyWindowInsets(@NonNull WindowInsets paramWindowInsets)
  {
    WindowInsetsCompat localWindowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(paramWindowInsets);
    View.OnApplyWindowInsetsListener localOnApplyWindowInsetsListener = mApplyWindowInsetsListener;
    if (localOnApplyWindowInsetsListener != null) {
      localWindowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(localOnApplyWindowInsetsListener.onApplyWindowInsets(this, paramWindowInsets));
    } else {
      localWindowInsetsCompat = ViewCompat.onApplyWindowInsets(this, localWindowInsetsCompat);
    }
    if (!localWindowInsetsCompat.isConsumed())
    {
      int i = getChildCount();
      for (int j = 0; j < i; j++) {
        ViewCompat.dispatchApplyWindowInsets(getChildAt(j), localWindowInsetsCompat);
      }
    }
    return paramWindowInsets;
  }
  
  public void dispatchDraw(@NonNull Canvas paramCanvas)
  {
    if ((mDrawDisappearingViewsFirst) && (mDisappearingFragmentChildren != null)) {
      for (int i = 0; i < mDisappearingFragmentChildren.size(); i++) {
        super.drawChild(paramCanvas, (View)mDisappearingFragmentChildren.get(i), getDrawingTime());
      }
    }
    super.dispatchDraw(paramCanvas);
  }
  
  public boolean drawChild(@NonNull Canvas paramCanvas, @NonNull View paramView, long paramLong)
  {
    if (mDrawDisappearingViewsFirst)
    {
      ArrayList localArrayList = mDisappearingFragmentChildren;
      if ((localArrayList != null) && (localArrayList.size() > 0) && (mDisappearingFragmentChildren.contains(paramView))) {
        return false;
      }
    }
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  public void endViewTransition(@NonNull View paramView)
  {
    ArrayList localArrayList = mTransitioningFragmentViews;
    if (localArrayList != null)
    {
      localArrayList.remove(paramView);
      localArrayList = mDisappearingFragmentChildren;
      if ((localArrayList != null) && (localArrayList.remove(paramView))) {
        mDrawDisappearingViewsFirst = true;
      }
    }
    super.endViewTransition(paramView);
  }
  
  @NonNull
  @RequiresApi(20)
  public WindowInsets onApplyWindowInsets(@NonNull WindowInsets paramWindowInsets)
  {
    return paramWindowInsets;
  }
  
  public void removeAllViewsInLayout()
  {
    for (int i = getChildCount() - 1; i >= 0; i--) {
      addDisappearingFragmentView(getChildAt(i));
    }
    super.removeAllViewsInLayout();
  }
  
  public void removeDetachedView(@NonNull View paramView, boolean paramBoolean)
  {
    if (paramBoolean) {
      addDisappearingFragmentView(paramView);
    }
    super.removeDetachedView(paramView, paramBoolean);
  }
  
  public void removeView(@NonNull View paramView)
  {
    addDisappearingFragmentView(paramView);
    super.removeView(paramView);
  }
  
  public void removeViewAt(int paramInt)
  {
    addDisappearingFragmentView(getChildAt(paramInt));
    super.removeViewAt(paramInt);
  }
  
  public void removeViewInLayout(@NonNull View paramView)
  {
    addDisappearingFragmentView(paramView);
    super.removeViewInLayout(paramView);
  }
  
  public void removeViews(int paramInt1, int paramInt2)
  {
    for (int i = paramInt1; i < paramInt1 + paramInt2; i++) {
      addDisappearingFragmentView(getChildAt(i));
    }
    super.removeViews(paramInt1, paramInt2);
  }
  
  public void removeViewsInLayout(int paramInt1, int paramInt2)
  {
    for (int i = paramInt1; i < paramInt1 + paramInt2; i++) {
      addDisappearingFragmentView(getChildAt(i));
    }
    super.removeViewsInLayout(paramInt1, paramInt2);
  }
  
  public void setDrawDisappearingViewsLast(boolean paramBoolean)
  {
    mDrawDisappearingViewsFirst = paramBoolean;
  }
  
  public void setLayoutTransition(@Nullable LayoutTransition paramLayoutTransition)
  {
    throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
  }
  
  public void setOnApplyWindowInsetsListener(@NonNull View.OnApplyWindowInsetsListener paramOnApplyWindowInsetsListener)
  {
    mApplyWindowInsetsListener = paramOnApplyWindowInsetsListener;
  }
  
  public void startViewTransition(@NonNull View paramView)
  {
    if (paramView.getParent() == this)
    {
      if (mTransitioningFragmentViews == null) {
        mTransitioningFragmentViews = new ArrayList();
      }
      mTransitioningFragmentViews.add(paramView);
    }
    super.startViewTransition(paramView);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentContainerView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */