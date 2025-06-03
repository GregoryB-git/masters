package androidx.datastore.preferences.protobuf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class g
  implements Iterable, Serializable
{
  public static final g p = new i(y.c);
  public static final f q;
  public static final Comparator r = new b();
  public int o = 0;
  
  static
  {
    Object localObject;
    if (d.c()) {
      localObject = new j(null);
    } else {
      localObject = new d(null);
    }
    q = (f)localObject;
  }
  
  public static int X(byte paramByte)
  {
    return paramByte & 0xFF;
  }
  
  public static g b0(byte[] paramArrayOfByte)
  {
    return new i(paramArrayOfByte);
  }
  
  public static g c0(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new e(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public static void f(int paramInt1, int paramInt2)
  {
    if ((paramInt2 - (paramInt1 + 1) | paramInt1) < 0)
    {
      if (paramInt1 < 0)
      {
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("Index < 0: ");
        localStringBuilder.append(paramInt1);
        throw new ArrayIndexOutOfBoundsException(localStringBuilder.toString());
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Index > length: ");
      localStringBuilder.append(paramInt1);
      localStringBuilder.append(", ");
      localStringBuilder.append(paramInt2);
      throw new ArrayIndexOutOfBoundsException(localStringBuilder.toString());
    }
  }
  
  public static int g(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt2 - paramInt1;
    if ((paramInt1 | paramInt2 | i | paramInt3 - paramInt2) < 0)
    {
      if (paramInt1 >= 0)
      {
        if (paramInt2 < paramInt1)
        {
          localStringBuilder = new StringBuilder();
          localStringBuilder.append("Beginning index larger than ending index: ");
          localStringBuilder.append(paramInt1);
          localStringBuilder.append(", ");
          localStringBuilder.append(paramInt2);
          throw new IndexOutOfBoundsException(localStringBuilder.toString());
        }
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("End index: ");
        localStringBuilder.append(paramInt2);
        localStringBuilder.append(" >= ");
        localStringBuilder.append(paramInt3);
        throw new IndexOutOfBoundsException(localStringBuilder.toString());
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Beginning index: ");
      localStringBuilder.append(paramInt1);
      localStringBuilder.append(" < 0");
      throw new IndexOutOfBoundsException(localStringBuilder.toString());
    }
    return i;
  }
  
  public static g i(byte[] paramArrayOfByte)
  {
    return k(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static g k(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    g(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
    return new i(q.a(paramArrayOfByte, paramInt1, paramInt2));
  }
  
  public static g q(String paramString)
  {
    return new i(paramString.getBytes(y.a));
  }
  
  public abstract byte D(int paramInt);
  
  public abstract boolean M();
  
  public g S()
  {
    return new a();
  }
  
  public abstract int T(int paramInt1, int paramInt2, int paramInt3);
  
  public final int U()
  {
    return o;
  }
  
  public abstract g V(int paramInt1, int paramInt2);
  
  public final byte[] W()
  {
    int i = size();
    if (i == 0) {
      return y.c;
    }
    byte[] arrayOfByte = new byte[i];
    s(arrayOfByte, 0, 0, i);
    return arrayOfByte;
  }
  
  public final String Y(Charset paramCharset)
  {
    if (size() == 0) {
      paramCharset = "";
    } else {
      paramCharset = Z(paramCharset);
    }
    return paramCharset;
  }
  
  public abstract String Z(Charset paramCharset);
  
  public final String a0()
  {
    return Y(y.a);
  }
  
  public abstract byte d(int paramInt);
  
  public abstract void d0(f paramf);
  
  public abstract boolean equals(Object paramObject);
  
  public final int hashCode()
  {
    int i = o;
    int j = i;
    if (i == 0)
    {
      j = size();
      i = T(j, 0, j);
      j = i;
      if (i == 0) {
        j = 1;
      }
      o = j;
    }
    return j;
  }
  
  public abstract void s(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3);
  
  public abstract int size();
  
  public final String toString()
  {
    return String.format("<ByteString@%s size=%d>", new Object[] { Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()) });
  }
  
  public class a
    extends g.c
  {
    public int o = 0;
    public final int p = size();
    
    public a() {}
    
    public byte c()
    {
      int i = o;
      if (i < p)
      {
        o = (i + 1);
        return D(i);
      }
      throw new NoSuchElementException();
    }
    
    public boolean hasNext()
    {
      boolean bool;
      if (o < p) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public static final class b
    implements Comparator
  {
    public int a(g paramg1, g paramg2)
    {
      g.g localg1 = paramg1.S();
      g.g localg2 = paramg2.S();
      while ((localg1.hasNext()) && (localg2.hasNext()))
      {
        int i = Integer.compare(g.a(localg1.c()), g.a(localg2.c()));
        if (i != 0) {
          return i;
        }
      }
      return Integer.compare(paramg1.size(), paramg2.size());
    }
  }
  
  public static abstract class c
    implements g.g
  {
    public final Byte b()
    {
      return Byte.valueOf(c());
    }
    
    public final void remove()
    {
      throw new UnsupportedOperationException();
    }
  }
  
  public static final class d
    implements g.f
  {
    public byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      return Arrays.copyOfRange(paramArrayOfByte, paramInt1, paramInt2 + paramInt1);
    }
  }
  
  public static final class e
    extends g.i
  {
    private static final long serialVersionUID = 1L;
    public final int t;
    public final int u;
    
    public e(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      super();
      g.g(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
      t = paramInt1;
      u = paramInt2;
    }
    
    private void readObject(ObjectInputStream paramObjectInputStream)
    {
      throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }
    
    public byte D(int paramInt)
    {
      return s[(t + paramInt)];
    }
    
    public byte d(int paramInt)
    {
      g.f(paramInt, size());
      return s[(t + paramInt)];
    }
    
    public int f0()
    {
      return t;
    }
    
    public void s(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
    {
      System.arraycopy(s, f0() + paramInt1, paramArrayOfByte, paramInt2, paramInt3);
    }
    
    public int size()
    {
      return u;
    }
    
    public Object writeReplace()
    {
      return g.b0(W());
    }
  }
  
  public static abstract interface f
  {
    public abstract byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  }
  
  public static abstract interface g
    extends Iterator
  {
    public abstract byte c();
  }
  
  public static abstract class h
    extends g
  {}
  
  public static class i
    extends g.h
  {
    private static final long serialVersionUID = 1L;
    public final byte[] s;
    
    public i(byte[] paramArrayOfByte)
    {
      paramArrayOfByte.getClass();
      s = paramArrayOfByte;
    }
    
    public byte D(int paramInt)
    {
      return s[paramInt];
    }
    
    public final boolean M()
    {
      int i = f0();
      return q0.n(s, i, size() + i);
    }
    
    public final int T(int paramInt1, int paramInt2, int paramInt3)
    {
      return y.i(paramInt1, s, f0() + paramInt2, paramInt3);
    }
    
    public final g V(int paramInt1, int paramInt2)
    {
      paramInt2 = g.g(paramInt1, paramInt2, size());
      if (paramInt2 == 0) {
        return g.p;
      }
      return new g.e(s, f0() + paramInt1, paramInt2);
    }
    
    public final String Z(Charset paramCharset)
    {
      return new String(s, f0(), size(), paramCharset);
    }
    
    public byte d(int paramInt)
    {
      return s[paramInt];
    }
    
    public final void d0(f paramf)
    {
      paramf.a(s, f0(), size());
    }
    
    public final boolean e0(g paramg, int paramInt1, int paramInt2)
    {
      if (paramInt2 <= paramg.size())
      {
        int i = paramInt1 + paramInt2;
        if (i <= paramg.size())
        {
          if ((paramg instanceof i))
          {
            paramg = (i)paramg;
            localObject = s;
            byte[] arrayOfByte = s;
            int j = f0();
            i = f0();
            int k = paramg.f0() + paramInt1;
            paramInt1 = i;
            for (i = k; paramInt1 < j + paramInt2; i++)
            {
              if (localObject[paramInt1] != arrayOfByte[i]) {
                return false;
              }
              paramInt1++;
            }
            return true;
          }
          return paramg.V(paramInt1, i).equals(V(0, paramInt2));
        }
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Ran off end of other: ");
        ((StringBuilder)localObject).append(paramInt1);
        ((StringBuilder)localObject).append(", ");
        ((StringBuilder)localObject).append(paramInt2);
        ((StringBuilder)localObject).append(", ");
        ((StringBuilder)localObject).append(paramg.size());
        throw new IllegalArgumentException(((StringBuilder)localObject).toString());
      }
      paramg = new StringBuilder();
      paramg.append("Length too large: ");
      paramg.append(paramInt2);
      paramg.append(size());
      throw new IllegalArgumentException(paramg.toString());
    }
    
    public final boolean equals(Object paramObject)
    {
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
      if ((paramObject instanceof i))
      {
        paramObject = (i)paramObject;
        int i = U();
        int j = ((g)paramObject).U();
        if ((i != 0) && (j != 0) && (i != j)) {
          return false;
        }
        return e0((g)paramObject, 0, size());
      }
      return paramObject.equals(this);
    }
    
    public int f0()
    {
      return 0;
    }
    
    public void s(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
    {
      System.arraycopy(s, paramInt1, paramArrayOfByte, paramInt2, paramInt3);
    }
    
    public int size()
    {
      return s.length;
    }
  }
  
  public static final class j
    implements g.f
  {
    public byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      byte[] arrayOfByte = new byte[paramInt2];
      System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, paramInt2);
      return arrayOfByte;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */