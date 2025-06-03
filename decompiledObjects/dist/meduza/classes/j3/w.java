package j3;

import android.util.SparseArray;

public abstract class w
{
  public abstract a a();
  
  public abstract b b();
  
  public static enum a
  {
    public static final SparseArray<a> a;
    
    static
    {
      a locala1 = new a("UNKNOWN_MOBILE_SUBTYPE", 0, 0);
      a locala2 = new a("GPRS", 1, 1);
      a locala3 = new a("EDGE", 2, 2);
      a locala4 = new a("UMTS", 3, 3);
      a locala5 = new a("CDMA", 4, 4);
      a locala6 = new a("EVDO_0", 5, 5);
      a locala7 = new a("EVDO_A", 6, 6);
      a locala8 = new a("RTT", 7, 7);
      a locala9 = new a("HSDPA", 8, 8);
      a locala10 = new a("HSUPA", 9, 9);
      a locala11 = new a("HSPA", 10, 10);
      a locala12 = new a("IDEN", 11, 11);
      a locala13 = new a("EVDO_B", 12, 12);
      a locala14 = new a("LTE", 13, 13);
      a locala15 = new a("EHRPD", 14, 14);
      a locala16 = new a("HSPAP", 15, 15);
      a locala17 = new a("GSM", 16, 16);
      a locala18 = new a("TD_SCDMA", 17, 17);
      a locala19 = new a("IWLAN", 18, 18);
      a locala20 = new a("LTE_CA", 19, 19);
      b = new a[] { locala1, locala2, locala3, locala4, locala5, locala6, locala7, locala8, locala9, locala10, locala11, locala12, locala13, locala14, locala15, locala16, locala17, locala18, locala19, locala20, new a("COMBINED", 20, 100) };
      SparseArray localSparseArray = new SparseArray();
      a = localSparseArray;
      localSparseArray.put(0, locala1);
      localSparseArray.put(1, locala2);
      localSparseArray.put(2, locala3);
      localSparseArray.put(3, locala4);
      localSparseArray.put(4, locala5);
      localSparseArray.put(5, locala6);
      localSparseArray.put(6, locala7);
      localSparseArray.put(7, locala8);
      localSparseArray.put(8, locala9);
      localSparseArray.put(9, locala10);
      localSparseArray.put(10, locala11);
      localSparseArray.put(11, locala12);
      localSparseArray.put(12, locala13);
      localSparseArray.put(13, locala14);
      localSparseArray.put(14, locala15);
      localSparseArray.put(15, locala16);
      localSparseArray.put(16, locala17);
      localSparseArray.put(17, locala18);
      localSparseArray.put(18, locala19);
      localSparseArray.put(19, locala20);
    }
    
    public a(int paramInt) {}
  }
  
  public static enum b
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
    
    public b(int paramInt) {}
  }
}

/* Location:
 * Qualified Name:     j3.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */