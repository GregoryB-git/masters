/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package H4;

import H4.e;
import N4.c;

public class a
extends e {
    public static final F4.a b = F4.a.e();
    public final c a;

    public a(c c8) {
        this.a = c8;
    }

    @Override
    public boolean c() {
        if (!this.g()) {
            b.j("ApplicationInfo is invalid");
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean g() {
        block7 : {
            String string2;
            Object object;
            block3 : {
                block8 : {
                    block6 : {
                        block5 : {
                            block4 : {
                                block2 : {
                                    object = this.a;
                                    if (object != null) break block2;
                                    object = b;
                                    string2 = "ApplicationInfo is null";
                                    break block3;
                                }
                                if (object.f0()) break block4;
                                object = b;
                                string2 = "GoogleAppId is null";
                                break block3;
                            }
                            if (this.a.d0()) break block5;
                            object = b;
                            string2 = "AppInstanceId is null";
                            break block3;
                        }
                        if (this.a.e0()) break block6;
                        object = b;
                        string2 = "ApplicationProcessState is null";
                        break block3;
                    }
                    if (!this.a.c0()) break block7;
                    if (this.a.Z().Y()) break block8;
                    object = b;
                    string2 = "AndroidAppInfo.packageName is null";
                    break block3;
                }
                if (this.a.Z().Z()) break block7;
                object = b;
                string2 = "AndroidAppInfo.sdkVersion is null";
            }
            object.j(string2);
            return false;
        }
        return true;
    }
}

