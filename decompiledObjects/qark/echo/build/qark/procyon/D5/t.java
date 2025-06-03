// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D5;

import java.util.HashMap;
import java.util.Map;
import t5.b;
import java.util.concurrent.ConcurrentLinkedQueue;
import android.os.Build$VERSION;
import android.util.DisplayMetrics;
import E5.i;
import E5.c;
import E5.f;
import E5.a;

public class t
{
    public static final a b;
    public final E5.a a;
    
    static {
        b = new a();
    }
    
    public t(final w5.a a) {
        this.a = new E5.a(a, "flutter/settings", f.a);
    }
    
    public static /* synthetic */ a a() {
        return t.b;
    }
    
    public static DisplayMetrics b(final int n) {
        final a.b c = t.b.c(n);
        if (c == null) {
            return null;
        }
        return a.b.a(c);
    }
    
    public static boolean c() {
        return Build$VERSION.SDK_INT >= 34;
    }
    
    public b d() {
        return new b(this.a);
    }
    
    public static class a
    {
        public final ConcurrentLinkedQueue a;
        public b b;
        public b c;
        
        public a() {
            this.a = new ConcurrentLinkedQueue();
        }
        
        public static /* synthetic */ ConcurrentLinkedQueue a(final a a) {
            return a.a;
        }
        
        public E5.a.e b(final b b) {
            this.a.add(b);
            final b c = this.c;
            this.c = b;
            if (c == null) {
                return null;
            }
            return new E5.a.e() {
                @Override
                public void a(final Object o) {
                    t.a.a(t.a.this).remove(c);
                    if (!t.a.a(t.a.this).isEmpty()) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("The queue becomes empty after removing config generation ");
                        sb.append(String.valueOf(c.a));
                        t5.b.b("SettingsChannel", sb.toString());
                    }
                }
            };
        }
        
        public b c(final int n) {
            b b;
            while (true) {
                Label_0021: {
                    if (this.b != null) {
                        break Label_0021;
                    }
                    this.b = this.a.poll();
                }
                b = this.b;
                if (b != null && b.a < n) {
                    continue;
                }
                break;
            }
            StringBuilder sb;
            String value;
            if (b == null) {
                sb = new StringBuilder();
                sb.append("Cannot find config with generation: ");
                sb.append(String.valueOf(n));
                value = ", after exhausting the queue.";
            }
            else {
                if (b.a == n) {
                    return b;
                }
                sb = new StringBuilder();
                sb.append("Cannot find config with generation: ");
                sb.append(String.valueOf(n));
                sb.append(", the oldest config is now: ");
                value = String.valueOf(this.b.a);
            }
            sb.append(value);
            t5.b.b("SettingsChannel", sb.toString());
            return null;
        }
        
        public static class b
        {
            public static int c = Integer.MIN_VALUE;
            public final int a;
            public final DisplayMetrics b;
            
            public b(final DisplayMetrics b) {
                final int c = b.c;
                b.c = c + 1;
                this.a = c;
                this.b = b;
            }
            
            public static /* synthetic */ DisplayMetrics a(final b b) {
                return b.b;
            }
        }
    }
    
    public static class b
    {
        public final E5.a a;
        public Map b;
        public DisplayMetrics c;
        
        public b(final E5.a a) {
            this.b = new HashMap();
            this.a = a;
        }
        
        public void a() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Sending message: \ntextScaleFactor: ");
            sb.append(this.b.get("textScaleFactor"));
            sb.append("\nalwaysUse24HourFormat: ");
            sb.append(this.b.get("alwaysUse24HourFormat"));
            sb.append("\nplatformBrightness: ");
            sb.append(this.b.get("platformBrightness"));
            t5.b.f("SettingsChannel", sb.toString());
            final DisplayMetrics c = this.c;
            if (t.c() && c != null) {
                final a.b b = new a.b(c);
                final E5.a.e b2 = t.a().b(b);
                this.b.put("configurationId", b.a);
                this.a.d(this.b, b2);
                return;
            }
            this.a.c(this.b);
        }
        
        public b b(final boolean b) {
            this.b.put("brieflyShowPassword", b);
            return this;
        }
        
        public b c(final DisplayMetrics c) {
            this.c = c;
            return this;
        }
        
        public b d(final boolean b) {
            this.b.put("nativeSpellCheckServiceDefined", b);
            return this;
        }
        
        public b e(final c c) {
            this.b.put("platformBrightness", c.o);
            return this;
        }
        
        public b f(final float f) {
            this.b.put("textScaleFactor", f);
            return this;
        }
        
        public b g(final boolean b) {
            this.b.put("alwaysUse24HourFormat", b);
            return this;
        }
    }
    
    public enum c
    {
        p("light", 0, "light"), 
        q("dark", 1, "dark");
        
        public String o;
        
        static {
            r = c();
        }
        
        public c(final String name, final int ordinal, final String o) {
            this.o = o;
        }
        
        public static /* synthetic */ c[] c() {
            return new c[] { c.p, c.q };
        }
    }
}
