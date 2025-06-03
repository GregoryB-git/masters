/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.graphics.fonts.FontVariationAxis
 *  android.os.CancellationSignal
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalAccessException
 *  java.lang.InstantiationException
 *  java.lang.Integer
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Array
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.nio.ByteBuffer
 */
package A;

import A.i;
import A.n;
import F.g;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import z.e;

public class k
extends i {
    public final Class g;
    public final Constructor h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;
    public final Method m;

    public k() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Class class_;
        Method method5;
        StringBuilder stringBuilder;
        block3 : {
            try {
                class_ = this.v();
                stringBuilder = this.w(class_);
                method3 = this.s(class_);
                method2 = this.t(class_);
                method5 = this.x(class_);
                method4 = this.r(class_);
                method = this.u(class_);
                break block3;
            }
            catch (NoSuchMethodException noSuchMethodException) {
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to collect necessary methods for class ");
            stringBuilder.append(class_.getClass().getName());
            Log.e((String)"TypefaceCompatApi26Impl", (String)stringBuilder.toString(), (Throwable)class_);
            Object var9_10 = null;
            Object var8_11 = null;
            class_ = var8_11;
            stringBuilder = class_;
            method = method2 = (method3 = stringBuilder);
            method4 = method2;
            method5 = method3;
            method2 = stringBuilder;
            method3 = class_;
            stringBuilder = var8_11;
            class_ = var9_10;
        }
        this.g = class_;
        this.h = stringBuilder;
        this.i = method3;
        this.j = method2;
        this.k = method5;
        this.l = method4;
        this.m = method;
    }

    @Override
    public Typeface a(Context context, e.c c8, Resources resources, int n8) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    @Override
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] arrb, int n8) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    @Override
    public Typeface d(Context context, Resources object, int n8, String string2, int n9) {
        if (!this.q()) {
            return n.super.d(context, (Resources)object, n8, string2, n9);
        }
        object = this.l();
        if (object == null) {
            return null;
        }
        if (!this.n(context, object, string2, 0, -1, -1, null)) {
            this.m(object);
            return null;
        }
        if (!this.p(object)) {
            return null;
        }
        return this.i(object);
    }

    public Typeface i(Object object) {
        try {
            Object object2 = Array.newInstance((Class)this.g, (int)1);
            Array.set((Object)object2, (int)0, (Object)object);
            object = (Typeface)this.m.invoke((Object)null, new Object[]{object2, -1, -1});
            return object;
        }
        catch (IllegalAccessException | InvocationTargetException invocationTargetException) {
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object l() {
        try {
            return this.h.newInstance(new Object[0]);
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException illegalAccessException) {
            return null;
        }
    }

    public final void m(Object object) {
        try {
            this.l.invoke(object, new Object[0]);
            return;
        }
        catch (IllegalAccessException | InvocationTargetException invocationTargetException) {
            return;
        }
    }

    public final boolean n(Context context, Object object, String string2, int n8, int n9, int n10, FontVariationAxis[] arrfontVariationAxis) {
        try {
            boolean bl = (Boolean)this.i.invoke(object, new Object[]{context.getAssets(), string2, 0, Boolean.FALSE, n8, n9, n10, arrfontVariationAxis});
            return bl;
        }
        catch (IllegalAccessException | InvocationTargetException invocationTargetException) {
            return false;
        }
    }

    public final boolean o(Object object, ByteBuffer byteBuffer, int n8, int n9, int n10) {
        try {
            boolean bl = (Boolean)this.j.invoke(object, new Object[]{byteBuffer, n8, null, n9, n10});
            return bl;
        }
        catch (IllegalAccessException | InvocationTargetException illegalAccessException) {
            return false;
        }
    }

    public final boolean p(Object object) {
        try {
            boolean bl = (Boolean)this.k.invoke(object, new Object[0]);
            return bl;
        }
        catch (IllegalAccessException | InvocationTargetException illegalAccessException) {
            return false;
        }
    }

    public final boolean q() {
        if (this.i == null) {
            Log.w((String)"TypefaceCompatApi26Impl", (String)"Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (this.i != null) {
            return true;
        }
        return false;
    }

    public Method r(Class class_) {
        return class_.getMethod("abortCreation", new Class[0]);
    }

    public Method s(Class class_) {
        Class class_2 = Integer.TYPE;
        return class_.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, class_2, Boolean.TYPE, class_2, class_2, class_2, FontVariationAxis[].class});
    }

    public Method t(Class class_) {
        Class class_2 = Integer.TYPE;
        return class_.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, class_2, FontVariationAxis[].class, class_2, class_2});
    }

    public Method u(Class class_) {
        class_ = Array.newInstance((Class)class_, (int)1).getClass();
        Class class_2 = Integer.TYPE;
        class_ = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{class_, class_2, class_2});
        class_.setAccessible(true);
        return class_;
    }

    public Class v() {
        return Class.forName((String)"android.graphics.FontFamily");
    }

    public Constructor w(Class class_) {
        return class_.getConstructor(new Class[0]);
    }

    public Method x(Class class_) {
        return class_.getMethod("freeze", new Class[0]);
    }
}

