/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.io.File
 *  java.io.FileDescriptor
 *  java.io.FileInputStream
 *  java.io.FileNotFoundException
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.IllegalStateException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.LinkedHashSet
 *  java.util.List
 *  java.util.Set
 *  java.util.concurrent.CancellationException
 */
package P;

import P.f;
import P.h;
import P.i;
import P.j;
import P.k;
import P.l;
import P.n;
import P.o;
import V5.n;
import V5.t;
import X5.d;
import X5.g;
import g6.p;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import p6.I;
import p6.w;

public final class m
implements f {
    public static final a k = new a(null);
    public static final Set l = new LinkedHashSet();
    public static final Object m = new Object();
    public final g6.a a;
    public final k b;
    public final P.b c;
    public final I d;
    public final s6.b e;
    public final String f;
    public final V5.h g;
    public final s6.j h;
    public List i;
    public final l j;

    public m(g6.a a8, k k8, List list, P.b b8, I i8) {
        Intrinsics.checkNotNullParameter(a8, "produceFile");
        Intrinsics.checkNotNullParameter(k8, "serializer");
        Intrinsics.checkNotNullParameter((Object)list, "initTasksList");
        Intrinsics.checkNotNullParameter(b8, "corruptionHandler");
        Intrinsics.checkNotNullParameter(i8, "scope");
        this.a = a8;
        this.b = k8;
        this.c = b8;
        this.d = i8;
        this.e = s6.d.e(new p(this, null){
            public int o;
            public /* synthetic */ Object p;
            public final /* synthetic */ m q;
            {
                this.q = m8;
                super(2, d8);
            }

            @Override
            public final d create(Object object, d d8) {
                d8 = new ;
                d8.p = object;
                return d8;
            }

            public final Object invoke(s6.c c8, d d8) {
                return (this.create(c8, d8)).invokeSuspend(t.a);
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
                    V5.o.b(object);
                    return t.a;
                } else {
                    V5.o.b(object);
                    object = (s6.c)this.p;
                    Object object3 = (n)this.q.h.getValue();
                    if (!(object3 instanceof P.c)) {
                        this.q.j.e(new b.a((n)object3));
                    }
                    object3 = new s6.b(s6.d.a(this.q.h, new p((n)object3, null){
                        public int o;
                        public /* synthetic */ Object p;
                        public final /* synthetic */ n q;
                        {
                            this.q = n8;
                            super(2, d8);
                        }

                        public final Object a(n n8, d d8) {
                            return (this.create(n8, d8)).invokeSuspend(t.a);
                        }

                        @Override
                        public final d create(Object object, d d8) {
                            d8 = new ;
                            d8.p = object;
                            return d8;
                        }

                        @Override
                        public final Object invokeSuspend(Object object) {
                            Y5.b.c();
                            if (this.o == 0) {
                                boolean bl;
                                V5.o.b(object);
                                object = (n)this.p;
                                n n8 = this.q;
                                boolean bl2 = n8 instanceof P.c;
                                boolean bl3 = bl = false;
                                if (!bl2) {
                                    if (n8 instanceof h) {
                                        bl3 = bl;
                                    } else {
                                        bl3 = bl;
                                        if (object == n8) {
                                            bl3 = true;
                                        }
                                    }
                                }
                                return Z5.b.a(bl3);
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    })){
                        public final /* synthetic */ s6.b o;
                        {
                            this.o = b8;
                        }

                        @Override
                        public Object a(s6.c object, d d8) {
                            if ((object = this.o.a(new s6.c((s6.c)object){
                                public final /* synthetic */ s6.c o;
                                {
                                    this.o = c8;
                                }

                                /*
                                 * Unable to fully structure code
                                 * Enabled aggressive block sorting
                                 * Lifted jumps to return sites
                                 */
                                @Override
                                public Object emit(Object var1_1, d var2_2) {
                                    if (!(var2_2 instanceof )) ** GOTO lbl-1000
                                    var4_3 = var2_2;
                                    var3_4 = var4_3.p;
                                    if ((var3_4 & Integer.MIN_VALUE) != 0) {
                                        var4_3.p = var3_4 + Integer.MIN_VALUE;
                                        var2_2 = var4_3;
                                    } else lbl-1000: // 2 sources:
                                    {
                                        var2_2 = new Z5.d((d)var2_2){
                                            public /* synthetic */ Object o;
                                            public int p;

                                            @Override
                                            public final Object invokeSuspend(Object object) {
                                                this.o = object;
                                                this.p |= Integer.MIN_VALUE;
                                                return this.emit(null, this);
                                            }
                                        };
                                    }
                                    var5_5 = var2_2.o;
                                    var4_3 = Y5.b.c();
                                    var3_4 = var2_2.p;
                                    if (var3_4 != 0) {
                                        if (var3_4 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        V5.o.b(var5_5);
                                        return t.a;
                                    }
                                    V5.o.b(var5_5);
                                    var5_5 = this.o;
                                    var1_1 = (n)var1_1;
                                    if (var1_1 instanceof j != false) throw ((j)var1_1).a();
                                    if (var1_1 instanceof h != false) throw ((h)var1_1).a();
                                    if (var1_1 instanceof P.c) {
                                        var1_1 = ((P.c)var1_1).b();
                                        var2_2.p = 1;
                                        if (var5_5.emit(var1_1, (d)var2_2) != var4_3) return t.a;
                                        return var4_3;
                                    }
                                    if (var1_1 instanceof o == false) throw new V5.l();
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542".toString());
                                }

                            }, d8)) == Y5.b.c()) {
                                return object;
                            }
                            return t.a;
                        }

                    };
                    this.o = 1;
                    if (s6.d.b((s6.c)object, (s6.b)object3, this) != object2) return t.a;
                    return object2;
                }
            }

        });
        this.f = ".tmp";
        this.g = V5.i.a(new g6.a(){

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public final File a() {
                File file = (File)this.a.invoke();
                String string2 = file.getAbsolutePath();
                a a8 = m.k;
                Object object = a8.b();
                synchronized (object) {
                    Throwable throwable2;
                    block4 : {
                        try {
                            if (a8.a().contains((Object)string2) ^ true) {
                                a8 = a8.a();
                                Intrinsics.checkNotNullExpressionValue(string2, "it");
                                a8.add((Object)string2);
                                return file;
                            }
                        }
                        catch (Throwable throwable2) {
                            break block4;
                        }
                        string2 = new StringBuilder();
                        string2.append("There are multiple DataStores active for the same file: ");
                        string2.append((Object)file);
                        string2.append(". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).");
                        throw new IllegalStateException(string2.toString().toString());
                    }
                    throw throwable2;
                }
            }
        });
        this.h = s6.m.a(o.a);
        this.i = W5.m.G((Iterable)list);
        this.j = new l(i8, new g6.l(){

            public final void a(Throwable object) {
                if (object != null) {
                    this.h.setValue(new h((Throwable)object));
                }
                Object object2 = m.k;
                object = object2.b();
                m m8 = this;
                synchronized (object) {
                    object2.a().remove((Object)m8.r().getAbsolutePath());
                    object2 = t.a;
                    return;
                }
            }
        }, .o, new p(this, null){
            public int o;
            public /* synthetic */ Object p;
            public final /* synthetic */ m q;
            {
                this.q = m8;
                super(2, d8);
            }

            public final Object a(b b8, d d8) {
                return (this.create(b8, d8)).invokeSuspend(t.a);
            }

            @Override
            public final d create(Object object, d d8) {
                d8 = new ;
                d8.p = object;
                return d8;
            }

            @Override
            public final Object invokeSuspend(Object object) {
                Object object2 = Y5.b.c();
                int n8 = this.o;
                if (n8 != 0) {
                    if (n8 != 1 && n8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V5.o.b(object);
                } else {
                    V5.o.b(object);
                    object = (b)this.p;
                    if (object instanceof b.a) {
                        m m8 = this.q;
                        object = (b.a)object;
                        this.o = 1;
                        if (m8.s((b.a)object, this) == object2) {
                            return object2;
                        }
                    } else if (object instanceof b.b) {
                        m m9 = this.q;
                        object = (b.b)object;
                        this.o = 2;
                        if (m9.t((b.b)object, this) == object2) {
                            return object2;
                        }
                    }
                }
                return t.a;
            }
        });
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final Object A(Object var1_1, d var2_5) {
        block19 : {
            block18 : {
                if (!(var2_5 instanceof )) ** GOTO lbl-1000
                var6_6 = var2_5;
                var3_10 = var6_6.v;
                if ((var3_10 & Integer.MIN_VALUE) != 0) {
                    var6_6.v = var3_10 + Integer.MIN_VALUE;
                } else lbl-1000: // 2 sources:
                {
                    var6_6 = new Z5.d((d)var2_5){
                        public Object o;
                        public Object p;
                        public Object q;
                        public Object r;
                        public Object s;
                        public /* synthetic */ Object t;
                        public int v;

                        @Override
                        public final Object invokeSuspend(Object object) {
                            this.t = object;
                            this.v |= Integer.MIN_VALUE;
                            return this.A(null, this);
                        }
                    };
                }
                var11_11 = var6_6.t;
                var7_12 = Y5.b.c();
                var3_10 = var6_6.v;
                if (var3_10 != 0) {
                    if (var3_10 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    var10_14 = (FileOutputStream)var6_6.s;
                    var8_15 = (Throwable)var6_6.r;
                    var9_16 = (Closeable)var6_6.q;
                    var1_1 = (File)var6_6.p;
                    var7_12 = (m)var6_6.o;
                    var5_17 = var9_16;
                    var2_5 = var1_1;
                    V5.o.b(var11_11);
                    var6_6 = var9_16;
                    var9_16 = var10_14;
                } else {
                    V5.o.b(var11_11);
                    this.q(this.r());
                    var5_17 = new File(Intrinsics.i(this.r().getAbsolutePath(), this.f));
                    var2_5 = new FileOutputStream((File)var5_17);
                    var8_15 = this.b;
                    var9_16 = new c((FileOutputStream)var2_5);
                    var6_6.o = this;
                    var6_6.p = var5_17;
                    var6_6.q = var2_5;
                    var6_6.r = null;
                    var6_6.s = var2_5;
                    var6_6.v = 1;
                    var1_1 = var8_15.c(var1_1, (OutputStream)var9_16, (d)var6_6);
                    if (var1_1 == var7_12) {
                        return var7_12;
                    }
                    var7_12 = this;
                    var1_1 = var5_17;
                    var9_16 = var2_5;
                    var8_15 = null;
                    var6_6 = var2_5;
                }
                var5_17 = var6_6;
                var2_5 = var1_1;
                try {
                    var9_16.getFD().sync();
                    var5_17 = var6_6;
                    var2_5 = var1_1;
                    var9_16 = t.a;
                    var2_5 = var1_1;
                }
                catch (Throwable var6_7) {
                    var1_1 = var2_5;
                    break block18;
                }
                e6.b.a((Closeable)var6_6, (Throwable)var8_15);
                var2_5 = var1_1;
                var4_18 = var1_1.renameTo(var7_12.r());
                if (var4_18) {
                    return t.a;
                }
                var2_5 = var1_1;
                var5_17 = new StringBuilder();
                var2_5 = var1_1;
                var5_17.append("Unable to rename ");
                var2_5 = var1_1;
                var5_17.append(var1_1);
                var2_5 = var1_1;
                var5_17.append(".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                var2_5 = var1_1;
                throw new IOException(var5_17.toString());
                {
                    catch (IOException var1_2) {}
                }
                catch (Throwable var6_8) {
                    var1_1 = var5_17;
                    var5_17 = var2_5;
                }
            }
            try {
                throw var6_9;
            }
            catch (Throwable var7_13) {
                var2_5 = var1_1;
                e6.b.a((Closeable)var5_17, (Throwable)var6_9);
                var2_5 = var1_1;
                throw var7_13;
            }
            break block19;
            catch (IOException var1_3) {
                var2_5 = var5_17;
            }
        }
        if (var2_5.exists() == false) throw var1_4;
        var2_5.delete();
        throw var1_4;
    }

    @Override
    public Object a(p object, d d8) {
        p6.u u8 = w.b(null, 1, null);
        object = new b.b((p)object, u8, (n)this.h.getValue(), d8.getContext());
        this.j.e(object);
        return u8.m(d8);
    }

    @Override
    public s6.b b() {
        return this.e;
    }

    public final void q(File file) {
        File file2 = file.getCanonicalFile().getParentFile();
        if (file2 == null) {
            return;
        }
        file2.mkdirs();
        if (file2.isDirectory()) {
            return;
        }
        throw new IOException(Intrinsics.i("Unable to create parent directories of ", (Object)file));
    }

    public final File r() {
        return (File)this.g.getValue();
    }

    public final Object s(b.a object, d d8) {
        block10 : {
            block8 : {
                n n8;
                block9 : {
                    n8 = (n)this.h.getValue();
                    if (n8 instanceof P.c) break block8;
                    if (!(n8 instanceof j)) break block9;
                    if (n8 == object.a()) {
                        object = this.w(d8);
                        if (object == Y5.b.c()) {
                            return object;
                        }
                        return t.a;
                    }
                    break block8;
                }
                if (Intrinsics.a(n8, o.a)) {
                    object = this.w(d8);
                    if (object == Y5.b.c()) {
                        return object;
                    }
                    return t.a;
                }
                if (n8 instanceof h) break block10;
            }
            return t.a;
        }
        throw new IllegalStateException("Can't read in final state.".toString());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final Object t(b.b var1_1, d var2_2) {
        block25 : {
            block24 : {
                block21 : {
                    block22 : {
                        block20 : {
                            block23 : {
                                block26 : {
                                    if (!(var2_2 instanceof )) ** GOTO lbl-1000
                                    var5_3 = var2_2;
                                    var3_4 = var5_3.t;
                                    if ((var3_4 & Integer.MIN_VALUE) != 0) {
                                        var5_3.t = var3_4 + Integer.MIN_VALUE;
                                    } else lbl-1000: // 2 sources:
                                    {
                                        var5_3 = new Z5.d((d)var2_2){
                                            public Object o;
                                            public Object p;
                                            public Object q;
                                            public /* synthetic */ Object r;
                                            public int t;

                                            @Override
                                            public final Object invokeSuspend(Object object) {
                                                this.r = object;
                                                this.t |= Integer.MIN_VALUE;
                                                return this.t(null, this);
                                            }
                                        };
                                    }
                                    var4_5 = var5_3.r;
                                    var8_9 = Y5.b.c();
                                    var3_4 = var5_3.t;
                                    if (var3_4 == 0) break block26;
                                    if (var3_4 == 1) ** GOTO lbl25
                                    if (var3_4 != 2) {
                                        if (var3_4 != 3) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        var2_2 = (p6.u)var5_3.o;
                                    } else {
                                        var2_2 = (p6.u)var5_3.q;
                                        var6_10 = (m)var5_3.p;
                                        var7_11 = (b.b)var5_3.o;
                                        var1_1 = var2_2;
                                        V5.o.b(var4_5);
                                        var1_1 = var2_2;
                                        break block20;
lbl25: // 1 sources:
                                        var2_2 = (p6.u)var5_3.o;
                                    }
                                    var1_1 = var2_2;
                                    try {
                                        V5.o.b(var4_5);
                                        break block21;
                                    }
                                    catch (Throwable var4_6) {}
                                }
                                V5.o.b(var4_5);
                                var2_2 = var4_5 = var1_1.a();
                                try {
                                    block28 : {
                                        block27 : {
                                            var6_10 = V5.n.o;
                                            var2_2 = var4_5;
                                            var6_10 = (n)this.h.getValue();
                                            var2_2 = var4_5;
                                            if (var6_10 instanceof P.c) {
                                                var2_2 = var4_5;
                                                var6_10 = var1_1.d();
                                                var2_2 = var4_5;
                                                var1_1 = var1_1.b();
                                                var2_2 = var4_5;
                                                var5_3.o = var4_5;
                                                var2_2 = var4_5;
                                                var5_3.t = 1;
                                                var2_2 = var4_5;
                                                var2_2 = var5_3 = this.z((p)var6_10, (g)var1_1, (d)var5_3);
                                                var1_1 = var4_5;
                                                if (var5_3 == var8_9) {
                                                    return var8_9;
                                                }
                                                break block22;
                                            }
                                            var2_2 = var4_5;
                                            if (var6_10 instanceof j) break block27;
                                            var2_2 = var4_5;
                                            if (!(var6_10 instanceof o)) break block28;
                                        }
                                        var2_2 = var4_5;
                                        if (var6_10 == var1_1.c()) {
                                            var2_2 = var4_5;
                                            var5_3.o = var1_1;
                                            var2_2 = var4_5;
                                            var5_3.p = this;
                                            var2_2 = var4_5;
                                            var5_3.q = var4_5;
                                            var2_2 = var4_5;
                                            var5_3.t = 2;
                                            var2_2 = var4_5;
                                            if (this.v((d)var5_3) == var8_9) {
                                                return var8_9;
                                            }
                                            break block23;
                                        }
                                        var2_2 = var4_5;
                                        throw ((j)var6_10).a();
                                    }
                                    var2_2 = var4_5;
                                    if (var6_10 instanceof h) {
                                        var2_2 = var4_5;
                                        throw ((h)var6_10).a();
                                    }
                                    var2_2 = var4_5;
                                    throw new V5.l();
                                }
                                catch (Throwable var4_8) {
                                    var1_1 = var2_2;
                                    break block24;
                                }
                            }
                            var6_10 = this;
                            var7_11 = var1_1;
                            var1_1 = var4_5;
                        }
                        var2_2 = var1_1;
                        var4_5 = var7_11.d();
                        var2_2 = var1_1;
                        var7_11 = var7_11.b();
                        var2_2 = var1_1;
                        var5_3.o = var1_1;
                        var2_2 = var1_1;
                        var5_3.p = null;
                        var2_2 = var1_1;
                        var5_3.q = null;
                        var2_2 = var1_1;
                        var5_3.t = 3;
                        var2_2 = var1_1;
                        var2_2 = var4_5 = var6_10.z((p)var4_5, (g)var7_11, (d)var5_3);
                        if (var4_5 == var8_9) {
                            return var8_9;
                        }
                    }
                    var4_5 = var2_2;
                    var2_2 = var1_1;
                }
                var1_1 = var2_2;
                var4_5 = V5.n.a(var4_5);
                var1_1 = var2_2;
                var2_2 = var4_5;
                break block25;
            }
            var2_2 = V5.n.o;
            var2_2 = V5.n.a(V5.o.a((Throwable)var4_7));
        }
        w.c((p6.u)var1_1, var2_2);
        return t.a;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final Object u(d var1_1) {
        block11 : {
            block15 : {
                block18 : {
                    block16 : {
                        block17 : {
                            block12 : {
                                block13 : {
                                    block14 : {
                                        if (!(var1_1 instanceof )) ** GOTO lbl-1000
                                        var6_2 = var1_1;
                                        var2_3 = var6_2.w;
                                        if ((var2_3 & Integer.MIN_VALUE) != 0) {
                                            var6_2.w = var2_3 + Integer.MIN_VALUE;
                                        } else lbl-1000: // 2 sources:
                                        {
                                            var6_2 = new Z5.d((d)var1_1){
                                                public Object o;
                                                public Object p;
                                                public Object q;
                                                public Object r;
                                                public Object s;
                                                public Object t;
                                                public /* synthetic */ Object u;
                                                public int w;

                                                @Override
                                                public final Object invokeSuspend(Object object) {
                                                    this.u = object;
                                                    this.w |= Integer.MIN_VALUE;
                                                    return this.u(this);
                                                }
                                            };
                                        }
                                        var8_4 = var6_2.u;
                                        var11_5 = Y5.b.c();
                                        var2_3 = var6_2.w;
                                        var3_6 = 0;
                                        if (var2_3 == 0) break block12;
                                        if (var2_3 == 1) break block13;
                                        if (var2_3 == 2) break block14;
                                        if (var2_3 != 3) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        var1_1 = (y6.a)var6_2.r;
                                        var7_7 = (s)var6_2.q;
                                        var4_15 = (u)var6_2.p;
                                        var5_17 = (m)var6_2.o;
                                        V5.o.b(var8_4);
                                        break block15;
                                    }
                                    var9_18 = (Iterator)var6_2.t;
                                    var10_19 = var6_2.s;
                                    var7_8 = (s)var6_2.r;
                                    var5_17 = (u)var6_2.q;
                                    var4_15 = (y6.a)var6_2.p;
                                    var1_1 = (m)var6_2.o;
                                    V5.o.b(var8_4);
                                    var8_4 = var10_19;
                                    break block16;
                                }
                                var7_9 = (u)var6_2.r;
                                var4_15 = (u)var6_2.q;
                                var1_1 = (y6.a)var6_2.p;
                                var5_17 = (m)var6_2.o;
                                V5.o.b(var8_4);
                                break block17;
                            }
                            V5.o.b(var8_4);
                            var2_3 = !Intrinsics.a(this.h.getValue(), o.a) && !(this.h.getValue() instanceof j) ? 0 : 1;
                            if (var2_3 == 0) throw new IllegalStateException("Check failed.".toString());
                            var1_1 = y6.c.b(false, 1, null);
                            var7_10 = new u();
                            var6_2.o = this;
                            var6_2.p = var1_1;
                            var6_2.q = var7_10;
                            var6_2.r = var7_10;
                            var6_2.w = 1;
                            var8_4 = this.y((d)var6_2);
                            if (var8_4 == var11_5) {
                                return var11_5;
                            }
                            var5_17 = this;
                            var4_15 = var7_10;
                        }
                        var7_11.o = var8_4;
                        var7_12 = new s();
                        var8_4 = new i((y6.a)var1_1, var7_12, (u)var4_15, (m)var5_17){
                            public final /* synthetic */ y6.a a;
                            public final /* synthetic */ s b;
                            public final /* synthetic */ u c;
                            public final /* synthetic */ m d;
                            {
                                this.a = a8;
                                this.b = s8;
                                this.c = u8;
                                this.d = m8;
                            }

                            /*
                             * Unable to fully structure code
                             * Enabled aggressive block sorting
                             * Enabled unnecessary exception pruning
                             * Enabled aggressive exception aggregation
                             * Lifted jumps to return sites
                             */
                            @Override
                            public Object a(p var1_1, d var2_2) {
                                block23 : {
                                    block21 : {
                                        block22 : {
                                            block20 : {
                                                block18 : {
                                                    block19 : {
                                                        if (!(var2_2 instanceof )) ** GOTO lbl-1000
                                                        var6_5 = var2_2;
                                                        var3_6 = var6_5.v;
                                                        if ((var3_6 & Integer.MIN_VALUE) != 0) {
                                                            var6_5.v = var3_6 + Integer.MIN_VALUE;
                                                        } else lbl-1000: // 2 sources:
                                                        {
                                                            var6_5 = new Z5.d((d)var2_2){
                                                                public Object o;
                                                                public Object p;
                                                                public Object q;
                                                                public Object r;
                                                                public Object s;
                                                                public /* synthetic */ Object t;
                                                                public int v;

                                                                @Override
                                                                public final Object invokeSuspend(Object object) {
                                                                    this.t = object;
                                                                    this.v |= Integer.MIN_VALUE;
                                                                    return this.a(null, this);
                                                                }
                                                            };
                                                        }
                                                        var5_7 = var6_5.t;
                                                        var9_8 = Y5.b.c();
                                                        var3_6 = var6_5.v;
                                                        if (var3_6 != 0) {
                                                            if (var3_6 != 1) {
                                                                if (var3_6 != 2) {
                                                                    if (var3_6 != 3) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                    var7_9 = var6_5.q;
                                                                    var4_11 = (u)var6_5.p;
                                                                    var1_1 = var2_2 = (y6.a)var6_5.o;
                                                                    V5.o.b(var5_7);
                                                                    var5_7 = var7_9;
                                                                    break block18;
                                                                }
                                                                var7_10 = (m)var6_5.q;
                                                                var2_2 = (u)var6_5.p;
                                                                var4_11 = var1_1 = (y6.a)var6_5.o;
                                                                V5.o.b(var5_7);
                                                                break block19;
                                                            }
                                                            var1_1 = (m)var6_5.s;
                                                            var4_11 = (u)var6_5.r;
                                                            var8_13 = (s)var6_5.q;
                                                            var2_2 = (y6.a)var6_5.p;
                                                            var7_10 = (p)var6_5.o;
                                                            V5.o.b(var5_7);
                                                            var5_7 = var7_10;
                                                        } else {
                                                            V5.o.b(var5_7);
                                                            var2_2 = this.a;
                                                            var4_11 = this.b;
                                                            var7_10 = this.c;
                                                            var8_13 = this.d;
                                                            var6_5.o = var1_1;
                                                            var6_5.p = var2_2;
                                                            var6_5.q = var4_11;
                                                            var6_5.r = var7_10;
                                                            var6_5.s = var8_13;
                                                            var6_5.v = 1;
                                                            if (var2_2.a(null, (d)var6_5) == var9_8) {
                                                                return var9_8;
                                                            }
                                                            var5_7 = var1_1;
                                                            var1_1 = var8_13;
                                                            var8_13 = var4_11;
                                                            var4_11 = var7_10;
                                                        }
                                                        if (var8_13.o) break block20;
                                                        var7_10 = var4_11.o;
                                                        var6_5.o = var2_2;
                                                        var6_5.p = var4_11;
                                                        var6_5.q = var1_1;
                                                        var6_5.r = null;
                                                        var6_5.s = null;
                                                        var6_5.v = 2;
                                                        if ((var5_7 = var5_7.invoke(var7_10, var6_5)) == var9_8) {
                                                            return var9_8;
                                                        }
                                                        var7_10 = var1_1;
                                                        var1_1 = var2_2;
                                                        var2_2 = var4_11;
                                                    }
                                                    var4_11 = var1_1;
                                                    try {
                                                        if (Intrinsics.a(var5_7, var2_2.o)) break block21;
                                                        var4_11 = var1_1;
                                                        var6_5.o = var1_1;
                                                        var4_11 = var1_1;
                                                        var6_5.p = var2_2;
                                                        var4_11 = var1_1;
                                                        var6_5.q = var5_7;
                                                        var4_11 = var1_1;
                                                        var6_5.v = 3;
                                                        var4_11 = var1_1;
                                                        if ((var6_5 = var7_10.A(var5_7, (d)var6_5)) == var9_8) {
                                                            return var9_8;
                                                        }
                                                    }
                                                    catch (Throwable var2_4) {
                                                        var1_1 = var4_11;
                                                        break block22;
                                                    }
                                                    var4_11 = var2_2;
                                                    var2_2 = var1_1;
                                                }
                                                var1_1 = var2_2;
                                                try {
                                                    var4_11.o = var5_7;
                                                    var1_1 = var4_11;
                                                    var4_11 = var2_2;
                                                    var2_2 = var1_1;
                                                    break block23;
                                                }
                                                catch (Throwable var2_3) {
                                                    break block22;
                                                }
                                            }
                                            try {
                                                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                                            }
                                            catch (Throwable var4_12) {
                                                var1_1 = var2_2;
                                                var2_2 = var4_12;
                                            }
                                        }
                                        var1_1.b(null);
                                        throw var2_2;
                                    }
                                    var4_11 = var1_1;
                                }
                                var1_1 = var4_11;
                                var2_2 = var2_2.o;
                                var4_11.b(null);
                                return var2_2;
                            }

                        };
                        var9_18 = var5_17.i;
                        if (var9_18 == null) break block18;
                        var9_18 = ((Iterable)var9_18).iterator();
                        var10_19 = var5_17;
                        var5_17 = var4_15;
                        var4_15 = var1_1;
                        var1_1 = var10_19;
                    }
                    while (var9_18.hasNext()) {
                        var10_19 = (p)var9_18.next();
                        var6_2.o = var1_1;
                        var6_2.p = var4_15;
                        var6_2.q = var5_17;
                        var6_2.r = var7_13;
                        var6_2.s = var8_4;
                        var6_2.t = var9_18;
                        var6_2.w = 2;
                        if (var10_19.invoke(var8_4, var6_2) != var11_5) continue;
                        return var11_5;
                    }
                    var8_4 = var1_1;
                    var1_1 = var4_15;
                    var4_15 = var5_17;
                    var5_17 = var8_4;
                }
                var5_17.i = null;
                var6_2.o = var5_17;
                var6_2.p = var4_15;
                var6_2.q = var7_13;
                var6_2.r = var1_1;
                var6_2.s = null;
                var6_2.t = null;
                var6_2.w = 3;
                if (var1_1.a(null, (d)var6_2) == var11_5) {
                    return var11_5;
                }
            }
            var7_14.o = true;
            var6_2 = t.a;
            var1_1 = var5_17.h;
            var4_15 = var4_15.o;
            var2_3 = var3_6;
            if (var4_15 == null) break block11;
            var2_3 = var4_15.hashCode();
        }
        var1_1.setValue(new P.c(var4_15, var2_3));
        return t.a;
        finally {
            var1_1.b(null);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final Object v(d var1_1) {
        if (!(var1_1 instanceof )) ** GOTO lbl-1000
        var3_2 = var1_1;
        var2_6 = var3_2.r;
        if ((var2_6 & Integer.MIN_VALUE) != 0) {
            var3_2.r = var2_6 + Integer.MIN_VALUE;
            var1_1 = var3_2;
        } else lbl-1000: // 2 sources:
        {
            var1_1 = new Z5.d((d)var1_1){
                public Object o;
                public /* synthetic */ Object p;
                public int r;

                @Override
                public final Object invokeSuspend(Object object) {
                    this.p = object;
                    this.r |= Integer.MIN_VALUE;
                    return this.v(this);
                }
            };
        }
        var3_2 = var1_1.p;
        var4_7 = Y5.b.c();
        var2_6 = var1_1.r;
        if (var2_6 != 0) {
            if (var2_6 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            var1_1 = (m)var1_1.o;
            try {
                V5.o.b(var3_2);
                return t.a;
            }
            catch (Throwable var3_3) {}
        } else {
            V5.o.b(var3_2);
            try {
                var1_1.o = this;
                var1_1.r = 1;
                var1_1 = this.u((d)var1_1);
                if (var1_1 != var4_7) return t.a;
                return var4_7;
            }
            catch (Throwable var3_4) {
                var1_1 = this;
            }
        }
        var1_1.h.setValue(new j((Throwable)var3_5));
        throw var3_5;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final Object w(d var1_1) {
        if (!(var1_1 instanceof )) ** GOTO lbl-1000
        var3_2 = var1_1;
        var2_6 = var3_2.r;
        if ((var2_6 & Integer.MIN_VALUE) != 0) {
            var3_2.r = var2_6 + Integer.MIN_VALUE;
            var1_1 = var3_2;
        } else lbl-1000: // 2 sources:
        {
            var1_1 = new Z5.d((d)var1_1){
                public Object o;
                public /* synthetic */ Object p;
                public int r;

                @Override
                public final Object invokeSuspend(Object object) {
                    this.p = object;
                    this.r |= Integer.MIN_VALUE;
                    return this.w(this);
                }
            };
        }
        var3_2 = var1_1.p;
        var4_7 = Y5.b.c();
        var2_6 = var1_1.r;
        if (var2_6 != 0) {
            if (var2_6 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            var1_1 = (m)var1_1.o;
            try {
                V5.o.b(var3_2);
                return t.a;
            }
            catch (Throwable var3_3) {}
        } else {
            V5.o.b(var3_2);
            try {
                var1_1.o = this;
                var1_1.r = 1;
                var1_1 = this.u((d)var1_1);
                if (var1_1 != var4_7) return t.a;
                return var4_7;
            }
            catch (Throwable var3_4) {
                var1_1 = this;
            }
        }
        var1_1.h.setValue(new j((Throwable)var3_5));
        return t.a;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final Object x(d var1_1) {
        block17 : {
            block16 : {
                block15 : {
                    if (!(var1_1 instanceof )) ** GOTO lbl-1000
                    var3_2 = var1_1;
                    var2_6 = var3_2.t;
                    if ((var2_6 & Integer.MIN_VALUE) != 0) {
                        var3_2.t = var2_6 + Integer.MIN_VALUE;
                    } else lbl-1000: // 2 sources:
                    {
                        var3_2 = new Z5.d((d)var1_1){
                            public Object o;
                            public Object p;
                            public Object q;
                            public /* synthetic */ Object r;
                            public int t;

                            @Override
                            public final Object invokeSuspend(Object object) {
                                this.r = object;
                                this.t |= Integer.MIN_VALUE;
                                return this.x(this);
                            }
                        };
                    }
                    var5_7 = var3_2.r;
                    var4_11 = Y5.b.c();
                    var2_6 = var3_2.t;
                    if (var2_6 != 0) {
                        if (var2_6 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        var6_12 = (Throwable)var3_2.q;
                        var4_11 = (Closeable)var3_2.p;
                        var1_1 = (m)var3_2.o;
                        try {
                            V5.o.b(var5_7);
                            var3_2 = var6_12;
                            break block15;
                        }
                        catch (Throwable var5_8) {
                            var3_2 = var1_1;
                            break block16;
                        }
                    }
                    V5.o.b(var5_7);
                    var1_1 = new FileInputStream(this.r());
                    var5_7 = this.b;
                    var3_2.o = this;
                    var3_2.p = var1_1;
                    var3_2.q = null;
                    var3_2.t = 1;
                    var5_7 = var5_7.b((InputStream)var1_1, (d)var3_2);
                    if (var5_7 == var4_11) {
                        return var4_11;
                    }
                    var6_13 = this;
                    var3_2 = null;
                    var4_11 = var1_1;
                    var1_1 = var6_13;
                }
                e6.b.a((Closeable)var4_11, (Throwable)var3_2);
                return var5_7;
                {
                    catch (FileNotFoundException var3_3) {}
                }
                catch (Throwable var5_9) {
                    var3_2 = this;
                    var4_11 = var1_1;
                }
            }
            try {
                throw var5_10;
            }
            catch (Throwable var6_14) {
                var1_1 = var3_2;
                e6.b.a((Closeable)var4_11, (Throwable)var5_10);
                var1_1 = var3_2;
                throw var6_14;
            }
            break block17;
            catch (FileNotFoundException var3_4) {
                var1_1 = this;
            }
        }
        if (var1_1.r().exists() != false) throw var3_5;
        return var1_1.b.a();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final Object y(d var1_1) {
        block14 : {
            block15 : {
                block16 : {
                    block11 : {
                        block12 : {
                            block13 : {
                                if (!(var1_1 instanceof )) ** GOTO lbl-1000
                                var4_2 = var1_1;
                                var2_3 = var4_2.s;
                                if ((var2_3 & Integer.MIN_VALUE) != 0) {
                                    var4_2.s = var2_3 + Integer.MIN_VALUE;
                                } else lbl-1000: // 2 sources:
                                {
                                    var4_2 = new Z5.d((d)var1_1){
                                        public Object o;
                                        public Object p;
                                        public /* synthetic */ Object q;
                                        public int s;

                                        @Override
                                        public final Object invokeSuspend(Object object) {
                                            this.q = object;
                                            this.s |= Integer.MIN_VALUE;
                                            return this.y(this);
                                        }
                                    };
                                }
                                var5_4 = var4_2.q;
                                var7_5 = Y5.b.c();
                                var2_3 = var4_2.s;
                                if (var2_3 == 0) break block11;
                                if (var2_3 == 1) break block12;
                                if (var2_3 == 2) break block13;
                                if (var2_3 != 3) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                var3_6 = var4_2.p;
                                var1_1 = (P.a)var4_2.o;
                                try {
                                    V5.o.b(var5_4);
                                    return var3_6;
                                }
                                catch (IOException var3_7) {}
                                break block14;
                            }
                            var1_1 = (P.a)var4_2.p;
                            var6_13 = (m)var4_2.o;
                            V5.o.b(var5_4);
                            break block15;
                        }
                        var1_1 = (m)var4_2.o;
                        try {
                            V5.o.b(var5_4);
                            return var5_4;
                        }
                        catch (P.a var3_8) {}
                        break block16;
                    }
                    V5.o.b(var5_4);
                    try {
                        var4_2.o = this;
                        var4_2.s = 1;
                        var1_1 = this.x(var4_2);
                        if (var1_1 != var7_5) return var1_1;
                        return var7_5;
                    }
                    catch (P.a var3_9) {
                        var1_1 = this;
                    }
                }
                var5_4 = var1_1.c;
                var4_2.o = var1_1;
                var4_2.p = var3_10;
                var4_2.s = 2;
                var5_4 = var5_4.a((P.a)var3_10, var4_2);
                if (var5_4 == var7_5) {
                    return var7_5;
                }
                var6_13 = var1_1;
                var1_1 = var3_10;
            }
            try {
                var4_2.o = var1_1;
                var4_2.p = var5_4;
                var4_2.s = 3;
                var3_10 = var6_13.A(var5_4, var4_2);
                if (var3_10 != var7_5) return var5_4;
                return var7_5;
            }
            catch (IOException var3_11) {
                // empty catch block
            }
        }
        V5.a.a((Throwable)var1_1, (Throwable)var3_12);
        throw var1_1;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final Object z(p var1_1, g var2_2, d var3_3) {
        block7 : {
            block8 : {
                block5 : {
                    block6 : {
                        if (!(var3_3 instanceof )) ** GOTO lbl-1000
                        var5_4 = var3_3;
                        var4_5 = var5_4.t;
                        if ((var4_5 & Integer.MIN_VALUE) != 0) {
                            var5_4.t = var4_5 + Integer.MIN_VALUE;
                            var3_3 = var5_4;
                        } else lbl-1000: // 2 sources:
                        {
                            var3_3 = new Z5.d((d)var3_3){
                                public Object o;
                                public Object p;
                                public Object q;
                                public /* synthetic */ Object r;
                                public int t;

                                @Override
                                public final Object invokeSuspend(Object object) {
                                    this.r = object;
                                    this.t |= Integer.MIN_VALUE;
                                    return this.z(null, null, this);
                                }
                            };
                        }
                        var5_4 = var3_3.r;
                        var8_6 = Y5.b.c();
                        var4_5 = var3_3.t;
                        if (var4_5 == 0) break block5;
                        if (var4_5 == 1) break block6;
                        if (var4_5 != 2) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        var2_2 = var3_3.p;
                        var1_1 = (m)var3_3.o;
                        V5.o.b(var5_4);
                        break block7;
                    }
                    var6_7 = var3_3.q;
                    var7_8 = (P.c)var3_3.p;
                    var1_1 = (m)var3_3.o;
                    V5.o.b(var5_4);
                    var2_2 = var5_4;
                    break block8;
                }
                V5.o.b(var5_4);
                var5_4 = (P.c)this.h.getValue();
                var5_4.a();
                var6_7 = var5_4.b();
                var1_1 = new p((p)var1_1, var6_7, null){
                    public int o;
                    public final /* synthetic */ p p;
                    public final /* synthetic */ Object q;
                    {
                        this.p = p8;
                        this.q = object;
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
                                V5.o.b(object);
                                return object;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        V5.o.b(object);
                        object = this.p;
                        Object object3 = this.q;
                        this.o = 1;
                        object = object.invoke(object3, this);
                        if (object == object2) {
                            return object2;
                        }
                        return object;
                    }
                };
                var3_3.o = this;
                var3_3.p = var5_4;
                var3_3.q = var6_7;
                var3_3.t = 1;
                var2_2 = p6.g.g((g)var2_2, (p)var1_1, (d)var3_3);
                if (var2_2 == var8_6) {
                    return var8_6;
                }
                var1_1 = var5_4;
                var5_4 = this;
                var7_8 = var1_1;
                var1_1 = var5_4;
            }
            var7_8.a();
            if (Intrinsics.a(var6_7, var2_2)) {
                return var6_7;
            }
            var3_3.o = var1_1;
            var3_3.p = var2_2;
            var3_3.q = null;
            var3_3.t = 2;
            if (var1_1.A(var2_2, (d)var3_3) == var8_6) {
                return var8_6;
            }
        }
        var1_1 = var1_1.h;
        var4_5 = var2_2 != null ? var2_2.hashCode() : 0;
        var1_1.setValue(new P.c(var2_2, var4_5));
        return var2_2;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g g8) {
            this();
        }

        public final Set a() {
            return l;
        }

        public final Object b() {
            return m;
        }
    }

    public static abstract class P.m$b {
        public P.m$b() {
        }

        public /* synthetic */ P.m$b(kotlin.jvm.internal.g g8) {
            this();
        }

        public static final class a
        extends P.m$b {
            public final n a;

            public a(n n8) {
                super(null);
                this.a = n8;
            }

            public n a() {
                return this.a;
            }
        }

        public static final class b
        extends P.m$b {
            public final p a;
            public final p6.u b;
            public final n c;
            public final g d;

            public b(p p8, p6.u u8, n n8, g g8) {
                Intrinsics.checkNotNullParameter(p8, "transform");
                Intrinsics.checkNotNullParameter(u8, "ack");
                Intrinsics.checkNotNullParameter(g8, "callerContext");
                super(null);
                this.a = p8;
                this.b = u8;
                this.c = n8;
                this.d = g8;
            }

            public final p6.u a() {
                return this.b;
            }

            public final g b() {
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

    public static final class c
    extends OutputStream {
        public final FileOutputStream o;

        public c(FileOutputStream fileOutputStream) {
            Intrinsics.checkNotNullParameter((Object)fileOutputStream, "fileOutputStream");
            this.o = fileOutputStream;
        }

        public void close() {
        }

        public void flush() {
            this.o.flush();
        }

        public void write(int n8) {
            this.o.write(n8);
        }

        public void write(byte[] arrby) {
            Intrinsics.checkNotNullParameter(arrby, "b");
            this.o.write(arrby);
        }

        public void write(byte[] arrby, int n8, int n9) {
            Intrinsics.checkNotNullParameter(arrby, "bytes");
            this.o.write(arrby, n8, n9);
        }
    }

}

