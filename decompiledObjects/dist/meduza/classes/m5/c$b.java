package m5;

import android.graphics.PointF;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v5.e0;
import v5.m;

public final class c$b
{
  public static final Pattern a = Pattern.compile("\\{([^}]*)\\}");
  public static final Pattern b = Pattern.compile(e0.m("\\\\pos\\((%1$s),(%1$s)\\)", new Object[] { "\\s*\\d+(?:\\.\\d+)?\\s*" }));
  public static final Pattern c = Pattern.compile(e0.m("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", new Object[] { "\\s*\\d+(?:\\.\\d+)?\\s*" }));
  public static final Pattern d = Pattern.compile("\\\\an(\\d+)");
  
  public static PointF a(String paramString)
  {
    Object localObject1 = b.matcher(paramString);
    Object localObject2 = c.matcher(paramString);
    boolean bool1 = ((Matcher)localObject1).find();
    boolean bool2 = ((Matcher)localObject2).find();
    if (bool1)
    {
      if (bool2)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
        ((StringBuilder)localObject2).append(paramString);
        ((StringBuilder)localObject2).append("'");
        m.e("SsaStyle.Overrides", ((StringBuilder)localObject2).toString());
      }
      paramString = ((Matcher)localObject1).group(1);
      localObject1 = ((Matcher)localObject1).group(2);
    }
    else
    {
      if (!bool2) {
        break label141;
      }
      paramString = ((Matcher)localObject2).group(1);
      localObject1 = ((Matcher)localObject2).group(2);
    }
    paramString.getClass();
    float f = Float.parseFloat(paramString.trim());
    localObject1.getClass();
    return new PointF(f, Float.parseFloat(((String)localObject1).trim()));
    label141:
    return null;
  }
}

/* Location:
 * Qualified Name:     m5.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */