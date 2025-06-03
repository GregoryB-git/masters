package com.google.android.exoplayer2.text.webvtt;

import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan.Standard;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.NonNull;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import z2;

public final class WebvttCueParser
{
  private static final char CHAR_AMPERSAND = '&';
  private static final char CHAR_GREATER_THAN = '>';
  private static final char CHAR_LESS_THAN = '<';
  private static final char CHAR_SEMI_COLON = ';';
  private static final char CHAR_SLASH = '/';
  private static final char CHAR_SPACE = ' ';
  public static final Pattern CUE_HEADER_PATTERN = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
  private static final Pattern CUE_SETTING_PATTERN = Pattern.compile("(\\S+?):(\\S+)");
  private static final String ENTITY_AMPERSAND = "amp";
  private static final String ENTITY_GREATER_THAN = "gt";
  private static final String ENTITY_LESS_THAN = "lt";
  private static final String ENTITY_NON_BREAK_SPACE = "nbsp";
  private static final int STYLE_BOLD = 1;
  private static final int STYLE_ITALIC = 2;
  private static final String TAG = "WebvttCueParser";
  private static final String TAG_BOLD = "b";
  private static final String TAG_CLASS = "c";
  private static final String TAG_ITALIC = "i";
  private static final String TAG_LANG = "lang";
  private static final String TAG_UNDERLINE = "u";
  private static final String TAG_VOICE = "v";
  private final StringBuilder textBuilder = new StringBuilder();
  
  private static void applyEntity(String paramString, SpannableStringBuilder paramSpannableStringBuilder)
  {
    paramString.getClass();
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 3374865: 
      if (paramString.equals("nbsp")) {
        j = 3;
      }
      break;
    case 96708: 
      if (paramString.equals("amp")) {
        j = 2;
      }
      break;
    case 3464: 
      if (paramString.equals("lt")) {
        j = 1;
      }
      break;
    case 3309: 
      if (paramString.equals("gt")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      paramSpannableStringBuilder = new StringBuilder();
      paramSpannableStringBuilder.append("ignoring unsupported entity: '&");
      paramSpannableStringBuilder.append(paramString);
      paramSpannableStringBuilder.append(";'");
      Log.w("WebvttCueParser", paramSpannableStringBuilder.toString());
      break;
    case 3: 
      paramSpannableStringBuilder.append(' ');
      break;
    case 2: 
      paramSpannableStringBuilder.append('&');
      break;
    case 1: 
      paramSpannableStringBuilder.append('<');
      break;
    case 0: 
      paramSpannableStringBuilder.append('>');
    }
  }
  
  private static void applySpansForTag(String paramString, StartTag paramStartTag, SpannableStringBuilder paramSpannableStringBuilder, List<WebvttCssStyle> paramList, List<StyleMatch> paramList1)
  {
    int i = position;
    int j = paramSpannableStringBuilder.length();
    String str = name;
    str.getClass();
    int k = str.hashCode();
    int m = 0;
    int n = -1;
    switch (k)
    {
    default: 
      break;
    case 3314158: 
      if (str.equals("lang")) {
        n = 6;
      }
      break;
    case 118: 
      if (str.equals("v")) {
        n = 5;
      }
      break;
    case 117: 
      if (str.equals("u")) {
        n = 4;
      }
      break;
    case 105: 
      if (str.equals("i")) {
        n = 3;
      }
      break;
    case 99: 
      if (str.equals("c")) {
        n = 2;
      }
      break;
    case 98: 
      if (str.equals("b")) {
        n = 1;
      }
      break;
    case 0: 
      if (str.equals("")) {
        n = 0;
      }
      break;
    }
    switch (n)
    {
    default: 
      return;
    case 4: 
      paramSpannableStringBuilder.setSpan(new UnderlineSpan(), i, j, 33);
      break;
    case 3: 
      paramSpannableStringBuilder.setSpan(new StyleSpan(2), i, j, 33);
      break;
    case 1: 
      paramSpannableStringBuilder.setSpan(new StyleSpan(1), i, j, 33);
    }
    paramList1.clear();
    getApplicableStyles(paramList, paramString, paramStartTag, paramList1);
    k = paramList1.size();
    for (n = m; n < k; n++) {
      applyStyleToText(paramSpannableStringBuilder, getstyle, i, j);
    }
  }
  
  private static void applyStyleToText(SpannableStringBuilder paramSpannableStringBuilder, WebvttCssStyle paramWebvttCssStyle, int paramInt1, int paramInt2)
  {
    if (paramWebvttCssStyle == null) {
      return;
    }
    if (paramWebvttCssStyle.getStyle() != -1) {
      paramSpannableStringBuilder.setSpan(new StyleSpan(paramWebvttCssStyle.getStyle()), paramInt1, paramInt2, 33);
    }
    if (paramWebvttCssStyle.isLinethrough()) {
      paramSpannableStringBuilder.setSpan(new StrikethroughSpan(), paramInt1, paramInt2, 33);
    }
    if (paramWebvttCssStyle.isUnderline()) {
      paramSpannableStringBuilder.setSpan(new UnderlineSpan(), paramInt1, paramInt2, 33);
    }
    if (paramWebvttCssStyle.hasFontColor()) {
      paramSpannableStringBuilder.setSpan(new ForegroundColorSpan(paramWebvttCssStyle.getFontColor()), paramInt1, paramInt2, 33);
    }
    if (paramWebvttCssStyle.hasBackgroundColor()) {
      paramSpannableStringBuilder.setSpan(new BackgroundColorSpan(paramWebvttCssStyle.getBackgroundColor()), paramInt1, paramInt2, 33);
    }
    if (paramWebvttCssStyle.getFontFamily() != null) {
      paramSpannableStringBuilder.setSpan(new TypefaceSpan(paramWebvttCssStyle.getFontFamily()), paramInt1, paramInt2, 33);
    }
    if (paramWebvttCssStyle.getTextAlign() != null) {
      paramSpannableStringBuilder.setSpan(new AlignmentSpan.Standard(paramWebvttCssStyle.getTextAlign()), paramInt1, paramInt2, 33);
    }
    int i = paramWebvttCssStyle.getFontSizeUnit();
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3) {
          paramSpannableStringBuilder.setSpan(new RelativeSizeSpan(paramWebvttCssStyle.getFontSize() / 100.0F), paramInt1, paramInt2, 33);
        }
      }
      else {
        paramSpannableStringBuilder.setSpan(new RelativeSizeSpan(paramWebvttCssStyle.getFontSize()), paramInt1, paramInt2, 33);
      }
    }
    else {
      paramSpannableStringBuilder.setSpan(new AbsoluteSizeSpan((int)paramWebvttCssStyle.getFontSize(), true), paramInt1, paramInt2, 33);
    }
  }
  
  private static int findEndOfTag(String paramString, int paramInt)
  {
    paramInt = paramString.indexOf('>', paramInt);
    if (paramInt == -1) {
      paramInt = paramString.length();
    } else {
      paramInt++;
    }
    return paramInt;
  }
  
  private static void getApplicableStyles(List<WebvttCssStyle> paramList, String paramString, StartTag paramStartTag, List<StyleMatch> paramList1)
  {
    int i = paramList.size();
    for (int j = 0; j < i; j++)
    {
      WebvttCssStyle localWebvttCssStyle = (WebvttCssStyle)paramList.get(j);
      int k = localWebvttCssStyle.getSpecificityScore(paramString, name, classes, voice);
      if (k > 0) {
        paramList1.add(new StyleMatch(k, localWebvttCssStyle));
      }
    }
    Collections.sort(paramList1);
  }
  
  private static String getTagName(String paramString)
  {
    paramString = paramString.trim();
    if (paramString.isEmpty()) {
      return null;
    }
    return Util.splitAtFirst(paramString, "[ \\.]")[0];
  }
  
  private static boolean isSupportedTag(String paramString)
  {
    paramString.getClass();
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 3314158: 
      if (paramString.equals("lang")) {
        j = 5;
      }
      break;
    case 118: 
      if (paramString.equals("v")) {
        j = 4;
      }
      break;
    case 117: 
      if (paramString.equals("u")) {
        j = 3;
      }
      break;
    case 105: 
      if (paramString.equals("i")) {
        j = 2;
      }
      break;
    case 99: 
      if (paramString.equals("c")) {
        j = 1;
      }
      break;
    case 98: 
      if (paramString.equals("b")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      return false;
    }
    return true;
  }
  
  private static boolean parseCue(String paramString, Matcher paramMatcher, ParsableByteArray paramParsableByteArray, WebvttCue.Builder paramBuilder, StringBuilder paramStringBuilder, List<WebvttCssStyle> paramList)
  {
    try
    {
      paramBuilder.setStartTime(WebvttParserUtil.parseTimestampUs(paramMatcher.group(1))).setEndTime(WebvttParserUtil.parseTimestampUs(paramMatcher.group(2)));
      parseCueSettingsList(paramMatcher.group(3), paramBuilder);
      paramStringBuilder.setLength(0);
      for (;;)
      {
        paramMatcher = paramParsableByteArray.readLine();
        if (TextUtils.isEmpty(paramMatcher)) {
          break;
        }
        if (paramStringBuilder.length() > 0) {
          paramStringBuilder.append("\n");
        }
        paramStringBuilder.append(paramMatcher.trim());
      }
      parseCueText(paramString, paramStringBuilder.toString(), paramBuilder, paramList);
      return true;
    }
    catch (NumberFormatException paramString)
    {
      paramString = z2.t("Skipping cue with bad header: ");
      paramString.append(paramMatcher.group());
      Log.w("WebvttCueParser", paramString.toString());
    }
    return false;
  }
  
  public static void parseCueSettingsList(String paramString, WebvttCue.Builder paramBuilder)
  {
    paramString = CUE_SETTING_PATTERN.matcher(paramString);
    while (paramString.find())
    {
      String str1 = paramString.group(1);
      String str2 = paramString.group(2);
      try
      {
        if ("line".equals(str1))
        {
          parseLineAttribute(str2, paramBuilder);
        }
        else if ("align".equals(str1))
        {
          paramBuilder.setTextAlignment(parseTextAlignment(str2));
        }
        else if ("position".equals(str1))
        {
          parsePositionAttribute(str2, paramBuilder);
        }
        else if ("size".equals(str1))
        {
          paramBuilder.setWidth(WebvttParserUtil.parsePercentage(str2));
        }
        else
        {
          StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
          localStringBuilder2.<init>();
          localStringBuilder2.append("Unknown cue setting ");
          localStringBuilder2.append(str1);
          localStringBuilder2.append(":");
          localStringBuilder2.append(str2);
          Log.w("WebvttCueParser", localStringBuilder2.toString());
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        StringBuilder localStringBuilder1 = z2.t("Skipping bad cue setting: ");
        localStringBuilder1.append(paramString.group());
        Log.w("WebvttCueParser", localStringBuilder1.toString());
      }
    }
  }
  
  public static void parseCueText(String paramString1, String paramString2, WebvttCue.Builder paramBuilder, List<WebvttCssStyle> paramList)
  {
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    ArrayDeque localArrayDeque = new ArrayDeque();
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramString2.length())
    {
      char c = paramString2.charAt(i);
      int j;
      int k;
      if (c != '&')
      {
        if (c != '<')
        {
          localSpannableStringBuilder.append(c);
          i++;
        }
        else
        {
          j = i + 1;
          if (j >= paramString2.length())
          {
            i = j;
          }
          else
          {
            k = paramString2.charAt(j);
            int m = 1;
            if (k == 47) {
              k = 1;
            } else {
              k = 0;
            }
            int n = findEndOfTag(paramString2, j);
            int i1 = n - 2;
            if (paramString2.charAt(i1) == '/') {
              j = 1;
            } else {
              j = 0;
            }
            if (k != 0) {
              m = 2;
            }
            if (j == 0) {
              i1 = n - 1;
            }
            Object localObject = paramString2.substring(i + m, i1);
            String str = getTagName((String)localObject);
            i = n;
            if (str != null) {
              if (!isSupportedTag(str))
              {
                i = n;
              }
              else if (k != 0)
              {
                do
                {
                  if (localArrayDeque.isEmpty())
                  {
                    i = n;
                    break;
                  }
                  localObject = (StartTag)localArrayDeque.pop();
                  applySpansForTag(paramString1, (StartTag)localObject, localSpannableStringBuilder, paramList, localArrayList);
                } while (!name.equals(str));
                i = n;
              }
              else
              {
                i = n;
                if (j == 0)
                {
                  localArrayDeque.push(StartTag.buildStartTag((String)localObject, localSpannableStringBuilder.length()));
                  i = n;
                }
              }
            }
          }
        }
      }
      else
      {
        j = i + 1;
        i = paramString2.indexOf(';', j);
        k = paramString2.indexOf(' ', j);
        if (i == -1) {
          i = k;
        } else if (k != -1) {
          i = Math.min(i, k);
        }
        if (i != -1)
        {
          applyEntity(paramString2.substring(j, i), localSpannableStringBuilder);
          if (i == k) {
            localSpannableStringBuilder.append(" ");
          }
          i++;
        }
        else
        {
          localSpannableStringBuilder.append(c);
          i = j;
        }
      }
    }
    while (!localArrayDeque.isEmpty()) {
      applySpansForTag(paramString1, (StartTag)localArrayDeque.pop(), localSpannableStringBuilder, paramList, localArrayList);
    }
    applySpansForTag(paramString1, StartTag.buildWholeCueVirtualTag(), localSpannableStringBuilder, paramList, localArrayList);
    paramBuilder.setText(localSpannableStringBuilder);
  }
  
  private static void parseLineAttribute(String paramString, WebvttCue.Builder paramBuilder)
    throws NumberFormatException
  {
    int i = paramString.indexOf(',');
    if (i != -1)
    {
      paramBuilder.setLineAnchor(parsePositionAnchor(paramString.substring(i + 1)));
      paramString = paramString.substring(0, i);
    }
    else
    {
      paramBuilder.setLineAnchor(Integer.MIN_VALUE);
    }
    if (paramString.endsWith("%"))
    {
      paramBuilder.setLine(WebvttParserUtil.parsePercentage(paramString)).setLineType(0);
    }
    else
    {
      int j = Integer.parseInt(paramString);
      i = j;
      if (j < 0) {
        i = j - 1;
      }
      paramBuilder.setLine(i).setLineType(1);
    }
  }
  
  private static int parsePositionAnchor(String paramString)
  {
    paramString.getClass();
    paramString.hashCode();
    int i = -1;
    switch (paramString.hashCode())
    {
    default: 
      break;
    case 109757538: 
      if (paramString.equals("start")) {
        i = 3;
      }
      break;
    case 100571: 
      if (paramString.equals("end")) {
        i = 2;
      }
      break;
    case -1074341483: 
      if (paramString.equals("middle")) {
        i = 1;
      }
      break;
    case -1364013995: 
      if (paramString.equals("center")) {
        i = 0;
      }
      break;
    }
    switch (i)
    {
    default: 
      z2.y("Invalid anchor value: ", paramString, "WebvttCueParser");
      return Integer.MIN_VALUE;
    case 3: 
      return 0;
    case 2: 
      return 2;
    }
    return 1;
  }
  
  private static void parsePositionAttribute(String paramString, WebvttCue.Builder paramBuilder)
    throws NumberFormatException
  {
    int i = paramString.indexOf(',');
    if (i != -1)
    {
      paramBuilder.setPositionAnchor(parsePositionAnchor(paramString.substring(i + 1)));
      paramString = paramString.substring(0, i);
    }
    else
    {
      paramBuilder.setPositionAnchor(Integer.MIN_VALUE);
    }
    paramBuilder.setPosition(WebvttParserUtil.parsePercentage(paramString));
  }
  
  private static Layout.Alignment parseTextAlignment(String paramString)
  {
    paramString.getClass();
    paramString.hashCode();
    int i = -1;
    switch (paramString.hashCode())
    {
    default: 
      break;
    case 109757538: 
      if (paramString.equals("start")) {
        i = 5;
      }
      break;
    case 108511772: 
      if (paramString.equals("right")) {
        i = 4;
      }
      break;
    case 3317767: 
      if (paramString.equals("left")) {
        i = 3;
      }
      break;
    case 100571: 
      if (paramString.equals("end")) {
        i = 2;
      }
      break;
    case -1074341483: 
      if (paramString.equals("middle")) {
        i = 1;
      }
      break;
    case -1364013995: 
      if (paramString.equals("center")) {
        i = 0;
      }
      break;
    }
    switch (i)
    {
    default: 
      z2.y("Invalid alignment value: ", paramString, "WebvttCueParser");
      return null;
    case 3: 
    case 5: 
      return Layout.Alignment.ALIGN_NORMAL;
    case 2: 
    case 4: 
      return Layout.Alignment.ALIGN_OPPOSITE;
    }
    return Layout.Alignment.ALIGN_CENTER;
  }
  
  public boolean parseCue(ParsableByteArray paramParsableByteArray, WebvttCue.Builder paramBuilder, List<WebvttCssStyle> paramList)
  {
    String str = paramParsableByteArray.readLine();
    if (str == null) {
      return false;
    }
    Object localObject1 = CUE_HEADER_PATTERN;
    Object localObject2 = ((Pattern)localObject1).matcher(str);
    if (((Matcher)localObject2).matches()) {
      return parseCue(null, (Matcher)localObject2, paramParsableByteArray, paramBuilder, textBuilder, paramList);
    }
    localObject2 = paramParsableByteArray.readLine();
    if (localObject2 == null) {
      return false;
    }
    localObject1 = ((Pattern)localObject1).matcher((CharSequence)localObject2);
    if (((Matcher)localObject1).matches()) {
      return parseCue(str.trim(), (Matcher)localObject1, paramParsableByteArray, paramBuilder, textBuilder, paramList);
    }
    return false;
  }
  
  public static final class StartTag
  {
    private static final String[] NO_CLASSES = new String[0];
    public final String[] classes;
    public final String name;
    public final int position;
    public final String voice;
    
    private StartTag(String paramString1, int paramInt, String paramString2, String[] paramArrayOfString)
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
  
  public static final class StyleMatch
    implements Comparable<StyleMatch>
  {
    public final int score;
    public final WebvttCssStyle style;
    
    public StyleMatch(int paramInt, WebvttCssStyle paramWebvttCssStyle)
    {
      score = paramInt;
      style = paramWebvttCssStyle;
    }
    
    public int compareTo(@NonNull StyleMatch paramStyleMatch)
    {
      return score - score;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.webvtt.WebvttCueParser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */