package com.google.android.exoplayer2.extractor;

public abstract interface ExtractorOutput
{
  public abstract void endTracks();
  
  public abstract void seekMap(SeekMap paramSeekMap);
  
  public abstract TrackOutput track(int paramInt1, int paramInt2);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ExtractorOutput
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */