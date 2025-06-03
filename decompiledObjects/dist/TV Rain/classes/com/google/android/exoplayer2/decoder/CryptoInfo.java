package com.google.android.exoplayer2.decoder;

import android.annotation.TargetApi;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec.CryptoInfo.Pattern;
import com.google.android.exoplayer2.util.Util;

public final class CryptoInfo
{
  public int clearBlocks;
  public int encryptedBlocks;
  private final MediaCodec.CryptoInfo frameworkCryptoInfo;
  public byte[] iv;
  public byte[] key;
  public int mode;
  public int[] numBytesOfClearData;
  public int[] numBytesOfEncryptedData;
  public int numSubSamples;
  private final PatternHolderV24 patternHolder;
  
  public CryptoInfo()
  {
    int i = Util.SDK_INT;
    PatternHolderV24 localPatternHolderV24 = null;
    MediaCodec.CryptoInfo localCryptoInfo;
    if (i >= 16) {
      localCryptoInfo = newFrameworkCryptoInfoV16();
    } else {
      localCryptoInfo = null;
    }
    frameworkCryptoInfo = localCryptoInfo;
    if (i >= 24) {
      localPatternHolderV24 = new PatternHolderV24(localCryptoInfo, null);
    }
    patternHolder = localPatternHolderV24;
  }
  
  @TargetApi(16)
  private MediaCodec.CryptoInfo newFrameworkCryptoInfoV16()
  {
    return new MediaCodec.CryptoInfo();
  }
  
  @TargetApi(16)
  private void updateFrameworkCryptoInfoV16()
  {
    MediaCodec.CryptoInfo localCryptoInfo = frameworkCryptoInfo;
    numSubSamples = numSubSamples;
    numBytesOfClearData = numBytesOfClearData;
    numBytesOfEncryptedData = numBytesOfEncryptedData;
    key = key;
    iv = iv;
    mode = mode;
    if (Util.SDK_INT >= 24) {
      PatternHolderV24.access$100(patternHolder, encryptedBlocks, clearBlocks);
    }
  }
  
  @TargetApi(16)
  public MediaCodec.CryptoInfo getFrameworkCryptoInfoV16()
  {
    return frameworkCryptoInfo;
  }
  
  public void set(int paramInt1, int[] paramArrayOfInt1, int[] paramArrayOfInt2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3, int paramInt4)
  {
    numSubSamples = paramInt1;
    numBytesOfClearData = paramArrayOfInt1;
    numBytesOfEncryptedData = paramArrayOfInt2;
    key = paramArrayOfByte1;
    iv = paramArrayOfByte2;
    mode = paramInt2;
    encryptedBlocks = paramInt3;
    clearBlocks = paramInt4;
    if (Util.SDK_INT >= 16) {
      updateFrameworkCryptoInfoV16();
    }
  }
  
  @TargetApi(24)
  public static final class PatternHolderV24
  {
    private final MediaCodec.CryptoInfo frameworkCryptoInfo;
    private final MediaCodec.CryptoInfo.Pattern pattern;
    
    private PatternHolderV24(MediaCodec.CryptoInfo paramCryptoInfo)
    {
      frameworkCryptoInfo = paramCryptoInfo;
      pattern = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }
    
    private void set(int paramInt1, int paramInt2)
    {
      pattern.set(paramInt1, paramInt2);
      frameworkCryptoInfo.setPattern(pattern);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.decoder.CryptoInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */