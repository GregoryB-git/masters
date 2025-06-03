package j0;

import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec.CryptoInfo.Pattern;
import g0.M;
import g0.a;

public final class c
{
  public byte[] a;
  public byte[] b;
  public int c;
  public int[] d;
  public int[] e;
  public int f;
  public int g;
  public int h;
  public final MediaCodec.CryptoInfo i;
  public final b j;
  
  public c()
  {
    MediaCodec.CryptoInfo localCryptoInfo = new MediaCodec.CryptoInfo();
    i = localCryptoInfo;
    int k = M.a;
    b localb = null;
    if (k >= 24) {
      localb = new b(localCryptoInfo, null);
    }
    j = localb;
  }
  
  public MediaCodec.CryptoInfo a()
  {
    return i;
  }
  
  public void b(int paramInt)
  {
    if (paramInt == 0) {
      return;
    }
    if (d == null)
    {
      arrayOfInt = new int[1];
      d = arrayOfInt;
      i.numBytesOfClearData = arrayOfInt;
    }
    int[] arrayOfInt = d;
    arrayOfInt[0] += paramInt;
  }
  
  public void c(int paramInt1, int[] paramArrayOfInt1, int[] paramArrayOfInt2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3, int paramInt4)
  {
    f = paramInt1;
    d = paramArrayOfInt1;
    e = paramArrayOfInt2;
    b = paramArrayOfByte1;
    a = paramArrayOfByte2;
    c = paramInt2;
    g = paramInt3;
    h = paramInt4;
    MediaCodec.CryptoInfo localCryptoInfo = i;
    numSubSamples = paramInt1;
    numBytesOfClearData = paramArrayOfInt1;
    numBytesOfEncryptedData = paramArrayOfInt2;
    key = paramArrayOfByte1;
    iv = paramArrayOfByte2;
    mode = paramInt2;
    if (M.a >= 24) {
      b.a((b)a.e(j), paramInt3, paramInt4);
    }
  }
  
  public static final class b
  {
    public final MediaCodec.CryptoInfo a;
    public final MediaCodec.CryptoInfo.Pattern b;
    
    public b(MediaCodec.CryptoInfo paramCryptoInfo)
    {
      a = paramCryptoInfo;
      b = d.a(0, 0);
    }
    
    public final void b(int paramInt1, int paramInt2)
    {
      e.a(b, paramInt1, paramInt2);
      f.a(a, b);
    }
  }
}

/* Location:
 * Qualified Name:     j0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */