/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.StringWriter
 *  java.io.Writer
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.text.DateFormat
 *  java.text.SimpleDateFormat
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.Locale
 *  java.util.Map
 *  java.util.TimeZone
 */
package l4;

import j4.f;
import j4.g;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import l4.a;
import l4.c;
import l4.e;

public final class d
implements k4.b {
    public static final j4.d e = new a();
    public static final f f = new l4.b();
    public static final f g = new c();
    public static final b h = new b(null);
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public j4.d c = e;
    public boolean d = false;

    public d() {
        this.p(String.class, f);
        this.p(Boolean.class, g);
        this.p(Date.class, h);
    }

    public static /* synthetic */ void b(Boolean bl, g g8) {
        g8.e(bl);
    }

    public static /* synthetic */ void c(Object object, j4.e e8) {
        d.l(object, e8);
    }

    public static /* synthetic */ void d(String string2, g g8) {
        g8.d(string2);
    }

    public static /* synthetic */ void l(Object object, j4.e e8) {
        e8 = new StringBuilder();
        e8.append("Couldn't find encoder for type ");
        e8.append(object.getClass().getCanonicalName());
        throw new j4.b(e8.toString());
    }

    public j4.a i() {
        return new j4.a(){

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public String a(Object object) {
                StringWriter stringWriter = new StringWriter();
                try {
                    this.b(object, (Writer)stringWriter);
                }
                catch (IOException iOException) {
                    return stringWriter.toString();
                }
                do {
                    return stringWriter.toString();
                    break;
                } while (true);
            }

            @Override
            public void b(Object object, Writer object2) {
                object2 = new e((Writer)object2, d.this.a, d.this.b, d.this.c, d.this.d);
                object2.k(object, false);
                object2.u();
            }
        };
    }

    public d j(k4.a a8) {
        a8.a(this);
        return this;
    }

    public d k(boolean bl) {
        this.d = bl;
        return this;
    }

    public d o(Class class_, j4.d d8) {
        this.a.put((Object)class_, (Object)d8);
        this.b.remove((Object)class_);
        return this;
    }

    public d p(Class class_, f f8) {
        this.b.put((Object)class_, (Object)f8);
        this.a.remove((Object)class_);
        return this;
    }

    public static final class b
    implements f {
        public static final DateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone((String)"UTC"));
        }

        public b() {
        }

        public /* synthetic */ b( a8) {
            this();
        }

        public void b(Date date, g g8) {
            g8.d(a.format(date));
        }
    }

}

