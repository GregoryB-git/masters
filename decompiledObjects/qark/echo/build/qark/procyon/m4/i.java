// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m4;

import j4.b;
import j4.c;
import j4.g;

public class i implements g
{
    public boolean a;
    public boolean b;
    public c c;
    public final f d;
    
    public i(final f d) {
        this.a = false;
        this.b = false;
        this.d = d;
    }
    
    public final void a() {
        if (!this.a) {
            this.a = true;
            return;
        }
        throw new b("Cannot encode a second value in the ValueEncoderContext");
    }
    
    public void b(final c c, final boolean b) {
        this.a = false;
        this.c = c;
        this.b = b;
    }
    
    @Override
    public g d(final String s) {
        this.a();
        this.d.i(this.c, s, this.b);
        return this;
    }
    
    @Override
    public g e(final boolean b) {
        this.a();
        this.d.o(this.c, b, this.b);
        return this;
    }
}
