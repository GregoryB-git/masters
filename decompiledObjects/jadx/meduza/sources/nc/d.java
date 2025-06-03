package nc;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.List;
import nc.c;

/* loaded from: classes.dex */
public final class d {

    @wb.e(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {R.styleable.AppCompatTheme_colorControlHighlight}, m = "joinAll")
    public static final class a extends wb.c {

        /* renamed from: a, reason: collision with root package name */
        public Object[] f11480a;

        /* renamed from: b, reason: collision with root package name */
        public int f11481b;

        /* renamed from: c, reason: collision with root package name */
        public int f11482c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f11483d;

        /* renamed from: e, reason: collision with root package name */
        public int f11484e;

        public a(ub.e<? super a> eVar) {
            super(eVar);
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            this.f11483d = obj;
            this.f11484e |= Integer.MIN_VALUE;
            return d.c(null, this);
        }
    }

    public static final <T> Object a(j0<? extends T>[] j0VarArr, ub.e<? super List<? extends T>> eVar) {
        if (j0VarArr.length == 0) {
            return sb.s.f14324a;
        }
        c cVar = new c(j0VarArr);
        l lVar = new l(1, p2.m0.P(eVar));
        lVar.t();
        int length = j0VarArr.length;
        c.a[] aVarArr = new c.a[length];
        for (int i10 = 0; i10 < length; i10++) {
            j0<T> j0Var = cVar.f11473a[i10];
            j0Var.start();
            c.a aVar = new c.a(lVar);
            aVar.f = j0Var.invokeOnCompletion(aVar);
            rb.h hVar = rb.h.f13851a;
            aVarArr[i10] = aVar;
        }
        c.b bVar = new c.b(aVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            c.a aVar2 = aVarArr[i11];
            aVar2.getClass();
            c.a.f11474p.set(aVar2, bVar);
        }
        if (!(l.f11513o.get(lVar) instanceof v1)) {
            bVar.i();
        } else {
            lVar.v(bVar);
        }
        Object s10 = lVar.s();
        vb.a aVar3 = vb.a.f16085a;
        return s10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(java.util.List r4, ub.e r5) {
        /*
            boolean r0 = r5 instanceof nc.e
            if (r0 == 0) goto L13
            r0 = r5
            nc.e r0 = (nc.e) r0
            int r1 = r0.f11489c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11489c = r1
            goto L18
        L13:
            nc.e r0 = new nc.e
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f11488b
            vb.a r1 = vb.a.f16085a
            int r2 = r0.f11489c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.Iterator r4 = r0.f11487a
            rb.f.b(r5)
            goto L38
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            rb.f.b(r5)
            java.util.Iterator r4 = r4.iterator()
        L38:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4f
            java.lang.Object r5 = r4.next()
            nc.j1 r5 = (nc.j1) r5
            r0.f11487a = r4
            r0.f11489c = r3
            java.lang.Object r5 = r5.join(r0)
            if (r5 != r1) goto L38
            return r1
        L4f:
            rb.h r4 = rb.h.f13851a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.d.b(java.util.List, ub.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:10:0x0054). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(nc.j1[] r6, ub.e<? super rb.h> r7) {
        /*
            boolean r0 = r7 instanceof nc.d.a
            if (r0 == 0) goto L13
            r0 = r7
            nc.d$a r0 = (nc.d.a) r0
            int r1 = r0.f11484e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11484e = r1
            goto L18
        L13:
            nc.d$a r0 = new nc.d$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f11483d
            vb.a r1 = vb.a.f16085a
            int r2 = r0.f11484e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r6 = r0.f11482c
            int r2 = r0.f11481b
            java.lang.Object[] r4 = r0.f11480a
            nc.j1[] r4 = (nc.j1[]) r4
            rb.f.b(r7)
            r7 = r4
            goto L54
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            rb.f.b(r7)
            r7 = 0
            int r2 = r6.length
            r5 = r7
            r7 = r6
            r6 = r2
            r2 = r5
        L41:
            if (r2 >= r6) goto L56
            r4 = r7[r2]
            r0.f11480a = r7
            r0.f11481b = r2
            r0.f11482c = r6
            r0.f11484e = r3
            java.lang.Object r4 = r4.join(r0)
            if (r4 != r1) goto L54
            return r1
        L54:
            int r2 = r2 + r3
            goto L41
        L56:
            rb.h r6 = rb.h.f13851a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.d.c(nc.j1[], ub.e):java.lang.Object");
    }
}
