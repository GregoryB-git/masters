package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;
import androidx.annotation.Nullable;

public enum NetworkConnectionInfo$MobileSubtype
{
  private static final SparseArray<MobileSubtype> valueMap;
  private final int value;
  
  static
  {
    MobileSubtype localMobileSubtype1 = new MobileSubtype("UNKNOWN_MOBILE_SUBTYPE", 0, 0);
    UNKNOWN_MOBILE_SUBTYPE = localMobileSubtype1;
    MobileSubtype localMobileSubtype2 = new MobileSubtype("GPRS", 1, 1);
    GPRS = localMobileSubtype2;
    MobileSubtype localMobileSubtype3 = new MobileSubtype("EDGE", 2, 2);
    EDGE = localMobileSubtype3;
    MobileSubtype localMobileSubtype4 = new MobileSubtype("UMTS", 3, 3);
    UMTS = localMobileSubtype4;
    MobileSubtype localMobileSubtype5 = new MobileSubtype("CDMA", 4, 4);
    CDMA = localMobileSubtype5;
    MobileSubtype localMobileSubtype6 = new MobileSubtype("EVDO_0", 5, 5);
    EVDO_0 = localMobileSubtype6;
    MobileSubtype localMobileSubtype7 = new MobileSubtype("EVDO_A", 6, 6);
    EVDO_A = localMobileSubtype7;
    MobileSubtype localMobileSubtype8 = new MobileSubtype("RTT", 7, 7);
    RTT = localMobileSubtype8;
    MobileSubtype localMobileSubtype9 = new MobileSubtype("HSDPA", 8, 8);
    HSDPA = localMobileSubtype9;
    MobileSubtype localMobileSubtype10 = new MobileSubtype("HSUPA", 9, 9);
    HSUPA = localMobileSubtype10;
    MobileSubtype localMobileSubtype11 = new MobileSubtype("HSPA", 10, 10);
    HSPA = localMobileSubtype11;
    MobileSubtype localMobileSubtype12 = new MobileSubtype("IDEN", 11, 11);
    IDEN = localMobileSubtype12;
    MobileSubtype localMobileSubtype13 = new MobileSubtype("EVDO_B", 12, 12);
    EVDO_B = localMobileSubtype13;
    MobileSubtype localMobileSubtype14 = new MobileSubtype("LTE", 13, 13);
    LTE = localMobileSubtype14;
    MobileSubtype localMobileSubtype15 = new MobileSubtype("EHRPD", 14, 14);
    EHRPD = localMobileSubtype15;
    MobileSubtype localMobileSubtype16 = new MobileSubtype("HSPAP", 15, 15);
    HSPAP = localMobileSubtype16;
    MobileSubtype localMobileSubtype17 = new MobileSubtype("GSM", 16, 16);
    GSM = localMobileSubtype17;
    MobileSubtype localMobileSubtype18 = new MobileSubtype("TD_SCDMA", 17, 17);
    TD_SCDMA = localMobileSubtype18;
    MobileSubtype localMobileSubtype19 = new MobileSubtype("IWLAN", 18, 18);
    IWLAN = localMobileSubtype19;
    MobileSubtype localMobileSubtype20 = new MobileSubtype("LTE_CA", 19, 19);
    LTE_CA = localMobileSubtype20;
    Object localObject = new MobileSubtype("COMBINED", 20, 100);
    COMBINED = (MobileSubtype)localObject;
    $VALUES = new MobileSubtype[] { localMobileSubtype1, localMobileSubtype2, localMobileSubtype3, localMobileSubtype4, localMobileSubtype5, localMobileSubtype6, localMobileSubtype7, localMobileSubtype8, localMobileSubtype9, localMobileSubtype10, localMobileSubtype11, localMobileSubtype12, localMobileSubtype13, localMobileSubtype14, localMobileSubtype15, localMobileSubtype16, localMobileSubtype17, localMobileSubtype18, localMobileSubtype19, localMobileSubtype20, localObject };
    localObject = new SparseArray();
    valueMap = (SparseArray)localObject;
    ((SparseArray)localObject).put(0, localMobileSubtype1);
    ((SparseArray)localObject).put(1, localMobileSubtype2);
    ((SparseArray)localObject).put(2, localMobileSubtype3);
    ((SparseArray)localObject).put(3, localMobileSubtype4);
    ((SparseArray)localObject).put(4, localMobileSubtype5);
    ((SparseArray)localObject).put(5, localMobileSubtype6);
    ((SparseArray)localObject).put(6, localMobileSubtype7);
    ((SparseArray)localObject).put(7, localMobileSubtype8);
    ((SparseArray)localObject).put(8, localMobileSubtype9);
    ((SparseArray)localObject).put(9, localMobileSubtype10);
    ((SparseArray)localObject).put(10, localMobileSubtype11);
    ((SparseArray)localObject).put(11, localMobileSubtype12);
    ((SparseArray)localObject).put(12, localMobileSubtype13);
    ((SparseArray)localObject).put(13, localMobileSubtype14);
    ((SparseArray)localObject).put(14, localMobileSubtype15);
    ((SparseArray)localObject).put(15, localMobileSubtype16);
    ((SparseArray)localObject).put(16, localMobileSubtype17);
    ((SparseArray)localObject).put(17, localMobileSubtype18);
    ((SparseArray)localObject).put(18, localMobileSubtype19);
    ((SparseArray)localObject).put(19, localMobileSubtype20);
  }
  
  private NetworkConnectionInfo$MobileSubtype(int paramInt)
  {
    value = paramInt;
  }
  
  @Nullable
  public static MobileSubtype forNumber(int paramInt)
  {
    return (MobileSubtype)valueMap.get(paramInt);
  }
  
  public int getValue()
  {
    return value;
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.NetworkConnectionInfo.MobileSubtype
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */