package androidx.recyclerview.widget;

import a;
import z2;

class DefaultItemAnimator$ChangeInfo
{
  public int fromX;
  public int fromY;
  public RecyclerView.ViewHolder newHolder;
  public RecyclerView.ViewHolder oldHolder;
  public int toX;
  public int toY;
  
  private DefaultItemAnimator$ChangeInfo(RecyclerView.ViewHolder paramViewHolder1, RecyclerView.ViewHolder paramViewHolder2)
  {
    oldHolder = paramViewHolder1;
    newHolder = paramViewHolder2;
  }
  
  public DefaultItemAnimator$ChangeInfo(RecyclerView.ViewHolder paramViewHolder1, RecyclerView.ViewHolder paramViewHolder2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this(paramViewHolder1, paramViewHolder2);
    fromX = paramInt1;
    fromY = paramInt2;
    toX = paramInt3;
    toY = paramInt4;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("ChangeInfo{oldHolder=");
    localStringBuilder.append(oldHolder);
    localStringBuilder.append(", newHolder=");
    localStringBuilder.append(newHolder);
    localStringBuilder.append(", fromX=");
    localStringBuilder.append(fromX);
    localStringBuilder.append(", fromY=");
    localStringBuilder.append(fromY);
    localStringBuilder.append(", toX=");
    localStringBuilder.append(toX);
    localStringBuilder.append(", toY=");
    return a.n(localStringBuilder, toY, '}');
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.DefaultItemAnimator.ChangeInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */