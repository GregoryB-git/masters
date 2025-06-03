package u5;

import E5.c;
import android.view.KeyEvent;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import t5.AbstractC1995b;
import u5.G;
import u5.L;
import u5.M;

/* loaded from: classes.dex */
public class K implements L.d {

    /* renamed from: a, reason: collision with root package name */
    public final E5.c f19859a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f19860b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f19861c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final L.b f19862d = new L.b();

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19863a;

        static {
            int[] iArr = new int[G.b.values().length];
            f19863a = iArr;
            try {
                iArr[G.b.kDown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19863a[G.b.kUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19863a[G.b.kRepeat.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public K(E5.c cVar) {
        this.f19859a = cVar;
        for (M.e eVar : M.a()) {
            this.f19861c.put(Long.valueOf(eVar.f19883c), eVar);
        }
    }

    public static G.b e(KeyEvent keyEvent) {
        boolean z7 = keyEvent.getRepeatCount() > 0;
        int action = keyEvent.getAction();
        if (action == 0) {
            return z7 ? G.b.kRepeat : G.b.kDown;
        }
        if (action == 1) {
            return G.b.kUp;
        }
        throw new AssertionError("Unexpected event type");
    }

    public static long j(long j7, long j8) {
        return (j7 & 4294967295L) | j8;
    }

    public static /* synthetic */ void k(L.d.a aVar, ByteBuffer byteBuffer) {
        Boolean bool = Boolean.FALSE;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            if (byteBuffer.capacity() != 0) {
                bool = Boolean.valueOf(byteBuffer.get() != 0);
            }
        } else {
            AbstractC1995b.g("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
        }
        aVar.a(bool.booleanValue());
    }

    @Override // u5.L.d
    public void a(KeyEvent keyEvent, L.d.a aVar) {
        if (i(keyEvent, aVar)) {
            return;
        }
        q(true, 0L, 0L, 0L);
        aVar.a(true);
    }

    public final Long f(KeyEvent keyEvent) {
        Long l7 = (Long) M.f19875b.get(Long.valueOf(keyEvent.getKeyCode()));
        return l7 != null ? l7 : Long.valueOf(j(keyEvent.getKeyCode(), 73014444032L));
    }

    public final Long g(KeyEvent keyEvent) {
        int scanCode;
        long scanCode2 = keyEvent.getScanCode();
        if (scanCode2 == 0) {
            scanCode = keyEvent.getKeyCode();
        } else {
            Long l7 = (Long) M.f19874a.get(Long.valueOf(scanCode2));
            if (l7 != null) {
                return l7;
            }
            scanCode = keyEvent.getScanCode();
        }
        return Long.valueOf(j(scanCode, 73014444032L));
    }

    public Map h() {
        return Collections.unmodifiableMap(this.f19860b);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0144 A[LOOP:2: B:62:0x013e->B:64:0x0144, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(android.view.KeyEvent r18, u5.L.d.a r19) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.K.i(android.view.KeyEvent, u5.L$d$a):boolean");
    }

    public final /* synthetic */ void l(M.c cVar, long j7, KeyEvent keyEvent) {
        q(false, Long.valueOf(cVar.f19878b), Long.valueOf(j7), keyEvent.getEventTime());
    }

    public final /* synthetic */ void m(M.c cVar, KeyEvent keyEvent) {
        q(false, Long.valueOf(cVar.f19878b), Long.valueOf(cVar.f19877a), keyEvent.getEventTime());
    }

    public final void n(G g7, final L.d.a aVar) {
        this.f19859a.f("flutter/keydata", g7.a(), aVar == null ? null : new c.b() { // from class: u5.H
            @Override // E5.c.b
            public final void a(ByteBuffer byteBuffer) {
                K.k(L.d.a.this, byteBuffer);
            }
        });
    }

    public void o(M.d dVar, boolean z7, long j7, final long j8, final KeyEvent keyEvent, ArrayList arrayList) {
        M.c[] cVarArr = dVar.f19880b;
        boolean[] zArr = new boolean[cVarArr.length];
        Boolean[] boolArr = new Boolean[cVarArr.length];
        boolean z8 = false;
        int i7 = 0;
        while (true) {
            M.c[] cVarArr2 = dVar.f19880b;
            boolean z9 = true;
            if (i7 >= cVarArr2.length) {
                break;
            }
            final M.c cVar = cVarArr2[i7];
            boolean containsKey = this.f19860b.containsKey(Long.valueOf(cVar.f19877a));
            zArr[i7] = containsKey;
            if (cVar.f19878b == j7) {
                int i8 = a.f19863a[e(keyEvent).ordinal()];
                if (i8 != 1) {
                    if (i8 == 2) {
                        boolArr[i7] = Boolean.valueOf(zArr[i7]);
                    } else if (i8 == 3) {
                        if (!z7) {
                            arrayList.add(new Runnable() { // from class: u5.J
                                @Override // java.lang.Runnable
                                public final void run() {
                                    K.this.m(cVar, keyEvent);
                                }
                            });
                        }
                        boolArr[i7] = Boolean.valueOf(zArr[i7]);
                    }
                    i7++;
                } else {
                    boolArr[i7] = Boolean.FALSE;
                    if (!z7) {
                        arrayList.add(new Runnable() { // from class: u5.I
                            @Override // java.lang.Runnable
                            public final void run() {
                                K.this.l(cVar, j8, keyEvent);
                            }
                        });
                    }
                }
            } else if (!z8 && !containsKey) {
                z9 = false;
            }
            z8 = z9;
            i7++;
        }
        if (z7) {
            for (int i9 = 0; i9 < dVar.f19880b.length; i9++) {
                if (boolArr[i9] == null) {
                    if (z8) {
                        boolArr[i9] = Boolean.valueOf(zArr[i9]);
                    } else {
                        boolArr[i9] = Boolean.TRUE;
                        z8 = true;
                    }
                }
            }
            if (!z8) {
                boolArr[0] = Boolean.TRUE;
            }
        } else {
            for (int i10 = 0; i10 < dVar.f19880b.length; i10++) {
                if (boolArr[i10] == null) {
                    boolArr[i10] = Boolean.FALSE;
                }
            }
        }
        for (int i11 = 0; i11 < dVar.f19880b.length; i11++) {
            if (zArr[i11] != boolArr[i11].booleanValue()) {
                M.c cVar2 = dVar.f19880b[i11];
                q(boolArr[i11].booleanValue(), Long.valueOf(cVar2.f19878b), Long.valueOf(cVar2.f19877a), keyEvent.getEventTime());
            }
        }
    }

    public void p(M.e eVar, boolean z7, long j7, KeyEvent keyEvent) {
        if (eVar.f19883c == j7 || eVar.f19884d == z7) {
            return;
        }
        boolean containsKey = this.f19860b.containsKey(Long.valueOf(eVar.f19882b));
        boolean z8 = !containsKey;
        if (z8) {
            eVar.f19884d = !eVar.f19884d;
        }
        q(z8, Long.valueOf(eVar.f19883c), Long.valueOf(eVar.f19882b), keyEvent.getEventTime());
        if (!z8) {
            eVar.f19884d = !eVar.f19884d;
        }
        q(containsKey, Long.valueOf(eVar.f19883c), Long.valueOf(eVar.f19882b), keyEvent.getEventTime());
    }

    public final void q(boolean z7, Long l7, Long l8, long j7) {
        G g7 = new G();
        g7.f19832a = j7;
        g7.f19833b = z7 ? G.b.kDown : G.b.kUp;
        g7.f19835d = l7.longValue();
        g7.f19834c = l8.longValue();
        g7.f19838g = null;
        g7.f19836e = true;
        g7.f19837f = G.a.kKeyboard;
        if (l8.longValue() != 0 && l7.longValue() != 0) {
            if (!z7) {
                l7 = null;
            }
            r(l8, l7);
        }
        n(g7, null);
    }

    public void r(Long l7, Long l8) {
        if (l8 != null) {
            if (((Long) this.f19860b.put(l7, l8)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) this.f19860b.remove(l7)) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
