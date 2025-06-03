package f2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lc.k;

public final class i$a
{
  public static i a(String paramString)
  {
    if ((paramString != null) && (!k.t0(paramString)))
    {
      paramString = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(paramString);
      if (!paramString.matches()) {
        return null;
      }
      String str = paramString.group(1);
      if (str != null)
      {
        int i = Integer.parseInt(str);
        str = paramString.group(2);
        if (str != null)
        {
          int j = Integer.parseInt(str);
          str = paramString.group(3);
          if (str != null)
          {
            int k = Integer.parseInt(str);
            if (paramString.group(4) != null) {
              paramString = paramString.group(4);
            } else {
              paramString = "";
            }
            ec.i.d(paramString, "description");
            return new i(i, j, k, paramString);
          }
        }
      }
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     f2.i.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */