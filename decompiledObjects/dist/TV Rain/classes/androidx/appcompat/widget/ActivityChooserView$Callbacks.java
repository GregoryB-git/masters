package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow.OnDismissListener;
import androidx.core.view.ActionProvider;

class ActivityChooserView$Callbacks
  implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener
{
  public ActivityChooserView$Callbacks(ActivityChooserView paramActivityChooserView) {}
  
  private void notifyOnDismissListener()
  {
    PopupWindow.OnDismissListener localOnDismissListener = this$0.mOnDismissListener;
    if (localOnDismissListener != null) {
      localOnDismissListener.onDismiss();
    }
  }
  
  public void onClick(View paramView)
  {
    ActivityChooserView localActivityChooserView = this$0;
    if (paramView == mDefaultActivityButton)
    {
      localActivityChooserView.dismissPopup();
      paramView = this$0.mAdapter.getDefaultActivity();
      int i = this$0.mAdapter.getDataModel().getActivityIndex(paramView);
      paramView = this$0.mAdapter.getDataModel().chooseActivity(i);
      if (paramView != null)
      {
        paramView.addFlags(524288);
        this$0.getContext().startActivity(paramView);
      }
    }
    else
    {
      if (paramView != mExpandActivityOverflowButton) {
        break label106;
      }
      mIsSelectingDefaultActivity = false;
      localActivityChooserView.showPopupUnchecked(mInitialActivityCount);
    }
    return;
    label106:
    throw new IllegalArgumentException();
  }
  
  public void onDismiss()
  {
    notifyOnDismissListener();
    ActionProvider localActionProvider = this$0.mProvider;
    if (localActionProvider != null) {
      localActionProvider.subUiVisibilityChanged(false);
    }
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int i = ((ActivityChooserView.ActivityChooserViewAdapter)paramAdapterView.getAdapter()).getItemViewType(paramInt);
    if (i != 0)
    {
      if (i == 1) {
        this$0.showPopupUnchecked(Integer.MAX_VALUE);
      } else {
        throw new IllegalArgumentException();
      }
    }
    else
    {
      this$0.dismissPopup();
      paramAdapterView = this$0;
      if (mIsSelectingDefaultActivity)
      {
        if (paramInt > 0) {
          mAdapter.getDataModel().setDefaultActivity(paramInt);
        }
      }
      else
      {
        if (!mAdapter.getShowDefaultActivity()) {
          paramInt++;
        }
        paramAdapterView = this$0.mAdapter.getDataModel().chooseActivity(paramInt);
        if (paramAdapterView != null)
        {
          paramAdapterView.addFlags(524288);
          this$0.getContext().startActivity(paramAdapterView);
        }
      }
    }
  }
  
  public boolean onLongClick(View paramView)
  {
    ActivityChooserView localActivityChooserView = this$0;
    if (paramView == mDefaultActivityButton)
    {
      if (mAdapter.getCount() > 0)
      {
        paramView = this$0;
        mIsSelectingDefaultActivity = true;
        paramView.showPopupUnchecked(mInitialActivityCount);
      }
      return true;
    }
    throw new IllegalArgumentException();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActivityChooserView.Callbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */