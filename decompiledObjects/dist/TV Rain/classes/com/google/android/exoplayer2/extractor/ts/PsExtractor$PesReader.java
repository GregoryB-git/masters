package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;

final class PsExtractor$PesReader
{
  private static final int PES_SCRATCH_SIZE = 64;
  private boolean dtsFlag;
  private int extendedHeaderLength;
  private final ElementaryStreamReader pesPayloadReader;
  private final ParsableBitArray pesScratch;
  private boolean ptsFlag;
  private boolean seenFirstDts;
  private long timeUs;
  private final TimestampAdjuster timestampAdjuster;
  
  public PsExtractor$PesReader(ElementaryStreamReader paramElementaryStreamReader, TimestampAdjuster paramTimestampAdjuster)
  {
    pesPayloadReader = paramElementaryStreamReader;
    timestampAdjuster = paramTimestampAdjuster;
    pesScratch = new ParsableBitArray(new byte[64]);
  }
  
  private void parseHeader()
  {
    pesScratch.skipBits(8);
    ptsFlag = pesScratch.readBit();
    dtsFlag = pesScratch.readBit();
    pesScratch.skipBits(6);
    extendedHeaderLength = pesScratch.readBits(8);
  }
  
  private void parseHeaderExtension()
  {
    timeUs = 0L;
    if (ptsFlag)
    {
      pesScratch.skipBits(4);
      long l1 = pesScratch.readBits(3);
      pesScratch.skipBits(1);
      long l2 = pesScratch.readBits(15) << 15;
      pesScratch.skipBits(1);
      long l3 = pesScratch.readBits(15);
      pesScratch.skipBits(1);
      if ((!seenFirstDts) && (dtsFlag))
      {
        pesScratch.skipBits(4);
        long l4 = pesScratch.readBits(3);
        pesScratch.skipBits(1);
        long l5 = pesScratch.readBits(15) << 15;
        pesScratch.skipBits(1);
        long l6 = pesScratch.readBits(15);
        pesScratch.skipBits(1);
        timestampAdjuster.adjustTsTimestamp(l4 << 30 | l5 | l6);
        seenFirstDts = true;
      }
      timeUs = timestampAdjuster.adjustTsTimestamp(l1 << 30 | l2 | l3);
    }
  }
  
  public void consume(ParsableByteArray paramParsableByteArray)
    throws ParserException
  {
    paramParsableByteArray.readBytes(pesScratch.data, 0, 3);
    pesScratch.setPosition(0);
    parseHeader();
    paramParsableByteArray.readBytes(pesScratch.data, 0, extendedHeaderLength);
    pesScratch.setPosition(0);
    parseHeaderExtension();
    pesPayloadReader.packetStarted(timeUs, true);
    pesPayloadReader.consume(paramParsableByteArray);
    pesPayloadReader.packetFinished();
  }
  
  public void seek()
  {
    seenFirstDts = false;
    pesPayloadReader.seek();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.PsExtractor.PesReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */