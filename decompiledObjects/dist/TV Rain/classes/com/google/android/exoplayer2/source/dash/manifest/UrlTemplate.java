package com.google.android.exoplayer2.source.dash.manifest;

import java.util.Locale;
import z2;

public final class UrlTemplate
{
  private static final String BANDWIDTH = "Bandwidth";
  private static final int BANDWIDTH_ID = 3;
  private static final String DEFAULT_FORMAT_TAG = "%01d";
  private static final String ESCAPED_DOLLAR = "$$";
  private static final String NUMBER = "Number";
  private static final int NUMBER_ID = 2;
  private static final String REPRESENTATION = "RepresentationID";
  private static final int REPRESENTATION_ID = 1;
  private static final String TIME = "Time";
  private static final int TIME_ID = 4;
  private final int identifierCount;
  private final String[] identifierFormatTags;
  private final int[] identifiers;
  private final String[] urlPieces;
  
  private UrlTemplate(String[] paramArrayOfString1, int[] paramArrayOfInt, String[] paramArrayOfString2, int paramInt)
  {
    urlPieces = paramArrayOfString1;
    identifiers = paramArrayOfInt;
    identifierFormatTags = paramArrayOfString2;
    identifierCount = paramInt;
  }
  
  public static UrlTemplate compile(String paramString)
  {
    String[] arrayOfString1 = new String[5];
    int[] arrayOfInt = new int[4];
    String[] arrayOfString2 = new String[4];
    return new UrlTemplate(arrayOfString1, arrayOfInt, arrayOfString2, parseTemplate(paramString, arrayOfString1, arrayOfInt, arrayOfString2));
  }
  
  private static int parseTemplate(String paramString, String[] paramArrayOfString1, int[] paramArrayOfInt, String[] paramArrayOfString2)
  {
    paramArrayOfString1[0] = "";
    int i = 0;
    int j = i;
    while (i < paramString.length())
    {
      int k = paramString.indexOf("$", i);
      Object localObject;
      if (k == -1)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(paramArrayOfString1[j]);
        ((StringBuilder)localObject).append(paramString.substring(i));
        paramArrayOfString1[j] = ((StringBuilder)localObject).toString();
        i = paramString.length();
      }
      else if (k != i)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(paramArrayOfString1[j]);
        ((StringBuilder)localObject).append(paramString.substring(i, k));
        paramArrayOfString1[j] = ((StringBuilder)localObject).toString();
        i = k;
      }
      else if (paramString.startsWith("$$", i))
      {
        paramArrayOfString1[j] = z2.s(new StringBuilder(), paramArrayOfString1[j], "$");
        i += 2;
      }
      else
      {
        i++;
        k = paramString.indexOf("$", i);
        String str1 = paramString.substring(i, k);
        if (str1.equals("RepresentationID"))
        {
          paramArrayOfInt[j] = 1;
        }
        else
        {
          i = str1.indexOf("%0");
          if (i != -1)
          {
            String str2 = str1.substring(i);
            localObject = str2;
            if (!str2.endsWith("d")) {
              localObject = z2.o(str2, "d");
            }
            str1 = str1.substring(0, i);
          }
          else
          {
            localObject = "%01d";
          }
          str1.getClass();
          str1.hashCode();
          i = -1;
          switch (str1.hashCode())
          {
          default: 
            break;
          case 38199441: 
            if (str1.equals("Bandwidth")) {
              i = 2;
            }
            break;
          case 2606829: 
            if (str1.equals("Time")) {
              i = 1;
            }
            break;
          case -1950496919: 
            if (str1.equals("Number")) {
              i = 0;
            }
            break;
          }
          switch (i)
          {
          default: 
            throw new IllegalArgumentException(z2.o("Invalid template: ", paramString));
          case 2: 
            paramArrayOfInt[j] = 3;
            break;
          case 1: 
            paramArrayOfInt[j] = 4;
            break;
          case 0: 
            paramArrayOfInt[j] = 2;
          }
          paramArrayOfString2[j] = localObject;
        }
        j++;
        paramArrayOfString1[j] = "";
        i = k + 1;
      }
    }
    return j;
  }
  
  public String buildUri(String paramString, long paramLong1, int paramInt, long paramLong2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int j;
    for (int i = 0;; i++)
    {
      j = identifierCount;
      if (i >= j) {
        break;
      }
      localStringBuilder.append(urlPieces[i]);
      j = identifiers[i];
      if (j == 1) {
        localStringBuilder.append(paramString);
      } else if (j == 2) {
        localStringBuilder.append(String.format(Locale.US, identifierFormatTags[i], new Object[] { Long.valueOf(paramLong1) }));
      } else if (j == 3) {
        localStringBuilder.append(String.format(Locale.US, identifierFormatTags[i], new Object[] { Integer.valueOf(paramInt) }));
      } else if (j == 4) {
        localStringBuilder.append(String.format(Locale.US, identifierFormatTags[i], new Object[] { Long.valueOf(paramLong2) }));
      }
    }
    localStringBuilder.append(urlPieces[j]);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.manifest.UrlTemplate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */