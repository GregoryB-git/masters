package com.google.android.exoplayer2.metadata;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

public final class MetadataInputBuffer
  extends DecoderInputBuffer
{
  public long subsampleOffsetUs;
  
  public MetadataInputBuffer()
  {
    super(1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.MetadataInputBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */