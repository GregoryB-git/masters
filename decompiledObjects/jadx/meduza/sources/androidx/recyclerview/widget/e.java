package androidx.recyclerview.widget;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal<e> f1342e = new ThreadLocal<>();
    public static a f = new a();

    /* renamed from: b, reason: collision with root package name */
    public long f1344b;

    /* renamed from: c, reason: collision with root package name */
    public long f1345c;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<RecyclerView> f1343a = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<c> f1346d = new ArrayList<>();

    public class a implements Comparator<c> {
        /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
        
            return 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
        
            if (r0 != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        
            if (r0 == null) goto L13;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int compare(androidx.recyclerview.widget.e.c r7, androidx.recyclerview.widget.e.c r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.e$c r7 = (androidx.recyclerview.widget.e.c) r7
                androidx.recyclerview.widget.e$c r8 = (androidx.recyclerview.widget.e.c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f1353d
                r1 = 0
                r2 = 1
                if (r0 != 0) goto Lc
                r3 = r2
                goto Ld
            Lc:
                r3 = r1
            Ld:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f1353d
                if (r4 != 0) goto L13
                r4 = r2
                goto L14
            L13:
                r4 = r1
            L14:
                r5 = -1
                if (r3 == r4) goto L1d
                if (r0 != 0) goto L1b
            L19:
                r1 = r2
                goto L37
            L1b:
                r1 = r5
                goto L37
            L1d:
                boolean r0 = r7.f1350a
                boolean r3 = r8.f1350a
                if (r0 == r3) goto L26
                if (r0 == 0) goto L19
                goto L1b
            L26:
                int r0 = r8.f1351b
                int r2 = r7.f1351b
                int r0 = r0 - r2
                if (r0 == 0) goto L2f
                r1 = r0
                goto L37
            L2f:
                int r7 = r7.f1352c
                int r8 = r8.f1352c
                int r7 = r7 - r8
                if (r7 == 0) goto L37
                r1 = r7
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.e.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f1347a;

        /* renamed from: b, reason: collision with root package name */
        public int f1348b;

        /* renamed from: c, reason: collision with root package name */
        public int f1349c;
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f1350a;

        /* renamed from: b, reason: collision with root package name */
        public int f1351b;

        /* renamed from: c, reason: collision with root package name */
        public int f1352c;

        /* renamed from: d, reason: collision with root package name */
        public RecyclerView f1353d;

        /* renamed from: e, reason: collision with root package name */
        public int f1354e;
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f1344b == 0) {
            this.f1344b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.f1185h0;
        bVar.f1347a = i10;
        bVar.f1348b = i11;
    }

    public final void b(long j10) {
        c cVar;
        RecyclerView recyclerView;
        int size = this.f1343a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView2 = this.f1343a.get(i11);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f1185h0;
                bVar.f1349c = 0;
                bVar.getClass();
                i10 += recyclerView2.f1185h0.f1349c;
            }
        }
        this.f1346d.ensureCapacity(i10);
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView recyclerView3 = this.f1343a.get(i12);
            if (recyclerView3.getWindowVisibility() == 0) {
                b bVar2 = recyclerView3.f1185h0;
                Math.abs(bVar2.f1347a);
                Math.abs(bVar2.f1348b);
                if (bVar2.f1349c * 2 > 0) {
                    if (this.f1346d.size() <= 0) {
                        this.f1346d.add(new c());
                    } else {
                        this.f1346d.get(0);
                    }
                    bVar2.getClass();
                    throw null;
                }
            }
        }
        Collections.sort(this.f1346d, f);
        if (this.f1346d.size() <= 0 || (recyclerView = (cVar = this.f1346d.get(0)).f1353d) == null) {
            return;
        }
        if (cVar.f1350a) {
            j10 = Long.MAX_VALUE;
        }
        int i13 = cVar.f1354e;
        if (recyclerView.f1179d.e() > 0) {
            RecyclerView.p(recyclerView.f1179d.d(0));
            throw null;
        }
        RecyclerView.p pVar = recyclerView.f1173a;
        try {
            recyclerView.r();
            pVar.e(i13, j10);
            throw null;
        } catch (Throwable th) {
            recyclerView.s(false);
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i10 = a0.n.f13a;
            Trace.beginSection("RV Prefetch");
            if (this.f1343a.isEmpty()) {
                this.f1344b = 0L;
                Trace.endSection();
                return;
            }
            int size = this.f1343a.size();
            long j10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                RecyclerView recyclerView = this.f1343a.get(i11);
                if (recyclerView.getWindowVisibility() == 0) {
                    j10 = Math.max(recyclerView.getDrawingTime(), j10);
                }
            }
            if (j10 == 0) {
                this.f1344b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j10) + this.f1345c);
                this.f1344b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f1344b = 0L;
            int i12 = a0.n.f13a;
            Trace.endSection();
            throw th;
        }
    }
}
