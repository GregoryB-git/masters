package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

public enum zzbv
{
  private static final Map<Integer, zzbv> zzbo;
  private final int zzbq;
  
  static
  {
    zzbv localzzbv1 = new zzbv("ADD", 0, 0);
    zza = localzzbv1;
    zzbv localzzbv2 = new zzbv("AND", 1, 1);
    zzb = localzzbv2;
    zzbv localzzbv3 = new zzbv("APPLY", 2, 2);
    zzc = localzzbv3;
    zzbv localzzbv4 = new zzbv("ASSIGN", 3, 3);
    zzd = localzzbv4;
    zzbv localzzbv5 = new zzbv("BITWISE_AND", 4, 56);
    zze = localzzbv5;
    zzbv localzzbv6 = new zzbv("BITWISE_LEFT_SHIFT", 5, 57);
    zzf = localzzbv6;
    zzbv localzzbv7 = new zzbv("BITWISE_NOT", 6, 58);
    zzg = localzzbv7;
    zzbv localzzbv8 = new zzbv("BITWISE_OR", 7, 59);
    zzh = localzzbv8;
    zzbv localzzbv9 = new zzbv("BITWISE_RIGHT_SHIFT", 8, 60);
    zzi = localzzbv9;
    zzbv localzzbv10 = new zzbv("BITWISE_UNSIGNED_RIGHT_SHIFT", 9, 61);
    zzj = localzzbv10;
    zzbv localzzbv11 = new zzbv("BITWISE_XOR", 10, 62);
    zzk = localzzbv11;
    zzbv localzzbv12 = new zzbv("BLOCK", 11, 53);
    zzl = localzzbv12;
    zzbv localzzbv13 = new zzbv("BREAK", 12, 4);
    zzm = localzzbv13;
    zzbv localzzbv14 = new zzbv("CASE", 13, 5);
    zzn = localzzbv14;
    zzbv localzzbv15 = new zzbv("CONST", 14, 52);
    zzo = localzzbv15;
    zzbv localzzbv16 = new zzbv("CONTINUE", 15, 6);
    zzp = localzzbv16;
    zzbv localzzbv17 = new zzbv("CONTROL", 16, 49);
    zzbk = localzzbv17;
    zzbv localzzbv18 = new zzbv("CREATE_ARRAY", 17, 7);
    zzq = localzzbv18;
    zzbv localzzbv19 = new zzbv("CREATE_OBJECT", 18, 8);
    zzr = localzzbv19;
    zzbv localzzbv20 = new zzbv("DEFAULT", 19, 9);
    zzs = localzzbv20;
    zzbv localzzbv21 = new zzbv("DEFINE_FUNCTION", 20, 50);
    zzt = localzzbv21;
    zzbv localzzbv22 = new zzbv("DIVIDE", 21, 10);
    zzu = localzzbv22;
    zzbv localzzbv23 = new zzbv("DO", 22, 11);
    zzbl = localzzbv23;
    zzbv localzzbv24 = new zzbv("EQUALS", 23, 12);
    zzv = localzzbv24;
    zzbv localzzbv25 = new zzbv("EXPRESSION_LIST", 24, 13);
    zzw = localzzbv25;
    zzbv localzzbv26 = new zzbv("FN", 25, 51);
    zzx = localzzbv26;
    zzbv localzzbv27 = new zzbv("FOR_IN", 26, 47);
    zzy = localzzbv27;
    zzbv localzzbv28 = new zzbv("FOR_IN_CONST", 27, 54);
    zzz = localzzbv28;
    zzbv localzzbv29 = new zzbv("FOR_IN_LET", 28, 55);
    zzaa = localzzbv29;
    zzbv localzzbv30 = new zzbv("FOR_LET", 29, 63);
    zzab = localzzbv30;
    zzbv localzzbv31 = new zzbv("FOR_OF", 30, 64);
    zzac = localzzbv31;
    zzbv localzzbv32 = new zzbv("FOR_OF_CONST", 31, 65);
    zzad = localzzbv32;
    zzbv localzzbv33 = new zzbv("FOR_OF_LET", 32, 66);
    zzae = localzzbv33;
    zzbv localzzbv34 = new zzbv("GET", 33, 15);
    zzaf = localzzbv34;
    zzbv localzzbv35 = new zzbv("GET_CONTAINER_VARIABLE", 34, 48);
    zzbm = localzzbv35;
    zzbv localzzbv36 = new zzbv("GET_INDEX", 35, 16);
    zzag = localzzbv36;
    zzbv localzzbv37 = new zzbv("GET_PROPERTY", 36, 17);
    zzah = localzzbv37;
    zzbv localzzbv38 = new zzbv("GREATER_THAN", 37, 18);
    zzai = localzzbv38;
    zzbv localzzbv39 = new zzbv("GREATER_THAN_EQUALS", 38, 19);
    zzaj = localzzbv39;
    zzbv localzzbv40 = new zzbv("IDENTITY_EQUALS", 39, 20);
    zzak = localzzbv40;
    zzbv localzzbv41 = new zzbv("IDENTITY_NOT_EQUALS", 40, 21);
    zzal = localzzbv41;
    zzbv localzzbv42 = new zzbv("IF", 41, 22);
    zzam = localzzbv42;
    zzbv localzzbv43 = new zzbv("LESS_THAN", 42, 23);
    zzan = localzzbv43;
    zzbv localzzbv44 = new zzbv("LESS_THAN_EQUALS", 43, 24);
    zzao = localzzbv44;
    zzbv localzzbv45 = new zzbv("MODULUS", 44, 25);
    zzap = localzzbv45;
    zzbv localzzbv46 = new zzbv("MULTIPLY", 45, 26);
    zzaq = localzzbv46;
    zzbv localzzbv47 = new zzbv("NEGATE", 46, 27);
    zzar = localzzbv47;
    zzbv localzzbv48 = new zzbv("NOT", 47, 28);
    zzas = localzzbv48;
    zzbv localzzbv49 = new zzbv("NOT_EQUALS", 48, 29);
    zzat = localzzbv49;
    zzbv localzzbv50 = new zzbv("NULL", 49, 45);
    zzau = localzzbv50;
    zzbv localzzbv51 = new zzbv("OR", 50, 30);
    zzav = localzzbv51;
    zzbv localzzbv52 = new zzbv("PLUS_EQUALS", 51, 31);
    zzbn = localzzbv52;
    zzbv localzzbv53 = new zzbv("POST_DECREMENT", 52, 32);
    zzaw = localzzbv53;
    zzbv localzzbv54 = new zzbv("POST_INCREMENT", 53, 33);
    zzax = localzzbv54;
    zzbv localzzbv55 = new zzbv("QUOTE", 54, 46);
    zzay = localzzbv55;
    zzbv localzzbv56 = new zzbv("PRE_DECREMENT", 55, 34);
    zzaz = localzzbv56;
    zzbv localzzbv57 = new zzbv("PRE_INCREMENT", 56, 35);
    zzba = localzzbv57;
    zzbv localzzbv58 = new zzbv("RETURN", 57, 36);
    zzbb = localzzbv58;
    zzbv localzzbv59 = new zzbv("SET_PROPERTY", 58, 43);
    zzbc = localzzbv59;
    zzbv localzzbv60 = new zzbv("SUBTRACT", 59, 37);
    zzbd = localzzbv60;
    Object localObject = new zzbv("SWITCH", 60, 38);
    zzbe = (zzbv)localObject;
    zzbv localzzbv61 = new zzbv("TERNARY", 61, 39);
    zzbf = localzzbv61;
    zzbv localzzbv62 = new zzbv("TYPEOF", 62, 40);
    zzbg = localzzbv62;
    zzbv localzzbv63 = new zzbv("UNDEFINED", 63, 44);
    zzbh = localzzbv63;
    zzbv localzzbv64 = new zzbv("VAR", 64, 41);
    zzbi = localzzbv64;
    zzbv localzzbv65 = new zzbv("WHILE", 65, 42);
    zzbj = localzzbv65;
    zzbp = new zzbv[] { localzzbv1, localzzbv2, localzzbv3, localzzbv4, localzzbv5, localzzbv6, localzzbv7, localzzbv8, localzzbv9, localzzbv10, localzzbv11, localzzbv12, localzzbv13, localzzbv14, localzzbv15, localzzbv16, localzzbv17, localzzbv18, localzzbv19, localzzbv20, localzzbv21, localzzbv22, localzzbv23, localzzbv24, localzzbv25, localzzbv26, localzzbv27, localzzbv28, localzzbv29, localzzbv30, localzzbv31, localzzbv32, localzzbv33, localzzbv34, localzzbv35, localzzbv36, localzzbv37, localzzbv38, localzzbv39, localzzbv40, localzzbv41, localzzbv42, localzzbv43, localzzbv44, localzzbv45, localzzbv46, localzzbv47, localzzbv48, localzzbv49, localzzbv50, localzzbv51, localzzbv52, localzzbv53, localzzbv54, localzzbv55, localzzbv56, localzzbv57, localzzbv58, localzzbv59, localzzbv60, localObject, localzzbv61, localzzbv62, localzzbv63, localzzbv64, localzzbv65 };
    zzbo = new HashMap();
    for (localzzbv43 : values()) {
      zzbo.put(Integer.valueOf(zzbq), localzzbv43);
    }
  }
  
  private zzbv(int paramInt)
  {
    if (paramInt <= 100)
    {
      zzbq = paramInt;
      return;
    }
    throw new AssertionError("Native functions over 100 are reserved for runtime implementations.");
  }
  
  public static zzbv zza(int paramInt)
  {
    return (zzbv)zzbo.get(Integer.valueOf(paramInt));
  }
  
  public final String toString()
  {
    return Integer.valueOf(zzbq).toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzbv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */