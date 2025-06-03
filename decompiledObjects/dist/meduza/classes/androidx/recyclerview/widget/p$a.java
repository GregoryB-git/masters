package androidx.recyclerview.widget;

public final class p$a
{
  public int a = 0;
  public int b;
  public int c;
  public int d;
  public int e;
  
  public final boolean a()
  {
    int i = a;
    int j = 2;
    int k;
    int m;
    if ((i & 0x7) != 0)
    {
      k = d;
      m = b;
      if (k > m) {
        k = 1;
      } else if (k == m) {
        k = 2;
      } else {
        k = 4;
      }
      if ((k << 0 & i) == 0) {
        return false;
      }
    }
    if ((i & 0x70) != 0)
    {
      k = d;
      m = c;
      if (k > m) {
        k = 1;
      } else if (k == m) {
        k = 2;
      } else {
        k = 4;
      }
      if ((k << 4 & i) == 0) {
        return false;
      }
    }
    if ((i & 0x700) != 0)
    {
      k = e;
      m = b;
      if (k > m) {
        k = 1;
      } else if (k == m) {
        k = 2;
      } else {
        k = 4;
      }
      if ((k << 8 & i) == 0) {
        return false;
      }
    }
    if ((i & 0x7000) != 0)
    {
      k = e;
      m = c;
      if (k > m) {
        k = 1;
      } else if (k == m) {
        k = j;
      } else {
        k = 4;
      }
      if ((i & k << 12) == 0) {
        return false;
      }
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.p.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */