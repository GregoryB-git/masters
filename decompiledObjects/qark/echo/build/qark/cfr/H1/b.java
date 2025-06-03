/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package H1;

import H1.f;
import H1.i;
import H1.j;
import V5.q;
import W5.C;
import W5.I;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public final class b {
    public static final a m = new a(null);
    public static final Map n = C.e(q.a("embedding.weight", "embed.weight"), q.a("dense1.weight", "fc1.weight"), q.a("dense2.weight", "fc2.weight"), q.a("dense3.weight", "fc3.weight"), q.a("dense1.bias", "fc1.bias"), q.a("dense2.bias", "fc2.bias"), q.a("dense3.bias", "fc3.bias"));
    public final H1.a a;
    public final H1.a b;
    public final H1.a c;
    public final H1.a d;
    public final H1.a e;
    public final H1.a f;
    public final H1.a g;
    public final H1.a h;
    public final H1.a i;
    public final H1.a j;
    public final H1.a k;
    public final Map l;

    public b(Map map) {
        Object object = map.get((Object)"embed.weight");
        if (object != null) {
            this.a = (H1.a)object;
            object = i.a;
            object = map.get((Object)"convs.0.weight");
            if (object != null) {
                this.b = i.l((H1.a)object);
                object = map.get((Object)"convs.1.weight");
                if (object != null) {
                    this.c = i.l((H1.a)object);
                    object = map.get((Object)"convs.2.weight");
                    if (object != null) {
                        this.d = i.l((H1.a)object);
                        object = map.get((Object)"convs.0.bias");
                        if (object != null) {
                            this.e = (H1.a)object;
                            object = map.get((Object)"convs.1.bias");
                            if (object != null) {
                                this.f = (H1.a)object;
                                object = map.get((Object)"convs.2.bias");
                                if (object != null) {
                                    this.g = (H1.a)object;
                                    object = map.get((Object)"fc1.weight");
                                    if (object != null) {
                                        this.h = i.k((H1.a)object);
                                        object = map.get((Object)"fc2.weight");
                                        if (object != null) {
                                            this.i = i.k((H1.a)object);
                                            object = map.get((Object)"fc1.bias");
                                            if (object != null) {
                                                this.j = (H1.a)object;
                                                object = map.get((Object)"fc2.bias");
                                                if (object != null) {
                                                    this.k = (H1.a)object;
                                                    this.l = new HashMap();
                                                    object = I.f(f.a.o.e(), f.a.p.e()).iterator();
                                                    while (object.hasNext()) {
                                                        String string2 = (String)object.next();
                                                        String string3 = Intrinsics.i(string2, ".weight");
                                                        string2 = Intrinsics.i(string2, ".bias");
                                                        H1.a a8 = (H1.a)map.get((Object)string3);
                                                        H1.a a9 = (H1.a)map.get((Object)string2);
                                                        if (a8 != null) {
                                                            a8 = i.k(a8);
                                                            this.l.put((Object)string3, (Object)a8);
                                                        }
                                                        if (a9 == null) continue;
                                                        this.l.put((Object)string2, (Object)a9);
                                                    }
                                                    return;
                                                }
                                                throw new IllegalStateException("Required value was null.".toString());
                                            }
                                            throw new IllegalStateException("Required value was null.".toString());
                                        }
                                        throw new IllegalStateException("Required value was null.".toString());
                                    }
                                    throw new IllegalStateException("Required value was null.".toString());
                                }
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public /* synthetic */ b(Map map, g g8) {
        this(map);
    }

    public static final /* synthetic */ Map a() {
        if (T1.a.d(b.class)) {
            return null;
        }
        try {
            Map map = n;
            return map;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, b.class);
            return null;
        }
    }

    public final H1.a b(H1.a a8, String[] object, String object2) {
        Throwable throwable2;
        block6 : {
            block4 : {
                block5 : {
                    if (T1.a.d(this)) {
                        return null;
                    }
                    try {
                        Intrinsics.checkNotNullParameter(a8, "dense");
                        Intrinsics.checkNotNullParameter(object, "texts");
                        Intrinsics.checkNotNullParameter(object2, "task");
                        Object object3 = i.a;
                        object3 = i.c(i.e((String[])object, 128, this.a), this.b);
                        i.a((H1.a)object3, this.e);
                        i.i((H1.a)object3);
                        object = i.c((H1.a)object3, this.c);
                        i.a((H1.a)object, this.f);
                        i.i((H1.a)object);
                        H1.a a9 = i.g((H1.a)object, 2);
                        object = i.c(a9, this.d);
                        i.a((H1.a)object, this.g);
                        i.i((H1.a)object);
                        object3 = i.g((H1.a)object3, object3.b(1));
                        a9 = i.g(a9, a9.b(1));
                        object = i.g((H1.a)object, object.b(1));
                        i.f((H1.a)object3, 1);
                        i.f(a9, 1);
                        i.f((H1.a)object, 1);
                        a8 = i.d(i.b(new H1.a[]{object3, a9, object, a8}), this.h, this.j);
                        i.i(a8);
                        a8 = i.d(a8, this.i, this.k);
                        i.i(a8);
                        object = (H1.a)this.l.get((Object)Intrinsics.i((String)object2, ".weight"));
                        object2 = (H1.a)this.l.get((Object)Intrinsics.i((String)object2, ".bias"));
                        if (object == null) break block4;
                        if (object2 != null) break block5;
                        return null;
                    }
                    catch (Throwable throwable2) {}
                }
                a8 = i.d(a8, (H1.a)object, (H1.a)object2);
                i.j(a8);
                return a8;
                break block6;
            }
            return null;
        }
        T1.a.b(throwable2, this);
        return null;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final b a(File object) {
            Intrinsics.checkNotNullParameter(object, "file");
            object = this.b((File)object);
            if (object == null) {
                return null;
            }
            try {
                object = new b((Map)object, null);
                return object;
            }
            catch (Exception exception) {
                return null;
            }
        }

        public final Map b(File object) {
            if ((object = j.c((File)object)) != null) {
                HashMap hashMap = new HashMap();
                Map map = b.a();
                for (Map.Entry entry : object.entrySet()) {
                    object = (String)entry.getKey();
                    if (map.containsKey(entry.getKey())) {
                        String string2 = (String)map.get(entry.getKey());
                        object = string2;
                        if (string2 == null) {
                            return null;
                        }
                    }
                    hashMap.put(object, entry.getValue());
                }
                return hashMap;
            }
            return null;
        }
    }

}

