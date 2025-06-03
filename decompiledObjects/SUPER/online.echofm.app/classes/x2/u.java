package x2;

public abstract class u
{
  public static int a(int paramInt)
  {
    int i = 0;
    while (i < 3)
    {
      int j = new int[] { 1, 2, 3 }[i];
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
 * Qualified Name:     x2.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */