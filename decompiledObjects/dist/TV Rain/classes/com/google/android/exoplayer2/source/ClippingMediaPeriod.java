package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.Buffer;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

public final class ClippingMediaPeriod
  implements MediaPeriod, MediaPeriod.Callback
{
  private MediaPeriod.Callback callback;
  public long endUs;
  public final MediaPeriod mediaPeriod;
  private long pendingInitialDiscontinuityPositionUs;
  private ClippingSampleStream[] sampleStreams;
  public long startUs;
  
  public ClippingMediaPeriod(MediaPeriod paramMediaPeriod, boolean paramBoolean, long paramLong1, long paramLong2)
  {
    mediaPeriod = paramMediaPeriod;
    sampleStreams = new ClippingSampleStream[0];
    long l;
    if (paramBoolean) {
      l = paramLong1;
    } else {
      l = -9223372036854775807L;
    }
    pendingInitialDiscontinuityPositionUs = l;
    startUs = paramLong1;
    endUs = paramLong2;
  }
  
  private SeekParameters clipSeekParameters(long paramLong, SeekParameters paramSeekParameters)
  {
    long l1 = Util.constrainValue(toleranceBeforeUs, 0L, paramLong - startUs);
    long l2 = toleranceAfterUs;
    long l3 = endUs;
    if (l3 == Long.MIN_VALUE) {
      paramLong = Long.MAX_VALUE;
    } else {
      paramLong = l3 - paramLong;
    }
    paramLong = Util.constrainValue(l2, 0L, paramLong);
    if ((l1 == toleranceBeforeUs) && (paramLong == toleranceAfterUs)) {
      return paramSeekParameters;
    }
    return new SeekParameters(l1, paramLong);
  }
  
  private static boolean shouldKeepInitialDiscontinuity(long paramLong, TrackSelection[] paramArrayOfTrackSelection)
  {
    if (paramLong != 0L)
    {
      int i = paramArrayOfTrackSelection.length;
      for (int j = 0; j < i; j++)
      {
        TrackSelection localTrackSelection = paramArrayOfTrackSelection[j];
        if ((localTrackSelection != null) && (!MimeTypes.isAudio(getSelectedFormatsampleMimeType))) {
          return true;
        }
      }
    }
    return false;
  }
  
  public boolean continueLoading(long paramLong)
  {
    return mediaPeriod.continueLoading(paramLong);
  }
  
  public void discardBuffer(long paramLong, boolean paramBoolean)
  {
    mediaPeriod.discardBuffer(paramLong, paramBoolean);
  }
  
  public long getAdjustedSeekPositionUs(long paramLong, SeekParameters paramSeekParameters)
  {
    long l = startUs;
    if (paramLong == l) {
      return l;
    }
    paramSeekParameters = clipSeekParameters(paramLong, paramSeekParameters);
    return mediaPeriod.getAdjustedSeekPositionUs(paramLong, paramSeekParameters);
  }
  
  public long getBufferedPositionUs()
  {
    long l1 = mediaPeriod.getBufferedPositionUs();
    if (l1 != Long.MIN_VALUE)
    {
      long l2 = endUs;
      if ((l2 == Long.MIN_VALUE) || (l1 < l2)) {
        return l1;
      }
    }
    return Long.MIN_VALUE;
  }
  
  public long getNextLoadPositionUs()
  {
    long l1 = mediaPeriod.getNextLoadPositionUs();
    if (l1 != Long.MIN_VALUE)
    {
      long l2 = endUs;
      if ((l2 == Long.MIN_VALUE) || (l1 < l2)) {
        return l1;
      }
    }
    return Long.MIN_VALUE;
  }
  
  public TrackGroupArray getTrackGroups()
  {
    return mediaPeriod.getTrackGroups();
  }
  
  public boolean isPendingInitialDiscontinuity()
  {
    boolean bool;
    if (pendingInitialDiscontinuityPositionUs != -9223372036854775807L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void maybeThrowPrepareError()
    throws IOException
  {
    mediaPeriod.maybeThrowPrepareError();
  }
  
  public void onContinueLoadingRequested(MediaPeriod paramMediaPeriod)
  {
    callback.onContinueLoadingRequested(this);
  }
  
  public void onPrepared(MediaPeriod paramMediaPeriod)
  {
    callback.onPrepared(this);
  }
  
  public void prepare(MediaPeriod.Callback paramCallback, long paramLong)
  {
    callback = paramCallback;
    mediaPeriod.prepare(this, paramLong);
  }
  
  public long readDiscontinuity()
  {
    if (isPendingInitialDiscontinuity())
    {
      l1 = pendingInitialDiscontinuityPositionUs;
      pendingInitialDiscontinuityPositionUs = -9223372036854775807L;
      l2 = readDiscontinuity();
      if (l2 != -9223372036854775807L) {
        l1 = l2;
      }
      return l1;
    }
    long l1 = mediaPeriod.readDiscontinuity();
    if (l1 == -9223372036854775807L) {
      return -9223372036854775807L;
    }
    long l2 = startUs;
    boolean bool1 = true;
    if (l1 >= l2) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Assertions.checkState(bool2);
    l2 = endUs;
    boolean bool2 = bool1;
    if (l2 != Long.MIN_VALUE) {
      if (l1 <= l2) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    Assertions.checkState(bool2);
    return l1;
  }
  
  public void reevaluateBuffer(long paramLong)
  {
    mediaPeriod.reevaluateBuffer(paramLong);
  }
  
  public long seekToUs(long paramLong)
  {
    pendingInitialDiscontinuityPositionUs = -9223372036854775807L;
    ClippingSampleStream[] arrayOfClippingSampleStream = sampleStreams;
    int i = arrayOfClippingSampleStream.length;
    boolean bool1 = false;
    for (int j = 0; j < i; j++)
    {
      ClippingSampleStream localClippingSampleStream = arrayOfClippingSampleStream[j];
      if (localClippingSampleStream != null) {
        localClippingSampleStream.clearSentEos();
      }
    }
    long l = mediaPeriod.seekToUs(paramLong);
    if (l != paramLong)
    {
      bool2 = bool1;
      if (l < startUs) {
        break label111;
      }
      paramLong = endUs;
      if (paramLong != Long.MIN_VALUE)
      {
        bool2 = bool1;
        if (l > paramLong) {
          break label111;
        }
      }
    }
    boolean bool2 = true;
    label111:
    Assertions.checkState(bool2);
    return l;
  }
  
  public long selectTracks(TrackSelection[] paramArrayOfTrackSelection, boolean[] paramArrayOfBoolean1, SampleStream[] paramArrayOfSampleStream, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    sampleStreams = new ClippingSampleStream[paramArrayOfSampleStream.length];
    SampleStream[] arrayOfSampleStream = new SampleStream[paramArrayOfSampleStream.length];
    int i = 0;
    for (int j = 0;; j++)
    {
      int k = paramArrayOfSampleStream.length;
      SampleStream localSampleStream = null;
      if (j >= k) {
        break;
      }
      ClippingSampleStream[] arrayOfClippingSampleStream = sampleStreams;
      ClippingSampleStream localClippingSampleStream = (ClippingSampleStream)paramArrayOfSampleStream[j];
      arrayOfClippingSampleStream[j] = localClippingSampleStream;
      if (localClippingSampleStream != null) {
        localSampleStream = childStream;
      }
      arrayOfSampleStream[j] = localSampleStream;
    }
    long l1 = mediaPeriod.selectTracks(paramArrayOfTrackSelection, paramArrayOfBoolean1, arrayOfSampleStream, paramArrayOfBoolean2, paramLong);
    if (isPendingInitialDiscontinuity())
    {
      l2 = startUs;
      if ((paramLong == l2) && (shouldKeepInitialDiscontinuity(l2, paramArrayOfTrackSelection)))
      {
        l2 = l1;
        break label144;
      }
    }
    long l2 = -9223372036854775807L;
    label144:
    pendingInitialDiscontinuityPositionUs = l2;
    if (l1 != paramLong) {
      if (l1 >= startUs)
      {
        paramLong = endUs;
        if ((paramLong == Long.MIN_VALUE) || (l1 <= paramLong)) {}
      }
      else
      {
        bool = false;
        break label203;
      }
    }
    boolean bool = true;
    label203:
    Assertions.checkState(bool);
    for (j = i; j < paramArrayOfSampleStream.length; j++)
    {
      paramArrayOfTrackSelection = arrayOfSampleStream[j];
      if (paramArrayOfTrackSelection == null) {
        sampleStreams[j] = null;
      } else if ((paramArrayOfSampleStream[j] == null) || (sampleStreams[j].childStream != paramArrayOfTrackSelection)) {
        sampleStreams[j] = new ClippingSampleStream(paramArrayOfTrackSelection);
      }
      paramArrayOfSampleStream[j] = sampleStreams[j];
    }
    return l1;
  }
  
  public void updateClipping(long paramLong1, long paramLong2)
  {
    startUs = paramLong1;
    endUs = paramLong2;
  }
  
  public final class ClippingSampleStream
    implements SampleStream
  {
    public final SampleStream childStream;
    private boolean sentEos;
    
    public ClippingSampleStream(SampleStream paramSampleStream)
    {
      childStream = paramSampleStream;
    }
    
    public void clearSentEos()
    {
      sentEos = false;
    }
    
    public boolean isReady()
    {
      boolean bool;
      if ((!isPendingInitialDiscontinuity()) && (childStream.isReady())) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void maybeThrowError()
      throws IOException
    {
      childStream.maybeThrowError();
    }
    
    public int readData(FormatHolder paramFormatHolder, DecoderInputBuffer paramDecoderInputBuffer, boolean paramBoolean)
    {
      if (isPendingInitialDiscontinuity()) {
        return -3;
      }
      if (sentEos)
      {
        paramDecoderInputBuffer.setFlags(4);
        return -4;
      }
      int i = childStream.readData(paramFormatHolder, paramDecoderInputBuffer, paramBoolean);
      if (i == -5)
      {
        paramDecoderInputBuffer = format;
        i = encoderDelay;
        if ((i != 0) || (encoderPadding != 0))
        {
          ClippingMediaPeriod localClippingMediaPeriod = ClippingMediaPeriod.this;
          l = startUs;
          int j = 0;
          if (l != 0L) {
            i = 0;
          }
          if (endUs == Long.MIN_VALUE) {
            j = encoderPadding;
          }
          format = paramDecoderInputBuffer.copyWithGaplessInfo(i, j);
        }
        return -5;
      }
      paramFormatHolder = ClippingMediaPeriod.this;
      long l = endUs;
      if ((l != Long.MIN_VALUE) && (((i == -4) && (timeUs >= l)) || ((i == -3) && (paramFormatHolder.getBufferedPositionUs() == Long.MIN_VALUE))))
      {
        paramDecoderInputBuffer.clear();
        paramDecoderInputBuffer.setFlags(4);
        sentEos = true;
        return -4;
      }
      return i;
    }
    
    public int skipData(long paramLong)
    {
      if (isPendingInitialDiscontinuity()) {
        return -3;
      }
      return childStream.skipData(paramLong);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.ClippingMediaPeriod
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */