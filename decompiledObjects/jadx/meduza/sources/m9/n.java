package m9;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import eb.b;
import eb.e1;
import eb.s0;
import java.util.BitSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class n extends eb.b {

    /* renamed from: c, reason: collision with root package name */
    public static final s0.b f10841c;

    /* renamed from: d, reason: collision with root package name */
    public static final s0.b f10842d;

    /* renamed from: a, reason: collision with root package name */
    public final e9.a f10843a;

    /* renamed from: b, reason: collision with root package name */
    public final e9.a f10844b;

    static {
        s0.a aVar = s0.f5206d;
        BitSet bitSet = s0.d.f5211d;
        f10841c = new s0.b("Authorization", aVar);
        f10842d = new s0.b("x-firebase-appcheck", aVar);
    }

    public n(e9.a aVar, e9.a aVar2) {
        this.f10843a = aVar;
        this.f10844b = aVar2;
    }

    @Override // eb.b
    public final void a(b.AbstractC0074b abstractC0074b, Executor executor, final b.a aVar) {
        final Task s10 = this.f10843a.s();
        final Task s11 = this.f10844b.s();
        Tasks.whenAll((Task<?>[]) new Task[]{s10, s11}).addOnCompleteListener(n9.f.f11361b, new OnCompleteListener() { // from class: m9.m
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                Exception exception;
                Task task2 = Task.this;
                b.a aVar2 = aVar;
                Task task3 = s11;
                s0 s0Var = new s0();
                if (task2.isSuccessful()) {
                    String str = (String) task2.getResult();
                    p2.m0.y(1, "FirestoreCallCredentials", "Successfully fetched auth token.", new Object[0]);
                    if (str != null) {
                        s0Var.f(n.f10841c, "Bearer " + str);
                    }
                } else {
                    exception = task2.getException();
                    if (exception instanceof u7.c) {
                        p2.m0.y(1, "FirestoreCallCredentials", "Firebase Auth API not available, not using authentication.", new Object[0]);
                    } else {
                        if (!(exception instanceof z9.a)) {
                            p2.m0.y(2, "FirestoreCallCredentials", "Failed to get auth token: %s.", exception);
                            aVar2.b(e1.f5074j.f(exception));
                            return;
                        }
                        p2.m0.y(1, "FirestoreCallCredentials", "No user signed in, not using authentication.", new Object[0]);
                    }
                }
                if (task3.isSuccessful()) {
                    String str2 = (String) task3.getResult();
                    if (str2 != null && !str2.isEmpty()) {
                        p2.m0.y(1, "FirestoreCallCredentials", "Successfully fetched AppCheck token.", new Object[0]);
                        s0Var.f(n.f10842d, str2);
                    }
                } else {
                    exception = task3.getException();
                    if (!(exception instanceof u7.c)) {
                        p2.m0.y(2, "FirestoreCallCredentials", "Failed to get AppCheck token: %s.", exception);
                        aVar2.b(e1.f5074j.f(exception));
                        return;
                    }
                    p2.m0.y(1, "FirestoreCallCredentials", "Firebase AppCheck API not available.", new Object[0]);
                }
                aVar2.a(s0Var);
            }
        });
    }
}
