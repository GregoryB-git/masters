package o0;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.io.Serializable;
import java.util.Iterator;
import o0.h;

@wb.e(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle, R.styleable.AppCompatTheme_colorPrimary}, m = "runMigrations")
/* loaded from: classes.dex */
public final class f<T> extends wb.c {

    /* renamed from: a, reason: collision with root package name */
    public Serializable f11589a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f11590b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f11591c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h.a f11592d;

    /* renamed from: e, reason: collision with root package name */
    public int f11593e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h.a aVar, ub.e<? super f> eVar) {
        super(eVar);
        this.f11592d = aVar;
    }

    @Override // wb.a
    public final Object invokeSuspend(Object obj) {
        this.f11591c = obj;
        this.f11593e |= Integer.MIN_VALUE;
        return h.a.a(this.f11592d, null, null, this);
    }
}
