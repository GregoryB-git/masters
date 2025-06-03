package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodec.CryptoInfo;

public final class ey
{
  public byte[] a;
  public int[] b;
  public int[] c;
  private final MediaCodec.CryptoInfo d;
  private final ex e;
  
  public ey()
  {
    Object localObject = new MediaCodec.CryptoInfo();
    d = ((MediaCodec.CryptoInfo)localObject);
    if (wl.a >= 24) {
      localObject = new ex((MediaCodec.CryptoInfo)localObject, (byte)0);
    } else {
      localObject = null;
    }
    e = ((ex)localObject);
  }
  
  public final MediaCodec.CryptoInfo a()
  {
    return d;
  }
  
  public final void a(int paramInt1, int[] paramArrayOfInt1, int[] paramArrayOfInt2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3, int paramInt4)
  {
    b = paramArrayOfInt1;
    c = paramArrayOfInt2;
    a = paramArrayOfByte2;
    MediaCodec.CryptoInfo localCryptoInfo = d;
    numSubSamples = paramInt1;
    numBytesOfClearData = paramArrayOfInt1;
    numBytesOfEncryptedData = paramArrayOfInt2;
    key = paramArrayOfByte1;
    iv = paramArrayOfByte2;
    mode = paramInt2;
    if (wl.a >= 24) {
      ex.a(e, paramInt3, paramInt4);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ey
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */