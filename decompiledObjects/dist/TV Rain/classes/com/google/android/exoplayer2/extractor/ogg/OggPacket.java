package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.util.Arrays;

final class OggPacket
{
  private int currentSegmentIndex = -1;
  private final ParsableByteArray packetArray = new ParsableByteArray(new byte[65025], 0);
  private final OggPageHeader pageHeader = new OggPageHeader();
  private boolean populated;
  private int segmentCount;
  
  private int calculatePacketSize(int paramInt)
  {
    int i = 0;
    segmentCount = 0;
    int j;
    int k;
    do
    {
      j = segmentCount;
      Object localObject = pageHeader;
      k = i;
      if (paramInt + j >= pageSegmentCount) {
        break;
      }
      localObject = laces;
      segmentCount = (j + 1);
      j = localObject[(j + paramInt)];
      k = i + j;
      i = k;
    } while (j == 255);
    return k;
  }
  
  public OggPageHeader getPageHeader()
  {
    return pageHeader;
  }
  
  public ParsableByteArray getPayload()
  {
    return packetArray;
  }
  
  public boolean populate(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    boolean bool;
    if (paramExtractorInput != null) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
    if (populated)
    {
      populated = false;
      packetArray.reset();
    }
    while (!populated)
    {
      Object localObject;
      if (currentSegmentIndex < 0)
      {
        if (!pageHeader.populate(paramExtractorInput, true)) {
          return false;
        }
        localObject = pageHeader;
        i = headerSize;
        if (((type & 0x1) == 1) && (packetArray.limit() == 0))
        {
          i += calculatePacketSize(0);
          j = segmentCount + 0;
        }
        else
        {
          j = 0;
        }
        paramExtractorInput.skipFully(i);
        currentSegmentIndex = j;
      }
      int j = calculatePacketSize(currentSegmentIndex);
      int i = currentSegmentIndex + segmentCount;
      if (j > 0)
      {
        if (packetArray.capacity() < packetArray.limit() + j)
        {
          localObject = packetArray;
          data = Arrays.copyOf(data, ((ParsableByteArray)localObject).limit() + j);
        }
        localObject = packetArray;
        paramExtractorInput.readFully(data, ((ParsableByteArray)localObject).limit(), j);
        localObject = packetArray;
        ((ParsableByteArray)localObject).setLimit(((ParsableByteArray)localObject).limit() + j);
        if (pageHeader.laces[(i - 1)] != 255) {
          bool = true;
        } else {
          bool = false;
        }
        populated = bool;
      }
      j = i;
      if (i == pageHeader.pageSegmentCount) {
        j = -1;
      }
      currentSegmentIndex = j;
    }
    return true;
  }
  
  public void reset()
  {
    pageHeader.reset();
    packetArray.reset();
    currentSegmentIndex = -1;
    populated = false;
  }
  
  public void trimPayload()
  {
    ParsableByteArray localParsableByteArray = packetArray;
    byte[] arrayOfByte = data;
    if (arrayOfByte.length == 65025) {
      return;
    }
    data = Arrays.copyOf(arrayOfByte, Math.max(65025, localParsableByteArray.limit()));
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ogg.OggPacket
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */