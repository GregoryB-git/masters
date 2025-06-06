package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView.LayoutParams;
import android.widget.AbsSpinner;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.app.ActionBar.Tab;
import androidx.appcompat.view.ActionBarPolicy;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ScrollingTabContainerView
  extends HorizontalScrollView
  implements AdapterView.OnItemSelectedListener
{
  private static final int FADE_DURATION = 200;
  private static final String TAG = "ScrollingTabContainerView";
  private static final Interpolator sAlphaInterpolator = new DecelerateInterpolator();
  private boolean mAllowCollapse;
  private int mContentHeight;
  public int mMaxTabWidth;
  private int mSelectedTabIndex;
  public int mStackedTabMaxWidth;
  private TabClickListener mTabClickListener;
  public LinearLayoutCompat mTabLayout;
  public Runnable mTabSelector;
  private Spinner mTabSpinner;
  public final VisibilityAnimListener mVisAnimListener = new VisibilityAnimListener();
  public ViewPropertyAnimator mVisibilityAnim;
  
  public ScrollingTabContainerView(@NonNull Context paramContext)
  {
    super(paramContext);
    setHorizontalScrollBarEnabled(false);
    paramContext = ActionBarPolicy.get(paramContext);
    setContentHeight(paramContext.getTabContainerHeight());
    mStackedTabMaxWidth = paramContext.getStackedTabMaxWidth();
    paramContext = createTabLayout();
    mTabLayout = paramContext;
    addView(paramContext, new ViewGroup.LayoutParams(-2, -1));
  }
  
  private Spinner createSpinner()
  {
    AppCompatSpinner localAppCompatSpinner = new AppCompatSpinner(getContext(), null, R.attr.actionDropDownStyle);
    localAppCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
    localAppCompatSpinner.setOnItemSelectedListener(this);
    return localAppCompatSpinner;
  }
  
  private LinearLayoutCompat createTabLayout()
  {
    LinearLayoutCompat localLinearLayoutCompat = new LinearLayoutCompat(getContext(), null, R.attr.actionBarTabBarStyle);
    localLinearLayoutCompat.setMeasureWithLargestChildEnabled(true);
    localLinearLayoutCompat.setGravity(17);
    localLinearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
    return localLinearLayoutCompat;
  }
  
  private boolean isCollapsed()
  {
    Spinner localSpinner = mTabSpinner;
    boolean bool;
    if ((localSpinner != null) && (localSpinner.getParent() == this)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void performCollapse()
  {
    if (isCollapsed()) {
      return;
    }
    if (mTabSpinner == null) {
      mTabSpinner = createSpinner();
    }
    removeView(mTabLayout);
    addView(mTabSpinner, new ViewGroup.LayoutParams(-2, -1));
    if (mTabSpinner.getAdapter() == null) {
      mTabSpinner.setAdapter(new TabAdapter());
    }
    Runnable localRunnable = mTabSelector;
    if (localRunnable != null)
    {
      removeCallbacks(localRunnable);
      mTabSelector = null;
    }
    mTabSpinner.setSelection(mSelectedTabIndex);
  }
  
  private boolean performExpand()
  {
    if (!isCollapsed()) {
      return false;
    }
    removeView(mTabSpinner);
    addView(mTabLayout, new ViewGroup.LayoutParams(-2, -1));
    setTabSelected(mTabSpinner.getSelectedItemPosition());
    return false;
  }
  
  public void addTab(ActionBar.Tab paramTab, int paramInt, boolean paramBoolean)
  {
    TabView localTabView = createTabView(paramTab, false);
    mTabLayout.addView(localTabView, paramInt, new LinearLayoutCompat.LayoutParams(0, -1, 1.0F));
    paramTab = mTabSpinner;
    if (paramTab != null) {
      ((TabAdapter)paramTab.getAdapter()).notifyDataSetChanged();
    }
    if (paramBoolean) {
      localTabView.setSelected(true);
    }
    if (mAllowCollapse) {
      requestLayout();
    }
  }
  
  public void addTab(ActionBar.Tab paramTab, boolean paramBoolean)
  {
    TabView localTabView = createTabView(paramTab, false);
    mTabLayout.addView(localTabView, new LinearLayoutCompat.LayoutParams(0, -1, 1.0F));
    paramTab = mTabSpinner;
    if (paramTab != null) {
      ((TabAdapter)paramTab.getAdapter()).notifyDataSetChanged();
    }
    if (paramBoolean) {
      localTabView.setSelected(true);
    }
    if (mAllowCollapse) {
      requestLayout();
    }
  }
  
  public void animateToTab(int paramInt)
  {
    final Object localObject = mTabLayout.getChildAt(paramInt);
    Runnable localRunnable = mTabSelector;
    if (localRunnable != null) {
      removeCallbacks(localRunnable);
    }
    localObject = new Runnable()
    {
      public void run()
      {
        int i = localObject.getLeft();
        int j = (getWidth() - localObject.getWidth()) / 2;
        smoothScrollTo(i - j, 0);
        mTabSelector = null;
      }
    };
    mTabSelector = ((Runnable)localObject);
    post((Runnable)localObject);
  }
  
  public void animateToVisibility(int paramInt)
  {
    ViewPropertyAnimator localViewPropertyAnimator = mVisibilityAnim;
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.cancel();
    }
    if (paramInt == 0)
    {
      if (getVisibility() != 0) {
        setAlpha(0.0F);
      }
      localViewPropertyAnimator = animate().alpha(1.0F);
      localViewPropertyAnimator.setDuration(200L);
      localViewPropertyAnimator.setInterpolator(sAlphaInterpolator);
      localViewPropertyAnimator.setListener(mVisAnimListener.withFinalVisibility(localViewPropertyAnimator, paramInt));
      localViewPropertyAnimator.start();
    }
    else
    {
      localViewPropertyAnimator = animate().alpha(0.0F);
      localViewPropertyAnimator.setDuration(200L);
      localViewPropertyAnimator.setInterpolator(sAlphaInterpolator);
      localViewPropertyAnimator.setListener(mVisAnimListener.withFinalVisibility(localViewPropertyAnimator, paramInt));
      localViewPropertyAnimator.start();
    }
  }
  
  public TabView createTabView(ActionBar.Tab paramTab, boolean paramBoolean)
  {
    paramTab = new TabView(getContext(), paramTab, paramBoolean);
    if (paramBoolean)
    {
      paramTab.setBackgroundDrawable(null);
      paramTab.setLayoutParams(new AbsListView.LayoutParams(-1, mContentHeight));
    }
    else
    {
      paramTab.setFocusable(true);
      if (mTabClickListener == null) {
        mTabClickListener = new TabClickListener();
      }
      paramTab.setOnClickListener(mTabClickListener);
    }
    return paramTab;
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    Runnable localRunnable = mTabSelector;
    if (localRunnable != null) {
      post(localRunnable);
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    paramConfiguration = ActionBarPolicy.get(getContext());
    setContentHeight(paramConfiguration.getTabContainerHeight());
    mStackedTabMaxWidth = paramConfiguration.getStackedTabMaxWidth();
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Runnable localRunnable = mTabSelector;
    if (localRunnable != null) {
      removeCallbacks(localRunnable);
    }
  }
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    ((TabView)paramView).getTab().select();
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    paramInt2 = 1;
    boolean bool;
    if (i == 1073741824) {
      bool = true;
    } else {
      bool = false;
    }
    setFillViewport(bool);
    int j = mTabLayout.getChildCount();
    if ((j > 1) && ((i == 1073741824) || (i == Integer.MIN_VALUE)))
    {
      if (j > 2) {
        mMaxTabWidth = ((int)(View.MeasureSpec.getSize(paramInt1) * 0.4F));
      } else {
        mMaxTabWidth = (View.MeasureSpec.getSize(paramInt1) / 2);
      }
      mMaxTabWidth = Math.min(mMaxTabWidth, mStackedTabMaxWidth);
    }
    else
    {
      mMaxTabWidth = -1;
    }
    i = View.MeasureSpec.makeMeasureSpec(mContentHeight, 1073741824);
    if ((bool) || (!mAllowCollapse)) {
      paramInt2 = 0;
    }
    if (paramInt2 != 0)
    {
      mTabLayout.measure(0, i);
      if (mTabLayout.getMeasuredWidth() > View.MeasureSpec.getSize(paramInt1)) {
        performCollapse();
      } else {
        performExpand();
      }
    }
    else
    {
      performExpand();
    }
    paramInt2 = getMeasuredWidth();
    super.onMeasure(paramInt1, i);
    paramInt1 = getMeasuredWidth();
    if ((bool) && (paramInt2 != paramInt1)) {
      setTabSelected(mSelectedTabIndex);
    }
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
  
  public void removeAllTabs()
  {
    mTabLayout.removeAllViews();
    Spinner localSpinner = mTabSpinner;
    if (localSpinner != null) {
      ((TabAdapter)localSpinner.getAdapter()).notifyDataSetChanged();
    }
    if (mAllowCollapse) {
      requestLayout();
    }
  }
  
  public void removeTabAt(int paramInt)
  {
    mTabLayout.removeViewAt(paramInt);
    Spinner localSpinner = mTabSpinner;
    if (localSpinner != null) {
      ((TabAdapter)localSpinner.getAdapter()).notifyDataSetChanged();
    }
    if (mAllowCollapse) {
      requestLayout();
    }
  }
  
  public void setAllowCollapse(boolean paramBoolean)
  {
    mAllowCollapse = paramBoolean;
  }
  
  public void setContentHeight(int paramInt)
  {
    mContentHeight = paramInt;
    requestLayout();
  }
  
  public void setTabSelected(int paramInt)
  {
    mSelectedTabIndex = paramInt;
    int i = mTabLayout.getChildCount();
    for (int j = 0; j < i; j++)
    {
      localObject = mTabLayout.getChildAt(j);
      boolean bool;
      if (j == paramInt) {
        bool = true;
      } else {
        bool = false;
      }
      ((View)localObject).setSelected(bool);
      if (bool) {
        animateToTab(paramInt);
      }
    }
    Object localObject = mTabSpinner;
    if ((localObject != null) && (paramInt >= 0)) {
      ((AdapterView)localObject).setSelection(paramInt);
    }
  }
  
  public void updateTab(int paramInt)
  {
    ((TabView)mTabLayout.getChildAt(paramInt)).update();
    Spinner localSpinner = mTabSpinner;
    if (localSpinner != null) {
      ((TabAdapter)localSpinner.getAdapter()).notifyDataSetChanged();
    }
    if (mAllowCollapse) {
      requestLayout();
    }
  }
  
  public class TabAdapter
    extends BaseAdapter
  {
    public TabAdapter() {}
    
    public int getCount()
    {
      return mTabLayout.getChildCount();
    }
    
    public Object getItem(int paramInt)
    {
      return ((ScrollingTabContainerView.TabView)mTabLayout.getChildAt(paramInt)).getTab();
    }
    
    public long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      if (paramView == null) {
        paramView = createTabView((ActionBar.Tab)getItem(paramInt), true);
      } else {
        ((ScrollingTabContainerView.TabView)paramView).bindTab((ActionBar.Tab)getItem(paramInt));
      }
      return paramView;
    }
  }
  
  public class TabClickListener
    implements View.OnClickListener
  {
    public TabClickListener() {}
    
    public void onClick(View paramView)
    {
      ((ScrollingTabContainerView.TabView)paramView).getTab().select();
      int i = mTabLayout.getChildCount();
      for (int j = 0; j < i; j++)
      {
        View localView = mTabLayout.getChildAt(j);
        boolean bool;
        if (localView == paramView) {
          bool = true;
        } else {
          bool = false;
        }
        localView.setSelected(bool);
      }
    }
  }
  
  public class TabView
    extends LinearLayout
  {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.app.ActionBar$Tab";
    private final int[] BG_ATTRS;
    private View mCustomView;
    private ImageView mIconView;
    private ActionBar.Tab mTab;
    private TextView mTextView;
    
    public TabView(Context paramContext, ActionBar.Tab paramTab, boolean paramBoolean)
    {
      super(null, i);
      this$1 = new int[1];
      ScrollingTabContainerView.this[0] = 16842964;
      BG_ATTRS = ScrollingTabContainerView.this;
      mTab = paramTab;
      this$1 = TintTypedArray.obtainStyledAttributes(paramContext, null, ScrollingTabContainerView.this, i, 0);
      if (hasValue(0)) {
        setBackgroundDrawable(getDrawable(0));
      }
      recycle();
      if (paramBoolean) {
        setGravity(8388627);
      }
      update();
    }
    
    public void bindTab(ActionBar.Tab paramTab)
    {
      mTab = paramTab;
      update();
    }
    
    public ActionBar.Tab getTab()
    {
      return mTab;
    }
    
    public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
    }
    
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
    {
      super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
      paramAccessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
    }
    
    public void onMeasure(int paramInt1, int paramInt2)
    {
      super.onMeasure(paramInt1, paramInt2);
      if (mMaxTabWidth > 0)
      {
        int i = getMeasuredWidth();
        paramInt1 = mMaxTabWidth;
        if (i > paramInt1) {
          super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), paramInt2);
        }
      }
    }
    
    public void setSelected(boolean paramBoolean)
    {
      int i;
      if (isSelected() != paramBoolean) {
        i = 1;
      } else {
        i = 0;
      }
      super.setSelected(paramBoolean);
      if ((i != 0) && (paramBoolean)) {
        sendAccessibilityEvent(4);
      }
    }
    
    public void update()
    {
      ActionBar.Tab localTab = mTab;
      Object localObject1 = localTab.getCustomView();
      Object localObject2 = null;
      if (localObject1 != null)
      {
        localObject2 = ((View)localObject1).getParent();
        if (localObject2 != this)
        {
          if (localObject2 != null) {
            ((ViewGroup)localObject2).removeView((View)localObject1);
          }
          addView((View)localObject1);
        }
        mCustomView = ((View)localObject1);
        localObject2 = mTextView;
        if (localObject2 != null) {
          ((View)localObject2).setVisibility(8);
        }
        localObject2 = mIconView;
        if (localObject2 != null)
        {
          ((ImageView)localObject2).setVisibility(8);
          mIconView.setImageDrawable(null);
        }
      }
      else
      {
        localObject1 = mCustomView;
        if (localObject1 != null)
        {
          removeView((View)localObject1);
          mCustomView = null;
        }
        Drawable localDrawable = localTab.getIcon();
        localObject1 = localTab.getText();
        Object localObject3;
        Object localObject4;
        if (localDrawable != null)
        {
          if (mIconView == null)
          {
            localObject3 = new AppCompatImageView(getContext());
            localObject4 = new LinearLayout.LayoutParams(-2, -2);
            gravity = 16;
            ((View)localObject3).setLayoutParams((ViewGroup.LayoutParams)localObject4);
            addView((View)localObject3, 0);
            mIconView = ((ImageView)localObject3);
          }
          mIconView.setImageDrawable(localDrawable);
          mIconView.setVisibility(0);
        }
        else
        {
          localObject3 = mIconView;
          if (localObject3 != null)
          {
            ((ImageView)localObject3).setVisibility(8);
            mIconView.setImageDrawable(null);
          }
        }
        boolean bool = TextUtils.isEmpty((CharSequence)localObject1) ^ true;
        if (bool)
        {
          if (mTextView == null)
          {
            localObject4 = new AppCompatTextView(getContext(), null, R.attr.actionBarTabTextStyle);
            ((TextView)localObject4).setEllipsize(TextUtils.TruncateAt.END);
            localObject3 = new LinearLayout.LayoutParams(-2, -2);
            gravity = 16;
            ((View)localObject4).setLayoutParams((ViewGroup.LayoutParams)localObject3);
            addView((View)localObject4);
            mTextView = ((TextView)localObject4);
          }
          mTextView.setText((CharSequence)localObject1);
          mTextView.setVisibility(0);
        }
        else
        {
          localObject1 = mTextView;
          if (localObject1 != null)
          {
            ((View)localObject1).setVisibility(8);
            mTextView.setText(null);
          }
        }
        localObject1 = mIconView;
        if (localObject1 != null) {
          ((View)localObject1).setContentDescription(localTab.getContentDescription());
        }
        if (!bool) {
          localObject2 = localTab.getContentDescription();
        }
        TooltipCompat.setTooltipText(this, (CharSequence)localObject2);
      }
    }
  }
  
  public class VisibilityAnimListener
    extends AnimatorListenerAdapter
  {
    private boolean mCanceled = false;
    private int mFinalVisibility;
    
    public VisibilityAnimListener() {}
    
    public void onAnimationCancel(Animator paramAnimator)
    {
      mCanceled = true;
    }
    
    public void onAnimationEnd(Animator paramAnimator)
    {
      if (mCanceled) {
        return;
      }
      paramAnimator = ScrollingTabContainerView.this;
      mVisibilityAnim = null;
      paramAnimator.setVisibility(mFinalVisibility);
    }
    
    public void onAnimationStart(Animator paramAnimator)
    {
      setVisibility(0);
      mCanceled = false;
    }
    
    public VisibilityAnimListener withFinalVisibility(ViewPropertyAnimator paramViewPropertyAnimator, int paramInt)
    {
      mFinalVisibility = paramInt;
      mVisibilityAnim = paramViewPropertyAnimator;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ScrollingTabContainerView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */