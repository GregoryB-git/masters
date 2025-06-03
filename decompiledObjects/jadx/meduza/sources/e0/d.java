package e0;

import a4.g;
import a5.a;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.util.JsonReader;
import c4.f;
import ca.e;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.firestore.FirestoreRegistrar;
import com.google.firebase.firestore.f;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import e0.f;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import k3.j;
import n8.a;
import o7.t;
import r3.t;
import r7.a;
import t9.a;
import u4.g;
import v3.b1;
import v3.g;
import v3.i1;
import v3.o0;
import v3.q1;
import v5.l;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements f.b, t.a, g.a, v5.e, f.a.InterfaceC0035a, g.a, e.a, a.InterfaceC0234a, a.InterfaceC0173a, Continuation, n9.j, d8.e, n7.q, l.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3765a;

    public /* synthetic */ d(int i10) {
        this.f3765a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // n9.j
    public void a(e9.e eVar) {
    }

    @Override // v5.e
    public void accept(Object obj) {
        ((g.a) obj).c();
    }

    @Override // r3.t.a
    public Object apply(Object obj) {
        switch (this.f3765a) {
            case 2:
                Cursor cursor = (Cursor) obj;
                h3.c cVar = r3.t.f;
                return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0L);
            case 3:
                Cursor cursor2 = (Cursor) obj;
                h3.c cVar2 = r3.t.f;
                ArrayList arrayList = new ArrayList();
                while (cursor2.moveToNext()) {
                    j.a a10 = k3.s.a();
                    a10.b(cursor2.getString(1));
                    a10.c(u3.a.b(cursor2.getInt(2)));
                    String string = cursor2.getString(3);
                    a10.f8900b = string == null ? null : Base64.decode(string, 0);
                    arrayList.add(a10.a());
                }
                return arrayList;
            default:
                Cursor cursor3 = (Cursor) obj;
                h3.c cVar3 = r3.t.f;
                ArrayList arrayList2 = new ArrayList();
                int i10 = 0;
                while (cursor3.moveToNext()) {
                    byte[] blob = cursor3.getBlob(0);
                    arrayList2.add(blob);
                    i10 += blob.length;
                }
                byte[] bArr = new byte[i10];
                int i11 = 0;
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    byte[] bArr2 = (byte[]) arrayList2.get(i12);
                    System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
                    i11 += bArr2.length;
                }
                return bArr;
        }
    }

    @Override // c4.f.a.InterfaceC0035a
    public Constructor b() {
        int[] iArr = c4.f.f2279e;
        return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(c4.h.class).getConstructor(new Class[0]);
    }

    @Override // n8.a.InterfaceC0173a
    public Object c(JsonReader jsonReader) {
        int i10;
        switch (this.f3765a) {
            case 22:
                return n8.a.e(jsonReader);
            case 23:
                return n8.a.b(jsonReader);
            default:
                a9.d dVar = n8.a.f11321a;
                jsonReader.beginObject();
                byte b10 = 0;
                long j10 = 0;
                String str = null;
                String str2 = null;
                long j11 = 0;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    nextName.getClass();
                    nextName.hashCode();
                    switch (nextName) {
                        case "name":
                            str = jsonReader.nextString();
                            if (str == null) {
                                throw new NullPointerException("Null name");
                            }
                            continue;
                        case "size":
                            j10 = jsonReader.nextLong();
                            i10 = b10 | 2;
                            break;
                        case "uuid":
                            str2 = new String(Base64.decode(jsonReader.nextString(), 2), m8.f0.f10579a);
                            continue;
                        case "baseAddress":
                            i10 = b10 | 1;
                            j11 = jsonReader.nextLong();
                            break;
                        default:
                            jsonReader.skipValue();
                            continue;
                    }
                    b10 = (byte) i10;
                }
                jsonReader.endObject();
                if (b10 == 3 && str != null) {
                    return new m8.o(j11, j10, str, str2);
                }
                StringBuilder sb2 = new StringBuilder();
                if ((b10 & 1) == 0) {
                    sb2.append(" baseAddress");
                }
                if ((b10 & 2) == 0) {
                    sb2.append(" size");
                }
                if (str == null) {
                    sb2.append(" name");
                }
                throw new IllegalStateException(a0.j.l("Missing required properties:", sb2));
        }
    }

    @Override // u4.g.a
    public boolean d(int i10, int i11, int i12, int i13, int i14) {
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    @Override // ca.e.a
    public String e(Context context) {
        return FirebaseCommonRegistrar.a(context);
    }

    @Override // v3.g.a
    public v3.g f(Bundle bundle) {
        o7.l0 a10;
        switch (this.f3765a) {
            case 6:
                o0.h.a aVar = new o0.h.a();
                aVar.f15607a = (Uri) bundle.getParcelable(o0.h.f15602d);
                aVar.f15608b = bundle.getString(o0.h.f15603e);
                bundle.getBundle(o0.h.f);
                return new o0.h(aVar);
            case 7:
                String str = b1.f15248d;
                x6.b.q(bundle.getInt(i1.f15487a, -1) == 1);
                float f = bundle.getFloat(b1.f15248d, -1.0f);
                return f == -1.0f ? new b1() : new b1(f);
            case 8:
                String str2 = q1.f15713e;
                x6.b.q(bundle.getInt(i1.f15487a, -1) == 3);
                return bundle.getBoolean(q1.f15713e, false) ? new q1(bundle.getBoolean(q1.f, false)) : new q1();
            case 15:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(z4.i0.f);
                if (parcelableArrayList == null) {
                    t.b bVar = o7.t.f12050b;
                    a10 = o7.l0.f12009e;
                } else {
                    a10 = v5.b.a(v3.i0.f15446x0, parcelableArrayList);
                }
                return new z4.i0(bundle.getString(z4.i0.f17682o, ""), (v3.i0[]) a10.toArray(new v3.i0[0]));
            case 16:
                long j10 = bundle.getLong(a.C0006a.f219q);
                int i10 = bundle.getInt(a.C0006a.f220r);
                int i11 = bundle.getInt(a.C0006a.f225x);
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(a.C0006a.f221s);
                int[] intArray = bundle.getIntArray(a.C0006a.t);
                long[] longArray = bundle.getLongArray(a.C0006a.f222u);
                long j11 = bundle.getLong(a.C0006a.f223v);
                boolean z10 = bundle.getBoolean(a.C0006a.f224w);
                if (intArray == null) {
                    intArray = new int[0];
                }
                return new a.C0006a(j10, i10, i11, intArray, parcelableArrayList2 == null ? new Uri[0] : (Uri[]) parcelableArrayList2.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j11, z10);
            case 17:
                Bundle bundle2 = bundle.getBundle(r5.l.f13719c);
                bundle2.getClass();
                z4.i0 i0Var = (z4.i0) z4.i0.f17683p.f(bundle2);
                int[] intArray2 = bundle.getIntArray(r5.l.f13720d);
                intArray2.getClass();
                return new r5.l(i0Var, intArray2.length == 0 ? Collections.emptyList() : new a.C0210a(0, intArray2.length, intArray2));
            default:
                return new w5.b(bundle.getInt(w5.b.f, -1), bundle.getByteArray(w5.b.f16325q), bundle.getInt(w5.b.f16323o, -1), bundle.getInt(w5.b.f16324p, -1));
        }
    }

    @Override // d8.e
    public Object g(d8.u uVar) {
        ea.j0 components$lambda$5;
        com.google.firebase.firestore.h lambda$getComponents$0;
        ea.e0 components$lambda$1;
        switch (this.f3765a) {
            case 0:
                d8.o<ScheduledExecutorService> oVar = ExecutorsRegistrar.f3110a;
                return e8.k.f4843a;
            case 1:
                lambda$getComponents$0 = FirestoreRegistrar.lambda$getComponents$0(uVar);
                return lambda$getComponents$0;
            case 2:
                components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(uVar);
                return components$lambda$1;
            default:
                components$lambda$5 = FirebaseSessionsRegistrar.getComponents$lambda$5(uVar);
                return components$lambda$5;
        }
    }

    @Override // n7.q
    public Object get() {
        switch (this.f3765a) {
            case 0:
                return new v3.j(new t5.o(), 50000, 50000, 2500, 5000, -1, false, 0, false);
            case 1:
                byte[] bArr = new byte[12];
                w3.x.f16242h.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            default:
                throw new IllegalStateException();
        }
    }

    @Override // t9.a.InterfaceC0234a
    public void h(t9.b bVar) {
    }

    @Override // v5.l.a
    public void invoke(Object obj) {
        switch (this.f3765a) {
            case 0:
                ((w3.b) obj).Q();
                break;
            default:
                ((w3.b) obj).t0();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f3765a) {
            case 25:
                return task.isSuccessful() ? Tasks.forResult(((z7.a) task.getResult()).b()) : Tasks.forException(task.getException());
            case 26:
            default:
                Object obj = aa.j.f310c;
                return 403;
            case 27:
                j9.g gVar = (j9.g) task.getResult();
                if (gVar.b()) {
                    return gVar;
                }
                if (gVar.h()) {
                    return null;
                }
                throw new com.google.firebase.firestore.f("Failed to get document from cache. (However, this document may exist on the server. Run again without setting source to CACHE to attempt to retrieve the document from the server.)", f.a.UNAVAILABLE);
            case 28:
                ec.i.e(task, "task");
                if (task.isSuccessful()) {
                    return ((b8.s) task.getResult()).f2137a;
                }
                Exception exception = task.getException();
                if (exception instanceof z9.a) {
                    return null;
                }
                ec.i.b(exception);
                throw exception;
        }
    }
}
