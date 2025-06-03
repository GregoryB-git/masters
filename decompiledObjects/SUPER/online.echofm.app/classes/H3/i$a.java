package H3;

import E3.f;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public enum i$a
{
  public static final Map y;
  
  static
  {
    a locala1 = new a("X86_32", 0);
    o = locala1;
    a locala2 = new a("X86_64", 1);
    p = locala2;
    a locala3 = new a("ARM_UNKNOWN", 2);
    q = locala3;
    a locala4 = new a("PPC", 3);
    r = locala4;
    Object localObject = new a("PPC64", 4);
    s = (a)localObject;
    a locala5 = new a("ARMV6", 5);
    t = locala5;
    a locala6 = new a("ARMV7", 6);
    u = locala6;
    a locala7 = new a("UNKNOWN", 7);
    v = locala7;
    a locala8 = new a("ARMV7S", 8);
    w = locala8;
    a locala9 = new a("ARM64", 9);
    x = locala9;
    z = new a[] { locala1, locala2, locala3, locala4, localObject, locala5, locala6, locala7, locala8, locala9 };
    localObject = new HashMap(4);
    y = (Map)localObject;
    ((Map)localObject).put("armeabi-v7a", locala6);
    ((Map)localObject).put("armeabi", locala5);
    ((Map)localObject).put("arm64-v8a", locala9);
    ((Map)localObject).put("x86", locala1);
  }
  
  public static a c()
  {
    Object localObject = Build.CPU_ABI;
    if (TextUtils.isEmpty((CharSequence)localObject))
    {
      f.f().i("Architecture#getValue()::Build.CPU_ABI returned null or empty");
      return v;
    }
    localObject = ((String)localObject).toLowerCase(Locale.US);
    a locala = (a)y.get(localObject);
    localObject = locala;
    if (locala == null) {
      localObject = v;
    }
    return (a)localObject;
  }
}

/* Location:
 * Qualified Name:     H3.i.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */