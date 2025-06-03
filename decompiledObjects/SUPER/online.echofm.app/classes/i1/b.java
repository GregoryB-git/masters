package i1;

import W2.c;
import X2.B;
import X2.a0;
import X2.y;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

public final class b
{
  public static final Pattern d = Pattern.compile("\\s+");
  public static final y e = y.Z("auto", "none");
  public static final y f = y.a0("dot", "sesame", "circle");
  public static final y g = y.Z("filled", "open");
  public static final y h = y.a0("after", "before", "outside");
  public final int a;
  public final int b;
  public final int c;
  
  public b(int paramInt1, int paramInt2, int paramInt3)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramInt3;
  }
  
  public static b a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    paramString = c.e(paramString.trim());
    if (paramString.isEmpty()) {
      return null;
    }
    return b(y.U(TextUtils.split(paramString, d)));
  }
  
  public static b b(y paramy)
  {
    Object localObject = (String)B.c(a0.e(h, paramy), "outside");
    int i = ((String)localObject).hashCode();
    int j = 2;
    int k = 0;
    int m = -1;
    if (i != -1392885889)
    {
      if (i != -1106037339)
      {
        if ((i == 92734940) && (((String)localObject).equals("after")))
        {
          i = 0;
          break label94;
        }
      }
      else if (((String)localObject).equals("outside"))
      {
        i = 1;
        break label94;
      }
    }
    else if (((String)localObject).equals("before"))
    {
      i = 2;
      break label94;
    }
    i = -1;
    label94:
    int n;
    if (i != 0)
    {
      if (i != 1) {
        n = 1;
      } else {
        n = -2;
      }
    }
    else {
      n = 2;
    }
    localObject = a0.e(e, paramy);
    if (!((Set)localObject).isEmpty())
    {
      paramy = (String)((Set)localObject).iterator().next();
      i = paramy.hashCode();
      if (i != 3005871)
      {
        if (i != 3387192)
        {
          i = m;
        }
        else
        {
          i = m;
          if (paramy.equals("none")) {
            i = 0;
          }
        }
      }
      else
      {
        paramy.equals("auto");
        i = m;
      }
      return new b(i, 0, n);
    }
    localObject = a0.e(g, paramy);
    paramy = a0.e(f, paramy);
    if ((((Set)localObject).isEmpty()) && (paramy.isEmpty())) {
      return new b(-1, 0, n);
    }
    localObject = (String)B.c((Iterable)localObject, "filled");
    i = ((String)localObject).hashCode();
    if (i != -1274499742)
    {
      if ((i == 3417674) && (((String)localObject).equals("open")))
      {
        m = 2;
        break label314;
      }
    }
    else {
      ((String)localObject).equals("filled");
    }
    m = 1;
    label314:
    paramy = (String)B.c(paramy, "circle");
    i = paramy.hashCode();
    if (i != -1360216880)
    {
      if (i != -905816648)
      {
        if ((i == 99657) && (paramy.equals("dot")))
        {
          i = k;
          break label395;
        }
      }
      else if (paramy.equals("sesame"))
      {
        i = 1;
        break label395;
      }
    }
    else if (paramy.equals("circle"))
    {
      i = 2;
      break label395;
    }
    i = -1;
    label395:
    if (i != 0) {
      if (i != 1) {
        j = 1;
      } else {
        j = 3;
      }
    }
    return new b(j, m, n);
  }
}

/* Location:
 * Qualified Name:     i1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */