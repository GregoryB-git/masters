package androidx.fragment.app;

import U.b;
import android.app.Activity;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.l;
import java.util.Iterator;
import java.util.List;

public class t
{
  public final m a;
  public final u b;
  public final Fragment c;
  public boolean d = false;
  public int e = -1;
  
  public t(m paramm, u paramu, Fragment paramFragment)
  {
    a = paramm;
    b = paramu;
    c = paramFragment;
  }
  
  public t(m paramm, u paramu, Fragment paramFragment, s params)
  {
    a = paramm;
    b = paramu;
    c = paramFragment;
    q = null;
    r = null;
    F = 0;
    C = false;
    z = false;
    paramm = v;
    if (paramm != null) {
      paramm = t;
    } else {
      paramm = null;
    }
    w = paramm;
    v = null;
    paramm = A;
    if (paramm != null) {}
    for (;;)
    {
      p = paramm;
      break;
      paramm = new Bundle();
    }
  }
  
  public t(m paramm, u paramu, ClassLoader paramClassLoader, j paramj, s params)
  {
    a = paramm;
    b = paramu;
    paramu = paramj.a(paramClassLoader, o);
    c = paramu;
    paramm = x;
    if (paramm != null) {
      paramm.setClassLoader(paramClassLoader);
    }
    paramu.w1(x);
    t = p;
    B = q;
    D = true;
    K = r;
    L = s;
    M = t;
    P = u;
    A = v;
    O = w;
    N = y;
    f0 = androidx.lifecycle.d.c.values()[z];
    paramm = A;
    if (paramm != null) {}
    for (;;)
    {
      p = paramm;
      break;
      paramm = new Bundle();
    }
    if (n.D0(2))
    {
      paramm = new StringBuilder();
      paramm.append("Instantiated fragment ");
      paramm.append(paramu);
      Log.v("FragmentManager", paramm.toString());
    }
  }
  
