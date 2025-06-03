package k3;

import android.util.Base64;
import h3.e;

public abstract class s
{
  public static j.a a()
  {
    j.a locala = new j.a();
    locala.c(e.a);
    return locala;
  }
  
  public abstract String b();
  
  public abstract byte[] c();
  
  public abstract e d();
  
  public final j e(e parame)
  {
    j.a locala = a();
    locala.b(b());
    locala.c(parame);
    b = c();
    return locala.a();
  }
  
  public final String toString()
  {
    String str1 = b();
    e locale = d();
    String str2;
    if (c() == null) {
      str2 = "";
    } else {
      str2 = Base64.encodeToString(c(), 2);
    }
    return String.format("TransportContext(%s, %s, %s)", new Object[] { str1, locale, str2 });
  }
  
  public static abstract class a {}
}

/* Location:
 * Qualified Name:     k3.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */