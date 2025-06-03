// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g0;

import java.net.UnknownHostException;
import android.util.Log;
import android.text.TextUtils;

public abstract class o
{
    public static final Object a;
    public static int b = 0;
    public static boolean c = true;
    public static a d;
    
    static {
        a = new Object();
        o.d = o.a.a;
    }
    
    public static String a(final String str, final Throwable t) {
        final String e = e(t);
        String string = str;
        if (!TextUtils.isEmpty((CharSequence)e)) {
            final StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("\n  ");
            sb.append(e.replace("\n", "\n  "));
            sb.append('\n');
            string = sb.toString();
        }
        return string;
    }
    
    public static void b(final String s, final String s2) {
        final Object a = o.a;
        // monitorenter(a)
        while (true) {
            try {
                if (o.b == 0) {
                    o.d.a(s, s2, null);
                }
                // monitorexit(a)
                return;
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static void c(final String s, final String s2) {
        final Object a = o.a;
        // monitorenter(a)
        while (true) {
            try {
                if (o.b <= 3) {
                    o.d.d(s, s2, null);
                }
                // monitorexit(a)
                return;
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static void d(final String s, final String s2, final Throwable t) {
        final Object a = o.a;
        // monitorenter(a)
        while (true) {
            try {
                if (o.b <= 3) {
                    o.d.d(s, s2, t);
                }
                // monitorexit(a)
                return;
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static String e(final Throwable t) {
        if (t == null) {
            return null;
        }
        final Object a = o.a;
        // monitorenter(a)
        while (true) {
            try {
                if (g(t)) {
                    // monitorexit(a)
                    return "UnknownHostException (no network)";
                }
                if (!o.c) {
                    // monitorexit(a)
                    return t.getMessage();
                }
                // monitorexit(a)
                return Log.getStackTraceString(t).trim().replace("\t", "    ");
                // monitorexit(a)
                throw t;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static void f(final String s, final String s2) {
        final Object a = o.a;
        // monitorenter(a)
        while (true) {
            try {
                if (o.b <= 1) {
                    o.d.c(s, s2, null);
                }
                // monitorexit(a)
                return;
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static boolean g(Throwable cause) {
        while (cause != null) {
            if (cause instanceof UnknownHostException) {
                return true;
            }
            cause = cause.getCause();
        }
        return false;
    }
    
    public static void h(final String s, final String s2) {
        final Object a = o.a;
        // monitorenter(a)
        while (true) {
            try {
                if (o.b <= 2) {
                    o.d.b(s, s2, null);
                }
                // monitorexit(a)
                return;
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static void i(final String s, final String s2, final Throwable t) {
        final Object a = o.a;
        // monitorenter(a)
        while (true) {
            try {
                if (o.b <= 2) {
                    o.d.b(s, s2, t);
                }
                // monitorexit(a)
                return;
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public interface a
    {
        public static final a a = new a() {
            @Override
            public void a(final String s, final String s2, final Throwable t) {
                Log.d(s, o.a(s2, t));
            }
            
            @Override
            public void b(final String s, final String s2, final Throwable t) {
                Log.w(s, o.a(s2, t));
            }
            
            @Override
            public void c(final String s, final String s2, final Throwable t) {
                Log.i(s, o.a(s2, t));
            }
            
            @Override
            public void d(final String s, final String s2, final Throwable t) {
                Log.e(s, o.a(s2, t));
            }
        };
        
        void a(final String p0, final String p1, final Throwable p2);
        
        void b(final String p0, final String p1, final Throwable p2);
        
        void c(final String p0, final String p1, final Throwable p2);
        
        void d(final String p0, final String p1, final Throwable p2);
    }
}
