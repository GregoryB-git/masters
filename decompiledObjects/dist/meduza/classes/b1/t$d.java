package b1;

public abstract class t$d
{
  public final x<? super T> a;
  public boolean b;
  public int c = -1;
  
  public t$d(x<? super T> paramx)
  {
    x localx;
    a = localx;
  }
  
  public final void b(boolean paramBoolean)
  {
    if (paramBoolean == b) {
      return;
    }
    b = paramBoolean;
    t localt = d;
    int i;
    if (paramBoolean) {
      i = 1;
    } else {
      i = -1;
    }
    localt.changeActiveCounter(i);
    if (b) {
      d.dispatchingValue(this);
    }
  }
  
  public void c() {}
  
  public boolean d(o paramo)
  {
    return false;
  }
  
  public abstract boolean e();
}

/* Location:
 * Qualified Name:     b1.t.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */