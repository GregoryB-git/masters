package androidx.recyclerview.widget;

import androidx.annotation.NonNull;

class DiffUtil$Snake
{
  public int endX;
  public int endY;
  public boolean reverse;
  public int startX;
  public int startY;
  
  public int diagonalSize()
  {
    return Math.min(endX - startX, endY - startY);
  }
  
  public boolean hasAdditionOrRemoval()
  {
    boolean bool;
    if (endY - startY != endX - startX) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isAddition()
  {
    boolean bool;
    if (endY - startY > endX - startX) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @NonNull
  public DiffUtil.Diagonal toDiagonal()
  {
    if (hasAdditionOrRemoval())
    {
      if (reverse) {
        return new DiffUtil.Diagonal(startX, startY, diagonalSize());
      }
      if (isAddition()) {
        return new DiffUtil.Diagonal(startX, startY + 1, diagonalSize());
      }
      return new DiffUtil.Diagonal(startX + 1, startY, diagonalSize());
    }
    int i = startX;
    return new DiffUtil.Diagonal(i, startY, endX - i);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.DiffUtil.Snake
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */