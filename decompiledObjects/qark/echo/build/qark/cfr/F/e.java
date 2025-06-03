/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
package F;

import android.util.Base64;
import java.util.List;

public final class e {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final int e;
    public final String f;

    public e(String string2, String string3, String string4, List list) {
        this.a = (String)H.e.b(string2);
        this.b = (String)H.e.b(string3);
        this.c = (String)H.e.b(string4);
        this.d = (List)H.e.b((Object)list);
        this.e = 0;
        this.f = this.a(string2, string3, string4);
    }

    public final String a(String string2, String string3, String string4) {
        string2 = new StringBuilder(string2);
        string2.append("-");
        string2.append(string3);
        string2.append("-");
        string2.append(string4);
        return string2.toString();
    }

    public List b() {
        return this.d;
    }

    public int c() {
        return this.e;
    }

    public String d() {
        return this.f;
    }

    public String e() {
        return this.a;
    }

    public String f() {
        return this.b;
    }

    public String g() {
        return this.c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("FontRequest {mProviderAuthority: ");
        stringBuilder2.append(this.a);
        stringBuilder2.append(", mProviderPackage: ");
        stringBuilder2.append(this.b);
        stringBuilder2.append(", mQuery: ");
        stringBuilder2.append(this.c);
        stringBuilder2.append(", mCertificates:");
        stringBuilder.append(stringBuilder2.toString());
        for (int i8 = 0; i8 < this.d.size(); ++i8) {
            stringBuilder.append(" [");
            stringBuilder2 = (List)this.d.get(i8);
            for (int i9 = 0; i9 < stringBuilder2.size(); ++i9) {
                stringBuilder.append(" \"");
                stringBuilder.append(Base64.encodeToString((byte[])((byte[])stringBuilder2.get(i9)), (int)0));
                stringBuilder.append("\"");
            }
            stringBuilder.append(" ]");
        }
        stringBuilder.append("}");
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("mCertificatesArray: ");
        stringBuilder2.append(this.e);
        stringBuilder.append(stringBuilder2.toString());
        return stringBuilder.toString();
    }
}

