package o7;

public final class b0$a<T>
  extends a<T>
{
  public static final a e = new a(new Object[0]);
  public final T[] c;
  public final int d;
  
  public b0$a(Object[] paramArrayOfObject)
  {
    super(0, 0);
    c = paramArrayOfObject;
    d = 0;
  }
  
  public final T b(int paramInt)
  {
    return (T)c[(d + paramInt)];
  }
}

/* Location:
 * Qualified Name:     o7.b0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */