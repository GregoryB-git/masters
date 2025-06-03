// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import kotlin.jvm.internal.g;

public final class c
{
    public static final a i;
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    
    static {
        i = new a(null);
    }
    
    public c(final JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "component");
        final String string = jsonObject.getString("class_name");
        Intrinsics.checkNotNullExpressionValue(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.a = string;
        this.b = jsonObject.optInt("index", -1);
        this.c = jsonObject.optInt("id");
        final String optString = jsonObject.optString("text");
        Intrinsics.checkNotNullExpressionValue(optString, "component.optString(PATH_TEXT_KEY)");
        this.d = optString;
        final String optString2 = jsonObject.optString("tag");
        Intrinsics.checkNotNullExpressionValue(optString2, "component.optString(PATH_TAG_KEY)");
        this.e = optString2;
        final String optString3 = jsonObject.optString("description");
        Intrinsics.checkNotNullExpressionValue(optString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f = optString3;
        final String optString4 = jsonObject.optString("hint");
        Intrinsics.checkNotNullExpressionValue(optString4, "component.optString(PATH_HINT_KEY)");
        this.g = optString4;
        this.h = jsonObject.optInt("match_bitmask");
    }
    
    public final String a() {
        return this.a;
    }
    
    public final String b() {
        return this.f;
    }
    
    public final String c() {
        return this.g;
    }
    
    public final int d() {
        return this.c;
    }
    
    public final int e() {
        return this.b;
    }
    
    public final int f() {
        return this.h;
    }
    
    public final String g() {
        return this.e;
    }
    
    public final String h() {
        return this.d;
    }
    
    public static final class a
    {
    }
    
    public enum b
    {
        p("ID", 0, 1), 
        q("TEXT", 1, 2), 
        r("TAG", 2, 4), 
        s("DESCRIPTION", 3, 8), 
        t("HINT", 4, 16);
        
        public final int o;
        
        static {
            u = c();
        }
        
        public b(final String name, final int ordinal, final int o) {
            this.o = o;
        }
        
        public static final /* synthetic */ b[] c() {
            return new b[] { b.p, b.q, b.r, b.s, b.t };
        }
        
        public final int e() {
            return this.o;
        }
    }
}
