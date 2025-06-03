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

public final class A
extends D.c {
    public final String a;
    public final String b;
    public final boolean c;

    public A(String string2, String string3, boolean bl) {
        if (string2 != null) {
            this.a = string2;
            if (string3 != null) {
                this.b = string3;
                this.c = bl;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    @Override
    public boolean b() {
        return this.c;
    }

    @Override
    public String c() {
        return this.b;
    }

    @Override
    public String d() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof D.c) {
            if (this.a.equals((Object)(object = (D.c)object).d()) && this.b.equals((Object)object.c()) && this.c == object.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        int n9 = this.b.hashCode();
        int n10 = this.c ? 1231 : 1237;
        return ((n8 ^ 1000003) * 1000003 ^ n9) * 1000003 ^ n10;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OsData{osRelease=");
        stringBuilder.append(this.a);
        stringBuilder.append(", osCodeName=");
        stringBuilder.append(this.b);
        stringBuilder.append(", isRooted=");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

