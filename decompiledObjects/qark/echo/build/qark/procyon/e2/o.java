// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e2;

import android.util.SparseArray;

public abstract class o
{
    public static a a() {
        return (a)new i.b();
    }
    
    public abstract b b();
    
    public abstract c c();
    
    public abstract static class a
    {
        public abstract o a();
        
        public abstract a b(final b p0);
        
        public abstract a c(final c p0);
    }
    
    public enum b
    {
        A("IDEN", 11, 11), 
        B("EVDO_B", 12, 12), 
        C("LTE", 13, 13), 
        D("EHRPD", 14, 14), 
        E("HSPAP", 15, 15), 
        F("GSM", 16, 16), 
        G("TD_SCDMA", 17, 17), 
        H("IWLAN", 18, 18), 
        I("LTE_CA", 19, 19), 
        J("COMBINED", 20, 100);
        
        public static final SparseArray K;
        
        p("UNKNOWN_MOBILE_SUBTYPE", 0, 0), 
        q("GPRS", 1, 1), 
        r("EDGE", 2, 2), 
        s("UMTS", 3, 3), 
        t("CDMA", 4, 4), 
        u("EVDO_0", 5, 5), 
        v("EVDO_A", 6, 6), 
        w("RTT", 7, 7), 
        x("HSDPA", 8, 8), 
        y("HSUPA", 9, 9), 
        z("HSPA", 10, 10);
        
        public final int o;
        
        static {
            final SparseArray k = new SparseArray();
            final b b;
            (K = k).put(0, (Object)b);
            final b b2;
            k.put(1, (Object)b2);
            final b b3;
            k.put(2, (Object)b3);
            final b b4;
            k.put(3, (Object)b4);
            final b b5;
            k.put(4, (Object)b5);
            final b b6;
            k.put(5, (Object)b6);
            final b b7;
            k.put(6, (Object)b7);
            final b b8;
            k.put(7, (Object)b8);
            final b b9;
            k.put(8, (Object)b9);
            final b b10;
            k.put(9, (Object)b10);
            final b b11;
            k.put(10, (Object)b11);
            final b b12;
            k.put(11, (Object)b12);
            final b b13;
            k.put(12, (Object)b13);
            final b b14;
            k.put(13, (Object)b14);
            final b b15;
            k.put(14, (Object)b15);
            final b b16;
            k.put(15, (Object)b16);
            final b b17;
            k.put(16, (Object)b17);
            final b b18;
            k.put(17, (Object)b18);
            final b b19;
            k.put(18, (Object)b19);
            final b b20;
            k.put(19, (Object)b20);
        }
        
        public b(final String name, final int ordinal, final int o) {
            this.o = o;
        }
        
        public static b c(final int n) {
            return (b)b.K.get(n);
        }
        
        public int e() {
            return this.o;
        }
    }
    
    public enum c
    {
        A("MOBILE_IMS", 11, 11), 
        B("MOBILE_CBS", 12, 12), 
        C("WIFI_P2P", 13, 13), 
        D("MOBILE_IA", 14, 14), 
        E("MOBILE_EMERGENCY", 15, 15), 
        F("PROXY", 16, 16), 
        G("VPN", 17, 17), 
        H("NONE", 18, -1);
        
        public static final SparseArray I;
        
        p("MOBILE", 0, 0), 
        q("WIFI", 1, 1), 
        r("MOBILE_MMS", 2, 2), 
        s("MOBILE_SUPL", 3, 3), 
        t("MOBILE_DUN", 4, 4), 
        u("MOBILE_HIPRI", 5, 5), 
        v("WIMAX", 6, 6), 
        w("BLUETOOTH", 7, 7), 
        x("DUMMY", 8, 8), 
        y("ETHERNET", 9, 9), 
        z("MOBILE_FOTA", 10, 10);
        
        public final int o;
        
        static {
            final SparseArray i = new SparseArray();
            final c c;
            (I = i).put(0, (Object)c);
            final c c2;
            i.put(1, (Object)c2);
            final c c3;
            i.put(2, (Object)c3);
            final c c4;
            i.put(3, (Object)c4);
            final c c5;
            i.put(4, (Object)c5);
            final c c6;
            i.put(5, (Object)c6);
            final c c7;
            i.put(6, (Object)c7);
            final c c8;
            i.put(7, (Object)c8);
            final c c9;
            i.put(8, (Object)c9);
            final c c10;
            i.put(9, (Object)c10);
            final c c11;
            i.put(10, (Object)c11);
            final c c12;
            i.put(11, (Object)c12);
            final c c13;
            i.put(12, (Object)c13);
            final c c14;
            i.put(13, (Object)c14);
            final c c15;
            i.put(14, (Object)c15);
            final c c16;
            i.put(15, (Object)c16);
            final c c17;
            i.put(16, (Object)c17);
            final c c18;
            i.put(17, (Object)c18);
            final c c19;
            i.put(-1, (Object)c19);
        }
        
        public c(final String name, final int ordinal, final int o) {
            this.o = o;
        }
        
        public static c c(final int n) {
            return (c)c.I.get(n);
        }
        
        public int e() {
            return this.o;
        }
    }
}
