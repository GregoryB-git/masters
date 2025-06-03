package c8;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.android.gms.internal.p002firebaseauthapi.zzahc;
import com.google.android.gms.internal.p002firebaseauthapi.zzzp;
import io.flutter.plugins.firebase.analytics.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e extends n6.a implements b8.o0 {
    public static final Parcelable.Creator<e> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    public String f2430a;

    /* renamed from: b, reason: collision with root package name */
    public String f2431b;

    /* renamed from: c, reason: collision with root package name */
    public String f2432c;

    /* renamed from: d, reason: collision with root package name */
    public String f2433d;

    /* renamed from: e, reason: collision with root package name */
    public Uri f2434e;
    public String f;

    /* renamed from: o, reason: collision with root package name */
    public String f2435o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2436p;

    /* renamed from: q, reason: collision with root package name */
    public String f2437q;

    public e(zzagl zzaglVar) {
        m6.j.i(zzaglVar);
        m6.j.e("firebase");
        String zzi = zzaglVar.zzi();
        m6.j.e(zzi);
        this.f2430a = zzi;
        this.f2431b = "firebase";
        this.f = zzaglVar.zzh();
        this.f2432c = zzaglVar.zzg();
        Uri zzc = zzaglVar.zzc();
        if (zzc != null) {
            this.f2433d = zzc.toString();
            this.f2434e = zzc;
        }
        this.f2436p = zzaglVar.zzm();
        this.f2437q = null;
        this.f2435o = zzaglVar.zzj();
    }

    public e(zzahc zzahcVar) {
        m6.j.i(zzahcVar);
        this.f2430a = zzahcVar.zzd();
        String zzf = zzahcVar.zzf();
        m6.j.e(zzf);
        this.f2431b = zzf;
        this.f2432c = zzahcVar.zzb();
        Uri zza = zzahcVar.zza();
        if (zza != null) {
            this.f2433d = zza.toString();
            this.f2434e = zza;
        }
        this.f = zzahcVar.zzc();
        this.f2435o = zzahcVar.zze();
        this.f2436p = false;
        this.f2437q = zzahcVar.zzg();
    }

    public e(String str, String str2, String str3, String str4, String str5, String str6, boolean z10, String str7) {
        this.f2430a = str;
        this.f2431b = str2;
        this.f = str3;
        this.f2435o = str4;
        this.f2432c = str5;
        this.f2433d = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.f2434e = Uri.parse(this.f2433d);
        }
        this.f2436p = z10;
        this.f2437q = str7;
    }

    public static e D(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new e(jSONObject.optString(Constants.USER_ID), jSONObject.optString(io.flutter.plugins.firebase.auth.Constants.PROVIDER_ID), jSONObject.optString(io.flutter.plugins.firebase.auth.Constants.EMAIL), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e10) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new zzzp(e10);
        }
    }

    @Override // b8.o0
    public final String A() {
        return this.f;
    }

    public final String E() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(Constants.USER_ID, this.f2430a);
            jSONObject.putOpt(io.flutter.plugins.firebase.auth.Constants.PROVIDER_ID, this.f2431b);
            jSONObject.putOpt("displayName", this.f2432c);
            jSONObject.putOpt("photoUrl", this.f2433d);
            jSONObject.putOpt(io.flutter.plugins.firebase.auth.Constants.EMAIL, this.f);
            jSONObject.putOpt("phoneNumber", this.f2435o);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f2436p));
            jSONObject.putOpt("rawUserInfo", this.f2437q);
            return jSONObject.toString();
        } catch (JSONException e10) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzzp(e10);
        }
    }

    @Override // b8.o0
    public final String a() {
        return this.f2430a;
    }

    @Override // b8.o0
    public final Uri h() {
        if (!TextUtils.isEmpty(this.f2433d) && this.f2434e == null) {
            this.f2434e = Uri.parse(this.f2433d);
        }
        return this.f2434e;
    }

    @Override // b8.o0
    public final boolean k() {
        return this.f2436p;
    }

    @Override // b8.o0
    public final String m() {
        return this.f2435o;
    }

    @Override // b8.o0
    public final String o() {
        return this.f2432c;
    }

    @Override // b8.o0
    public final String q() {
        return this.f2431b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 1, this.f2430a, false);
        b.z.F(parcel, 2, this.f2431b, false);
        b.z.F(parcel, 3, this.f2432c, false);
        b.z.F(parcel, 4, this.f2433d, false);
        b.z.F(parcel, 5, this.f, false);
        b.z.F(parcel, 6, this.f2435o, false);
        b.z.t(parcel, 7, this.f2436p);
        b.z.F(parcel, 8, this.f2437q, false);
        b.z.L(J, parcel);
    }
}
