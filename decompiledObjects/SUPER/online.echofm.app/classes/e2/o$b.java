package e2;

import android.util.SparseArray;

public enum o$b
{
  public static final SparseArray K;
  public final int o;
  
  static
  {
    b localb1 = new b("UNKNOWN_MOBILE_SUBTYPE", 0, 0);
    p = localb1;
    b localb2 = new b("GPRS", 1, 1);
    q = localb2;
    b localb3 = new b("EDGE", 2, 2);
    r = localb3;
    b localb4 = new b("UMTS", 3, 3);
    s = localb4;
    b localb5 = new b("CDMA", 4, 4);
    t = localb5;
    b localb6 = new b("EVDO_0", 5, 5);
    u = localb6;
    b localb7 = new b("EVDO_A", 6, 6);
    v = localb7;
    b localb8 = new b("RTT", 7, 7);
    w = localb8;
    b localb9 = new b("HSDPA", 8, 8);
    x = localb9;
    b localb10 = new b("HSUPA", 9, 9);
    y = localb10;
    b localb11 = new b("HSPA", 10, 10);
    z = localb11;
    b localb12 = new b("IDEN", 11, 11);
    A = localb12;
    b localb13 = new b("EVDO_B", 12, 12);
    B = localb13;
    b localb14 = new b("LTE", 13, 13);
    C = localb14;
    b localb15 = new b("EHRPD", 14, 14);
    D = localb15;
    b localb16 = new b("HSPAP", 15, 15);
    E = localb16;
    b localb17 = new b("GSM", 16, 16);
    F = localb17;
    b localb18 = new b("TD_SCDMA", 17, 17);
    G = localb18;
    b localb19 = new b("IWLAN", 18, 18);
    H = localb19;
    b localb20 = new b("LTE_CA", 19, 19);
    I = localb20;
    Object localObject = new b("COMBINED", 20, 100);
    J = (b)localObject;
    L = new b[] { localb1, localb2, localb3, localb4, localb5, localb6, localb7, localb8, localb9, localb10, localb11, localb12, localb13, localb14, localb15, localb16, localb17, localb18, localb19, localb20, localObject };
    localObject = new SparseArray();
    K = (SparseArray)localObject;
    ((SparseArray)localObject).put(0, localb1);
    ((SparseArray)localObject).put(1, localb2);
    ((SparseArray)localObject).put(2, localb3);
    ((SparseArray)localObject).put(3, localb4);
    ((SparseArray)localObject).put(4, localb5);
    ((SparseArray)localObject).put(5, localb6);
    ((SparseArray)localObject).put(6, localb7);
    ((SparseArray)localObject).put(7, localb8);
    ((SparseArray)localObject).put(8, localb9);
    ((SparseArray)localObject).put(9, localb10);
    ((SparseArray)localObject).put(10, localb11);
    ((SparseArray)localObject).put(11, localb12);
    ((SparseArray)localObject).put(12, localb13);
    ((SparseArray)localObject).put(13, localb14);
    ((SparseArray)localObject).put(14, localb15);
    ((SparseArray)localObject).put(15, localb16);
    ((SparseArray)localObject).put(16, localb17);
    ((SparseArray)localObject).put(17, localb18);
    ((SparseArray)localObject).put(18, localb19);
    ((SparseArray)localObject).put(19, localb20);
  }
  
  public o$b(int paramInt1)
  {
    o = paramInt1;
  }
  
  public static b c(int paramInt)
  {
    return (b)K.get(paramInt);
  }
  
  public int e()
  {
    return o;
  }
}

/* Location:
 * Qualified Name:     e2.o.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */