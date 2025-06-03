// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

import java.io.IOException;

public class v extends IOException
{
    private static final long serialVersionUID = -1616151763072450476L;
    public K o;
    
    public v(final String message) {
        super(message);
        this.o = null;
    }
    
    public static a a() {
        return new a("Protocol message tag had invalid wire type.");
    }
    
    public static v b() {
        return new v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
    
    public static v c() {
        return new v("Failed to parse the message.");
    }
    
    public static v d() {
        return new v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
    
    public static class a extends v
    {
        private static final long serialVersionUID = 3283890091615336259L;
        
        public a(final String s) {
            super(s);
        }
    }
}
