package androidx.emoji2.text.flatbuffer;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import z2;

public class FlexBuffers
{
  private static final ReadBuf EMPTY_BB = new ArrayReadWriteBuf(new byte[] { 0 }, 1);
  public static final int FBT_BLOB = 25;
  public static final int FBT_BOOL = 26;
  public static final int FBT_FLOAT = 3;
  public static final int FBT_INDIRECT_FLOAT = 8;
  public static final int FBT_INDIRECT_INT = 6;
  public static final int FBT_INDIRECT_UINT = 7;
  public static final int FBT_INT = 1;
  public static final int FBT_KEY = 4;
  public static final int FBT_MAP = 9;
  public static final int FBT_NULL = 0;
  public static final int FBT_STRING = 5;
  public static final int FBT_UINT = 2;
  public static final int FBT_VECTOR = 10;
  public static final int FBT_VECTOR_BOOL = 36;
  public static final int FBT_VECTOR_FLOAT = 13;
  public static final int FBT_VECTOR_FLOAT2 = 18;
  public static final int FBT_VECTOR_FLOAT3 = 21;
  public static final int FBT_VECTOR_FLOAT4 = 24;
  public static final int FBT_VECTOR_INT = 11;
  public static final int FBT_VECTOR_INT2 = 16;
  public static final int FBT_VECTOR_INT3 = 19;
  public static final int FBT_VECTOR_INT4 = 22;
  public static final int FBT_VECTOR_KEY = 14;
  public static final int FBT_VECTOR_STRING_DEPRECATED = 15;
  public static final int FBT_VECTOR_UINT = 12;
  public static final int FBT_VECTOR_UINT2 = 17;
  public static final int FBT_VECTOR_UINT3 = 20;
  public static final int FBT_VECTOR_UINT4 = 23;
  
  public static Reference getRoot(ReadBuf paramReadBuf)
  {
    int i = paramReadBuf.limit() - 1;
    int j = paramReadBuf.get(i);
    i--;
    return new Reference(paramReadBuf, i - j, j, Unsigned.byteToUnsignedInt(paramReadBuf.get(i)));
  }
  
  @Deprecated
  public static Reference getRoot(ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer.hasArray()) {
      paramByteBuffer = new ArrayReadWriteBuf(paramByteBuffer.array(), paramByteBuffer.limit());
    } else {
      paramByteBuffer = new ByteBufferReadWriteBuf(paramByteBuffer);
    }
    return getRoot(paramByteBuffer);
  }
  
  private static int indirect(ReadBuf paramReadBuf, int paramInt1, int paramInt2)
  {
    return (int)(paramInt1 - readUInt(paramReadBuf, paramInt1, paramInt2));
  }
  
  public static boolean isTypeInline(int paramInt)
  {
    boolean bool;
    if ((paramInt > 3) && (paramInt != 26)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static boolean isTypedVector(int paramInt)
  {
    boolean bool;
    if (((paramInt >= 11) && (paramInt <= 15)) || (paramInt == 36)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean isTypedVectorElementType(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramInt >= 1)
    {
      bool2 = bool1;
      if (paramInt <= 4) {}
    }
    else if (paramInt == 26)
    {
      bool2 = bool1;
    }
    else
    {
      bool2 = false;
    }
    return bool2;
  }
  
  private static double readDouble(ReadBuf paramReadBuf, int paramInt1, int paramInt2)
  {
    if (paramInt2 != 4)
    {
      if (paramInt2 != 8) {
        return -1.0D;
      }
      return paramReadBuf.getDouble(paramInt1);
    }
    return paramReadBuf.getFloat(paramInt1);
  }
  
  private static int readInt(ReadBuf paramReadBuf, int paramInt1, int paramInt2)
  {
    return (int)readLong(paramReadBuf, paramInt1, paramInt2);
  }
  
  private static long readLong(ReadBuf paramReadBuf, int paramInt1, int paramInt2)
  {
    if (paramInt2 != 1) {
      if (paramInt2 != 2)
      {
        if (paramInt2 != 4)
        {
          if (paramInt2 != 8) {
            return -1L;
          }
          return paramReadBuf.getLong(paramInt1);
        }
        paramInt1 = paramReadBuf.getInt(paramInt1);
      }
    }
    for (;;)
    {
      return paramInt1;
      paramInt1 = paramReadBuf.getShort(paramInt1);
      continue;
      paramInt1 = paramReadBuf.get(paramInt1);
    }
  }
  
  private static long readUInt(ReadBuf paramReadBuf, int paramInt1, int paramInt2)
  {
    if (paramInt2 != 1)
    {
      if (paramInt2 != 2)
      {
        if (paramInt2 != 4)
        {
          if (paramInt2 != 8) {
            return -1L;
          }
          return paramReadBuf.getLong(paramInt1);
        }
        return Unsigned.intToUnsignedLong(paramReadBuf.getInt(paramInt1));
      }
      return Unsigned.shortToUnsignedInt(paramReadBuf.getShort(paramInt1));
    }
    return Unsigned.byteToUnsignedInt(paramReadBuf.get(paramInt1));
  }
  
  public static int toTypedVector(int paramInt1, int paramInt2)
  {
    if (paramInt2 != 0)
    {
      if (paramInt2 != 2)
      {
        if (paramInt2 != 3)
        {
          if (paramInt2 != 4) {
            return 0;
          }
          return paramInt1 - 1 + 22;
        }
        return paramInt1 - 1 + 19;
      }
      return paramInt1 - 1 + 16;
    }
    return paramInt1 - 1 + 11;
  }
  
  public static int toTypedVectorElementType(int paramInt)
  {
    return paramInt - 11 + 1;
  }
  
  public static class Blob
    extends FlexBuffers.Sized
  {
    public static final Blob EMPTY = new Blob(FlexBuffers.access$000(), 1, 1);
    
    public Blob(ReadBuf paramReadBuf, int paramInt1, int paramInt2)
    {
      super(paramInt1, paramInt2);
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
  
  public static class FlexBufferException
    extends RuntimeException
  {
    public FlexBufferException(String paramString)
    {
      super();
    }
  }
  
  public static class Key
    extends FlexBuffers.Object
  {
    private static final Key EMPTY = new Key(FlexBuffers.access$000(), 0, 0);
    
    public Key(ReadBuf paramReadBuf, int paramInt1, int paramInt2)
    {
      super(paramInt1, paramInt2);
    }
    
    public static Key empty()
    {
      return EMPTY;
    }
    
    public int compareTo(byte[] paramArrayOfByte)
    {
      int i = end;
      int j = 0;
      int k;
      int m;
      do
      {
        k = bb.get(i);
        m = paramArrayOfByte[j];
        if (k == 0) {
          return k - m;
        }
        i++;
        j++;
        if (j == paramArrayOfByte.length) {
          return k - m;
        }
      } while (k == m);
      return k - m;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof Key;
      boolean bool2 = false;
      if (!bool1) {
        return false;
      }
      paramObject = (Key)paramObject;
      bool1 = bool2;
      if (end == end)
      {
        bool1 = bool2;
        if (byteWidth == byteWidth) {
          bool1 = true;
        }
      }
      return bool1;
    }
    
    public int hashCode()
    {
      return end ^ byteWidth;
    }
    
    public String toString()
    {
      for (int i = end;; i++) {
        if (bb.get(i) == 0)
        {
          int j = end;
          return bb.getString(j, i - j);
        }
      }
    }
    
    public StringBuilder toString(StringBuilder paramStringBuilder)
    {
      paramStringBuilder.append(toString());
      return paramStringBuilder;
    }
  }
  
  public static class KeyVector
  {
    private final FlexBuffers.TypedVector vec;
    
    public KeyVector(FlexBuffers.TypedVector paramTypedVector)
    {
      vec = paramTypedVector;
    }
    
    public FlexBuffers.Key get(int paramInt)
    {
      if (paramInt >= size()) {
        return FlexBuffers.Key.access$700();
      }
      FlexBuffers.TypedVector localTypedVector = vec;
      int i = end;
      int j = byteWidth;
      localTypedVector = vec;
      ReadBuf localReadBuf = bb;
      return new FlexBuffers.Key(localReadBuf, FlexBuffers.access$200(localReadBuf, paramInt * j + i, byteWidth), 1);
    }
    
    public int size()
    {
      return vec.size();
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append('[');
      for (int i = 0; i < vec.size(); i++)
      {
        vec.get(i).toString(localStringBuilder);
        if (i != vec.size() - 1) {
          localStringBuilder.append(", ");
        }
      }
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
  }
  
  public static class Map
    extends FlexBuffers.Vector
  {
    private static final Map EMPTY_MAP = new Map(FlexBuffers.access$000(), 1, 1);
    
    public Map(ReadBuf paramReadBuf, int paramInt1, int paramInt2)
    {
      super(paramInt1, paramInt2);
    }
    
    private int binarySearch(FlexBuffers.KeyVector paramKeyVector, byte[] paramArrayOfByte)
    {
      int i = paramKeyVector.size() - 1;
      int j = 0;
      while (j <= i)
      {
        int k = j + i >>> 1;
        int m = paramKeyVector.get(k).compareTo(paramArrayOfByte);
        if (m < 0) {
          j = k + 1;
        } else if (m > 0) {
          i = k - 1;
        } else {
          return k;
        }
      }
      return -(j + 1);
    }
    
    public static Map empty()
    {
      return EMPTY_MAP;
    }
    
    public FlexBuffers.Reference get(String paramString)
    {
      return get(paramString.getBytes(StandardCharsets.UTF_8));
    }
    
    public FlexBuffers.Reference get(byte[] paramArrayOfByte)
    {
      FlexBuffers.KeyVector localKeyVector = keys();
      int i = localKeyVector.size();
      int j = binarySearch(localKeyVector, paramArrayOfByte);
      if ((j >= 0) && (j < i)) {
        return get(j);
      }
      return FlexBuffers.Reference.access$600();
    }
    
    public FlexBuffers.KeyVector keys()
    {
      int i = end - byteWidth * 3;
      ReadBuf localReadBuf1 = bb;
      int j = FlexBuffers.access$200(localReadBuf1, i, byteWidth);
      ReadBuf localReadBuf2 = bb;
      int k = byteWidth;
      return new FlexBuffers.KeyVector(new FlexBuffers.TypedVector(localReadBuf1, j, FlexBuffers.access$100(localReadBuf2, i + k, k), 4));
    }
    
    public StringBuilder toString(StringBuilder paramStringBuilder)
    {
      paramStringBuilder.append("{ ");
      FlexBuffers.KeyVector localKeyVector = keys();
      int i = size();
      FlexBuffers.Vector localVector = values();
      for (int j = 0; j < i; j++)
      {
        paramStringBuilder.append('"');
        paramStringBuilder.append(localKeyVector.get(j).toString());
        paramStringBuilder.append("\" : ");
        paramStringBuilder.append(localVector.get(j).toString());
        if (j != i - 1) {
          paramStringBuilder.append(", ");
        }
      }
      paramStringBuilder.append(" }");
      return paramStringBuilder;
    }
    
    public FlexBuffers.Vector values()
    {
      return new FlexBuffers.Vector(bb, end, byteWidth);
    }
  }
  
  public static abstract class Object
  {
    public ReadBuf bb;
    public int byteWidth;
    public int end;
    
    public Object(ReadBuf paramReadBuf, int paramInt1, int paramInt2)
    {
      bb = paramReadBuf;
      end = paramInt1;
      byteWidth = paramInt2;
    }
    
    public String toString()
    {
      return toString(new StringBuilder(128)).toString();
    }
    
    public abstract StringBuilder toString(StringBuilder paramStringBuilder);
  }
  
  public static class Reference
  {
    private static final Reference NULL_REFERENCE = new Reference(FlexBuffers.access$000(), 0, 1, 0);
    private ReadBuf bb;
    private int byteWidth;
    private int end;
    private int parentWidth;
    private int type;
    
    public Reference(ReadBuf paramReadBuf, int paramInt1, int paramInt2, int paramInt3)
    {
      this(paramReadBuf, paramInt1, paramInt2, 1 << (paramInt3 & 0x3), paramInt3 >> 2);
    }
    
    public Reference(ReadBuf paramReadBuf, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      bb = paramReadBuf;
      end = paramInt1;
      parentWidth = paramInt2;
      byteWidth = paramInt3;
      type = paramInt4;
    }
    
    public FlexBuffers.Blob asBlob()
    {
      if ((!isBlob()) && (!isString())) {
        return FlexBuffers.Blob.empty();
      }
      ReadBuf localReadBuf = bb;
      return new FlexBuffers.Blob(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth);
    }
    
    public boolean asBoolean()
    {
      boolean bool1 = isBoolean();
      boolean bool2 = true;
      boolean bool3 = true;
      if (bool1)
      {
        if (bb.get(end) == 0) {
          bool3 = false;
        }
        return bool3;
      }
      if (asUInt() != 0L) {
        bool3 = bool2;
      } else {
        bool3 = false;
      }
      return bool3;
    }
    
    public double asFloat()
    {
      int i = type;
      if (i == 3) {
        return FlexBuffers.access$400(bb, end, parentWidth);
      }
      if (i != 1)
      {
        if (i != 2) {
          if (i != 5)
          {
            ReadBuf localReadBuf;
            if (i != 6)
            {
              if (i != 7)
              {
                if (i != 8)
                {
                  if (i != 10)
                  {
                    if (i != 26) {
                      return 0.0D;
                    }
                  }
                  else {
                    return asVector().size();
                  }
                }
                else
                {
                  localReadBuf = bb;
                  return FlexBuffers.access$400(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth);
                }
              }
              else
              {
                localReadBuf = bb;
                return FlexBuffers.access$300(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth);
              }
            }
            else
            {
              localReadBuf = bb;
              return FlexBuffers.access$100(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth);
            }
          }
          else
          {
            return Double.parseDouble(asString());
          }
        }
        return FlexBuffers.access$300(bb, end, parentWidth);
      }
      return FlexBuffers.access$100(bb, end, parentWidth);
    }
    
    public int asInt()
    {
      int i = type;
      if (i == 1) {
        return FlexBuffers.access$100(bb, end, parentWidth);
      }
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 5)
          {
            if (i != 6)
            {
              if (i != 7)
              {
                if (i != 8)
                {
                  if (i != 10)
                  {
                    if (i != 26) {
                      return 0;
                    }
                    return FlexBuffers.access$100(bb, end, parentWidth);
                  }
                  return asVector().size();
                }
                localReadBuf = bb;
                return (int)FlexBuffers.access$400(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth);
              }
              localReadBuf = bb;
              return (int)FlexBuffers.access$300(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), parentWidth);
            }
            ReadBuf localReadBuf = bb;
            return FlexBuffers.access$100(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth);
          }
          return Integer.parseInt(asString());
        }
        return (int)FlexBuffers.access$400(bb, end, parentWidth);
      }
      return (int)FlexBuffers.access$300(bb, end, parentWidth);
    }
    
    public FlexBuffers.Key asKey()
    {
      if (isKey())
      {
        ReadBuf localReadBuf = bb;
        return new FlexBuffers.Key(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth);
      }
      return FlexBuffers.Key.empty();
    }
    
    public long asLong()
    {
      int i = type;
      if (i == 1) {
        return FlexBuffers.access$500(bb, end, parentWidth);
      }
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 5)
          {
            if (i != 6)
            {
              if (i != 7)
              {
                if (i != 8)
                {
                  if (i != 10)
                  {
                    if (i != 26) {
                      return 0L;
                    }
                    return FlexBuffers.access$100(bb, end, parentWidth);
                  }
                  return asVector().size();
                }
                localReadBuf = bb;
                return FlexBuffers.access$400(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth);
              }
              localReadBuf = bb;
              return FlexBuffers.access$300(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), parentWidth);
            }
            ReadBuf localReadBuf = bb;
            return FlexBuffers.access$500(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth);
          }
          try
          {
            long l = Long.parseLong(asString());
            return l;
          }
          catch (NumberFormatException localNumberFormatException)
          {
            return 0L;
          }
        }
        return FlexBuffers.access$400(bb, end, parentWidth);
      }
      return FlexBuffers.access$300(bb, end, parentWidth);
    }
    
    public FlexBuffers.Map asMap()
    {
      if (isMap())
      {
        ReadBuf localReadBuf = bb;
        return new FlexBuffers.Map(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth);
      }
      return FlexBuffers.Map.empty();
    }
    
    public String asString()
    {
      int i;
      int j;
      if (isString())
      {
        i = FlexBuffers.access$200(bb, end, parentWidth);
        ReadBuf localReadBuf = bb;
        j = byteWidth;
        j = (int)FlexBuffers.access$300(localReadBuf, i - j, j);
        return bb.getString(i, j);
      }
      if (isKey())
      {
        j = FlexBuffers.access$200(bb, end, byteWidth);
        for (i = j;; i++) {
          if (bb.get(i) == 0) {
            return bb.getString(j, i - j);
          }
        }
      }
      return "";
    }
    
    public long asUInt()
    {
      int i = type;
      if (i == 2) {
        return FlexBuffers.access$300(bb, end, parentWidth);
      }
      if (i != 1)
      {
        if (i != 3)
        {
          if (i != 10)
          {
            if (i != 26)
            {
              if (i != 5)
              {
                if (i != 6)
                {
                  if (i != 7)
                  {
                    if (i != 8) {
                      return 0L;
                    }
                    localReadBuf = bb;
                    return FlexBuffers.access$400(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), parentWidth);
                  }
                  localReadBuf = bb;
                  return FlexBuffers.access$300(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth);
                }
                ReadBuf localReadBuf = bb;
                return FlexBuffers.access$500(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth);
              }
              return Long.parseLong(asString());
            }
            return FlexBuffers.access$100(bb, end, parentWidth);
          }
          return asVector().size();
        }
        return FlexBuffers.access$400(bb, end, parentWidth);
      }
      return FlexBuffers.access$500(bb, end, parentWidth);
    }
    
    public FlexBuffers.Vector asVector()
    {
      ReadBuf localReadBuf;
      if (isVector())
      {
        localReadBuf = bb;
        return new FlexBuffers.Vector(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth);
      }
      int i = type;
      if (i == 15)
      {
        localReadBuf = bb;
        return new FlexBuffers.TypedVector(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth, 4);
      }
      if (FlexBuffers.isTypedVector(i))
      {
        localReadBuf = bb;
        return new FlexBuffers.TypedVector(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth, FlexBuffers.toTypedVectorElementType(type));
      }
      return FlexBuffers.Vector.empty();
    }
    
    public int getType()
    {
      return type;
    }
    
    public boolean isBlob()
    {
      boolean bool;
      if (type == 25) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean isBoolean()
    {
      boolean bool;
      if (type == 26) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean isFloat()
    {
      int i = type;
      boolean bool;
      if ((i != 3) && (i != 8)) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public boolean isInt()
    {
      int i = type;
      boolean bool1 = true;
      boolean bool2 = bool1;
      if (i != 1) {
        if (i == 6) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
      }
      return bool2;
    }
    
    public boolean isIntOrUInt()
    {
      boolean bool;
      if ((!isInt()) && (!isUInt())) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public boolean isKey()
    {
      boolean bool;
      if (type == 4) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean isMap()
    {
      boolean bool;
      if (type == 9) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean isNull()
    {
      boolean bool;
      if (type == 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean isNumeric()
    {
      boolean bool;
      if ((!isIntOrUInt()) && (!isFloat())) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public boolean isString()
    {
      boolean bool;
      if (type == 5) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean isTypedVector()
    {
      return FlexBuffers.isTypedVector(type);
    }
    
    public boolean isUInt()
    {
      int i = type;
      boolean bool;
      if ((i != 2) && (i != 7)) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public boolean isVector()
    {
      int i = type;
      boolean bool;
      if ((i != 10) && (i != 9)) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public String toString()
    {
      return toString(new StringBuilder(128)).toString();
    }
    
    public StringBuilder toString(StringBuilder paramStringBuilder)
    {
      int i = type;
      if (i != 36) {
        switch (i)
        {
        default: 
          return paramStringBuilder;
        case 26: 
          paramStringBuilder.append(asBoolean());
          return paramStringBuilder;
        case 25: 
          return asBlob().toString(paramStringBuilder);
        case 16: 
        case 17: 
        case 18: 
        case 19: 
        case 20: 
        case 21: 
        case 22: 
        case 23: 
        case 24: 
          paramStringBuilder = z2.t("not_implemented:");
          paramStringBuilder.append(type);
          throw new FlexBuffers.FlexBufferException(paramStringBuilder.toString());
        case 10: 
          return asVector().toString(paramStringBuilder);
        case 9: 
          return asMap().toString(paramStringBuilder);
        case 5: 
          paramStringBuilder.append('"');
          paramStringBuilder.append(asString());
          paramStringBuilder.append('"');
          return paramStringBuilder;
        case 4: 
          FlexBuffers.Key localKey = asKey();
          paramStringBuilder.append('"');
          paramStringBuilder = localKey.toString(paramStringBuilder);
          paramStringBuilder.append('"');
          return paramStringBuilder;
        case 3: 
        case 8: 
          paramStringBuilder.append(asFloat());
          return paramStringBuilder;
        case 2: 
        case 7: 
          paramStringBuilder.append(asUInt());
          return paramStringBuilder;
        case 1: 
        case 6: 
          paramStringBuilder.append(asLong());
          return paramStringBuilder;
        case 0: 
          paramStringBuilder.append("null");
          return paramStringBuilder;
        }
      }
      paramStringBuilder.append(asVector());
      return paramStringBuilder;
    }
  }
  
  public static abstract class Sized
    extends FlexBuffers.Object
  {
    public final int size;
    
    public Sized(ReadBuf paramReadBuf, int paramInt1, int paramInt2)
    {
      super(paramInt1, paramInt2);
      size = FlexBuffers.access$100(bb, paramInt1 - paramInt2, paramInt2);
    }
    
    public int size()
    {
      return size;
    }
  }
  
  public static class TypedVector
    extends FlexBuffers.Vector
  {
    private static final TypedVector EMPTY_VECTOR = new TypedVector(FlexBuffers.access$000(), 1, 1, 1);
    private final int elemType;
    
    public TypedVector(ReadBuf paramReadBuf, int paramInt1, int paramInt2, int paramInt3)
    {
      super(paramInt1, paramInt2);
      elemType = paramInt3;
    }
    
    public static TypedVector empty()
    {
      return EMPTY_VECTOR;
    }
    
    public FlexBuffers.Reference get(int paramInt)
    {
      if (paramInt >= size()) {
        return FlexBuffers.Reference.access$600();
      }
      int i = end;
      int j = byteWidth;
      return new FlexBuffers.Reference(bb, paramInt * j + i, byteWidth, 1, elemType);
    }
    
    public int getElemType()
    {
      return elemType;
    }
    
    public boolean isEmptyVector()
    {
      boolean bool;
      if (this == EMPTY_VECTOR) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public static class Unsigned
  {
    public static int byteToUnsignedInt(byte paramByte)
    {
      return paramByte & 0xFF;
    }
    
    public static long intToUnsignedLong(int paramInt)
    {
      return paramInt & 0xFFFFFFFF;
    }
    
    public static int shortToUnsignedInt(short paramShort)
    {
      return paramShort & 0xFFFF;
    }
  }
  
  public static class Vector
    extends FlexBuffers.Sized
  {
    private static final Vector EMPTY_VECTOR = new Vector(FlexBuffers.access$000(), 1, 1);
    
    public Vector(ReadBuf paramReadBuf, int paramInt1, int paramInt2)
    {
      super(paramInt1, paramInt2);
    }
    
    public static Vector empty()
    {
      return EMPTY_VECTOR;
    }
    
    public FlexBuffers.Reference get(int paramInt)
    {
      long l1 = size();
      long l2 = paramInt;
      if (l2 >= l1) {
        return FlexBuffers.Reference.access$600();
      }
      ReadBuf localReadBuf = bb;
      long l3 = end;
      int i = FlexBuffers.Unsigned.byteToUnsignedInt(localReadBuf.get((int)(l1 * byteWidth + l3 + l2)));
      int j = end;
      int k = byteWidth;
      return new FlexBuffers.Reference(bb, paramInt * k + j, byteWidth, i);
    }
    
    public boolean isEmpty()
    {
      boolean bool;
      if (this == EMPTY_VECTOR) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public StringBuilder toString(StringBuilder paramStringBuilder)
    {
      paramStringBuilder.append("[ ");
      int i = size();
      for (int j = 0; j < i; j++)
      {
        get(j).toString(paramStringBuilder);
        if (j != i - 1) {
          paramStringBuilder.append(", ");
        }
      }
      paramStringBuilder.append(" ]");
      return paramStringBuilder;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.FlexBuffers
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */