// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q1;

import android.view.InputEvent;
import org.jetbrains.annotations.NotNull;
import p6.K;
import V5.o;
import Y5.b;
import V5.t;
import p6.I;
import X5.d;
import Z5.k;
import g6.p;
import p6.J;
import p6.W;
import kotlin.jvm.internal.Intrinsics;
import r1.n;
import android.net.Uri;
import b3.e;
import android.content.Context;
import kotlin.jvm.internal.g;

public abstract class a
{
    public static final b a;
    
    static {
        a = new b(null);
    }
    
    public static final a a(final Context context) {
        return q1.a.a.a(context);
    }
    
    public abstract e b();
    
    public abstract e c(final Uri p0);
    
    public static final class a extends q1.a
    {
        public final n b;
        
        public a(final n b) {
            Intrinsics.checkNotNullParameter(b, "mMeasurementManager");
            this.b = b;
        }
        
        public static final /* synthetic */ n d(final a a) {
            return a.b;
        }
        
        @NotNull
        @Override
        public e b() {
            return p1.b.c(p6.g.b(J.a(W.a()), null, null, new p() {
                public int o;
                public final /* synthetic */ a p;
                
                @Override
                public final X5.d create(final Object o, final X5.d d) {
                    return new p() {
                        public int o;
                        public final /* synthetic */ a p = this.p;
                    };
                }
                
                public final Object invoke(final I i, final X5.d d) {
                    return ((a$a$b)this.create(i, d)).invokeSuspend(t.a);
                }
                
                @Override
                public final Object invokeSuspend(Object b) {
                    final Object c = b.c();
                    final int o = this.o;
                    if (o != 0) {
                        if (o == 1) {
                            V5.o.b(b);
                            return b;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        V5.o.b(b);
                        final n d = a.d(this.p);
                        this.o = 1;
                        b = d.b(this);
                        if (b == c) {
                            return c;
                        }
                        return b;
                    }
                }
            }, 3, null), null, 1, null);
        }
        
        @NotNull
        @Override
        public e c(@NotNull final Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "trigger");
            return p1.b.c(p6.g.b(J.a(W.a()), null, null, new p() {
                public int o;
                public final /* synthetic */ a p;
                public final /* synthetic */ Uri q;
                
                @Override
                public final X5.d create(final Object o, final X5.d d) {
                    return new p() {
                        public int o;
                        public final /* synthetic */ a p = this.p;
                        public final /* synthetic */ Uri q = this.q;
                    };
                }
                
                public final Object invoke(final I i, final X5.d d) {
                    return ((a$a$d)this.create(i, d)).invokeSuspend(t.a);
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
                        final n d = a.d(this.p);
                        final Uri q = this.q;
                        this.o = 1;
                        if (d.d(q, this) == c) {
                            return c;
                        }
                    }
                    return t.a;
                }
            }, 3, null), null, 1, null);
        }
        
        @NotNull
        public e e(@NotNull final r1.a a) {
            Intrinsics.checkNotNullParameter(a, "deletionRequest");
            return p1.b.c(p6.g.b(J.a(W.a()), null, null, new p(null) {
                public int o;
                public final /* synthetic */ a p;
                
                @Override
                public final X5.d create(final Object o, final X5.d d) {
                    return new p(d) {
                        public int o;
                        public final /* synthetic */ a p = this.p;
                    };
                }
                
                public final Object invoke(final I i, final X5.d d) {
                    return ((a$a$a)this.create(i, d)).invokeSuspend(t.a);
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
                        final n d = a.d(this.p);
                        this.o = 1;
                        if (d.a(null, this) == c) {
                            return c;
                        }
                    }
                    return t.a;
                }
            }, 3, null), null, 1, null);
        }
        
        @NotNull
        public e f(@NotNull final Uri uri, final InputEvent inputEvent) {
            Intrinsics.checkNotNullParameter(uri, "attributionSource");
            return p1.b.c(p6.g.b(J.a(W.a()), null, null, new p(null) {
                public int o;
                public final /* synthetic */ a p;
                public final /* synthetic */ Uri q;
                public final /* synthetic */ InputEvent r;
                
                @Override
                public final X5.d create(final Object o, final X5.d d) {
                    return new p(d) {
                        public int o;
                        public final /* synthetic */ a p = this.p;
                        public final /* synthetic */ Uri q = this.q;
                        public final /* synthetic */ InputEvent r = this.r;
                    };
                }
                
                public final Object invoke(final I i, final X5.d d) {
                    return ((a$a$c)this.create(i, d)).invokeSuspend(t.a);
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
                        final n d = a.d(this.p);
                        final Uri q = this.q;
                        final InputEvent r = this.r;
                        this.o = 1;
                        if (d.c(q, r, this) == c) {
                            return c;
                        }
                    }
                    return t.a;
                }
            }, 3, null), null, 1, null);
        }
        
        @NotNull
        public e g(@NotNull final r1.o o) {
            Intrinsics.checkNotNullParameter(o, "request");
            return p1.b.c(p6.g.b(J.a(W.a()), null, null, new p(null) {
                public int o;
                public final /* synthetic */ a p;
                
                @Override
                public final X5.d create(final Object o, final X5.d d) {
                    return new p(d) {
                        public int o;
                        public final /* synthetic */ a p = this.p;
                    };
                }
                
                public final Object invoke(final I i, final X5.d d) {
                    return ((a$a$e)this.create(i, d)).invokeSuspend(t.a);
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
                        final n d = a.d(this.p);
                        this.o = 1;
                        if (d.e(null, this) == c) {
                            return c;
                        }
                    }
                    return t.a;
                }
            }, 3, null), null, 1, null);
        }
        
        @NotNull
        public e h(@NotNull final r1.p p) {
            Intrinsics.checkNotNullParameter(p, "request");
            return p1.b.c(p6.g.b(J.a(W.a()), null, null, new p(null) {
                public int o;
                public final /* synthetic */ a p;
                
                @Override
                public final X5.d create(final Object o, final X5.d d) {
                    return new p(d) {
                        public int o;
                        public final /* synthetic */ a p = this.p;
                    };
                }
                
                public final Object invoke(final I i, final X5.d d) {
                    return ((a$a$f)this.create(i, d)).invokeSuspend(t.a);
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
                        final n d = a.d(this.p);
                        this.o = 1;
                        if (d.f(null, this) == c) {
                            return c;
                        }
                    }
                    return t.a;
                }
            }, 3, null), null, 1, null);
        }
    }
    
    public static final class b
    {
        public final a a(final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            final n a = n.a.a(context);
            if (a != null) {
                return new a(a);
            }
            return null;
        }
    }
}
