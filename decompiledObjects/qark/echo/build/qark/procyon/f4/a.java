// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package f4;

import java.io.IOException;
import java.util.Map;

public class a
{
    public final String a;
    public final Map b;
    
    public a(final String a, final Map b) {
        this.a = a;
        this.b = b;
    }
    
    public static a c(String substring) {
        if (!substring.startsWith("gauth|")) {
            return null;
        }
        substring = substring.substring(6);
        try {
            final Map a = b.a(substring);
            return new a(a.get("token"), (Map)a.get("auth"));
        }
        catch (IOException cause) {
            throw new RuntimeException("Failed to parse gauth token", cause);
        }
    }
    
    public Map a() {
        return this.b;
    }
    
    public String b() {
        return this.a;
    }
}
