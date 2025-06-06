package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.EOFException;
import java.io.IOException;

public final class DummyTrackOutput
  implements TrackOutput
{
  public void format(Format paramFormat) {}
  
  public int sampleData(ExtractorInput paramExtractorInput, int paramInt, boolean paramBoolean)
    throws IOException, InterruptedException
  {
    paramInt = paramExtractorInput.skip(paramInt);
    if (paramInt == -1)
    {
      if (paramBoolean) {
        return -1;
      }
      throw new EOFException();
    }
    return paramInt;
  }
  
  public void sampleData(ParsableByteArray paramParsableByteArray, int paramInt)
  {
    paramParsableByteArray.skipBytes(paramInt);
  }
  
  public void sampleMetadata(long paramLong, int paramInt1, int paramInt2, int paramInt3, @Nullable TrackOutput.CryptoData paramCryptoData) {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.DummyTrackOutput
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */