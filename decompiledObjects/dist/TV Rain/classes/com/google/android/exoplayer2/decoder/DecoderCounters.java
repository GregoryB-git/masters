package com.google.android.exoplayer2.decoder;

public final class DecoderCounters
{
  public int decoderInitCount;
  public int decoderReleaseCount;
  public int droppedBufferCount;
  public int droppedToKeyframeCount;
  public int inputBufferCount;
  public int maxConsecutiveDroppedBufferCount;
  public int renderedOutputBufferCount;
  public int skippedInputBufferCount;
  public int skippedOutputBufferCount;
  
  public void ensureUpdated() {}
  
  public void merge(DecoderCounters paramDecoderCounters)
  {
    decoderInitCount += decoderInitCount;
    decoderReleaseCount += decoderReleaseCount;
    inputBufferCount += inputBufferCount;
    skippedInputBufferCount += skippedInputBufferCount;
    renderedOutputBufferCount += renderedOutputBufferCount;
    skippedOutputBufferCount += skippedOutputBufferCount;
    droppedBufferCount += droppedBufferCount;
    maxConsecutiveDroppedBufferCount = Math.max(maxConsecutiveDroppedBufferCount, maxConsecutiveDroppedBufferCount);
    droppedToKeyframeCount += droppedToKeyframeCount;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.decoder.DecoderCounters
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */