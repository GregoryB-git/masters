package com.google.android.recaptcha.internal;

public enum zzlq
  implements zznf
{
  private final int zzn;
  
  static
  {
    zzlq localzzlq1 = new zzlq("EDITION_UNKNOWN", 0, 0);
    zza = localzzlq1;
    zzlq localzzlq2 = new zzlq("EDITION_LEGACY", 1, 900);
    zzb = localzzlq2;
    zzlq localzzlq3 = new zzlq("EDITION_PROTO2", 2, 998);
    zzc = localzzlq3;
    zzlq localzzlq4 = new zzlq("EDITION_PROTO3", 3, 999);
    zzd = localzzlq4;
    zzlq localzzlq5 = new zzlq("EDITION_2023", 4, 1000);
    zze = localzzlq5;
    zzlq localzzlq6 = new zzlq("EDITION_2024", 5, 1001);
    zzf = localzzlq6;
    zzlq localzzlq7 = new zzlq("EDITION_1_TEST_ONLY", 6, 1);
    zzg = localzzlq7;
    zzlq localzzlq8 = new zzlq("EDITION_2_TEST_ONLY", 7, 2);
    zzh = localzzlq8;
    zzlq localzzlq9 = new zzlq("EDITION_99997_TEST_ONLY", 8, 99997);
    zzi = localzzlq9;
    zzlq localzzlq10 = new zzlq("EDITION_99998_TEST_ONLY", 9, 99998);
    zzj = localzzlq10;
    zzlq localzzlq11 = new zzlq("EDITION_99999_TEST_ONLY", 10, 99999);
    zzk = localzzlq11;
    zzlq localzzlq12 = new zzlq("EDITION_MAX", 11, Integer.MAX_VALUE);
    zzl = localzzlq12;
    zzm = new zzlq[] { localzzlq1, localzzlq2, localzzlq3, localzzlq4, localzzlq5, localzzlq6, localzzlq7, localzzlq8, localzzlq9, localzzlq10, localzzlq11, localzzlq12 };
  }
  
  private zzlq(int paramInt1)
  {
    zzn = paramInt1;
  }
  
  public final String toString()
  {
    return Integer.toString(zzn);
  }
  
  public final int zza()
  {
    return zzn;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzlq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */