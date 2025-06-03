package com.google.android.exoplayer2.audio;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.decoder.Buffer;
import com.google.android.exoplayer2.decoder.Decoder;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.OutputBuffer;
import com.google.android.exoplayer2.decoder.SimpleDecoder;
import com.google.android.exoplayer2.decoder.SimpleOutputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MediaClock;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;

public abstract class SimpleDecoderAudioRenderer
  extends BaseRenderer
  implements MediaClock
{
  private static final int REINITIALIZATION_STATE_NONE = 0;
  private static final int REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM = 1;
  private static final int REINITIALIZATION_STATE_WAIT_END_OF_STREAM = 2;
  private boolean allowFirstBufferPositionDiscontinuity;
  private boolean allowPositionDiscontinuity;
  private final AudioSink audioSink;
  private boolean audioTrackNeedsConfigure;
  private long currentPositionUs;
  private SimpleDecoder<DecoderInputBuffer, ? extends SimpleOutputBuffer, ? extends AudioDecoderException> decoder;
  private DecoderCounters decoderCounters;
  private boolean decoderReceivedBuffers;
  private int decoderReinitializationState;
  private DrmSession<ExoMediaCrypto> drmSession;
  private final DrmSessionManager<ExoMediaCrypto> drmSessionManager;
  private int encoderDelay;
  private int encoderPadding;
  private final AudioRendererEventListener.EventDispatcher eventDispatcher;
  private final DecoderInputBuffer flagsOnlyBuffer;
  private final FormatHolder formatHolder;
  private DecoderInputBuffer inputBuffer;
  private Format inputFormat;
  private boolean inputStreamEnded;
  private SimpleOutputBuffer outputBuffer;
  private boolean outputStreamEnded;
  private DrmSession<ExoMediaCrypto> pendingDrmSession;
  private final boolean playClearSamplesWithoutKeys;
  private boolean waitingForKeys;
  
  public SimpleDecoderAudioRenderer()
  {
    this(null, null, new AudioProcessor[0]);
  }
  
  public SimpleDecoderAudioRenderer(@Nullable Handler paramHandler, @Nullable AudioRendererEventListener paramAudioRendererEventListener, @Nullable AudioCapabilities paramAudioCapabilities)
  {
    this(paramHandler, paramAudioRendererEventListener, paramAudioCapabilities, null, false, new AudioProcessor[0]);
  }
  
  public SimpleDecoderAudioRenderer(@Nullable Handler paramHandler, @Nullable AudioRendererEventListener paramAudioRendererEventListener, @Nullable AudioCapabilities paramAudioCapabilities, @Nullable DrmSessionManager<ExoMediaCrypto> paramDrmSessionManager, boolean paramBoolean, AudioProcessor... paramVarArgs)
  {
    this(paramHandler, paramAudioRendererEventListener, paramDrmSessionManager, paramBoolean, new DefaultAudioSink(paramAudioCapabilities, paramVarArgs));
  }
  
  public SimpleDecoderAudioRenderer(@Nullable Handler paramHandler, @Nullable AudioRendererEventListener paramAudioRendererEventListener, @Nullable DrmSessionManager<ExoMediaCrypto> paramDrmSessionManager, boolean paramBoolean, AudioSink paramAudioSink)
  {
    super(1);
    drmSessionManager = paramDrmSessionManager;
    playClearSamplesWithoutKeys = paramBoolean;
    eventDispatcher = new AudioRendererEventListener.EventDispatcher(paramHandler, paramAudioRendererEventListener);
    audioSink = paramAudioSink;
    paramAudioSink.setListener(new AudioSinkListener(null));
    formatHolder = new FormatHolder();
    flagsOnlyBuffer = DecoderInputBuffer.newFlagsOnlyInstance();
    decoderReinitializationState = 0;
    audioTrackNeedsConfigure = true;
  }
  
  public SimpleDecoderAudioRenderer(@Nullable Handler paramHandler, @Nullable AudioRendererEventListener paramAudioRendererEventListener, AudioProcessor... paramVarArgs)
  {
    this(paramHandler, paramAudioRendererEventListener, null, null, false, paramVarArgs);
  }
  
  private boolean drainOutputBuffer()
    throws ExoPlaybackException, AudioDecoderException, AudioSink.ConfigurationException, AudioSink.InitializationException, AudioSink.WriteException
  {
    if (outputBuffer == null)
    {
      localObject1 = (SimpleOutputBuffer)decoder.dequeueOutputBuffer();
      outputBuffer = ((SimpleOutputBuffer)localObject1);
      if (localObject1 == null) {
        return false;
      }
      localObject2 = decoderCounters;
      skippedOutputBufferCount += skippedOutputBufferCount;
    }
    if (outputBuffer.isEndOfStream())
    {
      if (decoderReinitializationState == 2)
      {
        releaseDecoder();
        maybeInitDecoder();
        audioTrackNeedsConfigure = true;
      }
      else
      {
        outputBuffer.release();
        outputBuffer = null;
        processEndOfStream();
      }
      return false;
    }
    if (audioTrackNeedsConfigure)
    {
      localObject1 = getOutputFormat();
      audioSink.configure(pcmEncoding, channelCount, sampleRate, 0, null, encoderDelay, encoderPadding);
      audioTrackNeedsConfigure = false;
    }
    Object localObject2 = audioSink;
    Object localObject1 = outputBuffer;
    if (((AudioSink)localObject2).handleBuffer(data, timeUs))
    {
      localObject1 = decoderCounters;
      renderedOutputBufferCount += 1;
      outputBuffer.release();
      outputBuffer = null;
      return true;
    }
    return false;
  }
  
  private boolean feedInputBuffer()
    throws AudioDecoderException, ExoPlaybackException
  {
    Object localObject = decoder;
    if ((localObject != null) && (decoderReinitializationState != 2) && (!inputStreamEnded))
    {
      if (inputBuffer == null)
      {
        localObject = ((SimpleDecoder)localObject).dequeueInputBuffer();
        inputBuffer = ((DecoderInputBuffer)localObject);
        if (localObject == null) {
          return false;
        }
      }
      if (decoderReinitializationState == 1)
      {
        inputBuffer.setFlags(4);
        decoder.queueInputBuffer(inputBuffer);
        inputBuffer = null;
        decoderReinitializationState = 2;
        return false;
      }
      int i;
      if (waitingForKeys) {
        i = -4;
      } else {
        i = readSource(formatHolder, inputBuffer, false);
      }
      if (i == -3) {
        return false;
      }
      if (i == -5)
      {
        onInputFormatChanged(formatHolder.format);
        return true;
      }
      if (inputBuffer.isEndOfStream())
      {
        inputStreamEnded = true;
        decoder.queueInputBuffer(inputBuffer);
        inputBuffer = null;
        return false;
      }
      boolean bool = shouldWaitForKeys(inputBuffer.isEncrypted());
      waitingForKeys = bool;
      if (bool) {
        return false;
      }
      inputBuffer.flip();
      onQueueInputBuffer(inputBuffer);
      decoder.queueInputBuffer(inputBuffer);
      decoderReceivedBuffers = true;
      localObject = decoderCounters;
      inputBufferCount += 1;
      inputBuffer = null;
      return true;
    }
    return false;
  }
  
  private void flushDecoder()
    throws ExoPlaybackException
  {
    waitingForKeys = false;
    if (decoderReinitializationState != 0)
    {
      releaseDecoder();
      maybeInitDecoder();
    }
    else
    {
      inputBuffer = null;
      SimpleOutputBuffer localSimpleOutputBuffer = outputBuffer;
      if (localSimpleOutputBuffer != null)
      {
        localSimpleOutputBuffer.release();
        outputBuffer = null;
      }
      decoder.flush();
      decoderReceivedBuffers = false;
    }
  }
  
  private void maybeInitDecoder()
    throws ExoPlaybackException
  {
    if (decoder != null) {
      return;
    }
    Object localObject1 = pendingDrmSession;
    drmSession = ((DrmSession)localObject1);
    Object localObject2 = null;
    if (localObject1 != null)
    {
      localObject1 = ((DrmSession)localObject1).getMediaCrypto();
      localObject2 = localObject1;
      if (localObject1 == null) {
        if (drmSession.getError() != null) {
          localObject2 = localObject1;
        } else {
          return;
        }
      }
    }
    try
    {
      long l1 = SystemClock.elapsedRealtime();
      TraceUtil.beginSection("createAudioDecoder");
      decoder = createDecoder(inputFormat, (ExoMediaCrypto)localObject2);
      TraceUtil.endSection();
      long l2 = SystemClock.elapsedRealtime();
      eventDispatcher.decoderInitialized(decoder.getName(), l2, l2 - l1);
      localObject2 = decoderCounters;
      decoderInitCount += 1;
      return;
    }
    catch (AudioDecoderException localAudioDecoderException)
    {
      throw ExoPlaybackException.createForRenderer(localAudioDecoderException, getIndex());
    }
  }
  
  private void onInputFormatChanged(Format paramFormat)
    throws ExoPlaybackException
  {
    Object localObject = inputFormat;
    inputFormat = paramFormat;
    DrmInitData localDrmInitData = drmInitData;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = drmInitData;
    }
    if ((Util.areEqual(localDrmInitData, localObject) ^ true)) {
      if (inputFormat.drmInitData != null)
      {
        localObject = drmSessionManager;
        if (localObject != null)
        {
          localObject = ((DrmSessionManager)localObject).acquireSession(Looper.myLooper(), inputFormat.drmInitData);
          pendingDrmSession = ((DrmSession)localObject);
          if (localObject == drmSession) {
            drmSessionManager.releaseSession((DrmSession)localObject);
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
    if (decoderReceivedBuffers)
    {
      decoderReinitializationState = 1;
    }
    else
    {
      releaseDecoder();
      maybeInitDecoder();
      audioTrackNeedsConfigure = true;
    }
    encoderDelay = encoderDelay;
    encoderPadding = encoderPadding;
    eventDispatcher.inputFormatChanged(paramFormat);
  }
  
  private void onQueueInputBuffer(DecoderInputBuffer paramDecoderInputBuffer)
  {
    if ((allowFirstBufferPositionDiscontinuity) && (!paramDecoderInputBuffer.isDecodeOnly()))
    {
      if (Math.abs(timeUs - currentPositionUs) > 500000L) {
        currentPositionUs = timeUs;
      }
      allowFirstBufferPositionDiscontinuity = false;
    }
  }
  
  private void processEndOfStream()
    throws ExoPlaybackException
  {
    outputStreamEnded = true;
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
  
  private void releaseDecoder()
  {
    Object localObject = decoder;
    if (localObject == null) {
      return;
    }
    inputBuffer = null;
    outputBuffer = null;
    ((SimpleDecoder)localObject).release();
    decoder = null;
    localObject = decoderCounters;
    decoderReleaseCount += 1;
    decoderReinitializationState = 0;
    decoderReceivedBuffers = false;
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
  
  public abstract SimpleDecoder<DecoderInputBuffer, ? extends SimpleOutputBuffer, ? extends AudioDecoderException> createDecoder(Format paramFormat, ExoMediaCrypto paramExoMediaCrypto)
    throws AudioDecoderException;
  
  public MediaClock getMediaClock()
  {
    return this;
  }
  
  public Format getOutputFormat()
  {
    Format localFormat = inputFormat;
    return Format.createAudioSampleFormat(null, "audio/raw", null, -1, -1, channelCount, sampleRate, 2, null, null, 0, null);
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
    if ((outputStreamEnded) && (audioSink.isEnded())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isReady()
  {
    boolean bool;
    if ((!audioSink.hasPendingData()) && ((inputFormat == null) || (waitingForKeys) || ((!isSourceReady()) && (outputBuffer == null)))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void onAudioSessionId(int paramInt) {}
  
  public void onAudioTrackPositionDiscontinuity() {}
  
  public void onAudioTrackUnderrun(int paramInt, long paramLong1, long paramLong2) {}
  
  /* Error */
  public void onDisabled()
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield 300	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:inputFormat	Lcom/google/android/exoplayer2/Format;
    //   5: aload_0
    //   6: iconst_1
    //   7: putfield 124	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:audioTrackNeedsConfigure	Z
    //   10: aload_0
    //   11: iconst_0
    //   12: putfield 237	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:waitingForKeys	Z
    //   15: aload_0
    //   16: invokespecial 173	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:releaseDecoder	()V
    //   19: aload_0
    //   20: getfield 97	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:audioSink	Lcom/google/android/exoplayer2/audio/AudioSink;
    //   23: invokeinterface 463 1 0
    //   28: aload_0
    //   29: getfield 274	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   32: astore_1
    //   33: aload_1
    //   34: ifnull +13 -> 47
    //   37: aload_0
    //   38: getfield 86	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:drmSessionManager	Lcom/google/android/exoplayer2/drm/DrmSessionManager;
    //   41: aload_1
    //   42: invokeinterface 354 2 0
    //   47: aload_0
    //   48: getfield 272	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:pendingDrmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   51: astore_1
    //   52: aload_1
    //   53: ifnull +21 -> 74
    //   56: aload_1
    //   57: aload_0
    //   58: getfield 274	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   61: if_acmpeq +13 -> 74
    //   64: aload_0
    //   65: getfield 86	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:drmSessionManager	Lcom/google/android/exoplayer2/drm/DrmSessionManager;
    //   68: aload_1
    //   69: invokeinterface 354 2 0
    //   74: aload_0
    //   75: aconst_null
    //   76: putfield 274	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   79: aload_0
    //   80: aconst_null
    //   81: putfield 272	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:pendingDrmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   84: aload_0
    //   85: getfield 157	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:decoderCounters	Lcom/google/android/exoplayer2/decoder/DecoderCounters;
    //   88: invokevirtual 466	com/google/android/exoplayer2/decoder/DecoderCounters:ensureUpdated	()V
    //   91: aload_0
    //   92: getfield 95	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:eventDispatcher	Lcom/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher;
    //   95: aload_0
    //   96: getfield 157	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:decoderCounters	Lcom/google/android/exoplayer2/decoder/DecoderCounters;
    //   99: invokevirtual 470	com/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher:disabled	(Lcom/google/android/exoplayer2/decoder/DecoderCounters;)V
    //   102: return
    //   103: astore_1
    //   104: aload_0
    //   105: aconst_null
    //   106: putfield 274	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   109: aload_0
    //   110: aconst_null
    //   111: putfield 272	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:pendingDrmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   114: aload_0
    //   115: getfield 157	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:decoderCounters	Lcom/google/android/exoplayer2/decoder/DecoderCounters;
    //   118: invokevirtual 466	com/google/android/exoplayer2/decoder/DecoderCounters:ensureUpdated	()V
    //   121: aload_0
    //   122: getfield 95	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:eventDispatcher	Lcom/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher;
    //   125: aload_0
    //   126: getfield 157	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:decoderCounters	Lcom/google/android/exoplayer2/decoder/DecoderCounters;
    //   129: invokevirtual 470	com/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher:disabled	(Lcom/google/android/exoplayer2/decoder/DecoderCounters;)V
    //   132: aload_1
    //   133: athrow
    //   134: astore_2
    //   135: aload_0
    //   136: getfield 272	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:pendingDrmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   139: astore_1
    //   140: aload_1
    //   141: ifnull +21 -> 162
    //   144: aload_1
    //   145: aload_0
    //   146: getfield 274	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   149: if_acmpeq +13 -> 162
    //   152: aload_0
    //   153: getfield 86	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:drmSessionManager	Lcom/google/android/exoplayer2/drm/DrmSessionManager;
    //   156: aload_1
    //   157: invokeinterface 354 2 0
    //   162: aload_0
    //   163: aconst_null
    //   164: putfield 274	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   167: aload_0
    //   168: aconst_null
    //   169: putfield 272	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:pendingDrmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   172: aload_0
    //   173: getfield 157	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:decoderCounters	Lcom/google/android/exoplayer2/decoder/DecoderCounters;
    //   176: invokevirtual 466	com/google/android/exoplayer2/decoder/DecoderCounters:ensureUpdated	()V
    //   179: aload_0
    //   180: getfield 95	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:eventDispatcher	Lcom/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher;
    //   183: aload_0
    //   184: getfield 157	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:decoderCounters	Lcom/google/android/exoplayer2/decoder/DecoderCounters;
    //   187: invokevirtual 470	com/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher:disabled	(Lcom/google/android/exoplayer2/decoder/DecoderCounters;)V
    //   190: aload_2
    //   191: athrow
    //   192: astore_1
    //   193: aload_0
    //   194: aconst_null
    //   195: putfield 274	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   198: aload_0
    //   199: aconst_null
    //   200: putfield 272	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:pendingDrmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   203: aload_0
    //   204: getfield 157	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:decoderCounters	Lcom/google/android/exoplayer2/decoder/DecoderCounters;
    //   207: invokevirtual 466	com/google/android/exoplayer2/decoder/DecoderCounters:ensureUpdated	()V
    //   210: aload_0
    //   211: getfield 95	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:eventDispatcher	Lcom/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher;
    //   214: aload_0
    //   215: getfield 157	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:decoderCounters	Lcom/google/android/exoplayer2/decoder/DecoderCounters;
    //   218: invokevirtual 470	com/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher:disabled	(Lcom/google/android/exoplayer2/decoder/DecoderCounters;)V
    //   221: aload_1
    //   222: athrow
    //   223: astore_1
    //   224: aload_0
    //   225: getfield 274	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   228: astore_2
    //   229: aload_2
    //   230: ifnull +13 -> 243
    //   233: aload_0
    //   234: getfield 86	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:drmSessionManager	Lcom/google/android/exoplayer2/drm/DrmSessionManager;
    //   237: aload_2
    //   238: invokeinterface 354 2 0
    //   243: aload_0
    //   244: getfield 272	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:pendingDrmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   247: astore_2
    //   248: aload_2
    //   249: ifnull +21 -> 270
    //   252: aload_2
    //   253: aload_0
    //   254: getfield 274	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   257: if_acmpeq +13 -> 270
    //   260: aload_0
    //   261: getfield 86	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:drmSessionManager	Lcom/google/android/exoplayer2/drm/DrmSessionManager;
    //   264: aload_2
    //   265: invokeinterface 354 2 0
    //   270: aload_0
    //   271: aconst_null
    //   272: putfield 274	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   275: aload_0
    //   276: aconst_null
    //   277: putfield 272	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:pendingDrmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   280: aload_0
    //   281: getfield 157	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:decoderCounters	Lcom/google/android/exoplayer2/decoder/DecoderCounters;
    //   284: invokevirtual 466	com/google/android/exoplayer2/decoder/DecoderCounters:ensureUpdated	()V
    //   287: aload_0
    //   288: getfield 95	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:eventDispatcher	Lcom/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher;
    //   291: aload_0
    //   292: getfield 157	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:decoderCounters	Lcom/google/android/exoplayer2/decoder/DecoderCounters;
    //   295: invokevirtual 470	com/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher:disabled	(Lcom/google/android/exoplayer2/decoder/DecoderCounters;)V
    //   298: aload_1
    //   299: athrow
    //   300: astore_1
    //   301: aload_0
    //   302: aconst_null
    //   303: putfield 274	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   306: aload_0
    //   307: aconst_null
    //   308: putfield 272	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:pendingDrmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   311: aload_0
    //   312: getfield 157	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:decoderCounters	Lcom/google/android/exoplayer2/decoder/DecoderCounters;
    //   315: invokevirtual 466	com/google/android/exoplayer2/decoder/DecoderCounters:ensureUpdated	()V
    //   318: aload_0
    //   319: getfield 95	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:eventDispatcher	Lcom/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher;
    //   322: aload_0
    //   323: getfield 157	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:decoderCounters	Lcom/google/android/exoplayer2/decoder/DecoderCounters;
    //   326: invokevirtual 470	com/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher:disabled	(Lcom/google/android/exoplayer2/decoder/DecoderCounters;)V
    //   329: aload_1
    //   330: athrow
    //   331: astore_2
    //   332: aload_0
    //   333: getfield 272	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:pendingDrmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   336: astore_1
    //   337: aload_1
    //   338: ifnull +21 -> 359
    //   341: aload_1
    //   342: aload_0
    //   343: getfield 274	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   346: if_acmpeq +13 -> 359
    //   349: aload_0
    //   350: getfield 86	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:drmSessionManager	Lcom/google/android/exoplayer2/drm/DrmSessionManager;
    //   353: aload_1
    //   354: invokeinterface 354 2 0
    //   359: aload_0
    //   360: aconst_null
    //   361: putfield 274	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   364: aload_0
    //   365: aconst_null
    //   366: putfield 272	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:pendingDrmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   369: aload_0
    //   370: getfield 157	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:decoderCounters	Lcom/google/android/exoplayer2/decoder/DecoderCounters;
    //   373: invokevirtual 466	com/google/android/exoplayer2/decoder/DecoderCounters:ensureUpdated	()V
    //   376: aload_0
    //   377: getfield 95	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:eventDispatcher	Lcom/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher;
    //   380: aload_0
    //   381: getfield 157	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:decoderCounters	Lcom/google/android/exoplayer2/decoder/DecoderCounters;
    //   384: invokevirtual 470	com/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher:disabled	(Lcom/google/android/exoplayer2/decoder/DecoderCounters;)V
    //   387: aload_2
    //   388: athrow
    //   389: astore_1
    //   390: aload_0
    //   391: aconst_null
    //   392: putfield 274	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:drmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   395: aload_0
    //   396: aconst_null
    //   397: putfield 272	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:pendingDrmSession	Lcom/google/android/exoplayer2/drm/DrmSession;
    //   400: aload_0
    //   401: getfield 157	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:decoderCounters	Lcom/google/android/exoplayer2/decoder/DecoderCounters;
    //   404: invokevirtual 466	com/google/android/exoplayer2/decoder/DecoderCounters:ensureUpdated	()V
    //   407: aload_0
    //   408: getfield 95	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:eventDispatcher	Lcom/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher;
    //   411: aload_0
    //   412: getfield 157	com/google/android/exoplayer2/audio/SimpleDecoderAudioRenderer:decoderCounters	Lcom/google/android/exoplayer2/decoder/DecoderCounters;
    //   415: invokevirtual 470	com/google/android/exoplayer2/audio/AudioRendererEventListener$EventDispatcher:disabled	(Lcom/google/android/exoplayer2/decoder/DecoderCounters;)V
    //   418: aload_1
    //   419: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	420	0	this	SimpleDecoderAudioRenderer
    //   32	37	1	localDrmSession1	DrmSession
    //   103	30	1	localObject1	Object
    //   139	18	1	localDrmSession2	DrmSession
    //   192	30	1	localObject2	Object
    //   223	76	1	localObject3	Object
    //   300	30	1	localObject4	Object
    //   336	18	1	localDrmSession3	DrmSession
    //   389	30	1	localObject5	Object
    //   134	57	2	localObject6	Object
    //   228	37	2	localDrmSession4	DrmSession
    //   331	57	2	localObject7	Object
    // Exception table:
    //   from	to	target	type
    //   47	52	103	finally
    //   56	74	103	finally
    //   28	33	134	finally
    //   37	47	134	finally
    //   135	140	192	finally
    //   144	162	192	finally
    //   15	28	223	finally
    //   243	248	300	finally
    //   252	270	300	finally
    //   224	229	331	finally
    //   233	243	331	finally
    //   332	337	389	finally
    //   341	359	389	finally
  }
  
  public void onEnabled(boolean paramBoolean)
    throws ExoPlaybackException
  {
    DecoderCounters localDecoderCounters = new DecoderCounters();
    decoderCounters = localDecoderCounters;
    eventDispatcher.enabled(localDecoderCounters);
    int i = getConfigurationtunnelingAudioSessionId;
    if (i != 0) {
      audioSink.enableTunnelingV21(i);
    } else {
      audioSink.disableTunneling();
    }
  }
  
  public void onPositionReset(long paramLong, boolean paramBoolean)
    throws ExoPlaybackException
  {
    audioSink.reset();
    currentPositionUs = paramLong;
    allowFirstBufferPositionDiscontinuity = true;
    allowPositionDiscontinuity = true;
    inputStreamEnded = false;
    outputStreamEnded = false;
    if (decoder != null) {
      flushDecoder();
    }
  }
  
  public void onStarted()
  {
    audioSink.play();
  }
  
  public void onStopped()
  {
    updateCurrentPosition();
    audioSink.pause();
  }
  
  public void render(long paramLong1, long paramLong2)
    throws ExoPlaybackException
  {
    if (outputStreamEnded) {
      try
      {
        audioSink.playToEndOfStream();
        return;
      }
      catch (AudioSink.WriteException localWriteException1)
      {
        throw ExoPlaybackException.createForRenderer(localWriteException1, getIndex());
      }
    }
    if (inputFormat == null)
    {
      flagsOnlyBuffer.clear();
      int i = readSource(formatHolder, flagsOnlyBuffer, true);
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
    maybeInitDecoder();
    if (decoder != null)
    {
      try
      {
        TraceUtil.beginSection("drainAndFeed");
        while (drainOutputBuffer()) {}
        while (feedInputBuffer()) {}
        TraceUtil.endSection();
        decoderCounters.ensureUpdated();
      }
      catch (AudioSink.WriteException localWriteException2) {}catch (AudioSink.InitializationException localInitializationException) {}catch (AudioSink.ConfigurationException localConfigurationException) {}catch (AudioDecoderException localAudioDecoderException) {}
      throw ExoPlaybackException.createForRenderer(localAudioDecoderException, getIndex());
    }
  }
  
  public PlaybackParameters setPlaybackParameters(PlaybackParameters paramPlaybackParameters)
  {
    return audioSink.setPlaybackParameters(paramPlaybackParameters);
  }
  
  public final int supportsFormat(Format paramFormat)
  {
    boolean bool = MimeTypes.isAudio(sampleMimeType);
    int i = 0;
    if (!bool) {
      return 0;
    }
    int j = supportsFormatInternal(drmSessionManager, paramFormat);
    if (j <= 2) {
      return j;
    }
    if (Util.SDK_INT >= 21) {
      i = 32;
    }
    return j | i | 0x8;
  }
  
  public abstract int supportsFormatInternal(DrmSessionManager<ExoMediaCrypto> paramDrmSessionManager, Format paramFormat);
  
  public final boolean supportsOutputEncoding(int paramInt)
  {
    return audioSink.isEncodingSupported(paramInt);
  }
  
  public final class AudioSinkListener
    implements AudioSink.Listener
  {
    private AudioSinkListener() {}
    
    public void onAudioSessionId(int paramInt)
    {
      SimpleDecoderAudioRenderer.access$100(SimpleDecoderAudioRenderer.this).audioSessionId(paramInt);
      SimpleDecoderAudioRenderer.this.onAudioSessionId(paramInt);
    }
    
    public void onPositionDiscontinuity()
    {
      onAudioTrackPositionDiscontinuity();
      SimpleDecoderAudioRenderer.access$202(SimpleDecoderAudioRenderer.this, true);
    }
    
    public void onUnderrun(int paramInt, long paramLong1, long paramLong2)
    {
      SimpleDecoderAudioRenderer.access$100(SimpleDecoderAudioRenderer.this).audioTrackUnderrun(paramInt, paramLong1, paramLong2);
      onAudioTrackUnderrun(paramInt, paramLong1, paramLong2);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.SimpleDecoderAudioRenderer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */