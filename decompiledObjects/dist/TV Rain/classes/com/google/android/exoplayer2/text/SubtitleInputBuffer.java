package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

public class SubtitleInputBuffer
  extends DecoderInputBuffer
{
  public long subsampleOffsetUs;
  
  public SubtitleInputBuffer()
  {
    super(1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.SubtitleInputBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */