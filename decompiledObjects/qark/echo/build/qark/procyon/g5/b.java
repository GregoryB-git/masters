// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g5;

public enum b
{
    q("TERMINATOR", 0, new int[] { 0, 0, 0 }, 0), 
    r("NUMERIC", 1, new int[] { 10, 12, 14 }, 1), 
    s("ALPHANUMERIC", 2, new int[] { 9, 11, 13 }, 2), 
    t("STRUCTURED_APPEND", 3, new int[] { 0, 0, 0 }, 3), 
    u("BYTE", 4, new int[] { 8, 16, 16 }, 4), 
    v("ECI", 5, new int[] { 0, 0, 0 }, 7), 
    w("KANJI", 6, new int[] { 8, 10, 12 }, 8), 
    x("FNC1_FIRST_POSITION", 7, new int[] { 0, 0, 0 }, 5), 
    y("FNC1_SECOND_POSITION", 8, new int[] { 0, 0, 0 }, 9), 
    z("HANZI", 9, new int[] { 8, 10, 12 }, 13);
    
    public final int[] o;
    public final int p;
    
    public b(final String name, final int ordinal, final int[] o, final int p4) {
        this.o = o;
        this.p = p4;
    }
    
    public int c() {
        return this.p;
    }
    
    public int e(final c c) {
        final int f = c.f();
        int n;
        if (f <= 9) {
            n = 0;
        }
        else if (f <= 26) {
            n = 1;
        }
        else {
            n = 2;
        }
        return this.o[n];
    }
}
