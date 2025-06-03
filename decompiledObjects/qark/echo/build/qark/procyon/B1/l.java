// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B1;

import android.os.BaseBundle;
import android.util.Base64;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.ByteArrayOutputStream;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.x;
import x1.N;
import O1.C;
import x1.K;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import android.view.View;
import org.json.JSONException;
import C1.f;
import org.json.JSONArray;
import org.json.JSONObject;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import O1.z;
import x1.F;
import x1.B;
import O1.P;
import T1.a;
import java.util.TimerTask;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import android.app.Activity;
import kotlin.jvm.internal.g;
import java.util.Timer;
import java.lang.ref.WeakReference;
import android.os.Handler;

public final class l
{
    public static final a e;
    public static final String f;
    public static l g;
    public final Handler a;
    public final WeakReference b;
    public Timer c;
    public String d;
    
    static {
        e = new a(null);
        String canonicalName;
        if ((canonicalName = l.class.getCanonicalName()) == null) {
            canonicalName = "";
        }
        f = canonicalName;
    }
    
    public l(final Activity referent) {
        Intrinsics.checkNotNullParameter(referent, "activity");
        this.b = new WeakReference((T)referent);
        this.d = null;
        this.a = new Handler(Looper.getMainLooper());
        l.g = this;
    }
    
    public static final /* synthetic */ WeakReference c(final l l) {
        if (T1.a.d(l.class)) {
            return null;
        }
        try {
            return l.b;
        }
        finally {
            final Throwable t;
            T1.a.b(t, l.class);
            return null;
        }
    }
    
    public static final /* synthetic */ String d() {
        if (T1.a.d(l.class)) {
            return null;
        }
        try {
            return l.f;
        }
        finally {
            final Throwable t;
            T1.a.b(t, l.class);
            return null;
        }
    }
    
    public static final /* synthetic */ Handler e(final l l) {
        if (T1.a.d(l.class)) {
            return null;
        }
        try {
            return l.a;
        }
        finally {
            final Throwable t;
            T1.a.b(t, l.class);
            return null;
        }
    }
    
    public static final /* synthetic */ void f(final l l, final String s) {
        if (T1.a.d(l.class)) {
            return;
        }
        try {
            l.j(s);
        }
        finally {
            final Throwable t;
            T1.a.b(t, l.class);
        }
    }
    
    public static final void i(final l p0, final TimerTask p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     5: ifeq            9
        //     8: return         
        //     9: aload_0        
        //    10: ldc             "this$0"
        //    12: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    15: aload_1        
        //    16: ldc             "$indexingTask"
        //    18: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    21: aload_0        
        //    22: getfield        B1/l.c:Ljava/util/Timer;
        //    25: astore_2       
        //    26: aload_2        
        //    27: ifnonnull       33
        //    30: goto            37
        //    33: aload_2        
        //    34: invokevirtual   java/util/Timer.cancel:()V
        //    37: aload_0        
        //    38: aconst_null    
        //    39: putfield        B1/l.d:Ljava/lang/String;
        //    42: new             Ljava/util/Timer;
        //    45: dup            
        //    46: invokespecial   java/util/Timer.<init>:()V
        //    49: astore_2       
        //    50: aload_2        
        //    51: aload_1        
        //    52: lconst_0       
        //    53: ldc2_w          1000
        //    56: invokevirtual   java/util/Timer.scheduleAtFixedRate:(Ljava/util/TimerTask;JJ)V
        //    59: aload_0        
        //    60: aload_2        
        //    61: putfield        B1/l.c:Ljava/util/Timer;
        //    64: return         
        //    65: astore_0       
        //    66: goto            81
        //    69: astore_0       
        //    70: getstatic       B1/l.f:Ljava/lang/String;
        //    73: ldc             "Error scheduling indexing job"
        //    75: aload_0        
        //    76: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    79: pop            
        //    80: return         
        //    81: aload_0        
        //    82: ldc             LB1/l;.class
        //    84: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //    87: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  9      21     65     69     Any
        //  21     26     69     81     Ljava/lang/Exception;
        //  21     26     65     69     Any
        //  33     37     69     81     Ljava/lang/Exception;
        //  33     37     65     69     Any
        //  37     64     69     81     Ljava/lang/Exception;
        //  37     64     65     69     Any
        //  70     80     65     69     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0033:
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
    
    public static final void k(final String s, final l l) {
        if (T1.a.d(l.class)) {
            return;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(s, "$tree");
                Intrinsics.checkNotNullParameter(l, "this$0");
                final String m0 = P.m0(s);
                final x1.a e = x1.a.z.e();
                if (m0 != null && Intrinsics.a(m0, l.d)) {
                    return;
                }
                l.g(l.e.b(s, e, B.m(), "app_indexing"), m0);
                return;
                final Throwable t;
                T1.a.b(t, l.class);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void g(final F p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     4: ifeq            8
        //     7: return         
        //     8: aload_1        
        //     9: ifnonnull       13
        //    12: return         
        //    13: aload_1        
        //    14: invokevirtual   x1/F.k:()Lx1/K;
        //    17: astore_1       
        //    18: aload_1        
        //    19: invokevirtual   x1/K.c:()Lorg/json/JSONObject;
        //    22: astore_3       
        //    23: aload_3        
        //    24: ifnull          82
        //    27: ldc             "true"
        //    29: aload_3        
        //    30: ldc             "success"
        //    32: invokevirtual   org/json/JSONObject.optString:(Ljava/lang/String;)Ljava/lang/String;
        //    35: invokestatic    kotlin/jvm/internal/Intrinsics.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    38: ifeq            63
        //    41: getstatic       O1/C.e:LO1/C$a;
        //    44: getstatic       x1/N.s:Lx1/N;
        //    47: getstatic       B1/l.f:Ljava/lang/String;
        //    50: ldc             "Successfully send UI component tree to server"
        //    52: invokevirtual   O1/C$a.b:(Lx1/N;Ljava/lang/String;Ljava/lang/String;)V
        //    55: aload_0        
        //    56: aload_2        
        //    57: putfield        B1/l.d:Ljava/lang/String;
        //    60: goto            63
        //    63: aload_3        
        //    64: ldc             "is_app_indexing_enabled"
        //    66: invokevirtual   org/json/JSONObject.has:(Ljava/lang/String;)Z
        //    69: ifeq            109
        //    72: aload_3        
        //    73: ldc             "is_app_indexing_enabled"
        //    75: invokevirtual   org/json/JSONObject.getBoolean:(Ljava/lang/String;)Z
        //    78: invokestatic    B1/e.n:(Z)V
        //    81: return         
        //    82: getstatic       B1/l.f:Ljava/lang/String;
        //    85: ldc             "Error sending UI component tree to Facebook: "
        //    87: aload_1        
        //    88: invokevirtual   x1/K.b:()Lx1/r;
        //    91: invokestatic    kotlin/jvm/internal/Intrinsics.i:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
        //    94: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //    97: pop            
        //    98: return         
        //    99: getstatic       B1/l.f:Ljava/lang/String;
        //   102: ldc             "Error decoding server response."
        //   104: aload_1        
        //   105: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   108: pop            
        //   109: return         
        //   110: aload_1        
        //   111: aload_0        
        //   112: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //   115: return         
        //   116: astore_1       
        //   117: goto            110
        //   120: astore_1       
        //   121: goto            99
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  13     18     116    120    Any
        //  18     23     120    109    Lorg/json/JSONException;
        //  18     23     116    120    Any
        //  27     60     120    109    Lorg/json/JSONException;
        //  27     60     116    120    Any
        //  63     81     120    109    Lorg/json/JSONException;
        //  63     81     116    120    Any
        //  82     98     120    109    Lorg/json/JSONException;
        //  82     98     116    120    Any
        //  99     109    116    120    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0063:
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
    
    public final void h() {
        if (T1.a.d(this)) {
            return;
        }
        Object o = null;
        Label_0051: {
            TimerTask timerTask;
            try {
                timerTask = new TimerTask() {
                    public final /* synthetic */ l o;
                    
                    @Override
                    public void run() {
                        while (true) {
                            try {
                                final Activity activity = (Activity)l.c(this.o).get();
                                final View e = G1.g.e(activity);
                                if (activity == null) {
                                    return;
                                }
                                if (e == null) {
                                    return;
                                }
                                final String simpleName = activity.getClass().getSimpleName();
                                if (!B1.e.h()) {
                                    return;
                                }
                                if (z.b()) {
                                    C1.e.a();
                                    return;
                                }
                                Object o = new FutureTask<String>(new b(e));
                                l.e(this.o).post((Runnable)o);
                                String s = "";
                                try {
                                    o = (s = ((FutureTask<String>)o).get(1L, TimeUnit.SECONDS));
                                }
                                catch (Exception o) {
                                    Log.e(l.d(), "Failed to take screenshot.", (Throwable)o);
                                }
                                o = new JSONObject();
                                while (true) {
                                    try {
                                        ((JSONObject)o).put("screenname", (Object)simpleName);
                                        ((JSONObject)o).put("screenshot", (Object)s);
                                        final JSONArray jsonArray = new JSONArray();
                                        jsonArray.put((Object)C1.f.d(e));
                                        ((JSONObject)o).put("view", (Object)jsonArray);
                                        while (true) {
                                            final String string = ((JSONObject)o).toString();
                                            Intrinsics.checkNotNullExpressionValue(string, "viewTree.toString()");
                                            l.f(this.o, string);
                                            return;
                                            Log.e(l.d(), "Failed to create JSONObject");
                                            continue;
                                        }
                                        final Exception ex;
                                        Log.e(l.d(), "UI Component tree indexing failure!", (Throwable)ex);
                                        return;
                                    }
                                    catch (JSONException ex3) {}
                                    continue;
                                }
                            }
                            catch (Exception ex2) {}
                            final Exception ex2;
                            final Exception ex = ex2;
                            continue;
                        }
                    }
                };
                final Executor executor = B.t();
                final l l = this;
                final TimerTask timerTask2 = timerTask;
                final i i = new i(l, timerTask2);
                executor.execute(i);
                return;
            }
            finally {
                final Object o2;
                o = o2;
                break Label_0051;
            }
            try {
                final Executor executor = B.t();
                final l l = this;
                final TimerTask timerTask2 = timerTask;
                final i i = new i(l, timerTask2);
                executor.execute(i);
                return;
            }
            catch (RejectedExecutionException ex) {
                Log.e(l.f, "Error scheduling indexing job", (Throwable)ex);
                return;
            }
        }
        T1.a.b((Throwable)o, this);
    }
    
    public final void j(final String s) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            B.t().execute(new j(s, this));
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public final void l() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     4: ifeq            8
        //     7: return         
        //     8: aload_0        
        //     9: getfield        B1/l.b:Ljava/lang/ref/WeakReference;
        //    12: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //    15: checkcast       Landroid/app/Activity;
        //    18: astore_1       
        //    19: aload_1        
        //    20: ifnonnull       24
        //    23: return         
        //    24: aload_0        
        //    25: getfield        B1/l.c:Ljava/util/Timer;
        //    28: astore_1       
        //    29: aload_1        
        //    30: ifnonnull       36
        //    33: goto            40
        //    36: aload_1        
        //    37: invokevirtual   java/util/Timer.cancel:()V
        //    40: aload_0        
        //    41: aconst_null    
        //    42: putfield        B1/l.c:Ljava/util/Timer;
        //    45: return         
        //    46: astore_1       
        //    47: goto            63
        //    50: astore_1       
        //    51: getstatic       B1/l.f:Ljava/lang/String;
        //    54: ldc_w           "Error unscheduling indexing job"
        //    57: aload_1        
        //    58: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    61: pop            
        //    62: return         
        //    63: aload_1        
        //    64: aload_0        
        //    65: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //    68: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  8      19     46     50     Any
        //  24     29     50     63     Ljava/lang/Exception;
        //  24     29     46     50     Any
        //  36     40     50     63     Ljava/lang/Exception;
        //  36     40     46     50     Any
        //  40     45     50     63     Ljava/lang/Exception;
        //  40     45     46     50     Any
        //  51     62     46     50     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0024:
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
    
    public static final class a
    {
        public static final void c(final K k) {
            Intrinsics.checkNotNullParameter(k, "it");
            C.e.b(N.s, l.d(), "App index sent to FB!");
        }
        
        public final F b(final String s, final x1.a a, String format, final String s2) {
            Intrinsics.checkNotNullParameter(s2, "requestType");
            if (s == null) {
                return null;
            }
            final F.c n = F.n;
            final x a2 = x.a;
            format = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[] { format }, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            final F a3 = n.A(a, format, null, null);
            Bundle u;
            if ((u = a3.u()) == null) {
                u = new Bundle();
            }
            ((BaseBundle)u).putString("tree", s);
            ((BaseBundle)u).putString("app_version", G1.g.d());
            ((BaseBundle)u).putString("platform", "android");
            ((BaseBundle)u).putString("request_type", s2);
            if (Intrinsics.a(s2, "app_indexing")) {
                ((BaseBundle)u).putString("device_session_id", B1.e.g());
            }
            a3.G(u);
            a3.C((F.b)new k());
            return a3;
        }
    }
    
    public static final class b implements Callable
    {
        public final WeakReference o;
        
        public b(final View referent) {
            Intrinsics.checkNotNullParameter(referent, "rootView");
            this.o = new WeakReference((T)referent);
        }
        
        public String a() {
            final View view = (View)this.o.get();
            if (view != null && view.getWidth() != 0 && view.getHeight() != 0) {
                final Bitmap bitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap$Config.RGB_565);
                view.draw(new Canvas(bitmap));
                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap$CompressFormat.JPEG, 10, (OutputStream)byteArrayOutputStream);
                final String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(outputStream.toByteArray(), Base64.NO_WRAP)");
                return encodeToString;
            }
            return "";
        }
    }
}
