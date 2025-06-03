package androidx.emoji2.text.flatbuffer;

abstract class FlexBuffers$Sized
  extends FlexBuffers.Object
{
  public final int size;
  
  public FlexBuffers$Sized(ReadBuf paramReadBuf, int paramInt1, int paramInt2)
  {
    super(paramReadBuf, paramInt1, paramInt2);
    size = FlexBuffers.access$100(bb, paramInt1 - paramInt2, paramInt2);
  }
  
  public int size()
  {
    return size;
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.FlexBuffers.Sized
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */