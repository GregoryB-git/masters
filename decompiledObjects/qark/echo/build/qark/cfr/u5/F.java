/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 *  java.lang.Character
 *  java.lang.Object
 */
package u5;

import D5.i;
import android.view.KeyEvent;
import u5.E;
import u5.L;

public class F
implements L.d {
    public final i a;
    public final L.b b = new L.b();

    public F(i i8) {
        this.a = i8;
    }

    public static /* synthetic */ void b(L.d.a a8, boolean bl) {
        a8.a(bl);
    }

    @Override
    public void a(KeyEvent object, L.d.a a8) {
        int n8 = object.getAction();
        boolean bl = false;
        if (n8 != 0 && n8 != 1) {
            a8.a(false);
            return;
        }
        object = new i.b((KeyEvent)object, this.b.a(object.getUnicodeChar()));
        if (n8 != 0) {
            bl = true;
        }
        this.a.e((i.b)object, bl, new E(a8));
    }
}

