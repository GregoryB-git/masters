package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.d.b;
import androidx.lifecycle.d.c;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.lifecycle.l;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import w.m;

public abstract class Fragment
  implements ComponentCallbacks, View.OnCreateContextMenuListener, h, u, androidx.savedstate.c
{
  public static final Object n0 = new Object();
  public boolean A;
  public boolean B;
  public boolean C;
  public boolean D;
  public boolean E;
  public int F;
  public n G;
  public k H;
  public n I = new o();
  public Fragment J;
  public int K;
  public int L;
  public String M;
  public boolean N;
  public boolean O;
  public boolean P;
  public boolean Q;
  public boolean R;
  public boolean S = true;
  public boolean T;
  public ViewGroup U;
  public View V;
  public boolean W;
  public boolean X = true;
  public h Y;
  public Runnable Z = new a();
  public boolean a0;
  public boolean b0;
  public float c0;
  public LayoutInflater d0;
  public boolean e0;
  public d.c f0 = d.c.s;
  public i g0;
  public z h0;
  public l i0 = new l();
  public androidx.savedstate.b j0;
  public int k0;
  public final AtomicInteger l0 = new AtomicInteger();
  public final ArrayList m0 = new ArrayList();
  public int o = -1;
  public Bundle p;
  public SparseArray q;
  public Bundle r;
  public Boolean s;
  public String t = UUID.randomUUID().toString();
  public Bundle u;
  public Fragment v;
  public String w = null;
  public int x;
  public Boolean y = null;
  public boolean z;
  
  public Fragment()
  {
    T();
  }
  
  public static Fragment V(Context paramContext, String paramString, Bundle paramBundle)
  {
    try
    {
      paramContext = (Fragment)j.d(paramContext.getClassLoader(), paramString).getConstructor(new Class[0]).newInstance(new Object[0]);
      if (paramBundle != null)
      {
        paramBundle.setClassLoader(paramContext.getClass().getClassLoader());
        paramContext.w1(paramBundle);
      }
    }
    catch (InvocationTargetException paramContext)
    {
      break label67;
    }
    catch (NoSuchMethodException paramContext)
    {
      break label108;
    }
    catch (IllegalAccessException paramBundle)
    {
      break label149;
    }
    catch (InstantiationException paramBundle)
    {
      break label190;
    }
    return paramContext;
    label67:
    paramBundle = new StringBuilder();
    paramBundle.append("Unable to instantiate fragment ");
    paramBundle.append(paramString);
    paramBundle.append(": calling Fragment constructor caused an exception");
    throw new i(paramBundle.toString(), paramContext);
    label108:
    paramBundle = new StringBuilder();
    paramBundle.append("Unable to instantiate fragment ");
    paramBundle.append(paramString);
    paramBundle.append(": could not find Fragment constructor");
    throw new i(paramBundle.toString(), paramContext);
    label149:
    paramContext = new StringBuilder();
    paramContext.append("Unable to instantiate fragment ");
    paramContext.append(paramString);
    paramContext.append(": make sure class name exists, is public, and has an empty constructor that is public");
    throw new i(paramContext.toString(), paramBundle);
    label190:
    paramContext = new StringBuilder();
    paramContext.append("Unable to instantiate fragment ");
    paramContext.append(paramString);
    paramContext.append(": make sure class name exists, is public, and has an empty constructor that is public");
    throw new i(paramContext.toString(), paramBundle);
  }
  
  public LayoutInflater A(Bundle paramBundle)
  {
    paramBundle = H;
    if (paramBundle != null)
    {
      paramBundle = paramBundle.n();
      I.g.a(paramBundle, I.t0());
      return paramBundle;
    }
    throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
  }
  
  public boolean A0(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public void A1(int paramInt)
  {
    if ((Y == null) && (paramInt == 0)) {
      return;
    }
    i();
    Y.d = paramInt;
  }
  
  public final int B()
  {
    d.c localc = f0;
    if ((localc != d.c.p) && (J != null)) {
      return Math.min(localc.ordinal(), J.B());
    }
    return localc.ordinal();
  }
  
  public void B0(Menu paramMenu) {}
  
  public void B1(k paramk)
  {
    i();
    h localh = Y;
    k localk = r;
    if (paramk == localk) {
      return;
    }
    if ((paramk != null) && (localk != null))
    {
      paramk = new StringBuilder();
      paramk.append("Trying to set a replacement startPostponedEnterTransition on ");
      paramk.append(this);
      throw new IllegalStateException(paramk.toString());
    }
    if (q) {
      r = paramk;
    }
    if (paramk != null) {
      paramk.b();
    }
  }
  
  public int C()
  {
    h localh = Y;
    if (localh == null) {
      return 0;
    }
    return c;
  }
  
  public void C0()
  {
    T = true;
  }
  
  public void C1(float paramFloat)
  {
    io = paramFloat;
  }
  
  public int D()
  {
    h localh = Y;
    if (localh == null) {
      return 0;
    }
    return d;
  }
  
  public void D0(boolean paramBoolean) {}
  
  public void D1(boolean paramBoolean)
  {
    P = paramBoolean;
    n localn = G;
    if (localn != null)
    {
      if (paramBoolean) {
        localn.i(this);
      } else {
        localn.a1(this);
      }
    }
    else {
      Q = true;
    }
  }
  
  public final Fragment E()
  {
    return J;
  }
  
  public void E0(Menu paramMenu) {}
  
  public void E1(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    i();
    h localh = Y;
    e = paramArrayList1;
    f = paramArrayList2;
  }
  
  public final n F()
  {
    Object localObject = G;
    if (localObject != null) {
      return (n)localObject;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Fragment ");
    ((StringBuilder)localObject).append(this);
    ((StringBuilder)localObject).append(" not associated with a fragment manager.");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public void F0(boolean paramBoolean) {}
  
  public void F1(Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    if (H != null)
    {
      F().J0(this, paramIntent, paramInt, paramBundle);
      return;
    }
    paramIntent = new StringBuilder();
    paramIntent.append("Fragment ");
    paramIntent.append(this);
    paramIntent.append(" not attached to Activity");
    throw new IllegalStateException(paramIntent.toString());
  }
  
  public float G()
  {
    h localh = Y;
    if (localh == null) {
      return 1.0F;
    }
    return o;
  }
  
  public void G0(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt) {}
  
  public void G1()
  {
    if ((Y != null) && (iq)) {
      if (H == null) {
        iq = false;
      } else if (Looper.myLooper() != H.l().getLooper()) {
        H.l().postAtFrontOfQueue(new b());
      } else {
        e(true);
      }
    }
  }
  
  public Object H()
  {
    Object localObject1 = Y;
    if (localObject1 == null) {
      return null;
    }
    Object localObject2 = j;
    localObject1 = localObject2;
    if (localObject2 == n0) {
      localObject1 = w();
    }
    return localObject1;
  }
  
  public void H0()
  {
    T = true;
  }
  
  public final Resources I()
  {
    return p1().getResources();
  }
  
  public void I0(Bundle paramBundle) {}
  
  public final boolean J()
  {
    return P;
  }
  
  public void J0()
  {
    T = true;
  }
  
  public Object K()
  {
    Object localObject1 = Y;
    if (localObject1 == null) {
      return null;
    }
    Object localObject2 = h;
    localObject1 = localObject2;
    if (localObject2 == n0) {
      localObject1 = u();
    }
    return localObject1;
  }
  
  public void K0()
  {
    T = true;
  }
  
  public Object L()
  {
    h localh = Y;
    if (localh == null) {
      return null;
    }
    return k;
  }
  
  public void L0(View paramView, Bundle paramBundle) {}
  
  public Object M()
  {
    Object localObject1 = Y;
    if (localObject1 == null) {
      return null;
    }
    Object localObject2 = l;
    localObject1 = localObject2;
    if (localObject2 == n0) {
      localObject1 = L();
    }
    return localObject1;
  }
  
  public void M0(Bundle paramBundle)
  {
    T = true;
  }
  
  public ArrayList N()
  {
    Object localObject = Y;
    if (localObject != null)
    {
      localObject = e;
      if (localObject != null) {
        return (ArrayList)localObject;
      }
    }
    return new ArrayList();
  }
  
  public void N0(Bundle paramBundle)
  {
    I.P0();
    o = 3;
    T = false;
    g0(paramBundle);
    if (T)
    {
      s1();
      I.y();
      return;
    }
    paramBundle = new StringBuilder();
    paramBundle.append("Fragment ");
    paramBundle.append(this);
    paramBundle.append(" did not call through to super.onActivityCreated()");
    throw new D(paramBundle.toString());
  }
  
  public ArrayList O()
  {
    Object localObject = Y;
    if (localObject != null)
    {
      localObject = f;
      if (localObject != null) {
        return (ArrayList)localObject;
      }
    }
    return new ArrayList();
  }
  
  public void O0()
  {
    Object localObject = m0.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((j)((Iterator)localObject).next()).a();
    }
    m0.clear();
    I.k(H, f(), this);
    o = 0;
    T = false;
    j0(H.i());
    if (T)
    {
      G.I(this);
      I.z();
      return;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Fragment ");
    ((StringBuilder)localObject).append(this);
    ((StringBuilder)localObject).append(" did not call through to super.onAttach()");
    throw new D(((StringBuilder)localObject).toString());
  }
  
  public final String P(int paramInt)
  {
    return I().getString(paramInt);
  }
  
  public void P0(Configuration paramConfiguration)
  {
    onConfigurationChanged(paramConfiguration);
    I.A(paramConfiguration);
  }
  
  public final Fragment Q()
  {
    Object localObject = v;
    if (localObject != null) {
      return (Fragment)localObject;
    }
    localObject = G;
    if (localObject != null)
    {
      String str = w;
      if (str != null) {
        return ((n)localObject).f0(str);
      }
    }
    return null;
  }
  
  public boolean Q0(MenuItem paramMenuItem)
  {
    if (!N)
    {
      if (l0(paramMenuItem)) {
        return true;
      }
      return I.B(paramMenuItem);
    }
    return false;
  }
  
  public View R()
  {
    return V;
  }
  
  public void R0(Bundle paramBundle)
  {
    I.P0();
    o = 1;
    T = false;
    g0.a(new f()
    {
      public void a(h paramAnonymoush, d.b paramAnonymousb)
      {
        if (paramAnonymousb == d.b.ON_STOP)
        {
          paramAnonymoush = V;
          if (paramAnonymoush != null) {
            paramAnonymoush.cancelPendingInputEvents();
          }
        }
      }
    });
    j0.c(paramBundle);
    m0(paramBundle);
    e0 = true;
    if (T)
    {
      g0.h(d.b.ON_CREATE);
      return;
    }
    paramBundle = new StringBuilder();
    paramBundle.append("Fragment ");
    paramBundle.append(this);
    paramBundle.append(" did not call through to super.onCreate()");
    throw new D(paramBundle.toString());
  }
  
  public LiveData S()
  {
    return i0;
  }
  
  public boolean S0(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    boolean bool1 = N;
    boolean bool2 = false;
    int i = 0;
    if (!bool1)
    {
      int j = i;
      if (R)
      {
        j = i;
        if (S)
        {
          p0(paramMenu, paramMenuInflater);
          j = 1;
        }
      }
      bool2 = j | I.D(paramMenu, paramMenuInflater);
    }
    return bool2;
  }
  
  public final void T()
  {
    g0 = new i(this);
    j0 = androidx.savedstate.b.a(this);
  }
  
  public void T0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    I.P0();
    E = true;
    h0 = new z();
    paramLayoutInflater = q0(paramLayoutInflater, paramViewGroup, paramBundle);
    V = paramLayoutInflater;
    if (paramLayoutInflater != null)
    {
      h0.b();
      v.a(V, h0);
      w.a(V, this);
      androidx.savedstate.d.a(V, h0);
      i0.j(h0);
    }
    else
    {
      if (h0.c()) {
        break label107;
      }
      h0 = null;
    }
    return;
    label107:
    throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
  }
  
  public void U()
  {
    T();
    t = UUID.randomUUID().toString();
    z = false;
    A = false;
    B = false;
    C = false;
    D = false;
    F = 0;
    G = null;
    I = new o();
    H = null;
    K = 0;
    L = 0;
    M = null;
    N = false;
    O = false;
  }
  
  public void U0()
  {
    I.E();
    g0.h(d.b.ON_DESTROY);
    o = 0;
    T = false;
    e0 = false;
    r0();
    if (T) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Fragment ");
    localStringBuilder.append(this);
    localStringBuilder.append(" did not call through to super.onDestroy()");
    throw new D(localStringBuilder.toString());
  }
  
  public void V0()
  {
    I.F();
    if ((V != null) && (h0.g().b().c(d.c.q))) {
      h0.a(d.b.ON_DESTROY);
    }
    o = 1;
    T = false;
    t0();
    if (T)
    {
      Y.a.b(this).c();
      E = false;
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Fragment ");
    localStringBuilder.append(this);
    localStringBuilder.append(" did not call through to super.onDestroyView()");
    throw new D(localStringBuilder.toString());
  }
  
  public final boolean W()
  {
    boolean bool;
    if ((H != null) && (z)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void W0()
  {
    o = -1;
    T = false;
    u0();
    d0 = null;
    if (T)
    {
      if (!I.C0())
      {
        I.E();
        I = new o();
      }
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Fragment ");
    localStringBuilder.append(this);
    localStringBuilder.append(" did not call through to super.onDetach()");
    throw new D(localStringBuilder.toString());
  }
  
  public boolean X()
  {
    h localh = Y;
    if (localh == null) {
      return false;
    }
    return s;
  }
  
  public LayoutInflater X0(Bundle paramBundle)
  {
    paramBundle = v0(paramBundle);
    d0 = paramBundle;
    return paramBundle;
  }
  
  public final boolean Y()
  {
    boolean bool;
    if (F > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void Y0()
  {
    onLowMemory();
    I.G();
  }
  
  public final boolean Z()
  {
    if (S)
    {
      n localn = G;
      if ((localn == null) || (localn.F0(J))) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public void Z0(boolean paramBoolean)
  {
    z0(paramBoolean);
    I.H(paramBoolean);
  }
  
  public boolean a0()
  {
    h localh = Y;
    if (localh == null) {
      return false;
    }
    return q;
  }
  
  public boolean a1(MenuItem paramMenuItem)
  {
    if (!N)
    {
      if ((R) && (S) && (A0(paramMenuItem))) {
        return true;
      }
      return I.J(paramMenuItem);
    }
    return false;
  }
  
  public final boolean b0()
  {
    return A;
  }
  
  public void b1(Menu paramMenu)
  {
    if (!N)
    {
      if ((R) && (S)) {
        B0(paramMenu);
      }
      I.K(paramMenu);
    }
  }
  
  public final boolean c0()
  {
    Fragment localFragment = E();
    boolean bool;
    if ((localFragment != null) && ((localFragment.b0()) || (localFragment.c0()))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void c1()
  {
    I.M();
    if (V != null) {
      h0.a(d.b.ON_PAUSE);
    }
    g0.h(d.b.ON_PAUSE);
    o = 6;
    T = false;
    C0();
    if (T) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Fragment ");
    localStringBuilder.append(this);
    localStringBuilder.append(" did not call through to super.onPause()");
    throw new D(localStringBuilder.toString());
  }
  
  public t d()
  {
    if (G != null)
    {
      if (B() != d.c.p.ordinal()) {
        return G.z0(this);
      }
      throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }
    throw new IllegalStateException("Can't access ViewModels from detached fragment");
  }
  
  public final boolean d0()
  {
    boolean bool;
    if (o >= 7) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void d1(boolean paramBoolean)
  {
    D0(paramBoolean);
    I.N(paramBoolean);
  }
  
  public void e(boolean paramBoolean)
  {
    Object localObject1 = Y;
    final Object localObject2 = null;
    if (localObject1 != null)
    {
      q = false;
      localObject2 = r;
      r = null;
    }
    if (localObject2 != null)
    {
      ((k)localObject2).a();
    }
    else if ((n.P) && (V != null))
    {
      localObject1 = U;
      if (localObject1 != null)
      {
        localObject2 = G;
        if (localObject2 != null)
        {
          localObject2 = B.n((ViewGroup)localObject1, (n)localObject2);
          ((B)localObject2).p();
          if (paramBoolean) {
            H.l().post(new c((B)localObject2));
          } else {
            ((B)localObject2).g();
          }
        }
      }
    }
  }
  
  public final boolean e0()
  {
    n localn = G;
    if (localn == null) {
      return false;
    }
    return localn.I0();
  }
  
  public boolean e1(Menu paramMenu)
  {
    boolean bool1 = N;
    boolean bool2 = false;
    int i = 0;
    if (!bool1)
    {
      int j = i;
      if (R)
      {
        j = i;
        if (S)
        {
          E0(paramMenu);
          j = 1;
        }
      }
      bool2 = j | I.O(paramMenu);
    }
    return bool2;
  }
  
  public final boolean equals(Object paramObject)
  {
    return super.equals(paramObject);
  }
  
  public g f()
  {
    return new d();
  }
  
  public void f0()
  {
    I.P0();
  }
  
  public void f1()
  {
    boolean bool = G.G0(this);
    Boolean localBoolean = y;
    if ((localBoolean == null) || (localBoolean.booleanValue() != bool))
    {
      y = Boolean.valueOf(bool);
      F0(bool);
      I.P();
    }
  }
  
  public androidx.lifecycle.d g()
  {
    return g0;
  }
  
  public void g0(Bundle paramBundle)
  {
    T = true;
  }
  
  public void g1()
  {
    I.P0();
    I.a0(true);
    o = 7;
    T = false;
    H0();
    if (T)
    {
      i locali = g0;
      localObject = d.b.ON_RESUME;
      locali.h((d.b)localObject);
      if (V != null) {
        h0.a((d.b)localObject);
      }
      I.Q();
      return;
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Fragment ");
    ((StringBuilder)localObject).append(this);
    ((StringBuilder)localObject).append(" did not call through to super.onResume()");
    throw new D(((StringBuilder)localObject).toString());
  }
  
  public void h(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mFragmentId=#");
    paramPrintWriter.print(Integer.toHexString(K));
    paramPrintWriter.print(" mContainerId=#");
    paramPrintWriter.print(Integer.toHexString(L));
    paramPrintWriter.print(" mTag=");
    paramPrintWriter.println(M);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mState=");
    paramPrintWriter.print(o);
    paramPrintWriter.print(" mWho=");
    paramPrintWriter.print(t);
    paramPrintWriter.print(" mBackStackNesting=");
    paramPrintWriter.println(F);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mAdded=");
    paramPrintWriter.print(z);
    paramPrintWriter.print(" mRemoving=");
    paramPrintWriter.print(A);
    paramPrintWriter.print(" mFromLayout=");
    paramPrintWriter.print(B);
    paramPrintWriter.print(" mInLayout=");
    paramPrintWriter.println(C);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mHidden=");
    paramPrintWriter.print(N);
    paramPrintWriter.print(" mDetached=");
    paramPrintWriter.print(O);
    paramPrintWriter.print(" mMenuVisible=");
    paramPrintWriter.print(S);
    paramPrintWriter.print(" mHasMenu=");
    paramPrintWriter.println(R);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mRetainInstance=");
    paramPrintWriter.print(P);
    paramPrintWriter.print(" mUserVisibleHint=");
    paramPrintWriter.println(X);
    if (G != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mFragmentManager=");
      paramPrintWriter.println(G);
    }
    if (H != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mHost=");
      paramPrintWriter.println(H);
    }
    if (J != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mParentFragment=");
      paramPrintWriter.println(J);
    }
    if (u != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mArguments=");
      paramPrintWriter.println(u);
    }
    if (p != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedFragmentState=");
      paramPrintWriter.println(p);
    }
    if (q != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedViewState=");
      paramPrintWriter.println(q);
    }
    if (r != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedViewRegistryState=");
      paramPrintWriter.println(r);
    }
    Object localObject = Q();
    if (localObject != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTarget=");
      paramPrintWriter.print(localObject);
      paramPrintWriter.print(" mTargetRequestCode=");
      paramPrintWriter.println(x);
    }
    if (C() != 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mNextAnim=");
      paramPrintWriter.println(C());
    }
    if (U != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mContainer=");
      paramPrintWriter.println(U);
    }
    if (V != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mView=");
      paramPrintWriter.println(V);
    }
    if (q() != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAnimatingAway=");
      paramPrintWriter.println(q());
    }
    if (t() != null) {
      Y.a.b(this).a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    paramPrintWriter.print(paramString);
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Child ");
    ((StringBuilder)localObject).append(I);
    ((StringBuilder)localObject).append(":");
    paramPrintWriter.println(((StringBuilder)localObject).toString());
    n localn = I;
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("  ");
    localn.W(((StringBuilder)localObject).toString(), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public void h0(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (n.D0(2))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Fragment ");
      localStringBuilder.append(this);
      localStringBuilder.append(" received the following in onActivityResult(): requestCode: ");
      localStringBuilder.append(paramInt1);
      localStringBuilder.append(" resultCode: ");
      localStringBuilder.append(paramInt2);
      localStringBuilder.append(" data: ");
      localStringBuilder.append(paramIntent);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
  }
  
  public void h1(Bundle paramBundle)
  {
    I0(paramBundle);
    j0.d(paramBundle);
    Parcelable localParcelable = I.e1();
    if (localParcelable != null) {
      paramBundle.putParcelable("android:support:fragments", localParcelable);
    }
  }
  
  public final int hashCode()
  {
    return super.hashCode();
  }
  
  public final h i()
  {
    if (Y == null) {
      Y = new h();
    }
    return Y;
  }
  
  public void i0(Activity paramActivity)
  {
    T = true;
  }
  
  public void i1()
  {
    I.P0();
    I.a0(true);
    o = 5;
    T = false;
    J0();
    if (T)
    {
      localObject = g0;
      d.b localb = d.b.ON_START;
      ((i)localObject).h(localb);
      if (V != null) {
        h0.a(localb);
      }
      I.R();
      return;
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Fragment ");
    ((StringBuilder)localObject).append(this);
    ((StringBuilder)localObject).append(" did not call through to super.onStart()");
    throw new D(((StringBuilder)localObject).toString());
  }
  
  public void j0(Context paramContext)
  {
    T = true;
    paramContext = H;
    if (paramContext == null) {
      paramContext = null;
    } else {
      paramContext = paramContext.h();
    }
    if (paramContext != null)
    {
      T = false;
      i0(paramContext);
    }
  }
  
  public void j1()
  {
    I.T();
    if (V != null) {
      h0.a(d.b.ON_STOP);
    }
    g0.h(d.b.ON_STOP);
    o = 4;
    T = false;
    K0();
    if (T) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Fragment ");
    localStringBuilder.append(this);
    localStringBuilder.append(" did not call through to super.onStop()");
    throw new D(localStringBuilder.toString());
  }
  
  public final SavedStateRegistry k()
  {
    return j0.b();
  }
  
  public void k0(Fragment paramFragment) {}
  
  public void k1()
  {
    L0(V, p);
    I.U();
  }
  
  public Fragment l(String paramString)
  {
    if (paramString.equals(t)) {
      return this;
    }
    return I.i0(paramString);
  }
  
  public boolean l0(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final androidx.activity.result.c l1(final d.a parama, final o.a parama1, final androidx.activity.result.b paramb)
  {
    if (o <= 1)
    {
      final AtomicReference localAtomicReference = new AtomicReference();
      n1(new f(parama1, localAtomicReference, parama, paramb));
      return new g(localAtomicReference, parama);
    }
    parama = new StringBuilder();
    parama.append("Fragment ");
    parama.append(this);
    parama.append(" is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    throw new IllegalStateException(parama.toString());
  }
  
  public String m()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("fragment_");
    localStringBuilder.append(t);
    localStringBuilder.append("_rq#");
    localStringBuilder.append(l0.getAndIncrement());
    return localStringBuilder.toString();
  }
  
  public void m0(Bundle paramBundle)
  {
    T = true;
    r1(paramBundle);
    if (!I.H0(1)) {
      I.C();
    }
  }
  
  public final androidx.activity.result.c m1(d.a parama, androidx.activity.result.b paramb)
  {
    return l1(parama, new e(), paramb);
  }
  
  public final e n()
  {
    Object localObject = H;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = (e)((k)localObject).h();
    }
    return (e)localObject;
  }
  
  public Animation n0(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    return null;
  }
  
  public final void n1(j paramj)
  {
    if (o >= 0) {
      paramj.a();
    } else {
      m0.add(paramj);
    }
  }
  
  public boolean o()
  {
    Object localObject = Y;
    if (localObject != null)
    {
      localObject = n;
      if (localObject != null) {
        return ((Boolean)localObject).booleanValue();
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public Animator o0(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    return null;
  }
  
  public final e o1()
  {
    Object localObject = n();
    if (localObject != null) {
      return (e)localObject;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Fragment ");
    ((StringBuilder)localObject).append(this);
    ((StringBuilder)localObject).append(" not attached to an activity.");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    T = true;
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    o1().onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
  }
  
  public void onLowMemory()
  {
    T = true;
  }
  
  public boolean p()
  {
    Object localObject = Y;
    if (localObject != null)
    {
      localObject = m;
      if (localObject != null) {
        return ((Boolean)localObject).booleanValue();
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public void p0(Menu paramMenu, MenuInflater paramMenuInflater) {}
  
  public final Context p1()
  {
    Object localObject = t();
    if (localObject != null) {
      return (Context)localObject;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Fragment ");
    ((StringBuilder)localObject).append(this);
    ((StringBuilder)localObject).append(" not attached to a context.");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public View q()
  {
    h localh = Y;
    if (localh == null) {
      return null;
    }
    return a;
  }
  
  public View q0(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    int i = k0;
    if (i != 0) {
      return paramLayoutInflater.inflate(i, paramViewGroup, false);
    }
    return null;
  }
  
  public final View q1()
  {
    Object localObject = R();
    if (localObject != null) {
      return (View)localObject;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Fragment ");
    ((StringBuilder)localObject).append(this);
    ((StringBuilder)localObject).append(" did not return a View from onCreateView() or this was called before onCreateView().");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public Animator r()
  {
    h localh = Y;
    if (localh == null) {
      return null;
    }
    return b;
  }
  
  public void r0()
  {
    T = true;
  }
  
  public void r1(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      paramBundle = paramBundle.getParcelable("android:support:fragments");
      if (paramBundle != null)
      {
        I.c1(paramBundle);
        I.C();
      }
    }
  }
  
  public final n s()
  {
    if (H != null) {
      return I;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Fragment ");
    localStringBuilder.append(this);
    localStringBuilder.append(" has not been attached yet.");
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public void s0() {}
  
  public final void s1()
  {
    if (n.D0(3))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("moveto RESTORE_VIEW_STATE: ");
      localStringBuilder.append(this);
      Log.d("FragmentManager", localStringBuilder.toString());
    }
    if (V != null) {
      t1(p);
    }
    p = null;
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    F1(paramIntent, paramInt, null);
  }
  
  public Context t()
  {
    Object localObject = H;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((k)localObject).i();
    }
    return (Context)localObject;
  }
  
  public void t0()
  {
    T = true;
  }
  
  public final void t1(Bundle paramBundle)
  {
    SparseArray localSparseArray = q;
    if (localSparseArray != null)
    {
      V.restoreHierarchyState(localSparseArray);
      q = null;
    }
    if (V != null)
    {
      h0.d(r);
      r = null;
    }
    T = false;
    M0(paramBundle);
    if (T)
    {
      if (V != null) {
        h0.a(d.b.ON_CREATE);
      }
      return;
    }
    paramBundle = new StringBuilder();
    paramBundle.append("Fragment ");
    paramBundle.append(this);
    paramBundle.append(" did not call through to super.onViewStateRestored()");
    throw new D(paramBundle.toString());
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append(getClass().getSimpleName());
    localStringBuilder.append("{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append("}");
    localStringBuilder.append(" (");
    localStringBuilder.append(t);
    localStringBuilder.append(")");
    if (K != 0)
    {
      localStringBuilder.append(" id=0x");
      localStringBuilder.append(Integer.toHexString(K));
    }
    if (M != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(M);
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public Object u()
  {
    h localh = Y;
    if (localh == null) {
      return null;
    }
    return g;
  }
  
  public void u0()
  {
    T = true;
  }
  
  public void u1(View paramView)
  {
    ia = paramView;
  }
  
  public m v()
  {
    h localh = Y;
    if (localh == null) {
      return null;
    }
    localh.getClass();
    return null;
  }
  
  public LayoutInflater v0(Bundle paramBundle)
  {
    return A(paramBundle);
  }
  
  public void v1(Animator paramAnimator)
  {
    ib = paramAnimator;
  }
  
  public Object w()
  {
    h localh = Y;
    if (localh == null) {
      return null;
    }
    return i;
  }
  
  public void w0(boolean paramBoolean) {}
  
  public void w1(Bundle paramBundle)
  {
    if ((G != null) && (e0())) {
      throw new IllegalStateException("Fragment already added and state has been saved");
    }
    u = paramBundle;
  }
  
  public m x()
  {
    h localh = Y;
    if (localh == null) {
      return null;
    }
    localh.getClass();
    return null;
  }
  
  public void x0(Activity paramActivity, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    T = true;
  }
  
  public void x1(View paramView)
  {
    ip = paramView;
  }
  
  public View y()
  {
    h localh = Y;
    if (localh == null) {
      return null;
    }
    return p;
  }
  
  public void y0(Context paramContext, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    T = true;
    paramContext = H;
    if (paramContext == null) {
      paramContext = null;
    } else {
      paramContext = paramContext.h();
    }
    if (paramContext != null)
    {
      T = false;
      x0(paramContext, paramAttributeSet, paramBundle);
    }
  }
  
  public void y1(boolean paramBoolean)
  {
    is = paramBoolean;
  }
  
  public final Object z()
  {
    Object localObject = H;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((k)localObject).m();
    }
    return localObject;
  }
  
  public void z0(boolean paramBoolean) {}
  
  public void z1(int paramInt)
  {
    if ((Y == null) && (paramInt == 0)) {
      return;
    }
    ic = paramInt;
  }
  
  public class a
    implements Runnable
  {
    public a() {}
    
    public void run()
    {
      G1();
    }
  }
  
  public class b
    implements Runnable
  {
    public b() {}
    
    public void run()
    {
      e(false);
    }
  }
  
  public class c
    implements Runnable
  {
    public c(B paramB) {}
    
    public void run()
    {
      localObject2.g();
    }
  }
  
  public class d
    extends g
  {
    public d() {}
    
    public View e(int paramInt)
    {
      Object localObject = V;
      if (localObject != null) {
        return ((View)localObject).findViewById(paramInt);
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Fragment ");
      ((StringBuilder)localObject).append(Fragment.this);
      ((StringBuilder)localObject).append(" does not have a view");
      throw new IllegalStateException(((StringBuilder)localObject).toString());
    }
    
    public boolean f()
    {
      boolean bool;
      if (V != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public class e
    implements o.a
  {
    public e() {}
    
    public ActivityResultRegistry a(Void paramVoid)
    {
      Fragment localFragment = Fragment.this;
      paramVoid = H;
      if ((paramVoid instanceof androidx.activity.result.d)) {
        return ((androidx.activity.result.d)paramVoid).c();
      }
      return localFragment.o1().c();
    }
  }
  
  public class f
    extends Fragment.j
  {
    public f(o.a parama, AtomicReference paramAtomicReference, d.a parama1, androidx.activity.result.b paramb)
    {
      super();
    }
    
    public void a()
    {
      String str = m();
      ActivityResultRegistry localActivityResultRegistry = (ActivityResultRegistry)parama1.apply(null);
      localAtomicReference.set(localActivityResultRegistry.i(str, Fragment.this, parama, paramb));
    }
  }
  
  public class g
    extends androidx.activity.result.c
  {
    public g(AtomicReference paramAtomicReference, d.a parama) {}
    
    public void b(Object paramObject, w.b paramb)
    {
      androidx.activity.result.c localc = (androidx.activity.result.c)localAtomicReference.get();
      if (localc != null)
      {
        localc.b(paramObject, paramb);
        return;
      }
      throw new IllegalStateException("Operation cannot be started before fragment is in created state");
    }
    
    public void c()
    {
      androidx.activity.result.c localc = (androidx.activity.result.c)localAtomicReference.getAndSet(null);
      if (localc != null) {
        localc.c();
      }
    }
  }
  
  public static class h
  {
    public View a;
    public Animator b;
    public int c;
    public int d;
    public ArrayList e;
    public ArrayList f;
    public Object g = null;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Boolean m;
    public Boolean n;
    public float o;
    public View p;
    public boolean q;
    public Fragment.k r;
    public boolean s;
    
    public h()
    {
      Object localObject = Fragment.n0;
      h = localObject;
      i = null;
      j = localObject;
      k = null;
      l = localObject;
      o = 1.0F;
      p = null;
    }
  }
  
  public static class i
    extends RuntimeException
  {
    public i(String paramString, Exception paramException)
    {
      super(paramException);
    }
  }
  
  public static abstract class j
  {
    public abstract void a();
  }
  
  public static abstract interface k
  {
    public abstract void a();
    
    public abstract void b();
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.Fragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */