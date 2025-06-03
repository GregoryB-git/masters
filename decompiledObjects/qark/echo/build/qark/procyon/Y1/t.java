// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public enum t
{
    A("DEVICE_AUTH", 5, false, false, false, true, false, false, false), 
    v("NATIVE_WITH_FALLBACK", 0, true, true, true, false, true, true, true), 
    w("NATIVE_ONLY", 1, true, true, false, false, false, true, true), 
    x("KATANA_ONLY", 2, false, true, false, false, false, false, false), 
    y("WEB_ONLY", 3, false, false, true, false, true, false, false), 
    z("DIALOG_ONLY", 4, false, true, true, false, true, true, true);
    
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    
    static {
        B = c();
    }
    
    public t(final String name, final int ordinal, final boolean o, final boolean p9, final boolean q, final boolean r, final boolean s, final boolean t, final boolean u) {
        this.o = o;
        this.p = p9;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
    }
    
    public static final /* synthetic */ t[] c() {
        return new t[] { t.v, t.w, t.x, t.y, t.z, t.A };
    }
    
    public final boolean e() {
        return this.s;
    }
    
    public final boolean h() {
        return this.r;
    }
    
    public final boolean j() {
        return this.o;
    }
    
    public final boolean l() {
        return this.u;
    }
    
    public final boolean m() {
        return this.p;
    }
    
    public final boolean n() {
        return this.q;
    }
}
