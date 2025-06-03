/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.security.GeneralSecurityException
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.ConcurrentMap
 *  java.util.logging.Logger
 */
package c3;

import c3.h;
import c3.i;
import h3.b;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
import k3.d;

public final class j {
    public static final Logger b = Logger.getLogger((String)j.class.getName());
    public final ConcurrentMap a;

    public j() {
        this.a = new ConcurrentHashMap();
    }

    public j(j j8) {
        this.a = new ConcurrentHashMap((Map)j8.a);
    }

    public static Object a(Object object) {
        object.getClass();
        return object;
    }

    public static b b(d d8) {
        return new b(){

            @Override
            public h a(Class object) {
                try {
                    object = new i(d.this, (Class)object);
                    return object;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw new GeneralSecurityException("Primitive type not supported", (Throwable)illegalArgumentException);
                }
            }

            @Override
            public h b() {
                d d8 = d.this;
                return new i(d8, d8.b());
            }

            @Override
            public Class c() {
                return d.this.getClass();
            }

            @Override
            public Set d() {
                return d.this.i();
            }
        };
    }

    public static String i(Set set) {
        StringBuilder stringBuilder = new StringBuilder();
        set = set.iterator();
        boolean bl = true;
        while (set.hasNext()) {
            Class class_ = (Class)set.next();
            if (!bl) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(class_.getCanonicalName());
            bl = false;
        }
        return stringBuilder.toString();
    }

    public h c(String string2, Class class_) {
        return this.e(string2, (Class)j.a((Object)class_));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final b d(String object) {
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                try {
                    if (this.a.containsKey(object)) {
                        return (b)this.a.get(object);
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("No key manager found for key type ");
                stringBuilder.append((String)object);
                throw new GeneralSecurityException(stringBuilder.toString());
            }
            throw throwable2;
        }
    }

    public final h e(String object, Class class_) {
        object = this.d((String)object);
        if (class_ == null) {
            return object.b();
        }
        if (object.d().contains((Object)class_)) {
            return object.a(class_);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Primitive type ");
        stringBuilder.append(class_.getName());
        stringBuilder.append(" not supported by key manager of type ");
        stringBuilder.append((Object)object.c());
        stringBuilder.append(", supported primitives: ");
        stringBuilder.append(j.i(object.d()));
        throw new GeneralSecurityException(stringBuilder.toString());
    }

    public h f(String string2) {
        return this.d(string2).b();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void g(d d8) {
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                try {
                    if (d8.a().c()) {
                        this.h(j.b(d8), false);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("failed to register key manager ");
                stringBuilder.append((Object)d8.getClass());
                stringBuilder.append(" as it is not FIPS compatible.");
                throw new GeneralSecurityException(stringBuilder.toString());
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(b b8, boolean bl) {
        synchronized (this) {
            try {
                String string2 = b8.b().d();
                b b9 = (b)this.a.get((Object)string2);
                if (b9 != null && !b9.c().equals((Object)b8.c())) {
                    Logger logger = b;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Attempted overwrite of a registered key manager for key type ");
                    stringBuilder.append(string2);
                    logger.warning(stringBuilder.toString());
                    throw new GeneralSecurityException(String.format((String)"typeUrl (%s) is already registered with %s, cannot be re-registered with %s", (Object[])new Object[]{string2, b9.c().getName(), b8.c().getName()}));
                }
                if (!bl) {
                    this.a.putIfAbsent((Object)string2, (Object)b8);
                } else {
                    this.a.put((Object)string2, (Object)b8);
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public boolean j(String string2) {
        return this.a.containsKey((Object)string2);
    }

    public static interface b {
        public h a(Class var1);

        public h b();

        public Class c();

        public Set d();
    }

}

