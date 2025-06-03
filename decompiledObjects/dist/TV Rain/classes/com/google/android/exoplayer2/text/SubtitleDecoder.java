package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.decoder.Decoder;

public abstract interface SubtitleDecoder
  extends Decoder<SubtitleInputBuffer, SubtitleOutputBuffer, SubtitleDecoderException>
{
  public abstract void setPositionUs(long paramLong);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.SubtitleDecoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */