package r4;

import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import b8.c;
import b8.r;
import b8.s;
import com.google.android.gms.internal.auth.zze;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.a;
import e7.k3;
import e7.l1;
import e7.w5;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Iterator;
import m6.j;
import p8.e;
import s9.a;
import z3.f;
import z5.k;
import z5.l;

/* loaded from: classes.dex */
public final class c implements k, Continuation, OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13611a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13612b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13613c;

    public c() {
        this.f13611a = 0;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f13612b = byteArrayOutputStream;
        this.f13613c = new DataOutputStream(byteArrayOutputStream);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static r4.c b(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L33 java.io.IOException -> L35
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L33 java.io.IOException -> L35
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L33 java.io.IOException -> L35
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L33 java.io.IOException -> L35
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L33 java.io.IOException -> L35
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L33 java.io.IOException -> L35
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L29 java.lang.Error -> L2b java.io.IOException -> L2d
            r4.c r2 = new r4.c     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            r3 = 8
            r2.<init>(r3, r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            return r2
        L23:
            r2 = move-exception
            goto L39
        L25:
            r2 = move-exception
            goto L39
        L27:
            r2 = move-exception
            goto L39
        L29:
            r0 = move-exception
            goto L2e
        L2b:
            r0 = move-exception
            goto L2e
        L2d:
            r0 = move-exception
        L2e:
            r2 = r0
            r0 = r1
            goto L39
        L31:
            r5 = move-exception
            goto L36
        L33:
            r5 = move-exception
            goto L36
        L35:
            r5 = move-exception
        L36:
            r2 = r5
            r5 = r1
            r0 = r5
        L39:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L45
            r0.release()     // Catch: java.io.IOException -> L45
        L45:
            if (r5 == 0) goto L4a
            r5.close()     // Catch: java.io.IOException -> L4a
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.c.b(android.content.Context):r4.c");
    }

    public static void c(String str, String str2, Bundle bundle, Bundle bundle2) {
        String string = bundle.getString(str);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        bundle2.putString(str2, string);
    }

    @Override // z5.k
    public final Object a(IBinder iBinder) {
        Bundle zzd = zze.zzb(iBinder).zzd((String) this.f13612b, (Bundle) this.f13613c);
        if (zzd == null) {
            l.f17815c.f("Service call returned null.", new Object[0]);
            throw new IOException("Service unavailable.");
        }
        String[] strArr = l.f17813a;
        String string = zzd.getString("Error");
        if (zzd.getBoolean("booleanResult")) {
            return null;
        }
        throw new f(string);
    }

    public final void d() {
        try {
            e eVar = (e) this.f13613c;
            String str = (String) this.f13612b;
            eVar.getClass();
            new File(eVar.f13042c, str).createNewFile();
        } catch (IOException e10) {
            StringBuilder l10 = defpackage.f.l("Error creating marker: ");
            l10.append((String) this.f13612b);
            Log.e("FirebaseCrashlytics", l10.toString(), e10);
        }
    }

    public final byte[] e(a aVar) {
        ((ByteArrayOutputStream) this.f13612b).reset();
        try {
            DataOutputStream dataOutputStream = (DataOutputStream) this.f13613c;
            dataOutputStream.writeBytes(aVar.f13606a);
            dataOutputStream.writeByte(0);
            String str = aVar.f13607b;
            if (str == null) {
                str = "";
            }
            DataOutputStream dataOutputStream2 = (DataOutputStream) this.f13613c;
            dataOutputStream2.writeBytes(str);
            dataOutputStream2.writeByte(0);
            ((DataOutputStream) this.f13613c).writeLong(aVar.f13608c);
            ((DataOutputStream) this.f13613c).writeLong(aVar.f13609d);
            ((DataOutputStream) this.f13613c).write(aVar.f13610e);
            ((DataOutputStream) this.f13613c).flush();
            return ((ByteArrayOutputStream) this.f13612b).toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.Throwable r9) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r4.c.f(java.lang.Throwable):void");
    }

    public final void g() {
        try {
            ((FileLock) this.f13613c).release();
            ((FileChannel) this.f13612b).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    public final void h() {
        SparseArray<Long> w10 = ((k3) this.f13613c).j().w();
        Object obj = this.f13612b;
        w10.put(((w5) obj).f4742c, Long.valueOf(((w5) obj).f4741b));
        l1 j10 = ((k3) this.f13613c).j();
        int[] iArr = new int[w10.size()];
        long[] jArr = new long[w10.size()];
        for (int i10 = 0; i10 < w10.size(); i10++) {
            iArr[i10] = w10.keyAt(i10);
            jArr[i10] = w10.valueAt(i10).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        j10.f4464x.b(bundle);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        switch (this.f13611a) {
            case 2:
                ((k3) this.f13613c).l();
                h();
                k3 k3Var = (k3) this.f13613c;
                k3Var.f4426r = false;
                k3Var.f4427s = 1;
                k3Var.zzj().f4066v.c("Successfully registered trigger URI", ((w5) this.f13612b).f4740a);
                ((k3) this.f13613c).N();
                break;
            default:
                FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) this.f13612b;
                a.C0054a c0054a = (a.C0054a) this.f13613c;
                firebaseInstanceId.getClass();
                String a10 = ((r9.f) obj).a();
                if (c0054a == null || !a10.equals(c0054a.f3217a)) {
                    Iterator it = firebaseInstanceId.f3212h.iterator();
                    while (it.hasNext()) {
                        ((a.InterfaceC0223a) it.next()).a(a10);
                    }
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        s sVar = (s) task.getResult();
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(((r) this.f13613c).K());
        b8.c cVar = (b8.c) this.f13612b;
        String str = sVar.f2137a;
        j.i(str);
        firebaseAuth.getClass();
        j.e(str);
        if (firebaseAuth.f3064i != null) {
            if (cVar == null) {
                cVar = new b8.c(new c.a());
            }
            cVar.f2043p = firebaseAuth.f3064i;
        }
        return firebaseAuth.f3061e.zza(firebaseAuth.f3057a, cVar, str);
    }

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f13611a = i10;
        this.f13612b = obj;
        this.f13613c = obj2;
    }

    public /* synthetic */ c(Object obj, n6.a aVar, int i10) {
        this.f13611a = i10;
        this.f13612b = aVar;
        this.f13613c = obj;
    }

    public c(w8.a aVar) {
        Bundle bundle;
        Bundle bundle2;
        this.f13611a = 5;
        this.f13612b = aVar;
        Bundle bundle3 = new Bundle();
        if (aVar != null && aVar.D() != null && (bundle = aVar.D().getBundle("scionData")) != null && (bundle2 = bundle.getBundle("_cmp")) != null) {
            c("medium", "utm_medium", bundle2, bundle3);
            c("source", "utm_source", bundle2, bundle3);
            c("campaign", "utm_campaign", bundle2, bundle3);
        }
        this.f13613c = bundle3;
    }
}
