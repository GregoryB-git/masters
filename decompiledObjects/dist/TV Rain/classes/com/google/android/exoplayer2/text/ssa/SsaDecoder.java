package com.google.android.exoplayer2.text.ssa;

import android.text.TextUtils;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.LongArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import z2;

public final class SsaDecoder
  extends SimpleSubtitleDecoder
{
  private static final String DIALOGUE_LINE_PREFIX = "Dialogue: ";
  private static final String FORMAT_LINE_PREFIX = "Format: ";
  private static final Pattern SSA_TIMECODE_PATTERN = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)(?::|\\.)(\\d+)");
  private static final String TAG = "SsaDecoder";
  private int formatEndIndex;
  private int formatKeyCount;
  private int formatStartIndex;
  private int formatTextIndex;
  private final boolean haveInitializationData;
  
  public SsaDecoder()
  {
    this(null);
  }
  
  public SsaDecoder(List<byte[]> paramList)
  {
    super("SsaDecoder");
    if ((paramList != null) && (!paramList.isEmpty()))
    {
      haveInitializationData = true;
      String str = Util.fromUtf8Bytes((byte[])paramList.get(0));
      Assertions.checkArgument(str.startsWith("Format: "));
      parseFormatLine(str);
      parseHeader(new ParsableByteArray((byte[])paramList.get(1)));
    }
    else
    {
      haveInitializationData = false;
    }
  }
  
  private void parseDialogueLine(String paramString, List<Cue> paramList, LongArray paramLongArray)
  {
    if (formatKeyCount == 0)
    {
      z2.y("Skipping dialogue line before complete format: ", paramString, "SsaDecoder");
      return;
    }
    String[] arrayOfString = paramString.substring(10).split(",", formatKeyCount);
    if (arrayOfString.length != formatKeyCount)
    {
      z2.y("Skipping dialogue line with fewer columns than format: ", paramString, "SsaDecoder");
      return;
    }
    long l1 = parseTimecodeUs(arrayOfString[formatStartIndex]);
    if (l1 == -9223372036854775807L)
    {
      z2.y("Skipping invalid timing: ", paramString, "SsaDecoder");
      return;
    }
    String str = arrayOfString[formatEndIndex];
    long l3;
    if (!str.trim().isEmpty())
    {
      long l2 = parseTimecodeUs(str);
      l3 = l2;
      if (l2 == -9223372036854775807L) {
        z2.y("Skipping invalid timing: ", paramString, "SsaDecoder");
      }
    }
    else
    {
      l3 = -9223372036854775807L;
    }
    paramList.add(new Cue(arrayOfString[formatTextIndex].replaceAll("\\{.*?\\}", "").replaceAll("\\\\N", "\n").replaceAll("\\\\n", "\n")));
    paramLongArray.add(l1);
    if (l3 != -9223372036854775807L)
    {
      paramList.add(null);
      paramLongArray.add(l3);
    }
  }
  
  private void parseEventBody(ParsableByteArray paramParsableByteArray, List<Cue> paramList, LongArray paramLongArray)
  {
    for (;;)
    {
      String str = paramParsableByteArray.readLine();
      if (str == null) {
        break;
      }
      if ((!haveInitializationData) && (str.startsWith("Format: "))) {
        parseFormatLine(str);
      } else if (str.startsWith("Dialogue: ")) {
        parseDialogueLine(str, paramList, paramLongArray);
      }
    }
  }
  
  private void parseFormatLine(String paramString)
  {
    paramString = TextUtils.split(paramString.substring(8), ",");
    formatKeyCount = paramString.length;
    formatStartIndex = -1;
    formatEndIndex = -1;
    formatTextIndex = -1;
    for (int i = 0; i < formatKeyCount; i++)
    {
      String str = Util.toLowerInvariant(paramString[i].trim());
      str.getClass();
      switch (str.hashCode())
      {
      }
      do
      {
        do
        {
          do
          {
            j = -1;
            break;
          } while (!str.equals("start"));
          j = 2;
          break;
        } while (!str.equals("text"));
        j = 1;
        break;
      } while (!str.equals("end"));
      int j = 0;
      switch (j)
      {
      default: 
        break;
      case 2: 
        formatStartIndex = i;
        break;
      case 1: 
        formatTextIndex = i;
        break;
      case 0: 
        formatEndIndex = i;
      }
    }
    if ((formatStartIndex == -1) || (formatEndIndex == -1) || (formatTextIndex == -1)) {
      formatKeyCount = 0;
    }
  }
  
  private void parseHeader(ParsableByteArray paramParsableByteArray)
  {
    String str;
    do
    {
      str = paramParsableByteArray.readLine();
    } while ((str != null) && (!str.startsWith("[Events]")));
  }
  
  public static long parseTimecodeUs(String paramString)
  {
    paramString = SSA_TIMECODE_PATTERN.matcher(paramString);
    if (!paramString.matches()) {
      return -9223372036854775807L;
    }
    long l1 = Long.parseLong(paramString.group(1));
    long l2 = Long.parseLong(paramString.group(2));
    long l3 = Long.parseLong(paramString.group(3));
    return Long.parseLong(paramString.group(4)) * 10000L + (l3 * 1000000L + (l2 * 60L * 1000000L + l1 * 60L * 60L * 1000000L));
  }
  
  public SsaSubtitle decode(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    LongArray localLongArray = new LongArray();
    paramArrayOfByte = new ParsableByteArray(paramArrayOfByte, paramInt);
    if (!haveInitializationData) {
      parseHeader(paramArrayOfByte);
    }
    parseEventBody(paramArrayOfByte, localArrayList, localLongArray);
    paramArrayOfByte = new Cue[localArrayList.size()];
    localArrayList.toArray(paramArrayOfByte);
    return new SsaSubtitle(paramArrayOfByte, localLongArray.toArray());
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.ssa.SsaDecoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */