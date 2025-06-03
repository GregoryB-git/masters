package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.d;
import androidx.activity.result.e;
import androidx.activity.result.e.b;
import androidx.lifecycle.d.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class n
{
  public static boolean O = false;
  public static boolean P = true;
  public androidx.activity.result.c A;
  public androidx.activity.result.c B;
  public ArrayDeque C = new ArrayDeque();
  public boolean D;
  public boolean E;
  public boolean F;
  public boolean G;
  public boolean H;
  public ArrayList I;
  public ArrayList J;
  public ArrayList K;
  public ArrayList L;
  public q M;
  public Runnable N = new g();
  public final ArrayList a = new ArrayList();
  public boolean b;
  public final u c = new u();
  public ArrayList d;
  public ArrayList e;
  public final l f = new l(this);
  public OnBackPressedDispatcher g;
  public final androidx.activity.b h = new c(false);
  public final AtomicInteger i = new AtomicInteger();
  public final Map j = Collections.synchronizedMap(new HashMap());
  public final Map k = Collections.synchronizedMap(new HashMap());
  public ArrayList l;
  public Map m = Collections.synchronizedMap(new HashMap());
  public final w.g n = new d();
  public final m o = new m(this);
  public final CopyOnWriteArrayList p = new CopyOnWriteArrayList();
  public int q = -1;
  public k r;
  public g s;
  public Fragment t;
  public Fragment u;
  public j v = null;
  public j w = new e();
  public C x = null;
  public C y = new f();
  public androidx.activity.result.c z;
  
  public static boolean D0(int paramInt)
  {
    boolean bool;
    if ((!O) && (!Log.isLoggable("FragmentManager", paramInt))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static void c0(ArrayList paramArrayList1, ArrayList paramArrayList2, int paramInt1, int paramInt2)
  {
    while (paramInt1 < paramInt2)
    {
      a locala = (a)paramArrayList1.get(paramInt1);
      boolean bool1 = ((Boolean)paramArrayList2.get(paramInt1)).booleanValue();
      boolean bool2 = true;
      if (bool1)
      {
        locala.m(-1);
        if (paramInt1 != paramInt2 - 1) {
          bool2 = false;
        }
        locala.r(bool2);
      }
      else
      {
        locala.m(1);
        locala.q();
      }
      paramInt1++;
    }
  }
  
  public static int d1(int paramInt)
  {
    int i1 = 8194;
    if (paramInt != 4097) {
      if (paramInt != 4099)
      {
        if (paramInt != 8194) {
          i1 = 0;
        } else {
          i1 = 4097;
        }
      }
      else {
        i1 = 4099;
      }
    }
    return i1;
  }
  
  public static Fragment y0(View paramView)
  {
    paramView = paramView.getTag(U.b.a);
    if ((paramView instanceof Fragment)) {
      return (Fragment)paramView;
    }
    return null;
  }
  
  public void A(Configuration paramConfiguration)
  {
    Iterator localIterator = c.n().iterator();
    while (localIterator.hasNext())
    {
      Fragment localFragment = (Fragment)localIterator.next();
      if (localFragment != null) {
        localFragment.P0(paramConfiguration);
      }
    }
  }
  
  public void A0()
  {
    a0(true);
    if (h.c()) {
      S0();
    } else {
      g.c();
    }
  }
  
  public boolean B(MenuItem paramMenuItem)
  {
    if (q < 1) {
      return false;
    }
    Iterator localIterator = c.n().iterator();
    while (localIterator.hasNext())
    {
      Fragment localFragment = (Fragment)localIterator.next();
      if ((localFragment != null) && (localFragment.Q0(paramMenuItem))) {
        return true;
      }
    }
    return false;
  }
  
  public void B0(Fragment paramFragment)
  {
    if (D0(2))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("hide: ");
      localStringBuilder.append(paramFragment);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    if (!N)
    {
      N = true;
      b0 = (true ^ b0);
      j1(paramFragment);
    }
  }
  
  public void C()
  {
    E = false;
    F = false;
    M.n(false);
    S(1);
  }
  
  public boolean C0()
  {
    return G;
  }
  
  public boolean D(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    int i1 = q;
    int i2 = 0;
    if (i1 < 1) {
      return false;
    }
    Iterator localIterator = c.n().iterator();
    Object localObject1 = null;
    boolean bool = false;
    while (localIterator.hasNext())
    {
      Fragment localFragment = (Fragment)localIterator.next();
      if ((localFragment != null) && (F0(localFragment)) && (localFragment.S0(paramMenu, paramMenuInflater)))
      {
        Object localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new ArrayList();
        }
        ((ArrayList)localObject2).add(localFragment);
        bool = true;
        localObject1 = localObject2;
      }
    }
    if (e != null) {
      while (i2 < e.size())
      {
        paramMenu = (Fragment)e.get(i2);
        if ((localObject1 == null) || (!((ArrayList)localObject1).contains(paramMenu))) {
          paramMenu.s0();
        }
        i2++;
      }
    }
    e = ((ArrayList)localObject1);
    return bool;
  }
  
  public void E()
  {
    G = true;
    a0(true);
    X();
    S(-1);
    r = null;
    s = null;
    t = null;
    if (g != null)
    {
      h.d();
      g = null;
    }
    androidx.activity.result.c localc = z;
    if (localc != null)
    {
      localc.c();
      A.c();
      B.c();
    }
  }
  
  public final boolean E0(Fragment paramFragment)
  {
    boolean bool;
    if (((R) && (S)) || (I.o())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void F()
  {
    S(1);
  }
  
  public boolean F0(Fragment paramFragment)
  {
    if (paramFragment == null) {
      return true;
    }
    return paramFragment.Z();
  }
  
  public void G()
  {
    Iterator localIterator = c.n().iterator();
    while (localIterator.hasNext())
    {
      Fragment localFragment = (Fragment)localIterator.next();
      if (localFragment != null) {
        localFragment.Y0();
      }
    }
  }
  
  public boolean G0(Fragment paramFragment)
  {
    boolean bool = true;
    if (paramFragment == null) {
      return true;
    }
    n localn = G;
    if ((!paramFragment.equals(localn.w0())) || (!G0(t))) {
      bool = false;
    }
    return bool;
  }
  
  public void H(boolean paramBoolean)
  {
    Iterator localIterator = c.n().iterator();
    while (localIterator.hasNext())
    {
      Fragment localFragment = (Fragment)localIterator.next();
      if (localFragment != null) {
        localFragment.Z0(paramBoolean);
      }
    }
  }
  
  public boolean H0(int paramInt)
  {
    boolean bool;
    if (q >= paramInt) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void I(Fragment paramFragment)
  {
    Iterator localIterator = p.iterator();
    while (localIterator.hasNext()) {
      ((r)localIterator.next()).a(this, paramFragment);
    }
  }
  
  public boolean I0()
  {
    boolean bool;
    if ((!E) && (!F)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean J(MenuItem paramMenuItem)
  {
    if (q < 1) {
      return false;
    }
    Iterator localIterator = c.n().iterator();
    while (localIterator.hasNext())
    {
      Fragment localFragment = (Fragment)localIterator.next();
      if ((localFragment != null) && (localFragment.a1(paramMenuItem))) {
        return true;
      }
    }
    return false;
  }
  
  public void J0(Fragment paramFragment, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    if (z != null)
    {
      paramFragment = new m(t, paramInt);
      C.addLast(paramFragment);
      if ((paramIntent != null) && (paramBundle != null)) {
        paramIntent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", paramBundle);
      }
      z.a(paramIntent);
    }
    else
    {
      r.p(paramFragment, paramIntent, paramInt, paramBundle);
    }
  }
  
  public void K(Menu paramMenu)
  {
    if (q < 1) {
      return;
    }
    Iterator localIterator = c.n().iterator();
    while (localIterator.hasNext())
    {
      Fragment localFragment = (Fragment)localIterator.next();
      if (localFragment != null) {
        localFragment.b1(paramMenu);
      }
    }
  }
  
  public final void K0(t.b paramb)
  {
    int i1 = paramb.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      Fragment localFragment = (Fragment)paramb.s(i2);
      if (!z)
      {
        View localView = localFragment.q1();
        c0 = localView.getAlpha();
        localView.setAlpha(0.0F);
      }
    }
  }
  
  public final void L(Fragment paramFragment)
  {
    if ((paramFragment != null) && (paramFragment.equals(f0(t)))) {
      paramFragment.f1();
    }
  }
  
  public void L0(Fragment paramFragment)
  {
    if (!c.c(t))
    {
      if (D0(3))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Ignoring moving ");
        ((StringBuilder)localObject).append(paramFragment);
        ((StringBuilder)localObject).append(" to state ");
        ((StringBuilder)localObject).append(q);
        ((StringBuilder)localObject).append("since it is not added to ");
        ((StringBuilder)localObject).append(this);
        Log.d("FragmentManager", ((StringBuilder)localObject).toString());
      }
      return;
    }
    N0(paramFragment);
    Object localObject = V;
    if ((localObject != null) && (a0) && (U != null))
    {
      float f1 = c0;
      if (f1 > 0.0F) {
        ((View)localObject).setAlpha(f1);
      }
      c0 = 0.0F;
      a0 = false;
      localObject = f.b(r.i(), paramFragment, true);
      if (localObject != null)
      {
        Animation localAnimation = a;
        if (localAnimation != null)
        {
          V.startAnimation(localAnimation);
        }
        else
        {
          b.setTarget(V);
          b.start();
        }
      }
    }
    if (b0) {
      u(paramFragment);
    }
  }
  
  public void M()
  {
    S(5);
  }
  
  public void M0(int paramInt, boolean paramBoolean)
  {
    if ((r == null) && (paramInt != -1)) {
      throw new IllegalStateException("No activity");
    }
    if ((!paramBoolean) && (paramInt == q)) {
      return;
    }
    q = paramInt;
    Object localObject;
    if (P)
    {
      c.r();
    }
    else
    {
      localObject = c.n().iterator();
      while (((Iterator)localObject).hasNext()) {
        L0((Fragment)((Iterator)localObject).next());
      }
      localObject = c.k().iterator();
      while (((Iterator)localObject).hasNext())
      {
        t localt = (t)((Iterator)localObject).next();
        Fragment localFragment = localt.k();
        if (!a0) {
          L0(localFragment);
        }
        if ((A) && (!localFragment.Y())) {
          c.q(localt);
        }
      }
    }
    l1();
    if (D)
    {
      localObject = r;
      if ((localObject != null) && (q == 7))
      {
        ((k)localObject).q();
        D = false;
      }
    }
  }
  
  public void N(boolean paramBoolean)
  {
    Iterator localIterator = c.n().iterator();
    while (localIterator.hasNext())
    {
      Fragment localFragment = (Fragment)localIterator.next();
      if (localFragment != null) {
        localFragment.d1(paramBoolean);
      }
    }
  }
  
  public void N0(Fragment paramFragment)
  {
    O0(paramFragment, q);
  }
  
  public boolean O(Menu paramMenu)
  {
    int i1 = q;
    boolean bool = false;
    if (i1 < 1) {
      return false;
    }
    Iterator localIterator = c.n().iterator();
    while (localIterator.hasNext())
    {
      Fragment localFragment = (Fragment)localIterator.next();
      if ((localFragment != null) && (F0(localFragment)) && (localFragment.e1(paramMenu))) {
        bool = true;
      }
    }
    return bool;
  }
  
  public void O0(Fragment paramFragment, int paramInt)
  {
    Object localObject1 = c.m(t);
    int i1 = 1;
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = new t(o, c, paramFragment);
      ((t)localObject2).t(1);
    }
    int i2 = paramInt;
    if (B)
    {
      i2 = paramInt;
      if (C)
      {
        i2 = paramInt;
        if (o == 2) {
          i2 = Math.max(paramInt, 2);
        }
      }
    }
    paramInt = Math.min(i2, ((t)localObject2).d());
    int i3 = o;
    if (i3 <= paramInt)
    {
      if ((i3 < paramInt) && (!m.isEmpty())) {
        n(paramFragment);
      }
      i2 = o;
      if (i2 != -1)
      {
        if (i2 != 0)
        {
          if (i2 == 1) {
            break label196;
          }
          if (i2 == 2) {
            break label216;
          }
          if (i2 == 4) {
            break label226;
          }
          if (i2 == 5) {
            break label236;
          }
          i2 = paramInt;
          break label673;
        }
      }
      else if (paramInt > -1) {
        ((t)localObject2).c();
      }
      if (paramInt > 0) {
        ((t)localObject2).e();
      }
      label196:
      if (paramInt > -1) {
        ((t)localObject2).j();
      }
      if (paramInt > 1) {
        ((t)localObject2).f();
      }
      label216:
      if (paramInt > 2) {
        ((t)localObject2).a();
      }
      label226:
      if (paramInt > 4) {
        ((t)localObject2).u();
      }
      label236:
      i2 = paramInt;
      if (paramInt > 5)
      {
        ((t)localObject2).p();
        i2 = paramInt;
      }
    }
    else
    {
      i2 = paramInt;
      if (i3 > paramInt)
      {
        if (i3 != 0)
        {
          if (i3 != 1)
          {
            if (i3 != 2)
            {
              if (i3 != 4)
              {
                if (i3 != 5)
                {
                  if (i3 != 7)
                  {
                    i2 = paramInt;
                    break label673;
                  }
                  if (paramInt < 7) {
                    ((t)localObject2).n();
                  }
                }
                if (paramInt < 5) {
                  ((t)localObject2).v();
                }
              }
              if (paramInt < 4)
              {
                if (D0(3))
                {
                  localObject1 = new StringBuilder();
                  ((StringBuilder)localObject1).append("movefrom ACTIVITY_CREATED: ");
                  ((StringBuilder)localObject1).append(paramFragment);
                  Log.d("FragmentManager", ((StringBuilder)localObject1).toString());
                }
                if ((V != null) && (r.o(paramFragment)) && (q == null)) {
                  ((t)localObject2).s();
                }
              }
            }
            if (paramInt < 2)
            {
              View localView = V;
              if (localView != null)
              {
                localObject1 = U;
                if (localObject1 != null)
                {
                  ((ViewGroup)localObject1).endViewTransition(localView);
                  V.clearAnimation();
                  if (!paramFragment.c0())
                  {
                    if ((q > -1) && (!G) && (V.getVisibility() == 0) && (c0 >= 0.0F)) {
                      localObject1 = f.b(r.i(), paramFragment, false);
                    } else {
                      localObject1 = null;
                    }
                    c0 = 0.0F;
                    ViewGroup localViewGroup = U;
                    localView = V;
                    if (localObject1 != null) {
                      f.a(paramFragment, (f.d)localObject1, n);
                    }
                    localViewGroup.removeView(localView);
                    if (D0(2))
                    {
                      localObject1 = new StringBuilder();
                      ((StringBuilder)localObject1).append("Removing view ");
                      ((StringBuilder)localObject1).append(localView);
                      ((StringBuilder)localObject1).append(" for fragment ");
                      ((StringBuilder)localObject1).append(paramFragment);
                      ((StringBuilder)localObject1).append(" from container ");
                      ((StringBuilder)localObject1).append(localViewGroup);
                      Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
                    }
                    if (localViewGroup != U) {
                      return;
                    }
                  }
                }
              }
              if (m.get(paramFragment) == null) {
                ((t)localObject2).h();
              }
            }
          }
          if (paramInt < 1) {
            if (m.get(paramFragment) != null) {
              paramInt = i1;
            } else {
              ((t)localObject2).g();
            }
          }
        }
        if (paramInt < 0) {
          ((t)localObject2).i();
        }
        i2 = paramInt;
      }
    }
    label673:
    if (o != i2)
    {
      if (D0(3))
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("moveToState: Fragment state for ");
        ((StringBuilder)localObject2).append(paramFragment);
        ((StringBuilder)localObject2).append(" not updated inline; expected state ");
        ((StringBuilder)localObject2).append(i2);
        ((StringBuilder)localObject2).append(" found ");
        ((StringBuilder)localObject2).append(o);
        Log.d("FragmentManager", ((StringBuilder)localObject2).toString());
      }
      o = i2;
    }
  }
  
  public void P()
  {
    n1();
    L(u);
  }
  
  public void P0()
  {
    if (r == null) {
      return;
    }
    E = false;
    F = false;
    M.n(false);
    Iterator localIterator = c.n().iterator();
    while (localIterator.hasNext())
    {
      Fragment localFragment = (Fragment)localIterator.next();
      if (localFragment != null) {
        localFragment.f0();
      }
    }
  }
  
  public void Q()
  {
    E = false;
    F = false;
    M.n(false);
    S(7);
  }
  
  public void Q0(t paramt)
  {
    Fragment localFragment = paramt.k();
    if (W)
    {
      if (b)
      {
        H = true;
        return;
      }
      W = false;
      if (P) {
        paramt.m();
      } else {
        N0(localFragment);
      }
    }
  }
  
  public void R()
  {
    E = false;
    F = false;
    M.n(false);
    S(5);
  }
  
  public void R0(int paramInt1, int paramInt2)
  {
    if (paramInt1 >= 0)
    {
      Y(new o(null, paramInt1, paramInt2), false);
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Bad id: ");
    localStringBuilder.append(paramInt1);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  /* Error */
  public final void S(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: putfield 687	androidx/fragment/app/n:b	Z
    //   5: aload_0
    //   6: getfield 118	androidx/fragment/app/n:c	Landroidx/fragment/app/u;
    //   9: iload_1
    //   10: invokevirtual 706	androidx/fragment/app/u:d	(I)V
    //   13: aload_0
    //   14: iload_1
    //   15: iconst_0
    //   16: invokevirtual 708	androidx/fragment/app/n:M0	(IZ)V
    //   19: getstatic 539	androidx/fragment/app/n:P	Z
    //   22: ifeq +41 -> 63
    //   25: aload_0
    //   26: invokevirtual 711	androidx/fragment/app/n:r	()Ljava/util/Set;
    //   29: invokeinterface 714 1 0
    //   34: astore_2
    //   35: aload_2
    //   36: invokeinterface 249 1 0
    //   41: ifeq +22 -> 63
    //   44: aload_2
    //   45: invokeinterface 253 1 0
    //   50: checkcast 716	androidx/fragment/app/B
    //   53: invokevirtual 717	androidx/fragment/app/B:j	()V
    //   56: goto -21 -> 35
    //   59: astore_2
    //   60: goto +15 -> 75
    //   63: aload_0
    //   64: iconst_0
    //   65: putfield 687	androidx/fragment/app/n:b	Z
    //   68: aload_0
    //   69: iconst_1
    //   70: invokevirtual 261	androidx/fragment/app/n:a0	(Z)Z
    //   73: pop
    //   74: return
    //   75: aload_0
    //   76: iconst_0
    //   77: putfield 687	androidx/fragment/app/n:b	Z
    //   80: aload_2
    //   81: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	this	n
    //   0	82	1	paramInt	int
    //   34	11	2	localIterator	Iterator
    //   59	22	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   0	35	59	finally
    //   35	56	59	finally
  }
  
  public boolean S0()
  {
    return T0(null, -1, 0);
  }
  
  public void T()
  {
    F = true;
    M.n(true);
    S(4);
  }
  
  public final boolean T0(String paramString, int paramInt1, int paramInt2)
  {
    a0(false);
    Z(true);
    Fragment localFragment = u;
    if ((localFragment != null) && (paramInt1 < 0) && (paramString == null) && (localFragment.s().S0())) {
      return true;
    }
    boolean bool = U0(I, J, paramString, paramInt1, paramInt2);
    if (bool) {
      b = true;
    }
    try
    {
      Z0(I, J);
      q();
    }
    finally
    {
      q();
    }
    V();
    c.b();
    return bool;
  }
  
  public void U()
  {
    S(2);
  }
  
  public boolean U0(ArrayList paramArrayList1, ArrayList paramArrayList2, String paramString, int paramInt1, int paramInt2)
  {
    Object localObject = d;
    if (localObject == null) {
      return false;
    }
    if ((paramString == null) && (paramInt1 < 0) && ((paramInt2 & 0x1) == 0))
    {
      paramInt1 = ((ArrayList)localObject).size() - 1;
      if (paramInt1 < 0) {
        return false;
      }
      paramArrayList1.add(d.remove(paramInt1));
      paramArrayList2.add(Boolean.TRUE);
    }
    else
    {
      if ((paramString == null) && (paramInt1 < 0))
      {
        paramInt1 = -1;
      }
      else
      {
        for (int i1 = ((ArrayList)localObject).size() - 1; i1 >= 0; i1--)
        {
          localObject = (a)d.get(i1);
          if (((paramString != null) && (paramString.equals(((a)localObject).t()))) || ((paramInt1 >= 0) && (paramInt1 == v))) {
            break;
          }
        }
        if (i1 < 0) {
          return false;
        }
        int i2 = i1;
        if ((paramInt2 & 0x1) != 0) {
          for (;;)
          {
            paramInt2 = i1 - 1;
            i2 = paramInt2;
            if (paramInt2 < 0) {
              break;
            }
            localObject = (a)d.get(paramInt2);
            if (paramString != null)
            {
              i1 = paramInt2;
              if (paramString.equals(((a)localObject).t())) {}
            }
            else
            {
              i2 = paramInt2;
              if (paramInt1 < 0) {
                break;
              }
              i2 = paramInt2;
              if (paramInt1 != v) {
                break;
              }
              i1 = paramInt2;
            }
          }
        }
        paramInt1 = i2;
      }
      if (paramInt1 == d.size() - 1) {
        return false;
      }
      for (paramInt2 = d.size() - 1; paramInt2 > paramInt1; paramInt2--)
      {
        paramArrayList1.add(d.remove(paramInt2));
        paramArrayList2.add(Boolean.TRUE);
      }
    }
    return true;
  }
  
  public final void V()
  {
    if (H)
    {
      H = false;
      l1();
    }
  }
  
  public final int V0(ArrayList paramArrayList1, ArrayList paramArrayList2, int paramInt1, int paramInt2, t.b paramb)
  {
    int i1 = paramInt2 - 1;
    int i3;
    for (int i2 = paramInt2; i1 >= paramInt1; i2 = i3)
    {
      a locala = (a)paramArrayList1.get(i1);
      boolean bool = ((Boolean)paramArrayList2.get(i1)).booleanValue();
      i3 = i2;
      if (locala.x())
      {
        i3 = i2;
        if (!locala.v(paramArrayList1, i1 + 1, paramInt2))
        {
          if (L == null) {
            L = new ArrayList();
          }
          p localp = new p(locala, bool);
          L.add(localp);
          locala.z(localp);
          if (bool) {
            locala.q();
          } else {
            locala.r(false);
          }
          i3 = i2 - 1;
          if (i1 != i3)
          {
            paramArrayList1.remove(i1);
            paramArrayList1.add(i3, locala);
          }
          d(paramb);
        }
      }
      i1--;
    }
    return i2;
  }
  
  public void W(String paramString, FileDescriptor arg2, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("    ");
    localObject = ((StringBuilder)localObject).toString();
    c.e(paramString, ???, paramPrintWriter, paramArrayOfString);
    ??? = e;
    int i1 = 0;
    int i2;
    int i3;
    if (??? != null)
    {
      i2 = ???.size();
      if (i2 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Fragments Created Menus:");
        for (i3 = 0; i3 < i2; i3++)
        {
          ??? = (Fragment)e.get(i3);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i3);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(???.toString());
        }
      }
    }
    ??? = d;
    if (??? != null)
    {
      i2 = ???.size();
      if (i2 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Back Stack:");
        for (i3 = 0; i3 < i2; i3++)
        {
          ??? = (a)d.get(i3);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i3);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(???.toString());
          ???.o((String)localObject, paramPrintWriter);
        }
      }
    }
    paramPrintWriter.print(paramString);
    ??? = new StringBuilder();
    ???.append("Back Stack Index: ");
    ???.append(i.get());
    paramPrintWriter.println(???.toString());
    synchronized (a)
    {
      i2 = a.size();
      if (i2 > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Pending Actions:");
        i3 = i1;
        if (i3 < i2)
        {
          paramArrayOfString = (n)a.get(i3);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(i3);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(paramArrayOfString);
          i3++;
        }
      }
    }
  }
  
  public void W0(l paraml, boolean paramBoolean)
  {
    o.o(paraml, paramBoolean);
  }
  
  public final void X()
  {
    Object localObject;
    if (P)
    {
      localObject = r().iterator();
      while (((Iterator)localObject).hasNext()) {
        ((B)((Iterator)localObject).next()).j();
      }
    }
    if (!m.isEmpty())
    {
      Iterator localIterator = m.keySet().iterator();
      while (localIterator.hasNext())
      {
        localObject = (Fragment)localIterator.next();
        n((Fragment)localObject);
        N0((Fragment)localObject);
      }
    }
  }
  
  public void X0(Fragment paramFragment, E.c paramc)
  {
    HashSet localHashSet = (HashSet)m.get(paramFragment);
    if ((localHashSet != null) && (localHashSet.remove(paramc)) && (localHashSet.isEmpty()))
    {
      m.remove(paramFragment);
      if (o < 5)
      {
        w(paramFragment);
        N0(paramFragment);
      }
    }
  }
  
  public void Y(n paramn, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      if (r == null)
      {
        if (G) {
          throw new IllegalStateException("FragmentManager has been destroyed");
        }
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
      }
      p();
    }
    ArrayList localArrayList = a;
    label98:
    try
    {
      if (r == null) {
        if (paramBoolean) {
          return;
        }
      }
    }
    finally
    {
      break label98;
      paramn = new java/lang/IllegalStateException;
      paramn.<init>("Activity has been destroyed");
      throw paramn;
      a.add(paramn);
      f1();
      return;
    }
  }
  
  public void Y0(Fragment paramFragment)
  {
    if (D0(2))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("remove: ");
      localStringBuilder.append(paramFragment);
      localStringBuilder.append(" nesting=");
      localStringBuilder.append(F);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    boolean bool = paramFragment.Y();
    if ((!O) || ((bool ^ true)))
    {
      c.s(paramFragment);
      if (E0(paramFragment)) {
        D = true;
      }
      A = true;
      j1(paramFragment);
    }
  }
  
  public final void Z(boolean paramBoolean)
  {
    if (!b)
    {
      if (r == null)
      {
        if (G) {
          throw new IllegalStateException("FragmentManager has been destroyed");
        }
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
      }
      if (Looper.myLooper() == r.l().getLooper())
      {
        if (!paramBoolean) {
          p();
        }
        if (I == null)
        {
          I = new ArrayList();
          J = new ArrayList();
        }
        b = true;
        try
        {
          e0(null, null);
          return;
        }
        finally
        {
          b = false;
        }
      }
      throw new IllegalStateException("Must be called from main thread of fragment host");
    }
    throw new IllegalStateException("FragmentManager is already executing transactions");
  }
  
  public final void Z0(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    if (paramArrayList1.isEmpty()) {
      return;
    }
    if (paramArrayList1.size() == paramArrayList2.size())
    {
      e0(paramArrayList1, paramArrayList2);
      int i1 = paramArrayList1.size();
      int i2 = 0;
      int i5;
      for (int i3 = 0; i2 < i1; i3 = i5)
      {
        int i4 = i2;
        i5 = i3;
        if (!getr)
        {
          if (i3 != i2) {
            d0(paramArrayList1, paramArrayList2, i3, i2);
          }
          i3 = i2 + 1;
          i5 = i3;
          if (((Boolean)paramArrayList2.get(i2)).booleanValue()) {
            for (;;)
            {
              i5 = i3;
              if (i3 >= i1) {
                break;
              }
              i5 = i3;
              if (!((Boolean)paramArrayList2.get(i3)).booleanValue()) {
                break;
              }
              i5 = i3;
              if (getr) {
                break;
              }
              i3++;
            }
          }
          d0(paramArrayList1, paramArrayList2, i2, i5);
          i4 = i5 - 1;
        }
        i2 = i4 + 1;
      }
      if (i3 != i1) {
        d0(paramArrayList1, paramArrayList2, i3, i1);
      }
      return;
    }
    throw new IllegalStateException("Internal error with the back stack records");
  }
  
  /* Error */
  public boolean a0(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: invokevirtual 724	androidx/fragment/app/n:Z	(Z)V
    //   5: iconst_0
    //   6: istore_1
    //   7: aload_0
    //   8: aload_0
    //   9: getfield 729	androidx/fragment/app/n:I	Ljava/util/ArrayList;
    //   12: aload_0
    //   13: getfield 731	androidx/fragment/app/n:J	Ljava/util/ArrayList;
    //   16: invokevirtual 909	androidx/fragment/app/n:k0	(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    //   19: ifeq +36 -> 55
    //   22: iconst_1
    //   23: istore_1
    //   24: aload_0
    //   25: iconst_1
    //   26: putfield 687	androidx/fragment/app/n:b	Z
    //   29: aload_0
    //   30: aload_0
    //   31: getfield 729	androidx/fragment/app/n:I	Ljava/util/ArrayList;
    //   34: aload_0
    //   35: getfield 731	androidx/fragment/app/n:J	Ljava/util/ArrayList;
    //   38: invokevirtual 738	androidx/fragment/app/n:Z0	(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    //   41: aload_0
    //   42: invokevirtual 739	androidx/fragment/app/n:q	()V
    //   45: goto -38 -> 7
    //   48: astore_2
    //   49: aload_0
    //   50: invokevirtual 739	androidx/fragment/app/n:q	()V
    //   53: aload_2
    //   54: athrow
    //   55: aload_0
    //   56: invokevirtual 675	androidx/fragment/app/n:n1	()V
    //   59: aload_0
    //   60: invokevirtual 741	androidx/fragment/app/n:V	()V
    //   63: aload_0
    //   64: getfield 118	androidx/fragment/app/n:c	Landroidx/fragment/app/u;
    //   67: invokevirtual 743	androidx/fragment/app/u:b	()V
    //   70: iload_1
    //   71: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	72	0	this	n
    //   0	72	1	paramBoolean	boolean
    //   48	6	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   29	41	48	finally
  }
  
  public void a1(Fragment paramFragment)
  {
    M.m(paramFragment);
  }
  
  public void b0(n paramn, boolean paramBoolean)
  {
    if ((paramBoolean) && ((r == null) || (G))) {
      return;
    }
    Z(paramBoolean);
    if (paramn.a(I, J)) {
      b = true;
    }
    try
    {
      Z0(I, J);
      q();
    }
    finally
    {
      q();
    }
    V();
    c.b();
  }
  
  public final void b1()
  {
    ArrayList localArrayList = l;
    if ((localArrayList != null) && (localArrayList.size() > 0))
    {
      android.support.v4.media.a.a(l.get(0));
      throw null;
    }
  }
  
  public void c1(Parcelable paramParcelable)
  {
    if (paramParcelable == null) {
      return;
    }
    p localp = (p)paramParcelable;
    if (o == null) {
      return;
    }
    c.t();
    Object localObject1 = o.iterator();
    Object localObject3;
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (s)((Iterator)localObject1).next();
      if (localObject2 != null)
      {
        paramParcelable = M.g(p);
        if (paramParcelable != null)
        {
          if (D0(2))
          {
            localObject3 = new StringBuilder();
            ((StringBuilder)localObject3).append("restoreSaveState: re-attaching retained ");
            ((StringBuilder)localObject3).append(paramParcelable);
            Log.v("FragmentManager", ((StringBuilder)localObject3).toString());
          }
          paramParcelable = new t(o, c, paramParcelable, (s)localObject2);
        }
        else
        {
          paramParcelable = new t(o, c, r.i().getClassLoader(), p0(), (s)localObject2);
        }
        localObject3 = paramParcelable.k();
        G = this;
        if (D0(2))
        {
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append("restoreSaveState: active (");
          ((StringBuilder)localObject2).append(t);
          ((StringBuilder)localObject2).append("): ");
          ((StringBuilder)localObject2).append(localObject3);
          Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
        }
        paramParcelable.o(r.i().getClassLoader());
        c.p(paramParcelable);
        paramParcelable.t(q);
      }
    }
    paramParcelable = M.j().iterator();
    while (paramParcelable.hasNext())
    {
      localObject1 = (Fragment)paramParcelable.next();
      if (!c.c(t))
      {
        if (D0(2))
        {
          localObject3 = new StringBuilder();
          ((StringBuilder)localObject3).append("Discarding retained Fragment ");
          ((StringBuilder)localObject3).append(localObject1);
          ((StringBuilder)localObject3).append(" that was not found in the set of active Fragments ");
          ((StringBuilder)localObject3).append(o);
          Log.v("FragmentManager", ((StringBuilder)localObject3).toString());
        }
        M.m((Fragment)localObject1);
        G = this;
        localObject3 = new t(o, c, (Fragment)localObject1);
        ((t)localObject3).t(1);
        ((t)localObject3).m();
        A = true;
        ((t)localObject3).m();
      }
    }
    c.u(p);
    paramParcelable = q;
    int i1 = 0;
    int i2;
    if (paramParcelable != null)
    {
      d = new ArrayList(q.length);
      for (i2 = 0;; i2++)
      {
        paramParcelable = q;
        if (i2 >= paramParcelable.length) {
          break;
        }
        paramParcelable = paramParcelable[i2].a(this);
        if (D0(2))
        {
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("restoreAllState: back stack #");
          ((StringBuilder)localObject1).append(i2);
          ((StringBuilder)localObject1).append(" (index ");
          ((StringBuilder)localObject1).append(v);
          ((StringBuilder)localObject1).append("): ");
          ((StringBuilder)localObject1).append(paramParcelable);
          Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
          localObject1 = new PrintWriter(new A("FragmentManager"));
          paramParcelable.p("  ", (PrintWriter)localObject1, false);
          ((PrintWriter)localObject1).close();
        }
        d.add(paramParcelable);
      }
    }
    d = null;
    i.set(r);
    paramParcelable = s;
    if (paramParcelable != null)
    {
      paramParcelable = f0(paramParcelable);
      u = paramParcelable;
      L(paramParcelable);
    }
    paramParcelable = t;
    if (paramParcelable != null) {
      for (i2 = i1; i2 < paramParcelable.size(); i2++) {
        j.put(paramParcelable.get(i2), u.get(i2));
      }
    }
    C = new ArrayDeque(v);
  }
  
  public final void d(t.b paramb)
  {
    int i1 = q;
    if (i1 < 1) {
      return;
    }
    i1 = Math.min(i1, 5);
    Iterator localIterator = c.n().iterator();
    while (localIterator.hasNext())
    {
      Fragment localFragment = (Fragment)localIterator.next();
      if (o < i1)
      {
        O0(localFragment, i1);
        if ((V != null) && (!N) && (a0)) {
          paramb.add(localFragment);
        }
      }
    }
  }
  
  public final void d0(ArrayList paramArrayList1, ArrayList paramArrayList2, int paramInt1, int paramInt2)
  {
    boolean bool = getr;
    Object localObject1 = K;
    if (localObject1 == null) {
      K = new ArrayList();
    } else {
      ((ArrayList)localObject1).clear();
    }
    K.addAll(c.n());
    localObject1 = w0();
    int i1 = 0;
    Object localObject2;
    for (int i2 = paramInt1; i2 < paramInt2; i2++)
    {
      localObject2 = (a)paramArrayList1.get(i2);
      if (!((Boolean)paramArrayList2.get(i2)).booleanValue()) {
        localObject1 = ((a)localObject2).s(K, (Fragment)localObject1);
      } else {
        localObject1 = ((a)localObject2).A(K, (Fragment)localObject1);
      }
      if ((i1 == 0) && (!i)) {
        i1 = 0;
      } else {
        i1 = 1;
      }
    }
    K.clear();
    if ((!bool) && (q >= 1))
    {
      if (P) {
        for (i2 = paramInt1; i2 < paramInt2; i2++)
        {
          localObject1 = getc.iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = nextb;
            if ((localObject2 != null) && (G != null))
            {
              localObject2 = v((Fragment)localObject2);
              c.p((t)localObject2);
            }
          }
        }
      }
    }
    else {
      break label307;
    }
    w.B(r.i(), s, paramArrayList1, paramArrayList2, paramInt1, paramInt2, false, n);
    label307:
    c0(paramArrayList1, paramArrayList2, paramInt1, paramInt2);
    int i3;
    if (P)
    {
      bool = ((Boolean)paramArrayList2.get(paramInt2 - 1)).booleanValue();
      for (i2 = paramInt1; i2 < paramInt2; i2++)
      {
        localObject1 = (a)paramArrayList1.get(i2);
        if (bool) {
          for (i3 = c.size() - 1; i3 >= 0; i3--)
          {
            localObject2 = c.get(i3)).b;
            if (localObject2 != null) {
              v((Fragment)localObject2).m();
            }
          }
        }
        localObject2 = c.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = nextb;
          if (localObject1 != null) {
            v((Fragment)localObject1).m();
          }
        }
      }
      M0(q, true);
      localObject2 = s(paramArrayList1, paramInt1, paramInt2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (B)((Iterator)localObject2).next();
        ((B)localObject1).r(bool);
        ((B)localObject1).p();
        ((B)localObject1).g();
      }
    }
    else
    {
      if (bool)
      {
        localObject1 = new t.b();
        d((t.b)localObject1);
        i2 = V0(paramArrayList1, paramArrayList2, paramInt1, paramInt2, (t.b)localObject1);
        K0((t.b)localObject1);
      }
      else
      {
        i2 = paramInt2;
      }
      i3 = 1;
      localObject1 = paramArrayList2;
      if ((i2 != paramInt1) && (bool))
      {
        if (q >= i3) {
          w.B(r.i(), s, paramArrayList1, paramArrayList2, paramInt1, i2, true, n);
        }
        paramArrayList2 = (ArrayList)localObject1;
        M0(q, i3);
      }
      else
      {
        paramArrayList2 = (ArrayList)localObject1;
      }
    }
    while (paramInt1 < paramInt2)
    {
      localObject1 = (a)paramArrayList1.get(paramInt1);
      if ((((Boolean)paramArrayList2.get(paramInt1)).booleanValue()) && (v >= 0)) {
        v = -1;
      }
      ((a)localObject1).y();
      paramInt1++;
    }
    if (i1 != 0) {
      b1();
    }
  }
  
  public void e(a parama)
  {
    if (d == null) {
      d = new ArrayList();
    }
    d.add(parama);
  }
  
  public final void e0(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    Object localObject = L;
    int i1;
    if (localObject == null) {
      i1 = 0;
    } else {
      i1 = ((ArrayList)localObject).size();
    }
    int i2 = 0;
    for (int i3 = i1; i2 < i3; i3 = i1)
    {
      localObject = (p)L.get(i2);
      int i4;
      if ((paramArrayList1 != null) && (!a))
      {
        i1 = paramArrayList1.indexOf(b);
        if ((i1 != -1) && (paramArrayList2 != null) && (((Boolean)paramArrayList2.get(i1)).booleanValue()))
        {
          L.remove(i2);
          i4 = i2 - 1;
          i1 = i3 - 1;
        }
      }
      do
      {
        ((p)localObject).c();
        break label241;
        if (!((p)localObject).e())
        {
          i1 = i3;
          i4 = i2;
          if (paramArrayList1 == null) {
            break label241;
          }
          i1 = i3;
          i4 = i2;
          if (!b.v(paramArrayList1, 0, paramArrayList1.size())) {
            break label241;
          }
        }
        L.remove(i2);
        i4 = i2 - 1;
        i1 = i3 - 1;
        if ((paramArrayList1 == null) || (a)) {
          break;
        }
        i2 = paramArrayList1.indexOf(b);
      } while ((i2 != -1) && (paramArrayList2 != null) && (((Boolean)paramArrayList2.get(i2)).booleanValue()));
      ((p)localObject).d();
      label241:
      i2 = i4 + 1;
    }
  }
  
  public Parcelable e1()
  {
    j0();
    X();
    a0(true);
    E = true;
    M.n(true);
    ArrayList localArrayList1 = c.v();
    boolean bool = localArrayList1.isEmpty();
    Object localObject1 = null;
    if (bool)
    {
      if (D0(2)) {
        Log.v("FragmentManager", "saveAllState: no fragments!");
      }
      return null;
    }
    ArrayList localArrayList2 = c.w();
    ArrayList localArrayList3 = d;
    Object localObject2 = localObject1;
    if (localArrayList3 != null)
    {
      int i1 = localArrayList3.size();
      localObject2 = localObject1;
      if (i1 > 0)
      {
        localObject1 = new b[i1];
        for (int i2 = 0;; i2++)
        {
          localObject2 = localObject1;
          if (i2 >= i1) {
            break;
          }
          localObject1[i2] = new b((a)d.get(i2));
          if (D0(2))
          {
            localObject2 = new StringBuilder();
            ((StringBuilder)localObject2).append("saveAllState: adding back stack #");
            ((StringBuilder)localObject2).append(i2);
            ((StringBuilder)localObject2).append(": ");
            ((StringBuilder)localObject2).append(d.get(i2));
            Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
          }
        }
      }
    }
    localObject1 = new p();
    o = localArrayList1;
    p = localArrayList2;
    q = ((b[])localObject2);
    r = i.get();
    localObject2 = u;
    if (localObject2 != null) {
      s = t;
    }
    t.addAll(j.keySet());
    u.addAll(j.values());
    v = new ArrayList(C);
    return (Parcelable)localObject1;
  }
  
  public void f(Fragment paramFragment, E.c paramc)
  {
    if (m.get(paramFragment) == null) {
      m.put(paramFragment, new HashSet());
    }
    ((HashSet)m.get(paramFragment)).add(paramc);
  }
  
  public Fragment f0(String paramString)
  {
    return c.f(paramString);
  }
  
  public void f1()
  {
    int i1;
    synchronized (a)
    {
      ArrayList localArrayList2 = L;
      i1 = 0;
      if ((localArrayList2 != null) && (!localArrayList2.isEmpty())) {
        i2 = 1;
      }
    }
    int i2 = 0;
    if (a.size() == 1) {
      i1 = 1;
    }
    if ((i2 != 0) || (i1 != 0))
    {
      r.l().removeCallbacks(N);
      r.l().post(N);
      n1();
    }
    return;
    throw ((Throwable)localObject);
  }
  
  public void g(Fragment paramFragment)
  {
    if (D0(2))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("add: ");
      ((StringBuilder)localObject).append(paramFragment);
      Log.v("FragmentManager", ((StringBuilder)localObject).toString());
    }
    Object localObject = v(paramFragment);
    G = this;
    c.p((t)localObject);
    if (!O)
    {
      c.a(paramFragment);
      A = false;
      if (V == null) {
        b0 = false;
      }
      if (E0(paramFragment)) {
        D = true;
      }
    }
  }
  
  public Fragment g0(int paramInt)
  {
    return c.g(paramInt);
  }
  
  public void g1(Fragment paramFragment, boolean paramBoolean)
  {
    paramFragment = o0(paramFragment);
    if ((paramFragment != null) && ((paramFragment instanceof h))) {
      ((h)paramFragment).setDrawDisappearingViewsLast(paramBoolean ^ true);
    }
  }
  
  public void h(r paramr)
  {
    p.add(paramr);
  }
  
  public Fragment h0(String paramString)
  {
    return c.h(paramString);
  }
  
  public void h1(Fragment paramFragment, d.c paramc)
  {
    if ((paramFragment.equals(f0(t))) && ((H == null) || (G == this)))
    {
      f0 = paramc;
      return;
    }
    paramc = new StringBuilder();
    paramc.append("Fragment ");
    paramc.append(paramFragment);
    paramc.append(" is not an active fragment of FragmentManager ");
    paramc.append(this);
    throw new IllegalArgumentException(paramc.toString());
  }
  
  public void i(Fragment paramFragment)
  {
    M.e(paramFragment);
  }
  
  public Fragment i0(String paramString)
  {
    return c.i(paramString);
  }
  
  public void i1(Fragment paramFragment)
  {
    if ((paramFragment != null) && ((!paramFragment.equals(f0(t))) || ((H != null) && (G != this))))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Fragment ");
      ((StringBuilder)localObject).append(paramFragment);
      ((StringBuilder)localObject).append(" is not an active fragment of FragmentManager ");
      ((StringBuilder)localObject).append(this);
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    Object localObject = u;
    u = paramFragment;
    L((Fragment)localObject);
    L(u);
  }
  
  public int j()
  {
    return i.getAndIncrement();
  }
  
  public final void j0()
  {
    if (P)
    {
      Iterator localIterator = r().iterator();
      while (localIterator.hasNext()) {
        ((B)localIterator.next()).k();
      }
    }
    if (L != null) {
      while (!L.isEmpty()) {
        ((p)L.remove(0)).d();
      }
    }
  }
  
  public final void j1(Fragment paramFragment)
  {
    ViewGroup localViewGroup = o0(paramFragment);
    if ((localViewGroup != null) && (paramFragment.C() > 0))
    {
      if (localViewGroup.getTag(U.b.c) == null) {
        localViewGroup.setTag(U.b.c, paramFragment);
      }
      ((Fragment)localViewGroup.getTag(U.b.c)).z1(paramFragment.C());
    }
  }
  
  public void k(k paramk, g paramg, final Fragment paramFragment)
  {
    if (r == null)
    {
      r = paramk;
      s = paramg;
      t = paramFragment;
      if (paramFragment != null) {}
      for (paramg = new i(paramFragment);; paramg = (r)paramk)
      {
        h(paramg);
        break;
        if (!(paramk instanceof r)) {
          break;
        }
      }
      if (t != null) {
        n1();
      }
      if ((paramk instanceof androidx.activity.c))
      {
        paramg = (androidx.activity.c)paramk;
        OnBackPressedDispatcher localOnBackPressedDispatcher = paramg.j();
        g = localOnBackPressedDispatcher;
        if (paramFragment != null) {
          paramg = paramFragment;
        }
        localOnBackPressedDispatcher.a(paramg, h);
      }
      if (paramFragment != null) {
        paramk = G.m0(paramFragment);
      }
      for (;;)
      {
        M = paramk;
        break;
        if ((paramk instanceof androidx.lifecycle.u)) {
          paramk = q.i(((androidx.lifecycle.u)paramk).d());
        } else {
          paramk = new q(false);
        }
      }
      M.n(I0());
      c.x(M);
      paramk = r;
      if ((paramk instanceof d))
      {
        paramg = ((d)paramk).c();
        if (paramFragment != null)
        {
          paramk = new StringBuilder();
          paramk.append(t);
          paramk.append(":");
          paramk = paramk.toString();
        }
        else
        {
          paramk = "";
        }
        paramFragment = new StringBuilder();
        paramFragment.append("FragmentManager:");
        paramFragment.append(paramk);
        paramk = paramFragment.toString();
        paramFragment = new StringBuilder();
        paramFragment.append(paramk);
        paramFragment.append("StartActivityForResult");
        z = paramg.j(paramFragment.toString(), new d.c(), new j());
        paramFragment = new StringBuilder();
        paramFragment.append(paramk);
        paramFragment.append("StartIntentSenderForResult");
        A = paramg.j(paramFragment.toString(), new k(), new a());
        paramFragment = new StringBuilder();
        paramFragment.append(paramk);
        paramFragment.append("RequestPermissions");
        B = paramg.j(paramFragment.toString(), new d.b(), new b());
      }
      return;
    }
    throw new IllegalStateException("Already attached");
  }
  
  public final boolean k0(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    boolean bool;
    int i1;
    int i2;
    synchronized (a)
    {
      bool = a.isEmpty();
      i1 = 0;
      if (bool) {
        return false;
      }
    }
  }
  
  public void k1(Fragment paramFragment)
  {
    if (D0(2))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("show: ");
      localStringBuilder.append(paramFragment);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    if (N)
    {
      N = false;
      b0 ^= true;
    }
  }
  
  public void l(Fragment paramFragment)
  {
    StringBuilder localStringBuilder;
    if (D0(2))
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("attach: ");
      localStringBuilder.append(paramFragment);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    if (O)
    {
      O = false;
      if (!z)
      {
        c.a(paramFragment);
        if (D0(2))
        {
          localStringBuilder = new StringBuilder();
          localStringBuilder.append("add from attach: ");
          localStringBuilder.append(paramFragment);
          Log.v("FragmentManager", localStringBuilder.toString());
        }
        if (E0(paramFragment)) {
          D = true;
        }
      }
    }
  }
  
  public int l0()
  {
    ArrayList localArrayList = d;
    int i1;
    if (localArrayList != null) {
      i1 = localArrayList.size();
    } else {
      i1 = 0;
    }
    return i1;
  }
  
  public final void l1()
  {
    Iterator localIterator = c.k().iterator();
    while (localIterator.hasNext()) {
      Q0((t)localIterator.next());
    }
  }
  
  public v m()
  {
    return new a(this);
  }
  
  public final q m0(Fragment paramFragment)
  {
    return M.h(paramFragment);
  }
  
  public void m1(l paraml)
  {
    o.p(paraml);
  }
  
  public final void n(Fragment paramFragment)
  {
    HashSet localHashSet = (HashSet)m.get(paramFragment);
    if (localHashSet != null)
    {
      Iterator localIterator = localHashSet.iterator();
      while (localIterator.hasNext()) {
        ((E.c)localIterator.next()).a();
      }
      localHashSet.clear();
      w(paramFragment);
      m.remove(paramFragment);
    }
  }
  
  public g n0()
  {
    return s;
  }
  
  public final void n1()
  {
    boolean bool2;
    androidx.activity.b localb;
    synchronized (a)
    {
      boolean bool1 = a.isEmpty();
      bool2 = true;
      if (!bool1)
      {
        h.f(true);
        return;
      }
    }
  }
  
  public boolean o()
  {
    Iterator localIterator = c.l().iterator();
    boolean bool1 = false;
    while (localIterator.hasNext())
    {
      Fragment localFragment = (Fragment)localIterator.next();
      boolean bool2 = bool1;
      if (localFragment != null) {
        bool2 = E0(localFragment);
      }
      bool1 = bool2;
      if (bool2) {
        return true;
      }
    }
    return false;
  }
  
  public final ViewGroup o0(Fragment paramFragment)
  {
    ViewGroup localViewGroup = U;
    if (localViewGroup != null) {
      return localViewGroup;
    }
    if (L <= 0) {
      return null;
    }
    if (s.f())
    {
      paramFragment = s.e(L);
      if ((paramFragment instanceof ViewGroup)) {
        return (ViewGroup)paramFragment;
      }
    }
    return null;
  }
  
  public final void p()
  {
    if (!I0()) {
      return;
    }
    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
  }
  
  public j p0()
  {
    Object localObject = v;
    if (localObject != null) {
      return (j)localObject;
    }
    localObject = t;
    if (localObject != null) {
      return G.p0();
    }
    return w;
  }
  
  public final void q()
  {
    b = false;
    J.clear();
    I.clear();
  }
  
  public u q0()
  {
    return c;
  }
  
  public final Set r()
  {
    HashSet localHashSet = new HashSet();
    Iterator localIterator = c.k().iterator();
    while (localIterator.hasNext())
    {
      ViewGroup localViewGroup = nextkU;
      if (localViewGroup != null) {
        localHashSet.add(B.o(localViewGroup, x0()));
      }
    }
    return localHashSet;
  }
  
  public List r0()
  {
    return c.n();
  }
  
  public final Set s(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    HashSet localHashSet = new HashSet();
    while (paramInt1 < paramInt2)
    {
      Iterator localIterator = getc.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = nextb;
        if (localObject != null)
        {
          localObject = U;
          if (localObject != null) {
            localHashSet.add(B.n((ViewGroup)localObject, this));
          }
        }
      }
      paramInt1++;
    }
    return localHashSet;
  }
  
  public k s0()
  {
    return r;
  }
  
  public void t(a parama, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramBoolean1) {
      parama.r(paramBoolean3);
    } else {
      parama.q();
    }
    Object localObject1 = new ArrayList(1);
    Object localObject2 = new ArrayList(1);
    ((ArrayList)localObject1).add(parama);
    ((ArrayList)localObject2).add(Boolean.valueOf(paramBoolean1));
    if ((paramBoolean2) && (q >= 1)) {
      w.B(r.i(), s, (ArrayList)localObject1, (ArrayList)localObject2, 0, 1, true, n);
    }
    if (paramBoolean3) {
      M0(q, true);
    }
    localObject1 = c.l().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Fragment)((Iterator)localObject1).next();
      if ((localObject2 != null) && (V != null) && (a0) && (parama.u(L)))
      {
        float f1 = c0;
        if (f1 > 0.0F) {
          V.setAlpha(f1);
        }
        if (paramBoolean3)
        {
          c0 = 0.0F;
        }
        else
        {
          c0 = -1.0F;
          a0 = false;
        }
      }
    }
  }
  
  public LayoutInflater.Factory2 t0()
  {
    return f;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("FragmentManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    Object localObject = t;
    if (localObject != null)
    {
      localStringBuilder.append(localObject.getClass().getSimpleName());
      localStringBuilder.append("{");
    }
    for (localObject = t;; localObject = r)
    {
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(localObject)));
      localStringBuilder.append("}");
      break label141;
      localObject = r;
      if (localObject == null) {
        break;
      }
      localStringBuilder.append(localObject.getClass().getSimpleName());
      localStringBuilder.append("{");
    }
    localStringBuilder.append("null");
    label141:
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
  
  public final void u(final Fragment paramFragment)
  {
    if (V != null)
    {
      f.d locald = f.b(r.i(), paramFragment, N ^ true);
      if (locald != null)
      {
        final Object localObject = b;
        if (localObject != null)
        {
          ((Animator)localObject).setTarget(V);
          if (N)
          {
            if (paramFragment.X())
            {
              paramFragment.y1(false);
            }
            else
            {
              localObject = U;
              final View localView = V;
              ((ViewGroup)localObject).startViewTransition(localView);
              b.addListener(new h((ViewGroup)localObject, localView, paramFragment));
            }
          }
          else {
            V.setVisibility(0);
          }
          b.start();
          break label192;
        }
      }
      if (locald != null)
      {
        V.startAnimation(a);
        a.start();
      }
      int i1;
      if ((N) && (!paramFragment.X())) {
        i1 = 8;
      } else {
        i1 = 0;
      }
      V.setVisibility(i1);
      if (paramFragment.X()) {
        paramFragment.y1(false);
      }
    }
    label192:
    if ((z) && (E0(paramFragment))) {
      D = true;
    }
    b0 = false;
    paramFragment.w0(N);
  }
  
  public m u0()
  {
    return o;
  }
  
  public t v(Fragment paramFragment)
  {
    t localt = c.m(t);
    if (localt != null) {
      return localt;
    }
    paramFragment = new t(o, c, paramFragment);
    paramFragment.o(r.i().getClassLoader());
    paramFragment.t(q);
    return paramFragment;
  }
  
  public Fragment v0()
  {
    return t;
  }
  
  public final void w(Fragment paramFragment)
  {
    paramFragment.V0();
    o.n(paramFragment, false);
    U = null;
    V = null;
    h0 = null;
    i0.j(null);
    C = false;
  }
  
  public Fragment w0()
  {
    return u;
  }
  
  public void x(Fragment paramFragment)
  {
    StringBuilder localStringBuilder;
    if (D0(2))
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("detach: ");
      localStringBuilder.append(paramFragment);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    if (!O)
    {
      O = true;
      if (z)
      {
        if (D0(2))
        {
          localStringBuilder = new StringBuilder();
          localStringBuilder.append("remove from detach: ");
          localStringBuilder.append(paramFragment);
          Log.v("FragmentManager", localStringBuilder.toString());
        }
        c.s(paramFragment);
        if (E0(paramFragment)) {
          D = true;
        }
        j1(paramFragment);
      }
    }
  }
  
  public C x0()
  {
    Object localObject = x;
    if (localObject != null) {
      return (C)localObject;
    }
    localObject = t;
    if (localObject != null) {
      return G.x0();
    }
    return y;
  }
  
  public void y()
  {
    E = false;
    F = false;
    M.n(false);
    S(4);
  }
  
  public void z()
  {
    E = false;
    F = false;
    M.n(false);
    S(0);
  }
  
  public androidx.lifecycle.t z0(Fragment paramFragment)
  {
    return M.k(paramFragment);
  }
  
  public class a
    implements androidx.activity.result.b
  {
    public a() {}
    
    public void b(androidx.activity.result.a parama)
    {
      Object localObject = (n.m)C.pollFirst();
      if (localObject == null)
      {
        parama = new StringBuilder();
        parama.append("No IntentSenders were started for ");
        parama.append(this);
        Log.w("FragmentManager", parama.toString());
        return;
      }
      String str = o;
      int i = p;
      localObject = n.c(n.this).i(str);
      if (localObject == null)
      {
        parama = new StringBuilder();
        parama.append("Intent Sender result delivered for unknown Fragment ");
        parama.append(str);
        Log.w("FragmentManager", parama.toString());
        return;
      }
      ((Fragment)localObject).h0(i, parama.b(), parama.a());
    }
  }
  
  public class b
    implements androidx.activity.result.b
  {
    public b() {}
    
    public void b(Map paramMap)
    {
      String[] arrayOfString = (String[])paramMap.keySet().toArray(new String[0]);
      Object localObject1 = new ArrayList(paramMap.values());
      paramMap = new int[((ArrayList)localObject1).size()];
      for (int i = 0; i < ((ArrayList)localObject1).size(); i++)
      {
        int j;
        if (((Boolean)((ArrayList)localObject1).get(i)).booleanValue()) {
          j = 0;
        } else {
          j = -1;
        }
        paramMap[i] = j;
      }
      Object localObject2 = (n.m)C.pollFirst();
      if (localObject2 == null)
      {
        paramMap = new StringBuilder();
        paramMap.append("No permissions were requested for ");
        paramMap.append(this);
      }
      for (;;)
      {
        Log.w("FragmentManager", paramMap.toString());
        return;
        localObject1 = o;
        i = p;
        localObject2 = n.c(n.this).i((String)localObject1);
        if (localObject2 != null) {
          break;
        }
        paramMap = new StringBuilder();
        paramMap.append("Permission request result delivered for unknown Fragment ");
        paramMap.append((String)localObject1);
      }
      ((Fragment)localObject2).G0(i, arrayOfString, paramMap);
    }
  }
  
  public class c
    extends androidx.activity.b
  {
    public c(boolean paramBoolean)
    {
      super();
    }
    
    public void b()
    {
      A0();
    }
  }
  
  public class d
    implements w.g
  {
    public d() {}
    
    public void a(Fragment paramFragment, E.c paramc)
    {
      if (!paramc.b()) {
        X0(paramFragment, paramc);
      }
    }
    
    public void b(Fragment paramFragment, E.c paramc)
    {
      f(paramFragment, paramc);
    }
  }
  
  public class e
    extends j
  {
    public e() {}
    
    public Fragment a(ClassLoader paramClassLoader, String paramString)
    {
      return s0().b(s0().i(), paramString, null);
    }
  }
  
  public class f
    implements C
  {
    public f() {}
    
    public B a(ViewGroup paramViewGroup)
    {
      return new c(paramViewGroup);
    }
  }
  
  public class g
    implements Runnable
  {
    public g() {}
    
    public void run()
    {
      a0(true);
    }
  }
  
  public class h
    extends AnimatorListenerAdapter
  {
    public h(ViewGroup paramViewGroup, View paramView, Fragment paramFragment) {}
    
    public void onAnimationEnd(Animator paramAnimator)
    {
      localObject.endViewTransition(localView);
      paramAnimator.removeListener(this);
      Fragment localFragment = paramFragment;
      paramAnimator = V;
      if ((paramAnimator != null) && (N)) {
        paramAnimator.setVisibility(8);
      }
    }
  }
  
  public class i
    implements r
  {
    public i(Fragment paramFragment) {}
    
    public void a(n paramn, Fragment paramFragment)
    {
      paramFragment.k0(paramFragment);
    }
  }
  
  public class j
    implements androidx.activity.result.b
  {
    public j() {}
    
    public void b(androidx.activity.result.a parama)
    {
      Object localObject = (n.m)C.pollFirst();
      if (localObject == null)
      {
        parama = new StringBuilder();
        parama.append("No Activities were started for result for ");
        parama.append(this);
        Log.w("FragmentManager", parama.toString());
        return;
      }
      String str = o;
      int i = p;
      localObject = n.c(n.this).i(str);
      if (localObject == null)
      {
        parama = new StringBuilder();
        parama.append("Activity result delivered for unknown Fragment ");
        parama.append(str);
        Log.w("FragmentManager", parama.toString());
        return;
      }
      ((Fragment)localObject).h0(i, parama.b(), parama.a());
    }
  }
  
  public static class k
    extends d.a
  {
    public Intent d(Context paramContext, e parame)
    {
      Intent localIntent1 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
      Intent localIntent2 = parame.a();
      paramContext = parame;
      if (localIntent2 != null)
      {
        Bundle localBundle = localIntent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        paramContext = parame;
        if (localBundle != null)
        {
          localIntent1.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", localBundle);
          localIntent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
          paramContext = parame;
          if (localIntent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
            paramContext = new e.b(parame.d()).b(null).c(parame.c(), parame.b()).a();
          }
        }
      }
      localIntent1.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", paramContext);
      if (n.D0(2))
      {
        paramContext = new StringBuilder();
        paramContext.append("CreateIntent created the following intent: ");
        paramContext.append(localIntent1);
        Log.v("FragmentManager", paramContext.toString());
      }
      return localIntent1;
    }
    
    public androidx.activity.result.a e(int paramInt, Intent paramIntent)
    {
      return new androidx.activity.result.a(paramInt, paramIntent);
    }
  }
  
  public static abstract class l
  {
    public void a(n paramn, Fragment paramFragment, Bundle paramBundle) {}
    
    public void b(n paramn, Fragment paramFragment, Context paramContext) {}
    
    public void c(n paramn, Fragment paramFragment, Bundle paramBundle) {}
    
    public void d(n paramn, Fragment paramFragment) {}
    
    public void e(n paramn, Fragment paramFragment) {}
    
    public void f(n paramn, Fragment paramFragment) {}
    
    public void g(n paramn, Fragment paramFragment, Context paramContext) {}
    
    public void h(n paramn, Fragment paramFragment, Bundle paramBundle) {}
    
    public void i(n paramn, Fragment paramFragment) {}
    
    public void j(n paramn, Fragment paramFragment, Bundle paramBundle) {}
    
    public void k(n paramn, Fragment paramFragment) {}
    
    public void l(n paramn, Fragment paramFragment) {}
    
    public void m(n paramn, Fragment paramFragment, View paramView, Bundle paramBundle) {}
    
    public void n(n paramn, Fragment paramFragment) {}
  }
  
  public static class m
    implements Parcelable
  {
    public static final Parcelable.Creator<m> CREATOR = new a();
    public String o;
    public int p;
    
    public m(Parcel paramParcel)
    {
      o = paramParcel.readString();
      p = paramParcel.readInt();
    }
    
    public m(String paramString, int paramInt)
    {
      o = paramString;
      p = paramInt;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeString(o);
      paramParcel.writeInt(p);
    }
    
    public class a
      implements Parcelable.Creator
    {
      public n.m a(Parcel paramParcel)
      {
        return new n.m(paramParcel);
      }
      
      public n.m[] b(int paramInt)
      {
        return new n.m[paramInt];
      }
    }
  }
  
  public static abstract interface n
  {
    public abstract boolean a(ArrayList paramArrayList1, ArrayList paramArrayList2);
  }
  
  public class o
    implements n.n
  {
    public final String a;
    public final int b;
    public final int c;
    
    public o(String paramString, int paramInt1, int paramInt2)
    {
      a = paramString;
      b = paramInt1;
      c = paramInt2;
    }
    
    public boolean a(ArrayList paramArrayList1, ArrayList paramArrayList2)
    {
      Fragment localFragment = u;
      if ((localFragment != null) && (b < 0) && (a == null) && (localFragment.s().S0())) {
        return false;
      }
      return U0(paramArrayList1, paramArrayList2, a, b, c);
    }
  }
  
  public static class p
    implements Fragment.k
  {
    public final boolean a;
    public final a b;
    public int c;
    
    public p(a parama, boolean paramBoolean)
    {
      a = paramBoolean;
      b = parama;
    }
    
    public void a()
    {
      int i = c - 1;
      c = i;
      if (i != 0) {
        return;
      }
      b.t.f1();
    }
    
    public void b()
    {
      c += 1;
    }
    
    public void c()
    {
      a locala = b;
      t.t(locala, a, false, false);
    }
    
    public void d()
    {
      int i;
      if (c > 0) {
        i = 1;
      } else {
        i = 0;
      }
      Object localObject = b.t.r0().iterator();
      while (((Iterator)localObject).hasNext())
      {
        Fragment localFragment = (Fragment)((Iterator)localObject).next();
        localFragment.B1(null);
        if ((i != 0) && (localFragment.a0())) {
          localFragment.G1();
        }
      }
      localObject = b;
      t.t((a)localObject, a, i ^ 0x1, true);
    }
    
    public boolean e()
    {
      boolean bool;
      if (c == 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */