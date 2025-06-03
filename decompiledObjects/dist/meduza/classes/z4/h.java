package z4;

import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import t5.l0;
import ta.c;
import ta.d;
import v3.o0;
import v3.o0.a;
import v3.r1;

public final class h
  extends f<d>
{
  public static final o0 E;
  public final boolean A;
  public boolean B;
  public HashSet C;
  public e0 D;
  public final ArrayList s;
  public final HashSet t;
  public Handler u;
  public final ArrayList v;
  public final IdentityHashMap<r, d> w;
  public final HashMap x;
  public final HashSet y;
  public final boolean z;
  
  static
  {
    o0.a locala = new o0.a();
    b = Uri.EMPTY;
    E = locala.a();
  }
  
  public h(boolean paramBoolean, e0.a parama, t... paramVarArgs)
  {
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++) {
      paramVarArgs[j].getClass();
    }
    e0.a locala = parama;
    if (b.length > 0) {
      locala = parama.g();
    }
    D = locala;
    w = new IdentityHashMap();
    x = new HashMap();
    parama = new ArrayList();
    s = parama;
    v = new ArrayList();
    C = new HashSet();
    t = new HashSet();
    y = new HashSet();
    z = false;
    A = paramBoolean;
    paramVarArgs = Arrays.asList(paramVarArgs);
    try
    {
      E(parama.size(), paramVarArgs, null, null);
      return;
    }
    finally
    {
      parama = finally;
      throw parama;
    }
  }
  
  public final void A(Object paramObject, r1 paramr1)
  {
    paramObject = (d)paramObject;
    if (d + 1 < v.size())
    {
      d locald = (d)v.get(d + 1);
      int i = paramr1.o() - (e - e);
      if (i != 0) {
        F(d + 1, 0, i);
      }
    }
    N(null);
  }
  
  public final void C(int paramInt, ArrayList paramArrayList, Handler paramHandler, c paramc)
  {
    try
    {
      E(paramInt, paramArrayList, paramHandler, paramc);
      return;
    }
    finally
    {
      paramArrayList = finally;
      throw paramArrayList;
    }
  }
  
  public final void D(int paramInt, Collection<d> paramCollection)
  {
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      d locald = (d)paramCollection.next();
      Object localObject;
      int i;
      int j;
      if (paramInt > 0)
      {
        localObject = (d)v.get(paramInt - 1);
        p.a locala = a.w;
        i = e;
        j = locala.o();
        d = paramInt;
      }
      for (e = (j + i);; e = 0)
      {
        f = false;
        c.clear();
        break;
        d = paramInt;
      }
      F(paramInt, 1, a.w.o());
      v.add(paramInt, locald);
      x.put(b, locald);
      B(locald, a);
      if (((b.isEmpty() ^ true)) && (w.isEmpty()))
      {
        y.add(locald);
      }
      else
      {
        localObject = (f.b)p.get(locald);
        localObject.getClass();
        a.l(b);
      }
      paramInt++;
    }
  }
  
  public final void E(int paramInt, List paramList, Handler paramHandler, c paramc)
  {
    boolean bool = true;
    int i;
    if (paramHandler == null) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if (paramc == null) {
      j = 1;
    } else {
      j = 0;
    }
    if (i != j) {
      bool = false;
    }
    x6.b.q(bool);
    Handler localHandler = u;
    Object localObject = paramList.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((t)((Iterator)localObject).next()).getClass();
    }
    localObject = new ArrayList(paramList.size());
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      ((ArrayList)localObject).add(new d((t)localIterator.next(), A));
    }
    s.addAll(paramInt, (Collection)localObject);
    if ((localHandler != null) && (!paramList.isEmpty())) {
      localHandler.obtainMessage(0, new e(paramInt, localObject, G(paramHandler, paramc))).sendToTarget();
    } else if ((paramc != null) && (paramHandler != null)) {
      paramHandler.post(paramc);
    }
  }
  
  public final void F(int paramInt1, int paramInt2, int paramInt3)
  {
    while (paramInt1 < v.size())
    {
      d locald = (d)v.get(paramInt1);
      d += paramInt2;
      e += paramInt3;
      paramInt1++;
    }
  }
  
  public final c G(Handler paramHandler, Runnable paramRunnable)
  {
    if ((paramHandler != null) && (paramRunnable != null))
    {
      paramHandler = new c(paramHandler, paramRunnable);
      t.add(paramHandler);
      return paramHandler;
    }
    return null;
  }
  
  public final void H()
  {
    Iterator localIterator = y.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (d)localIterator.next();
      if (c.isEmpty())
      {
        localObject = (f.b)p.get(localObject);
        localObject.getClass();
        a.l(b);
        localIterator.remove();
      }
    }
  }
  
  public final void I(Set<c> paramSet)
  {
    try
    {
      Iterator localIterator = paramSet.iterator();
      while (localIterator.hasNext())
      {
        c localc = (c)localIterator.next();
        a.post(b);
      }
      t.removeAll(paramSet);
      return;
    }
    finally {}
  }
  
  public final void J(d paramd)
  {
    if ((f) && (c.isEmpty()))
    {
      y.remove(paramd);
      paramd = (f.b)p.remove(paramd);
      paramd.getClass();
      a.a(b);
      a.m(c);
      a.c(c);
    }
  }
  
  public final void K(int paramInt1, int paramInt2, Handler paramHandler, d paramd)
  {
    try
    {
      L(paramInt1, paramInt2, paramHandler, paramd);
      return;
    }
    finally
    {
      paramHandler = finally;
      throw paramHandler;
    }
  }
  
  public final void L(int paramInt1, int paramInt2, Handler paramHandler, d paramd)
  {
    int i;
    if (paramHandler == null) {
      i = 1;
    } else {
      i = 0;
    }
    x6.b.q(0x1 ^ i);
    Handler localHandler = u;
    ArrayList localArrayList = s;
    localArrayList.add(paramInt2, (d)localArrayList.remove(paramInt1));
    if (localHandler != null) {
      localHandler.obtainMessage(2, new e(paramInt1, Integer.valueOf(paramInt2), G(paramHandler, paramd))).sendToTarget();
    } else if (paramHandler != null) {
      paramHandler.post(paramd);
    }
  }
  
  public final void M(int paramInt1, int paramInt2, Handler paramHandler, u.a parama)
  {
    int i;
    if (paramHandler == null) {
      i = 1;
    } else {
      i = 0;
    }
    try
    {
      x6.b.q(i ^ 0x1);
      Handler localHandler = u;
      v5.e0.N(paramInt1, paramInt2, s);
      if (localHandler != null)
      {
        paramHandler = G(paramHandler, parama);
        parama = new z4/h$e;
        parama.<init>(paramInt1, Integer.valueOf(paramInt2), paramHandler);
        localHandler.obtainMessage(1, parama).sendToTarget();
      }
      else if (paramHandler != null)
      {
        paramHandler.post(parama);
      }
      return;
    }
    finally {}
  }
  
  public final void N(c paramc)
  {
    if (!B)
    {
      Handler localHandler = u;
      localHandler.getClass();
      localHandler.obtainMessage(4).sendToTarget();
      B = true;
    }
    if (paramc != null) {
      C.add(paramc);
    }
  }
  
  public final void O(e0.a parama)
  {
    Handler localHandler = u;
    if (localHandler != null) {}
    e0.a locala;
    try
    {
      int i = s.size();
      locala = parama;
      if (b.length != i) {
        locala = parama.g().e(0, i);
      }
      localHandler.obtainMessage(3, new e(0, locala, G(null, null))).sendToTarget();
    }
    finally {}
    if (b.length > 0) {
      locala = parama.g();
    }
    D = locala;
  }
  
  public final void P(e0.a parama)
  {
    try
    {
      O(parama);
      return;
    }
    finally
    {
      parama = finally;
      throw parama;
    }
  }
  
  public final void Q()
  {
    B = false;
    HashSet localHashSet = C;
    C = new HashSet();
    v(new a(v, D, z));
    Handler localHandler = u;
    localHandler.getClass();
    localHandler.obtainMessage(5, localHashSet).sendToTarget();
  }
  
  public final o0 f()
  {
    return E;
  }
  
  public final void g(r paramr)
  {
    d locald = (d)w.remove(paramr);
    locald.getClass();
    a.g(paramr);
    c.remove(a);
    if (!w.isEmpty()) {
      H();
    }
    J(locald);
  }
  
  public final boolean i()
  {
    return false;
  }
  
  public final r1 j()
  {
    try
    {
      if (D.getLength() != s.size()) {
        localObject1 = D.g().e(0, s.size());
      } else {
        localObject1 = D;
      }
      Object localObject1 = new a(s, (e0)localObject1, z);
      return (r1)localObject1;
    }
    finally {}
  }
  
  public final r o(t.b paramb, t5.b paramb1, long paramLong)
  {
    Object localObject1 = a;
    int i = v3.a.e;
    Object localObject2 = (Pair)localObject1;
    localObject1 = first;
    localObject2 = paramb.b(second);
    localObject1 = (d)x.get(localObject1);
    paramb = (t.b)localObject1;
    if (localObject1 == null)
    {
      paramb = new d(new b(), A);
      f = true;
      B(paramb, a);
    }
    y.add(paramb);
    localObject1 = (f.b)p.get(paramb);
    localObject1.getClass();
    a.b(b);
    c.add(localObject2);
    paramb1 = a.F((t.b)localObject2, paramb1, paramLong);
    w.put(paramb1, paramb);
    H();
    return paramb1;
  }
  
  public final void r()
  {
    super.r();
    y.clear();
  }
  
  public final void s() {}
  
  public final void t(l0 paraml0)
  {
    try
    {
      r = paraml0;
      q = v5.e0.l(null);
      paraml0 = new android/os/Handler;
      g localg = new z4/g;
      localg.<init>(this);
      paraml0.<init>(localg);
      u = paraml0;
      if (s.isEmpty())
      {
        Q();
      }
      else
      {
        D = D.e(0, s.size());
        D(0, s);
        N(null);
      }
      return;
    }
    finally {}
  }
  
  public final void w()
  {
    try
    {
      super.w();
      v.clear();
      y.clear();
      x.clear();
      D = D.g();
      Handler localHandler = u;
      if (localHandler != null)
      {
        localHandler.removeCallbacksAndMessages(null);
        u = null;
      }
      B = false;
      C.clear();
      I(t);
      return;
    }
    finally {}
  }
  
  public final t.b x(Object paramObject, t.b paramb)
  {
    Object localObject = (d)paramObject;
    for (int i = 0; i < c.size(); i++) {
      if (c.get(i)).d == d)
      {
        paramObject = a;
        localObject = b;
        i = v3.a.e;
        return paramb.b(Pair.create(localObject, paramObject));
      }
    }
    paramObject = null;
    return (t.b)paramObject;
  }
  
  public final int z(int paramInt, Object paramObject)
  {
    return paramInt + e;
  }
  
  public static final class a
    extends v3.a
  {
    public final int f;
    public final int o;
    public final int[] p;
    public final int[] q;
    public final r1[] r;
    public final Object[] s;
    public final HashMap<Object, Integer> t;
    
    public a(List paramList, e0 parame0, boolean paramBoolean)
    {
      super(parame0);
      int i = paramList.size();
      p = new int[i];
      q = new int[i];
      r = new r1[i];
      s = new Object[i];
      t = new HashMap();
      paramList = paramList.iterator();
      int j = 0;
      i = 0;
      for (int k = i; paramList.hasNext(); k++)
      {
        parame0 = (h.d)paramList.next();
        r1[] arrayOfr1 = r;
        Object localObject = a.w;
        arrayOfr1[k] = localObject;
        q[k] = j;
        p[k] = i;
        j += ((l)localObject).o();
        i += r[k].h();
        localObject = s;
        parame0 = b;
        localObject[k] = parame0;
        t.put(parame0, Integer.valueOf(k));
      }
      f = j;
      o = i;
    }
    
    public final int h()
    {
      return o;
    }
    
    public final int o()
    {
      return f;
    }
    
    public final int q(Object paramObject)
    {
      paramObject = (Integer)t.get(paramObject);
      int i;
      if (paramObject == null) {
        i = -1;
      } else {
        i = ((Integer)paramObject).intValue();
      }
      return i;
    }
    
    public final int r(int paramInt)
    {
      return v5.e0.e(p, paramInt + 1, false, false);
    }
    
    public final int s(int paramInt)
    {
      return v5.e0.e(q, paramInt + 1, false, false);
    }
    
    public final Object t(int paramInt)
    {
      return s[paramInt];
    }
    
    public final int u(int paramInt)
    {
      return p[paramInt];
    }
    
    public final int v(int paramInt)
    {
      return q[paramInt];
    }
    
    public final r1 x(int paramInt)
    {
      return r[paramInt];
    }
  }
  
  public static final class b
    extends a
  {
    public final o0 f()
    {
      return h.E;
    }
    
    public final void g(r paramr) {}
    
    public final void h() {}
    
    public final r o(t.b paramb, t5.b paramb1, long paramLong)
    {
      throw new UnsupportedOperationException();
    }
    
    public final void t(l0 paraml0) {}
    
    public final void w() {}
  }
  
  public static final class c
  {
    public final Handler a;
    public final Runnable b;
    
    public c(Handler paramHandler, Runnable paramRunnable)
    {
      a = paramHandler;
      b = paramRunnable;
    }
  }
  
  public static final class d
  {
    public final p a;
    public final Object b;
    public final ArrayList c;
    public int d;
    public int e;
    public boolean f;
    
    public d(t paramt, boolean paramBoolean)
    {
      a = new p(paramt, paramBoolean);
      c = new ArrayList();
      b = new Object();
    }
  }
  
  public static final class e<T>
  {
    public final int a;
    public final T b;
    public final h.c c;
    
    public e(int paramInt, T paramT, h.c paramc)
    {
      a = paramInt;
      b = paramT;
      c = paramc;
    }
  }
}

/* Location:
 * Qualified Name:     z4.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */