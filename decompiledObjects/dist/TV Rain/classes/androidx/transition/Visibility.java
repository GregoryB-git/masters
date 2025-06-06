package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

public abstract class Visibility
  extends Transition
{
  public static final int MODE_IN = 1;
  public static final int MODE_OUT = 2;
  private static final String PROPNAME_PARENT = "android:visibility:parent";
  private static final String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
  public static final String PROPNAME_VISIBILITY = "android:visibility:visibility";
  private static final String[] sTransitionProperties = { "android:visibility:visibility", "android:visibility:parent" };
  private int mMode = 3;
  
  public Visibility() {}
  
  @SuppressLint({"RestrictedApi"})
  public Visibility(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, Styleable.VISIBILITY_TRANSITION);
    int i = TypedArrayUtils.getNamedInt(paramContext, (XmlResourceParser)paramAttributeSet, "transitionVisibilityMode", 0, 0);
    paramContext.recycle();
    if (i != 0) {
      setMode(i);
    }
  }
  
  private void captureValues(TransitionValues paramTransitionValues)
  {
    int i = view.getVisibility();
    values.put("android:visibility:visibility", Integer.valueOf(i));
    values.put("android:visibility:parent", view.getParent());
    int[] arrayOfInt = new int[2];
    view.getLocationOnScreen(arrayOfInt);
    values.put("android:visibility:screenLocation", arrayOfInt);
  }
  
  private VisibilityInfo getVisibilityChangeInfo(TransitionValues paramTransitionValues1, TransitionValues paramTransitionValues2)
  {
    VisibilityInfo localVisibilityInfo = new VisibilityInfo();
    mVisibilityChange = false;
    mFadeIn = false;
    if ((paramTransitionValues1 != null) && (values.containsKey("android:visibility:visibility")))
    {
      mStartVisibility = ((Integer)values.get("android:visibility:visibility")).intValue();
      mStartParent = ((ViewGroup)values.get("android:visibility:parent"));
    }
    else
    {
      mStartVisibility = -1;
      mStartParent = null;
    }
    if ((paramTransitionValues2 != null) && (values.containsKey("android:visibility:visibility")))
    {
      mEndVisibility = ((Integer)values.get("android:visibility:visibility")).intValue();
      mEndParent = ((ViewGroup)values.get("android:visibility:parent"));
    }
    else
    {
      mEndVisibility = -1;
      mEndParent = null;
    }
    if ((paramTransitionValues1 != null) && (paramTransitionValues2 != null))
    {
      int i = mStartVisibility;
      int j = mEndVisibility;
      if ((i == j) && (mStartParent == mEndParent)) {
        return localVisibilityInfo;
      }
      if (i != j)
      {
        if (i == 0)
        {
          mFadeIn = false;
          mVisibilityChange = true;
        }
        else if (j == 0)
        {
          mFadeIn = true;
          mVisibilityChange = true;
        }
      }
      else if (mEndParent == null)
      {
        mFadeIn = false;
        mVisibilityChange = true;
      }
      else if (mStartParent == null)
      {
        mFadeIn = true;
        mVisibilityChange = true;
      }
    }
    else if ((paramTransitionValues1 == null) && (mEndVisibility == 0))
    {
      mFadeIn = true;
      mVisibilityChange = true;
    }
    else if ((paramTransitionValues2 == null) && (mStartVisibility == 0))
    {
      mFadeIn = false;
      mVisibilityChange = true;
    }
    return localVisibilityInfo;
  }
  
  public void captureEndValues(@NonNull TransitionValues paramTransitionValues)
  {
    captureValues(paramTransitionValues);
  }
  
  public void captureStartValues(@NonNull TransitionValues paramTransitionValues)
  {
    captureValues(paramTransitionValues);
  }
  
  @Nullable
  public Animator createAnimator(@NonNull ViewGroup paramViewGroup, @Nullable TransitionValues paramTransitionValues1, @Nullable TransitionValues paramTransitionValues2)
  {
    VisibilityInfo localVisibilityInfo = getVisibilityChangeInfo(paramTransitionValues1, paramTransitionValues2);
    if ((mVisibilityChange) && ((mStartParent != null) || (mEndParent != null)))
    {
      if (mFadeIn) {
        return onAppear(paramViewGroup, paramTransitionValues1, mStartVisibility, paramTransitionValues2, mEndVisibility);
      }
      return onDisappear(paramViewGroup, paramTransitionValues1, mStartVisibility, paramTransitionValues2, mEndVisibility);
    }
    return null;
  }
  
  public int getMode()
  {
    return mMode;
  }
  
  @Nullable
  public String[] getTransitionProperties()
  {
    return sTransitionProperties;
  }
  
  public boolean isTransitionRequired(TransitionValues paramTransitionValues1, TransitionValues paramTransitionValues2)
  {
    boolean bool1 = false;
    if ((paramTransitionValues1 == null) && (paramTransitionValues2 == null)) {
      return false;
    }
    if ((paramTransitionValues1 != null) && (paramTransitionValues2 != null) && (values.containsKey("android:visibility:visibility") != values.containsKey("android:visibility:visibility"))) {
      return false;
    }
    paramTransitionValues1 = getVisibilityChangeInfo(paramTransitionValues1, paramTransitionValues2);
    boolean bool2 = bool1;
    if (mVisibilityChange) {
      if (mStartVisibility != 0)
      {
        bool2 = bool1;
        if (mEndVisibility != 0) {}
      }
      else
      {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public boolean isVisible(TransitionValues paramTransitionValues)
  {
    boolean bool1 = false;
    if (paramTransitionValues == null) {
      return false;
    }
    int i = ((Integer)values.get("android:visibility:visibility")).intValue();
    paramTransitionValues = (View)values.get("android:visibility:parent");
    boolean bool2 = bool1;
    if (i == 0)
    {
      bool2 = bool1;
      if (paramTransitionValues != null) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public Animator onAppear(ViewGroup paramViewGroup, View paramView, TransitionValues paramTransitionValues1, TransitionValues paramTransitionValues2)
  {
    return null;
  }
  
  public Animator onAppear(ViewGroup paramViewGroup, TransitionValues paramTransitionValues1, int paramInt1, TransitionValues paramTransitionValues2, int paramInt2)
  {
    if (((mMode & 0x1) == 1) && (paramTransitionValues2 != null))
    {
      if (paramTransitionValues1 == null)
      {
        View localView = (View)view.getParent();
        if (getVisibilityChangeInfogetMatchedTransitionValuesgetTransitionValuesmVisibilityChange) {
          return null;
        }
      }
      return onAppear(paramViewGroup, view, paramTransitionValues1, paramTransitionValues2);
    }
    return null;
  }
  
  public Animator onDisappear(ViewGroup paramViewGroup, View paramView, TransitionValues paramTransitionValues1, TransitionValues paramTransitionValues2)
  {
    return null;
  }
  
  public Animator onDisappear(final ViewGroup paramViewGroup, TransitionValues paramTransitionValues1, int paramInt1, TransitionValues paramTransitionValues2, int paramInt2)
  {
    if ((mMode & 0x2) != 2) {
      return null;
    }
    if (paramTransitionValues1 == null) {
      return null;
    }
    final View localView1 = view;
    Object localObject1;
    if (paramTransitionValues2 != null) {
      localObject1 = view;
    } else {
      localObject1 = null;
    }
    int i = R.id.save_overlay_view;
    final Object localObject2 = (View)localView1.getTag(i);
    if (localObject2 != null)
    {
      localObject1 = null;
      paramInt1 = 1;
    }
    else
    {
      if ((localObject1 != null) && (((View)localObject1).getParent() != null))
      {
        if ((paramInt2 == 4) || (localView1 == localObject1))
        {
          localObject2 = localObject1;
          paramInt1 = 0;
          localObject1 = null;
          break label138;
        }
      }
      else if (localObject1 != null)
      {
        localObject2 = null;
        paramInt1 = 0;
        break label138;
      }
      localObject1 = null;
      localObject2 = localObject1;
      paramInt1 = 1;
      label138:
      Object localObject3 = localObject1;
      if (paramInt1 != 0) {
        if (localView1.getParent() != null)
        {
          localObject3 = localObject1;
          if ((localView1.getParent() instanceof View))
          {
            View localView2 = (View)localView1.getParent();
            if (!getVisibilityChangeInfogetTransitionValuesgetMatchedTransitionValuesmVisibilityChange)
            {
              localObject3 = TransitionUtils.copyViewImage(paramViewGroup, localView1, localView2);
            }
            else
            {
              paramInt1 = localView2.getId();
              localObject3 = localObject1;
              if (localView2.getParent() == null)
              {
                localObject3 = localObject1;
                if (paramInt1 != -1)
                {
                  localObject3 = localObject1;
                  if (paramViewGroup.findViewById(paramInt1) != null)
                  {
                    localObject3 = localObject1;
                    if (!mCanRemoveViews) {}
                  }
                }
              }
            }
          }
        }
        else
        {
          localObject1 = localObject2;
          paramInt1 = 0;
          localObject2 = localView1;
          break label292;
        }
      }
      paramInt1 = 0;
      localObject1 = localObject2;
      localObject2 = localObject3;
    }
    label292:
    if (localObject2 != null)
    {
      if (paramInt1 == 0)
      {
        localObject1 = (int[])values.get("android:visibility:screenLocation");
        int j = localObject1[0];
        paramInt2 = localObject1[1];
        localObject1 = new int[2];
        paramViewGroup.getLocationOnScreen((int[])localObject1);
        ((View)localObject2).offsetLeftAndRight(j - localObject1[0] - ((View)localObject2).getLeft());
        ((View)localObject2).offsetTopAndBottom(paramInt2 - localObject1[1] - ((View)localObject2).getTop());
        ViewGroupUtils.getOverlay(paramViewGroup).add((View)localObject2);
      }
      paramTransitionValues1 = onDisappear(paramViewGroup, (View)localObject2, paramTransitionValues1, paramTransitionValues2);
      if (paramInt1 == 0) {
        if (paramTransitionValues1 == null)
        {
          ViewGroupUtils.getOverlay(paramViewGroup).remove((View)localObject2);
        }
        else
        {
          localView1.setTag(i, localObject2);
          addListener(new TransitionListenerAdapter()
          {
            public void onTransitionEnd(@NonNull Transition paramAnonymousTransition)
            {
              localView1.setTag(R.id.save_overlay_view, null);
              ViewGroupUtils.getOverlay(paramViewGroup).remove(localObject2);
              paramAnonymousTransition.removeListener(this);
            }
            
            public void onTransitionPause(@NonNull Transition paramAnonymousTransition)
            {
              ViewGroupUtils.getOverlay(paramViewGroup).remove(localObject2);
            }
            
            public void onTransitionResume(@NonNull Transition paramAnonymousTransition)
            {
              if (localObject2.getParent() == null) {
                ViewGroupUtils.getOverlay(paramViewGroup).add(localObject2);
              } else {
                cancel();
              }
            }
          });
        }
      }
      return paramTransitionValues1;
    }
    if (localObject1 != null)
    {
      paramInt1 = ((View)localObject1).getVisibility();
      ViewUtils.setTransitionVisibility((View)localObject1, 0);
      paramViewGroup = onDisappear(paramViewGroup, (View)localObject1, paramTransitionValues1, paramTransitionValues2);
      if (paramViewGroup != null)
      {
        paramTransitionValues1 = new DisappearListener((View)localObject1, paramInt2, true);
        paramViewGroup.addListener(paramTransitionValues1);
        AnimatorUtils.addPauseListener(paramViewGroup, paramTransitionValues1);
        addListener(paramTransitionValues1);
      }
      else
      {
        ViewUtils.setTransitionVisibility((View)localObject1, paramInt1);
      }
      return paramViewGroup;
    }
    return null;
  }
  
  public void setMode(int paramInt)
  {
    if ((paramInt & 0xFFFFFFFC) == 0)
    {
      mMode = paramInt;
      return;
    }
    throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
  }
  
  public static class DisappearListener
    extends AnimatorListenerAdapter
    implements Transition.TransitionListener, AnimatorUtils.AnimatorPauseListenerCompat
  {
    public boolean mCanceled = false;
    private final int mFinalVisibility;
    private boolean mLayoutSuppressed;
    private final ViewGroup mParent;
    private final boolean mSuppressLayout;
    private final View mView;
    
    public DisappearListener(View paramView, int paramInt, boolean paramBoolean)
    {
      mView = paramView;
      mFinalVisibility = paramInt;
      mParent = ((ViewGroup)paramView.getParent());
      mSuppressLayout = paramBoolean;
      suppressLayout(true);
    }
    
    private void hideViewWhenNotCanceled()
    {
      if (!mCanceled)
      {
        ViewUtils.setTransitionVisibility(mView, mFinalVisibility);
        ViewGroup localViewGroup = mParent;
        if (localViewGroup != null) {
          localViewGroup.invalidate();
        }
      }
      suppressLayout(false);
    }
    
    private void suppressLayout(boolean paramBoolean)
    {
      if ((mSuppressLayout) && (mLayoutSuppressed != paramBoolean))
      {
        ViewGroup localViewGroup = mParent;
        if (localViewGroup != null)
        {
          mLayoutSuppressed = paramBoolean;
          ViewGroupUtils.suppressLayout(localViewGroup, paramBoolean);
        }
      }
    }
    
    public void onAnimationCancel(Animator paramAnimator)
    {
      mCanceled = true;
    }
    
    public void onAnimationEnd(Animator paramAnimator)
    {
      hideViewWhenNotCanceled();
    }
    
    public void onAnimationPause(Animator paramAnimator)
    {
      if (!mCanceled) {
        ViewUtils.setTransitionVisibility(mView, mFinalVisibility);
      }
    }
    
    public void onAnimationRepeat(Animator paramAnimator) {}
    
    public void onAnimationResume(Animator paramAnimator)
    {
      if (!mCanceled) {
        ViewUtils.setTransitionVisibility(mView, 0);
      }
    }
    
    public void onAnimationStart(Animator paramAnimator) {}
    
    public void onTransitionCancel(@NonNull Transition paramTransition) {}
    
    public void onTransitionEnd(@NonNull Transition paramTransition)
    {
      hideViewWhenNotCanceled();
      paramTransition.removeListener(this);
    }
    
    public void onTransitionPause(@NonNull Transition paramTransition)
    {
      suppressLayout(false);
    }
    
    public void onTransitionResume(@NonNull Transition paramTransition)
    {
      suppressLayout(true);
    }
    
    public void onTransitionStart(@NonNull Transition paramTransition) {}
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @SuppressLint({"UniqueConstants"})
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface Mode {}
  
  public static class VisibilityInfo
  {
    public ViewGroup mEndParent;
    public int mEndVisibility;
    public boolean mFadeIn;
    public ViewGroup mStartParent;
    public int mStartVisibility;
    public boolean mVisibilityChange;
  }
}

/* Location:
 * Qualified Name:     androidx.transition.Visibility
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */