package g;

public final class v
{
  public static v d;
  public long a;
  public long b;
  public int c;
  
  public final void a(long paramLong, double paramDouble1, double paramDouble2)
  {
    float f1 = (float)(paramLong - 946728000000L) / 8.64E7F;
    float f2 = 0.01720197F * f1 + 6.24006F;
    double d1 = f2;
    double d2 = Math.sin(d1);
    double d3 = Math.sin(2.0F * f2);
    d2 = Math.sin(f2 * 3.0F) * 5.236000106378924E-6D + (d3 * 3.4906598739326E-4D + (d2 * 0.03341960161924362D + d1)) + 1.796593063D + 3.141592653589793D;
    d3 = -paramDouble2 / 360.0D;
    paramDouble2 = (float)Math.round(f1 - 9.0E-4F - d3) + 9.0E-4F;
    d1 = Math.sin(d1);
    paramDouble2 = Math.sin(2.0D * d2) * -0.0069D + (d1 * 0.0053D + (paramDouble2 + d3));
    d2 = Math.sin(d2);
    d2 = Math.asin(Math.sin(0.4092797040939331D) * d2);
    double d4 = 0.01745329238474369D * paramDouble1;
    d3 = Math.sin(-0.10471975803375244D);
    d1 = Math.sin(d4);
    paramDouble1 = Math.sin(d2);
    d4 = Math.cos(d4);
    paramDouble1 = (d3 - paramDouble1 * d1) / (Math.cos(d2) * d4);
    if (paramDouble1 >= 1.0D) {}
    for (c = 1;; c = 0)
    {
      a = -1L;
      b = -1L;
      return;
      if (paramDouble1 > -1.0D) {
        break;
      }
    }
    paramDouble1 = (float)(Math.acos(paramDouble1) / 6.283185307179586D);
    a = (Math.round((paramDouble2 + paramDouble1) * 8.64E7D) + 946728000000L);
    long l = Math.round((paramDouble2 - paramDouble1) * 8.64E7D) + 946728000000L;
    b = l;
    if ((l < paramLong) && (a > paramLong)) {
      c = 0;
    } else {
      c = 1;
    }
  }
}

/* Location:
 * Qualified Name:     g.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */