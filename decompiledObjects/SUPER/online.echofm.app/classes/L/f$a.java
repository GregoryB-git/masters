package L;

import android.widget.AbsListView;
import android.widget.ListView;

public abstract class f$a
{
  public static boolean a(ListView paramListView, int paramInt)
  {
    return paramListView.canScrollList(paramInt);
  }
  
  public static void b(ListView paramListView, int paramInt)
  {
    paramListView.scrollListBy(paramInt);
  }
}

/* Location:
 * Qualified Name:     L.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */