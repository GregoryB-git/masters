package eb;

import f;
import g;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import n7.d;
import p2.m0;
import p7.a;
import p7.a.e;
import x6.b;

public final class s0
{
  public static final Logger c = Logger.getLogger(s0.class.getName());
  public static final a d = new a();
  public static final a e;
  public Object[] a;
  public int b;
  
  static
  {
    Object localObject = a.a;
    if (c != null) {
      localObject = ((a.e)localObject).g(b);
    }
    e = (a)localObject;
  }
  
  public s0() {}
  
  public s0(byte[]... paramVarArgs)
  {
    b = i;
    a = paramVarArgs;
  }
  
  public final <T> void a(d<T> paramd)
  {
    if (b == 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return;
    }
    int i = 0;
    int j = i;
    int k;
    for (;;)
    {
      k = b;
      if (i >= k) {
        break;
      }
      if (!Arrays.equals(b, e(i)))
      {
        byte[] arrayOfByte = e(i);
        Object[] arrayOfObject = a;
        int m = j * 2;
        arrayOfObject[m] = arrayOfByte;
        arrayOfByte = arrayOfObject[(i * 2 + 1)];
        if ((arrayOfObject instanceof byte[][]))
        {
          if (arrayOfObject != null) {
            k = arrayOfObject.length;
          } else {
            k = 0;
          }
          b(k);
        }
        a[(m + 1)] = arrayOfByte;
        j++;
      }
      i++;
    }
    Arrays.fill(a, j * 2, k * 2, null);
    b = j;
  }
  
  public final void b(int paramInt)
  {
    Object[] arrayOfObject = new Object[paramInt];
    int i = b;
    if (i == 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    if (paramInt == 0) {
      System.arraycopy(a, 0, arrayOfObject, 0, i * 2);
    }
    a = arrayOfObject;
  }
  
  public final <T> T c(d<T> paramd)
  {
    int i = b;
    int j;
    do
    {
      j = i - 1;
      if (j < 0) {
        break;
      }
      i = j;
    } while (!Arrays.equals(b, e(j)));
    Object localObject = a[(j * 2 + 1)];
    if ((localObject instanceof byte[]))
    {
      paramd = paramd.a((byte[])localObject);
    }
    else
    {
      localObject = (e)localObject;
      localObject.getClass();
      paramd = paramd.a(((e)localObject).a());
    }
    return paramd;
    return null;
  }
  
  public final void d(s0 params0)
  {
    int i = b;
    int j = 1;
    int k;
    if (i == 0) {
      k = 1;
    } else {
      k = 0;
    }
    if (k != 0) {
      return;
    }
    Object[] arrayOfObject = a;
    if (arrayOfObject != null) {
      k = arrayOfObject.length;
    } else {
      k = 0;
    }
    int m = b;
    if (m != 0) {
      j = 0;
    }
    if ((j != 0) || (k - m * 2 < i * 2)) {
      b(i * 2 + m * 2);
    }
    System.arraycopy(a, 0, a, b * 2, b * 2);
    b += b;
  }
  
  public final byte[] e(int paramInt)
  {
    return (byte[])a[(paramInt * 2)];
  }
  
  public final void f(d paramd, Serializable paramSerializable)
  {
    b.y(paramd, "key");
    b.y(paramSerializable, "value");
    int i = b;
    int j = i * 2;
    if (j != 0)
    {
      localObject = a;
      if (localObject != null) {
        k = localObject.length;
      } else {
        k = 0;
      }
      if (j != k) {}
    }
    else
    {
      b(Math.max(i * 2 * 2, 8));
    }
    int k = b;
    Object localObject = b;
    a[(k * 2)] = localObject;
    paramd = paramd.b(paramSerializable);
    a[(k * 2 + 1)] = paramd;
    b += 1;
  }
  
  public final byte[] g(int paramInt)
  {
    Object localObject = a[(paramInt * 2 + 1)];
    if ((localObject instanceof byte[])) {
      return (byte[])localObject;
    }
    return ((e)localObject).a();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Metadata(");
    for (int i = 0; i < b; i++)
    {
      if (i != 0) {
        localStringBuilder.append(',');
      }
      Object localObject1 = e(i);
      Object localObject2 = d.a;
      localObject1 = new String((byte[])localObject1, (Charset)localObject2);
      localStringBuilder.append((String)localObject1);
      localStringBuilder.append('=');
      if (((String)localObject1).endsWith("-bin")) {
        localObject2 = e.c(g(i));
      } else {
        localObject2 = new String(g(i), (Charset)localObject2);
      }
      localStringBuilder.append((String)localObject2);
    }
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
  
  public final class a
    implements s0.c<String>
  {
    public final String a(Serializable paramSerializable)
    {
      return (String)paramSerializable;
    }
    
    public final Object b(String paramString)
    {
      return paramString;
    }
  }
  
  public static final class b<T>
    extends s0.d<T>
  {
    public final s0.c<T> e;
    
    public b(String paramString, s0.c paramc)
    {
      super(false, paramc);
      b.r(paramString.endsWith("-bin") ^ true, "ASCII header is named %s.  Only binary headers may end with %s", paramString, "-bin");
      b.y(paramc, "marshaller");
      e = paramc;
    }
    
    public final T a(byte[] paramArrayOfByte)
    {
      return (T)e.b(new String(paramArrayOfByte, d.a));
    }
    
    public final byte[] b(Serializable paramSerializable)
    {
      paramSerializable = e.a(paramSerializable);
      b.y(paramSerializable, "null marshaller.toAsciiString()");
      return paramSerializable.getBytes(d.a);
    }
  }
  
  public static abstract interface c<T>
  {
    public abstract String a(Serializable paramSerializable);
    
    public abstract T b(String paramString);
  }
  
  public static abstract class d<T>
  {
    public static final BitSet d;
    public final String a;
    public final byte[] b;
    public final Object c;
    
    static
    {
      BitSet localBitSet = new BitSet(127);
      localBitSet.set(45);
      localBitSet.set(95);
      localBitSet.set(46);
      for (int i = 48; i <= 57; i = (char)(i + 1)) {
        localBitSet.set(i);
      }
      for (i = 97; i <= 122; i = (char)(i + 1)) {
        localBitSet.set(i);
      }
      d = localBitSet;
    }
    
    public d(String paramString, boolean paramBoolean, Object paramObject)
    {
      paramString = paramString.toLowerCase(Locale.ROOT);
      b.y(paramString, "name");
      b.s("token must have at least 1 tchar", paramString.isEmpty() ^ true);
      if (paramString.equals("connection")) {
        s0.c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", new RuntimeException("exception to show backtrace"));
      }
      int i = 0;
      while (i < paramString.length())
      {
        char c1 = paramString.charAt(i);
        if (((paramBoolean) && (c1 == ':') && (i == 0)) || (d.get(c1))) {
          i++;
        } else {
          throw new IllegalArgumentException(m0.X("Invalid character '%s' in key name '%s'", new Object[] { Character.valueOf(c1), paramString }));
        }
      }
      a = paramString;
      b = paramString.getBytes(d.a);
      c = paramObject;
    }
    
    public abstract T a(byte[] paramArrayOfByte);
    
    public abstract byte[] b(Serializable paramSerializable);
    
    public final boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (getClass() == paramObject.getClass()))
      {
        paramObject = (d)paramObject;
        return a.equals(a);
      }
      return false;
    }
    
    public final int hashCode()
    {
      return a.hashCode();
    }
    
    public final String toString()
    {
      return g.f(f.l("Key{name='"), a, "'}");
    }
  }
  
  public static final class e<T>
  {
    public final byte[] a()
    {
      try
      {
        throw null;
        Object localObject1;
        throw ((Throwable)localObject1);
      }
      finally
      {
        for (;;) {}
      }
    }
  }
  
  public static final class f<T>
    extends s0.d<T>
  {
    public final s0.g<T> e;
    
    public f(String paramString, boolean paramBoolean, s0.g paramg)
    {
      super(paramBoolean, paramg);
      b.r(paramString.endsWith("-bin") ^ true, "ASCII header is named %s.  Only binary headers may end with %s", paramString, "-bin");
      e = paramg;
    }
    
    public final T a(byte[] paramArrayOfByte)
    {
      return (T)e.b(paramArrayOfByte);
    }
    
    public final byte[] b(Serializable paramSerializable)
    {
      paramSerializable = e.a(paramSerializable);
      b.y(paramSerializable, "null marshaller.toAsciiString()");
      return paramSerializable;
    }
  }
  
  public static abstract interface g<T>
  {
    public abstract byte[] a(Serializable paramSerializable);
    
    public abstract T b(byte[] paramArrayOfByte);
  }
}

/* Location:
 * Qualified Name:     eb.s0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */