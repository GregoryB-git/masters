// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H1;

import android.os.BaseBundle;
import G1.k;
import kotlin.jvm.internal.g;
import java.util.Arrays;
import org.json.JSONException;
import java.util.Locale;
import kotlin.text.i;
import x1.F;
import android.text.TextUtils;
import android.os.Bundle;
import java.util.Iterator;
import java.util.ArrayList;
import V5.l;
import kotlin.jvm.internal.Intrinsics;
import java.io.File;
import K1.e;
import android.content.SharedPreferences;
import O1.n;
import org.json.JSONObject;
import x1.B;
import O1.P;
import T1.a;
import org.json.JSONArray;
import W5.m;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;

public final class f
{
    public static final f a;
    public static final Map b;
    public static final List c;
    public static final List d;
    
    static {
        a = new f();
        b = new ConcurrentHashMap();
        c = m.i("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");
        d = m.i("none", "address", "health");
    }
    
    public static final /* synthetic */ float[] d(final f f, final JSONArray jsonArray) {
        if (T1.a.d(f.class)) {
            return null;
        }
        try {
            return f.o(jsonArray);
        }
        finally {
            final Throwable t;
            T1.a.b(t, f.class);
            return null;
        }
    }
    
    public static final void f() {
        if (T1.a.d(f.class)) {
            return;
        }
        try {
            final P a = P.a;
            P.B0(new H1.c());
        }
        finally {
            final Throwable t;
            T1.a.b(t, f.class);
        }
    }
    
    public static final void g() {
        if (T1.a.d(f.class)) {
            return;
        }
        while (true) {
            try {
                final SharedPreferences sharedPreferences = B.l().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
                final String string = sharedPreferences.getString("models", (String)null);
                JSONObject k;
                if (string != null && string.length() != 0) {
                    k = new JSONObject(string);
                }
                else {
                    k = new JSONObject();
                }
                final long long1 = sharedPreferences.getLong("model_request_timestamp", 0L);
                final n a = n.a;
                if (!n.g(n.b.A) || k.length() == 0 || !f.a.n(long1)) {
                    k = f.a.k();
                    if (k == null) {
                        return;
                    }
                    sharedPreferences.edit().putString("models", k.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                }
                final f a2 = f.a;
                a2.e(k);
                a2.h();
                return;
                final Throwable t;
                T1.a.b(t, f.class);
                return;
            }
            catch (Exception ex) {
                return;
            }
            final Throwable t2;
            final Throwable t = t2;
            continue;
        }
    }
    
    public static final void i() {
        if (T1.a.d(f.class)) {
            return;
        }
        try {
            e.b();
        }
        finally {
            final Throwable t;
            T1.a.b(t, f.class);
        }
    }
    
    public static final void j() {
        if (T1.a.d(f.class)) {
            return;
        }
        try {
            F1.a.a();
        }
        finally {
            final Throwable t;
            T1.a.b(t, f.class);
        }
    }
    
    public static final File l(final a a) {
        if (a.d(f.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(a, "task");
            final b b = f.b.get(a.h());
            if (b == null) {
                return null;
            }
            return b.d();
        }
        finally {
            final Throwable t;
            a.b(t, f.class);
            return null;
        }
    }
    
    public static final String[] q(final a a, final float[][] array, final String[] array2) {
        final boolean d = a.d(f.class);
        final String[] array3 = null;
        if (d) {
            return null;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(a, "task");
                Intrinsics.checkNotNullParameter(array, "denses");
                Intrinsics.checkNotNullParameter(array2, "texts");
                final b b = f.b.get(a.h());
                H1.b c;
                if (b == null) {
                    c = null;
                }
                else {
                    c = b.c();
                }
                if (c == null) {
                    return null;
                }
                final float[] f = b.f();
                final int length = array2.length;
                final int length2 = array[0].length;
                final H1.a a2 = new H1.a(new int[] { length, length2 });
                if (length > 0) {
                    int n = 0;
                    while (true) {
                        final int n2 = n + 1;
                        System.arraycopy(array[n], 0, a2.a(), n * length2, length2);
                        if (n2 >= length) {
                            break;
                        }
                        n = n2;
                    }
                }
                final H1.a b2 = c.b(a2, array2, a.e());
                String[] s = array3;
                if (b2 != null) {
                    s = array3;
                    if (f != null) {
                        if (b2.a().length == 0) {
                            return null;
                        }
                        if (f.length == 0) {
                            return null;
                        }
                        final int n3 = H1.f.c.a[a.ordinal()];
                        if (n3 != 1) {
                            if (n3 == 2) {
                                return H1.f.a.r(b2, f);
                            }
                            throw new l();
                        }
                        else {
                            s = H1.f.a.s(b2, f);
                        }
                    }
                }
                return s;
                final Throwable t;
                a.b(t, f.class);
                return null;
            }
            finally {}
            final Throwable t2;
            final Throwable t = t2;
            continue;
        }
    }
    
    public final void e(final JSONObject p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
        //     4: ifeq            8
        //     7: return         
        //     8: aload_1        
        //     9: invokevirtual   org/json/JSONObject.keys:()Ljava/util/Iterator;
        //    12: astore_2       
        //    13: aload_2        
        //    14: invokeinterface java/util/Iterator.hasNext:()Z
        //    19: ifeq            72
        //    22: aload_2        
        //    23: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    28: checkcast       Ljava/lang/String;
        //    31: astore_3       
        //    32: getstatic       H1/f$b.i:LH1/f$b$a;
        //    35: aload_1        
        //    36: aload_3        
        //    37: invokevirtual   org/json/JSONObject.getJSONObject:(Ljava/lang/String;)Lorg/json/JSONObject;
        //    40: invokevirtual   H1/f$b$a.c:(Lorg/json/JSONObject;)LH1/f$b;
        //    43: astore_3       
        //    44: aload_3        
        //    45: ifnonnull       51
        //    48: goto            13
        //    51: getstatic       H1/f.b:Ljava/util/Map;
        //    54: aload_3        
        //    55: invokevirtual   H1/f$b.g:()Ljava/lang/String;
        //    58: aload_3        
        //    59: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    64: pop            
        //    65: goto            13
        //    68: astore_1       
        //    69: goto            73
        //    72: return         
        //    73: aload_1        
        //    74: aload_0        
        //    75: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
        //    78: return         
        //    79: astore_1       
        //    80: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                    
        //  -----  -----  -----  -----  ------------------------
        //  8      13     68     72     Any
        //  13     44     79     81     Lorg/json/JSONException;
        //  13     44     68     72     Any
        //  51     65     79     81     Lorg/json/JSONException;
        //  51     65     68     72     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0013:
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
    Label_0158_Outer:
        while (true) {
            while (true) {
                Label_0290: {
                    while (true) {
                        try {
                            final ArrayList<b> list = new ArrayList<b>();
                            final Iterator<Map.Entry<?, ?>> iterator = f.b.entrySet().iterator();
                            Throwable t = null;
                            int a = 0;
                            while (iterator.hasNext()) {
                                Object o = iterator.next();
                                String b = ((Map.Entry<String, b>)o).getKey();
                                o = ((Map.Entry<String, b>)o).getValue();
                                int a2 = a;
                                if (Intrinsics.a(b, f.a.p.h())) {
                                    ((b)o).b();
                                    a2 = Math.max(a, ((b)o).h());
                                    final n a3 = n.a;
                                    if (n.g(n.b.y) && this.m()) {
                                        list.add(((b)o).j((Runnable)new d()));
                                        break Label_0290;
                                    }
                                    break Label_0290;
                                }
                                else {
                                    a = a2;
                                    if (!Intrinsics.a(b, f.a.o.h())) {
                                        continue Label_0158_Outer;
                                    }
                                    b = ((b)o).b();
                                    a2 = Math.max(a2, ((b)o).h());
                                    final n a4 = n.a;
                                    t = (Throwable)b;
                                    a = a2;
                                    if (!n.g(n.b.z)) {
                                        continue Label_0158_Outer;
                                    }
                                    list.add(((b)o).j((Runnable)new H1.e()));
                                    t = (Throwable)b;
                                    a = a2;
                                }
                            }
                            if (t != null && a > 0 && !list.isEmpty()) {
                                f.b.i.f(new b("MTML", (String)t, null, a, null), list);
                            }
                            return;
                            T1.a.b(t, this);
                            return;
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                continue;
            }
        }
    }
    
    public final JSONObject k() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putString("fields", TextUtils.join((CharSequence)",", (Object[])new String[] { "use_case", "version_id", "asset_uri", "rules_uri", "thresholds" }));
            final F x = F.n.x(null, "app/model_asset", null);
            x.G(bundle);
            final JSONObject c = x.k().c();
            if (c == null) {
                return null;
            }
            return this.p(c);
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
            return null;
        }
    }
    
    public final boolean m() {
        final boolean d = T1.a.d(this);
        boolean b = false;
        if (d) {
            return false;
        }
        Label_0059: {
            try {
                final Locale n = P.N();
                if (n != null) {
                    final String language = n.getLanguage();
                    Intrinsics.checkNotNullExpressionValue(language, "locale.language");
                    if (!i.v(language, "en", false, 2, null)) {
                        return b;
                    }
                }
            }
            finally {
                break Label_0059;
            }
            b = true;
            return b;
        }
        final Throwable t;
        T1.a.b(t, this);
        return false;
    }
    
    public final boolean n(final long n) {
        final boolean d = T1.a.d(this);
        boolean b = false;
        if (d) {
            return false;
        }
        if (n == 0L) {
            return false;
        }
        try {
            if (System.currentTimeMillis() - n < 259200000L) {
                b = true;
            }
            return b;
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
            return false;
        }
    }
    
    public final float[] o(JSONArray jsonArray) {
        if (T1.a.d(this)) {
            return null;
        }
        if (jsonArray == null) {
            return null;
        }
    Label_0071_Outer:
        while (true) {
            while (true) {
                Label_0088: {
                    float[] array;
                    int length;
                    int n;
                    int n2;
                    try {
                        array = new float[jsonArray.length()];
                        length = jsonArray.length();
                        if (length > 0) {
                            n = 0;
                            n2 = n + 1;
                            final JSONArray jsonArray2 = jsonArray;
                            final int n3 = n;
                            final String s = jsonArray2.getString(n3);
                            final String s3;
                            final String s2 = s3 = s;
                            final String s4 = "jsonArray.getString(i)";
                            Intrinsics.checkNotNullExpressionValue(s3, s4);
                            final float[] array2 = array;
                            final int n4 = n;
                            final String s5 = s2;
                            final float n5 = Float.parseFloat(s5);
                            array2[n4] = n5;
                            break Label_0071;
                        }
                        return array;
                    }
                    finally {
                        final JSONArray jsonArray3;
                        jsonArray = jsonArray3;
                        break Label_0088;
                    }
                    try {
                        final JSONArray jsonArray2 = jsonArray;
                        final int n3 = n;
                        final String s = jsonArray2.getString(n3);
                        final String s3;
                        final String s2 = s3 = s;
                        final String s4 = "jsonArray.getString(i)";
                        Intrinsics.checkNotNullExpressionValue(s3, s4);
                        final float[] array2 = array;
                        final int n4 = n;
                        final String s5 = s2;
                        final float n5 = Float.parseFloat(s5);
                        array2[n4] = n5;
                        if (n2 >= length) {
                            return array;
                        }
                        n = n2;
                        continue Label_0071_Outer;
                        T1.a.b((Throwable)jsonArray, this);
                        return null;
                    }
                    catch (JSONException ex) {
                        continue;
                    }
                }
                break;
            }
            break;
        }
    }
    
    public final JSONObject p(JSONObject jsonObject) {
        if (T1.a.d(this)) {
            return null;
        }
        while (true) {
            try {
                final JSONObject jsonObject2 = new JSONObject();
                while (true) {
                    try {
                        final JSONArray jsonArray = ((JSONObject)jsonObject).getJSONArray("data");
                        final int length = jsonArray.length();
                        jsonObject = jsonObject2;
                        if (length > 0) {
                            int n = 0;
                            while (true) {
                                final int n2 = n + 1;
                                jsonObject = jsonArray.getJSONObject(n);
                                final JSONObject jsonObject3 = new JSONObject();
                                jsonObject3.put("version_id", (Object)((JSONObject)jsonObject).getString("version_id"));
                                jsonObject3.put("use_case", (Object)((JSONObject)jsonObject).getString("use_case"));
                                jsonObject3.put("thresholds", (Object)((JSONObject)jsonObject).getJSONArray("thresholds"));
                                jsonObject3.put("asset_uri", (Object)((JSONObject)jsonObject).getString("asset_uri"));
                                if (((JSONObject)jsonObject).has("rules_uri")) {
                                    jsonObject3.put("rules_uri", (Object)((JSONObject)jsonObject).getString("rules_uri"));
                                }
                                jsonObject2.put(((JSONObject)jsonObject).getString("use_case"), (Object)jsonObject3);
                                if (n2 >= length) {
                                    break;
                                }
                                n = n2;
                            }
                            return jsonObject2;
                        }
                        return (JSONObject)jsonObject;
                        jsonObject = new JSONObject();
                        return (JSONObject)jsonObject;
                        final Throwable t;
                        T1.a.b(t, this);
                        return null;
                    }
                    catch (JSONException ex) {}
                    continue;
                }
            }
            finally {}
            final Throwable t2;
            final Throwable t = t2;
            continue;
        }
    }
    
    public final String[] r(final H1.a a, final float[] array) {
        if (a.d(this)) {
            return null;
        }
        while (true) {
            while (true) {
                int b = 0;
                int n = 0;
                Label_0202: {
                    while (true) {
                        try {
                            b = a.b(0);
                            final int b2 = a.b(1);
                            final float[] a2 = a.a();
                            if (b2 != array.length) {
                                return null;
                            }
                            final l6.c g = l6.d.g(0, b);
                            final ArrayList list = new ArrayList<String>(m.l(g, 10));
                            final Iterator<Object> iterator = g.iterator();
                            while (iterator.hasNext()) {
                                final int b3 = ((W5.B)iterator).b();
                                final String s = "none";
                                final int length = array.length;
                                n = (b = 0);
                                if (n < length) {
                                    if (a2[b3 * b2 + b] >= array[n]) {
                                        f.d.get(b);
                                    }
                                    break Label_0202;
                                }
                                else {
                                    list.add((String)s);
                                }
                            }
                            final String[] array2 = list.toArray(new String[0]);
                            if (array2 != null) {
                                return array2;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                            String s = null;
                            a.b((Throwable)s, this);
                            return null;
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                ++n;
                ++b;
                continue;
            }
        }
    }
    
    public final String[] s(final H1.a a, final float[] array) {
        if (a.d(this)) {
            return null;
        }
        while (true) {
            while (true) {
                int b = 0;
                int n = 0;
                Label_0202: {
                    while (true) {
                        try {
                            b = a.b(0);
                            final int b2 = a.b(1);
                            final float[] a2 = a.a();
                            if (b2 != array.length) {
                                return null;
                            }
                            final l6.c g = l6.d.g(0, b);
                            final ArrayList list = new ArrayList<String>(m.l(g, 10));
                            final Iterator<Object> iterator = g.iterator();
                            while (iterator.hasNext()) {
                                final int b3 = ((W5.B)iterator).b();
                                final String s = "other";
                                final int length = array.length;
                                n = (b = 0);
                                if (n < length) {
                                    if (a2[b3 * b2 + b] >= array[n]) {
                                        f.c.get(b);
                                    }
                                    break Label_0202;
                                }
                                else {
                                    list.add((String)s);
                                }
                            }
                            final String[] array2 = list.toArray(new String[0]);
                            if (array2 != null) {
                                return array2;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                            String s = null;
                            a.b((Throwable)s, this);
                            return null;
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                ++n;
                ++b;
                continue;
            }
        }
    }
    
    public enum a
    {
        o("MTML_INTEGRITY_DETECT", 0), 
        p("MTML_APP_EVENT_PREDICTION", 1);
        
        static {
            q = c();
        }
        
        public a(final String name, final int ordinal) {
        }
        
        public static final /* synthetic */ f.a[] c() {
            return new f.a[] { f.a.o, f.a.p };
        }
        
        public final String e() {
            final int n = f.a.a.a[this.ordinal()];
            if (n == 1) {
                return "integrity_detect";
            }
            if (n == 2) {
                return "app_event_pred";
            }
            throw new l();
        }
        
        public final String h() {
            final int n = f.a.a.a[this.ordinal()];
            if (n == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (n == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new l();
        }
    }
    
    public static final class b
    {
        public static final a i;
        public String a;
        public String b;
        public String c;
        public int d;
        public float[] e;
        public File f;
        public H1.b g;
        public Runnable h;
        
        static {
            i = new a(null);
        }
        
        public b(final String a, final String b, final String c, final int d, final float[] e) {
            Intrinsics.checkNotNullParameter(a, "useCase");
            Intrinsics.checkNotNullParameter(b, "assetUri");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
        
        public static final /* synthetic */ Runnable a(final b b) {
            return b.h;
        }
        
        public final String b() {
            return this.b;
        }
        
        public final H1.b c() {
            return this.g;
        }
        
        public final File d() {
            return this.f;
        }
        
        public final String e() {
            return this.c;
        }
        
        public final float[] f() {
            return this.e;
        }
        
        public final String g() {
            return this.a;
        }
        
        public final int h() {
            return this.d;
        }
        
        public final void i(final H1.b g) {
            this.g = g;
        }
        
        public final b j(final Runnable h) {
            this.h = h;
            return this;
        }
        
        public final void k(final File f) {
            this.f = f;
        }
        
        public static final class a
        {
            public static final void g(final List list, final File file) {
                Intrinsics.checkNotNullParameter(list, "$slaves");
                Intrinsics.checkNotNullParameter(file, "file");
                final H1.b a = H1.b.m.a(file);
                if (a != null) {
                    for (final b b : list) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(b.g());
                        sb.append('_');
                        sb.append(b.h());
                        sb.append("_rule");
                        b.i.e(b.e(), sb.toString(), new h(b, a));
                    }
                }
            }
            
            public static final void h(final b b, final H1.b b2, final File file) {
                Intrinsics.checkNotNullParameter(b, "$slave");
                Intrinsics.checkNotNullParameter(file, "file");
                b.i(b2);
                b.k(file);
                final Runnable a = f.b.a(b);
                if (a == null) {
                    return;
                }
                a.run();
            }
            
            public final b c(final JSONObject jsonObject) {
                if (jsonObject == null) {
                    return null;
                }
                try {
                    final String string = jsonObject.getString("use_case");
                    final String string2 = jsonObject.getString("asset_uri");
                    final String optString = jsonObject.optString("rules_uri", (String)null);
                    final int int1 = jsonObject.getInt("version_id");
                    final float[] d = H1.f.d(H1.f.a, jsonObject.getJSONArray("thresholds"));
                    Intrinsics.checkNotNullExpressionValue(string, "useCase");
                    Intrinsics.checkNotNullExpressionValue(string2, "assetUri");
                    return new b(string, string2, optString, int1, d);
                }
                catch (Exception ex) {
                    return null;
                }
            }
            
            public final void d(final String str, int i) {
                final File a = j.a();
                if (a == null) {
                    return;
                }
                final File[] listFiles = a.listFiles();
                if (listFiles != null) {
                    if (listFiles.length == 0) {
                        return;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append('_');
                    sb.append(i);
                    final String string = sb.toString();
                    final int length = listFiles.length;
                    i = 0;
                    while (i < length) {
                        final File file = listFiles[i];
                        final int n = i + 1;
                        final String name = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "name");
                        i = n;
                        if (i.s(name, str, false, 2, null)) {
                            i = n;
                            if (i.s(name, string, false, 2, null)) {
                                continue;
                            }
                            file.delete();
                            i = n;
                        }
                    }
                }
            }
            
            public final void e(final String s, final String child, final k.a a) {
                final File file = new File(j.a(), child);
                if (s != null && !file.exists()) {
                    new k(s, file, a).execute((Object[])new String[0]);
                    return;
                }
                a.a(file);
            }
            
            public final void f(final b b, final List list) {
                Intrinsics.checkNotNullParameter(b, "master");
                Intrinsics.checkNotNullParameter(list, "slaves");
                this.d(b.g(), b.h());
                final StringBuilder sb = new StringBuilder();
                sb.append(b.g());
                sb.append('_');
                sb.append(b.h());
                this.e(b.b(), sb.toString(), new H1.g(list));
            }
        }
    }
}
