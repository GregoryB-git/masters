package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public class FlexBuffers$Blob
  extends FlexBuffers.Sized
{
  public static final Blob EMPTY = new Blob(FlexBuffers.access$000(), 1, 1);
  
  public FlexBuffers$Blob(ReadBuf paramReadBuf, int paramInt1, int paramInt2)
  {
    super(paramReadBuf, paramInt1, paramInt2);
  }
  
  public static Blob empty()
  {
    return EMPTY;
  }
  
  public ByteBuffer data()
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(bb.data());
    localByteBuffer.position(end);
    int i = end;
    localByteBuffer.limit(size() + i);
    return localByteBuffer.asReadOnlyBuffer().slice();
  }
  
  public byte get(int paramInt)
  {
    return bb.get(end + paramInt);
  }
  
  public byte[] getBytes()
  {
    int i = size();
    byte[] arrayOfByte = new byte[i];
    for (int j = 0; j < i; j++) {
      arrayOfByte[j] = bb.get(end + j);
    }
    return arrayOfByte;
  }
  
  public String toString()
  {
    return bb.getString(end, size());
  }
  
  public StringBuilder toString(StringBuilder paramStringBuilder)
  {
    paramStringBuilder.append('"');
    paramStringBuilder.append(bb.getString(end, size()));
    paramStringBuilder.append('"');
    return paramStringBuilder;
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.FlexBuffers.Blob
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */