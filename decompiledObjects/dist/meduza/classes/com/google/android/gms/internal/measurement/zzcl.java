package com.google.android.gms.internal.measurement;

public enum zzcl
  implements zzki
{
  private final int zzk;
  
  static
  {
    zzcl localzzcl1 = new zzcl("UNSPECIFIED_TYPE", 0, 0);
    zzd = localzzcl1;
    zzcl localzzcl2 = new zzcl("RAW_FILE_IO_TYPE", 1, 1);
    zza = localzzcl2;
    zzcl localzzcl3 = new zzcl("MOBSTORE_TYPE", 2, 2);
    zze = localzzcl3;
    zzcl localzzcl4 = new zzcl("SQLITE_OPEN_HELPER_TYPE", 3, 3);
    zzb = localzzcl4;
    zzcl localzzcl5 = new zzcl("LEVEL_DB_TYPE", 4, 5);
    zzf = localzzcl5;
    zzcl localzzcl6 = new zzcl("ROOM_TYPE", 5, 6);
    zzg = localzzcl6;
    zzcl localzzcl7 = new zzcl("SHARED_PREFS_TYPE", 6, 7);
    zzc = localzzcl7;
    zzcl localzzcl8 = new zzcl("PROTO_DATA_STORE_TYPE", 7, 8);
    zzh = localzzcl8;
    zzcl localzzcl9 = new zzcl("UNRECOGNIZED", 8, -1);
    zzi = localzzcl9;
    zzj = new zzcl[] { localzzcl1, localzzcl2, localzzcl3, localzzcl4, localzzcl5, localzzcl6, localzzcl7, localzzcl8, localzzcl9 };
  }
  
  private zzcl(int paramInt)
  {
    zzk = paramInt;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("<");
    localStringBuilder.append(zzcl.class.getName());
    localStringBuilder.append('@');
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    if (this != zzi)
    {
      localStringBuilder.append(" number=");
      localStringBuilder.append(zza());
    }
    localStringBuilder.append(" name=");
    localStringBuilder.append(name());
    localStringBuilder.append('>');
    return localStringBuilder.toString();
  }
  
  public final int zza()
  {
    if (this != zzi) {
      return zzk;
    }
    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzcl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */