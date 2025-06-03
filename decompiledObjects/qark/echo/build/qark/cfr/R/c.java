/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 */
package R;

import P.f;
import R.b;
import android.content.Context;
import g6.a;
import g6.l;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m6.h;
import p6.I;

public final class c
implements i6.a {
    public final String a;
    public final l b;
    public final I c;
    public final Object d;
    public volatile f e;

    public c(String string2, Q.b b8, l l8, I i8) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(l8, "produceMigrations");
        Intrinsics.checkNotNullParameter(i8, "scope");
        this.a = string2;
        this.b = l8;
        this.c = i8;
        this.d = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public f c(Context object, h object2) {
        Intrinsics.checkNotNullParameter(object, "thisRef");
        Intrinsics.checkNotNullParameter(object2, "property");
        object2 = this.e;
        if (object2 != null) {
            return object2;
        }
        object2 = this.d;
        synchronized (object2) {
            try {
                if (this.e == null) {
                    object = object.getApplicationContext();
                    S.c c8 = S.c.a;
                    l l8 = this.b;
                    Intrinsics.checkNotNullExpressionValue(object, "applicationContext");
                    this.e = c8.a(null, (List)l8.invoke(object), this.c, new a((Context)object, this){
                        public final /* synthetic */ Context o;
                        public final /* synthetic */ c p;
                        {
                            this.o = context;
                            this.p = c8;
                            super(0);
                        }

                        public final File a() {
                            Context context = this.o;
                            Intrinsics.checkNotNullExpressionValue((Object)context, "applicationContext");
                            return b.a(context, this.p.a);
                        }
                    });
                }
                object = this.e;
                Intrinsics.b(object);
                return object;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

}

