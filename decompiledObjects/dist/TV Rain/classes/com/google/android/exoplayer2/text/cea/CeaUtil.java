package com.google.android.exoplayer2.text.cea;

import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

public final class CeaUtil
{
  private static final int COUNTRY_CODE = 181;
  private static final int PAYLOAD_TYPE_CC = 4;
  private static final int PROVIDER_CODE_ATSC = 49;
  private static final int PROVIDER_CODE_DIRECTV = 47;
  private static final String TAG = "CeaUtil";
  public static final int USER_DATA_IDENTIFIER_GA94 = Util.getIntegerCodeForString("GA94");
  public static final int USER_DATA_TYPE_CODE_MPEG_CC = 3;
  
  public static void consume(long paramLong, ParsableByteArray paramParsableByteArray, TrackOutput[] paramArrayOfTrackOutput)
  {
    for (;;)
    {
      int i = paramParsableByteArray.bytesLeft();
      int j = 1;
      if (i <= 1) {
        break;
      }
      int k = readNon255TerminatedValue(paramParsableByteArray);
      int m = readNon255TerminatedValue(paramParsableByteArray);
      int n = paramParsableByteArray.getPosition() + m;
      if ((m != -1) && (m <= paramParsableByteArray.bytesLeft()))
      {
        i = n;
        if (k == 4)
        {
          i = n;
          if (m >= 8)
          {
            i = paramParsableByteArray.readUnsignedByte();
            int i1 = paramParsableByteArray.readUnsignedShort();
            if (i1 == 49) {
              m = paramParsableByteArray.readInt();
            } else {
              m = 0;
            }
            k = paramParsableByteArray.readUnsignedByte();
            if (i1 == 47) {
              paramParsableByteArray.skipBytes(1);
            }
            if ((i == 181) && ((i1 == 49) || (i1 == 47)) && (k == 3)) {
              i = 1;
            } else {
              i = 0;
            }
            k = i;
            if (i1 == 49)
            {
              if (m == USER_DATA_IDENTIFIER_GA94) {
                m = j;
              } else {
                m = 0;
              }
              k = i & m;
            }
            i = n;
            if (k != 0)
            {
              consumeCcData(paramLong, paramParsableByteArray, paramArrayOfTrackOutput);
              i = n;
            }
          }
        }
      }
      else
      {
        Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
        i = paramParsableByteArray.limit();
      }
      paramParsableByteArray.setPosition(i);
    }
  }
  
  public static void consumeCcData(long paramLong, ParsableByteArray paramParsableByteArray, TrackOutput[] paramArrayOfTrackOutput)
  {
    int i = paramParsableByteArray.readUnsignedByte();
    int j = 0;
    if ((i & 0x40) != 0) {
      k = 1;
    } else {
      k = 0;
    }
    if (k == 0) {
      return;
    }
    paramParsableByteArray.skipBytes(1);
    int m = (i & 0x1F) * 3;
    i = paramParsableByteArray.getPosition();
    int n = paramArrayOfTrackOutput.length;
    for (int k = j; k < n; k++)
    {
      TrackOutput localTrackOutput = paramArrayOfTrackOutput[k];
      paramParsableByteArray.setPosition(i);
      localTrackOutput.sampleData(paramParsableByteArray, m);
      localTrackOutput.sampleMetadata(paramLong, 1, m, 0, null);
    }
  }
  
  private static int readNon255TerminatedValue(ParsableByteArray paramParsableByteArray)
  {
    int i = 0;
    int j;
    int k;
    do
    {
      if (paramParsableByteArray.bytesLeft() == 0) {
        return -1;
      }
      j = paramParsableByteArray.readUnsignedByte();
      k = i + j;
      i = k;
    } while (j == 255);
    return k;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.cea.CeaUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */