/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 */
package A5;

import E5.c;
import android.content.Context;
import io.flutter.plugin.platform.l;
import io.flutter.view.TextureRegistry;

public interface a {
    public void onAttachedToEngine(b var1);

    public void onDetachedFromEngine(b var1);

    public static interface a {
    }

    public static class b {
        public final Context a;
        public final io.flutter.embedding.engine.a b;
        public final c c;
        public final TextureRegistry d;
        public final l e;
        public final a f;
        public final io.flutter.embedding.engine.b g;

        public b(Context context, io.flutter.embedding.engine.a a8, c c8, TextureRegistry textureRegistry, l l8, a a9, io.flutter.embedding.engine.b b8) {
            this.a = context;
            this.b = a8;
            this.c = c8;
            this.d = textureRegistry;
            this.e = l8;
            this.f = a9;
            this.g = b8;
        }

        public Context a() {
            return this.a;
        }

        public c b() {
            return this.c;
        }

        public io.flutter.embedding.engine.a c() {
            return this.b;
        }
    }

}

