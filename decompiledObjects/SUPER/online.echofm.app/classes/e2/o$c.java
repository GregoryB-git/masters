package e2;

import android.util.SparseArray;

public enum o$c
{
  public static final SparseArray I;
  public final int o;
  
  static
  {
    c localc1 = new c("MOBILE", 0, 0);
    p = localc1;
    c localc2 = new c("WIFI", 1, 1);
    q = localc2;
    c localc3 = new c("MOBILE_MMS", 2, 2);
    r = localc3;
    c localc4 = new c("MOBILE_SUPL", 3, 3);
    s = localc4;
    c localc5 = new c("MOBILE_DUN", 4, 4);
    t = localc5;
    c localc6 = new c("MOBILE_HIPRI", 5, 5);
    u = localc6;
    c localc7 = new c("WIMAX", 6, 6);
    v = localc7;
    c localc8 = new c("BLUETOOTH", 7, 7);
    w = localc8;
    c localc9 = new c("DUMMY", 8, 8);
    x = localc9;
    c localc10 = new c("ETHERNET", 9, 9);
    y = localc10;
    c localc11 = new c("MOBILE_FOTA", 10, 10);
    z = localc11;
    c localc12 = new c("MOBILE_IMS", 11, 11);
    A = localc12;
    c localc13 = new c("MOBILE_CBS", 12, 12);
    B = localc13;
    c localc14 = new c("WIFI_P2P", 13, 13);
    C = localc14;
    c localc15 = new c("MOBILE_IA", 14, 14);
    D = localc15;
    c localc16 = new c("MOBILE_EMERGENCY", 15, 15);
    E = localc16;
    c localc17 = new c("PROXY", 16, 16);
    F = localc17;
    c localc18 = new c("VPN", 17, 17);
    G = localc18;
    c localc19 = new c("NONE", 18, -1);
    H = localc19;
    J = new c[] { localc1, localc2, localc3, localc4, localc5, localc6, localc7, localc8, localc9, localc10, localc11, localc12, localc13, localc14, localc15, localc16, localc17, localc18, localc19 };
    SparseArray localSparseArray = new SparseArray();
    I = localSparseArray;
    localSparseArray.put(0, localc1);
    localSparseArray.put(1, localc2);
    localSparseArray.put(2, localc3);
    localSparseArray.put(3, localc4);
    localSparseArray.put(4, localc5);
    localSparseArray.put(5, localc6);
    localSparseArray.put(6, localc7);
    localSparseArray.put(7, localc8);
    localSparseArray.put(8, localc9);
    localSparseArray.put(9, localc10);
    localSparseArray.put(10, localc11);
    localSparseArray.put(11, localc12);
    localSparseArray.put(12, localc13);
    localSparseArray.put(13, localc14);
    localSparseArray.put(14, localc15);
    localSparseArray.put(15, localc16);
    localSparseArray.put(16, localc17);
    localSparseArray.put(17, localc18);
    localSparseArray.put(-1, localc19);
  }
  
  public o$c(int paramInt1)
  {
    o = paramInt1;
  }
  
  public static c c(int paramInt)
  {
    return (c)I.get(paramInt);
  }
  
  public int e()
  {
    return o;
  }
}

/* Location:
 * Qualified Name:     e2.o.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */