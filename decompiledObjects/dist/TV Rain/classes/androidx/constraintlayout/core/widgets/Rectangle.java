package androidx.constraintlayout.core.widgets;

public class Rectangle
{
  public int height;
  public int width;
  public int x;
  public int y;
  
  public boolean contains(int paramInt1, int paramInt2)
  {
    int i = x;
    if ((paramInt1 >= i) && (paramInt1 < i + width))
    {
      paramInt1 = y;
      if ((paramInt2 >= paramInt1) && (paramInt2 < paramInt1 + height))
      {
        bool = true;
        break label49;
      }
    }
    boolean bool = false;
    label49:
    return bool;
  }
  
  public int getCenterX()
  {
    return (x + width) / 2;
  }
  
  public int getCenterY()
  {
    return (y + height) / 2;
  }
  
  public void grow(int paramInt1, int paramInt2)
  {
    x -= paramInt1;
    y -= paramInt2;
    width = (paramInt1 * 2 + width);
    height = (paramInt2 * 2 + height);
  }
  
  public boolean intersects(Rectangle paramRectangle)
  {
    int i = x;
    int j = x;
    if ((i >= j) && (i < j + width))
    {
      j = y;
      i = y;
      if ((j >= i) && (j < i + height))
      {
        bool = true;
        break label59;
      }
    }
    boolean bool = false;
    label59:
    return bool;
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    x = paramInt1;
    y = paramInt2;
    width = paramInt3;
    height = paramInt4;
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.widgets.Rectangle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */