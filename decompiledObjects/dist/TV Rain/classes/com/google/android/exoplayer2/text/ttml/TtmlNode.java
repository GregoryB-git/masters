package com.google.android.exoplayer2.text.ttml;

import android.text.SpannableStringBuilder;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.Assertions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

final class TtmlNode
{
  public static final String ANONYMOUS_REGION_ID = "";
  public static final String ATTR_ID = "id";
  public static final String ATTR_TTS_BACKGROUND_COLOR = "backgroundColor";
  public static final String ATTR_TTS_COLOR = "color";
  public static final String ATTR_TTS_DISPLAY_ALIGN = "displayAlign";
  public static final String ATTR_TTS_EXTENT = "extent";
  public static final String ATTR_TTS_FONT_FAMILY = "fontFamily";
  public static final String ATTR_TTS_FONT_SIZE = "fontSize";
  public static final String ATTR_TTS_FONT_STYLE = "fontStyle";
  public static final String ATTR_TTS_FONT_WEIGHT = "fontWeight";
  public static final String ATTR_TTS_ORIGIN = "origin";
  public static final String ATTR_TTS_TEXT_ALIGN = "textAlign";
  public static final String ATTR_TTS_TEXT_DECORATION = "textDecoration";
  public static final String BOLD = "bold";
  public static final String CENTER = "center";
  public static final String END = "end";
  public static final String ITALIC = "italic";
  public static final String LEFT = "left";
  public static final String LINETHROUGH = "linethrough";
  public static final String NO_LINETHROUGH = "nolinethrough";
  public static final String NO_UNDERLINE = "nounderline";
  public static final String RIGHT = "right";
  public static final String START = "start";
  public static final String TAG_BODY = "body";
  public static final String TAG_BR = "br";
  public static final String TAG_DIV = "div";
  public static final String TAG_HEAD = "head";
  public static final String TAG_LAYOUT = "layout";
  public static final String TAG_METADATA = "metadata";
  public static final String TAG_P = "p";
  public static final String TAG_REGION = "region";
  public static final String TAG_SMPTE_DATA = "smpte:data";
  public static final String TAG_SMPTE_IMAGE = "smpte:image";
  public static final String TAG_SMPTE_INFORMATION = "smpte:information";
  public static final String TAG_SPAN = "span";
  public static final String TAG_STYLE = "style";
  public static final String TAG_STYLING = "styling";
  public static final String TAG_TT = "tt";
  public static final String UNDERLINE = "underline";
  private List<TtmlNode> children;
  public final long endTimeUs;
  public final boolean isTextNode;
  private final HashMap<String, Integer> nodeEndsByRegion;
  private final HashMap<String, Integer> nodeStartsByRegion;
  public final String regionId;
  public final long startTimeUs;
  public final TtmlStyle style;
  private final String[] styleIds;
  public final String tag;
  public final String text;
  
  private TtmlNode(String paramString1, String paramString2, long paramLong1, long paramLong2, TtmlStyle paramTtmlStyle, String[] paramArrayOfString, String paramString3)
  {
    tag = paramString1;
    text = paramString2;
    style = paramTtmlStyle;
    styleIds = paramArrayOfString;
    boolean bool;
    if (paramString2 != null) {
      bool = true;
    } else {
      bool = false;
    }
    isTextNode = bool;
    startTimeUs = paramLong1;
    endTimeUs = paramLong2;
    regionId = ((String)Assertions.checkNotNull(paramString3));
    nodeStartsByRegion = new HashMap();
    nodeEndsByRegion = new HashMap();
  }
  
  private void applyStyleToOutput(Map<String, TtmlStyle> paramMap, SpannableStringBuilder paramSpannableStringBuilder, int paramInt1, int paramInt2)
  {
    paramMap = TtmlRenderUtil.resolveStyle(style, styleIds, paramMap);
    if (paramMap != null) {
      TtmlRenderUtil.applyStylesToSpan(paramSpannableStringBuilder, paramInt1, paramInt2, paramMap);
    }
  }
  
  public static TtmlNode buildNode(String paramString1, long paramLong1, long paramLong2, TtmlStyle paramTtmlStyle, String[] paramArrayOfString, String paramString2)
  {
    return new TtmlNode(paramString1, null, paramLong1, paramLong2, paramTtmlStyle, paramArrayOfString, paramString2);
  }
  
  public static TtmlNode buildTextNode(String paramString)
  {
    return new TtmlNode(null, TtmlRenderUtil.applyTextElementSpacePolicy(paramString), -9223372036854775807L, -9223372036854775807L, null, null, "");
  }
  
  private SpannableStringBuilder cleanUpText(SpannableStringBuilder paramSpannableStringBuilder)
  {
    int i = paramSpannableStringBuilder.length();
    int j = 0;
    int k = 0;
    int n;
    while (k < i)
    {
      m = i;
      if (paramSpannableStringBuilder.charAt(k) == ' ')
      {
        n = k + 1;
        for (m = n; (m < paramSpannableStringBuilder.length()) && (paramSpannableStringBuilder.charAt(m) == ' '); m++) {}
        n = m - n;
        m = i;
        if (n > 0)
        {
          paramSpannableStringBuilder.delete(k, k + n);
          m = i - n;
        }
      }
      k++;
      i = m;
    }
    k = i;
    if (i > 0)
    {
      k = i;
      if (paramSpannableStringBuilder.charAt(0) == ' ')
      {
        paramSpannableStringBuilder.delete(0, 1);
        k = i - 1;
      }
    }
    i = 0;
    for (;;)
    {
      n = k - 1;
      if (i >= n) {
        break;
      }
      m = k;
      if (paramSpannableStringBuilder.charAt(i) == '\n')
      {
        n = i + 1;
        m = k;
        if (paramSpannableStringBuilder.charAt(n) == ' ')
        {
          paramSpannableStringBuilder.delete(n, i + 2);
          m = k - 1;
        }
      }
      i++;
      k = m;
    }
    i = k;
    int m = j;
    if (k > 0)
    {
      i = k;
      m = j;
      if (paramSpannableStringBuilder.charAt(n) == ' ')
      {
        paramSpannableStringBuilder.delete(n, k);
        i = k - 1;
        m = j;
      }
    }
    for (;;)
    {
      k = i - 1;
      if (m >= k) {
        break;
      }
      k = i;
      if (paramSpannableStringBuilder.charAt(m) == ' ')
      {
        j = m + 1;
        k = i;
        if (paramSpannableStringBuilder.charAt(j) == '\n')
        {
          paramSpannableStringBuilder.delete(m, j);
          k = i - 1;
        }
      }
      m++;
      i = k;
    }
    if ((i > 0) && (paramSpannableStringBuilder.charAt(k) == '\n')) {
      paramSpannableStringBuilder.delete(k, i);
    }
    return paramSpannableStringBuilder;
  }
  
  private void getEventTimes(TreeSet<Long> paramTreeSet, boolean paramBoolean)
  {
    boolean bool1 = "p".equals(tag);
    if ((paramBoolean) || (bool1))
    {
      long l = startTimeUs;
      if (l != -9223372036854775807L) {
        paramTreeSet.add(Long.valueOf(l));
      }
      l = endTimeUs;
      if (l != -9223372036854775807L) {
        paramTreeSet.add(Long.valueOf(l));
      }
    }
    if (children == null) {
      return;
    }
    for (int i = 0; i < children.size(); i++)
    {
      TtmlNode localTtmlNode = (TtmlNode)children.get(i);
      boolean bool2;
      if ((!paramBoolean) && (!bool1)) {
        bool2 = false;
      } else {
        bool2 = true;
      }
      localTtmlNode.getEventTimes(paramTreeSet, bool2);
    }
  }
  
  private static SpannableStringBuilder getRegionOutput(String paramString, Map<String, SpannableStringBuilder> paramMap)
  {
    if (!paramMap.containsKey(paramString)) {
      paramMap.put(paramString, new SpannableStringBuilder());
    }
    return (SpannableStringBuilder)paramMap.get(paramString);
  }
  
