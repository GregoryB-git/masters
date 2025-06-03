package a0;

import android.os.Build.VERSION;
import android.os.ext.SdkExtensions;
import ec.i;
import java.util.Locale;

public final class a
{
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 30) {
      a.a.a(30);
    }
    if (i >= 30) {
      a.a.a(31);
    }
    if (i >= 30) {
      a.a.a(33);
    }
    if (i >= 30) {
      a.a.a(1000000);
    }
  }
  
  public static final boolean a()
  {
    int i = Build.VERSION.SDK_INT;
    boolean bool1 = false;
    boolean bool2;
    if (i < 33)
    {
      bool2 = bool1;
      if (i >= 32)
      {
        String str = Build.VERSION.CODENAME;
        i.d(str, "CODENAME");
        if (!i.a("REL", str))
        {
          Object localObject = Locale.ROOT;
          str = str.toUpperCase((Locale)localObject);
          i.d(str, "this as java.lang.String).toUpperCase(Locale.ROOT)");
          localObject = "Tiramisu".toUpperCase((Locale)localObject);
          i.d(localObject, "this as java.lang.String).toUpperCase(Locale.ROOT)");
          if (str.compareTo((String)localObject) >= 0)
          {
            i = 1;
            break label92;
          }
        }
        i = 0;
        label92:
        bool2 = bool1;
        if (i == 0) {}
      }
    }
    else
    {
      bool2 = true;
    }
    return bool2;
  }
  
  public static final class a
  {
    public static final a a = new a();
    
    public final int a(int paramInt)
    {
      return SdkExtensions.getExtensionVersion(paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     a0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */