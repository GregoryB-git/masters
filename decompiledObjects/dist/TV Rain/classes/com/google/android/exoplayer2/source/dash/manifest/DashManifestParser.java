package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.upstream.ParsingLoadable.Parser;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.XmlPullParserUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import z2;

public class DashManifestParser
  extends DefaultHandler
  implements ParsingLoadable.Parser<DashManifest>
{
  private static final Pattern CEA_608_ACCESSIBILITY_PATTERN = Pattern.compile("CC([1-4])=.*");
  private static final Pattern CEA_708_ACCESSIBILITY_PATTERN = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
  private static final Pattern FRAME_RATE_PATTERN = Pattern.compile("(\\d+)(?:/(\\d+))?");
  private static final String TAG = "MpdParser";
  private final String contentId;
  private final XmlPullParserFactory xmlParserFactory;
  
  public DashManifestParser()
  {
    this(null);
  }
  
  public DashManifestParser(String paramString)
  {
    contentId = paramString;
    try
    {
      xmlParserFactory = XmlPullParserFactory.newInstance();
      return;
    }
    catch (XmlPullParserException paramString)
    {
      throw new RuntimeException("Couldn't create XmlPullParserFactory instance", paramString);
    }
  }
  
  private static int checkContentTypeConsistency(int paramInt1, int paramInt2)
  {
    if (paramInt1 == -1) {
      return paramInt2;
    }
    if (paramInt2 == -1) {
      return paramInt1;
    }
    boolean bool;
    if (paramInt1 == paramInt2) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
    return paramInt1;
  }
  
  private static String checkLanguageConsistency(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      return paramString2;
    }
    if (paramString2 == null) {
      return paramString1;
    }
    Assertions.checkState(paramString1.equals(paramString2));
    return paramString1;
  }
  
  private static void filterRedundantIncompleteSchemeDatas(ArrayList<DrmInitData.SchemeData> paramArrayList)
  {
    for (int i = paramArrayList.size() - 1; i >= 0; i--)
    {
      DrmInitData.SchemeData localSchemeData = (DrmInitData.SchemeData)paramArrayList.get(i);
      if (!localSchemeData.hasData()) {
        for (int j = 0; j < paramArrayList.size(); j++) {
          if (((DrmInitData.SchemeData)paramArrayList.get(j)).canReplace(localSchemeData))
          {
            paramArrayList.remove(i);
            break;
          }
        }
      }
    }
  }
  
  private static String getSampleMimeType(String paramString1, String paramString2)
  {
    if (MimeTypes.isAudio(paramString1)) {
      return MimeTypes.getAudioMediaMimeType(paramString2);
    }
    if (MimeTypes.isVideo(paramString1)) {
      return MimeTypes.getVideoMediaMimeType(paramString2);
    }
    if (mimeTypeIsRawText(paramString1)) {
      return paramString1;
    }
    if ("application/mp4".equals(paramString1))
    {
      if (paramString2 != null)
      {
        if (paramString2.startsWith("stpp")) {
          return "application/ttml+xml";
        }
        if (paramString2.startsWith("wvtt")) {
          return "application/x-mp4-vtt";
        }
      }
    }
    else if (("application/x-rawcc".equals(paramString1)) && (paramString2 != null))
    {
      if (paramString2.contains("cea708")) {
        return "application/cea-708";
      }
      if ((paramString2.contains("eia608")) || (paramString2.contains("cea608"))) {
        return "application/cea-608";
      }
    }
    return null;
  }
  
  public static void maybeSkipTag(XmlPullParser paramXmlPullParser)
    throws IOException, XmlPullParserException
  {
    if (!XmlPullParserUtil.isStartTag(paramXmlPullParser)) {
      return;
    }
    int i = 1;
    while (i != 0)
    {
      paramXmlPullParser.next();
      if (XmlPullParserUtil.isStartTag(paramXmlPullParser)) {
        i++;
      } else if (XmlPullParserUtil.isEndTag(paramXmlPullParser)) {
        i--;
      }
    }
  }
  
  private static boolean mimeTypeIsRawText(String paramString)
  {
    boolean bool;
    if ((!MimeTypes.isText(paramString)) && (!"application/ttml+xml".equals(paramString)) && (!"application/x-mp4-vtt".equals(paramString)) && (!"application/cea-708".equals(paramString)) && (!"application/cea-608".equals(paramString))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static String parseBaseUrl(XmlPullParser paramXmlPullParser, String paramString)
    throws XmlPullParserException, IOException
  {
    paramXmlPullParser.next();
    return UriUtil.resolve(paramString, paramXmlPullParser.getText());
  }
  
  public static int parseCea608AccessibilityChannel(List<Descriptor> paramList)
  {
    for (int i = 0; i < paramList.size(); i++)
    {
      Descriptor localDescriptor = (Descriptor)paramList.get(i);
      if ("urn:scte:dash:cc:cea-608:2015".equals(schemeIdUri))
      {
        Object localObject = value;
        if (localObject != null)
        {
          localObject = CEA_608_ACCESSIBILITY_PATTERN.matcher((CharSequence)localObject);
          if (((Matcher)localObject).matches()) {
            return Integer.parseInt(((Matcher)localObject).group(1));
          }
          localObject = z2.t("Unable to parse CEA-608 channel number from: ");
          ((StringBuilder)localObject).append(value);
          Log.w("MpdParser", ((StringBuilder)localObject).toString());
        }
      }
    }
    return -1;
  }
  
  public static int parseCea708AccessibilityChannel(List<Descriptor> paramList)
  {
    for (int i = 0; i < paramList.size(); i++)
    {
      Descriptor localDescriptor = (Descriptor)paramList.get(i);
      if ("urn:scte:dash:cc:cea-708:2015".equals(schemeIdUri))
      {
        Object localObject = value;
        if (localObject != null)
        {
          localObject = CEA_708_ACCESSIBILITY_PATTERN.matcher((CharSequence)localObject);
          if (((Matcher)localObject).matches()) {
            return Integer.parseInt(((Matcher)localObject).group(1));
          }
          localObject = z2.t("Unable to parse CEA-708 service block number from: ");
          ((StringBuilder)localObject).append(value);
          Log.w("MpdParser", ((StringBuilder)localObject).toString());
        }
      }
    }
    return -1;
  }
  
  public static long parseDateTime(XmlPullParser paramXmlPullParser, String paramString, long paramLong)
    throws ParserException
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString);
    if (paramXmlPullParser == null) {
      return paramLong;
    }
    return Util.parseXsDateTime(paramXmlPullParser);
  }
  
  public static Descriptor parseDescriptor(XmlPullParser paramXmlPullParser, String paramString)
    throws XmlPullParserException, IOException
  {
    String str1 = parseString(paramXmlPullParser, "schemeIdUri", "");
    String str2 = parseString(paramXmlPullParser, "value", null);
    String str3 = parseString(paramXmlPullParser, "id", null);
    do
    {
      paramXmlPullParser.next();
    } while (!XmlPullParserUtil.isEndTag(paramXmlPullParser, paramString));
    return new Descriptor(str1, str2, str3);
  }
  
  public static int parseDolbyChannelConfiguration(XmlPullParser paramXmlPullParser)
  {
    paramXmlPullParser = Util.toLowerInvariant(paramXmlPullParser.getAttributeValue(null, "value"));
    if (paramXmlPullParser == null) {
      return -1;
    }
    switch (paramXmlPullParser.hashCode())
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
            i = -1;
            break;
          } while (!paramXmlPullParser.equals("fa01"));
          i = 3;
          break;
        } while (!paramXmlPullParser.equals("f801"));
        i = 2;
        break;
      } while (!paramXmlPullParser.equals("a000"));
      i = 1;
      break;
    } while (!paramXmlPullParser.equals("4000"));
    int i = 0;
    switch (i)
    {
    default: 
      return -1;
    case 3: 
      return 8;
    case 2: 
      return 6;
    case 1: 
      return 2;
    }
    return 1;
  }
  
  public static long parseDuration(XmlPullParser paramXmlPullParser, String paramString, long paramLong)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString);
    if (paramXmlPullParser == null) {
      return paramLong;
    }
    return Util.parseXsDuration(paramXmlPullParser);
  }
  
  public static String parseEac3SupplementalProperties(List<Descriptor> paramList)
  {
    for (int i = 0; i < paramList.size(); i++)
    {
      Descriptor localDescriptor = (Descriptor)paramList.get(i);
      if (("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(schemeIdUri)) && ("ec+3".equals(value))) {
        return "audio/eac3-joc";
      }
    }
    return "audio/eac3";
  }
  
  public static float parseFrameRate(XmlPullParser paramXmlPullParser, float paramFloat)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, "frameRate");
    float f = paramFloat;
    if (paramXmlPullParser != null)
    {
      paramXmlPullParser = FRAME_RATE_PATTERN.matcher(paramXmlPullParser);
      f = paramFloat;
      if (paramXmlPullParser.matches())
      {
        int i = Integer.parseInt(paramXmlPullParser.group(1));
        paramXmlPullParser = paramXmlPullParser.group(2);
        if (!TextUtils.isEmpty(paramXmlPullParser)) {
          f = i / Integer.parseInt(paramXmlPullParser);
        } else {
          f = i;
        }
      }
    }
    return f;
  }
  
  public static int parseInt(XmlPullParser paramXmlPullParser, String paramString, int paramInt)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString);
    if (paramXmlPullParser != null) {
      paramInt = Integer.parseInt(paramXmlPullParser);
    }
    return paramInt;
  }
  
  public static long parseLong(XmlPullParser paramXmlPullParser, String paramString, long paramLong)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString);
    if (paramXmlPullParser != null) {
      paramLong = Long.parseLong(paramXmlPullParser);
    }
    return paramLong;
  }
  
  public static String parseString(XmlPullParser paramXmlPullParser, String paramString1, String paramString2)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString1);
    if (paramXmlPullParser == null) {
      paramXmlPullParser = paramString2;
    }
    return paramXmlPullParser;
  }
  
  public AdaptationSet buildAdaptationSet(int paramInt1, int paramInt2, List<Representation> paramList, List<Descriptor> paramList1, List<Descriptor> paramList2)
  {
    return new AdaptationSet(paramInt1, paramInt2, paramList, paramList1, paramList2);
  }
  
  public EventMessage buildEvent(String paramString1, String paramString2, long paramLong1, long paramLong2, byte[] paramArrayOfByte, long paramLong3)
  {
    return new EventMessage(paramString1, paramString2, paramLong2, paramLong1, paramArrayOfByte, paramLong3);
  }
  
  public EventStream buildEventStream(String paramString1, String paramString2, long paramLong, long[] paramArrayOfLong, EventMessage[] paramArrayOfEventMessage)
  {
    return new EventStream(paramString1, paramString2, paramLong, paramArrayOfLong, paramArrayOfEventMessage);
  }
  
  public Format buildFormat(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, String paramString4, int paramInt6, List<Descriptor> paramList1, String paramString5, List<Descriptor> paramList2)
  {
    String str1 = getSampleMimeType(paramString3, paramString5);
    if (str1 != null)
    {
      String str2 = str1;
      if ("audio/eac3".equals(str1)) {
        str2 = parseEac3SupplementalProperties(paramList2);
      }
      if (MimeTypes.isVideo(str2)) {
        return Format.createVideoContainerFormat(paramString1, paramString2, paramString3, str2, paramString5, paramInt5, paramInt1, paramInt2, paramFloat, null, paramInt6);
      }
      if (MimeTypes.isAudio(str2)) {
        return Format.createAudioContainerFormat(paramString1, paramString2, paramString3, str2, paramString5, paramInt5, paramInt3, paramInt4, null, paramInt6, paramString4);
      }
      paramList2 = str2;
      if (mimeTypeIsRawText(str2))
      {
        if ("application/cea-608".equals(str2)) {
          paramInt1 = parseCea608AccessibilityChannel(paramList1);
        }
        for (;;)
        {
          break;
          if ("application/cea-708".equals(str2)) {
            paramInt1 = parseCea708AccessibilityChannel(paramList1);
          } else {
            paramInt1 = -1;
          }
        }
        return Format.createTextContainerFormat(paramString1, paramString2, paramString3, str2, paramString5, paramInt5, paramInt6, paramString4, paramInt1);
      }
    }
    else
    {
      paramList2 = str1;
    }
    return Format.createContainerFormat(paramString1, paramString2, paramString3, paramList2, paramString5, paramInt5, paramInt6, paramString4);
  }
  
  public DashManifest buildMediaPresentationDescription(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean, long paramLong4, long paramLong5, long paramLong6, long paramLong7, ProgramInformation paramProgramInformation, UtcTimingElement paramUtcTimingElement, Uri paramUri, List<Period> paramList)
  {
    return new DashManifest(paramLong1, paramLong2, paramLong3, paramBoolean, paramLong4, paramLong5, paramLong6, paramLong7, paramProgramInformation, paramUtcTimingElement, paramUri, paramList);
  }
  
  public Period buildPeriod(String paramString, long paramLong, List<AdaptationSet> paramList, List<EventStream> paramList1)
  {
    return new Period(paramString, paramLong, paramList, paramList1);
  }
  
  public RangedUri buildRangedUri(String paramString, long paramLong1, long paramLong2)
  {
    return new RangedUri(paramString, paramLong1, paramLong2);
  }
  
  public Representation buildRepresentation(RepresentationInfo paramRepresentationInfo, String paramString1, String paramString2, ArrayList<DrmInitData.SchemeData> paramArrayList, ArrayList<Descriptor> paramArrayList1)
  {
    Format localFormat = format;
    Object localObject = drmSchemeType;
    if (localObject != null) {
      paramString2 = (String)localObject;
    }
    localObject = drmSchemeDatas;
    ((ArrayList)localObject).addAll(paramArrayList);
    paramArrayList = localFormat;
    if (!((ArrayList)localObject).isEmpty())
    {
      filterRedundantIncompleteSchemeDatas((ArrayList)localObject);
      paramArrayList = localFormat.copyWithDrmInitData(new DrmInitData(paramString2, (List)localObject));
    }
    paramString2 = inbandEventStreams;
    paramString2.addAll(paramArrayList1);
    return Representation.newInstance(paramString1, revisionId, paramArrayList, baseUrl, segmentBase, paramString2);
  }
  
  public SegmentBase.SegmentList buildSegmentList(RangedUri paramRangedUri, long paramLong1, long paramLong2, long paramLong3, long paramLong4, List<SegmentBase.SegmentTimelineElement> paramList, List<RangedUri> paramList1)
  {
    return new SegmentBase.SegmentList(paramRangedUri, paramLong1, paramLong2, paramLong3, paramLong4, paramList, paramList1);
  }
  
  public SegmentBase.SegmentTemplate buildSegmentTemplate(RangedUri paramRangedUri, long paramLong1, long paramLong2, long paramLong3, long paramLong4, List<SegmentBase.SegmentTimelineElement> paramList, UrlTemplate paramUrlTemplate1, UrlTemplate paramUrlTemplate2)
  {
    return new SegmentBase.SegmentTemplate(paramRangedUri, paramLong1, paramLong2, paramLong3, paramLong4, paramList, paramUrlTemplate1, paramUrlTemplate2);
  }
  
  public SegmentBase.SegmentTimelineElement buildSegmentTimelineElement(long paramLong1, long paramLong2)
  {
    return new SegmentBase.SegmentTimelineElement(paramLong1, paramLong2);
  }
  
  public SegmentBase.SingleSegmentBase buildSingleSegmentBase(RangedUri paramRangedUri, long paramLong1, long paramLong2, long paramLong3, long paramLong4)
  {
    return new SegmentBase.SingleSegmentBase(paramRangedUri, paramLong1, paramLong2, paramLong3, paramLong4);
  }
  
  public UtcTimingElement buildUtcTimingElement(String paramString1, String paramString2)
  {
    return new UtcTimingElement(paramString1, paramString2);
  }
  
  public int getContentType(Format paramFormat)
  {
    paramFormat = sampleMimeType;
    if (TextUtils.isEmpty(paramFormat)) {
      return -1;
    }
    if (MimeTypes.isVideo(paramFormat)) {
      return 2;
    }
    if (MimeTypes.isAudio(paramFormat)) {
      return 1;
    }
    if (mimeTypeIsRawText(paramFormat)) {
      return 3;
    }
    return -1;
  }
  
  public DashManifest parse(Uri paramUri, InputStream paramInputStream)
    throws IOException
  {
    try
    {
      XmlPullParser localXmlPullParser = xmlParserFactory.newPullParser();
      localXmlPullParser.setInput(paramInputStream, null);
      if ((localXmlPullParser.next() == 2) && ("MPD".equals(localXmlPullParser.getName()))) {
        return parseMediaPresentationDescription(localXmlPullParser, paramUri.toString());
      }
      paramUri = new com/google/android/exoplayer2/ParserException;
      paramUri.<init>("inputStream does not contain a valid media presentation description");
      throw paramUri;
    }
    catch (XmlPullParserException paramUri)
    {
      throw new ParserException(paramUri);
    }
  }
  
  public AdaptationSet parseAdaptationSet(XmlPullParser paramXmlPullParser, String paramString, SegmentBase paramSegmentBase)
    throws XmlPullParserException, IOException
  {
    Object localObject1 = paramXmlPullParser;
    int i = parseInt((XmlPullParser)localObject1, "id", -1);
    int j = parseContentType(paramXmlPullParser);
    String str1 = null;
    String str2 = ((XmlPullParser)localObject1).getAttributeValue(null, "mimeType");
    String str3 = ((XmlPullParser)localObject1).getAttributeValue(null, "codecs");
    int k = parseInt((XmlPullParser)localObject1, "width", -1);
    int m = parseInt((XmlPullParser)localObject1, "height", -1);
    float f = parseFrameRate((XmlPullParser)localObject1, -1.0F);
    int n = parseInt((XmlPullParser)localObject1, "audioSamplingRate", -1);
    String str4 = "lang";
    Object localObject2 = ((XmlPullParser)localObject1).getAttributeValue(null, "lang");
    String str5 = ((XmlPullParser)localObject1).getAttributeValue(null, "label");
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    ArrayList localArrayList5 = new ArrayList();
    Object localObject3 = paramSegmentBase;
    int i1 = -1;
    paramSegmentBase = (SegmentBase)localObject2;
    localObject2 = null;
    int i2 = 0;
    int i3 = i2;
    for (;;)
    {
      paramXmlPullParser.next();
      if (XmlPullParserUtil.isStartTag((XmlPullParser)localObject1, "BaseURL")) {
        if (i2 == 0)
        {
          localObject4 = parseBaseUrl((XmlPullParser)localObject1, paramString);
          i2 = 1;
          paramString = (String)localObject1;
          localObject1 = paramSegmentBase;
          paramSegmentBase = (SegmentBase)localObject4;
          break label742;
        }
      }
      for (;;)
      {
        localObject4 = localObject1;
        break label734;
        int i4;
        int i5;
        if (XmlPullParserUtil.isStartTag((XmlPullParser)localObject1, "ContentProtection"))
        {
          localObject4 = parseContentProtection(paramXmlPullParser);
          Object localObject5 = first;
          if (localObject5 != null) {
            localObject2 = (String)localObject5;
          }
          localObject5 = second;
          i4 = i1;
          i5 = i3;
          localObject4 = localObject2;
          if (localObject5 != null)
          {
            localArrayList1.add(localObject5);
            i4 = i1;
            i5 = i3;
            localObject4 = localObject2;
          }
        }
        else
        {
          if (XmlPullParserUtil.isStartTag((XmlPullParser)localObject1, "ContentComponent"))
          {
            localObject4 = checkLanguageConsistency(paramSegmentBase, ((XmlPullParser)localObject1).getAttributeValue(str1, str4));
            j = checkContentTypeConsistency(j, parseContentType(paramXmlPullParser));
            paramSegmentBase = paramString;
            paramString = (String)localObject1;
            localObject1 = localObject4;
            break label742;
          }
          if (!XmlPullParserUtil.isStartTag((XmlPullParser)localObject1, "Role")) {
            break label424;
          }
          i5 = i3 | parseRole(paramXmlPullParser);
          localObject4 = localObject2;
          i4 = i1;
        }
        for (;;)
        {
          i1 = i4;
          i3 = i5;
          localObject2 = localObject4;
          localObject4 = paramString;
          break;
          label424:
          if (!XmlPullParserUtil.isStartTag((XmlPullParser)localObject1, "AudioChannelConfiguration")) {
            break label453;
          }
          i4 = parseAudioChannelConfiguration(paramXmlPullParser);
          i5 = i3;
          localObject4 = localObject2;
        }
        label453:
        if (XmlPullParserUtil.isStartTag((XmlPullParser)localObject1, "Accessibility"))
        {
          localArrayList3.add(parseDescriptor((XmlPullParser)localObject1, "Accessibility"));
        }
        else
        {
          if (!XmlPullParserUtil.isStartTag((XmlPullParser)localObject1, "SupplementalProperty")) {
            break label509;
          }
          localArrayList4.add(parseDescriptor((XmlPullParser)localObject1, "SupplementalProperty"));
        }
      }
      label509:
      if (XmlPullParserUtil.isStartTag((XmlPullParser)localObject1, "Representation"))
      {
        localObject4 = paramString;
        paramString = parseRepresentation(paramXmlPullParser, paramString, str5, str2, str3, k, m, f, i1, n, paramSegmentBase, i3, localArrayList3, (SegmentBase)localObject3);
        j = checkContentTypeConsistency(j, getContentType(format));
        localArrayList5.add(paramString);
        paramString = paramXmlPullParser;
        localObject1 = paramSegmentBase;
        paramSegmentBase = (SegmentBase)localObject4;
      }
      else
      {
        localObject4 = paramString;
        localObject1 = paramXmlPullParser;
        if (XmlPullParserUtil.isStartTag((XmlPullParser)localObject1, "SegmentBase")) {
          paramString = parseSegmentBase((XmlPullParser)localObject1, (SegmentBase.SingleSegmentBase)localObject3);
        }
        for (;;)
        {
          localObject3 = paramString;
          paramString = (String)localObject1;
          localObject1 = paramSegmentBase;
          paramSegmentBase = (SegmentBase)localObject4;
          break label742;
          if (XmlPullParserUtil.isStartTag((XmlPullParser)localObject1, "SegmentList"))
          {
            paramString = parseSegmentList((XmlPullParser)localObject1, (SegmentBase.SegmentList)localObject3);
          }
          else
          {
            if (!XmlPullParserUtil.isStartTag((XmlPullParser)localObject1, "SegmentTemplate")) {
              break;
            }
            paramString = parseSegmentTemplate((XmlPullParser)localObject1, (SegmentBase.SegmentTemplate)localObject3);
          }
        }
        if (XmlPullParserUtil.isStartTag((XmlPullParser)localObject1, "InbandEventStream"))
        {
          localArrayList2.add(parseDescriptor((XmlPullParser)localObject1, "InbandEventStream"));
          localObject4 = localObject1;
        }
        else
        {
          localObject4 = localObject1;
          if (XmlPullParserUtil.isStartTag(paramXmlPullParser))
          {
            parseAdaptationSetChild(paramXmlPullParser);
            localObject4 = localObject1;
          }
        }
        label734:
        localObject1 = paramSegmentBase;
        paramSegmentBase = paramString;
        paramString = (String)localObject4;
      }
      label742:
      if (XmlPullParserUtil.isEndTag(paramString, "AdaptationSet"))
      {
        paramXmlPullParser = new ArrayList(localArrayList5.size());
        for (i3 = 0; i3 < localArrayList5.size(); i3++) {
          paramXmlPullParser.add(buildRepresentation((RepresentationInfo)localArrayList5.get(i3), contentId, (String)localObject2, localArrayList1, localArrayList2));
        }
        return buildAdaptationSet(i, j, paramXmlPullParser, localArrayList3, localArrayList4);
      }
      Object localObject4 = paramString;
      paramString = paramSegmentBase;
      paramSegmentBase = (SegmentBase)localObject1;
      localObject1 = localObject4;
    }
  }
  
  public void parseAdaptationSetChild(XmlPullParser paramXmlPullParser)
    throws XmlPullParserException, IOException
  {
    maybeSkipTag(paramXmlPullParser);
  }
  
  public int parseAudioChannelConfiguration(XmlPullParser paramXmlPullParser)
    throws XmlPullParserException, IOException
  {
    String str = parseString(paramXmlPullParser, "schemeIdUri", null);
    boolean bool = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011".equals(str);
    int i = -1;
    if (bool) {
      i = parseInt(paramXmlPullParser, "value", -1);
    } else if ("tag:dolby.com,2014:dash:audio_channel_configuration:2011".equals(str)) {
      i = parseDolbyChannelConfiguration(paramXmlPullParser);
    }
    do
    {
      paramXmlPullParser.next();
    } while (!XmlPullParserUtil.isEndTag(paramXmlPullParser, "AudioChannelConfiguration"));
    return i;
  }
  
  public Pair<String, DrmInitData.SchemeData> parseContentProtection(XmlPullParser paramXmlPullParser)
    throws XmlPullParserException, IOException
  {
    Object localObject1 = null;
    Object localObject2 = paramXmlPullParser.getAttributeValue(null, "schemeIdUri");
    Object localObject5;
    if (localObject2 != null)
    {
      localObject2 = Util.toLowerInvariant((String)localObject2);
      localObject2.getClass();
      int i = -1;
      switch (((String)localObject2).hashCode())
      {
      default: 
        break;
      case 1812765994: 
        if (((String)localObject2).equals("urn:mpeg:dash:mp4protection:2011")) {
          i = 2;
        }
        break;
      case 755418770: 
        if (((String)localObject2).equals("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed")) {
          i = 1;
        }
        break;
      case 489446379: 
        if (((String)localObject2).equals("urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95")) {
          i = 0;
        }
        break;
      }
      switch (i)
      {
      default: 
        break;
      case 2: 
        localObject3 = paramXmlPullParser.getAttributeValue(null, "value");
        localObject2 = XmlPullParserUtil.getAttributeValueIgnorePrefix(paramXmlPullParser, "default_KID");
        if ((!TextUtils.isEmpty((CharSequence)localObject2)) && (!"00000000-0000-0000-0000-000000000000".equals(localObject2)))
        {
          localObject4 = ((String)localObject2).split("\\s+");
          localObject2 = new UUID[localObject4.length];
          for (i = 0; i < localObject4.length; i++) {
            localObject2[i] = UUID.fromString(localObject4[i]);
          }
          localObject5 = C.COMMON_PSSH_UUID;
          localObject4 = PsshAtomUtil.buildPsshAtom((UUID)localObject5, (UUID[])localObject2, null);
          localObject6 = null;
          localObject7 = localObject3;
          break label304;
        }
        break;
      case 1: 
        localObject5 = C.WIDEVINE_UUID;
        break;
      case 0: 
        localObject5 = C.PLAYREADY_UUID;
      }
      localObject3 = null;
      localObject2 = localObject3;
    }
    else
    {
      localObject3 = null;
      localObject5 = null;
      localObject2 = null;
    }
    Object localObject6 = localObject2;
    Object localObject4 = localObject2;
    Object localObject7 = localObject3;
    label304:
    boolean bool = false;
    localObject2 = localObject6;
    Object localObject3 = localObject5;
    for (;;)
    {
      paramXmlPullParser.next();
      if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "ms:laurl")) {
        localObject5 = paramXmlPullParser.getAttributeValue(null, "licenseUrl");
      }
      for (;;)
      {
        localObject2 = localObject4;
        localObject4 = localObject3;
        for (;;)
        {
          break label554;
          if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "widevine:license"))
          {
            localObject5 = paramXmlPullParser.getAttributeValue(null, "robustness_level");
            if ((localObject5 != null) && (((String)localObject5).startsWith("HW")))
            {
              bool = true;
              localObject5 = localObject2;
              break;
            }
            bool = false;
            localObject5 = localObject2;
            break;
          }
          if ((localObject4 != null) || (!XmlPullParserUtil.isStartTagIgnorePrefix(paramXmlPullParser, "pssh")) || (paramXmlPullParser.next() != 4)) {
            break label481;
          }
          localObject3 = Base64.decode(paramXmlPullParser.getText(), 0);
          localObject4 = PsshAtomUtil.parseUuid((byte[])localObject3);
          if (localObject4 == null)
          {
            Log.w("MpdParser", "Skipping malformed cenc:pssh data");
            localObject3 = null;
          }
          localObject5 = localObject2;
          localObject2 = localObject3;
        }
        label481:
        if (localObject4 == null)
        {
          localObject5 = C.PLAYREADY_UUID;
          if ((((UUID)localObject5).equals(localObject3)) && (XmlPullParserUtil.isStartTag(paramXmlPullParser, "mspr:pro")) && (paramXmlPullParser.next() == 4))
          {
            localObject4 = PsshAtomUtil.buildPsshAtom((UUID)localObject5, Base64.decode(paramXmlPullParser.getText(), 0));
            localObject5 = localObject2;
            continue;
          }
        }
        maybeSkipTag(paramXmlPullParser);
        localObject5 = localObject2;
      }
      label554:
      if (XmlPullParserUtil.isEndTag(paramXmlPullParser, "ContentProtection"))
      {
        paramXmlPullParser = (XmlPullParser)localObject1;
        if (localObject4 != null) {
          paramXmlPullParser = new DrmInitData.SchemeData((UUID)localObject4, (String)localObject5, "video/mp4", (byte[])localObject2, bool);
        }
        return Pair.create(localObject7, paramXmlPullParser);
      }
      localObject3 = localObject4;
      localObject4 = localObject2;
      localObject2 = localObject5;
    }
  }
  
  public int parseContentType(XmlPullParser paramXmlPullParser)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, "contentType");
    boolean bool = TextUtils.isEmpty(paramXmlPullParser);
    int i = -1;
    if (!bool) {
      if ("audio".equals(paramXmlPullParser)) {
        i = 1;
      } else if ("video".equals(paramXmlPullParser)) {
        i = 2;
      } else if ("text".equals(paramXmlPullParser)) {
        i = 3;
      }
    }
    return i;
  }
  
  public EventMessage parseEvent(XmlPullParser paramXmlPullParser, String paramString1, String paramString2, long paramLong, ByteArrayOutputStream paramByteArrayOutputStream)
    throws IOException, XmlPullParserException
  {
    long l1 = parseLong(paramXmlPullParser, "id", 0L);
    long l2 = parseLong(paramXmlPullParser, "duration", -9223372036854775807L);
    long l3 = parseLong(paramXmlPullParser, "presentationTime", 0L);
    l2 = Util.scaleLargeTimestamp(l2, 1000L, paramLong);
    paramLong = Util.scaleLargeTimestamp(l3, 1000000L, paramLong);
    String str = parseString(paramXmlPullParser, "messageData", null);
    paramXmlPullParser = parseEventObject(paramXmlPullParser, paramByteArrayOutputStream);
    if (str != null) {
      paramXmlPullParser = Util.getUtf8Bytes(str);
    }
    return buildEvent(paramString1, paramString2, l1, l2, paramXmlPullParser, paramLong);
  }
  
  public byte[] parseEventObject(XmlPullParser paramXmlPullParser, ByteArrayOutputStream paramByteArrayOutputStream)
    throws XmlPullParserException, IOException
  {
    paramByteArrayOutputStream.reset();
    XmlSerializer localXmlSerializer = Xml.newSerializer();
    localXmlSerializer.setOutput(paramByteArrayOutputStream, "UTF-8");
    paramXmlPullParser.nextToken();
    while (!XmlPullParserUtil.isEndTag(paramXmlPullParser, "Event"))
    {
      int i;
      switch (paramXmlPullParser.getEventType())
      {
      default: 
        break;
      case 10: 
        localXmlSerializer.docdecl(paramXmlPullParser.getText());
        break;
      case 9: 
        localXmlSerializer.comment(paramXmlPullParser.getText());
        break;
      case 8: 
        localXmlSerializer.processingInstruction(paramXmlPullParser.getText());
        break;
      case 7: 
        localXmlSerializer.ignorableWhitespace(paramXmlPullParser.getText());
        break;
      case 6: 
        localXmlSerializer.entityRef(paramXmlPullParser.getText());
        break;
      case 5: 
        localXmlSerializer.cdsect(paramXmlPullParser.getText());
        break;
      case 4: 
        localXmlSerializer.text(paramXmlPullParser.getText());
        break;
      case 3: 
        localXmlSerializer.endTag(paramXmlPullParser.getNamespace(), paramXmlPullParser.getName());
        break;
      case 2: 
        localXmlSerializer.startTag(paramXmlPullParser.getNamespace(), paramXmlPullParser.getName());
        i = 0;
      case 1: 
      case 0: 
        while (i < paramXmlPullParser.getAttributeCount())
        {
          localXmlSerializer.attribute(paramXmlPullParser.getAttributeNamespace(i), paramXmlPullParser.getAttributeName(i), paramXmlPullParser.getAttributeValue(i));
          i++;
          continue;
          localXmlSerializer.endDocument();
          break;
          localXmlSerializer.startDocument(null, Boolean.FALSE);
        }
      }
      paramXmlPullParser.nextToken();
    }
    localXmlSerializer.flush();
    return paramByteArrayOutputStream.toByteArray();
  }
  
  public EventStream parseEventStream(XmlPullParser paramXmlPullParser)
    throws XmlPullParserException, IOException
  {
    String str1 = parseString(paramXmlPullParser, "schemeIdUri", "");
    String str2 = parseString(paramXmlPullParser, "value", "");
    long l = parseLong(paramXmlPullParser, "timescale", 1L);
    ArrayList localArrayList = new ArrayList();
    Object localObject = new ByteArrayOutputStream(512);
    do
    {
      paramXmlPullParser.next();
      if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "Event")) {
        localArrayList.add(parseEvent(paramXmlPullParser, str1, str2, l, (ByteArrayOutputStream)localObject));
      } else {
        maybeSkipTag(paramXmlPullParser);
      }
    } while (!XmlPullParserUtil.isEndTag(paramXmlPullParser, "EventStream"));
    localObject = new long[localArrayList.size()];
    paramXmlPullParser = new EventMessage[localArrayList.size()];
    for (int i = 0; i < localArrayList.size(); i++)
    {
      EventMessage localEventMessage = (EventMessage)localArrayList.get(i);
      localObject[i] = presentationTimeUs;
      paramXmlPullParser[i] = localEventMessage;
    }
    return buildEventStream(str1, str2, l, (long[])localObject, paramXmlPullParser);
  }
  
  public RangedUri parseInitialization(XmlPullParser paramXmlPullParser)
  {
    return parseRangedUrl(paramXmlPullParser, "sourceURL", "range");
  }
  
  public DashManifest parseMediaPresentationDescription(XmlPullParser paramXmlPullParser, String paramString)
    throws XmlPullParserException, IOException
  {
    long l1 = -9223372036854775807L;
    long l2 = parseDateTime(paramXmlPullParser, "availabilityStartTime", -9223372036854775807L);
    long l3 = parseDuration(paramXmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
    long l4 = parseDuration(paramXmlPullParser, "minBufferTime", -9223372036854775807L);
    Object localObject1 = paramXmlPullParser.getAttributeValue(null, "type");
    boolean bool;
    if ((localObject1 != null) && ("dynamic".equals(localObject1))) {
      bool = true;
    } else {
      bool = false;
    }
    long l5;
    if (bool) {
      l5 = parseDuration(paramXmlPullParser, "minimumUpdatePeriod", -9223372036854775807L);
    } else {
      l5 = -9223372036854775807L;
    }
    long l6;
    if (bool) {
      l6 = parseDuration(paramXmlPullParser, "timeShiftBufferDepth", -9223372036854775807L);
    } else {
      l6 = -9223372036854775807L;
    }
    long l7;
    if (bool) {
      l7 = parseDuration(paramXmlPullParser, "suggestedPresentationDelay", -9223372036854775807L);
    } else {
      l7 = -9223372036854775807L;
    }
    long l8 = parseDateTime(paramXmlPullParser, "publishTime", -9223372036854775807L);
    ArrayList localArrayList = new ArrayList();
    if (!bool) {
      l1 = 0L;
    }
    localObject1 = null;
    int i = 0;
    int j = i;
    Object localObject2 = localObject1;
    Object localObject3 = localObject2;
    for (;;)
    {
      paramXmlPullParser.next();
      if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "BaseURL")) {
        if (i == 0)
        {
          paramString = parseBaseUrl(paramXmlPullParser, paramString);
          i = 1;
        }
      }
      for (;;)
      {
        break;
        break;
        if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "ProgramInformation"))
        {
          localObject2 = parseProgramInformation(paramXmlPullParser);
        }
        else
        {
          if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "UTCTiming"))
          {
            localObject1 = parseUtcTiming(paramXmlPullParser);
          }
          else
          {
            if (!XmlPullParserUtil.isStartTag(paramXmlPullParser, "Location")) {
              break label302;
            }
            localObject3 = Uri.parse(paramXmlPullParser.nextText());
          }
          continue;
          label302:
          if ((XmlPullParserUtil.isStartTag(paramXmlPullParser, "Period")) && (j == 0))
          {
            Pair localPair = parsePeriod(paramXmlPullParser, paramString, l1);
            Period localPeriod = (Period)first;
            if (startMs == -9223372036854775807L)
            {
              if (bool)
              {
                j = 1;
              }
              else
              {
                paramXmlPullParser = z2.t("Unable to determine start of period ");
                paramXmlPullParser.append(localArrayList.size());
                throw new ParserException(paramXmlPullParser.toString());
              }
            }
            else
            {
              l1 = ((Long)second).longValue();
              if (l1 == -9223372036854775807L) {
                l1 = -9223372036854775807L;
              } else {
                l1 = startMs + l1;
              }
              localArrayList.add(localPeriod);
            }
          }
          else
          {
            maybeSkipTag(paramXmlPullParser);
          }
        }
      }
      if (XmlPullParserUtil.isEndTag(paramXmlPullParser, "MPD"))
      {
        long l9 = l3;
        if (l3 == -9223372036854775807L) {
          if (l1 != -9223372036854775807L) {
            l9 = l1;
          } else if (bool) {
            l9 = l3;
          } else {
            throw new ParserException("Unable to determine duration of static manifest.");
          }
        }
        if (!localArrayList.isEmpty()) {
          return buildMediaPresentationDescription(l2, l9, l4, bool, l5, l6, l7, l8, (ProgramInformation)localObject2, (UtcTimingElement)localObject1, (Uri)localObject3, localArrayList);
        }
        throw new ParserException("No periods found.");
      }
    }
  }
  
  public Pair<Period, Long> parsePeriod(XmlPullParser paramXmlPullParser, String paramString, long paramLong)
    throws XmlPullParserException, IOException
  {
    String str = paramXmlPullParser.getAttributeValue(null, "id");
    paramLong = parseDuration(paramXmlPullParser, "start", paramLong);
    long l = parseDuration(paramXmlPullParser, "duration", -9223372036854775807L);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = paramString;
    do
    {
      paramXmlPullParser.next();
      int j;
      Object localObject3;
      if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "BaseURL"))
      {
        j = i;
        paramString = (String)localObject1;
        localObject3 = localObject2;
        if (i == 0)
        {
          localObject3 = parseBaseUrl(paramXmlPullParser, (String)localObject2);
          j = 1;
          paramString = (String)localObject1;
        }
      }
      else if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "AdaptationSet"))
      {
        localArrayList1.add(parseAdaptationSet(paramXmlPullParser, (String)localObject2, (SegmentBase)localObject1));
        j = i;
        paramString = (String)localObject1;
        localObject3 = localObject2;
      }
      else if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "EventStream"))
      {
        localArrayList2.add(parseEventStream(paramXmlPullParser));
        j = i;
        paramString = (String)localObject1;
        localObject3 = localObject2;
      }
      else if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "SegmentBase"))
      {
        paramString = parseSegmentBase(paramXmlPullParser, null);
        j = i;
        localObject3 = localObject2;
      }
      else if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "SegmentList"))
      {
        paramString = parseSegmentList(paramXmlPullParser, null);
        j = i;
        localObject3 = localObject2;
      }
      else if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "SegmentTemplate"))
      {
        paramString = parseSegmentTemplate(paramXmlPullParser, null);
        j = i;
        localObject3 = localObject2;
      }
      else
      {
        maybeSkipTag(paramXmlPullParser);
        localObject3 = localObject2;
        paramString = (String)localObject1;
        j = i;
      }
      i = j;
      localObject1 = paramString;
      localObject2 = localObject3;
    } while (!XmlPullParserUtil.isEndTag(paramXmlPullParser, "Period"));
    return Pair.create(buildPeriod(str, paramLong, localArrayList1, localArrayList2), Long.valueOf(l));
  }
  
  public ProgramInformation parseProgramInformation(XmlPullParser paramXmlPullParser)
    throws IOException, XmlPullParserException
  {
    String str1 = null;
    String str2 = parseString(paramXmlPullParser, "moreInformationURL", null);
    String str3 = parseString(paramXmlPullParser, "lang", null);
    String str4 = null;
    String str5 = str4;
    for (;;)
    {
      paramXmlPullParser.next();
      if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "Title")) {
        str1 = paramXmlPullParser.nextText();
      }
      for (;;)
      {
        break;
        if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "Source")) {
          str4 = paramXmlPullParser.nextText();
        } else if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "Copyright")) {
          str5 = paramXmlPullParser.nextText();
        } else {
          maybeSkipTag(paramXmlPullParser);
        }
      }
      if (XmlPullParserUtil.isEndTag(paramXmlPullParser, "ProgramInformation")) {
        return new ProgramInformation(str1, str4, str5, str2, str3);
      }
    }
  }
  
  public RangedUri parseRangedUrl(XmlPullParser paramXmlPullParser, String paramString1, String paramString2)
  {
    paramString1 = paramXmlPullParser.getAttributeValue(null, paramString1);
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString2);
    long l2;
    if (paramXmlPullParser != null)
    {
      paramXmlPullParser = paramXmlPullParser.split("-");
      l1 = Long.parseLong(paramXmlPullParser[0]);
      l2 = l1;
      if (paramXmlPullParser.length == 2)
      {
        long l3 = Long.parseLong(paramXmlPullParser[1]) - l1 + 1L;
        l2 = l1;
        l1 = l3;
        break label80;
      }
    }
    else
    {
      l2 = 0L;
    }
    long l1 = -1L;
    label80:
    return buildRangedUri(paramString1, l2, l1);
  }
  
  public RepresentationInfo parseRepresentation(XmlPullParser paramXmlPullParser, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, String paramString5, int paramInt5, List<Descriptor> paramList, SegmentBase paramSegmentBase)
    throws XmlPullParserException, IOException
  {
    String str1 = paramXmlPullParser.getAttributeValue(null, "id");
    int i = parseInt(paramXmlPullParser, "bandwidth", -1);
    String str2 = parseString(paramXmlPullParser, "mimeType", paramString3);
    String str3 = parseString(paramXmlPullParser, "codecs", paramString4);
    int j = parseInt(paramXmlPullParser, "width", paramInt1);
    int k = parseInt(paramXmlPullParser, "height", paramInt2);
    paramFloat = parseFrameRate(paramXmlPullParser, paramFloat);
    paramInt4 = parseInt(paramXmlPullParser, "audioSamplingRate", paramInt4);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    paramString4 = paramSegmentBase;
    paramSegmentBase = null;
    paramInt1 = 0;
    paramString3 = paramString1;
    paramInt2 = paramInt3;
    for (paramString1 = paramSegmentBase;; paramString1 = paramSegmentBase)
    {
      paramXmlPullParser.next();
      if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "BaseURL"))
      {
        if (paramInt1 == 0)
        {
          paramSegmentBase = parseBaseUrl(paramXmlPullParser, paramString3);
          paramString3 = paramString4;
          paramString4 = paramSegmentBase;
          paramInt1 = 1;
          paramSegmentBase = paramString1;
          paramString1 = paramString3;
          paramString3 = paramSegmentBase;
          break label452;
        }
        paramSegmentBase = paramString1;
      }
      else
      {
        if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "AudioChannelConfiguration"))
        {
          paramInt2 = parseAudioChannelConfiguration(paramXmlPullParser);
          paramSegmentBase = paramString3;
          paramString3 = paramString1;
          break label445;
        }
        if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "SegmentBase")) {
          paramString4 = parseSegmentBase(paramXmlPullParser, (SegmentBase.SingleSegmentBase)paramString4);
        }
        for (;;)
        {
          paramSegmentBase = paramString4;
          paramString4 = paramString3;
          paramString3 = paramSegmentBase;
          break;
          if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "SegmentList"))
          {
            paramString4 = parseSegmentList(paramXmlPullParser, (SegmentBase.SegmentList)paramString4);
          }
          else
          {
            if (!XmlPullParserUtil.isStartTag(paramXmlPullParser, "SegmentTemplate")) {
              break label306;
            }
            paramString4 = parseSegmentTemplate(paramXmlPullParser, (SegmentBase.SegmentTemplate)paramString4);
          }
        }
        label306:
        if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "ContentProtection"))
        {
          paramSegmentBase = parseContentProtection(paramXmlPullParser);
          Object localObject = first;
          if (localObject != null) {
            paramString1 = (String)localObject;
          }
          localObject = second;
          paramSegmentBase = paramString1;
          if (localObject != null)
          {
            localArrayList1.add(localObject);
            paramSegmentBase = paramString1;
          }
        }
        else if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "InbandEventStream"))
        {
          localArrayList2.add(parseDescriptor(paramXmlPullParser, "InbandEventStream"));
          paramSegmentBase = paramString1;
        }
        else if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "SupplementalProperty"))
        {
          localArrayList3.add(parseDescriptor(paramXmlPullParser, "SupplementalProperty"));
          paramSegmentBase = paramString1;
        }
        else
        {
          maybeSkipTag(paramXmlPullParser);
          paramSegmentBase = paramString1;
        }
      }
      paramString1 = paramString3;
      paramString3 = paramSegmentBase;
      paramSegmentBase = paramString1;
      label445:
      paramString1 = paramString4;
      paramString4 = paramSegmentBase;
      label452:
      if (XmlPullParserUtil.isEndTag(paramXmlPullParser, "Representation"))
      {
        paramString2 = buildFormat(str1, paramString2, str2, j, k, paramFloat, paramInt2, paramInt4, i, paramString5, paramInt5, paramList, str3, localArrayList3);
        if (paramString1 != null) {
          paramXmlPullParser = paramString1;
        } else {
          paramXmlPullParser = new SegmentBase.SingleSegmentBase();
        }
        return new RepresentationInfo(paramString2, paramString4, paramXmlPullParser, paramString3, localArrayList1, localArrayList2, -1L);
      }
      paramSegmentBase = paramString3;
      paramString3 = paramString4;
      paramString4 = paramString1;
    }
  }
  
  public int parseRole(XmlPullParser paramXmlPullParser)
    throws XmlPullParserException, IOException
  {
    String str1 = parseString(paramXmlPullParser, "schemeIdUri", null);
    String str2 = parseString(paramXmlPullParser, "value", null);
    do
    {
      paramXmlPullParser.next();
    } while (!XmlPullParserUtil.isEndTag(paramXmlPullParser, "Role"));
    int i;
    if (("urn:mpeg:dash:role:2011".equals(str1)) && ("main".equals(str2))) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public SegmentBase.SingleSegmentBase parseSegmentBase(XmlPullParser paramXmlPullParser, SegmentBase.SingleSegmentBase paramSingleSegmentBase)
    throws XmlPullParserException, IOException
  {
    long l1;
    if (paramSingleSegmentBase != null) {
      l1 = timescale;
    } else {
      l1 = 1L;
    }
    long l2 = parseLong(paramXmlPullParser, "timescale", l1);
    long l3 = 0L;
    if (paramSingleSegmentBase != null) {
      l1 = presentationTimeOffset;
    } else {
      l1 = 0L;
    }
    long l4 = parseLong(paramXmlPullParser, "presentationTimeOffset", l1);
    if (paramSingleSegmentBase != null) {
      l1 = indexStart;
    } else {
      l1 = 0L;
    }
    if (paramSingleSegmentBase != null) {
      l3 = indexLength;
    }
    Object localObject1 = null;
    Object localObject2 = paramXmlPullParser.getAttributeValue(null, "indexRange");
    if (localObject2 != null)
    {
      localObject2 = ((String)localObject2).split("-");
      l1 = Long.parseLong(localObject2[0]);
      l3 = Long.parseLong(localObject2[1]) - l1 + 1L;
    }
    if (paramSingleSegmentBase != null) {
      localObject1 = initialization;
    }
    do
    {
      paramXmlPullParser.next();
      if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "Initialization"))
      {
        paramSingleSegmentBase = parseInitialization(paramXmlPullParser);
      }
      else
      {
        maybeSkipTag(paramXmlPullParser);
        paramSingleSegmentBase = (SegmentBase.SingleSegmentBase)localObject1;
      }
      localObject1 = paramSingleSegmentBase;
    } while (!XmlPullParserUtil.isEndTag(paramXmlPullParser, "SegmentBase"));
    return buildSingleSegmentBase(paramSingleSegmentBase, l2, l4, l1, l3);
  }
  
  public SegmentBase.SegmentList parseSegmentList(XmlPullParser paramXmlPullParser, SegmentBase.SegmentList paramSegmentList)
    throws XmlPullParserException, IOException
  {
    long l1 = 1L;
    if (paramSegmentList != null) {
      l2 = timescale;
    } else {
      l2 = 1L;
    }
    long l3 = parseLong(paramXmlPullParser, "timescale", l2);
    if (paramSegmentList != null) {
      l2 = presentationTimeOffset;
    } else {
      l2 = 0L;
    }
    long l4 = parseLong(paramXmlPullParser, "presentationTimeOffset", l2);
    if (paramSegmentList != null) {
      l2 = duration;
    } else {
      l2 = -9223372036854775807L;
    }
    long l5 = parseLong(paramXmlPullParser, "duration", l2);
    long l2 = l1;
    if (paramSegmentList != null) {
      l2 = startNumber;
    }
    l2 = parseLong(paramXmlPullParser, "startNumber", l2);
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = localObject2;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    do
    {
      paramXmlPullParser.next();
      if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "Initialization"))
      {
        localObject4 = parseInitialization(paramXmlPullParser);
        localObject5 = localObject1;
        localObject6 = localObject3;
      }
      else if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "SegmentTimeline"))
      {
        localObject6 = parseSegmentTimeline(paramXmlPullParser);
        localObject5 = localObject1;
        localObject4 = localObject2;
      }
      else if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "SegmentURL"))
      {
        localObject5 = localObject1;
        if (localObject1 == null) {
          localObject5 = new ArrayList();
        }
        ((List)localObject5).add(parseSegmentUrl(paramXmlPullParser));
        localObject4 = localObject2;
        localObject6 = localObject3;
      }
      else
      {
        maybeSkipTag(paramXmlPullParser);
        localObject6 = localObject3;
        localObject4 = localObject2;
        localObject5 = localObject1;
      }
      localObject1 = localObject5;
      localObject2 = localObject4;
      localObject3 = localObject6;
    } while (!XmlPullParserUtil.isEndTag(paramXmlPullParser, "SegmentList"));
    localObject1 = localObject5;
    localObject3 = localObject4;
    paramXmlPullParser = (XmlPullParser)localObject6;
    if (paramSegmentList != null)
    {
      if (localObject4 == null) {
        localObject4 = initialization;
      }
      if (localObject6 == null) {
        localObject6 = segmentTimeline;
      }
      if (localObject5 != null)
      {
        localObject1 = localObject5;
        localObject3 = localObject4;
        paramXmlPullParser = (XmlPullParser)localObject6;
      }
      else
      {
        localObject1 = mediaSegments;
        paramXmlPullParser = (XmlPullParser)localObject6;
        localObject3 = localObject4;
      }
    }
    return buildSegmentList((RangedUri)localObject3, l3, l4, l2, l5, paramXmlPullParser, (List)localObject1);
  }
  
  public SegmentBase.SegmentTemplate parseSegmentTemplate(XmlPullParser paramXmlPullParser, SegmentBase.SegmentTemplate paramSegmentTemplate)
    throws XmlPullParserException, IOException
  {
    long l1 = 1L;
    if (paramSegmentTemplate != null) {
      l2 = timescale;
    } else {
      l2 = 1L;
    }
    long l3 = parseLong(paramXmlPullParser, "timescale", l2);
    if (paramSegmentTemplate != null) {
      l2 = presentationTimeOffset;
    } else {
      l2 = 0L;
    }
    long l4 = parseLong(paramXmlPullParser, "presentationTimeOffset", l2);
    if (paramSegmentTemplate != null) {
      l2 = duration;
    } else {
      l2 = -9223372036854775807L;
    }
    long l5 = parseLong(paramXmlPullParser, "duration", l2);
    long l2 = l1;
    if (paramSegmentTemplate != null) {
      l2 = startNumber;
    }
    l2 = parseLong(paramXmlPullParser, "startNumber", l2);
    Object localObject1 = null;
    Object localObject2;
    if (paramSegmentTemplate != null) {
      localObject2 = mediaTemplate;
    } else {
      localObject2 = null;
    }
    UrlTemplate localUrlTemplate1 = parseUrlTemplate(paramXmlPullParser, "media", (UrlTemplate)localObject2);
    if (paramSegmentTemplate != null) {
      localObject2 = initializationTemplate;
    } else {
      localObject2 = null;
    }
    UrlTemplate localUrlTemplate2 = parseUrlTemplate(paramXmlPullParser, "initialization", (UrlTemplate)localObject2);
    Object localObject3 = null;
    Object localObject4;
    do
    {
      paramXmlPullParser.next();
      if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "Initialization"))
      {
        localObject2 = parseInitialization(paramXmlPullParser);
        localObject4 = localObject3;
      }
      else if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "SegmentTimeline"))
      {
        localObject4 = parseSegmentTimeline(paramXmlPullParser);
        localObject2 = localObject1;
      }
      else
      {
        maybeSkipTag(paramXmlPullParser);
        localObject4 = localObject3;
        localObject2 = localObject1;
      }
      localObject1 = localObject2;
      localObject3 = localObject4;
    } while (!XmlPullParserUtil.isEndTag(paramXmlPullParser, "SegmentTemplate"));
    localObject3 = localObject2;
    paramXmlPullParser = (XmlPullParser)localObject4;
    if (paramSegmentTemplate != null)
    {
      if (localObject2 == null) {
        localObject2 = initialization;
      }
      if (localObject4 != null)
      {
        localObject3 = localObject2;
        paramXmlPullParser = (XmlPullParser)localObject4;
      }
      else
      {
        paramXmlPullParser = segmentTimeline;
        localObject3 = localObject2;
      }
    }
    return buildSegmentTemplate((RangedUri)localObject3, l3, l4, l2, l5, paramXmlPullParser, localUrlTemplate2, localUrlTemplate1);
  }
  
  public List<SegmentBase.SegmentTimelineElement> parseSegmentTimeline(XmlPullParser paramXmlPullParser)
    throws XmlPullParserException, IOException
  {
    ArrayList localArrayList = new ArrayList();
    long l1 = 0L;
    do
    {
      paramXmlPullParser.next();
      if (XmlPullParserUtil.isStartTag(paramXmlPullParser, "S"))
      {
        long l2 = parseLong(paramXmlPullParser, "t", l1);
        long l3 = parseLong(paramXmlPullParser, "d", -9223372036854775807L);
        int i = 0;
        int j = parseInt(paramXmlPullParser, "r", 0);
        for (;;)
        {
          l1 = l2;
          if (i >= j + 1) {
            break;
          }
          localArrayList.add(buildSegmentTimelineElement(l2, l3));
          l2 += l3;
          i++;
        }
      }
      maybeSkipTag(paramXmlPullParser);
    } while (!XmlPullParserUtil.isEndTag(paramXmlPullParser, "SegmentTimeline"));
    return localArrayList;
  }
  
  public RangedUri parseSegmentUrl(XmlPullParser paramXmlPullParser)
  {
    return parseRangedUrl(paramXmlPullParser, "media", "mediaRange");
  }
  
  public UrlTemplate parseUrlTemplate(XmlPullParser paramXmlPullParser, String paramString, UrlTemplate paramUrlTemplate)
  {
    paramXmlPullParser = paramXmlPullParser.getAttributeValue(null, paramString);
    if (paramXmlPullParser != null) {
      return UrlTemplate.compile(paramXmlPullParser);
    }
    return paramUrlTemplate;
  }
  
  public UtcTimingElement parseUtcTiming(XmlPullParser paramXmlPullParser)
  {
    return buildUtcTimingElement(paramXmlPullParser.getAttributeValue(null, "schemeIdUri"), paramXmlPullParser.getAttributeValue(null, "value"));
  }
  
  public static final class RepresentationInfo
  {
    public final String baseUrl;
    public final ArrayList<DrmInitData.SchemeData> drmSchemeDatas;
    public final String drmSchemeType;
    public final Format format;
    public final ArrayList<Descriptor> inbandEventStreams;
    public final long revisionId;
    public final SegmentBase segmentBase;
    
    public RepresentationInfo(Format paramFormat, String paramString1, SegmentBase paramSegmentBase, String paramString2, ArrayList<DrmInitData.SchemeData> paramArrayList, ArrayList<Descriptor> paramArrayList1, long paramLong)
    {
      format = paramFormat;
      baseUrl = paramString1;
      segmentBase = paramSegmentBase;
      drmSchemeType = paramString2;
      drmSchemeDatas = paramArrayList;
      inbandEventStreams = paramArrayList1;
      revisionId = paramLong;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.manifest.DashManifestParser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */