package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes.dex */
final class zzamo {
    public static String zza(zzaiw zzaiwVar) {
        String str;
        zzamr zzamrVar = new zzamr(zzaiwVar);
        StringBuilder sb2 = new StringBuilder(zzamrVar.zza());
        for (int i10 = 0; i10 < zzamrVar.zza(); i10++) {
            int zza = zzamrVar.zza(i10);
            if (zza == 34) {
                str = "\\\"";
            } else if (zza == 39) {
                str = "\\'";
            } else if (zza != 92) {
                switch (zza) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (zza < 32 || zza > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((zza >>> 6) & 3) + 48));
                            sb2.append((char) (((zza >>> 3) & 7) + 48));
                            zza = (zza & 7) + 48;
                        }
                        sb2.append((char) zza);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }
}
