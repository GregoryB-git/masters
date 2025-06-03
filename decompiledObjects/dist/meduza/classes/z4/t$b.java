package z4;

public final class t$b
  extends s
{
  public t$b(Object paramObject)
  {
    super(paramObject, -1L);
  }
  
  public t$b(Object paramObject, int paramInt1, int paramInt2, long paramLong)
  {
    super(paramObject, paramInt1, paramInt2, paramLong, -1);
  }
  
  public t$b(Object paramObject, int paramInt, long paramLong)
  {
    super(paramObject, -1, -1, paramLong, paramInt);
  }
  
  public t$b(Object paramObject, long paramLong)
  {
    super(paramObject, paramLong);
  }
  
  public t$b(s params)
  {
    super(params);
  }
  
  public final b b(Object paramObject)
  {
    if (a.equals(paramObject)) {
      paramObject = this;
    } else {
      paramObject = new s(paramObject, b, c, d, e);
    }
    return new b((s)paramObject);
  }
}

/* Location:
 * Qualified Name:     z4.t.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */