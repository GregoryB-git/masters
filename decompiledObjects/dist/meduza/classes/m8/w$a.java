package m8;

import a0.j;

public final class w$a
  extends f0.e.d.e.a
{
  public f0.e.d.e.b a;
  public String b;
  public String c;
  public long d;
  public byte e;
  
  public final w a()
  {
    if (e == 1)
    {
      f0.e.d.e.b localb = a;
      if (localb != null)
      {
        localObject = b;
        if (localObject != null)
        {
          String str = c;
          if (str != null) {
            return new w(localb, (String)localObject, str, d);
          }
        }
      }
    }
    Object localObject = new StringBuilder();
    if (a == null) {
      ((StringBuilder)localObject).append(" rolloutVariant");
    }
    if (b == null) {
      ((StringBuilder)localObject).append(" parameterKey");
    }
    if (c == null) {
      ((StringBuilder)localObject).append(" parameterValue");
    }
    if ((0x1 & e) == 0) {
      ((StringBuilder)localObject).append(" templateVersion");
    }
    throw new IllegalStateException(j.l("Missing required properties:", (StringBuilder)localObject));
  }
}

/* Location:
 * Qualified Name:     m8.w.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */