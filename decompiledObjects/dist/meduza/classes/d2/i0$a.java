package d2;

import android.content.pm.PackageInfo;
import android.os.Build.VERSION;
import c2.p;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class i0$a
  extends a.i
{
  public final Pattern d = Pattern.compile("\\A\\d+");
  
  public final boolean d()
  {
    boolean bool1 = super.d();
    if (bool1)
    {
      int i = Build.VERSION.SDK_INT;
      if (i < 29)
      {
        Object localObject1 = p.a;
        Object localObject2;
        if (i >= 26) {
          localObject1 = f.a();
        } else {
          try
          {
            localObject1 = p.c();
          }
          catch (ClassNotFoundException|IllegalAccessException|InvocationTargetException|NoSuchMethodException localClassNotFoundException)
          {
            localObject2 = null;
          }
        }
        boolean bool2 = false;
        if (localObject2 == null) {
          return false;
        }
        Matcher localMatcher = d.matcher(versionName);
        bool1 = bool2;
        if (localMatcher.find())
        {
          bool1 = bool2;
          if (Integer.parseInt(versionName.substring(localMatcher.start(), localMatcher.end())) >= 105) {
            bool1 = true;
          }
        }
        return bool1;
      }
    }
    return bool1;
  }
}

/* Location:
 * Qualified Name:     d2.i0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */