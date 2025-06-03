package gb;

import g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public final class l1$b
  implements i0.d
{
  public static final Logger b = Logger.getLogger(b.class.getName());
  public final l1.c a;
  
  static
  {
    Pattern.compile("\\s+");
  }
  
  public l1$b(l1.a parama)
  {
    a = parama;
  }
  
  public final List<String> a(String paramString)
  {
    Object localObject1 = b;
    Object localObject2 = Level.FINER;
    if (((Logger)localObject1).isLoggable((Level)localObject2)) {
      ((Logger)localObject1).log((Level)localObject2, "About to query TXT records for {0}", new Object[] { paramString });
    }
    Object localObject3 = a;
    paramString = g.d("dns:///", paramString);
    localObject3 = ((l1.a)localObject3).c(paramString);
    if (((Logger)localObject1).isLoggable((Level)localObject2)) {
      ((Logger)localObject1).log((Level)localObject2, "Found {0} TXT records", new Object[] { Integer.valueOf(((ArrayList)localObject3).size()) });
    }
    paramString = new ArrayList(((ArrayList)localObject3).size());
    localObject3 = ((ArrayList)localObject3).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject1 = (String)((Iterator)localObject3).next();
      localObject2 = new StringBuilder(((String)localObject1).length());
      int i = 0;
      int j = i;
      while (i < ((String)localObject1).length())
      {
        char c1 = ((String)localObject1).charAt(i);
        int k;
        char c2;
        if (j == 0)
        {
          if (c1 == ' ') {
            break label255;
          }
          k = i;
          c2 = c1;
          if (c1 == '"')
          {
            j = 1;
            break label255;
          }
        }
        else
        {
          if (c1 == '"')
          {
            j = 0;
            break label255;
          }
          k = i;
          c2 = c1;
          if (c1 == '\\')
          {
            k = i + 1;
            i = ((String)localObject1).charAt(k);
            c2 = i;
          }
        }
        ((StringBuilder)localObject2).append(c2);
        i = k;
        label255:
        i++;
      }
      paramString.add(((StringBuilder)localObject2).toString());
    }
    return Collections.unmodifiableList(paramString);
  }
}

/* Location:
 * Qualified Name:     gb.l1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */