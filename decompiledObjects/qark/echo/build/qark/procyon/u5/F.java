// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u5;

import android.view.KeyEvent;
import D5.i;

public class F implements d
{
    public final i a;
    public final b b;
    
    public F(final i a) {
        this.b = new L.b();
        this.a = a;
    }
    
    @Override
    public void a(final KeyEvent keyEvent, final a a) {
        final int action = keyEvent.getAction();
        boolean b = false;
        if (action != 0 && action != 1) {
            a.a(false);
            return;
        }
        final i.b b2 = new i.b(keyEvent, this.b.a(keyEvent.getUnicodeChar()));
        if (action != 0) {
            b = true;
        }
        this.a.e(b2, b, (i.a)new E(a));
    }
}
