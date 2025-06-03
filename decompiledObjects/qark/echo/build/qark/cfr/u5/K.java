/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 *  java.lang.AssertionError
 *  java.lang.Boolean
 *  java.lang.Character
 *  java.lang.Long
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 */
package u5;

import E5.c;
import android.view.KeyEvent;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import t5.b;
import u5.G;
import u5.H;
import u5.I;
import u5.J;
import u5.L;
import u5.M;

public class K
implements L.d {
    public final c a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final L.b d = new L.b();

    public K(c arre) {
        this.a = arre;
        for (M.e e8 : M.a()) {
            this.c.put((Object)e8.c, (Object)e8);
        }
    }

    public static /* synthetic */ void b(K k8, M.c c8, KeyEvent keyEvent) {
        k8.m(c8, keyEvent);
    }

    public static /* synthetic */ void c(K k8, M.c c8, long l8, KeyEvent keyEvent) {
        k8.l(c8, l8, keyEvent);
    }

    public static /* synthetic */ void d(L.d.a a8, ByteBuffer byteBuffer) {
        K.k(a8, byteBuffer);
    }

    public static G.b e(KeyEvent keyEvent) {
        boolean bl = keyEvent.getRepeatCount() > 0;
        int n8 = keyEvent.getAction();
        if (n8 != 0) {
            if (n8 == 1) {
                return G.b.q;
            }
            throw new AssertionError((Object)"Unexpected event type");
        }
        if (bl) {
            return G.b.r;
        }
        return G.b.p;
    }

    public static long j(long l8, long l9) {
        return l8 & 0xFFFFFFFFL | l9;
    }

    public static /* synthetic */ void k(L.d.a a8, ByteBuffer byteBuffer) {
        Boolean bl = Boolean.FALSE;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            if (byteBuffer.capacity() != 0) {
                boolean bl2 = byteBuffer.get() != 0;
                bl = bl2;
            }
        } else {
            b.g("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
        }
        a8.a(bl);
    }

    @Override
    public void a(KeyEvent keyEvent, L.d.a a8) {
        if (!this.i(keyEvent, a8)) {
            this.q(true, 0L, 0L, 0L);
            a8.a(true);
        }
    }

    public final Long f(KeyEvent keyEvent) {
        Long l8 = (Long)M.b.get((Object)Long.valueOf((long)keyEvent.getKeyCode()));
        if (l8 != null) {
            return l8;
        }
        return K.j(keyEvent.getKeyCode(), 0x1100000000L);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Long g(KeyEvent keyEvent) {
        int n8;
        long l8 = keyEvent.getScanCode();
        if (l8 == 0L) {
            n8 = keyEvent.getKeyCode();
            do {
                return K.j(n8, 0x1100000000L);
                break;
            } while (true);
        }
        Long l9 = (Long)M.a.get((Object)l8);
        if (l9 != null) {
            return l9;
        }
        n8 = keyEvent.getScanCode();
        return K.j(n8, 0x1100000000L);
    }

    public Map h() {
        return Collections.unmodifiableMap((Map)this.b);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean i(KeyEvent var1_1, L.d.a var2_2) {
        block15 : {
            block14 : {
                block13 : {
                    if (var1_1.getScanCode() == 0 && var1_1.getKeyCode() == 0) {
                        return false;
                    }
                    var12_3 = this.g(var1_1);
                    var10_4 = this.f(var1_1);
                    var13_5 = new ArrayList();
                    for (Object var8_10 : M.c) {
                        var6_9 = (var1_1.getMetaState() & var8_10.a) != 0;
                        this.o((M.d)var8_10, var6_9, var10_4, var12_3, var1_1, var13_5);
                    }
                    for (Object var8_10 : this.c.values()) {
                        var6_9 = (var1_1.getMetaState() & var8_10.a) != 0;
                        this.p((M.e)var8_10, var6_9, var10_4, var1_1);
                    }
                    var4_8 = var1_1.getAction();
                    if (var4_8 != 0) {
                        if (var4_8 != 1) {
                            return false;
                        }
                        var4_8 = 0;
                    } else {
                        var4_8 = 1;
                    }
                    var7_6 = (Long)this.b.get((Object)var12_3);
                    var11_11 = null;
                    if (var4_8 == 0) break block13;
                    if (var7_6 == null) ** GOTO lbl29
                    if (var1_1.getRepeatCount() > 0) {
                        var7_6 = G.b.r;
                    } else {
                        this.q(false, (Long)var7_6, var12_3, var1_1.getEventTime());
lbl29: // 2 sources:
                        var7_6 = G.b.p;
                    }
                    var3_12 = this.d.a(var1_1.getUnicodeChar()).charValue();
                    var8_10 = var7_6;
                    if (var3_12 == '\u0000') break block14;
                    var8_10 = new StringBuilder();
                    var8_10.append("");
                    var8_10.append(var3_12);
                    var9_13 = var8_10.toString();
                    var8_10 = var7_6;
                    break block15;
                }
                if (var7_6 == null) {
                    return false;
                }
                var8_10 = G.b.q;
            }
            var9_13 = null;
        }
        if (var8_10 != G.b.r) {
            var7_6 = var11_11;
            if (var4_8 != 0) {
                var7_6 = var10_4;
            }
            this.r(var12_3, (Long)var7_6);
        }
        if (var8_10 == G.b.p && (var7_6 = (M.e)this.c.get((Object)var10_4)) != null) {
            var7_6.d ^= true;
        }
        var11_11 = new G();
        var4_8 = var1_1.getSource();
        var7_6 = var4_8 != 513 ? (var4_8 != 1025 ? (var4_8 != 16777232 ? (var4_8 != 33554433 ? G.a.p : G.a.t) : G.a.s) : G.a.r) : G.a.q;
        var11_11.f = var7_6;
        var11_11.a = var1_1.getEventTime();
        var11_11.b = var8_10;
        var11_11.d = var10_4;
        var11_11.c = var12_3;
        var11_11.g = var9_13;
        var11_11.e = false;
        var11_11.f = G.a.p;
        this.n(var11_11, var2_2);
        var1_1 = var13_5.iterator();
        while (var1_1.hasNext() != false) {
            ((Runnable)var1_1.next()).run();
        }
        return true;
    }

    public final /* synthetic */ void l(M.c c8, long l8, KeyEvent keyEvent) {
        this.q(false, c8.b, l8, keyEvent.getEventTime());
    }

    public final /* synthetic */ void m(M.c c8, KeyEvent keyEvent) {
        this.q(false, c8.b, c8.a, keyEvent.getEventTime());
    }

    public final void n(G g8, L.d.a object) {
        object = object == null ? null : new H((L.d.a)object);
        this.a.f("flutter/keydata", g8.a(), (c.b)object);
    }

    public void o(M.d d8, boolean bl, long l8, long l9, KeyEvent keyEvent, ArrayList object) {
        int n8;
        int n9;
        M.c[] arrc = d8.b;
        boolean[] arrbl = new boolean[arrc.length];
        arrc = new Boolean[arrc.length];
        int n10 = 0;
        int n11 = n9 = 0;
        do {
            block16 : {
                block17 : {
                    int n12;
                    boolean bl2;
                    block13 : {
                        Object object2;
                        block14 : {
                            block15 : {
                                object2 = d8.b;
                                n8 = object2.length;
                                n12 = 1;
                                if (n11 >= n8) break;
                                object2 = object2[n11];
                                arrbl[n11] = bl2 = this.b.containsKey((Object)object2.a);
                                if (object2.b != l8) break block13;
                                n8 = .a[K.e(keyEvent).ordinal()];
                                if (n8 == 1) break block14;
                                if (n8 == 2) break block15;
                                if (n8 != 3) break block16;
                                if (!bl) {
                                    object.add((Object)new J(this, (M.c)object2, keyEvent));
                                }
                                arrc[n11] = Boolean.valueOf((boolean)arrbl[n11]);
                                n8 = n12;
                                break block17;
                            }
                            arrc[n11] = Boolean.valueOf((boolean)arrbl[n11]);
                            break block16;
                        }
                        arrc[n11] = Boolean.FALSE;
                        n8 = n12;
                        if (!bl) {
                            object.add((Object)new I(this, (M.c)object2, l9, keyEvent));
                            n8 = n12;
                        }
                        break block17;
                    }
                    n8 = n12;
                    if (n9 == 0) {
                        n8 = bl2 ? n12 : 0;
                    }
                }
                n9 = n8;
            }
            ++n11;
        } while (true);
        if (bl) {
            for (n8 = 0; n8 < d8.b.length; ++n8) {
                if (arrc[n8] != null) continue;
                if (n9 != 0) {
                    arrc[n8] = Boolean.valueOf((boolean)arrbl[n8]);
                    continue;
                }
                arrc[n8] = Boolean.TRUE;
                n9 = 1;
            }
            n8 = n10;
            if (n9 == 0) {
                arrc[0] = Boolean.TRUE;
                n8 = n10;
            }
        } else {
            n9 = 0;
            do {
                n8 = n10;
                if (n9 >= d8.b.length) break;
                if (arrc[n9] == null) {
                    arrc[n9] = Boolean.FALSE;
                }
                ++n9;
            } while (true);
        }
        while (n8 < d8.b.length) {
            if (arrbl[n8] != arrc[n8].booleanValue()) {
                object = d8.b[n8];
                this.q(arrc[n8].booleanValue(), object.b, object.a, keyEvent.getEventTime());
            }
            ++n8;
        }
    }

    public void p(M.e e8, boolean bl, long l8, KeyEvent keyEvent) {
        if (e8.c == l8) {
            return;
        }
        if (e8.d != bl) {
            bl = this.b.containsKey((Object)e8.b);
            boolean bl2 = bl ^ true;
            if (bl2) {
                e8.d ^= true;
            }
            this.q(bl2, e8.c, e8.b, keyEvent.getEventTime());
            if (!bl2) {
                e8.d ^= true;
            }
            this.q(bl, e8.c, e8.b, keyEvent.getEventTime());
        }
    }

    public final void q(boolean bl, Long l8, Long l9, long l10) {
        G g8 = new G();
        g8.a = l10;
        G.b b8 = bl ? G.b.p : G.b.q;
        g8.b = b8;
        g8.d = l8;
        g8.c = l9;
        g8.g = null;
        g8.e = true;
        g8.f = G.a.p;
        if (l9 != 0L && l8 != 0L) {
            if (!bl) {
                l8 = null;
            }
            this.r(l9, l8);
        }
        this.n(g8, null);
    }

    public void r(Long l8, Long l9) {
        if (l9 != null) {
            if ((Long)this.b.put((Object)l8, (Object)l9) == null) {
                return;
            }
            throw new AssertionError((Object)"The key was not empty");
        }
        if ((Long)this.b.remove((Object)l8) != null) {
            return;
        }
        throw new AssertionError((Object)"The key was empty");
    }

}

