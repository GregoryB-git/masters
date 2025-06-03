// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public enum j2 implements e4
{
    p("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN", 0, 0), 
    q("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED", 1, 1), 
    r("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED", 2, 2), 
    s("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED", 3, 3), 
    t("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED", 4, 4), 
    u("AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED", 5, 5);
    
    public static final d4 v;
    public final int o;
    
    static {
        v = new i2();
    }
    
    public j2(final String name, final int ordinal, final int o) {
        this.o = o;
    }
    
    public static j2 c(final int n) {
        if (n == 0) {
            return j2.p;
        }
        if (n == 1) {
            return j2.q;
        }
        if (n == 2) {
            return j2.r;
        }
        if (n == 3) {
            return j2.s;
        }
        if (n == 4) {
            return j2.t;
        }
        if (n != 5) {
            return null;
        }
        return j2.u;
    }
    
    public static g4 e() {
        return k2.a;
    }
    
    @Override
    public final int a() {
        return this.o;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("<");
        sb.append(j2.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" number=");
        sb.append(this.o);
        sb.append(" name=");
        sb.append(this.name());
        sb.append('>');
        return sb.toString();
    }
}
