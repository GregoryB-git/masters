// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package P;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.util.Iterator;
import kotlin.jvm.internal.s;
import p6.u;
import p6.q0;
import p6.w;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Closeable;
import java.io.FileOutputStream;
import V5.i;
import java.io.File;
import V5.o;
import V5.t;
import s6.c;
import X5.d;
import g6.p;
import kotlin.jvm.internal.Intrinsics;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.g;
import java.util.List;
import s6.j;
import V5.h;
import p6.I;
import g6.a;
import java.util.Set;

public final class m implements f
{
    public static final a k;
    public static final Set l;
    public static final Object m;
    public final g6.a a;
    public final k b;
    public final P.b c;
    public final I d;
    public final s6.b e;
    public final String f;
    public final h g;
    public final j h;
    public List i;
    public final l j;
    
    static {
        k = new a(null);
        l = new LinkedHashSet();
        m = new Object();
    }
    
    public m(final g6.a a, final k b, final List list, final P.b c, final I d) {
        Intrinsics.checkNotNullParameter(a, "produceFile");
        Intrinsics.checkNotNullParameter(b, "serializer");
        Intrinsics.checkNotNullParameter(list, "initTasksList");
        Intrinsics.checkNotNullParameter(c, "corruptionHandler");
        Intrinsics.checkNotNullParameter(d, "scope");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = s6.d.e(new p() {
            public int o;
            public /* synthetic */ Object p;
            public final /* synthetic */ m q;
            
            @Override
            public final X5.d create(final Object p2, final X5.d d) {
                final p p3 = new p() {
                    public int o;
                    public /* synthetic */ Object p;
                    public final /* synthetic */ m q = this.q;
                };
                p3.p = p2;
                return p3;
            }
            
            public final Object invoke(final c c, final X5.d d) {
                return ((m$g)this.create(c, d)).invokeSuspend(t.a);
            }
            
            @Override
            public final Object invokeSuspend(final Object o) {
                final Object c = Y5.b.c();
                final int o2 = this.o;
                if (o2 != 0) {
                    if (o2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(o);
                }
                else {
                    o.b(o);
                    final c c2 = (c)this.p;
                    final n n = (n)P.m.f(this.q).getValue();
                    if (!(n instanceof c)) {
                        P.m.e(this.q).e(new m.b.a(n));
                    }
                    final s6.b b = new s6.b() {
                        public final /* synthetic */ s6.b o = s6.d.a(P.m.f(m$g.this.q), new p(n, null) {
                            public int o;
                            public /* synthetic */ Object p;
                            public final /* synthetic */ n q;
                            
                            public final Object a(final n n, final X5.d d) {
                                return ((m$g$a)this.create(n, d)).invokeSuspend(t.a);
                            }
                            
                            @Override
                            public final X5.d create(final Object p2, final X5.d d) {
                                final p p3 = new p(this.q, d) {
                                    public int o;
                                    public /* synthetic */ Object p;
                                    public final /* synthetic */ n q;
                                    
                                    public final Object a(final n n, final X5.d d) {
                                        return ((m$g$a)this.create(n, d)).invokeSuspend(t.a);
                                    }
                                };
                                p3.p = p2;
                                return p3;
                            }
                            
                            @Override
                            public final Object invokeSuspend(final Object o) {
                                Y5.b.c();
                                if (this.o == 0) {
                                    o.b(o);
                                    final n n = (n)this.p;
                                    final n q = this.q;
                                    final boolean b = q instanceof c;
                                    boolean b3;
                                    final boolean b2 = b3 = false;
                                    if (!b) {
                                        if (q instanceof P.h) {
                                            b3 = b2;
                                        }
                                        else {
                                            b3 = b2;
                                            if (n == q) {
                                                b3 = true;
                                            }
                                        }
                                    }
                                    return Z5.b.a(b3);
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        });
                        
                        @Override
                        public Object a(final c c, final X5.d d) {
                            final Object a = this.o.a(new c() {
                                @Override
                                public Object emit(Object b, final X5.d d) {
                                    d d3 = null;
                                    Label_0051: {
                                        if (d instanceof m$g$b$a$a) {
                                            final d d2 = (m$g$b$a$a)d;
                                            final int p2 = d2.p;
                                            if ((p2 & Integer.MIN_VALUE) != 0x0) {
                                                d2.p = p2 + Integer.MIN_VALUE;
                                                d3 = d2;
                                                break Label_0051;
                                            }
                                        }
                                        d3 = new d(d) {
                                            public /* synthetic */ Object o;
                                            public int p;
                                            public final /* synthetic */ m$g$b$a q;
                                            
                                            @Override
                                            public final Object invokeSuspend(final Object o) {
                                                this.o = o;
                                                this.p |= Integer.MIN_VALUE;
                                                return this.q.emit(null, this);
                                            }
                                        };
                                    }
                                    final Object o = d3.o;
                                    final Object c = Y5.b.c();
                                    final int p3 = d3.p;
                                    if (p3 != 0) {
                                        if (p3 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        V5.o.b(o);
                                    }
                                    else {
                                        V5.o.b(o);
                                        final c o2 = c;
                                        final n n = (n)b;
                                        if (n instanceof P.j) {
                                            throw ((P.j)n).a();
                                        }
                                        if (n instanceof P.h) {
                                            throw ((P.h)n).a();
                                        }
                                        if (n instanceof c) {
                                            b = ((c)n).b();
                                            d3.p = 1;
                                            if (o2.emit(b, d3) == c) {
                                                return c;
                                            }
                                        }
                                        else {
                                            if (n instanceof P.o) {
                                                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542".toString());
                                            }
                                            throw new V5.l();
                                        }
                                    }
                                    return t.a;
                                }
                            }, d);
                            if (a == Y5.b.c()) {
                                return a;
                            }
                            return t.a;
                        }
                    };
                    this.o = 1;
                    if (s6.d.b(c2, b, this) == c) {
                        return c;
                    }
                }
                return t.a;
            }
        });
        this.f = ".tmp";
        this.g = V5.i.a(new g6.a() {
            public final /* synthetic */ m o;
            
            public final File a() {
                final File file = (File)P.m.h(this.o).invoke();
                final String absolutePath = file.getAbsolutePath();
                final m.a k = P.m.k;
                final Object b = k.b();
                // monitorenter(b)
                Label_0123: {
                    try {
                        if (k.a().contains(absolutePath) ^ true) {
                            final Set a = k.a();
                            Intrinsics.checkNotNullExpressionValue(absolutePath, "it");
                            a.add(absolutePath);
                            // monitorexit(b)
                            return file;
                        }
                    }
                    finally {
                        break Label_0123;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("There are multiple DataStores active for the same file: ");
                    final Throwable obj;
                    sb.append(obj);
                    sb.append(". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).");
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
            // monitorexit(b)
        });
        this.h = s6.m.a(P.o.a);
        this.i = W5.m.G(list);
        this.j = new l(d, new g6.l() {
            public final /* synthetic */ m o;
            
            public final void a(Throwable b) {
                if (b != null) {
                    P.m.f(this.o).setValue(new P.h(b));
                }
                final m.a k = P.m.k;
                b = (Throwable)k.b();
                final m o = this.o;
                synchronized (b) {
                    k.a().remove(o.r().getAbsolutePath());
                    final t a = t.a;
                }
            }
        }, m$e.o, new p() {
            public int o;
            public /* synthetic */ Object p;
            public final /* synthetic */ m q;
            
            public final Object a(final m.b b, final X5.d d) {
                return ((m$f)this.create(b, d)).invokeSuspend(t.a);
            }
            
            @Override
            public final X5.d create(final Object p2, final X5.d d) {
                final p p3 = new p() {
                    public int o;
                    public /* synthetic */ Object p;
                    public final /* synthetic */ m q = this.q;
                    
                    public final Object a(final m.b b, final X5.d d) {
                        return ((m$f)this.create(b, d)).invokeSuspend(t.a);
                    }
                };
                p3.p = p2;
                return p3;
            }
            
            @Override
            public final Object invokeSuspend(final Object o) {
                final Object c = Y5.b.c();
                final int o2 = this.o;
                if (o2 != 0) {
                    if (o2 != 1 && o2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(o);
                }
                else {
                    o.b(o);
                    final m.b b = (m.b)this.p;
                    if (b instanceof m.b.a) {
                        final m q = this.q;
                        final m.b.a a = (m.b.a)b;
                        this.o = 1;
                        if (q.s(a, this) == c) {
                            return c;
                        }
                    }
                    else if (b instanceof m.b.b) {
                        final m q2 = this.q;
                        final m.b.b b2 = (m.b.b)b;
                        this.o = 2;
                        if (q2.t(b2, this) == c) {
                            return c;
                        }
                    }
                }
                return t.a;
            }
        });
    }
    
    public static final /* synthetic */ Set c() {
        return P.m.l;
    }
    
    public static final /* synthetic */ Object d() {
        return P.m.m;
    }
    
    public static final /* synthetic */ l e(final m m) {
        return m.j;
    }
    
    public static final /* synthetic */ j f(final m m) {
        return m.h;
    }
    
    public static final /* synthetic */ g6.a h(final m m) {
        return m.a;
    }
    
    public final Object A(Object c, d d) {
        Z5.d d2 = null;
        Label_0049: {
            if (d instanceof m$r) {
                d2 = (m$r)d;
                final int v = d2.v;
                if ((v & Integer.MIN_VALUE) != 0x0) {
                    d2.v = v + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            d2 = new Z5.d(d) {
                public Object o;
                public Object p;
                public Object q;
                public Object r;
                public Object s;
                public /* synthetic */ Object t;
                public final /* synthetic */ m u;
                public int v;
                
                @Override
                public final Object invokeSuspend(final Object t) {
                    this.t = t;
                    this.v |= Integer.MIN_VALUE;
                    return this.u.A(null, this);
                }
            };
        }
        final Object t = d2.t;
        final Object c2 = Y5.b.c();
        final int v2 = d2.v;
        Label_0426: {
            if (v2 != 0) {
                if (v2 == 1) {
                    final FileOutputStream fileOutputStream = (FileOutputStream)d2.s;
                    final Throwable t2 = (Throwable)d2.r;
                    final Object o = d2.q;
                    final Object o2 = d2.p;
                    final m m = (m)d2.o;
                    final Object o3 = o;
                    d = (d)o2;
                    try {
                        V5.o.b(t);
                    }
                    finally {
                        c = (IOException)d;
                        break Label_0426;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(t);
            this.q(this.r());
            Object o3 = new File(Intrinsics.i(this.r().getAbsolutePath(), this.f));
            try {
                d = (d)new FileOutputStream((File)o3);
                d d3;
                try {
                    final k b = this.b;
                    final c c3 = new c((FileOutputStream)d);
                    d2.o = this;
                    d2.p = o3;
                    d2.q = d;
                    d2.r = null;
                    d2.s = d;
                    d2.v = 1;
                    c = (IOException)b.c(c, c3, d2);
                    if (c == c2) {
                        return c2;
                    }
                    final m m = this;
                    c = (IOException)o3;
                    final Object o = d;
                    final Throwable t2 = null;
                    d3 = (d)(o3 = d);
                    d = (d)c;
                    ((FileOutputStream)o).getFD().sync();
                    o3 = d3;
                    d = (d)c;
                    final t a = V5.t.a;
                    d = (d)c;
                    try {
                        e6.b.a((Closeable)d3, t2);
                        d = (d)c;
                        if (((File)c).renameTo(m.r())) {
                            return V5.t.a;
                        }
                        d = (d)c;
                        o3 = new StringBuilder();
                        d = (d)c;
                        ((StringBuilder)o3).append("Unable to rename ");
                        d = (d)c;
                        ((StringBuilder)o3).append(c);
                        d = (d)c;
                        ((StringBuilder)o3).append(".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                        d = (d)c;
                        throw new IOException(((StringBuilder)o3).toString());
                    }
                    catch (IOException ex) {}
                }
                finally {
                    c = (IOException)o3;
                    o3 = d;
                }
                try {
                    throw d3;
                }
                finally {
                    e6.b.a((Closeable)o3, (Throwable)d3);
                }
            }
            catch (IOException c) {
                d = (d)o3;
            }
        }
        if (((File)d).exists()) {
            ((File)d).delete();
        }
        throw c;
    }
    
    @Override
    public Object a(final p p2, final d d) {
        final u b = w.b(null, 1, null);
        this.j.e(new b.b(p2, b, (n)this.h.getValue(), d.getContext()));
        return b.m(d);
    }
    
    @Override
    public s6.b b() {
        return this.e;
    }
    
    public final void q(final File file) {
        final File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        throw new IOException(Intrinsics.i("Unable to create parent directories of ", file));
    }
    
    public final File r() {
        return (File)this.g.getValue();
    }
    
    public final Object s(final b.a a, final d d) {
        final n n = (n)this.h.getValue();
        if (!(n instanceof P.c)) {
            if (n instanceof P.j) {
                if (n == a.a()) {
                    final Object w = this.w(d);
                    if (w == Y5.b.c()) {
                        return w;
                    }
                    return t.a;
                }
            }
            else if (Intrinsics.a(n, P.o.a)) {
                final Object w2 = this.w(d);
                if (w2 == Y5.b.c()) {
                    return w2;
                }
                return t.a;
            }
            else if (n instanceof P.h) {
                throw new IllegalStateException("Can't read in final state.".toString());
            }
        }
        return t.a;
    }
    
    public final Object t(b.b o, d d) {
        Object o2 = null;
        Label_0049: {
            if (d instanceof m$i) {
                o2 = d;
                final int t = ((m$i)o2).t;
                if ((t & Integer.MIN_VALUE) != 0x0) {
                    ((m$i)o2).t = t + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            o2 = new Z5.d(d) {
                public Object o;
                public Object p;
                public Object q;
                public /* synthetic */ Object r;
                public int t;
                
                @Override
                public final Object invokeSuspend(final Object r) {
                    this.r = r;
                    this.t |= Integer.MIN_VALUE;
                    return P.m.this.t(null, this);
                }
            };
        }
        final Object r = ((m$i)o2).r;
        final Object c = Y5.b.c();
        final int t2 = ((m$i)o2).t;
    Label_0378:
        while (true) {
        Label_0519:
            while (true) {
                if (t2 != 0) {
                    if (t2 != 1) {
                        if (t2 == 2) {
                            d = (d)((m$i)o2).q;
                            final m m = (m)((m$i)o2).p;
                            final b.b b = (b.b)((m$i)o2).o;
                            o.b(r);
                            final d o3 = d;
                            break Label_0378;
                        }
                        if (t2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        d = (d)((m$i)o2).o;
                    }
                    else {
                        d = (d)((m$i)o2).o;
                    }
                    o = (b.b)d;
                    try {
                        o.b(r);
                        break Label_0519;
                    }
                    finally {
                        break Label_0519;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                while (true) {
                    o.b(r);
                    final d d2 = d = (d)o.a();
                    d d4 = null;
                    Label_0557: {
                        try {
                            final V5.n.a o4 = V5.n.o;
                            d = d2;
                            final n n = (n)this.h.getValue();
                            d = d2;
                            while (true) {
                                if (n instanceof P.c) {
                                    d = d2;
                                    final p d3 = o.d();
                                    d = d2;
                                    final X5.g b2 = o.b();
                                    d = d2;
                                    ((m$i)o2).o = d2;
                                    d = d2;
                                    ((m$i)o2).t = 1;
                                    d = d2;
                                    o2 = (d = (d)this.z(d3, b2, (d)o2));
                                    final d o3 = d2;
                                    if (o2 == c) {
                                        return c;
                                    }
                                    Label_0542: {
                                        d4 = d;
                                    }
                                    d = o3;
                                    final Object a = V5.n.a(d4);
                                    o = (b.b)d;
                                    d = (d)a;
                                    w.c((u)o, d);
                                    return t.a;
                                }
                                d = d2;
                                if (!(n instanceof P.j)) {
                                    d = d2;
                                    if (!(n instanceof P.o)) {
                                        d = d2;
                                        if (n instanceof P.h) {
                                            d = d2;
                                            throw ((P.h)n).a();
                                        }
                                        d = d2;
                                        throw new V5.l();
                                    }
                                }
                                d = d2;
                                if (n != o.c()) {
                                    d = d2;
                                    throw ((P.j)n).a();
                                }
                                d = d2;
                                ((m$i)o2).o = o;
                                d = d2;
                                ((m$i)o2).p = this;
                                d = d2;
                                ((m$i)o2).q = d2;
                                d = d2;
                                ((m$i)o2).t = 2;
                                d = d2;
                                if (this.v((d)o2) == c) {
                                    return c;
                                }
                                break Label_0557;
                                d o3 = null;
                                d = o3;
                                final b.b b;
                                final p d5 = b.d();
                                d = o3;
                                final X5.g b3 = b.b();
                                d = o3;
                                ((m$i)o2).o = o3;
                                d = o3;
                                ((m$i)o2).p = null;
                                d = o3;
                                ((m$i)o2).q = null;
                                d = o3;
                                ((m$i)o2).t = 3;
                                d = o3;
                                return c;
                                d = (d)V5.n.o;
                                d = (d)V5.n.a(o.a((Throwable)d4));
                                continue;
                            }
                        }
                        // iftrue(Label_0542:, d = m.z(d5, b3, (d)o2) != c)
                        finally {
                            o = (b.b)d;
                            continue Label_0519;
                        }
                    }
                    final m m = this;
                    final b.b b = o;
                    final d o3 = d4;
                    continue Label_0378;
                }
                break;
            }
            break;
        }
    }
    
    public final Object u(d d) {
        Z5.d d2 = null;
        Label_0049: {
            if (d instanceof m$j) {
                d2 = (m$j)d;
                final int w = d2.w;
                if ((w & Integer.MIN_VALUE) != 0x0) {
                    d2.w = w + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            d2 = new Z5.d(d) {
                public Object o;
                public Object p;
                public Object q;
                public Object r;
                public Object s;
                public Object t;
                public /* synthetic */ Object u;
                public int w;
                
                @Override
                public final Object invokeSuspend(final Object u) {
                    this.u = u;
                    this.w |= Integer.MIN_VALUE;
                    return P.m.this.u(this);
                }
            };
        }
        Object o = d2.u;
        final Object c = Y5.b.c();
        final int w2 = d2.w;
        final boolean b = false;
        Label_0632: {
            kotlin.jvm.internal.u p = null;
            m o2 = null;
            s s = null;
        Label_0564:
            while (true) {
                kotlin.jvm.internal.u u = null;
                Label_0389: {
                    Iterator<Object> iterator;
                    kotlin.jvm.internal.u q;
                    Object p2;
                    m o3;
                    P.i s2;
                    if (w2 != 0) {
                        if (w2 == 1) {
                            u = (kotlin.jvm.internal.u)d2.r;
                            p = (kotlin.jvm.internal.u)d2.q;
                            d = (d)d2.p;
                            o2 = (m)d2.o;
                            V5.o.b(o);
                            break Label_0389;
                        }
                        if (w2 != 2) {
                            if (w2 == 3) {
                                d = (d)d2.r;
                                s = (s)d2.q;
                                p = (kotlin.jvm.internal.u)d2.p;
                                o2 = (m)d2.o;
                                V5.o.b(o);
                                break Label_0632;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            iterator = (Iterator<Object>)d2.t;
                            final P.i i = (m$k)d2.s;
                            s = (s)d2.r;
                            q = (kotlin.jvm.internal.u)d2.q;
                            p2 = d2.p;
                            o3 = (m)d2.o;
                            V5.o.b(o);
                            s2 = i;
                        }
                    }
                    else {
                        V5.o.b(o);
                        if (!Intrinsics.a(this.h.getValue(), P.o.a) && !(this.h.getValue() instanceof P.j)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        d = (d)y6.c.b(false, 1, null);
                        u = new kotlin.jvm.internal.u();
                        d2.o = this;
                        d2.p = d;
                        d2.q = u;
                        d2.r = u;
                        d2.w = 1;
                        o = this.y(d2);
                        if (o == c) {
                            return c;
                        }
                        o2 = this;
                        p = u;
                        break Label_0389;
                    }
                    while (iterator.hasNext()) {
                        final p p3 = iterator.next();
                        d2.o = o3;
                        d2.p = p2;
                        d2.q = q;
                        d2.r = s;
                        d2.s = s2;
                        d2.t = iterator;
                        d2.w = 2;
                        if (p3.invoke(s2, d2) == c) {
                            return c;
                        }
                    }
                    final m m = o3;
                    d = (d)p2;
                    p = q;
                    o2 = m;
                    break Label_0564;
                }
                u.o = o;
                s = new s();
                P.i s2 = new P.i() {
                    @Override
                    public Object a(p p, d p2) {
                        Z5.d d = null;
                        Label_0049: {
                            if (p2 instanceof m$k$a) {
                                d = (m$k$a)p2;
                                final int v = d.v;
                                if ((v & Integer.MIN_VALUE) != 0x0) {
                                    d.v = v + Integer.MIN_VALUE;
                                    break Label_0049;
                                }
                            }
                            d = new Z5.d(p2) {
                                public Object o;
                                public Object p;
                                public Object q;
                                public Object r;
                                public Object s;
                                public /* synthetic */ Object t;
                                public final /* synthetic */ m$k u;
                                public int v;
                                
                                @Override
                                public final Object invokeSuspend(final Object t) {
                                    this.t = t;
                                    this.v |= Integer.MIN_VALUE;
                                    return this.u.a(null, this);
                                }
                            };
                        }
                        Object o = d.t;
                        final Object c = Y5.b.c();
                        final int v2 = d.v;
                        Label_0427: {
                            m q2;
                            kotlin.jvm.internal.u p3;
                            s s;
                            p p5;
                            if (v2 != 0) {
                                if (v2 != 1) {
                                    if (v2 != 2) {
                                        if (v2 == 3) {
                                            final Object q = d.q;
                                            final Object o2 = d.p;
                                            p = (p)d.o;
                                            try {
                                                V5.o.b(o);
                                                o = q;
                                                break Label_0427;
                                            }
                                            finally {
                                                break Label_0427;
                                            }
                                        }
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    final m m = (m)d.q;
                                    final kotlin.jvm.internal.u u = (kotlin.jvm.internal.u)d.p;
                                    final Object o3 = d.o;
                                    try {
                                        V5.o.b(o);
                                        break Label_0427;
                                    }
                                    finally {
                                        p = (p)o3;
                                        break Label_0427;
                                    }
                                }
                                q2 = (m)d.s;
                                p3 = (kotlin.jvm.internal.u)d.r;
                                s = (s)d.q;
                                p2 = (d)d.p;
                                final p p4 = (p)d.o;
                                V5.o.b(o);
                                p5 = p4;
                            }
                            else {
                                V5.o.b(o);
                                p2 = d;
                                final s b = s;
                                final kotlin.jvm.internal.u c2 = p;
                                final m d2 = o2;
                                d.o = p;
                                d.p = p2;
                                d.q = b;
                                d.r = c2;
                                d.s = d2;
                                d.v = 1;
                                if (((y6.a)p2).a(null, d) == c) {
                                    return c;
                                }
                                p5 = p;
                                q2 = d2;
                                s = b;
                                p3 = c2;
                            }
                            while (true) {
                                while (true) {
                                    Label_0575: {
                                        try {
                                            if (!s.o) {
                                                final Object o4 = p3.o;
                                                d.o = p2;
                                                d.p = p3;
                                                d.q = q2;
                                                d.r = null;
                                                d.s = null;
                                                d.v = 2;
                                                o = p5.invoke(o4, d);
                                                if (o == c) {
                                                    return c;
                                                }
                                                final m m = q2;
                                                p = (p)p2;
                                                p2 = (d)p3;
                                                if (Intrinsics.a(o, ((kotlin.jvm.internal.u)p2).o)) {
                                                    break Label_0575;
                                                }
                                                d.o = p;
                                                d.p = p2;
                                                d.q = o;
                                                d.v = 3;
                                                if (m.A(o, d) == c) {
                                                    return c;
                                                }
                                                final Object o2 = p2;
                                                p2 = (d)p;
                                                ((kotlin.jvm.internal.u)o2).o = o;
                                                final Object o5 = o2;
                                                final Object o6 = p2;
                                                p2 = (d)o5;
                                                p2 = (d)((kotlin.jvm.internal.u)p2).o;
                                                ((y6.a)o6).b(null);
                                                return p2;
                                            }
                                        }
                                        finally {
                                            p = (p)p2;
                                            final d d3;
                                            p2 = d3;
                                            break;
                                        }
                                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                                    }
                                    final Object o6 = p;
                                    continue;
                                }
                            }
                        }
                        ((y6.a)p).b(null);
                    }
                };
                final List j = o2.i;
                if (j != null) {
                    final Iterator<Object> iterator = ((List<p>)j).iterator();
                    final m k = o2;
                    final kotlin.jvm.internal.u q = p;
                    final Object p2 = d;
                    final m o3 = k;
                    continue;
                }
                break;
            }
            o2.i = null;
            d2.o = o2;
            d2.p = p;
            d2.q = s;
            d2.r = d;
            d2.s = null;
            d2.t = null;
            d2.w = 3;
            if (((y6.a)d).a(null, d2) == c) {
                return c;
            }
            try {
                s.o = true;
                final t a = t.a;
                ((y6.a)d).b(null);
                d = (d)o2.h;
                final Object o4 = p.o;
                int hashCode = b ? 1 : 0;
                if (o4 != null) {
                    hashCode = o4.hashCode();
                }
                ((j)d).setValue(new P.c(o4, hashCode));
                return t.a;
            }
            finally {
                ((y6.a)d).b(null);
            }
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final Object v(d d) {
        Z5.d d3 = null;
        Label_0047: {
            if (d instanceof m$l) {
                final Z5.d d2 = (m$l)d;
                final int r = d2.r;
                if ((r & Integer.MIN_VALUE) != 0x0) {
                    d2.r = r + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0047;
                }
            }
            d3 = new Z5.d(d) {
                public Object o;
                public /* synthetic */ Object p;
                public int r;
                
                @Override
                public final Object invokeSuspend(final Object p) {
                    this.p = p;
                    this.r |= Integer.MIN_VALUE;
                    return P.m.this.v(this);
                }
            };
        }
        final Object p = d3.p;
        final Object c = Y5.b.c();
        final int r2 = d3.r;
        Label_0130: {
            if (r2 != 0) {
                if (r2 == 1) {
                    d = (d)d3.o;
                    try {
                        o.b(p);
                        break Label_0130;
                    }
                    finally {
                        break Label_0130;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(p);
            try {
                d3.o = this;
                d3.r = 1;
                if (this.u(d3) == c) {
                    return c;
                }
                return t.a;
            }
            finally {
                d = (d)this;
            }
        }
        final Throwable t;
        ((m)d).h.setValue(new P.j(t));
        throw t;
    }
    
    public final Object w(d d) {
        Z5.d d3 = null;
        Label_0047: {
            if (d instanceof m$m) {
                final Z5.d d2 = (m$m)d;
                final int r = d2.r;
                if ((r & Integer.MIN_VALUE) != 0x0) {
                    d2.r = r + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0047;
                }
            }
            d3 = new Z5.d(d) {
                public Object o;
                public /* synthetic */ Object p;
                public int r;
                
                @Override
                public final Object invokeSuspend(final Object p) {
                    this.p = p;
                    this.r |= Integer.MIN_VALUE;
                    return P.m.this.w(this);
                }
            };
        }
        final Object p = d3.p;
        final Object c = Y5.b.c();
        final int r2 = d3.r;
        Label_0133: {
            if (r2 != 0) {
                if (r2 == 1) {
                    d = (d)d3.o;
                    try {
                        o.b(p);
                        return t.a;
                    }
                    finally {
                        break Label_0133;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(p);
            try {
                d3.o = this;
                d3.r = 1;
                if (this.u(d3) == c) {
                    return c;
                }
                return t.a;
            }
            finally {
                d = (d)this;
            }
        }
        final Throwable t;
        ((m)d).h.setValue(new P.j(t));
        return V5.t.a;
    }
    
    public final Object x(d p) {
        Z5.d d = null;
        Label_0045: {
            if (p instanceof m$n) {
                d = (m$n)p;
                final int t = d.t;
                if ((t & Integer.MIN_VALUE) != 0x0) {
                    d.t = t + Integer.MIN_VALUE;
                    break Label_0045;
                }
            }
            d = new Z5.d(p) {
                public Object o;
                public Object p;
                public Object q;
                public /* synthetic */ Object r;
                public int t;
                
                @Override
                public final Object invokeSuspend(final Object r) {
                    this.r = r;
                    this.t |= Integer.MIN_VALUE;
                    return P.m.this.x(this);
                }
            };
        }
        final Object r = d.r;
        final Object c = Y5.b.c();
        final int t2 = d.t;
        Object o2 = null;
        Label_0220: {
            if (t2 != 0) {
                if (t2 == 1) {
                    final Throwable t3 = (Throwable)d.q;
                    final Object o = d.p;
                    p = (d)d.o;
                    try {
                        V5.o.b(r);
                    }
                    finally {
                        o2 = p;
                        break Label_0220;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(r);
            try {
                p = (d)new FileInputStream(this.r());
                Object o;
                Object b2;
                try {
                    final k b = this.b;
                    d.o = this;
                    d.p = p;
                    d.q = null;
                    d.t = 1;
                    b2 = b.b((InputStream)p, d);
                    if (b2 == c) {
                        return c;
                    }
                    o2 = null;
                    o = p;
                    p = (d)this;
                    try {
                        e6.b.a((Closeable)o, (Throwable)o2);
                        return b2;
                    }
                    catch (FileNotFoundException ex) {}
                }
                finally {
                    o2 = this;
                    o = p;
                }
                try {
                    throw b2;
                }
                finally {
                    e6.b.a((Closeable)o, (Throwable)b2);
                }
            }
            catch (FileNotFoundException o2) {
                p = (d)this;
            }
        }
        if (!((m)p).r().exists()) {
            return ((m)p).b.a();
        }
        throw o2;
    }
    
    public final Object y(d d) {
        Z5.d d2 = null;
        Label_0049: {
            if (d instanceof m$o) {
                d2 = (m$o)d;
                final int s = d2.s;
                if ((s & Integer.MIN_VALUE) != 0x0) {
                    d2.s = s + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            d2 = new Z5.d(d) {
                public Object o;
                public Object p;
                public /* synthetic */ Object q;
                public int s;
                
                @Override
                public final Object invokeSuspend(final Object q) {
                    this.q = q;
                    this.s |= Integer.MIN_VALUE;
                    return P.m.this.y(this);
                }
            };
        }
        Object p = d2.q;
        final Object c = Y5.b.c();
        final int s2 = d2.s;
        Object a = null;
        Label_0260: {
            Label_0209: {
                if (s2 != 0) {
                    if (s2 != 1) {
                        if (s2 != 2) {
                            if (s2 == 3) {
                                final Object p2 = d2.p;
                                d = (d)d2.o;
                                try {
                                    o.b(p);
                                    return p2;
                                }
                                catch (IOException a) {
                                    break Label_0260;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        d = (d)d2.p;
                        final Object o = d2.o;
                        V5.o.b(p);
                        break Label_0260;
                    }
                    else {
                        d = (d)d2.o;
                        try {
                            o.b(p);
                            return p;
                        }
                        catch (P.a a) {
                            break Label_0209;
                        }
                    }
                }
                o.b(p);
                try {
                    d2.o = this;
                    d2.s = 1;
                    final Object x = this.x(d2);
                    if (x == c) {
                        return c;
                    }
                    return x;
                }
                catch (P.a a) {
                    d = (d)this;
                }
            }
            final P.b c2 = ((m)d).c;
            d2.o = d;
            d2.p = a;
            d2.s = 2;
            p = c2.a((P.a)a, d2);
            if (p == c) {
                return c;
            }
            final Object o = d;
            d = (d)a;
            try {
                d2.o = d;
                d2.p = p;
                d2.s = 3;
                a = ((m)o).A(p, d2);
                if (a == c) {
                    return c;
                }
                return p;
            }
            catch (IOException ex) {}
        }
        V5.a.a((Throwable)d, (Throwable)a);
        throw d;
    }
    
    public final Object z(final p p3, final X5.g g, final d d) {
        Z5.d d3 = null;
        Label_0054: {
            if (d instanceof m$p) {
                final Z5.d d2 = (m$p)d;
                final int t = d2.t;
                if ((t & Integer.MIN_VALUE) != 0x0) {
                    d2.t = t + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0054;
                }
            }
            d3 = new Z5.d(d) {
                public Object o;
                public Object p;
                public Object q;
                public /* synthetic */ Object r;
                public int t;
                
                @Override
                public final Object invokeSuspend(final Object r) {
                    this.r = r;
                    this.t |= Integer.MIN_VALUE;
                    return P.m.this.z(null, null, this);
                }
            };
        }
        final Object r = d3.r;
        final Object c = Y5.b.c();
        final int t2 = d3.t;
        Object p4 = null;
        m o = null;
        Label_0298: {
            Object q;
            P.c c2;
            if (t2 != 0) {
                if (t2 != 1) {
                    if (t2 == 2) {
                        p4 = d3.p;
                        o = (m)d3.o;
                        V5.o.b(r);
                        break Label_0298;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    q = d3.q;
                    c2 = (P.c)d3.p;
                    o = (m)d3.o;
                    V5.o.b(r);
                    p4 = r;
                }
            }
            else {
                V5.o.b(r);
                final P.c p5 = (P.c)this.h.getValue();
                p5.a();
                q = p5.b();
                final p p6 = new p() {
                    public int o;
                    public final /* synthetic */ p p;
                    public final /* synthetic */ Object q;
                    
                    @Override
                    public final X5.d create(final Object o, final X5.d d) {
                        return new p() {
                            public int o;
                            public final /* synthetic */ p p = this.p;
                            public final /* synthetic */ Object q = this.q;
                        };
                    }
                    
                    public final Object invoke(final I i, final X5.d d) {
                        return ((m$q)this.create(i, d)).invokeSuspend(t.a);
                    }
                    
                    @Override
                    public final Object invokeSuspend(Object invoke) {
                        final Object c = Y5.b.c();
                        final int o = this.o;
                        if (o != 0) {
                            if (o == 1) {
                                V5.o.b(invoke);
                                return invoke;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            V5.o.b(invoke);
                            final p p = this.p;
                            final Object q = this.q;
                            this.o = 1;
                            invoke = p.invoke(q, this);
                            if (invoke == c) {
                                return c;
                            }
                            return invoke;
                        }
                    }
                };
                d3.o = this;
                d3.p = p5;
                d3.q = q;
                d3.t = 1;
                p4 = p6.g.g(g, p6, d3);
                if (p4 == c) {
                    return c;
                }
                c2 = p5;
                o = this;
            }
            c2.a();
            if (Intrinsics.a(q, p4)) {
                return q;
            }
            d3.o = o;
            d3.p = p4;
            d3.q = null;
            d3.t = 2;
            if (o.A(p4, d3) == c) {
                return c;
            }
        }
        final j h = o.h;
        int hashCode;
        if (p4 != null) {
            hashCode = p4.hashCode();
        }
        else {
            hashCode = 0;
        }
        h.setValue(new P.c(p4, hashCode));
        return p4;
    }
    
    public static final class a
    {
        public final Set a() {
            return P.m.c();
        }
        
        public final Object b() {
            return P.m.d();
        }
    }
    
    public abstract static class b
    {
        public static final class a extends m.b
        {
            public final n a;
            
            public a(final n a) {
                super(null);
                this.a = a;
            }
            
            public n a() {
                return this.a;
            }
        }
        
        public static final class b extends m.b
        {
            public final p a;
            public final u b;
            public final n c;
            public final X5.g d;
            
            public b(final p a, final u b, final n c, final X5.g d) {
                Intrinsics.checkNotNullParameter(a, "transform");
                Intrinsics.checkNotNullParameter(b, "ack");
                Intrinsics.checkNotNullParameter(d, "callerContext");
                super(null);
                this.a = a;
                this.b = b;
                this.c = c;
                this.d = d;
            }
            
            public final u a() {
                return this.b;
            }
            
            public final X5.g b() {
                return this.d;
            }
            
            public n c() {
                return this.c;
            }
            
            public final p d() {
                return this.a;
            }
        }
    }
    
    public static final class c extends OutputStream
    {
        public final FileOutputStream o;
        
        public c(final FileOutputStream o) {
            Intrinsics.checkNotNullParameter(o, "fileOutputStream");
            this.o = o;
        }
        
        @Override
        public void close() {
        }
        
        @Override
        public void flush() {
            this.o.flush();
        }
        
        @Override
        public void write(final int b) {
            this.o.write(b);
        }
        
        @Override
        public void write(final byte[] b) {
            Intrinsics.checkNotNullParameter(b, "b");
            this.o.write(b);
        }
        
        @Override
        public void write(final byte[] b, final int off, final int len) {
            Intrinsics.checkNotNullParameter(b, "bytes");
            this.o.write(b, off, len);
        }
    }
}
