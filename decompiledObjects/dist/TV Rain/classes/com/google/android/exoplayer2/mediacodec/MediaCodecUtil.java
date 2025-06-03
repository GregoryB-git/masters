package com.google.android.exoplayer2.mediacodec;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import z2;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
public final class MediaCodecUtil
{
  private static final SparseIntArray AVC_LEVEL_NUMBER_TO_CONST;
  private static final SparseIntArray AVC_PROFILE_NUMBER_TO_CONST;
  private static final String CODEC_ID_AVC1 = "avc1";
  private static final String CODEC_ID_AVC2 = "avc2";
  private static final String CODEC_ID_HEV1 = "hev1";
  private static final String CODEC_ID_HVC1 = "hvc1";
  private static final String CODEC_ID_MP4A = "mp4a";
  private static final Map<String, Integer> HEVC_CODEC_STRING_TO_PROFILE_LEVEL;
  private static final SparseIntArray MP4A_AUDIO_OBJECT_TYPE_TO_PROFILE;
  private static final Pattern PROFILE_PATTERN = Pattern.compile("^\\D?(\\d+)$");
  private static final RawAudioCodecComparator RAW_AUDIO_CODEC_COMPARATOR = new RawAudioCodecComparator(null);
  private static final String TAG = "MediaCodecUtil";
  private static final HashMap<CodecKey, List<MediaCodecInfo>> decoderInfosCache = new HashMap();
  private static int maxH264DecodableFrameSize = -1;
  
  static
  {
    Object localObject = new SparseIntArray();
    AVC_PROFILE_NUMBER_TO_CONST = (SparseIntArray)localObject;
    ((SparseIntArray)localObject).put(66, 1);
    ((SparseIntArray)localObject).put(77, 2);
    ((SparseIntArray)localObject).put(88, 4);
    ((SparseIntArray)localObject).put(100, 8);
    ((SparseIntArray)localObject).put(110, 16);
    ((SparseIntArray)localObject).put(122, 32);
    ((SparseIntArray)localObject).put(244, 64);
    localObject = new SparseIntArray();
    AVC_LEVEL_NUMBER_TO_CONST = (SparseIntArray)localObject;
    ((SparseIntArray)localObject).put(10, 1);
    ((SparseIntArray)localObject).put(11, 4);
    ((SparseIntArray)localObject).put(12, 8);
    ((SparseIntArray)localObject).put(13, 16);
    ((SparseIntArray)localObject).put(20, 32);
    ((SparseIntArray)localObject).put(21, 64);
    ((SparseIntArray)localObject).put(22, 128);
    ((SparseIntArray)localObject).put(30, 256);
    ((SparseIntArray)localObject).put(31, 512);
    ((SparseIntArray)localObject).put(32, 1024);
    ((SparseIntArray)localObject).put(40, 2048);
    ((SparseIntArray)localObject).put(41, 4096);
    ((SparseIntArray)localObject).put(42, 8192);
    ((SparseIntArray)localObject).put(50, 16384);
    ((SparseIntArray)localObject).put(51, 32768);
    ((SparseIntArray)localObject).put(52, 65536);
    localObject = new HashMap();
    HEVC_CODEC_STRING_TO_PROFILE_LEVEL = (Map)localObject;
    z2.z(1, (HashMap)localObject, "L30", 4, "L60", 16, "L63", 64, "L90");
    z2.z(256, (HashMap)localObject, "L93", 1024, "L120", 4096, "L123", 16384, "L150");
    z2.z(65536, (HashMap)localObject, "L153", 262144, "L156", 1048576, "L180", 4194304, "L183");
    z2.z(16777216, (HashMap)localObject, "L186", 2, "H30", 8, "H60", 32, "H63");
    z2.z(128, (HashMap)localObject, "H90", 512, "H93", 2048, "H120", 8192, "H123");
    z2.z(32768, (HashMap)localObject, "H150", 131072, "H153", 524288, "H156", 2097152, "H180");
    ((Map)localObject).put("H183", Integer.valueOf(8388608));
    ((Map)localObject).put("H186", Integer.valueOf(33554432));
    localObject = new SparseIntArray();
    MP4A_AUDIO_OBJECT_TYPE_TO_PROFILE = (SparseIntArray)localObject;
    ((SparseIntArray)localObject).put(1, 1);
    ((SparseIntArray)localObject).put(2, 2);
    ((SparseIntArray)localObject).put(3, 3);
    ((SparseIntArray)localObject).put(4, 4);
    ((SparseIntArray)localObject).put(5, 5);
    ((SparseIntArray)localObject).put(6, 6);
    ((SparseIntArray)localObject).put(17, 17);
    ((SparseIntArray)localObject).put(20, 20);
    ((SparseIntArray)localObject).put(23, 23);
    ((SparseIntArray)localObject).put(29, 29);
    ((SparseIntArray)localObject).put(39, 39);
    ((SparseIntArray)localObject).put(42, 42);
  }
  
  private static void applyWorkarounds(String paramString, List<MediaCodecInfo> paramList)
  {
    if ("audio/raw".equals(paramString)) {
      Collections.sort(paramList, RAW_AUDIO_CODEC_COMPARATOR);
    }
  }
  
  private static int avcLevelToMaxFrameSize(int paramInt)
  {
    if ((paramInt != 1) && (paramInt != 2))
    {
      switch (paramInt)
      {
      default: 
        return -1;
      case 32768: 
      case 65536: 
        return 9437184;
      case 16384: 
        return 5652480;
      case 8192: 
        return 2228224;
      case 2048: 
      case 4096: 
        return 2097152;
      case 1024: 
        return 1310720;
      case 512: 
        return 921600;
      case 128: 
      case 256: 
        return 414720;
      case 64: 
        return 202752;
      }
      return 101376;
    }
    return 25344;
  }
  
  private static boolean codecNeedsDisableAdaptationWorkaround(String paramString)
  {
    if (Util.SDK_INT <= 22)
    {
      String str = Util.MODEL;
      if ((("ODROID-XU3".equals(str)) || ("Nexus 10".equals(str))) && (("OMX.Exynos.AVC.Decoder".equals(paramString)) || ("OMX.Exynos.AVC.Decoder.secure".equals(paramString)))) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  @Nullable
  private static Pair<Integer, Integer> getAacCodecProfileAndLevel(String paramString, String[] paramArrayOfString)
  {
    if (paramArrayOfString.length != 3)
    {
      z2.y("Ignoring malformed MP4A codec string: ", paramString, "MediaCodecUtil");
      return null;
    }
    try
    {
      if ("audio/mp4a-latm".equals(MimeTypes.getMimeTypeFromMp4ObjectType(Integer.parseInt(paramArrayOfString[1], 16))))
      {
        int i = Integer.parseInt(paramArrayOfString[2]);
        i = MP4A_AUDIO_OBJECT_TYPE_TO_PROFILE.get(i, -1);
        if (i != -1)
        {
          paramArrayOfString = new Pair(Integer.valueOf(i), Integer.valueOf(0));
          return paramArrayOfString;
        }
      }
    }
    catch (NumberFormatException paramArrayOfString)
    {
      z2.y("Ignoring malformed MP4A codec string: ", paramString, "MediaCodecUtil");
    }
    return null;
  }
  
  private static Pair<Integer, Integer> getAvcProfileAndLevel(String paramString, String[] paramArrayOfString)
  {
    if (paramArrayOfString.length < 2)
    {
      z2.y("Ignoring malformed AVC codec string: ", paramString, "MediaCodecUtil");
      return null;
    }
    try
    {
      Integer localInteger2;
      if (paramArrayOfString[1].length() == 6)
      {
        Integer localInteger1 = Integer.valueOf(Integer.parseInt(paramArrayOfString[1].substring(0, 2), 16));
        localInteger2 = Integer.valueOf(Integer.parseInt(paramArrayOfString[1].substring(4), 16));
        paramArrayOfString = localInteger1;
        paramString = localInteger2;
      }
      else
      {
        if (paramArrayOfString.length < 3) {
          break label222;
        }
        i = Integer.parseInt(paramArrayOfString[1]);
        localInteger2 = Integer.valueOf(Integer.parseInt(paramArrayOfString[2]));
        paramArrayOfString = Integer.valueOf(i);
        paramString = localInteger2;
      }
      int i = AVC_PROFILE_NUMBER_TO_CONST.get(paramArrayOfString.intValue(), -1);
      if (i == -1)
      {
        paramString = new StringBuilder();
        paramString.append("Unknown AVC profile: ");
        paramString.append(paramArrayOfString);
        Log.w("MediaCodecUtil", paramString.toString());
        return null;
      }
      int j = AVC_LEVEL_NUMBER_TO_CONST.get(paramString.intValue(), -1);
      if (j == -1)
      {
        paramArrayOfString = new StringBuilder();
        paramArrayOfString.append("Unknown AVC level: ");
        paramArrayOfString.append(paramString);
        Log.w("MediaCodecUtil", paramArrayOfString.toString());
        return null;
      }
      return new Pair(Integer.valueOf(i), Integer.valueOf(j));
      label222:
      paramArrayOfString = new java/lang/StringBuilder;
      paramArrayOfString.<init>();
      paramArrayOfString.append("Ignoring malformed AVC codec string: ");
      paramArrayOfString.append(paramString);
      Log.w("MediaCodecUtil", paramArrayOfString.toString());
      return null;
    }
    catch (NumberFormatException paramArrayOfString)
    {
      z2.y("Ignoring malformed AVC codec string: ", paramString, "MediaCodecUtil");
    }
    return null;
  }
  
  @Nullable
  public static Pair<Integer, Integer> getCodecProfileAndLevel(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    String[] arrayOfString = paramString.split("\\.");
    int i = 0;
    String str = arrayOfString[0];
    str.getClass();
    switch (str.hashCode())
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
              i = -1;
              break;
            } while (!str.equals("mp4a"));
            i = 4;
            break;
          } while (!str.equals("hvc1"));
          i = 3;
          break;
        } while (!str.equals("hev1"));
        i = 2;
        break;
      } while (!str.equals("avc2"));
      i = 1;
      break;
    } while (!str.equals("avc1"));
    switch (i)
    {
    default: 
      return null;
    case 4: 
      return getAacCodecProfileAndLevel(paramString, arrayOfString);
    case 2: 
    case 3: 
      return getHevcProfileAndLevel(paramString, arrayOfString);
    }
    return getAvcProfileAndLevel(paramString, arrayOfString);
  }
  
  @Nullable
  public static MediaCodecInfo getDecoderInfo(String paramString, boolean paramBoolean)
    throws MediaCodecUtil.DecoderQueryException
  {
    paramString = getDecoderInfos(paramString, paramBoolean);
    if (paramString.isEmpty()) {
      paramString = null;
    } else {
      paramString = (MediaCodecInfo)paramString.get(0);
    }
    return paramString;
  }
  
  public static List<MediaCodecInfo> getDecoderInfos(String paramString, boolean paramBoolean)
    throws MediaCodecUtil.DecoderQueryException
  {
    try
    {
      CodecKey localCodecKey = new com/google/android/exoplayer2/mediacodec/MediaCodecUtil$CodecKey;
      localCodecKey.<init>(paramString, paramBoolean);
      HashMap localHashMap = decoderInfosCache;
      Object localObject1 = (List)localHashMap.get(localCodecKey);
      if (localObject1 != null) {
        return (List<MediaCodecInfo>)localObject1;
      }
      int i = Util.SDK_INT;
      if (i >= 21)
      {
        localObject1 = new com/google/android/exoplayer2/mediacodec/MediaCodecUtil$MediaCodecListCompatV21;
        ((MediaCodecListCompatV21)localObject1).<init>(paramBoolean);
      }
      else
      {
        localObject1 = new MediaCodecListCompatV16(null);
      }
      Object localObject2 = getDecoderInfosInternal(localCodecKey, (MediaCodecListCompat)localObject1, paramString);
      Object localObject3 = localObject1;
      Object localObject4 = localObject2;
      if (paramBoolean)
      {
        localObject3 = localObject1;
        localObject4 = localObject2;
        if (((ArrayList)localObject2).isEmpty())
        {
          localObject3 = localObject1;
          localObject4 = localObject2;
          if (21 <= i)
          {
            localObject3 = localObject1;
            localObject4 = localObject2;
            if (i <= 23)
            {
              localObject2 = new com/google/android/exoplayer2/mediacodec/MediaCodecUtil$MediaCodecListCompatV16;
              ((MediaCodecListCompatV16)localObject2).<init>(null);
              localObject1 = getDecoderInfosInternal(localCodecKey, (MediaCodecListCompat)localObject2, paramString);
              localObject3 = localObject2;
              localObject4 = localObject1;
              if (!((ArrayList)localObject1).isEmpty())
              {
                localObject3 = new java/lang/StringBuilder;
                ((StringBuilder)localObject3).<init>();
                ((StringBuilder)localObject3).append("MediaCodecList API didn't list secure decoder for: ");
                ((StringBuilder)localObject3).append(paramString);
                ((StringBuilder)localObject3).append(". Assuming: ");
                ((StringBuilder)localObject3).append(get0name);
                Log.w("MediaCodecUtil", ((StringBuilder)localObject3).toString());
                localObject4 = localObject1;
                localObject3 = localObject2;
              }
            }
          }
        }
      }
      if ("audio/eac3-joc".equals(paramString))
      {
        localObject1 = new com/google/android/exoplayer2/mediacodec/MediaCodecUtil$CodecKey;
        ((CodecKey)localObject1).<init>("audio/eac3", secure);
        ((ArrayList)localObject4).addAll(getDecoderInfosInternal((CodecKey)localObject1, (MediaCodecListCompat)localObject3, paramString));
      }
      applyWorkarounds(paramString, (List)localObject4);
      paramString = Collections.unmodifiableList((List)localObject4);
      localHashMap.put(localCodecKey, paramString);
      return paramString;
    }
    finally {}
  }
  
  private static ArrayList<MediaCodecInfo> getDecoderInfosInternal(CodecKey paramCodecKey, MediaCodecListCompat paramMediaCodecListCompat, String paramString)
    throws MediaCodecUtil.DecoderQueryException
  {
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      String str1 = mimeType;
      int i = paramMediaCodecListCompat.getCodecCount();
      boolean bool1 = paramMediaCodecListCompat.secureDecodersExplicit();
      int j = 0;
      while (j < i)
      {
        android.media.MediaCodecInfo localMediaCodecInfo = paramMediaCodecListCompat.getCodecInfoAt(j);
        String str2 = localMediaCodecInfo.getName();
        int k = i;
        if (isCodecUsableDecoder(localMediaCodecInfo, str2, bool1, paramString))
        {
          String[] arrayOfString = localMediaCodecInfo.getSupportedTypes();
          int m = arrayOfString.length;
          for (int n = 0;; n++)
          {
            k = i;
            if (n >= m) {
              break;
            }
            String str3 = arrayOfString[n];
            boolean bool2 = str3.equalsIgnoreCase(str1);
            if (bool2) {
              try
              {
                MediaCodecInfo.CodecCapabilities localCodecCapabilities = localMediaCodecInfo.getCapabilitiesForType(str3);
                boolean bool3 = paramMediaCodecListCompat.isSecurePlaybackSupported(str1, localCodecCapabilities);
                bool2 = codecNeedsDisableAdaptationWorkaround(str2);
                if (bool1) {}
                for (;;)
                {
                  try
                  {
                    if (secure != bool3) {
                      break label174;
                    }
                  }
                  catch (Exception localException1)
                  {
                    break label270;
                  }
                  label174:
                  if ((bool1) || (secure)) {
                    break;
                  }
                }
                localArrayList.add(MediaCodecInfo.newInstance(str2, str1, localCodecCapabilities, bool2, false));
                continue;
                if ((!bool1) && (bool3))
                {
                  StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
                  localStringBuilder1.<init>();
                  localStringBuilder1.append(str2);
                  localStringBuilder1.append(".secure");
                  localArrayList.add(MediaCodecInfo.newInstance(localStringBuilder1.toString(), str1, localCodecCapabilities, bool2, true));
                  return localArrayList;
                }
              }
              catch (Exception localException2)
              {
                label270:
                k = Util.SDK_INT;
                StringBuilder localStringBuilder2;
                if ((k <= 23) && (!localArrayList.isEmpty()))
                {
                  localStringBuilder2 = new java/lang/StringBuilder;
                  localStringBuilder2.<init>();
                  localStringBuilder2.append("Skipping codec ");
                  localStringBuilder2.append(str2);
                  localStringBuilder2.append(" (failed to query capabilities)");
                  Log.e("MediaCodecUtil", localStringBuilder2.toString());
                }
                else
                {
                  paramCodecKey = new java/lang/StringBuilder;
                  paramCodecKey.<init>();
                  paramCodecKey.append("Failed to query codec ");
                  paramCodecKey.append(str2);
                  paramCodecKey.append(" (");
                  paramCodecKey.append(str3);
                  paramCodecKey.append(")");
                  Log.e("MediaCodecUtil", paramCodecKey.toString());
                  throw localStringBuilder2;
                }
              }
            }
          }
        }
        j++;
        i = k;
      }
      return localArrayList;
    }
    catch (Exception paramCodecKey)
    {
      throw new DecoderQueryException(paramCodecKey, null);
    }
  }
  
  private static Pair<Integer, Integer> getHevcProfileAndLevel(String paramString, String[] paramArrayOfString)
  {
    if (paramArrayOfString.length < 4)
    {
      z2.y("Ignoring malformed HEVC codec string: ", paramString, "MediaCodecUtil");
      return null;
    }
    Matcher localMatcher = PROFILE_PATTERN.matcher(paramArrayOfString[1]);
    if (!localMatcher.matches())
    {
      z2.y("Ignoring malformed HEVC codec string: ", paramString, "MediaCodecUtil");
      return null;
    }
    paramString = localMatcher.group(1);
    int i;
    if ("1".equals(paramString))
    {
      i = 1;
    }
    else
    {
      if (!"2".equals(paramString)) {
        break label138;
      }
      i = 2;
    }
    paramString = (Integer)HEVC_CODEC_STRING_TO_PROFILE_LEVEL.get(paramArrayOfString[3]);
    if (paramString == null)
    {
      paramString = z2.t("Unknown HEVC level string: ");
      paramString.append(localMatcher.group(1));
      Log.w("MediaCodecUtil", paramString.toString());
      return null;
    }
    return new Pair(Integer.valueOf(i), paramString);
    label138:
    z2.y("Unknown HEVC profile string: ", paramString, "MediaCodecUtil");
    return null;
  }
  
  @Nullable
  public static MediaCodecInfo getPassthroughDecoderInfo()
    throws MediaCodecUtil.DecoderQueryException
  {
    MediaCodecInfo localMediaCodecInfo = getDecoderInfo("audio/raw", false);
    if (localMediaCodecInfo == null) {
      localMediaCodecInfo = null;
    } else {
      localMediaCodecInfo = MediaCodecInfo.newPassthroughInstance(name);
    }
    return localMediaCodecInfo;
  }
  
  private static boolean isCodecUsableDecoder(android.media.MediaCodecInfo paramMediaCodecInfo, String paramString1, boolean paramBoolean, String paramString2)
  {
    if ((!paramMediaCodecInfo.isEncoder()) && ((paramBoolean) || (!paramString1.endsWith(".secure"))))
    {
      int i = Util.SDK_INT;
      if ((i < 21) && (("CIPAACDecoder".equals(paramString1)) || ("CIPMP3Decoder".equals(paramString1)) || ("CIPVorbisDecoder".equals(paramString1)) || ("CIPAMRNBDecoder".equals(paramString1)) || ("AACDecoder".equals(paramString1)) || ("MP3Decoder".equals(paramString1)))) {
        return false;
      }
      if ((i < 18) && ("OMX.SEC.MP3.Decoder".equals(paramString1))) {
        return false;
      }
      if (("OMX.SEC.mp3.dec".equals(paramString1)) && ("SM-T530".equals(Util.MODEL))) {
        return false;
      }
      if ((i < 18) && ("OMX.MTK.AUDIO.DECODER.AAC".equals(paramString1)))
      {
        paramMediaCodecInfo = Util.DEVICE;
        if (("a70".equals(paramMediaCodecInfo)) || (("Xiaomi".equals(Util.MANUFACTURER)) && (paramMediaCodecInfo.startsWith("HM")))) {
          return false;
        }
      }
      if ((i == 16) && ("OMX.qcom.audio.decoder.mp3".equals(paramString1)))
      {
        paramMediaCodecInfo = Util.DEVICE;
        if (("dlxu".equals(paramMediaCodecInfo)) || ("protou".equals(paramMediaCodecInfo)) || ("ville".equals(paramMediaCodecInfo)) || ("villeplus".equals(paramMediaCodecInfo)) || ("villec2".equals(paramMediaCodecInfo)) || (paramMediaCodecInfo.startsWith("gee")) || ("C6602".equals(paramMediaCodecInfo)) || ("C6603".equals(paramMediaCodecInfo)) || ("C6606".equals(paramMediaCodecInfo)) || ("C6616".equals(paramMediaCodecInfo)) || ("L36h".equals(paramMediaCodecInfo)) || ("SO-02E".equals(paramMediaCodecInfo))) {
          return false;
        }
      }
      if ((i == 16) && ("OMX.qcom.audio.decoder.aac".equals(paramString1)))
      {
        paramMediaCodecInfo = Util.DEVICE;
        if (("C1504".equals(paramMediaCodecInfo)) || ("C1505".equals(paramMediaCodecInfo)) || ("C1604".equals(paramMediaCodecInfo)) || ("C1605".equals(paramMediaCodecInfo))) {
          return false;
        }
      }
      if ((i < 24) && (("OMX.SEC.aac.dec".equals(paramString1)) || ("OMX.Exynos.AAC.Decoder".equals(paramString1))) && ("samsung".equals(Util.MANUFACTURER)))
      {
        paramMediaCodecInfo = Util.DEVICE;
        if ((paramMediaCodecInfo.startsWith("zeroflte")) || (paramMediaCodecInfo.startsWith("zerolte")) || (paramMediaCodecInfo.startsWith("zenlte")) || ("SC-05G".equals(paramMediaCodecInfo)) || ("marinelteatt".equals(paramMediaCodecInfo)) || ("404SC".equals(paramMediaCodecInfo)) || ("SC-04G".equals(paramMediaCodecInfo)) || ("SCV31".equals(paramMediaCodecInfo))) {
          return false;
        }
      }
      if ((i <= 19) && ("OMX.SEC.vp8.dec".equals(paramString1)) && ("samsung".equals(Util.MANUFACTURER)))
      {
        paramMediaCodecInfo = Util.DEVICE;
        if ((paramMediaCodecInfo.startsWith("d2")) || (paramMediaCodecInfo.startsWith("serrano")) || (paramMediaCodecInfo.startsWith("jflte")) || (paramMediaCodecInfo.startsWith("santos")) || (paramMediaCodecInfo.startsWith("t0"))) {
          return false;
        }
      }
      if ((i <= 19) && (Util.DEVICE.startsWith("jflte")) && ("OMX.qcom.video.decoder.vp8".equals(paramString1))) {
        return false;
      }
      return (!"audio/eac3-joc".equals(paramString2)) || (!"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(paramString1));
    }
    return false;
  }
  
  public static int maxH264DecodableFrameSize()
    throws MediaCodecUtil.DecoderQueryException
  {
    if (maxH264DecodableFrameSize == -1)
    {
      int i = 0;
      int j = 0;
      Object localObject = getDecoderInfo("video/avc", false);
      if (localObject != null)
      {
        localObject = ((MediaCodecInfo)localObject).getProfileLevels();
        int k = localObject.length;
        i = 0;
        while (j < k)
        {
          i = Math.max(avcLevelToMaxFrameSize(level), i);
          j++;
        }
        if (Util.SDK_INT >= 21) {
          j = 345600;
        } else {
          j = 172800;
        }
        i = Math.max(i, j);
      }
      maxH264DecodableFrameSize = i;
    }
    return maxH264DecodableFrameSize;
  }
  
  public static void warmDecoderInfoCache(String paramString, boolean paramBoolean)
  {
    try
    {
      getDecoderInfos(paramString, paramBoolean);
    }
    catch (DecoderQueryException paramString)
    {
      Log.e("MediaCodecUtil", "Codec warming failed", paramString);
    }
  }
  
  public static final class CodecKey
  {
    public final String mimeType;
    public final boolean secure;
    
    public CodecKey(String paramString, boolean paramBoolean)
    {
      mimeType = paramString;
      secure = paramBoolean;
    }
    
    public boolean equals(@Nullable Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (paramObject.getClass() == CodecKey.class))
      {
        paramObject = (CodecKey)paramObject;
        if ((!TextUtils.equals(mimeType, mimeType)) || (secure != secure)) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public int hashCode()
    {
      String str = mimeType;
      int i;
      if (str == null) {
        i = 0;
      } else {
        i = str.hashCode();
      }
      int j;
      if (secure) {
        j = 1231;
      } else {
        j = 1237;
      }
      return (i + 31) * 31 + j;
    }
  }
  
  public static class DecoderQueryException
    extends Exception
  {
    private DecoderQueryException(Throwable paramThrowable)
    {
      super(paramThrowable);
    }
  }
  
  public static abstract interface MediaCodecListCompat
  {
    public abstract int getCodecCount();
    
    public abstract android.media.MediaCodecInfo getCodecInfoAt(int paramInt);
    
    public abstract boolean isSecurePlaybackSupported(String paramString, MediaCodecInfo.CodecCapabilities paramCodecCapabilities);
    
    public abstract boolean secureDecodersExplicit();
  }
  
  public static final class MediaCodecListCompatV16
    implements MediaCodecUtil.MediaCodecListCompat
  {
    public int getCodecCount()
    {
      return MediaCodecList.getCodecCount();
    }
    
    public android.media.MediaCodecInfo getCodecInfoAt(int paramInt)
    {
      return MediaCodecList.getCodecInfoAt(paramInt);
    }
    
    public boolean isSecurePlaybackSupported(String paramString, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
    {
      return "video/avc".equals(paramString);
    }
    
    public boolean secureDecodersExplicit()
    {
      return false;
    }
  }
  
  @TargetApi(21)
  public static final class MediaCodecListCompatV21
    implements MediaCodecUtil.MediaCodecListCompat
  {
    private final int codecKind;
    private android.media.MediaCodecInfo[] mediaCodecInfos;
    
    public MediaCodecListCompatV21(boolean paramBoolean)
    {
      codecKind = paramBoolean;
    }
    
    private void ensureMediaCodecInfosInitialized()
    {
      if (mediaCodecInfos == null) {
        mediaCodecInfos = new MediaCodecList(codecKind).getCodecInfos();
      }
    }
    
    public int getCodecCount()
    {
      ensureMediaCodecInfosInitialized();
      return mediaCodecInfos.length;
    }
    
    public android.media.MediaCodecInfo getCodecInfoAt(int paramInt)
    {
      ensureMediaCodecInfosInitialized();
      return mediaCodecInfos[paramInt];
    }
    
    public boolean isSecurePlaybackSupported(String paramString, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
    {
      return paramCodecCapabilities.isFeatureSupported("secure-playback");
    }
    
    public boolean secureDecodersExplicit()
    {
      return true;
    }
  }
  
  public static final class RawAudioCodecComparator
    implements Comparator<MediaCodecInfo>
  {
    private static int scoreMediaCodecInfo(MediaCodecInfo paramMediaCodecInfo)
    {
      paramMediaCodecInfo = name;
      if ((!paramMediaCodecInfo.startsWith("OMX.google")) && (!paramMediaCodecInfo.startsWith("c2.android")))
      {
        if ((Util.SDK_INT < 26) && (paramMediaCodecInfo.equals("OMX.MTK.AUDIO.DECODER.RAW"))) {
          return 1;
        }
        return 0;
      }
      return -1;
    }
    
    public int compare(MediaCodecInfo paramMediaCodecInfo1, MediaCodecInfo paramMediaCodecInfo2)
    {
      return scoreMediaCodecInfo(paramMediaCodecInfo1) - scoreMediaCodecInfo(paramMediaCodecInfo2);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.mediacodec.MediaCodecUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */