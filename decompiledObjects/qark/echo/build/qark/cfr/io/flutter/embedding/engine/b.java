/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package io.flutter.embedding.engine;

import D5.n;
import android.content.Context;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.a;
import io.flutter.plugin.platform.r;
import java.util.ArrayList;
import java.util.List;
import w5.a;
import y5.f;

public class b {
    public final List a = new ArrayList();

    public b(Context context, String[] arrstring) {
        f f8 = t5.a.e().c();
        if (!f8.l()) {
            f8.p(context.getApplicationContext());
            f8.h(context.getApplicationContext(), arrstring);
        }
    }

    public a a(b object) {
        Context context = object.b();
        a.c c8 = object.c();
        String string2 = object.e();
        List list = object.d();
        Object object2 = object.f();
        if (object2 == null) {
            object2 = new r();
        }
        boolean bl = object.a();
        boolean bl2 = object.g();
        object = c8 == null ? a.c.a() : c8;
        if (this.a.size() == 0) {
            object2 = this.b(context, (r)object2, bl, bl2);
            if (string2 != null) {
                object2.o().c(string2);
            }
            object2.k().k((a.c)object, list);
            object = object2;
        } else {
            object = ((a)this.a.get(0)).A(context, (a.c)object, string2, list, (r)object2, bl, bl2);
        }
        this.a.add(object);
        object.e(new a.b((a)object){
            public final /* synthetic */ a a;
            {
                this.a = a8;
            }

            @Override
            public void a() {
                b.this.a.remove((Object)this.a);
            }

            @Override
            public void b() {
            }
        });
        return object;
    }

    public a b(Context context, r r8, boolean bl, boolean bl2) {
        return new a(context, null, null, r8, null, bl, bl2, this);
    }

    public static class b {
        public Context a;
        public a.c b;
        public String c;
        public List d;
        public r e;
        public boolean f = true;
        public boolean g = false;

        public b(Context context) {
            this.a = context;
        }

        public boolean a() {
            return this.f;
        }

        public Context b() {
            return this.a;
        }

        public a.c c() {
            return this.b;
        }

        public List d() {
            return this.d;
        }

        public String e() {
            return this.c;
        }

        public r f() {
            return this.e;
        }

        public boolean g() {
            return this.g;
        }

        public b h(boolean bl) {
            this.f = bl;
            return this;
        }

        public b i(a.c c8) {
            this.b = c8;
            return this;
        }

        public b j(List list) {
            this.d = list;
            return this;
        }

        public b k(String string2) {
            this.c = string2;
            return this;
        }

        public b l(boolean bl) {
            this.g = bl;
            return this;
        }
    }

}

