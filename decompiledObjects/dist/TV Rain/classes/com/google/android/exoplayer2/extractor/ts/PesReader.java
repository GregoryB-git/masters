package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import z2;

public final class PesReader
  implements TsPayloadReader
{
  private static final int HEADER_SIZE = 9;
  private static final int MAX_HEADER_EXTENSION_SIZE = 10;
  private static final int PES_SCRATCH_SIZE = 10;
  private static final int STATE_FINDING_HEADER = 0;
  private static final int STATE_READING_BODY = 3;
  private static final int STATE_READING_HEADER = 1;
  private static final int STATE_READING_HEADER_EXTENSION = 2;
  private static final String TAG = "PesReader";
  private int bytesRead;
  private boolean dataAlignmentIndicator;
  private boolean dtsFlag;
  private int extendedHeaderLength;
  private int payloadSize;
  private final ParsableBitArray pesScratch;
  private boolean ptsFlag;
  private final ElementaryStreamReader reader;
  private boolean seenFirstDts;
  private int state;
  private long timeUs;
  private TimestampAdjuster timestampAdjuster;
  
  public PesReader(ElementaryStreamReader paramElementaryStreamReader)
  {
    reader = paramElementaryStreamReader;
    pesScratch = new ParsableBitArray(new byte[10]);
    state = 0;
  }
  
  private boolean continueRead(ParsableByteArray paramParsableByteArray, byte[] paramArrayOfByte, int paramInt)
  {
    int i = Math.min(paramParsableByteArray.bytesLeft(), paramInt - bytesRead);
    boolean bool = true;
    if (i <= 0) {
      return true;
    }
    if (paramArrayOfByte == null) {
      paramParsableByteArray.skipBytes(i);
    } else {
      paramParsableByteArray.readBytes(paramArrayOfByte, bytesRead, i);
    }
    i = bytesRead + i;
    bytesRead = i;
    if (i != paramInt) {
      bool = false;
    }
    return bool;
  }
  
  private boolean parseHeader()
  {
    pesScratch.setPosition(0);
    int i = pesScratch.readBits(24);
    if (i != 1)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unexpected start code prefix: ");
      localStringBuilder.append(i);
      Log.w("PesReader", localStringBuilder.toString());
      payloadSize = -1;
      return false;
    }
    pesScratch.skipBits(8);
    int j = pesScratch.readBits(16);
    pesScratch.skipBits(5);
    dataAlignmentIndicator = pesScratch.readBit();
    pesScratch.skipBits(2);
    ptsFlag = pesScratch.readBit();
    dtsFlag = pesScratch.readBit();
    pesScratch.skipBits(6);
    i = pesScratch.readBits(8);
    extendedHeaderLength = i;
    if (j == 0) {
      payloadSize = -1;
    } else {
      payloadSize = (j + 6 - 9 - i);
    }
    return true;
  }
  
  private void parseHeaderExtension()
  {
    pesScratch.setPosition(0);
    timeUs = -9223372036854775807L;
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
  
  private void setState(int paramInt)
  {
    state = paramInt;
    bytesRead = 0;
  }
  
  public final void consume(ParsableByteArray paramParsableByteArray, boolean paramBoolean)
    throws ParserException
  {
    int i;
    if (paramBoolean)
    {
      i = state;
      if ((i != 0) && (i != 1)) {
        if (i != 2)
        {
          if (i == 3)
          {
            if (payloadSize != -1)
            {
              StringBuilder localStringBuilder = z2.t("Unexpected start indicator: expected ");
              localStringBuilder.append(payloadSize);
              localStringBuilder.append(" more bytes");
              Log.w("PesReader", localStringBuilder.toString());
            }
            reader.packetFinished();
          }
          else
          {
            throw new IllegalStateException();
          }
        }
        else {
          Log.w("PesReader", "Unexpected start indicator reading extended header");
        }
      }
      setState(1);
    }
    while (paramParsableByteArray.bytesLeft() > 0)
    {
      int j = state;
      if (j != 0)
      {
        i = 0;
        int k = 0;
        if (j != 1)
        {
          if (j != 2)
          {
            if (j == 3)
            {
              j = paramParsableByteArray.bytesLeft();
              i = payloadSize;
              if (i != -1) {
                k = j - i;
              }
              i = j;
              if (k > 0)
              {
                i = j - k;
                paramParsableByteArray.setLimit(paramParsableByteArray.getPosition() + i);
              }
              reader.consume(paramParsableByteArray);
              k = payloadSize;
              if (k != -1)
              {
                i = k - i;
                payloadSize = i;
                if (i == 0)
                {
                  reader.packetFinished();
                  setState(1);
                }
              }
            }
            else
            {
              throw new IllegalStateException();
            }
          }
          else
          {
            i = Math.min(10, extendedHeaderLength);
            if ((continueRead(paramParsableByteArray, pesScratch.data, i)) && (continueRead(paramParsableByteArray, null, extendedHeaderLength)))
            {
              parseHeaderExtension();
              reader.packetStarted(timeUs, dataAlignmentIndicator);
              setState(3);
            }
          }
        }
        else if (continueRead(paramParsableByteArray, pesScratch.data, 9))
        {
          if (parseHeader()) {
            i = 2;
          }
          setState(i);
        }
      }
      else
      {
        paramParsableByteArray.skipBytes(paramParsableByteArray.bytesLeft());
      }
    }
  }
  
  public void init(TimestampAdjuster paramTimestampAdjuster, ExtractorOutput paramExtractorOutput, TsPayloadReader.TrackIdGenerator paramTrackIdGenerator)
  {
    timestampAdjuster = paramTimestampAdjuster;
    reader.createTracks(paramExtractorOutput, paramTrackIdGenerator);
  }
  
  public final void seek()
  {
    state = 0;
    bytesRead = 0;
    seenFirstDts = false;
    reader.seek();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.PesReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */