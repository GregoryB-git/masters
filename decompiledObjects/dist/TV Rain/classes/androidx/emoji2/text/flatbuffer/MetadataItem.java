package androidx.emoji2.text.flatbuffer;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class MetadataItem
  extends Table
{
  public static void ValidateVersion() {}
  
  public static void addCodepoints(FlatBufferBuilder paramFlatBufferBuilder, int paramInt)
  {
    paramFlatBufferBuilder.addOffset(6, paramInt, 0);
  }
  
  public static void addCompatAdded(FlatBufferBuilder paramFlatBufferBuilder, short paramShort)
  {
    paramFlatBufferBuilder.addShort(3, paramShort, 0);
  }
  
  public static void addEmojiStyle(FlatBufferBuilder paramFlatBufferBuilder, boolean paramBoolean)
  {
    paramFlatBufferBuilder.addBoolean(1, paramBoolean, false);
  }
  
  public static void addHeight(FlatBufferBuilder paramFlatBufferBuilder, short paramShort)
  {
    paramFlatBufferBuilder.addShort(5, paramShort, 0);
  }
  
  public static void addId(FlatBufferBuilder paramFlatBufferBuilder, int paramInt)
  {
    paramFlatBufferBuilder.addInt(0, paramInt, 0);
  }
  
  public static void addSdkAdded(FlatBufferBuilder paramFlatBufferBuilder, short paramShort)
  {
    paramFlatBufferBuilder.addShort(2, paramShort, 0);
  }
  
  public static void addWidth(FlatBufferBuilder paramFlatBufferBuilder, short paramShort)
  {
    paramFlatBufferBuilder.addShort(4, paramShort, 0);
  }
  
  public static int createCodepointsVector(FlatBufferBuilder paramFlatBufferBuilder, int[] paramArrayOfInt)
  {
    paramFlatBufferBuilder.startVector(4, paramArrayOfInt.length, 4);
    for (int i = paramArrayOfInt.length - 1; i >= 0; i--) {
      paramFlatBufferBuilder.addInt(paramArrayOfInt[i]);
    }
    return paramFlatBufferBuilder.endVector();
  }
  
  public static int createMetadataItem(FlatBufferBuilder paramFlatBufferBuilder, int paramInt1, boolean paramBoolean, short paramShort1, short paramShort2, short paramShort3, short paramShort4, int paramInt2)
  {
    paramFlatBufferBuilder.startTable(7);
    addCodepoints(paramFlatBufferBuilder, paramInt2);
    addId(paramFlatBufferBuilder, paramInt1);
    addHeight(paramFlatBufferBuilder, paramShort4);
    addWidth(paramFlatBufferBuilder, paramShort3);
    addCompatAdded(paramFlatBufferBuilder, paramShort2);
    addSdkAdded(paramFlatBufferBuilder, paramShort1);
    addEmojiStyle(paramFlatBufferBuilder, paramBoolean);
    return endMetadataItem(paramFlatBufferBuilder);
  }
  
  public static int endMetadataItem(FlatBufferBuilder paramFlatBufferBuilder)
  {
    return paramFlatBufferBuilder.endTable();
  }
  
  public static MetadataItem getRootAsMetadataItem(ByteBuffer paramByteBuffer)
  {
    return getRootAsMetadataItem(paramByteBuffer, new MetadataItem());
  }
  
  public static MetadataItem getRootAsMetadataItem(ByteBuffer paramByteBuffer, MetadataItem paramMetadataItem)
  {
    paramByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    int i = paramByteBuffer.getInt(paramByteBuffer.position());
    return paramMetadataItem.__assign(paramByteBuffer.position() + i, paramByteBuffer);
  }
  
  public static void startCodepointsVector(FlatBufferBuilder paramFlatBufferBuilder, int paramInt)
  {
    paramFlatBufferBuilder.startVector(4, paramInt, 4);
  }
  
  public static void startMetadataItem(FlatBufferBuilder paramFlatBufferBuilder)
  {
    paramFlatBufferBuilder.startTable(7);
  }
  
  public MetadataItem __assign(int paramInt, ByteBuffer paramByteBuffer)
  {
    __init(paramInt, paramByteBuffer);
    return this;
  }
  
  public void __init(int paramInt, ByteBuffer paramByteBuffer)
  {
    __reset(paramInt, paramByteBuffer);
  }
  
  public int codepoints(int paramInt)
  {
    int i = __offset(16);
    if (i != 0) {
      paramInt = bb.getInt(paramInt * 4 + __vector(i));
    } else {
      paramInt = 0;
    }
    return paramInt;
  }
  
  public ByteBuffer codepointsAsByteBuffer()
  {
    return __vector_as_bytebuffer(16, 4);
  }
  
  public ByteBuffer codepointsInByteBuffer(ByteBuffer paramByteBuffer)
  {
    return __vector_in_bytebuffer(paramByteBuffer, 16, 4);
  }
  
  public int codepointsLength()
  {
    int i = __offset(16);
    if (i != 0) {
      i = __vector_len(i);
    } else {
      i = 0;
    }
    return i;
  }
  
  public IntVector codepointsVector()
  {
    return codepointsVector(new IntVector());
  }
  
  public IntVector codepointsVector(IntVector paramIntVector)
  {
    int i = __offset(16);
    if (i != 0) {
      paramIntVector = paramIntVector.__assign(__vector(i), bb);
    } else {
      paramIntVector = null;
    }
    return paramIntVector;
  }
  
  public short compatAdded()
  {
    int i = __offset(10);
    int j;
    if (i != 0)
    {
      i = bb.getShort(i + bb_pos);
      j = i;
    }
    else
    {
      i = 0;
      j = i;
    }
    return j;
  }
  
  public boolean emojiStyle()
  {
    int i = __offset(6);
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i != 0)
    {
      bool2 = bool1;
      if (bb.get(i + bb_pos) != 0) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public short height()
  {
    int i = __offset(14);
    int j;
    if (i != 0)
    {
      i = bb.getShort(i + bb_pos);
      j = i;
    }
    else
    {
      i = 0;
      j = i;
    }
    return j;
  }
  
  public int id()
  {
    int i = __offset(4);
    if (i != 0) {
      i = bb.getInt(i + bb_pos);
    } else {
      i = 0;
    }
    return i;
  }
  
  public short sdkAdded()
  {
    int i = __offset(8);
    int j;
    if (i != 0)
    {
      i = bb.getShort(i + bb_pos);
      j = i;
    }
    else
    {
      i = 0;
      j = i;
    }
    return j;
  }
  
  public short width()
  {
    int i = __offset(12);
    int j;
    if (i != 0)
    {
      i = bb.getShort(i + bb_pos);
      j = i;
    }
    else
    {
      i = 0;
      j = i;
    }
    return j;
  }
  
  public static final class Vector
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
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.MetadataItem
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */