package m8;

import a0.j;

public final class z$a
  extends f0.e.e.a
{
  public int a;
  public String b;
  public String c;
  public boolean d;
  public byte e;
  
  public final z a()
  {
    if (e == 3)
    {
      String str = b;
      if (str != null)
      {
        localObject = c;
        if (localObject != null) {
          return new z(a, str, (String)localObject, d);
        }
      }
    }
    Object localObject = new StringBuilder();
    if ((e & 0x1) == 0) {
      ((StringBuilder)localObject).append(" platform");
    }
    if (b == null) {
      ((StringBuilder)localObject).append(" version");
    }
    if (c == null) {
      ((StringBuilder)localObject).append(" buildVersion");
    }
    if ((e & 0x2) == 0) {
      ((StringBuilder)localObject).append(" jailbroken");
    }
    throw new IllegalStateException(j.l("Missing required properties:", (StringBuilder)localObject));
  }
}

/* Location:
 * Qualified Name:     m8.z.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */