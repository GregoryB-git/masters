package c4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p4.a;
import u4.e;
import u4.i;
import v5.e0;

public final class p
{
  public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
  public int a = -1;
  public int b = -1;
  
  public final boolean a(String paramString)
  {
    Matcher localMatcher = c.matcher(paramString);
    if (localMatcher.find()) {}
    try
    {
      paramString = localMatcher.group(1);
      int i = e0.a;
      int j = Integer.parseInt(paramString, 16);
      i = Integer.parseInt(localMatcher.group(2), 16);
      if ((j > 0) || (i > 0))
      {
        a = j;
        b = i;
        return true;
      }
    }
    catch (NumberFormatException paramString)
    {
      for (;;) {}
    }
    return false;
  }
  
  public final void b(a parama)
  {
    for (int i = 0;; i++)
    {
      Object localObject = a;
      if (i >= localObject.length) {
        break;
      }
      localObject = localObject[i];
      if ((localObject instanceof e))
      {
        localObject = (e)localObject;
        if ((!"iTunSMPB".equals(c)) || (!a(d))) {}
      }
      else if ((localObject instanceof i))
      {
        localObject = (i)localObject;
        if (("com.apple.iTunes".equals(b)) && ("iTunSMPB".equals(c)) && (a(d))) {
          return;
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     c4.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */