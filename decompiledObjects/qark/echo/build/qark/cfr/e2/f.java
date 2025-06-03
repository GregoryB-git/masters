/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package e2;

import e2.l;
import e2.o;
import java.util.Arrays;

public final class f
extends l {
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final o g;

    public f(long l8, Integer n8, long l9, byte[] arrby, String string2, long l10, o o8) {
        this.a = l8;
        this.b = n8;
        this.c = l9;
        this.d = arrby;
        this.e = string2;
        this.f = l10;
        this.g = o8;
    }

    public /* synthetic */ f(long l8, Integer n8, long l9, byte[] arrby, String string2, long l10, o o8,  a8) {
        this(l8, n8, l9, arrby, string2, l10, o8);
    }

    @Override
    public Integer b() {
        return this.b;
    }

    @Override
    public long c() {
        return this.a;
    }

    @Override
    public long d() {
        return this.c;
    }

    @Override
    public o e() {
        return this.g;
    }

    public boolean equals(Object arrby) {
        if (arrby == this) {
            return true;
        }
        if (arrby instanceof l) {
            Object object = (l)arrby;
            if (this.a == object.c() && ((arrby = this.b) == null ? object.b() == null : arrby.equals((Object)object.b())) && this.c == object.d()) {
                byte[] arrby2 = this.d;
                arrby = object instanceof f ? ((f)object).d : object.f();
                if (Arrays.equals((byte[])arrby2, (byte[])arrby) && ((arrby = this.e) == null ? object.g() == null : arrby.equals((Object)object.g())) && this.f == object.h()) {
                    arrby = this.g;
                    object = object.e();
                    if (arrby == null ? object == null : arrby.equals(object)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public byte[] f() {
        return this.d;
    }

    @Override
    public String g() {
        return this.e;
    }

    @Override
    public long h() {
        return this.f;
    }

    public int hashCode() {
        long l8 = this.a;
        int n8 = (int)(l8 ^ l8 >>> 32);
        Object object = this.b;
        int n9 = 0;
        int n10 = object == null ? 0 : object.hashCode();
        l8 = this.c;
        int n11 = (int)(l8 ^ l8 >>> 32);
        int n12 = Arrays.hashCode((byte[])this.d);
        object = this.e;
        int n13 = object == null ? 0 : object.hashCode();
        l8 = this.f;
        int n14 = (int)(l8 >>> 32 ^ l8);
        object = this.g;
        if (object != null) {
            n9 = object.hashCode();
        }
        return ((((((n8 ^ 1000003) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n12) * 1000003 ^ n13) * 1000003 ^ n14) * 1000003 ^ n9;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LogEvent{eventTimeMs=");
        stringBuilder.append(this.a);
        stringBuilder.append(", eventCode=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", eventUptimeMs=");
        stringBuilder.append(this.c);
        stringBuilder.append(", sourceExtension=");
        stringBuilder.append(Arrays.toString((byte[])this.d));
        stringBuilder.append(", sourceExtensionJsonProto3=");
        stringBuilder.append(this.e);
        stringBuilder.append(", timezoneOffsetSeconds=");
        stringBuilder.append(this.f);
        stringBuilder.append(", networkConnectionInfo=");
        stringBuilder.append((Object)this.g);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static final class b
    extends l.a {
        public Long a;
        public Integer b;
        public Long c;
        public byte[] d;
        public String e;
        public Long f;
        public o g;

        @Override
        public l a() {
            Object object = this.a;
            Object object2 = "";
            if (object == null) {
                object2 = new StringBuilder();
                object2.append("");
                object2.append(" eventTimeMs");
                object2 = object2.toString();
            }
            object = object2;
            if (this.c == null) {
                object = new StringBuilder();
                object.append((String)object2);
                object.append(" eventUptimeMs");
                object = object.toString();
            }
            object2 = object;
            if (this.f == null) {
                object2 = new StringBuilder();
                object2.append((String)object);
                object2.append(" timezoneOffsetSeconds");
                object2 = object2.toString();
            }
            if (object2.isEmpty()) {
                return new f(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
            }
            object = new StringBuilder();
            object.append("Missing required properties:");
            object.append((String)object2);
            throw new IllegalStateException(object.toString());
        }

        @Override
        public l.a b(Integer n8) {
            this.b = n8;
            return this;
        }

        @Override
        public l.a c(long l8) {
            this.a = l8;
            return this;
        }

        @Override
        public l.a d(long l8) {
            this.c = l8;
            return this;
        }

        @Override
        public l.a e(o o8) {
            this.g = o8;
            return this;
        }

        @Override
        public l.a f(byte[] arrby) {
            this.d = arrby;
            return this;
        }

        @Override
        public l.a g(String string2) {
            this.e = string2;
            return this;
        }

        @Override
        public l.a h(long l8) {
            this.f = l8;
            return this;
        }
    }

}

