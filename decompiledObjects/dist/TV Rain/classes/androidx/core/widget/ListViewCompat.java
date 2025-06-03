package androidx.core.widget;

import android.widget.AbsListView;
import android.widget.ListView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

public final class ListViewCompat
{
  public static boolean canScrollList(@NonNull ListView paramListView, int paramInt)
  {
    return Api19Impl.canScrollList(paramListView, paramInt);
  }
  
  public static void scrollListBy(@NonNull ListView paramListView, int paramInt)
  {
    Api19Impl.scrollListBy(paramListView, paramInt);
  }
  
  @RequiresApi(19)
  public static class Api19Impl
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
}

/* Location:
 * Qualified Name:     androidx.core.widget.ListViewCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */