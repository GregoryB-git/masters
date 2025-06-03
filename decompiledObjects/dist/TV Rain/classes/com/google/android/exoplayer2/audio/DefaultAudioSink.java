package com.google.android.exoplayer2.audio;

import a;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.AudioAttributes.Builder;
import android.media.AudioFormat;
import android.media.AudioFormat.Builder;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public final class DefaultAudioSink
  implements AudioSink
{
  private static final int AC3_BUFFER_MULTIPLICATION_FACTOR = 2;
  private static final int BUFFER_MULTIPLICATION_FACTOR = 4;
  private static final int ERROR_BAD_VALUE = -2;
  private static final long MAX_BUFFER_DURATION_US = 750000L;
  private static final long MIN_BUFFER_DURATION_US = 250000L;
  private static final int MODE_STATIC = 0;
  private static final int MODE_STREAM = 1;
  private static final long PASSTHROUGH_BUFFER_DURATION_US = 250000L;
  private static final int START_IN_SYNC = 1;
  private static final int START_NEED_SYNC = 2;
  private static final int START_NOT_SET = 0;
  private static final int STATE_INITIALIZED = 1;
  private static final String TAG = "AudioTrack";
  @SuppressLint({"InlinedApi"})
  private static final int WRITE_NON_BLOCKING = 1;
  public static boolean enablePreV21AudioSessionWorkaround = false;
  public static boolean failOnSpuriousAudioTimestamp = false;
  private AudioProcessor[] activeAudioProcessors;
  @Nullable
  private PlaybackParameters afterDrainPlaybackParameters;
  private AudioAttributes audioAttributes;
  @Nullable
  private final AudioCapabilities audioCapabilities;
  private final AudioProcessorChain audioProcessorChain;
  private int audioSessionId;
  private AudioTrack audioTrack;
  private final AudioTrackPositionTracker audioTrackPositionTracker;
  private AuxEffectInfo auxEffectInfo;
  @Nullable
  private ByteBuffer avSyncHeader;
  private int bufferSize;
  private int bytesUntilNextAvSync;
  private boolean canApplyPlaybackParameters;
  private final ChannelMappingAudioProcessor channelMappingAudioProcessor;
  private int drainingAudioProcessorIndex;
  private final boolean enableConvertHighResIntPcmToFloat;
  private int framesPerEncodedSample;
  private boolean handledEndOfStream;
  @Nullable
  private ByteBuffer inputBuffer;
  private int inputSampleRate;
  private boolean isInputPcm;
  @Nullable
  private AudioTrack keepSessionIdAudioTrack;
  private long lastFeedElapsedRealtimeMs;
  @Nullable
  private AudioSink.Listener listener;
  @Nullable
  private ByteBuffer outputBuffer;
  private ByteBuffer[] outputBuffers;
  private int outputChannelConfig;
  private int outputEncoding;
  private int outputPcmFrameSize;
  private int outputSampleRate;
  private int pcmFrameSize;
  private PlaybackParameters playbackParameters;
  private final ArrayDeque<PlaybackParametersCheckpoint> playbackParametersCheckpoints;
  private long playbackParametersOffsetUs;
  private long playbackParametersPositionUs;
  private boolean playing;
  private byte[] preV21OutputBuffer;
  private int preV21OutputBufferOffset;
  private boolean processingEnabled;
  private final ConditionVariable releasingConditionVariable;
  private boolean shouldConvertHighResIntPcmToFloat;
  private int startMediaTimeState;
  private long startMediaTimeUs;
  private long submittedEncodedFrames;
  private long submittedPcmBytes;
  private final AudioProcessor[] toFloatPcmAvailableAudioProcessors;
  private final AudioProcessor[] toIntPcmAvailableAudioProcessors;
  private final TrimmingAudioProcessor trimmingAudioProcessor;
  private boolean tunneling;
  private float volume;
  private long writtenEncodedFrames;
  private long writtenPcmBytes;
  
  public DefaultAudioSink(@Nullable AudioCapabilities paramAudioCapabilities, AudioProcessorChain paramAudioProcessorChain, boolean paramBoolean)
  {
    audioCapabilities = paramAudioCapabilities;
    audioProcessorChain = ((AudioProcessorChain)Assertions.checkNotNull(paramAudioProcessorChain));
    enableConvertHighResIntPcmToFloat = paramBoolean;
    releasingConditionVariable = new ConditionVariable(true);
    audioTrackPositionTracker = new AudioTrackPositionTracker(new PositionTrackerListener(null));
    paramAudioCapabilities = new ChannelMappingAudioProcessor();
    channelMappingAudioProcessor = paramAudioCapabilities;
    TrimmingAudioProcessor localTrimmingAudioProcessor = new TrimmingAudioProcessor();
    trimmingAudioProcessor = localTrimmingAudioProcessor;
    ArrayList localArrayList = new ArrayList();
    Collections.addAll(localArrayList, new AudioProcessor[] { new ResamplingAudioProcessor(), paramAudioCapabilities, localTrimmingAudioProcessor });
    Collections.addAll(localArrayList, paramAudioProcessorChain.getAudioProcessors());
    toIntPcmAvailableAudioProcessors = ((AudioProcessor[])localArrayList.toArray(new AudioProcessor[localArrayList.size()]));
    toFloatPcmAvailableAudioProcessors = new AudioProcessor[] { new FloatResamplingAudioProcessor() };
    volume = 1.0F;
    startMediaTimeState = 0;
    audioAttributes = AudioAttributes.DEFAULT;
    audioSessionId = 0;
    auxEffectInfo = new AuxEffectInfo(0, 0.0F);
    playbackParameters = PlaybackParameters.DEFAULT;
    drainingAudioProcessorIndex = -1;
    activeAudioProcessors = new AudioProcessor[0];
    outputBuffers = new ByteBuffer[0];
    playbackParametersCheckpoints = new ArrayDeque();
  }
  
  public DefaultAudioSink(@Nullable AudioCapabilities paramAudioCapabilities, AudioProcessor[] paramArrayOfAudioProcessor)
  {
    this(paramAudioCapabilities, paramArrayOfAudioProcessor, false);
  }
  
  public DefaultAudioSink(@Nullable AudioCapabilities paramAudioCapabilities, AudioProcessor[] paramArrayOfAudioProcessor, boolean paramBoolean)
  {
    this(paramAudioCapabilities, new DefaultAudioProcessorChain(paramArrayOfAudioProcessor), paramBoolean);
  }
  
  private long applySkipping(long paramLong)
  {
    return paramLong + framesToDurationUs(audioProcessorChain.getSkippedOutputFrameCount());
  }
  
  private long applySpeedup(long paramLong)
  {
    for (PlaybackParametersCheckpoint localPlaybackParametersCheckpoint = null; (!playbackParametersCheckpoints.isEmpty()) && (paramLong >= PlaybackParametersCheckpoint.access$400((PlaybackParametersCheckpoint)playbackParametersCheckpoints.getFirst())); localPlaybackParametersCheckpoint = (PlaybackParametersCheckpoint)playbackParametersCheckpoints.remove()) {}
    if (localPlaybackParametersCheckpoint != null)
    {
      playbackParameters = PlaybackParametersCheckpoint.access$200(localPlaybackParametersCheckpoint);
      playbackParametersPositionUs = PlaybackParametersCheckpoint.access$400(localPlaybackParametersCheckpoint);
      playbackParametersOffsetUs = (PlaybackParametersCheckpoint.access$500(localPlaybackParametersCheckpoint) - startMediaTimeUs);
    }
    if (playbackParameters.speed == 1.0F) {
      return paramLong + playbackParametersOffsetUs - playbackParametersPositionUs;
    }
    if (playbackParametersCheckpoints.isEmpty())
    {
      l = playbackParametersOffsetUs;
      return audioProcessorChain.getMediaDuration(paramLong - playbackParametersPositionUs) + l;
    }
    long l = playbackParametersOffsetUs;
    return Util.getMediaDurationForPlayoutDuration(paramLong - playbackParametersPositionUs, playbackParameters.speed) + l;
  }
  
  @TargetApi(21)
  private AudioTrack createAudioTrackV21()
  {
    android.media.AudioAttributes localAudioAttributes;
    if (tunneling) {
      localAudioAttributes = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    } else {
      localAudioAttributes = audioAttributes.getAudioAttributesV21();
    }
    AudioFormat localAudioFormat = new AudioFormat.Builder().setChannelMask(outputChannelConfig).setEncoding(outputEncoding).setSampleRate(outputSampleRate).build();
    int i = audioSessionId;
    if (i == 0) {
      i = 0;
    }
    return new AudioTrack(localAudioAttributes, localAudioFormat, bufferSize, 1, i);
  }
  
  private boolean drainAudioProcessorsToEndOfStream()
    throws AudioSink.WriteException
  {
    int i;
    if (drainingAudioProcessorIndex == -1) {
      if (processingEnabled) {
        i = 0;
      } else {
        i = activeAudioProcessors.length;
      }
    }
    for (drainingAudioProcessorIndex = i;; drainingAudioProcessorIndex += 1)
    {
      i = 1;
      break label38;
      i = 0;
      label38:
      int j = drainingAudioProcessorIndex;
      localObject = activeAudioProcessors;
      if (j >= localObject.length) {
        break;
      }
      localObject = localObject[j];
      if (i != 0) {
        ((AudioProcessor)localObject).queueEndOfStream();
      }
      processBuffers(-9223372036854775807L);
      if (!((AudioProcessor)localObject).isEnded()) {
        return false;
      }
    }
    Object localObject = outputBuffer;
    if (localObject != null)
    {
      writeBuffer((ByteBuffer)localObject, -9223372036854775807L);
      if (outputBuffer != null) {
        return false;
      }
    }
    drainingAudioProcessorIndex = -1;
    return true;
  }
  
  private long durationUsToFrames(long paramLong)
  {
    return paramLong * outputSampleRate / 1000000L;
  }
  
  private void flushAudioProcessors()
  {
    for (int i = 0;; i++)
    {
      Object localObject = activeAudioProcessors;
      if (i >= localObject.length) {
        break;
      }
      localObject = localObject[i];
      ((AudioProcessor)localObject).flush();
      outputBuffers[i] = ((AudioProcessor)localObject).getOutput();
    }
  }
  
  private long framesToDurationUs(long paramLong)
  {
    return paramLong * 1000000L / outputSampleRate;
  }
  
  private AudioProcessor[] getAvailableAudioProcessors()
  {
    AudioProcessor[] arrayOfAudioProcessor;
    if (shouldConvertHighResIntPcmToFloat) {
      arrayOfAudioProcessor = toFloatPcmAvailableAudioProcessors;
    } else {
      arrayOfAudioProcessor = toIntPcmAvailableAudioProcessors;
    }
    return arrayOfAudioProcessor;
  }
  
  private static int getChannelConfig(int paramInt, boolean paramBoolean)
  {
    int i = Util.SDK_INT;
    int j = paramInt;
    if (i <= 28)
    {
      j = paramInt;
      if (!paramBoolean) {
        if (paramInt == 7)
        {
          j = 8;
        }
        else if ((paramInt != 3) && (paramInt != 4))
        {
          j = paramInt;
          if (paramInt != 5) {}
        }
        else
        {
          j = 6;
        }
      }
    }
    paramInt = j;
    if (i <= 26)
    {
      paramInt = j;
      if ("fugu".equals(Util.DEVICE))
      {
        paramInt = j;
        if (!paramBoolean)
        {
          paramInt = j;
          if (j == 1) {
            paramInt = 2;
          }
        }
      }
    }
    return Util.getAudioTrackChannelConfig(paramInt);
  }
  
  private int getDefaultBufferSize()
  {
    if (isInputPcm)
    {
      i = AudioTrack.getMinBufferSize(outputSampleRate, outputChannelConfig, outputEncoding);
      boolean bool;
      if (i != -2) {
        bool = true;
      } else {
        bool = false;
      }
      Assertions.checkState(bool);
      return Util.constrainValue(i * 4, (int)durationUsToFrames(250000L) * outputPcmFrameSize, (int)Math.max(i, durationUsToFrames(750000L) * outputPcmFrameSize));
    }
    int j = getMaximumEncodedRateBytesPerSecond(outputEncoding);
    int i = j;
    if (outputEncoding == 5) {
      i = j * 2;
    }
    return (int)(i * 250000L / 1000000L);
  }
  
  private static int getFramesPerEncodedSample(int paramInt, ByteBuffer paramByteBuffer)
  {
    if ((paramInt != 7) && (paramInt != 8))
    {
      if (paramInt == 5) {
        return Ac3Util.getAc3SyncframeAudioSampleCount();
      }
      if (paramInt == 6) {
        return Ac3Util.parseEAc3SyncframeAudioSampleCount(paramByteBuffer);
      }
      if (paramInt == 14)
      {
        paramInt = Ac3Util.findTrueHdSyncframeOffset(paramByteBuffer);
        if (paramInt == -1) {
          paramInt = 0;
        } else {
          paramInt = Ac3Util.parseTrueHdSyncframeAudioSampleCount(paramByteBuffer, paramInt) * 16;
        }
        return paramInt;
      }
      throw new IllegalStateException(a.f("Unexpected audio encoding: ", paramInt));
    }
    return DtsUtil.parseDtsAudioSampleCount(paramByteBuffer);
  }
  
  private static int getMaximumEncodedRateBytesPerSecond(int paramInt)
  {
    if (paramInt != 5)
    {
      if (paramInt != 6)
      {
        if (paramInt != 7)
        {
          if (paramInt != 8)
          {
            if (paramInt == 14) {
              return 3062500;
            }
            throw new IllegalArgumentException();
          }
          return 2250000;
        }
        return 192000;
      }
      return 768000;
    }
    return 80000;
  }
  
  private long getSubmittedFrames()
  {
    long l;
    if (isInputPcm) {
      l = submittedPcmBytes / pcmFrameSize;
    } else {
      l = submittedEncodedFrames;
    }
    return l;
  }
  
  private long getWrittenFrames()
  {
    long l;
    if (isInputPcm) {
      l = writtenPcmBytes / outputPcmFrameSize;
    } else {
      l = writtenEncodedFrames;
    }
    return l;
  }
  
  private void initialize()
    throws AudioSink.InitializationException
  {
    releasingConditionVariable.block();
    Object localObject = initializeAudioTrack();
    audioTrack = ((AudioTrack)localObject);
    int i = ((AudioTrack)localObject).getAudioSessionId();
    if ((enablePreV21AudioSessionWorkaround) && (Util.SDK_INT < 21))
    {
      localObject = keepSessionIdAudioTrack;
      if ((localObject != null) && (i != ((AudioTrack)localObject).getAudioSessionId())) {
        releaseKeepSessionIdAudioTrack();
      }
      if (keepSessionIdAudioTrack == null) {
        keepSessionIdAudioTrack = initializeKeepSessionIdAudioTrack(i);
      }
    }
    if (audioSessionId != i)
    {
      audioSessionId = i;
      localObject = listener;
      if (localObject != null) {
        ((AudioSink.Listener)localObject).onAudioSessionId(i);
      }
    }
    if (canApplyPlaybackParameters) {
      localObject = audioProcessorChain.applyPlaybackParameters(playbackParameters);
    } else {
      localObject = PlaybackParameters.DEFAULT;
    }
    playbackParameters = ((PlaybackParameters)localObject);
    setupAudioProcessors();
    audioTrackPositionTracker.setAudioTrack(audioTrack, outputEncoding, outputPcmFrameSize, bufferSize);
    setVolumeInternal();
    i = auxEffectInfo.effectId;
    if (i != 0)
    {
      audioTrack.attachAuxEffect(i);
      audioTrack.setAuxEffectSendLevel(auxEffectInfo.sendLevel);
    }
  }
  
  private AudioTrack initializeAudioTrack()
    throws AudioSink.InitializationException
  {
    AudioTrack localAudioTrack;
    if (Util.SDK_INT >= 21)
    {
      localAudioTrack = createAudioTrackV21();
    }
    else
    {
      i = Util.getStreamTypeForAudioUsage(audioAttributes.usage);
      if (audioSessionId == 0) {
        localAudioTrack = new AudioTrack(i, outputSampleRate, outputChannelConfig, outputEncoding, bufferSize, 1);
      } else {
        localAudioTrack = new AudioTrack(i, outputSampleRate, outputChannelConfig, outputEncoding, bufferSize, 1, audioSessionId);
      }
    }
    int i = localAudioTrack.getState();
    if (i == 1) {
      return localAudioTrack;
    }
    try
    {
      localAudioTrack.release();
      throw new AudioSink.InitializationException(i, outputSampleRate, outputChannelConfig, bufferSize);
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  private AudioTrack initializeKeepSessionIdAudioTrack(int paramInt)
  {
    return new AudioTrack(3, 4000, 4, 2, 2, 0, paramInt);
  }
  
  private long inputFramesToDurationUs(long paramLong)
  {
    return paramLong * 1000000L / inputSampleRate;
  }
  
  private boolean isInitialized()
  {
    boolean bool;
    if (audioTrack != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void processBuffers(long paramLong)
    throws AudioSink.WriteException
  {
    int i = activeAudioProcessors.length;
    int j = i;
    while (j >= 0)
    {
      ByteBuffer localByteBuffer;
      if (j > 0)
      {
        localByteBuffer = outputBuffers[(j - 1)];
      }
      else
      {
        localByteBuffer = inputBuffer;
        if (localByteBuffer == null) {
          localByteBuffer = AudioProcessor.EMPTY_BUFFER;
        }
      }
      if (j == i)
      {
        writeBuffer(localByteBuffer, paramLong);
      }
      else
      {
        Object localObject = activeAudioProcessors[j];
        ((AudioProcessor)localObject).queueInput(localByteBuffer);
        localObject = ((AudioProcessor)localObject).getOutput();
        outputBuffers[j] = localObject;
        if (((Buffer)localObject).hasRemaining())
        {
          j++;
          continue;
        }
      }
      if (localByteBuffer.hasRemaining()) {
        return;
      }
      j--;
    }
  }
  
  private void releaseKeepSessionIdAudioTrack()
  {
    final AudioTrack localAudioTrack = keepSessionIdAudioTrack;
    if (localAudioTrack == null) {
      return;
    }
    keepSessionIdAudioTrack = null;
    new Thread()
    {
      public void run()
      {
        localAudioTrack.release();
      }
    }.start();
  }
  
  private void setVolumeInternal()
  {
    if (isInitialized()) {
      if (Util.SDK_INT >= 21) {
        setVolumeInternalV21(audioTrack, volume);
      } else {
        setVolumeInternalV3(audioTrack, volume);
      }
    }
  }
  
  @TargetApi(21)
  private static void setVolumeInternalV21(AudioTrack paramAudioTrack, float paramFloat)
  {
    paramAudioTrack.setVolume(paramFloat);
  }
  
  private static void setVolumeInternalV3(AudioTrack paramAudioTrack, float paramFloat)
  {
    paramAudioTrack.setStereoVolume(paramFloat, paramFloat);
  }
  
  private void setupAudioProcessors()
  {
    ArrayList localArrayList = new ArrayList();
    for (AudioProcessor localAudioProcessor : getAvailableAudioProcessors()) {
      if (localAudioProcessor.isActive()) {
        localArrayList.add(localAudioProcessor);
      } else {
        localAudioProcessor.flush();
      }
    }
    ??? = localArrayList.size();
    activeAudioProcessors = ((AudioProcessor[])localArrayList.toArray(new AudioProcessor[???]));
    outputBuffers = new ByteBuffer[???];
    flushAudioProcessors();
  }
  
  private void writeBuffer(ByteBuffer paramByteBuffer, long paramLong)
    throws AudioSink.WriteException
  {
    if (!paramByteBuffer.hasRemaining()) {
      return;
    }
    Object localObject = outputBuffer;
    boolean bool1 = true;
    int i = 0;
    boolean bool2;
    int j;
    if (localObject != null)
    {
      if (localObject == paramByteBuffer) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      Assertions.checkArgument(bool2);
    }
    else
    {
      outputBuffer = paramByteBuffer;
      if (Util.SDK_INT < 21)
      {
        j = paramByteBuffer.remaining();
        localObject = preV21OutputBuffer;
        if ((localObject == null) || (localObject.length < j)) {
          preV21OutputBuffer = new byte[j];
        }
        k = paramByteBuffer.position();
        paramByteBuffer.get(preV21OutputBuffer, 0, j);
        paramByteBuffer.position(k);
        preV21OutputBufferOffset = 0;
      }
    }
    int k = paramByteBuffer.remaining();
    if (Util.SDK_INT < 21)
    {
      j = audioTrackPositionTracker.getAvailableBufferSize(writtenPcmBytes);
      if (j > 0)
      {
        i = Math.min(k, j);
        j = audioTrack.write(preV21OutputBuffer, preV21OutputBufferOffset, i);
        i = j;
        if (j > 0)
        {
          preV21OutputBufferOffset += j;
          paramByteBuffer.position(paramByteBuffer.position() + j);
          i = j;
        }
      }
    }
    else if (tunneling)
    {
      if (paramLong != -9223372036854775807L) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
      Assertions.checkState(bool2);
      i = writeNonBlockingWithAvSyncV21(audioTrack, paramByteBuffer, k, paramLong);
    }
    else
    {
      i = writeNonBlockingV21(audioTrack, paramByteBuffer, k);
    }
    lastFeedElapsedRealtimeMs = SystemClock.elapsedRealtime();
    if (i >= 0)
    {
      bool2 = isInputPcm;
      if (bool2) {
        writtenPcmBytes += i;
      }
      if (i == k)
      {
        if (!bool2) {
          writtenEncodedFrames += framesPerEncodedSample;
        }
        outputBuffer = null;
      }
      return;
    }
    throw new AudioSink.WriteException(i);
  }
  
  @TargetApi(21)
  private static int writeNonBlockingV21(AudioTrack paramAudioTrack, ByteBuffer paramByteBuffer, int paramInt)
  {
    return paramAudioTrack.write(paramByteBuffer, paramInt, 1);
  }
  
  @TargetApi(21)
  private int writeNonBlockingWithAvSyncV21(AudioTrack paramAudioTrack, ByteBuffer paramByteBuffer, int paramInt, long paramLong)
  {
    if (avSyncHeader == null)
    {
      ByteBuffer localByteBuffer = ByteBuffer.allocate(16);
      avSyncHeader = localByteBuffer;
      localByteBuffer.order(ByteOrder.BIG_ENDIAN);
      avSyncHeader.putInt(1431633921);
    }
    if (bytesUntilNextAvSync == 0)
    {
      avSyncHeader.putInt(4, paramInt);
      avSyncHeader.putLong(8, paramLong * 1000L);
      avSyncHeader.position(0);
      bytesUntilNextAvSync = paramInt;
    }
    int i = avSyncHeader.remaining();
    if (i > 0)
    {
      int j = paramAudioTrack.write(avSyncHeader, i, 1);
      if (j < 0)
      {
        bytesUntilNextAvSync = 0;
        return j;
      }
      if (j < i) {
        return 0;
      }
    }
    paramInt = writeNonBlockingV21(paramAudioTrack, paramByteBuffer, paramInt);
    if (paramInt < 0)
    {
      bytesUntilNextAvSync = 0;
      return paramInt;
    }
    bytesUntilNextAvSync -= paramInt;
    return paramInt;
  }
  
  public void configure(int paramInt1, int paramInt2, int paramInt3, int paramInt4, @Nullable int[] paramArrayOfInt, int paramInt5, int paramInt6)
    throws AudioSink.ConfigurationException
  {
    inputSampleRate = paramInt3;
    isInputPcm = Util.isEncodingLinearPcm(paramInt1);
    boolean bool = enableConvertHighResIntPcmToFloat;
    int i = 1;
    int j = 0;
    int k = 0;
    if ((bool) && (isEncodingSupported(1073741824)) && (Util.isEncodingHighResolutionIntegerPcm(paramInt1))) {
      bool = true;
    } else {
      bool = false;
    }
    shouldConvertHighResIntPcmToFloat = bool;
    if (isInputPcm) {
      pcmFrameSize = Util.getPcmFrameSize(paramInt1, paramInt2);
    }
    if ((isInputPcm) && (paramInt1 != 4)) {
      bool = true;
    } else {
      bool = false;
    }
    if ((!bool) || (shouldConvertHighResIntPcmToFloat)) {
      i = 0;
    }
    canApplyPlaybackParameters = i;
    Object localObject = paramArrayOfInt;
    if (Util.SDK_INT < 21)
    {
      localObject = paramArrayOfInt;
      if (paramInt2 == 8)
      {
        localObject = paramArrayOfInt;
        if (paramArrayOfInt == null)
        {
          localObject = new int[6];
          for (m = 0; m < 6; m++) {
            localObject[m] = m;
          }
        }
      }
    }
    int n = paramInt1;
    int i1 = paramInt2;
    int m = paramInt3;
    if (bool)
    {
      trimmingAudioProcessor.setTrimFrameCount(paramInt5, paramInt6);
      channelMappingAudioProcessor.setChannelMap((int[])localObject);
      paramArrayOfInt = getAvailableAudioProcessors();
      m = paramArrayOfInt.length;
      paramInt5 = 0;
      paramInt6 = k;
      while (paramInt6 < m)
      {
        localObject = paramArrayOfInt[paramInt6];
        try
        {
          i = ((AudioProcessor)localObject).configure(paramInt3, paramInt2, paramInt1);
          paramInt5 |= i;
          if (((AudioProcessor)localObject).isActive())
          {
            paramInt2 = ((AudioProcessor)localObject).getOutputChannelCount();
            paramInt3 = ((AudioProcessor)localObject).getOutputSampleRateHz();
            paramInt1 = ((AudioProcessor)localObject).getOutputEncoding();
          }
          paramInt6++;
        }
        catch (AudioProcessor.UnhandledFormatException paramArrayOfInt)
        {
          throw new AudioSink.ConfigurationException(paramArrayOfInt);
        }
      }
      m = paramInt3;
      i1 = paramInt2;
      n = paramInt1;
      j = paramInt5;
    }
    paramInt1 = getChannelConfig(i1, isInputPcm);
    if (paramInt1 != 0)
    {
      if ((j == 0) && (isInitialized()) && (outputEncoding == n) && (outputSampleRate == m) && (outputChannelConfig == paramInt1)) {
        return;
      }
      reset();
      processingEnabled = bool;
      outputSampleRate = m;
      outputChannelConfig = paramInt1;
      outputEncoding = n;
      if (isInputPcm) {
        paramInt1 = Util.getPcmFrameSize(n, i1);
      } else {
        paramInt1 = -1;
      }
      outputPcmFrameSize = paramInt1;
      if (paramInt4 == 0) {
        paramInt4 = getDefaultBufferSize();
      }
      bufferSize = paramInt4;
      return;
    }
    throw new AudioSink.ConfigurationException(a.f("Unsupported channel count: ", i1));
  }
  
  public void disableTunneling()
  {
    if (tunneling)
    {
      tunneling = false;
      audioSessionId = 0;
      reset();
    }
  }
  
  public void enableTunnelingV21(int paramInt)
  {
    boolean bool;
    if (Util.SDK_INT >= 21) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
    if ((!tunneling) || (audioSessionId != paramInt))
    {
      tunneling = true;
      audioSessionId = paramInt;
      reset();
    }
  }
  
  public long getCurrentPositionUs(boolean paramBoolean)
  {
    if ((isInitialized()) && (startMediaTimeState != 0))
    {
      long l = Math.min(audioTrackPositionTracker.getCurrentPositionUs(paramBoolean), framesToDurationUs(getWrittenFrames()));
      return startMediaTimeUs + applySkipping(applySpeedup(l));
    }
    return Long.MIN_VALUE;
  }
  
  public PlaybackParameters getPlaybackParameters()
  {
    return playbackParameters;
  }
  
  public boolean handleBuffer(ByteBuffer paramByteBuffer, long paramLong)
    throws AudioSink.InitializationException, AudioSink.WriteException
  {
    Object localObject = inputBuffer;
    boolean bool;
    if ((localObject != null) && (paramByteBuffer != localObject)) {
      bool = false;
    } else {
      bool = true;
    }
    Assertions.checkArgument(bool);
    if (!isInitialized())
    {
      initialize();
      if (playing) {
        play();
      }
    }
    if (!audioTrackPositionTracker.mayHandleBuffer(getWrittenFrames())) {
      return false;
    }
    if (inputBuffer == null)
    {
      if (!paramByteBuffer.hasRemaining()) {
        return true;
      }
      if ((!isInputPcm) && (framesPerEncodedSample == 0))
      {
        int i = getFramesPerEncodedSample(outputEncoding, paramByteBuffer);
        framesPerEncodedSample = i;
        if (i == 0) {
          return true;
        }
      }
      if (afterDrainPlaybackParameters != null)
      {
        if (!drainAudioProcessorsToEndOfStream()) {
          return false;
        }
        localObject = afterDrainPlaybackParameters;
        afterDrainPlaybackParameters = null;
        localObject = audioProcessorChain.applyPlaybackParameters((PlaybackParameters)localObject);
        playbackParametersCheckpoints.add(new PlaybackParametersCheckpoint((PlaybackParameters)localObject, Math.max(0L, paramLong), framesToDurationUs(getWrittenFrames()), null));
        setupAudioProcessors();
      }
      if (startMediaTimeState == 0)
      {
        startMediaTimeUs = Math.max(0L, paramLong);
        startMediaTimeState = 1;
      }
      else
      {
        long l = startMediaTimeUs + inputFramesToDurationUs(getSubmittedFrames() - trimmingAudioProcessor.getTrimmedFrameCount());
        if ((startMediaTimeState == 1) && (Math.abs(l - paramLong) > 200000L))
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Discontinuity detected [expected ");
          ((StringBuilder)localObject).append(l);
          ((StringBuilder)localObject).append(", got ");
          ((StringBuilder)localObject).append(paramLong);
          ((StringBuilder)localObject).append("]");
          Log.e("AudioTrack", ((StringBuilder)localObject).toString());
          startMediaTimeState = 2;
        }
        if (startMediaTimeState == 2)
        {
          l = paramLong - l;
          startMediaTimeUs += l;
          startMediaTimeState = 1;
          localObject = listener;
          if ((localObject != null) && (l != 0L)) {
            ((AudioSink.Listener)localObject).onPositionDiscontinuity();
          }
        }
      }
      if (isInputPcm) {
        submittedPcmBytes += paramByteBuffer.remaining();
      } else {
        submittedEncodedFrames += framesPerEncodedSample;
      }
      inputBuffer = paramByteBuffer;
    }
    if (processingEnabled) {
      processBuffers(paramLong);
    } else {
      writeBuffer(inputBuffer, paramLong);
    }
    if (!inputBuffer.hasRemaining())
    {
      inputBuffer = null;
      return true;
    }
    if (audioTrackPositionTracker.isStalled(getWrittenFrames()))
    {
      Log.w("AudioTrack", "Resetting stalled audio track");
      reset();
      return true;
    }
    return false;
  }
  
  public void handleDiscontinuity()
  {
    if (startMediaTimeState == 1) {
      startMediaTimeState = 2;
    }
  }
  
  public boolean hasPendingData()
  {
    boolean bool;
    if ((isInitialized()) && (audioTrackPositionTracker.hasPendingData(getWrittenFrames()))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isEncodingSupported(int paramInt)
  {
    boolean bool1 = Util.isEncodingLinearPcm(paramInt);
    boolean bool2 = true;
    boolean bool3 = true;
    if (bool1)
    {
      bool2 = bool3;
      if (paramInt == 4) {
        if (Util.SDK_INT >= 21) {
          bool2 = bool3;
        } else {
          bool2 = false;
        }
      }
      return bool2;
    }
    AudioCapabilities localAudioCapabilities = audioCapabilities;
    if ((localAudioCapabilities == null) || (!localAudioCapabilities.supportsEncoding(paramInt))) {
      bool2 = false;
    }
    return bool2;
  }
  
  public boolean isEnded()
  {
    boolean bool;
    if ((isInitialized()) && ((!handledEndOfStream) || (hasPendingData()))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void pause()
  {
    playing = false;
    if ((isInitialized()) && (audioTrackPositionTracker.pause())) {
      audioTrack.pause();
    }
  }
  
  public void play()
  {
    playing = true;
    if (isInitialized())
    {
      audioTrackPositionTracker.start();
      audioTrack.play();
    }
  }
  
  public void playToEndOfStream()
    throws AudioSink.WriteException
  {
    if ((!handledEndOfStream) && (isInitialized()) && (drainAudioProcessorsToEndOfStream()))
    {
      audioTrackPositionTracker.handleEndOfStream(getWrittenFrames());
      audioTrack.stop();
      bytesUntilNextAvSync = 0;
      handledEndOfStream = true;
    }
  }
  
  public void release()
  {
    reset();
    releaseKeepSessionIdAudioTrack();
    AudioProcessor[] arrayOfAudioProcessor = toIntPcmAvailableAudioProcessors;
    int i = arrayOfAudioProcessor.length;
    for (int j = 0; j < i; j++) {
      arrayOfAudioProcessor[j].reset();
    }
    arrayOfAudioProcessor = toFloatPcmAvailableAudioProcessors;
    i = arrayOfAudioProcessor.length;
    for (j = 0; j < i; j++) {
      arrayOfAudioProcessor[j].reset();
    }
    audioSessionId = 0;
    playing = false;
  }
  
  public void reset()
  {
    if (isInitialized())
    {
      submittedPcmBytes = 0L;
      submittedEncodedFrames = 0L;
      writtenPcmBytes = 0L;
      writtenEncodedFrames = 0L;
      framesPerEncodedSample = 0;
      final Object localObject = afterDrainPlaybackParameters;
      if (localObject != null)
      {
        playbackParameters = ((PlaybackParameters)localObject);
        afterDrainPlaybackParameters = null;
      }
      else if (!playbackParametersCheckpoints.isEmpty())
      {
        playbackParameters = PlaybackParametersCheckpoint.access$200((PlaybackParametersCheckpoint)playbackParametersCheckpoints.getLast());
      }
      playbackParametersCheckpoints.clear();
      playbackParametersOffsetUs = 0L;
      playbackParametersPositionUs = 0L;
      trimmingAudioProcessor.resetTrimmedFrameCount();
      inputBuffer = null;
      outputBuffer = null;
      flushAudioProcessors();
      handledEndOfStream = false;
      drainingAudioProcessorIndex = -1;
      avSyncHeader = null;
      bytesUntilNextAvSync = 0;
      startMediaTimeState = 0;
      if (audioTrackPositionTracker.isPlaying()) {
        audioTrack.pause();
      }
      localObject = audioTrack;
      audioTrack = null;
      audioTrackPositionTracker.reset();
      releasingConditionVariable.close();
      new Thread()
      {
        public void run()
        {
          try
          {
            localObject.flush();
            localObject.release();
            return;
          }
          finally
          {
            DefaultAudioSink.access$300(DefaultAudioSink.this).open();
          }
        }
      }.start();
    }
  }
  
  public void setAudioAttributes(AudioAttributes paramAudioAttributes)
  {
    if (audioAttributes.equals(paramAudioAttributes)) {
      return;
    }
    audioAttributes = paramAudioAttributes;
    if (tunneling) {
      return;
    }
    reset();
    audioSessionId = 0;
  }
  
  public void setAudioSessionId(int paramInt)
  {
    if (audioSessionId != paramInt)
    {
      audioSessionId = paramInt;
      reset();
    }
  }
  
  public void setAuxEffectInfo(AuxEffectInfo paramAuxEffectInfo)
  {
    if (auxEffectInfo.equals(paramAuxEffectInfo)) {
      return;
    }
    int i = effectId;
    float f = sendLevel;
    AudioTrack localAudioTrack = audioTrack;
    if (localAudioTrack != null)
    {
      if (auxEffectInfo.effectId != i) {
        localAudioTrack.attachAuxEffect(i);
      }
      if (i != 0) {
        audioTrack.setAuxEffectSendLevel(f);
      }
    }
    auxEffectInfo = paramAuxEffectInfo;
  }
  
  public void setListener(AudioSink.Listener paramListener)
  {
    listener = paramListener;
  }
  
  public PlaybackParameters setPlaybackParameters(PlaybackParameters paramPlaybackParameters)
  {
    if ((isInitialized()) && (!canApplyPlaybackParameters))
    {
      paramPlaybackParameters = PlaybackParameters.DEFAULT;
      playbackParameters = paramPlaybackParameters;
      return paramPlaybackParameters;
    }
    PlaybackParameters localPlaybackParameters = afterDrainPlaybackParameters;
    if (localPlaybackParameters == null) {
      if (!playbackParametersCheckpoints.isEmpty()) {
        localPlaybackParameters = PlaybackParametersCheckpoint.access$200((PlaybackParametersCheckpoint)playbackParametersCheckpoints.getLast());
      } else {
        localPlaybackParameters = playbackParameters;
      }
    }
    if (!paramPlaybackParameters.equals(localPlaybackParameters)) {
      if (isInitialized()) {
        afterDrainPlaybackParameters = paramPlaybackParameters;
      } else {
        playbackParameters = audioProcessorChain.applyPlaybackParameters(paramPlaybackParameters);
      }
    }
    return playbackParameters;
  }
  
  public void setVolume(float paramFloat)
  {
    if (volume != paramFloat)
    {
      volume = paramFloat;
      setVolumeInternal();
    }
  }
  
  public static abstract interface AudioProcessorChain
  {
    public abstract PlaybackParameters applyPlaybackParameters(PlaybackParameters paramPlaybackParameters);
    
    public abstract AudioProcessor[] getAudioProcessors();
    
    public abstract long getMediaDuration(long paramLong);
    
    public abstract long getSkippedOutputFrameCount();
  }
  
  public static class DefaultAudioProcessorChain
    implements DefaultAudioSink.AudioProcessorChain
  {
    private final AudioProcessor[] audioProcessors;
    private final SilenceSkippingAudioProcessor silenceSkippingAudioProcessor;
    private final SonicAudioProcessor sonicAudioProcessor;
    
    public DefaultAudioProcessorChain(AudioProcessor... paramVarArgs)
    {
      AudioProcessor[] arrayOfAudioProcessor = (AudioProcessor[])Arrays.copyOf(paramVarArgs, paramVarArgs.length + 2);
      audioProcessors = arrayOfAudioProcessor;
      SilenceSkippingAudioProcessor localSilenceSkippingAudioProcessor = new SilenceSkippingAudioProcessor();
      silenceSkippingAudioProcessor = localSilenceSkippingAudioProcessor;
      SonicAudioProcessor localSonicAudioProcessor = new SonicAudioProcessor();
      sonicAudioProcessor = localSonicAudioProcessor;
      arrayOfAudioProcessor[paramVarArgs.length] = localSilenceSkippingAudioProcessor;
      arrayOfAudioProcessor[(paramVarArgs.length + 1)] = localSonicAudioProcessor;
    }
    
    public PlaybackParameters applyPlaybackParameters(PlaybackParameters paramPlaybackParameters)
    {
      silenceSkippingAudioProcessor.setEnabled(skipSilence);
      return new PlaybackParameters(sonicAudioProcessor.setSpeed(speed), sonicAudioProcessor.setPitch(pitch), skipSilence);
    }
    
    public AudioProcessor[] getAudioProcessors()
    {
      return audioProcessors;
    }
    
    public long getMediaDuration(long paramLong)
    {
      return sonicAudioProcessor.scaleDurationForSpeedup(paramLong);
    }
    
    public long getSkippedOutputFrameCount()
    {
      return silenceSkippingAudioProcessor.getSkippedFrames();
    }
  }
  
  public static final class InvalidAudioTrackTimestampException
    extends RuntimeException
  {
    private InvalidAudioTrackTimestampException(String paramString)
    {
      super();
    }
  }
  
  public static final class PlaybackParametersCheckpoint
  {
    private final long mediaTimeUs;
    private final PlaybackParameters playbackParameters;
    private final long positionUs;
    
    private PlaybackParametersCheckpoint(PlaybackParameters paramPlaybackParameters, long paramLong1, long paramLong2)
    {
      playbackParameters = paramPlaybackParameters;
      mediaTimeUs = paramLong1;
      positionUs = paramLong2;
    }
  }
  
  public final class PositionTrackerListener
    implements AudioTrackPositionTracker.Listener
  {
    private PositionTrackerListener() {}
    
    public void onInvalidLatency(long paramLong)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Ignoring impossibly large audio latency: ");
      localStringBuilder.append(paramLong);
      Log.w("AudioTrack", localStringBuilder.toString());
    }
    
    public void onPositionFramesMismatch(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
    {
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Spurious audio timestamp (frame position mismatch): ");
      ((StringBuilder)localObject).append(paramLong1);
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(paramLong2);
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(paramLong3);
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(paramLong4);
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(DefaultAudioSink.access$600(DefaultAudioSink.this));
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(DefaultAudioSink.access$700(DefaultAudioSink.this));
      localObject = ((StringBuilder)localObject).toString();
      if (!DefaultAudioSink.failOnSpuriousAudioTimestamp)
      {
        Log.w("AudioTrack", (String)localObject);
        return;
      }
      throw new DefaultAudioSink.InvalidAudioTrackTimestampException((String)localObject, null);
    }
    
    public void onSystemTimeUsMismatch(long paramLong1, long paramLong2, long paramLong3, long paramLong4)
    {
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Spurious audio timestamp (system clock mismatch): ");
      ((StringBuilder)localObject).append(paramLong1);
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(paramLong2);
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(paramLong3);
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(paramLong4);
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(DefaultAudioSink.access$600(DefaultAudioSink.this));
      ((StringBuilder)localObject).append(", ");
      ((StringBuilder)localObject).append(DefaultAudioSink.access$700(DefaultAudioSink.this));
      localObject = ((StringBuilder)localObject).toString();
      if (!DefaultAudioSink.failOnSpuriousAudioTimestamp)
      {
        Log.w("AudioTrack", (String)localObject);
        return;
      }
      throw new DefaultAudioSink.InvalidAudioTrackTimestampException((String)localObject, null);
    }
    
    public void onUnderrun(int paramInt, long paramLong)
    {
      if (DefaultAudioSink.access$900(DefaultAudioSink.this) != null)
      {
        long l1 = SystemClock.elapsedRealtime();
        long l2 = DefaultAudioSink.access$1000(DefaultAudioSink.this);
        DefaultAudioSink.access$900(DefaultAudioSink.this).onUnderrun(paramInt, paramLong, l1 - l2);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.DefaultAudioSink
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */