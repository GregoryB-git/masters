package m8;

import a0.j;
import java.util.List;

public final class c$a
  extends f0.a.b
{
  public int a;
  public String b;
  public int c;
  public int d;
  public long e;
  public long f;
  public long g;
  public String h;
  public List<f0.a.a> i;
  public byte j;
  
  public final c a()
  {
    if (j == 63)
    {
      localObject = b;
      if (localObject != null) {
        return new c(a, (String)localObject, c, d, e, f, g, h, i);
      }
    }
    Object localObject = new StringBuilder();
    if ((j & 0x1) == 0) {
      ((StringBuilder)localObject).append(" pid");
    }
    if (b == null) {
      ((StringBuilder)localObject).append(" processName");
    }
    if ((j & 0x2) == 0) {
      ((StringBuilder)localObject).append(" reasonCode");
    }
    if ((j & 0x4) == 0) {
      ((StringBuilder)localObject).append(" importance");
    }
    if ((j & 0x8) == 0) {
      ((StringBuilder)localObject).append(" pss");
    }
    if ((j & 0x10) == 0) {
      ((StringBuilder)localObject).append(" rss");
    }
    if ((j & 0x20) == 0) {
      ((StringBuilder)localObject).append(" timestamp");
    }
    throw new IllegalStateException(j.l("Missing required properties:", (StringBuilder)localObject));
  }
}

/* Location:
 * Qualified Name:     m8.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */