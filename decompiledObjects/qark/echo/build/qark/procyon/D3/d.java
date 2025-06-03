// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D3;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import android.os.Bundle;
import java.util.ArrayList;
import F3.f;
import G3.c;
import java.util.List;
import G3.b;
import r4.a;

public class d
{
    public final a a;
    public volatile F3.a b;
    public volatile b c;
    public final List d;
    
    public d(final a a) {
        this(a, new c(), new f());
    }
    
    public d(final a a, final b c, final F3.a b) {
        this.a = a;
        this.c = c;
        this.d = new ArrayList();
        this.b = b;
        this.f();
    }
    
    public static w3.a.a j(final w3.a a, final e e) {
        Object g;
        if ((g = a.g("clx", (w3.a.b)e)) == null) {
            E3.f.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            final w3.a.a g2 = a.g("crash", (w3.a.b)e);
            if ((g = g2) != null) {
                E3.f.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
                g = g2;
            }
        }
        return (w3.a.a)g;
    }
    
    public F3.a d() {
        return new D3.b(this);
    }
    
    public b e() {
        return new D3.a(this);
    }
    
    public final void f() {
        this.a.a((a.a)new D3.c(this));
    }
}
