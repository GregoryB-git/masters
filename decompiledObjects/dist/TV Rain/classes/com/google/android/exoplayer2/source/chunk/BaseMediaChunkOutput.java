package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.util.Log;

public final class BaseMediaChunkOutput
  implements ChunkExtractorWrapper.TrackOutputProvider
{
  private static final String TAG = "BaseMediaChunkOutput";
  private final SampleQueue[] sampleQueues;
  private final int[] trackTypes;
  
  public BaseMediaChunkOutput(int[] paramArrayOfInt, SampleQueue[] paramArrayOfSampleQueue)
  {
    trackTypes = paramArrayOfInt;
    sampleQueues = paramArrayOfSampleQueue;
  }
  
  public int[] getWriteIndices()
  {
    int[] arrayOfInt = new int[sampleQueues.length];
    for (int i = 0;; i++)
    {
      Object localObject = sampleQueues;
      if (i >= localObject.length) {
        break;
      }
      localObject = localObject[i];
      if (localObject != null) {
        arrayOfInt[i] = ((SampleQueue)localObject).getWriteIndex();
      }
    }
    return arrayOfInt;
  }
  
  public void setSampleOffsetUs(long paramLong)
  {
    for (SampleQueue localSampleQueue : sampleQueues) {
      if (localSampleQueue != null) {
        localSampleQueue.setSampleOffsetUs(paramLong);
      }
    }
  }
  
  public TrackOutput track(int paramInt1, int paramInt2)
  {
    for (paramInt1 = 0;; paramInt1++)
    {
      localObject = trackTypes;
      if (paramInt1 >= localObject.length) {
        break;
      }
      if (paramInt2 == localObject[paramInt1]) {
        return sampleQueues[paramInt1];
      }
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Unmatched track of type: ");
    ((StringBuilder)localObject).append(paramInt2);
    Log.e("BaseMediaChunkOutput", ((StringBuilder)localObject).toString());
    return new DummyTrackOutput();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.chunk.BaseMediaChunkOutput
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */