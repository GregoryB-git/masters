/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Log
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.UnknownHostException
 */
package g0;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

public abstract class o {
    public static final Object a = new Object();
    public static int b = 0;
    public static boolean c = true;
    public static a d = a.a;

    public static String a(String string2, Throwable object) {
        String string3 = o.e((Throwable)object);
        object = string2;
        if (!TextUtils.isEmpty((CharSequence)string3)) {
            object = new StringBuilder();
            object.append(string2);
            object.append("\n  ");
            object.append(string3.replace((CharSequence)"\n", (CharSequence)"\n  "));
            object.append('\n');
            object = object.toString();
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(String string2, String string3) {
        Object object = a;
        synchronized (object) {
            try {
                if (b == 0) {
                    d.a(string2, string3, null);
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c(String string2, String string3) {
        Object object = a;
        synchronized (object) {
            try {
                if (b <= 3) {
                    d.d(string2, string3, null);
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void d(String string2, String string3, Throwable throwable) {
        Object object = a;
        synchronized (object) {
            try {
                if (b <= 3) {
                    d.d(string2, string3, throwable);
                }
                return;
            }
            catch (Throwable throwable2) {}
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String e(Throwable object) {
        if (object == null) {
            return null;
        }
        Object object2 = a;
        synchronized (object2) {
            try {
                if (o.g((Throwable)object)) {
                    return "UnknownHostException (no network)";
                }
                if (c) return Log.getStackTraceString((Throwable)object).trim().replace((CharSequence)"\t", (CharSequence)"    ");
                return object.getMessage();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void f(String string2, String string3) {
        Object object = a;
        synchronized (object) {
            try {
                if (b <= 1) {
                    d.c(string2, string3, null);
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static boolean g(Throwable throwable) {
        while (throwable != null) {
            if (throwable instanceof UnknownHostException) {
                return true;
            }
            throwable = throwable.getCause();
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void h(String string2, String string3) {
        Object object = a;
        synchronized (object) {
            try {
                if (b <= 2) {
                    d.b(string2, string3, null);
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void i(String string2, String string3, Throwable throwable) {
        Object object = a;
        synchronized (object) {
            try {
                if (b <= 2) {
                    d.b(string2, string3, throwable);
                }
                return;
            }
            catch (Throwable throwable2) {}
            throw throwable2;
        }
    }

    public static interface a {
        public static final a a = new a(){

            @Override
            public void a(String string2, String string3, Throwable throwable) {
                Log.d((String)string2, (String)o.a(string3, throwable));
            }

            @Override
            public void b(String string2, String string3, Throwable throwable) {
                Log.w((String)string2, (String)o.a(string3, throwable));
            }

            @Override
            public void c(String string2, String string3, Throwable throwable) {
                Log.i((String)string2, (String)o.a(string3, throwable));
            }

            @Override
            public void d(String string2, String string3, Throwable throwable) {
                Log.e((String)string2, (String)o.a(string3, throwable));
            }
        };

        public void a(String var1, String var2, Throwable var3);

        public void b(String var1, String var2, Throwable var3);

        public void c(String var1, String var2, Throwable var3);

        public void d(String var1, String var2, Throwable var3);

    }

}

