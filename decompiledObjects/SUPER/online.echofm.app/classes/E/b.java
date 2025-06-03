package E;

import android.os.Build.VERSION;
import java.util.Locale;

public abstract class b
{
  public static final int a;
  public static final int b;
  public static final int c;
  public static final int d;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 0;
    if (i >= 30) {
      k = a.a;
    } else {
      k = 0;
    }
    a = k;
    if (i >= 30) {
      k = a.b;
    } else {
      k = 0;
    }
    b = k;
    if (i >= 30) {
      k = a.c;
    } else {
      k = 0;
    }
    c = k;
    int k = j;
    if (i >= 30) {
      k = a.d;
    }
    d = k;
  }
  
  public static boolean a(String paramString1, String paramString2)
  {
    boolean bool1 = "REL".equals(paramString2);
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    Locale localLocale = Locale.ROOT;
    if (paramString2.toUpperCase(localLocale).compareTo(paramString1.toUpperCase(localLocale)) >= 0) {
      bool2 = true;
    }
    return bool2;
  }
  
  public static boolean b()
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 30) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean c()
  {
    int i = Build.VERSION.SDK_INT;
    boolean bool;
    if ((i < 33) && ((i < 32) || (!a("Tiramisu", Build.VERSION.CODENAME)))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static final abstract class a
  {
    public static final int a = a.a(30);
    public static final int b = a.a(31);
    public static final int c = a.a(33);
    public static final int d = a.a(1000000);
  }
}

/* Location:
 * Qualified Name:     E.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */