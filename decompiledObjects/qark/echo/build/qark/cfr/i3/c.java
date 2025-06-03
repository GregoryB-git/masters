/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.GeneralSecurityException
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.List
 *  java.util.logging.Logger
 */
package i3;

import c3.e;
import c3.v;
import c3.w;
import c3.x;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import k3.g;
import n3.b;
import q3.f;

public class c
implements w {
    public static final Logger a = Logger.getLogger((String)c.class.getName());
    public static final c b = new c();

    public static void e() {
        x.n(b);
    }

    @Override
    public Class a() {
        return e.class;
    }

    @Override
    public Class c() {
        return e.class;
    }

    public e f(v v8) {
        return new a(v8);
    }

    public static class a
    implements e {
        public final v a;
        public final b.a b;
        public final b.a c;

        /*
         * Enabled aggressive block sorting
         */
        public a(v object) {
            this.a = object;
            if (object.i()) {
                b b8 = g.b().a();
                object = k3.f.a((v)object);
                this.b = b8.a((n3.c)object, "daead", "encrypt");
                object = b8.a((n3.c)object, "daead", "decrypt");
            } else {
                this.b = object = k3.f.a;
            }
            this.c = object;
        }

        @Override
        public byte[] a(byte[] arrby, byte[] arrby2) {
            try {
                arrby2 = f.a(this.a.e().b(), ((e)this.a.e().g()).a(arrby, arrby2));
                this.b.b(this.a.e().d(), arrby.length);
                return arrby2;
            }
            catch (GeneralSecurityException generalSecurityException) {
                this.b.a();
                throw generalSecurityException;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public byte[] b(byte[] arrby, byte[] arrby2) {
            Object object;
            byte[] arrby3;
            if (arrby.length > 5) {
                object = Arrays.copyOf((byte[])arrby, (int)5);
                arrby3 = Arrays.copyOfRange((byte[])arrby, (int)5, (int)arrby.length);
                for (v.c c8 : this.a.f((byte[])object)) {
                    byte[] arrby4;
                    try {
                        arrby4 = ((e)c8.g()).b(arrby3, arrby2);
                        this.c.b(c8.d(), arrby3.length);
                        return arrby4;
                    }
                    catch (GeneralSecurityException generalSecurityException) {
                        arrby4 = a;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("ciphertext prefix matches a key, but cannot decrypt: ");
                        stringBuilder.append((Object)generalSecurityException);
                        arrby4.info(stringBuilder.toString());
                    }
                }
            }
            arrby3 = this.a.h().iterator();
            do {
                if (!arrby3.hasNext()) {
                    this.c.a();
                    throw new GeneralSecurityException("decryption failed");
                }
                object = (v.c)arrby3.next();
                try {
                    byte[] arrby5 = ((e)object.g()).b(arrby, arrby2);
                    this.c.b(object.d(), arrby.length);
                    return arrby5;
                }
                catch (GeneralSecurityException generalSecurityException) {
                    continue;
                }
                break;
            } while (true);
        }
    }

}

