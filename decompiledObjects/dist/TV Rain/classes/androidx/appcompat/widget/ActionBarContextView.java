package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.id;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.styleable;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.core.view.ViewCompat;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarContextView
  extends AbsActionBarView
{
  private View mClose;
  private View mCloseButton;
  private int mCloseItemLayout;
  private View mCustomView;
  private CharSequence mSubtitle;
  private int mSubtitleStyleRes;
  private TextView mSubtitleView;
  private CharSequence mTitle;
  private LinearLayout mTitleLayout;
  private boolean mTitleOptional;
  private int mTitleStyleRes;
  private TextView mTitleView;
  
  public ActionBarContextView(@NonNull Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionBarContextView(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.actionModeStyle);
  }
  
  public ActionBarContextView(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = TintTypedArray.obtainStyledAttributes(paramContext, paramAttributeSet, R.styleable.ActionMode, paramInt, 0);
    ViewCompat.setBackground(this, paramContext.getDrawable(R.styleable.ActionMode_background));
    mTitleStyleRes = paramContext.getResourceId(R.styleable.ActionMode_titleTextStyle, 0);
    mSubtitleStyleRes = paramContext.getResourceId(R.styleable.ActionMode_subtitleTextStyle, 0);
    mContentHeight = paramContext.getLayoutDimension(R.styleable.ActionMode_height, 0);
    mCloseItemLayout = paramContext.getResourceId(R.styleable.ActionMode_closeItemLayout, R.layout.abc_action_mode_close_item_material);
    paramContext.recycle();
  }
  
  private void initTitle()
  {
    if (mTitleLayout == null)
    {
      LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
      localObject = (LinearLayout)getChildAt(getChildCount() - 1);
      mTitleLayout = ((LinearLayout)localObject);
      mTitleView = ((TextView)((View)localObject).findViewById(R.id.action_bar_title));
      mSubtitleView = ((TextView)mTitleLayout.findViewById(R.id.action_bar_subtitle));
      if (mTitleStyleRes != 0) {
        mTitleView.setTextAppearance(getContext(), mTitleStyleRes);
      }
      if (mSubtitleStyleRes != 0) {
        mSubtitleView.setTextAppearance(getContext(), mSubtitleStyleRes);
      }
    }
    mTitleView.setText(mTitle);
    mSubtitleView.setText(mSubtitle);
    boolean bool1 = TextUtils.isEmpty(mTitle);
    boolean bool2 = TextUtils.isEmpty(mSubtitle) ^ true;
    Object localObject = mSubtitleView;
    int i = 0;
    if (bool2) {
      j = 0;
    } else {
      j = 8;
    }
    ((View)localObject).setVisibility(j);
    localObject = mTitleLayout;
    int j = i;
    if (!(bool1 ^ true)) {
      if (bool2) {
        j = i;
      } else {
        j = 8;
      }
    }
    ((View)localObject).setVisibility(j);
    if (mTitleLayout.getParent() == null) {
      addView(mTitleLayout);
    }
  }
  
  public void closeMode()
  {
    if (mClose == null) {
      killMode();
    }
  }
  
  public ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewGroup.MarginLayoutParams(-1, -2);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ViewGroup.MarginLayoutParams(getContext(), paramAttributeSet);
  }
  
  public CharSequence getSubtitle()
  {
    return mSubtitle;
  }
  
  public CharSequence getTitle()
  {
    return mTitle;
  }
  
  public boolean hideOverflowMenu()
  {
    ActionMenuPresenter localActionMenuPresenter = mActionMenuPresenter;
    if (localActionMenuPresenter != null) {
      return localActionMenuPresenter.hideOverflowMenu();
    }
    return false;
  }
  
  public void initForMode(final ActionMode paramActionMode)
  {
    Object localObject = mClose;
    if (localObject == null)
    {
      localObject = LayoutInflater.from(getContext()).inflate(mCloseItemLayout, this, false);
      mClose = ((View)localObject);
      addView((View)localObject);
    }
    else if (((View)localObject).getParent() == null)
    {
      addView(mClose);
    }
    localObject = mClose.findViewById(R.id.action_mode_close_button);
    mCloseButton = ((View)localObject);
    ((View)localObject).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        paramActionMode.finish();
      }
    });
    paramActionMode = (MenuBuilder)paramActionMode.getMenu();
    localObject = mActionMenuPresenter;
    if (localObject != null) {
      ((ActionMenuPresenter)localObject).dismissPopupMenus();
    }
    localObject = new ActionMenuPresenter(getContext());
    mActionMenuPresenter = ((ActionMenuPresenter)localObject);
    ((ActionMenuPresenter)localObject).setReserveOverflow(true);
    localObject = new ViewGroup.LayoutParams(-2, -1);
    paramActionMode.addMenuPresenter(mActionMenuPresenter, mPopupContext);
    paramActionMode = (ActionMenuView)mActionMenuPresenter.getMenuView(this);
    mMenuView = paramActionMode;
    ViewCompat.setBackground(paramActionMode, null);
    addView(mMenuView, (ViewGroup.LayoutParams)localObject);
  }
  
  public boolean isOverflowMenuShowing()
  {
    ActionMenuPresenter localActionMenuPresenter = mActionMenuPresenter;
    if (localActionMenuPresenter != null) {
      return localActionMenuPresenter.isOverflowMenuShowing();
    }
    return false;
  }
  
  public boolean isTitleOptional()
  {
    return mTitleOptional;
  }
  
  public void killMode()
  {
    removeAllViews();
    mCustomView = null;
    mMenuView = null;
    mActionMenuPresenter = null;
    View localView = mCloseButton;
    if (localView != null) {
      localView.setOnClickListener(null);
    }
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    ActionMenuPresenter localActionMenuPresenter = mActionMenuPresenter;
    if (localActionMenuPresenter != null)
    {
      localActionMenuPresenter.hideOverflowMenu();
      mActionMenuPresenter.hideSubMenus();
    }
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramBoolean = ViewUtils.isLayoutRtl(this);
    int i;
    if (paramBoolean) {
      i = paramInt3 - paramInt1 - getPaddingRight();
    } else {
      i = getPaddingLeft();
    }
    int j = getPaddingTop();
    int k = paramInt4 - paramInt2 - getPaddingTop() - getPaddingBottom();
    Object localObject = mClose;
    paramInt2 = i;
    if (localObject != null)
    {
      paramInt2 = i;
      if (((View)localObject).getVisibility() != 8)
      {
        localObject = (ViewGroup.MarginLayoutParams)mClose.getLayoutParams();
        if (paramBoolean) {
          paramInt2 = rightMargin;
        } else {
          paramInt2 = leftMargin;
        }
        if (paramBoolean) {
          paramInt4 = leftMargin;
        } else {
          paramInt4 = rightMargin;
        }
        paramInt2 = AbsActionBarView.next(i, paramInt2, paramBoolean);
        paramInt2 = AbsActionBarView.next(paramInt2 + positionChild(mClose, paramInt2, j, k, paramBoolean), paramInt4, paramBoolean);
      }
    }
    localObject = mTitleLayout;
    paramInt4 = paramInt2;
    if (localObject != null)
    {
      paramInt4 = paramInt2;
      if (mCustomView == null)
      {
        paramInt4 = paramInt2;
        if (((View)localObject).getVisibility() != 8) {
          paramInt4 = paramInt2 + positionChild(mTitleLayout, paramInt2, j, k, paramBoolean);
        }
      }
    }
    localObject = mCustomView;
    if (localObject != null) {
      positionChild((View)localObject, paramInt4, j, k, paramBoolean);
    }
    if (paramBoolean) {
      paramInt1 = getPaddingLeft();
    } else {
      paramInt1 = paramInt3 - paramInt1 - getPaddingRight();
    }
    localObject = mMenuView;
    if (localObject != null) {
      positionChild((View)localObject, paramInt1, j, k, paramBoolean ^ true);
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = 1073741824;
    if (i == 1073741824)
    {
      if (View.MeasureSpec.getMode(paramInt2) != 0)
      {
        int k = View.MeasureSpec.getSize(paramInt1);
        i = mContentHeight;
        if (i <= 0) {
          i = View.MeasureSpec.getSize(paramInt2);
        }
        paramInt1 = getPaddingTop();
        int m = getPaddingBottom() + paramInt1;
        paramInt1 = k - getPaddingLeft() - getPaddingRight();
        int n = i - m;
        int i1 = View.MeasureSpec.makeMeasureSpec(n, Integer.MIN_VALUE);
        localObject = mClose;
        int i2 = 0;
        paramInt2 = paramInt1;
        if (localObject != null)
        {
          paramInt1 = measureChildView((View)localObject, paramInt1, i1, 0);
          localObject = (ViewGroup.MarginLayoutParams)mClose.getLayoutParams();
          paramInt2 = paramInt1 - (leftMargin + rightMargin);
        }
        localObject = mMenuView;
        paramInt1 = paramInt2;
        if (localObject != null)
        {
          paramInt1 = paramInt2;
          if (((View)localObject).getParent() == this) {
            paramInt1 = measureChildView(mMenuView, paramInt2, i1, 0);
          }
        }
        localObject = mTitleLayout;
        paramInt2 = paramInt1;
        int i3;
        if (localObject != null)
        {
          paramInt2 = paramInt1;
          if (mCustomView == null) {
            if (mTitleOptional)
            {
              paramInt2 = View.MeasureSpec.makeMeasureSpec(0, 0);
              mTitleLayout.measure(paramInt2, i1);
              i3 = mTitleLayout.getMeasuredWidth();
              if (i3 <= paramInt1) {
                i1 = 1;
              } else {
                i1 = 0;
              }
              paramInt2 = paramInt1;
              if (i1 != 0) {
                paramInt2 = paramInt1 - i3;
              }
              localObject = mTitleLayout;
              if (i1 != 0) {
                paramInt1 = 0;
              } else {
                paramInt1 = 8;
              }
              ((View)localObject).setVisibility(paramInt1);
            }
            else
            {
              paramInt2 = measureChildView((View)localObject, paramInt1, i1, 0);
            }
          }
        }
        localObject = mCustomView;
        if (localObject != null)
        {
          localObject = ((View)localObject).getLayoutParams();
          i3 = width;
          if (i3 != -2) {
            paramInt1 = 1073741824;
          } else {
            paramInt1 = Integer.MIN_VALUE;
          }
          i1 = paramInt2;
          if (i3 >= 0) {
            i1 = Math.min(i3, paramInt2);
          }
          i3 = height;
          if (i3 != -2) {
            paramInt2 = j;
          } else {
            paramInt2 = Integer.MIN_VALUE;
          }
          j = n;
          if (i3 >= 0) {
            j = Math.min(i3, n);
          }
          mCustomView.measure(View.MeasureSpec.makeMeasureSpec(i1, paramInt1), View.MeasureSpec.makeMeasureSpec(j, paramInt2));
        }
        if (mContentHeight <= 0)
        {
          j = getChildCount();
          paramInt2 = 0;
          paramInt1 = i2;
          while (paramInt1 < j)
          {
            i1 = getChildAt(paramInt1).getMeasuredHeight() + m;
            i = paramInt2;
            if (i1 > paramInt2) {
              i = i1;
            }
            paramInt1++;
            paramInt2 = i;
          }
          setMeasuredDimension(k, paramInt2);
        }
        else
        {
          setMeasuredDimension(k, i);
        }
        return;
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(getClass().getSimpleName());
      ((StringBuilder)localObject).append(" can only be used with android:layout_height=\"wrap_content\"");
      throw new IllegalStateException(((StringBuilder)localObject).toString());
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(getClass().getSimpleName());
    ((StringBuilder)localObject).append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public void setContentHeight(int paramInt)
  {
    mContentHeight = paramInt;
  }
  
  public void setCustomView(View paramView)
  {
    Object localObject = mCustomView;
    if (localObject != null) {
      removeView((View)localObject);
    }
    mCustomView = paramView;
    if (paramView != null)
    {
      localObject = mTitleLayout;
      if (localObject != null)
      {
        removeView((View)localObject);
        mTitleLayout = null;
      }
    }
    if (paramView != null) {
      addView(paramView);
    }
    requestLayout();
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    mSubtitle = paramCharSequence;
    initTitle();
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    mTitle = paramCharSequence;
    initTitle();
    ViewCompat.setAccessibilityPaneTitle(this, paramCharSequence);
  }
  
  public void setTitleOptional(boolean paramBoolean)
  {
    if (paramBoolean != mTitleOptional) {
      requestLayout();
    }
    mTitleOptional = paramBoolean;
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
  
  public boolean showOverflowMenu()
  {
    ActionMenuPresenter localActionMenuPresenter = mActionMenuPresenter;
    if (localActionMenuPresenter != null) {
      return localActionMenuPresenter.showOverflowMenu();
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActionBarContextView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */