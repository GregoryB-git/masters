package rc;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.concurrent.atomic.AtomicInteger;
import nc.d0;
import sb.v;

@wb.e(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {R.styleable.AppCompatTheme_colorControlHighlight, R.styleable.AppCompatTheme_listDividerAlertDialog, R.styleable.AppCompatTheme_listPreferredItemHeight}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class j extends wb.i implements dc.p<d0, ub.e<? super rb.h>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public pc.f f13870a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f13871b;

    /* renamed from: c, reason: collision with root package name */
    public int f13872c;

    /* renamed from: d, reason: collision with root package name */
    public int f13873d;

    /* renamed from: e, reason: collision with root package name */
    public int f13874e;
    public /* synthetic */ Object f;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ qc.e<Object>[] f13875o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ dc.a<Object[]> f13876p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ dc.q<qc.f<Object>, Object[], ub.e<? super rb.h>, Object> f13877q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ qc.f<Object> f13878r;

    @wb.e(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {31}, m = "invokeSuspend")
    public static final class a extends wb.i implements dc.p<d0, ub.e<? super rb.h>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f13879a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qc.e<Object>[] f13880b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f13881c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f13882d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ pc.f<v<Object>> f13883e;

        /* renamed from: rc.j$a$a, reason: collision with other inner class name */
        public static final class C0211a<T> implements qc.f {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ pc.f<v<Object>> f13884a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f13885b;

            @wb.e(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", l = {32, 33}, m = "emit")
            /* renamed from: rc.j$a$a$a, reason: collision with other inner class name */
            public static final class C0212a extends wb.c {

                /* renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f13886a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0211a<T> f13887b;

                /* renamed from: c, reason: collision with root package name */
                public int f13888c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0212a(C0211a<? super T> c0211a, ub.e<? super C0212a> eVar) {
                    super(eVar);
                    this.f13887b = c0211a;
                }

                @Override // wb.a
                public final Object invokeSuspend(Object obj) {
                    this.f13886a = obj;
                    this.f13888c |= Integer.MIN_VALUE;
                    return this.f13887b.emit(null, this);
                }
            }

            public C0211a(pc.f<v<Object>> fVar, int i10) {
                this.f13884a = fVar;
                this.f13885b = i10;
            }

            /* JADX WARN: Code restructure failed: missing block: B:40:0x00c6, code lost:
            
                if (r4 == false) goto L51;
             */
            /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00dc A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:60:0x0061  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0037  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            @Override // qc.f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(T r7, ub.e<? super rb.h> r8) {
                /*
                    Method dump skipped, instructions count: 224
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: rc.j.a.C0211a.emit(java.lang.Object, ub.e):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qc.e<Object>[] eVarArr, int i10, AtomicInteger atomicInteger, pc.f<v<Object>> fVar, ub.e<? super a> eVar) {
            super(2, eVar);
            this.f13880b = eVarArr;
            this.f13881c = i10;
            this.f13882d = atomicInteger;
            this.f13883e = fVar;
        }

        @Override // wb.a
        public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
            return new a(this.f13880b, this.f13881c, this.f13882d, this.f13883e, eVar);
        }

        @Override // dc.p
        public final Object invoke(d0 d0Var, ub.e<? super rb.h> eVar) {
            return ((a) create(d0Var, eVar)).invokeSuspend(rb.h.f13851a);
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            AtomicInteger atomicInteger;
            vb.a aVar = vb.a.f16085a;
            int i10 = this.f13879a;
            try {
                if (i10 == 0) {
                    rb.f.b(obj);
                    qc.e<Object>[] eVarArr = this.f13880b;
                    int i11 = this.f13881c;
                    qc.e<Object> eVar = eVarArr[i11];
                    C0211a c0211a = new C0211a(this.f13883e, i11);
                    this.f13879a = 1;
                    if (eVar.collect(c0211a, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rb.f.b(obj);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    this.f13883e.d(null);
                }
                return rb.h.f13851a;
            } finally {
                if (this.f13882d.decrementAndGet() == 0) {
                    this.f13883e.d(null);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ub.e eVar, dc.a aVar, dc.q qVar, qc.f fVar, qc.e[] eVarArr) {
        super(2, eVar);
        this.f13875o = eVarArr;
        this.f13876p = aVar;
        this.f13877q = qVar;
        this.f13878r = fVar;
    }

    @Override // wb.a
    public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
        j jVar = new j(eVar, this.f13876p, this.f13877q, this.f13878r, this.f13875o);
        jVar.f = obj;
        return jVar;
    }

    @Override // dc.p
    public final Object invoke(d0 d0Var, ub.e<? super rb.h> eVar) {
        return ((j) create(d0Var, eVar)).invokeSuspend(rb.h.f13851a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5 A[LOOP:0: B:19:0x00b5->B:40:?, LOOP_START, PHI: r8 r12
      0x00b5: PHI (r8v3 int) = (r8v2 int), (r8v4 int) binds: [B:16:0x00b0, B:40:?] A[DONT_GENERATE, DONT_INLINE]
      0x00b5: PHI (r12v4 sb.v) = (r12v3 sb.v), (r12v17 sb.v) binds: [B:16:0x00b0, B:40:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00f8 -> B:8:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0114 -> B:8:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0117 -> B:8:0x0093). Please report as a decompilation issue!!! */
    @Override // wb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
