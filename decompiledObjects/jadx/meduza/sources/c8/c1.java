package c8;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzbg;
import com.google.android.gms.internal.p002firebaseauthapi.zzbj;
import com.google.android.gms.internal.p002firebaseauthapi.zzbz;
import com.google.android.gms.internal.p002firebaseauthapi.zzke;
import com.google.android.gms.internal.p002firebaseauthapi.zzkh;
import com.google.android.gms.internal.p002firebaseauthapi.zzkq;
import com.google.android.gms.internal.p002firebaseauthapi.zzmi;
import com.google.android.gms.internal.p002firebaseauthapi.zzp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: c, reason: collision with root package name */
    public static c1 f2421c;

    /* renamed from: a, reason: collision with root package name */
    public final String f2422a;

    /* renamed from: b, reason: collision with root package name */
    public final zzmi f2423b;

    public c1(Context context, String str) {
        zzmi zzmiVar;
        this.f2422a = str;
        try {
            zzke.zza();
            zzmi.zza zza = new zzmi.zza().zza(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", str)).zza(zzkq.zza);
            zza.zza(String.format("android-keystore://firebear_master_key_id.%s", str));
            zzmiVar = zza.zza();
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n" + e10.getMessage());
            zzmiVar = null;
        }
        this.f2423b = zzmiVar;
    }

    public static c1 a(Context context, String str) {
        c1 c1Var = f2421c;
        if (c1Var == null || !zzp.zza(c1Var.f2422a, str)) {
            f2421c = new c1(context, str);
        }
        return f2421c;
    }

    public final String b() {
        if (this.f2423b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzbz zza = zzbg.zza(byteArrayOutputStream);
        try {
            synchronized (this.f2423b) {
                this.f2423b.zza().zza().zza(zza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n" + e10.getMessage());
            return null;
        }
    }

    public final String c(String str) {
        String str2;
        zzmi zzmiVar = this.f2423b;
        if (zzmiVar == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzmiVar) {
                str2 = new String(((zzbj) this.f2423b.zza().zza(zzkh.zza(), zzbj.class)).zza(Base64.decode(str, 8), null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e10) {
            Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n" + e10.getMessage());
            return null;
        }
    }
}
