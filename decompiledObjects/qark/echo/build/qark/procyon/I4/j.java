// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package I4;

import org.apache.http.HttpResponse;
import org.apache.http.Header;
import F4.a;
import org.apache.http.HttpMessage;
import java.util.regex.Pattern;

public abstract class j
{
    public static final Pattern a;
    
    static {
        a = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");
    }
    
    public static Long a(final HttpMessage httpMessage) {
        while (true) {
            while (true) {
                try {
                    final Header firstHeader = httpMessage.getFirstHeader("content-length");
                    if (firstHeader != null) {
                        return Long.parseLong(firstHeader.getValue());
                    }
                    return null;
                    F4.a.e().a("The content-length value is not a valid number");
                    return null;
                }
                catch (NumberFormatException ex) {}
                continue;
            }
        }
    }
    
    public static String b(final HttpResponse httpResponse) {
        final Header firstHeader = httpResponse.getFirstHeader("content-type");
        if (firstHeader != null) {
            final String value = firstHeader.getValue();
            if (value != null) {
                return value;
            }
        }
        return null;
    }
    
    public static boolean c(final String input) {
        return input == null || !j.a.matcher(input).matches();
    }
    
    public static void d(final G4.j j) {
        if (!j.l()) {
            j.u();
        }
        j.g();
    }
}
