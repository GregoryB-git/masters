package Y4;

import java.util.HashMap;
import java.util.Map;

public enum c
{
  public static final Map R;
  public static final Map S;
  public final int[] o;
  public final String[] p;
  
  static
  {
    Object localObject1 = new c("Cp437", 0, new int[] { 0, 2 }, new String[0]);
    q = (c)localObject1;
    c localc1 = new c("ISO8859_1", 1, new int[] { 1, 3 }, new String[] { "ISO-8859-1" });
    r = localc1;
    c localc2 = new c("ISO8859_2", 2, 4, new String[] { "ISO-8859-2" });
    s = localc2;
    c localc3 = new c("ISO8859_3", 3, 5, new String[] { "ISO-8859-3" });
    t = localc3;
    c localc4 = new c("ISO8859_4", 4, 6, new String[] { "ISO-8859-4" });
    u = localc4;
    c localc5 = new c("ISO8859_5", 5, 7, new String[] { "ISO-8859-5" });
    v = localc5;
    c localc6 = new c("ISO8859_6", 6, 8, new String[] { "ISO-8859-6" });
    w = localc6;
    Object localObject2 = new c("ISO8859_7", 7, 9, new String[] { "ISO-8859-7" });
    x = (c)localObject2;
    c localc7 = new c("ISO8859_8", 8, 10, new String[] { "ISO-8859-8" });
    y = localc7;
    c localc8 = new c("ISO8859_9", 9, 11, new String[] { "ISO-8859-9" });
    z = localc8;
    c localc9 = new c("ISO8859_10", 10, 12, new String[] { "ISO-8859-10" });
    A = localc9;
    c localc10 = new c("ISO8859_11", 11, 13, new String[] { "ISO-8859-11" });
    B = localc10;
    c localc11 = new c("ISO8859_13", 12, 15, new String[] { "ISO-8859-13" });
    C = localc11;
    c localc12 = new c("ISO8859_14", 13, 16, new String[] { "ISO-8859-14" });
    D = localc12;
    c localc13 = new c("ISO8859_15", 14, 17, new String[] { "ISO-8859-15" });
    E = localc13;
    c localc14 = new c("ISO8859_16", 15, 18, new String[] { "ISO-8859-16" });
    F = localc14;
    c localc15 = new c("SJIS", 16, 20, new String[] { "Shift_JIS" });
    G = localc15;
    c localc16 = new c("Cp1250", 17, 21, new String[] { "windows-1250" });
    H = localc16;
    c localc17 = new c("Cp1251", 18, 22, new String[] { "windows-1251" });
    I = localc17;
    c localc18 = new c("Cp1252", 19, 23, new String[] { "windows-1252" });
    J = localc18;
    c localc19 = new c("Cp1256", 20, 24, new String[] { "windows-1256" });
    K = localc19;
    c localc20 = new c("UnicodeBigUnmarked", 21, 25, new String[] { "UTF-16BE", "UnicodeBig" });
    L = localc20;
    c localc21 = new c("UTF8", 22, 26, new String[] { "UTF-8" });
    M = localc21;
    c localc22 = new c("ASCII", 23, new int[] { 27, 170 }, new String[] { "US-ASCII" });
    N = localc22;
    c localc23 = new c("Big5", 24, 28);
    O = localc23;
    c localc24 = new c("GB18030", 25, 29, new String[] { "GB2312", "EUC_CN", "GBK" });
    P = localc24;
    c localc25 = new c("EUC_KR", 26, 30, new String[] { "EUC-KR" });
    Q = localc25;
    T = new c[] { localObject1, localc1, localc2, localc3, localc4, localc5, localc6, localObject2, localc7, localc8, localc9, localc10, localc11, localc12, localc13, localc14, localc15, localc16, localc17, localc18, localc19, localc20, localc21, localc22, localc23, localc24, localc25 };
    R = new HashMap();
    S = new HashMap();
    for (localc16 : values())
    {
      for (int n : o) {
        R.put(Integer.valueOf(n), localc16);
      }
      S.put(localc16.name(), localc16);
      for (localc15 : p) {
        S.put(localc15, localc16);
      }
    }
  }
  
  public c(int paramInt1)
  {
    this(new int[] { paramInt1 }, new String[0]);
  }
  
  public c(int paramInt1, String... paramVarArgs)
  {
    o = new int[] { paramInt1 };
    p = paramVarArgs;
  }
  
  public c(int[] paramArrayOfInt, String... paramVarArgs)
  {
    o = paramArrayOfInt;
    p = paramVarArgs;
  }
  
  public static c c(String paramString)
  {
    return (c)S.get(paramString);
  }
  
  public int e()
  {
    return o[0];
  }
}

/* Location:
 * Qualified Name:     Y4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */