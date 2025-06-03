// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R;

import java.io.File;
import java.util.List;
import android.content.Context;
import m6.h;
import kotlin.jvm.internal.Intrinsics;
import Q.b;
import P.f;
import p6.I;
import g6.l;
import i6.a;

public final class c implements a
{
    public final String a;
    public final l b;
    public final I c;
    public final Object d;
    public volatile f e;
    
    public c(final String a, final b b, final l b2, final I c) {
        Intrinsics.checkNotNullParameter(a, "name");
        Intrinsics.checkNotNullParameter(b2, "produceMigrations");
        Intrinsics.checkNotNullParameter(c, "scope");
        this.a = a;
        this.b = b2;
        this.c = c;
        this.d = new Object();
    }
    
    public static final /* synthetic */ String b(final c c) {
        return c.a;
    }
    
    public f c(Context applicationContext, h h) {
        Intrinsics.checkNotNullParameter(applicationContext, "thisRef");
        Intrinsics.checkNotNullParameter(h, "property");
        h = (h)this.e;
        if (h == null) {
            h = (h)this.d;
            // monitorenter(h)
            while (true) {
                try {
                    if (this.e == null) {
                        applicationContext = applicationContext.getApplicationContext();
                        final S.c a = S.c.a;
                        final l b = this.b;
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                        this.e = a.a(null, (List)b.invoke(applicationContext), this.c, new g6.a() {
                            public final /* synthetic */ c p;
                            
                            public final File a() {
                                final Context o = applicationContext;
                                Intrinsics.checkNotNullExpressionValue(o, "applicationContext");
                                return R.b.a(o, c.b(this.p));
                            }
                        });
                    }
                    final f e = this.e;
                    Intrinsics.b(e);
                    // monitorexit(h)
                    return e;
                }
                // monitorexit(h)
                finally {}
                continue;
            }
        }
        return (f)h;
    }
}
