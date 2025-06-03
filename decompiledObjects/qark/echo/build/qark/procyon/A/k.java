// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A;

import android.content.res.AssetManager;
import java.nio.ByteBuffer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Array;
import android.graphics.fonts.FontVariationAxis;
import F.g;
import android.os.CancellationSignal;
import android.graphics.Typeface;
import android.content.res.Resources;
import z.e;
import android.content.Context;
import java.io.Serializable;
import android.util.Log;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class k extends i
{
    public final Class g;
    public final Constructor h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;
    public final Method m;
    
    public k() {
        Serializable v = null;
        Constructor w = null;
        Method s = null;
        Method t = null;
        Method x = null;
        Method r = null;
        Method u = null;
        Label_0133: {
            try {
                v = this.v();
                w = this.w((Class)v);
                s = this.s((Class)v);
                t = this.t((Class)v);
                x = this.x((Class)v);
                r = this.r((Class)v);
                u = this.u((Class)v);
                break Label_0133;
            }
            catch (NoSuchMethodException v) {}
            catch (ClassNotFoundException ex) {}
            final StringBuilder sb = new StringBuilder();
            sb.append("Unable to collect necessary methods for class ");
            sb.append(((Class)v).getClass().getName());
            Log.e("TypefaceCompatApi26Impl", sb.toString(), (Throwable)v);
            final Throwable t2 = null;
            final Method method2;
            final Method method = method2 = null;
            final Method method4;
            final Method method3 = method4 = method2;
            u = (r = method4);
            x = method4;
            t = method3;
            s = method2;
            w = (Constructor)method;
            v = t2;
        }
        this.g = (Class)v;
        this.h = w;
        this.i = s;
        this.j = t;
        this.k = x;
        this.l = r;
        this.m = u;
    }
    
    @Override
    public Typeface a(final Context context, final e.c c, final Resources resources, final int n) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    @Override
    public Typeface b(final Context context, final CancellationSignal cancellationSignal, final g.b[] array, final int n) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    @Override
    public Typeface d(final Context context, final Resources resources, final int n, final String s, final int n2) {
        if (!this.q()) {
            return super.d(context, resources, n, s, n2);
        }
        final Object l = this.l();
        if (l == null) {
            return null;
        }
        if (!this.n(context, l, s, 0, -1, -1, null)) {
            this.m(l);
            return null;
        }
        if (!this.p(l)) {
            return null;
        }
        return this.i(l);
    }
    
    public Typeface i(final Object o) {
        try {
            final Object instance = Array.newInstance(this.g, 1);
            Array.set(instance, 0, o);
            return (Typeface)this.m.invoke(null, instance, -1, -1);
        }
        catch (IllegalAccessException | InvocationTargetException ex) {
            return null;
        }
    }
    
    public final Object l() {
        try {
            return this.h.newInstance(new Object[0]);
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException ex) {
            return null;
        }
    }
    
    public final void m(final Object obj) {
        try {
            this.l.invoke(obj, new Object[0]);
        }
        catch (IllegalAccessException | InvocationTargetException ex) {}
    }
    
    public final boolean n(final Context context, final Object obj, final String s, final int i, final int j, final int k, final FontVariationAxis[] array) {
        try {
            return (boolean)this.i.invoke(obj, context.getAssets(), s, 0, Boolean.FALSE, i, j, k, array);
        }
        catch (IllegalAccessException | InvocationTargetException ex) {
            return false;
        }
    }
    
    public final boolean o(final Object obj, final ByteBuffer byteBuffer, final int i, final int j, final int k) {
        try {
            return (boolean)this.j.invoke(obj, byteBuffer, i, null, j, k);
        }
        catch (IllegalAccessException | InvocationTargetException ex) {
            return false;
        }
    }
    
    public final boolean p(final Object obj) {
        try {
            return (boolean)this.k.invoke(obj, new Object[0]);
        }
        catch (IllegalAccessException | InvocationTargetException ex) {
            return false;
        }
    }
    
    public final boolean q() {
        if (this.i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.i != null;
    }
    
    public Method r(final Class clazz) {
        return clazz.getMethod("abortCreation", (Class[])new Class[0]);
    }
    
    public Method s(final Class clazz) {
        final Class<Integer> type = Integer.TYPE;
        return clazz.getMethod("addFontFromAssetManager", AssetManager.class, String.class, type, Boolean.TYPE, type, type, type, FontVariationAxis[].class);
    }
    
    public Method t(final Class clazz) {
        final Class<Integer> type = Integer.TYPE;
        return clazz.getMethod("addFontFromBuffer", ByteBuffer.class, type, FontVariationAxis[].class, type, type);
    }
    
    public Method u(Class class1) {
        class1 = Array.newInstance(class1, 1).getClass();
        final Class<Integer> type = Integer.TYPE;
        final Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", class1, type, type);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
    
    public Class v() {
        return Class.forName("android.graphics.FontFamily");
    }
    
    public Constructor w(final Class clazz) {
        return clazz.getConstructor((Class[])new Class[0]);
    }
    
    public Method x(final Class clazz) {
        return clazz.getMethod("freeze", (Class[])new Class[0]);
    }
}
