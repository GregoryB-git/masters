package com.google.android.exoplayer2.text;

final class SimpleSubtitleOutputBuffer
  extends SubtitleOutputBuffer
{
  private final SimpleSubtitleDecoder owner;
  
  public SimpleSubtitleOutputBuffer(SimpleSubtitleDecoder paramSimpleSubtitleDecoder)
  {
    owner = paramSimpleSubtitleDecoder;
  }
  
  public final void release()
  {
    owner.releaseOutputBuffer(this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.SimpleSubtitleOutputBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */