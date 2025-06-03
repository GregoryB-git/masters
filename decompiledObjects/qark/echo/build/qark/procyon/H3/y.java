// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H3;

import android.os.BaseBundle;
import java.util.concurrent.Executor;
import V2.j;
import android.content.SharedPreferences$Editor;
import android.os.Bundle;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import E3.f;
import android.content.Context;
import V2.k;
import s3.e;
import android.content.SharedPreferences;

public class y
{
    public final SharedPreferences a;
    public final e b;
    public final Object c;
    public k d;
    public boolean e;
    public boolean f;
    public Boolean g;
    public final k h;
    
    public y(final e b) {
        final Object c = new Object();
        this.c = c;
        this.d = new k();
        this.e = false;
        this.f = false;
        this.h = new k();
        final Context m = b.m();
        this.b = b;
        this.a = i.r(m);
        Boolean g;
        if ((g = this.b()) == null) {
            g = this.a(m);
        }
        this.g = g;
        // monitorenter(c)
        while (true) {
            try {
                if (this.d()) {
                    this.d.e(null);
                    this.e = true;
                }
                // monitorexit(c)
                return;
                // monitorexit(c)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static Boolean g(final Context context) {
        try {
            final PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo != null) {
                    final Bundle metaData = applicationInfo.metaData;
                    if (metaData != null && ((BaseBundle)metaData).containsKey("firebase_crashlytics_collection_enabled")) {
                        return ((BaseBundle)applicationInfo.metaData).getBoolean("firebase_crashlytics_collection_enabled");
                    }
                }
            }
        }
        catch (PackageManager$NameNotFoundException ex) {
            f.f().e("Could not read data collection permission from manifest", (Throwable)ex);
        }
        return null;
    }
    
    public static void i(final SharedPreferences sharedPreferences, final Boolean b) {
        final SharedPreferences$Editor edit = sharedPreferences.edit();
        if (b != null) {
            edit.putBoolean("firebase_crashlytics_collection_enabled", (boolean)b);
        }
        else {
            edit.remove("firebase_crashlytics_collection_enabled");
        }
        edit.apply();
    }
    
    public final Boolean a(final Context context) {
        final Boolean g = g(context);
        if (g == null) {
            this.f = false;
            return null;
        }
        this.f = true;
        return Boolean.TRUE.equals(g);
    }
    
    public final Boolean b() {
        if (this.a.contains("firebase_crashlytics_collection_enabled")) {
            this.f = false;
            return this.a.getBoolean("firebase_crashlytics_collection_enabled", true);
        }
        return null;
    }
    
    public void c(final boolean b) {
        if (b) {
            this.h.e(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }
    
    public boolean d() {
        // monitorenter(this)
        while (true) {
            try {
                final Boolean g = this.g;
                boolean b;
                if (g != null) {
                    b = g;
                }
                else {
                    b = this.e();
                }
                this.f(b);
                // monitorexit(this)
                return b;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final boolean e() {
        try {
            return this.b.x();
        }
        catch (IllegalStateException ex) {
            return false;
        }
    }
    
    public final void f(final boolean b) {
        String s;
        if (b) {
            s = "ENABLED";
        }
        else {
            s = "DISABLED";
        }
        String s2;
        if (this.g == null) {
            s2 = "global Firebase setting";
        }
        else if (this.f) {
            s2 = "firebase_crashlytics_collection_enabled manifest flag";
        }
        else {
            s2 = "API";
        }
        E3.f.f().b(String.format("Crashlytics automatic data collection %s by %s.", s, s2));
    }
    
    public void h(final Boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_1        
        //     3: ifnull          117
        //     6: aload_0        
        //     7: iconst_0       
        //     8: putfield        H3/y.f:Z
        //    11: goto            117
        //    14: aload_0        
        //    15: aload_0        
        //    16: getfield        H3/y.b:Ls3/e;
        //    19: invokevirtual   s3/e.m:()Landroid/content/Context;
        //    22: invokevirtual   H3/y.a:(Landroid/content/Context;)Ljava/lang/Boolean;
        //    25: astore_2       
        //    26: aload_0        
        //    27: aload_2        
        //    28: putfield        H3/y.g:Ljava/lang/Boolean;
        //    31: aload_0        
        //    32: getfield        H3/y.a:Landroid/content/SharedPreferences;
        //    35: aload_1        
        //    36: invokestatic    H3/y.i:(Landroid/content/SharedPreferences;Ljava/lang/Boolean;)V
        //    39: aload_0        
        //    40: getfield        H3/y.c:Ljava/lang/Object;
        //    43: astore_1       
        //    44: aload_1        
        //    45: monitorenter   
        //    46: aload_0        
        //    47: invokevirtual   H3/y.d:()Z
        //    50: ifeq            77
        //    53: aload_0        
        //    54: getfield        H3/y.e:Z
        //    57: ifne            100
        //    60: aload_0        
        //    61: getfield        H3/y.d:LV2/k;
        //    64: aconst_null    
        //    65: invokevirtual   V2/k.e:(Ljava/lang/Object;)Z
        //    68: pop            
        //    69: aload_0        
        //    70: iconst_1       
        //    71: putfield        H3/y.e:Z
        //    74: goto            100
        //    77: aload_0        
        //    78: getfield        H3/y.e:Z
        //    81: ifeq            100
        //    84: aload_0        
        //    85: new             LV2/k;
        //    88: dup            
        //    89: invokespecial   V2/k.<init>:()V
        //    92: putfield        H3/y.d:LV2/k;
        //    95: aload_0        
        //    96: iconst_0       
        //    97: putfield        H3/y.e:Z
        //   100: aload_1        
        //   101: monitorexit    
        //   102: aload_0        
        //   103: monitorexit    
        //   104: return         
        //   105: aload_1        
        //   106: monitorexit    
        //   107: aload_2        
        //   108: athrow         
        //   109: aload_0        
        //   110: monitorexit    
        //   111: aload_1        
        //   112: athrow         
        //   113: astore_1       
        //   114: goto            109
        //   117: aload_1        
        //   118: ifnull          14
        //   121: aload_1        
        //   122: astore_2       
        //   123: goto            26
        //   126: astore_2       
        //   127: goto            105
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  6      11     113    117    Any
        //  14     26     113    117    Any
        //  26     46     113    117    Any
        //  46     74     126    109    Any
        //  77     100    126    109    Any
        //  100    102    126    109    Any
        //  105    107    126    109    Any
        //  107    109    113    117    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0077:
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
    
    public j j() {
        synchronized (this.c) {
            return this.d.a();
        }
    }
    
    public j k(final Executor executor) {
        return c0.o(executor, this.h.a(), this.j());
    }
}
