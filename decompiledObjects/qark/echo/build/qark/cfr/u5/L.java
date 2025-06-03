/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.KeyCharacterMap
 *  android.view.KeyEvent
 *  java.lang.Character
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashSet
 *  java.util.Map
 */
package u5;

import D5.i;
import D5.j;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import io.flutter.plugin.editing.l;
import java.util.HashSet;
import java.util.Map;
import u5.F;
import u5.K;

public class L
implements l.a,
j.b {
    public final d[] a;
    public final HashSet b = new HashSet();
    public final e c;

    public L(e e8) {
        this.c = e8;
        this.a = new d[]{new K(e8.getBinaryMessenger()), new F(new i(e8.getBinaryMessenger()))};
        new j(e8.getBinaryMessenger()).b(this);
    }

    @Override
    public Map a() {
        return ((K)this.a[0]).h();
    }

    @Override
    public boolean b(KeyEvent keyEvent) {
        boolean bl = this.b.remove((Object)keyEvent);
        if (bl) {
            return false;
        }
        if (this.a.length > 0) {
            c c8 = new c(keyEvent);
            d[] arrd = this.a;
            int n8 = arrd.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                arrd[i8].a(keyEvent, c8.a());
            }
        } else {
            this.e(keyEvent);
        }
        return true;
    }

    public void d() {
        int n8 = this.b.size();
        if (n8 > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("A KeyboardManager was destroyed with ");
            stringBuilder.append(String.valueOf((int)n8));
            stringBuilder.append(" unhandled redispatch event(s).");
            t5.b.g("KeyboardManager", stringBuilder.toString());
        }
    }

    public final void e(KeyEvent keyEvent) {
        e e8 = this.c;
        if (e8 != null) {
            if (e8.c(keyEvent)) {
                return;
            }
            this.b.add((Object)keyEvent);
            this.c.a(keyEvent);
            if (this.b.remove((Object)keyEvent)) {
                t5.b.g("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    public static class b {
        public int a = 0;

        public Character a(int n8) {
            char c8;
            block8 : {
                block7 : {
                    char c9;
                    block6 : {
                        c9 = (char)n8;
                        if ((Integer.MIN_VALUE & n8) == 0) break block6;
                        int n9 = n8 & Integer.MAX_VALUE;
                        int n10 = this.a;
                        c8 = c9;
                        n8 = n9;
                        if (n10 != 0) {
                            n8 = KeyCharacterMap.getDeadChar((int)n10, (int)n9);
                            c8 = c9;
                        }
                        break block7;
                    }
                    int n11 = this.a;
                    c8 = c9;
                    if (n11 == 0) break block8;
                    if ((n8 = KeyCharacterMap.getDeadChar((int)n11, (int)n8)) > 0) {
                        c9 = (char)n8;
                    }
                    n8 = 0;
                    c8 = c9;
                }
                this.a = n8;
            }
            return Character.valueOf((char)c8);
        }
    }

    public class c {
        public final KeyEvent a;
        public int b;
        public boolean c;

        public c(KeyEvent keyEvent) {
            this.b = L.this.a.length;
            this.c = false;
            this.a = keyEvent;
        }

        public d.a a() {
            return new a(null);
        }

        public class a
        implements d.a {
            public boolean a;

            public a() {
                this.a = false;
            }

            public /* synthetic */ a( a8) {
                this();
            }

            @Override
            public void a(boolean bl) {
                if (!this.a) {
                    int n8;
                    this.a = true;
                    c c8 = c.this;
                    c8.b = n8 = c8.b - 1;
                    c8.c = bl |= c8.c;
                    if (n8 == 0 && !bl) {
                        c8.L.this.e(c8.a);
                    }
                    return;
                }
                throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
            }
        }

    }

    public static interface d {
        public void a(KeyEvent var1, a var2);

        public static interface a {
            public void a(boolean var1);
        }

    }

    public static interface e {
        public void a(KeyEvent var1);

        public boolean c(KeyEvent var1);

        public E5.c getBinaryMessenger();
    }

}

