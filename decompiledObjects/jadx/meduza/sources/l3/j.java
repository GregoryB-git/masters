package l3;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import b1.v;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.a;
import e7.b1;
import e7.f1;
import e7.g1;
import e7.h0;
import e7.i6;
import e7.n6;
import e7.o;
import j9.n;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j implements m3.b, f1, Continuation {

    /* renamed from: a, reason: collision with root package name */
    public Object f9551a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9552b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9553c;

    public /* synthetic */ j(i6 i6Var, String str, n6 n6Var) {
        this.f9551a = str;
        this.f9552b = n6Var;
        this.f9553c = i6Var;
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3) {
        this.f9551a = obj;
        this.f9552b = obj2;
        this.f9553c = obj3;
    }

    public final k9.f a(j9.i iVar, k9.m mVar) {
        return new k9.l(iVar, (n) this.f9551a, (k9.d) this.f9552b, mVar, (List) this.f9553c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.String] */
    @Override // e7.f1
    public final void c(String str, int i10, Throwable th, byte[] bArr, Map map) {
        i6 i6Var = (i6) this.f9553c;
        String str2 = (String) this.f9551a;
        n6 n6Var = (n6) this.f9552b;
        a0.j.q(i6Var);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                i6Var.C = false;
                i6Var.C();
                throw th2;
            }
        }
        if ((i10 == 200 || i10 == 204) && th == null) {
            if (n6Var != null) {
                o oVar = i6Var.f4332c;
                i6.q(oVar);
                oVar.K(Long.valueOf(n6Var.f4520a));
            }
            i6Var.zzj().f4067w.d("Successfully uploaded batch from upload queue. appId, status", str2, Integer.valueOf(i10));
            if (i6Var.R().x(null, h0.I0)) {
                g1 g1Var = i6Var.f4331b;
                i6.q(g1Var);
                if (g1Var.u()) {
                    o oVar2 = i6Var.f4332c;
                    i6.q(oVar2);
                    if (oVar2.z0(str2)) {
                        i6Var.S(str2);
                        i6Var.C = false;
                        i6Var.C();
                    }
                }
            }
        } else {
            String str3 = new String(bArr, StandardCharsets.UTF_8);
            ?? substring = str3.substring(0, Math.min(32, str3.length()));
            b1 b1Var = i6Var.zzj().t;
            Integer valueOf = Integer.valueOf(i10);
            if (th == null) {
                th = substring;
            }
            b1Var.a(str2, valueOf, th, "Network upload failed. Will retry later. appId, status, error");
            if (n6Var != null) {
                o oVar3 = i6Var.f4332c;
                i6.q(oVar3);
                oVar3.e0(Long.valueOf(n6Var.f4520a));
            }
        }
        i6Var.F();
        i6Var.C = false;
        i6Var.C();
    }

    @Override // qb.a
    public final Object get() {
        return new i((Context) ((qb.a) this.f9551a).get(), (t3.a) ((qb.a) this.f9552b).get(), (t3.a) ((qb.a) this.f9553c).get());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        a.C0054a b10;
        Task continueWithTask;
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) this.f9551a;
        String str = (String) this.f9552b;
        String str2 = (String) this.f9553c;
        String f = firebaseInstanceId.f();
        com.google.firebase.iid.a aVar = FirebaseInstanceId.f3203j;
        String g10 = firebaseInstanceId.g();
        synchronized (aVar) {
            b10 = a.C0054a.b(aVar.f3214a.getString(com.google.firebase.iid.a.b(g10, str, str2), null));
        }
        if (!firebaseInstanceId.k(b10)) {
            return Tasks.forResult(new r9.g(b10.f3217a));
        }
        r9.i iVar = firebaseInstanceId.f3210e;
        synchronized (iVar) {
            Pair pair = new Pair(str, str2);
            Task task2 = (Task) iVar.f13829b.getOrDefault(pair, null);
            if (task2 != null) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(pair);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 29);
                    sb2.append("Joining ongoing request for: ");
                    sb2.append(valueOf);
                    Log.d("FirebaseInstanceId", sb2.toString());
                }
                continueWithTask = task2;
            } else {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf2 = String.valueOf(pair);
                    StringBuilder sb3 = new StringBuilder(valueOf2.length() + 24);
                    sb3.append("Making new request for: ");
                    sb3.append(valueOf2);
                    Log.d("FirebaseInstanceId", sb3.toString());
                }
                r9.e eVar = firebaseInstanceId.f3209d;
                eVar.getClass();
                int i10 = 7;
                continueWithTask = eVar.a(new Bundle(), f, str, str2).continueWith(r9.a.f13813a, new v(eVar)).onSuccessTask(firebaseInstanceId.f3206a, new z5.j(firebaseInstanceId, str2, f, str)).addOnSuccessListener(new Executor() { // from class: r9.d
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        runnable.run();
                    }
                }, new r4.c(i10, firebaseInstanceId, b10)).continueWithTask(iVar.f13828a, new l.l(i10, iVar, pair));
                iVar.f13829b.put(pair, continueWithTask);
            }
        }
        return continueWithTask;
    }
}
