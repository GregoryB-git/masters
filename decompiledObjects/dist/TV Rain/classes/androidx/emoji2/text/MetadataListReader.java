package androidx.emoji2.text;

import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import z2;

@AnyThread
@RequiresApi(19)
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
class MetadataListReader
{
  private static final int EMJI_TAG = 1164798569;
  private static final int EMJI_TAG_DEPRECATED = 1701669481;
  private static final int META_TABLE_NAME = 1835365473;
  
  private static OffsetInfo findOffsetInfo(OpenTypeReader paramOpenTypeReader)
    throws IOException
  {
    paramOpenTypeReader.skip(4);
    int i = paramOpenTypeReader.readUnsignedShort();
    if (i <= 100)
    {
      paramOpenTypeReader.skip(6);
      int j = 0;
      for (int k = 0; k < i; k++)
      {
        int m = paramOpenTypeReader.readTag();
        paramOpenTypeReader.skip(4);
        l1 = paramOpenTypeReader.readUnsignedInt();
        paramOpenTypeReader.skip(4);
        if (1835365473 == m) {
          break label88;
        }
      }
      long l1 = -1L;
      label88:
      if (l1 != -1L)
      {
        paramOpenTypeReader.skip((int)(l1 - paramOpenTypeReader.getPosition()));
        paramOpenTypeReader.skip(12);
        long l2 = paramOpenTypeReader.readUnsignedInt();
        k = j;
        while (k < l2)
        {
          j = paramOpenTypeReader.readTag();
          long l3 = paramOpenTypeReader.readUnsignedInt();
          long l4 = paramOpenTypeReader.readUnsignedInt();
          if ((1164798569 != j) && (1701669481 != j)) {
            k++;
          } else {
            return new OffsetInfo(l3 + l1, l4);
          }
        }
      }
      throw new IOException("Cannot read metadata.");
    }
    throw new IOException("Cannot read metadata.");
  }
  
  /* Error */
  public static MetadataList read(android.content.res.AssetManager paramAssetManager, String paramString)
    throws IOException
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 76	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   5: astore_1
    //   6: aload_1
    //   7: invokestatic 79	androidx/emoji2/text/MetadataListReader:read	(Ljava/io/InputStream;)Landroidx/emoji2/text/flatbuffer/MetadataList;
    //   10: astore_0
    //   11: aload_1
    //   12: ifnull +7 -> 19
    //   15: aload_1
    //   16: invokevirtual 84	java/io/InputStream:close	()V
    //   19: aload_0
    //   20: areturn
    //   21: astore_0
    //   22: aload_1
    //   23: ifnull +16 -> 39
    //   26: aload_1
    //   27: invokevirtual 84	java/io/InputStream:close	()V
    //   30: goto +9 -> 39
    //   33: astore_1
    //   34: aload_0
    //   35: aload_1
    //   36: invokevirtual 90	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   39: aload_0
    //   40: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	41	0	paramAssetManager	android.content.res.AssetManager
    //   0	41	1	paramString	String
    // Exception table:
    //   from	to	target	type
    //   6	11	21	finally
    //   26	30	33	finally
  }
  
  public static MetadataList read(InputStream paramInputStream)
    throws IOException
  {
    Object localObject = new InputStreamOpenTypeReader(paramInputStream);
    OffsetInfo localOffsetInfo = findOffsetInfo((OpenTypeReader)localObject);
    ((OpenTypeReader)localObject).skip((int)(localOffsetInfo.getStartOffset() - ((OpenTypeReader)localObject).getPosition()));
    localObject = ByteBuffer.allocate((int)localOffsetInfo.getLength());
    int i = paramInputStream.read(((ByteBuffer)localObject).array());
    if (i == localOffsetInfo.getLength()) {
      return MetadataList.getRootAsMetadataList((ByteBuffer)localObject);
    }
    paramInputStream = z2.t("Needed ");
    paramInputStream.append(localOffsetInfo.getLength());
    paramInputStream.append(" bytes, got ");
    paramInputStream.append(i);
    throw new IOException(paramInputStream.toString());
  }
  
  public static MetadataList read(ByteBuffer paramByteBuffer)
    throws IOException
  {
    paramByteBuffer = paramByteBuffer.duplicate();
    paramByteBuffer.position((int)findOffsetInfo(new ByteBufferReader(paramByteBuffer)).getStartOffset());
    return MetadataList.getRootAsMetadataList(paramByteBuffer);
  }
  
  public static long toUnsignedInt(int paramInt)
  {
    return paramInt & 0xFFFFFFFF;
  }
  
  public static int toUnsignedShort(short paramShort)
  {
    return paramShort & 0xFFFF;
  }
  
  public static class ByteBufferReader
    implements MetadataListReader.OpenTypeReader
  {
    @NonNull
    private final ByteBuffer mByteBuffer;
    
    public ByteBufferReader(@NonNull ByteBuffer paramByteBuffer)
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
  
  public static class InputStreamOpenTypeReader
    implements MetadataListReader.OpenTypeReader
  {
    @NonNull
    private final byte[] mByteArray;
    @NonNull
    private final ByteBuffer mByteBuffer;
    @NonNull
    private final InputStream mInputStream;
    private long mPosition = 0L;
    
    public InputStreamOpenTypeReader(@NonNull InputStream paramInputStream)
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
  
  public static class OffsetInfo
  {
    private final long mLength;
    private final long mStartOffset;
    
    public OffsetInfo(long paramLong1, long paramLong2)
    {
      mStartOffset = paramLong1;
      mLength = paramLong2;
    }
    
    public long getLength()
    {
      return mLength;
    }
    
    public long getStartOffset()
    {
      return mStartOffset;
    }
  }
  
  public static abstract interface OpenTypeReader
  {
    public static final int UINT16_BYTE_COUNT = 2;
    public static final int UINT32_BYTE_COUNT = 4;
    
    public abstract long getPosition();
    
    public abstract int readTag()
      throws IOException;
    
    public abstract long readUnsignedInt()
      throws IOException;
    
    public abstract int readUnsignedShort()
      throws IOException;
    
    public abstract void skip(int paramInt)
      throws IOException;
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.MetadataListReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */