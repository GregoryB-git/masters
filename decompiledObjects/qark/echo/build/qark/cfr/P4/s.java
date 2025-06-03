/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package P4;

import com.google.firebase.remoteconfig.internal.c;

public class s {
    public final long a;
    public final long b;

    public s(b b8) {
        this.a = b8.a;
        this.b = b8.b;
    }

    public /* synthetic */ s(b b8,  a8) {
        this(b8);
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    public static class b {
        public long a = 60L;
        public long b = c.j;

        public s c() {
            return new s(this, null);
        }

        public b d(long l8) {
            if (l8 >= 0L) {
                this.a = l8;
                return this;
            }
            throw new IllegalArgumentException(String.format((String)"Fetch connection timeout has to be a non-negative number. %d is an invalid argument", (Object[])new Object[]{l8}));
        }

        public b e(long l8) {
            if (l8 >= 0L) {
                this.b = l8;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Minimum interval between fetches has to be a non-negative number. ");
            stringBuilder.append(l8);
            stringBuilder.append(" is an invalid argument");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

}

