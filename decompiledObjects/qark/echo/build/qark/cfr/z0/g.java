/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  java.util.Objects
 */
package z0;

import c1.h;
import c1.l;
import c1.t;
import d0.q;
import d1.a;
import d1.c;
import java.util.List;
import java.util.Objects;
import z0.b;

public interface g {
    public static final g a = new g(){
        public final h b = new h();

        @Override
        public boolean a(q q8) {
            String string2 = q8.n;
            if (!(this.b.a(q8) || Objects.equals((Object)string2, (Object)"application/cea-608") || Objects.equals((Object)string2, (Object)"application/x-mp4-cea-608") || Objects.equals((Object)string2, (Object)"application/cea-708"))) {
                return false;
            }
            return true;
        }

        @Override
        public l b(q object) {
            String string2 = object.n;
            if (string2 != null) {
                int n8 = string2.hashCode();
                int n9 = -1;
                switch (n8) {
                    default: {
                        break;
                    }
                    case 1566016562: {
                        if (!string2.equals((Object)"application/cea-708")) break;
                        n9 = 2;
                        break;
                    }
                    case 1566015601: {
                        if (!string2.equals((Object)"application/cea-608")) break;
                        n9 = 1;
                        break;
                    }
                    case 930165504: {
                        if (!string2.equals((Object)"application/x-mp4-cea-608")) break;
                        n9 = 0;
                    }
                }
                switch (n9) {
                    default: {
                        break;
                    }
                    case 2: {
                        return new c(object.G, object.q);
                    }
                    case 0: 
                    case 1: {
                        return new a(string2, object.G, 16000L);
                    }
                }
            }
            if (this.b.a((q)object)) {
                object = this.b.b((q)object);
                string2 = new StringBuilder();
                string2.append(object.getClass().getSimpleName());
                string2.append("Decoder");
                return new b(string2.toString(), (t)object);
            }
            object = new StringBuilder();
            object.append("Attempted to create decoder for unsupported MIME type: ");
            object.append(string2);
            throw new IllegalArgumentException(object.toString());
        }
    };

    public boolean a(q var1);

    public l b(q var1);

}

