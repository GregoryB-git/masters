package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.chunk.DataChunk;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.util.Arrays;

final class HlsChunkSource$EncryptionKeyChunk
  extends DataChunk
{
  public final String iv;
  private byte[] result;
  
  public HlsChunkSource$EncryptionKeyChunk(DataSource paramDataSource, DataSpec paramDataSpec, Format paramFormat, int paramInt, Object paramObject, byte[] paramArrayOfByte, String paramString)
  {
    super(paramDataSource, paramDataSpec, 3, paramFormat, paramInt, paramObject, paramArrayOfByte);
    iv = paramString;
  }
  
  public void consume(byte[] paramArrayOfByte, int paramInt)
    throws IOException
  {
    result = Arrays.copyOf(paramArrayOfByte, paramInt);
  }
  
  public byte[] getResult()
  {
    return result;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.HlsChunkSource.EncryptionKeyChunk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */