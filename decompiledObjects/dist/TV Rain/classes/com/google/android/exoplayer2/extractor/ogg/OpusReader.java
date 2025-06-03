package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class OpusReader
  extends StreamReader
{
  private static final int DEFAULT_SEEK_PRE_ROLL_SAMPLES = 3840;
  private static final int OPUS_CODE = Util.getIntegerCodeForString("Opus");
  private static final byte[] OPUS_SIGNATURE = { 79, 112, 117, 115, 72, 101, 97, 100 };
  private static final int SAMPLE_RATE = 48000;
  private boolean headerRead;
  
  private long getPacketDurationUs(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte[0] & 0xFF;
    int j = i & 0x3;
    int k = 2;
    int m;
    if (j != 0)
    {
      m = k;
      if (j != 1)
      {
        m = k;
        if (j != 2) {
          m = paramArrayOfByte[1] & 0x3F;
        }
      }
    }
    else
    {
      m = 1;
    }
    i >>= 3;
    k = i & 0x3;
    if (i >= 16) {
      k = 2500 << k;
    } else if (i >= 12) {
      k = 10000 << (k & 0x1);
    } else if (k == 3) {
      k = 60000;
    } else {
      k = 10000 << k;
    }
    return m * k;
  }
  
  private void putNativeOrderLong(List<byte[]> paramList, int paramInt)
  {
    long l = paramInt * 1000000000L / 48000L;
    paramList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(l).array());
  }
  
  public static boolean verifyBitstreamType(ParsableByteArray paramParsableByteArray)
  {
    int i = paramParsableByteArray.bytesLeft();
    byte[] arrayOfByte1 = OPUS_SIGNATURE;
    if (i < arrayOfByte1.length) {
      return false;
    }
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length];
    paramParsableByteArray.readBytes(arrayOfByte2, 0, arrayOfByte1.length);
    return Arrays.equals(arrayOfByte2, arrayOfByte1);
  }
  
  public long preparePayload(ParsableByteArray paramParsableByteArray)
  {
    return convertTimeToGranule(getPacketDurationUs(data));
  }
  
  public boolean readHeaders(ParsableByteArray paramParsableByteArray, long paramLong, StreamReader.SetupData paramSetupData)
  {
    boolean bool1 = headerRead;
    boolean bool2 = true;
    if (!bool1)
    {
      byte[] arrayOfByte = Arrays.copyOf(data, paramParsableByteArray.limit());
      int i = arrayOfByte[9];
      int j = arrayOfByte[11];
      int k = arrayOfByte[10];
      paramParsableByteArray = new ArrayList(3);
      paramParsableByteArray.add(arrayOfByte);
      putNativeOrderLong(paramParsableByteArray, (j & 0xFF) << 8 | k & 0xFF);
      putNativeOrderLong(paramParsableByteArray, 3840);
      format = Format.createAudioSampleFormat(null, "audio/opus", null, -1, -1, i & 0xFF, 48000, paramParsableByteArray, null, 0, null);
      headerRead = true;
      return true;
    }
    if (paramParsableByteArray.readInt() != OPUS_CODE) {
      bool2 = false;
    }
    paramParsableByteArray.setPosition(0);
    return bool2;
  }
  
  public void reset(boolean paramBoolean)
  {
    super.reset(paramBoolean);
    if (paramBoolean) {
      headerRead = false;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ogg.OpusReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */