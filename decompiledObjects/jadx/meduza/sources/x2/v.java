package x2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import o2.o;
import x2.s;

/* loaded from: classes.dex */
public final class v implements Callable<List<s.c>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1.l f16882a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f16883b;

    public v(u uVar, p1.l lVar) {
        this.f16883b = uVar;
        this.f16882a = lVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<s.c> call() {
        this.f16883b.f16869a.c();
        try {
            Cursor o10 = b.z.o(this.f16883b.f16869a, this.f16882a, true);
            try {
                HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
                HashMap<String, ArrayList<androidx.work.c>> hashMap2 = new HashMap<>();
                while (o10.moveToNext()) {
                    String string = o10.getString(0);
                    if (hashMap.get(string) == null) {
                        hashMap.put(string, new ArrayList<>());
                    }
                    String string2 = o10.getString(0);
                    if (hashMap2.get(string2) == null) {
                        hashMap2.put(string2, new ArrayList<>());
                    }
                }
                o10.moveToPosition(-1);
                this.f16883b.D(hashMap);
                this.f16883b.C(hashMap2);
                ArrayList arrayList = new ArrayList(o10.getCount());
                while (o10.moveToNext()) {
                    String string3 = o10.isNull(0) ? null : o10.getString(0);
                    o.b e10 = z.e(o10.getInt(1));
                    androidx.work.c a10 = androidx.work.c.a(o10.isNull(2) ? null : o10.getBlob(2));
                    int i10 = o10.getInt(3);
                    int i11 = o10.getInt(4);
                    long j10 = o10.getLong(13);
                    long j11 = o10.getLong(14);
                    long j12 = o10.getLong(15);
                    int b10 = z.b(o10.getInt(16));
                    long j13 = o10.getLong(17);
                    long j14 = o10.getLong(18);
                    int i12 = o10.getInt(19);
                    long j15 = o10.getLong(20);
                    int i13 = o10.getInt(21);
                    o2.c cVar = new o2.c(z.c(o10.getInt(5)), o10.getInt(6) != 0, o10.getInt(7) != 0, o10.getInt(8) != 0, o10.getInt(9) != 0, o10.getLong(10), o10.getLong(11), z.a(o10.isNull(12) ? null : o10.getBlob(12)));
                    ArrayList<String> arrayList2 = hashMap.get(o10.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    ArrayList<String> arrayList3 = arrayList2;
                    ArrayList<androidx.work.c> arrayList4 = hashMap2.get(o10.getString(0));
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList<>();
                    }
                    arrayList.add(new s.c(string3, e10, a10, j10, j11, j12, cVar, i10, b10, j13, j14, i12, i11, j15, i13, arrayList3, arrayList4));
                }
                this.f16883b.f16869a.n();
                o10.close();
                return arrayList;
            } catch (Throwable th) {
                o10.close();
                throw th;
            }
        } finally {
            this.f16883b.f16869a.j();
        }
    }

    public final void finalize() {
        this.f16882a.H();
    }
}
