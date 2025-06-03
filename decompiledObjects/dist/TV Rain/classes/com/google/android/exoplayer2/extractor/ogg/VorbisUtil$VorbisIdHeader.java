package com.google.android.exoplayer2.extractor.ogg;

public final class VorbisUtil$VorbisIdHeader
{
  public final int bitrateMax;
  public final int bitrateMin;
  public final int bitrateNominal;
  public final int blockSize0;
  public final int blockSize1;
  public final int channels;
  public final byte[] data;
  public final boolean framingFlag;
  public final long sampleRate;
  public final long version;
  
  public VorbisUtil$VorbisIdHeader(long paramLong1, int paramInt1, long paramLong2, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean, byte[] paramArrayOfByte)
  {
    version = paramLong1;
    channels = paramInt1;
    sampleRate = paramLong2;
    bitrateMax = paramInt2;
    bitrateNominal = paramInt3;
    bitrateMin = paramInt4;
    blockSize0 = paramInt5;
    blockSize1 = paramInt6;
    framingFlag = paramBoolean;
    data = paramArrayOfByte;
  }
  
  public int getApproximateBitrate()
  {
    int i = bitrateNominal;
    int j = i;
    if (i == 0) {
      j = (bitrateMin + bitrateMax) / 2;
    }
    return j;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ogg.VorbisUtil.VorbisIdHeader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */