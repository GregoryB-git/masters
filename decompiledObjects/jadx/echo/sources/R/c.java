package R;

import android.content.Context;
import g6.l;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p6.I;

/* loaded from: classes.dex */
public final class c implements i6.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f4497a;

    /* renamed from: b, reason: collision with root package name */
    public final l f4498b;

    /* renamed from: c, reason: collision with root package name */
    public final I f4499c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4500d;

    /* renamed from: e, reason: collision with root package name */
    public volatile P.f f4501e;

    public static final class a extends kotlin.jvm.internal.l implements g6.a {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Context f4502o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ c f4503p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, c cVar) {
            super(0);
            this.f4502o = context;
            this.f4503p = cVar;
        }

        @Override // g6.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            Context applicationContext = this.f4502o;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            return b.a(applicationContext, this.f4503p.f4497a);
        }
    }

    public c(String name, Q.b bVar, l produceMigrations, I scope) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(produceMigrations, "produceMigrations");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f4497a = name;
        this.f4498b = produceMigrations;
        this.f4499c = scope;
        this.f4500d = new Object();
    }

    @Override // i6.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public P.f a(Context thisRef, m6.h property) {
        P.f fVar;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        P.f fVar2 = this.f4501e;
        if (fVar2 != null) {
            return fVar2;
        }
        synchronized (this.f4500d) {
            try {
                if (this.f4501e == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    S.c cVar = S.c.f5809a;
                    l lVar = this.f4498b;
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    this.f4501e = cVar.a(null, (List) lVar.invoke(applicationContext), this.f4499c, new a(applicationContext, this));
                }
                fVar = this.f4501e;
                Intrinsics.b(fVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }
}