  public void a()
  {
    if (n.D0(3))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("moveto ACTIVITY_CREATED: ");
      ((StringBuilder)localObject).append(c);
      Log.d("FragmentManager", ((StringBuilder)localObject).toString());
    }
    Object localObject = c;
    ((Fragment)localObject).N0(p);
    localObject = a;
    Fragment localFragment = c;
    ((m)localObject).a(localFragment, p, false);
  }
  
  public void b()
  {
    int i = b.j(c);
    Fragment localFragment = c;
    U.addView(V, i);
  }
  
  public void c()
  {
    if (n.D0(3))
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("moveto ATTACHED: ");
      ((StringBuilder)localObject1).append(c);
      Log.d("FragmentManager", ((StringBuilder)localObject1).toString());
    }
    Fragment localFragment = c;
    Object localObject2 = v;
    Object localObject1 = null;
    if (localObject2 != null)
    {
      localObject1 = b.m(t);
      if (localObject1 != null)
      {
        localObject2 = c;
        w = v.t;
        v = null;
      }
      else
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("Fragment ");
        ((StringBuilder)localObject1).append(c);
        ((StringBuilder)localObject1).append(" declared target fragment ");
        ((StringBuilder)localObject1).append(c.v);
        ((StringBuilder)localObject1).append(" that does not belong to this FragmentManager!");
        throw new IllegalStateException(((StringBuilder)localObject1).toString());
      }
    }
    else
    {
      localObject2 = w;
      if (localObject2 != null)
      {
        localObject1 = b.m((String)localObject2);
        if (localObject1 == null)
        {
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("Fragment ");
          ((StringBuilder)localObject1).append(c);
          ((StringBuilder)localObject1).append(" declared target fragment ");
          ((StringBuilder)localObject1).append(c.w);
          ((StringBuilder)localObject1).append(" that does not belong to this FragmentManager!");
          throw new IllegalStateException(((StringBuilder)localObject1).toString());
        }
      }
    }
    if ((localObject1 != null) && ((n.P) || (ko < 1))) {
      ((t)localObject1).m();
    }
    localObject1 = c;
    H = G.s0();
    localObject1 = c;
    J = G.v0();
    a.g(c, false);
    c.O0();
    a.b(c, false);
  }
  
  public int d()
  {
    Object localObject = c;
    if (G == null) {
      return o;
    }
    int i = e;
    int j = b.a[f0.ordinal()];
    int k = i;
    if (j != 1) {
      if (j != 2)
      {
        if (j != 3)
        {
          if (j != 4) {
            k = Math.min(i, -1);
          } else {
            k = Math.min(i, 0);
          }
        }
        else {
          k = Math.min(i, 1);
        }
      }
      else {
        k = Math.min(i, 5);
      }
    }
    localObject = c;
    i = k;
    if (B) {
      if (C)
      {
        k = Math.max(e, 2);
        localObject = c.V;
        i = k;
        if (localObject != null)
        {
          i = k;
          if (((View)localObject).getParent() == null) {
            i = Math.min(k, 2);
          }
        }
      }
      else if (e < 4)
      {
        i = Math.min(k, o);
      }
      else
      {
        i = Math.min(k, 1);
      }
    }
    j = i;
    if (!c.z) {
      j = Math.min(i, 1);
    }
    if (n.P)
    {
      Fragment localFragment = c;
      localObject = U;
      if (localObject != null)
      {
        localObject = B.n((ViewGroup)localObject, localFragment.F()).l(this);
        break label248;
      }
    }
    localObject = null;
    label248:
    if (localObject == B.e.b.p)
    {
      k = Math.min(j, 6);
    }
    else if (localObject == B.e.b.q)
    {
      k = Math.max(j, 3);
    }
    else
    {
      localObject = c;
      k = j;
      if (A) {
        if (((Fragment)localObject).Y()) {
          k = Math.min(j, 1);
        } else {
          k = Math.min(j, -1);
        }
      }
    }
    localObject = c;
    i = k;
    if (W)
    {
      i = k;
      if (o < 5) {
        i = Math.min(k, 4);
      }
    }
    if (n.D0(2))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("computeExpectedState() of ");
      ((StringBuilder)localObject).append(i);
      ((StringBuilder)localObject).append(" for ");
      ((StringBuilder)localObject).append(c);
      Log.v("FragmentManager", ((StringBuilder)localObject).toString());
    }
    return i;
  }
  
  public void e()
  {
    if (n.D0(3))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("moveto CREATED: ");
      ((StringBuilder)localObject).append(c);
      Log.d("FragmentManager", ((StringBuilder)localObject).toString());
    }
    Object localObject = c;
    if (!e0)
    {
      a.h((Fragment)localObject, p, false);
      localObject = c;
      ((Fragment)localObject).R0(p);
      m localm = a;
      localObject = c;
      localm.c((Fragment)localObject, p, false);
    }
    else
    {
      ((Fragment)localObject).r1(p);
      c.o = 1;
    }
  }
  
  public void f()
  {
    if (c.B) {
      return;
    }
    if (n.D0(3))
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("moveto CREATE_VIEW: ");
      ((StringBuilder)localObject1).append(c);
      Log.d("FragmentManager", ((StringBuilder)localObject1).toString());
    }
    Object localObject1 = c;
    LayoutInflater localLayoutInflater = ((Fragment)localObject1).X0(p);
    Object localObject3 = c;
    localObject1 = U;
    int i;
    final Object localObject2;
    if (localObject1 == null)
    {
      i = L;
      if (i != 0)
      {
        if (i != -1)
        {
          localObject3 = (ViewGroup)G.n0().e(c.L);
          localObject1 = localObject3;
          if (localObject3 == null)
          {
            localObject1 = c;
            if (D)
            {
              localObject1 = localObject3;
            }
            else
            {
              try
              {
                localObject1 = ((Fragment)localObject1).I().getResourceName(c.L);
              }
              catch (Resources.NotFoundException localNotFoundException)
              {
                localObject2 = "unknown";
              }
              localObject3 = new StringBuilder();
              ((StringBuilder)localObject3).append("No view found for id 0x");
              ((StringBuilder)localObject3).append(Integer.toHexString(c.L));
              ((StringBuilder)localObject3).append(" (");
              ((StringBuilder)localObject3).append((String)localObject2);
              ((StringBuilder)localObject3).append(") for fragment ");
              ((StringBuilder)localObject3).append(c);
              throw new IllegalArgumentException(((StringBuilder)localObject3).toString());
            }
          }
        }
        else
        {
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("Cannot create fragment ");
          ((StringBuilder)localObject2).append(c);
          ((StringBuilder)localObject2).append(" for a container view with no id");
          throw new IllegalArgumentException(((StringBuilder)localObject2).toString());
        }
      }
      else {
        localObject2 = null;
      }
    }
    localObject3 = c;
    U = ((ViewGroup)localObject2);
    ((Fragment)localObject3).T0(localLayoutInflater, (ViewGroup)localObject2, p);
    localObject3 = c.V;
    if (localObject3 != null)
    {
      boolean bool1 = false;
      ((View)localObject3).setSaveFromParentEnabled(false);
      localObject3 = c;
      V.setTag(b.a, localObject3);
      if (localObject2 != null) {
        b();
      }
      localObject2 = c;
      if (N) {
        V.setVisibility(8);
      }
      if (I.s.t(c.V))
      {
        I.s.A(c.V);
      }
      else
      {
        localObject2 = c.V;
        ((View)localObject2).addOnAttachStateChangeListener(new a((View)localObject2));
      }
      c.k1();
      localObject2 = a;
      localObject3 = c;
      ((m)localObject2).m((Fragment)localObject3, V, p, false);
      i = c.V.getVisibility();
      float f = c.V.getAlpha();
      if (n.P)
      {
        c.C1(f);
        localObject2 = c;
        if ((U != null) && (i == 0))
        {
          localObject2 = V.findFocus();
          if (localObject2 != null)
          {
            c.x1((View)localObject2);
            if (n.D0(2))
            {
              localObject3 = new StringBuilder();
              ((StringBuilder)localObject3).append("requestFocus: Saved focused view ");
              ((StringBuilder)localObject3).append(localObject2);
              ((StringBuilder)localObject3).append(" for Fragment ");
              ((StringBuilder)localObject3).append(c);
              Log.v("FragmentManager", ((StringBuilder)localObject3).toString());
            }
          }
          c.V.setAlpha(0.0F);
        }
      }
      else
      {
        localObject2 = c;
        boolean bool2 = bool1;
        if (i == 0)
        {
          bool2 = bool1;
          if (U != null) {
            bool2 = true;
          }
        }
        a0 = bool2;
      }
    }
    c.o = 2;
  }
  
  public void g()
  {
    if (n.D0(3))
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("movefrom CREATED: ");
      ((StringBuilder)localObject1).append(c);
      Log.d("FragmentManager", ((StringBuilder)localObject1).toString());
    }
    Object localObject1 = c;
    boolean bool1 = A;
    boolean bool2 = true;
    int i;
    if ((bool1) && (!((Fragment)localObject1).Y())) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i == 0) && (!b.o().o(c)))
    {
      localObject1 = c.w;
      if (localObject1 != null)
      {
        localObject1 = b.f((String)localObject1);
        if ((localObject1 != null) && (P)) {
          c.v = ((Fragment)localObject1);
        }
      }
      c.o = 0;
    }
    else
    {
      localObject1 = c.H;
      if ((localObject1 instanceof androidx.lifecycle.u)) {
        bool2 = b.o().l();
      } else if ((((k)localObject1).i() instanceof Activity)) {
        bool2 = true ^ ((Activity)((k)localObject1).i()).isChangingConfigurations();
      }
      if ((i != 0) || (bool2)) {
        b.o().f(c);
      }
      c.U0();
      a.d(c, false);
      localObject1 = b.k().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (t)((Iterator)localObject1).next();
        if (localObject2 != null)
        {
          localObject2 = ((t)localObject2).k();
          if (c.t.equals(w))
          {
            v = c;
            w = null;
          }
        }
      }
      localObject1 = c;
      Object localObject2 = w;
      if (localObject2 != null) {
        v = b.f((String)localObject2);
      }
      b.q(this);
    }
  }
  
  public void h()
  {
    if (n.D0(3))
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("movefrom CREATE_VIEW: ");
      ((StringBuilder)localObject1).append(c);
      Log.d("FragmentManager", ((StringBuilder)localObject1).toString());
    }
    Object localObject2 = c;
    Object localObject1 = U;
    if (localObject1 != null)
    {
      localObject2 = V;
      if (localObject2 != null) {
        ((ViewGroup)localObject1).removeView((View)localObject2);
      }
    }
    c.V0();
    a.n(c, false);
    localObject1 = c;
    U = null;
    V = null;
    h0 = null;
    i0.j(null);
    c.C = false;
  }
  
  public void i()
  {
    if (n.D0(3))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("movefrom ATTACHED: ");
      ((StringBuilder)localObject).append(c);
      Log.d("FragmentManager", ((StringBuilder)localObject).toString());
    }
    c.W0();
    a.e(c, false);
    Object localObject = c;
    o = -1;
    H = null;
    J = null;
    G = null;
    if (((A) && (!((Fragment)localObject).Y())) || (b.o().o(c)))
    {
      if (n.D0(3))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("initState called for fragment: ");
        ((StringBuilder)localObject).append(c);
        Log.d("FragmentManager", ((StringBuilder)localObject).toString());
      }
      c.U();
    }
  }
  
  public void j()
  {
    Object localObject = c;
    if ((B) && (C) && (!E))
    {
      if (n.D0(3))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("moveto CREATE_VIEW: ");
        ((StringBuilder)localObject).append(c);
        Log.d("FragmentManager", ((StringBuilder)localObject).toString());
      }
      localObject = c;
      ((Fragment)localObject).T0(((Fragment)localObject).X0(p), null, c.p);
      localObject = c.V;
      if (localObject != null)
      {
        ((View)localObject).setSaveFromParentEnabled(false);
        localObject = c;
        V.setTag(b.a, localObject);
        localObject = c;
        if (N) {
          V.setVisibility(8);
        }
        c.k1();
        localObject = a;
        Fragment localFragment = c;
        ((m)localObject).m(localFragment, V, p, false);
        c.o = 2;
      }
    }
  }
  
  public Fragment k()
  {
    return c;
  }
  
  public final boolean l(View paramView)
  {
    if (paramView == c.V) {
      return true;
    }
    for (paramView = paramView.getParent(); paramView != null; paramView = paramView.getParent()) {
      if (paramView == c.V) {
        return true;
      }
    }
    return false;
  }
  
  public void m()
  {
    Object localObject1;
    if (d)
    {
      if (n.D0(2))
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("Ignoring re-entrant call to moveToExpectedState() for ");
        ((StringBuilder)localObject1).append(k());
        Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
      }
      return;
    }
    Object localObject3;
    try
    {
      d = true;
      for (;;)
      {
        int i = d();
        localObject1 = c;
        j = o;
        if (i == j) {
          break label475;
        }
        if (i <= j) {
          break;
        }
        switch (j + 1)
        {
        default: 
          break;
        case 7: 
          p();
        }
      }
    }
    finally
    {
      for (;;)
      {
        int j;
        break;
        o = 6;
        continue;
        u();
        continue;
        ViewGroup localViewGroup;
        if (V != null)
        {
          localViewGroup = U;
          if (localViewGroup != null) {
            B.n(localViewGroup, ((Fragment)localObject2).F()).b(B.e.c.e(c.V.getVisibility()), this);
          }
        }
        c.o = 4;
        continue;
        a();
        continue;
        j();
        f();
        continue;
        e();
        continue;
        c();
        continue;
        switch (j - 1)
        {
        default: 
          break;
        case 6: 
          n();
          break;
        case 5: 
          o = 5;
          break;
        case 4: 
          v();
          break;
        case 3: 
          if (n.D0(3))
          {
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            ((StringBuilder)localObject3).append("movefrom ACTIVITY_CREATED: ");
            ((StringBuilder)localObject3).append(c);
            Log.d("FragmentManager", ((StringBuilder)localObject3).toString());
          }
          localObject3 = c;
          if ((V != null) && (q == null)) {
            s();
          }
          localObject3 = c;
          if (V != null)
          {
            localViewGroup = U;
            if (localViewGroup != null) {
              B.n(localViewGroup, ((Fragment)localObject3).F()).d(this);
            }
          }
          c.o = 3;
          break;
        case 2: 
          C = false;
          o = 2;
          break;
        case 1: 
          h();
          c.o = 1;
          break;
        case 0: 
          g();
          break;
        case -1: 
          i();
          continue;
          label475:
          if ((n.P) && (b0))
          {
            if (V != null)
            {
              localViewGroup = U;
              if (localViewGroup != null)
              {
                localObject3 = B.n(localViewGroup, ((Fragment)localObject3).F());
                if (c.N) {
                  ((B)localObject3).c(this);
                } else {
                  ((B)localObject3).e(this);
                }
              }
            }
            localObject3 = c;
            b0 = false;
            ((Fragment)localObject3).w0(N);
          }
          d = false;
          return;
        }
      }
      d = false;
    }
  }
  
  public void n()
  {
    if (n.D0(3))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("movefrom RESUMED: ");
      localStringBuilder.append(c);
      Log.d("FragmentManager", localStringBuilder.toString());
    }
    c.c1();
    a.f(c, false);
  }
  
  public void o(ClassLoader paramClassLoader)
  {
    Object localObject = c.p;
    if (localObject == null) {
      return;
    }
    ((Bundle)localObject).setClassLoader(paramClassLoader);
    paramClassLoader = c;
    q = p.getSparseParcelableArray("android:view_state");
    paramClassLoader = c;
    r = p.getBundle("android:view_registry_state");
    paramClassLoader = c;
    w = p.getString("android:target_state");
    paramClassLoader = c;
    if (w != null) {
      x = p.getInt("android:target_req_state", 0);
    }
    localObject = c;
    paramClassLoader = s;
    if (paramClassLoader != null)
    {
      X = paramClassLoader.booleanValue();
      c.s = null;
    }
    else
    {
      X = p.getBoolean("android:user_visible_hint", true);
    }
    paramClassLoader = c;
    if (!X) {
      W = true;
    }
  }
  
  public void p()
  {
    if (n.D0(3))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("moveto RESUMED: ");
      ((StringBuilder)localObject).append(c);
      Log.d("FragmentManager", ((StringBuilder)localObject).toString());
    }
    Object localObject = c.y();
    if ((localObject != null) && (l((View)localObject)))
    {
      boolean bool = ((View)localObject).requestFocus();
      if (n.D0(2))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("requestFocus: Restoring focused view ");
        localStringBuilder.append(localObject);
        localStringBuilder.append(" ");
        if (bool) {
          localObject = "succeeded";
        } else {
          localObject = "failed";
        }
        localStringBuilder.append((String)localObject);
        localStringBuilder.append(" on Fragment ");
        localStringBuilder.append(c);
        localStringBuilder.append(" resulting in focused view ");
        localStringBuilder.append(c.V.findFocus());
        Log.v("FragmentManager", localStringBuilder.toString());
      }
    }
    c.x1(null);
    c.g1();
    a.i(c, false);
    localObject = c;
    p = null;
    q = null;
    r = null;
  }
  
  public final Bundle q()
  {
    Object localObject1 = new Bundle();
    c.h1((Bundle)localObject1);
    a.j(c, (Bundle)localObject1, false);
    Object localObject2 = localObject1;
    if (((BaseBundle)localObject1).isEmpty()) {
      localObject2 = null;
    }
    if (c.V != null) {
      s();
    }
    localObject1 = localObject2;
    if (c.q != null)
    {
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = new Bundle();
      }
      ((Bundle)localObject1).putSparseParcelableArray("android:view_state", c.q);
    }
    localObject2 = localObject1;
    if (c.r != null)
    {
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = new Bundle();
      }
      ((Bundle)localObject2).putBundle("android:view_registry_state", c.r);
    }
    localObject1 = localObject2;
    if (!c.X)
    {
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = new Bundle();
      }
      ((BaseBundle)localObject1).putBoolean("android:user_visible_hint", c.X);
    }
    return (Bundle)localObject1;
  }
  
  public s r()
  {
    s locals = new s(c);
    Object localObject = c;
    if ((o > -1) && (A == null))
    {
      localObject = q();
      A = ((Bundle)localObject);
      if (c.w != null)
      {
        if (localObject == null) {
          A = new Bundle();
        }
        A.putString("android:target_state", c.w);
        int i = c.x;
        if (i != 0) {
          A.putInt("android:target_req_state", i);
        }
      }
    }
    else
    {
      A = p;
    }
    return locals;
  }
  
  public void s()
  {
    if (c.V == null) {
      return;
    }
    Object localObject = new SparseArray();
    c.V.saveHierarchyState((SparseArray)localObject);
    if (((SparseArray)localObject).size() > 0) {
      c.q = ((SparseArray)localObject);
    }
    localObject = new Bundle();
    c.h0.e((Bundle)localObject);
    if (!((BaseBundle)localObject).isEmpty()) {
      c.r = ((Bundle)localObject);
    }
  }
  
  public void t(int paramInt)
  {
    e = paramInt;
  }
  
  public void u()
  {
    if (n.D0(3))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("moveto STARTED: ");
      localStringBuilder.append(c);
      Log.d("FragmentManager", localStringBuilder.toString());
    }
    c.i1();
    a.k(c, false);
  }
  
  public void v()
  {
    if (n.D0(3))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("movefrom STARTED: ");
      localStringBuilder.append(c);
      Log.d("FragmentManager", localStringBuilder.toString());
    }
    c.j1();
    a.l(c, false);
  }
  
  public class a
    implements View.OnAttachStateChangeListener
  {
    public a(View paramView) {}
    
    public void onViewAttachedToWindow(View paramView)
    {
      localObject2.removeOnAttachStateChangeListener(this);
      I.s.A(localObject2);
    }
    
    public void onViewDetachedFromWindow(View paramView) {}
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */