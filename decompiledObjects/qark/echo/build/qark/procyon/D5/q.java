// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D5;

import E5.l;
import E5.c;
import t5.b;
import java.util.List;
import java.nio.ByteBuffer;
import java.util.Map;
import E5.j;
import java.util.HashMap;
import w5.a;
import E5.k;

public class q
{
    public final k a;
    public g b;
    public final k.c c;
    
    public q(final w5.a a) {
        final k.c c = new k.c() {
            public final void b(final j j, final k.d d) {
                final int intValue = (int)j.b();
                try {
                    q.a(q.this).f(intValue);
                    d.a(null);
                }
                catch (IllegalStateException ex) {
                    d.b("error", c(ex), null);
                }
            }
            
            public final void c(final j j, final k.d d) {
                final Map map = (Map)j.b();
                final boolean containsKey = map.containsKey("hybrid");
                final boolean b = false;
                final boolean b2 = containsKey && map.get("hybrid");
                ByteBuffer wrap;
                if (map.containsKey("params")) {
                    wrap = ByteBuffer.wrap((byte[])(Object)map.get("params"));
                }
                else {
                    wrap = null;
                }
                Label_0172: {
                    if (!b2) {
                        break Label_0172;
                    }
                    int intValue = 0;
                    String s = null;
                    boolean containsKey2;
                    double doubleValue = 0.0;
                    boolean b3;
                    double doubleValue2 = 0.0;
                    q.d.a a = null;
                    long e;
                    final IllegalStateException ex;
                    Label_0234_Outer:Label_0303_Outer:
                    while (true) {
                    Label_0303:
                        while (true) {
                            Block_6_Outer:Label_0449_Outer:
                            while (true) {
                                Label_0467: {
                                    while (true) {
                                        try {
                                            q.a(q.this).h(new q.d((Integer)(Object)map.get("id"), (String)map.get("viewType"), 0.0, 0.0, 0.0, 0.0, (Integer)(Object)map.get("direction"), q.d.a.q, wrap));
                                            // iftrue(Label_0470:, !containsKey2)
                                            // iftrue(Label_0226:, !b3)
                                            // iftrue(Label_0332:, !map.containsKey((Object)"left"))
                                            // iftrue(Label_0427:, !b3)
                                            // iftrue(Label_0213:, !(Boolean)map.get((Object)"hybridFallback").booleanValue())
                                            // iftrue(Label_0437:, e != -2L)
                                            // iftrue(Label_0213:, !map.containsKey((Object)"hybridFallback"))
                                            Block_9: {
                                                while (true) {
                                                    Block_8: {
                                                        while (true) {
                                                        Label_0332:
                                                            while (true) {
                                                            Block_7:
                                                                while (true) {
                                                                    d.a(null);
                                                                    return;
                                                                    intValue = (Integer)(Object)map.get("id");
                                                                    s = (String)map.get("viewType");
                                                                    containsKey2 = map.containsKey("top");
                                                                    doubleValue = 0.0;
                                                                    break Block_9;
                                                                    break Block_8;
                                                                    Block_12: {
                                                                        Block_10: {
                                                                            break Block_10;
                                                                            break Block_12;
                                                                            b3 = b;
                                                                            break Block_7;
                                                                        }
                                                                        doubleValue = (Double)(Object)map.get("left");
                                                                        break Label_0332;
                                                                        Label_0427: {
                                                                            throw new AssertionError((Object)"Platform view attempted to fall back to hybrid mode when not requested.");
                                                                        }
                                                                    }
                                                                    continue Label_0234_Outer;
                                                                }
                                                                b3 = true;
                                                                continue Label_0303_Outer;
                                                            }
                                                            e = q.a(q.this).e(new q.d(intValue, s, doubleValue2, doubleValue, (Double)(Object)map.get("width"), (Double)(Object)map.get("height"), (Integer)(Object)map.get("direction"), a, wrap));
                                                            continue Block_6_Outer;
                                                        }
                                                    }
                                                    a = q.d.a.p;
                                                    break Label_0467;
                                                    d.b("error", c(ex), null);
                                                    return;
                                                    Label_0226: {
                                                        a = q.d.a.o;
                                                    }
                                                    break Label_0467;
                                                    b3 = b;
                                                    continue Label_0449_Outer;
                                                }
                                                Label_0437: {
                                                    d.a(e);
                                                }
                                                return;
                                            }
                                            doubleValue2 = (Double)(Object)map.get("top");
                                            continue Label_0303;
                                        }
                                        catch (IllegalStateException ex) {
                                            continue;
                                        }
                                        break;
                                    }
                                }
                                continue Label_0303_Outer;
                            }
                            Label_0470: {
                                doubleValue2 = 0.0;
                            }
                            continue Label_0303;
                        }
                    }
                }
            }
            
            public final void d(final j j, final k.d d) {
                final int intValue = ((Map)j.b()).get("id");
                try {
                    q.a(q.this).g(intValue);
                    d.a(null);
                }
                catch (IllegalStateException ex) {
                    d.b("error", c(ex), null);
                }
            }
            
            public final void f(final j j, final k.d d) {
                final Map map = (Map)j.b();
                try {
                    q.a(q.this).b(map.get("id"), map.get("top"), map.get("left"));
                    d.a(null);
                }
                catch (IllegalStateException ex) {
                    d.b("error", c(ex), null);
                }
            }
            
            public final void g(final j j, final k.d d) {
                final Map map = (Map)j.b();
                final e e = new e(map.get("id"), map.get("width"), map.get("height"));
                try {
                    q.a(q.this).i(e, new p(d));
                }
                catch (IllegalStateException ex) {
                    d.b("error", c(ex), null);
                }
            }
            
            public final void h(final j j, final k.d d) {
                final Map map = (Map)j.b();
                final int intValue = map.get("id");
                final int intValue2 = map.get("direction");
                try {
                    q.a(q.this).c(intValue, intValue2);
                    d.a(null);
                }
                catch (IllegalStateException ex) {
                    d.b("error", c(ex), null);
                }
            }
            
            public final void i(final j j, final k.d d) {
                final boolean booleanValue = (boolean)j.b();
                try {
                    q.a(q.this).a(booleanValue);
                    d.a(null);
                }
                catch (IllegalStateException ex) {
                    d.b("error", c(ex), null);
                }
            }
            
            public final void j(j ex, final k.d d) {
                final List list = (List)((j)ex).b();
                ex = (IllegalStateException)new f(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), list.get(5), list.get(6), list.get(7), list.get(8), list.get(9), list.get(10), list.get(11), list.get(12), list.get(13), list.get(14), list.get(15).longValue());
                try {
                    q.a(q.this).d((f)ex);
                    try {
                        d.a(null);
                        return;
                    }
                    catch (IllegalStateException ex) {}
                }
                catch (IllegalStateException ex2) {}
                d.b("error", c(ex), null);
            }
            
            @Override
            public void onMethodCall(final j j, final k.d d) {
                if (q.a(q.this) == null) {
                    return;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Received '");
                sb.append(j.a);
                sb.append("' message.");
                b.f("PlatformViewsChannel", sb.toString());
                final String a = j.a;
                a.hashCode();
                final int hashCode = a.hashCode();
                int n = -1;
                switch (hashCode) {
                    case 1671767583: {
                        if (!a.equals("dispose")) {
                            break;
                        }
                        n = 7;
                        break;
                    }
                    case 576796989: {
                        if (!a.equals("setDirection")) {
                            break;
                        }
                        n = 6;
                        break;
                    }
                    case 110550847: {
                        if (!a.equals("touch")) {
                            break;
                        }
                        n = 5;
                        break;
                    }
                    case -308988850: {
                        if (!a.equals("synchronizeToNativeViewHierarchy")) {
                            break;
                        }
                        n = 4;
                        break;
                    }
                    case -756050293: {
                        if (!a.equals("clearFocus")) {
                            break;
                        }
                        n = 3;
                        break;
                    }
                    case -934437708: {
                        if (!a.equals("resize")) {
                            break;
                        }
                        n = 2;
                        break;
                    }
                    case -1019779949: {
                        if (!a.equals("offset")) {
                            break;
                        }
                        n = 1;
                        break;
                    }
                    case -1352294148: {
                        if (!a.equals("create")) {
                            break;
                        }
                        n = 0;
                        break;
                    }
                }
                switch (n) {
                    default: {
                        d.c();
                    }
                    case 7: {
                        this.d(j, d);
                    }
                    case 6: {
                        this.h(j, d);
                    }
                    case 5: {
                        this.j(j, d);
                    }
                    case 4: {
                        this.i(j, d);
                    }
                    case 3: {
                        this.b(j, d);
                    }
                    case 2: {
                        this.g(j, d);
                    }
                    case 1: {
                        this.f(j, d);
                    }
                    case 0: {
                        this.c(j, d);
                    }
                }
            }
        };
        this.c = c;
        (this.a = new k(a, "flutter/platform_views", E5.q.b)).e((k.c)c);
    }
    
    public static /* synthetic */ g a(final q q) {
        return q.b;
    }
    
    public static String c(final Exception ex) {
        return t5.b.d(ex);
    }
    
    public void d(final g b) {
        this.b = b;
    }
    
    public interface b
    {
        void a(final c p0);
    }
    
    public static class c
    {
        public final int a;
        public final int b;
        
        public c(final int a, final int b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static class d
    {
        public final int a;
        public final String b;
        public final double c;
        public final double d;
        public final double e;
        public final double f;
        public final int g;
        public final a h;
        public final ByteBuffer i;
        
        public d(final int a, final String b, final double e, final double f, final double c, final double d, final int g, final a h, final ByteBuffer i) {
            this.a = a;
            this.b = b;
            this.e = e;
            this.f = f;
            this.c = c;
            this.d = d;
            this.g = g;
            this.h = h;
            this.i = i;
        }
        
        public enum a
        {
            o("TEXTURE_WITH_VIRTUAL_FALLBACK", 0), 
            p("TEXTURE_WITH_HYBRID_FALLBACK", 1), 
            q("HYBRID_ONLY", 2);
            
            static {
                r = c();
            }
            
            public a(final String name, final int ordinal) {
            }
            
            public static /* synthetic */ a[] c() {
                return new a[] { a.o, a.p, a.q };
            }
        }
    }
    
    public static class e
    {
        public final int a;
        public final double b;
        public final double c;
        
        public e(final int a, final double b, final double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    public static class f
    {
        public final int a;
        public final Number b;
        public final Number c;
        public final int d;
        public final int e;
        public final Object f;
        public final Object g;
        public final int h;
        public final int i;
        public final float j;
        public final float k;
        public final int l;
        public final int m;
        public final int n;
        public final int o;
        public final long p;
        
        public f(final int a, final Number b, final Number c, final int d, final int e, final Object f, final Object g, final int h, final int i, final float j, final float k, final int l, final int m, final int n, final int o, final long p16) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
            this.j = j;
            this.k = k;
            this.l = l;
            this.m = m;
            this.n = n;
            this.o = o;
            this.p = p16;
        }
    }
    
    public interface g
    {
        void a(final boolean p0);
        
        void b(final int p0, final double p1, final double p2);
        
        void c(final int p0, final int p1);
        
        void d(final f p0);
        
        long e(final d p0);
        
        void f(final int p0);
        
        void g(final int p0);
        
        void h(final d p0);
        
        void i(final e p0, final b p1);
    }
}