  private void traverseForStyle(long paramLong, Map<String, TtmlStyle> paramMap, Map<String, SpannableStringBuilder> paramMap1)
  {
    if (!isActive(paramLong)) {
      return;
    }
    Iterator localIterator = nodeEndsByRegion.entrySet().iterator();
    int i;
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      i = 0;
      int j = 0;
      if (!bool) {
        break;
      }
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str = (String)localEntry.getKey();
      i = j;
      if (nodeStartsByRegion.containsKey(str)) {
        i = ((Integer)nodeStartsByRegion.get(str)).intValue();
      }
      j = ((Integer)localEntry.getValue()).intValue();
      if (i != j) {
        applyStyleToOutput(paramMap, (SpannableStringBuilder)paramMap1.get(str), i, j);
      }
    }
    while (i < getChildCount())
    {
      getChild(i).traverseForStyle(paramLong, paramMap, paramMap1);
      i++;
    }
  }
  
  private void traverseForText(long paramLong, boolean paramBoolean, String paramString, Map<String, SpannableStringBuilder> paramMap)
  {
    nodeStartsByRegion.clear();
    nodeEndsByRegion.clear();
    if ("metadata".equals(tag)) {
      return;
    }
    if (!"".equals(regionId)) {
      paramString = regionId;
    }
    if ((isTextNode) && (paramBoolean))
    {
      getRegionOutput(paramString, paramMap).append(text);
    }
    else if (("br".equals(tag)) && (paramBoolean))
    {
      getRegionOutput(paramString, paramMap).append('\n');
    }
    else if (isActive(paramLong))
    {
      Object localObject = paramMap.entrySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
        nodeStartsByRegion.put(localEntry.getKey(), Integer.valueOf(((SpannableStringBuilder)localEntry.getValue()).length()));
      }
      boolean bool1 = "p".equals(tag);
      for (int i = 0; i < getChildCount(); i++)
      {
        localObject = getChild(i);
        boolean bool2;
        if ((!paramBoolean) && (!bool1)) {
          bool2 = false;
        } else {
          bool2 = true;
        }
        ((TtmlNode)localObject).traverseForText(paramLong, bool2, paramString, paramMap);
      }
      if (bool1) {
        TtmlRenderUtil.endParagraph(getRegionOutput(paramString, paramMap));
      }
      paramString = paramMap.entrySet().iterator();
      while (paramString.hasNext())
      {
        paramMap = (Map.Entry)paramString.next();
        nodeEndsByRegion.put(paramMap.getKey(), Integer.valueOf(((SpannableStringBuilder)paramMap.getValue()).length()));
      }
    }
  }
  
  public void addChild(TtmlNode paramTtmlNode)
  {
    if (children == null) {
      children = new ArrayList();
    }
    children.add(paramTtmlNode);
  }
  
  public TtmlNode getChild(int paramInt)
  {
    List localList = children;
    if (localList != null) {
      return (TtmlNode)localList.get(paramInt);
    }
    throw new IndexOutOfBoundsException();
  }
  
  public int getChildCount()
  {
    List localList = children;
    int i;
    if (localList == null) {
      i = 0;
    } else {
      i = localList.size();
    }
    return i;
  }
  
  public List<Cue> getCues(long paramLong, Map<String, TtmlStyle> paramMap, Map<String, TtmlRegion> paramMap1)
  {
    Object localObject = new TreeMap();
    traverseForText(paramLong, false, regionId, (Map)localObject);
    traverseForStyle(paramLong, paramMap, (Map)localObject);
    paramMap = new ArrayList();
    localObject = ((TreeMap)localObject).entrySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
      TtmlRegion localTtmlRegion = (TtmlRegion)paramMap1.get(localEntry.getKey());
      paramMap.add(new Cue(cleanUpText((SpannableStringBuilder)localEntry.getValue()), null, line, lineType, lineAnchor, position, Integer.MIN_VALUE, width, textSizeType, textSize));
    }
    return paramMap;
  }
  
  public long[] getEventTimesUs()
  {
    Object localObject = new TreeSet();
    int i = 0;
    getEventTimes((TreeSet)localObject, false);
    long[] arrayOfLong = new long[((TreeSet)localObject).size()];
    localObject = ((TreeSet)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      arrayOfLong[i] = ((Long)((Iterator)localObject).next()).longValue();
      i++;
    }
    return arrayOfLong;
  }
  
  public String[] getStyleIds()
  {
    return styleIds;
  }
  
  public boolean isActive(long paramLong)
  {
    long l = startTimeUs;
    boolean bool;
    if (((l == -9223372036854775807L) && (endTimeUs == -9223372036854775807L)) || ((l <= paramLong) && (endTimeUs == -9223372036854775807L)) || ((l == -9223372036854775807L) && (paramLong < endTimeUs)) || ((l <= paramLong) && (paramLong < endTimeUs))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.ttml.TtmlNode
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */