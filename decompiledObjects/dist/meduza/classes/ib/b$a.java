package ib;

public final class b$a
{
  public boolean a;
  public String[] b;
  public String[] c;
  public boolean d;
  
  public b$a(b paramb)
  {
    a = a;
    b = b;
    c = c;
    d = d;
  }
  
  public b$a(boolean paramBoolean)
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

/* Location:
 * Qualified Name:     ib.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */