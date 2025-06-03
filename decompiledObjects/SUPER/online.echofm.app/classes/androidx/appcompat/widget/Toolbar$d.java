package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import j.b;

public class Toolbar$d
  implements g
{
  public d o;
  public e p;
  
  public Toolbar$d(Toolbar paramToolbar) {}
  
  public void b(d paramd, boolean paramBoolean) {}
  
  public void c(Context paramContext, d paramd)
  {
    paramContext = o;
    if (paramContext != null)
    {
      e locale = p;
      if (locale != null) {
        paramContext.e(locale);
      }
    }
    o = paramd;
  }
  
  public boolean e(j paramj)
  {
    return false;
  }
  
  public void f(boolean paramBoolean)
  {
    if (p != null)
    {
      d locald = o;
      if (locald != null)
      {
        int i = locald.size();
        for (int j = 0; j < i; j++) {
          if (o.getItem(j) == p) {
            return;
          }
        }
      }
      h(o, p);
    }
  }
  
  public boolean g()
  {
    return false;
  }
  
  public boolean h(d paramd, e parame)
  {
    paramd = q.w;
    if ((paramd instanceof b)) {
      ((b)paramd).c();
    }
    paramd = q;
    paramd.removeView(w);
    paramd = q;
    paramd.removeView(v);
    paramd = q;
    w = null;
    paramd.a();
    p = null;
    q.requestLayout();
    parame.q(false);
    return true;
  }
  
  public boolean j(d paramd, e parame)
  {
    q.e();
    paramd = q.v.getParent();
    Object localObject = q;
    if (paramd != localObject)
    {
      if ((paramd instanceof ViewGroup)) {
        ((ViewGroup)paramd).removeView(v);
      }
      paramd = q;
      paramd.addView(v);
    }
    q.w = parame.getActionView();
    p = parame;
    localObject = q.w.getParent();
    paramd = q;
    if (localObject != paramd)
    {
      if ((localObject instanceof ViewGroup)) {
        ((ViewGroup)localObject).removeView(w);
      }
      paramd = q.k();
      localObject = q;
      a = (B & 0x70 | 0x800003);
      b = 2;
      w.setLayoutParams(paramd);
      paramd = q;
      paramd.addView(w);
    }
    q.B();
    q.requestLayout();
    parame.q(true);
    paramd = q.w;
    if ((paramd instanceof b)) {
      ((b)paramd).b();
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.Toolbar.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */