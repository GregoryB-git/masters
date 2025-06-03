// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package s4;

import android.text.TextUtils;
import u4.d;
import w4.b;
import java.util.concurrent.TimeUnit;
import w4.a;
import java.util.regex.Pattern;

public final class q
{
    public static final long b;
    public static final Pattern c;
    public static q d;
    public final a a;
    
    static {
        b = TimeUnit.HOURS.toSeconds(1L);
        c = Pattern.compile("\\AA[\\w-]{38}\\z");
    }
    
    public q(final a a) {
        this.a = a;
    }
    
    public static q c() {
        return d(w4.b.b());
    }
    
    public static q d(final a a) {
        if (q.d == null) {
            q.d = new q(a);
        }
        return q.d;
    }
    
    public static boolean g(final String input) {
        return q.c.matcher(input).matches();
    }
    
    public static boolean h(final String s) {
        return s.contains(":");
    }
    
    public long a() {
        return this.a.a();
    }
    
    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(this.a());
    }
    
    public long e() {
        return (long)(Math.random() * 1000.0);
    }
    
    public boolean f(final d d) {
        return TextUtils.isEmpty((CharSequence)d.b()) || d.h() + d.c() < this.b() + q.b;
    }
}
