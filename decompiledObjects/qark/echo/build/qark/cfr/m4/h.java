/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayOutputStream
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Map
 */
package m4;

import j4.d;
import j4.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import k4.b;
import m4.f;
import m4.g;

public class h {
    public final Map a;
    public final Map b;
    public final d c;

    public h(Map map, Map map2, d d8) {
        this.a = map;
        this.b = map2;
        this.c = d8;
    }

    public static a a() {
        return new a();
    }

    public void b(Object object, OutputStream outputStream) {
        new f(outputStream, this.a, this.b, this.c).t(object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public byte[] c(Object object) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            this.b(object, (OutputStream)byteArrayOutputStream);
        }
        catch (IOException iOException) {
            return byteArrayOutputStream.toByteArray();
        }
        do {
            return byteArrayOutputStream.toByteArray();
            break;
        } while (true);
    }

    public static final class a
    implements b {
        public static final d d = new g();
        public final Map a = new HashMap();
        public final Map b = new HashMap();
        public d c = d;

        public static /* synthetic */ void b(Object object, e e8) {
            a.e(object, e8);
        }

        private static /* synthetic */ void e(Object object, e e8) {
            e8 = new StringBuilder();
            e8.append("Couldn't find encoder for type ");
            e8.append(object.getClass().getCanonicalName());
            throw new j4.b(e8.toString());
        }

        public h c() {
            return new h((Map)new HashMap(this.a), (Map)new HashMap(this.b), this.c);
        }

        public a d(k4.a a8) {
            a8.a(this);
            return this;
        }

        public a f(Class class_, d d8) {
            this.a.put((Object)class_, (Object)d8);
            this.b.remove((Object)class_);
            return this;
        }
    }

}

