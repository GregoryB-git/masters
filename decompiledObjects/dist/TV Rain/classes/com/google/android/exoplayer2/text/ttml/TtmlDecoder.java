package com.google.android.exoplayer2.text.ttml;

import android.text.Layout.Alignment;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.ColorParser;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.XmlPullParserUtil;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import z2;

public final class TtmlDecoder
  extends SimpleSubtitleDecoder
{
  private static final String ATTR_BEGIN = "begin";
  private static final String ATTR_DURATION = "dur";
  private static final String ATTR_END = "end";
  private static final String ATTR_REGION = "region";
  private static final String ATTR_STYLE = "style";
  private static final Pattern CELL_RESOLUTION;
  private static final Pattern CLOCK_TIME = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
  private static final CellResolution DEFAULT_CELL_RESOLUTION = new CellResolution(32, 15);
  private static final FrameAndTickRate DEFAULT_FRAME_AND_TICK_RATE;
  private static final int DEFAULT_FRAME_RATE = 30;
  private static final Pattern FONT_SIZE;
  private static final Pattern OFFSET_TIME = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
  private static final Pattern PERCENTAGE_COORDINATES;
  private static final String TAG = "TtmlDecoder";
  private static final String TTP = "http://www.w3.org/ns/ttml#parameter";
  private final XmlPullParserFactory xmlParserFactory;
  
  static
  {
    FONT_SIZE = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    PERCENTAGE_COORDINATES = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    CELL_RESOLUTION = Pattern.compile("^(\\d+) (\\d+)$");
    DEFAULT_FRAME_AND_TICK_RATE = new FrameAndTickRate(30.0F, 1, 1);
  }
  
  public TtmlDecoder()
  {
    super("TtmlDecoder");
    try
    {
      XmlPullParserFactory localXmlPullParserFactory = XmlPullParserFactory.newInstance();
      xmlParserFactory = localXmlPullParserFactory;
      localXmlPullParserFactory.setNamespaceAware(true);
      return;
    }
    catch (XmlPullParserException localXmlPullParserException)
    {
      throw new RuntimeException("Couldn't create XmlPullParserFactory instance", localXmlPullParserException);
    }
  }
  
  private TtmlStyle createIfNull(TtmlStyle paramTtmlStyle)
  {
    TtmlStyle localTtmlStyle = paramTtmlStyle;
    if (paramTtmlStyle == null) {
      localTtmlStyle = new TtmlStyle();
    }
    return localTtmlStyle;
  }
  
  private static boolean isSupportedTag(String paramString)
  {
    boolean bool;
    if ((!paramString.equals("tt")) && (!paramString.equals("head")) && (!paramString.equals("body")) && (!paramString.equals("div")) && (!paramString.equals("p")) && (!paramString.equals("span")) && (!paramString.equals("br")) && (!paramString.equals("style")) && (!paramString.equals("styling")) && (!paramString.equals("layout")) && (!paramString.equals("region")) && (!paramString.equals("metadata")) && (!paramString.equals("smpte:image")) && (!paramString.equals("smpte:data")) && (!paramString.equals("smpte:information"))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private CellResolution parseCellResolution(XmlPullParser paramXmlPullParser, CellResolution paramCellResolution)
    throws SubtitleDecoderException
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
    if (paramXmlPullParser == null) {
      return paramCellResolution;
    }
    Object localObject = CELL_RESOLUTION.matcher(paramXmlPullParser);
    if (!((Matcher)localObject).matches())
    {
      z2.y("Ignoring malformed cell resolution: ", paramXmlPullParser, "TtmlDecoder");
      return paramCellResolution;
    }
    try
    {
      int i = Integer.parseInt(((Matcher)localObject).group(1));
      int j = Integer.parseInt(((Matcher)localObject).group(2));
      if ((i != 0) && (j != 0)) {
        return new CellResolution(i, j);
      }
      SubtitleDecoderException localSubtitleDecoderException = new com/google/android/exoplayer2/text/SubtitleDecoderException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("Invalid cell resolution ");
      ((StringBuilder)localObject).append(i);
      ((StringBuilder)localObject).append(" ");
      ((StringBuilder)localObject).append(j);
      localSubtitleDecoderException.<init>(((StringBuilder)localObject).toString());
      throw localSubtitleDecoderException;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      z2.y("Ignoring malformed cell resolution: ", paramXmlPullParser, "TtmlDecoder");
    }
    return paramCellResolution;
  }
  
  private static void parseFontSize(String paramString, TtmlStyle paramTtmlStyle)
    throws SubtitleDecoderException
  {
    Object localObject = Util.split(paramString, "\\s+");
    if (localObject.length == 1)
    {
      localObject = FONT_SIZE.matcher(paramString);
    }
    else
    {
      if (localObject.length != 2) {
        break label266;
      }
      localObject = FONT_SIZE.matcher(localObject[1]);
      Log.w("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
    }
    if (((Matcher)localObject).matches())
    {
      paramString = ((Matcher)localObject).group(3);
      paramString.getClass();
      paramString.hashCode();
      int i = -1;
      switch (paramString.hashCode())
      {
      default: 
        break;
      case 3592: 
        if (paramString.equals("px")) {
          i = 2;
        }
        break;
      case 3240: 
        if (paramString.equals("em")) {
          i = 1;
        }
        break;
      case 37: 
        if (paramString.equals("%")) {
          i = 0;
        }
        break;
      }
      switch (i)
      {
      default: 
        throw new SubtitleDecoderException(z2.p("Invalid unit for fontSize: '", paramString, "'."));
      case 2: 
        paramTtmlStyle.setFontSizeUnit(1);
        break;
      case 1: 
        paramTtmlStyle.setFontSizeUnit(2);
        break;
      case 0: 
        paramTtmlStyle.setFontSizeUnit(3);
      }
      paramTtmlStyle.setFontSize(Float.valueOf(((Matcher)localObject).group(1)).floatValue());
      return;
    }
    throw new SubtitleDecoderException(z2.p("Invalid expression for fontSize: '", paramString, "'."));
    label266:
    throw new SubtitleDecoderException(z2.q(z2.t("Invalid number of entries for fontSize: "), localObject.length, "."));
  }
  
  private FrameAndTickRate parseFrameAndTickRates(XmlPullParser paramXmlPullParser)
    throws SubtitleDecoderException
  {
    Object localObject = paramXmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
    int i;
    if (localObject != null) {
      i = Integer.parseInt((String)localObject);
    } else {
      i = 30;
    }
    float f = 1.0F;
    localObject = paramXmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
    if (localObject != null)
    {
      localObject = Util.split((String)localObject, " ");
      if (localObject.length == 2) {
        f = Integer.parseInt(localObject[0]) / Integer.parseInt(localObject[1]);
      } else {
        throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
      }
    }
    FrameAndTickRate localFrameAndTickRate = DEFAULT_FRAME_AND_TICK_RATE;
    int j = subFrameRate;
    localObject = paramXmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
    if (localObject != null) {
      j = Integer.parseInt((String)localObject);
    }
    int k = tickRate;
    paramXmlPullParser = paramXmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
    if (paramXmlPullParser != null) {
      k = Integer.parseInt(paramXmlPullParser);
    }
    return new FrameAndTickRate(i * f, j, k);
  }
  
  private Map<String, TtmlStyle> parseHeader(XmlPullParser paramXmlPullParser, Map<String, TtmlStyle> paramMap, Map<String, TtmlRegion> paramMap1, CellResolution paramCellResolution)
    throws IOException, XmlPullParserException
  {
    do
    {
      paramXmlPullParser.next();
      Object localObject2;
      if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "style"))
      {
        Object localObject1 = XmlPullParserUtil.getAttributeValue(paramXmlPullParser, "style");
        localObject2 = parseStyleAttributes(paramXmlPullParser, new TtmlStyle());
        if (localObject1 != null)
        {
          localObject1 = parseStyleIds((String)localObject1);
          int i = localObject1.length;
          for (int j = 0; j < i; j++) {
            ((TtmlStyle)localObject2).chain((TtmlStyle)paramMap.get(localObject1[j]));
          }
        }
        if (((TtmlStyle)localObject2).getId() != null) {
          paramMap.put(((TtmlStyle)localObject2).getId(), localObject2);
        }
      }
      else if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "region"))
      {
        localObject2 = parseRegionAttributes(paramXmlPullParser, paramCellResolution);
        if (localObject2 != null) {
          paramMap1.put(id, localObject2);
        }
      }
    } while (!XmlPullParserUtil.isEndTag(paramXmlPullParser, "head"));
    return paramMap;
  }
  
  private TtmlNode parseNode(XmlPullParser paramXmlPullParser, TtmlNode paramTtmlNode, Map<String, TtmlRegion> paramMap, FrameAndTickRate paramFrameAndTickRate)
    throws SubtitleDecoderException
  {
    int i = paramXmlPullParser.getAttributeCount();
    TtmlStyle localTtmlStyle = parseStyleAttributes(paramXmlPullParser, null);
    Object localObject1 = null;
    Object localObject2 = "";
    int j = 0;
    long l1 = -9223372036854775807L;
    long l2 = -9223372036854775807L;
    long l4;
    long l5;
    long l6;
    for (long l3 = -9223372036854775807L; j < i; l3 = l6)
    {
      Object localObject3 = paramXmlPullParser.getAttributeName(j);
      String str = paramXmlPullParser.getAttributeValue(j);
      localObject3.getClass();
      switch (((String)localObject3).hashCode())
      {
      }
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                k = -1;
                break;
              } while (!((String)localObject3).equals("style"));
              k = 4;
              break;
            } while (!((String)localObject3).equals("begin"));
            k = 3;
            break;
          } while (!((String)localObject3).equals("end"));
          k = 2;
          break;
        } while (!((String)localObject3).equals("dur"));
        k = 1;
        break;
      } while (!((String)localObject3).equals("region"));
      int k = 0;
      switch (k)
      {
      default: 
        l4 = l1;
        l5 = l2;
        l6 = l3;
        break;
      case 4: 
        localObject3 = parseStyleIds(str);
        l4 = l1;
        l5 = l2;
        l6 = l3;
        if (localObject3.length > 0)
        {
          localObject1 = localObject3;
          l4 = l1;
          l5 = l2;
          l6 = l3;
        }
        break;
      case 3: 
        l4 = parseTimeExpression(str, paramFrameAndTickRate);
        l6 = l3;
        l5 = l2;
      case 2: 
      case 1: 
        for (;;)
        {
          localObject3 = localObject1;
          break;
          l5 = parseTimeExpression(str, paramFrameAndTickRate);
          l4 = l1;
          l6 = l3;
          continue;
          l6 = parseTimeExpression(str, paramFrameAndTickRate);
          l4 = l1;
          l5 = l2;
        }
      }
      l4 = l1;
      localObject3 = localObject1;
      l5 = l2;
      l6 = l3;
      if (paramMap.containsKey(str))
      {
        localObject2 = str;
        l6 = l3;
        l5 = l2;
        localObject3 = localObject1;
        l4 = l1;
      }
      j++;
      l1 = l4;
      localObject1 = localObject3;
      l2 = l5;
    }
    if (paramTtmlNode != null)
    {
      long l7 = startTimeUs;
      l4 = l1;
      l5 = l2;
      if (l7 != -9223372036854775807L)
      {
        l6 = l1;
        if (l1 != -9223372036854775807L) {
          l6 = l1 + l7;
        }
        l4 = l6;
        l5 = l2;
        if (l2 != -9223372036854775807L)
        {
          l5 = l2 + l7;
          l4 = l6;
        }
      }
    }
    else
    {
      l5 = l2;
      l4 = l1;
    }
    if (l5 == -9223372036854775807L) {
      if (l3 != -9223372036854775807L)
      {
        l1 = l4 + l3;
      }
      else if (paramTtmlNode != null)
      {
        l1 = endTimeUs;
        if (l1 != -9223372036854775807L) {
          break label601;
        }
      }
    }
    l1 = l5;
    label601:
    return TtmlNode.buildNode(paramXmlPullParser.getName(), l4, l1, localTtmlStyle, (String[])localObject1, (String)localObject2);
  }
  
  private TtmlRegion parseRegionAttributes(XmlPullParser paramXmlPullParser, CellResolution paramCellResolution)
  {
    String str1 = XmlPullParserUtil.getAttributeValue(paramXmlPullParser, "id");
    if (str1 == null) {
      return null;
    }
    String str2 = XmlPullParserUtil.getAttributeValue(paramXmlPullParser, "origin");
    if (str2 != null)
    {
      Object localObject1 = PERCENTAGE_COORDINATES;
      Object localObject2 = ((Pattern)localObject1).matcher(str2);
      if (((Matcher)localObject2).matches())
      {
        int i = 1;
        try
        {
          float f1 = Float.parseFloat(((Matcher)localObject2).group(1)) / 100.0F;
          float f2 = Float.parseFloat(((Matcher)localObject2).group(2));
          f2 /= 100.0F;
          localObject2 = XmlPullParserUtil.getAttributeValue(paramXmlPullParser, "extent");
          if (localObject2 != null)
          {
            localObject1 = ((Pattern)localObject1).matcher((CharSequence)localObject2);
            if (((Matcher)localObject1).matches()) {
              try
              {
                float f3 = Float.parseFloat(((Matcher)localObject1).group(1)) / 100.0F;
                float f4 = Float.parseFloat(((Matcher)localObject1).group(2));
                f4 /= 100.0F;
                paramXmlPullParser = XmlPullParserUtil.getAttributeValue(paramXmlPullParser, "displayAlign");
                if (paramXmlPullParser != null)
                {
                  paramXmlPullParser = Util.toLowerInvariant(paramXmlPullParser);
                  paramXmlPullParser.getClass();
                  if (!paramXmlPullParser.equals("center"))
                  {
                    if (paramXmlPullParser.equals("after"))
                    {
                      f2 += f4;
                      i = 2;
                      break label225;
                    }
                  }
                  else
                  {
                    f2 = f4 / 2.0F + f2;
                    break label225;
                  }
                }
                i = 0;
                label225:
                return new TtmlRegion(str1, f1, f2, 0, i, f3, 1, 1.0F / rows);
              }
              catch (NumberFormatException paramXmlPullParser)
              {
                z2.y("Ignoring region with malformed extent: ", str2, "TtmlDecoder");
                return null;
              }
            }
            z2.y("Ignoring region with unsupported extent: ", str2, "TtmlDecoder");
            return null;
          }
          Log.w("TtmlDecoder", "Ignoring region without an extent");
          return null;
        }
        catch (NumberFormatException paramXmlPullParser)
        {
          z2.y("Ignoring region with malformed origin: ", str2, "TtmlDecoder");
          return null;
        }
      }
      z2.y("Ignoring region with unsupported origin: ", str2, "TtmlDecoder");
      return null;
    }
    Log.w("TtmlDecoder", "Ignoring region without an origin");
    return null;
  }
  
  private TtmlStyle parseStyleAttributes(XmlPullParser paramXmlPullParser, TtmlStyle paramTtmlStyle)
  {
    int i = paramXmlPullParser.getAttributeCount();
    int j = 0;
    label310:
    TtmlStyle localTtmlStyle3;
    for (TtmlStyle localTtmlStyle1 = paramTtmlStyle; j < i; localTtmlStyle3 = paramTtmlStyle)
    {
      String str = paramXmlPullParser.getAttributeValue(j);
      paramTtmlStyle = paramXmlPullParser.getAttributeName(j);
      paramTtmlStyle.getClass();
      int k = paramTtmlStyle.hashCode();
      int m = 4;
      switch (k)
      {
      default: 
        break;
      case 1287124693: 
        if (paramTtmlStyle.equals("backgroundColor")) {
          m = 8;
        }
        break;
      case 365601008: 
        if (paramTtmlStyle.equals("fontSize")) {
          m = 7;
        }
        break;
      case 94842723: 
        if (paramTtmlStyle.equals("color")) {
          m = 6;
        }
        break;
      case 3355: 
        if (paramTtmlStyle.equals("id")) {
          m = 5;
        }
        break;
      case -734428249: 
        if (paramTtmlStyle.equals("fontWeight")) {
          break label310;
        }
      case -879295043: 
        if ((goto 307) && (paramTtmlStyle.equals("textDecoration"))) {
          m = 3;
        }
        break;
      case -1065511464: 
        if (paramTtmlStyle.equals("textAlign")) {
          m = 2;
        }
        break;
      case -1224696685: 
        if (paramTtmlStyle.equals("fontFamily")) {
          m = 1;
        }
        break;
      case -1550943582: 
        if (paramTtmlStyle.equals("fontStyle")) {
          m = 0;
        }
        break;
      }
      m = -1;
      switch (m)
      {
      default: 
        paramTtmlStyle = localTtmlStyle1;
        break;
      case 8: 
        paramTtmlStyle = createIfNull(localTtmlStyle1);
        try
        {
          paramTtmlStyle.setBackgroundColor(ColorParser.parseTtmlColor(str));
        }
        catch (IllegalArgumentException localIllegalArgumentException1)
        {
          z2.y("Failed parsing background value: ", str, "TtmlDecoder");
        }
      case 7: 
        paramTtmlStyle = localIllegalArgumentException1;
        try
        {
          TtmlStyle localTtmlStyle2 = createIfNull(localIllegalArgumentException1);
          paramTtmlStyle = localTtmlStyle2;
          parseFontSize(str, localTtmlStyle2);
          paramTtmlStyle = localTtmlStyle2;
        }
        catch (SubtitleDecoderException localSubtitleDecoderException)
        {
          z2.y("Failed parsing fontSize value: ", str, "TtmlDecoder");
        }
      case 6: 
        paramTtmlStyle = createIfNull(localSubtitleDecoderException);
        try
        {
          paramTtmlStyle.setFontColor(ColorParser.parseTtmlColor(str));
        }
        catch (IllegalArgumentException localIllegalArgumentException2)
        {
          z2.y("Failed parsing color value: ", str, "TtmlDecoder");
        }
      case 5: 
        paramTtmlStyle = localIllegalArgumentException2;
        if ("style".equals(paramXmlPullParser.getName())) {
          paramTtmlStyle = createIfNull(localIllegalArgumentException2).setId(str);
        }
        break;
      case 4: 
        paramTtmlStyle = createIfNull(localIllegalArgumentException2).setBold("bold".equalsIgnoreCase(str));
        break;
      case 3: 
        paramTtmlStyle = Util.toLowerInvariant(str);
        paramTtmlStyle.getClass();
        paramTtmlStyle.hashCode();
        m = -1;
        switch (paramTtmlStyle.hashCode())
        {
        default: 
          break;
        case 1679736913: 
          if (paramTtmlStyle.equals("linethrough")) {
            m = 3;
          }
          break;
        case 913457136: 
          if (paramTtmlStyle.equals("nolinethrough")) {
            m = 2;
          }
          break;
        case -1026963764: 
          if (paramTtmlStyle.equals("underline")) {
            m = 1;
          }
          break;
        case -1461280213: 
          if (paramTtmlStyle.equals("nounderline")) {
            m = 0;
          }
          break;
        }
        switch (m)
        {
        default: 
          paramTtmlStyle = localIllegalArgumentException2;
          break;
        case 3: 
          paramTtmlStyle = createIfNull(localIllegalArgumentException2).setLinethrough(true);
          break;
        case 2: 
          paramTtmlStyle = createIfNull(localIllegalArgumentException2).setLinethrough(false);
          break;
        case 1: 
          paramTtmlStyle = createIfNull(localIllegalArgumentException2).setUnderline(true);
          break;
        case 0: 
          paramTtmlStyle = createIfNull(localIllegalArgumentException2).setUnderline(false);
        }
        break;
      case 2: 
        paramTtmlStyle = Util.toLowerInvariant(str);
        paramTtmlStyle.getClass();
        paramTtmlStyle.hashCode();
        m = -1;
        switch (paramTtmlStyle.hashCode())
        {
        default: 
          break;
        case 109757538: 
          if (paramTtmlStyle.equals("start")) {
            m = 4;
          }
          break;
        case 108511772: 
          if (paramTtmlStyle.equals("right")) {
            m = 3;
          }
          break;
        case 3317767: 
          if (paramTtmlStyle.equals("left")) {
            m = 2;
          }
          break;
        case 100571: 
          if (paramTtmlStyle.equals("end")) {
            m = 1;
          }
          break;
        case -1364013995: 
          if (paramTtmlStyle.equals("center")) {
            m = 0;
          }
          break;
        }
        switch (m)
        {
        default: 
          paramTtmlStyle = localIllegalArgumentException2;
          break;
        case 4: 
          paramTtmlStyle = createIfNull(localIllegalArgumentException2).setTextAlign(Layout.Alignment.ALIGN_NORMAL);
          break;
        case 3: 
          paramTtmlStyle = createIfNull(localIllegalArgumentException2).setTextAlign(Layout.Alignment.ALIGN_OPPOSITE);
          break;
        case 2: 
          paramTtmlStyle = createIfNull(localIllegalArgumentException2).setTextAlign(Layout.Alignment.ALIGN_NORMAL);
          break;
        case 1: 
          paramTtmlStyle = createIfNull(localIllegalArgumentException2).setTextAlign(Layout.Alignment.ALIGN_OPPOSITE);
          break;
        case 0: 
          paramTtmlStyle = createIfNull(localIllegalArgumentException2).setTextAlign(Layout.Alignment.ALIGN_CENTER);
        }
        break;
      case 1: 
        paramTtmlStyle = createIfNull(localIllegalArgumentException2).setFontFamily(str);
        break;
      case 0: 
        paramTtmlStyle = createIfNull(localIllegalArgumentException2).setItalic("italic".equalsIgnoreCase(str));
      }
      j++;
    }
    return localTtmlStyle3;
  }
  
  private String[] parseStyleIds(String paramString)
  {
    paramString = paramString.trim();
    if (paramString.isEmpty()) {
      paramString = new String[0];
    } else {
      paramString = Util.split(paramString, "\\s+");
    }
    return paramString;
  }
  
  private static long parseTimeExpression(String paramString, FrameAndTickRate paramFrameAndTickRate)
    throws SubtitleDecoderException
  {
    Matcher localMatcher = CLOCK_TIME.matcher(paramString);
    double d5;
    double d6;
    if (localMatcher.matches())
    {
      double d1 = Long.parseLong(localMatcher.group(1)) * 3600L;
      double d2 = Long.parseLong(localMatcher.group(2)) * 60L;
      double d3 = Long.parseLong(localMatcher.group(3));
      paramString = localMatcher.group(4);
      double d4 = 0.0D;
      if (paramString != null) {
        d5 = Double.parseDouble(paramString);
      } else {
        d5 = 0.0D;
      }
      paramString = localMatcher.group(5);
      if (paramString != null) {
        d6 = (float)Long.parseLong(paramString) / effectiveFrameRate;
      } else {
        d6 = 0.0D;
      }
      paramString = localMatcher.group(6);
      if (paramString != null) {
        d4 = Long.parseLong(paramString) / subFrameRate / effectiveFrameRate;
      }
      return ((d1 + d2 + d3 + d5 + d6 + d4) * 1000000.0D);
    }
    localMatcher = OFFSET_TIME.matcher(paramString);
    if (localMatcher.matches())
    {
      d6 = Double.parseDouble(localMatcher.group(1));
      paramString = localMatcher.group(2);
      paramString.getClass();
      paramString.hashCode();
      int i = -1;
      switch (paramString.hashCode())
      {
      default: 
        break;
      case 3494: 
        if (paramString.equals("ms")) {
          i = 4;
        }
        break;
      case 116: 
        if (paramString.equals("t")) {
          i = 3;
        }
        break;
      case 109: 
        if (paramString.equals("m")) {
          i = 2;
        }
        break;
      case 104: 
        if (paramString.equals("h")) {
          i = 1;
        }
        break;
      case 102: 
        if (paramString.equals("f")) {
          i = 0;
        }
        break;
      }
      switch (i)
      {
      default: 
        d5 = d6;
        break;
      case 4: 
        d5 = 1000.0D;
        break;
      case 3: 
        d5 = tickRate;
        break;
      case 2: 
        d5 = 60.0D;
        break;
      case 1: 
        d5 = 3600.0D;
        d5 = d6 * d5;
        break;
      }
      d5 = effectiveFrameRate;
      d5 = d6 / d5;
      return (d5 * 1000000.0D);
    }
    throw new SubtitleDecoderException(z2.o("Malformed time expression: ", paramString));
  }
  
  public TtmlSubtitle decode(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
    throws SubtitleDecoderException
  {
    try
    {
      XmlPullParser localXmlPullParser = xmlParserFactory.newPullParser();
      HashMap localHashMap1 = new java/util/HashMap;
      localHashMap1.<init>();
      HashMap localHashMap2 = new java/util/HashMap;
      localHashMap2.<init>();
      Object localObject1 = new com/google/android/exoplayer2/text/ttml/TtmlRegion;
      Object localObject2 = null;
      ((TtmlRegion)localObject1).<init>(null);
      localHashMap2.put("", localObject1);
      localObject1 = new java/io/ByteArrayInputStream;
      int i = 0;
      ((ByteArrayInputStream)localObject1).<init>(paramArrayOfByte, 0, paramInt);
      localXmlPullParser.setInput((InputStream)localObject1, null);
      ArrayDeque localArrayDeque = new java/util/ArrayDeque;
      localArrayDeque.<init>();
      int j = localXmlPullParser.getEventType();
      localObject1 = DEFAULT_FRAME_AND_TICK_RATE;
      byte[] arrayOfByte;
      for (paramArrayOfByte = DEFAULT_CELL_RESOLUTION; j != 1; paramArrayOfByte = arrayOfByte)
      {
        TtmlNode localTtmlNode1 = (TtmlNode)localArrayDeque.peek();
        if (i == 0)
        {
          Object localObject3 = localXmlPullParser.getName();
          if (j == 2)
          {
            if ("tt".equals(localObject3))
            {
              localObject1 = parseFrameAndTickRates(localXmlPullParser);
              paramArrayOfByte = parseCellResolution(localXmlPullParser, DEFAULT_CELL_RESOLUTION);
            }
            paramBoolean = isSupportedTag((String)localObject3);
            if (!paramBoolean)
            {
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              ((StringBuilder)localObject3).append("Ignoring unsupported tag: ");
              ((StringBuilder)localObject3).append(localXmlPullParser.getName());
              Log.i("TtmlDecoder", ((StringBuilder)localObject3).toString());
            }
            else
            {
              if ("head".equals(localObject3))
              {
                parseHeader(localXmlPullParser, localHashMap1, localHashMap2, paramArrayOfByte);
                localObject3 = localObject1;
                paramInt = i;
                localObject5 = localObject2;
                arrayOfByte = paramArrayOfByte;
                break label524;
              }
              try
              {
                TtmlNode localTtmlNode2 = parseNode(localXmlPullParser, localTtmlNode1, localHashMap2, (FrameAndTickRate)localObject1);
                localArrayDeque.push(localTtmlNode2);
                localObject3 = localObject1;
                paramInt = i;
                localObject5 = localObject2;
                arrayOfByte = paramArrayOfByte;
                if (localTtmlNode1 == null) {
                  break label524;
                }
                localTtmlNode1.addChild(localTtmlNode2);
                localObject3 = localObject1;
                paramInt = i;
                localObject5 = localObject2;
                arrayOfByte = paramArrayOfByte;
              }
              catch (SubtitleDecoderException localSubtitleDecoderException)
              {
                Log.w("TtmlDecoder", "Suppressing parser error", localSubtitleDecoderException);
                break label469;
              }
            }
          }
          else
          {
            if (j == 4)
            {
              localTtmlNode1.addChild(TtmlNode.buildTextNode(localXmlPullParser.getText()));
              localObject4 = localObject1;
              paramInt = i;
              localObject5 = localObject2;
              arrayOfByte = paramArrayOfByte;
              break label524;
            }
            localObject4 = localObject1;
            paramInt = i;
            localObject5 = localObject2;
            arrayOfByte = paramArrayOfByte;
            if (j != 3) {
              break label524;
            }
            if (localXmlPullParser.getName().equals("tt"))
            {
              localObject2 = new com/google/android/exoplayer2/text/ttml/TtmlSubtitle;
              ((TtmlSubtitle)localObject2).<init>((TtmlNode)localArrayDeque.peek(), localHashMap1, localHashMap2);
            }
            localArrayDeque.pop();
            localObject4 = localObject1;
            paramInt = i;
            localObject5 = localObject2;
            arrayOfByte = paramArrayOfByte;
            break label524;
          }
        }
        else
        {
          if (j != 2) {
            break label488;
          }
        }
        label469:
        paramInt = i + 1;
        Object localObject4 = localObject1;
        Object localObject5 = localObject2;
        arrayOfByte = paramArrayOfByte;
        break label524;
        label488:
        localObject4 = localObject1;
        paramInt = i;
        localObject5 = localObject2;
        arrayOfByte = paramArrayOfByte;
        if (j == 3)
        {
          paramInt = i - 1;
          arrayOfByte = paramArrayOfByte;
          localObject5 = localObject2;
          localObject4 = localObject1;
        }
        label524:
        localXmlPullParser.next();
        j = localXmlPullParser.getEventType();
        localObject1 = localObject4;
        i = paramInt;
        localObject2 = localObject5;
      }
      return (TtmlSubtitle)localObject2;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new IllegalStateException("Unexpected error when reading input.", paramArrayOfByte);
    }
    catch (XmlPullParserException paramArrayOfByte)
    {
      throw new SubtitleDecoderException("Unable to decode source", paramArrayOfByte);
    }
  }
  
  public static final class CellResolution
  {
    public final int columns;
    public final int rows;
    
    public CellResolution(int paramInt1, int paramInt2)
    {
      columns = paramInt1;
      rows = paramInt2;
    }
  }
  
  public static final class FrameAndTickRate
  {
    public final float effectiveFrameRate;
    public final int subFrameRate;
    public final int tickRate;
    
    public FrameAndTickRate(float paramFloat, int paramInt1, int paramInt2)
    {
      effectiveFrameRate = paramFloat;
      subFrameRate = paramInt1;
      tickRate = paramInt2;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.ttml.TtmlDecoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */