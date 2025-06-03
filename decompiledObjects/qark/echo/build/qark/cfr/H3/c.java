/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package H3;

import H3.D;

public final class c
extends D.a {
    public final String a;
    public final String b;

    public c(String string2, String string3) {
        if (string2 != null) {
            this.a = string2;
            this.b = string3;
            return;
        }
        throw new NullPointerException("Null crashlyticsInstallId");
    }

    @Override
    public String c() {
        return this.a;
    }

    @Override
    public String d() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof D.a) {
            Object object2 = (D.a)object;
            if (this.a.equals((Object)object2.c())) {
                object = this.b;
                object2 = object2.d();
                if (object == null ? object2 == null : object.equals(object2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        String string2 = this.b;
        int n9 = string2 == null ? 0 : string2.hashCode();
        return (n8 ^ 1000003) * 1000003 ^ n9;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InstallIds{crashlyticsInstallId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", firebaseInstallationId=");
        stringBuilder.append(this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

