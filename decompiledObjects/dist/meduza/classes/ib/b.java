package ib;

import f;
import g;
import java.util.Arrays;
import java.util.Collections;

public final class b
{
  public static final b e;
  public final boolean a;
  public final String[] b;
  public final String[] c;
  public final boolean d;
  
  static
  {
    a locala1 = a.w;
    a locala2 = a.x;
    Object localObject1 = a.y;
    a locala3 = a.q;
    a locala4 = a.s;
    a locala5 = a.r;
    a locala6 = a.t;
    a locala7 = a.v;
    a locala8 = a.u;
    a locala9 = a.o;
    a locala10 = a.p;
    Object localObject2 = a.e;
    a locala11 = a.f;
    a locala12 = a.c;
    a locala13 = a.d;
    a locala14 = a.b;
    Object localObject3 = new a(true);
    ((a)localObject3).a(new a[] { locala1, locala2, localObject1, locala3, locala4, locala5, locala6, locala7, locala8, locala9, locala10, localObject2, locala11, locala12, locala13, locala14 });
    localObject2 = k.b;
    localObject1 = k.c;
    ((a)localObject3).b(new k[] { localObject2, localObject1 });
    if (a)
    {
      d = true;
      localObject3 = new b((a)localObject3);
      e = (b)localObject3;
      localObject3 = new a((b)localObject3);
      ((a)localObject3).b(new k[] { localObject2, localObject1, k.d, k.e });
      if (a)
      {
        d = true;
        new b((a)localObject3);
        new b(new a(false));
        return;
      }
      throw new IllegalStateException("no TLS extensions for cleartext connections");
    }
    throw new IllegalStateException("no TLS extensions for cleartext connections");
  }
  
  public b(a parama)
  {
    a = a;
    b = b;
    c = c;
    d = d;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof b)) {
      return false;
    }
    if (paramObject == this) {
      return true;
    }
    paramObject = (b)paramObject;
    boolean bool = a;
    if (bool != a) {
      return false;
    }
    if (bool)
    {
      if (!Arrays.equals(b, b)) {
        return false;
      }
      if (!Arrays.equals(c, c)) {
        return false;
      }
      if (d != d) {
        return false;
      }
    }
    return true;
  }
  
  public final int hashCode()
  {
    int i;
    if (a) {
      i = ((527 + Arrays.hashCode(b)) * 31 + Arrays.hashCode(c)) * 31 + (d ^ true);
    } else {
      i = 17;
    }
    return i;
  }
  
  public final String toString()
  {
    if (a)
    {
      Object localObject1 = b;
      int i = 0;
      if (localObject1 == null)
      {
        localObject1 = null;
      }
      else
      {
        localObject2 = new a[localObject1.length];
        for (j = 0;; j++)
        {
          localObject1 = b;
          if (j >= localObject1.length) {
            break;
          }
          arrayOfk = localObject1[j];
          localObject1 = arrayOfk;
          if (arrayOfk.startsWith("SSL_"))
          {
            localObject1 = f.l("TLS_");
            ((StringBuilder)localObject1).append(arrayOfk.substring(4));
            localObject1 = ((StringBuilder)localObject1).toString();
          }
          localObject2[j] = a.valueOf((String)localObject1);
        }
        localObject1 = l.a;
        localObject1 = Collections.unmodifiableList(Arrays.asList((Object[])((Object[])localObject2).clone()));
      }
      if (localObject1 == null) {
        localObject1 = "[use default]";
      } else {
        localObject1 = localObject1.toString();
      }
      Object localObject2 = f.m("ConnectionSpec(cipherSuites=", (String)localObject1, ", tlsVersions=");
      k[] arrayOfk = new k[c.length];
      for (int j = i;; j++)
      {
        localObject1 = c;
        if (j >= localObject1.length) {
          break label274;
        }
        localObject1 = localObject1[j];
        if ("TLSv1.3".equals(localObject1))
        {
          localObject1 = k.b;
        }
        else if ("TLSv1.2".equals(localObject1))
        {
          localObject1 = k.c;
        }
        else if ("TLSv1.1".equals(localObject1))
        {
          localObject1 = k.d;
        }
        else if ("TLSv1".equals(localObject1))
        {
          localObject1 = k.e;
        }
        else
        {
          if (!"SSLv3".equals(localObject1)) {
            break;
          }
          localObject1 = k.f;
        }
        arrayOfk[j] = localObject1;
      }
      throw new IllegalArgumentException(g.d("Unexpected TLS version: ", (String)localObject1));
      label274:
      localObject1 = l.a;
      ((StringBuilder)localObject2).append(Collections.unmodifiableList(Arrays.asList((Object[])arrayOfk.clone())));
      ((StringBuilder)localObject2).append(", supportsTlsExtensions=");
      ((StringBuilder)localObject2).append(d);
      ((StringBuilder)localObject2).append(")");
      return ((StringBuilder)localObject2).toString();
    }
    return "ConnectionSpec()";
  }
  
  public static final class a
  {
    public boolean a;
    public String[] b;
    public String[] c;
    public boolean d;
    
    public a(b paramb)
    {
      a = a;
      b = b;
      c = c;
      d = d;
    }
    
    public a(boolean paramBoolean)
    {
      a = paramBoolean;
    }
    
    public final void a(a... paramVarArgs)
    {
      if (a)
      {
        String[] arrayOfString = new String[paramVarArgs.length];
        for (int i = 0; i < paramVarArgs.length; i++) {
          arrayOfString[i] = a;
        }
        b = arrayOfString;
        return;
      }
      throw new IllegalStateException("no cipher suites for cleartext connections");
    }
    
    public final void b(k... paramVarArgs)
    {
      if (a)
      {
        if (paramVarArgs.length != 0)
        {
          String[] arrayOfString = new String[paramVarArgs.length];
          for (int i = 0; i < paramVarArgs.length; i++) {
            arrayOfString[i] = a;
          }
          c = arrayOfString;
          return;
        }
        throw new IllegalArgumentException("At least one TlsVersion is required");
      }
      throw new IllegalStateException("no TLS versions for cleartext connections");
    }
  }
}

/* Location:
 * Qualified Name:     ib.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */