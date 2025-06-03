package v3;

public final class g0$d
{
  public boolean a;
  public d1 b;
  public int c;
  public boolean d;
  public int e;
  public boolean f;
  public int g;
  
  public g0$d(d1 paramd1)
  {
    b = paramd1;
  }
  
  public final void a(int paramInt)
  {
    boolean bool1 = a;
    boolean bool2;
    if (paramInt > 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    a = (bool1 | bool2);
    c += paramInt;
  }
}

/* Location:
 * Qualified Name:     v3.g0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */