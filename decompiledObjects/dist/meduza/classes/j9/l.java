package j9;

import g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class l
  extends e<l>
{
  public static final l b = new l(Collections.singletonList("__name__"));
  public static final l c = new l(Collections.emptyList());
  
  public l(List<String> paramList)
  {
    super(paramList);
  }
  
  public static l t(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject = new StringBuilder();
    int i = 0;
    int j = 0;
    while (i < paramString.length())
    {
      int k = paramString.charAt(i);
      int m;
      int n;
      if (k == 92)
      {
        m = i + 1;
        if (m != paramString.length())
        {
          i = paramString.charAt(m);
          n = i;
        }
        else
        {
          throw new IllegalArgumentException("Trailing escape character is not allowed");
        }
      }
      else if (k == 46)
      {
        m = i;
        n = k;
        if (j == 0)
        {
          String str = ((StringBuilder)localObject).toString();
          if (!str.isEmpty())
          {
            localObject = new StringBuilder();
            localArrayList.add(str);
            break label180;
          }
          throw new IllegalArgumentException(g.e("Invalid field path (", paramString, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
        }
      }
      else
      {
        m = i;
        n = k;
        if (k == 96)
        {
          j ^= 0x1;
          break label180;
        }
      }
      ((StringBuilder)localObject).append(n);
      i = m;
      label180:
      i++;
    }
    localObject = ((StringBuilder)localObject).toString();
    if (!((String)localObject).isEmpty())
    {
      localArrayList.add(localObject);
      return new l(localArrayList);
    }
    throw new IllegalArgumentException(g.e("Invalid field path (", paramString, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
  }
  
  public final String h()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < a.size(); i++)
    {
      if (i > 0) {
        localStringBuilder.append(".");
      }
      String str = ((String)a.get(i)).replace("\\", "\\\\").replace("`", "\\`");
      boolean bool = str.isEmpty();
      int j = 1;
      if (bool) {}
      int k;
      do
      {
        k = 0;
        break;
        m = str.charAt(0);
      } while ((m != 95) && ((m < 97) || (m > 122)) && ((m < 65) || (m > 90)));
      for (int m = 1;; m++)
      {
        k = j;
        if (m >= str.length()) {
          break label209;
        }
        k = str.charAt(m);
        if ((k != 95) && ((k < 97) || (k > 122)) && ((k < 65) || (k > 90)) && ((k < 48) || (k > 57))) {
          break;
        }
      }
      label209:
      Object localObject = str;
      if (k == 0)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append('`');
        ((StringBuilder)localObject).append(str);
        ((StringBuilder)localObject).append('`');
        localObject = ((StringBuilder)localObject).toString();
      }
      localStringBuilder.append((String)localObject);
    }
    return localStringBuilder.toString();
  }
  
  public final e l(List paramList)
  {
    return new l(paramList);
  }
  
  public final boolean u()
  {
    return equals(b);
  }
}

/* Location:
 * Qualified Name:     j9.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */