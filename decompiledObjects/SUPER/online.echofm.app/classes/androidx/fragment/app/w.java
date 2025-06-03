package androidx.fragment.app;

import E.c;
import I.q;
import I.s;
import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import t.h;

public abstract class w
{
  public static final int[] a = { 0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10 };
  public static final y b = new x();
  public static final y c = w();
  
  public static void A(ArrayList paramArrayList, int paramInt)
  {
    if (paramArrayList == null) {
      return;
    }
    for (int i = paramArrayList.size() - 1; i >= 0; i--) {
      ((View)paramArrayList.get(i)).setVisibility(paramInt);
    }
  }
  
  public static void B(Context paramContext, g paramg, ArrayList paramArrayList1, ArrayList paramArrayList2, int paramInt1, int paramInt2, boolean paramBoolean, g paramg1)
  {
    SparseArray localSparseArray = new SparseArray();
    Object localObject;
    for (int i = paramInt1; i < paramInt2; i++)
    {
      localObject = (a)paramArrayList1.get(i);
      if (((Boolean)paramArrayList2.get(i)).booleanValue()) {
        e((a)localObject, localSparseArray, paramBoolean);
      } else {
        c((a)localObject, localSparseArray, paramBoolean);
      }
    }
    if (localSparseArray.size() != 0)
    {
      paramContext = new View(paramContext);
      int j = localSparseArray.size();
      for (i = 0; i < j; i++)
      {
        int k = localSparseArray.keyAt(i);
        t.a locala = d(k, paramArrayList1, paramArrayList2, paramInt1, paramInt2);
        localObject = (h)localSparseArray.valueAt(i);
        if (paramg.f())
        {
          ViewGroup localViewGroup = (ViewGroup)paramg.e(k);
          if (localViewGroup != null) {
            if (paramBoolean) {
              o(localViewGroup, (h)localObject, paramContext, locala, paramg1);
            } else {
              n(localViewGroup, (h)localObject, paramContext, locala, paramg1);
            }
          }
        }
      }
    }
  }
  
  public static void a(ArrayList paramArrayList, t.a parama, Collection paramCollection)
  {
    for (int i = parama.size() - 1; i >= 0; i--)
    {
      View localView = (View)parama.l(i);
      if (paramCollection.contains(s.q(localView))) {
        paramArrayList.add(localView);
      }
    }
  }
  
  public static void b(a parama, v.a parama1, SparseArray paramSparseArray, boolean paramBoolean1, boolean paramBoolean2)
  {
    Fragment localFragment = b;
    if (localFragment == null) {
      return;
    }
    int i = L;
    if (i == 0) {
      return;
    }
    int j;
    if (paramBoolean1) {
      j = a[a];
    } else {
      j = a;
    }
    boolean bool1 = false;
    int k = 1;
    int m;
    int n;
    if (j != 1) {
      if (j != 3) {
        if (j != 4)
        {
          if (j != 5)
          {
            if (j == 6) {
              break label241;
            }
            if (j == 7) {
              break label304;
            }
            m = 0;
            j = m;
            n = j;
            break label338;
          }
          if (paramBoolean2) {
            if ((!b0) || (N) || (!z)) {}
          }
        }
      }
    }
    for (;;)
    {
      bool1 = true;
      label228:
      label241:
      label302:
      label304:
      do
      {
        bool1 = false;
        for (bool1 = N;; bool1 = a0)
        {
          n = 0;
          m = n;
          j = k;
          break label338;
          if (paramBoolean2) {
            if ((b0) && (z) && (N))
            {
              j = 1;
              break label228;
            }
          }
          for (;;)
          {
            j = 0;
            if ((z) && (!N))
            {
              break;
              n = j;
              m = 1;
              j = 0;
              break label338;
              boolean bool2 = z;
              if (paramBoolean2)
              {
                if (!bool2)
                {
                  parama1 = V;
                  if ((parama1 == null) || (parama1.getVisibility() != 0) || (c0 < 0.0F)) {}
                }
              }
              else {
                for (;;)
                {
                  break;
                  if ((!bool2) || (N)) {
                    break label302;
                  }
                }
              }
            }
          }
          if (!paramBoolean2) {
            break;
          }
        }
      } while ((z) || (N));
    }
    label338:
    Object localObject = (h)paramSparseArray.get(i);
    parama1 = (v.a)localObject;
    if (bool1)
    {
      parama1 = p((h)localObject, paramSparseArray, i);
      a = localFragment;
      b = paramBoolean1;
      c = parama;
    }
    if ((!paramBoolean2) && (j != 0))
    {
      if ((parama1 != null) && (d == localFragment)) {
        d = null;
      }
      if (!r)
      {
        localObject = t;
        t localt = ((n)localObject).v(localFragment);
        ((n)localObject).q0().p(localt);
        ((n)localObject).N0(localFragment);
      }
    }
    localObject = parama1;
    if (n != 0) {
      if (parama1 != null)
      {
        localObject = parama1;
        if (d != null) {}
      }
      else
      {
        localObject = p(parama1, paramSparseArray, i);
        d = localFragment;
        e = paramBoolean1;
        f = parama;
      }
    }
    if ((!paramBoolean2) && (m != 0) && (localObject != null) && (a == localFragment)) {
      a = null;
    }
  }
  
  public static void c(a parama, SparseArray paramSparseArray, boolean paramBoolean)
  {
    int i = c.size();
    for (int j = 0; j < i; j++) {
      b(parama, (v.a)c.get(j), paramSparseArray, false, paramBoolean);
    }
  }
  
  public static t.a d(int paramInt1, ArrayList paramArrayList1, ArrayList paramArrayList2, int paramInt2, int paramInt3)
  {
    t.a locala = new t.a();
    paramInt3--;
    while (paramInt3 >= paramInt2)
    {
      Object localObject = (a)paramArrayList1.get(paramInt3);
      if (((a)localObject).u(paramInt1))
      {
        boolean bool = ((Boolean)paramArrayList2.get(paramInt3)).booleanValue();
        ArrayList localArrayList1 = p;
        if (localArrayList1 != null)
        {
          int i = localArrayList1.size();
          ArrayList localArrayList2;
          if (bool)
          {
            localArrayList2 = p;
            localArrayList1 = q;
          }
          else
          {
            localArrayList1 = p;
            localArrayList2 = q;
          }
          for (int j = 0; j < i; j++)
          {
            localObject = (String)localArrayList1.get(j);
            String str1 = (String)localArrayList2.get(j);
            String str2 = (String)locala.remove(str1);
            if (str2 != null) {
              locala.put(localObject, str2);
            } else {
              locala.put(localObject, str1);
            }
          }
        }
      }
      paramInt3--;
    }
    return locala;
  }
  
  public static void e(a parama, SparseArray paramSparseArray, boolean paramBoolean)
  {
    if (!t.n0().f()) {
      return;
    }
    for (int i = c.size() - 1; i >= 0; i--) {
      b(parama, (v.a)c.get(i), paramSparseArray, true, paramBoolean);
    }
  }
  
  public static void f(Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean1, t.a parama, boolean paramBoolean2)
  {
    if (paramBoolean1) {
      paramFragment2.v();
    } else {
      paramFragment1.v();
    }
  }
  
  public static boolean g(y paramy, List paramList)
  {
    int i = paramList.size();
    for (int j = 0; j < i; j++) {
      if (!paramy.e(paramList.get(j))) {
        return false;
      }
    }
    return true;
  }
  
  public static t.a h(y paramy, t.a parama, Object paramObject, h paramh)
  {
    Fragment localFragment = a;
    View localView = localFragment.R();
    if ((!parama.isEmpty()) && (paramObject != null) && (localView != null))
    {
      paramObject = new t.a();
      paramy.j((Map)paramObject, localView);
      paramy = c;
      if (b)
      {
        localFragment.x();
        paramy = p;
      }
      else
      {
        localFragment.v();
        paramy = q;
      }
      if (paramy != null)
      {
        ((t.a)paramObject).p(paramy);
        ((t.a)paramObject).p(parama.values());
      }
      x(parama, (t.a)paramObject);
      return (t.a)paramObject;
    }
    parama.clear();
    return null;
  }
  
  public static t.a i(y paramy, t.a parama, Object paramObject, h paramh)
  {
    if ((!parama.isEmpty()) && (paramObject != null))
    {
      Fragment localFragment = d;
      paramObject = new t.a();
      paramy.j((Map)paramObject, localFragment.q1());
      paramy = f;
      if (e)
      {
        localFragment.v();
        paramy = q;
      }
      else
      {
        localFragment.x();
        paramy = p;
      }
      if (paramy != null) {
        ((t.a)paramObject).p(paramy);
      }
      parama.p(((t.a)paramObject).keySet());
      return (t.a)paramObject;
    }
    parama.clear();
    return null;
  }
  
  public static y j(Fragment paramFragment1, Fragment paramFragment2)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramFragment1 != null)
    {
      Object localObject = paramFragment1.w();
      if (localObject != null) {
        localArrayList.add(localObject);
      }
      localObject = paramFragment1.K();
      if (localObject != null) {
        localArrayList.add(localObject);
      }
      paramFragment1 = paramFragment1.M();
      if (paramFragment1 != null) {
        localArrayList.add(paramFragment1);
      }
    }
    if (paramFragment2 != null)
    {
      paramFragment1 = paramFragment2.u();
      if (paramFragment1 != null) {
        localArrayList.add(paramFragment1);
      }
      paramFragment1 = paramFragment2.H();
      if (paramFragment1 != null) {
        localArrayList.add(paramFragment1);
      }
      paramFragment1 = paramFragment2.L();
      if (paramFragment1 != null) {
        localArrayList.add(paramFragment1);
      }
    }
    if (localArrayList.isEmpty()) {
      return null;
    }
    paramFragment1 = b;
    if ((paramFragment1 != null) && (g(paramFragment1, localArrayList))) {
      return paramFragment1;
    }
    paramFragment2 = c;
    if ((paramFragment2 != null) && (g(paramFragment2, localArrayList))) {
      return paramFragment2;
    }
    if ((paramFragment1 == null) && (paramFragment2 == null)) {
      return null;
    }
    throw new IllegalArgumentException("Invalid Transition types");
  }
  
  public static ArrayList k(y paramy, Object paramObject, Fragment paramFragment, ArrayList paramArrayList, View paramView)
  {
    if (paramObject != null)
    {
      ArrayList localArrayList = new ArrayList();
      paramFragment = paramFragment.R();
      if (paramFragment != null) {
        paramy.f(localArrayList, paramFragment);
      }
      if (paramArrayList != null) {
        localArrayList.removeAll(paramArrayList);
      }
      paramFragment = localArrayList;
      if (!localArrayList.isEmpty())
      {
        localArrayList.add(paramView);
        paramy.b(paramObject, localArrayList);
        paramFragment = localArrayList;
      }
    }
    else
    {
      paramFragment = null;
    }
    return paramFragment;
  }
  
  public static Object l(y paramy, ViewGroup paramViewGroup, final View paramView, final t.a parama, final h paramh, final ArrayList paramArrayList1, final ArrayList paramArrayList2, final Object paramObject1, final Object paramObject2)
  {
    final Fragment localFragment1 = a;
    final Fragment localFragment2 = d;
    if ((localFragment1 != null) && (localFragment2 != null))
    {
      final boolean bool = b;
      final Object localObject;
      if (parama.isEmpty()) {
        localObject = null;
      } else {
        localObject = t(paramy, localFragment1, localFragment2, bool);
      }
      t.a locala = i(paramy, parama, localObject, paramh);
      if (parama.isEmpty()) {
        localObject = null;
      } else {
        paramArrayList1.addAll(locala.values());
      }
      if ((paramObject1 == null) && (paramObject2 == null) && (localObject == null)) {
        return null;
      }
      f(localFragment1, localFragment2, bool, locala, true);
      if (localObject != null)
      {
        Rect localRect = new Rect();
        paramy.z(localObject, paramView, paramArrayList1);
        z(paramy, localObject, paramObject2, locala, e, f);
        paramObject2 = localRect;
        if (paramObject1 != null)
        {
          paramy.u(paramObject1, localRect);
          paramObject2 = localRect;
        }
      }
      else
      {
        paramObject2 = null;
      }
      q.a(paramViewGroup, new f(parama, localObject, paramh, paramArrayList2, paramView, localFragment1, localFragment2, bool, paramArrayList1, paramObject1, (Rect)paramObject2));
      return localObject;
    }
    return null;
  }
  
  public static Object m(final y paramy, ViewGroup paramViewGroup, final View paramView, t.a parama, final h paramh, ArrayList paramArrayList1, ArrayList paramArrayList2, Object paramObject1, Object paramObject2)
  {
    Fragment localFragment1 = a;
    final Fragment localFragment2 = d;
    if (localFragment1 != null) {
      localFragment1.q1().setVisibility(0);
    }
    if ((localFragment1 != null) && (localFragment2 != null))
    {
      final boolean bool = b;
      Object localObject;
      if (parama.isEmpty()) {
        localObject = null;
      } else {
        localObject = t(paramy, localFragment1, localFragment2, bool);
      }
      t.a locala1 = i(paramy, parama, localObject, paramh);
      final t.a locala2 = h(paramy, parama, localObject, paramh);
      if (parama.isEmpty())
      {
        if (locala1 != null) {
          locala1.clear();
        }
        if (locala2 != null) {
          locala2.clear();
        }
        parama = null;
      }
      else
      {
        a(paramArrayList1, locala1, parama.keySet());
        a(paramArrayList2, locala2, parama.values());
        parama = (t.a)localObject;
      }
      if ((paramObject1 == null) && (paramObject2 == null) && (parama == null)) {
        return null;
      }
      f(localFragment1, localFragment2, bool, locala1, true);
      if (parama != null)
      {
        paramArrayList2.add(paramView);
        paramy.z(parama, paramView, paramArrayList1);
        z(paramy, parama, paramObject2, locala1, e, f);
        paramView = new Rect();
        paramh = s(locala2, paramh, paramObject1, bool);
        if (paramh != null) {
          paramy.u(paramObject1, paramView);
        }
      }
      else
      {
        paramh = null;
        paramView = paramh;
      }
      q.a(paramViewGroup, new e(localFragment1, localFragment2, bool, locala2, paramh, paramy, paramView));
      return parama;
    }
    return null;
  }
  
  public static void n(ViewGroup paramViewGroup, h paramh, View paramView, t.a parama, g paramg)
  {
    Fragment localFragment1 = a;
    final Fragment localFragment2 = d;
    y localy = j(localFragment2, localFragment1);
    if (localy == null) {
      return;
    }
    boolean bool1 = b;
    boolean bool2 = e;
    Object localObject1 = q(localy, localFragment1, bool1);
    Object localObject2 = r(localy, localFragment2, bool2);
    final Object localObject3 = new ArrayList();
    ArrayList localArrayList1 = new ArrayList();
    Object localObject4 = l(localy, paramViewGroup, paramView, parama, paramh, (ArrayList)localObject3, localArrayList1, localObject1, localObject2);
    if ((localObject1 == null) && (localObject4 == null)) {
      if (localObject2 == null) {
        return;
      }
    }
    for (;;)
    {
      break;
    }
    ArrayList localArrayList2 = k(localy, localObject2, localFragment2, (ArrayList)localObject3, paramView);
    if ((localArrayList2 != null) && (!localArrayList2.isEmpty())) {}
    for (;;)
    {
      break;
      localObject2 = null;
    }
    localy.a(localObject1, paramView);
    paramh = u(localy, localObject1, localObject2, localObject4, localFragment1, b);
    if ((localFragment2 != null) && (localArrayList2 != null) && ((localArrayList2.size() > 0) || (((ArrayList)localObject3).size() > 0)))
    {
      localObject3 = new c();
      paramg.b(localFragment2, (c)localObject3);
      localy.w(localFragment2, paramh, (c)localObject3, new c(paramg, localFragment2, (c)localObject3));
    }
    if (paramh != null)
    {
      paramg = new ArrayList();
      localy.t(paramh, localObject1, paramg, localObject2, localArrayList2, localObject4, localArrayList1);
      y(localy, paramViewGroup, localFragment1, paramView, localArrayList1, localObject1, paramg, localObject2, localArrayList2);
      localy.x(paramViewGroup, localArrayList1, parama);
      localy.c(paramViewGroup, paramh);
      localy.s(paramViewGroup, localArrayList1, parama);
    }
  }
  
  public static void o(ViewGroup paramViewGroup, h paramh, View paramView, t.a parama, g paramg)
  {
    Object localObject1 = a;
    final Fragment localFragment = d;
    y localy = j(localFragment, (Fragment)localObject1);
    if (localy == null) {
      return;
    }
    boolean bool1 = b;
    boolean bool2 = e;
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    Object localObject2 = q(localy, (Fragment)localObject1, bool1);
    Object localObject3 = r(localy, localFragment, bool2);
    Object localObject4 = m(localy, paramViewGroup, paramView, parama, paramh, localArrayList2, localArrayList1, localObject2, localObject3);
    if ((localObject2 == null) && (localObject4 == null) && (localObject3 == null)) {
      return;
    }
    paramh = (h)localObject3;
    localObject3 = k(localy, paramh, localFragment, localArrayList2, paramView);
    paramView = k(localy, localObject2, (Fragment)localObject1, localArrayList1, paramView);
    A(paramView, 4);
    localObject1 = u(localy, localObject2, paramh, localObject4, (Fragment)localObject1, bool1);
    if ((localFragment != null) && (localObject3 != null) && ((((ArrayList)localObject3).size() > 0) || (localArrayList2.size() > 0)))
    {
      final c localc = new c();
      paramg.b(localFragment, localc);
      localy.w(localFragment, localObject1, localc, new a(paramg, localFragment, localc));
    }
    if (localObject1 != null)
    {
      v(localy, paramh, localFragment, (ArrayList)localObject3);
      paramg = localy.o(localArrayList1);
      localy.t(localObject1, localObject2, paramView, paramh, (ArrayList)localObject3, localObject4, localArrayList1);
      localy.c(paramViewGroup, localObject1);
      localy.y(paramViewGroup, localArrayList2, localArrayList1, paramg, parama);
      A(paramView, 0);
      localy.A(localObject4, localArrayList2, localArrayList1);
    }
  }
  
  public static h p(h paramh, SparseArray paramSparseArray, int paramInt)
  {
    h localh = paramh;
    if (paramh == null)
    {
      localh = new h();
      paramSparseArray.put(paramInt, localh);
    }
    return localh;
  }
  
  public static Object q(y paramy, Fragment paramFragment, boolean paramBoolean)
  {
    if (paramFragment == null) {
      return null;
    }
    if (paramBoolean) {
      paramFragment = paramFragment.H();
    } else {
      paramFragment = paramFragment.u();
    }
    return paramy.g(paramFragment);
  }
  
  public static Object r(y paramy, Fragment paramFragment, boolean paramBoolean)
  {
    if (paramFragment == null) {
      return null;
    }
    if (paramBoolean) {
      paramFragment = paramFragment.K();
    } else {
      paramFragment = paramFragment.w();
    }
    return paramy.g(paramFragment);
  }
  
  public static View s(t.a parama, h paramh, Object paramObject, boolean paramBoolean)
  {
    paramh = c;
    if ((paramObject != null) && (parama != null))
    {
      paramObject = p;
      if ((paramObject != null) && (!((ArrayList)paramObject).isEmpty()))
      {
        if (paramBoolean) {}
        for (paramh = p;; paramh = q)
        {
          paramh = (String)paramh.get(0);
          break;
        }
        return (View)parama.get(paramh);
      }
    }
    return null;
  }
  
  public static Object t(y paramy, Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean)
  {
    if ((paramFragment1 != null) && (paramFragment2 != null))
    {
      if (paramBoolean) {
        paramFragment1 = paramFragment2.M();
      } else {
        paramFragment1 = paramFragment1.L();
      }
      return paramy.B(paramy.g(paramFragment1));
    }
    return null;
  }
  
  public static Object u(y paramy, Object paramObject1, Object paramObject2, Object paramObject3, Fragment paramFragment, boolean paramBoolean)
  {
    if ((paramObject1 != null) && (paramObject2 != null) && (paramFragment != null))
    {
      if (paramBoolean) {
        paramBoolean = paramFragment.p();
      } else {
        paramBoolean = paramFragment.o();
      }
      if (!paramBoolean) {
        return paramy.m(paramObject2, paramObject1, paramObject3);
      }
    }
    paramy = paramy.n(paramObject2, paramObject1, paramObject3);
    return paramy;
  }
  
  public static void v(y paramy, Object paramObject, Fragment paramFragment, ArrayList paramArrayList)
  {
    if ((paramFragment != null) && (paramObject != null) && (z) && (N) && (b0))
    {
      paramFragment.y1(true);
      paramy.r(paramObject, paramFragment.R(), paramArrayList);
      q.a(U, new b(paramArrayList));
    }
  }
  
  public static y w()
  {
    try
    {
      y localy = (y)Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      return localy;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public static void x(t.a parama1, t.a parama2)
  {
    for (int i = parama1.size() - 1; i >= 0; i--) {
      if (!parama2.containsKey((String)parama1.l(i))) {
        parama1.j(i);
      }
    }
  }
  
  public static void y(final y paramy, ViewGroup paramViewGroup, final Fragment paramFragment, final View paramView, final ArrayList paramArrayList1, Object paramObject1, final ArrayList paramArrayList2, final Object paramObject2, final ArrayList paramArrayList3)
  {
    q.a(paramViewGroup, new d(paramObject1, paramy, paramView, paramFragment, paramArrayList1, paramArrayList2, paramArrayList3, paramObject2));
  }
  
  public static void z(y paramy, Object paramObject1, Object paramObject2, t.a parama, boolean paramBoolean, a parama1)
  {
    ArrayList localArrayList = p;
    if ((localArrayList != null) && (!localArrayList.isEmpty()))
    {
      if (paramBoolean) {}
      for (parama1 = q;; parama1 = p)
      {
        parama1 = (String)parama1.get(0);
        break;
      }
      parama = (View)parama.get(parama1);
      paramy.v(paramObject1, parama);
      if (paramObject2 != null) {
        paramy.v(paramObject2, parama);
      }
    }
  }
  
  public class a
    implements Runnable
  {
    public a(Fragment paramFragment, c paramc) {}
    
    public void run()
    {
      a(localFragment, localc);
    }
  }
  
  public class b
    implements Runnable
  {
    public b() {}
    
    public void run()
    {
      w.A(w.this, 4);
    }
  }
  
  public class c
    implements Runnable
  {
    public c(Fragment paramFragment, c paramc) {}
    
    public void run()
    {
      a(localFragment2, localObject3);
    }
  }
  
  public class d
    implements Runnable
  {
    public d(y paramy, View paramView, Fragment paramFragment, ArrayList paramArrayList1, ArrayList paramArrayList2, ArrayList paramArrayList3, Object paramObject) {}
    
    public void run()
    {
      Object localObject = w.this;
      if (localObject != null)
      {
        paramy.p(localObject, paramView);
        localObject = w.k(paramy, w.this, paramFragment, paramArrayList1, paramView);
        paramArrayList2.addAll((Collection)localObject);
      }
      if (paramArrayList3 != null)
      {
        if (paramObject2 != null)
        {
          localObject = new ArrayList();
          ((ArrayList)localObject).add(paramView);
          paramy.q(paramObject2, paramArrayList3, (ArrayList)localObject);
        }
        paramArrayList3.clear();
        paramArrayList3.add(paramView);
      }
    }
  }
  
  public class e
    implements Runnable
  {
    public e(Fragment paramFragment, boolean paramBoolean, t.a parama, View paramView, y paramy, Rect paramRect) {}
    
    public void run()
    {
      w.f(w.this, localFragment2, bool, locala2, false);
      View localView = paramh;
      if (localView != null) {
        paramy.k(localView, paramView);
      }
    }
  }
  
  public class f
    implements Runnable
  {
    public f(t.a parama, Object paramObject1, w.h paramh, ArrayList paramArrayList1, View paramView, Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean, ArrayList paramArrayList2, Object paramObject2, Rect paramRect) {}
    
    public void run()
    {
      t.a locala = w.h(w.this, parama, localObject, paramh);
      if (locala != null)
      {
        paramArrayList2.addAll(locala.values());
        paramArrayList2.add(paramView);
      }
      w.f(localFragment1, localFragment2, bool, locala, false);
      Object localObject = localObject;
      if (localObject != null)
      {
        A(localObject, paramArrayList1, paramArrayList2);
        localObject = w.s(locala, paramh, paramObject1, bool);
        if (localObject != null) {
          k((View)localObject, paramObject2);
        }
      }
    }
  }
  
  public static abstract interface g
  {
    public abstract void a(Fragment paramFragment, c paramc);
    
    public abstract void b(Fragment paramFragment, c paramc);
  }
  
  public static class h
  {
    public Fragment a;
    public boolean b;
    public a c;
    public Fragment d;
    public boolean e;
    public a f;
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */