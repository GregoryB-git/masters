package ea;

import com.pichillilorenzo.flutter_inappwebview_android.R;

@wb.e(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", l = {R.styleable.AppCompatTheme_ratingBarStyleSmall}, m = "shouldLogSession")
/* loaded from: classes.dex */
public final class c0 extends wb.c {

    /* renamed from: a, reason: collision with root package name */
    public b0 f4885a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4886b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f4887c;

    /* renamed from: d, reason: collision with root package name */
    public int f4888d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(b0 b0Var, ub.e<? super c0> eVar) {
        super(eVar);
        this.f4887c = b0Var;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        this.f4886b = obj;
        this.f4888d |= Integer.MIN_VALUE;
        return b0.b(this.f4887c, this);
    }
}
