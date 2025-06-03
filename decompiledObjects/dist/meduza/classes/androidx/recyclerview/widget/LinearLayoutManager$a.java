package androidx.recyclerview.widget;

import f;

public final class LinearLayoutManager$a
{
  public int a;
  public int b;
  public boolean c;
  public boolean d;
  
  public LinearLayoutManager$a()
  {
    a();
  }
  
  public final void a()
  {
    a = -1;
    b = Integer.MIN_VALUE;
    c = false;
    d = false;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("AnchorInfo{mPosition=");
    localStringBuilder.append(a);
    localStringBuilder.append(", mCoordinate=");
    localStringBuilder.append(b);
    localStringBuilder.append(", mLayoutFromEnd=");
    localStringBuilder.append(c);
    localStringBuilder.append(", mValid=");
    localStringBuilder.append(d);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.LinearLayoutManager.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */