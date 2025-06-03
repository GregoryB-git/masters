/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package u0;

import P0.b;
import T0.h;
import V0.c;
import d0.q;

public interface a {
    public static final a a = new a(){

        @Override
        public boolean a(q object) {
            object = object.n;
            if (!("application/id3".equals(object) || "application/x-emsg".equals(object) || "application/x-scte35".equals(object) || "application/x-icy".equals(object) || "application/vnd.dvb.ait".equals(object))) {
                return false;
            }
            return true;
        }

        @Override
        public O0.a b(q object) {
            object = object.n;
            if (object != null) {
                int n8 = object.hashCode();
                int n9 = -1;
                switch (n8) {
                    default: {
                        break;
                    }
                    case 1652648887: {
                        if (!object.equals((Object)"application/x-scte35")) break;
                        n9 = 4;
                        break;
                    }
                    case 1154383568: {
                        if (!object.equals((Object)"application/x-emsg")) break;
                        n9 = 3;
                        break;
                    }
                    case -1248341703: {
                        if (!object.equals((Object)"application/id3")) break;
                        n9 = 2;
                        break;
                    }
                    case -1348231605: {
                        if (!object.equals((Object)"application/x-icy")) break;
                        n9 = 1;
                        break;
                    }
                    case -1354451219: {
                        if (!object.equals((Object)"application/vnd.dvb.ait")) break;
                        n9 = 0;
                    }
                }
                switch (n9) {
                    default: {
                        break;
                    }
                    case 4: {
                        return new c();
                    }
                    case 3: {
                        return new Q0.b();
                    }
                    case 2: {
                        return new h();
                    }
                    case 1: {
                        return new S0.a();
                    }
                    case 0: {
                        return new b();
                    }
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Attempted to create decoder for unsupported MIME type: ");
            stringBuilder.append((String)object);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    };

    public boolean a(q var1);

    public O0.a b(q var1);

}

