package okhttp3;

public final class ConnectionSpec$Builder
{
  public boolean a;
  public String[] b;
  public String[] c;
  public boolean d;
  
  public ConnectionSpec$Builder(ConnectionSpec paramConnectionSpec)
  {
    a = a;
    b = c;
    c = d;
    d = b;
  }
  
  public ConnectionSpec$Builder(boolean paramBoolean)
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

/* Location:
 * Qualified Name:     okhttp3.ConnectionSpec.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */