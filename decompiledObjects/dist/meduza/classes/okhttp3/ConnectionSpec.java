package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.Util;

public final class ConnectionSpec
{
  public static final ConnectionSpec e;
  public static final ConnectionSpec f;
  public final boolean a;
  public final boolean b;
  public final String[] c;
  public final String[] d;
  
  static
  {
    Object localObject1 = CipherSuite.q;
    Object localObject2 = CipherSuite.r;
    CipherSuite localCipherSuite1 = CipherSuite.s;
    CipherSuite localCipherSuite2 = CipherSuite.t;
    Object localObject3 = CipherSuite.u;
    Object localObject4 = CipherSuite.k;
    CipherSuite localCipherSuite3 = CipherSuite.m;
    CipherSuite localCipherSuite4 = CipherSuite.l;
    CipherSuite localCipherSuite5 = CipherSuite.n;
    CipherSuite localCipherSuite6 = CipherSuite.p;
    CipherSuite localCipherSuite7 = CipherSuite.o;
    CipherSuite[] arrayOfCipherSuite = new CipherSuite[18];
    arrayOfCipherSuite[0] = localObject1;
    arrayOfCipherSuite[1] = localObject2;
    arrayOfCipherSuite[2] = localCipherSuite1;
    arrayOfCipherSuite[3] = localCipherSuite2;
    arrayOfCipherSuite[4] = localObject3;
    arrayOfCipherSuite[5] = localObject4;
    arrayOfCipherSuite[6] = localCipherSuite3;
    arrayOfCipherSuite[7] = localCipherSuite4;
    arrayOfCipherSuite[8] = localCipherSuite5;
    arrayOfCipherSuite[9] = localCipherSuite6;
    arrayOfCipherSuite[10] = localCipherSuite7;
    arrayOfCipherSuite[11] = CipherSuite.i;
    arrayOfCipherSuite[12] = CipherSuite.j;
    arrayOfCipherSuite[13] = CipherSuite.g;
    arrayOfCipherSuite[14] = CipherSuite.h;
    arrayOfCipherSuite[15] = CipherSuite.e;
    arrayOfCipherSuite[16] = CipherSuite.f;
    arrayOfCipherSuite[17] = CipherSuite.d;
    Object localObject5 = new Builder(true);
    ((Builder)localObject5).b(new CipherSuite[] { localObject1, localObject2, localCipherSuite1, localCipherSuite2, localObject3, localObject4, localCipherSuite3, localCipherSuite4, localCipherSuite5, localCipherSuite6, localCipherSuite7 });
    localObject2 = TlsVersion.b;
    localObject3 = TlsVersion.c;
    ((Builder)localObject5).d(new TlsVersion[] { localObject2, localObject3 });
    if (a)
    {
      d = true;
      new ConnectionSpec((Builder)localObject5);
      localObject1 = new Builder(true);
      ((Builder)localObject1).b(arrayOfCipherSuite);
      localObject4 = TlsVersion.d;
      localObject5 = TlsVersion.e;
      ((Builder)localObject1).d(new TlsVersion[] { localObject2, localObject3, localObject4, localObject5 });
      if (a)
      {
        d = true;
        e = new ConnectionSpec((Builder)localObject1);
        localObject3 = new Builder(true);
        ((Builder)localObject3).b(arrayOfCipherSuite);
        ((Builder)localObject3).d(new TlsVersion[] { localObject5 });
        if (a)
        {
          d = true;
          new ConnectionSpec((Builder)localObject3);
          f = new ConnectionSpec(new Builder(false));
          return;
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
      }
      throw new IllegalStateException("no TLS extensions for cleartext connections");
    }
    throw new IllegalStateException("no TLS extensions for cleartext connections");
  }
  
  public ConnectionSpec(Builder paramBuilder)
  {
    a = a;
    c = b;
    d = c;
    b = d;
  }
  
  public final boolean a(SSLSocket paramSSLSocket)
  {
    if (!a) {
      return false;
    }
    String[] arrayOfString = d;
    if ((arrayOfString != null) && (!Util.r(Util.o, arrayOfString, paramSSLSocket.getEnabledProtocols()))) {
      return false;
    }
    arrayOfString = c;
    return (arrayOfString == null) || (Util.r(CipherSuite.b, arrayOfString, paramSSLSocket.getEnabledCipherSuites()));
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof ConnectionSpec)) {
      return false;
    }
    if (paramObject == this) {
      return true;
    }
    paramObject = (ConnectionSpec)paramObject;
    boolean bool = a;
    if (bool != a) {
      return false;
    }
    if (bool)
    {
      if (!Arrays.equals(c, c)) {
        return false;
      }
      if (!Arrays.equals(d, d)) {
        return false;
      }
      if (b != b) {
        return false;
      }
    }
    return true;
  }
  
  public final int hashCode()
  {
    int i;
    if (a) {
      i = ((527 + Arrays.hashCode(c)) * 31 + Arrays.hashCode(d)) * 31 + (b ^ true);
    } else {
      i = 17;
    }
    return i;
  }
  
  public final String toString()
  {
    if (!a) {
      return "ConnectionSpec()";
    }
    String[] arrayOfString = c;
    int i = 0;
    StringBuilder localStringBuilder = null;
    Object localObject1 = "[all enabled]";
    Object localObject2;
    int j;
    int k;
    if (arrayOfString != null)
    {
      if (arrayOfString != null)
      {
        localObject2 = new ArrayList(arrayOfString.length);
        j = arrayOfString.length;
        for (k = 0; k < j; k++) {
          ((ArrayList)localObject2).add(CipherSuite.a(arrayOfString[k]));
        }
        localObject2 = Collections.unmodifiableList((List)localObject2);
      }
      else
      {
        localObject2 = null;
      }
      localObject2 = localObject2.toString();
    }
    else
    {
      localObject2 = "[all enabled]";
    }
    arrayOfString = d;
    if (arrayOfString != null)
    {
      localObject1 = localStringBuilder;
      if (arrayOfString != null)
      {
        localObject1 = new ArrayList(arrayOfString.length);
        j = arrayOfString.length;
        for (k = i; k < j; k++) {
          ((ArrayList)localObject1).add(TlsVersion.f(arrayOfString[k]));
        }
        localObject1 = Collections.unmodifiableList((List)localObject1);
      }
      localObject1 = localObject1.toString();
    }
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("ConnectionSpec(cipherSuites=");
    localStringBuilder.append((String)localObject2);
    localStringBuilder.append(", tlsVersions=");
    localStringBuilder.append((String)localObject1);
    localStringBuilder.append(", supportsTlsExtensions=");
    localStringBuilder.append(b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public static final class Builder
  {
    public boolean a;
    public String[] b;
    public String[] c;
    public boolean d;
    
    public Builder(ConnectionSpec paramConnectionSpec)
    {
      a = a;
      b = c;
      c = d;
      d = b;
    }
    
    public Builder(boolean paramBoolean)
    {
      a = paramBoolean;
    }
    
    public final void a(String... paramVarArgs)
    {
      if (a)
      {
        if (paramVarArgs.length != 0)
        {
          b = ((String[])paramVarArgs.clone());
          return;
        }
        throw new IllegalArgumentException("At least one cipher suite is required");
      }
      throw new IllegalStateException("no cipher suites for cleartext connections");
    }
    
    public final void b(CipherSuite... paramVarArgs)
    {
      if (a)
      {
        String[] arrayOfString = new String[paramVarArgs.length];
        for (int i = 0; i < paramVarArgs.length; i++) {
          arrayOfString[i] = a;
        }
        a(arrayOfString);
        return;
      }
      throw new IllegalStateException("no cipher suites for cleartext connections");
    }
    
    public final void c(String... paramVarArgs)
    {
      if (a)
      {
        if (paramVarArgs.length != 0)
        {
          c = ((String[])paramVarArgs.clone());
          return;
        }
        throw new IllegalArgumentException("At least one TLS version is required");
      }
      throw new IllegalStateException("no TLS versions for cleartext connections");
    }
    
    public final void d(TlsVersion... paramVarArgs)
    {
      if (a)
      {
        String[] arrayOfString = new String[paramVarArgs.length];
        for (int i = 0; i < paramVarArgs.length; i++) {
          arrayOfString[i] = a;
        }
        c(arrayOfString);
        return;
      }
      throw new IllegalStateException("no TLS versions for cleartext connections");
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.ConnectionSpec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */