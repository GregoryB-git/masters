package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.R.styleable;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import z2;

public class CoordinatorLayout$LayoutParams
  extends ViewGroup.MarginLayoutParams
{
  public int anchorGravity = 0;
  public int dodgeInsetEdges = 0;
  public int gravity = 0;
  public int insetEdge = 0;
  public int keyline = -1;
  public View mAnchorDirectChild;
  public int mAnchorId = -1;
  public View mAnchorView;
  public CoordinatorLayout.Behavior mBehavior;
  public boolean mBehaviorResolved = false;
  public Object mBehaviorTag;
  private boolean mDidAcceptNestedScrollNonTouch;
  private boolean mDidAcceptNestedScrollTouch;
  private boolean mDidBlockInteraction;
  private boolean mDidChangeAfterNestedScroll;
  public int mInsetOffsetX;
  public int mInsetOffsetY;
  public final Rect mLastChildRect = new Rect();
  
  public CoordinatorLayout$LayoutParams(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
  }
  
  public CoordinatorLayout$LayoutParams(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.CoordinatorLayout_Layout);
    gravity = localTypedArray.getInteger(R.styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
    mAnchorId = localTypedArray.getResourceId(R.styleable.CoordinatorLayout_Layout_layout_anchor, -1);
    anchorGravity = localTypedArray.getInteger(R.styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
    keyline = localTypedArray.getInteger(R.styleable.CoordinatorLayout_Layout_layout_keyline, -1);
    insetEdge = localTypedArray.getInt(R.styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
    dodgeInsetEdges = localTypedArray.getInt(R.styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
    int i = R.styleable.CoordinatorLayout_Layout_layout_behavior;
    boolean bool = localTypedArray.hasValue(i);
    mBehaviorResolved = bool;
    if (bool) {
      mBehavior = CoordinatorLayout.parseBehavior(paramContext, paramAttributeSet, localTypedArray.getString(i));
    }
    localTypedArray.recycle();
    paramContext = mBehavior;
    if (paramContext != null) {
      paramContext.onAttachedToLayoutParams(this);
    }
  }
  
  public CoordinatorLayout$LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  public CoordinatorLayout$LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    super(paramMarginLayoutParams);
  }
  
  public CoordinatorLayout$LayoutParams(LayoutParams paramLayoutParams)
  {
    super(paramLayoutParams);
  }
  
  private void resolveAnchorView(View paramView, CoordinatorLayout paramCoordinatorLayout)
  {
    View localView = paramCoordinatorLayout.findViewById(mAnchorId);
    mAnchorView = localView;
    if (localView != null)
    {
      if (localView == paramCoordinatorLayout)
      {
        if (paramCoordinatorLayout.isInEditMode())
        {
          mAnchorDirectChild = null;
          mAnchorView = null;
          return;
        }
        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
      }
      for (localObject = localView.getParent(); (localObject != paramCoordinatorLayout) && (localObject != null); localObject = ((ViewParent)localObject).getParent())
      {
        if (localObject == paramView)
        {
          if (paramCoordinatorLayout.isInEditMode())
          {
            mAnchorDirectChild = null;
            mAnchorView = null;
            return;
          }
          throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
        }
        if ((localObject instanceof View)) {
          localView = (View)localObject;
        }
      }
      mAnchorDirectChild = localView;
      return;
    }
    if (paramCoordinatorLayout.isInEditMode())
    {
      mAnchorDirectChild = null;
      mAnchorView = null;
      return;
    }
    Object localObject = z2.t("Could not find CoordinatorLayout descendant view with id ");
    ((StringBuilder)localObject).append(paramCoordinatorLayout.getResources().getResourceName(mAnchorId));
    ((StringBuilder)localObject).append(" to anchor view ");
    ((StringBuilder)localObject).append(paramView);
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  private boolean shouldDodge(View paramView, int paramInt)
  {
    int i = GravityCompat.getAbsoluteGravity(getLayoutParamsinsetEdge, paramInt);
    boolean bool;
    if ((i != 0) && ((GravityCompat.getAbsoluteGravity(dodgeInsetEdges, paramInt) & i) == i)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean verifyAnchorView(View paramView, CoordinatorLayout paramCoordinatorLayout)
  {
    if (mAnchorView.getId() != mAnchorId) {
      return false;
    }
    View localView = mAnchorView;
    ViewParent localViewParent = localView.getParent();
    while (localViewParent != paramCoordinatorLayout) {
      if ((localViewParent != null) && (localViewParent != paramView))
      {
        if ((localViewParent instanceof View)) {
          localView = (View)localViewParent;
        }
        localViewParent = localViewParent.getParent();
      }
      else
      {
        mAnchorDirectChild = null;
        mAnchorView = null;
        return false;
      }
    }
    mAnchorDirectChild = localView;
    return true;
  }
  
  public boolean checkAnchorChanged()
  {
    boolean bool;
    if ((mAnchorView == null) && (mAnchorId != -1)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean dependsOn(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
  {
    if ((paramView2 != mAnchorDirectChild) && (!shouldDodge(paramView2, ViewCompat.getLayoutDirection(paramCoordinatorLayout))))
    {
      CoordinatorLayout.Behavior localBehavior = mBehavior;
      if ((localBehavior == null) || (!localBehavior.layoutDependsOn(paramCoordinatorLayout, paramView1, paramView2)))
      {
        bool = false;
        break label54;
      }
    }
    boolean bool = true;
    label54:
    return bool;
  }
  
  public boolean didBlockInteraction()
  {
    if (mBehavior == null) {
      mDidBlockInteraction = false;
    }
    return mDidBlockInteraction;
  }
  
  public View findAnchorView(CoordinatorLayout paramCoordinatorLayout, View paramView)
  {
    if (mAnchorId == -1)
    {
      mAnchorDirectChild = null;
      mAnchorView = null;
      return null;
    }
    if ((mAnchorView == null) || (!verifyAnchorView(paramView, paramCoordinatorLayout))) {
      resolveAnchorView(paramView, paramCoordinatorLayout);
    }
    return mAnchorView;
  }
  
  @IdRes
  public int getAnchorId()
  {
    return mAnchorId;
  }
  
  @Nullable
  public CoordinatorLayout.Behavior getBehavior()
  {
    return mBehavior;
  }
  
  public boolean getChangedAfterNestedScroll()
  {
    return mDidChangeAfterNestedScroll;
  }
  
  public Rect getLastChildRect()
  {
    return mLastChildRect;
  }
  
  public void invalidateAnchor()
  {
    mAnchorDirectChild = null;
    mAnchorView = null;
  }
  
  public boolean isBlockingInteractionBelow(CoordinatorLayout paramCoordinatorLayout, View paramView)
  {
    boolean bool1 = mDidBlockInteraction;
    if (bool1) {
      return true;
    }
    CoordinatorLayout.Behavior localBehavior = mBehavior;
    boolean bool2;
    if (localBehavior != null) {
      bool2 = localBehavior.blocksInteractionBelow(paramCoordinatorLayout, paramView);
    } else {
      bool2 = false;
    }
    bool2 |= bool1;
    mDidBlockInteraction = bool2;
    return bool2;
  }
  
  public boolean isNestedScrollAccepted(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1) {
        return false;
      }
      return mDidAcceptNestedScrollNonTouch;
    }
    return mDidAcceptNestedScrollTouch;
  }
  
  public void resetChangedAfterNestedScroll()
  {
    mDidChangeAfterNestedScroll = false;
  }
  
  public void resetNestedScroll(int paramInt)
  {
    setNestedScrollAccepted(paramInt, false);
  }
  
  public void resetTouchBehaviorTracking()
  {
    mDidBlockInteraction = false;
  }
  
  public void setAnchorId(@IdRes int paramInt)
  {
    invalidateAnchor();
    mAnchorId = paramInt;
  }
  
  public void setBehavior(@Nullable CoordinatorLayout.Behavior paramBehavior)
  {
    CoordinatorLayout.Behavior localBehavior = mBehavior;
    if (localBehavior != paramBehavior)
    {
      if (localBehavior != null) {
        localBehavior.onDetachedFromLayoutParams();
      }
      mBehavior = paramBehavior;
      mBehaviorTag = null;
      mBehaviorResolved = true;
      if (paramBehavior != null) {
        paramBehavior.onAttachedToLayoutParams(this);
      }
    }
  }
  
  public void setChangedAfterNestedScroll(boolean paramBoolean)
  {
    mDidChangeAfterNestedScroll = paramBoolean;
  }
  
  public void setLastChildRect(Rect paramRect)
  {
    mLastChildRect.set(paramRect);
  }
  
  public void setNestedScrollAccepted(int paramInt, boolean paramBoolean)
  {
    if (paramInt != 0)
    {
      if (paramInt == 1) {
        mDidAcceptNestedScrollNonTouch = paramBoolean;
      }
    }
    else {
      mDidAcceptNestedScrollTouch = paramBoolean;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */