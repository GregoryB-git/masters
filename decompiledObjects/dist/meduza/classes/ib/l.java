package ib;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;

public final class l
{
  public static final String[] a = new String[0];
  public static final Charset b = Charset.forName("UTF-8");
  
  public static Object[] a(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramArrayOfObject1.length;
    for (int j = 0; j < i; j++)
    {
      Object localObject1 = paramArrayOfObject1[j];
      int k = paramArrayOfObject2.length;
      for (int m = 0; m < k; m++)
      {
        Object localObject2 = paramArrayOfObject2[m];
        if (localObject1.equals(localObject2))
        {
          localArrayList.add(localObject2);
          break;
        }
      }
    }
    return localArrayList.toArray((Object[])Array.newInstance(String.class, localArrayList.size()));
  }
}

/* Location:
 * Qualified Name:     ib.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */