package com.google.android.gms.internal.p002firebaseauthapi;

import b8.c;
import io.flutter.plugins.firebase.auth.Constants;
import m6.j;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzagn implements zzaeb {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private c zze;
    private String zzf;
    private String zzg;

    public zzagn(int i10) {
        this.zza = zza(i10);
    }

    private zzagn(int i10, c cVar, String str, String str2, String str3, String str4, String str5) {
        this.zza = zza(7);
        j.i(cVar);
        this.zze = cVar;
        this.zzb = null;
        this.zzc = str2;
        this.zzd = str3;
        this.zzf = null;
        this.zzg = null;
    }

    public static zzagn zza(c cVar, String str, String str2) {
        j.e(str);
        j.e(str2);
        j.i(cVar);
        return new zzagn(7, cVar, null, str2, str, null, null);
    }

    private static String zza(int i10) {
        return i10 != 1 ? i10 != 4 ? i10 != 6 ? i10 != 7 ? "REQUEST_TYPE_UNSET_ENUM_VALUE" : "VERIFY_AND_CHANGE_EMAIL" : "EMAIL_SIGNIN" : "VERIFY_EMAIL" : "PASSWORD_RESET";
    }

    public final zzagn zza(c cVar) {
        j.i(cVar);
        this.zze = cVar;
        return this;
    }

    public final zzagn zza(String str) {
        this.zzg = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaeb
    public final String zza() {
        int i10;
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        str.getClass();
        i10 = 1;
        switch (str) {
            case "PASSWORD_RESET":
                break;
            case "VERIFY_EMAIL":
                i10 = 4;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                i10 = 7;
                break;
            case "EMAIL_SIGNIN":
                i10 = 6;
                break;
            default:
                i10 = 0;
                break;
        }
        jSONObject.put("requestType", i10);
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put(Constants.EMAIL, str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("newEmail", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put(Constants.ID_TOKEN, str4);
        }
        c cVar = this.zze;
        if (cVar != null) {
            jSONObject.put("androidInstallApp", cVar.f2041e);
            jSONObject.put("canHandleCodeInApp", this.zze.f2042o);
            String str5 = this.zze.f2037a;
            if (str5 != null) {
                jSONObject.put("continueUrl", str5);
            }
            String str6 = this.zze.f2038b;
            if (str6 != null) {
                jSONObject.put("iosBundleId", str6);
            }
            String str7 = this.zze.f2039c;
            if (str7 != null) {
                jSONObject.put("iosAppStoreId", str7);
            }
            String str8 = this.zze.f2040d;
            if (str8 != null) {
                jSONObject.put("androidPackageName", str8);
            }
            String str9 = this.zze.f;
            if (str9 != null) {
                jSONObject.put("androidMinimumVersion", str9);
            }
            String str10 = this.zze.f2045r;
            if (str10 != null) {
                jSONObject.put("dynamicLinkDomain", str10);
            }
            String str11 = this.zze.f2046s;
            if (str11 != null) {
                jSONObject.put("linkDomain", str11);
            }
        }
        String str12 = this.zzf;
        if (str12 != null) {
            jSONObject.put("tenantId", str12);
        }
        String str13 = this.zzg;
        if (str13 != null) {
            zzail.zza(jSONObject, "captchaResp", str13);
        } else {
            zzail.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public final c zzb() {
        return this.zze;
    }

    public final zzagn zzb(String str) {
        j.e(str);
        this.zzb = str;
        return this;
    }

    public final zzagn zzc(String str) {
        this.zzf = str;
        return this;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final zzagn zzd(String str) {
        j.e(str);
        this.zzd = str;
        return this;
    }

    public final String zzd() {
        return this.zzd;
    }
}
