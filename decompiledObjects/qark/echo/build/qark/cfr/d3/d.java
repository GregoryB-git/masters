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
package d3;

import c3.a;
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
import n3.c;
import q3.f;

public class d
implements w {
    public static final Logger a = Logger.getLogger((String)d.class.getName());
    public static final d b = new d();

    public static void e() {
        x.n(b);
    }

    @Override
    public Class a() {
        return a.class;
    }

    @Override
    public Class c() {
        return a.class;
    }

    public a f(v v8) {
        return new b(v8, null);
    }

    public static class b
    implements a {
        public final v a;
        public final b.a b;
        public final b.a c;

        /*
         * Enabled aggressive block sorting
         */
        public b(v object) {
            this.a = object;
            if (object.i()) {
                n3.b b8 = g.b().a();
                object = k3.f.a((v)object);
                this.b = b8.a((c)object, "aead", "encrypt");
                object = b8.a((c)object, "aead", "decrypt");
            } else {
                this.b = object = k3.f.a;
            }
            this.c = object;
        }

        public /* synthetic */ b(v v8,  a8) {
            this(v8);
        }

        @Override
        public byte[] a(byte[] arrby, byte[] arrby2) {
            try {
                arrby2 = f.a(this.a.e().b(), ((a)this.a.e().g()).a(arrby, arrby2));
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
                        arrby4 = ((a)c8.g()).b(arrby3, arrby2);
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
                    byte[] arrby5 = ((a)object.g()).b(arrby, arrby2);
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

