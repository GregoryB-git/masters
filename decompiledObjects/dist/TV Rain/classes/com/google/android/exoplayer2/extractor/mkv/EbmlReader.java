package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import java.io.IOException;

abstract interface EbmlReader
{
  public abstract void init(EbmlReaderOutput paramEbmlReaderOutput);
  
  public abstract boolean read(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException;
  
  public abstract void reset();
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mkv.EbmlReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */