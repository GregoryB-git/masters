package eb;

import android.R;
import com.google.android.gms.internal.p002firebaseauthapi.zzae;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import gb.t3;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class y implements Continuation, i9.b0, t3, m6.i, d8.e {

    /* renamed from: b, reason: collision with root package name */
    public static final d2.h0 f5255b;

    /* renamed from: c, reason: collision with root package name */
    public static final d2.h0 f5256c;

    /* renamed from: a, reason: collision with root package name */
    public static final Object[] f5254a = new Object[0];

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f5257d = {R.attr.name, R.attr.id, R.attr.tag};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f5258e = {R.attr.name, R.attr.tag};

    static {
        int i10 = 9;
        f5255b = new d2.h0("NULL", i10);
        f5256c = new d2.h0("UNINITIALIZED", i10);
    }

    public /* synthetic */ y() {
    }

    public /* synthetic */ y(int i10) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0086, TRY_LEAVE, TryCatch #1 {all -> 0x0086, blocks: (B:12:0x002f, B:14:0x0054, B:19:0x0069, B:21:0x0071, B:32:0x0045, B:35:0x0050), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r8v5, types: [pc.s] */
    /* JADX WARN: Type inference failed for: r8v7, types: [pc.s] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0083 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(qc.f r7, pc.p r8, boolean r9, ub.e r10) {
        /*
            boolean r0 = r10 instanceof qc.g
            if (r0 == 0) goto L13
            r0 = r10
            qc.g r0 = (qc.g) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            qc.g r0 = new qc.g
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f13408e
            vb.a r1 = vb.a.f16085a
            int r2 = r0.f
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r3) goto L3d
            if (r2 != r4) goto L35
            boolean r9 = r0.f13407d
            pc.h r7 = r0.f13406c
            pc.s r8 = r0.f13405b
            qc.f r2 = r0.f13404a
            rb.f.b(r10)     // Catch: java.lang.Throwable -> L86
        L32:
            r10 = r7
            r7 = r2
            goto L54
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            boolean r9 = r0.f13407d
            pc.h r7 = r0.f13406c
            pc.s r8 = r0.f13405b
            qc.f r2 = r0.f13404a
            rb.f.b(r10)     // Catch: java.lang.Throwable -> L86
            goto L69
        L49:
            rb.f.b(r10)
            boolean r10 = r7 instanceof qc.x
            if (r10 != 0) goto Lab
            pc.h r10 = r8.iterator()     // Catch: java.lang.Throwable -> L86
        L54:
            r0.f13404a = r7     // Catch: java.lang.Throwable -> L86
            r0.f13405b = r8     // Catch: java.lang.Throwable -> L86
            r0.f13406c = r10     // Catch: java.lang.Throwable -> L86
            r0.f13407d = r9     // Catch: java.lang.Throwable -> L86
            r0.f = r3     // Catch: java.lang.Throwable -> L86
            java.lang.Object r2 = r10.a(r0)     // Catch: java.lang.Throwable -> L86
            if (r2 != r1) goto L65
            return r1
        L65:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L69:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L86
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L86
            if (r10 == 0) goto L88
            java.lang.Object r10 = r7.next()     // Catch: java.lang.Throwable -> L86
            r0.f13404a = r2     // Catch: java.lang.Throwable -> L86
            r0.f13405b = r8     // Catch: java.lang.Throwable -> L86
            r0.f13406c = r7     // Catch: java.lang.Throwable -> L86
            r0.f13407d = r9     // Catch: java.lang.Throwable -> L86
            r0.f = r4     // Catch: java.lang.Throwable -> L86
            java.lang.Object r10 = r2.emit(r10, r0)     // Catch: java.lang.Throwable -> L86
            if (r10 != r1) goto L32
            return r1
        L86:
            r7 = move-exception
            goto L90
        L88:
            if (r9 == 0) goto L8d
            r8.cancel(r5)
        L8d:
            rb.h r7 = rb.h.f13851a
            return r7
        L90:
            throw r7     // Catch: java.lang.Throwable -> L91
        L91:
            r10 = move-exception
            if (r9 == 0) goto Laa
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L9b
            r5 = r7
            java.util.concurrent.CancellationException r5 = (java.util.concurrent.CancellationException) r5
        L9b:
            if (r5 != 0) goto La7
            java.util.concurrent.CancellationException r5 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r5.<init>(r9)
            r5.initCause(r7)
        La7:
            r8.cancel(r5)
        Laa:
            throw r10
        Lab:
            qc.x r7 = (qc.x) r7
            r7.getClass()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.y.b(qc.f, pc.p, boolean, ub.e):java.lang.Object");
    }

    public static final Object c(Object obj) {
        return obj instanceof nc.u ? rb.f.a(((nc.u) obj).f11555a) : obj;
    }

    public static final Object[] e(Collection collection) {
        ec.i.e(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    objArr[i10] = it.next();
                    if (i11 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i12 = ((i11 * 3) + 1) >>> 1;
                        if (i12 <= i11) {
                            if (i11 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                            i12 = 2147483645;
                        }
                        objArr = Arrays.copyOf(objArr, i12);
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i11);
                        ec.i.d(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    i10 = i11;
                }
            }
        }
        return f5254a;
    }

    public static final Object[] f(Collection collection, Object[] objArr) {
        Object[] objArr2;
        ec.i.e(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i10 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            ec.i.c(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i11 = i10 + 1;
            objArr2[i10] = it.next();
            if (i11 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i12 = ((i11 * 3) + 1) >>> 1;
                if (i12 <= i11) {
                    if (i11 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                    i12 = 2147483645;
                }
                objArr2 = Arrays.copyOf(objArr2, i12);
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i11] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i11);
                ec.i.d(copyOf, "copyOf(...)");
                return copyOf;
            }
            i10 = i11;
        }
    }

    @Override // gb.t3
    public hb.o a(int i10) {
        return new hb.o(new xc.f(), Math.min(1048576, Math.max(4096, i10)));
    }

    @Override // m6.i
    public /* bridge */ /* synthetic */ Object d(k6.j jVar) {
        return null;
    }

    @Override // d8.e
    public Object g(d8.u uVar) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(uVar);
    }

    @Override // i9.b0
    public void run() {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return Tasks.forResult(null);
        }
        Exception exception = task.getException();
        return Tasks.forException(new b8.l("INTERNAL_ERROR", zzae.zzb(exception != null ? exception.getMessage() : "")));
    }
}
