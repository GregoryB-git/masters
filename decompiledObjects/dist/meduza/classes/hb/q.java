package hb;

import gb.p3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;
import p7.a;
import xc.i;

public final class q
{
  static
  {
    Logger.getLogger(q.class.getName());
  }
  
  public static byte[][] a(ArrayList paramArrayList)
  {
    int i = paramArrayList.size() * 2;
    byte[][] arrayOfByte = new byte[i][];
    Object localObject = paramArrayList.iterator();
    int j = 0;
    int k;
    while (((Iterator)localObject).hasNext())
    {
      paramArrayList = (jb.d)((Iterator)localObject).next();
      k = j + 1;
      arrayOfByte[j] = a.s();
      j = k + 1;
      arrayOfByte[k] = b.s();
    }
    paramArrayList = p3.a;
    for (j = 0;; j += 2)
    {
      paramArrayList = arrayOfByte;
      if (j >= i) {
        break;
      }
      paramArrayList = arrayOfByte[j];
      int m = j + 1;
      localObject = arrayOfByte[m];
      if (p3.a(paramArrayList, p3.b))
      {
        for (k = 0; k < localObject.length; k++) {
          if (localObject[k] == 44)
          {
            localObject = new ArrayList(i + 10);
            for (m = 0;; m++)
            {
              k = j;
              if (m >= j) {
                break;
              }
              ((ArrayList)localObject).add(arrayOfByte[m]);
            }
            while (k < i)
            {
              paramArrayList = arrayOfByte[k];
              byte[] arrayOfByte1 = arrayOfByte[(k + 1)];
              if (!p3.a(paramArrayList, p3.b))
              {
                ((ArrayList)localObject).add(paramArrayList);
                ((ArrayList)localObject).add(arrayOfByte1);
              }
              else
              {
                j = 0;
                m = j;
                while (j <= arrayOfByte1.length)
                {
                  if ((j == arrayOfByte1.length) || (arrayOfByte1[j] == 44))
                  {
                    byte[] arrayOfByte2 = a.a.a(new String(arrayOfByte1, m, j - m, n7.d.a));
                    ((ArrayList)localObject).add(paramArrayList);
                    ((ArrayList)localObject).add(arrayOfByte2);
                    m = j + 1;
                  }
                  j++;
                }
              }
              k += 2;
            }
            return (byte[][])((ArrayList)localObject).toArray(new byte[0][]);
          }
        }
        arrayOfByte[m] = a.a.a(new String((byte[])localObject, n7.d.a));
      }
    }
    return paramArrayList;
  }
}

/* Location:
 * Qualified Name:     hb.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */