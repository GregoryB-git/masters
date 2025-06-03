package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.PlaybackParameters;
import java.util.Arrays;

public class DefaultAudioSink$DefaultAudioProcessorChain
  implements DefaultAudioSink.AudioProcessorChain
{
  private final AudioProcessor[] audioProcessors;
  private final SilenceSkippingAudioProcessor silenceSkippingAudioProcessor;
  private final SonicAudioProcessor sonicAudioProcessor;
  
  public DefaultAudioSink$DefaultAudioProcessorChain(AudioProcessor... paramVarArgs)
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

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.audio.DefaultAudioSink.DefaultAudioProcessorChain
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */