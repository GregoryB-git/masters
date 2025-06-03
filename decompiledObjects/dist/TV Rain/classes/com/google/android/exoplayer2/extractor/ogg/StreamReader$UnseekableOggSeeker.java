package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekMap.Unseekable;
import java.io.IOException;

final class StreamReader$UnseekableOggSeeker
  implements OggSeeker
{
  public SeekMap createSeekMap()
  {
    return new SeekMap.Unseekable(-9223372036854775807L);
  }
  
  public long read(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    return -1L;
  }
  
  public long startSeek(long paramLong)
  {
    return 0L;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ogg.StreamReader.UnseekableOggSeeker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */