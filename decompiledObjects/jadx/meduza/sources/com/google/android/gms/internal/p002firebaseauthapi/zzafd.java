package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import b8.c0;
import com.google.android.gms.internal.p001authapiphone.zzab;
import defpackage.f;
import defpackage.g;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p6.a;
import x6.d;

/* loaded from: classes.dex */
final class zzafd {
    private static final a zza = new a("FirebaseAuth", "SmsRetrieverHelper");
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private final HashMap<String, zzafk> zzd = new HashMap<>();

    public zzafd(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzb = context;
        this.zzc = scheduledExecutorService;
    }

    public static String zza(String str) {
        Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    private static String zza(String str, String str2) {
        String e10 = g.e(str, " ", str2);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(e10.getBytes(StandardCharsets.UTF_8));
            String substring = Base64.encodeToString(Arrays.copyOf(messageDigest.digest(), 9), 3).substring(0, 11);
            zza.a("Package: " + str + " -- Hash: " + substring, new Object[0]);
            return substring;
        } catch (NoSuchAlgorithmException e11) {
            zza.c(f.j("NoSuchAlgorithm: ", e11.getMessage()), new Object[0]);
            return null;
        }
    }

    public static /* synthetic */ void zzb(zzafd zzafdVar, String str) {
        zzafk zzafkVar = zzafdVar.zzd.get(str);
        if (zzafkVar == null || zzae.zzc(zzafkVar.zzd) || zzae.zzc(zzafkVar.zze) || zzafkVar.zzb.isEmpty()) {
            return;
        }
        Iterator<zzadp> it = zzafkVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(c0.G(zzafkVar.zzd, zzafkVar.zze));
        }
        zzafkVar.zzh = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(String str) {
        zzafk zzafkVar = this.zzd.get(str);
        if (zzafkVar == null || zzafkVar.zzh || zzae.zzc(zzafkVar.zzd)) {
            return;
        }
        zza.f("Timed out waiting for SMS.", new Object[0]);
        Iterator<zzadp> it = zzafkVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(zzafkVar.zzd);
        }
        zzafkVar.zzi = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(String str) {
        zzafk zzafkVar = this.zzd.get(str);
        if (zzafkVar == null) {
            return;
        }
        if (!zzafkVar.zzi) {
            zzd(str);
        }
        zzb(str);
    }

    public final zzadp zza(zzadp zzadpVar, String str) {
        return new zzafi(this, zzadpVar, str);
    }

    public final String zzb() {
        try {
            String packageName = this.zzb.getPackageName();
            String zza2 = zza(packageName, (Build.VERSION.SDK_INT < 28 ? d.a(this.zzb).b(64, packageName).signatures : d.a(this.zzb).b(134217728, packageName).signingInfo.getApkContentsSigners())[0].toCharsString());
            if (zza2 != null) {
                return zza2;
            }
            zza.c("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            zza.c("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    public final void zzb(zzadp zzadpVar, String str) {
        zzafk zzafkVar = this.zzd.get(str);
        if (zzafkVar == null) {
            return;
        }
        zzafkVar.zzb.add(zzadpVar);
        if (zzafkVar.zzg) {
            zzadpVar.zzb(zzafkVar.zzd);
        }
        if (zzafkVar.zzh) {
            zzadpVar.zza(c0.G(zzafkVar.zzd, zzafkVar.zze));
        }
        if (zzafkVar.zzi) {
            zzadpVar.zza(zzafkVar.zzd);
        }
    }

    public final void zzb(String str) {
        zzafk zzafkVar = this.zzd.get(str);
        if (zzafkVar == null) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = zzafkVar.zzf;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            zzafkVar.zzf.cancel(false);
        }
        zzafkVar.zzb.clear();
        this.zzd.remove(str);
    }

    public final boolean zzc(String str) {
        return this.zzd.get(str) != null;
    }

    public final void zza(final String str, zzadp zzadpVar, long j10, boolean z10) {
        this.zzd.put(str, new zzafk(j10, z10));
        zzb(zzadpVar, str);
        zzafk zzafkVar = this.zzd.get(str);
        if (zzafkVar.zza <= 0) {
            zza.f("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzafkVar.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.zzafg
            @Override // java.lang.Runnable
            public final void run() {
                zzafd.this.zze(str);
            }
        }, zzafkVar.zza, TimeUnit.SECONDS);
        if (!zzafkVar.zzc) {
            zza.f("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzafh zzafhVar = new zzafh(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        v.a.registerReceiver(this.zzb.getApplicationContext(), zzafhVar, intentFilter, 2);
        new zzab(this.zzb).startSmsRetriever().addOnFailureListener(new zzaff(this));
    }
}
