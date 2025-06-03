package com.google.android.exoplayer2.source.hls.playlist;

import a;
import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import com.google.android.exoplayer2.upstream.ParsingLoadable.Parser;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import z2;

public final class HlsPlaylistParser
  implements ParsingLoadable.Parser<HlsPlaylist>
{
  private static final String ATTR_CLOSED_CAPTIONS_NONE = "CLOSED-CAPTIONS=NONE";
  private static final String BOOLEAN_FALSE = "NO";
  private static final String BOOLEAN_TRUE = "YES";
  private static final String KEYFORMAT_IDENTITY = "identity";
  private static final String KEYFORMAT_PLAYREADY = "com.microsoft.playready";
  private static final String KEYFORMAT_WIDEVINE_PSSH_BINARY = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed";
  private static final String KEYFORMAT_WIDEVINE_PSSH_JSON = "com.widevine";
  private static final String METHOD_AES_128 = "AES-128";
  private static final String METHOD_NONE = "NONE";
  private static final String METHOD_SAMPLE_AES = "SAMPLE-AES";
  private static final String METHOD_SAMPLE_AES_CENC = "SAMPLE-AES-CENC";
  private static final String METHOD_SAMPLE_AES_CTR = "SAMPLE-AES-CTR";
  private static final String PLAYLIST_HEADER = "#EXTM3U";
  private static final Pattern REGEX_ATTR_BYTERANGE;
  private static final Pattern REGEX_AUDIO;
  private static final Pattern REGEX_AUTOSELECT;
  private static final Pattern REGEX_AVERAGE_BANDWIDTH = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
  private static final Pattern REGEX_BANDWIDTH;
  private static final Pattern REGEX_BYTERANGE;
  private static final Pattern REGEX_CODECS;
  private static final Pattern REGEX_DEFAULT;
  private static final Pattern REGEX_FORCED;
  private static final Pattern REGEX_FRAME_RATE;
  private static final Pattern REGEX_GROUP_ID;
  private static final Pattern REGEX_IMPORT = Pattern.compile("IMPORT=\"(.+?)\"");
  private static final Pattern REGEX_INSTREAM_ID;
  private static final Pattern REGEX_IV;
  private static final Pattern REGEX_KEYFORMAT;
  private static final Pattern REGEX_KEYFORMATVERSIONS;
  private static final Pattern REGEX_LANGUAGE;
  private static final Pattern REGEX_MEDIA_DURATION;
  private static final Pattern REGEX_MEDIA_SEQUENCE;
  private static final Pattern REGEX_MEDIA_TITLE;
  private static final Pattern REGEX_METHOD;
  private static final Pattern REGEX_NAME;
  private static final Pattern REGEX_PLAYLIST_TYPE;
  private static final Pattern REGEX_RESOLUTION;
  private static final Pattern REGEX_TARGET_DURATION;
  private static final Pattern REGEX_TIME_OFFSET;
  private static final Pattern REGEX_TYPE;
  private static final Pattern REGEX_URI;
  private static final Pattern REGEX_VALUE;
  private static final Pattern REGEX_VARIABLE_REFERENCE = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
  private static final Pattern REGEX_VERSION;
  private static final String TAG_BYTERANGE = "#EXT-X-BYTERANGE";
  private static final String TAG_DEFINE = "#EXT-X-DEFINE";
  private static final String TAG_DISCONTINUITY = "#EXT-X-DISCONTINUITY";
  private static final String TAG_DISCONTINUITY_SEQUENCE = "#EXT-X-DISCONTINUITY-SEQUENCE";
  private static final String TAG_ENDLIST = "#EXT-X-ENDLIST";
  private static final String TAG_GAP = "#EXT-X-GAP";
  private static final String TAG_INDEPENDENT_SEGMENTS = "#EXT-X-INDEPENDENT-SEGMENTS";
  private static final String TAG_INIT_SEGMENT = "#EXT-X-MAP";
  private static final String TAG_KEY = "#EXT-X-KEY";
  private static final String TAG_MEDIA = "#EXT-X-MEDIA";
  private static final String TAG_MEDIA_DURATION = "#EXTINF";
  private static final String TAG_MEDIA_SEQUENCE = "#EXT-X-MEDIA-SEQUENCE";
  private static final String TAG_PLAYLIST_TYPE = "#EXT-X-PLAYLIST-TYPE";
  private static final String TAG_PREFIX = "#EXT";
  private static final String TAG_PROGRAM_DATE_TIME = "#EXT-X-PROGRAM-DATE-TIME";
  private static final String TAG_START = "#EXT-X-START";
  private static final String TAG_STREAM_INF = "#EXT-X-STREAM-INF";
  private static final String TAG_TARGET_DURATION = "#EXT-X-TARGETDURATION";
  private static final String TAG_VERSION = "#EXT-X-VERSION";
  private static final String TYPE_AUDIO = "AUDIO";
  private static final String TYPE_CLOSED_CAPTIONS = "CLOSED-CAPTIONS";
  private static final String TYPE_SUBTITLES = "SUBTITLES";
  private static final String TYPE_VIDEO = "VIDEO";
  private final HlsMasterPlaylist masterPlaylist;
  
  static
  {
    REGEX_AUDIO = Pattern.compile("AUDIO=\"(.+?)\"");
    REGEX_BANDWIDTH = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    REGEX_CODECS = Pattern.compile("CODECS=\"(.+?)\"");
    REGEX_RESOLUTION = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    REGEX_FRAME_RATE = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    REGEX_TARGET_DURATION = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    REGEX_VERSION = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    REGEX_PLAYLIST_TYPE = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    REGEX_MEDIA_SEQUENCE = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    REGEX_MEDIA_DURATION = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    REGEX_MEDIA_TITLE = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    REGEX_TIME_OFFSET = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    REGEX_BYTERANGE = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    REGEX_ATTR_BYTERANGE = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    REGEX_METHOD = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    REGEX_KEYFORMAT = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    REGEX_KEYFORMATVERSIONS = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    REGEX_URI = Pattern.compile("URI=\"(.+?)\"");
    REGEX_IV = Pattern.compile("IV=([^,.*]+)");
    REGEX_TYPE = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    REGEX_LANGUAGE = Pattern.compile("LANGUAGE=\"(.+?)\"");
    REGEX_NAME = Pattern.compile("NAME=\"(.+?)\"");
    REGEX_GROUP_ID = Pattern.compile("GROUP-ID=\"(.+?)\"");
    REGEX_INSTREAM_ID = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    REGEX_AUTOSELECT = compileBooleanAttrPattern("AUTOSELECT");
    REGEX_DEFAULT = compileBooleanAttrPattern("DEFAULT");
    REGEX_FORCED = compileBooleanAttrPattern("FORCED");
    REGEX_VALUE = Pattern.compile("VALUE=\"(.+?)\"");
  }
  
  public HlsPlaylistParser()
  {
    this(HlsMasterPlaylist.EMPTY);
  }
  
  public HlsPlaylistParser(HlsMasterPlaylist paramHlsMasterPlaylist)
  {
    masterPlaylist = paramHlsMasterPlaylist;
  }
  
  private static boolean checkPlaylistHeader(BufferedReader paramBufferedReader)
    throws IOException
  {
    int i = paramBufferedReader.read();
    int j = i;
    if (i == 239) {
      if ((paramBufferedReader.read() == 187) && (paramBufferedReader.read() == 191)) {
        j = paramBufferedReader.read();
      } else {
        return false;
      }
    }
    i = skipIgnorableWhitespace(paramBufferedReader, true, j);
    for (j = 0; j < 7; j++)
    {
      if (i != "#EXTM3U".charAt(j)) {
        return false;
      }
      i = paramBufferedReader.read();
    }
    return Util.isLinebreak(skipIgnorableWhitespace(paramBufferedReader, false, i));
  }
  
  private static Pattern compileBooleanAttrPattern(String paramString)
  {
    paramString = a.t(paramString, "=(", "NO", "|", "YES");
    paramString.append(")");
    return Pattern.compile(paramString.toString());
  }
  
  private static double parseDoubleAttr(String paramString, Pattern paramPattern)
    throws ParserException
  {
    return Double.parseDouble(parseStringAttr(paramString, paramPattern, Collections.emptyMap()));
  }
  
  private static int parseIntAttr(String paramString, Pattern paramPattern)
    throws ParserException
  {
    return Integer.parseInt(parseStringAttr(paramString, paramPattern, Collections.emptyMap()));
  }
  
  private static long parseLongAttr(String paramString, Pattern paramPattern)
    throws ParserException
  {
    return Long.parseLong(parseStringAttr(paramString, paramPattern, Collections.emptyMap()));
  }
  
  private static HlsMasterPlaylist parseMasterPlaylist(LineIterator paramLineIterator, String paramString)
    throws IOException
  {
    Object localObject1 = new HashSet();
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    ArrayList localArrayList4 = new ArrayList();
    ArrayList localArrayList5 = new ArrayList();
    int i = 0;
    boolean bool1 = false;
    boolean bool2 = bool1;
    String str1;
    int j;
    Object localObject3;
    int k;
    while (paramLineIterator.hasNext())
    {
      str1 = paramLineIterator.next();
      if (str1.startsWith("#EXT")) {
        localArrayList5.add(str1);
      }
      if (str1.startsWith("#EXT-X-DEFINE"))
      {
        localHashMap2.put(parseStringAttr(str1, REGEX_NAME, localHashMap2), parseStringAttr(str1, REGEX_VALUE, localHashMap2));
      }
      else if (str1.equals("#EXT-X-INDEPENDENT-SEGMENTS"))
      {
        bool2 = true;
      }
      else if (str1.startsWith("#EXT-X-MEDIA"))
      {
        localArrayList4.add(str1);
      }
      else if (str1.startsWith("#EXT-X-STREAM-INF"))
      {
        boolean bool3 = bool1 | str1.contains("CLOSED-CAPTIONS=NONE");
        j = parseIntAttr(str1, REGEX_BANDWIDTH);
        localObject2 = parseOptionalStringAttr(str1, REGEX_AVERAGE_BANDWIDTH, localHashMap2);
        if (localObject2 != null) {
          j = Integer.parseInt((String)localObject2);
        }
        localObject2 = parseOptionalStringAttr(str1, REGEX_CODECS, localHashMap2);
        localObject3 = parseOptionalStringAttr(str1, REGEX_RESOLUTION, localHashMap2);
        if (localObject3 != null)
        {
          localObject3 = ((String)localObject3).split("x");
          k = Integer.parseInt(localObject3[0]);
          int m = Integer.parseInt(localObject3[1]);
          if (k > 0)
          {
            n = m;
            if (m > 0) {}
          }
          else
          {
            k = -1;
            n = -1;
          }
        }
        else
        {
          k = -1;
          n = -1;
        }
        float f = -1.0F;
        localObject3 = parseOptionalStringAttr(str1, REGEX_FRAME_RATE, localHashMap2);
        if (localObject3 != null) {
          f = Float.parseFloat((String)localObject3);
        }
        str1 = parseOptionalStringAttr(str1, REGEX_AUDIO, localHashMap2);
        if ((str1 != null) && (localObject2 != null)) {
          localHashMap1.put(str1, Util.getCodecsOfType((String)localObject2, 1));
        }
        str1 = replaceVariableReferences(paramLineIterator.next(), localHashMap2);
        bool1 = bool3;
        if (((HashSet)localObject1).add(str1))
        {
          localArrayList1.add(new HlsMasterPlaylist.HlsUrl(str1, Format.createVideoContainerFormat(Integer.toString(localArrayList1.size()), null, "application/x-mpegURL", null, (String)localObject2, j, k, n, f, null, 0)));
          bool1 = bool3;
        }
      }
    }
    Object localObject2 = null;
    paramLineIterator = null;
    for (int n = i; n < localArrayList4.size(); n++)
    {
      String str2 = (String)localArrayList4.get(n);
      j = parseSelectionFlags(str2);
      str1 = parseOptionalStringAttr(str2, REGEX_URI, localHashMap2);
      String str3 = parseStringAttr(str2, REGEX_NAME, localHashMap2);
      localObject3 = parseOptionalStringAttr(str2, REGEX_LANGUAGE, localHashMap2);
      localObject1 = parseOptionalStringAttr(str2, REGEX_GROUP_ID, localHashMap2);
      String str4 = z2.p((String)localObject1, ":", str3);
      String str5 = parseStringAttr(str2, REGEX_TYPE, localHashMap2);
      str5.getClass();
      switch (str5.hashCode())
      {
      default: 
        break;
      case 62628790: 
        if (str5.equals("AUDIO")) {
          k = 2;
        }
        break;
      case -333210994: 
        if (str5.equals("CLOSED-CAPTIONS")) {
          k = 1;
        }
        break;
      case -959297733: 
        if (str5.equals("SUBTITLES")) {
          k = 0;
        }
        break;
      }
      k = -1;
      switch (k)
      {
      default: 
        break;
      case 2: 
        str5 = (String)localHashMap1.get(localObject1);
        if (str5 != null) {
          localObject1 = MimeTypes.getMediaMimeType(str5);
        } else {
          localObject1 = null;
        }
        localObject1 = Format.createAudioContainerFormat(str4, str3, "application/x-mpegURL", (String)localObject1, str5, -1, -1, -1, null, j, (String)localObject3);
        if (str1 == null) {
          localObject2 = localObject1;
        } else {
          localArrayList2.add(new HlsMasterPlaylist.HlsUrl(str1, (Format)localObject1));
        }
        break;
      case 1: 
        localObject1 = parseStringAttr(str2, REGEX_INSTREAM_ID, localHashMap2);
        if (((String)localObject1).startsWith("CC"))
        {
          k = Integer.parseInt(((String)localObject1).substring(2));
          str1 = "application/cea-608";
        }
        else
        {
          k = Integer.parseInt(((String)localObject1).substring(7));
          str1 = "application/cea-708";
        }
        localObject1 = paramLineIterator;
        if (paramLineIterator == null) {
          localObject1 = new ArrayList();
        }
        ((List)localObject1).add(Format.createTextContainerFormat(str4, str3, null, str1, null, -1, j, (String)localObject3, k));
        paramLineIterator = (LineIterator)localObject1;
        break;
      case 0: 
        localArrayList3.add(new HlsMasterPlaylist.HlsUrl(str1, Format.createTextContainerFormat(str4, str3, "application/x-mpegURL", "text/vtt", null, -1, j, (String)localObject3)));
      }
    }
    if (bool1) {
      paramLineIterator = Collections.emptyList();
    }
    return new HlsMasterPlaylist(paramString, localArrayList5, localArrayList1, localArrayList2, localArrayList3, (Format)localObject2, paramLineIterator, bool2, localHashMap2);
  }
  
  private static HlsMediaPlaylist parseMediaPlaylist(HlsMasterPlaylist paramHlsMasterPlaylist, LineIterator paramLineIterator, String paramString)
    throws IOException
  {
    boolean bool1 = hasIndependentSegments;
    HashMap localHashMap = new HashMap();
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    TreeMap localTreeMap = new TreeMap();
    long l1 = -9223372036854775807L;
    long l2 = l1;
    int i = 0;
    int j = i;
    int m = j;
    int n = m;
    int i1 = n;
    int i3 = 1;
    Object localObject1 = null;
    long l3 = 0L;
    long l4 = 0L;
    Object localObject2 = null;
    long l5 = 0L;
    long l6 = 0L;
    DrmInitData localDrmInitData = null;
    long l7 = 0L;
    Object localObject3 = null;
    Object localObject4 = null;
    Object localObject5 = null;
    int i4 = m;
    long l8 = -1L;
    boolean bool3 = false;
    String str1 = "";
    long l9 = 0L;
    m = i1;
    long l10 = l6;
    label133:
    int k;
    label693:
    int i5;
    boolean bool2;
    label1268:
    for (;;)
    {
      if (!paramLineIterator.hasNext()) {
        break label1271;
      }
      String str2 = paramLineIterator.next();
      if (str2.startsWith("#EXT")) {
        localArrayList2.add(str2);
      }
      Object localObject6;
      if (str2.startsWith("#EXT-X-PLAYLIST-TYPE"))
      {
        localObject6 = parseStringAttr(str2, REGEX_PLAYLIST_TYPE, localHashMap);
        if ("VOD".equals(localObject6)) {
          j = 1;
        } else if ("EVENT".equals(localObject6)) {
          k = 2;
        }
      }
      else if (str2.startsWith("#EXT-X-START"))
      {
        l1 = (parseDoubleAttr(str2, REGEX_TIME_OFFSET) * 1000000.0D);
      }
      else if (str2.startsWith("#EXT-X-MAP"))
      {
        localObject6 = parseStringAttr(str2, REGEX_URI, localHashMap);
        localObject5 = parseOptionalStringAttr(str2, REGEX_ATTR_BYTERANGE, localHashMap);
        l6 = l5;
        if (localObject5 != null)
        {
          localObject5 = ((String)localObject5).split("@");
          long l11 = Long.parseLong(localObject5[0]);
          l6 = l5;
          l8 = l11;
          if (localObject5.length > 1)
          {
            l6 = Long.parseLong(localObject5[1]);
            l8 = l11;
          }
        }
        localObject5 = new HlsMediaPlaylist.Segment((String)localObject6, l6, l8);
        l5 = 0L;
        l8 = -1L;
      }
      else if (str2.startsWith("#EXT-X-TARGETDURATION"))
      {
        l2 = 1000000L * parseIntAttr(str2, REGEX_TARGET_DURATION);
      }
      else if (str2.startsWith("#EXT-X-MEDIA-SEQUENCE"))
      {
        l10 = parseLongAttr(str2, REGEX_MEDIA_SEQUENCE);
        l4 = l10;
      }
      else if (str2.startsWith("#EXT-X-VERSION"))
      {
        i3 = parseIntAttr(str2, REGEX_VERSION);
      }
      else
      {
        if (str2.startsWith("#EXT-X-DEFINE"))
        {
          localObject6 = parseOptionalStringAttr(str2, REGEX_IMPORT, localHashMap);
          if (localObject6 != null)
          {
            str2 = (String)variableDefinitions.get(localObject6);
            if (str2 != null) {
              localHashMap.put(localObject6, str2);
            }
          }
          else
          {
            localHashMap.put(parseStringAttr(str2, REGEX_NAME, localHashMap), parseStringAttr(str2, REGEX_VALUE, localHashMap));
          }
        }
        for (;;)
        {
          break label1268;
          if (str2.startsWith("#EXTINF"))
          {
            l9 = (parseDoubleAttr(str2, REGEX_MEDIA_DURATION) * 1000000.0D);
            str1 = parseOptionalStringAttr(str2, REGEX_MEDIA_TITLE, "", localHashMap);
            break label133;
          }
          Object localObject7;
          if (str2.startsWith("#EXT-X-KEY"))
          {
            String str3 = parseStringAttr(str2, REGEX_METHOD, localHashMap);
            localObject7 = parseOptionalStringAttr(str2, REGEX_KEYFORMAT, "identity", localHashMap);
            if ("NONE".equals(str3))
            {
              localTreeMap.clear();
              localDrmInitData = null;
              localObject3 = null;
              localObject4 = null;
              break label133;
            }
            localObject6 = parseOptionalStringAttr(str2, REGEX_IV, localHashMap);
            if ("identity".equals(localObject7))
            {
              localObject3 = localObject1;
              if ("AES-128".equals(str3))
              {
                localObject3 = parseStringAttr(str2, REGEX_URI, localHashMap);
                localObject4 = localObject6;
                break label133;
              }
              localObject4 = localObject3;
            }
            for (;;)
            {
              localObject3 = null;
              localObject1 = localObject4;
              localObject4 = localObject6;
              break;
              localObject4 = localObject1;
              if (localObject1 == null) {
                if ((!"SAMPLE-AES-CENC".equals(str3)) && (!"SAMPLE-AES-CTR".equals(str3))) {
                  localObject4 = "cbcs";
                } else {
                  localObject4 = "cenc";
                }
              }
              if ("com.microsoft.playready".equals(localObject7)) {
                localObject1 = parsePlayReadySchemeData(str2, localHashMap);
              } else {
                localObject1 = parseWidevineSchemeData(str2, (String)localObject7, localHashMap);
              }
              localObject3 = localObject4;
              if (localObject1 == null) {
                break label693;
              }
              localTreeMap.put(localObject7, localObject1);
              localDrmInitData = null;
            }
          }
          if (str2.startsWith("#EXT-X-BYTERANGE"))
          {
            localObject6 = parseStringAttr(str2, REGEX_BYTERANGE, localHashMap).split("@");
            l6 = Long.parseLong(localObject6[0]);
            l8 = l6;
            if (localObject6.length <= 1) {
              break label133;
            }
            l5 = Long.parseLong(localObject6[1]);
            l8 = l6;
            break label133;
          }
          if (str2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE"))
          {
            i5 = Integer.parseInt(str2.substring(str2.indexOf(':') + 1));
            i = 1;
            break label133;
          }
          if (str2.equals("#EXT-X-DISCONTINUITY"))
          {
            m++;
            break label133;
          }
          if (str2.startsWith("#EXT-X-PROGRAM-DATE-TIME"))
          {
            if (l3 != 0L) {
              continue;
            }
            l3 = C.msToUs(Util.parseXsDateTime(str2.substring(str2.indexOf(':') + 1))) - l7;
            break label133;
          }
          if (str2.equals("#EXT-X-GAP"))
          {
            bool3 = true;
            break label133;
          }
          if (str2.equals("#EXT-X-INDEPENDENT-SEGMENTS"))
          {
            bool1 = true;
            break label133;
          }
          if (str2.equals("#EXT-X-ENDLIST"))
          {
            bool2 = true;
            break label133;
          }
          if (!str2.startsWith("#"))
          {
            if (localObject3 == null) {
              localObject6 = null;
            } else if (localObject4 != null) {
              localObject6 = localObject4;
            } else {
              localObject6 = Long.toHexString(l10);
            }
            boolean bool4 = l8 < -1L;
            l6 = l5;
            if (!bool4) {
              l6 = 0L;
            }
            if ((localDrmInitData == null) && (!localTreeMap.isEmpty()))
            {
              localObject7 = (DrmInitData.SchemeData[])localTreeMap.values().toArray(new DrmInitData.SchemeData[0]);
              localDrmInitData = new DrmInitData((String)localObject1, (DrmInitData.SchemeData[])localObject7);
              if (localObject2 == null)
              {
                localObject2 = new DrmInitData.SchemeData[localObject7.length];
                for (i2 = 0; i2 < localObject7.length; i2++) {
                  localObject2[i2] = localObject7[i2].copyWithData(null);
                }
                localObject2 = new DrmInitData((String)localObject1, (DrmInitData.SchemeData[])localObject2);
              }
              else {}
            }
            localArrayList1.add(new HlsMediaPlaylist.Segment(replaceVariableReferences(str2, localHashMap), (HlsMediaPlaylist.Segment)localObject5, str1, l9, m, l7, localDrmInitData, (String)localObject3, (String)localObject6, l6, l8, bool3));
            l7 += l9;
            l5 = l6;
            if (bool4) {
              l5 = l6 + l8;
            }
            l6 = l10 + 1L;
            int i2 = m;
            break;
          }
        }
      }
    }
    label1271:
    if (l3 != 0L) {
      bool3 = true;
    } else {
      bool3 = false;
    }
    return new HlsMediaPlaylist(k, paramString, localArrayList2, l1, l3, i, i5, l4, i3, l2, bool1, bool2, bool3, (DrmInitData)localObject2, localArrayList1);
  }
  
  private static boolean parseOptionalBooleanAttribute(String paramString, Pattern paramPattern, boolean paramBoolean)
  {
    paramString = paramPattern.matcher(paramString);
    if (paramString.find()) {
      return paramString.group(1).equals("YES");
    }
    return paramBoolean;
  }
  
  private static String parseOptionalStringAttr(String paramString1, Pattern paramPattern, String paramString2, Map<String, String> paramMap)
  {
    paramString1 = paramPattern.matcher(paramString1);
    if (paramString1.find()) {
      paramString2 = paramString1.group(1);
    }
    paramString1 = paramString2;
    if (!paramMap.isEmpty()) {
      if (paramString2 == null) {
        paramString1 = paramString2;
      } else {
        paramString1 = replaceVariableReferences(paramString2, paramMap);
      }
    }
    return paramString1;
  }
  
  @Nullable
  private static String parseOptionalStringAttr(String paramString, Pattern paramPattern, Map<String, String> paramMap)
  {
    return parseOptionalStringAttr(paramString, paramPattern, null, paramMap);
  }
  
  @Nullable
  private static DrmInitData.SchemeData parsePlayReadySchemeData(String paramString, Map<String, String> paramMap)
    throws ParserException
  {
    if (!"1".equals(parseOptionalStringAttr(paramString, REGEX_KEYFORMATVERSIONS, "1", paramMap))) {
      return null;
    }
    paramString = parseStringAttr(paramString, REGEX_URI, paramMap);
    paramString = Base64.decode(paramString.substring(paramString.indexOf(',')), 0);
    paramMap = C.PLAYREADY_UUID;
    return new DrmInitData.SchemeData(paramMap, "video/mp4", PsshAtomUtil.buildPsshAtom(paramMap, paramString));
  }
  
  private static int parseSelectionFlags(String paramString)
  {
    boolean bool1 = parseOptionalBooleanAttribute(paramString, REGEX_DEFAULT, false);
    boolean bool2 = bool1;
    int j;
    if (parseOptionalBooleanAttribute(paramString, REGEX_FORCED, false)) {
      j = bool1 | true;
    }
    bool1 = j;
    int i;
    if (parseOptionalBooleanAttribute(paramString, REGEX_AUTOSELECT, false)) {
      i = j | 0x4;
    }
    return i;
  }
  
  private static String parseStringAttr(String paramString, Pattern paramPattern, Map<String, String> paramMap)
    throws ParserException
  {
    paramMap = parseOptionalStringAttr(paramString, paramPattern, paramMap);
    if (paramMap != null) {
      return paramMap;
    }
    paramMap = z2.t("Couldn't match ");
    paramMap.append(paramPattern.pattern());
    paramMap.append(" in ");
    paramMap.append(paramString);
    throw new ParserException(paramMap.toString());
  }
  
  @Nullable
  private static DrmInitData.SchemeData parseWidevineSchemeData(String paramString1, String paramString2, Map<String, String> paramMap)
    throws ParserException
  {
    if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(paramString2))
    {
      paramString1 = parseStringAttr(paramString1, REGEX_URI, paramMap);
      return new DrmInitData.SchemeData(C.WIDEVINE_UUID, "video/mp4", Base64.decode(paramString1.substring(paramString1.indexOf(',')), 0));
    }
    if ("com.widevine".equals(paramString2)) {
      try
      {
        paramString1 = new DrmInitData.SchemeData(C.WIDEVINE_UUID, "hls", paramString1.getBytes("UTF-8"));
        return paramString1;
      }
      catch (UnsupportedEncodingException paramString1)
      {
        throw new ParserException(paramString1);
      }
    }
    return null;
  }
  
  private static String replaceVariableReferences(String paramString, Map<String, String> paramMap)
  {
    Matcher localMatcher = REGEX_VARIABLE_REFERENCE.matcher(paramString);
    paramString = new StringBuffer();
    while (localMatcher.find())
    {
      String str = localMatcher.group(1);
      if (paramMap.containsKey(str)) {
        localMatcher.appendReplacement(paramString, Matcher.quoteReplacement((String)paramMap.get(str)));
      }
    }
    localMatcher.appendTail(paramString);
    return paramString.toString();
  }
  
  private static int skipIgnorableWhitespace(BufferedReader paramBufferedReader, boolean paramBoolean, int paramInt)
    throws IOException
  {
    while ((paramInt != -1) && (Character.isWhitespace(paramInt)) && ((paramBoolean) || (!Util.isLinebreak(paramInt)))) {
      paramInt = paramBufferedReader.read();
    }
    return paramInt;
  }
  
  public HlsPlaylist parse(Uri paramUri, InputStream paramInputStream)
    throws IOException
  {
    paramInputStream = new BufferedReader(new InputStreamReader(paramInputStream));
    Object localObject1 = new ArrayDeque();
    try
    {
      if (checkPlaylistHeader(paramInputStream))
      {
        for (;;)
        {
          localObject2 = paramInputStream.readLine();
          if (localObject2 == null) {
            break label241;
          }
          localObject2 = ((String)localObject2).trim();
          if (!((String)localObject2).isEmpty())
          {
            if (((String)localObject2).startsWith("#EXT-X-STREAM-INF"))
            {
              ((ArrayDeque)localObject1).add(localObject2);
              localObject2 = new com/google/android/exoplayer2/source/hls/playlist/HlsPlaylistParser$LineIterator;
              ((LineIterator)localObject2).<init>((Queue)localObject1, paramInputStream);
              paramUri = parseMasterPlaylist((LineIterator)localObject2, paramUri.toString());
              return paramUri;
            }
            if ((((String)localObject2).startsWith("#EXT-X-TARGETDURATION")) || (((String)localObject2).startsWith("#EXT-X-MEDIA-SEQUENCE")) || (((String)localObject2).startsWith("#EXTINF")) || (((String)localObject2).startsWith("#EXT-X-KEY")) || (((String)localObject2).startsWith("#EXT-X-BYTERANGE")) || (((String)localObject2).equals("#EXT-X-DISCONTINUITY")) || (((String)localObject2).equals("#EXT-X-DISCONTINUITY-SEQUENCE")) || (((String)localObject2).equals("#EXT-X-ENDLIST"))) {
              break;
            }
            ((ArrayDeque)localObject1).add(localObject2);
          }
        }
        ((ArrayDeque)localObject1).add(localObject2);
        HlsMasterPlaylist localHlsMasterPlaylist = masterPlaylist;
        Object localObject2 = new com/google/android/exoplayer2/source/hls/playlist/HlsPlaylistParser$LineIterator;
        ((LineIterator)localObject2).<init>((Queue)localObject1, paramInputStream);
        paramUri = parseMediaPlaylist(localHlsMasterPlaylist, (LineIterator)localObject2, paramUri.toString());
        return paramUri;
        label241:
        throw new ParserException("Failed to parse the playlist, could not identify any tags.");
      }
      localObject1 = new com/google/android/exoplayer2/source/UnrecognizedInputFormatException;
      ((UnrecognizedInputFormatException)localObject1).<init>("Input does not start with the #EXTM3U header.", paramUri);
      throw ((Throwable)localObject1);
    }
    finally
    {
      Util.closeQuietly(paramInputStream);
    }
  }
  
  public static class LineIterator
  {
    private final Queue<String> extraLines;
    private String next;
    private final BufferedReader reader;
    
    public LineIterator(Queue<String> paramQueue, BufferedReader paramBufferedReader)
    {
      extraLines = paramQueue;
      reader = paramBufferedReader;
    }
    
    public boolean hasNext()
      throws IOException
    {
      if (next != null) {
        return true;
      }
      if (!extraLines.isEmpty())
      {
        next = ((String)extraLines.poll());
        return true;
      }
      String str;
      do
      {
        str = reader.readLine();
        next = str;
        if (str == null) {
          break;
        }
        str = str.trim();
        next = str;
      } while (str.isEmpty());
      return true;
      return false;
    }
    
    public String next()
      throws IOException
    {
      boolean bool = hasNext();
      String str = null;
      if (bool)
      {
        str = next;
        next = null;
      }
      return str;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */