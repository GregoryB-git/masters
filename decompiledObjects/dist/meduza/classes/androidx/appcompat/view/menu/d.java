package androidx.appcompat.view.menu;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController.b;
import androidx.appcompat.app.b;
import androidx.appcompat.app.b.a;
import java.util.ArrayList;

public final class d
  implements j, AdapterView.OnItemClickListener
{
  public Context a;
  public LayoutInflater b;
  public f c;
  public ExpandedMenuView d;
  public j.a e;
  public a f;
  
  public d(Context paramContext)
  {
    a = paramContext;
    b = LayoutInflater.from(paramContext);
  }
  
  public final void b(f paramf, boolean paramBoolean)
  {
    j.a locala = e;
    if (locala != null) {
      locala.b(paramf, paramBoolean);
    }
  }
  
  public final boolean c()
  {
    return false;
  }
  
  public final void d(j.a parama)
  {
    e = parama;
  }
  
  public final boolean e(h paramh)
  {
    return false;
  }
  
  public final void f(Context paramContext, f paramf)
  {
    if (a != null)
    {
      a = paramContext;
      if (b == null) {
        b = LayoutInflater.from(paramContext);
      }
    }
    c = paramf;
    paramContext = f;
    if (paramContext != null) {
      paramContext.notifyDataSetChanged();
    }
  }
  
  public final void g()
  {
    a locala = f;
    if (locala != null) {
      locala.notifyDataSetChanged();
    }
  }
  
  public final boolean i(m paramm)
  {
    if (!paramm.hasVisibleItems()) {
      return false;
    }
    Object localObject1 = new g(paramm);
    Object localObject2 = new b.a(a);
    Object localObject3 = new d(((b.a)localObject2).getContext());
    c = ((d)localObject3);
    e = ((j.a)localObject1);
    Object localObject4 = a;
    ((f)localObject4).b((j)localObject3, a);
    localObject4 = c;
    if (f == null) {
      f = new a((d)localObject4);
    }
    localObject3 = f;
    localObject4 = a;
    m = ((ListAdapter)localObject3);
    n = ((DialogInterface.OnClickListener)localObject1);
    localObject3 = o;
    if (localObject3 != null)
    {
      e = ((View)localObject3);
    }
    else
    {
      c = n;
      ((b.a)localObject2).setTitle(m);
    }
    a.l = ((DialogInterface.OnKeyListener)localObject1);
    localObject2 = ((b.a)localObject2).create();
    b = ((b)localObject2);
    ((Dialog)localObject2).setOnDismissListener((DialogInterface.OnDismissListener)localObject1);
    localObject2 = b.getWindow().getAttributes();
    type = 1003;
    flags |= 0x20000;
    b.show();
    localObject1 = e;
    if (localObject1 != null) {
      ((j.a)localObject1).c(paramm);
    }
    return true;
  }
  
  public final boolean j(h paramh)
  {
    return false;
  }
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    c.q(f.c(paramInt), this, 0);
  }
  
  public final class a
    extends BaseAdapter
  {
    public int a = -1;
    
    public a()
    {
      b();
    }
    
    public final void b()
    {
      Object localObject = c;
      h localh = w;
      if (localh != null)
      {
        ((f)localObject).i();
        localObject = j;
        int i = ((ArrayList)localObject).size();
        for (int j = 0; j < i; j++) {
          if ((h)((ArrayList)localObject).get(j) == localh)
          {
            a = j;
            return;
          }
        }
      }
      a = -1;
    }
    
    public final h c(int paramInt)
    {
      Object localObject = c;
      ((f)localObject).i();
      localObject = j;
      getClass();
      int i = paramInt + 0;
      int j = a;
      paramInt = i;
      if (j >= 0)
      {
        paramInt = i;
        if (i >= j) {
          paramInt = i + 1;
        }
      }
      return (h)((ArrayList)localObject).get(paramInt);
    }
    
    public final int getCount()
    {
      f localf = c;
      localf.i();
      int i = j.size();
      getClass();
      i += 0;
      if (a < 0) {
        return i;
      }
      return i - 1;
    }
    
    public final long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      View localView = paramView;
      if (paramView == null) {
        localView = b.inflate(2131558416, paramViewGroup, false);
      }
      ((k.a)localView).c(c(paramInt));
      return localView;
    }
    
    public final void notifyDataSetChanged()
    {
      b();
      super.notifyDataSetChanged();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */