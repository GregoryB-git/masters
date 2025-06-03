package c8;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzaj;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import io.flutter.plugins.firebase.crashlytics.Constants;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final zzaj<String> f2444c = zzaj.zza("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", Constants.TIMESTAMP);

    /* renamed from: d, reason: collision with root package name */
    public static final f0 f2445d = new f0();

    /* renamed from: a, reason: collision with root package name */
    public Task<String> f2446a;

    /* renamed from: b, reason: collision with root package name */
    public long f2447b = 0;

    public static void a(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.f2816a);
        edit.putString("statusMessage", status.f2817b);
        edit.putLong(Constants.TIMESTAMP, System.currentTimeMillis());
        edit.commit();
    }

    public static void b(Context context, FirebaseAuth firebaseAuth) {
        m6.j.i(context);
        m6.j.i(firebaseAuth);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        u7.f fVar = firebaseAuth.f3057a;
        fVar.a();
        edit.putString("firebaseAppName", fVar.f15085b);
        edit.commit();
    }

    public static void c(Context context, FirebaseAuth firebaseAuth, b8.r rVar) {
        m6.j.i(context);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        u7.f fVar = firebaseAuth.f3057a;
        fVar.a();
        edit.putString("firebaseAppName", fVar.f15085b);
        edit.putString("firebaseUserUid", rVar.a());
        edit.commit();
    }

    public static void d(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        zzaj<String> zzajVar = f2444c;
        int size = zzajVar.size();
        int i10 = 0;
        while (i10 < size) {
            String str = zzajVar.get(i10);
            i10++;
            edit.remove(str);
        }
        edit.commit();
    }
}
