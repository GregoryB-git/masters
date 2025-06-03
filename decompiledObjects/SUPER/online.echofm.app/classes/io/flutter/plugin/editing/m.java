package io.flutter.plugin.editing;

import D5.w.e;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;
import t5.b;

public class m
  extends SpannableStringBuilder
{
  public int o = 0;
  public int p = 0;
  public ArrayList q = new ArrayList();
  public ArrayList r = new ArrayList();
  public ArrayList s = new ArrayList();
  public String t;
  public String u;
  public int v;
  public int w;
  public int x;
  public int y;
  public BaseInputConnection z = new a(paramView, true, this);
  
  public m(w.e parame, View paramView)
  {
    if (parame != null) {
      n(parame);
    }
  }
  
  public void a(b paramb)
  {
    if (p > 0)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("adding a listener ");
      ((StringBuilder)localObject).append(paramb.toString());
      ((StringBuilder)localObject).append(" in a listener callback");
      b.b("ListenableEditingState", ((StringBuilder)localObject).toString());
    }
    if (o > 0) {
      b.g("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
    }
    for (Object localObject = r;; localObject = q)
    {
      ((ArrayList)localObject).add(paramb);
      break;
    }
  }
  
  public void b()
  {
    o += 1;
    if (p > 0) {
      b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
    }
    if ((o == 1) && (!q.isEmpty()))
    {
      u = toString();
      v = i();
      w = h();
      x = g();
      y = f();
    }
  }
  
  public void c()
  {
    s.clear();
  }
  
  public void d()
  {
    int i = o;
    if (i == 0)
    {
      b.b("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
      return;
    }
    if (i == 1)
    {
      Object localObject = r.iterator();
      while (((Iterator)localObject).hasNext()) {
        j((b)((Iterator)localObject).next(), true, true, true);
      }
      if (!q.isEmpty())
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("didFinishBatchEdit with ");
        ((StringBuilder)localObject).append(String.valueOf(q.size()));
        ((StringBuilder)localObject).append(" listener(s)");
        b.f("ListenableEditingState", ((StringBuilder)localObject).toString());
        boolean bool1 = toString().equals(u);
        int j = v;
        i = i();
        boolean bool2 = false;
        boolean bool3;
        if ((j == i) && (w == h())) {
          bool3 = false;
        } else {
          bool3 = true;
        }
        if ((x != g()) || (y != f())) {
          bool2 = true;
        }
        k(bool1 ^ true, bool3, bool2);
      }
    }
    q.addAll(r);
    r.clear();
    o -= 1;
  }
  
  public ArrayList e()
  {
    ArrayList localArrayList = new ArrayList(s);
    s.clear();
    return localArrayList;
  }
  
  public final int f()
  {
    return BaseInputConnection.getComposingSpanEnd(this);
  }
  
  public final int g()
  {
    return BaseInputConnection.getComposingSpanStart(this);
  }
  
  public final int h()
  {
    return Selection.getSelectionEnd(this);
  }
  
  public final int i()
  {
    return Selection.getSelectionStart(this);
  }
  
  public final void j(b paramb, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    p += 1;
    paramb.a(paramBoolean1, paramBoolean2, paramBoolean3);
    p -= 1;
  }
  
  public final void k(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if ((paramBoolean1) || (paramBoolean2) || (paramBoolean3))
    {
      Iterator localIterator = q.iterator();
      while (localIterator.hasNext()) {
        j((b)localIterator.next(), paramBoolean1, paramBoolean2, paramBoolean3);
      }
    }
  }
  
  public void l(b paramb)
  {
    if (p > 0)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("removing a listener ");
      localStringBuilder.append(paramb.toString());
      localStringBuilder.append(" in a listener callback");
      b.b("ListenableEditingState", localStringBuilder.toString());
    }
    q.remove(paramb);
    if (o > 0) {
      r.remove(paramb);
    }
  }
  
  public void m(int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= 0) && (paramInt1 < paramInt2)) {
      z.setComposingRegion(paramInt1, paramInt2);
    } else {
      BaseInputConnection.removeComposingSpans(this);
    }
  }
  
  public void n(w.e parame)
  {
    b();
    replace(0, length(), a);
    if (parame.c()) {
      Selection.setSelection(this, b, c);
    } else {
      Selection.removeSelection(this);
    }
    m(d, e);
    c();
    d();
  }
  
  public SpannableStringBuilder replace(int paramInt1, int paramInt2, CharSequence paramCharSequence, int paramInt3, int paramInt4)
  {
    if (p > 0) {
      b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
    }
    String str = toString();
    int i = paramInt2 - paramInt1;
    boolean bool1;
    if (i != paramInt4 - paramInt3) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    for (int j = 0; (j < i) && (!bool1); j++)
    {
      boolean bool2;
      if (charAt(paramInt1 + j) != paramCharSequence.charAt(paramInt3 + j)) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      bool1 |= bool2;
    }
    if (bool1) {
      t = null;
    }
    int m = i();
    j = h();
    int k = g();
    i = f();
    SpannableStringBuilder localSpannableStringBuilder = super.replace(paramInt1, paramInt2, paramCharSequence, paramInt3, paramInt4);
    s.add(new o(str, paramInt1, paramInt2, paramCharSequence, i(), h(), g(), f()));
    if (o > 0) {
      return localSpannableStringBuilder;
    }
    boolean bool3;
    if ((i() == m) && (h() == j)) {
      bool3 = false;
    } else {
      bool3 = true;
    }
    boolean bool4;
    if ((g() == k) && (f() == i)) {
      bool4 = false;
    } else {
      bool4 = true;
    }
    k(bool1, bool3, bool4);
    return localSpannableStringBuilder;
  }
  
  public void setSpan(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    super.setSpan(paramObject, paramInt1, paramInt2, paramInt3);
    s.add(new o(toString(), i(), h(), g(), f()));
  }
  
  public String toString()
  {
    String str = t;
    if (str == null)
    {
      str = super.toString();
      t = str;
    }
    return str;
  }
  
  public class a
    extends BaseInputConnection
  {
    public a(View paramView, boolean paramBoolean, Editable paramEditable)
    {
      super(paramBoolean);
    }
    
    public Editable getEditable()
    {
      return jdField_this;
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.editing.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */