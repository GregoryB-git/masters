package z5;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.internal.auth.zzby;
import com.google.android.gms.internal.auth.zzdc;
import com.google.android.gms.internal.auth.zzht;
import com.google.android.gms.internal.auth.zzhw;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import m6.p0;
import m6.s0;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f17813a = {"com.google", "com.google.work", "cn.google"};

    /* renamed from: b, reason: collision with root package name */
    public static final ComponentName f17814b = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    /* renamed from: c, reason: collision with root package name */
    public static final p6.a f17815c = new p6.a("Auth", "GoogleAuthUtil");

    public static TokenData a(Context context, Bundle bundle) {
        TokenData tokenData;
        int i10;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("userRecoveryPendingIntent");
        zzby zza = zzby.zza(string);
        p6.a aVar = f17815c;
        aVar.f(String.format("[GoogleAuthUtil] error status:%s with method:%s", zza, "getTokenWithDetails"), new Object[0]);
        if (!zzby.BAD_AUTHENTICATION.equals(zza) && !zzby.CAPTCHA.equals(zza) && !zzby.NEED_PERMISSION.equals(zza) && !zzby.NEED_REMOTE_CONSENT.equals(zza) && !zzby.NEEDS_BROWSER.equals(zza) && !zzby.USER_CANCEL.equals(zza) && !zzby.DEVICE_MANAGEMENT_REQUIRED.equals(zza) && !zzby.DM_INTERNAL_ERROR.equals(zza) && !zzby.DM_SYNC_DISABLED.equals(zza) && !zzby.DM_ADMIN_BLOCKED.equals(zza) && !zzby.DM_ADMIN_PENDING_APPROVAL.equals(zza) && !zzby.DM_STALE_SYNC_REQUIRED.equals(zza) && !zzby.DM_DEACTIVATED.equals(zza) && !zzby.DM_REQUIRED.equals(zza) && !zzby.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(zza) && !zzby.DM_SCREENLOCK_REQUIRED.equals(zza)) {
            if (zzby.NETWORK_ERROR.equals(zza) || zzby.SERVICE_UNAVAILABLE.equals(zza) || zzby.INTNERNAL_ERROR.equals(zza) || zzby.AUTH_SECURITY_ERROR.equals(zza) || zzby.ACCOUNT_NOT_PRESENT.equals(zza)) {
                throw new IOException(string);
            }
            throw new z3.f(string);
        }
        zzdc.zzd(context);
        if (!zzht.zzc()) {
            throw new UserRecoverableAuthException(string, intent, 1);
        }
        if (pendingIntent != null && intent != null) {
            throw new UserRecoverableAuthException(string, intent, 2);
        }
        j6.e.f8488d.getClass();
        AtomicBoolean atomicBoolean = j6.j.f8500a;
        try {
            i10 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            i10 = 0;
        }
        if (i10 >= Integer.MAX_VALUE && pendingIntent == null) {
            aVar.c(String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", Integer.MAX_VALUE, "getTokenWithDetails", Integer.MAX_VALUE), new Object[0]);
        }
        if (intent == null) {
            aVar.c(String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", string, "getTokenWithDetails"), new Object[0]);
        }
        throw new UserRecoverableAuthException(string, intent, 1);
    }

    public static Object b(Context context, ComponentName componentName, k kVar) {
        j6.a aVar = new j6.a();
        s0 a10 = m6.c.a(context);
        try {
            a10.getClass();
            try {
                if (!a10.b(new p0(componentName), aVar, "GoogleAuthUtil", null).D()) {
                    throw new IOException("Could not bind to service.");
                }
                try {
                    return kVar.a(aVar.a());
                } catch (RemoteException | InterruptedException | TimeoutException e10) {
                    Log.i("GoogleAuthUtil", "Error on service connection.", e10);
                    throw new IOException("Error on service connection.", e10);
                }
            } finally {
                a10.c(new p0(componentName), aVar);
            }
        } catch (SecurityException e11) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", e11.getMessage()));
            throw new IOException("SecurityException while binding to Auth service.", e11);
        }
    }

    public static Object c(Task task, String str) {
        try {
            return Tasks.await(task);
        } catch (InterruptedException e10) {
            String format = String.format("Interrupted while waiting for the task of %s to finish.", str);
            f17815c.f(format, new Object[0]);
            throw new IOException(format, e10);
        } catch (CancellationException e11) {
            String format2 = String.format("Canceled while waiting for the task of %s to finish.", str);
            f17815c.f(format2, new Object[0]);
            throw new IOException(format2, e11);
        } catch (ExecutionException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof k6.b) {
                throw ((k6.b) cause);
            }
            String format3 = String.format("Unable to get a result for %s due to ExecutionException.", str);
            f17815c.f(format3, new Object[0]);
            throw new IOException(format3, e12);
        }
    }

    public static void d(Context context) {
        try {
            j6.j.a(context.getApplicationContext(), 8400000);
        } catch (GooglePlayServicesIncorrectManifestValueException e10) {
            e = e10;
            throw new z3.f(e.getMessage(), e);
        } catch (j6.g e11) {
            e = e11;
            throw new z3.f(e.getMessage(), e);
        } catch (j6.h e12) {
            throw new e(e12.getMessage(), new Intent(e12.f8497a));
        }
    }

    public static void e(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        if (TextUtils.isEmpty(bundle.getString("androidPackageName"))) {
            bundle.putString("androidPackageName", str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    public static void f(Account account) {
        if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        String[] strArr = f17813a;
        for (int i10 = 0; i10 < 3; i10++) {
            if (strArr[i10].equals(account.type)) {
                return;
            }
        }
        throw new IllegalArgumentException("Account type not supported");
    }

    public static boolean g(Context context) {
        if (j6.e.f8488d.c(context, 17895000) != 0) {
            return false;
        }
        List zzq = zzhw.zzb().zzq();
        String str = context.getApplicationInfo().packageName;
        Iterator it = zzq.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return false;
            }
        }
        return true;
    }
}
