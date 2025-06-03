package androidx.recyclerview.widget;

class DiffUtil$PostponedUpdate
{
  public int currentPos;
  public int posInOwnerList;
  public boolean removal;
  
  public DiffUtil$PostponedUpdate(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    posInOwnerList = paramInt1;
    currentPos = paramInt2;
    removal = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.DiffUtil.PostponedUpdate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */