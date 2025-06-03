// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E2;

import java.util.regex.Pattern;

public abstract class n
{
    public static final Pattern a;
    
    static {
        a = Pattern.compile("\\$\\{(.*?)\\}");
    }
    
    public static boolean a(final String s) {
        return s == null || s.trim().isEmpty();
    }
}
