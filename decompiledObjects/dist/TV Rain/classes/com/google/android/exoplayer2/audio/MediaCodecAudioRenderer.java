package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.decoder.Buffer;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.FrameworkMediaCrypto;
import com.google.android.exoplayer2.mediacodec.MediaCodecInfo;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecSelector;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException;
import com.google.android.exoplayer2.mediacodec.MediaFormatUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MediaClock;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import z2;

@TargetApi(16)
public class MediaCodecAudioRenderer
  extends MediaCodecRenderer
  implements MediaClock
{
  private static final int MAX_PENDING_STREAM_CHANGE_COUNT = 10;
  private static final String TAG = "MediaCodecAudioRenderer";
  private boolean allowFirstBufferPositionDiscontinuity;
  private boolean allowPositionDiscontinuity;
  private final AudioSink audioSink;
  private int channelCount;
  private int codecMaxInputSize;
  private boolean codecNeedsDiscardChannelsWorkaround;
  private boolean codecNeedsEosBufferTimestampWorkaround;
  private final Context context;
  private long currentPositionUs;
  private int encoderDelay;
  private int encoderPadding;
  private final AudioRendererEventListener.EventDispatcher eventDispatcher;
  private long lastInputTimeUs;
  private boolean passthroughEnabled;
  private MediaFormat passthroughMediaFormat;
  private int pcmEncoding;
  private int pendingStreamChangeCount;
  private final long[] pendingStreamChangeTimesUs;
  
  public MediaCodecAudioRenderer(Context paramContext, MediaCodecSelector paramMediaCodecSelector)
  {
    this(paramContext, paramMediaCodecSelector, null, false);
  }
  
  public MediaCodecAudioRenderer(Context paramContext, MediaCodecSelector paramMediaCodecSelector, @Nullable Handler paramHandler, @Nullable AudioRendererEventListener paramAudioRendererEventListener)
  {
    this(paramContext, paramMediaCodecSelector, null, false, paramHandler, paramAudioRendererEventListener);
  }
  
  public MediaCodecAudioRenderer(Context paramContext, MediaCodecSelector paramMediaCodecSelector, @Nullable DrmSessionManager<FrameworkMediaCrypto> paramDrmSessionManager, boolean paramBoolean)
  {
    this(paramContext, paramMediaCodecSelector, paramDrmSessionManager, paramBoolean, null, null);
  }
  
  public MediaCodecAudioRenderer(Context paramContext, MediaCodecSelector paramMediaCodecSelector, @Nullable DrmSessionManager<FrameworkMediaCrypto> paramDrmSessionManager, boolean paramBoolean, @Nullable Handler paramHandler, @Nullable AudioRendererEventListener paramAudioRendererEventListener)
  {
    this(paramContext, paramMediaCodecSelector, paramDrmSessionManager, paramBoolean, paramHandler, paramAudioRendererEventListener, null, new AudioProcessor[0]);
  }
  
  public MediaCodecAudioRenderer(Context paramContext, MediaCodecSelector paramMediaCodecSelector, @Nullable DrmSessionManager<FrameworkMediaCrypto> paramDrmSessionManager, boolean paramBoolean, @Nullable Handler paramHandler, @Nullable AudioRendererEventListener paramAudioRendererEventListener, @Nullable AudioCapabilities paramAudioCapabilities, AudioProcessor... paramVarArgs)
  {
    this(paramContext, paramMediaCodecSelector, paramDrmSessionManager, paramBoolean, paramHandler, paramAudioRendererEventListener, new DefaultAudioSink(paramAudioCapabilities, paramVarArgs));
  }
  
  public MediaCodecAudioRenderer(Context paramContext, MediaCodecSelector paramMediaCodecSelector, @Nullable DrmSessionManager<FrameworkMediaCrypto> paramDrmSessionManager, boolean paramBoolean, @Nullable Handler paramHandler, @Nullable AudioRendererEventListener paramAudioRendererEventListener, AudioSink paramAudioSink)
  {
    super(1, paramMediaCodecSelector, paramDrmSessionManager, paramBoolean, 44100.0F);
    context = paramContext.getApplicationContext();
    audioSink = paramAudioSink;
    lastInputTimeUs = -9223372036854775807L;
    pendingStreamChangeTimesUs = new long[10];
    eventDispatcher = new AudioRendererEventListener.EventDispatcher(paramHandler, paramAudioRendererEventListener);
    paramAudioSink.setListener(new AudioSinkListener(null));
  }
  
  private static boolean codecNeedsDiscardChannelsWorkaround(String paramString)
  {
    if ((Util.SDK_INT < 24) && ("OMX.SEC.aac.dec".equals(paramString)) && ("samsung".equals(Util.MANUFACTURER)))
    {
      paramString = Util.DEVICE;
      if ((paramString.startsWith("zeroflte")) || (paramString.startsWith("herolte")) || (paramString.startsWith("heroqlte"))) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  private static boolean codecNeedsEosBufferTimestampWorkaround(String paramString)
  {
    if ((Util.SDK_INT < 21) && ("OMX.SEC.mp3.dec".equals(paramString)) && ("samsung".equals(Util.MANUFACTURER)))
    {
      paramString = Util.DEVICE;
      if ((paramString.startsWith("baffin")) || (paramString.startsWith("grand")) || (paramString.startsWith("fortuna")) || (paramString.startsWith("gprimelte")) || (paramString.startsWith("j2y18lte")) || (paramString.startsWith("ms01"))) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  private int getCodecMaxInputSize(MediaCodecInfo paramMediaCodecInfo, Format paramFormat)
  {
    int i = Util.SDK_INT;
    if ((i < 24) && ("OMX.google.raw.decoder".equals(name)))
    {
      int j = 1;
      int k = j;
      if (i == 23)
      {
        paramMediaCodecInfo = context.getPackageManager();
        k = j;
        if (paramMediaCodecInfo != null)
        {
          k = j;
          if (paramMediaCodecInfo.hasSystemFeature("android.software.leanback")) {
            k = 0;
          }
        }
      }
      if (k != 0) {
        return -1;
      }
    }
    return maxInputSize;
  }
  
  private void updateCurrentPosition()
  {
    long l = audioSink.getCurrentPositionUs(isEnded());
    if (l != Long.MIN_VALUE)
    {
      if (!allowPositionDiscontinuity) {
        l = Math.max(currentPositionUs, l);
      }
      currentPositionUs = l;
      allowPositionDiscontinuity = false;
    }
  }
  
  public boolean allowPassthrough(String paramString)
  {
    int i = MimeTypes.getEncoding(paramString);
    boolean bool;
    if ((i != 0) && (audioSink.isEncodingSupported(i))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int canKeepCodec(MediaCodec paramMediaCodec, MediaCodecInfo paramMediaCodecInfo, Format paramFormat1, Format paramFormat2)
  {
    if ((getCodecMaxInputSize(paramMediaCodecInfo, paramFormat2) <= codecMaxInputSize) && (paramMediaCodecInfo.isSeamlessAdaptationSupported(paramFormat1, paramFormat2, true)) && (encoderDelay == 0) && (encoderPadding == 0) && (encoderDelay == 0) && (encoderPadding == 0)) {
      return 1;
    }
    return 0;
  }
  
  public void configureCodec(MediaCodecInfo paramMediaCodecInfo, MediaCodec paramMediaCodec, Format paramFormat, MediaCrypto paramMediaCrypto, float paramFloat)
  {
    codecMaxInputSize = getCodecMaxInputSize(paramMediaCodecInfo, paramFormat, getStreamFormats());
    codecNeedsDiscardChannelsWorkaround = codecNeedsDiscardChannelsWorkaround(name);
    codecNeedsEosBufferTimestampWorkaround = codecNeedsEosBufferTimestampWorkaround(name);
    passthroughEnabled = passthrough;
    String str = mimeType;
    paramMediaCodecInfo = str;
    if (str == null) {
      paramMediaCodecInfo = "audio/raw";
    }
    paramMediaCodecInfo = getMediaFormat(paramFormat, paramMediaCodecInfo, codecMaxInputSize, paramFloat);
    paramMediaCodec.configure(paramMediaCodecInfo, null, paramMediaCrypto, 0);
    if (passthroughEnabled)
    {
      passthroughMediaFormat = paramMediaCodecInfo;
      paramMediaCodecInfo.setString("mime", sampleMimeType);
    }
    else
    {
      passthroughMediaFormat = null;
    }
  }
  
  public int getCodecMaxInputSize(MediaCodecInfo paramMediaCodecInfo, Format paramFormat, Format[] paramArrayOfFormat)
  {
    int i = getCodecMaxInputSize(paramMediaCodecInfo, paramFormat);
    if (paramArrayOfFormat.length == 1) {
      return i;
    }
    int j = paramArrayOfFormat.length;
    int k = 0;
    while (k < j)
    {
      Format localFormat = paramArrayOfFormat[k];
      int m = i;
      if (paramMediaCodecInfo.isSeamlessAdaptationSupported(paramFormat, localFormat, false)) {
        m = Math.max(i, getCodecMaxInputSize(paramMediaCodecInfo, localFormat));
      }
      k++;
      i = m;
    }
    return i;
  }
  
  public float getCodecOperatingRate(float paramFloat, Format paramFormat, Format[] paramArrayOfFormat)
  {
    int i = paramArrayOfFormat.length;
    int j = 0;
    int n;
    for (int k = -1; j < i; k = n)
    {
      int m = sampleRate;
      n = k;
      if (m != -1) {
        n = Math.max(k, m);
      }
      j++;
    }
    if (k == -1) {
      paramFloat = -1.0F;
    } else {
      paramFloat *= k;
    }
    return paramFloat;
  }
  
  public List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector paramMediaCodecSelector, Format paramFormat, boolean paramBoolean)
    throws MediaCodecUtil.DecoderQueryException
  {
    if (allowPassthrough(sampleMimeType))
    {
      MediaCodecInfo localMediaCodecInfo = paramMediaCodecSelector.getPassthroughDecoderInfo();
      if (localMediaCodecInfo != null) {
        return Collections.singletonList(localMediaCodecInfo);
      }
    }
    return super.getDecoderInfos(paramMediaCodecSelector, paramFormat, paramBoolean);
  }
  
  public MediaClock getMediaClock()
  {
    return this;
  }
  
  @SuppressLint({"InlinedApi"})
  public MediaFormat getMediaFormat(Format paramFormat, String paramString, int paramInt, float paramFloat)
  {
    MediaFormat localMediaFormat = new MediaFormat();
    localMediaFormat.setString("mime", paramString);
    localMediaFormat.setInteger("channel-count", channelCount);
    localMediaFormat.setInteger("sample-rate", sampleRate);
    MediaFormatUtil.setCsdBuffers(localMediaFormat, initializationData);
    MediaFormatUtil.maybeSetInteger(localMediaFormat, "max-input-size", paramInt);
    if (Util.SDK_INT >= 23)
    {
      localMediaFormat.setInteger("priority", 0);
      if (paramFloat != -1.0F) {
        localMediaFormat.setFloat("operating-rate", paramFloat);
      }
    }
    return localMediaFormat;
  }
  
  public PlaybackParameters getPlaybackParameters()
  {
    return audioSink.getPlaybackParameters();
  }
  
  public long getPositionUs()
  {
    if (getState() == 2) {
      updateCurrentPosition();
    }
    return currentPositionUs;
  }
  
  public void handleMessage(int paramInt, @Nullable Object paramObject)
    throws ExoPlaybackException
  {
    if (paramInt != 2)
    {
      if (paramInt != 3)
      {
        if (paramInt != 5)
        {
          super.handleMessage(paramInt, paramObject);
        }
        else
        {
          paramObject = (AuxEffectInfo)paramObject;
          audioSink.setAuxEffectInfo((AuxEffectInfo)paramObject);
        }
      }
      else
      {
        paramObject = (AudioAttributes)paramObject;
        audioSink.setAudioAttributes((AudioAttributes)paramObject);
      }
    }
    else {
      audioSink.setVolume(((Float)paramObject).floatValue());
    }
  }
  
  public boolean isEnded()
  {
    boolean bool;
    if ((super.isEnded()) && (audioSink.isEnded())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isReady()
  {
    boolean bool;
    if ((!audioSink.hasPendingData()) && (!super.isReady())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void onAudioSessionId(int paramInt) {}
  
  public void onAudioTrackPositionDiscontinuity() {}
  
  public void onAudioTrackUnderrun(int paramInt, long paramLong1, long paramLong2) {}
  
  public void onCodecInitialized(String paramString, long paramLong1, long paramLong2)
  {
    eventDispatcher.decoderInitialized(paramString, paramLong1, paramLong2);
  }
  
  /* Error */
  public void onDisabled()
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc2_w 90
    //   4: putfield 93	com/google/android/exoplayer2/audio/MediaCodecAudioRenderer:lastInputTimeUs	J
    //   7: aload_0
    //   8: iconst_0
    //   9: putfield 418	com/google/android/exoplayer2/audio/MediaCodecAudioRenderer:pendingStreamChangeCount	I
    //   12: aload_0
    //   13: getfield 89	com/google/android/exoplayer2/audio/MediaCodecAudioRenderer:audioSink	Lcom/google/android/exoplayer2/audio/AudioSink;
    //   16: invokeinterface 421 1 0
    //   21: aload_0
    //   22: invokespecial 423	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:onDisabled	()V
    //   25: aload_0
    //   26: getfield 427	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:decoderCounters	Lcom/google/android/exoplayer2/decoder/DecoderCounters;
    //   29: invokevirtual 432	com/google/android/exoplayer2/decoder/DecoderCounters:ensureUpdated	()V
    //   32: aload_0
    //   33: getfield 102	com/google/android/exoplayer2/audio/MediaCodecAudioRenderer:eventDispatcher	Lcom/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher;
    //   36: aload_0
    //   37: getfield 427	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:decoderCounters	Lcom/google/android/exoplayer2/decoder/DecoderCounters;
    //   40: invokevirtual 436	com/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher:disabled	(Lcom/google/android/exoplayer2/decoder/DecoderCounters;)V
    //   43: return
    //   44: astore_1
    //   45: aload_0
    //   46: getfield 427	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:decoderCounters	Lcom/google/android/exoplayer2/decoder/DecoderCounters;
    //   49: invokevirtual 432	com/google/android/exoplayer2/decoder/DecoderCounters:ensureUpdated	()V
    //   52: aload_0
    //   53: getfield 102	com/google/android/exoplayer2/audio/MediaCodecAudioRenderer:eventDispatcher	Lcom/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher;
    //   56: aload_0
    //   57: getfield 427	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:decoderCounters	Lcom/google/android/exoplayer2/decoder/DecoderCounters;
    //   60: invokevirtual 436	com/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher:disabled	(Lcom/google/android/exoplayer2/decoder/DecoderCounters;)V
    //   63: aload_1
    //   64: athrow
    //   65: astore_1
    //   66: aload_0
    //   67: invokespecial 423	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:onDisabled	()V
    //   70: aload_0
    //   71: getfield 427	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:decoderCounters	Lcom/google/android/exoplayer2/decoder/DecoderCounters;
    //   74: invokevirtual 432	com/google/android/exoplayer2/decoder/DecoderCounters:ensureUpdated	()V
    //   77: aload_0
    //   78: getfield 102	com/google/android/exoplayer2/audio/MediaCodecAudioRenderer:eventDispatcher	Lcom/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher;
    //   81: aload_0
    //   82: getfield 427	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:decoderCounters	Lcom/google/android/exoplayer2/decoder/DecoderCounters;
    //   85: invokevirtual 436	com/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher:disabled	(Lcom/google/android/exoplayer2/decoder/DecoderCounters;)V
    //   88: aload_1
    //   89: athrow
    //   90: astore_1
    //   91: aload_0
    //   92: getfield 427	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:decoderCounters	Lcom/google/android/exoplayer2/decoder/DecoderCounters;
    //   95: invokevirtual 432	com/google/android/exoplayer2/decoder/DecoderCounters:ensureUpdated	()V
    //   98: aload_0
    //   99: getfield 102	com/google/android/exoplayer2/audio/MediaCodecAudioRenderer:eventDispatcher	Lcom/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher;
    //   102: aload_0
    //   103: getfield 427	com/google/android/exoplayer2/mediacodec/MediaCodecRenderer:decoderCounters	Lcom/google/android/exoplayer2/decoder/DecoderCounters;
    //   106: invokevirtual 436	com/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher:disabled	(Lcom/google/android/exoplayer2/decoder/DecoderCounters;)V
    //   109: aload_1
    //   110: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	111	0	this	MediaCodecAudioRenderer
    //   44	20	1	localObject1	Object
    //   65	24	1	localObject2	Object
    //   90	20	1	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   21	25	44	finally
    //   0	21	65	finally
    //   66	70	90	finally
  }
  
  public void onEnabled(boolean paramBoolean)
    throws ExoPlaybackException
  {
    super.onEnabled(paramBoolean);
    eventDispatcher.enabled(decoderCounters);
    int i = getConfigurationtunnelingAudioSessionId;
    if (i != 0) {
      audioSink.enableTunnelingV21(i);
    } else {
      audioSink.disableTunneling();
    }
  }
  
  public void onInputFormatChanged(Format paramFormat)
    throws ExoPlaybackException
  {
    super.onInputFormatChanged(paramFormat);
    eventDispatcher.inputFormatChanged(paramFormat);
    int i;
    if ("audio/raw".equals(sampleMimeType)) {
      i = pcmEncoding;
    } else {
      i = 2;
    }
    pcmEncoding = i;
    channelCount = channelCount;
    encoderDelay = encoderDelay;
    encoderPadding = encoderPadding;
  }
  
  public void onOutputFormatChanged(MediaCodec paramMediaCodec, MediaFormat paramMediaFormat)
    throws ExoPlaybackException
  {
    paramMediaCodec = passthroughMediaFormat;
    int i;
    if (paramMediaCodec != null)
    {
      i = MimeTypes.getEncoding(paramMediaCodec.getString("mime"));
      paramMediaFormat = passthroughMediaFormat;
    }
    else
    {
      i = pcmEncoding;
    }
    int j = paramMediaFormat.getInteger("channel-count");
    int k = paramMediaFormat.getInteger("sample-rate");
    if ((codecNeedsDiscardChannelsWorkaround) && (j == 6))
    {
      int m = channelCount;
      if (m < 6)
      {
        paramMediaFormat = new int[m];
        for (m = 0;; m++)
        {
          paramMediaCodec = paramMediaFormat;
          if (m >= channelCount) {
            break;
          }
          paramMediaFormat[m] = m;
        }
      }
    }
    paramMediaCodec = null;
    try
    {
      audioSink.configure(i, j, k, 0, paramMediaCodec, encoderDelay, encoderPadding);
      return;
    }
    catch (AudioSink.ConfigurationException paramMediaCodec)
    {
      throw ExoPlaybackException.createForRenderer(paramMediaCodec, getIndex());
    }
  }
  
  public void onPositionReset(long paramLong, boolean paramBoolean)
    throws ExoPlaybackException
  {
    super.onPositionReset(paramLong, paramBoolean);
    audioSink.reset();
    currentPositionUs = paramLong;
    allowFirstBufferPositionDiscontinuity = true;
    allowPositionDiscontinuity = true;
    lastInputTimeUs = -9223372036854775807L;
    pendingStreamChangeCount = 0;
  }
  
  @CallSuper
  public void onProcessedOutputBuffer(long paramLong)
  {
    while ((pendingStreamChangeCount != 0) && (paramLong >= pendingStreamChangeTimesUs[0]))
    {
      audioSink.handleDiscontinuity();
      int i = pendingStreamChangeCount - 1;
      pendingStreamChangeCount = i;
      long[] arrayOfLong = pendingStreamChangeTimesUs;
      System.arraycopy(arrayOfLong, 1, arrayOfLong, 0, i);
    }
  }
  
  public void onQueueInputBuffer(DecoderInputBuffer paramDecoderInputBuffer)
  {
    if ((allowFirstBufferPositionDiscontinuity) && (!paramDecoderInputBuffer.isDecodeOnly()))
    {
      if (Math.abs(timeUs - currentPositionUs) > 500000L) {
        currentPositionUs = timeUs;
      }
      allowFirstBufferPositionDiscontinuity = false;
    }
    lastInputTimeUs = Math.max(timeUs, lastInputTimeUs);
  }
  
  public void onStarted()
  {
    super.onStarted();
    audioSink.play();
  }
  
  public void onStopped()
  {
    updateCurrentPosition();
    audioSink.pause();
    super.onStopped();
  }
  
  public void onStreamChanged(Format[] paramArrayOfFormat, long paramLong)
    throws ExoPlaybackException
  {
    super.onStreamChanged(paramArrayOfFormat, paramLong);
    if (lastInputTimeUs != -9223372036854775807L)
    {
      int i = pendingStreamChangeCount;
      if (i == pendingStreamChangeTimesUs.length)
      {
        paramArrayOfFormat = z2.t("Too many stream changes, so dropping change at ");
        paramArrayOfFormat.append(pendingStreamChangeTimesUs[(pendingStreamChangeCount - 1)]);
        Log.w("MediaCodecAudioRenderer", paramArrayOfFormat.toString());
      }
      else
      {
        pendingStreamChangeCount = (i + 1);
      }
      pendingStreamChangeTimesUs[(pendingStreamChangeCount - 1)] = lastInputTimeUs;
    }
  }
  
  public boolean processOutputBuffer(long paramLong1, long paramLong2, MediaCodec paramMediaCodec, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, long paramLong3, boolean paramBoolean, Format paramFormat)
    throws ExoPlaybackException
  {
    paramLong1 = paramLong3;
    if (codecNeedsEosBufferTimestampWorkaround)
    {
      paramLong1 = paramLong3;
      if (paramLong3 == 0L)
      {
        paramLong1 = paramLong3;
        if ((paramInt2 & 0x4) != 0)
        {
          paramLong2 = lastInputTimeUs;
          paramLong1 = paramLong3;
          if (paramLong2 != -9223372036854775807L) {
            paramLong1 = paramLong2;
          }
        }
      }
    }
    if ((passthroughEnabled) && ((paramInt2 & 0x2) != 0))
    {
      paramMediaCodec.releaseOutputBuffer(paramInt1, false);
      return true;
    }
    if (paramBoolean)
    {
      paramMediaCodec.releaseOutputBuffer(paramInt1, false);
      paramMediaCodec = decoderCounters;
      skippedOutputBufferCount += 1;
      audioSink.handleDiscontinuity();
      return true;
    }
    try
    {
      if (audioSink.handleBuffer(paramByteBuffer, paramLong1))
      {
        paramMediaCodec.releaseOutputBuffer(paramInt1, false);
        paramMediaCodec = decoderCounters;
        renderedOutputBufferCount += 1;
        return true;
      }
      return false;
    }
    catch (AudioSink.WriteException paramMediaCodec) {}catch (AudioSink.InitializationException paramMediaCodec) {}
    throw ExoPlaybackException.createForRenderer(paramMediaCodec, getIndex());
  }
  
  public void renderToEndOfStream()
    throws ExoPlaybackException
  {
    try
    {
      audioSink.playToEndOfStream();
      return;
    }
    catch (AudioSink.WriteException localWriteException)
    {
      throw ExoPlaybackException.createForRenderer(localWriteException, getIndex());
    }
  }
  
  public PlaybackParameters setPlaybackParameters(PlaybackParameters paramPlaybackParameters)
  {
    return audioSink.setPlaybackParameters(paramPlaybackParameters);
  }
  
  public int supportsFormat(MediaCodecSelector paramMediaCodecSelector, DrmSessionManager<FrameworkMediaCrypto> paramDrmSessionManager, Format paramFormat)
    throws MediaCodecUtil.DecoderQueryException
  {
    String str = sampleMimeType;
    if (!MimeTypes.isAudio(str)) {
      return 0;
    }
    int i;
    if (Util.SDK_INT >= 21) {
      i = 32;
    } else {
      i = 0;
    }
    boolean bool1 = BaseRenderer.supportsFormatDrm(paramDrmSessionManager, drmInitData);
    int j = 4;
    int k = 8;
    if ((bool1) && (allowPassthrough(str)) && (paramMediaCodecSelector.getPassthroughDecoderInfo() != null)) {
      return i | 0x8 | 0x4;
    }
    boolean bool2 = "audio/raw".equals(str);
    boolean bool3 = true;
    if (((bool2) && (!audioSink.isEncodingSupported(pcmEncoding))) || (!audioSink.isEncodingSupported(2))) {
      return 1;
    }
    paramDrmSessionManager = drmInitData;
    boolean bool4;
    if (paramDrmSessionManager != null)
    {
      int m = 0;
      int n = m;
      for (;;)
      {
        i2 = n;
        if (m >= schemeDataCount) {
          break;
        }
        n |= getrequiresSecureDecryption;
        m++;
      }
    }
    int i2 = 0;
    paramDrmSessionManager = paramMediaCodecSelector.getDecoderInfos(sampleMimeType, i2);
    if (paramDrmSessionManager.isEmpty())
    {
      bool4 = bool3;
      if (i2 != 0)
      {
        bool4 = bool3;
        if (!paramMediaCodecSelector.getDecoderInfos(sampleMimeType, false).isEmpty()) {
          i1 = 2;
        }
      }
      return i1;
    }
    if (!bool1) {
      return 2;
    }
    paramMediaCodecSelector = (MediaCodecInfo)paramDrmSessionManager.get(0);
    bool1 = paramMediaCodecSelector.isFormatSupported(paramFormat);
    int i1 = k;
    if (bool1)
    {
      i1 = k;
      if (paramMediaCodecSelector.isSeamlessAdaptationSupported(paramFormat)) {
        i1 = 16;
      }
    }
    int i3;
    if (bool1) {
      i2 = j;
    } else {
      i3 = 3;
    }
    return i1 | i | i3;
  }
  
  public final class AudioSinkListener
    implements AudioSink.Listener
  {
    private AudioSinkListener() {}
    
    public void onAudioSessionId(int paramInt)
    {
      MediaCodecAudioRenderer.access$100(MediaCodecAudioRenderer.this).audioSessionId(paramInt);
      MediaCodecAudioRenderer.this.onAudioSessionId(paramInt);
    }
    
    public void onPositionDiscontinuity()
    {
      onAudioTrackPositionDiscontinuity();
      MediaCodecAudioRenderer.access$202(MediaCodecAudioRenderer.this, true);
    }
    
    public void onUnderrun(int paramInt, long paramLong1, long paramLong2)
    {
      MediaCodecAudioRenderer.access$100(MediaCodecAudioRenderer.this).audioTrackUnderrun(paramInt, paramLong1, paramLong2);
      onAudioTrackUnderrun(paramInt, paramLong1, paramLong2);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.MediaCodecAudioRenderer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */