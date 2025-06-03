package androidx.emoji2.text;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

class MetadataListReader$InputStreamOpenTypeReader
  implements MetadataListReader.OpenTypeReader
{
  @NonNull
  private final byte[] mByteArray;
  @NonNull
  private final ByteBuffer mByteBuffer;
  @NonNull
  private final InputStream mInputStream;
  private long mPosition = 0L;
  
  public MetadataListReader$InputStreamOpenTypeReader(@NonNull InputStream paramInputStream)
  {
    mInputStream = paramInputStream;
    paramInputStream = new byte[4];
    mByteArray = paramInputStream;
    paramInputStream = ByteBuffer.wrap(paramInputStream);
    mByteBuffer = paramInputStream;
    paramInputStream.order(ByteOrder.BIG_ENDIAN);
  }
  
  private void read(@IntRange(from=0L, to=4L) int paramInt)
    throws IOException
  {
    if (mInputStream.read(mByteArray, 0, paramInt) == paramInt)
    {
      mPosition += paramInt;
      return;
    }
    throw new IOException("read failed");
  }
  
  public long getPosition()
  {
    return mPosition;
  }
  
  public int readTag()
    throws IOException
  {
    mByteBuffer.position(0);
    read(4);
    return mByteBuffer.getInt();
  }
  
  public long readUnsignedInt()
    throws IOException
  {
    mByteBuffer.position(0);
    read(4);
    return MetadataListReader.toUnsignedInt(mByteBuffer.getInt());
  }
  
  public int readUnsignedShort()
    throws IOException
  {
    mByteBuffer.position(0);
    read(2);
    return MetadataListReader.toUnsignedShort(mByteBuffer.getShort());
  }
  
  public void skip(int paramInt)
    throws IOException
  {
    while (paramInt > 0)
    {
      int i = (int)mInputStream.skip(paramInt);
      if (i >= 1)
      {
        paramInt -= i;
        mPosition += i;
      }
      else
      {
        throw new IOException("Skip didn't move at least 1 byte forward");
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.MetadataListReader.InputStreamOpenTypeReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */