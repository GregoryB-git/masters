package androidx.recyclerview.widget;

class DiffUtil$Diagonal
{
  public final int size;
  public final int x;
  public final int y;
  
  public DiffUtil$Diagonal(int paramInt1, int paramInt2, int paramInt3)
  {
    x = paramInt1;
    y = paramInt2;
    size = paramInt3;
  }
  
  public int endX()
  {
    return x + size;
  }
  
  public int endY()
  {
    return y + size;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.DiffUtil.Diagonal
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */