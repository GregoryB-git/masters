package o0;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class n
{
  public final List a;
  public final List b;
  public final List c;
  
  public n(List paramList1, List paramList2, List paramList3)
  {
    a = paramList1;
    b = paramList2;
    c = paramList3;
  }
  
  public static n b(String paramString)
  {
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    c(paramString, localArrayList1, localArrayList2, localArrayList3);
    return new n(localArrayList1, localArrayList2, localArrayList3);
  }
  
  public static void c(String paramString, List paramList1, List paramList2, List paramList3)
  {
    paramList1.add("");
    int i = 0;
    while (i < paramString.length())
    {
      int j = paramString.indexOf("$", i);
      int k = -1;
      Object localObject1;
      if (j == -1)
      {
        k = paramList2.size();
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)paramList1.get(paramList2.size()));
        ((StringBuilder)localObject1).append(paramString.substring(i));
        paramList1.set(k, ((StringBuilder)localObject1).toString());
        i = paramString.length();
      }
      else if (j != i)
      {
        k = paramList2.size();
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)paramList1.get(paramList2.size()));
        ((StringBuilder)localObject1).append(paramString.substring(i, j));
        paramList1.set(k, ((StringBuilder)localObject1).toString());
        i = j;
      }
      else if (paramString.startsWith("$$", i))
      {
        k = paramList2.size();
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)paramList1.get(paramList2.size()));
        ((StringBuilder)localObject1).append("$");
        paramList1.set(k, ((StringBuilder)localObject1).toString());
        i += 2;
      }
      else
      {
        paramList3.add("");
        i++;
        j = paramString.indexOf("$", i);
        Object localObject2 = paramString.substring(i, j);
        if (((String)localObject2).equals("RepresentationID"))
        {
          paramList2.add(Integer.valueOf(1));
        }
        else
        {
          i = ((String)localObject2).indexOf("%0");
          if (i != -1)
          {
            String str = ((String)localObject2).substring(i);
            localObject1 = str;
            if (!str.endsWith("d"))
            {
              localObject1 = str;
              if (!str.endsWith("x"))
              {
                localObject1 = str;
                if (!str.endsWith("X"))
                {
                  localObject1 = new StringBuilder();
                  ((StringBuilder)localObject1).append(str);
                  ((StringBuilder)localObject1).append("d");
                  localObject1 = ((StringBuilder)localObject1).toString();
                }
              }
            }
            localObject2 = ((String)localObject2).substring(0, i);
          }
          else
          {
            localObject1 = "%01d";
          }
          ((String)localObject2).hashCode();
          switch (((String)localObject2).hashCode())
          {
          default: 
            i = k;
            break;
          case 38199441: 
            if (!((String)localObject2).equals("Bandwidth")) {
              i = k;
            } else {
              i = 2;
            }
            break;
          case 2606829: 
            if (!((String)localObject2).equals("Time")) {
              i = k;
            } else {
              i = 1;
            }
            break;
          case -1950496919: 
            if (!((String)localObject2).equals("Number")) {
              i = k;
            } else {
              i = 0;
            }
            break;
          }
          switch (i)
          {
          default: 
            paramList1 = new StringBuilder();
            paramList1.append("Invalid template: ");
            paramList1.append(paramString);
            throw new IllegalArgumentException(paramList1.toString());
          case 2: 
            i = 3;
          }
          for (localObject2 = Integer.valueOf(i);; localObject2 = Integer.valueOf(2))
          {
            paramList2.add(localObject2);
            break label658;
            i = 4;
            break;
          }
          label658:
          paramList3.set(paramList2.size() - 1, localObject1);
        }
        paramList1.add("");
        i = j + 1;
      }
    }
  }
  
  public String a(String paramString, long paramLong1, int paramInt, long paramLong2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < b.size(); i++)
    {
      localStringBuilder.append((String)a.get(i));
      if (((Integer)b.get(i)).intValue() == 1)
      {
        localStringBuilder.append(paramString);
      }
      else
      {
        String str;
        if (((Integer)b.get(i)).intValue() == 2) {
          str = String.format(Locale.US, (String)c.get(i), new Object[] { Long.valueOf(paramLong1) });
        }
        for (;;)
        {
          localStringBuilder.append(str);
          break;
          if (((Integer)b.get(i)).intValue() == 3)
          {
            str = String.format(Locale.US, (String)c.get(i), new Object[] { Integer.valueOf(paramInt) });
          }
          else
          {
            if (((Integer)b.get(i)).intValue() != 4) {
              break;
            }
            str = String.format(Locale.US, (String)c.get(i), new Object[] { Long.valueOf(paramLong2) });
          }
        }
      }
    }
    localStringBuilder.append((String)a.get(b.size()));
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     o0.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */