// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A5;

import io.flutter.embedding.engine.b;
import io.flutter.plugin.platform.l;
import io.flutter.view.TextureRegistry;
import E5.c;
import android.content.Context;

public interface a
{
    void onAttachedToEngine(final b p0);
    
    void onDetachedFromEngine(final b p0);
    
    public interface a
    {
    }
    
    public static class b
    {
        public final Context a;
        public final a b;
        public final c c;
        public final TextureRegistry d;
        public final l e;
        public final a f;
        public final io.flutter.embedding.engine.b g;
        
        public b(final Context a, final a b, final c c, final TextureRegistry d, final l e, final a f, final io.flutter.embedding.engine.b g) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
        }
        
        public Context a() {
            return this.a;
        }
        
        public c b() {
            return this.c;
        }
        
        public a c() {
            return this.b;
        }
    }
}
