/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Boolean
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayDeque
 *  java.util.Iterator
 */
package e6;

import e6.f;
import g6.l;
import g6.p;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public final class e
implements n6.b {
    public final File a;
    public final f b;
    public final l c;
    public final l d;
    public final p e;
    public final int f;

    public e(File file, f f8) {
        Intrinsics.checkNotNullParameter((Object)file, "start");
        Intrinsics.checkNotNullParameter((Object)f8, "direction");
        this(file, f8, null, null, null, 0, 32, null);
    }

    public e(File file, f f8, l l8, l l9, p p8, int n8) {
        this.a = file;
        this.b = f8;
        this.c = l8;
        this.d = l9;
        this.e = p8;
        this.f = n8;
    }

    public /* synthetic */ e(File file, f f8, l l8, l l9, p p8, int n8, int n9, g g8) {
        if ((n9 & 2) != 0) {
            f8 = f.o;
        }
        if ((n9 & 32) != 0) {
            n8 = Integer.MAX_VALUE;
        }
        this(file, f8, l8, l9, p8, n8);
    }

    @Override
    public Iterator iterator() {
        return new b();
    }

    public static abstract class a
    extends c {
        public a(File file) {
            Intrinsics.checkNotNullParameter((Object)file, "rootDir");
            super(file);
        }
    }

    public final class e6.e$b
    extends W5.b {
        public final ArrayDeque q;

        public e6.e$b() {
            ArrayDeque arrayDeque;
            this.q = arrayDeque = new ArrayDeque();
            if (e.this.a.isDirectory()) {
                arrayDeque.push((Object)this.g(e.this.a));
                return;
            }
            if (e.this.a.isFile()) {
                arrayDeque.push((Object)new b(e.this.a));
                return;
            }
            this.d();
        }

        @Override
        public void b() {
            File file = this.h();
            if (file != null) {
                this.e((Object)file);
                return;
            }
            this.d();
        }

        public final e6.e$a g(File file) {
            f f8 = e.this.b;
            int n8 = d.a[f8.ordinal()];
            if (n8 != 1) {
                if (n8 == 2) {
                    return new a(file);
                }
                throw new V5.l();
            }
            return new c(file);
        }

        public final File h() {
            File file;
            do {
                e6.e$c c8;
                if ((c8 = (e6.e$c)this.q.peek()) == null) {
                    return null;
                }
                file = c8.b();
                if (file == null) {
                    this.q.pop();
                    continue;
                }
                if (Intrinsics.a((Object)file, (Object)c8.a()) || !file.isDirectory()) break;
                if (this.q.size() >= e.this.f) {
                    return file;
                }
                this.q.push((Object)this.g(file));
            } while (true);
            return file;
        }

        public final class a
        extends e6.e$a {
            public boolean b;
            public File[] c;
            public int d;
            public boolean e;

            public a(File file) {
                Intrinsics.checkNotNullParameter((Object)file, "rootDir");
                super(file);
            }

            @Override
            public File b() {
                Object object;
                if (!this.e && this.c == null) {
                    object = e.this.c;
                    if (object != null && !((Boolean)object.invoke((Object)this.a())).booleanValue()) {
                        return null;
                    }
                    object = this.a().listFiles();
                    this.c = object;
                    if (object == null) {
                        object = e.this.e;
                        if (object != null) {
                            object.invoke((Object)this.a(), (Object)new e6.a(this.a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.e = true;
                    }
                }
                if ((object = this.c) != null) {
                    int n8 = this.d;
                    Intrinsics.b(object);
                    if (n8 < object.length) {
                        object = this.c;
                        Intrinsics.b(object);
                        n8 = this.d;
                        this.d = n8 + 1;
                        return object[n8];
                    }
                }
                if (!this.b) {
                    this.b = true;
                    return this.a();
                }
                object = e.this.d;
                if (object != null) {
                    object.invoke((Object)this.a());
                }
                return null;
            }
        }

        public final class b
        extends e6.e$c {
            public boolean b;

            public b(File file) {
                Intrinsics.checkNotNullParameter((Object)file, "rootFile");
                super(file);
            }

            @Override
            public File b() {
                if (this.b) {
                    return null;
                }
                this.b = true;
                return this.a();
            }
        }

        public final class c
        extends e6.e$a {
            public boolean b;
            public File[] c;
            public int d;

            public c(File file) {
                Intrinsics.checkNotNullParameter((Object)file, "rootDir");
                super(file);
            }

            @Override
            public File b() {
                int n8;
                Object object;
                block10 : {
                    block11 : {
                        if (!this.b) {
                            l l8 = e.this.c;
                            if (l8 != null && !((Boolean)l8.invoke((Object)this.a())).booleanValue()) {
                                return null;
                            }
                            this.b = true;
                            return this.a();
                        }
                        object = this.c;
                        if (object != null) {
                            n8 = this.d;
                            Intrinsics.b(object);
                            if (n8 >= object.length) {
                                object = e.this.d;
                                if (object != null) {
                                    object.invoke((Object)this.a());
                                }
                                return null;
                            }
                        }
                        if (this.c != null) break block10;
                        object = this.a().listFiles();
                        this.c = object;
                        if (object == null && (object = e.this.e) != null) {
                            object.invoke((Object)this.a(), (Object)new e6.a(this.a(), null, "Cannot list files in a directory", 2, null));
                        }
                        if ((object = this.c) == null) break block11;
                        Intrinsics.b(object);
                        if (object.length != 0) break block10;
                    }
                    if ((object = e.this.d) != null) {
                        object.invoke((Object)this.a());
                    }
                    return null;
                }
                object = this.c;
                Intrinsics.b(object);
                n8 = this.d;
                this.d = n8 + 1;
                return object[n8];
            }
        }

        public abstract class d {
            public static final /* synthetic */ int[] a;

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            static {
                int[] arrn;
                arrn = new int[f.values().length];
                try {
                    arrn[f.o.ordinal()] = 1;
                }
                catch (NoSuchFieldError noSuchFieldError) {}
                try {
                    arrn[f.p.ordinal()] = 2;
                }
                catch (NoSuchFieldError noSuchFieldError) {}
                a = arrn;
            }
        }

    }

    public static abstract class c {
        public final File a;

        public c(File file) {
            Intrinsics.checkNotNullParameter((Object)file, "root");
            this.a = file;
        }

        public final File a() {
            return this.a;
        }

        public abstract File b();
    }

}

