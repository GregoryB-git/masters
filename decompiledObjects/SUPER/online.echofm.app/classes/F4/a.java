package F4;

import java.util.Locale;

public class a
{
  public static volatile a c;
  public final c a;
  public boolean b = false;
  
  public a()
  {
    this(null);
  }
  
  public a(c paramc)
  {
    c localc = paramc;
    if (paramc == null) {
      localc = c.c();
    }
    a = localc;
  }
  
  public static a e()
  {
    if (c == null)
    {
      try
      {
        if (c == null)
        {
          a locala = new F4/a;
          locala.<init>();
          c = locala;
        }
      }
      finally
      {
        break label40;
      }
      break label45;
      label40:
      throw ((Throwable)localObject);
    }
    label45:
    return c;
  }
  
  public void a(String paramString)
  {
    if (b) {
      a.a(paramString);
    }
  }
  
  public void b(String paramString, Object... paramVarArgs)
  {
    if (b) {
      a.a(String.format(Locale.ENGLISH, paramString, paramVarArgs));
    }
  }
  
  public void c(String paramString)
  {
    if (b) {
      a.b(paramString);
    }
  }
  
  public void d(String paramString, Object... paramVarArgs)
  {
    if (b) {
      a.b(String.format(Locale.ENGLISH, paramString, paramVarArgs));
    }
  }
  
  public void f(String paramString)
  {
    if (b) {
      a.d(paramString);
    }
  }
  
  public void g(String paramString, Object... paramVarArgs)
  {
    if (b) {
      a.d(String.format(Locale.ENGLISH, paramString, paramVarArgs));
    }
  }
  
  public boolean h()
  {
    return b;
  }
  
  public void i(boolean paramBoolean)
  {
    b = paramBoolean;
  }
  
  public void j(String paramString)
  {
    if (b) {
      a.e(paramString);
    }
  }
  
  public void k(String paramString, Object... paramVarArgs)
  {
    if (b) {
      a.e(String.format(Locale.ENGLISH, paramString, paramVarArgs));
    }
  }
}

/* Location:
 * Qualified Name:     F4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */