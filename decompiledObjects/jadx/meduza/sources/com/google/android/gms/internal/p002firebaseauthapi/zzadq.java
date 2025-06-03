package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import c8.p;
import com.google.firebase.auth.FirebaseAuth;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import m6.j;
import p6.a;
import u7.f;

/* loaded from: classes.dex */
public final class zzadq extends AsyncTask<Void, Void, zzadt> {
    private static final a zza = new a("FirebaseAuth", "GetAuthDomainTask");
    private final String zzb;
    private final String zzc;
    private final WeakReference<zzads> zzd;
    private final Uri.Builder zze;
    private final String zzf;
    private final f zzg;

    public zzadq(String str, String str2, Intent intent, f fVar, zzads zzadsVar) {
        j.e(str);
        this.zzb = str;
        j.i(fVar);
        this.zzg = fVar;
        j.e(str2);
        j.i(intent);
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        j.e(stringExtra);
        Uri.Builder buildUpon = Uri.parse(zzadsVar.zza(stringExtra)).buildUpon();
        Uri.Builder appendQueryParameter = buildUpon.appendPath("getProjectConfig").appendQueryParameter(Constants.KEY, stringExtra).appendQueryParameter("androidPackageName", str);
        j.i(str2);
        appendQueryParameter.appendQueryParameter("sha1Cert", str2);
        this.zzc = buildUpon.build().toString();
        this.zzd = new WeakReference<>(zzadsVar);
        this.zze = zzadsVar.zza(intent, str, str2);
        this.zzf = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzadt doInBackground(Void... voidArr) {
        try {
            URL url = new URL(this.zzc);
            zzads zzadsVar = this.zzd.get();
            HttpURLConnection zza2 = zzadsVar.zza(url);
            zza2.addRequestProperty("Content-Type", "application/json; charset=UTF-8");
            zza2.setConnectTimeout(60000);
            new zzaef(zzadsVar.zza(), this.zzg, zzaed.zza().zzb()).zza(zza2);
            int responseCode = zza2.getResponseCode();
            if (responseCode != 200) {
                String zza3 = zza(zza2);
                zza.c(String.format("Error getting project config. Failed with %s %s", zza3, Integer.valueOf(responseCode)), new Object[0]);
                return zzadt.zzb(zza3);
            }
            zzagr zzagrVar = new zzagr();
            zzagrVar.zza(new String(zza(zza2.getInputStream(), 128)));
            if (!TextUtils.isEmpty(this.zzf)) {
                return !zzagrVar.zza().contains(this.zzf) ? zzadt.zzb("UNAUTHORIZED_DOMAIN") : zzadt.zza(this.zzf);
            }
            for (String str : zzagrVar.zza()) {
                if (zza(str)) {
                    return zzadt.zza(str);
                }
            }
            return null;
        } catch (zzabr e10) {
            zza.c(defpackage.f.j("ConversionException encountered: ", e10.getMessage()), new Object[0]);
            return null;
        } catch (IOException e11) {
            zza.c(defpackage.f.j("IOException occurred: ", e11.getMessage()), new Object[0]);
            return null;
        } catch (NullPointerException e12) {
            zza.c(defpackage.f.j("Null pointer encountered: ", e12.getMessage()), new Object[0]);
            return null;
        }
    }

    private static boolean zza(String str) {
        try {
            String host = new URI("https://" + str).getHost();
            if (host != null) {
                if (host.endsWith("firebaseapp.com")) {
                    return true;
                }
                if (host.endsWith("web.app")) {
                    return true;
                }
            }
        } catch (URISyntaxException e10) {
            zza.c("Error parsing URL for auth domain check: " + str + ". " + e10.getMessage(), new Object[0]);
        }
        return false;
    }

    private static byte[] zza(InputStream inputStream, int i10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onCancelled(zzadt zzadtVar) {
        onPostExecute((zzadt) null);
    }

    private static String zza(HttpURLConnection httpURLConnection) {
        try {
            if (httpURLConnection.getResponseCode() < 400) {
                return null;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            return errorStream == null ? "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again." : (String) zzady.zza(new String(zza(errorStream, 128)), String.class);
        } catch (IOException e10) {
            zza.f(defpackage.f.j("Error parsing error message from response body in getErrorMessageFromBody. ", String.valueOf(e10)), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(zzadt zzadtVar) {
        String str;
        Uri.Builder builder;
        zzads zzadsVar = this.zzd.get();
        String str2 = null;
        if (zzadtVar != null) {
            str2 = zzadtVar.zza();
            str = zzadtVar.zzb();
        } else {
            str = null;
        }
        if (zzadsVar == null) {
            zza.c("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (TextUtils.isEmpty(str2) || (builder = this.zze) == null) {
            zzadsVar.zza(this.zzb, p.a(str));
        } else {
            builder.authority(str2);
            zzadsVar.zza(this.zze.build(), this.zzb, FirebaseAuth.getInstance(this.zzg).f3076v);
        }
    }
}
