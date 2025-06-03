// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p5;

import java.util.List;
import E5.k;
import java.util.HashMap;
import java.util.Map;

public class c extends p5.a
{
    public final Map a;
    public final a b;
    public final boolean c;
    
    public c(final Map a, final boolean c) {
        this.b = new a();
        this.a = a;
        this.c = c;
    }
    
    @Override
    public Object c(final String s) {
        return this.a.get(s);
    }
    
    @Override
    public boolean e() {
        return this.c;
    }
    
    @Override
    public String i() {
        return this.a.get("method");
    }
    
    @Override
    public boolean j(final String s) {
        return this.a.containsKey(s);
    }
    
    @Override
    public f o() {
        return this.b;
    }
    
    public Map p() {
        final HashMap<String, HashMap<String, String>> hashMap = new HashMap<String, HashMap<String, String>>();
        final HashMap<String, String> hashMap2 = new HashMap<String, String>();
        hashMap2.put("code", this.b.b);
        hashMap2.put("message", this.b.c);
        hashMap2.put("data", (String)this.b.d);
        hashMap.put("error", hashMap2);
        return hashMap;
    }
    
    public Map q() {
        final HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("result", this.b.a);
        return hashMap;
    }
    
    public void r(final k.d d) {
        final a b = this.b;
        d.b(b.b, b.c, b.d);
    }
    
    public void s(final List list) {
        if (!this.e()) {
            list.add(this.p());
        }
    }
    
    public void t(final List list) {
        if (!this.e()) {
            list.add(this.q());
        }
    }
    
    public class a implements f
    {
        public Object a;
        public String b;
        public String c;
        public Object d;
        
        @Override
        public void a(final Object a) {
            this.a = a;
        }
        
        @Override
        public void b(final String b, final String c, final Object d) {
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
}
