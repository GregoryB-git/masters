package s0;

import a0.j;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import m.e;

public abstract class g
  implements Iterable<Byte>, Serializable
{
  public static final e b = new e(x.b);
  public static final c c;
  public int a = 0;
  
  static
  {
    Object localObject;
    if (d.a()) {
      localObject = new f();
    } else {
      localObject = new b();
    }
    c = (c)localObject;
  }
  
  public static int h(int paramInt1, int paramInt2, int paramInt3)
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
  
  public static e i(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    h(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
    return new e(c.a(paramArrayOfByte, paramInt1, paramInt2));
  }
  
  public abstract byte a(int paramInt);
  
  public abstract boolean equals(Object paramObject);
  
  public final int hashCode()
  {
    int i = a;
    int j = i;
    if (i == 0)
    {
      j = size();
      i = m(j, j);
      j = i;
      if (i == 0) {
        j = 1;
      }
      a = j;
    }
    return j;
  }
  
  public Iterator iterator()
  {
    return new f(this);
  }
  
  public abstract byte k(int paramInt);
  
  public abstract boolean l();
  
  public abstract int m(int paramInt1, int paramInt2);
  
  public abstract String n(Charset paramCharset);
  
  public abstract void o(e parame);
  
  public abstract int size();
  
  public final String toString()
  {
    return String.format("<ByteString@%s size=%d>", new Object[] { Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()) });
  }
  
  public static abstract class a
    implements Iterator
  {
    public final Object next()
    {
      f localf = (f)this;
      int i = a;
      if (i < b)
      {
        a = (i + 1);
        return Byte.valueOf(c.k(i));
      }
      throw new NoSuchElementException();
    }
    
    public final void remove()
    {
      throw new UnsupportedOperationException();
    }
  }
  
  public static final class b
    implements g.c
  {
    public final byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      return Arrays.copyOfRange(paramArrayOfByte, paramInt1, paramInt2 + paramInt1);
    }
  }
  
  public static abstract interface c
  {
    public abstract byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  }
  
  public static abstract class d
    extends g
  {
    public final Iterator iterator()
    {
      return new f(this);
    }
  }
  
  public static class e
    extends g.d
  {
    public final byte[] d;
    
    public e(byte[] paramArrayOfByte)
    {
      paramArrayOfByte.getClass();
      d = paramArrayOfByte;
    }
    
    public byte a(int paramInt)
    {
      return d[paramInt];
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool1 = true;
      if (paramObject == this) {
        return true;
      }
      if (!(paramObject instanceof g)) {
        return false;
      }
      if (size() != ((g)paramObject).size()) {
        return false;
      }
      if (size() == 0) {
        return true;
      }
      if ((paramObject instanceof e))
      {
        paramObject = (e)paramObject;
        int i = a;
        int j = a;
        if ((i != 0) && (j != 0) && (i != j)) {
          return false;
        }
        int k = size();
        if (k <= ((e)paramObject).size())
        {
          if (0 + k <= ((e)paramObject).size())
          {
            localObject = d;
            byte[] arrayOfByte = d;
            int m = p();
            i = p();
            boolean bool2;
            for (j = ((e)paramObject).p() + 0;; j++)
            {
              bool2 = bool1;
              if (i >= m + k) {
                break;
              }
              if (localObject[i] != arrayOfByte[j])
              {
                bool2 = false;
                break;
              }
              i++;
            }
            return bool2;
          }
          Object localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Ran off end of other: ");
          ((StringBuilder)localObject).append(0);
          ((StringBuilder)localObject).append(", ");
          ((StringBuilder)localObject).append(k);
          ((StringBuilder)localObject).append(", ");
          ((StringBuilder)localObject).append(((e)paramObject).size());
          throw new IllegalArgumentException(((StringBuilder)localObject).toString());
        }
        paramObject = new StringBuilder();
        ((StringBuilder)paramObject).append("Length too large: ");
        ((StringBuilder)paramObject).append(k);
        ((StringBuilder)paramObject).append(size());
        throw new IllegalArgumentException(((StringBuilder)paramObject).toString());
      }
      return paramObject.equals(this);
    }
    
    public byte k(int paramInt)
    {
      return d[paramInt];
    }
    
    public final boolean l()
    {
      int i = p();
      byte[] arrayOfByte = d;
      int j = size();
      boolean bool;
      if (m1.a.c(arrayOfByte, i, j + i) == 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final int m(int paramInt1, int paramInt2)
    {
      byte[] arrayOfByte = d;
      int i = p() + 0;
      Charset localCharset = x.a;
      int j = i;
      int k = paramInt1;
      for (paramInt1 = j; paramInt1 < i + paramInt2; paramInt1++) {
        k = k * 31 + arrayOfByte[paramInt1];
      }
      return k;
    }
    
    public final String n(Charset paramCharset)
    {
      return new String(d, p(), size(), paramCharset);
    }
    
    public final void o(e parame)
    {
      parame.s(d, p(), size());
    }
    
    public int p()
    {
      return 0;
    }
    
    public int size()
    {
      return d.length;
    }
  }
  
  public static final class f
    implements g.c
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
 * Qualified Name:     s0.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */