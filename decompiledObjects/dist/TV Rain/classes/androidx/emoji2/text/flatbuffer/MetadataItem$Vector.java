package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public final class MetadataItem$Vector
  extends BaseVector
{
  public Vector __assign(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer)
  {
    __reset(paramInt1, paramInt2, paramByteBuffer);
    return this;
  }
  
  public MetadataItem get(int paramInt)
  {
    return get(new MetadataItem(), paramInt);
  }
  
  public MetadataItem get(MetadataItem paramMetadataItem, int paramInt)
  {
    return paramMetadataItem.__assign(MetadataItem.access$000(__element(paramInt), bb), bb);
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.MetadataItem.Vector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */