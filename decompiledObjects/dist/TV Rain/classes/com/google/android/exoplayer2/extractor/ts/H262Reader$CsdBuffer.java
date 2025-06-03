package com.google.android.exoplayer2.extractor.ts;

import java.util.Arrays;

final class H262Reader$CsdBuffer
{
  private static final byte[] START_CODE = { 0, 0, 1 };
  public byte[] data;
  private boolean isFilling;
  public int length;
  public int sequenceExtensionPosition;
  
  public H262Reader$CsdBuffer(int paramInt)
  {
    data = new byte[paramInt];
  }
  
  public void onData(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (!isFilling) {
      return;
    }
    paramInt2 -= paramInt1;
    byte[] arrayOfByte = data;
    int i = arrayOfByte.length;
    int j = length;
    if (i < j + paramInt2) {
      data = Arrays.copyOf(arrayOfByte, (j + paramInt2) * 2);
    }
    System.arraycopy(paramArrayOfByte, paramInt1, data, length, paramInt2);
    length += paramInt2;
  }
  
  public boolean onStartCode(int paramInt1, int paramInt2)
  {
    if (isFilling)
    {
      paramInt2 = length - paramInt2;
      length = paramInt2;
      if ((sequenceExtensionPosition == 0) && (paramInt1 == 181))
      {
        sequenceExtensionPosition = paramInt2;
      }
      else
      {
        isFilling = false;
        return true;
      }
    }
    else if (paramInt1 == 179)
    {
      isFilling = true;
    }
    byte[] arrayOfByte = START_CODE;
    onData(arrayOfByte, 0, arrayOfByte.length);
    return false;
  }
  
  public void reset()
  {
    isFilling = false;
    length = 0;
    sequenceExtensionPosition = 0;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.H262Reader.CsdBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */