package c4;

import java.io.PrintWriter;
import java.io.StringWriter;

public class c
{
  public final d a;
  public final String b;
  public final String c;
  
  public c(d paramd, String paramString)
  {
    this(paramd, paramString, null);
  }
  
  public c(d paramd, String paramString1, String paramString2)
  {
    a = paramd;
    b = paramString1;
    c = paramString2;
  }
  
  public static String d(Throwable paramThrowable)
  {
    StringWriter localStringWriter = new StringWriter();
    paramThrowable.printStackTrace(new PrintWriter(localStringWriter));
    return localStringWriter.toString();
  }
  
  public void a(String paramString, Throwable paramThrowable, Object... paramVarArgs)
  {
    if (f())
    {
      paramVarArgs = h(paramString, paramVarArgs);
      paramString = paramVarArgs;
      if (paramThrowable != null)
      {
        paramString = new StringBuilder();
        paramString.append(paramVarArgs);
        paramString.append("\n");
        paramString.append(d(paramThrowable));
        paramString = paramString.toString();
      }
      a.a(d.a.o, b, paramString, g());
    }
  }
  
  public void b(String paramString, Object... paramVarArgs)
  {
    a(paramString, null, paramVarArgs);
  }
  
  public void c(String paramString, Throwable paramThrowable)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(h(paramString, new Object[0]));
    localStringBuilder.append("\n");
    localStringBuilder.append(d(paramThrowable));
    paramString = localStringBuilder.toString();
    a.a(d.a.r, b, paramString, g());
  }
  
  public void e(String paramString)
  {
    a.a(d.a.p, b, h(paramString, new Object[0]), g());
  }
  
  public boolean f()
  {
    boolean bool;
    if (a.b().ordinal() <= d.a.o.ordinal()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final long g()
  {
    return System.currentTimeMillis();
  }
  
  public final String h(String paramString, Object... paramVarArgs)
  {
    String str = paramString;
    if (paramVarArgs.length > 0) {
      str = String.format(paramString, paramVarArgs);
    }
    if (c != null)
    {
      paramString = new StringBuilder();
      paramString.append(c);
      paramString.append(" - ");
      paramString.append(str);
      str = paramString.toString();
    }
    return str;
  }
  
  public void i(String paramString)
  {
    j(paramString, null);
  }
  
  public void j(String paramString, Throwable paramThrowable)
  {
    String str = h(paramString, new Object[0]);
    paramString = str;
    if (paramThrowable != null)
    {
      paramString = new StringBuilder();
      paramString.append(str);
      paramString.append("\n");
      paramString.append(d(paramThrowable));
      paramString = paramString.toString();
    }
    a.a(d.a.q, b, paramString, g());
  }
}

/* Location:
 * Qualified Name:     c4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */