package androidx.emoji2.text.flatbuffer;

public class FlexBuffers$TypedVector
  extends FlexBuffers.Vector
{
  private static final TypedVector EMPTY_VECTOR = new TypedVector(FlexBuffers.access$000(), 1, 1, 1);
  private final int elemType;
  
  public FlexBuffers$TypedVector(ReadBuf paramReadBuf, int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramReadBuf, paramInt1, paramInt2);
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

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.FlexBuffers.TypedVector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */