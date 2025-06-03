// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F1;

import H1.f;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import W5.m;
import kotlin.jvm.internal.Intrinsics;
import java.util.Map;
import x1.B;
import O1.q;

public final class a
{
    public static final a a;
    public static boolean b;
    public static boolean c;
    
    static {
        a = new a();
    }
    
    public static final void a() {
        if (T1.a.d(a.class)) {
            return;
        }
        try {
            F1.a.b = true;
            final q a = q.a;
            F1.a.c = q.d("FBSDKFeatureIntegritySample", B.m(), false);
        }
        finally {
            final Throwable t;
            T1.a.b(t, a.class);
        }
    }
    
    public static final void c(Map map) {
        if (T1.a.d(a.class)) {
            return;
        }
    Label_0144_Outer:
        while (true) {
            while (true) {
                Label_0210: {
                    while (true) {
                        try {
                            Intrinsics.checkNotNullParameter(map, "parameters");
                            if (!F1.a.b) {
                                return;
                            }
                            if (map.isEmpty()) {
                                return;
                            }
                            try {
                                final List g = m.G(map.keySet());
                                final JSONObject jsonObject = new JSONObject();
                                for (final String s : g) {
                                    final String value = map.get(s);
                                    if (value == null) {
                                        throw new IllegalStateException("Required value was null.".toString());
                                    }
                                    final String s2 = value;
                                    final a a = F1.a.a;
                                    if (!a.d(s) && !a.d(s2)) {
                                        continue Label_0144_Outer;
                                    }
                                    map.remove(s);
                                    if (!F1.a.c) {
                                        break Label_0210;
                                    }
                                    jsonObject.put(s, (Object)s2);
                                }
                                if (jsonObject.length() != 0) {
                                    final String string = jsonObject.toString();
                                    Intrinsics.checkNotNullExpressionValue(string, "restrictiveParamJson.toString()");
                                    map.put((K)"_onDeviceParams", string);
                                }
                                return;
                                T1.a.b((Throwable)map, a.class);
                                return;
                            }
                            catch (Exception ex) {
                                return;
                            }
                        }
                        finally {}
                        final Map<K, String> map2;
                        map = map2;
                        continue;
                    }
                }
                final String s2 = "";
                continue;
            }
        }
    }
    
    public final String b(String s) {
        if (T1.a.d(this)) {
            return null;
        }
        while (true) {
            try {
                final float[] array = new float[30];
                for (int i = 0; i < 30; ++i) {
                    array[i] = 0.0f;
                }
                final f a = f.a;
                final String[] q = f.q(f.a.o, new float[][] { array }, new String[] { s });
                if (q == null) {
                    return "none";
                }
                s = q[0];
                if (s == null) {
                    return "none";
                }
                return s;
                final Throwable t;
                T1.a.b(t, this);
                return null;
            }
            finally {}
            final Throwable t2;
            final Throwable t = t2;
            continue;
        }
    }
    
    public final boolean d(final String s) {
        if (T1.a.d(this)) {
            return false;
        }
        try {
            return Intrinsics.a("none", this.b(s)) ^ true;
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
            return false;
        }
    }
}
