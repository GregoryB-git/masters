// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H4;

import N4.c;

public class a extends e
{
    public static final F4.a b;
    public final c a;
    
    static {
        b = F4.a.e();
    }
    
    public a(final c a) {
        this.a = a;
    }
    
    @Override
    public boolean c() {
        if (!this.g()) {
            H4.a.b.j("ApplicationInfo is invalid");
            return false;
        }
        return true;
    }
    
    public final boolean g() {
        final c a = this.a;
        F4.a a2 = null;
        String s = null;
        Label_0016: {
            if (a == null) {
                a2 = H4.a.b;
                s = "ApplicationInfo is null";
            }
            else if (!a.f0()) {
                a2 = H4.a.b;
                s = "GoogleAppId is null";
            }
            else if (!this.a.d0()) {
                a2 = H4.a.b;
                s = "AppInstanceId is null";
            }
            else {
                if (this.a.e0()) {
                    if (this.a.c0()) {
                        if (!this.a.Z().Y()) {
                            a2 = H4.a.b;
                            s = "AndroidAppInfo.packageName is null";
                            break Label_0016;
                        }
                        if (!this.a.Z().Z()) {
                            a2 = H4.a.b;
                            s = "AndroidAppInfo.sdkVersion is null";
                            break Label_0016;
                        }
                    }
                    return true;
                }
                a2 = H4.a.b;
                s = "ApplicationProcessState is null";
            }
        }
        a2.j(s);
        return false;
    }
}
