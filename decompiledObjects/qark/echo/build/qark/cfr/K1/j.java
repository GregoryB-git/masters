/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  java.lang.Exception
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.util.HashSet
 *  java.util.Set
 *  org.json.JSONObject
 */
package K1;

import H1.f;
import K1.b;
import K1.c;
import K1.e;
import K1.h;
import K1.i;
import O1.P;
import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import org.json.JSONObject;
import x1.B;
import y1.F;

public final class j
implements View.OnClickListener {
    public static final a s = new a(null);
    public static final Set t = new HashSet();
    public final View.OnClickListener o;
    public final WeakReference p;
    public final WeakReference q;
    public final String r;

    public j(View object, View view, String string2) {
        this.o = C1.f.g((View)object);
        this.p = new WeakReference((Object)view);
        this.q = new WeakReference(object);
        if (string2 != null) {
            object = string2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(object, "(this as java.lang.String).toLowerCase()");
            this.r = kotlin.text.i.q((String)object, "activity", "", false, 4, null);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public /* synthetic */ j(View view, View view2, String string2, g g8) {
        this(view, view2, string2);
    }

    public static /* synthetic */ void a(JSONObject jSONObject, String string2, j j8, String string3) {
        j.d(jSONObject, string2, j8, string3);
    }

    public static final /* synthetic */ Set b() {
        if (T1.a.d(j.class)) {
            return null;
        }
        try {
            Set set = t;
            return set;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, j.class);
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void d(JSONObject arrf, String string2, j arrstring, String string3) {
        if (T1.a.d(j.class)) {
            return;
        }
        try {
            block8 : {
                Intrinsics.checkNotNullParameter(arrf, "$viewData");
                Intrinsics.checkNotNullParameter(string2, "$buttonText");
                Intrinsics.checkNotNullParameter(arrstring, "this$0");
                Intrinsics.checkNotNullParameter(string3, "$pathID");
                try {
                    Object object = P.a;
                    object = P.u(B.l());
                    if (object == null) throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    object = object.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(object, "(this as java.lang.String).toLowerCase()");
                    arrf = K1.a.a((JSONObject)arrf, (String)object);
                    arrstring = K1.a.c(string2, arrstring.r, (String)object);
                    if (arrf == null) {
                        return;
                    }
                    object = f.a;
                    String[] arrstring2 = new String[]{arrstring};
                    arrstring = f.q(f.a.p, new float[][]{arrf}, arrstring2);
                    if (arrstring != null) break block8;
                    return;
                }
                catch (Exception exception) {
                    return;
                }
            }
            arrstring = arrstring[0];
            b.a(string3, (String)arrstring);
            if (Intrinsics.a(arrstring, "other")) return;
            {
                s.e((String)arrstring, string2, arrf);
                return;
            }
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, j.class);
    }

    public final void c(String string2, String string3, JSONObject jSONObject) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            P p8 = P.a;
            P.B0(new h(jSONObject, string3, this, string2));
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return;
        }
    }

    public final void e() {
        Throwable throwable2;
        block10 : {
            block7 : {
                View view;
                String string2;
                String string3;
                View view2;
                block9 : {
                    block8 : {
                        if (T1.a.d(this)) {
                            return;
                        }
                        try {
                            view = (View)this.p.get();
                            view2 = (View)this.q.get();
                            if (view == null) break block7;
                            if (view2 != null) break block8;
                            return;
                        }
                        catch (Throwable throwable2) {
                            break block10;
                        }
                    }
                    string2 = c.d(view2);
                    string3 = b.b(view2, string2);
                    if (string3 != null) break block9;
                    return;
                }
                try {
                    if (s.f(string3, string2)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("view", (Object)c.b(view, view2));
                    jSONObject.put("screenname", (Object)this.r);
                    this.c(string3, string2, jSONObject);
                    return;
                }
                catch (Exception exception) {
                    return;
                }
            }
            return;
        }
        T1.a.b(throwable2, this);
        return;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onClick(View view) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)view, "view");
            View.OnClickListener onClickListener = this.o;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            this.e();
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return;
        }
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public static /* synthetic */ void a(String string2, String string3) {
            a.g(string2, string3);
        }

        public static final void g(String string2, String string3) {
            Intrinsics.checkNotNullParameter(string2, "$queriedEvent");
            Intrinsics.checkNotNullParameter(string3, "$buttonText");
            j.s.e(string2, string3, new float[0]);
        }

        public final void d(View view, View view2, String string2) {
            Intrinsics.checkNotNullParameter((Object)view, "hostView");
            Intrinsics.checkNotNullParameter((Object)view2, "rootView");
            Intrinsics.checkNotNullParameter(string2, "activityName");
            int n8 = view.hashCode();
            if (!j.b().contains((Object)n8)) {
                C1.f f8 = C1.f.a;
                C1.f.r(view, new j(view, view2, string2, null));
                j.b().add((Object)n8);
            }
        }

        public final void e(String string2, String string3, float[] arrf) {
            if (e.f(string2)) {
                new F(B.l()).e(string2, string3);
                return;
            }
            if (e.e(string2)) {
                this.h(string2, string3, arrf);
            }
        }

        public final boolean f(String string2, String string3) {
            if ((string2 = b.d(string2)) == null) {
                return false;
            }
            if (!Intrinsics.a(string2, "other")) {
                P p8 = P.a;
                P.B0(new i(string2, string3));
            }
            return true;
        }

        /*
         * Exception decompiling
         */
        public final void h(String var1_1, String var2_3, float[] var3_4) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[FORLOOP]], but top level block is 1[TRYBLOCK]
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
            // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
            // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
            // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
            // org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:682)
            // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:765)
            // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
            // org.benf.cfr.reader.Main.doJar(Main.java:134)
            // org.benf.cfr.reader.Main.main(Main.java:189)
            throw new IllegalStateException("Decompilation failed");
        }
    }

}

