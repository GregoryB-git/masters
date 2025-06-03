/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.DisplayMetrics
 *  java.lang.Enum
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.concurrent.ConcurrentLinkedQueue
 */
package D5;

import E5.a;
import E5.f;
import E5.i;
import android.os.Build;
import android.util.DisplayMetrics;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

public class t {
    public static final a b = new a();
    public final E5.a a;

    public t(w5.a a8) {
        this.a = new E5.a(a8, "flutter/settings", f.a);
    }

    public static DisplayMetrics b(int n8) {
        a.b b8 = b.c(n8);
        if (b8 == null) {
            return null;
        }
        return b8.b;
    }

    public static boolean c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return true;
        }
        return false;
    }

    public b d() {
        return new b(this.a);
    }

    public static class a {
        public final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();
        public b b;
        public b c;

        public a.e b(b b8) {
            this.a.add((Object)b8);
            final b b9 = this.c;
            this.c = b8;
            if (b9 == null) {
                return null;
            }
            return new a.e(){

                @Override
                public void a(Object object) {
                    a.this.a.remove((Object)b9);
                    if (!a.this.a.isEmpty()) {
                        object = new StringBuilder();
                        object.append("The queue becomes empty after removing config generation ");
                        object.append(String.valueOf((int)b9.a));
                        t5.b.b("SettingsChannel", object.toString());
                    }
                }
            };
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public b c(int var1_1) {
            if (this.b != null) ** GOTO lbl4
            do {
                this.b = (b)this.a.poll();
lbl4: // 2 sources:
            } while ((var2_2 = this.b) != null && var2_2.a < var1_1);
            if (var2_2 == null) {
                var2_2 = new StringBuilder();
                var2_2.append("Cannot find config with generation: ");
                var2_2.append(String.valueOf((int)var1_1));
                var3_3 = ", after exhausting the queue.";
            } else {
                if (var2_2.a == var1_1) return var2_2;
                var2_2 = new StringBuilder();
                var2_2.append("Cannot find config with generation: ");
                var2_2.append(String.valueOf((int)var1_1));
                var2_2.append(", the oldest config is now: ");
                var3_3 = String.valueOf((int)this.b.a);
            }
            var2_2.append(var3_3);
            t5.b.b("SettingsChannel", var2_2.toString());
            return null;
        }

        public static class b {
            public static int c = Integer.MIN_VALUE;
            public final int a;
            public final DisplayMetrics b;

            public b(DisplayMetrics displayMetrics) {
                int n8 = c;
                c = n8 + 1;
                this.a = n8;
                this.b = displayMetrics;
            }
        }

    }

    public static class b {
        public final E5.a a;
        public Map b = new HashMap();
        public DisplayMetrics c;

        public b(E5.a a8) {
            this.a = a8;
        }

        public void a() {
            Object object = new StringBuilder();
            object.append("Sending message: \ntextScaleFactor: ");
            object.append(this.b.get((Object)"textScaleFactor"));
            object.append("\nalwaysUse24HourFormat: ");
            object.append(this.b.get((Object)"alwaysUse24HourFormat"));
            object.append("\nplatformBrightness: ");
            object.append(this.b.get((Object)"platformBrightness"));
            t5.b.f("SettingsChannel", object.toString());
            object = this.c;
            if (t.c() && object != null) {
                object = new a.b((DisplayMetrics)object);
                a.e e8 = b.b((a.b)object);
                this.b.put((Object)"configurationId", (Object)object.a);
                this.a.d((Object)this.b, e8);
                return;
            }
            this.a.c((Object)this.b);
        }

        public b b(boolean bl) {
            this.b.put((Object)"brieflyShowPassword", (Object)bl);
            return this;
        }

        public b c(DisplayMetrics displayMetrics) {
            this.c = displayMetrics;
            return this;
        }

        public b d(boolean bl) {
            this.b.put((Object)"nativeSpellCheckServiceDefined", (Object)bl);
            return this;
        }

        public b e(c c8) {
            this.b.put((Object)"platformBrightness", (Object)c8.o);
            return this;
        }

        public b f(float f8) {
            this.b.put((Object)"textScaleFactor", (Object)Float.valueOf((float)f8));
            return this;
        }

        public b g(boolean bl) {
            this.b.put((Object)"alwaysUse24HourFormat", (Object)bl);
            return this;
        }
    }

    public static final class c
    extends Enum {
        public static final /* enum */ c p = new c("light");
        public static final /* enum */ c q = new c("dark");
        public static final /* synthetic */ c[] r;
        public String o;

        static {
            r = c.c();
        }

        public c(String string3) {
            this.o = string3;
        }

        public static /* synthetic */ c[] c() {
            return new c[]{p, q};
        }

        public static c valueOf(String string2) {
            return (c)Enum.valueOf(c.class, (String)string2);
        }

        public static c[] values() {
            return (c[])r.clone();
        }
    }

}

