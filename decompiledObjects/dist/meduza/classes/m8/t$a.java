package m8;

import a0.j;

public final class t$a
  extends f0.e.d.a.c.a
{
  public String a;
  public int b;
  public int c;
  public boolean d;
  public byte e;
  
  public final t a()
  {
    if (e == 7)
    {
      localObject = a;
      if (localObject != null) {
        return new t((String)localObject, b, c, d);
      }
    }
    Object localObject = new StringBuilder();
    if (a == null) {
      ((StringBuilder)localObject).append(" processName");
    }
    if ((e & 0x1) == 0) {
      ((StringBuilder)localObject).append(" pid");
    }
    if ((e & 0x2) == 0) {
      ((StringBuilder)localObject).append(" importance");
    }
    if ((e & 0x4) == 0) {
      ((StringBuilder)localObject).append(" defaultProcess");
    }
    throw new IllegalStateException(j.l("Missing required properties:", (StringBuilder)localObject));
  }
}

/* Location:
 * Qualified Name:     m8.t.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */