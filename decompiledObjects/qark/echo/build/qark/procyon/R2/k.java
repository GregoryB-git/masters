// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

public enum k
{
    p("UNSET", 0, '0'), 
    q("REMOTE_DEFAULT", 1, '1'), 
    r("REMOTE_DELEGATION", 2, '2'), 
    s("MANIFEST", 3, '3'), 
    t("INITIALIZATION", 4, '4'), 
    u("API", 5, '5'), 
    v("CHILD_ACCOUNT", 6, '6'), 
    w("FAILSAFE", 7, '9');
    
    public final char o;
    
    public k(final String name, final int ordinal, final char o) {
        this.o = o;
    }
    
    public static k e(final char c) {
        final k[] values = values();
        for (int length = values.length, i = 0; i < length; ++i) {
            final k k = values[i];
            if (k.o == c) {
                return k;
            }
        }
        return k.p;
    }
}
