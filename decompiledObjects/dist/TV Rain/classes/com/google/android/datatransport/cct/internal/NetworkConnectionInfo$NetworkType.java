package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;
import androidx.annotation.Nullable;

public enum NetworkConnectionInfo$NetworkType
{
  private static final SparseArray<NetworkType> valueMap;
  private final int value;
  
  static
  {
    NetworkType localNetworkType1 = new NetworkType("MOBILE", 0, 0);
    MOBILE = localNetworkType1;
    NetworkType localNetworkType2 = new NetworkType("WIFI", 1, 1);
    WIFI = localNetworkType2;
    NetworkType localNetworkType3 = new NetworkType("MOBILE_MMS", 2, 2);
    MOBILE_MMS = localNetworkType3;
    NetworkType localNetworkType4 = new NetworkType("MOBILE_SUPL", 3, 3);
    MOBILE_SUPL = localNetworkType4;
    NetworkType localNetworkType5 = new NetworkType("MOBILE_DUN", 4, 4);
    MOBILE_DUN = localNetworkType5;
    NetworkType localNetworkType6 = new NetworkType("MOBILE_HIPRI", 5, 5);
    MOBILE_HIPRI = localNetworkType6;
    NetworkType localNetworkType7 = new NetworkType("WIMAX", 6, 6);
    WIMAX = localNetworkType7;
    NetworkType localNetworkType8 = new NetworkType("BLUETOOTH", 7, 7);
    BLUETOOTH = localNetworkType8;
    NetworkType localNetworkType9 = new NetworkType("DUMMY", 8, 8);
    DUMMY = localNetworkType9;
    NetworkType localNetworkType10 = new NetworkType("ETHERNET", 9, 9);
    ETHERNET = localNetworkType10;
    NetworkType localNetworkType11 = new NetworkType("MOBILE_FOTA", 10, 10);
    MOBILE_FOTA = localNetworkType11;
    NetworkType localNetworkType12 = new NetworkType("MOBILE_IMS", 11, 11);
    MOBILE_IMS = localNetworkType12;
    NetworkType localNetworkType13 = new NetworkType("MOBILE_CBS", 12, 12);
    MOBILE_CBS = localNetworkType13;
    NetworkType localNetworkType14 = new NetworkType("WIFI_P2P", 13, 13);
    WIFI_P2P = localNetworkType14;
    NetworkType localNetworkType15 = new NetworkType("MOBILE_IA", 14, 14);
    MOBILE_IA = localNetworkType15;
    NetworkType localNetworkType16 = new NetworkType("MOBILE_EMERGENCY", 15, 15);
    MOBILE_EMERGENCY = localNetworkType16;
    NetworkType localNetworkType17 = new NetworkType("PROXY", 16, 16);
    PROXY = localNetworkType17;
    NetworkType localNetworkType18 = new NetworkType("VPN", 17, 17);
    VPN = localNetworkType18;
    NetworkType localNetworkType19 = new NetworkType("NONE", 18, -1);
    NONE = localNetworkType19;
    $VALUES = new NetworkType[] { localNetworkType1, localNetworkType2, localNetworkType3, localNetworkType4, localNetworkType5, localNetworkType6, localNetworkType7, localNetworkType8, localNetworkType9, localNetworkType10, localNetworkType11, localNetworkType12, localNetworkType13, localNetworkType14, localNetworkType15, localNetworkType16, localNetworkType17, localNetworkType18, localNetworkType19 };
    SparseArray localSparseArray = new SparseArray();
    valueMap = localSparseArray;
    localSparseArray.put(0, localNetworkType1);
    localSparseArray.put(1, localNetworkType2);
    localSparseArray.put(2, localNetworkType3);
    localSparseArray.put(3, localNetworkType4);
    localSparseArray.put(4, localNetworkType5);
    localSparseArray.put(5, localNetworkType6);
    localSparseArray.put(6, localNetworkType7);
    localSparseArray.put(7, localNetworkType8);
    localSparseArray.put(8, localNetworkType9);
    localSparseArray.put(9, localNetworkType10);
    localSparseArray.put(10, localNetworkType11);
    localSparseArray.put(11, localNetworkType12);
    localSparseArray.put(12, localNetworkType13);
    localSparseArray.put(13, localNetworkType14);
    localSparseArray.put(14, localNetworkType15);
    localSparseArray.put(15, localNetworkType16);
    localSparseArray.put(16, localNetworkType17);
    localSparseArray.put(17, localNetworkType18);
    localSparseArray.put(-1, localNetworkType19);
  }
  
  private NetworkConnectionInfo$NetworkType(int paramInt)
  {
    value = paramInt;
  }
  
  @Nullable
  public static NetworkType forNumber(int paramInt)
  {
    return (NetworkType)valueMap.get(paramInt);
  }
  
  public int getValue()
  {
    return value;
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.NetworkConnectionInfo.NetworkType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */