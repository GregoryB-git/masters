package ib;

import java.util.ArrayList;

public final class d
{
  public final String[] a;
  
  public d(a parama)
  {
    parama = a;
    a = ((String[])parama.toArray(new String[parama.size()]));
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = a.length / 2;
    for (int j = 0; j < i; j++)
    {
      int k = j * 2;
      Object localObject1 = null;
      if (k >= 0)
      {
        localObject2 = a;
        if (k < localObject2.length)
        {
          localObject2 = localObject2[k];
          break label66;
        }
      }
      Object localObject2 = null;
      label66:
      localStringBuilder.append((String)localObject2);
      localStringBuilder.append(": ");
      k++;
      localObject2 = localObject1;
      if (k >= 0)
      {
        localObject2 = a;
        if (k >= localObject2.length) {
          localObject2 = localObject1;
        } else {
          localObject2 = localObject2[k];
        }
      }
      localStringBuilder.append((String)localObject2);
      localStringBuilder.append("\n");
    }
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public final ArrayList a = new ArrayList(20);
  }
}

/* Location:
 * Qualified Name:     ib.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */