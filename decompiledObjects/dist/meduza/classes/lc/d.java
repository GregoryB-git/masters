package lc;

import ec.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import va.a;

public final class d
  implements Serializable
{
  public final Pattern a;
  
  public d(String paramString)
  {
    a = paramString;
  }
  
  public final List a(String paramString)
  {
    int i = 0;
    k.x0(0);
    Matcher localMatcher = a.matcher(paramString);
    if (!localMatcher.find()) {
      return a.f(paramString.toString());
    }
    ArrayList localArrayList = new ArrayList(10);
    int j;
    do
    {
      localArrayList.add(paramString.subSequence(i, localMatcher.start()).toString());
      j = localMatcher.end();
      i = j;
    } while (localMatcher.find());
    localArrayList.add(paramString.subSequence(j, paramString.length()).toString());
    return localArrayList;
  }
  
  public final String toString()
  {
    String str = a.toString();
    i.d(str, "toString(...)");
    return str;
  }
}

/* Location:
 * Qualified Name:     lc.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */