package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import x6.b;

public final class ExpandedMenuView
  extends ListView
  implements f.b, k, AdapterView.OnItemClickListener
{
  public static final int[] b = { 16842964, 16843049 };
  public f a;
  
  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOnItemClickListener(this);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, b, 16842868, 0);
    int i;
    if (localTypedArray.hasValue(0))
    {
      if (localTypedArray.hasValue(0))
      {
        i = localTypedArray.getResourceId(0, 0);
        if (i != 0)
        {
          paramAttributeSet = b.X(paramContext, i);
          break label68;
        }
      }
      paramAttributeSet = localTypedArray.getDrawable(0);
      label68:
      setBackgroundDrawable(paramAttributeSet);
    }
    if (localTypedArray.hasValue(1))
    {
      if (localTypedArray.hasValue(1))
      {
        i = localTypedArray.getResourceId(1, 0);
        if (i != 0)
        {
          paramContext = b.X(paramContext, i);
          break label118;
        }
      }
      paramContext = localTypedArray.getDrawable(1);
      label118:
      setDivider(paramContext);
    }
    localTypedArray.recycle();
  }
  
  public final boolean a(h paramh)
  {
    return a.q(paramh, null, 0);
  }
  
  public final void b(f paramf)
  {
    a = paramf;
  }
  
  public int getWindowAnimations()
  {
    return 0;
  }
  
  public final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    setChildrenDrawingCacheEnabled(false);
  }
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    a((h)getAdapter().getItem(paramInt));
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.ExpandedMenuView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */