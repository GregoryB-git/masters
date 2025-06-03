/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package H3;

import H3.v;
import J3.B;
import java.io.File;

public final class b
extends v {
    public final B a;
    public final String b;
    public final File c;

    public b(B b8, String string2, File file) {
        if (b8 != null) {
            this.a = b8;
            if (string2 != null) {
                this.b = string2;
                if (file != null) {
                    this.c = file;
                    return;
                }
                throw new NullPointerException("Null reportFile");
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    @Override
    public B b() {
        return this.a;
    }

    @Override
    public File c() {
        return this.c;
    }

    @Override
    public String d() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof v) {
            if (this.a.equals((Object)(object = (v)object).b()) && this.b.equals((Object)object.d()) && this.c.equals((Object)object.c())) {
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
        stringBuilder.append("CrashlyticsReportWithSessionId{report=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", sessionId=");
        stringBuilder.append(this.b);
        stringBuilder.append(", reportFile=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

