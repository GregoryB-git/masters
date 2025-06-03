package e5;

import java.util.ArrayList;

public final class d
  implements i
{
  public static final int[] b = { 8, 13, 11, 2, 0, 1, 7 };
  
  public static void a(int paramInt, ArrayList paramArrayList)
  {
    int[] arrayOfInt = b;
    for (int i = 0; i < 7; i++) {
      if (arrayOfInt[i] == paramInt) {
        break label30;
      }
    }
    i = -1;
    label30:
    if ((i != -1) && (!paramArrayList.contains(Integer.valueOf(paramInt)))) {
      paramArrayList.add(Integer.valueOf(paramInt));
    }
  }
}

/* Location:
 * Qualified Name:     e5.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */