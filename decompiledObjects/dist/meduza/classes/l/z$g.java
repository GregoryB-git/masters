package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.SpinnerAdapter;
import e0.d0;
import java.util.WeakHashMap;

public final class z$g
  extends n0
  implements z.i
{
  public CharSequence K;
  public ListAdapter L;
  public final Rect M = new Rect();
  public int N;
  
  public z$g(z paramz, Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt, 0);
    w = paramz;
    F = true;
    G.setFocusable(true);
    x = new a();
  }
  
  public final CharSequence e()
  {
    return K;
  }
  
  public final void i(CharSequence paramCharSequence)
  {
    K = paramCharSequence;
  }
  
  public final void l(int paramInt)
  {
    N = paramInt;
  }
  
  public final void m(int paramInt1, int paramInt2)
  {
    boolean bool = a();
    r();
    G.setInputMethodMode(2);
    show();
    Object localObject = c;
    ((AbsListView)localObject).setChoiceMode(1);
    z.c.d((View)localObject, paramInt1);
    z.c.c((View)localObject, paramInt2);
    paramInt1 = O.getSelectedItemPosition();
    localObject = c;
    if ((a()) && (localObject != null))
    {
      ((j0)localObject).setListSelectionHidden(false);
      ((AdapterView)localObject).setSelection(paramInt1);
      if (((AbsListView)localObject).getChoiceMode() != 0) {
        ((AbsListView)localObject).setItemChecked(paramInt1, true);
      }
    }
    if (bool) {
      return;
    }
    localObject = O.getViewTreeObserver();
    if (localObject != null)
    {
      final b localb = new b();
      ((ViewTreeObserver)localObject).addOnGlobalLayoutListener(localb);
      localObject = new c(localb);
      G.setOnDismissListener((PopupWindow.OnDismissListener)localObject);
    }
  }
  
  public final void o(ListAdapter paramListAdapter)
  {
    super.o(paramListAdapter);
    L = paramListAdapter;
  }
  
  public final void r()
  {
    Object localObject = g();
    int i = 0;
    if (localObject != null)
    {
      ((Drawable)localObject).getPadding(O.p);
      if (f1.a(O)) {
        i = O.p.right;
      } else {
        i = -O.p.left;
      }
    }
    else
    {
      localObject = O.p;
      right = 0;
      left = 0;
    }
    int j = O.getPaddingLeft();
    int k = O.getPaddingRight();
    int m = O.getWidth();
    localObject = O;
    int n = o;
    if (n == -2)
    {
      int i1 = ((z)localObject).a((SpinnerAdapter)L, g());
      n = O.getContext().getResources().getDisplayMetrics().widthPixels;
      localObject = O.p;
      int i2 = n - left - right;
      n = i1;
      if (i1 > i2) {
        n = i2;
      }
      n = Math.max(n, m - j - k);
    }
    else
    {
      if (n != -1) {
        break label237;
      }
      n = m - j - k;
    }
    q(n);
    break label243;
    label237:
    q(n);
    label243:
    if (f1.a(O)) {
      i = m - k - e - N + i;
    } else {
      i = j + N + i;
    }
    f = i;
  }
  
  public final class a
    implements AdapterView.OnItemClickListener
  {
    public a() {}
    
    public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
    {
      O.setSelection(paramInt);
      if (O.getOnItemClickListener() != null)
      {
        paramAdapterView = z.g.this;
        O.performItemClick(paramView, paramInt, L.getItemId(paramInt));
      }
      dismiss();
    }
  }
  
  public final class b
    implements ViewTreeObserver.OnGlobalLayoutListener
  {
    public b() {}
    
    public final void onGlobalLayout()
    {
      z.g localg = z.g.this;
      z localz = O;
      localg.getClass();
      WeakHashMap localWeakHashMap = d0.a;
      int i;
      if ((localz.isAttachedToWindow()) && (localz.getGlobalVisibleRect(M))) {
        i = 1;
      } else {
        i = 0;
      }
      if (i == 0)
      {
        dismiss();
      }
      else
      {
        r();
        show();
      }
    }
  }
  
  public final class c
    implements PopupWindow.OnDismissListener
  {
    public c(z.g.b paramb) {}
    
    public final void onDismiss()
    {
      ViewTreeObserver localViewTreeObserver = O.getViewTreeObserver();
      if (localViewTreeObserver != null) {
        localViewTreeObserver.removeGlobalOnLayoutListener(localb);
      }
    }
  }
}

/* Location:
 * Qualified Name:     l.z.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */