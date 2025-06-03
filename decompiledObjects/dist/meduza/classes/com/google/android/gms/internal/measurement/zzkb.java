package com.google.android.gms.internal.measurement;

public enum zzkb
{
  private static final zzkb[] zzaz;
  private final int zzbb;
  
  static
  {
    Object localObject1 = zzkd.zza;
    Object localObject2 = zzkr.zze;
    zzkb localzzkb1 = new zzkb("DOUBLE", 0, 0, (zzkd)localObject1, (zzkr)localObject2);
    zzc = localzzkb1;
    Object localObject3 = zzkr.zzd;
    zzkb localzzkb2 = new zzkb("FLOAT", 1, 1, (zzkd)localObject1, (zzkr)localObject3);
    zzd = localzzkb2;
    Object localObject4 = zzkr.zzc;
    zzkb localzzkb3 = new zzkb("INT64", 2, 2, (zzkd)localObject1, (zzkr)localObject4);
    zze = localzzkb3;
    zzkb localzzkb4 = new zzkb("UINT64", 3, 3, (zzkd)localObject1, (zzkr)localObject4);
    zzf = localzzkb4;
    Object localObject5 = zzkr.zzb;
    zzkb localzzkb5 = new zzkb("INT32", 4, 4, (zzkd)localObject1, (zzkr)localObject5);
    zzg = localzzkb5;
    zzkb localzzkb6 = new zzkb("FIXED64", 5, 5, (zzkd)localObject1, (zzkr)localObject4);
    zzh = localzzkb6;
    zzkb localzzkb7 = new zzkb("FIXED32", 6, 6, (zzkd)localObject1, (zzkr)localObject5);
    zzi = localzzkb7;
    Object localObject6 = zzkr.zzf;
    zzkb localzzkb8 = new zzkb("BOOL", 7, 7, (zzkd)localObject1, (zzkr)localObject6);
    zzj = localzzkb8;
    Object localObject7 = zzkr.zzg;
    zzkb localzzkb9 = new zzkb("STRING", 8, 8, (zzkd)localObject1, (zzkr)localObject7);
    zzk = localzzkb9;
    Object localObject8 = zzkr.zzj;
    zzkb localzzkb10 = new zzkb("MESSAGE", 9, 9, (zzkd)localObject1, (zzkr)localObject8);
    zzl = localzzkb10;
    Object localObject9 = zzkr.zzh;
    zzkb localzzkb11 = new zzkb("BYTES", 10, 10, (zzkd)localObject1, (zzkr)localObject9);
    zzm = localzzkb11;
    zzkb localzzkb12 = new zzkb("UINT32", 11, 11, (zzkd)localObject1, (zzkr)localObject5);
    zzn = localzzkb12;
    Object localObject10 = zzkr.zzi;
    zzkb localzzkb13 = new zzkb("ENUM", 12, 12, (zzkd)localObject1, (zzkr)localObject10);
    zzo = localzzkb13;
    zzkb localzzkb14 = new zzkb("SFIXED32", 13, 13, (zzkd)localObject1, (zzkr)localObject5);
    zzp = localzzkb14;
    Object localObject11 = new zzkb("SFIXED64", 14, 14, (zzkd)localObject1, (zzkr)localObject4);
    zzq = (zzkb)localObject11;
    zzkb localzzkb15 = new zzkb("SINT32", 15, 15, (zzkd)localObject1, (zzkr)localObject5);
    zzr = localzzkb15;
    zzkb localzzkb16 = new zzkb("SINT64", 16, 16, (zzkd)localObject1, (zzkr)localObject4);
    zzs = localzzkb16;
    zzkb localzzkb17 = new zzkb("GROUP", 17, 17, (zzkd)localObject1, (zzkr)localObject8);
    zzt = localzzkb17;
    Object localObject12 = zzkd.zzb;
    zzkb localzzkb18 = new zzkb("DOUBLE_LIST", 18, 18, (zzkd)localObject12, (zzkr)localObject2);
    zzu = localzzkb18;
    zzkb localzzkb19 = new zzkb("FLOAT_LIST", 19, 19, (zzkd)localObject12, (zzkr)localObject3);
    zzv = localzzkb19;
    localObject1 = new zzkb("INT64_LIST", 20, 20, (zzkd)localObject12, (zzkr)localObject4);
    zzw = (zzkb)localObject1;
    zzkb localzzkb20 = new zzkb("UINT64_LIST", 21, 21, (zzkd)localObject12, (zzkr)localObject4);
    zzx = localzzkb20;
    zzkb localzzkb21 = new zzkb("INT32_LIST", 22, 22, (zzkd)localObject12, (zzkr)localObject5);
    zzy = localzzkb21;
    zzkb localzzkb22 = new zzkb("FIXED64_LIST", 23, 23, (zzkd)localObject12, (zzkr)localObject4);
    zzz = localzzkb22;
    zzkb localzzkb23 = new zzkb("FIXED32_LIST", 24, 24, (zzkd)localObject12, (zzkr)localObject5);
    zzaa = localzzkb23;
    zzkb localzzkb24 = new zzkb("BOOL_LIST", 25, 25, (zzkd)localObject12, (zzkr)localObject6);
    zzab = localzzkb24;
    zzkb localzzkb25 = new zzkb("STRING_LIST", 26, 26, (zzkd)localObject12, (zzkr)localObject7);
    zzac = localzzkb25;
    localObject7 = new zzkb("MESSAGE_LIST", 27, 27, (zzkd)localObject12, (zzkr)localObject8);
    zzad = (zzkb)localObject7;
    zzkb localzzkb26 = new zzkb("BYTES_LIST", 28, 28, (zzkd)localObject12, (zzkr)localObject9);
    zzae = localzzkb26;
    zzkb localzzkb27 = new zzkb("UINT32_LIST", 29, 29, (zzkd)localObject12, (zzkr)localObject5);
    zzaf = localzzkb27;
    localObject9 = new zzkb("ENUM_LIST", 30, 30, (zzkd)localObject12, (zzkr)localObject10);
    zzag = (zzkb)localObject9;
    zzkb localzzkb28 = new zzkb("SFIXED32_LIST", 31, 31, (zzkd)localObject12, (zzkr)localObject5);
    zzah = localzzkb28;
    zzkb localzzkb29 = new zzkb("SFIXED64_LIST", 32, 32, (zzkd)localObject12, (zzkr)localObject4);
    zzai = localzzkb29;
    zzkb localzzkb30 = new zzkb("SINT32_LIST", 33, 33, (zzkd)localObject12, (zzkr)localObject5);
    zzaj = localzzkb30;
    zzkb localzzkb31 = new zzkb("SINT64_LIST", 34, 34, (zzkd)localObject12, (zzkr)localObject4);
    zzak = localzzkb31;
    zzkd localzzkd = zzkd.zzc;
    localObject2 = new zzkb("DOUBLE_LIST_PACKED", 35, 35, localzzkd, (zzkr)localObject2);
    zza = (zzkb)localObject2;
    zzkb localzzkb32 = new zzkb("FLOAT_LIST_PACKED", 36, 36, localzzkd, (zzkr)localObject3);
    zzal = localzzkb32;
    zzkb localzzkb33 = new zzkb("INT64_LIST_PACKED", 37, 37, localzzkd, (zzkr)localObject4);
    zzam = localzzkb33;
    zzkb localzzkb34 = new zzkb("UINT64_LIST_PACKED", 38, 38, localzzkd, (zzkr)localObject4);
    zzan = localzzkb34;
    zzkb localzzkb35 = new zzkb("INT32_LIST_PACKED", 39, 39, localzzkd, (zzkr)localObject5);
    zzao = localzzkb35;
    zzkb localzzkb36 = new zzkb("FIXED64_LIST_PACKED", 40, 40, localzzkd, (zzkr)localObject4);
    zzap = localzzkb36;
    localObject3 = new zzkb("FIXED32_LIST_PACKED", 41, 41, localzzkd, (zzkr)localObject5);
    zzaq = (zzkb)localObject3;
    localObject6 = new zzkb("BOOL_LIST_PACKED", 42, 42, localzzkd, (zzkr)localObject6);
    zzar = (zzkb)localObject6;
    zzkb localzzkb37 = new zzkb("UINT32_LIST_PACKED", 43, 43, localzzkd, (zzkr)localObject5);
    zzas = localzzkb37;
    zzkb localzzkb38 = new zzkb("ENUM_LIST_PACKED", 44, 44, localzzkd, (zzkr)localObject10);
    zzat = localzzkb38;
    localObject10 = new zzkb("SFIXED32_LIST_PACKED", 45, 45, localzzkd, (zzkr)localObject5);
    zzau = (zzkb)localObject10;
    zzkb localzzkb39 = new zzkb("SFIXED64_LIST_PACKED", 46, 46, localzzkd, (zzkr)localObject4);
    zzav = localzzkb39;
    localObject5 = new zzkb("SINT32_LIST_PACKED", 47, 47, localzzkd, (zzkr)localObject5);
    zzaw = (zzkb)localObject5;
    localObject4 = new zzkb("SINT64_LIST_PACKED", 48, 48, localzzkd, (zzkr)localObject4);
    zzb = (zzkb)localObject4;
    localObject8 = new zzkb("GROUP_LIST", 49, 49, (zzkd)localObject12, (zzkr)localObject8);
    zzax = (zzkb)localObject8;
    localObject12 = new zzkb("MAP", 50, 50, zzkd.zzd, zzkr.zza);
    zzay = (zzkb)localObject12;
    int i = 0;
    zzba = new zzkb[] { localzzkb1, localzzkb2, localzzkb3, localzzkb4, localzzkb5, localzzkb6, localzzkb7, localzzkb8, localzzkb9, localzzkb10, localzzkb11, localzzkb12, localzzkb13, localzzkb14, localObject11, localzzkb15, localzzkb16, localzzkb17, localzzkb18, localzzkb19, localObject1, localzzkb20, localzzkb21, localzzkb22, localzzkb23, localzzkb24, localzzkb25, localObject7, localzzkb26, localzzkb27, localObject9, localzzkb28, localzzkb29, localzzkb30, localzzkb31, localObject2, localzzkb32, localzzkb33, localzzkb34, localzzkb35, localzzkb36, localObject3, localObject6, localzzkb37, localzzkb38, localObject10, localzzkb39, localObject5, localObject4, localObject8, localObject12 };
    localObject11 = values();
    zzaz = new zzkb[localObject11.length];
    int j = localObject11.length;
    while (i < j)
    {
      localzzkb6 = localObject11[i];
      zzaz[zzbb] = localzzkb6;
      i++;
    }
  }
  
  private zzkb(int paramInt, zzkd paramzzkd, zzkr paramzzkr)
  {
    zzbb = paramInt;
    ??? = paramzzkd.ordinal();
    if ((??? == 1) || (??? == 3)) {
      paramzzkr.zza();
    }
    if (paramzzkd == zzkd.zza) {
      ??? = zzka.zza[paramzzkr.ordinal()];
    }
  }
  
  public final int zza()
  {
    return zzbb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzkb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */