package com.google.android.exoplayer2.text.subrip;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.LongArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import z2;

public final class SubripDecoder
  extends SimpleSubtitleDecoder
{
  private static final String ALIGN_BOTTOM_LEFT = "{\\an1}";
  private static final String ALIGN_BOTTOM_MID = "{\\an2}";
  private static final String ALIGN_BOTTOM_RIGHT = "{\\an3}";
  private static final String ALIGN_MID_LEFT = "{\\an4}";
  private static final String ALIGN_MID_MID = "{\\an5}";
  private static final String ALIGN_MID_RIGHT = "{\\an6}";
  private static final String ALIGN_TOP_LEFT = "{\\an7}";
  private static final String ALIGN_TOP_MID = "{\\an8}";
  private static final String ALIGN_TOP_RIGHT = "{\\an9}";
  public static final float END_FRACTION = 0.92F;
  public static final float MID_FRACTION = 0.5F;
  public static final float START_FRACTION = 0.08F;
  private static final String SUBRIP_ALIGNMENT_TAG = "\\{\\\\an[1-9]\\}";
  private static final Pattern SUBRIP_TAG_PATTERN = Pattern.compile("\\{\\\\.*?\\}");
  private static final String SUBRIP_TIMECODE = "(?:(\\d+):)?(\\d+):(\\d+),(\\d+)";
  private static final Pattern SUBRIP_TIMING_LINE = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))?\\s*");
  private static final String TAG = "SubripDecoder";
  private final ArrayList<String> tags = new ArrayList();
  private final StringBuilder textBuilder = new StringBuilder();
  
  public SubripDecoder()
  {
    super("SubripDecoder");
  }
  
  private Cue buildCue(Spanned paramSpanned, @Nullable String paramString)
  {
    if (paramString == null) {
      return new Cue(paramSpanned);
    }
    switch (paramString.hashCode())
    {
    default: 
      break;
    case -685620462: 
      if (paramString.equals("{\\an9}")) {
        i = 5;
      }
      break;
    case -685620493: 
      if (paramString.equals("{\\an8}")) {
        i = 8;
      }
      break;
    case -685620524: 
      if (paramString.equals("{\\an7}")) {
        i = 2;
      }
      break;
    case -685620555: 
      if (paramString.equals("{\\an6}")) {
        i = 4;
      }
      break;
    case -685620586: 
      if (paramString.equals("{\\an5}")) {
        i = 7;
      }
      break;
    case -685620617: 
      if (paramString.equals("{\\an4}")) {
        i = 1;
      }
      break;
    case -685620648: 
      if (paramString.equals("{\\an3}")) {
        i = 3;
      }
      break;
    case -685620679: 
      if (paramString.equals("{\\an2}")) {
        i = 6;
      }
      break;
    case -685620710: 
      if (paramString.equals("{\\an1}")) {
        i = 0;
      }
      break;
    }
    int i = -1;
    int j;
    if ((i != 0) && (i != 1) && (i != 2))
    {
      if ((i != 3) && (i != 4) && (i != 5)) {
        j = 1;
      } else {
        j = 2;
      }
    }
    else {
      j = 0;
    }
    switch (paramString.hashCode())
    {
    default: 
      break;
    case -685620462: 
      if (paramString.equals("{\\an9}")) {
        i = 5;
      }
      break;
    case -685620493: 
      if (paramString.equals("{\\an8}")) {
        i = 4;
      }
      break;
    case -685620524: 
      if (paramString.equals("{\\an7}")) {
        i = 3;
      }
      break;
    case -685620555: 
      if (paramString.equals("{\\an6}")) {
        i = 8;
      }
      break;
    case -685620586: 
      if (paramString.equals("{\\an5}")) {
        i = 7;
      }
      break;
    case -685620617: 
      if (paramString.equals("{\\an4}")) {
        i = 6;
      }
      break;
    case -685620648: 
      if (paramString.equals("{\\an3}")) {
        i = 2;
      }
      break;
    case -685620679: 
      if (paramString.equals("{\\an2}")) {
        i = 1;
      }
      break;
    case -685620710: 
      if (paramString.equals("{\\an1}")) {
        i = 0;
      }
      break;
    }
    i = -1;
    if ((i != 0) && (i != 1) && (i != 2))
    {
      if ((i != 3) && (i != 4) && (i != 5)) {
        i = 1;
      } else {
        i = 0;
      }
    }
    else {
      i = 2;
    }
    return new Cue(paramSpanned, null, getFractionalPositionForAnchorType(i), 0, i, getFractionalPositionForAnchorType(j), j, Float.MIN_VALUE);
  }
  
  public static float getFractionalPositionForAnchorType(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1) {
        return 0.92F;
      }
      return 0.5F;
    }
    return 0.08F;
  }
  
  private static long parseTimecode(Matcher paramMatcher, int paramInt)
  {
    long l1 = Long.parseLong(paramMatcher.group(paramInt + 1));
    long l2 = Long.parseLong(paramMatcher.group(paramInt + 2));
    long l3 = Long.parseLong(paramMatcher.group(paramInt + 3));
    return (Long.parseLong(paramMatcher.group(paramInt + 4)) + (l3 * 1000L + (l2 * 60L * 1000L + l1 * 60L * 60L * 1000L))) * 1000L;
  }
  
  private String processLine(String paramString, ArrayList<String> paramArrayList)
  {
    Object localObject = paramString.trim();
    paramString = new StringBuilder((String)localObject);
    localObject = SUBRIP_TAG_PATTERN.matcher((CharSequence)localObject);
    int i = 0;
    while (((Matcher)localObject).find())
    {
      String str = ((Matcher)localObject).group();
      paramArrayList.add(str);
      int j = ((Matcher)localObject).start() - i;
      int k = str.length();
      paramString.replace(j, j + k, "");
      i += k;
    }
    return paramString.toString();
  }
  
  public SubripSubtitle decode(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    LongArray localLongArray = new LongArray();
    ParsableByteArray localParsableByteArray = new ParsableByteArray(paramArrayOfByte, paramInt);
    for (;;)
    {
      paramArrayOfByte = localParsableByteArray.readLine();
      if (paramArrayOfByte == null) {
        break;
      }
      if (paramArrayOfByte.length() != 0) {
        try
        {
          Integer.parseInt(paramArrayOfByte);
          paramArrayOfByte = localParsableByteArray.readLine();
          if (paramArrayOfByte == null)
          {
            Log.w("SubripDecoder", "Unexpected end");
            break;
          }
          Object localObject = SUBRIP_TIMING_LINE.matcher(paramArrayOfByte);
          if (((Matcher)localObject).matches())
          {
            paramInt = 1;
            localLongArray.add(parseTimecode((Matcher)localObject, 1));
            paramBoolean = TextUtils.isEmpty(((Matcher)localObject).group(6));
            int i = 0;
            if (!paramBoolean) {
              localLongArray.add(parseTimecode((Matcher)localObject, 6));
            } else {
              paramInt = 0;
            }
            textBuilder.setLength(0);
            tags.clear();
            for (;;)
            {
              paramArrayOfByte = localParsableByteArray.readLine();
              if (TextUtils.isEmpty(paramArrayOfByte)) {
                break;
              }
              if (textBuilder.length() > 0) {
                textBuilder.append("<br>");
              }
              textBuilder.append(processLine(paramArrayOfByte, tags));
            }
            localObject = Html.fromHtml(textBuilder.toString());
            while (i < tags.size())
            {
              paramArrayOfByte = (String)tags.get(i);
              if (paramArrayOfByte.matches("\\{\\\\an[1-9]\\}")) {
                break label264;
              }
              i++;
            }
            paramArrayOfByte = null;
            label264:
            localArrayList.add(buildCue((Spanned)localObject, paramArrayOfByte));
            if (paramInt != 0) {
              localArrayList.add(null);
            }
          }
          else
          {
            z2.y("Skipping invalid timing: ", paramArrayOfByte, "SubripDecoder");
          }
        }
        catch (NumberFormatException localNumberFormatException)
        {
          z2.y("Skipping invalid index: ", paramArrayOfByte, "SubripDecoder");
        }
      }
    }
    paramArrayOfByte = new Cue[localArrayList.size()];
    localArrayList.toArray(paramArrayOfByte);
    return new SubripSubtitle(paramArrayOfByte, localLongArray.toArray());
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.subrip.SubripDecoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */