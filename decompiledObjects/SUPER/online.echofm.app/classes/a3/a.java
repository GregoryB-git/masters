package a3;

public abstract class a
{
  public static int a(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i;
    if (paramBoolean1 == paramBoolean2) {
      i = 0;
    } else if (paramBoolean1) {
      i = 1;
    } else {
      i = -1;
    }
    return i;
  }
  
  public static boolean b(boolean[] paramArrayOfBoolean, boolean paramBoolean)
  {
    int i = paramArrayOfBoolean.length;
    for (int j = 0; j < i; j++) {
      if (paramArrayOfBoolean[j] == paramBoolean) {
        return true;
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     a3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */