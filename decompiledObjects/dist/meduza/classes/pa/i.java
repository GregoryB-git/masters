package pa;

public final class i
{
  public final int a;
  public final int b;
  public final int c;
  public final int d;
  
  public i()
  {
    a = 50000;
    b = 50000;
    c = 2500;
    d = 5000;
  }
  
  public i(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, Integer paramInteger4)
  {
    int i = 50000;
    if (paramInteger1 != null) {
      j = paramInteger1.intValue();
    } else {
      j = 50000;
    }
    a = j;
    int j = i;
    if (paramInteger2 != null) {
      j = paramInteger2.intValue();
    }
    b = j;
    if (paramInteger3 != null) {
      j = paramInteger3.intValue();
    } else {
      j = 2500;
    }
    c = j;
    if (paramInteger4 != null) {
      j = paramInteger4.intValue();
    } else {
      j = 5000;
    }
    d = j;
  }
}

/* Location:
 * Qualified Name:     pa.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */