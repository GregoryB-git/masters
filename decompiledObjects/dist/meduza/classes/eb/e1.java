package eb;

import f;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;
import n7.d;
import n7.g;
import n7.g.a;
import n7.u;
import x6.b;

public final class e1
{
  public static final List<e1> d;
  public static final e1 e;
  public static final e1 f;
  public static final e1 g;
  public static final e1 h;
  public static final e1 i;
  public static final e1 j;
  public static final e1 k;
  public static final e1 l;
  public static final e1 m;
  public static final e1 n;
  public static final s0.f o = new s0.f("grpc-status", false, new b());
  public static final s0.f p = new s0.f("grpc-message", false, new c());
  public final a a;
  public final String b;
  public final Throwable c;
  
  static
  {
    TreeMap localTreeMap = new TreeMap();
    Object localObject = a.values();
    int i1 = localObject.length;
    int i2 = 0;
    while (i2 < i1)
    {
      a locala = localObject[i2];
      e1 locale1 = (e1)localTreeMap.put(Integer.valueOf(a), new e1(locala, null, null));
      if (locale1 == null)
      {
        i2++;
      }
      else
      {
        localObject = f.l("Code value duplication between ");
        ((StringBuilder)localObject).append(a.name());
        ((StringBuilder)localObject).append(" & ");
        ((StringBuilder)localObject).append(locala.name());
        throw new IllegalStateException(((StringBuilder)localObject).toString());
      }
    }
    d = Collections.unmodifiableList(new ArrayList(localTreeMap.values()));
    e = a.c.f();
    f = a.d.f();
    g = a.e.f();
    a.f.f();
    h = a.o.f();
    a.p.f();
    a.q.f();
    i = a.r.f();
    j = a.A.f();
    k = a.s.f();
    l = a.t.f();
    a.u.f();
    a.v.f();
    a.w.f();
    m = a.x.f();
    n = a.y.f();
    a.z.f();
  }
  
  public e1(a parama, String paramString, Throwable paramThrowable)
  {
    b.y(parama, "code");
    a = parama;
    b = paramString;
    c = paramThrowable;
  }
  
  public static String b(e1 parame1)
  {
    if (b == null) {
      return a.toString();
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append(": ");
    localStringBuilder.append(b);
    return localStringBuilder.toString();
  }
  
  public static e1 c(int paramInt)
  {
    if (paramInt >= 0)
    {
      localObject = d;
      if (paramInt < ((List)localObject).size()) {
        return (e1)((List)localObject).get(paramInt);
      }
    }
    e1 locale1 = g;
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Unknown code ");
    ((StringBuilder)localObject).append(paramInt);
    return locale1.g(((StringBuilder)localObject).toString());
  }
  
  public static e1 d(Throwable paramThrowable)
  {
    b.y(paramThrowable, "t");
    for (Throwable localThrowable = paramThrowable; localThrowable != null; localThrowable = localThrowable.getCause())
    {
      if ((localThrowable instanceof f1)) {
        return a;
      }
      if ((localThrowable instanceof g1)) {
        return a;
      }
    }
    return g.f(paramThrowable);
  }
  
  public final e1 a(String paramString)
  {
    if (paramString == null) {
      return this;
    }
    if (b == null) {
      return new e1(a, paramString, c);
    }
    a locala = a;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(b);
    localStringBuilder.append("\n");
    localStringBuilder.append(paramString);
    return new e1(locala, localStringBuilder.toString(), c);
  }
  
  public final boolean e()
  {
    boolean bool;
    if (a.c == a) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean equals(Object paramObject)
  {
    return super.equals(paramObject);
  }
  
  public final e1 f(Throwable paramThrowable)
  {
    if (b.Q(c, paramThrowable)) {
      return this;
    }
    return new e1(a, b, paramThrowable);
  }
  
  public final e1 g(String paramString)
  {
    if (b.Q(b, paramString)) {
      return this;
    }
    return new e1(a, paramString, c);
  }
  
  public final int hashCode()
  {
    return super.hashCode();
  }
  
  public final String toString()
  {
    g.a locala = g.b(this);
    locala.a(a.name(), "code");
    locala.a(b, "description");
    Throwable localThrowable = c;
    Object localObject = localThrowable;
    if (localThrowable != null)
    {
      localObject = u.a;
      localObject = new StringWriter();
      localThrowable.printStackTrace(new PrintWriter((Writer)localObject));
      localObject = ((StringWriter)localObject).toString();
    }
    locala.a(localObject, "cause");
    return locala.toString();
  }
  
  public static enum a
  {
    public final int a;
    public final byte[] b;
    
    static
    {
      a locala1 = new a("OK", 0, 0);
      c = locala1;
      a locala2 = new a("CANCELLED", 1, 1);
      d = locala2;
      a locala3 = new a("UNKNOWN", 2, 2);
      e = locala3;
      a locala4 = new a("INVALID_ARGUMENT", 3, 3);
      f = locala4;
      a locala5 = new a("DEADLINE_EXCEEDED", 4, 4);
      o = locala5;
      a locala6 = new a("NOT_FOUND", 5, 5);
      p = locala6;
      a locala7 = new a("ALREADY_EXISTS", 6, 6);
      q = locala7;
      a locala8 = new a("PERMISSION_DENIED", 7, 7);
      r = locala8;
      a locala9 = new a("RESOURCE_EXHAUSTED", 8, 8);
      s = locala9;
      a locala10 = new a("FAILED_PRECONDITION", 9, 9);
      t = locala10;
      a locala11 = new a("ABORTED", 10, 10);
      u = locala11;
      a locala12 = new a("OUT_OF_RANGE", 11, 11);
      v = locala12;
      a locala13 = new a("UNIMPLEMENTED", 12, 12);
      w = locala13;
      a locala14 = new a("INTERNAL", 13, 13);
      x = locala14;
      a locala15 = new a("UNAVAILABLE", 14, 14);
      y = locala15;
      a locala16 = new a("DATA_LOSS", 15, 15);
      z = locala16;
      a locala17 = new a("UNAUTHENTICATED", 16, 16);
      A = locala17;
      B = new a[] { locala1, locala2, locala3, locala4, locala5, locala6, locala7, locala8, locala9, locala10, locala11, locala12, locala13, locala14, locala15, locala16, locala17 };
    }
    
    public a(int paramInt)
    {
      a = paramInt;
      b = Integer.toString(paramInt).getBytes(d.a);
    }
    
    public final e1 f()
    {
      return (e1)e1.d.get(a);
    }
  }
  
  public static final class b
    implements s0.g<e1>
  {
    public final byte[] a(Serializable paramSerializable)
    {
      return a.b;
    }
    
    public final Object b(byte[] paramArrayOfByte)
    {
      int i = paramArrayOfByte.length;
      int j = 0;
      if ((i == 1) && (paramArrayOfByte[0] == 48))
      {
        paramArrayOfByte = e1.e;
      }
      else
      {
        i = paramArrayOfByte.length;
        if (i != 1)
        {
          if (i != 2) {
            break label134;
          }
          i = paramArrayOfByte[0];
          if ((i < 48) || (i > 57)) {
            break label134;
          }
          i = 0 + (i - 48) * 10;
          j = 1;
        }
        else
        {
          i = 0;
        }
        j = paramArrayOfByte[j];
        if ((j >= 48) && (j <= 57))
        {
          i = j - 48 + i;
          localObject = e1.d;
          if (i < ((List)localObject).size()) {
            return (e1)((List)localObject).get(i);
          }
        }
        label134:
        Object localObject = e1.g;
        StringBuilder localStringBuilder = f.l("Unknown code ");
        localStringBuilder.append(new String(paramArrayOfByte, d.a));
        paramArrayOfByte = ((e1)localObject).g(localStringBuilder.toString());
      }
      return paramArrayOfByte;
    }
  }
  
  public static final class c
    implements s0.g<String>
  {
    public static final byte[] a = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };
    
    public final byte[] a(Serializable paramSerializable)
    {
      byte[] arrayOfByte1 = ((String)paramSerializable).getBytes(d.c);
      for (int i = 0;; i++)
      {
        paramSerializable = arrayOfByte1;
        if (i >= arrayOfByte1.length) {
          break;
        }
        int j = arrayOfByte1[i];
        if ((j >= 32) && (j < 126) && (j != 37)) {
          j = 0;
        } else {
          j = 1;
        }
        if (j != 0)
        {
          byte[] arrayOfByte2 = new byte[(arrayOfByte1.length - i) * 3 + i];
          if (i != 0) {
            System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, i);
          }
          int k = i;
          j = i;
          while (j < arrayOfByte1.length)
          {
            int m = arrayOfByte1[j];
            if ((m >= 32) && (m < 126) && (m != 37)) {
              i = 0;
            } else {
              i = 1;
            }
            if (i != 0)
            {
              arrayOfByte2[k] = ((byte)37);
              paramSerializable = a;
              arrayOfByte2[(k + 1)] = ((byte)paramSerializable[(m >> 4 & 0xF)]);
              arrayOfByte2[(k + 2)] = ((byte)paramSerializable[(m & 0xF)]);
              i = k + 3;
            }
            else
            {
              arrayOfByte2[k] = ((byte)m);
              i = k + 1;
            }
            j++;
            k = i;
          }
          paramSerializable = Arrays.copyOf(arrayOfByte2, k);
          break;
        }
      }
      return paramSerializable;
    }
    
    public final Object b(byte[] paramArrayOfByte)
    {
      int i = 0;
      while (i < paramArrayOfByte.length)
      {
        int j = paramArrayOfByte[i];
        if ((j >= 32) && (j < 126) && ((j != 37) || (i + 2 >= paramArrayOfByte.length)))
        {
          i++;
        }
        else
        {
          ByteBuffer localByteBuffer = ByteBuffer.allocate(paramArrayOfByte.length);
          for (i = 0;; i++)
          {
            for (;;)
            {
              if ((i >= paramArrayOfByte.length) || ((paramArrayOfByte[i] == 37) && (i + 2 < paramArrayOfByte.length))) {}
              try
              {
                String str = new java/lang/String;
                str.<init>(paramArrayOfByte, i + 1, 2, d.a);
                localByteBuffer.put((byte)Integer.parseInt(str, 16));
                i += 3;
              }
              catch (NumberFormatException localNumberFormatException)
              {
                for (;;) {}
              }
            }
            localByteBuffer.put(paramArrayOfByte[i]);
          }
          paramArrayOfByte = new String(localByteBuffer.array(), 0, localByteBuffer.position(), d.c);
          break label166;
        }
      }
      paramArrayOfByte = new String(paramArrayOfByte, 0);
      label166:
      return paramArrayOfByte;
    }
  }
}

/* Location:
 * Qualified Name:     eb.e1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */