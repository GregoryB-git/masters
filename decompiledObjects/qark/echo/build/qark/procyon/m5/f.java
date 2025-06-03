// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m5;

import E5.c;
import android.content.Context;
import E5.k;
import A5.a;

public class f implements a
{
    public k a;
    public g b;
    
    public static /* synthetic */ g a(final f f) {
        return f.b;
    }
    
    @Override
    public void onAttachedToEngine(final b b) {
        final Context a = b.a();
        final c b2 = b.b();
        this.b = new g(a, b2);
        (this.a = new k(b2, "com.ryanheise.just_audio.methods")).e((k.c)this.b);
        b.c().e((io.flutter.embedding.engine.a.b)new io.flutter.embedding.engine.a.b() {
            @Override
            public void a() {
            }
            
            @Override
            public void b() {
                f.a(f.this).a();
            }
        });
    }
    
    @Override
    public void onDetachedFromEngine(final b b) {
        this.b.a();
        this.b = null;
        this.a.e(null);
    }
}
