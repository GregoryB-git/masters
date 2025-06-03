package l;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.PopupWindow;

public final class n0$e
  implements AbsListView.OnScrollListener
{
  public n0$e(n0 paramn0) {}
  
  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    int i = 1;
    if (paramInt == 1)
    {
      if (a.G.getInputMethodMode() == 2) {
        paramInt = i;
      } else {
        paramInt = 0;
      }
      if ((paramInt == 0) && (a.G.getContentView() != null))
      {
        paramAbsListView = a;
        C.removeCallbacks(y);
        a.y.run();
      }
    }
  }
}

/* Location:
 * Qualified Name:     l.n0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */