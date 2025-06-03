package X2;

import W2.m;
import a3.f;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public class k
  extends AbstractMap
  implements Serializable
{
  public static final Object x = new Object();
  public transient Object o;
  public transient int[] p;
  public transient Object[] q;
  public transient Object[] r;
  public transient int s;
  public transient int t;
  public transient Set u;
  public transient Set v;
  public transient Collection w;
  
  public k()
  {
    E(3);
  }
  
  public static k r()
  {
    return new k();
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream)
  {
    paramObjectInputStream.defaultReadObject();
    int i = paramObjectInputStream.readInt();
    if (i >= 0)
    {
      E(i);
      for (int j = 0; j < i; j++) {
        put(paramObjectInputStream.readObject(), paramObjectInputStream.readObject());
      }
      return;
    }
    paramObjectInputStream = new StringBuilder();
    paramObjectInputStream.append("Invalid size: ");
    paramObjectInputStream.append(i);
    throw new InvalidObjectException(paramObjectInputStream.toString());
  }
  
  private void writeObject(ObjectOutputStream paramObjectOutputStream)
  {
    paramObjectOutputStream.defaultWriteObject();
    paramObjectOutputStream.writeInt(size());
    Iterator localIterator = y();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      paramObjectOutputStream.writeObject(localEntry.getKey());
      paramObjectOutputStream.writeObject(localEntry.getValue());
    }
  }
  
  public int A(int paramInt)
  {
    
    if (paramInt >= t) {
      paramInt = -1;
    }
    return paramInt;
  }
  
  public final int B()
  {
    return (1 << (s & 0x1F)) - 1;
  }
  
  public void C()
  {
    s += 32;
  }
  
  public final int D(Object paramObject)
  {
    if (J()) {
      return -1;
    }
    int i = s.c(paramObject);
    int j = B();
    int k = l.h(N(), i & j);
    if (k == 0) {
      return -1;
    }
    int m = l.b(i, j);
    do
    {
      k--;
      i = x(k);
      if ((l.b(i, j) == m) && (W2.k.a(paramObject, G(k)))) {
        return k;
      }
      i = l.c(i, j);
      k = i;
    } while (i != 0);
    return -1;
  }
  
  public void E(int paramInt)
  {
    boolean bool;
    if (paramInt >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    m.e(bool, "Expected size must be >= 0");
    s = f.f(paramInt, 1, 1073741823);
  }
  
  public void F(int paramInt1, Object paramObject1, Object paramObject2, int paramInt2, int paramInt3)
  {
    S(paramInt1, l.d(paramInt2, 0, paramInt3));
    U(paramInt1, paramObject1);
    V(paramInt1, paramObject2);
  }
  
  public final Object G(int paramInt)
  {
    return M()[paramInt];
  }
  
  public Iterator H()
  {
    Map localMap = w();
    if (localMap != null) {
      return localMap.keySet().iterator();
    }
    return new a();
  }
  
  public void I(int paramInt1, int paramInt2)
  {
    Object localObject1 = N();
    int[] arrayOfInt = L();
    Object[] arrayOfObject1 = M();
    Object[] arrayOfObject2 = O();
    int i = size();
    int j = i - 1;
    if (paramInt1 < j)
    {
      Object localObject2 = arrayOfObject1[j];
      arrayOfObject1[paramInt1] = localObject2;
      arrayOfObject2[paramInt1] = arrayOfObject2[j];
      arrayOfObject1[j] = null;
      arrayOfObject2[j] = null;
      arrayOfInt[paramInt1] = arrayOfInt[j];
      arrayOfInt[j] = 0;
      int k = s.c(localObject2) & paramInt2;
      int m = l.h(localObject1, k);
      j = m;
      if (m == i) {
        l.i(localObject1, k, paramInt1 + 1);
      } else {
        for (;;)
        {
          k = j - 1;
          m = arrayOfInt[k];
          j = l.c(m, paramInt2);
          if (j == i)
          {
            arrayOfInt[k] = l.d(m, paramInt1 + 1, paramInt2);
            break;
          }
        }
      }
    }
    else
    {
      arrayOfObject1[paramInt1] = null;
      arrayOfObject2[paramInt1] = null;
      arrayOfInt[paramInt1] = 0;
    }
  }
  
  public boolean J()
  {
    boolean bool;
    if (o == null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final Object K(Object paramObject)
  {
    if (J()) {
      return x;
    }
    int i = B();
    int j = l.f(paramObject, null, i, N(), L(), M(), null);
    if (j == -1) {
      return x;
    }
    paramObject = W(j);
    I(j, i);
    t -= 1;
    C();
    return paramObject;
  }
  
  public final int[] L()
  {
    int[] arrayOfInt = p;
    Objects.requireNonNull(arrayOfInt);
    return (int[])arrayOfInt;
  }
  
  public final Object[] M()
  {
    Object[] arrayOfObject = q;
    Objects.requireNonNull(arrayOfObject);
    return (Object[])arrayOfObject;
  }
  
  public final Object N()
  {
    Object localObject = o;
    Objects.requireNonNull(localObject);
    return localObject;
  }
  
  public final Object[] O()
  {
    Object[] arrayOfObject = r;
    Objects.requireNonNull(arrayOfObject);
    return (Object[])arrayOfObject;
  }
  
  public void P(int paramInt)
  {
    p = Arrays.copyOf(L(), paramInt);
    q = Arrays.copyOf(M(), paramInt);
    r = Arrays.copyOf(O(), paramInt);
  }
  
  public final void Q(int paramInt)
  {
    int i = L().length;
    if (paramInt > i)
    {
      paramInt = Math.min(1073741823, Math.max(1, i >>> 1) + i | 0x1);
      if (paramInt != i) {
        P(paramInt);
      }
    }
  }
  
  public final int R(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject1 = l.a(paramInt2);
    int i = paramInt2 - 1;
    if (paramInt4 != 0) {
      l.i(localObject1, paramInt3 & i, paramInt4 + 1);
    }
    Object localObject2 = N();
    int[] arrayOfInt = L();
    for (paramInt2 = 0; paramInt2 <= paramInt1; paramInt2++)
    {
      int k;
      for (paramInt3 = l.h(localObject2, paramInt2); paramInt3 != 0; paramInt3 = l.c(k, paramInt1))
      {
        int j = paramInt3 - 1;
        k = arrayOfInt[j];
        paramInt4 = l.b(k, paramInt1) | paramInt2;
        int m = paramInt4 & i;
        int n = l.h(localObject1, m);
        l.i(localObject1, m, paramInt3);
        arrayOfInt[j] = l.d(paramInt4, n, i);
      }
    }
    o = localObject1;
    T(i);
    return i;
  }
  
  public final void S(int paramInt1, int paramInt2)
  {
    L()[paramInt1] = paramInt2;
  }
  
  public final void T(int paramInt)
  {
    paramInt = Integer.numberOfLeadingZeros(paramInt);
    s = l.d(s, 32 - paramInt, 31);
  }
  
  public final void U(int paramInt, Object paramObject)
  {
    M()[paramInt] = paramObject;
  }
  
  public final void V(int paramInt, Object paramObject)
  {
    O()[paramInt] = paramObject;
  }
  
  public final Object W(int paramInt)
  {
    return O()[paramInt];
  }
  
  public Iterator X()
  {
    Map localMap = w();
    if (localMap != null) {
      return localMap.values().iterator();
    }
    return new c();
  }
  
  public void clear()
  {
    if (J()) {
      return;
    }
    C();
    Map localMap = w();
    if (localMap != null)
    {
      s = f.f(size(), 3, 1073741823);
      localMap.clear();
      o = null;
    }
    for (;;)
    {
      t = 0;
      break;
      Arrays.fill(M(), 0, t, null);
      Arrays.fill(O(), 0, t, null);
      l.g(N());
      Arrays.fill(L(), 0, t, 0);
    }
  }
  
  public boolean containsKey(Object paramObject)
  {
    Map localMap = w();
    boolean bool;
    if (localMap != null) {
      bool = localMap.containsKey(paramObject);
    } else if (D(paramObject) != -1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean containsValue(Object paramObject)
  {
    Map localMap = w();
    if (localMap != null) {
      return localMap.containsValue(paramObject);
    }
    for (int i = 0; i < t; i++) {
      if (W2.k.a(paramObject, W(i))) {
        return true;
      }
    }
    return false;
  }
  
  public Set entrySet()
  {
    Set localSet1 = v;
    Set localSet2 = localSet1;
    if (localSet1 == null)
    {
      localSet2 = s();
      v = localSet2;
    }
    return localSet2;
  }
  
  public Object get(Object paramObject)
  {
    Map localMap = w();
    if (localMap != null) {
      return localMap.get(paramObject);
    }
    int i = D(paramObject);
    if (i == -1) {
      return null;
    }
    n(i);
    return W(i);
  }
  
  public boolean isEmpty()
  {
    boolean bool;
    if (size() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Set keySet()
  {
    Set localSet1 = u;
    Set localSet2 = localSet1;
    if (localSet1 == null)
    {
      localSet2 = u();
      u = localSet2;
    }
    return localSet2;
  }
  
  public void n(int paramInt) {}
  
  public int o(int paramInt1, int paramInt2)
  {
    return paramInt1 - 1;
  }
  
  public int p()
  {
    m.p(J(), "Arrays already allocated");
    int i = s;
    int j = l.j(i);
    o = l.a(j);
    T(j - 1);
    p = new int[i];
    q = new Object[i];
    r = new Object[i];
    return i;
  }
  
  public Object put(Object paramObject1, Object paramObject2)
  {
    if (J()) {
      p();
    }
    Object localObject = w();
    if (localObject != null) {
      return ((Map)localObject).put(paramObject1, paramObject2);
    }
    int[] arrayOfInt = L();
    Object[] arrayOfObject = M();
    localObject = O();
    int i = t;
    int j = i + 1;
    int k = s.c(paramObject1);
    int m = B();
    int n = k & m;
    int i1 = l.h(N(), n);
    int i2;
    if (i1 == 0)
    {
      if (j > m)
      {
        n = R(m, l.e(m), k, i);
        break label266;
      }
      l.i(N(), n, j);
    }
    else
    {
      i2 = l.b(k, m);
      n = 0;
    }
    for (;;)
    {
      int i3 = i1 - 1;
      int i4 = arrayOfInt[i3];
      if ((l.b(i4, m) == i2) && (W2.k.a(paramObject1, arrayOfObject[i3])))
      {
        paramObject1 = localObject[i3];
        localObject[i3] = paramObject2;
        n(i3);
        return paramObject1;
      }
      i1 = l.c(i4, m);
      n++;
      if (i1 == 0)
      {
        if (n >= 9) {
          return q().put(paramObject1, paramObject2);
        }
        if (j > m) {
          break;
        }
        arrayOfInt[i3] = l.d(i4, j, m);
        n = m;
        label266:
        Q(j);
        F(i, paramObject1, paramObject2, k, n);
        t = j;
        C();
        return null;
      }
    }
  }
  
  public Map q()
  {
    Map localMap = t(B() + 1);
    for (int i = z(); i >= 0; i = A(i)) {
      localMap.put(G(i), W(i));
    }
    o = localMap;
    p = null;
    q = null;
    r = null;
    C();
    return localMap;
  }
  
  public Object remove(Object paramObject)
  {
    Object localObject = w();
    if (localObject != null) {
      return ((Map)localObject).remove(paramObject);
    }
    localObject = K(paramObject);
    paramObject = localObject;
    if (localObject == x) {
      paramObject = null;
    }
    return paramObject;
  }
  
  public Set s()
  {
    return new d();
  }
  
  public int size()
  {
    Map localMap = w();
    int i;
    if (localMap != null) {
      i = localMap.size();
    } else {
      i = t;
    }
    return i;
  }
  
  public Map t(int paramInt)
  {
    return new LinkedHashMap(paramInt, 1.0F);
  }
  
  public Set u()
  {
    return new f();
  }
  
  public Collection v()
  {
    return new h();
  }
  
  public Collection values()
  {
    Collection localCollection1 = w;
    Collection localCollection2 = localCollection1;
    if (localCollection1 == null)
    {
      localCollection2 = v();
      w = localCollection2;
    }
    return localCollection2;
  }
  
  public Map w()
  {
    Object localObject = o;
    if ((localObject instanceof Map)) {
      return (Map)localObject;
    }
    return null;
  }
  
  public final int x(int paramInt)
  {
    return L()[paramInt];
  }
  
  public Iterator y()
  {
    Map localMap = w();
    if (localMap != null) {
      return localMap.entrySet().iterator();
    }
    return new b();
  }
  
  public int z()
  {
    int i;
    if (isEmpty()) {
      i = -1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public class a
    extends k.e
  {
    public a()
    {
      super(null);
    }
    
    public Object d(int paramInt)
    {
      return k.b(k.this, paramInt);
    }
  }
  
  public class b
    extends k.e
  {
    public b()
    {
      super(null);
    }
    
    public Map.Entry f(int paramInt)
    {
      return new k.g(k.this, paramInt);
    }
  }
  
  public class c
    extends k.e
  {
    public c()
    {
      super(null);
    }
    
    public Object d(int paramInt)
    {
      return k.j(k.this, paramInt);
    }
  }
  
  public class d
    extends AbstractSet
  {
    public d() {}
    
    public void clear()
    {
      k.this.clear();
    }
    
    public boolean contains(Object paramObject)
    {
      Map localMap = w();
      if (localMap != null) {
        return localMap.entrySet().contains(paramObject);
      }
      boolean bool1 = paramObject instanceof Map.Entry;
      boolean bool2 = false;
      boolean bool3 = bool2;
      if (bool1)
      {
        paramObject = (Map.Entry)paramObject;
        int i = k.i(k.this, ((Map.Entry)paramObject).getKey());
        bool3 = bool2;
        if (i != -1)
        {
          bool3 = bool2;
          if (W2.k.a(k.j(k.this, i), ((Map.Entry)paramObject).getValue())) {
            bool3 = true;
          }
        }
      }
      return bool3;
    }
    
    public Iterator iterator()
    {
      return y();
    }
    
    public boolean remove(Object paramObject)
    {
      Map localMap = w();
      if (localMap != null) {
        return localMap.entrySet().remove(paramObject);
      }
      if ((paramObject instanceof Map.Entry))
      {
        paramObject = (Map.Entry)paramObject;
        if (J()) {
          return false;
        }
        int i = k.k(k.this);
        int j = l.f(((Map.Entry)paramObject).getKey(), ((Map.Entry)paramObject).getValue(), i, k.l(k.this), k.m(k.this), k.c(k.this), k.d(k.this));
        if (j == -1) {
          return false;
        }
        I(j, i);
        k.e(k.this);
        C();
        return true;
      }
      return false;
    }
    
    public int size()
    {
      return k.this.size();
    }
  }
  
  public abstract class e
    implements Iterator
  {
    public int o = k.a(k.this);
    public int p = z();
    public int q = -1;
    
    public e() {}
    
    public final void b()
    {
      if (k.a(k.this) == o) {
        return;
      }
      throw new ConcurrentModificationException();
    }
    
    public abstract Object d(int paramInt);
    
    public void e()
    {
      o += 32;
    }
    
    public boolean hasNext()
    {
      boolean bool;
      if (p >= 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public Object next()
    {
      b();
      if (hasNext())
      {
        int i = p;
        q = i;
        Object localObject = d(i);
        p = A(p);
        return localObject;
      }
      throw new NoSuchElementException();
    }
    
    public void remove()
    {
      b();
      boolean bool;
      if (q >= 0) {
        bool = true;
      } else {
        bool = false;
      }
      i.c(bool);
      e();
      k localk = k.this;
      localk.remove(k.b(localk, q));
      p = o(p, q);
      q = -1;
    }
  }
  
  public class f
    extends AbstractSet
  {
    public f() {}
    
    public void clear()
    {
      k.this.clear();
    }
    
    public boolean contains(Object paramObject)
    {
      return containsKey(paramObject);
    }
    
    public Iterator iterator()
    {
      return H();
    }
    
    public boolean remove(Object paramObject)
    {
      Map localMap = w();
      boolean bool;
      if (localMap != null) {
        bool = localMap.keySet().remove(paramObject);
      } else if (k.g(k.this, paramObject) != k.h()) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public int size()
    {
      return k.this.size();
    }
  }
  
  public final class g
    extends e
  {
    public final Object o;
    public int p;
    
    public g(int paramInt)
    {
      o = k.b(k.this, paramInt);
      p = paramInt;
    }
    
    public final void a()
    {
      int i = p;
      if ((i == -1) || (i >= size()) || (!W2.k.a(o, k.b(k.this, p)))) {
        p = k.i(k.this, o);
      }
    }
    
    public Object getKey()
    {
      return o;
    }
    
    public Object getValue()
    {
      Object localObject = w();
      if (localObject != null) {
        return N.a(((Map)localObject).get(o));
      }
      a();
      int i = p;
      if (i == -1) {
        localObject = N.b();
      } else {
        localObject = k.j(k.this, i);
      }
      return localObject;
    }
    
    public Object setValue(Object paramObject)
    {
      Object localObject = w();
      if (localObject != null) {
        return N.a(((Map)localObject).put(o, paramObject));
      }
      a();
      int i = p;
      if (i == -1)
      {
        put(o, paramObject);
        return N.b();
      }
      localObject = k.j(k.this, i);
      k.f(k.this, p, paramObject);
      return localObject;
    }
  }
  
  public class h
    extends AbstractCollection
  {
    public h() {}
    
    public void clear()
    {
      k.this.clear();
    }
    
    public Iterator iterator()
    {
      return X();
    }
    
    public int size()
    {
      return k.this.size();
    }
  }
}

/* Location:
 * Qualified Name:     X2.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */