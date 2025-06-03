package androidx.emoji2.text.flatbuffer;

import java.nio.charset.StandardCharsets;

public class FlexBuffers$Map
  extends FlexBuffers.Vector
{
  private static final Map EMPTY_MAP = new Map(FlexBuffers.access$000(), 1, 1);
  
  public FlexBuffers$Map(ReadBuf paramReadBuf, int paramInt1, int paramInt2)
  {
    super(paramReadBuf, paramInt1, paramInt2);
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

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.FlexBuffers.Map
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */