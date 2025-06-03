package androidx.emoji2.text.flatbuffer;

import a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class FlatBufferBuilder
{
  public ByteBuffer bb;
  public ByteBufferFactory bb_factory;
  public boolean finished = false;
  public boolean force_defaults = false;
  public int minalign = 1;
  public boolean nested = false;
  public int num_vtables = 0;
  public int object_start;
  public int space;
  public final Utf8 utf8;
  public int vector_num_elems = 0;
  public int[] vtable = null;
  public int vtable_in_use = 0;
  public int[] vtables = new int[16];
  
  public FlatBufferBuilder()
  {
    this(1024);
  }
  
  public FlatBufferBuilder(int paramInt)
  {
    this(paramInt, HeapByteBufferFactory.INSTANCE, null, Utf8.getDefault());
  }
  
  public FlatBufferBuilder(int paramInt, ByteBufferFactory paramByteBufferFactory)
  {
    this(paramInt, paramByteBufferFactory, null, Utf8.getDefault());
  }
  
  public FlatBufferBuilder(int paramInt, ByteBufferFactory paramByteBufferFactory, ByteBuffer paramByteBuffer, Utf8 paramUtf8)
  {
    int i = paramInt;
    if (paramInt <= 0) {
      i = 1;
    }
    bb_factory = paramByteBufferFactory;
    if (paramByteBuffer != null)
    {
      bb = paramByteBuffer;
      paramByteBuffer.clear();
      bb.order(ByteOrder.LITTLE_ENDIAN);
    }
    else
    {
      bb = paramByteBufferFactory.newByteBuffer(i);
    }
    utf8 = paramUtf8;
    space = bb.capacity();
  }
  
  public FlatBufferBuilder(ByteBuffer paramByteBuffer)
  {
    this(paramByteBuffer, new HeapByteBufferFactory());
  }
  
  public FlatBufferBuilder(ByteBuffer paramByteBuffer, ByteBufferFactory paramByteBufferFactory)
  {
    this(paramByteBuffer.capacity(), paramByteBufferFactory, paramByteBuffer, Utf8.getDefault());
  }
  
  @Deprecated
  private int dataStart()
  {
    finished();
    return space;
  }
  
  public static ByteBuffer growByteBuffer(ByteBuffer paramByteBuffer, ByteBufferFactory paramByteBufferFactory)
  {
    int i = paramByteBuffer.capacity();
    if ((0xC0000000 & i) == 0)
    {
      int j;
      if (i == 0) {
        j = 1;
      } else {
        j = i << 1;
      }
      paramByteBuffer.position(0);
      paramByteBufferFactory = paramByteBufferFactory.newByteBuffer(j);
      paramByteBufferFactory.position(paramByteBufferFactory.clear().capacity() - i);
      paramByteBufferFactory.put(paramByteBuffer);
      return paramByteBufferFactory;
    }
    throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
  }
  
  public static boolean isFieldPresent(Table paramTable, int paramInt)
  {
    boolean bool;
    if (paramTable.__offset(paramInt) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void Nested(int paramInt)
  {
    if (paramInt == offset()) {
      return;
    }
    throw new AssertionError("FlatBuffers: struct must be serialized inline.");
  }
  
  public void addBoolean(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((force_defaults) || (paramBoolean1 != paramBoolean2))
    {
      addBoolean(paramBoolean1);
      slot(paramInt);
    }
  }
  
  public void addBoolean(boolean paramBoolean)
  {
    prep(1, 0);
    putBoolean(paramBoolean);
  }
  
  public void addByte(byte paramByte)
  {
    prep(1, 0);
    putByte(paramByte);
  }
  
  public void addByte(int paramInt1, byte paramByte, int paramInt2)
  {
    if ((force_defaults) || (paramByte != paramInt2))
    {
      addByte(paramByte);
      slot(paramInt1);
    }
  }
  
  public void addDouble(double paramDouble)
  {
    prep(8, 0);
    putDouble(paramDouble);
  }
  
  public void addDouble(int paramInt, double paramDouble1, double paramDouble2)
  {
    if ((force_defaults) || (paramDouble1 != paramDouble2))
    {
      addDouble(paramDouble1);
      slot(paramInt);
    }
  }
  
  public void addFloat(float paramFloat)
  {
    prep(4, 0);
    putFloat(paramFloat);
  }
  
  public void addFloat(int paramInt, float paramFloat, double paramDouble)
  {
    if ((force_defaults) || (paramFloat != paramDouble))
    {
      addFloat(paramFloat);
      slot(paramInt);
    }
  }
  
  public void addInt(int paramInt)
  {
    prep(4, 0);
    putInt(paramInt);
  }
  
  public void addInt(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((force_defaults) || (paramInt2 != paramInt3))
    {
      addInt(paramInt2);
      slot(paramInt1);
    }
  }
  
  public void addLong(int paramInt, long paramLong1, long paramLong2)
  {
    if ((force_defaults) || (paramLong1 != paramLong2))
    {
      addLong(paramLong1);
      slot(paramInt);
    }
  }
  
  public void addLong(long paramLong)
  {
    prep(8, 0);
    putLong(paramLong);
  }
  
  public void addOffset(int paramInt)
  {
    prep(4, 0);
    putInt(offset() - paramInt + 4);
  }
  
  public void addOffset(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((force_defaults) || (paramInt2 != paramInt3))
    {
      addOffset(paramInt2);
      slot(paramInt1);
    }
  }
  
  public void addShort(int paramInt1, short paramShort, int paramInt2)
  {
    if ((force_defaults) || (paramShort != paramInt2))
    {
      addShort(paramShort);
      slot(paramInt1);
    }
  }
  
  public void addShort(short paramShort)
  {
    prep(2, 0);
    putShort(paramShort);
  }
  
  public void addStruct(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt2 != paramInt3)
    {
      Nested(paramInt2);
      slot(paramInt1);
    }
  }
  
  public void clear()
  {
    space = bb.capacity();
    bb.clear();
    minalign = 1;
    for (;;)
    {
      int i = vtable_in_use;
      if (i <= 0) {
        break;
      }
      int[] arrayOfInt = vtable;
      i--;
      vtable_in_use = i;
      arrayOfInt[i] = 0;
    }
    vtable_in_use = 0;
    nested = false;
    finished = false;
    object_start = 0;
    num_vtables = 0;
    vector_num_elems = 0;
  }
  
  public int createByteVector(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.remaining();
    startVector(1, i, 1);
    ByteBuffer localByteBuffer = bb;
    i = space - i;
    space = i;
    localByteBuffer.position(i);
    bb.put(paramByteBuffer);
    return endVector();
  }
  
  public int createByteVector(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    startVector(1, i, 1);
    ByteBuffer localByteBuffer = bb;
    i = space - i;
    space = i;
    localByteBuffer.position(i);
    bb.put(paramArrayOfByte);
    return endVector();
  }
  
  public int createByteVector(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    startVector(1, paramInt2, 1);
    ByteBuffer localByteBuffer = bb;
    int i = space - paramInt2;
    space = i;
    localByteBuffer.position(i);
    bb.put(paramArrayOfByte, paramInt1, paramInt2);
    return endVector();
  }
  
  public <T extends Table> int createSortedVectorOfTables(T paramT, int[] paramArrayOfInt)
  {
    paramT.sortTables(paramArrayOfInt, bb);
    return createVectorOfTables(paramArrayOfInt);
  }
  
  public int createString(CharSequence paramCharSequence)
  {
    int i = utf8.encodedLength(paramCharSequence);
    addByte((byte)0);
    startVector(1, i, 1);
    ByteBuffer localByteBuffer = bb;
    i = space - i;
    space = i;
    localByteBuffer.position(i);
    utf8.encodeUtf8(paramCharSequence, bb);
    return endVector();
  }
  
  public int createString(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.remaining();
    addByte((byte)0);
    startVector(1, i, 1);
    ByteBuffer localByteBuffer = bb;
    i = space - i;
    space = i;
    localByteBuffer.position(i);
    bb.put(paramByteBuffer);
    return endVector();
  }
  
  public ByteBuffer createUnintializedVector(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt1 * paramInt2;
    startVector(paramInt1, paramInt2, paramInt3);
    ByteBuffer localByteBuffer = bb;
    paramInt1 = space - i;
    space = paramInt1;
    localByteBuffer.position(paramInt1);
    localByteBuffer = bb.slice().order(ByteOrder.LITTLE_ENDIAN);
    localByteBuffer.limit(i);
    return localByteBuffer;
  }
  
  public int createVectorOfTables(int[] paramArrayOfInt)
  {
    notNested();
    startVector(4, paramArrayOfInt.length, 4);
    for (int i = paramArrayOfInt.length - 1; i >= 0; i--) {
      addOffset(paramArrayOfInt[i]);
    }
    return endVector();
  }
  
  public ByteBuffer dataBuffer()
  {
    finished();
    return bb;
  }
  
  public int endTable()
  {
    if ((vtable != null) && (nested))
    {
      addInt(0);
      int i = offset();
      for (int j = vtable_in_use - 1; (j >= 0) && (vtable[j] == 0); j--) {}
      int m;
      for (int k = j;; k = m - 1)
      {
        m = k;
        if (m < 0) {
          break;
        }
        k = vtable[m];
        if (k != 0) {
          k = i - k;
        } else {
          k = 0;
        }
        addShort((short)k);
      }
      addShort((short)(i - object_start));
      addShort((short)((j + 1 + 2) * 2));
      label227:
      for (j = 0; j < num_vtables; j++)
      {
        int n = bb.capacity() - vtables[j];
        int i1 = space;
        m = bb.getShort(n);
        if (m == bb.getShort(i1))
        {
          for (k = 2; k < m; k += 2) {
            if (bb.getShort(n + k) != bb.getShort(i1 + k)) {
              break label227;
            }
          }
          j = vtables[j];
          break label235;
        }
      }
      j = 0;
      label235:
      if (j != 0)
      {
        k = bb.capacity() - i;
        space = k;
        bb.putInt(k, j - i);
      }
      else
      {
        j = num_vtables;
        Object localObject = vtables;
        if (j == localObject.length) {
          vtables = Arrays.copyOf((int[])localObject, j * 2);
        }
        localObject = vtables;
        j = num_vtables;
        num_vtables = (j + 1);
        localObject[j] = offset();
        localObject = bb;
        ((ByteBuffer)localObject).putInt(((Buffer)localObject).capacity() - i, offset() - i);
      }
      nested = false;
      return i;
    }
    throw new AssertionError("FlatBuffers: endTable called without startTable");
  }
  
  public int endVector()
  {
    if (nested)
    {
      nested = false;
      putInt(vector_num_elems);
      return offset();
    }
    throw new AssertionError("FlatBuffers: endVector called without startVector");
  }
  
  public void finish(int paramInt)
  {
    finish(paramInt, false);
  }
  
  public void finish(int paramInt, String paramString)
  {
    finish(paramInt, paramString, false);
  }
  
  public void finish(int paramInt, String paramString, boolean paramBoolean)
  {
    int i = minalign;
    int j;
    if (paramBoolean) {
      j = 4;
    } else {
      j = 0;
    }
    prep(i, j + 8);
    if (paramString.length() == 4)
    {
      for (j = 3; j >= 0; j--) {
        addByte((byte)paramString.charAt(j));
      }
      finish(paramInt, paramBoolean);
      return;
    }
    throw new AssertionError("FlatBuffers: file identifier must be length 4");
  }
  
  public void finish(int paramInt, boolean paramBoolean)
  {
    int i = minalign;
    int j;
    if (paramBoolean) {
      j = 4;
    } else {
      j = 0;
    }
    prep(i, j + 4);
    addOffset(paramInt);
    if (paramBoolean) {
      addInt(bb.capacity() - space);
    }
    bb.position(space);
    finished = true;
  }
  
  public void finishSizePrefixed(int paramInt)
  {
    finish(paramInt, true);
  }
  
  public void finishSizePrefixed(int paramInt, String paramString)
  {
    finish(paramInt, paramString, true);
  }
  
  public void finished()
  {
    if (finished) {
      return;
    }
    throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
  }
  
  public FlatBufferBuilder forceDefaults(boolean paramBoolean)
  {
    force_defaults = paramBoolean;
    return this;
  }
  
  public FlatBufferBuilder init(ByteBuffer paramByteBuffer, ByteBufferFactory paramByteBufferFactory)
  {
    bb_factory = paramByteBufferFactory;
    bb = paramByteBuffer;
    paramByteBuffer.clear();
    bb.order(ByteOrder.LITTLE_ENDIAN);
    minalign = 1;
    space = bb.capacity();
    vtable_in_use = 0;
    nested = false;
    finished = false;
    object_start = 0;
    num_vtables = 0;
    vector_num_elems = 0;
    return this;
  }
  
  public void notNested()
  {
    if (!nested) {
      return;
    }
    throw new AssertionError("FlatBuffers: object serialization must not be nested.");
  }
  
  public int offset()
  {
    return bb.capacity() - space;
  }
  
  public void pad(int paramInt)
  {
    for (int i = 0; i < paramInt; i++)
    {
      ByteBuffer localByteBuffer = bb;
      int j = space - 1;
      space = j;
      localByteBuffer.put(j, (byte)0);
    }
  }
  
  public void prep(int paramInt1, int paramInt2)
  {
    if (paramInt1 > minalign) {
      minalign = paramInt1;
    }
    int i = bb.capacity() - space + paramInt2 + 1 & paramInt1 - 1;
    while (space < i + paramInt1 + paramInt2)
    {
      int j = bb.capacity();
      ByteBuffer localByteBuffer1 = bb;
      ByteBuffer localByteBuffer2 = growByteBuffer(localByteBuffer1, bb_factory);
      bb = localByteBuffer2;
      if (localByteBuffer1 != localByteBuffer2) {
        bb_factory.releaseByteBuffer(localByteBuffer1);
      }
      int k = space;
      space = (bb.capacity() - j + k);
    }
    pad(i);
  }
  
  public void putBoolean(boolean paramBoolean)
  {
    ByteBuffer localByteBuffer = bb;
    int i = space - 1;
    space = i;
    localByteBuffer.put(i, (byte)paramBoolean);
  }
  
  public void putByte(byte paramByte)
  {
    ByteBuffer localByteBuffer = bb;
    int i = space - 1;
    space = i;
    localByteBuffer.put(i, paramByte);
  }
  
  public void putDouble(double paramDouble)
  {
    ByteBuffer localByteBuffer = bb;
    int i = space - 8;
    space = i;
    localByteBuffer.putDouble(i, paramDouble);
  }
  
  public void putFloat(float paramFloat)
  {
    ByteBuffer localByteBuffer = bb;
    int i = space - 4;
    space = i;
    localByteBuffer.putFloat(i, paramFloat);
  }
  
  public void putInt(int paramInt)
  {
    ByteBuffer localByteBuffer = bb;
    int i = space - 4;
    space = i;
    localByteBuffer.putInt(i, paramInt);
  }
  
  public void putLong(long paramLong)
  {
    ByteBuffer localByteBuffer = bb;
    int i = space - 8;
    space = i;
    localByteBuffer.putLong(i, paramLong);
  }
  
  public void putShort(short paramShort)
  {
    ByteBuffer localByteBuffer = bb;
    int i = space - 2;
    space = i;
    localByteBuffer.putShort(i, paramShort);
  }
  
  public void required(int paramInt1, int paramInt2)
  {
    paramInt1 = bb.capacity() - paramInt1;
    int i = bb.getInt(paramInt1);
    if (bb.getShort(paramInt1 - i + paramInt2) != 0) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    }
    if (paramInt1 != 0) {
      return;
    }
    throw new AssertionError(a.g("FlatBuffers: field ", paramInt2, " must be set"));
  }
  
  public byte[] sizedByteArray()
  {
    return sizedByteArray(space, bb.capacity() - space);
  }
  
  public byte[] sizedByteArray(int paramInt1, int paramInt2)
  {
    finished();
    byte[] arrayOfByte = new byte[paramInt2];
    bb.position(paramInt1);
    bb.get(arrayOfByte);
    return arrayOfByte;
  }
  
  public InputStream sizedInputStream()
  {
    finished();
    ByteBuffer localByteBuffer = bb.duplicate();
    localByteBuffer.position(space);
    localByteBuffer.limit(bb.capacity());
    return new ByteBufferBackedInputStream(localByteBuffer);
  }
  
  public void slot(int paramInt)
  {
    vtable[paramInt] = offset();
  }
  
  public void startTable(int paramInt)
  {
    notNested();
    int[] arrayOfInt = vtable;
    if ((arrayOfInt == null) || (arrayOfInt.length < paramInt)) {
      vtable = new int[paramInt];
    }
    vtable_in_use = paramInt;
    Arrays.fill(vtable, 0, paramInt, 0);
    nested = true;
    object_start = offset();
  }
  
  public void startVector(int paramInt1, int paramInt2, int paramInt3)
  {
    notNested();
    vector_num_elems = paramInt2;
    paramInt1 *= paramInt2;
    prep(4, paramInt1);
    prep(paramInt3, paramInt1);
    nested = true;
  }
  
  public static class ByteBufferBackedInputStream
    extends InputStream
  {
    public ByteBuffer buf;
    
    public ByteBufferBackedInputStream(ByteBuffer paramByteBuffer)
    {
      buf = paramByteBuffer;
    }
    
    public int read()
      throws IOException
    {
      try
      {
        int i = buf.get();
        return i & 0xFF;
      }
      catch (BufferUnderflowException localBufferUnderflowException) {}
      return -1;
    }
  }
  
  public static abstract class ByteBufferFactory
  {
    public abstract ByteBuffer newByteBuffer(int paramInt);
    
    public void releaseByteBuffer(ByteBuffer paramByteBuffer) {}
  }
  
  public static final class HeapByteBufferFactory
    extends FlatBufferBuilder.ByteBufferFactory
  {
    public static final HeapByteBufferFactory INSTANCE = new HeapByteBufferFactory();
    
    public ByteBuffer newByteBuffer(int paramInt)
    {
      return ByteBuffer.allocate(paramInt).order(ByteOrder.LITTLE_ENDIAN);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.FlatBufferBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */