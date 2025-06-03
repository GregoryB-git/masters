package T;

public class a$d
{
  public final int a;
  public final String b;
  public final int c;
  public final int d;
  
  public a$d(String paramString, int paramInt1, int paramInt2)
  {
    b = paramString;
    a = paramInt1;
    c = paramInt2;
    d = -1;
  }
  
  public a$d(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    b = paramString;
    a = paramInt1;
    c = paramInt2;
    d = paramInt3;
  }
  
  public boolean a(int paramInt)
  {
    int i = c;
    if ((i != 7) && (paramInt != 7) && (i != paramInt))
    {
      int j = d;
      if (j != paramInt)
      {
        if (((i == 4) || (j == 4)) && (paramInt == 3)) {
          return true;
        }
        if (((i == 9) || (j == 9)) && (paramInt == 8)) {
          return true;
        }
        return ((i == 12) || (j == 12)) && (paramInt == 11);
      }
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     T.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */