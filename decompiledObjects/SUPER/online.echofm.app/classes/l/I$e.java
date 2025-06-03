package l;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.PopupWindow;

public class I$e
  implements AbsListView.OnScrollListener
{
  public I$e(I paramI) {}
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if ((paramInt == 1) && (!a.m()) && (a.T.getContentView() != null))
    {
      paramAbsListView = a;
      P.removeCallbacks(K);
      a.K.run();
    }
  }
}

/* Location:
 * Qualified Name:     l.I.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */