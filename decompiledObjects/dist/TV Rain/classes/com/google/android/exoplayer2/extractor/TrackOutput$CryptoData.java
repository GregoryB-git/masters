package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import java.util.Arrays;

public final class TrackOutput$CryptoData
{
  public final int clearBlocks;
  public final int cryptoMode;
  public final int encryptedBlocks;
  public final byte[] encryptionKey;
  
  public TrackOutput$CryptoData(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    cryptoMode = paramInt1;
    encryptionKey = paramArrayOfByte;
    encryptedBlocks = paramInt2;
    clearBlocks = paramInt3;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (CryptoData.class == paramObject.getClass()))
    {
      paramObject = (CryptoData)paramObject;
      if ((cryptoMode != cryptoMode) || (encryptedBlocks != encryptedBlocks) || (clearBlocks != clearBlocks) || (!Arrays.equals(encryptionKey, encryptionKey))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = cryptoMode;
    return ((Arrays.hashCode(encryptionKey) + i * 31) * 31 + encryptedBlocks) * 31 + clearBlocks;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.TrackOutput.CryptoData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */