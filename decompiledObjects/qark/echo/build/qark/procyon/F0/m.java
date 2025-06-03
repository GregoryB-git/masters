// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

import java.util.concurrent.atomic.AtomicBoolean;
import L0.c;
import Y0.f;
import a1.d;
import l1.C;
import l1.K;
import l1.j;
import g0.E;
import I0.a;
import c1.u;
import X0.e;
import H0.b;
import l1.J;
import java.util.List;
import d0.o;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import android.net.Uri;
import java.lang.reflect.Constructor;
import c1.h;
import c1.t;
import X2.v;

public final class m implements x
{
    public static final int[] r;
    public static final a s;
    public static final a t;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public v m;
    public int n;
    public boolean o;
    public t.a p;
    public int q;
    
    static {
        r = new int[] { 5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21 };
        s = new a((a.a)new k());
        t = new a((a.a)new l());
    }
    
    public m() {
        this.k = 1;
        this.n = 112800;
        this.p = new h();
        this.o = true;
    }
    
    public static Constructor f() {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", (Class<?>[])new Class[0]).invoke(null, new Object[0]))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(r.class).getConstructor(Integer.TYPE);
        }
        return null;
    }
    
    public static Constructor g() {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(r.class).getConstructor((Class<?>[])new Class[0]);
    }
    
    @Override
    public r[] a() {
        synchronized (this) {
            return this.b(Uri.EMPTY, new HashMap());
        }
    }
    
    @Override
    public r[] b(final Uri uri, final Map map) {
        while (true) {
            // monitorenter(this)
            while (true) {
                int i = 0;
                Label_0271: {
                    while (true) {
                        try {
                            Object r = F0.m.r;
                            final ArrayList list = new ArrayList<r>(((r[])r).length);
                            final int b = d0.o.b(map);
                            if (b != -1) {
                                this.e(b, list);
                            }
                            final int c = d0.o.c(uri);
                            if (c != -1 && c != b) {
                                this.e(c, list);
                            }
                            final int length = ((r[])r).length;
                            final int n = 0;
                            i = 0;
                            if (i >= length) {
                                r = new r[list.size()];
                                for (i = n; i < list.size(); ++i) {
                                    r r3;
                                    final r r2 = r3 = list.get(i);
                                    if (this.o) {
                                        r3 = r2;
                                        if (!(r2.d() instanceof Z0.h)) {
                                            r3 = r2;
                                            if (!(r2.d() instanceof Z0.m)) {
                                                r3 = r2;
                                                if (!(r2.d() instanceof J)) {
                                                    r3 = r2;
                                                    if (!(r2.d() instanceof b)) {
                                                        r3 = r2;
                                                        if (!(r2.d() instanceof e)) {
                                                            r3 = new u(r2, this.p);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    r[i] = r3;
                                }
                                // monitorexit(this)
                                return (r[])r;
                            }
                            final r r4 = r[i];
                            if (r4 != b && r4 != c) {
                                this.e((int)r4, list);
                            }
                            break Label_0271;
                            // monitorexit(this)
                            throw;
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                ++i;
                continue;
            }
        }
    }
    
    public final void e(int n, final List list) {
        int n2 = 2;
        final int n3 = 0;
        r r = null;
        switch (n) {
            default: {
                return;
            }
            case 21: {
                r = new I0.a();
                break;
            }
            case 20: {
                n = this.h;
                if ((n & 0x2) == 0x0 && (n & 0x4) == 0x0) {
                    r = new M0.a();
                    break;
                }
                return;
            }
            case 19: {
                r = new J0.a();
                break;
            }
            case 18: {
                r = new n1.a();
                break;
            }
            case 17: {
                r = new b1.a();
                break;
            }
            case 16: {
                r = new b((true ^ this.o) ? 1 : 0, this.p);
                break;
            }
            case 15: {
                r = F0.m.t.a(new Object[0]);
                if (r != null) {
                    break;
                }
                return;
            }
            case 14: {
                r = new N0.a(this.q);
                break;
            }
            case 12: {
                r = new m1.b();
                break;
            }
            case 11: {
                if (this.m == null) {
                    this.m = v.Y();
                }
                r = new J(this.k, (this.o ^ true) ? 1 : 0, this.p, new E(0L), new j(this.l, this.m), this.n);
                break;
            }
            case 10: {
                r = new C();
                break;
            }
            case 9: {
                r = new d();
                break;
            }
            case 8: {
                final t.a p2 = this.p;
                final int i = this.i;
                if (this.o) {
                    n = 0;
                }
                else {
                    n = 32;
                }
                list.add(new Z0.h(p2, i | n));
                final t.a p3 = this.p;
                final int h = this.h;
                if (this.o) {
                    n = n3;
                }
                else {
                    n = 16;
                }
                r = new Z0.m(p3, h | n);
                break;
            }
            case 7: {
                n = this.j;
                final boolean b = this.b;
                if (!this.c) {
                    n2 = 0;
                }
                r = new f(n | (b ? 1 : 0) | n2);
                break;
            }
            case 6: {
                final t.a p4 = this.p;
                n = this.g;
                if (this.o) {
                    n2 = 0;
                }
                r = new e(p4, n2 | n);
                break;
            }
            case 5: {
                r = new c();
                break;
            }
            case 4: {
                r = F0.m.s.a(this.f);
                if (r != null) {
                    break;
                }
                r = new K0.d(this.f);
                break;
            }
            case 3: {
                n = this.e;
                final boolean b2 = this.b;
                if (!this.c) {
                    n2 = 0;
                }
                r = new G0.b(n | (b2 ? 1 : 0) | n2);
                break;
            }
            case 2: {
                n = this.d;
                final boolean b3 = this.b;
                if (!this.c) {
                    n2 = 0;
                }
                r = new l1.h(n | (b3 ? 1 : 0) | n2);
                break;
            }
            case 1: {
                r = new l1.e();
                break;
            }
            case 0: {
                r = new l1.b();
                break;
            }
        }
        while (true) {
            list.add(r);
            return;
            continue;
        }
    }
    
    public m h(final boolean c) {
        synchronized (this) {
            this.c = c;
            return this;
        }
    }
    
    public m i(final boolean b) {
        synchronized (this) {
            this.b = b;
            return this;
        }
    }
    
    public m j(final int j) {
        synchronized (this) {
            this.j = j;
            return this;
        }
    }
    
    public static final class a
    {
        public final m.a.a a;
        public final AtomicBoolean b;
        public Constructor c;
        
        public a(final m.a.a a) {
            this.a = a;
            this.b = new AtomicBoolean(false);
        }
        
        public r a(final Object... initargs) {
            final Constructor b = this.b();
            if (b == null) {
                return null;
            }
            try {
                return b.newInstance(initargs);
            }
            catch (Exception cause) {
                throw new IllegalStateException("Unexpected error creating extractor", cause);
            }
        }
        
        public final Constructor b() {
            final AtomicBoolean b = this.b;
            // monitorenter(b)
            Label_0030: {
                try {
                    if (this.b.get()) {
                        // monitorexit(b)
                        return this.c;
                    }
                    break Label_0030;
                }
                finally {
                    goto Label_0073;
                    try {
                        // monitorexit(b)
                        return this.a.a();
                    }
                    catch (Exception cause) {
                        throw new RuntimeException("Error instantiating extension", cause);
                    }
                    catch (ClassNotFoundException ex) {}
                }
            }
            goto Label_0056;
        }
        
        public interface a
        {
            Constructor a();
        }
    }
}
