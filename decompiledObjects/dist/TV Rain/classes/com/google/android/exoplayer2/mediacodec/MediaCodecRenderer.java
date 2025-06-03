package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CodecException;
import android.media.MediaCodec.CryptoException;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.FrameworkMediaCrypto;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.TimedValueQueue;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import z2;

@TargetApi(16)
public abstract class MediaCodecRenderer
  extends BaseRenderer
{
  private static final byte[] ADAPTATION_WORKAROUND_BUFFER = Util.getBytesFromHexString("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
  private static final int ADAPTATION_WORKAROUND_MODE_ALWAYS = 2;
  private static final int ADAPTATION_WORKAROUND_MODE_NEVER = 0;
  private static final int ADAPTATION_WORKAROUND_MODE_SAME_RESOLUTION = 1;
  private static final int ADAPTATION_WORKAROUND_SLICE_WIDTH_HEIGHT = 32;
  public static final float CODEC_OPERATING_RATE_UNSET = -1.0F;
  public static final int KEEP_CODEC_RESULT_NO = 0;
  public static final int KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION = 1;
  public static final int KEEP_CODEC_RESULT_YES_WITH_RECONFIGURATION = 3;
  private static final long MAX_CODEC_HOTSWAP_TIME_MS = 1000L;
  private static final int RECONFIGURATION_STATE_NONE = 0;
  private static final int RECONFIGURATION_STATE_QUEUE_PENDING = 2;
  private static final int RECONFIGURATION_STATE_WRITE_PENDING = 1;
  private static final int REINITIALIZATION_STATE_NONE = 0;
  private static final int REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM = 1;
  private static final int REINITIALIZATION_STATE_WAIT_END_OF_STREAM = 2;
  private static final String TAG = "MediaCodecRenderer";
  private final float assumedMinimumCodecOperatingRate;
  @Nullable
  private ArrayDeque<MediaCodecInfo> availableCodecInfos;
  private final DecoderInputBuffer buffer;
  private MediaCodec codec;
  private int codecAdaptationWorkaroundMode;
  private boolean codecConfiguredWithOperatingRate;
  private long codecHotswapDeadlineMs;
  @Nullable
  private MediaCodecInfo codecInfo;
  private boolean codecNeedsAdaptationWorkaroundBuffer;
  private boolean codecNeedsDiscardToSpsWorkaround;
  private boolean codecNeedsEosFlushWorkaround;
  private boolean codecNeedsEosOutputExceptionWorkaround;
  private boolean codecNeedsEosPropagation;
  private boolean codecNeedsFlushWorkaround;
  private boolean codecNeedsMonoChannelCountWorkaround;
  private boolean codecNeedsReconfigureWorkaround;
  private float codecOperatingRate;
  private boolean codecReceivedBuffers;
  private boolean codecReceivedEos;
  private int codecReconfigurationState;
  private boolean codecReconfigured;
  private int codecReinitializationState;
  private final List<Long> decodeOnlyPresentationTimestamps;
  public DecoderCounters decoderCounters;
  private DrmSession<FrameworkMediaCrypto> drmSession;
  @Nullable
  private final DrmSessionManager<FrameworkMediaCrypto> drmSessionManager;
  private final DecoderInputBuffer flagsOnlyBuffer;
  private Format format;
  private final FormatHolder formatHolder;
  private final TimedValueQueue<Format> formatQueue;
  private ByteBuffer[] inputBuffers;
  private int inputIndex;
  private boolean inputStreamEnded;
  private final MediaCodecSelector mediaCodecSelector;
  private ByteBuffer outputBuffer;
  private final MediaCodec.BufferInfo outputBufferInfo;
  private ByteBuffer[] outputBuffers;
  private Format outputFormat;
  private int outputIndex;
  private boolean outputStreamEnded;
  private DrmSession<FrameworkMediaCrypto> pendingDrmSession;
  private Format pendingFormat;
  private final boolean playClearSamplesWithoutKeys;
  @Nullable
  private DecoderInitializationException preferredDecoderInitializationException;
  private float rendererOperatingRate;
  private boolean shouldSkipAdaptationWorkaroundOutputBuffer;
  private boolean shouldSkipOutputBuffer;
  private boolean waitingForFirstSyncFrame;
  private boolean waitingForKeys;
  
  public MediaCodecRenderer(int paramInt, MediaCodecSelector paramMediaCodecSelector, @Nullable DrmSessionManager<FrameworkMediaCrypto> paramDrmSessionManager, boolean paramBoolean, float paramFloat)
  {
    super(paramInt);
    boolean bool;
    if (Util.SDK_INT >= 16) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
    mediaCodecSelector = ((MediaCodecSelector)Assertions.checkNotNull(paramMediaCodecSelector));
    drmSessionManager = paramDrmSessionManager;
    playClearSamplesWithoutKeys = paramBoolean;
    assumedMinimumCodecOperatingRate = paramFloat;
    buffer = new DecoderInputBuffer(0);
    flagsOnlyBuffer = DecoderInputBuffer.newFlagsOnlyInstance();
    formatHolder = new FormatHolder();
    formatQueue = new TimedValueQueue();
    decodeOnlyPresentationTimestamps = new ArrayList();
    outputBufferInfo = new MediaCodec.BufferInfo();
    codecReconfigurationState = 0;
    codecReinitializationState = 0;
    codecOperatingRate = -1.0F;
    rendererOperatingRate = 1.0F;
  }
  
  private int codecAdaptationWorkaroundMode(String paramString)
  {
    int i = Util.SDK_INT;
    if ((i <= 25) && ("OMX.Exynos.avc.dec.secure".equals(paramString)))
    {
      String str = Util.MODEL;
      if ((str.startsWith("SM-T585")) || (str.startsWith("SM-A510")) || (str.startsWith("SM-A520")) || (str.startsWith("SM-J700"))) {
        return 2;
      }
    }
    if ((i < 24) && (("OMX.Nvidia.h264.decode".equals(paramString)) || ("OMX.Nvidia.h264.decode.secure".equals(paramString))))
    {
      paramString = Util.DEVICE;
      if (("flounder".equals(paramString)) || ("flounder_lte".equals(paramString)) || ("grouper".equals(paramString)) || ("tilapia".equals(paramString))) {
        return 1;
      }
    }
    return 0;
  }
  
  private static boolean codecNeedsDiscardToSpsWorkaround(String paramString, Format paramFormat)
  {
    boolean bool;
    if ((Util.SDK_INT < 21) && (initializationData.isEmpty()) && ("OMX.MTK.VIDEO.DECODER.AVC".equals(paramString))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static boolean codecNeedsEosFlushWorkaround(String paramString)
  {
    int i = Util.SDK_INT;
    boolean bool;
    if (((i <= 23) && ("OMX.google.vorbis.decoder".equals(paramString))) || ((i <= 19) && ("hb2000".equals(Util.DEVICE)) && (("OMX.amlogic.avc.decoder.awesome".equals(paramString)) || ("OMX.amlogic.avc.decoder.awesome.secure".equals(paramString))))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static boolean codecNeedsEosOutputExceptionWorkaround(String paramString)
  {
    boolean bool;
    if ((Util.SDK_INT == 21) && ("OMX.google.aac.decoder".equals(paramString))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static boolean codecNeedsEosPropagationWorkaround(MediaCodecInfo paramMediaCodecInfo)
  {
    String str = name;
    boolean bool;
    if (((Util.SDK_INT <= 17) && (("OMX.rk.video_decoder.avc".equals(str)) || ("OMX.allwinner.video.decoder.avc".equals(str)))) || (("Amazon".equals(Util.MANUFACTURER)) && ("AFTS".equals(Util.MODEL)) && (secure))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static boolean codecNeedsFlushWorkaround(String paramString)
  {
    int i = Util.SDK_INT;
    boolean bool;
    if ((i >= 18) && ((i != 18) || ((!"OMX.SEC.avc.dec".equals(paramString)) && (!"OMX.SEC.avc.dec.secure".equals(paramString)))) && ((i != 19) || (!Util.MODEL.startsWith("SM-G800")) || ((!"OMX.Exynos.avc.dec".equals(paramString)) && (!"OMX.Exynos.avc.dec.secure".equals(paramString))))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private static boolean codecNeedsMonoChannelCountWorkaround(String paramString, Format paramFormat)
  {
    int i = Util.SDK_INT;
    boolean bool = true;
    if ((i > 18) || (channelCount != 1) || (!"OMX.MTK.AUDIO.DECODER.MP3".equals(paramString))) {
      bool = false;
    }
    return bool;
  }
  
  private static boolean codecNeedsReconfigureWorkaround(String paramString)
  {
    boolean bool;
    if ((Util.MODEL.startsWith("SM-T230")) && ("OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(paramString))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean deviceNeedsDrmKeysToConfigureCodecWorkaround()
  {
    if ("Amazon".equals(Util.MANUFACTURER))
    {
      String str = Util.MODEL;
      if (("AFTM".equals(str)) || ("AFTB".equals(str))) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  private boolean drainOutputBuffer(long paramLong1, long paramLong2)
    throws ExoPlaybackException
  {
    int i;
    Object localObject;
    MediaCodec.BufferInfo localBufferInfo;
    if (!hasOutputBuffer())
    {
      if ((codecNeedsEosOutputExceptionWorkaround) && (codecReceivedEos)) {
        try
        {
          i = codec.dequeueOutputBuffer(outputBufferInfo, getDequeueOutputBufferTimeoutUs());
        }
        catch (IllegalStateException localIllegalStateException1)
        {
          processEndOfStream();
          if (outputStreamEnded) {
            releaseCodec();
          }
          return false;
        }
      } else {
        i = codec.dequeueOutputBuffer(outputBufferInfo, getDequeueOutputBufferTimeoutUs());
      }
      if (i < 0)
      {
        if (i == -2)
        {
          processOutputFormat();
          return true;
        }
        if (i == -3)
        {
          processOutputBuffersChanged();
          return true;
        }
        if ((codecNeedsEosPropagation) && ((inputStreamEnded) || (codecReinitializationState == 2))) {
          processEndOfStream();
        }
        return false;
      }
      if (shouldSkipAdaptationWorkaroundOutputBuffer)
      {
        shouldSkipAdaptationWorkaroundOutputBuffer = false;
        codec.releaseOutputBuffer(i, false);
        return true;
      }
      localObject = outputBufferInfo;
      if ((size == 0) && ((flags & 0x4) != 0))
      {
        processEndOfStream();
        return false;
      }
      outputIndex = i;
      localObject = getOutputBuffer(i);
      outputBuffer = ((ByteBuffer)localObject);
      if (localObject != null)
      {
        ((ByteBuffer)localObject).position(outputBufferInfo.offset);
        localObject = outputBuffer;
        localBufferInfo = outputBufferInfo;
        ((ByteBuffer)localObject).limit(offset + size);
      }
      shouldSkipOutputBuffer = shouldSkipOutputBuffer(outputBufferInfo.presentationTimeUs);
      updateOutputFormatForTime(outputBufferInfo.presentationTimeUs);
    }
    MediaCodec localMediaCodec;
    boolean bool;
    if ((codecNeedsEosOutputExceptionWorkaround) && (codecReceivedEos))
    {
      try
      {
        localMediaCodec = codec;
        localObject = outputBuffer;
        i = outputIndex;
        localBufferInfo = outputBufferInfo;
        bool = processOutputBuffer(paramLong1, paramLong2, localMediaCodec, (ByteBuffer)localObject, i, flags, presentationTimeUs, shouldSkipOutputBuffer, outputFormat);
      }
      catch (IllegalStateException localIllegalStateException2)
      {
        processEndOfStream();
        if (outputStreamEnded) {
          releaseCodec();
        }
        return false;
      }
    }
    else
    {
      localMediaCodec = codec;
      ByteBuffer localByteBuffer = outputBuffer;
      i = outputIndex;
      localBufferInfo = outputBufferInfo;
      bool = processOutputBuffer(paramLong1, paramLong2, localMediaCodec, localByteBuffer, i, flags, presentationTimeUs, shouldSkipOutputBuffer, outputFormat);
    }
    if (bool)
    {
      onProcessedOutputBuffer(outputBufferInfo.presentationTimeUs);
      if ((outputBufferInfo.flags & 0x4) != 0) {
        i = 1;
      } else {
        i = 0;
      }
      resetOutputBuffer();
      if (i == 0) {
        return true;
      }
      processEndOfStream();
    }
    return false;
  }
  
  private boolean feedInputBuffer()
    throws ExoPlaybackException
  {
    Object localObject1 = codec;
    if ((localObject1 != null) && (codecReinitializationState != 2) && (!inputStreamEnded))
    {
      int i;
      if (inputIndex < 0)
      {
        i = ((MediaCodec)localObject1).dequeueInputBuffer(0L);
        inputIndex = i;
        if (i < 0) {
          return false;
        }
        buffer.data = getInputBuffer(i);
        buffer.clear();
      }
      if (codecReinitializationState == 1)
      {
        if (!codecNeedsEosPropagation)
        {
          codecReceivedEos = true;
          codec.queueInputBuffer(inputIndex, 0, 0, 0L, 4);
          resetInputBuffer();
        }
        codecReinitializationState = 2;
        return false;
      }
      if (codecNeedsAdaptationWorkaroundBuffer)
      {
        codecNeedsAdaptationWorkaroundBuffer = false;
        ByteBuffer localByteBuffer = buffer.data;
        localObject1 = ADAPTATION_WORKAROUND_BUFFER;
        localByteBuffer.put((byte[])localObject1);
        codec.queueInputBuffer(inputIndex, 0, localObject1.length, 0L, 0);
        resetInputBuffer();
        codecReceivedBuffers = true;
        return true;
      }
      int j;
      if (waitingForKeys)
      {
        j = -4;
        i = 0;
      }
      else
      {
        if (codecReconfigurationState == 1)
        {
          for (i = 0; i < format.initializationData.size(); i++)
          {
            localObject1 = (byte[])format.initializationData.get(i);
            buffer.data.put((byte[])localObject1);
          }
          codecReconfigurationState = 2;
        }
        i = buffer.data.position();
        j = readSource(formatHolder, buffer, false);
      }
      if (j == -3) {
        return false;
      }
      if (j == -5)
      {
        if (codecReconfigurationState == 2)
        {
          buffer.clear();
          codecReconfigurationState = 1;
        }
        onInputFormatChanged(formatHolder.format);
        return true;
      }
      if (buffer.isEndOfStream())
      {
        if (codecReconfigurationState == 2)
        {
          buffer.clear();
          codecReconfigurationState = 1;
        }
        inputStreamEnded = true;
        if (!codecReceivedBuffers)
        {
          processEndOfStream();
          return false;
        }
        try
        {
          if (!codecNeedsEosPropagation)
          {
            codecReceivedEos = true;
            codec.queueInputBuffer(inputIndex, 0, 0, 0L, 4);
            resetInputBuffer();
          }
          return false;
        }
        catch (MediaCodec.CryptoException localCryptoException1)
        {
          throw ExoPlaybackException.createForRenderer(localCryptoException1, getIndex());
        }
      }
      if ((waitingForFirstSyncFrame) && (!buffer.isKeyFrame()))
      {
        buffer.clear();
        if (codecReconfigurationState == 2) {
          codecReconfigurationState = 1;
        }
        return true;
      }
      waitingForFirstSyncFrame = false;
      boolean bool1 = buffer.isEncrypted();
      boolean bool2 = shouldWaitForKeys(bool1);
      waitingForKeys = bool2;
      if (bool2) {
        return false;
      }
      if ((codecNeedsDiscardToSpsWorkaround) && (!bool1))
      {
        NalUnitUtil.discardToSps(buffer.data);
        if (buffer.data.position() == 0) {
          return true;
        }
        codecNeedsDiscardToSpsWorkaround = false;
      }
      try
      {
        Object localObject2 = buffer;
        long l = timeUs;
        if (((com.google.android.exoplayer2.decoder.Buffer)localObject2).isDecodeOnly()) {
          decodeOnlyPresentationTimestamps.add(Long.valueOf(l));
        }
        localObject2 = pendingFormat;
        if (localObject2 != null)
        {
          formatQueue.add(l, localObject2);
          pendingFormat = null;
        }
        buffer.flip();
        onQueueInputBuffer(buffer);
        if (bool1)
        {
          localObject2 = getFrameworkCryptoInfo(buffer, i);
          codec.queueSecureInputBuffer(inputIndex, 0, (MediaCodec.CryptoInfo)localObject2, l, 0);
        }
        else
        {
          codec.queueInputBuffer(inputIndex, 0, buffer.data.limit(), l, 0);
        }
        resetInputBuffer();
        codecReceivedBuffers = true;
        codecReconfigurationState = 0;
        localObject2 = decoderCounters;
        inputBufferCount += 1;
        return true;
      }
      catch (MediaCodec.CryptoException localCryptoException2)
      {
        throw ExoPlaybackException.createForRenderer(localCryptoException2, getIndex());
      }
    }
    return false;
  }
  
  private List<MediaCodecInfo> getAvailableCodecInfos(boolean paramBoolean)
    throws MediaCodecUtil.DecoderQueryException
  {
    List localList = getDecoderInfos(mediaCodecSelector, format, paramBoolean);
    Object localObject = localList;
    if (localList.isEmpty())
    {
      localObject = localList;
      if (paramBoolean)
      {
        localList = getDecoderInfos(mediaCodecSelector, format, false);
        localObject = localList;
        if (!localList.isEmpty())
        {
          localObject = z2.t("Drm session requires secure decoder for ");
          ((StringBuilder)localObject).append(format.sampleMimeType);
          ((StringBuilder)localObject).append(", but no secure decoder available. Trying to proceed with ");
          ((StringBuilder)localObject).append(localList);
          ((StringBuilder)localObject).append(".");
          Log.w("MediaCodecRenderer", ((StringBuilder)localObject).toString());
          localObject = localList;
        }
      }
    }
    return (List<MediaCodecInfo>)localObject;
  }
  
  private void getCodecBuffers(MediaCodec paramMediaCodec)
  {
    if (Util.SDK_INT < 21)
    {
      inputBuffers = paramMediaCodec.getInputBuffers();
      outputBuffers = paramMediaCodec.getOutputBuffers();
    }
  }
  
  private static MediaCodec.CryptoInfo getFrameworkCryptoInfo(DecoderInputBuffer paramDecoderInputBuffer, int paramInt)
  {
    MediaCodec.CryptoInfo localCryptoInfo = cryptoInfo.getFrameworkCryptoInfoV16();
    if (paramInt == 0) {
      return localCryptoInfo;
    }
    if (numBytesOfClearData == null) {
      numBytesOfClearData = new int[1];
    }
    paramDecoderInputBuffer = numBytesOfClearData;
    paramDecoderInputBuffer[0] += paramInt;
    return localCryptoInfo;
  }
  
  private ByteBuffer getInputBuffer(int paramInt)
  {
    if (Util.SDK_INT >= 21) {
      return codec.getInputBuffer(paramInt);
    }
    return inputBuffers[paramInt];
  }
  
  private ByteBuffer getOutputBuffer(int paramInt)
  {
    if (Util.SDK_INT >= 21) {
      return codec.getOutputBuffer(paramInt);
    }
    return outputBuffers[paramInt];
  }
  
  private boolean hasOutputBuffer()
  {
    boolean bool;
    if (outputIndex >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void initCodec(MediaCodecInfo paramMediaCodecInfo, MediaCrypto paramMediaCrypto)
    throws Exception
  {
    String str = name;
    updateCodecOperatingRate();
    boolean bool;
    if (codecOperatingRate > assumedMinimumCodecOperatingRate) {
      bool = true;
    } else {
      bool = false;
    }
    MediaCodec localMediaCodec1 = null;
    MediaCodec localMediaCodec2 = localMediaCodec1;
    try
    {
      long l1 = SystemClock.elapsedRealtime();
      localMediaCodec2 = localMediaCodec1;
      Object localObject = new java/lang/StringBuilder;
      localMediaCodec2 = localMediaCodec1;
      ((StringBuilder)localObject).<init>();
      localMediaCodec2 = localMediaCodec1;
      ((StringBuilder)localObject).append("createCodec:");
      localMediaCodec2 = localMediaCodec1;
      ((StringBuilder)localObject).append(str);
      localMediaCodec2 = localMediaCodec1;
      TraceUtil.beginSection(((StringBuilder)localObject).toString());
      localMediaCodec2 = localMediaCodec1;
      localMediaCodec1 = MediaCodec.createByCodecName(str);
      localMediaCodec2 = localMediaCodec1;
      TraceUtil.endSection();
      localMediaCodec2 = localMediaCodec1;
      TraceUtil.beginSection("configureCodec");
      localMediaCodec2 = localMediaCodec1;
      localObject = format;
      float f;
      if (bool)
      {
        localMediaCodec2 = localMediaCodec1;
        f = codecOperatingRate;
      }
      else
      {
        f = -1.0F;
      }
      localMediaCodec2 = localMediaCodec1;
      configureCodec(paramMediaCodecInfo, localMediaCodec1, (Format)localObject, paramMediaCrypto, f);
      localMediaCodec2 = localMediaCodec1;
      codecConfiguredWithOperatingRate = bool;
      localMediaCodec2 = localMediaCodec1;
      TraceUtil.endSection();
      localMediaCodec2 = localMediaCodec1;
      TraceUtil.beginSection("startCodec");
      localMediaCodec2 = localMediaCodec1;
      localMediaCodec1.start();
      localMediaCodec2 = localMediaCodec1;
      TraceUtil.endSection();
      localMediaCodec2 = localMediaCodec1;
      long l2 = SystemClock.elapsedRealtime();
      localMediaCodec2 = localMediaCodec1;
      getCodecBuffers(localMediaCodec1);
      codec = localMediaCodec1;
      codecInfo = paramMediaCodecInfo;
      onCodecInitialized(str, l2, l2 - l1);
      return;
    }
    catch (Exception paramMediaCodecInfo)
    {
      if (localMediaCodec2 != null)
      {
        resetCodecBuffers();
        localMediaCodec2.release();
      }
      throw paramMediaCodecInfo;
    }
  }
  
  private boolean initCodecWithFallback(MediaCrypto paramMediaCrypto, boolean paramBoolean)
    throws MediaCodecRenderer.DecoderInitializationException
  {
    Object localObject;
    if (availableCodecInfos == null) {
      try
      {
        localObject = new java/util/ArrayDeque;
        ((ArrayDeque)localObject).<init>(getAvailableCodecInfos(paramBoolean));
        availableCodecInfos = ((ArrayDeque)localObject);
        preferredDecoderInitializationException = null;
      }
      catch (MediaCodecUtil.DecoderQueryException paramMediaCrypto)
      {
        throw new DecoderInitializationException(format, paramMediaCrypto, paramBoolean, -49998);
      }
    }
    if (!availableCodecInfos.isEmpty())
    {
      do
      {
        localObject = (MediaCodecInfo)availableCodecInfos.peekFirst();
        if (!shouldInitCodec((MediaCodecInfo)localObject)) {
          return false;
        }
        try
        {
          initCodec((MediaCodecInfo)localObject, paramMediaCrypto);
          return true;
        }
        catch (Exception localException)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Failed to initialize decoder: ");
          localStringBuilder.append(localObject);
          Log.w("MediaCodecRenderer", localStringBuilder.toString(), localException);
          availableCodecInfos.removeFirst();
          localObject = new DecoderInitializationException(format, localException, paramBoolean, name);
          if (preferredDecoderInitializationException == null) {
            preferredDecoderInitializationException = ((DecoderInitializationException)localObject);
          } else {
            preferredDecoderInitializationException = DecoderInitializationException.access$000(preferredDecoderInitializationException, (DecoderInitializationException)localObject);
          }
        }
      } while (!availableCodecInfos.isEmpty());
      throw preferredDecoderInitializationException;
    }
    throw new DecoderInitializationException(format, null, paramBoolean, -49999);
  }
  
  private void processEndOfStream()
    throws ExoPlaybackException
  {
    if (codecReinitializationState == 2)
    {
      releaseCodec();
      maybeInitCodec();
    }
    else
    {
      outputStreamEnded = true;
      renderToEndOfStream();
    }
  }
  
  private void processOutputBuffersChanged()
  {
    if (Util.SDK_INT < 21) {
      outputBuffers = codec.getOutputBuffers();
    }
  }
  
  private void processOutputFormat()
    throws ExoPlaybackException
  {
    MediaFormat localMediaFormat = codec.getOutputFormat();
    if ((codecAdaptationWorkaroundMode != 0) && (localMediaFormat.getInteger("width") == 32) && (localMediaFormat.getInteger("height") == 32))
    {
      shouldSkipAdaptationWorkaroundOutputBuffer = true;
      return;
    }
    if (codecNeedsMonoChannelCountWorkaround) {
      localMediaFormat.setInteger("channel-count", 1);
    }
    onOutputFormatChanged(codec, localMediaFormat);
  }
  
  private void reinitializeCodec()
    throws ExoPlaybackException
  {
    availableCodecInfos = null;
    if (codecReceivedBuffers)
    {
      codecReinitializationState = 1;
    }
    else
    {
      releaseCodec();
      maybeInitCodec();
    }
  }
  
  private void resetCodecBuffers()
  {
    if (Util.SDK_INT < 21)
    {
      inputBuffers = null;
      outputBuffers = null;
    }
  }
  
  private void resetInputBuffer()
  {
    inputIndex = -1;
    buffer.data = null;
  }
  
  private void resetOutputBuffer()
  {
    outputIndex = -1;
    outputBuffer = null;
  }
  
  private boolean shouldSkipOutputBuffer(long paramLong)
  {
    int i = decodeOnlyPresentationTimestamps.size();
    for (int j = 0; j < i; j++) {
      if (((Long)decodeOnlyPresentationTimestamps.get(j)).longValue() == paramLong)
      {
        decodeOnlyPresentationTimestamps.remove(j);
        return true;
      }
    }
    return false;
  }
  
  private boolean shouldWaitForKeys(boolean paramBoolean)
    throws ExoPlaybackException
  {
    DrmSession localDrmSession = drmSession;
    boolean bool = false;
    if ((localDrmSession != null) && ((paramBoolean) || (!playClearSamplesWithoutKeys)))
    {
      int i = localDrmSession.getState();
      if (i != 1)
      {
        paramBoolean = bool;
        if (i != 4) {
          paramBoolean = true;
        }
        return paramBoolean;
      }
      throw ExoPlaybackException.createForRenderer(drmSession.getError(), getIndex());
    }
    return false;
  }
  
  private void updateCodecOperatingRate()
    throws ExoPlaybackException
  {
    Object localObject = format;
    if ((localObject != null) && (Util.SDK_INT >= 23))
    {
      float f = getCodecOperatingRate(rendererOperatingRate, (Format)localObject, getStreamFormats());
      if (codecOperatingRate == f) {
        return;
      }
      codecOperatingRate = f;
      if ((codec != null) && (codecReinitializationState == 0))
      {
        boolean bool = f < -1.0F;
        if ((!bool) && (codecConfiguredWithOperatingRate))
        {
          reinitializeCodec();
        }
        else if ((bool) && ((codecConfiguredWithOperatingRate) || (f > assumedMinimumCodecOperatingRate)))
        {
          localObject = new Bundle();
          ((Bundle)localObject).putFloat("operating-rate", f);
          codec.setParameters((Bundle)localObject);
          codecConfiguredWithOperatingRate = true;
        }
      }
    }
  }
  
  public int canKeepCodec(MediaCodec paramMediaCodec, MediaCodecInfo paramMediaCodecInfo, Format paramFormat1, Format paramFormat2)
  {
    return 0;
  }
  
  public abstract void configureCodec(MediaCodecInfo paramMediaCodecInfo, MediaCodec paramMediaCodec, Format paramFormat, MediaCrypto paramMediaCrypto, float paramFloat)
    throws MediaCodecUtil.DecoderQueryException;
  
  public void flushCodec()
    throws ExoPlaybackException
  {
    codecHotswapDeadlineMs = -9223372036854775807L;
    resetInputBuffer();
    resetOutputBuffer();
    waitingForFirstSyncFrame = true;
    waitingForKeys = false;
    shouldSkipOutputBuffer = false;
    decodeOnlyPresentationTimestamps.clear();
    codecNeedsAdaptationWorkaroundBuffer = false;
    shouldSkipAdaptationWorkaroundOutputBuffer = false;
    if ((!codecNeedsFlushWorkaround) && ((!codecNeedsEosFlushWorkaround) || (!codecReceivedEos)))
    {
      if (codecReinitializationState != 0)
      {
        releaseCodec();
        maybeInitCodec();
      }
      else
      {
        codec.flush();
        codecReceivedBuffers = false;
      }
    }
    else
    {
      releaseCodec();
      maybeInitCodec();
    }
    if ((codecReconfigured) && (format != null)) {
      codecReconfigurationState = 1;
    }
  }
  
  public final MediaCodec getCodec()
  {
    return codec;
  }
  
  @Nullable
  public final MediaCodecInfo getCodecInfo()
  {
    return codecInfo;
  }
  
  public boolean getCodecNeedsEosPropagation()
  {
    return false;
  }
  
  public float getCodecOperatingRate(float paramFloat, Format paramFormat, Format[] paramArrayOfFormat)
  {
    return -1.0F;
  }
  
  public List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector paramMediaCodecSelector, Format paramFormat, boolean paramBoolean)
    throws MediaCodecUtil.DecoderQueryException
  {
    return paramMediaCodecSelector.getDecoderInfos(sampleMimeType, paramBoolean);
  }
  
  public long getDequeueOutputBufferTimeoutUs()
  {
    return 0L;
  }
  
  public boolean isEnded()
  {
    return outputStreamEnded;
  }
  
  public boolean isReady()
  {
    boolean bool;
    if ((format != null) && (!waitingForKeys) && ((isSourceReady()) || (hasOutputBuffer()) || ((codecHotswapDeadlineMs != -9223372036854775807L) && (SystemClock.elapsedRealtime() < codecHotswapDeadlineMs)))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void maybeInitCodec()
    throws ExoPlaybackException
  {
    if (codec == null)
    {
      Object localObject1 = format;
      if (localObject1 != null)
      {
        DrmSession localDrmSession = pendingDrmSession;
        drmSession = localDrmSession;
        String str = sampleMimeType;
        Object localObject2 = null;
        localObject1 = null;
        boolean bool1 = false;
        boolean bool2;
        boolean bool3;
        if (localDrmSession != null)
        {
          localObject2 = (FrameworkMediaCrypto)localDrmSession.getMediaCrypto();
          if (localObject2 == null)
          {
            if (drmSession.getError() != null) {
              bool2 = false;
            }
          }
          else
          {
            localObject1 = ((FrameworkMediaCrypto)localObject2).getWrappedMediaCrypto();
            bool2 = ((FrameworkMediaCrypto)localObject2).requiresSecureDecoderComponent(str);
          }
          bool3 = bool2;
          localObject2 = localObject1;
          if (deviceNeedsDrmKeysToConfigureCodecWorkaround())
          {
            int i = drmSession.getState();
            if (i != 1)
            {
              bool3 = bool2;
              localObject2 = localObject1;
              if (i == 4) {}
            }
            else
            {
              throw ExoPlaybackException.createForRenderer(drmSession.getError(), getIndex());
            }
          }
        }
        else
        {
          bool3 = false;
        }
        try
        {
          bool2 = initCodecWithFallback((MediaCrypto)localObject2, bool3);
          if (!bool2) {
            return;
          }
          localObject1 = codecInfo.name;
          codecAdaptationWorkaroundMode = codecAdaptationWorkaroundMode((String)localObject1);
          codecNeedsReconfigureWorkaround = codecNeedsReconfigureWorkaround((String)localObject1);
          codecNeedsDiscardToSpsWorkaround = codecNeedsDiscardToSpsWorkaround((String)localObject1, format);
          codecNeedsFlushWorkaround = codecNeedsFlushWorkaround((String)localObject1);
          codecNeedsEosFlushWorkaround = codecNeedsEosFlushWorkaround((String)localObject1);
          codecNeedsEosOutputExceptionWorkaround = codecNeedsEosOutputExceptionWorkaround((String)localObject1);
          codecNeedsMonoChannelCountWorkaround = codecNeedsMonoChannelCountWorkaround((String)localObject1, format);
          if (!codecNeedsEosPropagationWorkaround(codecInfo))
          {
            bool2 = bool1;
            if (!getCodecNeedsEosPropagation()) {}
          }
          else
          {
            bool2 = true;
          }
          codecNeedsEosPropagation = bool2;
          long l;
          if (getState() == 2) {
            l = SystemClock.elapsedRealtime() + 1000L;
          } else {
            l = -9223372036854775807L;
          }
          codecHotswapDeadlineMs = l;
          resetInputBuffer();
          resetOutputBuffer();
          waitingForFirstSyncFrame = true;
          localObject1 = decoderCounters;
          decoderInitCount += 1;
          return;
        }
        catch (DecoderInitializationException localDecoderInitializationException)
        {
          throw ExoPlaybackException.createForRenderer(localDecoderInitializationException, getIndex());
        }
      }
    }
  }
  
  public void onCodecInitialized(String paramString, long paramLong1, long paramLong2) {}
  
  /* Error */
  public void onDisabled()
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield 442	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:format	Lcom/google/android/exoplayer2/Format;
    //   5: aload_0
    //   6: aconst_null
    //   7: putfield 670	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:availableCodecInfos	Ljava/util/ArrayDeque;
    //   10: aload_0
    //   11: invokevirtual 337	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:releaseCodec	()V
    //   14: aload_0
    //   15: getfield 751	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   18: astore_1
    //   19: aload_1
    //   20: ifnull +13 -> 33
    //   23: aload_0
    //   24: getfield 151	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSessionManager	Lcom/google/android/exoplayer2/drm/DrmSessionManager;
    //   27: aload_1
    //   28: invokeinterface 865 2 0
    //   33: aload_0
    //   34: getfield 817	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:pendingDrmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   37: astore_1
    //   38: aload_1
    //   39: ifnull +21 -> 60
    //   42: aload_1
    //   43: aload_0
    //   44: getfield 751	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   47: if_acmpeq +13 -> 60
    //   50: aload_0
    //   51: getfield 151	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSessionManager	Lcom/google/android/exoplayer2/drm/DrmSessionManager;
    //   54: aload_1
    //   55: invokeinterface 865 2 0
    //   60: aload_0
    //   61: aconst_null
    //   62: putfield 751	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   65: aload_0
    //   66: aconst_null
    //   67: putfield 817	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:pendingDrmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   70: return
    //   71: astore_1
    //   72: aload_0
    //   73: aconst_null
    //   74: putfield 751	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   77: aload_0
    //   78: aconst_null
    //   79: putfield 817	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:pendingDrmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   82: aload_1
    //   83: athrow
    //   84: astore_2
    //   85: aload_0
    //   86: getfield 817	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:pendingDrmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   89: astore_1
    //   90: aload_1
    //   91: ifnull +21 -> 112
    //   94: aload_1
    //   95: aload_0
    //   96: getfield 751	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   99: if_acmpeq +13 -> 112
    //   102: aload_0
    //   103: getfield 151	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSessionManager	Lcom/google/android/exoplayer2/drm/DrmSessionManager;
    //   106: aload_1
    //   107: invokeinterface 865 2 0
    //   112: aload_0
    //   113: aconst_null
    //   114: putfield 751	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   117: aload_0
    //   118: aconst_null
    //   119: putfield 817	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:pendingDrmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   122: aload_2
    //   123: athrow
    //   124: astore_1
    //   125: aload_0
    //   126: aconst_null
    //   127: putfield 751	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   130: aload_0
    //   131: aconst_null
    //   132: putfield 817	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:pendingDrmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   135: aload_1
    //   136: athrow
    //   137: astore_1
    //   138: aload_0
    //   139: getfield 751	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   142: ifnull +16 -> 158
    //   145: aload_0
    //   146: getfield 151	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSessionManager	Lcom/google/android/exoplayer2/drm/DrmSessionManager;
    //   149: aload_0
    //   150: getfield 751	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   153: invokeinterface 865 2 0
    //   158: aload_0
    //   159: getfield 817	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:pendingDrmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   162: astore_2
    //   163: aload_2
    //   164: ifnull +21 -> 185
    //   167: aload_2
    //   168: aload_0
    //   169: getfield 751	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   172: if_acmpeq +13 -> 185
    //   175: aload_0
    //   176: getfield 151	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSessionManager	Lcom/google/android/exoplayer2/drm/DrmSessionManager;
    //   179: aload_2
    //   180: invokeinterface 865 2 0
    //   185: aload_0
    //   186: aconst_null
    //   187: putfield 751	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   190: aload_0
    //   191: aconst_null
    //   192: putfield 817	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:pendingDrmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   195: aload_1
    //   196: athrow
    //   197: astore_1
    //   198: aload_0
    //   199: aconst_null
    //   200: putfield 751	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   203: aload_0
    //   204: aconst_null
    //   205: putfield 817	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:pendingDrmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   208: aload_1
    //   209: athrow
    //   210: astore_1
    //   211: aload_0
    //   212: getfield 817	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:pendingDrmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   215: astore_2
    //   216: aload_2
    //   217: ifnull +21 -> 238
    //   220: aload_2
    //   221: aload_0
    //   222: getfield 751	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   225: if_acmpeq +13 -> 238
    //   228: aload_0
    //   229: getfield 151	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSessionManager	Lcom/google/android/exoplayer2/drm/DrmSessionManager;
    //   232: aload_2
    //   233: invokeinterface 865 2 0
    //   238: aload_0
    //   239: aconst_null
    //   240: putfield 751	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   243: aload_0
    //   244: aconst_null
    //   245: putfield 817	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:pendingDrmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   248: aload_1
    //   249: athrow
    //   250: astore_1
    //   251: aload_0
    //   252: aconst_null
    //   253: putfield 751	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   256: aload_0
    //   257: aconst_null
    //   258: putfield 817	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:pendingDrmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   261: aload_1
    //   262: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	263	0	this	MediaCodecRenderer
    //   18	37	1	localDrmSession1	DrmSession
    //   71	12	1	localObject1	Object
    //   89	18	1	localDrmSession2	DrmSession
    //   124	12	1	localObject2	Object
    //   137	59	1	localObject3	Object
    //   197	12	1	localObject4	Object
    //   210	39	1	localObject5	Object
    //   250	12	1	localObject6	Object
    //   84	39	2	localObject7	Object
    //   162	71	2	localDrmSession3	DrmSession
    // Exception table:
    //   from	to	target	type
    //   33	38	71	finally
    //   42	60	71	finally
    //   14	19	84	finally
    //   23	33	84	finally
    //   85	90	124	finally
    //   94	112	124	finally
    //   10	14	137	finally
    //   158	163	197	finally
    //   167	185	197	finally
    //   138	158	210	finally
    //   211	216	250	finally
    //   220	238	250	finally
  }
  
  public void onEnabled(boolean paramBoolean)
    throws ExoPlaybackException
  {
    decoderCounters = new DecoderCounters();
  }
  
  public void onInputFormatChanged(Format paramFormat)
    throws ExoPlaybackException
  {
    Format localFormat = format;
    format = paramFormat;
    pendingFormat = paramFormat;
    Object localObject = drmInitData;
    if (localFormat == null) {
      paramFormat = null;
    } else {
      paramFormat = drmInitData;
    }
    boolean bool1 = Util.areEqual(localObject, paramFormat);
    int i = 1;
    if ((bool1 ^ true)) {
      if (format.drmInitData != null)
      {
        paramFormat = drmSessionManager;
        if (paramFormat != null)
        {
          paramFormat = paramFormat.acquireSession(Looper.myLooper(), format.drmInitData);
          pendingDrmSession = paramFormat;
          if (paramFormat == drmSession) {
            drmSessionManager.releaseSession(paramFormat);
          }
        }
        else
        {
          throw ExoPlaybackException.createForRenderer(new IllegalStateException("Media requires a DrmSessionManager"), getIndex());
        }
      }
      else
      {
        pendingDrmSession = null;
      }
    }
    localObject = pendingDrmSession;
    paramFormat = drmSession;
    boolean bool2 = false;
    if (localObject == paramFormat)
    {
      paramFormat = codec;
      if (paramFormat != null)
      {
        int j = canKeepCodec(paramFormat, codecInfo, localFormat, format);
        if (j != 0)
        {
          k = i;
          if (j == 1) {
            break label301;
          }
          if (j == 3)
          {
            if (!codecNeedsReconfigureWorkaround)
            {
              codecReconfigured = true;
              codecReconfigurationState = 1;
              k = codecAdaptationWorkaroundMode;
              if (k != 2)
              {
                bool1 = bool2;
                if (k == 1)
                {
                  paramFormat = format;
                  bool1 = bool2;
                  if (width == width)
                  {
                    bool1 = bool2;
                    if (height != height) {}
                  }
                }
              }
              else
              {
                bool1 = true;
              }
              codecNeedsAdaptationWorkaroundBuffer = bool1;
              k = i;
              break label301;
            }
          }
          else {
            throw new IllegalStateException();
          }
        }
      }
    }
    int k = 0;
    label301:
    if (k == 0) {
      reinitializeCodec();
    } else {
      updateCodecOperatingRate();
    }
  }
  
  public void onOutputFormatChanged(MediaCodec paramMediaCodec, MediaFormat paramMediaFormat)
    throws ExoPlaybackException
  {}
  
  public void onPositionReset(long paramLong, boolean paramBoolean)
    throws ExoPlaybackException
  {
    inputStreamEnded = false;
    outputStreamEnded = false;
    if (codec != null) {
      flushCodec();
    }
    formatQueue.clear();
  }
  
  public void onProcessedOutputBuffer(long paramLong) {}
  
  public void onQueueInputBuffer(DecoderInputBuffer paramDecoderInputBuffer) {}
  
  public void onStarted() {}
  
  public void onStopped() {}
  
  public abstract boolean processOutputBuffer(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, long paramLong3, boolean paramBoolean, Format paramFormat)
    throws ExoPlaybackException;
  
  /* Error */
  public void releaseCodec()
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc2_w 787
    //   4: putfield 790	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:codecHotswapDeadlineMs	J
    //   7: aload_0
    //   8: invokespecial 430	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:resetInputBuffer	()V
    //   11: aload_0
    //   12: invokespecial 404	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:resetOutputBuffer	()V
    //   15: aload_0
    //   16: iconst_0
    //   17: putfield 440	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:waitingForKeys	Z
    //   20: aload_0
    //   21: iconst_0
    //   22: putfield 387	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:shouldSkipOutputBuffer	Z
    //   25: aload_0
    //   26: getfield 182	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:decodeOnlyPresentationTimestamps	Ljava/util/List;
    //   29: invokeinterface 791 1 0
    //   34: aload_0
    //   35: invokespecial 663	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:resetCodecBuffers	()V
    //   38: aload_0
    //   39: aconst_null
    //   40: putfield 656	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:codecInfo	Lcom/google/android/exoplayer2/mediacodec/MediaCodecInfo;
    //   43: aload_0
    //   44: iconst_0
    //   45: putfield 800	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:codecReconfigured	Z
    //   48: aload_0
    //   49: iconst_0
    //   50: putfield 438	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:codecReceivedBuffers	Z
    //   53: aload_0
    //   54: iconst_0
    //   55: putfield 489	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:codecNeedsDiscardToSpsWorkaround	Z
    //   58: aload_0
    //   59: iconst_0
    //   60: putfield 793	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:codecNeedsFlushWorkaround	Z
    //   63: aload_0
    //   64: iconst_0
    //   65: putfield 721	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:codecAdaptationWorkaroundMode	I
    //   68: aload_0
    //   69: iconst_0
    //   70: putfield 840	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:codecNeedsReconfigureWorkaround	Z
    //   73: aload_0
    //   74: iconst_0
    //   75: putfield 795	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:codecNeedsEosFlushWorkaround	Z
    //   78: aload_0
    //   79: iconst_0
    //   80: putfield 732	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:codecNeedsMonoChannelCountWorkaround	Z
    //   83: aload_0
    //   84: iconst_0
    //   85: putfield 432	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:codecNeedsAdaptationWorkaroundBuffer	Z
    //   88: aload_0
    //   89: iconst_0
    //   90: putfield 349	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:shouldSkipAdaptationWorkaroundOutputBuffer	Z
    //   93: aload_0
    //   94: iconst_0
    //   95: putfield 345	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:codecNeedsEosPropagation	Z
    //   98: aload_0
    //   99: iconst_0
    //   100: putfield 317	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:codecReceivedEos	Z
    //   103: aload_0
    //   104: iconst_0
    //   105: putfield 189	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:codecReconfigurationState	I
    //   108: aload_0
    //   109: iconst_0
    //   110: putfield 191	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:codecReinitializationState	I
    //   113: aload_0
    //   114: iconst_0
    //   115: putfield 647	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:codecConfiguredWithOperatingRate	Z
    //   118: aload_0
    //   119: getfield 319	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:codec	Landroid/media/MediaCodec;
    //   122: astore_1
    //   123: aload_1
    //   124: ifnull +237 -> 361
    //   127: aload_0
    //   128: getfield 534	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:decoderCounters	Lcom/google/android/exoplayer2/decoder/DecoderCounters;
    //   131: astore_2
    //   132: aload_2
    //   133: aload_2
    //   134: getfield 906	com/google/android/exoplayer2/decoder/DecoderCounters:decoderReleaseCount	I
    //   137: iconst_1
    //   138: iadd
    //   139: putfield 906	com/google/android/exoplayer2/decoder/DecoderCounters:decoderReleaseCount	I
    //   142: aload_1
    //   143: invokevirtual 909	android/media/MediaCodec:stop	()V
    //   146: aload_0
    //   147: getfield 319	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:codec	Landroid/media/MediaCodec;
    //   150: invokevirtual 666	android/media/MediaCodec:release	()V
    //   153: aload_0
    //   154: aconst_null
    //   155: putfield 319	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:codec	Landroid/media/MediaCodec;
    //   158: aload_0
    //   159: getfield 751	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   162: astore_2
    //   163: aload_2
    //   164: ifnull +197 -> 361
    //   167: aload_0
    //   168: getfield 817	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:pendingDrmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   171: aload_2
    //   172: if_acmpeq +189 -> 361
    //   175: aload_0
    //   176: getfield 151	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSessionManager	Lcom/google/android/exoplayer2/drm/DrmSessionManager;
    //   179: aload_2
    //   180: invokeinterface 865 2 0
    //   185: aload_0
    //   186: aconst_null
    //   187: putfield 751	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   190: goto +171 -> 361
    //   193: astore_2
    //   194: aload_0
    //   195: aconst_null
    //   196: putfield 751	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   199: aload_2
    //   200: athrow
    //   201: astore_2
    //   202: aload_0
    //   203: aconst_null
    //   204: putfield 319	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:codec	Landroid/media/MediaCodec;
    //   207: aload_0
    //   208: getfield 751	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   211: astore_1
    //   212: aload_1
    //   213: ifnull +37 -> 250
    //   216: aload_0
    //   217: getfield 817	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:pendingDrmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   220: aload_1
    //   221: if_acmpeq +29 -> 250
    //   224: aload_0
    //   225: getfield 151	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSessionManager	Lcom/google/android/exoplayer2/drm/DrmSessionManager;
    //   228: aload_1
    //   229: invokeinterface 865 2 0
    //   234: aload_0
    //   235: aconst_null
    //   236: putfield 751	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   239: goto +11 -> 250
    //   242: astore_2
    //   243: aload_0
    //   244: aconst_null
    //   245: putfield 751	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   248: aload_2
    //   249: athrow
    //   250: aload_2
    //   251: athrow
    //   252: astore_2
    //   253: aload_0
    //   254: getfield 319	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:codec	Landroid/media/MediaCodec;
    //   257: invokevirtual 666	android/media/MediaCodec:release	()V
    //   260: aload_0
    //   261: aconst_null
    //   262: putfield 319	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:codec	Landroid/media/MediaCodec;
    //   265: aload_0
    //   266: getfield 751	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   269: astore_1
    //   270: aload_1
    //   271: ifnull +37 -> 308
    //   274: aload_0
    //   275: getfield 817	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:pendingDrmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   278: aload_1
    //   279: if_acmpeq +29 -> 308
    //   282: aload_0
    //   283: getfield 151	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSessionManager	Lcom/google/android/exoplayer2/drm/DrmSessionManager;
    //   286: aload_1
    //   287: invokeinterface 865 2 0
    //   292: aload_0
    //   293: aconst_null
    //   294: putfield 751	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   297: goto +11 -> 308
    //   300: astore_2
    //   301: aload_0
    //   302: aconst_null
    //   303: putfield 751	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   306: aload_2
    //   307: athrow
    //   308: aload_2
    //   309: athrow
    //   310: astore_1
    //   311: aload_0
    //   312: aconst_null
    //   313: putfield 319	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:codec	Landroid/media/MediaCodec;
    //   316: aload_0
    //   317: getfield 751	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   320: astore_2
    //   321: aload_2
    //   322: ifnull +37 -> 359
    //   325: aload_0
    //   326: getfield 817	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:pendingDrmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   329: aload_2
    //   330: if_acmpeq +29 -> 359
    //   333: aload_0
    //   334: getfield 151	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSessionManager	Lcom/google/android/exoplayer2/drm/DrmSessionManager;
    //   337: aload_2
    //   338: invokeinterface 865 2 0
    //   343: aload_0
    //   344: aconst_null
    //   345: putfield 751	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   348: goto +11 -> 359
    //   351: astore_2
    //   352: aload_0
    //   353: aconst_null
    //   354: putfield 751	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   357: aload_2
    //   358: athrow
    //   359: aload_1
    //   360: athrow
    //   361: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	362	0	this	MediaCodecRenderer
    //   122	165	1	localObject1	Object
    //   310	50	1	localObject2	Object
    //   131	49	2	localObject3	Object
    //   193	7	2	localObject4	Object
    //   201	1	2	localObject5	Object
    //   242	9	2	localObject6	Object
    //   252	1	2	localObject7	Object
    //   300	9	2	localObject8	Object
    //   320	18	2	localDrmSession	DrmSession
    //   351	7	2	localObject9	Object
    // Exception table:
    //   from	to	target	type
    //   175	185	193	finally
    //   146	153	201	finally
    //   224	234	242	finally
    //   142	146	252	finally
    //   282	292	300	finally
    //   253	260	310	finally
    //   333	343	351	finally
  }
  
  public void render(long paramLong1, long paramLong2)
    throws ExoPlaybackException
  {
    if (outputStreamEnded)
    {
      renderToEndOfStream();
      return;
    }
    int i;
    if (format == null)
    {
      flagsOnlyBuffer.clear();
      i = readSource(formatHolder, flagsOnlyBuffer, true);
      if (i == -5)
      {
        onInputFormatChanged(formatHolder.format);
      }
      else
      {
        if (i == -4)
        {
          Assertions.checkState(flagsOnlyBuffer.isEndOfStream());
          inputStreamEnded = true;
          processEndOfStream();
        }
        return;
      }
    }
    maybeInitCodec();
    if (codec != null)
    {
      TraceUtil.beginSection("drainAndFeed");
      while (drainOutputBuffer(paramLong1, paramLong2)) {}
      while (feedInputBuffer()) {}
      TraceUtil.endSection();
    }
    else
    {
      DecoderCounters localDecoderCounters = decoderCounters;
      i = skippedInputBufferCount;
      skippedInputBufferCount = (skipSource(paramLong1) + i);
      flagsOnlyBuffer.clear();
      i = readSource(formatHolder, flagsOnlyBuffer, false);
      if (i == -5)
      {
        onInputFormatChanged(formatHolder.format);
      }
      else if (i == -4)
      {
        Assertions.checkState(flagsOnlyBuffer.isEndOfStream());
        inputStreamEnded = true;
        processEndOfStream();
      }
    }
    decoderCounters.ensureUpdated();
  }
  
  public void renderToEndOfStream()
    throws ExoPlaybackException
  {}
  
  public final void setOperatingRate(float paramFloat)
    throws ExoPlaybackException
  {
    rendererOperatingRate = paramFloat;
    updateCodecOperatingRate();
  }
  
  public boolean shouldInitCodec(MediaCodecInfo paramMediaCodecInfo)
  {
    return true;
  }
  
  public final int supportsFormat(Format paramFormat)
    throws ExoPlaybackException
  {
    try
    {
      int i = supportsFormat(mediaCodecSelector, drmSessionManager, paramFormat);
      return i;
    }
    catch (MediaCodecUtil.DecoderQueryException paramFormat)
    {
      throw ExoPlaybackException.createForRenderer(paramFormat, getIndex());
    }
  }
  
  public abstract int supportsFormat(MediaCodecSelector paramMediaCodecSelector, DrmSessionManager<FrameworkMediaCrypto> paramDrmSessionManager, Format paramFormat)
    throws MediaCodecUtil.DecoderQueryException;
  
  public final int supportsMixedMimeTypeAdaptation()
  {
    return 8;
  }
  
  @Nullable
  public final Format updateOutputFormatForTime(long paramLong)
  {
    Format localFormat = (Format)formatQueue.pollFloor(paramLong);
    if (localFormat != null) {
      outputFormat = localFormat;
    }
    return localFormat;
  }
  
  public static class DecoderInitializationException
    extends Exception
  {
    private static final int CUSTOM_ERROR_CODE_BASE = -50000;
    private static final int DECODER_QUERY_ERROR = -49998;
    private static final int NO_SUITABLE_DECODER_ERROR = -49999;
    public final String decoderName;
    public final String diagnosticInfo;
    @Nullable
    public final DecoderInitializationException fallbackDecoderInitializationException;
    public final String mimeType;
    public final boolean secureDecoderRequired;
    
    public DecoderInitializationException(Format paramFormat, Throwable paramThrowable, boolean paramBoolean, int paramInt)
    {
      this(localStringBuilder.toString(), paramThrowable, sampleMimeType, paramBoolean, null, buildCustomDiagnosticInfo(paramInt), null);
    }
    
    public DecoderInitializationException(Format paramFormat, Throwable paramThrowable, boolean paramBoolean, String paramString)
    {
      this((String)localObject, paramThrowable, str, paramBoolean, paramString, paramFormat, null);
    }
    
    private DecoderInitializationException(String paramString1, Throwable paramThrowable, String paramString2, boolean paramBoolean, @Nullable String paramString3, @Nullable String paramString4, @Nullable DecoderInitializationException paramDecoderInitializationException)
    {
      super(paramThrowable);
      mimeType = paramString2;
      secureDecoderRequired = paramBoolean;
      decoderName = paramString3;
      diagnosticInfo = paramString4;
      fallbackDecoderInitializationException = paramDecoderInitializationException;
    }
    
    private static String buildCustomDiagnosticInfo(int paramInt)
    {
      if (paramInt < 0) {
        localObject = "neg_";
      } else {
        localObject = "";
      }
      Object localObject = z2.u("com.google.android.exoplayer.MediaCodecTrackRenderer_", (String)localObject);
      ((StringBuilder)localObject).append(Math.abs(paramInt));
      return ((StringBuilder)localObject).toString();
    }
    
    @CheckResult
    private DecoderInitializationException copyWithFallbackException(DecoderInitializationException paramDecoderInitializationException)
    {
      return new DecoderInitializationException(getMessage(), getCause(), mimeType, secureDecoderRequired, decoderName, diagnosticInfo, paramDecoderInitializationException);
    }
    
    @TargetApi(21)
    private static String getDiagnosticInfoV21(Throwable paramThrowable)
    {
      if ((paramThrowable instanceof MediaCodec.CodecException)) {
        return ((MediaCodec.CodecException)paramThrowable).getDiagnosticInfo();
      }
      return null;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */