package aa;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: i, reason: collision with root package name */
    public static final long f314i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f315j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f316a;

    /* renamed from: b, reason: collision with root package name */
    public final r f317b;

    /* renamed from: c, reason: collision with root package name */
    public final o f318c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f319d;
    public final ScheduledExecutorService f;

    /* renamed from: h, reason: collision with root package name */
    public final h0 f322h;

    /* renamed from: e, reason: collision with root package name */
    public final r.b f320e = new r.b();

    /* renamed from: g, reason: collision with root package name */
    public boolean f321g = false;

    public j0(FirebaseMessaging firebaseMessaging, r rVar, h0 h0Var, o oVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f319d = firebaseMessaging;
        this.f317b = rVar;
        this.f322h = h0Var;
        this.f318c = oVar;
        this.f316a = context;
        this.f = scheduledExecutorService;
    }

    public static <T> void a(Task<T> task) {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e11);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e12) {
            e = e12;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public static boolean d() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public final void b(String str) {
        o oVar = this.f318c;
        String a10 = this.f319d.a();
        oVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(oVar.a(oVar.c(a10, "/topics/" + str, bundle)));
    }

    public final void c(String str) {
        o oVar = this.f318c;
        String a10 = this.f319d.a();
        oVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(oVar.a(oVar.c(a10, "/topics/" + str, bundle)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Task<Void> e(g0 g0Var) {
        ArrayDeque arrayDeque;
        h0 h0Var = this.f322h;
        synchronized (h0Var) {
            e0 e0Var = h0Var.f302a;
            String str = g0Var.f299c;
            e0Var.getClass();
            if (!TextUtils.isEmpty(str) && !str.contains(e0Var.f285c)) {
                synchronized (e0Var.f286d) {
                    if (e0Var.f286d.add(str)) {
                        e0Var.f287e.execute(new u.a(e0Var, 15));
                    }
                }
            }
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f320e) {
            try {
                String str2 = g0Var.f299c;
                if (this.f320e.containsKey(str2)) {
                    arrayDeque = (ArrayDeque) this.f320e.getOrDefault(str2, null);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f320e.put(str2, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(taskCompletionSource);
            } catch (Throwable th) {
                throw th;
            }
        }
        return taskCompletionSource.getTask();
    }

    public final void f() {
        boolean z10;
        if (this.f322h.a() != null) {
            synchronized (this) {
                z10 = this.f321g;
            }
            if (z10) {
                return;
            }
            h(0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x000e, code lost:
    
        if (d() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0010, code lost:
    
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0018, code lost:
    
        return true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ed A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g() {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.j0.g():boolean");
    }

    public final void h(long j10) {
        this.f.schedule(new k0(this, this.f316a, this.f317b, Math.min(Math.max(30L, 2 * j10), f314i)), j10, TimeUnit.SECONDS);
        synchronized (this) {
            this.f321g = true;
        }
    }
}
