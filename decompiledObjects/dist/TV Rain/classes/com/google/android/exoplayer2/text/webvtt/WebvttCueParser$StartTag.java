package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

final class WebvttCueParser$StartTag
{
  private static final String[] NO_CLASSES = new String[0];
  public final String[] classes;
  public final String name;
  public final int position;
  public final String voice;
  
  private WebvttCueParser$StartTag(String paramString1, int paramInt, String paramString2, String[] paramArrayOfString)
  {
    position = paramInt;
    name = paramString1;
    voice = paramString2;
    classes = paramArrayOfString;
  }
  
  public static StartTag buildStartTag(String paramString, int paramInt)
  {
    Object localObject = paramString.trim();
    if (((String)localObject).isEmpty()) {
      return null;
    }
    int i = ((String)localObject).indexOf(" ");
    if (i == -1)
    {
      paramString = "";
    }
    else
    {
      paramString = ((String)localObject).substring(i).trim();
      localObject = ((String)localObject).substring(0, i);
    }
    localObject = Util.split((String)localObject, "\\.");
    String str = localObject[0];
    if (localObject.length > 1) {
      localObject = (String[])Arrays.copyOfRange((Object[])localObject, 1, localObject.length);
    } else {
      localObject = NO_CLASSES;
    }
    return new StartTag(str, paramInt, paramString, (String[])localObject);
  }
  
  public static StartTag buildWholeCueVirtualTag()
  {
    return new StartTag("", 0, "", new String[0]);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.webvtt.WebvttCueParser.StartTag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */