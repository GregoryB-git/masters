// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D3;

import E3.f;

public abstract class h
{
    public static void a(final Throwable t) {
        if (t == null) {
            f.f().k("A null value was passed to recordFatalException. Ignoring.");
            return;
        }
        g.d().a.p(t);
    }
    
    public static void b(final String s) {
        g.d().a.w("com.crashlytics.flutter.build-id.0", s);
    }
}
