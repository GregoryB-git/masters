package sb;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.Iterator;
import java.util.List;

@wb.e(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", l = {34, 40, R.styleable.AppCompatTheme_checkedTextViewStyle, R.styleable.AppCompatTheme_colorControlNormal, R.styleable.AppCompatTheme_colorPrimaryDark}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class b0 extends wb.h implements dc.p<kc.d<? super List<Object>>, ub.e<? super rb.h>, Object> {

    /* renamed from: b, reason: collision with root package name */
    public Object f14300b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f14301c;

    /* renamed from: d, reason: collision with root package name */
    public int f14302d;

    /* renamed from: e, reason: collision with root package name */
    public int f14303e;
    public /* synthetic */ Object f;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14304o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f14305p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Iterator<Object> f14306q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f14307r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f14308s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(int i10, int i11, Iterator<Object> it, boolean z10, boolean z11, ub.e<? super b0> eVar) {
        super(eVar);
        this.f14304o = i10;
        this.f14305p = i11;
        this.f14306q = it;
        this.f14307r = z10;
        this.f14308s = z11;
    }

    @Override // wb.a
    public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
        b0 b0Var = new b0(this.f14304o, this.f14305p, this.f14306q, this.f14307r, this.f14308s, eVar);
        b0Var.f = obj;
        return b0Var;
    }

    @Override // dc.p
    public final Object invoke(kc.d<? super List<Object>> dVar, ub.e<? super rb.h> eVar) {
        return ((b0) create(dVar, eVar)).invokeSuspend(rb.h.f13851a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0167, code lost:
    
        if (0 != 0) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x007f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0196 -> B:12:0x0199). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x015f -> B:30:0x0162). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x00a2 -> B:68:0x00a5). Please report as a decompilation issue!!! */
    @Override // wb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sb.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
