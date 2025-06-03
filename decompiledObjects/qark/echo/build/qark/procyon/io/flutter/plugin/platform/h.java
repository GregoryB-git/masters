// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.plugin.platform;

import android.view.View$OnSystemUiVisibilityChangeListener;
import android.graphics.Bitmap;
import android.app.ActivityManager$TaskDescription;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.view.View;
import android.content.Intent;
import android.view.Window;
import android.os.Build$VERSION;
import I.X;
import java.util.List;
import D5.o;
import android.app.Activity;

public class h
{
    public final Activity a;
    public final o b;
    public final d c;
    public o.j d;
    public int e;
    public final o.h f;
    
    public h(final Activity a, final o b, final d c) {
        final o.h f = new o.h() {
            @Override
            public void a() {
                h.this.t();
            }
            
            @Override
            public void f(final boolean b) {
                h.this.w(b);
            }
            
            @Override
            public void g(final k k) {
                h.this.z(k);
            }
            
            @Override
            public void h(final List list) {
                h.this.A(list);
            }
            
            @Override
            public void i(final i i) {
                h.this.s(i);
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
            public void l(final String s) {
                h.this.v(s);
            }
            
            @Override
            public void m(final c c) {
                h.this.x(c);
            }
            
            @Override
            public void n(final g g) {
                h.this.F(g);
            }
            
            @Override
            public CharSequence o(final e e) {
                return h.this.r(e);
            }
            
            @Override
            public void p(final int n) {
                h.this.B(n);
            }
            
            @Override
            public void q(final String s) {
                h.this.D(s);
            }
            
            @Override
            public boolean r() {
                return h.this.p();
            }
            
            @Override
            public void s(final j j) {
                h.this.C(j);
            }
        };
        this.f = f;
        this.a = a;
        (this.b = b).l((o.h)f);
        this.c = c;
        this.e = 1280;
    }
    
    public final void A(final List list) {
        int e;
        if (list.size() == 0) {
            e = 5894;
        }
        else {
            e = 1798;
        }
        for (int i = 0; i < list.size(); ++i) {
            final int n = h$c.b[list.get(i).ordinal()];
            if (n != 1) {
                if (n == 2) {
                    e &= 0xFFFFFDFD;
                }
            }
            else {
                e &= 0xFFFFFFFB;
            }
        }
        this.e = e;
        this.E();
    }
    
    public final void B(final int requestedOrientation) {
        this.a.setRequestedOrientation(requestedOrientation);
    }
    
    public final void C(final o.j d) {
        final Window window = this.a.getWindow();
        final X x = new X(window, window.getDecorView());
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        final o.d b = d.b;
        if (b != null) {
            final int n = h$c.c[b.ordinal()];
            if (n != 1) {
                if (n == 2) {
                    x.b(false);
                }
            }
            else {
                x.b(true);
            }
        }
        final Integer a = d.a;
        if (a != null) {
            window.setStatusBarColor((int)a);
        }
        final Boolean c = d.c;
        if (c != null && sdk_INT >= 29) {
            io.flutter.plugin.platform.c.a(window, (boolean)c);
        }
        if (sdk_INT >= 26) {
            final o.d e = d.e;
            if (e != null) {
                final int n2 = h$c.c[e.ordinal()];
                if (n2 != 1) {
                    if (n2 == 2) {
                        x.a(false);
                    }
                }
                else {
                    x.a(true);
                }
            }
            final Integer d2 = d.d;
            if (d2 != null) {
                window.setNavigationBarColor((int)d2);
            }
        }
        final Integer f = d.f;
        if (f != null && sdk_INT >= 28) {
            d.a(window, (int)f);
        }
        final Boolean g = d.g;
        if (g != null && sdk_INT >= 29) {
            io.flutter.plugin.platform.e.a(window, (boolean)g);
        }
        this.d = d;
    }
    
    public final void D(final String s) {
        final Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", s);
        this.a.startActivity(Intent.createChooser(intent, (CharSequence)null));
    }
    
    public void E() {
        this.a.getWindow().getDecorView().setSystemUiVisibility(this.e);
        final o.j d = this.d;
        if (d != null) {
            this.C(d);
        }
    }
    
    public void F(final o.g g) {
        final View decorView = this.a.getWindow().getDecorView();
        final int n = h$c.a[g.ordinal()];
        int n2 = 1;
        int n3 = 0;
        Label_0064: {
            if (n != 1) {
                if (n != 2) {
                    n2 = 3;
                    if (n != 3) {
                        n2 = 4;
                        if (n == 4) {
                            n3 = 6;
                            break Label_0064;
                        }
                        if (n != 5) {
                            return;
                        }
                    }
                }
                decorView.performHapticFeedback(n2);
                return;
            }
            n3 = 0;
        }
        decorView.performHapticFeedback(n3);
    }
    
    public final boolean p() {
        final ClipboardManager clipboardManager = (ClipboardManager)this.a.getSystemService("clipboard");
        if (!clipboardManager.hasPrimaryClip()) {
            return false;
        }
        final ClipDescription primaryClipDescription = clipboardManager.getPrimaryClipDescription();
        return primaryClipDescription != null && primaryClipDescription.hasMimeType("text/*");
    }
    
    public void q() {
        this.b.l(null);
    }
    
    public final CharSequence r(final o.e p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        io/flutter/plugin/platform/h.a:Landroid/app/Activity;
        //     4: ldc_w           "clipboard"
        //     7: invokevirtual   android/app/Activity.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
        //    10: checkcast       Landroid/content/ClipboardManager;
        //    13: astore_3       
        //    14: aload_3        
        //    15: invokevirtual   android/content/ClipboardManager.hasPrimaryClip:()Z
        //    18: istore_2       
        //    19: aconst_null    
        //    20: astore          4
        //    22: iload_2        
        //    23: ifne            28
        //    26: aconst_null    
        //    27: areturn        
        //    28: aload_3        
        //    29: invokevirtual   android/content/ClipboardManager.getPrimaryClip:()Landroid/content/ClipData;
        //    32: astore_3       
        //    33: aload_3        
        //    34: ifnonnull       39
        //    37: aconst_null    
        //    38: areturn        
        //    39: aload_1        
        //    40: ifnull          53
        //    43: aload_1        
        //    44: getstatic       D5/o$e.p:LD5/o$e;
        //    47: if_acmpne       268
        //    50: goto            53
        //    53: aload_3        
        //    54: iconst_0       
        //    55: invokevirtual   android/content/ClipData.getItemAt:(I)Landroid/content/ClipData$Item;
        //    58: astore          5
        //    60: aload           5
        //    62: invokevirtual   android/content/ClipData$Item.getText:()Ljava/lang/CharSequence;
        //    65: astore_3       
        //    66: aload_3        
        //    67: astore_1       
        //    68: aload_3        
        //    69: ifnonnull       227
        //    72: aload_3        
        //    73: astore_1       
        //    74: aload           5
        //    76: invokevirtual   android/content/ClipData$Item.getUri:()Landroid/net/Uri;
        //    79: astore          6
        //    81: aload           6
        //    83: ifnonnull       99
        //    86: aload_3        
        //    87: astore_1       
        //    88: ldc_w           "PlatformPlugin"
        //    91: ldc_w           "Clipboard item contained no textual content nor a URI to retrieve it from."
        //    94: invokestatic    t5/b.g:(Ljava/lang/String;Ljava/lang/String;)V
        //    97: aconst_null    
        //    98: areturn        
        //    99: aload_3        
        //   100: astore_1       
        //   101: aload           6
        //   103: invokevirtual   android/net/Uri.getScheme:()Ljava/lang/String;
        //   106: astore          4
        //   108: aload_3        
        //   109: astore_1       
        //   110: aload           4
        //   112: ldc_w           "content"
        //   115: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   118: ifne            179
        //   121: aload_3        
        //   122: astore_1       
        //   123: new             Ljava/lang/StringBuilder;
        //   126: dup            
        //   127: invokespecial   java/lang/StringBuilder.<init>:()V
        //   130: astore          5
        //   132: aload_3        
        //   133: astore_1       
        //   134: aload           5
        //   136: ldc_w           "Clipboard item contains a Uri with scheme '"
        //   139: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   142: pop            
        //   143: aload_3        
        //   144: astore_1       
        //   145: aload           5
        //   147: aload           4
        //   149: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   152: pop            
        //   153: aload_3        
        //   154: astore_1       
        //   155: aload           5
        //   157: ldc_w           "'that is unhandled."
        //   160: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   163: pop            
        //   164: aload_3        
        //   165: astore_1       
        //   166: ldc_w           "PlatformPlugin"
        //   169: aload           5
        //   171: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   174: invokestatic    t5/b.g:(Ljava/lang/String;Ljava/lang/String;)V
        //   177: aconst_null    
        //   178: areturn        
        //   179: aload_3        
        //   180: astore_1       
        //   181: aload_0        
        //   182: getfield        io/flutter/plugin/platform/h.a:Landroid/app/Activity;
        //   185: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //   188: aload           6
        //   190: ldc_w           "text/*"
        //   193: aconst_null    
        //   194: invokevirtual   android/content/ContentResolver.openTypedAssetFileDescriptor:(Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/res/AssetFileDescriptor;
        //   197: astore          4
        //   199: aload_3        
        //   200: astore_1       
        //   201: aload           5
        //   203: aload_0        
        //   204: getfield        io/flutter/plugin/platform/h.a:Landroid/app/Activity;
        //   207: invokevirtual   android/content/ClipData$Item.coerceToText:(Landroid/content/Context;)Ljava/lang/CharSequence;
        //   210: astore_3       
        //   211: aload_3        
        //   212: astore_1       
        //   213: aload           4
        //   215: ifnull          227
        //   218: aload_3        
        //   219: astore_1       
        //   220: aload           4
        //   222: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //   225: aload_3        
        //   226: astore_1       
        //   227: aload_1        
        //   228: areturn        
        //   229: ldc_w           "PlatformPlugin"
        //   232: ldc_w           "Failed to close AssetFileDescriptor while trying to read text from URI."
        //   235: aload_3        
        //   236: invokestatic    t5/b.h:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   239: aload_1        
        //   240: areturn        
        //   241: ldc_w           "PlatformPlugin"
        //   244: ldc_w           "Clipboard text was unable to be received from content URI."
        //   247: invokestatic    t5/b.g:(Ljava/lang/String;Ljava/lang/String;)V
        //   250: aconst_null    
        //   251: areturn        
        //   252: ldc_w           "PlatformPlugin"
        //   255: ldc_w           "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview"
        //   258: aload_1        
        //   259: invokestatic    t5/b.h:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
        //   262: aconst_null    
        //   263: areturn        
        //   264: astore_1       
        //   265: goto            241
        //   268: aconst_null    
        //   269: areturn        
        //   270: astore_3       
        //   271: aload           4
        //   273: astore_1       
        //   274: goto            229
        //   277: astore_1       
        //   278: goto            252
        //   281: astore_3       
        //   282: goto            229
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  28     33     277    264    Ljava/lang/SecurityException;
        //  28     33     264    252    Ljava/io/FileNotFoundException;
        //  28     33     270    277    Ljava/io/IOException;
        //  43     50     277    264    Ljava/lang/SecurityException;
        //  43     50     264    252    Ljava/io/FileNotFoundException;
        //  43     50     270    277    Ljava/io/IOException;
        //  53     66     277    264    Ljava/lang/SecurityException;
        //  53     66     264    252    Ljava/io/FileNotFoundException;
        //  53     66     270    277    Ljava/io/IOException;
        //  74     81     277    264    Ljava/lang/SecurityException;
        //  74     81     264    252    Ljava/io/FileNotFoundException;
        //  74     81     281    285    Ljava/io/IOException;
        //  88     97     277    264    Ljava/lang/SecurityException;
        //  88     97     264    252    Ljava/io/FileNotFoundException;
        //  88     97     281    285    Ljava/io/IOException;
        //  101    108    277    264    Ljava/lang/SecurityException;
        //  101    108    264    252    Ljava/io/FileNotFoundException;
        //  101    108    281    285    Ljava/io/IOException;
        //  110    121    277    264    Ljava/lang/SecurityException;
        //  110    121    264    252    Ljava/io/FileNotFoundException;
        //  110    121    281    285    Ljava/io/IOException;
        //  123    132    277    264    Ljava/lang/SecurityException;
        //  123    132    264    252    Ljava/io/FileNotFoundException;
        //  123    132    281    285    Ljava/io/IOException;
        //  134    143    277    264    Ljava/lang/SecurityException;
        //  134    143    264    252    Ljava/io/FileNotFoundException;
        //  134    143    281    285    Ljava/io/IOException;
        //  145    153    277    264    Ljava/lang/SecurityException;
        //  145    153    264    252    Ljava/io/FileNotFoundException;
        //  145    153    281    285    Ljava/io/IOException;
        //  155    164    277    264    Ljava/lang/SecurityException;
        //  155    164    264    252    Ljava/io/FileNotFoundException;
        //  155    164    281    285    Ljava/io/IOException;
        //  166    177    277    264    Ljava/lang/SecurityException;
        //  166    177    264    252    Ljava/io/FileNotFoundException;
        //  166    177    281    285    Ljava/io/IOException;
        //  181    199    277    264    Ljava/lang/SecurityException;
        //  181    199    264    252    Ljava/io/FileNotFoundException;
        //  181    199    281    285    Ljava/io/IOException;
        //  201    211    277    264    Ljava/lang/SecurityException;
        //  201    211    264    252    Ljava/io/FileNotFoundException;
        //  201    211    281    285    Ljava/io/IOException;
        //  220    225    277    264    Ljava/lang/SecurityException;
        //  220    225    264    252    Ljava/io/FileNotFoundException;
        //  220    225    281    285    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0099:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void s(final o.i i) {
        if (i == o.i.p) {
            this.a.getWindow().getDecorView().playSoundEffect(0);
        }
    }
    
    public final void t() {
        final d c = this.c;
        if (c != null && c.a()) {
            return;
        }
        final Activity a = this.a;
        if (a instanceof androidx.activity.c) {
            ((androidx.activity.c)a).j().c();
            return;
        }
        a.finish();
    }
    
    public final void u() {
        this.E();
    }
    
    public final void v(final String s) {
        ((ClipboardManager)this.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText((CharSequence)"text label?", (CharSequence)s));
    }
    
    public final void w(final boolean b) {
        final d c = this.c;
        if (c != null) {
            c.f(b);
        }
    }
    
    public final void x(final o.c c) {
        if (Build$VERSION.SDK_INT < 28) {
            this.a.setTaskDescription(new ActivityManager$TaskDescription(c.b, (Bitmap)null, c.a));
            return;
        }
        g.a();
        this.a.setTaskDescription(io.flutter.plugin.platform.f.a(c.b, 0, c.a));
    }
    
    public final void y() {
        final View decorView = this.a.getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener((View$OnSystemUiVisibilityChangeListener)new View$OnSystemUiVisibilityChangeListener() {
            public void onSystemUiVisibilityChange(final int n) {
                decorView.post((Runnable)new i(this, n));
            }
        });
    }
    
    public final void z(final o.k k) {
        int e;
        if (k == o.k.p) {
            e = 1798;
        }
        else if (k == o.k.q) {
            e = 3846;
        }
        else if (k == o.k.r) {
            e = 5894;
        }
        else {
            if (k != o.k.s || Build$VERSION.SDK_INT < 29) {
                return;
            }
            e = 1792;
        }
        this.e = e;
        this.E();
    }
    
    public interface d
    {
        boolean a();
        
        void f(final boolean p0);
    }
}
