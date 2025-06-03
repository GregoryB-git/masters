package p6;

public final class Y
  extends j
{
  public final X o;
  
  public Y(X paramX)
  {
    o = paramX;
  }
  
  public void a(Throwable paramThrowable)
  {
    o.b();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DisposeOnCancel[");
    localStringBuilder.append(o);
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     p6.Y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */