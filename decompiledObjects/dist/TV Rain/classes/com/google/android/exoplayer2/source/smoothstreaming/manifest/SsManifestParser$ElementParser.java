package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

abstract class SsManifestParser$ElementParser
{
  private final String baseUri;
  private final List<Pair<String, Object>> normalizedAttributes;
  private final ElementParser parent;
  private final String tag;
  
  public SsManifestParser$ElementParser(ElementParser paramElementParser, String paramString1, String paramString2)
  {
    parent = paramElementParser;
    baseUri = paramString1;
    tag = paramString2;
    normalizedAttributes = new LinkedList();
  }
  
  private ElementParser newChildParser(ElementParser paramElementParser, String paramString1, String paramString2)
  {
    if ("QualityLevel".equals(paramString1)) {
      return new SsManifestParser.QualityLevelParser(paramElementParser, paramString2);
    }
    if ("Protection".equals(paramString1)) {
      return new SsManifestParser.ProtectionParser(paramElementParser, paramString2);
    }
    if ("StreamIndex".equals(paramString1)) {
      return new SsManifestParser.StreamIndexParser(paramElementParser, paramString2);
    }
    return null;
  }
  
  public void addChild(Object paramObject) {}
  
  public abstract Object build();
  
  public final Object getNormalizedAttribute(String paramString)
  {
    for (int i = 0; i < normalizedAttributes.size(); i++)
    {
      localObject = (Pair)normalizedAttributes.get(i);
      if (((String)first).equals(paramString)) {
        return second;
      }
    }
    Object localObject = parent;
    if (localObject == null) {
      paramString = null;
    } else {
      paramString = ((ElementParser)localObject).getNormalizedAttribute(paramString);
    }
    return paramString;
  }
  
  public boolean handleChildInline(String paramString)
  {
    return false;
  }
  
  public final Object parse(XmlPullParser paramXmlPullParser)
    throws XmlPullParserException, IOException
  {
    int i = 0;
    int k;
    for (int j = 0;; j = k)
    {
      k = paramXmlPullParser.getEventType();
      if (k == 1) {
        break;
      }
      int m;
      Object localObject;
      if (k != 2)
      {
        if (k != 3)
        {
          if (k != 4)
          {
            m = i;
            k = j;
          }
          else
          {
            m = i;
            k = j;
            if (i != 0)
            {
              m = i;
              k = j;
              if (j == 0)
              {
                parseText(paramXmlPullParser);
                m = i;
                k = j;
              }
            }
          }
        }
        else
        {
          m = i;
          k = j;
          if (i != 0) {
            if (j > 0)
            {
              k = j - 1;
              m = i;
            }
            else
            {
              localObject = paramXmlPullParser.getName();
              parseEndTag(paramXmlPullParser);
              m = i;
              k = j;
              if (!handleChildInline((String)localObject)) {
                return build();
              }
            }
          }
        }
      }
      else
      {
        localObject = paramXmlPullParser.getName();
        if (tag.equals(localObject))
        {
          parseStartTag(paramXmlPullParser);
          m = 1;
          k = j;
        }
        else
        {
          m = i;
          k = j;
          if (i != 0) {
            if (j > 0)
            {
              k = j + 1;
              m = i;
            }
            else if (handleChildInline((String)localObject))
            {
              parseStartTag(paramXmlPullParser);
              m = i;
              k = j;
            }
            else
            {
              localObject = newChildParser(this, (String)localObject, baseUri);
              if (localObject == null)
              {
                k = 1;
                m = i;
              }
              else
              {
                addChild(((ElementParser)localObject).parse(paramXmlPullParser));
                k = j;
                m = i;
              }
            }
          }
        }
      }
      paramXmlPullParser.next();
      i = m;
    }
    return null;
  }
  
  public final boolean parseBoolean(XmlPullParser paramXmlPullParser, String paramString, boolean paramBoolean)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString);
    if (paramXmlPullParser != null) {
      return Boolean.parseBoolean(paramXmlPullParser);
    }
    return paramBoolean;
  }
  
  public void parseEndTag(XmlPullParser paramXmlPullParser) {}
  
  public final int parseInt(XmlPullParser paramXmlPullParser, String paramString, int paramInt)
    throws ParserException
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString);
    if (paramXmlPullParser != null) {
      try
      {
        paramInt = Integer.parseInt(paramXmlPullParser);
        return paramInt;
      }
      catch (NumberFormatException paramXmlPullParser)
      {
        throw new ParserException(paramXmlPullParser);
      }
    }
    return paramInt;
  }
  
  public final long parseLong(XmlPullParser paramXmlPullParser, String paramString, long paramLong)
    throws ParserException
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString);
    if (paramXmlPullParser != null) {
      try
      {
        paramLong = Long.parseLong(paramXmlPullParser);
        return paramLong;
      }
      catch (NumberFormatException paramXmlPullParser)
      {
        throw new ParserException(paramXmlPullParser);
      }
    }
    return paramLong;
  }
  
  public final int parseRequiredInt(XmlPullParser paramXmlPullParser, String paramString)
    throws ParserException
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString);
    if (paramXmlPullParser != null) {
      try
      {
        int i = Integer.parseInt(paramXmlPullParser);
        return i;
      }
      catch (NumberFormatException paramXmlPullParser)
      {
        throw new ParserException(paramXmlPullParser);
      }
    }
    throw new SsManifestParser.MissingFieldException(paramString);
  }
  
  public final long parseRequiredLong(XmlPullParser paramXmlPullParser, String paramString)
    throws ParserException
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString);
    if (paramXmlPullParser != null) {
      try
      {
        long l = Long.parseLong(paramXmlPullParser);
        return l;
      }
      catch (NumberFormatException paramXmlPullParser)
      {
        throw new ParserException(paramXmlPullParser);
      }
    }
    throw new SsManifestParser.MissingFieldException(paramString);
  }
  
  public final String parseRequiredString(XmlPullParser paramXmlPullParser, String paramString)
    throws SsManifestParser.MissingFieldException
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString);
    if (paramXmlPullParser != null) {
      return paramXmlPullParser;
    }
    throw new SsManifestParser.MissingFieldException(paramString);
  }
  
  public void parseStartTag(XmlPullParser paramXmlPullParser)
    throws ParserException
  {}
  
  public void parseText(XmlPullParser paramXmlPullParser) {}
  
  public final void putNormalizedAttribute(String paramString, Object paramObject)
  {
    normalizedAttributes.add(Pair.create(paramString, paramObject));
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.ElementParser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */