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

public final class x
extends D {
    public final D.a a;
    public final D.c b;
    public final D.b c;

    public x(D.a a8, D.c c8, D.b b8) {
        if (a8 != null) {
            this.a = a8;
            if (c8 != null) {
                this.b = c8;
                if (b8 != null) {
                    this.c = b8;
                    return;
                }
                throw new NullPointerException("Null deviceData");
            }
            throw new NullPointerException("Null osData");
        }
        throw new NullPointerException("Null appData");
    }

    @Override
    public D.a a() {
        return this.a;
    }

    @Override
    public D.b c() {
        return this.c;
    }

    @Override
    public D.c d() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof D) {
            if (this.a.equals((Object)(object = (D)object).a()) && this.b.equals((Object)object.d()) && this.c.equals((Object)object.c())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("StaticSessionData{appData=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", osData=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", deviceData=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

