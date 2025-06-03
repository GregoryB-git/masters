package androidx.versionedparcelable;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

class VersionedParcelStream$1
  extends FilterInputStream
{
  public VersionedParcelStream$1(VersionedParcelStream paramVersionedParcelStream, InputStream paramInputStream)
  {
    super(paramInputStream);
  }
  
  public int read()
    throws IOException
  {
    VersionedParcelStream localVersionedParcelStream = this$0;
    int i = mFieldSize;
    if ((i != -1) && (mCount >= i)) {
      throw new IOException();
    }
    i = super.read();
    localVersionedParcelStream = this$0;
    mCount += 1;
    return i;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    VersionedParcelStream localVersionedParcelStream = this$0;
    int i = mFieldSize;
    if ((i != -1) && (mCount >= i)) {
      throw new IOException();
    }
    paramInt1 = super.read(paramArrayOfByte, paramInt1, paramInt2);
    if (paramInt1 > 0)
    {
      paramArrayOfByte = this$0;
      mCount += paramInt1;
    }
    return paramInt1;
  }
  
  public long skip(long paramLong)
    throws IOException
  {
    VersionedParcelStream localVersionedParcelStream = this$0;
    int i = mFieldSize;
    if ((i != -1) && (mCount >= i)) {
      throw new IOException();
    }
    paramLong = super.skip(paramLong);
    if (paramLong > 0L)
    {
      localVersionedParcelStream = this$0;
      mCount += (int)paramLong;
    }
    return paramLong;
  }
}

/* Location:
 * Qualified Name:     androidx.versionedparcelable.VersionedParcelStream.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */