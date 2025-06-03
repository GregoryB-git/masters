package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import b.a0;

public class AlertController$RecycleListView
  extends ListView
{
  public final int a;
  public final int b;
  
  public AlertController$RecycleListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a0.G);
    b = paramContext.getDimensionPixelOffset(0, -1);
    a = paramContext.getDimensionPixelOffset(1, -1);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AlertController.RecycleListView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */