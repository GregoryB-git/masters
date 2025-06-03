package androidx.recyclerview.widget;

class DiffUtil$Range
{
  public int newListEnd;
  public int newListStart;
  public int oldListEnd;
  public int oldListStart;
  
  public DiffUtil$Range() {}
  
  public DiffUtil$Range(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    oldListStart = paramInt1;
    oldListEnd = paramInt2;
    newListStart = paramInt3;
    newListEnd = paramInt4;
  }
  
  public int newSize()
  {
    return newListEnd - newListStart;
  }
  
  public int oldSize()
  {
    return oldListEnd - oldListStart;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.DiffUtil.Range
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */