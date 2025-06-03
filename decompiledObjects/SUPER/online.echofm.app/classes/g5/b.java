package g5;

public enum b
{
  public final int[] o;
  public final int p;
  
  static
  {
    b localb1 = new b("TERMINATOR", 0, new int[] { 0, 0, 0 }, 0);
    q = localb1;
    b localb2 = new b("NUMERIC", 1, new int[] { 10, 12, 14 }, 1);
    r = localb2;
    b localb3 = new b("ALPHANUMERIC", 2, new int[] { 9, 11, 13 }, 2);
    s = localb3;
    b localb4 = new b("STRUCTURED_APPEND", 3, new int[] { 0, 0, 0 }, 3);
    t = localb4;
    b localb5 = new b("BYTE", 4, new int[] { 8, 16, 16 }, 4);
    u = localb5;
    b localb6 = new b("ECI", 5, new int[] { 0, 0, 0 }, 7);
    v = localb6;
    b localb7 = new b("KANJI", 6, new int[] { 8, 10, 12 }, 8);
    w = localb7;
    b localb8 = new b("FNC1_FIRST_POSITION", 7, new int[] { 0, 0, 0 }, 5);
    x = localb8;
    b localb9 = new b("FNC1_SECOND_POSITION", 8, new int[] { 0, 0, 0 }, 9);
    y = localb9;
    b localb10 = new b("HANZI", 9, new int[] { 8, 10, 12 }, 13);
    z = localb10;
    A = new b[] { localb1, localb2, localb3, localb4, localb5, localb6, localb7, localb8, localb9, localb10 };
  }
  
  public b(int[] paramArrayOfInt, int paramInt1)
  {
    o = paramArrayOfInt;
    p = paramInt1;
  }
  
  public int c()
  {
    return p;
  }
  
  public int e(c paramc)
  {
    int i = paramc.f();
    if (i <= 9) {
      i = 0;
    } else if (i <= 26) {
      i = 1;
    } else {
      i = 2;
    }
    return o[i];
  }
}

/* Location:
 * Qualified Name:     g5.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */