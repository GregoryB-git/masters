// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package j5;

import android.content.SharedPreferences$Editor;
import android.content.Context;
import android.os.Build$VERSION;
import java.util.Map;
import android.content.SharedPreferences;

public class m
{
    public static final d e;
    public static final l f;
    public final d a;
    public final l b;
    public final d c;
    public final l d;
    
    static {
        e = d.q;
        f = l.q;
    }
    
    public m(final SharedPreferences sharedPreferences, final Map map) {
        final d e = m.e;
        this.a = j5.d.valueOf(sharedPreferences.getString("FlutterSecureSAlgorithmKey", e.name()));
        final l f = m.f;
        this.b = l.valueOf(sharedPreferences.getString("FlutterSecureSAlgorithmStorage", f.name()));
        final d value = j5.d.valueOf(this.b(map, "keyCipherAlgorithm", e.name()));
        final int p2 = value.p;
        final int sdk_INT = Build$VERSION.SDK_INT;
        d c = e;
        if (p2 <= sdk_INT) {
            c = value;
        }
        this.c = c;
        final l value2 = l.valueOf(this.b(map, "storageCipherAlgorithm", f.name()));
        l d = f;
        if (value2.p <= sdk_INT) {
            d = value2;
        }
        this.d = d;
    }
    
    public i a(final Context context) {
        return this.d.o.a(context, this.c.o.a(context));
    }
    
    public final String b(final Map map, final String s, String string) {
        final Object value = map.get(s);
        if (value != null) {
            string = value.toString();
        }
        return string;
    }
    
    public i c(final Context context) {
        return this.b.o.a(context, this.a.o.a(context));
    }
    
    public void d(final SharedPreferences$Editor sharedPreferences$Editor) {
        sharedPreferences$Editor.remove("FlutterSecureSAlgorithmKey");
        sharedPreferences$Editor.remove("FlutterSecureSAlgorithmStorage");
    }
    
    public boolean e() {
        return this.a != this.c || this.b != this.d;
    }
    
    public void f(final SharedPreferences$Editor sharedPreferences$Editor) {
        sharedPreferences$Editor.putString("FlutterSecureSAlgorithmKey", this.c.name());
        sharedPreferences$Editor.putString("FlutterSecureSAlgorithmStorage", this.d.name());
    }
}
