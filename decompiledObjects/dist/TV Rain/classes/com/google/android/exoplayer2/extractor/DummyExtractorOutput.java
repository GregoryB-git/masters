package com.google.android.exoplayer2.extractor;

public final class DummyExtractorOutput
  implements ExtractorOutput
{
  public void endTracks() {}
  
  public void seekMap(SeekMap paramSeekMap) {}
  
  public TrackOutput track(int paramInt1, int paramInt2)
  {
    return new DummyTrackOutput();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.DummyExtractorOutput
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */