package androidx.emoji2.text.flatbuffer;

public class FlexBuffers$Vector
  extends FlexBuffers.Sized
{
  private static final Vector EMPTY_VECTOR = new Vector(FlexBuffers.access$000(), 1, 1);
  
  public FlexBuffers$Vector(ReadBuf paramReadBuf, int paramInt1, int paramInt2)
  {
    super(paramReadBuf, paramInt1, paramInt2);
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

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.FlexBuffers.Vector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */