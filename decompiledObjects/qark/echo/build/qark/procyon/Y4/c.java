// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y4;

import java.util.HashMap;
import java.util.Map;

public enum c
{
    A("ISO8859_10", 10, 12, new String[] { "ISO-8859-10" }), 
    B("ISO8859_11", 11, 13, new String[] { "ISO-8859-11" }), 
    C("ISO8859_13", 12, 15, new String[] { "ISO-8859-13" }), 
    D("ISO8859_14", 13, 16, new String[] { "ISO-8859-14" }), 
    E("ISO8859_15", 14, 17, new String[] { "ISO-8859-15" }), 
    F("ISO8859_16", 15, 18, new String[] { "ISO-8859-16" }), 
    G("SJIS", 16, 20, new String[] { "Shift_JIS" }), 
    H("Cp1250", 17, 21, new String[] { "windows-1250" }), 
    I("Cp1251", 18, 22, new String[] { "windows-1251" }), 
    J("Cp1252", 19, 23, new String[] { "windows-1252" }), 
    K("Cp1256", 20, 24, new String[] { "windows-1256" }), 
    L("UnicodeBigUnmarked", 21, 25, new String[] { "UTF-16BE", "UnicodeBig" }), 
    M("UTF8", 22, 26, new String[] { "UTF-8" }), 
    N("ASCII", 23, new int[] { 27, 170 }, new String[] { "US-ASCII" }), 
    O("Big5", 24, 28), 
    P("GB18030", 25, 29, new String[] { "GB2312", "EUC_CN", "GBK" }), 
    Q("EUC_KR", 26, 30, new String[] { "EUC-KR" });
    
    public static final Map R;
    public static final Map S;
    
    q("Cp437", 0, new int[] { 0, 2 }, new String[0]), 
    r("ISO8859_1", 1, new int[] { 1, 3 }, new String[] { "ISO-8859-1" }), 
    s("ISO8859_2", 2, 4, new String[] { "ISO-8859-2" }), 
    t("ISO8859_3", 3, 5, new String[] { "ISO-8859-3" }), 
    u("ISO8859_4", 4, 6, new String[] { "ISO-8859-4" }), 
    v("ISO8859_5", 5, 7, new String[] { "ISO-8859-5" }), 
    w("ISO8859_6", 6, 8, new String[] { "ISO-8859-6" }), 
    x("ISO8859_7", 7, 9, new String[] { "ISO-8859-7" }), 
    y("ISO8859_8", 8, 10, new String[] { "ISO-8859-8" }), 
    z("ISO8859_9", 9, 11, new String[] { "ISO-8859-9" });
    
    public final int[] o;
    public final String[] p;
    
    static {
        R = new HashMap();
        S = new HashMap();
        final c[] values = values();
        for (int length = values.length, i = 0; i < length; ++i) {
            final c c = values[i];
            final int[] o = c.o;
            for (int length2 = o.length, j = 0; j < length2; ++j) {
                Y4.c.R.put(o[j], c);
            }
            Y4.c.S.put(c.name(), c);
            final String[] p = c.p;
            for (int length3 = p.length, k = 0; k < length3; ++k) {
                Y4.c.S.put(p[k], c);
            }
        }
    }
    
    public c(final String s, final int n, final int n2) {
        this(s, n, new int[] { n2 }, new String[0]);
    }
    
    public c(final String name, final int ordinal, final int n, final String... p4) {
        this.o = new int[] { n };
        this.p = p4;
    }
    
    public c(final String name, final int ordinal, final int[] o, final String... p4) {
        this.o = o;
        this.p = p4;
    }
    
    public static c c(final String s) {
        return c.S.get(s);
    }
    
    public int e() {
        return this.o[0];
    }
}
