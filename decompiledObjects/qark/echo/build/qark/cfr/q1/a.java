/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.view.InputEvent
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package q1;

import V5.o;
import V5.t;
import X5.d;
import Z5.k;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import b3.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p6.I;
import p6.J;
import p6.W;
import p6.g;
import r1.n;
import r1.p;

public abstract class a {
    public static final b a = new b(null);

    public static final a a(Context context) {
        return a.a(context);
    }

    public abstract e b();

    public abstract e c(Uri var1);

    public static final class a
    extends a {
        public final n b;

        public a(n n8) {
            Intrinsics.checkNotNullParameter(n8, "mMeasurementManager");
            this.b = n8;
        }

        @NotNull
        @Override
        public e b() {
            return p1.b.c(g.b(J.a(W.a()), null, null, new g6.p(this, null){
                public int o;
                public final /* synthetic */ a p;
                {
                    this.p = a8;
                    super(2, d8);
                }

                @Override
                public final d create(Object object, d d8) {
                    return new ;
                }

                public final Object invoke(I i8, d d8) {
                    return (this.create(i8, d8)).invokeSuspend(t.a);
                }

                @Override
                public final Object invokeSuspend(Object object) {
                    Object object2 = Y5.b.c();
                    int n8 = this.o;
                    if (n8 != 0) {
                        if (n8 == 1) {
                            o.b(object);
                            return object;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(object);
                    object = this.p.b;
                    this.o = 1;
                    object = object.b(this);
                    if (object == object2) {
                        return object2;
                    }
                    return object;
                }
            }, 3, null), null, 1, null);
        }

        @NotNull
        @Override
        public e c(@NotNull Uri uri) {
            Intrinsics.checkNotNullParameter((Object)uri, "trigger");
            return p1.b.c(g.b(J.a(W.a()), null, null, new g6.p(this, uri, null){
                public int o;
                public final /* synthetic */ a p;
                public final /* synthetic */ Uri q;
                {
                    this.p = a8;
                    this.q = uri;
                    super(2, d8);
                }

                @Override
                public final d create(Object object, d d8) {
                    return new ;
                }

                public final Object invoke(I i8, d d8) {
                    return (this.create(i8, d8)).invokeSuspend(t.a);
                }

                /*
                 * Enabled force condition propagation
                 * Lifted jumps to return sites
                 */
                @Override
                public final Object invokeSuspend(Object object) {
                    Object object2 = Y5.b.c();
                    int n8 = this.o;
                    if (n8 != 0) {
                        if (n8 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        o.b(object);
                        return t.a;
                    } else {
                        o.b(object);
                        object = this.p.b;
                        Uri uri = this.q;
                        this.o = 1;
                        if (object.d(uri, this) != object2) return t.a;
                        return object2;
                    }
                }
            }, 3, null), null, 1, null);
        }

        @NotNull
        public e e(@NotNull r1.a a8) {
            Intrinsics.checkNotNullParameter(a8, "deletionRequest");
            return p1.b.c(g.b(J.a(W.a()), null, null, new g6.p(this, a8, null){
                public int o;
                public final /* synthetic */ a p;
                {
                    this.p = a8;
                    super(2, d8);
                }

                @Override
                public final d create(Object object, d d8) {
                    return new ;
                }

                public final Object invoke(I i8, d d8) {
                    return (this.create(i8, d8)).invokeSuspend(t.a);
                }

                /*
                 * Enabled force condition propagation
                 * Lifted jumps to return sites
                 */
                @Override
                public final Object invokeSuspend(Object object) {
                    Object object2 = Y5.b.c();
                    int n8 = this.o;
                    if (n8 != 0) {
                        if (n8 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        o.b(object);
                        return t.a;
                    } else {
                        o.b(object);
                        object = this.p.b;
                        this.o = 1;
                        if (object.a(null, this) != object2) return t.a;
                        return object2;
                    }
                }
            }, 3, null), null, 1, null);
        }

        @NotNull
        public e f(@NotNull Uri uri, InputEvent inputEvent) {
            Intrinsics.checkNotNullParameter((Object)uri, "attributionSource");
            return p1.b.c(g.b(J.a(W.a()), null, null, new g6.p(this, uri, inputEvent, null){
                public int o;
                public final /* synthetic */ a p;
                public final /* synthetic */ Uri q;
                public final /* synthetic */ InputEvent r;
                {
                    this.p = a8;
                    this.q = uri;
                    this.r = inputEvent;
                    super(2, d8);
                }

                @Override
                public final d create(Object object, d d8) {
                    return new ;
                }

                public final Object invoke(I i8, d d8) {
                    return (this.create(i8, d8)).invokeSuspend(t.a);
                }

                /*
                 * Enabled force condition propagation
                 * Lifted jumps to return sites
                 */
                @Override
                public final Object invokeSuspend(Object object) {
                    Object object2 = Y5.b.c();
                    int n8 = this.o;
                    if (n8 != 0) {
                        if (n8 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        o.b(object);
                        return t.a;
                    } else {
                        o.b(object);
                        object = this.p.b;
                        Uri uri = this.q;
                        InputEvent inputEvent = this.r;
                        this.o = 1;
                        if (object.c(uri, inputEvent, this) != object2) return t.a;
                        return object2;
                    }
                }
            }, 3, null), null, 1, null);
        }

        @NotNull
        public e g(@NotNull r1.o o8) {
            Intrinsics.checkNotNullParameter(o8, "request");
            return p1.b.c(g.b(J.a(W.a()), null, null, new g6.p(this, o8, null){
                public int o;
                public final /* synthetic */ a p;
                {
                    this.p = a8;
                    super(2, d8);
                }

                @Override
                public final d create(Object object, d d8) {
                    return new ;
                }

                public final Object invoke(I i8, d d8) {
                    return (this.create(i8, d8)).invokeSuspend(t.a);
                }

                /*
                 * Enabled force condition propagation
                 * Lifted jumps to return sites
                 */
                @Override
                public final Object invokeSuspend(Object object) {
                    Object object2 = Y5.b.c();
                    int n8 = this.o;
                    if (n8 != 0) {
                        if (n8 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        o.b(object);
                        return t.a;
                    } else {
                        o.b(object);
                        object = this.p.b;
                        this.o = 1;
                        if (object.e(null, this) != object2) return t.a;
                        return object2;
                    }
                }
            }, 3, null), null, 1, null);
        }

        @NotNull
        public e h(@NotNull p p8) {
            Intrinsics.checkNotNullParameter(p8, "request");
            return p1.b.c(g.b(J.a(W.a()), null, null, new g6.p(this, p8, null){
                public int o;
                public final /* synthetic */ a p;
                {
                    this.p = a8;
                    super(2, d8);
                }

                @Override
                public final d create(Object object, d d8) {
                    return new ;
                }

                public final Object invoke(I i8, d d8) {
                    return (this.create(i8, d8)).invokeSuspend(t.a);
                }

                /*
                 * Enabled force condition propagation
                 * Lifted jumps to return sites
                 */
                @Override
                public final Object invokeSuspend(Object object) {
                    Object object2 = Y5.b.c();
                    int n8 = this.o;
                    if (n8 != 0) {
                        if (n8 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        o.b(object);
                        return t.a;
                    } else {
                        o.b(object);
                        object = this.p.b;
                        this.o = 1;
                        if (object.f(null, this) != object2) return t.a;
                        return object2;
                    }
                }
            }, 3, null), null, 1, null);
        }

    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g g8) {
            this();
        }

        public final a a(Context object) {
            Intrinsics.checkNotNullParameter(object, "context");
            object = n.a.a((Context)object);
            if (object != null) {
                return new a((n)object);
            }
            return null;
        }
    }

}

