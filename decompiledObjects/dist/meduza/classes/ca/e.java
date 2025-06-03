package ca;

import android.content.Context;
import d8.b;
import d8.b.a;
import d8.k;
import o9.l;

public final class e
{
  public static b<?> a(String paramString1, String paramString2)
  {
    paramString1 = new a(paramString1, paramString2);
    paramString2 = b.b(d.class);
    e = 1;
    f = new d8.a(paramString1);
    return paramString2.b();
  }
  
  public static b<?> b(String paramString, a<Context> parama)
  {
    b.a locala = b.b(d.class);
    e = 1;
    locala.a(k.d(Context.class));
    f = new l(1, paramString, parama);
    return locala.b();
  }
  
  public static abstract interface a<T>
  {
    public abstract String e(Context paramContext);
  }
}

/* Location:
 * Qualified Name:     ca.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */