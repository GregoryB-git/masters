package j9;

import g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class o
  extends e<o>
{
  public static final o b = new o(Collections.emptyList());
  
  public o(List<String> paramList)
  {
    super(paramList);
  }
  
  public static o t(String paramString)
  {
    if (!paramString.contains("//"))
    {
      paramString = paramString.split("/");
      ArrayList localArrayList = new ArrayList(paramString.length);
      int i = paramString.length;
      for (int j = 0; j < i; j++)
      {
        Object localObject = paramString[j];
        if (!((String)localObject).isEmpty()) {
          localArrayList.add(localObject);
        }
      }
      return new o(localArrayList);
    }
    throw new IllegalArgumentException(g.e("Invalid path (", paramString, "). Paths must not contain // in them."));
  }
  
  public final String h()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < a.size(); i++)
    {
      if (i > 0) {
        localStringBuilder.append("/");
      }
      localStringBuilder.append((String)a.get(i));
    }
    return localStringBuilder.toString();
  }
  
  public final e l(List paramList)
  {
    return new o(paramList);
  }
}

/* Location:
 * Qualified Name:     j9.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */