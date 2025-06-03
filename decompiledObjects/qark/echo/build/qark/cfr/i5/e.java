/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.util.Log
 *  java.io.FileNotFoundException
 *  java.io.PrintWriter
 *  java.io.StringWriter
 *  java.io.Writer
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Map
 *  java.util.Objects
 */
package i5;

import A5.a;
import E5.j;
import E5.k;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import i5.c;
import i5.d;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.Objects;

public class e
implements k.c,
A5.a {
    public k a;
    public i5.a b;
    public HandlerThread c;
    public Handler d;

    public static /* synthetic */ i5.a a(e e8) {
        return e8.b;
    }

    public static /* synthetic */ String b(e e8, j j8) {
        return e8.e(j8);
    }

    public static /* synthetic */ String c(e e8, j j8) {
        return e8.f(j8);
    }

    public final String d(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b.d);
        stringBuilder.append("_");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final String e(j j8) {
        return this.d((String)((Map)j8.b).get((Object)"key"));
    }

    public final String f(j j8) {
        return (String)((Map)j8.b).get((Object)"value");
    }

    public void g(E5.c object, Context context) {
        try {
            this.b = new i5.a(context);
            context = new HandlerThread("com.it_nomads.fluttersecurestorage.worker");
            this.c = context;
            context.start();
            this.d = new Handler(this.c.getLooper());
            this.a = object = new k((E5.c)object, "plugins.it_nomads.com/flutter_secure_storage");
            object.e(this);
            return;
        }
        catch (Exception exception) {
            Log.e((String)"FlutterSecureStoragePl", (String)"Registration failed", (Throwable)exception);
            return;
        }
    }

    @Override
    public void onAttachedToEngine(a.b b8) {
        this.g(b8.b(), b8.a());
    }

    @Override
    public void onDetachedFromEngine(a.b b8) {
        if (this.a != null) {
            this.c.quitSafely();
            this.c = null;
            this.a.e(null);
            this.a = null;
        }
        this.b = null;
    }

    @Override
    public void onMethodCall(j j8, k.d d8) {
        d8 = new a(d8);
        this.d.post((Runnable)new b(j8, d8));
    }

    public static class a
    implements k.d {
        public final k.d a;
        public final Handler b = new Handler(Looper.getMainLooper());

        public a(k.d d8) {
            this.a = d8;
        }

        public static /* synthetic */ void d(a a8, Object object) {
            a8.g(object);
        }

        public static /* synthetic */ void e(a a8, String string2, String string3, Object object) {
            a8.f(string2, string3, object);
        }

        @Override
        public void a(Object object) {
            this.b.post((Runnable)new c(this, object));
        }

        @Override
        public void b(String string2, String string3, Object object) {
            this.b.post((Runnable)new d(this, string2, string3, object));
        }

        @Override
        public void c() {
            Handler handler = this.b;
            k.d d8 = this.a;
            Objects.requireNonNull((Object)d8);
            handler.post((Runnable)new i5.b(d8));
        }

        public final /* synthetic */ void f(String string2, String string3, Object object) {
            this.a.b(string2, string3, object);
        }

        public final /* synthetic */ void g(Object object) {
            this.a.a(object);
        }
    }

    public class b
    implements Runnable {
        public final j o;
        public final k.d p;

        public b(j j8, k.d d8) {
            this.o = j8;
            this.p = d8;
        }

        public final void a(Exception exception) {
            StringWriter stringWriter = new StringWriter();
            exception.printStackTrace(new PrintWriter((Writer)stringWriter));
            this.p.b("Exception encountered", this.o.a, stringWriter.toString());
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive exception aggregation
         */
        public void run() {
            block26 : {
                var1_1 = 0;
                try {
                    e.a((e)e.this).e = (Map)((Map)this.o.b).get((Object)"options");
                    var2_2 = e.a(e.this).g();
                    var4_3 = this.o.a;
                    switch (var4_3.hashCode()) {
                        case 1080375339: {
                            if (!var4_3.equals((Object)"readAll")) break block26;
                            var1_1 = 2;
                            ** GOTO lbl31
                        }
                        case 208013248: {
                            if (!var4_3.equals((Object)"containsKey")) break block26;
                            var1_1 = 3;
                            ** GOTO lbl31
                        }
                        case 113399775: {
                            if (!var4_3.equals((Object)"write")) break block26;
                            ** GOTO lbl31
                        }
                        case 3496342: {
                            if (!var4_3.equals((Object)"read")) break block26;
                            var1_1 = 1;
                            ** GOTO lbl31
                        }
                        case -358737930: {
                            if (!var4_3.equals((Object)"deleteAll")) break block26;
                            var1_1 = 5;
                            ** GOTO lbl31
                        }
                        case -1335458389: {
                            if (!var4_3.equals((Object)"delete")) break block26;
                            var1_1 = 4;
lbl31: // 7 sources:
                            do {
                                var5_9 = null;
                                if (var1_1 == 0) ** GOTO lbl67
                                if (var1_1 == 1) ** GOTO lbl60
                                if (var1_1 == 2) ** GOTO lbl57
                                if (var1_1 == 3) ** GOTO lbl50
                                if (var1_1 != 4) {
                                    if (var1_1 != 5) {
                                        this.p.c();
                                        return;
                                    }
                                    e.a(e.this).e();
                                    var4_3 = this.p;
lbl43: // 5 sources:
                                    do {
                                        var4_3.a(var5_9);
                                        return;
                                        break;
                                    } while (true);
                                }
                                var4_3 = e.b(e.this, this.o);
                                e.a(e.this).d((String)var4_3);
                                var4_3 = this.p;
                                ** GOTO lbl43
lbl50: // 1 sources:
                                var4_3 = e.b(e.this, this.o);
                                var3_10 = e.a(e.this).b((String)var4_3);
                                var5_9 = this.p;
                                var4_3 = var3_10;
lbl54: // 2 sources:
                                do {
                                    var5_9.a(var4_3);
                                    return;
                                    break;
                                } while (true);
lbl57: // 1 sources:
                                var4_3 = this.p;
                                var5_9 = e.a(e.this).m();
                                ** GOTO lbl43
lbl60: // 1 sources:
                                var4_3 = e.b(e.this, this.o);
                                if (e.a(e.this).b((String)var4_3)) {
                                    var4_3 = e.a(e.this).l((String)var4_3);
                                    var5_9 = this.p;
                                    ** continue;
                                }
                                var4_3 = this.p;
                                ** GOTO lbl43
lbl67: // 1 sources:
                                var4_3 = e.b(e.this, this.o);
                                var6_11 = e.c(e.this, this.o);
                                if (var6_11 != null) {
                                    e.a(e.this).n((String)var4_3, var6_11);
                                    var4_3 = this.p;
                                    ** continue;
                                }
                                this.p.b("null", null, null);
                                return;
                                break;
                            } while (true);
                        }
                    }
                    catch (Exception var4_4) {
                        var2_2 = false;
lbl77: // 2 sources:
                        do {
                            if (var2_2) {
                                try {
                                    e.a(e.this).e();
                                    this.p.a("Data has been reset");
                                    return;
                                }
                                catch (Exception var4_6) {
                                    // empty catch block
                                }
                            }
                            this.a((Exception)var4_5);
                            return;
                            break;
                        } while (true);
                    }
                }
                catch (FileNotFoundException var4_7) {
                    ** continue;
                }
lbl87: // 1 sources:
                do {
                    Log.i((String)"Creating sharedPrefs", (String)var4_7.getLocalizedMessage());
                    return;
                    break;
                } while (true);
                break block26;
                {
                    catch (Exception var4_8) {
                        ** continue;
                    }
                }
            }
            var1_1 = -1;
            ** while (true)
        }
    }

}

