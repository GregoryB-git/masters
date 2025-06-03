package androidx.appcompat.widget;

import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import androidx.annotation.Nullable;

class AppCompatSpinner$DropDownAdapter
  implements ListAdapter, SpinnerAdapter
{
  private SpinnerAdapter mAdapter;
  private ListAdapter mListAdapter;
  
  public AppCompatSpinner$DropDownAdapter(@Nullable SpinnerAdapter paramSpinnerAdapter, @Nullable Resources.Theme paramTheme)
  {
    mAdapter = paramSpinnerAdapter;
    if ((paramSpinnerAdapter instanceof ListAdapter)) {
      mListAdapter = ((ListAdapter)paramSpinnerAdapter);
    }
    if (paramTheme != null) {
      if ((paramSpinnerAdapter instanceof android.widget.ThemedSpinnerAdapter))
      {
        AppCompatSpinner.Api23Impl.setDropDownViewTheme((android.widget.ThemedSpinnerAdapter)paramSpinnerAdapter, paramTheme);
      }
      else if ((paramSpinnerAdapter instanceof ThemedSpinnerAdapter))
      {
        paramSpinnerAdapter = (ThemedSpinnerAdapter)paramSpinnerAdapter;
        if (paramSpinnerAdapter.getDropDownViewTheme() == null) {
          paramSpinnerAdapter.setDropDownViewTheme(paramTheme);
        }
      }
    }
  }
  
  public boolean areAllItemsEnabled()
  {
    ListAdapter localListAdapter = mListAdapter;
    if (localListAdapter != null) {
      return localListAdapter.areAllItemsEnabled();
    }
    return true;
  }
  
  public int getCount()
  {
    SpinnerAdapter localSpinnerAdapter = mAdapter;
    int i;
    if (localSpinnerAdapter == null) {
      i = 0;
    } else {
      i = localSpinnerAdapter.getCount();
    }
    return i;
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    SpinnerAdapter localSpinnerAdapter = mAdapter;
    if (localSpinnerAdapter == null) {
      paramView = null;
    } else {
      paramView = localSpinnerAdapter.getDropDownView(paramInt, paramView, paramViewGroup);
    }
    return paramView;
  }
  
  public Object getItem(int paramInt)
  {
    Object localObject = mAdapter;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((Adapter)localObject).getItem(paramInt);
    }
    return localObject;
  }
  
  public long getItemId(int paramInt)
  {
    SpinnerAdapter localSpinnerAdapter = mAdapter;
    long l;
    if (localSpinnerAdapter == null) {
      l = -1L;
    } else {
      l = localSpinnerAdapter.getItemId(paramInt);
    }
    return l;
  }
  
  public int getItemViewType(int paramInt)
  {
    return 0;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return getDropDownView(paramInt, paramView, paramViewGroup);
  }
  
  public int getViewTypeCount()
  {
    return 1;
  }
  
  public boolean hasStableIds()
  {
    SpinnerAdapter localSpinnerAdapter = mAdapter;
    boolean bool;
    if ((localSpinnerAdapter != null) && (localSpinnerAdapter.hasStableIds())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isEmpty()
  {
    boolean bool;
    if (getCount() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isEnabled(int paramInt)
  {
    ListAdapter localListAdapter = mListAdapter;
    if (localListAdapter != null) {
      return localListAdapter.isEnabled(paramInt);
    }
    return true;
  }
  
  public void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    SpinnerAdapter localSpinnerAdapter = mAdapter;
    if (localSpinnerAdapter != null) {
      localSpinnerAdapter.registerDataSetObserver(paramDataSetObserver);
    }
  }
  
  public void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    SpinnerAdapter localSpinnerAdapter = mAdapter;
    if (localSpinnerAdapter != null) {
      localSpinnerAdapter.unregisterDataSetObserver(paramDataSetObserver);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatSpinner.DropDownAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */