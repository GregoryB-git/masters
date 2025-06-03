package com.google.android.exoplayer2.mediacodec;

import a;
import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo.AudioCapabilities;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import z2;

@TargetApi(16)
public final class MediaCodecInfo
{
  public static final int MAX_SUPPORTED_INSTANCES_UNKNOWN = -1;
  public static final String TAG = "MediaCodecInfo";
  public final boolean adaptive;
  @Nullable
  public final MediaCodecInfo.CodecCapabilities capabilities;
  private final boolean isVideo;
  @Nullable
  public final String mimeType;
  public final String name;
  public final boolean passthrough;
  public final boolean secure;
  public final boolean tunneling;
  
  private MediaCodecInfo(String paramString1, @Nullable String paramString2, @Nullable MediaCodecInfo.CodecCapabilities paramCodecCapabilities, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    name = ((String)Assertions.checkNotNull(paramString1));
    mimeType = paramString2;
    capabilities = paramCodecCapabilities;
    passthrough = paramBoolean1;
    boolean bool = true;
    if ((!paramBoolean2) && (paramCodecCapabilities != null) && (isAdaptive(paramCodecCapabilities))) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    adaptive = paramBoolean1;
    if ((paramCodecCapabilities != null) && (isTunneling(paramCodecCapabilities))) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    tunneling = paramBoolean1;
    paramBoolean1 = bool;
    if (!paramBoolean3) {
      if ((paramCodecCapabilities != null) && (isSecure(paramCodecCapabilities))) {
        paramBoolean1 = bool;
      } else {
        paramBoolean1 = false;
      }
    }
    secure = paramBoolean1;
    isVideo = MimeTypes.isVideo(paramString2);
  }
  
  private static int adjustMaxInputChannelCount(String paramString1, String paramString2, int paramInt)
  {
    if ((paramInt <= 1) && ((Util.SDK_INT < 26) || (paramInt <= 0)) && (!"audio/mpeg".equals(paramString2)) && (!"audio/3gpp".equals(paramString2)) && (!"audio/amr-wb".equals(paramString2)) && (!"audio/mp4a-latm".equals(paramString2)) && (!"audio/vorbis".equals(paramString2)) && (!"audio/opus".equals(paramString2)) && (!"audio/raw".equals(paramString2)) && (!"audio/flac".equals(paramString2)) && (!"audio/g711-alaw".equals(paramString2)) && (!"audio/g711-mlaw".equals(paramString2)) && (!"audio/gsm".equals(paramString2)))
    {
      int i;
      if ("audio/ac3".equals(paramString2)) {
        i = 6;
      } else if ("audio/eac3".equals(paramString2)) {
        i = 16;
      } else {
        i = 30;
      }
      paramString2 = new StringBuilder();
      paramString2.append("AssumedMaxChannelAdjustment: ");
      paramString2.append(paramString1);
      paramString2.append(", [");
      paramString2.append(paramInt);
      paramString2.append(" to ");
      paramString2.append(i);
      paramString2.append("]");
      Log.w("MediaCodecInfo", paramString2.toString());
      return i;
    }
    return paramInt;
  }
  
  @TargetApi(21)
  private static boolean areSizeAndRateSupportedV21(MediaCodecInfo.VideoCapabilities paramVideoCapabilities, int paramInt1, int paramInt2, double paramDouble)
  {
    boolean bool;
    if ((paramDouble != -1.0D) && (paramDouble > 0.0D)) {
      bool = paramVideoCapabilities.areSizeAndRateSupported(paramInt1, paramInt2, paramDouble);
    } else {
      bool = paramVideoCapabilities.isSizeSupported(paramInt1, paramInt2);
    }
    return bool;
  }
  
  @TargetApi(23)
  private static int getMaxSupportedInstancesV23(MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    return paramCodecCapabilities.getMaxSupportedInstances();
  }
  
  private static boolean isAdaptive(MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    boolean bool;
    if ((Util.SDK_INT >= 19) && (isAdaptiveV19(paramCodecCapabilities))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @TargetApi(19)
  private static boolean isAdaptiveV19(MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    return paramCodecCapabilities.isFeatureSupported("adaptive-playback");
  }
  
  private static boolean isSecure(MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    boolean bool;
    if ((Util.SDK_INT >= 21) && (isSecureV21(paramCodecCapabilities))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @TargetApi(21)
  private static boolean isSecureV21(MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    return paramCodecCapabilities.isFeatureSupported("secure-playback");
  }
  
  private static boolean isTunneling(MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    boolean bool;
    if ((Util.SDK_INT >= 21) && (isTunnelingV21(paramCodecCapabilities))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @TargetApi(21)
  private static boolean isTunnelingV21(MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    return paramCodecCapabilities.isFeatureSupported("tunneled-playback");
  }
  
  private void logAssumedSupport(String paramString)
  {
    paramString = a.s("AssumedSupport [", paramString, "] [");
    paramString.append(name);
    paramString.append(", ");
    paramString.append(mimeType);
    paramString.append("] [");
    paramString.append(Util.DEVICE_DEBUG_INFO);
    paramString.append("]");
    Log.d("MediaCodecInfo", paramString.toString());
  }
  
  private void logNoSupport(String paramString)
  {
    paramString = a.s("NoSupport [", paramString, "] [");
    paramString.append(name);
    paramString.append(", ");
    paramString.append(mimeType);
    paramString.append("] [");
    paramString.append(Util.DEVICE_DEBUG_INFO);
    paramString.append("]");
    Log.d("MediaCodecInfo", paramString.toString());
  }
  
  public static MediaCodecInfo newInstance(String paramString1, String paramString2, MediaCodecInfo.CodecCapabilities paramCodecCapabilities)
  {
    return new MediaCodecInfo(paramString1, paramString2, paramCodecCapabilities, false, false, false);
  }
  
  public static MediaCodecInfo newInstance(String paramString1, String paramString2, MediaCodecInfo.CodecCapabilities paramCodecCapabilities, boolean paramBoolean1, boolean paramBoolean2)
  {
    return new MediaCodecInfo(paramString1, paramString2, paramCodecCapabilities, false, paramBoolean1, paramBoolean2);
  }
  
  public static MediaCodecInfo newPassthroughInstance(String paramString)
  {
    return new MediaCodecInfo(paramString, null, null, true, false, false);
  }
  
  @TargetApi(21)
  public Point alignVideoSizeV21(int paramInt1, int paramInt2)
  {
    Object localObject = capabilities;
    if (localObject == null)
    {
      logNoSupport("align.caps");
      return null;
    }
    localObject = ((MediaCodecInfo.CodecCapabilities)localObject).getVideoCapabilities();
    if (localObject == null)
    {
      logNoSupport("align.vCaps");
      return null;
    }
    int i = ((MediaCodecInfo.VideoCapabilities)localObject).getWidthAlignment();
    int j = ((MediaCodecInfo.VideoCapabilities)localObject).getHeightAlignment();
    return new Point(Util.ceilDivide(paramInt1, i) * i, Util.ceilDivide(paramInt2, j) * j);
  }
  
  public int getMaxSupportedInstances()
  {
    if (Util.SDK_INT >= 23)
    {
      MediaCodecInfo.CodecCapabilities localCodecCapabilities = capabilities;
      if (localCodecCapabilities != null) {
        return getMaxSupportedInstancesV23(localCodecCapabilities);
      }
    }
    int i = -1;
    return i;
  }
  
  public MediaCodecInfo.CodecProfileLevel[] getProfileLevels()
  {
    Object localObject = capabilities;
    if (localObject != null)
    {
      MediaCodecInfo.CodecProfileLevel[] arrayOfCodecProfileLevel = profileLevels;
      localObject = arrayOfCodecProfileLevel;
      if (arrayOfCodecProfileLevel != null) {}
    }
    else
    {
      localObject = new MediaCodecInfo.CodecProfileLevel[0];
    }
    return (MediaCodecInfo.CodecProfileLevel[])localObject;
  }
  
  @TargetApi(21)
  public boolean isAudioChannelCountSupportedV21(int paramInt)
  {
    Object localObject = capabilities;
    if (localObject == null)
    {
      logNoSupport("channelCount.caps");
      return false;
    }
    localObject = ((MediaCodecInfo.CodecCapabilities)localObject).getAudioCapabilities();
    if (localObject == null)
    {
      logNoSupport("channelCount.aCaps");
      return false;
    }
    if (adjustMaxInputChannelCount(name, mimeType, ((MediaCodecInfo.AudioCapabilities)localObject).getMaxInputChannelCount()) < paramInt)
    {
      logNoSupport(a.f("channelCount.support, ", paramInt));
      return false;
    }
    return true;
  }
  
  @TargetApi(21)
  public boolean isAudioSampleRateSupportedV21(int paramInt)
  {
    Object localObject = capabilities;
    if (localObject == null)
    {
      logNoSupport("sampleRate.caps");
      return false;
    }
    localObject = ((MediaCodecInfo.CodecCapabilities)localObject).getAudioCapabilities();
    if (localObject == null)
    {
      logNoSupport("sampleRate.aCaps");
      return false;
    }
    if (!((MediaCodecInfo.AudioCapabilities)localObject).isSampleRateSupported(paramInt))
    {
      logNoSupport(a.f("sampleRate.support, ", paramInt));
      return false;
    }
    return true;
  }
  
  public boolean isCodecSupported(String paramString)
  {
    if ((paramString != null) && (mimeType != null))
    {
      String str = MimeTypes.getMediaMimeType(paramString);
      if (str == null) {
        return true;
      }
      if (!mimeType.equals(str))
      {
        logNoSupport(a.m("codec.mime ", paramString, ", ", str));
        return false;
      }
      Pair localPair = MediaCodecUtil.getCodecProfileAndLevel(paramString);
      if (localPair == null) {
        return true;
      }
      for (MediaCodecInfo.CodecProfileLevel localCodecProfileLevel : getProfileLevels()) {
        if ((profile == ((Integer)first).intValue()) && (level >= ((Integer)second).intValue())) {
          return true;
        }
      }
      logNoSupport(a.m("codec.profileLevel, ", paramString, ", ", str));
      return false;
    }
    return true;
  }
  
  public boolean isFormatSupported(Format paramFormat)
    throws MediaCodecUtil.DecoderQueryException
  {
    boolean bool1 = isCodecSupported(codecs);
    boolean bool2 = false;
    boolean bool3 = false;
    if (!bool1) {
      return false;
    }
    int i;
    if (isVideo)
    {
      i = width;
      if (i > 0)
      {
        int j = height;
        if (j > 0)
        {
          if (Util.SDK_INT >= 21) {
            return isVideoSizeAndRateSupportedV21(i, j, frameRate);
          }
          if (i * j <= MediaCodecUtil.maxH264DecodableFrameSize()) {
            bool3 = true;
          }
          if (!bool3)
          {
            StringBuilder localStringBuilder = z2.t("legacyFrameSize, ");
            localStringBuilder.append(width);
            localStringBuilder.append("x");
            localStringBuilder.append(height);
            logNoSupport(localStringBuilder.toString());
          }
          return bool3;
        }
      }
      return true;
    }
    if (Util.SDK_INT >= 21)
    {
      i = sampleRate;
      if (i != -1)
      {
        bool3 = bool2;
        if (!isAudioSampleRateSupportedV21(i)) {
          break label203;
        }
      }
      i = channelCount;
      if (i != -1)
      {
        bool3 = bool2;
        if (!isAudioChannelCountSupportedV21(i)) {
          break label203;
        }
      }
    }
    bool3 = true;
    label203:
    return bool3;
  }
  
  public boolean isSeamlessAdaptationSupported(Format paramFormat)
  {
    if (isVideo) {
      return adaptive;
    }
    paramFormat = MediaCodecUtil.getCodecProfileAndLevel(codecs);
    boolean bool;
    if ((paramFormat != null) && (((Integer)first).intValue() == 42)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isSeamlessAdaptationSupported(Format paramFormat1, Format paramFormat2, boolean paramBoolean)
  {
    boolean bool1 = isVideo;
    boolean bool2 = true;
    boolean bool3 = true;
    if (bool1)
    {
      if ((sampleMimeType.equals(sampleMimeType)) && (rotationDegrees == rotationDegrees) && ((adaptive) || ((width == width) && (height == height))))
      {
        if (!paramBoolean)
        {
          paramBoolean = bool3;
          if (colorInfo == null) {
            break label107;
          }
        }
        if (Util.areEqual(colorInfo, colorInfo))
        {
          paramBoolean = bool3;
          break label107;
        }
      }
      paramBoolean = false;
      label107:
      return paramBoolean;
    }
    if (("audio/mp4a-latm".equals(mimeType)) && (sampleMimeType.equals(sampleMimeType)) && (channelCount == channelCount) && (sampleRate == sampleRate))
    {
      paramFormat1 = MediaCodecUtil.getCodecProfileAndLevel(codecs);
      paramFormat2 = MediaCodecUtil.getCodecProfileAndLevel(codecs);
      if ((paramFormat1 != null) && (paramFormat2 != null))
      {
        int i = ((Integer)first).intValue();
        int j = ((Integer)first).intValue();
        if ((i == 42) && (j == 42)) {
          paramBoolean = bool2;
        } else {
          paramBoolean = false;
        }
        return paramBoolean;
      }
    }
    return false;
  }
  
  @TargetApi(21)
  public boolean isVideoSizeAndRateSupportedV21(int paramInt1, int paramInt2, double paramDouble)
  {
    Object localObject = capabilities;
    if (localObject == null)
    {
      logNoSupport("sizeAndRate.caps");
      return false;
    }
    localObject = ((MediaCodecInfo.CodecCapabilities)localObject).getVideoCapabilities();
    if (localObject == null)
    {
      logNoSupport("sizeAndRate.vCaps");
      return false;
    }
    if (!areSizeAndRateSupportedV21((MediaCodecInfo.VideoCapabilities)localObject, paramInt1, paramInt2, paramDouble)) {
      if ((paramInt1 < paramInt2) && (areSizeAndRateSupportedV21((MediaCodecInfo.VideoCapabilities)localObject, paramInt2, paramInt1, paramDouble)))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("sizeAndRate.rotated, ");
        ((StringBuilder)localObject).append(paramInt1);
        ((StringBuilder)localObject).append("x");
        ((StringBuilder)localObject).append(paramInt2);
        ((StringBuilder)localObject).append("x");
        ((StringBuilder)localObject).append(paramDouble);
        logAssumedSupport(((StringBuilder)localObject).toString());
      }
      else
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("sizeAndRate.support, ");
        ((StringBuilder)localObject).append(paramInt1);
        ((StringBuilder)localObject).append("x");
        ((StringBuilder)localObject).append(paramInt2);
        ((StringBuilder)localObject).append("x");
        ((StringBuilder)localObject).append(paramDouble);
        logNoSupport(((StringBuilder)localObject).toString());
        return false;
      }
    }
    return true;
  }
  
  public String toString()
  {
    return name;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.mediacodec.MediaCodecInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */