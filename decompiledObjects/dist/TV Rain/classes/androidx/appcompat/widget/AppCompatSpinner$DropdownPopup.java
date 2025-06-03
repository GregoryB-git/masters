package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.SpinnerAdapter;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;

@VisibleForTesting
class AppCompatSpinner$DropdownPopup
  extends ListPopupWindow
  implements AppCompatSpinner.SpinnerPopup
{
  public ListAdapter mAdapter;
  private CharSequence mHintText;
  private int mOriginalHorizontalOffset;
  private final Rect mVisibleRect = new Rect();
  
  public AppCompatSpinner$DropdownPopup(final AppCompatSpinner paramAppCompatSpinner, Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setAnchorView(paramAppCompatSpinner);
    setModal(true);
    setPromptPosition(0);
    setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        this$0.setSelection(paramAnonymousInt);
        if (this$0.getOnItemClickListener() != null)
        {
          paramAnonymousAdapterView = AppCompatSpinner.DropdownPopup.this;
          this$0.performItemClick(paramAnonymousView, paramAnonymousInt, mAdapter.getItemId(paramAnonymousInt));
        }
        dismiss();
      }
    });
  }
  
  public void computeContentWidth()
  {
    Object localObject = getBackground();
    int i = 0;
    if (localObject != null)
    {
      ((Drawable)localObject).getPadding(this$0.mTempRect);
      if (ViewUtils.isLayoutRtl(this$0)) {
        i = this$0.mTempRect.right;
      } else {
        i = -this$0.mTempRect.left;
      }
    }
    else
    {
      localObject = this$0.mTempRect;
      right = 0;
      left = 0;
    }
    int j = this$0.getPaddingLeft();
    int k = this$0.getPaddingRight();
    int m = this$0.getWidth();
    localObject = this$0;
    int n = mDropDownWidth;
    if (n == -2)
    {
      int i1 = ((AppCompatSpinner)localObject).compatMeasureContentWidth((SpinnerAdapter)mAdapter, getBackground());
      n = this$0.getContext().getResources().getDisplayMetrics().widthPixels;
      localObject = this$0.mTempRect;
      int i2 = n - left - right;
      n = i1;
      if (i1 > i2) {
        n = i2;
      }
      setContentWidth(Math.max(n, m - j - k));
    }
    else if (n == -1)
    {
      setContentWidth(m - j - k);
    }
    else
    {
      setContentWidth(n);
    }
    if (ViewUtils.isLayoutRtl(this$0)) {
      i = m - k - getWidth() - getHorizontalOriginalOffset() + i;
    } else {
      i = j + getHorizontalOriginalOffset() + i;
    }
    setHorizontalOffset(i);
  }
  
  public CharSequence getHintText()
  {
    return mHintText;
  }
  
  public int getHorizontalOriginalOffset()
  {
    return mOriginalHorizontalOffset;
  }
  
  public boolean isVisibleToUser(View paramView)
  {
    boolean bool;
    if ((ViewCompat.isAttachedToWindow(paramView)) && (paramView.getGlobalVisibleRect(mVisibleRect))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    super.setAdapter(paramListAdapter);
    mAdapter = paramListAdapter;
  }
  
  public void setHorizontalOriginalOffset(int paramInt)
  {
    mOriginalHorizontalOffset = paramInt;
  }
  
  public void setPromptText(CharSequence paramCharSequence)
  {
    mHintText = paramCharSequence;
  }
  
  public void show(int paramInt1, int paramInt2)
  {
    boolean bool = isShowing();
    computeContentWidth();
    setInputMethodMode(2);
    super.show();
    Object localObject = getListView();
    ((AbsListView)localObject).setChoiceMode(1);
    AppCompatSpinner.Api17Impl.setTextDirection((View)localObject, paramInt1);
    AppCompatSpinner.Api17Impl.setTextAlignment((View)localObject, paramInt2);
    setSelection(this$0.getSelectedItemPosition());
    if (bool) {
      return;
    }
    localObject = this$0.getViewTreeObserver();
    if (localObject != null)
    {
      final ViewTreeObserver.OnGlobalLayoutListener local2 = new ViewTreeObserver.OnGlobalLayoutListener()
      {
        public void onGlobalLayout()
        {
          AppCompatSpinner.DropdownPopup localDropdownPopup = AppCompatSpinner.DropdownPopup.this;
          if (!localDropdownPopup.isVisibleToUser(this$0))
          {
            dismiss();
          }
          else
          {
            computeContentWidth();
            AppCompatSpinner.DropdownPopup.access$001(AppCompatSpinner.DropdownPopup.this);
          }
        }
      };
      ((ViewTreeObserver)localObject).addOnGlobalLayoutListener(local2);
      setOnDismissListener(new PopupWindow.OnDismissListener()
      {
        public void onDismiss()
        {
          ViewTreeObserver localViewTreeObserver = this$0.getViewTreeObserver();
          if (localViewTreeObserver != null) {
            localViewTreeObserver.removeGlobalOnLayoutListener(local2);
          }
        }
      });
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatSpinner.DropdownPopup
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */