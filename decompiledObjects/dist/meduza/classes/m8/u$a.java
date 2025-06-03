package m8;

import a0.j;

public final class u$a
  extends f0.e.d.c.a
{
  public Double a;
  public int b;
  public boolean c;
  public int d;
  public long e;
  public long f;
  public byte g;
  
  public final u a()
  {
    if (g != 31)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      if ((g & 0x1) == 0) {
        localStringBuilder.append(" batteryVelocity");
      }
      if ((g & 0x2) == 0) {
        localStringBuilder.append(" proximityOn");
      }
      if ((g & 0x4) == 0) {
        localStringBuilder.append(" orientation");
      }
      if ((g & 0x8) == 0) {
        localStringBuilder.append(" ramUsed");
      }
      if ((g & 0x10) == 0) {
        localStringBuilder.append(" diskUsed");
      }
      throw new IllegalStateException(j.l("Missing required properties:", localStringBuilder));
    }
    return new u(a, b, c, d, e, f);
  }
}

/* Location:
 * Qualified Name:     m8.u.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */