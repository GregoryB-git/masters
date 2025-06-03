package L;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class e
  extends a
{
  public final ListView G;
  
  public e(ListView paramListView)
  {
    super(paramListView);
    G = paramListView;
  }
  
  public boolean a(int paramInt)
  {
    return false;
  }
  
  public boolean b(int paramInt)
  {
    ListView localListView = G;
    int i = localListView.getCount();
    if (i == 0) {
      return false;
    }
    int j = localListView.getChildCount();
    int k = localListView.getFirstVisiblePosition();
    if (paramInt > 0)
    {
      if ((k + j >= i) && (localListView.getChildAt(j - 1).getBottom() <= localListView.getHeight())) {
        return false;
      }
    }
    else
    {
      if (paramInt >= 0) {
        break label85;
      }
      if ((k <= 0) && (localListView.getChildAt(0).getTop() >= 0)) {
        return false;
      }
    }
    return true;
    label85:
    return false;
  }
  
  public void j(int paramInt1, int paramInt2)
  {
    f.a(G, paramInt2);
  }
}

/* Location:
 * Qualified Name:     L.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */