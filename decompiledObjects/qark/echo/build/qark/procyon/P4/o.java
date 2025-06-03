// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package P4;

import s3.l;

public class o extends l
{
    public final a o;
    
    public o(final String s) {
        super(s);
        this.o = a.p;
    }
    
    public o(final String s, final a o) {
        super(s);
        this.o = o;
    }
    
    public o(final String s, final Throwable t) {
        super(s, t);
        this.o = a.p;
    }
    
    public o(final String s, final Throwable t, final a o) {
        super(s, t);
        this.o = o;
    }
    
    public enum a
    {
        p("UNKNOWN", 0, 0), 
        q("CONFIG_UPDATE_STREAM_ERROR", 1, 1), 
        r("CONFIG_UPDATE_MESSAGE_INVALID", 2, 2), 
        s("CONFIG_UPDATE_NOT_FETCHED", 3, 3), 
        t("CONFIG_UPDATE_UNAVAILABLE", 4, 4);
        
        public final int o;
        
        public a(final String name, final int ordinal, final int o) {
            this.o = o;
        }
    }
}
