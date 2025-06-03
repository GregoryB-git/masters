package androidx.emoji2.text.flatbuffer;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Comparator;

public class Table
{
  public ByteBuffer bb;
  public int bb_pos;
  public Utf8 utf8 = Utf8.getDefault();
  private int vtable_size;
  private int vtable_start;
  
  public static boolean __has_identifier(ByteBuffer paramByteBuffer, String paramString)
  {
    if (paramString.length() == 4)
    {
      for (int i = 0; i < 4; i++) {
        if (paramString.charAt(i) != (char)paramByteBuffer.get(paramByteBuffer.position() + 4 + i)) {
          return false;
        }
      }
      return true;
    }
    throw new AssertionError("FlatBuffers: file identifier must be length 4");
  }
  
  public static int __indirect(int paramInt, ByteBuffer paramByteBuffer)
  {
    return paramByteBuffer.getInt(paramInt) + paramInt;
  }
  
  public static int __offset(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer)
  {
    paramInt2 = paramByteBuffer.capacity() - paramInt2;
    return paramByteBuffer.getShort(paramInt1 + paramInt2 - paramByteBuffer.getInt(paramInt2)) + paramInt2;
  }
  
  public static String __string(int paramInt, ByteBuffer paramByteBuffer, Utf8 paramUtf8)
  {
    paramInt = paramByteBuffer.getInt(paramInt) + paramInt;
    return paramUtf8.decodeUtf8(paramByteBuffer, paramInt + 4, paramByteBuffer.getInt(paramInt));
  }
  
  public static Table __union(Table paramTable, int paramInt, ByteBuffer paramByteBuffer)
  {
    paramTable.__reset(__indirect(paramInt, paramByteBuffer), paramByteBuffer);
    return paramTable;
  }
  
  public static int compareStrings(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.getInt(paramInt1) + paramInt1;
    int j = paramByteBuffer.getInt(paramInt2) + paramInt2;
    paramInt2 = paramByteBuffer.getInt(i);
    int k = paramByteBuffer.getInt(j);
    int m = Math.min(paramInt2, k);
    for (paramInt1 = 0; paramInt1 < m; paramInt1++)
    {
      int n = paramInt1 + (i + 4);
      int i1 = paramByteBuffer.get(n);
      int i2 = paramInt1 + (j + 4);
      if (i1 != paramByteBuffer.get(i2)) {
        return paramByteBuffer.get(n) - paramByteBuffer.get(i2);
      }
    }
    return paramInt2 - k;
  }
  
  public static int compareStrings(int paramInt, byte[] paramArrayOfByte, ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.getInt(paramInt) + paramInt;
    int j = paramByteBuffer.getInt(i);
    int k = paramArrayOfByte.length;
    int m = Math.min(j, k);
    for (paramInt = 0; paramInt < m; paramInt++)
    {
      int n = paramInt + (i + 4);
      if (paramByteBuffer.get(n) != paramArrayOfByte[paramInt]) {
        return paramByteBuffer.get(n) - paramArrayOfByte[paramInt];
      }
    }
    return j - k;
  }
  
  public int __indirect(int paramInt)
  {
    return bb.getInt(paramInt) + paramInt;
  }
  
  public int __offset(int paramInt)
  {
    if (paramInt < vtable_size) {
      paramInt = bb.getShort(vtable_start + paramInt);
    } else {
      paramInt = 0;
    }
    return paramInt;
  }
  
  public void __reset()
  {
    __reset(0, null);
  }
  
  public void __reset(int paramInt, ByteBuffer paramByteBuffer)
  {
    bb = paramByteBuffer;
    if (paramByteBuffer != null)
    {
      bb_pos = paramInt;
      paramInt -= paramByteBuffer.getInt(paramInt);
      vtable_start = paramInt;
      vtable_size = bb.getShort(paramInt);
    }
    else
    {
      bb_pos = 0;
      vtable_start = 0;
      vtable_size = 0;
    }
  }
  
  public String __string(int paramInt)
  {
    return __string(paramInt, bb, utf8);
  }
  
  public Table __union(Table paramTable, int paramInt)
  {
    return __union(paramTable, paramInt, bb);
  }
  
  public int __vector(int paramInt)
  {
    paramInt += bb_pos;
    return bb.getInt(paramInt) + paramInt + 4;
  }
  
  public ByteBuffer __vector_as_bytebuffer(int paramInt1, int paramInt2)
  {
    int i = __offset(paramInt1);
    if (i == 0) {
      return null;
    }
    ByteBuffer localByteBuffer = bb.duplicate().order(ByteOrder.LITTLE_ENDIAN);
    paramInt1 = __vector(i);
    localByteBuffer.position(paramInt1);
    localByteBuffer.limit(__vector_len(i) * paramInt2 + paramInt1);
    return localByteBuffer;
  }
  
  public ByteBuffer __vector_in_bytebuffer(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2)
  {
    int i = __offset(paramInt1);
    if (i == 0) {
      return null;
    }
    paramInt1 = __vector(i);
    paramByteBuffer.rewind();
    paramByteBuffer.limit(__vector_len(i) * paramInt2 + paramInt1);
    paramByteBuffer.position(paramInt1);
    return paramByteBuffer;
  }
  
  public int __vector_len(int paramInt)
  {
    paramInt += bb_pos;
    int i = bb.getInt(paramInt);
    return bb.getInt(i + paramInt);
  }
  
  public ByteBuffer getByteBuffer()
  {
    return bb;
  }
  
  public int keysCompare(Integer paramInteger1, Integer paramInteger2, ByteBuffer paramByteBuffer)
  {
    return 0;
  }
  
  public void sortTables(int[] paramArrayOfInt, final ByteBuffer paramByteBuffer)
  {
    Integer[] arrayOfInteger = new Integer[paramArrayOfInt.length];
    int i = 0;
    for (int j = 0; j < paramArrayOfInt.length; j++) {
      arrayOfInteger[j] = Integer.valueOf(paramArrayOfInt[j]);
    }
    Arrays.sort(arrayOfInteger, new Comparator()
    {
      public int compare(Integer paramAnonymousInteger1, Integer paramAnonymousInteger2)
      {
        return keysCompare(paramAnonymousInteger1, paramAnonymousInteger2, paramByteBuffer);
      }
    });
    for (j = i; j < paramArrayOfInt.length; j++) {
      paramArrayOfInt[j] = arrayOfInteger[j].intValue();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.Table
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */