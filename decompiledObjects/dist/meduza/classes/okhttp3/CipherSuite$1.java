package okhttp3;

import java.util.Comparator;

class CipherSuite$1
  implements Comparator<String>
{
  public final int compare(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (String)paramObject1;
    paramObject2 = (String)paramObject2;
    int i = Math.min(((String)paramObject1).length(), ((String)paramObject2).length());
    int j = 4;
    int k = -1;
    if (j < i)
    {
      int m = ((String)paramObject1).charAt(j);
      int n = ((String)paramObject2).charAt(j);
      if (m != n) {
        if (m < n)
        {
          j = k;
          break label116;
        }
      }
    }
    do
    {
      j = 1;
      break label116;
      j++;
      break;
      i = ((String)paramObject1).length();
      j = ((String)paramObject2).length();
      if (i == j) {
        break label113;
      }
    } while (i >= j);
    j = k;
    break label116;
    label113:
    j = 0;
    label116:
    return j;
  }
}

/* Location:
 * Qualified Name:     okhttp3.CipherSuite.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */