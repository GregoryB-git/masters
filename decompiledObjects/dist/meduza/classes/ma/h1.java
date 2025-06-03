package ma;

import f;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import m.e;

public final class h1
  extends h
{
  public static final int[] q = { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE };
  public final int d;
  public final h e;
  public final h f;
  public final int o;
  public final int p;
  
  public h1(h paramh1, h paramh2)
  {
    e = paramh1;
    f = paramh2;
    int i = paramh1.size();
    o = i;
    d = (paramh2.size() + i);
    p = (Math.max(paramh1.o(), paramh2.o()) + 1);
  }
  
  public static int C(int paramInt)
  {
    int[] arrayOfInt = q;
    if (paramInt >= 47) {
      return Integer.MAX_VALUE;
    }
    return arrayOfInt[paramInt];
  }
  
  public final String A(Charset paramCharset)
  {
    return new String(z(), paramCharset);
  }
  
  public final void B(e parame)
  {
    e.B(parame);
    f.B(parame);
  }
  
  public final ByteBuffer a()
  {
    return ByteBuffer.wrap(z()).asReadOnlyBuffer();
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof h)) {
      return false;
    }
    paramObject = (h)paramObject;
    if (d != ((h)paramObject).size()) {
      return false;
    }
    if (d == 0) {
      return true;
    }
    int i = a;
    int j = a;
    if ((i != 0) && (j != 0) && (i != j)) {
      return false;
    }
    c localc1 = new c(this);
    h.g localg = localc1.a();
    c localc2 = new c((h)paramObject);
    paramObject = localc2.a();
    i = 0;
    j = i;
    int k = j;
    for (;;)
    {
      int m = localg.size() - i;
      int n = ((h)paramObject).size() - j;
      int i1 = Math.min(m, n);
      boolean bool2;
      if (i == 0) {
        bool2 = localg.C((h)paramObject, j, i1);
      } else {
        bool2 = ((h.g)paramObject).C(localg, i, i1);
      }
      if (!bool2)
      {
        bool2 = false;
      }
      else
      {
        k += i1;
        int i2 = d;
        if (k < i2) {
          break label224;
        }
        if (k != i2) {
          break label216;
        }
        bool2 = bool1;
      }
      return bool2;
      label216:
      throw new IllegalStateException();
      label224:
      if (i1 == m)
      {
        localg = localc1.a();
        i = 0;
      }
      else
      {
        i += i1;
      }
      if (i1 == n)
      {
        paramObject = localc2.a();
        j = 0;
      }
      else
      {
        j += i1;
      }
    }
  }
  
  public final byte i(int paramInt)
  {
    h.k(paramInt, d);
    return p(paramInt);
  }
  
  public final Iterator iterator()
  {
    return new a();
  }
  
  public final void n(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    int i = o;
    h localh;
    if (paramInt1 + paramInt3 <= i)
    {
      localh = e;
    }
    else
    {
      if (paramInt1 < i) {
        break label54;
      }
      localh = f;
      paramInt1 -= i;
    }
    localh.n(paramInt1, paramArrayOfByte, paramInt2, paramInt3);
    return;
    label54:
    i -= paramInt1;
    e.n(paramInt1, paramArrayOfByte, paramInt2, i);
    f.n(0, paramArrayOfByte, paramInt2 + i, paramInt3 - i);
  }
  
  public final int o()
  {
    return p;
  }
  
  public final byte p(int paramInt)
  {
    int i = o;
    if (paramInt < i) {
      return e.p(paramInt);
    }
    return f.p(paramInt - i);
  }
  
  public final boolean q()
  {
    boolean bool;
    if (d >= C(p)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean r()
  {
    h localh = e;
    int i = o;
    boolean bool = false;
    i = localh.x(0, 0, i);
    localh = f;
    if (localh.x(i, 0, localh.size()) == 0) {
      bool = true;
    }
    return bool;
  }
  
  public final h.f s()
  {
    return new a();
  }
  
  public final int size()
  {
    return d;
  }
  
  public final i t()
  {
    ArrayList localArrayList = new ArrayList();
    ArrayDeque localArrayDeque = new ArrayDeque(p);
    localArrayDeque.push(this);
    for (Object localObject1 = e; (localObject1 instanceof h1); localObject1 = e)
    {
      localObject1 = (h1)localObject1;
      localArrayDeque.push(localObject1);
    }
    for (Object localObject2 = (h.g)localObject1;; localObject2 = localObject1)
    {
      i = 0;
      if (localObject2 != null) {
        j = 1;
      } else {
        j = 0;
      }
      if (j == 0) {
        break label172;
      }
      if (localObject2 == null) {
        break;
      }
      do
      {
        if (localArrayDeque.isEmpty())
        {
          localObject1 = null;
          break;
        }
        for (localObject1 = popf; (localObject1 instanceof h1); localObject1 = e)
        {
          localObject1 = (h1)localObject1;
          localArrayDeque.push(localObject1);
        }
        localObject1 = (h.g)localObject1;
      } while (((h)localObject1).isEmpty());
      localArrayList.add(((h)localObject2).a());
    }
    throw new NoSuchElementException();
    label172:
    localObject2 = localArrayList.iterator();
    int k = 0;
    int j = i;
    int i = k;
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (ByteBuffer)((Iterator)localObject2).next();
      i += ((Buffer)localObject1).remaining();
      if (((ByteBuffer)localObject1).hasArray()) {
        j |= 0x1;
      } else if (((ByteBuffer)localObject1).isDirect()) {
        j |= 0x2;
      } else {
        j |= 0x4;
      }
    }
    if (j == 2) {
      localObject1 = new i.b(localArrayList, i);
    } else {
      localObject1 = new i.c(new c0(localArrayList));
    }
    return (i)localObject1;
  }
  
  public final int u(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = o;
    if (paramInt2 + paramInt3 <= i) {
      return e.u(paramInt1, paramInt2, paramInt3);
    }
    if (paramInt2 >= i) {
      return f.u(paramInt1, paramInt2 - i, paramInt3);
    }
    i -= paramInt2;
    paramInt1 = e.u(paramInt1, paramInt2, i);
    return f.u(paramInt1, 0, paramInt3 - i);
  }
  
  public final int x(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = o;
    if (paramInt2 + paramInt3 <= i) {
      return e.x(paramInt1, paramInt2, paramInt3);
    }
    if (paramInt2 >= i) {
      return f.x(paramInt1, paramInt2 - i, paramInt3);
    }
    i -= paramInt2;
    paramInt1 = e.x(paramInt1, paramInt2, i);
    return f.x(paramInt1, 0, paramInt3 - i);
  }
  
  public final h y(int paramInt1, int paramInt2)
  {
    int i = h.l(paramInt1, paramInt2, d);
    if (i == 0) {
      return h.b;
    }
    if (i == d) {
      return this;
    }
    i = o;
    if (paramInt2 <= i) {
      return e.y(paramInt1, paramInt2);
    }
    if (paramInt1 >= i) {
      return f.y(paramInt1 - i, paramInt2 - i);
    }
    h localh = e;
    return new h1(localh.y(paramInt1, localh.size()), f.y(0, paramInt2 - o));
  }
  
  public final class a
    extends h.b
  {
    public final h1.c a;
    public h.f b;
    
    public a()
    {
      a = new h1.c(this$1);
      b = a();
    }
    
    public final h.a a()
    {
      h.a locala;
      if (a.hasNext()) {
        locala = new h.a(a.a());
      } else {
        locala = null;
      }
      return locala;
    }
    
    public final byte f()
    {
      h.f localf = b;
      if (localf != null)
      {
        byte b1 = localf.f();
        if (!b.hasNext()) {
          b = a();
        }
        return b1;
      }
      throw new NoSuchElementException();
    }
    
    public final boolean hasNext()
    {
      boolean bool;
      if (b != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public static final class b
  {
    public final ArrayDeque<h> a = new ArrayDeque();
    
    public final void a(h paramh)
    {
      if (paramh.q())
      {
        int i = paramh.size();
        int j = Arrays.binarySearch(h1.q, i);
        i = j;
        if (j < 0) {
          i = -(j + 1) - 1;
        }
        j = h1.C(i + 1);
        if ((!a.isEmpty()) && (((h)a.peek()).size() < j))
        {
          i = h1.C(i);
          for (localObject = (h)a.pop(); (!a.isEmpty()) && (((h)a.peek()).size() < i); localObject = new h1((h)a.pop(), (h)localObject)) {}
          for (paramh = new h1((h)localObject, paramh); !a.isEmpty(); paramh = new h1((h)a.pop(), paramh))
          {
            i = d;
            j = Arrays.binarySearch(h1.q, i);
            i = j;
            if (j < 0) {
              i = -(j + 1) - 1;
            }
            i = h1.C(i + 1);
            if (((h)a.peek()).size() >= i) {
              break;
            }
          }
          a.push(paramh);
        }
        else
        {
          a.push(paramh);
        }
      }
      else
      {
        if (!(paramh instanceof h1)) {
          break label282;
        }
        paramh = (h1)paramh;
        a(e);
        a(f);
      }
      return;
      label282:
      Object localObject = f.l("Has a new type of ByteString been created? Found ");
      ((StringBuilder)localObject).append(paramh.getClass());
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
  }
  
  public static final class c
    implements Iterator<h.g>
  {
    public final ArrayDeque<h1> a;
    public h.g b;
    
    public c(h paramh)
    {
      if ((paramh instanceof h1))
      {
        h1 localh1 = (h1)paramh;
        paramh = new ArrayDeque(p);
        a = paramh;
        paramh.push(localh1);
        for (paramh = e; (paramh instanceof h1); paramh = e)
        {
          paramh = (h1)paramh;
          a.push(paramh);
        }
        paramh = (h.g)paramh;
      }
      else
      {
        a = null;
        paramh = (h.g)paramh;
      }
      b = paramh;
    }
    
    public final h.g a()
    {
      h.g localg = b;
      if (localg != null)
      {
        do
        {
          localObject = a;
          if ((localObject == null) || (((ArrayDeque)localObject).isEmpty())) {
            break;
          }
          for (localObject = a.pop()).f; (localObject instanceof h1); localObject = e)
          {
            localObject = (h1)localObject;
            a.push(localObject);
          }
          localObject = (h.g)localObject;
        } while (((h)localObject).isEmpty());
        break label87;
        Object localObject = null;
        label87:
        b = ((h.g)localObject);
        return localg;
      }
      throw new NoSuchElementException();
    }
    
    public final boolean hasNext()
    {
      boolean bool;
      if (b != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final void remove()
    {
      throw new UnsupportedOperationException();
    }
  }
}

/* Location:
 * Qualified Name:     ma.h1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */