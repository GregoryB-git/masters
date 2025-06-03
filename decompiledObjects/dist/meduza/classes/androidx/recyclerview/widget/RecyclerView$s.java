package androidx.recyclerview.widget;

public final class RecyclerView$s
{
  public int a = 0;
  public int b = 0;
  public boolean c = false;
  public boolean d = false;
  public boolean e = false;
  public boolean f = false;
  
  public final int a()
  {
    int i;
    if (d) {
      i = a - b;
    } else {
      i = 0;
    }
    return i;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("State{mTargetPosition=");
    localStringBuilder.append(-1);
    localStringBuilder.append(", mData=");
    localStringBuilder.append(null);
    localStringBuilder.append(", mItemCount=");
    localStringBuilder.append(0);
    localStringBuilder.append(", mIsMeasuring=");
    localStringBuilder.append(false);
    localStringBuilder.append(", mPreviousLayoutItemCount=");
    localStringBuilder.append(a);
    localStringBuilder.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
    localStringBuilder.append(b);
    localStringBuilder.append(", mStructureChanged=");
    localStringBuilder.append(c);
    localStringBuilder.append(", mInPreLayout=");
    localStringBuilder.append(d);
    localStringBuilder.append(", mRunSimpleAnimations=");
    localStringBuilder.append(e);
    localStringBuilder.append(", mRunPredictiveAnimations=");
    localStringBuilder.append(f);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */