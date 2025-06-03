package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

class SsManifestParser$QualityLevelParser
  extends SsManifestParser.ElementParser
{
  private static final String KEY_BITRATE = "Bitrate";
  private static final String KEY_CHANNELS = "Channels";
  private static final String KEY_CODEC_PRIVATE_DATA = "CodecPrivateData";
  private static final String KEY_FOUR_CC = "FourCC";
  private static final String KEY_INDEX = "Index";
  private static final String KEY_LANGUAGE = "Language";
  private static final String KEY_MAX_HEIGHT = "MaxHeight";
  private static final String KEY_MAX_WIDTH = "MaxWidth";
  private static final String KEY_NAME = "Name";
  private static final String KEY_SAMPLING_RATE = "SamplingRate";
  private static final String KEY_TYPE = "Type";
  public static final String TAG = "QualityLevel";
  private Format format;
  
  public SsManifestParser$QualityLevelParser(SsManifestParser.ElementParser paramElementParser, String paramString)
  {
    super(paramElementParser, paramString, "QualityLevel");
  }
  
  private static List<byte[]> buildCodecSpecificData(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    if (!TextUtils.isEmpty(paramString))
    {
      byte[] arrayOfByte = Util.getBytesFromHexString(paramString);
      paramString = CodecSpecificDataUtil.splitNalUnits(arrayOfByte);
      if (paramString == null) {
        localArrayList.add(arrayOfByte);
      } else {
        Collections.addAll(localArrayList, paramString);
      }
    }
    return localArrayList;
  }
  
  private static String fourCCToMimeType(String paramString)
  {
    if ((!paramString.equalsIgnoreCase("H264")) && (!paramString.equalsIgnoreCase("X264")) && (!paramString.equalsIgnoreCase("AVC1")) && (!paramString.equalsIgnoreCase("DAVC")))
    {
      if ((!paramString.equalsIgnoreCase("AAC")) && (!paramString.equalsIgnoreCase("AACL")) && (!paramString.equalsIgnoreCase("AACH")) && (!paramString.equalsIgnoreCase("AACP")))
      {
        if ((!paramString.equalsIgnoreCase("TTML")) && (!paramString.equalsIgnoreCase("DFXP")))
        {
          if ((!paramString.equalsIgnoreCase("ac-3")) && (!paramString.equalsIgnoreCase("dac3")))
          {
            if ((!paramString.equalsIgnoreCase("ec-3")) && (!paramString.equalsIgnoreCase("dec3")))
            {
              if (paramString.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
              }
              if ((!paramString.equalsIgnoreCase("dtsh")) && (!paramString.equalsIgnoreCase("dtsl")))
              {
                if (paramString.equalsIgnoreCase("dtse")) {
                  return "audio/vnd.dts.hd;profile=lbr";
                }
                if (paramString.equalsIgnoreCase("opus")) {
                  return "audio/opus";
                }
                return null;
              }
              return "audio/vnd.dts.hd";
            }
            return "audio/eac3";
          }
          return "audio/ac3";
        }
        return "application/ttml+xml";
      }
      return "audio/mp4a-latm";
    }
    return "video/avc";
  }
  
  public Object build()
  {
    return format;
  }
  
  public void parseStartTag(XmlPullParser paramXmlPullParser)
    throws ParserException
  {
    int i = ((Integer)getNormalizedAttribute("Type")).intValue();
    String str1 = paramXmlPullParser.getAttributeValue(null, "Index");
    String str2 = (String)getNormalizedAttribute("Name");
    int j = parseRequiredInt(paramXmlPullParser, "Bitrate");
    Object localObject1 = fourCCToMimeType(parseRequiredString(paramXmlPullParser, "FourCC"));
    if (i == 2)
    {
      format = Format.createVideoContainerFormat(str1, str2, "video/mp4", (String)localObject1, null, j, parseRequiredInt(paramXmlPullParser, "MaxWidth"), parseRequiredInt(paramXmlPullParser, "MaxHeight"), -1.0F, buildCodecSpecificData(paramXmlPullParser.getAttributeValue(null, "CodecPrivateData")), 0);
    }
    else if (i == 1)
    {
      Object localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = "audio/mp4a-latm";
      }
      i = parseRequiredInt(paramXmlPullParser, "Channels");
      int k = parseRequiredInt(paramXmlPullParser, "SamplingRate");
      localObject1 = buildCodecSpecificData(paramXmlPullParser.getAttributeValue(null, "CodecPrivateData"));
      paramXmlPullParser = (XmlPullParser)localObject1;
      if (((List)localObject1).isEmpty())
      {
        paramXmlPullParser = (XmlPullParser)localObject1;
        if ("audio/mp4a-latm".equals(localObject2)) {
          paramXmlPullParser = Collections.singletonList(CodecSpecificDataUtil.buildAacLcAudioSpecificConfig(k, i));
        }
      }
      format = Format.createAudioContainerFormat(str1, str2, "audio/mp4", (String)localObject2, null, j, i, k, paramXmlPullParser, 0, (String)getNormalizedAttribute("Language"));
    }
    else if (i == 3)
    {
      format = Format.createTextContainerFormat(str1, str2, "application/mp4", (String)localObject1, null, j, 0, (String)getNormalizedAttribute("Language"));
    }
    else
    {
      format = Format.createContainerFormat(str1, str2, "application/mp4", (String)localObject1, null, j, 0, null);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.QualityLevelParser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */