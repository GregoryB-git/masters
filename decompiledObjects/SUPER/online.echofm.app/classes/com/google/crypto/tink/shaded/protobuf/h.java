package com.google.crypto.tink.shaded.protobuf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

public abstract class h
  implements Iterable, Serializable
{
  public static final h p = new j(z.d);
  public static final f q;
  public static final Comparator r = new b();
  public int o = 0;
  
  static
  {
    Object localObject;
    if (d.c()) {
      localObject = new k(null);
    } else {
      localObject = new d(null);
    }
    q = (f)localObject;
  }
  
  public static h T(int paramInt)
  {
    return new h(paramInt, null);
  }
  
  public static int Z(byte paramByte)
  {
    return paramByte & 0xFF;
  }
  
  public static h e0(byte[] paramArrayOfByte)
  {
    return new j(paramArrayOfByte);
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
  
  public static h f0(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new e(paramArrayOfByte, paramInt1, paramInt2);
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
  
  public static h i(byte[] paramArrayOfByte)
  {
    return k(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static h k(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    g(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
    return new j(q.a(paramArrayOfByte, paramInt1, paramInt2));
  }
  
  public static h q(String paramString)
  {
    return new j(paramString.getBytes(z.b));
  }
  
  public abstract byte D(int paramInt);
  
  public abstract boolean M();
  
  public g S()
  {
    return new a();
  }
  
  public abstract i U();
  
  public abstract int V(int paramInt1, int paramInt2, int paramInt3);
  
  public final int W()
  {
    return o;
  }
  
  public abstract h X(int paramInt1, int paramInt2);
  
  public final byte[] Y()
  {
    int i = size();
    if (i == 0) {
      return z.d;
    }
    byte[] arrayOfByte = new byte[i];
    s(arrayOfByte, 0, 0, i);
    return arrayOfByte;
  }
  
  public final String a0(Charset paramCharset)
  {
    if (size() == 0) {
      paramCharset = "";
    } else {
      paramCharset = b0(paramCharset);
    }
    return paramCharset;
  }
  
  public abstract String b0(Charset paramCharset);
  
  public final String c0()
  {
    return a0(z.b);
  }
  
  public abstract byte d(int paramInt);
  
  public final String d0()
  {
    Object localObject;
    if (size() <= 50)
    {
      localObject = i0.a(this);
    }
    else
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(i0.a(X(0, 47)));
      ((StringBuilder)localObject).append("...");
      localObject = ((StringBuilder)localObject).toString();
    }
    return (String)localObject;
  }
  
  public abstract boolean equals(Object paramObject);
  
  public abstract void g0(g paramg);
  
  public final int hashCode()
  {
    int i = o;
    int j = i;
    if (i == 0)
    {
      j = size();
      i = V(j, 0, j);
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
    return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", new Object[] { Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), d0() });
  }
  
  public class a
    extends h.c
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
  
  public class b
    implements Comparator
  {
    public int a(h paramh1, h paramh2)
    {
      h.g localg1 = paramh1.S();
      h.g localg2 = paramh2.S();
      while ((localg1.hasNext()) && (localg2.hasNext()))
      {
        int i = Integer.valueOf(h.a(localg1.c())).compareTo(Integer.valueOf(h.a(localg2.c())));
        if (i != 0) {
          return i;
        }
      }
      return Integer.valueOf(paramh1.size()).compareTo(Integer.valueOf(paramh2.size()));
    }
  }
  
  public static abstract class c
    implements h.g
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
    implements h.f
  {
    public byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      return Arrays.copyOfRange(paramArrayOfByte, paramInt1, paramInt2 + paramInt1);
    }
  }
  
  public static final class e
    extends h.j
  {
    private static final long serialVersionUID = 1L;
    public final int t;
    public final int u;
    
    public e(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      super();
      h.g(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
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
      h.f(paramInt, size());
      return s[(t + paramInt)];
    }
    
    public int i0()
    {
      return t;
    }
    
    public void s(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
    {
      System.arraycopy(s, i0() + paramInt1, paramArrayOfByte, paramInt2, paramInt3);
    }
    
    public int size()
    {
      return u;
    }
    
    public Object writeReplace()
    {
      return h.e0(Y());
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
  
  public static final class h
  {
    public final k a;
    public final byte[] b;
    
    public h(int paramInt)
    {
      byte[] arrayOfByte = new byte[paramInt];
      b = arrayOfByte;
      a = k.U(arrayOfByte);
    }
    
    public h a()
    {
      a.c();
      return new h.j(b);
    }
    
    public k b()
    {
      return a;
    }
  }
  
  public static abstract class i
    extends h
  {}
  
  public static class j
    extends h.i
  {
    private static final long serialVersionUID = 1L;
    public final byte[] s;
    
    public j(byte[] paramArrayOfByte)
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
      int i = i0();
      return p0.n(s, i, size() + i);
    }
    
    public final i U()
    {
      return i.j(s, i0(), size(), true);
    }
    
    public final int V(int paramInt1, int paramInt2, int paramInt3)
    {
      return z.h(paramInt1, s, i0() + paramInt2, paramInt3);
    }
    
    public final h X(int paramInt1, int paramInt2)
    {
      paramInt2 = h.g(paramInt1, paramInt2, size());
      if (paramInt2 == 0) {
        return h.p;
      }
      return new h.e(s, i0() + paramInt1, paramInt2);
    }
    
    public final String b0(Charset paramCharset)
    {
      return new String(s, i0(), size(), paramCharset);
    }
    
    public byte d(int paramInt)
    {
      return s[paramInt];
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
      if ((paramObject instanceof j))
      {
        paramObject = (j)paramObject;
        int i = W();
        int j = ((h)paramObject).W();
        if ((i != 0) && (j != 0) && (i != j)) {
          return false;
        }
        return h0((h)paramObject, 0, size());
      }
      return paramObject.equals(this);
    }
    
    public final void g0(g paramg)
    {
      paramg.a(s, i0(), size());
    }
    
    public final boolean h0(h paramh, int paramInt1, int paramInt2)
    {
      if (paramInt2 <= paramh.size())
      {
        int i = paramInt1 + paramInt2;
        if (i <= paramh.size())
        {
          if ((paramh instanceof j))
          {
            j localj = (j)paramh;
            paramh = s;
            localObject = s;
            int j = i0();
            i = i0();
            for (paramInt1 = localj.i0() + paramInt1; i < j + paramInt2; paramInt1++)
            {
              if (paramh[i] != localObject[paramInt1]) {
                return false;
              }
              i++;
            }
            return true;
          }
          return paramh.X(paramInt1, i).equals(X(0, paramInt2));
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
    
    public int i0()
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
  
  public static final class k
    implements h.f
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
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */