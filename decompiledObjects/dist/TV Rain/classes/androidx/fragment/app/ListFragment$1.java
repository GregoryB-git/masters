package androidx.fragment.app;

import android.view.ViewGroup;
import android.widget.ListView;

class ListFragment$1
  implements Runnable
{
  public ListFragment$1(ListFragment paramListFragment) {}
  
  public void run()
  {
    ListView localListView = this$0.mList;
    localListView.focusableViewAvailable(localListView);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.ListFragment.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */