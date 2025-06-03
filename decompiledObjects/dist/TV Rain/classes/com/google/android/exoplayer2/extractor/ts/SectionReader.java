package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;

public final class SectionReader
  implements TsPayloadReader
{
  private static final int DEFAULT_SECTION_BUFFER_LENGTH = 32;
  private static final int MAX_SECTION_LENGTH = 4098;
  private static final int SECTION_HEADER_LENGTH = 3;
  private int bytesRead;
  private final SectionPayloadReader reader;
  private final ParsableByteArray sectionData;
  private boolean sectionSyntaxIndicator;
  private int totalSectionLength;
  private boolean waitingForPayloadStart;
  
  public SectionReader(SectionPayloadReader paramSectionPayloadReader)
  {
    reader = paramSectionPayloadReader;
    sectionData = new ParsableByteArray(32);
  }
  
  public void consume(ParsableByteArray paramParsableByteArray, boolean paramBoolean)
  {
    int i;
    if (paramBoolean)
    {
      i = paramParsableByteArray.readUnsignedByte();
      i = paramParsableByteArray.getPosition() + i;
    }
    else
    {
      i = -1;
    }
    if (waitingForPayloadStart)
    {
      if (!paramBoolean) {
        return;
      }
      waitingForPayloadStart = false;
      paramParsableByteArray.setPosition(i);
      bytesRead = 0;
    }
    while (paramParsableByteArray.bytesLeft() > 0)
    {
      i = bytesRead;
      paramBoolean = true;
      int j;
      if (i < 3)
      {
        if (i == 0)
        {
          i = paramParsableByteArray.readUnsignedByte();
          paramParsableByteArray.setPosition(paramParsableByteArray.getPosition() - 1);
          if (i == 255)
          {
            waitingForPayloadStart = true;
            return;
          }
        }
        i = Math.min(paramParsableByteArray.bytesLeft(), 3 - bytesRead);
        paramParsableByteArray.readBytes(sectionData.data, bytesRead, i);
        i = bytesRead + i;
        bytesRead = i;
        if (i == 3)
        {
          sectionData.reset(3);
          sectionData.skipBytes(1);
          j = sectionData.readUnsignedByte();
          i = sectionData.readUnsignedByte();
          if ((j & 0x80) == 0) {
            paramBoolean = false;
          }
          sectionSyntaxIndicator = paramBoolean;
          totalSectionLength = (((j & 0xF) << 8 | i) + 3);
          i = sectionData.capacity();
          j = totalSectionLength;
          if (i < j)
          {
            ParsableByteArray localParsableByteArray = sectionData;
            byte[] arrayOfByte = data;
            localParsableByteArray.reset(Math.min(4098, Math.max(j, arrayOfByte.length * 2)));
            System.arraycopy(arrayOfByte, 0, sectionData.data, 0, 3);
          }
        }
      }
      else
      {
        i = Math.min(paramParsableByteArray.bytesLeft(), totalSectionLength - bytesRead);
        paramParsableByteArray.readBytes(sectionData.data, bytesRead, i);
        j = bytesRead + i;
        bytesRead = j;
        i = totalSectionLength;
        if (j == i)
        {
          if (sectionSyntaxIndicator)
          {
            if (Util.crc(sectionData.data, 0, i, -1) != 0)
            {
              waitingForPayloadStart = true;
              return;
            }
            sectionData.reset(totalSectionLength - 4);
          }
          else
          {
            sectionData.reset(i);
          }
          reader.consume(sectionData);
          bytesRead = 0;
        }
      }
    }
  }
  
  public void init(TimestampAdjuster paramTimestampAdjuster, ExtractorOutput paramExtractorOutput, TsPayloadReader.TrackIdGenerator paramTrackIdGenerator)
  {
    reader.init(paramTimestampAdjuster, paramExtractorOutput, paramTrackIdGenerator);
    waitingForPayloadStart = true;
  }
  
  public void seek()
  {
    waitingForPayloadStart = true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.SectionReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */