/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 */
package m5;

import A5.a;
import E5.c;
import E5.k;
import android.content.Context;
import io.flutter.embedding.engine.a;
import m5.g;

public class f
implements A5.a {
    public k a;
    public g b;

    @Override
    public void onAttachedToEngine(a.b b8) {
        Object object = b8.a();
        c c8 = b8.b();
        this.b = new g((Context)object, c8);
        this.a = object = new k(c8, "com.ryanheise.just_audio.methods");
        object.e(this.b);
        b8.c().e(new a.b(){

            @Override
            public void a() {
            }

            @Override
            public void b() {
                f.this.b.a();
            }
        });
    }

    @Override
    public void onDetachedFromEngine(a.b b8) {
        this.b.a();
        this.b = null;
        this.a.e(null);
    }

}

