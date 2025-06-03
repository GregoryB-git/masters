package u5;

import android.view.KeyCharacterMap;

public class L$b
{
  public int a = 0;
  
  public Character a(int paramInt)
  {
    int i = (char)paramInt;
    int m;
    if ((0x80000000 & paramInt) != 0)
    {
      int j = paramInt & 0x7FFFFFFF;
      int k = a;
      m = i;
      paramInt = j;
      if (k != 0)
      {
        paramInt = KeyCharacterMap.getDeadChar(k, j);
        m = i;
      }
    }
    else
    {
      m = a;
      c = i;
      if (m == 0) {
        break label86;
      }
      paramInt = KeyCharacterMap.getDeadChar(m, paramInt);
      if (paramInt > 0) {
        i = (char)paramInt;
      }
      paramInt = 0;
      m = i;
    }
    a = paramInt;
    char c = m;
    label86:
    return Character.valueOf(c);
  }
}

/* Location:
 * Qualified Name:     u5.L.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */