package x0;

import B0.b;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import d0.I;
import d0.u;
import d0.u.c;
import g0.M;
import i0.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class l
  extends h
{
  public static final u w = new u.c().e(Uri.EMPTY).a();
  public final List k;
  public final Set l;
  public Handler m;
  public final List n;
  public final IdentityHashMap o;
  public final Map p;
  public final Set q;
  public final boolean r;
  public final boolean s;
  public boolean t;
  public Set u;
  public T v;
  
  public l(boolean paramBoolean, T paramT, x... paramVarArgs)
  {
    this(paramBoolean, false, paramT, paramVarArgs);
  }
  
  public l(boolean paramBoolean1, boolean paramBoolean2, T paramT, x... paramVarArgs)
  {
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++) {
      g0.a.e(paramVarArgs[j]);
    }
    T localT = paramT;
    if (paramT.a() > 0) {
      localT = paramT.h();
    }
    v = localT;
    o = new IdentityHashMap();
    p = new HashMap();
    k = new ArrayList();
    n = new ArrayList();
    u = new HashSet();
    l = new HashSet();
    q = new HashSet();
    r = paramBoolean1;
    s = paramBoolean2;
    Q(Arrays.asList(paramVarArgs));
  }
  
  public l(boolean paramBoolean, x... paramVarArgs)
  {
    this(paramBoolean, new T.a(0), paramVarArgs);
  }
  
  public l(x... paramVarArgs)
  {
    this(false, paramVarArgs);
  }
  
  public static Object Y(Object paramObject)
  {
    return k0.a.v(paramObject);
  }
  
  public static Object a0(Object paramObject)
  {
    return k0.a.w(paramObject);
  }
  
  public static Object b0(e parame, Object paramObject)
  {
    return k0.a.y(b, paramObject);
  }
  
  public void B()
  {
    try
    {
      super.B();
      n.clear();
      q.clear();
      p.clear();
      v = v.h();
      Handler localHandler = m;
      if (localHandler != null)
      {
        localHandler.removeCallbacksAndMessages(null);
        m = null;
      }
    }
    finally
    {
      break label97;
    }
    t = false;
    u.clear();
    W(l);
    return;
    label97:
    throw ((Throwable)localObject);
  }
  
  public final void O(int paramInt, e parame)
  {
    e locale;
    I localI;
    if (paramInt > 0)
    {
      locale = (e)n.get(paramInt - 1);
      localI = a.Z();
    }
    for (int i = e + localI.p();; i = 0)
    {
      parame.a(paramInt, i);
      break;
    }
    T(paramInt, 1, a.Z().p());
    n.add(paramInt, parame);
    p.put(b, parame);
    K(parame, a);
    if ((y()) && (o.isEmpty())) {
      q.add(parame);
    } else {
      D(parame);
    }
  }
  
  public void P(int paramInt, Collection paramCollection, Handler paramHandler, Runnable paramRunnable)
  {
    try
    {
      S(paramInt, paramCollection, paramHandler, paramRunnable);
      return;
    }
    finally
    {
      paramCollection = finally;
      throw paramCollection;
    }
  }
  
  public void Q(Collection paramCollection)
  {
    try
    {
      S(k.size(), paramCollection, null, null);
      return;
    }
    finally
    {
      paramCollection = finally;
      throw paramCollection;
    }
  }
  
  public final void R(int paramInt, Collection paramCollection)
  {
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      O(paramInt, (e)paramCollection.next());
      paramInt++;
    }
  }
  
  public final void S(int paramInt, Collection paramCollection, Handler paramHandler, Runnable paramRunnable)
  {
    boolean bool = false;
    int i;
    if (paramHandler == null) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if (paramRunnable == null) {
      j = 1;
    } else {
      j = 0;
    }
    if (i == j) {
      bool = true;
    }
    g0.a.a(bool);
    Handler localHandler = m;
    Object localObject = paramCollection.iterator();
    while (((Iterator)localObject).hasNext()) {
      g0.a.e((x)((Iterator)localObject).next());
    }
    localObject = new ArrayList(paramCollection.size());
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext()) {
      ((List)localObject).add(new e((x)localIterator.next(), s));
    }
    k.addAll(paramInt, (Collection)localObject);
    if ((localHandler != null) && (!paramCollection.isEmpty())) {
      localHandler.obtainMessage(1, new f(paramInt, localObject, U(paramHandler, paramRunnable))).sendToTarget();
    } else if ((paramRunnable != null) && (paramHandler != null)) {
      paramHandler.post(paramRunnable);
    }
  }
  
  public final void T(int paramInt1, int paramInt2, int paramInt3)
  {
    while (paramInt1 < n.size())
    {
      e locale = (e)n.get(paramInt1);
      d += paramInt2;
      e += paramInt3;
      paramInt1++;
    }
  }
  
  public final d U(Handler paramHandler, Runnable paramRunnable)
  {
    if ((paramHandler != null) && (paramRunnable != null))
    {
      paramHandler = new d(paramHandler, paramRunnable);
      l.add(paramHandler);
      return paramHandler;
    }
    return null;
  }
  
  public final void V()
  {
    Iterator localIterator = q.iterator();
    while (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      if (c.isEmpty())
      {
        D(locale);
        localIterator.remove();
      }
    }
  }
  
  /* Error */
  public final void W(Set paramSet)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokeinterface 329 1 0
    //   8: astore_2
    //   9: aload_2
    //   10: invokeinterface 280 1 0
    //   15: ifeq +22 -> 37
    //   18: aload_2
    //   19: invokeinterface 284 1 0
    //   24: checkcast 14	x0/l$d
    //   27: invokevirtual 337	x0/l$d:a	()V
    //   30: goto -21 -> 9
    //   33: astore_1
    //   34: goto +17 -> 51
    //   37: aload_0
    //   38: getfield 110	x0/l:l	Ljava/util/Set;
    //   41: aload_1
    //   42: invokeinterface 341 2 0
    //   47: pop
    //   48: aload_0
    //   49: monitorexit
    //   50: return
    //   51: aload_0
    //   52: monitorexit
    //   53: aload_1
    //   54: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	this	l
    //   0	55	1	paramSet	Set
    //   8	11	2	localIterator	Iterator
    // Exception table:
    //   from	to	target	type
    //   2	9	33	finally
    //   9	30	33	finally
    //   37	48	33	finally
  }
  
  public final void X(e parame)
  {
    q.add(parame);
    E(parame);
  }
  
  public x.b Z(e parame, x.b paramb)
  {
    for (int i = 0; i < c.size(); i++) {
      if (c.get(i)).d == d) {
        return paramb.a(b0(parame, a));
      }
    }
    return null;
  }
  
  public u a()
  {
    return w;
  }
  
  public final Handler c0()
  {
    return (Handler)g0.a.e(m);
  }
  
  public int d0()
  {
    try
    {
      int i = k.size();
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void e(v paramv)
  {
    e locale = (e)g0.a.e((e)o.remove(paramv));
    a.e(paramv);
    c.remove(o);
    if (!o.isEmpty()) {
      V();
    }
    g0(locale);
  }
  
  public int e0(e parame, int paramInt)
  {
    return paramInt + e;
  }
  
  public v f(x.b paramb, b paramb1, long paramLong)
  {
    Object localObject = a0(a);
    x.b localb = paramb.a(Y(a));
    localObject = (e)p.get(localObject);
    paramb = (x.b)localObject;
    if (localObject == null)
    {
      paramb = new e(new c(null), s);
      f = true;
      K(paramb, a);
    }
    X(paramb);
    c.add(localb);
    paramb1 = a.W(localb, paramb1, paramLong);
    o.put(paramb1, paramb);
    V();
    return paramb1;
  }
  
  public final boolean f0(Message paramMessage)
  {
    switch (what)
    {
    default: 
      throw new IllegalStateException();
    case 6: 
      W((Set)M.i(obj));
      break;
    case 5: 
      t0();
      break;
    case 4: 
      paramMessage = (f)M.i(obj);
      v = ((T)b);
    case 3: 
    case 2: 
    case 1: 
      for (;;)
      {
        p0(c);
        break;
        paramMessage = (f)M.i(obj);
        Object localObject = v;
        int i = a;
        localObject = ((T)localObject).b(i, i + 1);
        v = ((T)localObject);
        v = ((T)localObject).d(((Integer)b).intValue(), 1);
        i0(a, ((Integer)b).intValue());
        continue;
        localObject = (f)M.i(obj);
        int j = a;
        i = ((Integer)b).intValue();
        if ((j == 0) && (i == v.a())) {}
        for (paramMessage = v.h();; paramMessage = v.b(j, i))
        {
          v = paramMessage;
          break;
        }
        i--;
        for (;;)
        {
          paramMessage = (Message)localObject;
          if (i < j) {
            break;
          }
          l0(i);
          i--;
        }
        paramMessage = (f)M.i(obj);
        v = v.d(a, ((Collection)b).size());
        R(a, (Collection)b);
      }
    }
    return true;
  }
  
  public final void g0(e parame)
  {
    if ((f) && (c.isEmpty()))
    {
      q.remove(parame);
      L(parame);
    }
  }
  
  public void h0(int paramInt1, int paramInt2, Handler paramHandler, Runnable paramRunnable)
  {
    try
    {
      j0(paramInt1, paramInt2, paramHandler, paramRunnable);
      return;
    }
    finally
    {
      paramHandler = finally;
      throw paramHandler;
    }
  }
  
  public boolean i()
  {
    return false;
  }
  
  public final void i0(int paramInt1, int paramInt2)
  {
    int i = Math.min(paramInt1, paramInt2);
    int j = Math.max(paramInt1, paramInt2);
    int i1 = n.get(i)).e;
    Object localObject = n;
    ((List)localObject).add(paramInt2, (e)((List)localObject).remove(paramInt1));
    paramInt1 = i1;
    for (paramInt2 = i; paramInt2 <= j; paramInt2++)
    {
      localObject = (e)n.get(paramInt2);
      d = paramInt2;
      e = paramInt1;
      paramInt1 += a.Z().p();
    }
  }
  
  public I j()
  {
    try
    {
      if (v.a() != k.size()) {
        T localT = v.h().d(0, k.size());
      }
    }
    finally
    {
      break label81;
    }
    Object localObject2 = v;
    localObject2 = new b(k, (T)localObject2, r);
    return (I)localObject2;
    label81:
    throw ((Throwable)localObject2);
  }
  
  public final void j0(int paramInt1, int paramInt2, Handler paramHandler, Runnable paramRunnable)
  {
    boolean bool = false;
    int i;
    if (paramHandler == null) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if (paramRunnable == null) {
      j = 1;
    } else {
      j = 0;
    }
    if (i == j) {
      bool = true;
    }
    g0.a.a(bool);
    Handler localHandler = m;
    List localList = k;
    localList.add(paramInt2, (e)localList.remove(paramInt1));
    if (localHandler != null) {
      localHandler.obtainMessage(3, new f(paramInt1, Integer.valueOf(paramInt2), U(paramHandler, paramRunnable))).sendToTarget();
    } else if ((paramRunnable != null) && (paramHandler != null)) {
      paramHandler.post(paramRunnable);
    }
  }
  
  public void k0(e parame, x paramx, I paramI)
  {
    s0(parame, paramI);
  }
  
  public final void l0(int paramInt)
  {
    e locale = (e)n.remove(paramInt);
    p.remove(b);
    T(paramInt, -1, -a.Z().p());
    f = true;
    g0(locale);
  }
  
  public void m0(int paramInt1, int paramInt2, Handler paramHandler, Runnable paramRunnable)
  {
    try
    {
      n0(paramInt1, paramInt2, paramHandler, paramRunnable);
      return;
    }
    finally
    {
      paramHandler = finally;
      throw paramHandler;
    }
  }
  
  public final void n0(int paramInt1, int paramInt2, Handler paramHandler, Runnable paramRunnable)
  {
    boolean bool = false;
    int i;
    if (paramHandler == null) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if (paramRunnable == null) {
      j = 1;
    } else {
      j = 0;
    }
    if (i == j) {
      bool = true;
    }
    g0.a.a(bool);
    Handler localHandler = m;
    M.U0(k, paramInt1, paramInt2);
    if (localHandler != null) {
      localHandler.obtainMessage(2, new f(paramInt1, Integer.valueOf(paramInt2), U(paramHandler, paramRunnable))).sendToTarget();
    } else if ((paramRunnable != null) && (paramHandler != null)) {
      paramHandler.post(paramRunnable);
    }
  }
  
  public final void o0()
  {
    p0(null);
  }
  
  public final void p0(d paramd)
  {
    if (!t)
    {
      c0().obtainMessage(5).sendToTarget();
      t = true;
    }
    if (paramd != null) {
      u.add(paramd);
    }
  }
  
  public final void q0(T paramT, Handler paramHandler, Runnable paramRunnable)
  {
    boolean bool = true;
    int i;
    if (paramHandler == null) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if (paramRunnable == null) {
      j = 1;
    } else {
      j = 0;
    }
    if (i != j) {
      bool = false;
    }
    g0.a.a(bool);
    Handler localHandler = m;
    T localT;
    if (localHandler != null)
    {
      i = d0();
      localT = paramT;
      if (paramT.a() != i) {
        localT = paramT.h().d(0, i);
      }
      localHandler.obtainMessage(4, new f(0, localT, U(paramHandler, paramRunnable))).sendToTarget();
    }
    else
    {
      localT = paramT;
      if (paramT.a() > 0) {
        localT = paramT.h();
      }
      v = localT;
      if ((paramRunnable != null) && (paramHandler != null)) {
        paramHandler.post(paramRunnable);
      }
    }
  }
  
  public void r0(T paramT)
  {
    try
    {
      q0(paramT, null, null);
      return;
    }
    finally
    {
      paramT = finally;
      throw paramT;
    }
  }
  
  public final void s0(e parame, I paramI)
  {
    if (d + 1 < n.size())
    {
      e locale = (e)n.get(d + 1);
      int i = paramI.p() - (e - e);
      if (i != 0) {
        T(d + 1, 0, i);
      }
    }
    o0();
  }
  
  public final void t0()
  {
    t = false;
    Set localSet = u;
    u = new HashSet();
    A(new b(n, v, r));
    c0().obtainMessage(6, localSet).sendToTarget();
  }
  
  public void v()
  {
    super.v();
    q.clear();
  }
  
  public void w() {}
  
  public void z(y paramy)
  {
    try
    {
      super.z(paramy);
      Handler localHandler = new android/os/Handler;
      paramy = new x0/k;
      paramy.<init>(this);
      localHandler.<init>(paramy);
      m = localHandler;
      if (k.isEmpty()) {
        t0();
      }
    }
    finally
    {
      break label92;
    }
    v = v.d(0, k.size());
    R(0, k);
    o0();
    return;
    label92:
    throw paramy;
  }
  
  public static final class b
    extends k0.a
  {
    public final int h;
    public final int i;
    public final int[] j;
    public final int[] k;
    public final I[] l;
    public final Object[] m;
    public final HashMap n;
    
    public b(Collection paramCollection, T paramT, boolean paramBoolean)
    {
      super(paramT);
      int i1 = paramCollection.size();
      j = new int[i1];
      k = new int[i1];
      l = new I[i1];
      m = new Object[i1];
      n = new HashMap();
      paramCollection = paramCollection.iterator();
      int i2 = 0;
      i1 = 0;
      for (int i3 = i1; paramCollection.hasNext(); i3++)
      {
        Object localObject = (l.e)paramCollection.next();
        l[i3] = a.Z();
        k[i3] = i2;
        j[i3] = i1;
        i2 += l[i3].p();
        i1 += l[i3].i();
        paramT = m;
        localObject = b;
        paramT[i3] = localObject;
        n.put(localObject, Integer.valueOf(i3));
      }
      h = i2;
      i = i1;
    }
    
    public int A(int paramInt)
    {
      return k[paramInt];
    }
    
    public I D(int paramInt)
    {
      return l[paramInt];
    }
    
    public int i()
    {
      return i;
    }
    
    public int p()
    {
      return h;
    }
    
    public int s(Object paramObject)
    {
      paramObject = (Integer)n.get(paramObject);
      int i1;
      if (paramObject == null) {
        i1 = -1;
      } else {
        i1 = ((Integer)paramObject).intValue();
      }
      return i1;
    }
    
    public int t(int paramInt)
    {
      return M.g(j, paramInt + 1, false, false);
    }
    
    public int u(int paramInt)
    {
      return M.g(k, paramInt + 1, false, false);
    }
    
    public Object x(int paramInt)
    {
      return m[paramInt];
    }
    
    public int z(int paramInt)
    {
      return j[paramInt];
    }
  }
  
  public static final class c
    extends a
  {
    public void B() {}
    
    public u a()
    {
      return l.N();
    }
    
    public void e(v paramv) {}
    
    public v f(x.b paramb, b paramb1, long paramLong)
    {
      throw new UnsupportedOperationException();
    }
    
    public void h() {}
    
    public void z(y paramy) {}
  }
  
  public static final class d
  {
    public final Handler a;
    public final Runnable b;
    
    public d(Handler paramHandler, Runnable paramRunnable)
    {
      a = paramHandler;
      b = paramRunnable;
    }
    
    public void a()
    {
      a.post(b);
    }
  }
  
  public static final class e
  {
    public final t a;
    public final Object b;
    public final List c;
    public int d;
    public int e;
    public boolean f;
    
    public e(x paramx, boolean paramBoolean)
    {
      a = new t(paramx, paramBoolean);
      c = new ArrayList();
      b = new Object();
    }
    
    public void a(int paramInt1, int paramInt2)
    {
      d = paramInt1;
      e = paramInt2;
      f = false;
      c.clear();
    }
  }
  
  public static final class f
  {
    public final int a;
    public final Object b;
    public final l.d c;
    
    public f(int paramInt, Object paramObject, l.d paramd)
    {
      a = paramInt;
      b = paramObject;
      c = paramd;
    }
  }
}

/* Location:
 * Qualified Name:     x0.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */