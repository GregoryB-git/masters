package androidx.recyclerview.widget;

import java.util.Comparator;

public final class e$a
  implements Comparator<e.c>
{
  public final int compare(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (e.c)paramObject1;
    e.c localc = (e.c)paramObject2;
    paramObject2 = d;
    int i = 0;
    if (paramObject2 == null) {
      j = 1;
    } else {
      j = 0;
    }
    int k;
    if (d == null) {
      k = 1;
    } else {
      k = 0;
    }
    if (j != k) {
      if (paramObject2 == null)
      {
        j = 1;
        break label136;
      }
    }
    for (;;)
    {
      j = -1;
      break label136;
      boolean bool = a;
      if (bool == a) {
        break label93;
      }
      if (!bool) {
        break;
      }
    }
    label93:
    int j = b - b;
    if (j == 0)
    {
      k = c - c;
      j = i;
      if (k != 0) {
        j = k;
      }
    }
    label136:
    return j;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */