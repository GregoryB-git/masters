package ma;

import a0.j;
import b.z;
import f;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import m.e;

public abstract class h
  implements Iterable<Byte>, Serializable
{
  public static final h b = new h(a0.b);
  public static final e c;
  public int a = 0;
  
  static
  {
    Object localObject;
    if (d.a()) {
      localObject = new i();
    } else {
      localObject = new c();
    }
    c = (e)localObject;
  }
  
  public static h h(Iterator<h> paramIterator, int paramInt)
  {
    if (paramInt >= 1)
    {
      Object localObject1;
      if (paramInt == 1)
      {
        paramIterator = (h)paramIterator.next();
      }
      else
      {
        int i = paramInt >>> 1;
        localObject1 = h(paramIterator, i);
        paramIterator = h(paramIterator, paramInt - i);
        if (Integer.MAX_VALUE - ((h)localObject1).size() < paramIterator.size()) {
          break label534;
        }
        if (paramIterator.size() == 0)
        {
          paramIterator = (Iterator<h>)localObject1;
        }
        else if (((h)localObject1).size() != 0)
        {
          paramInt = ((h)localObject1).size();
          i = paramIterator.size() + paramInt;
          int j;
          int k;
          if (i < 128)
          {
            j = ((h)localObject1).size();
            paramInt = paramIterator.size();
            k = j + paramInt;
            localObject2 = new byte[k];
            i = j + 0;
            l(0, i, ((h)localObject1).size());
            l(0, i, k);
            if (j > 0) {
              ((h)localObject1).n(0, (byte[])localObject2, 0, j);
            }
            l(0, paramInt + 0, paramIterator.size());
            l(j, k, k);
            if (paramInt > 0) {
              paramIterator.n(0, (byte[])localObject2, j, paramInt);
            }
            paramIterator = new h((byte[])localObject2);
          }
          else
          {
            if ((localObject1 instanceof h1))
            {
              localObject2 = (h1)localObject1;
              paramInt = f.size();
              if (paramIterator.size() + paramInt < 128)
              {
                h localh = f;
                paramInt = localh.size();
                j = paramIterator.size();
                k = paramInt + j;
                localObject1 = new byte[k];
                i = paramInt + 0;
                l(0, i, localh.size());
                l(0, i, k);
                if (paramInt > 0) {
                  localh.n(0, (byte[])localObject1, 0, paramInt);
                }
                l(0, j + 0, paramIterator.size());
                l(paramInt, k, k);
                if (j > 0) {
                  paramIterator.n(0, (byte[])localObject1, paramInt, j);
                }
                paramIterator = new h((byte[])localObject1);
                paramIterator = new h1(e, paramIterator);
                break label460;
              }
              if ((e.o() > f.o()) && (p > paramIterator.o()))
              {
                paramIterator = new h1(f, paramIterator);
                paramIterator = new h1(e, paramIterator);
                break label532;
              }
            }
            if (i >= h1.C(Math.max(((h)localObject1).o(), paramIterator.o()) + 1))
            {
              paramIterator = new h1((h)localObject1, paramIterator);
            }
            else
            {
              label460:
              localObject2 = new h1.b();
              ((h1.b)localObject2).a((h)localObject1);
              ((h1.b)localObject2).a(paramIterator);
              for (localObject1 = (h)a.pop();; localObject1 = new h1((h)a.pop(), (h)localObject1))
              {
                paramIterator = (Iterator<h>)localObject1;
                if (a.isEmpty()) {
                  break;
                }
              }
            }
          }
        }
      }
      label532:
      return paramIterator;
      label534:
      Object localObject2 = f.l("ByteString would be too long: ");
      ((StringBuilder)localObject2).append(((h)localObject1).size());
      ((StringBuilder)localObject2).append("+");
      ((StringBuilder)localObject2).append(paramIterator.size());
      throw new IllegalArgumentException(((StringBuilder)localObject2).toString());
    }
    throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[] { Integer.valueOf(paramInt) }));
  }
  
  public static void k(int paramInt1, int paramInt2)
  {
    if ((paramInt2 - (paramInt1 + 1) | paramInt1) < 0)
    {
      if (paramInt1 < 0) {
        throw new ArrayIndexOutOfBoundsException(f.h("Index < 0: ", paramInt1));
      }
      throw new ArrayIndexOutOfBoundsException(f.i("Index > length: ", paramInt1, ", ", paramInt2));
    }
  }
  
  public static int l(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt2 - paramInt1;
    if ((paramInt1 | paramInt2 | i | paramInt3 - paramInt2) < 0)
    {
      if (paramInt1 >= 0)
      {
        if (paramInt2 < paramInt1) {
          throw new IndexOutOfBoundsException(f.i("Beginning index larger than ending index: ", paramInt1, ", ", paramInt2));
        }
        throw new IndexOutOfBoundsException(f.i("End index: ", paramInt2, " >= ", paramInt3));
      }
      throw new IndexOutOfBoundsException(j.h("Beginning index: ", paramInt1, " < 0"));
    }
    return i;
  }
  
  public static h m(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    l(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
    return new h(c.a(paramArrayOfByte, paramInt1, paramInt2));
  }
  
  public abstract String A(Charset paramCharset);
  
  public abstract void B(e parame);
  
  public abstract ByteBuffer a();
  
  public abstract boolean equals(Object paramObject);
  
  public final int hashCode()
  {
    int i = a;
    int j = i;
    if (i == 0)
    {
      j = size();
      i = u(j, 0, j);
      j = i;
      if (i == 0) {
        j = 1;
      }
      a = j;
    }
    return j;
  }
  
  public abstract byte i(int paramInt);
  
  public final boolean isEmpty()
  {
    boolean bool;
    if (size() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public abstract void n(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3);
  
  public abstract int o();
  
  public abstract byte p(int paramInt);
  
  public abstract boolean q();
  
  public abstract boolean r();
  
  public f s()
  {
    return new a();
  }
  
  public abstract int size();
  
  public abstract i t();
  
  public final String toString()
  {
    Locale localLocale = Locale.ROOT;
    String str = Integer.toHexString(System.identityHashCode(this));
    int i = size();
    Object localObject;
    if (size() <= 50)
    {
      localObject = z.i(this);
    }
    else
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(z.i(y(0, 47)));
      ((StringBuilder)localObject).append("...");
      localObject = ((StringBuilder)localObject).toString();
    }
    return String.format(localLocale, "<ByteString@%s size=%d contents=\"%s\">", new Object[] { str, Integer.valueOf(i), localObject });
  }
  
  public abstract int u(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract int x(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract h y(int paramInt1, int paramInt2);
  
  public final byte[] z()
  {
    int i = size();
    if (i == 0) {
      return a0.b;
    }
    byte[] arrayOfByte = new byte[i];
    n(0, arrayOfByte, 0, i);
    return arrayOfByte;
  }
  
  public final class a
    extends h.b
  {
    public int a = 0;
    public final int b = size();
    
    public a() {}
    
    public final byte f()
    {
      int i = a;
      if (i < b)
      {
        a = (i + 1);
        return p(i);
      }
      throw new NoSuchElementException();
    }
    
    public final boolean hasNext()
    {
      boolean bool;
      if (a < b) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public static abstract class b
    implements h.f
  {
    public final Object next()
    {
      return Byte.valueOf(f());
    }
    
    public final void remove()
    {
      throw new UnsupportedOperationException();
    }
  }
  
  public static final class c
    implements h.e
  {
    public final byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      return Arrays.copyOfRange(paramArrayOfByte, paramInt1, paramInt2 + paramInt1);
    }
  }
  
  public static final class d
    extends h.h
  {
    public final int e;
    public final int f;
    
    public d(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      super();
      h.l(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
      e = paramInt1;
      f = paramInt2;
    }
    
    public final int D()
    {
      return e;
    }
    
    public final byte i(int paramInt)
    {
      h.k(paramInt, f);
      return d[(e + paramInt)];
    }
    
    public final void n(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
    {
      System.arraycopy(d, e + paramInt1, paramArrayOfByte, paramInt2, paramInt3);
    }
    
    public final byte p(int paramInt)
    {
      return d[(e + paramInt)];
    }
    
    public final int size()
    {
      return f;
    }
  }
  
  public static abstract interface e
  {
    public abstract byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  }
  
  public static abstract interface f
    extends Iterator<Byte>
  {
    public abstract byte f();
  }
  
  public static abstract class g
    extends h
  {
    public abstract boolean C(h paramh, int paramInt1, int paramInt2);
    
    public final Iterator iterator()
    {
      return new h.a(this);
    }
    
    public final int o()
    {
      return 0;
    }
    
    public final boolean q()
    {
      return true;
    }
  }
  
  public static class h
    extends h.g
  {
    public final byte[] d;
    
    public h(byte[] paramArrayOfByte)
    {
      paramArrayOfByte.getClass();
      d = paramArrayOfByte;
    }
    
    public final String A(Charset paramCharset)
    {
      return new String(d, D(), size(), paramCharset);
    }
    
    public final void B(e parame)
    {
      parame.s(d, D(), size());
    }
    
    public final boolean C(h paramh, int paramInt1, int paramInt2)
    {
      if (paramInt2 <= paramh.size())
      {
        int i = paramInt1 + paramInt2;
        if (i <= paramh.size())
        {
          if ((paramh instanceof h))
          {
            localObject = (h)paramh;
            paramh = d;
            byte[] arrayOfByte = d;
            int j = D();
            i = D();
            for (paramInt1 = ((h)localObject).D() + paramInt1; i < j + paramInt2; paramInt1++)
            {
              if (paramh[i] != arrayOfByte[paramInt1]) {
                return false;
              }
              i++;
            }
            return true;
          }
          return paramh.y(paramInt1, i).equals(y(0, paramInt2));
        }
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Ran off end of other: ");
        ((StringBuilder)localObject).append(paramInt1);
        ((StringBuilder)localObject).append(", ");
        ((StringBuilder)localObject).append(paramInt2);
        ((StringBuilder)localObject).append(", ");
        ((StringBuilder)localObject).append(paramh.size());
        throw new IllegalArgumentException(((StringBuilder)localObject).toString());
      }
      paramh = new StringBuilder();
      paramh.append("Length too large: ");
      paramh.append(paramInt2);
      paramh.append(size());
      throw new IllegalArgumentException(paramh.toString());
    }
    
    public int D()
    {
      return 0;
    }
    
    public final ByteBuffer a()
    {
      return ByteBuffer.wrap(d, D(), size()).asReadOnlyBuffer();
    }
    
    public final boolean equals(Object paramObject)
    {
      if (paramObject == this) {
        return true;
      }
      if (!(paramObject instanceof h)) {
        return false;
      }
      if (size() != ((h)paramObject).size()) {
        return false;
      }
      if (size() == 0) {
        return true;
      }
      if ((paramObject instanceof h))
      {
        paramObject = (h)paramObject;
        int i = a;
        int j = a;
        if ((i != 0) && (j != 0) && (i != j)) {
          return false;
        }
        return C((h)paramObject, 0, size());
      }
      return paramObject.equals(this);
    }
    
    public byte i(int paramInt)
    {
      return d[paramInt];
    }
    
    public void n(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
    {
      System.arraycopy(d, paramInt1, paramArrayOfByte, paramInt2, paramInt3);
    }
    
    public byte p(int paramInt)
    {
      return d[paramInt];
    }
    
    public final boolean r()
    {
      int i = D();
      return u1.e(d, i, size() + i);
    }
    
    public int size()
    {
      return d.length;
    }
    
    public final i t()
    {
      return i.f(d, D(), size(), true);
    }
    
    public final int u(int paramInt1, int paramInt2, int paramInt3)
    {
      byte[] arrayOfByte = d;
      int i = D() + paramInt2;
      Charset localCharset = a0.a;
      for (paramInt2 = i; paramInt2 < i + paramInt3; paramInt2++) {
        paramInt1 = paramInt1 * 31 + arrayOfByte[paramInt2];
      }
      return paramInt1;
    }
    
    public final int x(int paramInt1, int paramInt2, int paramInt3)
    {
      paramInt2 = D() + paramInt2;
      byte[] arrayOfByte = d;
      return u1.a.e(paramInt1, arrayOfByte, paramInt2, paramInt3 + paramInt2);
    }
    
    public final h y(int paramInt1, int paramInt2)
    {
      paramInt2 = h.l(paramInt1, paramInt2, size());
      if (paramInt2 == 0) {
        return h.b;
      }
      return new h.d(d, D() + paramInt1, paramInt2);
    }
  }
  
  public static final class i
    implements h.e
  {
    public final byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      byte[] arrayOfByte = new byte[paramInt2];
      System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, paramInt2);
      return arrayOfByte;
    }
  }
}

/* Location:
 * Qualified Name:     ma.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */