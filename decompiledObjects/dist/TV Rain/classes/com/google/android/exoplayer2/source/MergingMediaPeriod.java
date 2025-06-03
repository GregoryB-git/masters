package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;

final class MergingMediaPeriod
  implements MediaPeriod, MediaPeriod.Callback
{
  private MediaPeriod.Callback callback;
  private final ArrayList<MediaPeriod> childrenPendingPreparation;
  private SequenceableLoader compositeSequenceableLoader;
  private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
  private MediaPeriod[] enabledPeriods;
  public final MediaPeriod[] periods;
  private final IdentityHashMap<SampleStream, Integer> streamPeriodIndices;
  private TrackGroupArray trackGroups;
  
  public MergingMediaPeriod(CompositeSequenceableLoaderFactory paramCompositeSequenceableLoaderFactory, MediaPeriod... paramVarArgs)
  {
    compositeSequenceableLoaderFactory = paramCompositeSequenceableLoaderFactory;
    periods = paramVarArgs;
    childrenPendingPreparation = new ArrayList();
    compositeSequenceableLoader = paramCompositeSequenceableLoaderFactory.createCompositeSequenceableLoader(new SequenceableLoader[0]);
    streamPeriodIndices = new IdentityHashMap();
  }
  
  public boolean continueLoading(long paramLong)
  {
    if (!childrenPendingPreparation.isEmpty())
    {
      int i = childrenPendingPreparation.size();
      for (int j = 0; j < i; j++) {
        ((MediaPeriod)childrenPendingPreparation.get(j)).continueLoading(paramLong);
      }
      return false;
    }
    return compositeSequenceableLoader.continueLoading(paramLong);
  }
  
  public void discardBuffer(long paramLong, boolean paramBoolean)
  {
    MediaPeriod[] arrayOfMediaPeriod = enabledPeriods;
    int i = arrayOfMediaPeriod.length;
    for (int j = 0; j < i; j++) {
      arrayOfMediaPeriod[j].discardBuffer(paramLong, paramBoolean);
    }
  }
  
  public long getAdjustedSeekPositionUs(long paramLong, SeekParameters paramSeekParameters)
  {
    return enabledPeriods[0].getAdjustedSeekPositionUs(paramLong, paramSeekParameters);
  }
  
  public long getBufferedPositionUs()
  {
    return compositeSequenceableLoader.getBufferedPositionUs();
  }
  
  public long getNextLoadPositionUs()
  {
    return compositeSequenceableLoader.getNextLoadPositionUs();
  }
  
  public TrackGroupArray getTrackGroups()
  {
    return trackGroups;
  }
  
  public void maybeThrowPrepareError()
    throws IOException
  {
    MediaPeriod[] arrayOfMediaPeriod = periods;
    int i = arrayOfMediaPeriod.length;
    for (int j = 0; j < i; j++) {
      arrayOfMediaPeriod[j].maybeThrowPrepareError();
    }
  }
  
  public void onContinueLoadingRequested(MediaPeriod paramMediaPeriod)
  {
    callback.onContinueLoadingRequested(this);
  }
  
  public void onPrepared(MediaPeriod paramMediaPeriod)
  {
    childrenPendingPreparation.remove(paramMediaPeriod);
    if (!childrenPendingPreparation.isEmpty()) {
      return;
    }
    paramMediaPeriod = periods;
    int i = paramMediaPeriod.length;
    int j = 0;
    int k = j;
    while (j < i)
    {
      k += getTrackGroupslength;
      j++;
    }
    paramMediaPeriod = new TrackGroup[k];
    MediaPeriod[] arrayOfMediaPeriod = periods;
    int m = arrayOfMediaPeriod.length;
    j = 0;
    k = j;
    while (j < m)
    {
      TrackGroupArray localTrackGroupArray = arrayOfMediaPeriod[j].getTrackGroups();
      int n = length;
      i = 0;
      while (i < n)
      {
        paramMediaPeriod[k] = localTrackGroupArray.get(i);
        i++;
        k++;
      }
      j++;
    }
    trackGroups = new TrackGroupArray(paramMediaPeriod);
    callback.onPrepared(this);
  }
  
  public void prepare(MediaPeriod.Callback paramCallback, long paramLong)
  {
    callback = paramCallback;
    Collections.addAll(childrenPendingPreparation, periods);
    paramCallback = periods;
    int i = paramCallback.length;
    for (int j = 0; j < i; j++) {
      paramCallback[j].prepare(this, paramLong);
    }
  }
  
  public long readDiscontinuity()
  {
    long l = periods[0].readDiscontinuity();
    MediaPeriod[] arrayOfMediaPeriod1;
    for (int i = 1;; i++)
    {
      arrayOfMediaPeriod1 = periods;
      if (i >= arrayOfMediaPeriod1.length) {
        break label59;
      }
      if (arrayOfMediaPeriod1[i].readDiscontinuity() != -9223372036854775807L) {
        break;
      }
    }
    throw new IllegalStateException("Child reported discontinuity.");
    label59:
    if (l != -9223372036854775807L) {
      for (arrayOfMediaPeriod1 : enabledPeriods) {
        if ((arrayOfMediaPeriod1 != periods[0]) && (arrayOfMediaPeriod1.seekToUs(l) != l)) {
          throw new IllegalStateException("Unexpected child seekToUs result.");
        }
      }
    }
    return l;
  }
  
  public void reevaluateBuffer(long paramLong)
  {
    compositeSequenceableLoader.reevaluateBuffer(paramLong);
  }
  
  public long seekToUs(long paramLong)
  {
    paramLong = enabledPeriods[0].seekToUs(paramLong);
    for (int i = 1;; i++)
    {
      MediaPeriod[] arrayOfMediaPeriod = enabledPeriods;
      if (i >= arrayOfMediaPeriod.length) {
        return paramLong;
      }
      if (arrayOfMediaPeriod[i].seekToUs(paramLong) != paramLong) {
        break;
      }
    }
    throw new IllegalStateException("Unexpected child seekToUs result.");
    return paramLong;
  }
  
  public long selectTracks(TrackSelection[] paramArrayOfTrackSelection, boolean[] paramArrayOfBoolean1, SampleStream[] paramArrayOfSampleStream, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    int[] arrayOfInt1 = new int[paramArrayOfTrackSelection.length];
    int[] arrayOfInt2 = new int[paramArrayOfTrackSelection.length];
    int j;
    for (int i = 0; i < paramArrayOfTrackSelection.length; i++)
    {
      localObject1 = paramArrayOfSampleStream[i];
      if (localObject1 == null) {
        j = -1;
      } else {
        j = ((Integer)streamPeriodIndices.get(localObject1)).intValue();
      }
      arrayOfInt1[i] = j;
      arrayOfInt2[i] = -1;
      localObject1 = paramArrayOfTrackSelection[i];
      if (localObject1 != null)
      {
        localObject2 = ((TrackSelection)localObject1).getTrackGroup();
        for (j = 0;; j++)
        {
          localObject1 = periods;
          if (j >= localObject1.length) {
            break;
          }
          if (localObject1[j].getTrackGroups().indexOf((TrackGroup)localObject2) != -1)
          {
            arrayOfInt2[i] = j;
            break;
          }
        }
      }
    }
    streamPeriodIndices.clear();
    int k = paramArrayOfTrackSelection.length;
    SampleStream[] arrayOfSampleStream1 = new SampleStream[k];
    SampleStream[] arrayOfSampleStream2 = new SampleStream[paramArrayOfTrackSelection.length];
    Object localObject2 = new TrackSelection[paramArrayOfTrackSelection.length];
    Object localObject1 = new ArrayList(periods.length);
    SampleStream[] arrayOfSampleStream3;
    for (i = 0;; i++)
    {
      arrayOfSampleStream3 = paramArrayOfSampleStream;
      if (i >= periods.length) {
        break label499;
      }
      for (j = 0; j < paramArrayOfTrackSelection.length; j++)
      {
        m = arrayOfInt1[j];
        Object localObject3 = null;
        if (m == i) {
          localObject4 = arrayOfSampleStream3[j];
        } else {
          localObject4 = null;
        }
        arrayOfSampleStream2[j] = localObject4;
        Object localObject4 = localObject3;
        if (arrayOfInt2[j] == i) {
          localObject4 = paramArrayOfTrackSelection[j];
        }
        localObject2[j] = localObject4;
      }
      long l = periods[i].selectTracks((TrackSelection[])localObject2, paramArrayOfBoolean1, arrayOfSampleStream2, paramArrayOfBoolean2, paramLong);
      if (i == 0) {
        paramLong = l;
      } else {
        if (l != paramLong) {
          break;
        }
      }
      int m = 0;
      int n;
      for (j = 0; m < paramArrayOfTrackSelection.length; j = n)
      {
        n = arrayOfInt2[m];
        boolean bool = true;
        if (n == i)
        {
          if (arrayOfSampleStream2[m] != null) {
            bool = true;
          } else {
            bool = false;
          }
          Assertions.checkState(bool);
          arrayOfSampleStream1[m] = arrayOfSampleStream2[m];
          streamPeriodIndices.put(arrayOfSampleStream2[m], Integer.valueOf(i));
          n = 1;
        }
        else
        {
          n = j;
          if (arrayOfInt1[m] == i)
          {
            if (arrayOfSampleStream2[m] != null) {
              bool = false;
            }
            Assertions.checkState(bool);
            n = j;
          }
        }
        m++;
      }
      if (j != 0) {
        ((ArrayList)localObject1).add(periods[i]);
      }
    }
    throw new IllegalStateException("Children enabled at different positions.");
    label499:
    System.arraycopy(arrayOfSampleStream1, 0, arrayOfSampleStream3, 0, k);
    paramArrayOfTrackSelection = new MediaPeriod[((ArrayList)localObject1).size()];
    enabledPeriods = paramArrayOfTrackSelection;
    ((ArrayList)localObject1).toArray(paramArrayOfTrackSelection);
    compositeSequenceableLoader = compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(enabledPeriods);
    return paramLong;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.MergingMediaPeriod
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */