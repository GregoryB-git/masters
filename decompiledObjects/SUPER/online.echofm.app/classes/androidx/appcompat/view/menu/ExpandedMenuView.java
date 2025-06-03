package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import l.X;

public final class ExpandedMenuView
  extends ListView
  implements d.b, h, AdapterView.OnItemClickListener
{
  public static final int[] q = { 16842964, 16843049 };
  public d o;
  public int p;
  
  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842868);
  }
  
  public ExpandedMenuView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    setOnItemClickListener(this);
    paramContext = X.s(paramContext, paramAttributeSet, q, paramInt, 0);
    if (paramContext.p(0)) {
      setBackgroundDrawable(paramContext.f(0));
    }
    if (paramContext.p(1)) {
      setDivider(paramContext.f(1));
    }
    paramContext.t();
  }
  
  public boolean a(e parame)
  {
    return o.H(parame, 0);
  }
  
  public int getWindowAnimations()
  {
    return p;
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    setChildrenDrawingCacheEnabled(false);
  }
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    a((e)getAdapter().getItem(paramInt));
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.ExpandedMenuView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */