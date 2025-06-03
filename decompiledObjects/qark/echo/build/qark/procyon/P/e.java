// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package P;

import java.util.ArrayList;
import g6.l;
import V5.a;
import kotlin.jvm.internal.u;
import java.util.Iterator;
import V5.o;
import Y5.b;
import V5.t;
import Z5.k;
import kotlin.jvm.internal.Intrinsics;
import g6.p;
import X5.d;
import java.util.List;
import kotlin.jvm.internal.g;

public abstract class e
{
    public static final a a;
    
    static {
        a = new a(null);
    }
    
    public static final class a
    {
        public final p b(final List list) {
            Intrinsics.checkNotNullParameter(list, "migrations");
            return new p() {
                public int o;
                public /* synthetic */ Object p;
                public final /* synthetic */ List q;
                
                public final Object a(final i i, final X5.d d) {
                    return ((e$a$a)this.create(i, d)).invokeSuspend(t.a);
                }
                
                @Override
                public final X5.d create(final Object p2, final X5.d d) {
                    final p p3 = new p() {
                        public int o;
                        public /* synthetic */ Object p;
                        public final /* synthetic */ List q = this.q;
                        
                        public final Object a(final i i, final X5.d d) {
                            return ((e$a$a)this.create(i, d)).invokeSuspend(t.a);
                        }
                    };
                    p3.p = p2;
                    return p3;
                }
                
                @Override
                public final Object invokeSuspend(final Object o) {
                    final Object c = b.c();
                    final int o2 = this.o;
                    if (o2 != 0) {
                        if (o2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(o);
                    }
                    else {
                        o.b(o);
                        final i i = (i)this.p;
                        final a a = e.a;
                        final List q = this.q;
                        this.o = 1;
                        if (a.c(q, i, this) == c) {
                            return c;
                        }
                    }
                    return t.a;
                }
            };
        }
        
        public final Object c(List list, final i i, final d d) {
            Z5.d d3 = null;
            Label_0054: {
                if (d instanceof e$a$b) {
                    final Z5.d d2 = (e$a$b)d;
                    final int s = d2.s;
                    if ((s & Integer.MIN_VALUE) != 0x0) {
                        d2.s = s + Integer.MIN_VALUE;
                        d3 = d2;
                        break Label_0054;
                    }
                }
                d3 = new Z5.d(d) {
                    public Object o;
                    public Object p;
                    public /* synthetic */ Object q;
                    public int s;
                    
                    @Override
                    public final Object invokeSuspend(final Object q) {
                        this.q = q;
                        this.s |= Integer.MIN_VALUE;
                        return a.this.c(null, null, this);
                    }
                };
            }
            final Object q = d3.q;
            final Object c = b.c();
            final int s2 = d3.s;
            Iterator<l> iterator;
            u o = null;
            Z5.d d4;
            Iterator<l> iterator2;
            u u;
            Object o2;
            final Throwable o3;
            l l;
            ArrayList<l> o4;
            p p3;
            Label_0372:Label_0207_Outer:
            while (true) {
                Label_0151: {
                    if (s2 == 0) {
                        break Label_0151;
                    }
                    Label_0135: {
                        if (s2 == 1) {
                            break Label_0135;
                        }
                        Label_0125: {
                            if (s2 != 2) {
                                break Label_0125;
                            }
                            iterator = (Iterator<l>)d3.p;
                            o = (u)d3.o;
                            d4 = d3;
                            iterator2 = iterator;
                            u = o;
                            try {
                                V5.o.b(q);
                                break Label_0225;
                            }
                            finally {
                                o2 = u.o;
                                if (o2 == null) {
                                    u.o = o3;
                                    d3 = d4;
                                    iterator = iterator2;
                                    o = u;
                                }
                                else {
                                    Intrinsics.b(o2);
                                    V5.a.a((Throwable)u.o, o3);
                                    d3 = d4;
                                    iterator = iterator2;
                                    o = u;
                                }
                                while (iterator.hasNext()) {
                                    l = iterator.next();
                                    d3.o = o;
                                    d3.p = iterator;
                                    d3.s = 2;
                                    if (l.invoke(d3) == c) {
                                        return c;
                                    }
                                }
                                break Label_0372;
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                while (true) {
                                    o = new u();
                                    iterator = (Iterator<l>)((List<l>)list).iterator();
                                    continue Label_0207_Outer;
                                    V5.o.b(q);
                                    o4 = new ArrayList<l>();
                                    p3 = new p() {
                                        public Object o;
                                        public Object p;
                                        public Object q;
                                        public int r;
                                        public /* synthetic */ Object s;
                                        public final /* synthetic */ List t;
                                        public final /* synthetic */ List u;
                                        
                                        public final Object a(final Object o, final X5.d d) {
                                            return ((e$a$c)this.create(o, d)).invokeSuspend(V5.t.a);
                                        }
                                        
                                        @Override
                                        public final X5.d create(final Object s, final X5.d d) {
                                            final p p2 = new p() {
                                                public Object o;
                                                public Object p;
                                                public Object q;
                                                public int r;
                                                public /* synthetic */ Object s;
                                                public final /* synthetic */ List t = this.t;
                                                public final /* synthetic */ List u = this.u;
                                                
                                                public final Object a(final Object o, final X5.d d) {
                                                    return ((e$a$c)this.create(o, d)).invokeSuspend(V5.t.a);
                                                }
                                            };
                                            p2.s = s;
                                            return p2;
                                        }
                                        
                                        @Override
                                        public final Object invokeSuspend(Object s) {
                                            b.c();
                                            final int r = this.r;
                                            Iterator<Object> iterator;
                                            List u;
                                            if (r != 0) {
                                                if (r != 1) {
                                                    if (r != 2) {
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    }
                                                    iterator = (Iterator<Object>)this.o;
                                                    u = (List)this.s;
                                                    V5.o.b(s);
                                                }
                                                else {
                                                    final Object q = this.q;
                                                    android.support.v4.media.a.a(this.p);
                                                    iterator = (Iterator<Object>)this.o;
                                                    u = (List)this.s;
                                                    V5.o.b(s);
                                                    if (s) {
                                                        u.add(new l(null, null) {
                                                            public int o;
                                                            
                                                            public final Object a(final X5.d d) {
                                                                return ((e$a$c$a)this.create(d)).invokeSuspend(V5.t.a);
                                                            }
                                                            
                                                            @Override
                                                            public final X5.d create(final X5.d d) {
                                                                return new l(null, d) {
                                                                    public int o;
                                                                    
                                                                    public final Object a(final X5.d d) {
                                                                        return ((e$a$c$a)this.create(d)).invokeSuspend(V5.t.a);
                                                                    }
                                                                };
                                                            }
                                                            
                                                            @Override
                                                            public final Object invokeSuspend(final Object o) {
                                                                b.c();
                                                                final int o2 = this.o;
                                                                if (o2 == 0) {
                                                                    o.b(o);
                                                                    this.o = 1;
                                                                    throw null;
                                                                }
                                                                if (o2 == 1) {
                                                                    o.b(o);
                                                                    return V5.t.a;
                                                                }
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                        });
                                                        this.s = u;
                                                        this.o = iterator;
                                                        this.p = null;
                                                        this.q = null;
                                                        this.r = 2;
                                                        throw null;
                                                    }
                                                    s = q;
                                                }
                                            }
                                            else {
                                                V5.o.b(s);
                                                s = this.s;
                                                final List list = this.t;
                                                u = this.u;
                                                iterator = list.iterator();
                                            }
                                            if (!iterator.hasNext()) {
                                                return s;
                                            }
                                            android.support.v4.media.a.a(iterator.next());
                                            this.s = u;
                                            this.o = iterator;
                                            this.p = null;
                                            this.q = s;
                                            this.r = 1;
                                            throw null;
                                        }
                                    };
                                    d3.o = o4;
                                    d3.s = 1;
                                    return c;
                                    list = (List)d3.o;
                                    V5.o.b(q);
                                    continue;
                                    Label_0204: {
                                        list = o4;
                                    }
                                    continue;
                                }
                            }
                            // iftrue(Label_0204:, i.a((p)p3, (d)d3) != c)
                        }
                    }
                }
                continue;
            }
            final Throwable t = (Throwable)o.o;
            if (t == null) {
                return V5.t.a;
            }
            throw t;
        }
    }
}
