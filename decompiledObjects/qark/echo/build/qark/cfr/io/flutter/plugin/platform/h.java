/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.ActivityManager
 *  android.app.ActivityManager$TaskDescription
 *  android.content.ClipData
 *  android.content.ClipData$Item
 *  android.content.ClipDescription
 *  android.content.ClipboardManager
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.AssetFileDescriptor
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnSystemUiVisibilityChangeListener
 *  android.view.Window
 *  java.io.FileNotFoundException
 *  java.io.IOException
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.List
 */
package io.flutter.plugin.platform;

import D5.o;
import I.X;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import io.flutter.plugin.platform.c;
import io.flutter.plugin.platform.e;
import io.flutter.plugin.platform.f;
import io.flutter.plugin.platform.g;
import io.flutter.plugin.platform.i;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import t5.b;

public class h {
    public final Activity a;
    public final o b;
    public final d c;
    public o.j d;
    public int e;
    public final o.h f;

    public h(Activity activity, o o8, d d8) {
        o.h h8;
        this.f = h8 = new o.h(){

            @Override
            public void a() {
                h.this.t();
            }

            @Override
            public void f(boolean bl) {
                h.this.w(bl);
            }

            @Override
            public void g(o.k k8) {
                h.this.z(k8);
            }

            @Override
            public void h(List list) {
                h.this.A(list);
            }

            @Override
            public void i(o.i i8) {
                h.this.s(i8);
            }

            @Override
            public void j() {
                h.this.y();
            }

            @Override
            public void k() {
                h.this.u();
            }

            @Override
            public void l(String string2) {
                h.this.v(string2);
            }

            @Override
            public void m(o.c c8) {
                h.this.x(c8);
            }

            @Override
            public void n(o.g g8) {
                h.this.F(g8);
            }

            @Override
            public CharSequence o(o.e e8) {
                return h.this.r(e8);
            }

            @Override
            public void p(int n8) {
                h.this.B(n8);
            }

            @Override
            public void q(String string2) {
                h.this.D(string2);
            }

            @Override
            public boolean r() {
                return h.this.p();
            }

            @Override
            public void s(o.j j8) {
                h.this.C(j8);
            }
        };
        this.a = activity;
        this.b = o8;
        o8.l(h8);
        this.c = d8;
        this.e = 1280;
    }

    public final void A(List list) {
        int n8 = list.size() == 0 ? 5894 : 1798;
        for (int i8 = 0; i8 < list.size(); ++i8) {
            o.l l8 = (o.l)((Object)list.get(i8));
            int n9 = .b[l8.ordinal()];
            if (n9 != 1) {
                if (n9 != 2) continue;
                n8 &= -515;
                continue;
            }
            n8 &= -5;
        }
        this.e = n8;
        this.E();
    }

    public final void B(int n8) {
        this.a.setRequestedOrientation(n8);
    }

    public final void C(o.j j8) {
        int n8;
        o.d d8;
        Window window = this.a.getWindow();
        X x8 = new X(window, window.getDecorView());
        int n9 = Build.VERSION.SDK_INT;
        if (n9 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        if ((d8 = j8.b) != null) {
            n8 = .c[d8.ordinal()];
            if (n8 != 1) {
                if (n8 == 2) {
                    x8.b(false);
                }
            } else {
                x8.b(true);
            }
        }
        if ((d8 = j8.a) != null) {
            window.setStatusBarColor(d8.intValue());
        }
        if ((d8 = j8.c) != null && n9 >= 29) {
            c.a(window, d8.booleanValue());
        }
        if (n9 >= 26) {
            d8 = j8.e;
            if (d8 != null) {
                n8 = .c[d8.ordinal()];
                if (n8 != 1) {
                    if (n8 == 2) {
                        x8.a(false);
                    }
                } else {
                    x8.a(true);
                }
            }
            if ((x8 = j8.d) != null) {
                window.setNavigationBarColor(x8.intValue());
            }
        }
        if ((x8 = j8.f) != null && n9 >= 28) {
            io.flutter.plugin.platform.d.a(window, x8.intValue());
        }
        if ((x8 = j8.g) != null && n9 >= 29) {
            e.a(window, x8.booleanValue());
        }
        this.d = j8;
    }

    public final void D(String string2) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", string2);
        this.a.startActivity(Intent.createChooser((Intent)intent, (CharSequence)null));
    }

    public void E() {
        this.a.getWindow().getDecorView().setSystemUiVisibility(this.e);
        o.j j8 = this.d;
        if (j8 != null) {
            this.C(j8);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void F(o.g var1_1) {
        block5 : {
            block4 : {
                var4_2 = this.a.getWindow().getDecorView();
                var3_3 = .a[var1_1.ordinal()];
                var2_4 = 1;
                if (var3_3 == 1) break block4;
                if (var3_3 == 2) ** GOTO lbl-1000
                var2_4 = 3;
                if (var3_3 != 3) {
                    var2_4 = 4;
                    if (var3_3 != 4) {
                        if (var3_3 != 5) {
                            return;
                        } else {
                            ** GOTO lbl-1000
                        }
                    }
                } else lbl-1000: // 4 sources:
                {
                    var4_2.performHapticFeedback(var2_4);
                    return;
                }
                var2_4 = 6;
                break block5;
            }
            var2_4 = 0;
        }
        var4_2.performHapticFeedback(var2_4);
    }

    public final boolean p() {
        ClipboardManager clipboardManager = (ClipboardManager)this.a.getSystemService("clipboard");
        if (!clipboardManager.hasPrimaryClip()) {
            return false;
        }
        if ((clipboardManager = clipboardManager.getPrimaryClipDescription()) == null) {
            return false;
        }
        return clipboardManager.hasMimeType("text/*");
    }

    public void q() {
        this.b.l(null);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final CharSequence r(o.e e8) {
        void var3_5;
        block12 : {
            ClipboardManager clipboardManager = (ClipboardManager)this.a.getSystemService("clipboard");
            boolean bl = clipboardManager.hasPrimaryClip();
            String string2 = null;
            if (!bl) {
                return null;
            }
            try {
                clipboardManager = clipboardManager.getPrimaryClip();
                if (clipboardManager == null) {
                    return null;
                }
                if (e8 != null) {
                    if (e8 != o.e.p) return null;
                }
                ClipData.Item item = clipboardManager.getItemAt(0);
                clipboardManager = item.getText();
                e8 = clipboardManager;
                if (clipboardManager != null) return e8;
                e8 = clipboardManager;
                Uri uri = item.getUri();
                if (uri == null) {
                    e8 = clipboardManager;
                    b.g("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                    return null;
                }
                e8 = clipboardManager;
                string2 = uri.getScheme();
                e8 = clipboardManager;
                if (!string2.equals((Object)"content")) {
                    e8 = clipboardManager;
                    item = new StringBuilder();
                    e8 = clipboardManager;
                    item.append("Clipboard item contains a Uri with scheme '");
                    e8 = clipboardManager;
                    item.append(string2);
                    e8 = clipboardManager;
                    item.append("'that is unhandled.");
                    e8 = clipboardManager;
                    b.g("PlatformPlugin", item.toString());
                    return null;
                }
                e8 = clipboardManager;
                string2 = this.a.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                e8 = clipboardManager;
                clipboardManager = item.coerceToText((Context)this.a);
                e8 = clipboardManager;
                if (string2 == null) return e8;
                e8 = clipboardManager;
                string2.close();
                return clipboardManager;
            }
            catch (FileNotFoundException fileNotFoundException) {}
            b.g("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
            return null;
            catch (IOException iOException) {
                e8 = string2;
                break block12;
            }
            catch (SecurityException securityException) {}
            b.h("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", (Throwable)securityException);
            return null;
            catch (IOException iOException) {}
        }
        b.h("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", (Throwable)var3_5);
        return e8;
    }

    public final void s(o.i i8) {
        if (i8 == o.i.p) {
            this.a.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    public final void t() {
        d d8 = this.c;
        if (d8 != null && d8.a()) {
            return;
        }
        d8 = this.a;
        if (d8 instanceof androidx.activity.c) {
            ((androidx.activity.c)((Object)d8)).j().c();
            return;
        }
        d8.finish();
    }

    public final void u() {
        this.E();
    }

    public final void v(String string2) {
        ((ClipboardManager)this.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText((CharSequence)"text label?", (CharSequence)string2));
    }

    public final void w(boolean bl) {
        d d8 = this.c;
        if (d8 != null) {
            d8.f(bl);
        }
    }

    public final void x(o.c c8) {
        if (Build.VERSION.SDK_INT < 28) {
            this.a.setTaskDescription(new ActivityManager.TaskDescription(c8.b, null, c8.a));
            return;
        }
        g.a();
        c8 = f.a(c8.b, 0, c8.a);
        this.a.setTaskDescription((ActivityManager.TaskDescription)c8);
    }

    public final void y() {
        final View view = this.a.getWindow().getDecorView();
        view.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener(){

            public static /* synthetic */ void a( b8, int n8) {
                b8.b(n8);
            }

            /*
             * Enabled aggressive block sorting
             */
            public final /* synthetic */ void b(int n8) {
                o o8;
                boolean bl;
                if ((n8 & 4) == 0) {
                    o8 = h.this.b;
                    bl = true;
                } else {
                    o8 = h.this.b;
                    bl = false;
                }
                o8.m(bl);
            }

            public void onSystemUiVisibilityChange(int n8) {
                view.post((Runnable)new i(this, n8));
            }
        });
    }

    public final void z(o.k k8) {
        block6 : {
            int n8;
            block3 : {
                block5 : {
                    block4 : {
                        block2 : {
                            if (k8 != o.k.p) break block2;
                            n8 = 1798;
                            break block3;
                        }
                        if (k8 != o.k.q) break block4;
                        n8 = 3846;
                        break block3;
                    }
                    if (k8 != o.k.r) break block5;
                    n8 = 5894;
                    break block3;
                }
                if (k8 != o.k.s || Build.VERSION.SDK_INT < 29) break block6;
                n8 = 1792;
            }
            this.e = n8;
            this.E();
        }
    }

    public static interface d {
        public boolean a();

        public void f(boolean var1);
    }

}

