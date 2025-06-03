package o0;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import nc.d0;

/* loaded from: classes.dex */
public final class q<T> implements o0.i<T> {

    /* renamed from: k, reason: collision with root package name */
    public static final LinkedHashSet f11615k = new LinkedHashSet();

    /* renamed from: l, reason: collision with root package name */
    public static final Object f11616l = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final dc.a<File> f11617a;

    /* renamed from: b, reason: collision with root package name */
    public final m<T> f11618b;

    /* renamed from: c, reason: collision with root package name */
    public final o0.b<T> f11619c;

    /* renamed from: d, reason: collision with root package name */
    public final d0 f11620d;

    /* renamed from: e, reason: collision with root package name */
    public final qc.r f11621e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final rb.g f11622g;

    /* renamed from: h, reason: collision with root package name */
    public final qc.t f11623h;

    /* renamed from: i, reason: collision with root package name */
    public List<? extends dc.p<? super k<T>, ? super ub.e<? super rb.h>, ? extends Object>> f11624i;

    /* renamed from: j, reason: collision with root package name */
    public final p<a<T>> f11625j;

    public static abstract class a<T> {

        /* renamed from: o0.q$a$a, reason: collision with other inner class name */
        public static final class C0183a<T> extends a<T> {

            /* renamed from: a, reason: collision with root package name */
            public final b0<T> f11626a;

            public C0183a(b0<T> b0Var) {
                this.f11626a = b0Var;
            }
        }

        public static final class b<T> extends a<T> {

            /* renamed from: a, reason: collision with root package name */
            public final dc.p<T, ub.e<? super T>, Object> f11627a;

            /* renamed from: b, reason: collision with root package name */
            public final nc.r<T> f11628b;

            /* renamed from: c, reason: collision with root package name */
            public final b0<T> f11629c;

            /* renamed from: d, reason: collision with root package name */
            public final ub.h f11630d;

            public b(dc.p pVar, nc.s sVar, b0 b0Var, ub.h hVar) {
                ec.i.e(hVar, "callerContext");
                this.f11627a = pVar;
                this.f11628b = sVar;
                this.f11629c = b0Var;
                this.f11630d = hVar;
            }
        }
    }

    public static final class b extends OutputStream {

        /* renamed from: a, reason: collision with root package name */
        public final FileOutputStream f11631a;

        public b(FileOutputStream fileOutputStream) {
            this.f11631a = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            this.f11631a.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i10) {
            this.f11631a.write(i10);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            ec.i.e(bArr, "b");
            this.f11631a.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i10, int i11) {
            ec.i.e(bArr, "bytes");
            this.f11631a.write(bArr, i10, i11);
        }
    }

    @wb.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {322, 348, 505}, m = "readAndInit")
    public static final class c extends wb.c {

        /* renamed from: a, reason: collision with root package name */
        public q f11632a;

        /* renamed from: b, reason: collision with root package name */
        public Object f11633b;

        /* renamed from: c, reason: collision with root package name */
        public Serializable f11634c;

        /* renamed from: d, reason: collision with root package name */
        public Object f11635d;

        /* renamed from: e, reason: collision with root package name */
        public d f11636e;
        public Iterator f;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f11637o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ q<T> f11638p;

        /* renamed from: q, reason: collision with root package name */
        public int f11639q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(q<T> qVar, ub.e<? super c> eVar) {
            super(eVar);
            this.f11638p = qVar;
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            this.f11637o = obj;
            this.f11639q |= Integer.MIN_VALUE;
            q<T> qVar = this.f11638p;
            LinkedHashSet linkedHashSet = q.f11615k;
            return qVar.d(this);
        }
    }

    public static final class d implements k<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ vc.a f11640a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ec.r f11641b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ec.s<T> f11642c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q<T> f11643d;

        public d(vc.a aVar, ec.r rVar, ec.s<T> sVar, q<T> qVar) {
            this.f11640a = aVar;
            this.f11641b = rVar;
            this.f11642c = sVar;
            this.f11643d = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00b3 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:28:0x0050, B:29:0x00ab, B:31:0x00b3), top: B:27:0x0050 }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0093 A[Catch: all -> 0x00d4, TRY_LEAVE, TryCatch #0 {all -> 0x00d4, blocks: (B:41:0x008f, B:43:0x0093, B:47:0x00d6, B:48:0x00dd), top: B:40:0x008f }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00d6 A[Catch: all -> 0x00d4, TRY_ENTER, TryCatch #0 {all -> 0x00d4, blocks: (B:41:0x008f, B:43:0x0093, B:47:0x00d6, B:48:0x00dd), top: B:40:0x008f }] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // o0.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(o0.g r11, ub.e r12) {
            /*
                Method dump skipped, instructions count: 226
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o0.q.d.a(o0.g, ub.e):java.lang.Object");
        }
    }

    @wb.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {302}, m = "readAndInitOrPropagateAndThrowFailure")
    public static final class e extends wb.c {

        /* renamed from: a, reason: collision with root package name */
        public q f11644a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f11645b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q<T> f11646c;

        /* renamed from: d, reason: collision with root package name */
        public int f11647d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(q<T> qVar, ub.e<? super e> eVar) {
            super(eVar);
            this.f11646c = qVar;
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            this.f11645b = obj;
            this.f11647d |= Integer.MIN_VALUE;
            q<T> qVar = this.f11646c;
            LinkedHashSet linkedHashSet = q.f11615k;
            return qVar.e(this);
        }
    }

    @wb.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {311}, m = "readAndInitOrPropagateFailure")
    public static final class f extends wb.c {

        /* renamed from: a, reason: collision with root package name */
        public q f11648a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f11649b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q<T> f11650c;

        /* renamed from: d, reason: collision with root package name */
        public int f11651d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(q<T> qVar, ub.e<? super f> eVar) {
            super(eVar);
            this.f11650c = qVar;
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            this.f11649b = obj;
            this.f11651d |= Integer.MIN_VALUE;
            q<T> qVar = this.f11650c;
            LinkedHashSet linkedHashSet = q.f11615k;
            return qVar.f(this);
        }
    }

    @wb.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {381}, m = "readData")
    public static final class g extends wb.c {

        /* renamed from: a, reason: collision with root package name */
        public q f11652a;

        /* renamed from: b, reason: collision with root package name */
        public FileInputStream f11653b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f11654c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q<T> f11655d;

        /* renamed from: e, reason: collision with root package name */
        public int f11656e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(q<T> qVar, ub.e<? super g> eVar) {
            super(eVar);
            this.f11655d = qVar;
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            this.f11654c = obj;
            this.f11656e |= Integer.MIN_VALUE;
            q<T> qVar = this.f11655d;
            LinkedHashSet linkedHashSet = q.f11615k;
            return qVar.g(this);
        }
    }

    @wb.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {359, 362, 365}, m = "readDataOrHandleCorruption")
    public static final class h extends wb.c {

        /* renamed from: a, reason: collision with root package name */
        public Object f11657a;

        /* renamed from: b, reason: collision with root package name */
        public Object f11658b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f11659c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q<T> f11660d;

        /* renamed from: e, reason: collision with root package name */
        public int f11661e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(q<T> qVar, ub.e<? super h> eVar) {
            super(eVar);
            this.f11660d = qVar;
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            this.f11659c = obj;
            this.f11661e |= Integer.MIN_VALUE;
            q<T> qVar = this.f11660d;
            LinkedHashSet linkedHashSet = q.f11615k;
            return qVar.h(this);
        }
    }

    @wb.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {426}, m = "writeData$datastore_core")
    public static final class i extends wb.c {

        /* renamed from: a, reason: collision with root package name */
        public q f11662a;

        /* renamed from: b, reason: collision with root package name */
        public File f11663b;

        /* renamed from: c, reason: collision with root package name */
        public FileOutputStream f11664c;

        /* renamed from: d, reason: collision with root package name */
        public FileOutputStream f11665d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f11666e;
        public final /* synthetic */ q<T> f;

        /* renamed from: o, reason: collision with root package name */
        public int f11667o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(q<T> qVar, ub.e<? super i> eVar) {
            super(eVar);
            this.f = qVar;
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            this.f11666e = obj;
            this.f11667o |= Integer.MIN_VALUE;
            return this.f.j(null, this);
        }
    }

    public q(r0.c cVar, List list, o0.b bVar, d0 d0Var) {
        r0.f fVar = r0.f.f13517a;
        this.f11617a = cVar;
        this.f11618b = fVar;
        this.f11619c = bVar;
        this.f11620d = d0Var;
        this.f11621e = new qc.r(new u(this, null));
        this.f = ".tmp";
        this.f11622g = b.z.n(new w(this));
        Object obj = c0.f11585a;
        this.f11623h = new qc.t(obj == null ? eb.y.f5255b : obj);
        this.f11624i = sb.q.u(list);
        this.f11625j = new p<>(d0Var, new r(this), s.f11669a, new t(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004d  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, o0.q] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8, types: [nc.r] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(o0.q r8, o0.q.a.b r9, ub.e r10) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.q.b(o0.q, o0.q$a$b, ub.e):java.lang.Object");
    }

    @Override // o0.i
    public final Object a(dc.p<? super T, ? super ub.e<? super T>, ? extends Object> pVar, ub.e<? super T> eVar) {
        nc.s b10 = b.z.b();
        this.f11625j.a(new a.b(pVar, b10, (b0) this.f11623h.b(), eVar.getContext()));
        return b10.await(eVar);
    }

    public final File c() {
        return (File) this.f11622g.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(ub.e<? super rb.h> r14) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.q.d(ub.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(ub.e<? super rb.h> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o0.q.e
            if (r0 == 0) goto L13
            r0 = r5
            o0.q$e r0 = (o0.q.e) r0
            int r1 = r0.f11647d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11647d = r1
            goto L18
        L13:
            o0.q$e r0 = new o0.q$e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f11645b
            vb.a r1 = vb.a.f16085a
            int r2 = r0.f11647d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            o0.q r0 = r0.f11644a
            rb.f.b(r5)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r5 = move-exception
            goto L46
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            rb.f.b(r5)
            r0.f11644a = r4     // Catch: java.lang.Throwable -> L44
            r0.f11647d = r3     // Catch: java.lang.Throwable -> L44
            java.lang.Object r5 = r4.d(r0)     // Catch: java.lang.Throwable -> L44
            if (r5 != r1) goto L41
            return r1
        L41:
            rb.h r5 = rb.h.f13851a
            return r5
        L44:
            r5 = move-exception
            r0 = r4
        L46:
            qc.t r0 = r0.f11623h
            o0.l r1 = new o0.l
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.q.e(ub.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(ub.e<? super rb.h> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o0.q.f
            if (r0 == 0) goto L13
            r0 = r5
            o0.q$f r0 = (o0.q.f) r0
            int r1 = r0.f11651d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11651d = r1
            goto L18
        L13:
            o0.q$f r0 = new o0.q$f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f11649b
            vb.a r1 = vb.a.f16085a
            int r2 = r0.f11651d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            o0.q r0 = r0.f11648a
            rb.f.b(r5)     // Catch: java.lang.Throwable -> L29
            goto L4d
        L29:
            r5 = move-exception
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            rb.f.b(r5)
            r0.f11648a = r4     // Catch: java.lang.Throwable -> L41
            r0.f11651d = r3     // Catch: java.lang.Throwable -> L41
            java.lang.Object r5 = r4.d(r0)     // Catch: java.lang.Throwable -> L41
            if (r5 != r1) goto L4d
            return r1
        L41:
            r5 = move-exception
            r0 = r4
        L43:
            qc.t r0 = r0.f11623h
            o0.l r1 = new o0.l
            r1.<init>(r5)
            r0.setValue(r1)
        L4d:
            rb.h r5 = rb.h.f13851a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.q.f(ub.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12, types: [o0.q] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [o0.q$g] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [o0.q] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(ub.e<? super T> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o0.q.g
            if (r0 == 0) goto L13
            r0 = r5
            o0.q$g r0 = (o0.q.g) r0
            int r1 = r0.f11656e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11656e = r1
            goto L18
        L13:
            o0.q$g r0 = new o0.q$g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f11654c
            vb.a r1 = vb.a.f16085a
            int r2 = r0.f11656e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.io.FileInputStream r1 = r0.f11653b
            o0.q r0 = r0.f11652a
            rb.f.b(r5)     // Catch: java.lang.Throwable -> L2b
            goto L53
        L2b:
            r5 = move-exception
            goto L5e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            rb.f.b(r5)
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L64
            java.io.File r2 = r4.c()     // Catch: java.io.FileNotFoundException -> L64
            r5.<init>(r2)     // Catch: java.io.FileNotFoundException -> L64
            o0.m<T> r2 = r4.f11618b     // Catch: java.lang.Throwable -> L5a
            r0.f11652a = r4     // Catch: java.lang.Throwable -> L5a
            r0.f11653b = r5     // Catch: java.lang.Throwable -> L5a
            r0.f11656e = r3     // Catch: java.lang.Throwable -> L5a
            r0.a r0 = r2.b(r5)     // Catch: java.lang.Throwable -> L5a
            if (r0 != r1) goto L50
            return r1
        L50:
            r1 = r5
            r5 = r0
            r0 = r4
        L53:
            r2 = 0
            x6.b.L(r1, r2)     // Catch: java.io.FileNotFoundException -> L58
            return r5
        L58:
            r5 = move-exception
            goto L66
        L5a:
            r0 = move-exception
            r1 = r5
            r5 = r0
            r0 = r4
        L5e:
            throw r5     // Catch: java.lang.Throwable -> L5f
        L5f:
            r2 = move-exception
            x6.b.L(r1, r5)     // Catch: java.io.FileNotFoundException -> L58
            throw r2     // Catch: java.io.FileNotFoundException -> L58
        L64:
            r5 = move-exception
            r0 = r4
        L66:
            java.io.File r1 = r0.c()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L77
            o0.m<T> r5 = r0.f11618b
            r0.a r5 = r5.a()
            return r5
        L77:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.q.g(ub.e):java.lang.Object");
    }

    @Override // o0.i
    public final qc.e<T> getData() {
        return this.f11621e;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(ub.e<? super T> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof o0.q.h
            if (r0 == 0) goto L13
            r0 = r8
            o0.q$h r0 = (o0.q.h) r0
            int r1 = r0.f11661e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11661e = r1
            goto L18
        L13:
            o0.q$h r0 = new o0.q$h
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f11659c
            vb.a r1 = vb.a.f16085a
            int r2 = r0.f11661e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L49
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r1 = r0.f11658b
            java.lang.Object r0 = r0.f11657a
            o0.a r0 = (o0.a) r0
            rb.f.b(r8)     // Catch: java.io.IOException -> L33
            goto L85
        L33:
            r8 = move-exception
            goto L88
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3d:
            java.lang.Object r2 = r0.f11658b
            o0.a r2 = (o0.a) r2
            java.lang.Object r4 = r0.f11657a
            o0.q r4 = (o0.q) r4
            rb.f.b(r8)
            goto L77
        L49:
            java.lang.Object r2 = r0.f11657a
            o0.q r2 = (o0.q) r2
            rb.f.b(r8)     // Catch: o0.a -> L51
            goto L61
        L51:
            r8 = move-exception
            goto L64
        L53:
            rb.f.b(r8)
            r0.f11657a = r7     // Catch: o0.a -> L62
            r0.f11661e = r5     // Catch: o0.a -> L62
            java.lang.Object r8 = r7.g(r0)     // Catch: o0.a -> L62
            if (r8 != r1) goto L61
            return r1
        L61:
            return r8
        L62:
            r8 = move-exception
            r2 = r7
        L64:
            o0.b<T> r5 = r2.f11619c
            r0.f11657a = r2
            r0.f11658b = r8
            r0.f11661e = r4
            java.lang.Object r4 = r5.a(r8)
            if (r4 != r1) goto L73
            return r1
        L73:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L77:
            r0.f11657a = r2     // Catch: java.io.IOException -> L86
            r0.f11658b = r8     // Catch: java.io.IOException -> L86
            r0.f11661e = r3     // Catch: java.io.IOException -> L86
            java.lang.Object r0 = r4.j(r8, r0)     // Catch: java.io.IOException -> L86
            if (r0 != r1) goto L84
            return r1
        L84:
            r1 = r8
        L85:
            return r1
        L86:
            r8 = move-exception
            r0 = r2
        L88:
            x6.b.e(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.q.h(ub.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(ub.e r8, ub.h r9, dc.p r10) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof o0.z
            if (r0 == 0) goto L13
            r0 = r8
            o0.z r0 = (o0.z) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            o0.z r0 = new o0.z
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f11698d
            vb.a r1 = vb.a.f16085a
            int r2 = r0.f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r9 = r0.f11696b
            o0.q r10 = r0.f11695a
            rb.f.b(r8)
            goto L86
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r9 = r0.f11697c
            java.lang.Object r10 = r0.f11696b
            o0.c r10 = (o0.c) r10
            o0.q r2 = r0.f11695a
            rb.f.b(r8)
            goto L6b
        L43:
            rb.f.b(r8)
            qc.t r8 = r7.f11623h
            java.lang.Object r8 = r8.b()
            o0.c r8 = (o0.c) r8
            r8.a()
            T r2 = r8.f11583a
            o0.a0 r6 = new o0.a0
            r6.<init>(r2, r3, r10)
            r0.f11695a = r7
            r0.f11696b = r8
            r0.f11697c = r2
            r0.f = r5
            java.lang.Object r9 = x6.b.z0(r0, r9, r6)
            if (r9 != r1) goto L67
            return r1
        L67:
            r10 = r8
            r8 = r9
            r9 = r2
            r2 = r7
        L6b:
            r10.a()
            boolean r10 = ec.i.a(r9, r8)
            if (r10 == 0) goto L75
            goto L98
        L75:
            r0.f11695a = r2
            r0.f11696b = r8
            r0.f11697c = r3
            r0.f = r4
            java.lang.Object r9 = r2.j(r8, r0)
            if (r9 != r1) goto L84
            return r1
        L84:
            r9 = r8
            r10 = r2
        L86:
            qc.t r8 = r10.f11623h
            o0.c r10 = new o0.c
            if (r9 == 0) goto L91
            int r0 = r9.hashCode()
            goto L92
        L91:
            r0 = 0
        L92:
            r10.<init>(r9, r0)
            r8.setValue(r10)
        L98:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.q.i(ub.e, ub.h, dc.p):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2 A[Catch: IOException -> 0x00be, TRY_ENTER, TryCatch #2 {IOException -> 0x00be, blocks: (B:14:0x0092, B:19:0x00a2, B:20:0x00bd, B:28:0x00c5, B:29:0x00c8, B:45:0x0068, B:25:0x00c3), top: B:44:0x0068, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(T r7, ub.e<? super rb.h> r8) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.q.j(java.lang.Object, ub.e):java.lang.Object");
    }
}
