package androidx.appcompat.widget;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Observable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R.id;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.string;

class ActivityChooserView$ActivityChooserViewAdapter
  extends BaseAdapter
{
  private static final int ITEM_VIEW_TYPE_ACTIVITY = 0;
  private static final int ITEM_VIEW_TYPE_COUNT = 3;
  private static final int ITEM_VIEW_TYPE_FOOTER = 1;
  public static final int MAX_ACTIVITY_COUNT_DEFAULT = 4;
  public static final int MAX_ACTIVITY_COUNT_UNLIMITED = Integer.MAX_VALUE;
  private ActivityChooserModel mDataModel;
  private boolean mHighlightDefaultActivity;
  private int mMaxActivityCount = 4;
  private boolean mShowDefaultActivity;
  private boolean mShowFooterView;
  
  public ActivityChooserView$ActivityChooserViewAdapter(ActivityChooserView paramActivityChooserView) {}
  
  public int getActivityCount()
  {
    return mDataModel.getActivityCount();
  }
  
  public int getCount()
  {
    int i = mDataModel.getActivityCount();
    int j = i;
    if (!mShowDefaultActivity)
    {
      j = i;
      if (mDataModel.getDefaultActivity() != null) {
        j = i - 1;
      }
    }
    i = Math.min(j, mMaxActivityCount);
    j = i;
    if (mShowFooterView) {
      j = i + 1;
    }
    return j;
  }
  
  public ActivityChooserModel getDataModel()
  {
    return mDataModel;
  }
  
  public ResolveInfo getDefaultActivity()
  {
    return mDataModel.getDefaultActivity();
  }
  
  public int getHistorySize()
  {
    return mDataModel.getHistorySize();
  }
  
  public Object getItem(int paramInt)
  {
    int i = getItemViewType(paramInt);
    if (i != 0)
    {
      if (i == 1) {
        return null;
      }
      throw new IllegalArgumentException();
    }
    i = paramInt;
    if (!mShowDefaultActivity)
    {
      i = paramInt;
      if (mDataModel.getDefaultActivity() != null) {
        i = paramInt + 1;
      }
    }
    return mDataModel.getActivity(i);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public int getItemViewType(int paramInt)
  {
    if ((mShowFooterView) && (paramInt == getCount() - 1)) {
      return 1;
    }
    return 0;
  }
  
  public boolean getShowDefaultActivity()
  {
    return mShowDefaultActivity;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = getItemViewType(paramInt);
    View localView;
    if (i != 0)
    {
      if (i == 1)
      {
        if (paramView != null)
        {
          localView = paramView;
          if (paramView.getId() == 1) {}
        }
        else
        {
          localView = LayoutInflater.from(this$0.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, paramViewGroup, false);
          localView.setId(1);
          ((TextView)localView.findViewById(R.id.title)).setText(this$0.getContext().getString(R.string.abc_activity_chooser_view_see_all));
        }
        return localView;
      }
      throw new IllegalArgumentException();
    }
    if (paramView != null)
    {
      localView = paramView;
      if (paramView.getId() == R.id.list_item) {}
    }
    else
    {
      localView = LayoutInflater.from(this$0.getContext()).inflate(R.layout.abc_activity_chooser_view_list_item, paramViewGroup, false);
    }
    PackageManager localPackageManager = this$0.getContext().getPackageManager();
    paramView = (ImageView)localView.findViewById(R.id.icon);
    paramViewGroup = (ResolveInfo)getItem(paramInt);
    paramView.setImageDrawable(paramViewGroup.loadIcon(localPackageManager));
    ((TextView)localView.findViewById(R.id.title)).setText(paramViewGroup.loadLabel(localPackageManager));
    if ((mShowDefaultActivity) && (paramInt == 0) && (mHighlightDefaultActivity)) {
      localView.setActivated(true);
    } else {
      localView.setActivated(false);
    }
    return localView;
  }
  
  public int getViewTypeCount()
  {
    return 3;
  }
  
  public int measureContentWidth()
  {
    int i = mMaxActivityCount;
    mMaxActivityCount = Integer.MAX_VALUE;
    int j = 0;
    int k = View.MeasureSpec.makeMeasureSpec(0, 0);
    int m = View.MeasureSpec.makeMeasureSpec(0, 0);
    int n = getCount();
    int i1 = 0;
    View localView = null;
    while (j < n)
    {
      localView = getView(j, localView, null);
      localView.measure(k, m);
      i1 = Math.max(i1, localView.getMeasuredWidth());
      j++;
    }
    mMaxActivityCount = i;
    return i1;
  }
  
  public void setDataModel(ActivityChooserModel paramActivityChooserModel)
  {
    ActivityChooserModel localActivityChooserModel = this$0.mAdapter.getDataModel();
    if ((localActivityChooserModel != null) && (this$0.isShown())) {
      localActivityChooserModel.unregisterObserver(this$0.mModelDataSetObserver);
    }
    mDataModel = paramActivityChooserModel;
    if ((paramActivityChooserModel != null) && (this$0.isShown())) {
      paramActivityChooserModel.registerObserver(this$0.mModelDataSetObserver);
    }
    notifyDataSetChanged();
  }
  
  public void setMaxActivityCount(int paramInt)
  {
    if (mMaxActivityCount != paramInt)
    {
      mMaxActivityCount = paramInt;
      notifyDataSetChanged();
    }
  }
  
  public void setShowDefaultActivity(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((mShowDefaultActivity != paramBoolean1) || (mHighlightDefaultActivity != paramBoolean2))
    {
      mShowDefaultActivity = paramBoolean1;
      mHighlightDefaultActivity = paramBoolean2;
      notifyDataSetChanged();
    }
  }
  
  public void setShowFooterView(boolean paramBoolean)
  {
    if (mShowFooterView != paramBoolean)
    {
      mShowFooterView = paramBoolean;
      notifyDataSetChanged();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActivityChooserView.ActivityChooserViewAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */