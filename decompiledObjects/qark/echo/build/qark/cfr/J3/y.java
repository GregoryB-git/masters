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

import E3.e;
import J3.D;

public final class y
extends D.a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final e f;

    public y(String string2, String string3, String string4, String string5, int n8, e e8) {
        if (string2 != null) {
            this.a = string2;
            if (string3 != null) {
                this.b = string3;
                if (string4 != null) {
                    this.c = string4;
                    if (string5 != null) {
                        this.d = string5;
                        this.e = n8;
                        if (e8 != null) {
                            this.f = e8;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    @Override
    public String a() {
        return this.a;
    }

    @Override
    public int c() {
        return this.e;
    }

    @Override
    public e d() {
        return this.f;
    }

    @Override
    public String e() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof D.a) {
            if (this.a.equals((Object)(object = (D.a)object).a()) && this.b.equals((Object)object.f()) && this.c.equals((Object)object.g()) && this.d.equals((Object)object.e()) && this.e == object.c() && this.f.equals((Object)object.d())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public String f() {
        return this.b;
    }

    @Override
    public String g() {
        return this.c;
    }

    public int hashCode() {
        return (((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e) * 1000003 ^ this.f.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AppData{appIdentifier=");
        stringBuilder.append(this.a);
        stringBuilder.append(", versionCode=");
        stringBuilder.append(this.b);
        stringBuilder.append(", versionName=");
        stringBuilder.append(this.c);
        stringBuilder.append(", installUuid=");
        stringBuilder.append(this.d);
        stringBuilder.append(", deliveryMechanism=");
        stringBuilder.append(this.e);
        stringBuilder.append(", developmentPlatformProvider=");
        stringBuilder.append((Object)this.f);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

