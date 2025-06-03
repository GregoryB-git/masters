package nc;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.util.Iterator;

@wb.e(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {R.styleable.AppCompatTheme_dropDownListViewStyle}, m = "joinAll")
/* loaded from: classes.dex */
public final class e extends wb.c {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f11487a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f11488b;

    /* renamed from: c, reason: collision with root package name */
    public int f11489c;

    public e(ub.e<? super e> eVar) {
        super(eVar);
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        this.f11488b = obj;
        this.f11489c |= Integer.MIN_VALUE;
        return d.b(null, this);
    }
}
