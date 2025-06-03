package x2;

public abstract class P
{
  public static int a(int paramInt)
  {
    int i = 0;
    while (i < 6)
    {
      int j = new int[] { 1, 2, 3, 4, 5, 6 }[i];
      if (j != 0)
      {
        if (j - 1 == paramInt) {
          return j;
        }
        i++;
      }
      else
      {
        throw null;
      }
    }
    return 1;
  }
}

/* Location:
 * Qualified Name:     x2.P
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */