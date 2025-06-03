package e2;

import android.util.SparseArray;

public abstract class o
{
  public static a a()
  {
    return new i.b();
  }
  
  public abstract b b();
  
  public abstract c c();
  
  public static abstract class a
  {
    public abstract o a();
    
    public abstract a b(o.b paramb);
    
    public abstract a c(o.c paramc);
  }
  
  public static enum b
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
    
    public b(int paramInt1)
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
  
  public static enum c
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
    
    public c(int paramInt1)
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
}

/* Location:
 * Qualified Name:     e2.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */