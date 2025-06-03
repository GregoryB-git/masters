package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import z2;

public final class WebvttParserUtil
{
  private static final Pattern COMMENT = Pattern.compile("^NOTE(( |\t).*)?$");
  private static final String WEBVTT_HEADER = "WEBVTT";
  
  public static Matcher findNextCueHeader(ParsableByteArray paramParsableByteArray)
  {
    Object localObject;
    do
    {
      localObject = paramParsableByteArray.readLine();
      if (localObject == null) {
        break;
      }
      if (COMMENT.matcher((CharSequence)localObject).matches()) {
        for (;;)
        {
          localObject = paramParsableByteArray.readLine();
          if ((localObject == null) || (((String)localObject).isEmpty())) {
            break;
          }
        }
      }
      localObject = WebvttCueParser.CUE_HEADER_PATTERN.matcher((CharSequence)localObject);
    } while (!((Matcher)localObject).matches());
    return (Matcher)localObject;
    return null;
  }
  
  public static boolean isWebvttHeaderLine(ParsableByteArray paramParsableByteArray)
  {
    paramParsableByteArray = paramParsableByteArray.readLine();
    boolean bool;
    if ((paramParsableByteArray != null) && (paramParsableByteArray.startsWith("WEBVTT"))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static float parsePercentage(String paramString)
    throws NumberFormatException
  {
    if (paramString.endsWith("%")) {
      return Float.parseFloat(paramString.substring(0, paramString.length() - 1)) / 100.0F;
    }
    throw new NumberFormatException("Percentages must end with %");
  }
  
  public static long parseTimestampUs(String paramString)
    throws NumberFormatException
  {
    paramString = Util.splitAtFirst(paramString, "\\.");
    int i = 0;
    String[] arrayOfString = Util.split(paramString[0], ":");
    int j = arrayOfString.length;
    long l1 = 0L;
    while (i < j)
    {
      l1 = l1 * 60L + Long.parseLong(arrayOfString[i]);
      i++;
    }
    long l2 = l1 * 1000L;
    l1 = l2;
    if (paramString.length == 2) {
      l1 = l2 + Long.parseLong(paramString[1]);
    }
    return l1 * 1000L;
  }
  
  public static void validateWebvttHeaderLine(ParsableByteArray paramParsableByteArray)
    throws ParserException
  {
    int i = paramParsableByteArray.getPosition();
    if (isWebvttHeaderLine(paramParsableByteArray)) {
      return;
    }
    paramParsableByteArray.setPosition(i);
    StringBuilder localStringBuilder = z2.t("Expected WEBVTT. Got ");
    localStringBuilder.append(paramParsableByteArray.readLine());
    throw new ParserException(localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.webvtt.WebvttParserUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */