// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package K1;

import android.os.BaseBundle;
import org.json.JSONException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.x;
import android.os.Bundle;
import y1.F;
import x1.B;
import O1.P;
import T1.a;
import org.json.JSONObject;
import kotlin.text.i;
import kotlin.jvm.internal.Intrinsics;
import C1.f;
import android.view.View;
import java.util.HashSet;
import kotlin.jvm.internal.g;
import java.lang.ref.WeakReference;
import java.util.Set;
import android.view.View$OnClickListener;

public final class j implements View$OnClickListener
{
    public static final a s;
    public static final Set t;
    public final View$OnClickListener o;
    public final WeakReference p;
    public final WeakReference q;
    public final String r;
    
    static {
        s = new a(null);
        t = new HashSet();
    }
    
    public j(final View referent, final View referent2, final String s) {
        this.o = f.g(referent);
        this.p = new WeakReference((T)referent2);
        this.q = new WeakReference((T)referent);
        if (s != null) {
            final String lowerCase = s.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            this.r = i.q(lowerCase, "activity", "", false, 4, null);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }
    
    public static final /* synthetic */ Set b() {
        if (T1.a.d(j.class)) {
            return null;
        }
        try {
            return j.t;
        }
        finally {
            final Throwable t;
            T1.a.b(t, j.class);
            return null;
        }
    }
    
    public static final void d(final JSONObject jsonObject, final String s, final j j, final String s2) {
        if (T1.a.d(j.class)) {
            return;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(jsonObject, "$viewData");
                Intrinsics.checkNotNullParameter(s, "$buttonText");
                Intrinsics.checkNotNullParameter(j, "this$0");
                Intrinsics.checkNotNullParameter(s2, "$pathID");
                try {
                    final P a = P.a;
                    final String u = P.u(B.l());
                    if (u == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    final String lowerCase = u.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                    final float[] a2 = K1.a.a(jsonObject, lowerCase);
                    final String c = K1.a.c(s, j.r, lowerCase);
                    if (a2 == null) {
                        return;
                    }
                    final H1.f a3 = H1.f.a;
                    final String[] q = H1.f.q(H1.f.a.p, new float[][] { a2 }, new String[] { c });
                    if (q == null) {
                        return;
                    }
                    final String s3 = q[0];
                    b.a(s2, s3);
                    if (!Intrinsics.a(s3, "other")) {
                        j.s.e(s3, s, a2);
                        return;
                    }
                    return;
                    final Throwable t;
                    T1.a.b(t, j.class);
                    return;
                }
                catch (Exception ex) {
                    return;
                }
            }
            finally {}
            final Throwable t2;
            final Throwable t = t2;
            continue;
        }
    }
    
    public final void c(final String s, final String s2, final JSONObject jsonObject) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            final P a = P.a;
            P.B0(new h(jsonObject, s2, this, s));
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public final void e() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     4: ifeq            8
        //     7: return         
        //     8: aload_0        
        //     9: getfield        K1/j.p:Ljava/lang/ref/WeakReference;
        //    12: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //    15: checkcast       Landroid/view/View;
        //    18: astore_1       
        //    19: aload_0        
        //    20: getfield        K1/j.q:Ljava/lang/ref/WeakReference;
        //    23: invokevirtual   java/lang/ref/Reference.get:()Ljava/lang/Object;
        //    26: checkcast       Landroid/view/View;
        //    29: astore_2       
        //    30: aload_1        
        //    31: ifnull          118
        //    34: aload_2        
        //    35: ifnonnull       39
        //    38: return         
        //    39: aload_2        
        //    40: invokestatic    K1/c.d:(Landroid/view/View;)Ljava/lang/String;
        //    43: astore_3       
        //    44: aload_2        
        //    45: aload_3        
        //    46: invokestatic    K1/b.b:(Landroid/view/View;Ljava/lang/String;)Ljava/lang/String;
        //    49: astore          4
        //    51: aload           4
        //    53: ifnonnull       57
        //    56: return         
        //    57: getstatic       K1/j.s:LK1/j$a;
        //    60: aload           4
        //    62: aload_3        
        //    63: invokestatic    K1/j$a.c:(LK1/j$a;Ljava/lang/String;Ljava/lang/String;)Z
        //    66: ifeq            70
        //    69: return         
        //    70: new             Lorg/json/JSONObject;
        //    73: dup            
        //    74: invokespecial   org/json/JSONObject.<init>:()V
        //    77: astore          5
        //    79: aload           5
        //    81: ldc             "view"
        //    83: aload_1        
        //    84: aload_2        
        //    85: invokestatic    K1/c.b:(Landroid/view/View;Landroid/view/View;)Lorg/json/JSONObject;
        //    88: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //    91: pop            
        //    92: aload           5
        //    94: ldc             "screenname"
        //    96: aload_0        
        //    97: getfield        K1/j.r:Ljava/lang/String;
        //   100: invokevirtual   org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
        //   103: pop            
        //   104: aload_0        
        //   105: aload           4
        //   107: aload_3        
        //   108: aload           5
        //   110: invokevirtual   K1/j.c:(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V
        //   113: return         
        //   114: astore_1       
        //   115: goto            119
        //   118: return         
        //   119: aload_1        
        //   120: aload_0        
        //   121: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //   124: return         
        //   125: astore_1       
        //   126: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  8      30     114    118    Any
        //  39     51     125    127    Ljava/lang/Exception;
        //  39     51     114    118    Any
        //  57     69     125    127    Ljava/lang/Exception;
        //  57     69     114    118    Any
        //  70     113    125    127    Ljava/lang/Exception;
        //  70     113    114    118    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0039:
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
    
    public void onClick(final View view) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            final View$OnClickListener o = this.o;
            if (o != null) {
                o.onClick(view);
            }
            this.e();
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public static final class a
    {
        public static final void g(final String s, final String s2) {
            Intrinsics.checkNotNullParameter(s, "$queriedEvent");
            Intrinsics.checkNotNullParameter(s2, "$buttonText");
            j.s.e(s, s2, new float[0]);
        }
        
        public final void d(final View view, final View view2, final String s) {
            Intrinsics.checkNotNullParameter(view, "hostView");
            Intrinsics.checkNotNullParameter(view2, "rootView");
            Intrinsics.checkNotNullParameter(s, "activityName");
            final int hashCode = view.hashCode();
            if (!j.b().contains(hashCode)) {
                final f a = f.a;
                f.r(view, (View$OnClickListener)new j(view, view2, s, null));
                j.b().add(hashCode);
            }
        }
        
        public final void e(final String s, final String s2, final float[] array) {
            if (e.f(s)) {
                new F(B.l()).e(s, s2);
                return;
            }
            if (e.e(s)) {
                this.h(s, s2, array);
            }
        }
        
        public final boolean f(String d, final String s) {
            d = b.d(d);
            if (d == null) {
                return false;
            }
            if (!Intrinsics.a(d, "other")) {
                final P a = P.a;
                P.B0(new K1.i(d, s));
            }
            return true;
        }
        
        public final void h(final String s, String format, final float[] array) {
            final Bundle bundle = new Bundle();
            try {
                ((BaseBundle)bundle).putString("event_name", s);
                final JSONObject jsonObject = new JSONObject();
                final StringBuilder sb = new StringBuilder();
                final int length = array.length;
                int i = 0;
                while (i < length) {
                    final float f = array[i];
                    ++i;
                    sb.append(f);
                    sb.append(",");
                }
                jsonObject.put("dense", (Object)sb.toString());
                jsonObject.put("button_text", (Object)format);
                ((BaseBundle)bundle).putString("metadata", jsonObject.toString());
                final x1.F.c n = x1.F.n;
                final x a = x.a;
                format = String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[] { B.m() }, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                final x1.F a2 = n.A(null, format, null, null);
                a2.G(bundle);
                a2.k();
            }
            catch (JSONException ex) {}
        }
    }
}
