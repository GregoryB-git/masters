package F0;

import T0.e;
import T0.k;
import d0.x;
import g0.M;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class E
{
  public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
  public int a = -1;
  public int b = -1;
  
  public boolean a()
  {
    boolean bool;
    if ((a != -1) && (b != -1)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean b(String paramString)
  {
    paramString = c.matcher(paramString);
    if (paramString.find()) {}
    try
    {
      int i = Integer.parseInt((String)M.i(paramString.group(1)), 16);
      int j = Integer.parseInt((String)M.i(paramString.group(2)), 16);
      if ((i > 0) || (j > 0))
      {
        a = i;
        b = j;
        return true;
      }
    }
    catch (NumberFormatException paramString)
    {
      for (;;) {}
    }
    return false;
  }
  
  public boolean c(x paramx)
  {
    for (int i = 0; i < paramx.e(); i++)
    {
      Object localObject = paramx.d(i);
      if ((localObject instanceof e))
      {
        localObject = (e)localObject;
        if (("iTunSMPB".equals(q)) && (b(r))) {
          return true;
        }
      }
      else if ((localObject instanceof k))
      {
        localObject = (k)localObject;
        if (("com.apple.iTunes".equals(p)) && ("iTunSMPB".equals(q)) && (b(r))) {
          return true;
        }
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     F0.E
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */