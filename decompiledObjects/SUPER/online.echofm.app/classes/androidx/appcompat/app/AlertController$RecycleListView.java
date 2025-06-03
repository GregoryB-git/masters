package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import e.i;

public class AlertController$RecycleListView
  extends ListView
{
  public final int o;
  public final int p;
  
  public AlertController$RecycleListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, i.A1);
    p = paramContext.getDimensionPixelOffset(i.B1, -1);
    o = paramContext.getDimensionPixelOffset(i.C1, -1);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AlertController.RecycleListView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */