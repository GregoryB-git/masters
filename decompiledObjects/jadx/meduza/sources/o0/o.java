package o0;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import nc.d0;

@wb.e(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {R.styleable.AppCompatTheme_windowFixedWidthMajor, R.styleable.AppCompatTheme_windowFixedWidthMajor}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class o extends wb.i implements dc.p<d0, ub.e<? super rb.h>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public dc.p f11608a;

    /* renamed from: b, reason: collision with root package name */
    public int f11609b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p<Object> f11610c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p<Object> pVar, ub.e<? super o> eVar) {
        super(2, eVar);
        this.f11610c = pVar;
    }

    @Override // wb.a
    public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
        return new o(this.f11610c, eVar);
    }

    @Override // dc.p
    public final Object invoke(d0 d0Var, ub.e<? super rb.h> eVar) {
        return ((o) create(d0Var, eVar)).invokeSuspend(rb.h.f13851a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005a -> B:6:0x005d). Please report as a decompilation issue!!! */
    @Override // wb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            vb.a r0 = vb.a.f16085a
            int r1 = r6.f11609b
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L22
            if (r1 == r2) goto L19
            if (r1 != r3) goto L11
            rb.f.b(r7)
            r7 = r6
            goto L5d
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            dc.p r1 = r6.f11608a
            rb.f.b(r7)
            r4 = r1
            r1 = r7
            r7 = r6
            goto L51
        L22:
            rb.f.b(r7)
            o0.p<java.lang.Object> r7 = r6.f11610c
            java.util.concurrent.atomic.AtomicInteger r7 = r7.f11614d
            int r7 = r7.get()
            if (r7 <= 0) goto L31
            r7 = r2
            goto L32
        L31:
            r7 = 0
        L32:
            if (r7 == 0) goto L6a
            r7 = r6
        L35:
            o0.p<java.lang.Object> r1 = r7.f11610c
            nc.d0 r1 = r1.f11611a
            ub.h r1 = r1.f()
            p2.m0.C(r1)
            o0.p<java.lang.Object> r1 = r7.f11610c
            dc.p<T, ub.e<? super rb.h>, java.lang.Object> r4 = r1.f11612b
            pc.b r1 = r1.f11613c
            r7.f11608a = r4
            r7.f11609b = r2
            java.lang.Object r1 = r1.C(r7)
            if (r1 != r0) goto L51
            return r0
        L51:
            r5 = 0
            r7.f11608a = r5
            r7.f11609b = r3
            java.lang.Object r1 = r4.invoke(r1, r7)
            if (r1 != r0) goto L5d
            return r0
        L5d:
            o0.p<java.lang.Object> r1 = r7.f11610c
            java.util.concurrent.atomic.AtomicInteger r1 = r1.f11614d
            int r1 = r1.decrementAndGet()
            if (r1 != 0) goto L35
            rb.h r7 = rb.h.f13851a
            return r7
        L6a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
