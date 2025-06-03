package j0;

public final class a$a
{
  public int a;
  public int b;
  public float c;
  public float d;
  public long e = Long.MIN_VALUE;
  public long f = 0L;
  public long g = -1L;
  public float h;
  public int i;
  
  public final float a(long paramLong)
  {
    long l1 = e;
    if (paramLong < l1) {
      return 0.0F;
    }
    long l2 = g;
    if ((l2 >= 0L) && (paramLong >= l2))
    {
      float f1 = h;
      return a.b((float)(paramLong - l2) / i, 0.0F, 1.0F) * f1 + (1.0F - f1);
    }
    return a.b((float)(paramLong - l1) / a, 0.0F, 1.0F) * 0.5F;
  }
}

/* Location:
 * Qualified Name:     j0.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */