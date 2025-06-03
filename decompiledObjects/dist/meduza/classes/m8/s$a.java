package m8;

import a0.j;

public final class s$a
  extends f0.e.d.a.b.d.a.a
{
  public long a;
  public String b;
  public String c;
  public long d;
  public int e;
  public byte f;
  
  public final s a()
  {
    if (f == 7)
    {
      localObject = b;
      if (localObject != null) {
        return new s(a, (String)localObject, c, d, e);
      }
    }
    Object localObject = new StringBuilder();
    if ((f & 0x1) == 0) {
      ((StringBuilder)localObject).append(" pc");
    }
    if (b == null) {
      ((StringBuilder)localObject).append(" symbol");
    }
    if ((f & 0x2) == 0) {
      ((StringBuilder)localObject).append(" offset");
    }
    if ((f & 0x4) == 0) {
      ((StringBuilder)localObject).append(" importance");
    }
    throw new IllegalStateException(j.l("Missing required properties:", (StringBuilder)localObject));
  }
}

/* Location:
 * Qualified Name:     m8.s.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */