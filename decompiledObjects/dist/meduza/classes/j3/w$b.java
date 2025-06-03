package j3;

import android.util.SparseArray;

public enum w$b
{
  public static final SparseArray<b> a;
  
  static
  {
    b localb1 = new b("MOBILE", 0, 0);
    b localb2 = new b("WIFI", 1, 1);
    b localb3 = new b("MOBILE_MMS", 2, 2);
    b localb4 = new b("MOBILE_SUPL", 3, 3);
    b localb5 = new b("MOBILE_DUN", 4, 4);
    b localb6 = new b("MOBILE_HIPRI", 5, 5);
    b localb7 = new b("WIMAX", 6, 6);
    b localb8 = new b("BLUETOOTH", 7, 7);
    b localb9 = new b("DUMMY", 8, 8);
    b localb10 = new b("ETHERNET", 9, 9);
    b localb11 = new b("MOBILE_FOTA", 10, 10);
    b localb12 = new b("MOBILE_IMS", 11, 11);
    b localb13 = new b("MOBILE_CBS", 12, 12);
    b localb14 = new b("WIFI_P2P", 13, 13);
    b localb15 = new b("MOBILE_IA", 14, 14);
    b localb16 = new b("MOBILE_EMERGENCY", 15, 15);
    b localb17 = new b("PROXY", 16, 16);
    b localb18 = new b("VPN", 17, 17);
    b localb19 = new b("NONE", 18, -1);
    b = new b[] { localb1, localb2, localb3, localb4, localb5, localb6, localb7, localb8, localb9, localb10, localb11, localb12, localb13, localb14, localb15, localb16, localb17, localb18, localb19 };
    SparseArray localSparseArray = new SparseArray();
    a = localSparseArray;
    localSparseArray.put(0, localb1);
    localSparseArray.put(1, localb2);
    localSparseArray.put(2, localb3);
    localSparseArray.put(3, localb4);
    localSparseArray.put(4, localb5);
    localSparseArray.put(5, localb6);
    localSparseArray.put(6, localb7);
    localSparseArray.put(7, localb8);
    localSparseArray.put(8, localb9);
    localSparseArray.put(9, localb10);
    localSparseArray.put(10, localb11);
    localSparseArray.put(11, localb12);
    localSparseArray.put(12, localb13);
    localSparseArray.put(13, localb14);
    localSparseArray.put(14, localb15);
    localSparseArray.put(15, localb16);
    localSparseArray.put(16, localb17);
    localSparseArray.put(17, localb18);
    localSparseArray.put(-1, localb19);
  }
  
  public w$b(int paramInt) {}
}

/* Location:
 * Qualified Name:     j3.w.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */