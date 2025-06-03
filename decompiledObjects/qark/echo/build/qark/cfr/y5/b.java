/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package y5;

public final class b {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;

    public b(String string2, String string3, String string4, String string5, String string6, String string7, boolean bl) {
        String string8 = string2;
        if (string2 == null) {
            string8 = "libapp.so";
        }
        this.a = string8;
        string2 = string3;
        if (string3 == null) {
            string2 = "vm_snapshot_data";
        }
        this.b = string2;
        string2 = string4;
        if (string4 == null) {
            string2 = "isolate_snapshot_data";
        }
        this.c = string2;
        string2 = string5;
        if (string5 == null) {
            string2 = "flutter_assets";
        }
        this.d = string2;
        this.f = string7;
        string2 = string6;
        if (string6 == null) {
            string2 = "";
        }
        this.e = string2;
        this.g = bl;
    }
}

