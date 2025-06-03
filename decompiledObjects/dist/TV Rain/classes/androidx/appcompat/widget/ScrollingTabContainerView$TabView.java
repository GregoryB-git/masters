package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.appcompat.R.attr;
import androidx.appcompat.app.ActionBar.Tab;

class ScrollingTabContainerView$TabView
  extends LinearLayout
{
  private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.app.ActionBar$Tab";
  private final int[] BG_ATTRS;
  private View mCustomView;
  private ImageView mIconView;
  private ActionBar.Tab mTab;
  private TextView mTextView;
  
  public ScrollingTabContainerView$TabView(ScrollingTabContainerView paramScrollingTabContainerView, Context paramContext, ActionBar.Tab paramTab, boolean paramBoolean)
  {
    super(paramContext, null, i);
    paramScrollingTabContainerView = new int[1];
    paramScrollingTabContainerView[0] = 16842964;
    BG_ATTRS = paramScrollingTabContainerView;
    mTab = paramTab;
    paramScrollingTabContainerView = TintTypedArray.obtainStyledAttributes(paramContext, null, paramScrollingTabContainerView, i, 0);
    if (paramScrollingTabContainerView.hasValue(0)) {
      setBackgroundDrawable(paramScrollingTabContainerView.getDrawable(0));
    }
    paramScrollingTabContainerView.recycle();
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
    if (this$0.mMaxTabWidth > 0)
    {
      int i = getMeasuredWidth();
      paramInt1 = this$0.mMaxTabWidth;
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

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ScrollingTabContainerView.TabView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */