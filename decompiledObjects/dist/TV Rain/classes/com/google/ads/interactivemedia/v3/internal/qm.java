package com.google.ads.interactivemedia.v3.internal;

import java.util.Locale;

public final class qm
{
  private final String[] a;
  private final int[] b;
  private final String[] c;
  private final int d;
  
  private qm(String[] paramArrayOfString1, int[] paramArrayOfInt, String[] paramArrayOfString2, int paramInt)
  {
    a = paramArrayOfString1;
    b = paramArrayOfInt;
    c = paramArrayOfString2;
    d = paramInt;
  }
  
  public static qm a(String paramString)
  {
    String[] arrayOfString1 = new String[5];
    int[] arrayOfInt = new int[4];
    String[] arrayOfString2 = new String[4];
    arrayOfString1[0] = "";
    int i = 0;
    int j = i;
    while (i < paramString.length())
    {
      int k = paramString.indexOf("$", i);
      int m = -1;
      String str1;
      Object localObject;
      if (k == -1)
      {
        str1 = String.valueOf(arrayOfString1[j]);
        localObject = String.valueOf(paramString.substring(i));
        if (((String)localObject).length() != 0) {
          localObject = str1.concat((String)localObject);
        } else {
          localObject = new String(str1);
        }
        arrayOfString1[j] = localObject;
        i = paramString.length();
      }
      else if (k != i)
      {
        str1 = String.valueOf(arrayOfString1[j]);
        localObject = String.valueOf(paramString.substring(i, k));
        if (((String)localObject).length() != 0) {
          localObject = str1.concat((String)localObject);
        } else {
          localObject = new String(str1);
        }
        arrayOfString1[j] = localObject;
        i = k;
      }
      else if (paramString.startsWith("$$", i))
      {
        arrayOfString1[j] = String.valueOf(arrayOfString1[j]).concat("$");
        i += 2;
      }
      else
      {
        i++;
        k = paramString.indexOf("$", i);
        str1 = paramString.substring(i, k);
        if (str1.equals("RepresentationID"))
        {
          arrayOfInt[j] = 1;
        }
        else
        {
          i = str1.indexOf("%0");
          if (i != -1)
          {
            String str2 = str1.substring(i);
            localObject = str2;
            if (!str2.endsWith("d"))
            {
              localObject = str2;
              if (!str2.endsWith("x")) {
                localObject = str2.concat("d");
              }
            }
            str1 = str1.substring(0, i);
          }
          else
          {
            localObject = "%01d";
          }
          str1.getClass();
          switch (str1.hashCode())
          {
          default: 
            i = m;
            break;
          case 38199441: 
            if (!str1.equals("Bandwidth")) {
              i = m;
            } else {
              i = 2;
            }
            break;
          case 2606829: 
            if (!str1.equals("Time")) {
              i = m;
            } else {
              i = 1;
            }
            break;
          case -1950496919: 
            if (!str1.equals("Number")) {
              i = m;
            } else {
              i = 0;
            }
            break;
          }
          switch (i)
          {
          default: 
            if (paramString.length() != 0) {
              paramString = "Invalid template: ".concat(paramString);
            } else {
              paramString = new String("Invalid template: ");
            }
            throw new IllegalArgumentException(paramString);
          case 2: 
            arrayOfInt[j] = 3;
            break;
          case 1: 
            arrayOfInt[j] = 4;
            break;
          case 0: 
            arrayOfInt[j] = 2;
          }
          arrayOfString2[j] = localObject;
        }
        j++;
        arrayOfString1[j] = "";
        i = k + 1;
      }
    }
    return new qm(arrayOfString1, arrayOfInt, arrayOfString2, j);
  }
  
  public final String a(String paramString, long paramLong1, int paramInt, long paramLong2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int j;
    for (int i = 0;; i++)
    {
      j = d;
      if (i >= j) {
        break;
      }
      localStringBuilder.append(a[i]);
      j = b[i];
      if (j == 1) {
        localStringBuilder.append(paramString);
      } else if (j == 2) {
        localStringBuilder.append(String.format(Locale.US, c[i], new Object[] { Long.valueOf(paramLong1) }));
      } else if (j == 3) {
        localStringBuilder.append(String.format(Locale.US, c[i], new Object[] { Integer.valueOf(paramInt) }));
      } else if (j == 4) {
        localStringBuilder.append(String.format(Locale.US, c[i], new Object[] { Long.valueOf(paramLong2) }));
      }
    }
    localStringBuilder.append(a[j]);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.qm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */