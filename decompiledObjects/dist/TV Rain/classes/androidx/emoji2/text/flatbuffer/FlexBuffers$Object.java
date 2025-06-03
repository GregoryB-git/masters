package androidx.emoji2.text.flatbuffer;

abstract class FlexBuffers$Object
{
  public ReadBuf bb;
  public int byteWidth;
  public int end;
  
  public FlexBuffers$Object(ReadBuf paramReadBuf, int paramInt1, int paramInt2)
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

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.FlexBuffers.Object
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */