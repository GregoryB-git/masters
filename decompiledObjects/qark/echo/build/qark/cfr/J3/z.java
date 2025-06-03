/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package J3;

import J3.D;

public final class z
extends D.b {
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;

    public z(int n8, String string2, int n9, long l8, long l9, boolean bl, int n10, String string3, String string4) {
        this.a = n8;
        if (string2 != null) {
            this.b = string2;
            this.c = n9;
            this.d = l8;
            this.e = l9;
            this.f = bl;
            this.g = n10;
            if (string3 != null) {
                this.h = string3;
                if (string4 != null) {
                    this.i = string4;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    @Override
    public int a() {
        return this.a;
    }

    @Override
    public int b() {
        return this.c;
    }

    @Override
    public long d() {
        return this.e;
    }

    @Override
    public boolean e() {
        return this.f;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof D.b) {
            if (this.a == (object = (D.b)object).a() && this.b.equals((Object)object.g()) && this.c == object.b() && this.d == object.j() && this.e == object.d() && this.f == object.e() && this.g == object.i() && this.h.equals((Object)object.f()) && this.i.equals((Object)object.h())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public String f() {
        return this.h;
    }

    @Override
    public String g() {
        return this.b;
    }

    @Override
    public String h() {
        return this.i;
    }

    public int hashCode() {
        int n8 = this.a;
        int n9 = this.b.hashCode();
        int n10 = this.c;
        long l8 = this.d;
        int n11 = (int)(l8 ^ l8 >>> 32);
        l8 = this.e;
        int n12 = (int)(l8 ^ l8 >>> 32);
        int n13 = this.f ? 1231 : 1237;
        return ((((((((n8 ^ 1000003) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ n11) * 1000003 ^ n12) * 1000003 ^ n13) * 1000003 ^ this.g) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode();
    }

    @Override
    public int i() {
        return this.g;
    }

    @Override
    public long j() {
        return this.d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DeviceData{arch=");
        stringBuilder.append(this.a);
        stringBuilder.append(", model=");
        stringBuilder.append(this.b);
        stringBuilder.append(", availableProcessors=");
        stringBuilder.append(this.c);
        stringBuilder.append(", totalRam=");
        stringBuilder.append(this.d);
        stringBuilder.append(", diskSpace=");
        stringBuilder.append(this.e);
        stringBuilder.append(", isEmulator=");
        stringBuilder.append(this.f);
        stringBuilder.append(", state=");
        stringBuilder.append(this.g);
        stringBuilder.append(", manufacturer=");
        stringBuilder.append(this.h);
        stringBuilder.append(", modelClass=");
        stringBuilder.append(this.i);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

