package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

class ListMenuPresenter$MenuAdapter
  extends BaseAdapter
{
  private int mExpandedIndex = -1;
  
  public ListMenuPresenter$MenuAdapter(ListMenuPresenter paramListMenuPresenter)
  {
    findExpandedIndex();
  }
  
  public void findExpandedIndex()
  {
    MenuItemImpl localMenuItemImpl = this$0.mMenu.getExpandedItem();
    if (localMenuItemImpl != null)
    {
      ArrayList localArrayList = this$0.mMenu.getNonActionItems();
      int i = localArrayList.size();
      for (int j = 0; j < i; j++) {
        if ((MenuItemImpl)localArrayList.get(j) == localMenuItemImpl)
        {
          mExpandedIndex = j;
          return;
        }
      }
    }
    mExpandedIndex = -1;
  }
  
  public int getCount()
  {
    int i = this$0.mMenu.getNonActionItems().size() - this$0.mItemIndexOffset;
    if (mExpandedIndex < 0) {
      return i;
    }
    return i - 1;
  }
  
  public MenuItemImpl getItem(int paramInt)
  {
    ArrayList localArrayList = this$0.mMenu.getNonActionItems();
    int i = paramInt + this$0.mItemIndexOffset;
    int j = mExpandedIndex;
    paramInt = i;
    if (j >= 0)
    {
      paramInt = i;
      if (i >= j) {
        paramInt = i + 1;
      }
    }
    return (MenuItemImpl)localArrayList.get(paramInt);
  }
  
  public long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView = paramView;
    if (paramView == null)
    {
      paramView = this$0;
      localView = mInflater.inflate(mItemLayoutRes, paramViewGroup, false);
    }
    ((MenuView.ItemView)localView).initialize(getItem(paramInt), 0);
    return localView;
  }
  
  public void notifyDataSetChanged()
  {
    findExpandedIndex();
    super.notifyDataSetChanged();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.ListMenuPresenter.MenuAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */