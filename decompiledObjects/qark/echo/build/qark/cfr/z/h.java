/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.content.res.Resources$Theme
 *  android.content.res.XmlResourceParser
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Log
 *  android.util.TypedValue
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ThreadLocal
 *  java.lang.Throwable
 *  java.util.WeakHashMap
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package z;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import z.e;
import z.i;
import z.j;

public abstract class h {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static Drawable a(Resources resources, int n8, Resources.Theme theme) {
        return a.a(resources, n8, theme);
    }

    public static Typeface b(Context context, int n8, TypedValue typedValue, int n9, b b8) {
        if (context.isRestricted()) {
            return null;
        }
        return h.c(context, n8, typedValue, n9, b8, null, true, false);
    }

    public static Typeface c(Context context, int n8, TypedValue typedValue, int n9, b b8, Handler handler, boolean bl, boolean bl2) {
        Resources resources = context.getResources();
        resources.getValue(n8, typedValue, true);
        context = h.d(context, resources, typedValue, n8, n9, b8, handler, bl, bl2);
        if (context == null && b8 == null) {
            if (bl2) {
                return context;
            }
            context = new StringBuilder();
            context.append("Font resource ID #0x");
            context.append(Integer.toHexString((int)n8));
            context.append(" could not be retrieved.");
            throw new Resources.NotFoundException(context.toString());
        }
        return context;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static Typeface d(Context var0, Resources var1_6, TypedValue var2_7, int var3_8, int var4_9, b var5_10, Handler var6_11, boolean var7_12, boolean var8_13) {
        block14 : {
            block13 : {
                block12 : {
                    var10_14 = var2_7.string;
                    if (var10_14 == null) {
                        var0 = new StringBuilder();
                        var0.append("Resource \"");
                        var0.append(var1_6.getResourceName(var3_8));
                        var0.append("\" (");
                        var0.append(Integer.toHexString((int)var3_8));
                        var0.append(") is not a Font: ");
                        var0.append(var2_7);
                        throw new Resources.NotFoundException(var0.toString());
                    }
                    if (!(var10_14 = var10_14.toString()).startsWith("res/")) {
                        if (var5_10 == null) return null;
                        var5_10.c(-3, var6_11);
                        return null;
                    }
                    var11_15 = A.h.f(var1_6, var3_8, (String)var10_14, var2_7.assetCookie, var4_9);
                    if (var11_15 != null) {
                        if (var5_10 == null) return var11_15;
                        var5_10.d((Typeface)var11_15, var6_11);
                        return var11_15;
                    }
                    if (var8_13) {
                        return null;
                    }
                    if (!var10_14.toLowerCase().endsWith(".xml")) ** GOTO lbl33
                    var11_15 = e.b((XmlPullParser)var1_6.getXml(var3_8), var1_6);
                    if (var11_15 == null) {
                        Log.e((String)"ResourcesCompat", (String)"Failed to find font-family tag");
                        if (var5_10 == null) return null;
                        var5_10.c(-3, var6_11);
                        return null;
                    }
                    var9_16 = var2_7.assetCookie;
                    return A.h.c(var0, (e.b)var11_15, var1_6, var3_8, (String)var10_14, var9_16, var4_9, var5_10, var6_11, var7_12);
lbl33: // 1 sources:
                    var0 = A.h.d(var0, var1_6, var3_8, (String)var10_14, var2_7.assetCookie, var4_9);
                    if (var5_10 == null) return var0;
                    if (var0 != null) {
                        var5_10.d((Typeface)var0, var6_11);
                        return var0;
                    }
                    var5_10.c(-3, var6_11);
                    return var0;
                    catch (IOException var0_2) {
                        break block12;
                    }
                    catch (XmlPullParserException var0_3) {
                        break block13;
                    }
                    catch (IOException var0_4) {}
                }
                var1_6 = new StringBuilder();
                var2_7 = "Failed to read xml resource ";
                break block14;
                catch (XmlPullParserException var0_5) {}
            }
            var1_6 = new StringBuilder();
            var2_7 = "Failed to parse xml resource ";
        }
        var1_6.append((String)var2_7);
        var1_6.append((String)var10_14);
        Log.e((String)"ResourcesCompat", (String)var1_6.toString(), (Throwable)var0_1);
        if (var5_10 == null) return null;
        var5_10.c(-3, var6_11);
        return null;
    }

    public static abstract class a {
        public static Drawable a(Resources resources, int n8, Resources.Theme theme) {
            return resources.getDrawable(n8, theme);
        }

        public static Drawable b(Resources resources, int n8, int n9, Resources.Theme theme) {
            return resources.getDrawableForDensity(n8, n9, theme);
        }
    }

    public static abstract class b {
        public static /* synthetic */ void a(b b8, Typeface typeface) {
            b8.g(typeface);
        }

        public static /* synthetic */ void b(b b8, int n8) {
            b8.f(n8);
        }

        public static Handler e(Handler handler) {
            Handler handler2 = handler;
            if (handler == null) {
                handler2 = new Handler(Looper.getMainLooper());
            }
            return handler2;
        }

        public final void c(int n8, Handler handler) {
            b.e(handler).post((Runnable)new j(this, n8));
        }

        public final void d(Typeface typeface, Handler handler) {
            b.e(handler).post((Runnable)new i(this, typeface));
        }

        public final /* synthetic */ void f(int n8) {
            this.h(n8);
        }

        public final /* synthetic */ void g(Typeface typeface) {
            this.i(typeface);
        }

        public abstract void h(int var1);

        public abstract void i(Typeface var1);
    }

}

