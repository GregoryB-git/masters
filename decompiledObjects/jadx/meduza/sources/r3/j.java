package r3;

import a5.a;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.os.Bundle;
import android.util.JsonReader;
import android.util.Log;
import c4.f;
import ca.e;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import n8.a;
import r3.t;
import v3.d0;
import v3.f1;
import v3.g;
import v3.i1;
import v3.k0;
import v3.o0;
import v3.r1;
import v5.l;
import z4.b0;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements t.a, g.a, l.a, f.a.InterfaceC0035a, v5.e, e.a, OnFailureListener, a.InterfaceC0173a, Continuation, h3.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13559a;

    public /* synthetic */ j(int i10) {
        this.f13559a = i10;
    }

    @Override // v5.e
    public final void accept(Object obj) {
        ((b0.b) obj).f17599b.release();
    }

    @Override // r3.t.a
    public final Object apply(Object obj) {
        switch (this.f13559a) {
            case 0:
                throw new s3.a("Timed out while trying to open db.", (Throwable) obj);
            case 1:
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            case 2:
                Cursor cursor = (Cursor) obj;
                if (cursor.moveToNext()) {
                    return Long.valueOf(cursor.getLong(0));
                }
                return null;
            default:
                ba.b bVar = (ba.b) obj;
                bVar.getClass();
                b9.g gVar = aa.t.f363a;
                gVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    gVar.a(bVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
        }
    }

    @Override // c4.f.a.InterfaceC0035a
    public final Constructor b() {
        int[] iArr = c4.f.f2279e;
        if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
            return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(c4.h.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    @Override // n8.a.InterfaceC0173a
    public final Object c(JsonReader jsonReader) {
        switch (this.f13559a) {
            case 16:
                return n8.a.b(jsonReader);
            default:
                a9.d dVar = n8.a.f11321a;
                jsonReader.beginObject();
                String str = null;
                byte b10 = 0;
                int i10 = 0;
                List list = null;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    nextName.hashCode();
                    switch (nextName) {
                        case "frames":
                            list = n8.a.d(jsonReader, new e0.e(23));
                            if (list == null) {
                                throw new NullPointerException("Null frames");
                            }
                            break;
                        case "name":
                            str = jsonReader.nextString();
                            if (str == null) {
                                throw new NullPointerException("Null name");
                            }
                            break;
                        case "importance":
                            i10 = jsonReader.nextInt();
                            b10 = (byte) (b10 | 1);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
                if (b10 == 1 && str != null && list != null) {
                    return new m8.r(str, i10, list);
                }
                StringBuilder sb2 = new StringBuilder();
                if (str == null) {
                    sb2.append(" name");
                }
                if ((1 & b10) == 0) {
                    sb2.append(" importance");
                }
                if (list == null) {
                    sb2.append(" frames");
                }
                throw new IllegalStateException(a0.j.l("Missing required properties:", sb2));
        }
    }

    @Override // ca.e.a
    public final String e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    @Override // v3.g.a
    public final v3.g f(Bundle bundle) {
        a.C0006a[] c0006aArr;
        switch (this.f13559a) {
            case 7:
                String str = k0.f15507e;
                x6.b.q(bundle.getInt(i1.f15487a, -1) == 0);
                return bundle.getBoolean(k0.f15507e, false) ? new k0(bundle.getBoolean(k0.f, false)) : new k0();
            case 8:
                return new o0.e(bundle.getLong(o0.e.f15580o, -9223372036854775807L), bundle.getLong(o0.e.f15581p, -9223372036854775807L), bundle.getLong(o0.e.f15582q, -9223372036854775807L), bundle.getFloat(o0.e.f15583r, -3.4028235E38f), bundle.getFloat(o0.e.f15584s, -3.4028235E38f));
            case 9:
            default:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(a5.a.f210q);
                if (parcelableArrayList == null) {
                    c0006aArr = new a.C0006a[0];
                } else {
                    a.C0006a[] c0006aArr2 = new a.C0006a[parcelableArrayList.size()];
                    for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                        c0006aArr2[i10] = (a.C0006a) a.C0006a.f226y.f((Bundle) parcelableArrayList.get(i10));
                    }
                    c0006aArr = c0006aArr2;
                }
                return new a5.a(c0006aArr, bundle.getLong(a5.a.f211r, 0L), bundle.getLong(a5.a.f212s, -9223372036854775807L), bundle.getInt(a5.a.t, 0));
            case 10:
                Bundle bundle2 = bundle.getBundle(r1.c.C);
                o0 o0Var = bundle2 != null ? (o0) o0.f15533u.f(bundle2) : o0.f15528o;
                long j10 = bundle.getLong(r1.c.D, -9223372036854775807L);
                long j11 = bundle.getLong(r1.c.E, -9223372036854775807L);
                long j12 = bundle.getLong(r1.c.F, -9223372036854775807L);
                boolean z10 = bundle.getBoolean(r1.c.G, false);
                boolean z11 = bundle.getBoolean(r1.c.H, false);
                Bundle bundle3 = bundle.getBundle(r1.c.I);
                o0.e eVar = bundle3 != null ? (o0.e) o0.e.t.f(bundle3) : null;
                boolean z12 = bundle.getBoolean(r1.c.J, false);
                long j13 = bundle.getLong(r1.c.K, 0L);
                long j14 = bundle.getLong(r1.c.L, -9223372036854775807L);
                int i11 = bundle.getInt(r1.c.M, 0);
                int i12 = bundle.getInt(r1.c.N, 0);
                long j15 = bundle.getLong(r1.c.O, 0L);
                r1.c cVar = new r1.c();
                cVar.b(r1.c.A, o0Var, null, j10, j11, j12, z10, z11, eVar, j13, j14, i11, i12, j15);
                cVar.t = z12;
                return cVar;
        }
    }

    @Override // v5.l.a
    public final void invoke(Object obj) {
        switch (this.f13559a) {
            case 4:
                int i10 = d0.f15267h0;
                ((f1.c) obj).a0(new v3.n(2, 1003, new n7.w(1)));
                break;
            case 5:
                ((f1.c) obj).f();
                break;
            default:
                ((f1.c) obj).m();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // com.google.android.gms.tasks.Continuation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object then(com.google.android.gms.tasks.Task r4) {
        /*
            r3 = this;
            r3.j r0 = n9.o.f11373a
            boolean r0 = r4.isSuccessful()
            if (r0 == 0) goto Lf
            java.lang.Object r4 = r4.getResult()
            java.lang.Void r4 = (java.lang.Void) r4
            return r4
        Lf:
            java.lang.Exception r4 = r4.getException()
            boolean r0 = r4 instanceof eb.f1
            if (r0 == 0) goto L1c
            eb.f1 r4 = (eb.f1) r4
            eb.e1 r4 = r4.f5105a
            goto L24
        L1c:
            boolean r0 = r4 instanceof eb.g1
            if (r0 == 0) goto L28
            eb.g1 r4 = (eb.g1) r4
            eb.e1 r4 = r4.f5110a
        L24:
            com.google.firebase.firestore.f r4 = n9.o.g(r4)
        L28:
            boolean r0 = r4 instanceof com.google.firebase.firestore.f
            if (r0 == 0) goto L2d
            throw r4
        L2d:
            com.google.firebase.firestore.f r0 = new com.google.firebase.firestore.f
            java.lang.String r1 = r4.getMessage()
            com.google.firebase.firestore.f$a r2 = com.google.firebase.firestore.f.a.UNKNOWN
            r0.<init>(r1, r2, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.j.then(com.google.android.gms.tasks.Task):java.lang.Object");
    }
}
