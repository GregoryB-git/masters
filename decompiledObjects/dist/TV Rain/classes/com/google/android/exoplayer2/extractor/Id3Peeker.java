package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.EOFException;
import java.io.IOException;

public final class Id3Peeker
{
  private final ParsableByteArray scratch = new ParsableByteArray(10);
  
  @Nullable
  public Metadata peekId3Data(ExtractorInput paramExtractorInput, @Nullable Id3Decoder.FramePredicate paramFramePredicate)
    throws IOException, InterruptedException
  {
    Object localObject = null;
    int i = 0;
    try
    {
      for (;;)
      {
        paramExtractorInput.peekFully(scratch.data, 0, 10);
        scratch.setPosition(0);
        if (scratch.readUnsignedInt24() != Id3Decoder.ID3_TAG) {
          break;
        }
        scratch.skipBytes(3);
        int j = scratch.readSynchSafeInt();
        int k = j + 10;
        if (localObject == null)
        {
          localObject = new byte[k];
          System.arraycopy(scratch.data, 0, localObject, 0, 10);
          paramExtractorInput.peekFully((byte[])localObject, 10, j);
          localObject = new Id3Decoder(paramFramePredicate).decode((byte[])localObject, k);
        }
        else
        {
          paramExtractorInput.advancePeekPosition(j);
        }
        i += k;
      }
    }
    catch (EOFException paramFramePredicate)
    {
      for (;;) {}
    }
    paramExtractorInput.resetPeekPosition();
    paramExtractorInput.advancePeekPosition(i);
    return (Metadata)localObject;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.Id3Peeker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */