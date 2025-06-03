/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package A1;

import A1.e;
import A1.f;
import A1.h;
import O1.C;
import O1.P;
import V5.q;
import V5.s;
import V5.t;
import W5.I;
import W5.m;
import g6.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import kotlin.text.i;
import l6.c;
import org.json.JSONArray;
import org.json.JSONObject;
import x1.F;
import x1.N;

public final class g {
    public static final g a = new g();
    public static final HashSet b = I.c((Object[])new Integer[]{200, 202});
    public static final HashSet c = I.c((Object[])new Integer[]{503, 504, 429});
    public static a d;
    public static List e;
    public static int f;

    public static /* synthetic */ void a(F f8) {
        g.m(f8);
    }

    public static final void d(String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "datasetID");
        Intrinsics.checkNotNullParameter(string3, "url");
        Intrinsics.checkNotNullParameter(string4, "accessKey");
        C.e.c(N.s, "CAPITransformerWebRequests", " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", string2, string3, string4);
        g g8 = a;
        g8.i(new a(string2, string3, string4));
        g8.j((List)new ArrayList());
    }

    public static final void l(F f8) {
        Intrinsics.checkNotNullParameter(f8, "request");
        P p8 = P.a;
        P.B0(new f(f8));
    }

    public static final void m(F f8) {
        Intrinsics.checkNotNullParameter(f8, "$request");
        Object object = f8.r();
        object = object == null ? null : i.V((CharSequence)object, new String[]{"/"}, false, 0, 6, null);
        if (object != null && object.size() == 2) {
            String string2;
            String string3;
            StringBuilder stringBuilder;
            try {
                object = a;
                string2 = object.e().b();
                string3 = object.e().c();
                stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append("/capi/");
                stringBuilder.append(string3);
                stringBuilder.append("/events");
                string2 = stringBuilder.toString();
            }
            catch (s s8) {
                C.e.c(N.t, "CAPITransformerWebRequests", "\n Credentials not initialized Error when logging: \n%s", new Object[]{s8});
                return;
            }
            string3 = object.k(f8);
            if (string3 == null) {
                return;
            }
            object.c((List)string3);
            int n8 = Math.min((int)((Collection)object.f()).size(), (int)10);
            string3 = m.D(object.f(), new c(0, n8 - 1));
            object.f().subList(0, n8).clear();
            stringBuilder = new JSONArray((Collection)string3);
            Object object2 = new LinkedHashMap();
            object2.put((Object)"data", (Object)stringBuilder);
            object2.put((Object)"accessKey", (Object)object.e().a());
            stringBuilder = new JSONObject((Map)object2);
            object2 = C.e;
            N n9 = N.s;
            String string4 = stringBuilder.toString(2);
            Intrinsics.checkNotNullExpressionValue(string4, "jsonBodyStr.toString(2)");
            object2.c(n9, "CAPITransformerWebRequests", "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", string2, f8, string4);
            object.h(string2, "POST", stringBuilder.toString(), W5.C.b(q.a("Content-Type", "application/json")), 60000, new p((List)string3){
                public final /* synthetic */ List o;
                {
                    this.o = list;
                    super(2);
                }

                public static /* synthetic */ void a(Integer n8, List list) {
                    .d(n8, list);
                }

                public static final void d(Integer n8, List list) {
                    Intrinsics.checkNotNullParameter((Object)list, "$processedEvents");
                    if (!m.o((Iterable)b, (Object)n8)) {
                        g.a.g(n8, list, 5);
                    }
                }

                public final void b(String object, Integer n8) {
                    object = P.a;
                    P.B0(new h(n8, this.o));
                }
            });
            return;
        }
        C.e.c(N.t, "CAPITransformerWebRequests", "\n GraphPathComponents Error when logging: \n%s", f8);
    }

    public final void c(List list) {
        int n8;
        if (list != null) {
            this.f().addAll((Collection)list);
        }
        if ((n8 = Math.max((int)0, (int)(((Collection)this.f()).size() - 1000))) > 0) {
            this.j(y.a((Object)m.p((Iterable)this.f(), n8)));
        }
    }

    public final a e() {
        a a8 = d;
        if (a8 != null) {
            return a8;
        }
        Intrinsics.n("credentials");
        throw null;
    }

    public final List f() {
        List list = e;
        if (list != null) {
            return list;
        }
        Intrinsics.n("transformedEvents");
        throw null;
    }

    public final void g(Integer n8, List list, int n9) {
        Intrinsics.checkNotNullParameter((Object)list, "processedEvents");
        if (m.o((Iterable)c, (Object)n8)) {
            if (f >= n9) {
                this.f().clear();
                f = 0;
                return;
            }
            this.f().addAll(0, (Collection)list);
            ++f;
        }
    }

    /*
     * Exception decompiling
     */
    public final void h(String var1_1, String var2_5, String var3_6, Map var4_8, int var5_9, p var6_10) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[TRYBLOCK]], but top level block is 5[CATCHBLOCK]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public final void i(a a8) {
        Intrinsics.checkNotNullParameter(a8, "<set-?>");
        d = a8;
    }

    public final void j(List list) {
        Intrinsics.checkNotNullParameter((Object)list, "<set-?>");
        e = list;
    }

    public final List k(F object) {
        JSONObject jSONObject = object.q();
        if (jSONObject != null) {
            jSONObject = W5.C.o(P.n(jSONObject));
            if ((object = object.w()) != null) {
                jSONObject.put((Object)"custom_events", object);
                object = new StringBuilder();
                for (String string2 : jSONObject.keySet()) {
                    object.append(string2);
                    object.append(" : ");
                    object.append(jSONObject.get((Object)string2));
                    object.append(System.getProperty((String)"line.separator"));
                }
                C.e.c(N.s, "CAPITransformerWebRequests", "\nGraph Request data: \n\n%s \n\n", object);
                return e.a.e((Map)jSONObject);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
        }
        return null;
    }

    public static final class a {
        public final String a;
        public final String b;
        public final String c;

        public a(String string2, String string3, String string4) {
            Intrinsics.checkNotNullParameter(string2, "datasetID");
            Intrinsics.checkNotNullParameter(string3, "cloudBridgeURL");
            Intrinsics.checkNotNullParameter(string4, "accessKey");
            this.a = string2;
            this.b = string3;
            this.c = string4;
        }

        public final String a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.a;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof a)) {
                return false;
            }
            object = (a)object;
            if (!Intrinsics.a(this.a, object.a)) {
                return false;
            }
            if (!Intrinsics.a(this.b, object.b)) {
                return false;
            }
            if (!Intrinsics.a(this.c, object.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CloudBridgeCredentials(datasetID=");
            stringBuilder.append(this.a);
            stringBuilder.append(", cloudBridgeURL=");
            stringBuilder.append(this.b);
            stringBuilder.append(", accessKey=");
            stringBuilder.append(this.c);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }

}

