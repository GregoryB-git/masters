package androidx.emoji2.text;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

class MetadataListReader$ByteBufferReader
  implements MetadataListReader.OpenTypeReader
{
  @NonNull
  private final ByteBuffer mByteBuffer;
  
  public MetadataListReader$ByteBufferReader(@NonNull ByteBuffer paramByteBuffer)
  {
    mByteBuffer = paramByteBuffer;
    paramByteBuffer.order(ByteOrder.BIG_ENDIAN);
  }
  
  public long getPosition()
  {
    return mByteBuffer.position();
  }
  
  public int readTag()
    throws IOException
  {
    return mByteBuffer.getInt();
  }
  
  public long readUnsignedInt()
    throws IOException
  {
    return MetadataListReader.toUnsignedInt(mByteBuffer.getInt());
  }
  
  public int readUnsignedShort()
    throws IOException
  {
    return MetadataListReader.toUnsignedShort(mByteBuffer.getShort());
  }
  
  public void skip(int paramInt)
    throws IOException
  {
    ByteBuffer localByteBuffer = mByteBuffer;
    localByteBuffer.position(localByteBuffer.position() + paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.MetadataListReader.ByteBufferReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */