package androidx.emoji2.text.flatbuffer;

public class FlexBuffers$KeyVector
{
  private final FlexBuffers.TypedVector vec;
  
  public FlexBuffers$KeyVector(FlexBuffers.TypedVector paramTypedVector)
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

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.FlexBuffers.KeyVector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */