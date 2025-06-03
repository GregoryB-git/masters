package p6;

import android.util.Log;
import java.util.Locale;
import m6.d;

public final class a
{
  public final String a;
  public final String b;
  public final int c;
  
  public a(String paramString, String... paramVarArgs)
  {
    b = paramVarArgs;
    a = paramString;
    new d(paramString, null);
    for (int j = 2; (j <= 7) && (!Log.isLoggable(a, j)); j++) {}
    c = j;
  }
  
  public final void a(String paramString, Object... paramVarArgs)
  {
    int i;
    if (c <= 3) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      Log.d(a, d(paramString, paramVarArgs));
    }
  }
  
  public final void b(String paramString, Exception paramException, Object... paramVarArgs)
  {
    Log.e(a, d(paramString, paramVarArgs), paramException);
  }
  
  public final void c(String paramString, Object... paramVarArgs)
  {
    Log.e(a, d(paramString, paramVarArgs));
  }
  
  public final String d(String paramString, Object... paramVarArgs)
  {
    String str = paramString;
    if (paramVarArgs.length > 0) {
      str = String.format(Locale.US, paramString, paramVarArgs);
    }
    return b.concat(str);
  }
  
  public final void e(String paramString, Object... paramVarArgs)
  {
    int i;
    if (c <= 2) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      Log.v(a, d(paramString, paramVarArgs));
    }
  }
  
  public final void f(String paramString, Object... paramVarArgs)
  {
    Log.w(a, d(paramString, paramVarArgs));
  }
}

/* Location:
 * Qualified Name:     p6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */