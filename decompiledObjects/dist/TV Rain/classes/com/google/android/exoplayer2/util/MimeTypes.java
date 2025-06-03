package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import z2;

public final class MimeTypes
{
  public static final String APPLICATION_CAMERA_MOTION = "application/x-camera-motion";
  public static final String APPLICATION_CEA608 = "application/cea-608";
  public static final String APPLICATION_CEA708 = "application/cea-708";
  public static final String APPLICATION_DVBSUBS = "application/dvbsubs";
  public static final String APPLICATION_EMSG = "application/x-emsg";
  public static final String APPLICATION_EXIF = "application/x-exif";
  public static final String APPLICATION_ID3 = "application/id3";
  public static final String APPLICATION_M3U8 = "application/x-mpegURL";
  public static final String APPLICATION_MP4 = "application/mp4";
  public static final String APPLICATION_MP4CEA608 = "application/x-mp4-cea-608";
  public static final String APPLICATION_MP4VTT = "application/x-mp4-vtt";
  public static final String APPLICATION_MPD = "application/dash+xml";
  public static final String APPLICATION_PGS = "application/pgs";
  public static final String APPLICATION_RAWCC = "application/x-rawcc";
  public static final String APPLICATION_SCTE35 = "application/x-scte35";
  public static final String APPLICATION_SS = "application/vnd.ms-sstr+xml";
  public static final String APPLICATION_SUBRIP = "application/x-subrip";
  public static final String APPLICATION_TTML = "application/ttml+xml";
  public static final String APPLICATION_TX3G = "application/x-quicktime-tx3g";
  public static final String APPLICATION_VOBSUB = "application/vobsub";
  public static final String APPLICATION_WEBM = "application/webm";
  public static final String AUDIO_AAC = "audio/mp4a-latm";
  public static final String AUDIO_AC3 = "audio/ac3";
  public static final String AUDIO_ALAC = "audio/alac";
  public static final String AUDIO_ALAW = "audio/g711-alaw";
  public static final String AUDIO_AMR_NB = "audio/3gpp";
  public static final String AUDIO_AMR_WB = "audio/amr-wb";
  public static final String AUDIO_DTS = "audio/vnd.dts";
  public static final String AUDIO_DTS_EXPRESS = "audio/vnd.dts.hd;profile=lbr";
  public static final String AUDIO_DTS_HD = "audio/vnd.dts.hd";
  public static final String AUDIO_E_AC3 = "audio/eac3";
  public static final String AUDIO_E_AC3_JOC = "audio/eac3-joc";
  public static final String AUDIO_FLAC = "audio/flac";
  public static final String AUDIO_MLAW = "audio/g711-mlaw";
  public static final String AUDIO_MP4 = "audio/mp4";
  public static final String AUDIO_MPEG = "audio/mpeg";
  public static final String AUDIO_MPEG_L1 = "audio/mpeg-L1";
  public static final String AUDIO_MPEG_L2 = "audio/mpeg-L2";
  public static final String AUDIO_MSGSM = "audio/gsm";
  public static final String AUDIO_OPUS = "audio/opus";
  public static final String AUDIO_RAW = "audio/raw";
  public static final String AUDIO_TRUEHD = "audio/true-hd";
  public static final String AUDIO_UNKNOWN = "audio/x-unknown";
  public static final String AUDIO_VORBIS = "audio/vorbis";
  public static final String AUDIO_WEBM = "audio/webm";
  public static final String BASE_TYPE_APPLICATION = "application";
  public static final String BASE_TYPE_AUDIO = "audio";
  public static final String BASE_TYPE_TEXT = "text";
  public static final String BASE_TYPE_VIDEO = "video";
  public static final String TEXT_SSA = "text/x-ssa";
  public static final String TEXT_VTT = "text/vtt";
  public static final String VIDEO_H263 = "video/3gpp";
  public static final String VIDEO_H264 = "video/avc";
  public static final String VIDEO_H265 = "video/hevc";
  public static final String VIDEO_MP4 = "video/mp4";
  public static final String VIDEO_MP4V = "video/mp4v-es";
  public static final String VIDEO_MPEG = "video/mpeg";
  public static final String VIDEO_MPEG2 = "video/mpeg2";
  public static final String VIDEO_UNKNOWN = "video/x-unknown";
  public static final String VIDEO_VC1 = "video/wvc1";
  public static final String VIDEO_VP8 = "video/x-vnd.on2.vp8";
  public static final String VIDEO_VP9 = "video/x-vnd.on2.vp9";
  public static final String VIDEO_WEBM = "video/webm";
  private static final ArrayList<CustomMimeType> customMimeTypes = new ArrayList();
  
  @Nullable
  public static String getAudioMediaMimeType(@Nullable String paramString)
  {
    if (paramString == null) {
      return null;
    }
    String[] arrayOfString = Util.splitCodecs(paramString);
    int i = arrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      paramString = getMediaMimeType(arrayOfString[j]);
      if ((paramString != null) && (isAudio(paramString))) {
        return paramString;
      }
    }
    return null;
  }
  
  @Nullable
  private static String getCustomMimeTypeForCodec(String paramString)
  {
    int i = customMimeTypes.size();
    for (int j = 0; j < i; j++)
    {
      CustomMimeType localCustomMimeType = (CustomMimeType)customMimeTypes.get(j);
      if (paramString.startsWith(codecPrefix)) {
        return mimeType;
      }
    }
    return null;
  }
  
  public static int getEncoding(String paramString)
  {
    paramString.getClass();
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1556697186: 
      if (paramString.equals("audio/true-hd")) {
        j = 5;
      }
      break;
    case 1505942594: 
      if (paramString.equals("audio/vnd.dts.hd")) {
        j = 4;
      }
      break;
    case 1504578661: 
      if (paramString.equals("audio/eac3")) {
        j = 3;
      }
      break;
    case 187078296: 
      if (paramString.equals("audio/ac3")) {
        j = 2;
      }
      break;
    case -1095064472: 
      if (paramString.equals("audio/vnd.dts")) {
        j = 1;
      }
      break;
    case -2123537834: 
      if (paramString.equals("audio/eac3-joc")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      return 0;
    case 5: 
      return 14;
    case 4: 
      return 8;
    case 2: 
      return 5;
    case 1: 
      return 7;
    }
    return 6;
  }
  
  @Nullable
  public static String getMediaMimeType(@Nullable String paramString)
  {
    String str1 = null;
    if (paramString == null) {
      return null;
    }
    String str2 = paramString.trim();
    if ((!str2.startsWith("avc1")) && (!str2.startsWith("avc3"))) {
      if ((!str2.startsWith("hev1")) && (!str2.startsWith("hvc1"))) {
        if ((!str2.startsWith("vp9")) && (!str2.startsWith("vp09"))) {
          if ((!str2.startsWith("vp8")) && (!str2.startsWith("vp08"))) {
            if (str2.startsWith("mp4a"))
            {
              paramString = str1;
              if (str2.startsWith("mp4a."))
              {
                str2 = str2.substring(5);
                paramString = str1;
                if (str2.length() < 2) {}
              }
            }
          }
        }
      }
    }
    try
    {
      paramString = getMimeTypeFromMp4ObjectType(Integer.parseInt(Util.toUpperInvariant(str2.substring(0, 2)), 16));
      str1 = paramString;
      if (paramString == null) {
        str1 = "audio/mp4a-latm";
      }
      return str1;
      if ((!str2.startsWith("ac-3")) && (!str2.startsWith("dac3")))
      {
        if ((!str2.startsWith("ec-3")) && (!str2.startsWith("dec3")))
        {
          if (str2.startsWith("ec+3")) {
            return "audio/eac3-joc";
          }
          if ((!str2.startsWith("dtsc")) && (!str2.startsWith("dtse")))
          {
            if ((!str2.startsWith("dtsh")) && (!str2.startsWith("dtsl")))
            {
              if (str2.startsWith("opus")) {
                return "audio/opus";
              }
              if (str2.startsWith("vorbis")) {
                return "audio/vorbis";
              }
              return getCustomMimeTypeForCodec(str2);
            }
            return "audio/vnd.dts.hd";
          }
          return "audio/vnd.dts";
        }
        return "audio/eac3";
      }
      return "audio/ac3";
      return "video/x-vnd.on2.vp8";
      return "video/x-vnd.on2.vp9";
      return "video/hevc";
      return "video/avc";
    }
    catch (NumberFormatException paramString)
    {
      for (;;)
      {
        paramString = str1;
      }
    }
  }
  
  @Nullable
  public static String getMimeTypeFromMp4ObjectType(int paramInt)
  {
    if (paramInt != 32)
    {
      if (paramInt != 33)
      {
        if (paramInt != 35)
        {
          if (paramInt != 64)
          {
            if (paramInt != 163) {
              if (paramInt != 177) {
                if (paramInt != 165) {
                  if (paramInt == 166) {}
                }
              }
            }
            switch (paramInt)
            {
            default: 
              switch (paramInt)
              {
              default: 
                return null;
              case 173: 
                return "audio/opus";
              case 170: 
              case 171: 
                return "audio/vnd.dts.hd";
              }
              return "audio/vnd.dts";
            case 106: 
              return "video/mpeg";
            case 105: 
            case 107: 
              return "audio/mpeg";
            case 96: 
            case 97: 
            case 98: 
            case 99: 
            case 100: 
            case 101: 
              return "video/mpeg2";
              return "audio/eac3";
              return "audio/ac3";
              return "video/x-vnd.on2.vp9";
              return "video/wvc1";
            }
          }
          return "audio/mp4a-latm";
        }
        return "video/hevc";
      }
      return "video/avc";
    }
    return "video/mp4v-es";
  }
  
  @Nullable
  private static String getTopLevelType(@Nullable String paramString)
  {
    if (paramString == null) {
      return null;
    }
    int i = paramString.indexOf('/');
    if (i != -1) {
      return paramString.substring(0, i);
    }
    throw new IllegalArgumentException(z2.o("Invalid mime type: ", paramString));
  }
  
  public static int getTrackType(@Nullable String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return -1;
    }
    if (isAudio(paramString)) {
      return 1;
    }
    if (isVideo(paramString)) {
      return 2;
    }
    if ((!isText(paramString)) && (!"application/cea-608".equals(paramString)) && (!"application/cea-708".equals(paramString)) && (!"application/x-mp4-cea-608".equals(paramString)) && (!"application/x-subrip".equals(paramString)) && (!"application/ttml+xml".equals(paramString)) && (!"application/x-quicktime-tx3g".equals(paramString)) && (!"application/x-mp4-vtt".equals(paramString)) && (!"application/x-rawcc".equals(paramString)) && (!"application/vobsub".equals(paramString)) && (!"application/pgs".equals(paramString)) && (!"application/dvbsubs".equals(paramString)))
    {
      if ((!"application/id3".equals(paramString)) && (!"application/x-emsg".equals(paramString)) && (!"application/x-scte35".equals(paramString)))
      {
        if ("application/x-camera-motion".equals(paramString)) {
          return 5;
        }
        return getTrackTypeForCustomMimeType(paramString);
      }
      return 4;
    }
    return 3;
  }
  
  private static int getTrackTypeForCustomMimeType(String paramString)
  {
    int i = customMimeTypes.size();
    for (int j = 0; j < i; j++)
    {
      CustomMimeType localCustomMimeType = (CustomMimeType)customMimeTypes.get(j);
      if (paramString.equals(mimeType)) {
        return trackType;
      }
    }
    return -1;
  }
  
  public static int getTrackTypeOfCodec(String paramString)
  {
    return getTrackType(getMediaMimeType(paramString));
  }
  
  @Nullable
  public static String getVideoMediaMimeType(@Nullable String paramString)
  {
    if (paramString == null) {
      return null;
    }
    String[] arrayOfString = Util.splitCodecs(paramString);
    int i = arrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      paramString = getMediaMimeType(arrayOfString[j]);
      if ((paramString != null) && (isVideo(paramString))) {
        return paramString;
      }
    }
    return null;
  }
  
  public static boolean isApplication(@Nullable String paramString)
  {
    return "application".equals(getTopLevelType(paramString));
  }
  
  public static boolean isAudio(@Nullable String paramString)
  {
    return "audio".equals(getTopLevelType(paramString));
  }
  
  public static boolean isText(@Nullable String paramString)
  {
    return "text".equals(getTopLevelType(paramString));
  }
  
  public static boolean isVideo(@Nullable String paramString)
  {
    return "video".equals(getTopLevelType(paramString));
  }
  
  public static void registerCustomMimeType(String paramString1, String paramString2, int paramInt)
  {
    CustomMimeType localCustomMimeType = new CustomMimeType(paramString1, paramString2, paramInt);
    int i = customMimeTypes.size();
    for (paramInt = 0; paramInt < i; paramInt++)
    {
      paramString2 = customMimeTypes;
      if (paramString1.equals(getmimeType))
      {
        paramString2.remove(paramInt);
        break;
      }
    }
    customMimeTypes.add(localCustomMimeType);
  }
  
  public static final class CustomMimeType
  {
    public final String codecPrefix;
    public final String mimeType;
    public final int trackType;
    
    public CustomMimeType(String paramString1, String paramString2, int paramInt)
    {
      mimeType = paramString1;
      codecPrefix = paramString2;
      trackType = paramInt;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.MimeTypes
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */