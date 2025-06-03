package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import z2;

public final class ByteArrayDataSource
  extends BaseDataSource
{
  private int bytesRemaining;
  private final byte[] data;
  private boolean opened;
  private int readPosition;
  @Nullable
  private Uri uri;
  
  public ByteArrayDataSource(byte[] paramArrayOfByte)
  {
    super(false);
    Assertions.checkNotNull(paramArrayOfByte);
    if (paramArrayOfByte.length > 0) {
      bool = true;
    }
    Assertions.checkArgument(bool);
    data = paramArrayOfByte;
  }
  
  public void close()
    throws IOException
  {
    if (opened)
    {
      opened = false;
      transferEnded();
    }
    uri = null;
  }
  
  @Nullable
  public Uri getUri()
  {
    return uri;
  }
  
  public long open(DataSpec paramDataSpec)
    throws IOException
  {
    uri = uri;
    transferInitializing(paramDataSpec);
    long l1 = position;
    int i = (int)l1;
    readPosition = i;
    long l2 = length;
    long l3 = l2;
    if (l2 == -1L) {
      l3 = data.length - l1;
    }
    int j = (int)l3;
    bytesRemaining = j;
    if ((j > 0) && (i + j <= data.length))
    {
      opened = true;
      transferStarted(paramDataSpec);
      return bytesRemaining;
    }
    StringBuilder localStringBuilder = z2.t("Unsatisfiable range: [");
    localStringBuilder.append(readPosition);
    localStringBuilder.append(", ");
    localStringBuilder.append(length);
    localStringBuilder.append("], length: ");
    localStringBuilder.append(data.length);
    throw new IOException(localStringBuilder.toString());
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    if (paramInt2 == 0) {
      return 0;
    }
    int i = bytesRemaining;
    if (i == 0) {
      return -1;
    }
    paramInt2 = Math.min(paramInt2, i);
    System.arraycopy(data, readPosition, paramArrayOfByte, paramInt1, paramInt2);
    readPosition += paramInt2;
    bytesRemaining -= paramInt2;
    bytesTransferred(paramInt2);
    return paramInt2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.ByteArrayDataSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */