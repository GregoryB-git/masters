package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.mediarouter.R.bool;
import androidx.mediarouter.R.dimen;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

final class MediaRouteDialogHelper
{
  public static int getDialogHeight(Context paramContext)
  {
    if (!paramContext.getResources().getBoolean(R.bool.is_tablet)) {
      return -1;
    }
    return -2;
  }
  
  public static int getDialogWidth(Context paramContext)
  {
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    if (widthPixels < heightPixels) {
      i = 1;
    } else {
      i = 0;
    }
    TypedValue localTypedValue = new TypedValue();
    paramContext = paramContext.getResources();
    if (i != 0) {
      i = R.dimen.mr_dialog_fixed_width_minor;
    } else {
      i = R.dimen.mr_dialog_fixed_width_major;
    }
    paramContext.getValue(i, localTypedValue, true);
    int i = type;
    if (i == 5) {}
    for (float f = localTypedValue.getDimension(localDisplayMetrics);; f = localTypedValue.getFraction(i, i))
    {
      return (int)f;
      if (i != 6) {
        break;
      }
      i = widthPixels;
    }
    return -2;
  }
  
  public static int getDialogWidthForDynamicGroup(Context paramContext)
  {
    if (!paramContext.getResources().getBoolean(R.bool.is_tablet)) {
      return -1;
    }
    return getDialogWidth(paramContext);
  }
  
  public static <E> HashMap<E, BitmapDrawable> getItemBitmapMap(Context paramContext, ListView paramListView, ArrayAdapter<E> paramArrayAdapter)
  {
    HashMap localHashMap = new HashMap();
    int i = paramListView.getFirstVisiblePosition();
    for (int j = 0; j < paramListView.getChildCount(); j++) {
      localHashMap.put(paramArrayAdapter.getItem(i + j), getViewBitmap(paramContext, paramListView.getChildAt(j)));
    }
    return localHashMap;
  }
  
  public static <E> HashMap<E, Rect> getItemBoundMap(ListView paramListView, ArrayAdapter<E> paramArrayAdapter)
  {
    HashMap localHashMap = new HashMap();
    int i = paramListView.getFirstVisiblePosition();
    for (int j = 0; j < paramListView.getChildCount(); j++)
    {
      Object localObject = paramArrayAdapter.getItem(i + j);
      View localView = paramListView.getChildAt(j);
      localHashMap.put(localObject, new Rect(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom()));
    }
    return localHashMap;
  }
  
  public static <E> Set<E> getItemsAdded(List<E> paramList1, List<E> paramList2)
  {
    paramList2 = new HashSet(paramList2);
    paramList2.removeAll(paramList1);
    return paramList2;
  }
  
  public static <E> Set<E> getItemsRemoved(List<E> paramList1, List<E> paramList2)
  {
    paramList1 = new HashSet(paramList1);
    paramList1.removeAll(paramList2);
    return paramList1;
  }
  
  private static BitmapDrawable getViewBitmap(Context paramContext, View paramView)
  {
    Bitmap localBitmap = Bitmap.createBitmap(paramView.getWidth(), paramView.getHeight(), Bitmap.Config.ARGB_8888);
    paramView.draw(new Canvas(localBitmap));
    return new BitmapDrawable(paramContext.getResources(), localBitmap);
  }
  
  public static <E> boolean listUnorderedEquals(List<E> paramList1, List<E> paramList2)
  {
    return new HashSet(paramList1).equals(new HashSet(paramList2));
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.MediaRouteDialogHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */