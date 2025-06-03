// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F;

import android.util.Base64;
import java.util.List;

public final class e
{
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final int e;
    public final String f;
    
    public e(final String s, final String s2, final String s3, final List list) {
        this.a = (String)H.e.b(s);
        this.b = (String)H.e.b(s2);
        this.c = (String)H.e.b(s3);
        this.d = (List)H.e.b(list);
        this.e = 0;
        this.f = this.a(s, s2, s3);
    }
    
    public final String a(final String str, final String str2, final String str3) {
        final StringBuilder sb = new StringBuilder(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        return sb.toString();
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
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: ");
        sb2.append(this.a);
        sb2.append(", mProviderPackage: ");
        sb2.append(this.b);
        sb2.append(", mQuery: ");
        sb2.append(this.c);
        sb2.append(", mCertificates:");
        sb.append(sb2.toString());
        for (int i = 0; i < this.d.size(); ++i) {
            sb.append(" [");
            final List<byte[]> list = this.d.get(i);
            for (int j = 0; j < list.size(); ++j) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[])list.get(j), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("mCertificatesArray: ");
        sb3.append(this.e);
        sb.append(sb3.toString());
        return sb.toString();
    }
}
