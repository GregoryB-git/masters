package com.google.android.recaptcha.internal;

public enum zzmu
{
  private static final zzmu[] zzZ;
  private final int zzab;
  
  static
  {
    Object localObject1 = zzno.zze;
    zzmu localzzmu1 = new zzmu("DOUBLE", 0, 0, 1, (zzno)localObject1);
    zza = localzzmu1;
    Object localObject2 = zzno.zzd;
    zzmu localzzmu2 = new zzmu("FLOAT", 1, 1, 1, (zzno)localObject2);
    zzb = localzzmu2;
    Object localObject3 = zzno.zzc;
    zzmu localzzmu3 = new zzmu("INT64", 2, 2, 1, (zzno)localObject3);
    zzc = localzzmu3;
    zzmu localzzmu4 = new zzmu("UINT64", 3, 3, 1, (zzno)localObject3);
    zzd = localzzmu4;
    Object localObject4 = zzno.zzb;
    zzmu localzzmu5 = new zzmu("INT32", 4, 4, 1, (zzno)localObject4);
    zze = localzzmu5;
    zzmu localzzmu6 = new zzmu("FIXED64", 5, 5, 1, (zzno)localObject3);
    zzf = localzzmu6;
    zzmu localzzmu7 = new zzmu("FIXED32", 6, 6, 1, (zzno)localObject4);
    zzg = localzzmu7;
    Object localObject5 = zzno.zzf;
    Object localObject6 = new zzmu("BOOL", 7, 7, 1, (zzno)localObject5);
    zzh = (zzmu)localObject6;
    Object localObject7 = zzno.zzg;
    zzmu localzzmu8 = new zzmu("STRING", 8, 8, 1, (zzno)localObject7);
    zzi = localzzmu8;
    Object localObject8 = zzno.zzj;
    zzmu localzzmu9 = new zzmu("MESSAGE", 9, 9, 1, (zzno)localObject8);
    zzj = localzzmu9;
    Object localObject9 = zzno.zzh;
    zzmu localzzmu10 = new zzmu("BYTES", 10, 10, 1, (zzno)localObject9);
    zzk = localzzmu10;
    zzmu localzzmu11 = new zzmu("UINT32", 11, 11, 1, (zzno)localObject4);
    zzl = localzzmu11;
    Object localObject10 = zzno.zzi;
    zzmu localzzmu12 = new zzmu("ENUM", 12, 12, 1, (zzno)localObject10);
    zzm = localzzmu12;
    zzmu localzzmu13 = new zzmu("SFIXED32", 13, 13, 1, (zzno)localObject4);
    zzn = localzzmu13;
    zzmu localzzmu14 = new zzmu("SFIXED64", 14, 14, 1, (zzno)localObject3);
    zzo = localzzmu14;
    zzmu localzzmu15 = new zzmu("SINT32", 15, 15, 1, (zzno)localObject4);
    zzp = localzzmu15;
    zzmu localzzmu16 = new zzmu("SINT64", 16, 16, 1, (zzno)localObject3);
    zzq = localzzmu16;
    zzmu localzzmu17 = new zzmu("GROUP", 17, 17, 1, (zzno)localObject8);
    zzr = localzzmu17;
    zzmu localzzmu18 = new zzmu("DOUBLE_LIST", 18, 18, 2, (zzno)localObject1);
    zzs = localzzmu18;
    zzmu localzzmu19 = new zzmu("FLOAT_LIST", 19, 19, 2, (zzno)localObject2);
    zzt = localzzmu19;
    zzmu localzzmu20 = new zzmu("INT64_LIST", 20, 20, 2, (zzno)localObject3);
    zzu = localzzmu20;
    zzmu localzzmu21 = new zzmu("UINT64_LIST", 21, 21, 2, (zzno)localObject3);
    zzv = localzzmu21;
    zzmu localzzmu22 = new zzmu("INT32_LIST", 22, 22, 2, (zzno)localObject4);
    zzw = localzzmu22;
    zzmu localzzmu23 = new zzmu("FIXED64_LIST", 23, 23, 2, (zzno)localObject3);
    zzx = localzzmu23;
    zzmu localzzmu24 = new zzmu("FIXED32_LIST", 24, 24, 2, (zzno)localObject4);
    zzy = localzzmu24;
    zzmu localzzmu25 = new zzmu("BOOL_LIST", 25, 25, 2, (zzno)localObject5);
    zzz = localzzmu25;
    localObject7 = new zzmu("STRING_LIST", 26, 26, 2, (zzno)localObject7);
    zzA = (zzmu)localObject7;
    zzmu localzzmu26 = new zzmu("MESSAGE_LIST", 27, 27, 2, (zzno)localObject8);
    zzB = localzzmu26;
    localObject9 = new zzmu("BYTES_LIST", 28, 28, 2, (zzno)localObject9);
    zzC = (zzmu)localObject9;
    zzmu localzzmu27 = new zzmu("UINT32_LIST", 29, 29, 2, (zzno)localObject4);
    zzD = localzzmu27;
    zzmu localzzmu28 = new zzmu("ENUM_LIST", 30, 30, 2, (zzno)localObject10);
    zzE = localzzmu28;
    zzmu localzzmu29 = new zzmu("SFIXED32_LIST", 31, 31, 2, (zzno)localObject4);
    zzF = localzzmu29;
    zzmu localzzmu30 = new zzmu("SFIXED64_LIST", 32, 32, 2, (zzno)localObject3);
    zzG = localzzmu30;
    zzmu localzzmu31 = new zzmu("SINT32_LIST", 33, 33, 2, (zzno)localObject4);
    zzH = localzzmu31;
    zzmu localzzmu32 = new zzmu("SINT64_LIST", 34, 34, 2, (zzno)localObject3);
    zzI = localzzmu32;
    localObject1 = new zzmu("DOUBLE_LIST_PACKED", 35, 35, 3, (zzno)localObject1);
    zzJ = (zzmu)localObject1;
    zzmu localzzmu33 = new zzmu("FLOAT_LIST_PACKED", 36, 36, 3, (zzno)localObject2);
    zzK = localzzmu33;
    zzmu localzzmu34 = new zzmu("INT64_LIST_PACKED", 37, 37, 3, (zzno)localObject3);
    zzL = localzzmu34;
    zzmu localzzmu35 = new zzmu("UINT64_LIST_PACKED", 38, 38, 3, (zzno)localObject3);
    zzM = localzzmu35;
    zzmu localzzmu36 = new zzmu("INT32_LIST_PACKED", 39, 39, 3, (zzno)localObject4);
    zzN = localzzmu36;
    zzmu localzzmu37 = new zzmu("FIXED64_LIST_PACKED", 40, 40, 3, (zzno)localObject3);
    zzO = localzzmu37;
    localObject2 = new zzmu("FIXED32_LIST_PACKED", 41, 41, 3, (zzno)localObject4);
    zzP = (zzmu)localObject2;
    zzmu localzzmu38 = new zzmu("BOOL_LIST_PACKED", 42, 42, 3, (zzno)localObject5);
    zzQ = localzzmu38;
    localObject5 = new zzmu("UINT32_LIST_PACKED", 43, 43, 3, (zzno)localObject4);
    zzR = (zzmu)localObject5;
    zzmu localzzmu39 = new zzmu("ENUM_LIST_PACKED", 44, 44, 3, (zzno)localObject10);
    zzS = localzzmu39;
    localObject10 = new zzmu("SFIXED32_LIST_PACKED", 45, 45, 3, (zzno)localObject4);
    zzT = (zzmu)localObject10;
    zzmu localzzmu40 = new zzmu("SFIXED64_LIST_PACKED", 46, 46, 3, (zzno)localObject3);
    zzU = localzzmu40;
    localObject4 = new zzmu("SINT32_LIST_PACKED", 47, 47, 3, (zzno)localObject4);
    zzV = (zzmu)localObject4;
    localObject3 = new zzmu("SINT64_LIST_PACKED", 48, 48, 3, (zzno)localObject3);
    zzW = (zzmu)localObject3;
    zzmu localzzmu41 = new zzmu("GROUP_LIST", 49, 49, 2, (zzno)localObject8);
    zzX = localzzmu41;
    localObject8 = new zzmu("MAP", 50, 50, 4, zzno.zza);
    zzY = (zzmu)localObject8;
    int i = 0;
    zzaa = new zzmu[] { localzzmu1, localzzmu2, localzzmu3, localzzmu4, localzzmu5, localzzmu6, localzzmu7, localObject6, localzzmu8, localzzmu9, localzzmu10, localzzmu11, localzzmu12, localzzmu13, localzzmu14, localzzmu15, localzzmu16, localzzmu17, localzzmu18, localzzmu19, localzzmu20, localzzmu21, localzzmu22, localzzmu23, localzzmu24, localzzmu25, localObject7, localzzmu26, localObject9, localzzmu27, localzzmu28, localzzmu29, localzzmu30, localzzmu31, localzzmu32, localObject1, localzzmu33, localzzmu34, localzzmu35, localzzmu36, localzzmu37, localObject2, localzzmu38, localObject5, localzzmu39, localObject10, localzzmu40, localObject4, localObject3, localzzmu41, localObject8 };
    localObject6 = values();
    int j = localObject6.length;
    zzZ = new zzmu[j];
    while (i < j)
    {
      localzzmu11 = localObject6[i];
      int k = zzab;
      zzZ[k] = localzzmu11;
      i++;
    }
  }
  
  private zzmu(int paramInt2, int paramInt3, zzno paramzzno)
  {
    zzab = paramInt2;
    paramInt1 = paramInt3 - 1;
    if ((paramInt1 == 1) || (paramInt1 == 3)) {
      paramzzno.zza();
    }
    if (paramInt3 == 1)
    {
      paramString = zzno.zza;
      paramzzno.ordinal();
    }
  }
  
  public final int zza()
  {
    return zzab;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzmu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */