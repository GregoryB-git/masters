package l;

import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

public final class z$f
  implements ListAdapter, SpinnerAdapter
{
  public SpinnerAdapter a;
  public ListAdapter b;
  
  public z$f(SpinnerAdapter paramSpinnerAdapter, Resources.Theme paramTheme)
  {
    a = paramSpinnerAdapter;
    if ((paramSpinnerAdapter instanceof ListAdapter)) {
      b = ((ListAdapter)paramSpinnerAdapter);
    }
    if (paramTheme != null) {
      if ((paramSpinnerAdapter instanceof ThemedSpinnerAdapter))
      {
        z.d.a((ThemedSpinnerAdapter)paramSpinnerAdapter, paramTheme);
      }
      else if ((paramSpinnerAdapter instanceof v0))
      {
        paramSpinnerAdapter = (v0)paramSpinnerAdapter;
        if (paramSpinnerAdapter.getDropDownViewTheme() == null) {
          paramSpinnerAdapter.a();
        }
      }
    }
  }
  
  public final boolean areAllItemsEnabled()
  {
    ListAdapter localListAdapter = b;
    if (localListAdapter != null) {
      return localListAdapter.areAllItemsEnabled();
    }
    return true;
  }
  
  public final int getCount()
  {
    SpinnerAdapter localSpinnerAdapter = a;
    int i;
    if (localSpinnerAdapter == null) {
      i = 0;
    } else {
      i = localSpinnerAdapter.getCount();
    }
    return i;
  }
  
  public final View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    SpinnerAdapter localSpinnerAdapter = a;
    if (localSpinnerAdapter == null) {
      paramView = null;
    } else {
      paramView = localSpinnerAdapter.getDropDownView(paramInt, paramView, paramViewGroup);
    }
    return paramView;
  }
  
  public final Object getItem(int paramInt)
  {
    Object localObject = a;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((Adapter)localObject).getItem(paramInt);
    }
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    SpinnerAdapter localSpinnerAdapter = a;
    long l;
    if (localSpinnerAdapter == null) {
      l = -1L;
    } else {
      l = localSpinnerAdapter.getItemId(paramInt);
    }
    return l;
  }
  
  public final int getItemViewType(int paramInt)
  {
    return 0;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return getDropDownView(paramInt, paramView, paramViewGroup);
  }
  
  public final int getViewTypeCount()
  {
    return 1;
  }
  
  public final boolean hasStableIds()
  {
    SpinnerAdapter localSpinnerAdapter = a;
    boolean bool;
    if ((localSpinnerAdapter != null) && (localSpinnerAdapter.hasStableIds())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean isEmpty()
  {
    boolean bool;
    if (getCount() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean isEnabled(int paramInt)
  {
    ListAdapter localListAdapter = b;
    if (localListAdapter != null) {
      return localListAdapter.isEnabled(paramInt);
    }
    return true;
  }
  
  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    SpinnerAdapter localSpinnerAdapter = a;
    if (localSpinnerAdapter != null) {
      localSpinnerAdapter.registerDataSetObserver(paramDataSetObserver);
    }
  }
  
  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    SpinnerAdapter localSpinnerAdapter = a;
    if (localSpinnerAdapter != null) {
      localSpinnerAdapter.unregisterDataSetObserver(paramDataSetObserver);
    }
  }
}

/* Location:
 * Qualified Name:     l.z.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */