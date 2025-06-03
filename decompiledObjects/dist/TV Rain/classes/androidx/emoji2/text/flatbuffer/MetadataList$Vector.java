package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

public final class MetadataList$Vector
  extends BaseVector
{
  public Vector __assign(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer)
  {
    __reset(paramInt1, paramInt2, paramByteBuffer);
    return this;
  }
  
  public MetadataList get(int paramInt)
  {
    return get(new MetadataList(), paramInt);
  }
  
  public MetadataList get(MetadataList paramMetadataList, int paramInt)
  {
    return paramMetadataList.__assign(MetadataList.access$000(__element(paramInt), bb), bb);
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.MetadataList.Vector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */