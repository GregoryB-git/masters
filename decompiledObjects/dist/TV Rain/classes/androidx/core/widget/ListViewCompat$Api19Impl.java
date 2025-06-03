package androidx.core.widget;

import android.widget.AbsListView;
import android.widget.ListView;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
class ListViewCompat$Api19Impl
{
  @DoNotInline
  public static boolean canScrollList(ListView paramListView, int paramInt)
  {
    return paramListView.canScrollList(paramInt);
  }
  
  @DoNotInline
  public static void scrollListBy(ListView paramListView, int paramInt)
  {
    paramListView.scrollListBy(paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.ListViewCompat.Api19Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */