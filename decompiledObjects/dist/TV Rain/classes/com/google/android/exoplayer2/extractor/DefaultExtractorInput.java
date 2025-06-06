package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

public final class DefaultExtractorInput
  implements ExtractorInput
{
  private static final int PEEK_MAX_FREE_SPACE = 524288;
  private static final int PEEK_MIN_FREE_SPACE_AFTER_RESIZE = 65536;
  private static final int SCRATCH_SPACE_SIZE = 4096;
  private final DataSource dataSource;
  private byte[] peekBuffer;
  private int peekBufferLength;
  private int peekBufferPosition;
  private long position;
  private final byte[] scratchSpace;
  private final long streamLength;
  
  public DefaultExtractorInput(DataSource paramDataSource, long paramLong1, long paramLong2)
  {
    dataSource = paramDataSource;
    position = paramLong1;
    streamLength = paramLong2;
    peekBuffer = new byte[65536];
    scratchSpace = new byte['က'];
  }
  
  private void commitBytesRead(int paramInt)
  {
    if (paramInt != -1) {
      position += paramInt;
    }
  }
  
  private void ensureSpaceForPeek(int paramInt)
  {
    paramInt = peekBufferPosition + paramInt;
    byte[] arrayOfByte = peekBuffer;
    if (paramInt > arrayOfByte.length)
    {
      paramInt = Util.constrainValue(arrayOfByte.length * 2, 65536 + paramInt, paramInt + 524288);
      peekBuffer = Arrays.copyOf(peekBuffer, paramInt);
    }
  }
  
  private int readFromDataSource(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
    throws InterruptedException, IOException
  {
    if (!Thread.interrupted())
    {
      paramInt1 = dataSource.read(paramArrayOfByte, paramInt1 + paramInt3, paramInt2 - paramInt3);
      if (paramInt1 == -1)
      {
        if ((paramInt3 == 0) && (paramBoolean)) {
          return -1;
        }
        throw new EOFException();
      }
      return paramInt3 + paramInt1;
    }
    throw new InterruptedException();
  }
  
  private int readFromPeekBuffer(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = peekBufferLength;
    if (i == 0) {
      return 0;
    }
    paramInt2 = Math.min(i, paramInt2);
    System.arraycopy(peekBuffer, 0, paramArrayOfByte, paramInt1, paramInt2);
    updatePeekBuffer(paramInt2);
    return paramInt2;
  }
  
  private int skipFromPeekBuffer(int paramInt)
  {
    paramInt = Math.min(peekBufferLength, paramInt);
    updatePeekBuffer(paramInt);
    return paramInt;
  }
  
  private void updatePeekBuffer(int paramInt)
  {
    int i = peekBufferLength - paramInt;
    peekBufferLength = i;
    peekBufferPosition = 0;
    byte[] arrayOfByte1 = peekBuffer;
    byte[] arrayOfByte2;
    if (i < arrayOfByte1.length - 524288) {
      arrayOfByte2 = new byte[65536 + i];
    } else {
      arrayOfByte2 = arrayOfByte1;
    }
    System.arraycopy(arrayOfByte1, paramInt, arrayOfByte2, 0, i);
    peekBuffer = arrayOfByte2;
  }
  
  public void advancePeekPosition(int paramInt)
    throws IOException, InterruptedException
  {
    advancePeekPosition(paramInt, false);
  }
  
  public boolean advancePeekPosition(int paramInt, boolean paramBoolean)
    throws IOException, InterruptedException
  {
    ensureSpaceForPeek(paramInt);
    int i = peekBufferLength - peekBufferPosition;
    while (i < paramInt)
    {
      i = readFromDataSource(peekBuffer, peekBufferPosition, paramInt, i, paramBoolean);
      if (i == -1) {
        return false;
      }
      peekBufferLength = (peekBufferPosition + i);
    }
    peekBufferPosition += paramInt;
    return true;
  }
  
  public long getLength()
  {
    return streamLength;
  }
  
  public long getPeekPosition()
  {
    return position + peekBufferPosition;
  }
  
  public long getPosition()
  {
    return position;
  }
  
  public void peekFully(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException, InterruptedException
  {
    peekFully(paramArrayOfByte, paramInt1, paramInt2, false);
  }
  
  public boolean peekFully(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
    throws IOException, InterruptedException
  {
    if (!advancePeekPosition(paramInt2, paramBoolean)) {
      return false;
    }
    System.arraycopy(peekBuffer, peekBufferPosition - paramInt2, paramArrayOfByte, paramInt1, paramInt2);
    return true;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException, InterruptedException
  {
    int i = readFromPeekBuffer(paramArrayOfByte, paramInt1, paramInt2);
    int j = i;
    if (i == 0) {
      j = readFromDataSource(paramArrayOfByte, paramInt1, paramInt2, 0, true);
    }
    commitBytesRead(j);
    return j;
  }
  
  public void readFully(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException, InterruptedException
  {
    readFully(paramArrayOfByte, paramInt1, paramInt2, false);
  }
  
  public boolean readFully(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
    throws IOException, InterruptedException
  {
    for (int i = readFromPeekBuffer(paramArrayOfByte, paramInt1, paramInt2); (i < paramInt2) && (i != -1); i = readFromDataSource(paramArrayOfByte, paramInt1, paramInt2, i, paramBoolean)) {}
    commitBytesRead(i);
    if (i != -1) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    return paramBoolean;
  }
  
  public void resetPeekPosition()
  {
    peekBufferPosition = 0;
  }
  
  public <E extends Throwable> void setRetryPosition(long paramLong, E paramE)
    throws Throwable
  {
    boolean bool;
    if (paramLong >= 0L) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkArgument(bool);
    position = paramLong;
    throw paramE;
  }
  
  public int skip(int paramInt)
    throws IOException, InterruptedException
  {
    int i = skipFromPeekBuffer(paramInt);
    int j = i;
    if (i == 0)
    {
      byte[] arrayOfByte = scratchSpace;
      j = readFromDataSource(arrayOfByte, 0, Math.min(paramInt, arrayOfByte.length), 0, true);
    }
    commitBytesRead(j);
    return j;
  }
  
  public void skipFully(int paramInt)
    throws IOException, InterruptedException
  {
    skipFully(paramInt, false);
  }
  
  public boolean skipFully(int paramInt, boolean paramBoolean)
    throws IOException, InterruptedException
  {
    int j;
    for (int i = skipFromPeekBuffer(paramInt); (i < paramInt) && (i != -1); i = readFromDataSource(scratchSpace, -i, j, i, paramBoolean)) {
      j = Math.min(paramInt, scratchSpace.length + i);
    }
    commitBytesRead(i);
    if (i != -1) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    return paramBoolean;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.DefaultExtractorInput
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */