package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import z2;

class SsManifestParser$StreamIndexParser
  extends SsManifestParser.ElementParser
{
  private static final String KEY_DISPLAY_HEIGHT = "DisplayHeight";
  private static final String KEY_DISPLAY_WIDTH = "DisplayWidth";
  private static final String KEY_FRAGMENT_DURATION = "d";
  private static final String KEY_FRAGMENT_REPEAT_COUNT = "r";
  private static final String KEY_FRAGMENT_START_TIME = "t";
  private static final String KEY_LANGUAGE = "Language";
  private static final String KEY_MAX_HEIGHT = "MaxHeight";
  private static final String KEY_MAX_WIDTH = "MaxWidth";
  private static final String KEY_NAME = "Name";
  private static final String KEY_SUB_TYPE = "Subtype";
  private static final String KEY_TIME_SCALE = "TimeScale";
  private static final String KEY_TYPE = "Type";
  private static final String KEY_TYPE_AUDIO = "audio";
  private static final String KEY_TYPE_TEXT = "text";
  private static final String KEY_TYPE_VIDEO = "video";
  private static final String KEY_URL = "Url";
  public static final String TAG = "StreamIndex";
  private static final String TAG_STREAM_FRAGMENT = "c";
  private final String baseUri;
  private int displayHeight;
  private int displayWidth;
  private final List<Format> formats;
  private String language;
  private long lastChunkDuration;
  private int maxHeight;
  private int maxWidth;
  private String name;
  private ArrayList<Long> startTimes;
  private String subType;
  private long timescale;
  private int type;
  private String url;
  
  public SsManifestParser$StreamIndexParser(SsManifestParser.ElementParser paramElementParser, String paramString)
  {
    super(paramElementParser, paramString, "StreamIndex");
    baseUri = paramString;
    formats = new LinkedList();
  }
  
  private void parseStreamElementStartTag(XmlPullParser paramXmlPullParser)
    throws ParserException
  {
    int i = parseType(paramXmlPullParser);
    type = i;
    putNormalizedAttribute("Type", Integer.valueOf(i));
    if (type == 3) {
      subType = parseRequiredString(paramXmlPullParser, "Subtype");
    } else {
      subType = paramXmlPullParser.getAttributeValue(null, "Subtype");
    }
    name = paramXmlPullParser.getAttributeValue(null, "Name");
    url = parseRequiredString(paramXmlPullParser, "Url");
    maxWidth = parseInt(paramXmlPullParser, "MaxWidth", -1);
    maxHeight = parseInt(paramXmlPullParser, "MaxHeight", -1);
    displayWidth = parseInt(paramXmlPullParser, "DisplayWidth", -1);
    displayHeight = parseInt(paramXmlPullParser, "DisplayHeight", -1);
    String str = paramXmlPullParser.getAttributeValue(null, "Language");
    language = str;
    putNormalizedAttribute("Language", str);
    long l = parseInt(paramXmlPullParser, "TimeScale", -1);
    timescale = l;
    if (l == -1L) {
      timescale = ((Long)getNormalizedAttribute("TimeScale")).longValue();
    }
    startTimes = new ArrayList();
  }
  
  private void parseStreamFragmentStartTag(XmlPullParser paramXmlPullParser)
    throws ParserException
  {
    int i = startTimes.size();
    long l1 = parseLong(paramXmlPullParser, "t", -9223372036854775807L);
    int j = 1;
    long l2 = l1;
    if (l1 == -9223372036854775807L) {
      if (i == 0)
      {
        l2 = 0L;
      }
      else if (lastChunkDuration != -1L)
      {
        l2 = ((Long)startTimes.get(i - 1)).longValue();
        l2 = lastChunkDuration + l2;
      }
      else
      {
        throw new ParserException("Unable to infer start time");
      }
    }
    startTimes.add(Long.valueOf(l2));
    lastChunkDuration = parseLong(paramXmlPullParser, "d", -9223372036854775807L);
    l1 = parseLong(paramXmlPullParser, "r", 1L);
    i = j;
    if (l1 > 1L) {
      if (lastChunkDuration != -9223372036854775807L) {
        i = j;
      } else {
        throw new ParserException("Repeated chunk with unspecified duration");
      }
    }
    for (;;)
    {
      long l3 = i;
      if (l3 >= l1) {
        break;
      }
      startTimes.add(Long.valueOf(lastChunkDuration * l3 + l2));
      i++;
    }
  }
  
  private int parseType(XmlPullParser paramXmlPullParser)
    throws ParserException
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, "Type");
    if (paramXmlPullParser != null)
    {
      if ("audio".equalsIgnoreCase(paramXmlPullParser)) {
        return 1;
      }
      if ("video".equalsIgnoreCase(paramXmlPullParser)) {
        return 2;
      }
      if ("text".equalsIgnoreCase(paramXmlPullParser)) {
        return 3;
      }
      throw new ParserException(z2.p("Invalid key value[", paramXmlPullParser, "]"));
    }
    throw new SsManifestParser.MissingFieldException("Type");
  }
  
  public void addChild(Object paramObject)
  {
    if ((paramObject instanceof Format)) {
      formats.add((Format)paramObject);
    }
  }
  
  public Object build()
  {
    Format[] arrayOfFormat = new Format[formats.size()];
    formats.toArray(arrayOfFormat);
    return new SsManifest.StreamElement(baseUri, url, type, subType, timescale, name, maxWidth, maxHeight, displayWidth, displayHeight, language, arrayOfFormat, startTimes, lastChunkDuration);
  }
  
  public boolean handleChildInline(String paramString)
  {
    return "c".equals(paramString);
  }
  
  public void parseStartTag(XmlPullParser paramXmlPullParser)
    throws ParserException
  {
    if ("c".equals(paramXmlPullParser.getName())) {
      parseStreamFragmentStartTag(paramXmlPullParser);
    } else {
      parseStreamElementStartTag(paramXmlPullParser);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.StreamIndexParser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */