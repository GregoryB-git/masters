package b7;

public enum b0
  implements a
{
  public final int a;
  
  static
  {
    b0 localb01 = new b0("RS256", 0, 65279);
    b0 localb02 = new b0("RS384", 1, 65278);
    b0 localb03 = new b0("RS512", 2, 65277);
    b0 localb04 = new b0("LEGACY_RS1", 3, 65274);
    b0 localb05 = new b0("PS256", 4, -37);
    b0 localb06 = new b0("PS384", 5, -38);
    b0 localb07 = new b0("PS512", 6, -39);
    b0 localb08 = new b0("RS1", 7, -65535);
    b = localb08;
    c = new b0[] { localb01, localb02, localb03, localb04, localb05, localb06, localb07, localb08 };
  }
  
  public b0(int paramInt1)
  {
    a = paramInt1;
  }
  
  public final int f()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     b7.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */