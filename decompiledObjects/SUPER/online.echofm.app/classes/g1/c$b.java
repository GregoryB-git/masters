package g1;

import android.graphics.PointF;
import g0.M;
import g0.a;
import g0.o;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class c$b
{
  public static final Pattern c = Pattern.compile("\\{([^}]*)\\}");
  public static final Pattern d = Pattern.compile(M.G("\\\\pos\\((%1$s),(%1$s)\\)", new Object[] { "\\s*\\d+(?:\\.\\d+)?\\s*" }));
  public static final Pattern e = Pattern.compile(M.G("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", new Object[] { "\\s*\\d+(?:\\.\\d+)?\\s*" }));
  public static final Pattern f = Pattern.compile("\\\\an(\\d+)");
  public final int a;
  public final PointF b;
  
  public c$b(int paramInt, PointF paramPointF)
  {
    a = paramInt;
    b = paramPointF;
  }
  
  public static int a(String paramString)
  {
    paramString = f.matcher(paramString);
    int i;
    if (paramString.find()) {
      i = c.a((String)a.e(paramString.group(1)));
    } else {
      i = -1;
    }
    return i;
  }
  
  public static b b(String paramString)
  {
    Matcher localMatcher = c.matcher(paramString);
    paramString = null;
    int i = -1;
    String str2;
    for (;;)
    {
      String str1;
      if (localMatcher.find()) {
        str1 = (String)a.e(localMatcher.group(1));
      }
      try
      {
        PointF localPointF = c(str1);
        localObject = paramString;
        if (localPointF != null) {
          localObject = localPointF;
        }
      }
      catch (RuntimeException localRuntimeException)
      {
        for (;;)
        {
          Object localObject;
          int j;
          str2 = paramString;
        }
      }
      try
      {
        j = a(str1);
        paramString = (String)localObject;
        if (j == -1) {
          continue;
        }
        i = j;
        paramString = (String)localObject;
      }
      catch (RuntimeException paramString)
      {
        paramString = str2;
      }
      return new b(i, paramString);
    }
  }
  
  public static PointF c(String paramString)
  {
    Matcher localMatcher1 = d.matcher(paramString);
    Matcher localMatcher2 = e.matcher(paramString);
    boolean bool1 = localMatcher1.find();
    boolean bool2 = localMatcher2.find();
    Object localObject;
    if (bool1)
    {
      if (bool2)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
        ((StringBuilder)localObject).append(paramString);
        ((StringBuilder)localObject).append("'");
        o.f("SsaStyle.Overrides", ((StringBuilder)localObject).toString());
      }
      localObject = localMatcher1.group(1);
      paramString = localMatcher1.group(2);
    }
    else
    {
      if (!bool2) {
        break label147;
      }
      localObject = localMatcher2.group(1);
      paramString = localMatcher2.group(2);
    }
    return new PointF(Float.parseFloat(((String)a.e(localObject)).trim()), Float.parseFloat(((String)a.e(paramString)).trim()));
    label147:
    return null;
  }
  
  public static String d(String paramString)
  {
    return c.matcher(paramString).replaceAll("");
  }
}

/* Location:
 * Qualified Name:     g1.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */