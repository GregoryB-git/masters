package com.google.protobuf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

public abstract class f
  implements Iterable, Serializable
{
  public static final f p = new i(t.d);
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
  
  public static int V(byte paramByte)
  {
    return paramByte & 0xFF;
  }
  
  public static f a0(byte[] paramArrayOfByte)
  {
    return new i(paramArrayOfByte);
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
  
  public static f i(String paramString)
  {
    return new i(paramString.getBytes(t.b));
  }
  
  public g D()
  {
    return new a();
  }
  
  public abstract int M(int paramInt1, int paramInt2, int paramInt3);
  
  public final int S()
  {
    return o;
  }
  
  public abstract f T(int paramInt1, int paramInt2);
  
  public final byte[] U()
  {
    int i = size();
    if (i == 0) {
      return t.d;
    }
    byte[] arrayOfByte = new byte[i];
    k(arrayOfByte, 0, 0, i);
    return arrayOfByte;
  }
  
  public final String W(Charset paramCharset)
  {
    if (size() == 0) {
      paramCharset = "";
    } else {
      paramCharset = X(paramCharset);
    }
    return paramCharset;
  }
  
  public abstract String X(Charset paramCharset);
  
  public final String Y()
  {
    return W(t.b);
  }
  
  public final String Z()
  {
    Object localObject;
    if (size() <= 50)
    {
      localObject = e0.a(this);
    }
    else
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(e0.a(T(0, 47)));
      ((StringBuilder)localObject).append("...");
      localObject = ((StringBuilder)localObject).toString();
    }
    return (String)localObject;
  }
  
  public abstract void b0(e parame);
  
  public abstract byte d(int paramInt);
  
  public abstract boolean equals(Object paramObject);
  
  public final int hashCode()
  {
    int i = o;
    int j = i;
    if (i == 0)
    {
      j = size();
      i = M(j, 0, j);
      j = i;
      if (i == 0) {
        j = 1;
      }
      o = j;
    }
    return j;
  }
  
  public abstract void k(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3);
  
  public abstract byte q(int paramInt);
  
  public abstract boolean s();
  
  public abstract int size();
  
  public final String toString()
  {
    return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", new Object[] { Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), Z() });
  }
  
  public class a
    extends f.c
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
        return q(i);
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
    public int a(f paramf1, f paramf2)
    {
      f.g localg1 = paramf1.D();
      f.g localg2 = paramf2.D();
      while ((localg1.hasNext()) && (localg2.hasNext()))
      {
        int i = Integer.valueOf(f.a(localg1.c())).compareTo(Integer.valueOf(f.a(localg2.c())));
        if (i != 0) {
          return i;
        }
      }
      return Integer.valueOf(paramf1.size()).compareTo(Integer.valueOf(paramf2.size()));
    }
  }
  
  public static abstract class c
    implements f.g
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
    implements f.f
  {}
  
  public static final class e
    extends f.i
  {
    private static final long serialVersionUID = 1L;
    public final int t;
    public final int u;
    
    public e(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    {
      super();
      f.g(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
      t = paramInt1;
      u = paramInt2;
    }
    
    private void readObject(ObjectInputStream paramObjectInputStream)
    {
      throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }
    
    public byte d(int paramInt)
    {
      f.f(paramInt, size());
      return s[(t + paramInt)];
    }
    
    public int d0()
    {
      return t;
    }
    
    public void k(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
    {
      System.arraycopy(s, d0() + paramInt1, paramArrayOfByte, paramInt2, paramInt3);
    }
    
    public byte q(int paramInt)
    {
      return s[(t + paramInt)];
    }
    
    public int size()
    {
      return u;
    }
    
    public Object writeReplace()
    {
      return f.a0(U());
    }
  }
  
  public static abstract interface f {}
  
  public static abstract interface g
    extends Iterator
  {
    public abstract byte c();
  }
  
  public static abstract class h
    extends f
  {}
  
  public static class i
    extends f.h
  {
    private static final long serialVersionUID = 1L;
    public final byte[] s;
    
    public i(byte[] paramArrayOfByte)
    {
      paramArrayOfByte.getClass();
      s = paramArrayOfByte;
    }
    
    public final int M(int paramInt1, int paramInt2, int paramInt3)
    {
      return t.h(paramInt1, s, d0() + paramInt2, paramInt3);
    }
    
    public final f T(int paramInt1, int paramInt2)
    {
      paramInt2 = f.g(paramInt1, paramInt2, size());
      if (paramInt2 == 0) {
        return f.p;
      }
      return new f.e(s, d0() + paramInt1, paramInt2);
    }
    
    public final String X(Charset paramCharset)
    {
      return new String(s, d0(), size(), paramCharset);
    }
    
    public final void b0(e parame)
    {
      parame.a(s, d0(), size());
    }
    
    public final boolean c0(f paramf, int paramInt1, int paramInt2)
    {
      if (paramInt2 <= paramf.size())
      {
        int i = paramInt1 + paramInt2;
        if (i <= paramf.size())
        {
          if ((paramf instanceof i))
          {
            paramf = (i)paramf;
            byte[] arrayOfByte = s;
            localObject = s;
            int j = d0();
            int k = d0();
            i = paramf.d0() + paramInt1;
            paramInt1 = k;
            while (paramInt1 < j + paramInt2)
            {
              if (arrayOfByte[paramInt1] != localObject[i]) {
                return false;
              }
              paramInt1++;
              i++;
            }
            return true;
          }
          return paramf.T(paramInt1, i).equals(T(0, paramInt2));
        }
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Ran off end of other: ");
        ((StringBuilder)localObject).append(paramInt1);
        ((StringBuilder)localObject).append(", ");
        ((StringBuilder)localObject).append(paramInt2);
        ((StringBuilder)localObject).append(", ");
        ((StringBuilder)localObject).append(paramf.size());
        throw new IllegalArgumentException(((StringBuilder)localObject).toString());
      }
      paramf = new StringBuilder();
      paramf.append("Length too large: ");
      paramf.append(paramInt2);
      paramf.append(size());
      throw new IllegalArgumentException(paramf.toString());
    }
    
    public byte d(int paramInt)
    {
      return s[paramInt];
    }
    
    public int d0()
    {
      return 0;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (paramObject == this) {
        return true;
      }
      if (!(paramObject instanceof f)) {
        return false;
      }
      if (size() != ((f)paramObject).size()) {
        return false;
      }
      if (size() == 0) {
        return true;
      }
      if ((paramObject instanceof i))
      {
        paramObject = (i)paramObject;
        int i = S();
        int j = ((f)paramObject).S();
        if ((i != 0) && (j != 0) && (i != j)) {
          return false;
        }
        return c0((f)paramObject, 0, size());
      }
      return paramObject.equals(this);
    }
    
    public void k(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
    {
      System.arraycopy(s, paramInt1, paramArrayOfByte, paramInt2, paramInt3);
    }
    
    public byte q(int paramInt)
    {
      return s[paramInt];
    }
    
    public final boolean s()
    {
      int i = d0();
      return l0.m(s, i, size() + i);
    }
    
    public int size()
    {
      return s.length;
    }
  }
  
  public static final class j
    implements f.f
  {}
}

/* Location:
 * Qualified Name:     com.google.protobuf.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */