package k1;

import g0.M;
import g0.a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class e$c
{
  public final String a;
  public final int b;
  public final String c;
  public final Set d;
  
  public e$c(String paramString1, int paramInt, String paramString2, Set paramSet)
  {
    b = paramInt;
    a = paramString1;
    c = paramString2;
    d = paramSet;
  }
  
  public static c a(String paramString, int paramInt)
  {
    Object localObject = paramString.trim();
    boolean bool = ((String)localObject).isEmpty();
    int i = 1;
    a.a(bool ^ true);
    int j = ((String)localObject).indexOf(" ");
    if (j == -1)
    {
      paramString = "";
    }
    else
    {
      paramString = ((String)localObject).substring(j).trim();
      localObject = ((String)localObject).substring(0, j);
    }
    String[] arrayOfString = M.b1((String)localObject, "\\.");
    String str = arrayOfString[0];
    localObject = new HashSet();
    while (i < arrayOfString.length)
    {
      ((Set)localObject).add(arrayOfString[i]);
      i++;
    }
    return new c(str, paramInt, paramString, (Set)localObject);
  }
  
  public static c b()
  {
    return new c("", 0, "", Collections.emptySet());
  }
}

/* Location:
 * Qualified Name:     k1.e.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */