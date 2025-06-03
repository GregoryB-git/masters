package io.flutter.plugin.editing;

import D5.w.b;
import D5.w.b.a;
import D5.w.c;
import D5.w.d;
import D5.w.e;
import D5.w.f;
import D5.w.g;
import O1.J;
import O1.K;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import java.util.ArrayList;
import java.util.HashMap;
import u5.L;

public class C
  implements m.b
{
  public final View a;
  public final InputMethodManager b;
  public final AutofillManager c;
  public final D5.w d;
  public c e = new c(C.c.a.o, 0);
  public w.b f;
  public SparseArray g;
  public m h;
  public boolean i;
  public InputConnection j;
  public io.flutter.plugin.platform.r k;
  public Rect l;
  public ImeSyncDeferringInsetsCallback m;
  public w.e n;
  public boolean o;
  
  public C(View paramView, D5.w paramw, io.flutter.plugin.platform.r paramr)
  {
    a = paramView;
    AutofillManager localAutofillManager = null;
    h = new m(null, paramView);
    b = ((InputMethodManager)paramView.getContext().getSystemService("input_method"));
    int i1 = Build.VERSION.SDK_INT;
    if (i1 >= 26) {
      localAutofillManager = K.a(paramView.getContext().getSystemService(J.a()));
    }
    c = localAutofillManager;
    if (i1 >= 30)
    {
      paramView = new ImeSyncDeferringInsetsCallback(paramView);
      m = paramView;
      paramView.install();
    }
    d = paramw;
    paramw.n(new a());
    paramw.k();
    k = paramr;
    paramr.v(this);
  }
  
  public static boolean l(w.e parame1, w.e parame2)
  {
    int i1 = e - d;
    if (i1 != e - d) {
      return true;
    }
    for (int i2 = 0; i2 < i1; i2++) {
      if (a.charAt(d + i2) != a.charAt(d + i2)) {
        return true;
      }
    }
    return false;
  }
  
  public static int r(w.c paramc, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, w.d paramd)
  {
    w.g localg = a;
    if (localg == w.g.q) {
      return 4;
    }
    int i1;
    if (localg == w.g.t)
    {
      if (b) {
        i1 = 4098;
      } else {
        i1 = 2;
      }
      i2 = i1;
      if (c) {
        i2 = i1 | 0x2000;
      }
      return i2;
    }
    if (localg == w.g.u) {
      return 3;
    }
    if (localg == w.g.z) {
      return 0;
    }
    if (localg == w.g.v) {
      i1 = 131073;
    } else if (localg == w.g.w) {
      i1 = 33;
    } else if (localg == w.g.x) {
      i1 = 17;
    } else if (localg == w.g.y) {
      i1 = 145;
    } else if (localg == w.g.r) {
      i1 = 97;
    } else if (localg == w.g.s) {
      i1 = 113;
    } else {
      i1 = 1;
    }
    if (paramBoolean1) {}
    int i3;
    for (int i2 = 524416;; i2 = i3)
    {
      i3 = i1 | i2;
      break;
      i2 = i1;
      if (paramBoolean2) {
        i2 = i1 | 0x8000;
      }
      i3 = i2;
      if (paramBoolean3) {
        break;
      }
      i3 = 524432;
      i1 = i2;
    }
    if (paramd == w.d.p)
    {
      i1 = i3 | 0x1000;
    }
    else if (paramd == w.d.q)
    {
      i1 = i3 | 0x2000;
    }
    else
    {
      i1 = i3;
      if (paramd == w.d.r) {
        i1 = i3 | 0x4000;
      }
    }
    return i1;
  }
  
  public final void A(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      a.requestFocus();
      e = new c(C.c.a.q, paramInt);
      b.restartInput(a);
      i = false;
    }
    else
    {
      e = new c(C.c.a.r, paramInt);
      j = null;
    }
  }
  
  public void B(int paramInt, w.b paramb)
  {
    w();
    f = paramb;
    e = new c(C.c.a.p, paramInt);
    h.l(this);
    Object localObject = j;
    if (localObject != null) {
      localObject = c;
    } else {
      localObject = null;
    }
    h = new m((w.e)localObject, a);
    F(paramb);
    i = true;
    E();
    l = null;
    h.a(this);
  }
  
  public void C(View paramView, w.e parame)
  {
    if (!i)
    {
      w.e locale = n;
      if ((locale != null) && (locale.b()))
      {
        boolean bool = l(n, parame);
        i = bool;
        if (bool) {
          t5.b.e("TextInputPlugin", "Composing region changed by the framework. Restarting the input method.");
        }
      }
    }
    n = parame;
    h.n(parame);
    if (i)
    {
      b.restartInput(paramView);
      i = false;
    }
  }
  
  public void D(View paramView)
  {
    Object localObject = f;
    if (localObject != null)
    {
      localObject = g;
      if ((localObject != null) && (a == w.g.z))
      {
        q(paramView);
        return;
      }
    }
    paramView.requestFocus();
    b.showSoftInput(paramView, 0);
  }
  
  public void E()
  {
    if (e.a == C.c.a.q) {
      o = false;
    }
  }
  
  public final void F(w.b paramb)
  {
    if (Build.VERSION.SDK_INT < 26) {
      return;
    }
    if ((paramb != null) && (j != null))
    {
      w.b[] arrayOfb = l;
      Object localObject = new SparseArray();
      g = ((SparseArray)localObject);
      if (arrayOfb == null)
      {
        ((SparseArray)localObject).put(j.a.hashCode(), paramb);
      }
      else
      {
        int i1 = arrayOfb.length;
        for (int i2 = 0; i2 < i1; i2++)
        {
          paramb = arrayOfb[i2];
          localObject = j;
          if (localObject != null)
          {
            g.put(a.hashCode(), paramb);
            q.a(c, a, a.hashCode(), v.a(c.a));
          }
        }
      }
      return;
    }
    g = null;
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramBoolean1) {
      u(h.toString());
    }
    int i1 = h.i();
    int i2 = h.h();
    int i3 = h.g();
    int i4 = h.f();
    ArrayList localArrayList = h.e();
    if (n != null)
    {
      Object localObject;
      if (h.toString().equals(n.a))
      {
        localObject = n;
        if ((i1 == b) && (i2 == c) && (i3 == d) && (i4 == e)) {}
      }
      else
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("send EditingState to flutter: ");
        ((StringBuilder)localObject).append(h.toString());
        t5.b.f("TextInputPlugin", ((StringBuilder)localObject).toString());
        if (f.e)
        {
          d.q(e.b, localArrayList);
          h.c();
        }
        else
        {
          d.p(e.b, h.toString(), i1, i2, i3, i4);
        }
        n = new w.e(h.toString(), i1, i2, i3, i4);
        return;
      }
    }
    h.c();
  }
  
  public void j(SparseArray paramSparseArray)
  {
    if (Build.VERSION.SDK_INT < 26) {
      return;
    }
    Object localObject1 = f;
    if ((localObject1 != null) && (g != null))
    {
      w.b.a locala = j;
      if (locala != null)
      {
        localObject1 = new HashMap();
        for (int i1 = 0; i1 < paramSparseArray.size(); i1++)
        {
          int i2 = paramSparseArray.keyAt(i1);
          Object localObject2 = (w.b)g.get(i2);
          if (localObject2 != null)
          {
            localObject2 = j;
            if (localObject2 != null)
            {
              Object localObject3 = y.a(x.a(paramSparseArray.valueAt(i1))).toString();
              localObject3 = new w.e((String)localObject3, ((String)localObject3).length(), ((String)localObject3).length(), -1, -1);
              if (a.equals(a)) {
                h.n((w.e)localObject3);
              } else {
                ((HashMap)localObject1).put(a, localObject3);
              }
            }
          }
        }
        d.r(e.b, (HashMap)localObject1);
      }
    }
  }
  
  public void k()
  {
    if (e.a == C.c.a.q) {
      return;
    }
    h.l(this);
    w();
    f = null;
    F(null);
    e = new c(C.c.a.o, 0);
    E();
    l = null;
    b.restartInput(a);
  }
  
  public InputConnection m(View paramView, L paramL, EditorInfo paramEditorInfo)
  {
    Object localObject1 = e;
    Object localObject2 = a;
    if (localObject2 == C.c.a.o)
    {
      j = null;
      return null;
    }
    if (localObject2 == C.c.a.r) {
      return null;
    }
    if (localObject2 == C.c.a.q)
    {
      if (o) {
        return j;
      }
      paramView = k.c(b).onCreateInputConnection(paramEditorInfo);
      j = paramView;
      return paramView;
    }
    localObject1 = f;
    int i1 = r(g, a, b, c, d, f);
    inputType = i1;
    imeOptions = 33554432;
    if ((Build.VERSION.SDK_INT >= 26) && (!f.d)) {
      imeOptions = (0x2000000 | 0x1000000);
    }
    localObject1 = f.h;
    if (localObject1 == null)
    {
      if ((i1 & 0x20000) != 0) {
        i1 = 1;
      } else {
        i1 = 6;
      }
    }
    else {
      i1 = ((Integer)localObject1).intValue();
    }
    localObject1 = f;
    localObject2 = i;
    if (localObject2 != null)
    {
      actionLabel = ((CharSequence)localObject2);
      actionId = i1;
    }
    imeOptions = (i1 | imeOptions);
    localObject1 = k;
    if (localObject1 != null) {
      K.b.a(paramEditorInfo, (String[])localObject1);
    }
    paramView = new l(paramView, e.b, d, paramL, h, paramEditorInfo);
    initialSelStart = h.i();
    initialSelEnd = h.h();
    j = paramView;
    return paramView;
  }
  
  public void n()
  {
    k.G();
    d.n(null);
    w();
    h.l(this);
    ImeSyncDeferringInsetsCallback localImeSyncDeferringInsetsCallback = m;
    if (localImeSyncDeferringInsetsCallback != null) {
      localImeSyncDeferringInsetsCallback.remove();
    }
  }
  
  public InputMethodManager o()
  {
    return b;
  }
  
  public boolean p(KeyEvent paramKeyEvent)
  {
    if (o().isAcceptingText())
    {
      InputConnection localInputConnection = j;
      if (localInputConnection != null)
      {
        boolean bool;
        if ((localInputConnection instanceof l)) {
          bool = ((l)localInputConnection).f(paramKeyEvent);
        } else {
          bool = localInputConnection.sendKeyEvent(paramKeyEvent);
        }
        return bool;
      }
    }
    return false;
  }
  
  public final void q(View paramView)
  {
    w();
    b.hideSoftInputFromWindow(paramView.getApplicationWindowToken(), 0);
  }
  
  public void s()
  {
    if (e.a == C.c.a.q) {
      o = true;
    }
  }
  
  public final boolean t()
  {
    boolean bool;
    if (g != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void u(String paramString)
  {
    if ((Build.VERSION.SDK_INT >= 26) && (c != null) && (t()))
    {
      String str = f.j.a;
      q.a(c, a, str.hashCode(), v.a(paramString));
    }
  }
  
  public final void v()
  {
    if ((Build.VERSION.SDK_INT >= 26) && (c != null) && (t()))
    {
      String str = f.j.a;
      int[] arrayOfInt = new int[2];
      a.getLocationOnScreen(arrayOfInt);
      Rect localRect = new Rect(l);
      localRect.offset(arrayOfInt[0], arrayOfInt[1]);
      z.a(c, a, str.hashCode(), localRect);
    }
  }
  
  public final void w()
  {
    if ((Build.VERSION.SDK_INT >= 26) && (c != null))
    {
      Object localObject = f;
      if ((localObject != null) && (j != null) && (t()))
      {
        localObject = f.j.a;
        p.a(c, a, ((String)localObject).hashCode());
      }
    }
  }
  
  public void x(ViewStructure paramViewStructure, int paramInt)
  {
    if ((Build.VERSION.SDK_INT >= 26) && (t()))
    {
      String str = f.j.a;
      AutofillId localAutofillId = r.a(paramViewStructure);
      for (paramInt = 0; paramInt < g.size(); paramInt++)
      {
        int i1 = g.keyAt(paramInt);
        Object localObject1 = g.valueAt(paramInt)).j;
        if (localObject1 != null)
        {
          paramViewStructure.addChildCount(1);
          ViewStructure localViewStructure = paramViewStructure.newChild(paramInt);
          s.a(localViewStructure, localAutofillId, i1);
          Object localObject2 = b;
          if (localObject2.length > 0) {
            t.a(localViewStructure, (String[])localObject2);
          }
          u.a(localViewStructure, 1);
          localViewStructure.setVisibility(0);
          localObject2 = d;
          if (localObject2 != null) {
            localViewStructure.setHint((CharSequence)localObject2);
          }
          if (str.hashCode() == i1)
          {
            localObject2 = l;
            if (localObject2 != null) {
              localViewStructure.setDimens(left, top, 0, 0, ((Rect)localObject2).width(), l.height());
            }
          }
          for (localObject1 = h;; localObject1 = c.a)
          {
            w.a(localViewStructure, v.a((CharSequence)localObject1));
            break;
            localViewStructure.setDimens(0, 0, 0, 0, 1, 1);
          }
        }
      }
    }
  }
  
  public final void y(double paramDouble1, double paramDouble2, final double[] paramArrayOfDouble)
  {
    final double[] arrayOfDouble = new double[4];
    final boolean bool;
    if ((paramArrayOfDouble[3] == 0.0D) && (paramArrayOfDouble[7] == 0.0D) && (paramArrayOfDouble[15] == 1.0D)) {
      bool = true;
    } else {
      bool = false;
    }
    double d1 = paramArrayOfDouble[12];
    double d2 = paramArrayOfDouble[15];
    d1 /= d2;
    arrayOfDouble[1] = d1;
    arrayOfDouble[0] = d1;
    d2 = paramArrayOfDouble[13] / d2;
    arrayOfDouble[3] = d2;
    arrayOfDouble[2] = d2;
    paramArrayOfDouble = new b(bool, paramArrayOfDouble, arrayOfDouble);
    paramArrayOfDouble.a(paramDouble1, 0.0D);
    paramArrayOfDouble.a(paramDouble1, paramDouble2);
    paramArrayOfDouble.a(0.0D, paramDouble2);
    float f1 = a.getContext().getResources().getDisplayMetrics().density;
    paramDouble1 = arrayOfDouble[0];
    paramDouble2 = f1;
    l = new Rect((int)(paramDouble1 * paramDouble2), (int)(arrayOfDouble[2] * paramDouble2), (int)Math.ceil(arrayOfDouble[1] * paramDouble2), (int)Math.ceil(arrayOfDouble[3] * paramDouble2));
  }
  
  public void z(String paramString, Bundle paramBundle)
  {
    b.sendAppPrivateCommand(a, paramString, paramBundle);
  }
  
  public class a
    implements w.f
  {
    public a() {}
    
    public void a()
    {
      C localC = C.this;
      localC.D(C.b(localC));
    }
    
    public void b()
    {
      k();
    }
    
    public void c(String paramString, Bundle paramBundle)
    {
      z(paramString, paramBundle);
    }
    
    public void d(int paramInt, boolean paramBoolean)
    {
      C.h(C.this, paramInt, paramBoolean);
    }
    
    public void e(double paramDouble1, double paramDouble2, double[] paramArrayOfDouble)
    {
      C.i(C.this, paramDouble1, paramDouble2, paramArrayOfDouble);
    }
    
    public void f()
    {
      C.f(C.this);
    }
    
    public void g(int paramInt, w.b paramb)
    {
      B(paramInt, paramb);
    }
    
    public void h(w.e parame)
    {
      C localC = C.this;
      localC.C(C.b(localC), parame);
    }
    
    public void i(boolean paramBoolean)
    {
      if ((Build.VERSION.SDK_INT >= 26) && (C.g(C.this) != null)) {
        if (paramBoolean) {
          A.a(C.g(C.this));
        } else {
          B.a(C.g(C.this));
        }
      }
    }
    
    public void j()
    {
      if (ca == C.c.a.r)
      {
        C.d(C.this);
      }
      else
      {
        C localC = C.this;
        C.e(localC, C.b(localC));
      }
    }
  }
  
  public class b
    implements C.d
  {
    public b(boolean paramBoolean, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2) {}
    
    public void a(double paramDouble1, double paramDouble2)
    {
      boolean bool = bool;
      double d1 = 1.0D;
      if (!bool)
      {
        arrayOfDouble = paramArrayOfDouble;
        d1 = 1.0D / (arrayOfDouble[3] * paramDouble1 + arrayOfDouble[7] * paramDouble2 + arrayOfDouble[15]);
      }
      double[] arrayOfDouble = paramArrayOfDouble;
      double d2 = (arrayOfDouble[0] * paramDouble1 + arrayOfDouble[4] * paramDouble2 + arrayOfDouble[12]) * d1;
      paramDouble1 = (arrayOfDouble[1] * paramDouble1 + arrayOfDouble[5] * paramDouble2 + arrayOfDouble[13]) * d1;
      arrayOfDouble = arrayOfDouble;
      if (d2 < arrayOfDouble[0]) {
        arrayOfDouble[0] = d2;
      } else if (d2 > arrayOfDouble[1]) {
        arrayOfDouble[1] = d2;
      }
      if (paramDouble1 < arrayOfDouble[2]) {
        arrayOfDouble[2] = paramDouble1;
      } else if (paramDouble1 > arrayOfDouble[3]) {
        arrayOfDouble[3] = paramDouble1;
      }
    }
  }
  
  public static class c
  {
    public a a;
    public int b;
    
    public c(a parama, int paramInt)
    {
      a = parama;
      b = paramInt;
    }
    
    public static enum a {}
  }
  
  public static abstract interface d
  {
    public abstract void a(double paramDouble1, double paramDouble2);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.editing.C
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */