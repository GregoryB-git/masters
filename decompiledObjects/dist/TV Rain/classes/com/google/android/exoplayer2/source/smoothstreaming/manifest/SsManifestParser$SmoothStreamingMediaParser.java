package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.exoplayer2.util.Assertions;
import java.util.LinkedList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

class SsManifestParser$SmoothStreamingMediaParser
  extends SsManifestParser.ElementParser
{
  private static final String KEY_DURATION = "Duration";
  private static final String KEY_DVR_WINDOW_LENGTH = "DVRWindowLength";
  private static final String KEY_IS_LIVE = "IsLive";
  private static final String KEY_LOOKAHEAD_COUNT = "LookaheadCount";
  private static final String KEY_MAJOR_VERSION = "MajorVersion";
  private static final String KEY_MINOR_VERSION = "MinorVersion";
  private static final String KEY_TIME_SCALE = "TimeScale";
  public static final String TAG = "SmoothStreamingMedia";
  private long duration;
  private long dvrWindowLength;
  private boolean isLive;
  private int lookAheadCount = -1;
  private int majorVersion;
  private int minorVersion;
  private SsManifest.ProtectionElement protectionElement = null;
  private final List<SsManifest.StreamElement> streamElements = new LinkedList();
  private long timescale;
  
  public SsManifestParser$SmoothStreamingMediaParser(SsManifestParser.ElementParser paramElementParser, String paramString)
  {
    super(paramElementParser, paramString, "SmoothStreamingMedia");
  }
  
  public void addChild(Object paramObject)
  {
    if ((paramObject instanceof SsManifest.StreamElement))
    {
      streamElements.add((SsManifest.StreamElement)paramObject);
    }
    else if ((paramObject instanceof SsManifest.ProtectionElement))
    {
      boolean bool;
      if (protectionElement == null) {
        bool = true;
      } else {
        bool = false;
      }
      Assertions.checkState(bool);
      protectionElement = ((SsManifest.ProtectionElement)paramObject);
    }
  }
  
  public Object build()
  {
    int i = streamElements.size();
    SsManifest.StreamElement[] arrayOfStreamElement = new SsManifest.StreamElement[i];
    streamElements.toArray(arrayOfStreamElement);
    if (protectionElement != null)
    {
      Object localObject = protectionElement;
      DrmInitData localDrmInitData = new DrmInitData(new DrmInitData.SchemeData[] { new DrmInitData.SchemeData(uuid, "video/mp4", data) });
      for (int j = 0; j < i; j++)
      {
        SsManifest.StreamElement localStreamElement = arrayOfStreamElement[j];
        for (int k = 0;; k++)
        {
          localObject = formats;
          if (k >= localObject.length) {
            break;
          }
          localObject[k] = localObject[k].copyWithDrmInitData(localDrmInitData);
        }
      }
    }
    return new SsManifest(majorVersion, minorVersion, timescale, duration, dvrWindowLength, lookAheadCount, isLive, protectionElement, arrayOfStreamElement);
  }
  
  public void parseStartTag(XmlPullParser paramXmlPullParser)
    throws ParserException
  {
    majorVersion = parseRequiredInt(paramXmlPullParser, "MajorVersion");
    minorVersion = parseRequiredInt(paramXmlPullParser, "MinorVersion");
    timescale = parseLong(paramXmlPullParser, "TimeScale", 10000000L);
    duration = parseRequiredLong(paramXmlPullParser, "Duration");
    dvrWindowLength = parseLong(paramXmlPullParser, "DVRWindowLength", 0L);
    lookAheadCount = parseInt(paramXmlPullParser, "LookaheadCount", -1);
    isLive = parseBoolean(paramXmlPullParser, "IsLive", false);
    putNormalizedAttribute("TimeScale", Long.valueOf(timescale));
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.SmoothStreamingMediaParser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */