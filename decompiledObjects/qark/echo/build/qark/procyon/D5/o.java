// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D5;

import java.util.Arrays;
import java.util.ArrayList;
import E5.l;
import E5.c;
import E5.g;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t5.b;
import E5.j;
import w5.a;
import E5.k;

public class o
{
    public final E5.k a;
    public h b;
    public final E5.k.c c;
    
    public o(final a a) {
        final E5.k.c c = new E5.k.c() {
            @Override
            public void onMethodCall(E5.j ex, final k.d d) {
                if (o.a(o.this) == null) {
                    return;
                }
                while (true) {
                    CharSequence charSequence = ((E5.j)ex).a;
                    ex = (NoSuchFieldException)((E5.j)ex).b;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Received '");
                    sb.append((String)charSequence);
                    sb.append("' message.");
                    b.f("PlatformChannel", sb.toString());
                Label_1093_Outer:
                    while (true) {
                    Label_1093:
                        while (true) {
                            try {
                                int n = 0;
                                Label_0440: {
                                    switch (((String)charSequence).hashCode()) {
                                        case 2119655719: {
                                            if (((String)charSequence).equals("SystemChrome.setPreferredOrientations")) {
                                                n = 2;
                                                break Label_0440;
                                            }
                                            break;
                                        }
                                        case 1674312266: {
                                            if (((String)charSequence).equals("SystemChrome.setEnabledSystemUIOverlays")) {
                                                n = 4;
                                                break Label_0440;
                                            }
                                            break;
                                        }
                                        case 1514180520: {
                                            if (((String)charSequence).equals("Clipboard.getData")) {
                                                n = 11;
                                                break Label_0440;
                                            }
                                            break;
                                        }
                                        case 1390477857: {
                                            if (((String)charSequence).equals("SystemChrome.setSystemUIOverlayStyle")) {
                                                n = 8;
                                                break Label_0440;
                                            }
                                            break;
                                        }
                                        case 1128339786: {
                                            if (((String)charSequence).equals("SystemChrome.setEnabledSystemUIMode")) {
                                                n = 5;
                                                break Label_0440;
                                            }
                                            break;
                                        }
                                        case 875995648: {
                                            if (((String)charSequence).equals("Clipboard.hasStrings")) {
                                                n = 13;
                                                break Label_0440;
                                            }
                                            break;
                                        }
                                        case 241845679: {
                                            if (((String)charSequence).equals("SystemChrome.restoreSystemUIOverlays")) {
                                                n = 7;
                                                break Label_0440;
                                            }
                                            break;
                                        }
                                        case -215273374: {
                                            if (((String)charSequence).equals("SystemSound.play")) {
                                                n = 0;
                                                break Label_0440;
                                            }
                                            break;
                                        }
                                        case -247230243: {
                                            if (((String)charSequence).equals("HapticFeedback.vibrate")) {
                                                n = 1;
                                                break Label_0440;
                                            }
                                            break;
                                        }
                                        case -548468504: {
                                            if (((String)charSequence).equals("SystemChrome.setApplicationSwitcherDescription")) {
                                                n = 3;
                                                break Label_0440;
                                            }
                                            break;
                                        }
                                        case -577225884: {
                                            if (((String)charSequence).equals("SystemChrome.setSystemUIChangeListener")) {
                                                n = 6;
                                                break Label_0440;
                                            }
                                            break;
                                        }
                                        case -720677196: {
                                            if (((String)charSequence).equals("Clipboard.setData")) {
                                                n = 12;
                                                break Label_0440;
                                            }
                                            break;
                                        }
                                        case -766342101: {
                                            if (((String)charSequence).equals("SystemNavigator.pop")) {
                                                n = 10;
                                                break Label_0440;
                                            }
                                            break;
                                        }
                                        case -931781241: {
                                            if (((String)charSequence).equals("Share.invoke")) {
                                                n = 14;
                                                break Label_0440;
                                            }
                                            break;
                                        }
                                        case -1501580720: {
                                            if (((String)charSequence).equals("SystemNavigator.setFrameworkHandlesBack")) {
                                                n = 9;
                                                break Label_0440;
                                            }
                                            break;
                                        }
                                    }
                                    n = -1;
                                }
                                JSONObject jsonObject = null;
                                Label_0580: {
                                    Label_1017: {
                                        switch (n) {
                                            default: {
                                                d.c();
                                                return;
                                            }
                                            case 14: {
                                                o.a(o.this).q((String)ex);
                                                break;
                                            }
                                            case 13: {
                                                final boolean r = o.a(o.this).r();
                                                jsonObject = new JSONObject();
                                                jsonObject.put("value", r);
                                                break Label_0580;
                                            }
                                            case 12: {
                                                o.a(o.this).l(((JSONObject)ex).getString("text"));
                                                break;
                                            }
                                            case 11: {
                                                charSequence = (String)ex;
                                                if (charSequence != null) {
                                                    break Label_1017;
                                                }
                                                break Label_1093;
                                            }
                                            case 10: {
                                                break Label_1017;
                                            }
                                            case 9: {
                                                break Label_1017;
                                            }
                                            case 8: {
                                                break Label_1017;
                                            }
                                            case 7: {
                                                break Label_1017;
                                            }
                                            case 6: {
                                                break Label_1017;
                                            }
                                            case 5: {
                                                break Label_1017;
                                            }
                                            case 4: {
                                                break Label_1017;
                                            }
                                            case 3: {
                                                break Label_1017;
                                            }
                                            case 2: {
                                                break Label_1017;
                                            }
                                            case 1: {
                                                break Label_1017;
                                            }
                                            case 0: {
                                                Label_1055: {
                                                    break Label_1055;
                                                    while (true) {
                                                        while (true) {
                                                            try {
                                                                final Enum e = o.e.e((String)charSequence);
                                                                charSequence = o.a(o.this).o((e)e);
                                                                if (charSequence != null) {
                                                                    jsonObject = new JSONObject();
                                                                    jsonObject.put("text", (Object)charSequence);
                                                                    break Label_0580;
                                                                }
                                                                break Label_1017;
                                                                final StringBuilder sb2 = new StringBuilder();
                                                                sb2.append("No such clipboard content format: ");
                                                                sb2.append((String)charSequence);
                                                                d.b("error", sb2.toString(), null);
                                                                break Label_1093;
                                                                o.a(o.this).f((boolean)ex);
                                                                break Label_1017;
                                                            Label_0875_Outer:
                                                                while (true) {
                                                                    String s = null;
                                                                    d.b("error", s, null);
                                                                    return;
                                                                    try {
                                                                        o.a(o.this).n(g.e((String)ex));
                                                                        d.a(null);
                                                                        return;
                                                                    }
                                                                    catch (NoSuchFieldException ex2) {
                                                                        s = ex2.getMessage();
                                                                        continue Label_0875_Outer;
                                                                    }
                                                                    Block_26: {
                                                                    Label_0791_Outer:
                                                                        while (true) {
                                                                            while (true) {
                                                                                Block_28: {
                                                                                    break Block_28;
                                                                                    s = ex.getMessage();
                                                                                    continue Label_0875_Outer;
                                                                                    s = ex.getMessage();
                                                                                    continue Label_0875_Outer;
                                                                                }
                                                                                try {
                                                                                    o.a(o.this).i(i.e((String)ex));
                                                                                    d.a(null);
                                                                                    return;
                                                                                }
                                                                                catch (NoSuchFieldException ex3) {
                                                                                    s = ex3.getMessage();
                                                                                    continue Label_0875_Outer;
                                                                                }
                                                                                break Label_1093;
                                                                                try {
                                                                                    ex = (NoSuchFieldException)o.this.i((JSONObject)ex);
                                                                                    o.a(o.this).s((j)ex);
                                                                                    d.a(null);
                                                                                    return;
                                                                                }
                                                                                catch (NoSuchFieldException ex) {}
                                                                                catch (JSONException ex6) {}
                                                                                continue Label_1093_Outer;
                                                                            }
                                                                            o.a(o.this).a();
                                                                            break Label_1017;
                                                                            try {
                                                                                o.a(o.this).m(o.this.g((JSONObject)ex));
                                                                                d.a(null);
                                                                                return;
                                                                            }
                                                                            catch (JSONException ex4) {
                                                                                s = ((Throwable)ex4).getMessage();
                                                                                continue Label_0875_Outer;
                                                                            }
                                                                            break Block_26;
                                                                            o.a(o.this).j();
                                                                            break Label_1017;
                                                                            try {
                                                                                ex = (NoSuchFieldException)o.this.j((String)ex);
                                                                                o.a(o.this).g((o.k)ex);
                                                                                d.a(null);
                                                                                return;
                                                                            }
                                                                            catch (NoSuchFieldException ex) {}
                                                                            catch (JSONException ex7) {}
                                                                            continue Label_0791_Outer;
                                                                        }
                                                                        final StringBuilder sb3 = new StringBuilder();
                                                                        sb3.append("JSON error: ");
                                                                        sb3.append(((Throwable)charSequence).getMessage());
                                                                        d.b("error", sb3.toString(), null);
                                                                        return;
                                                                    }
                                                                    try {
                                                                        o.a(o.this).p(o.this.h((JSONArray)ex));
                                                                        d.a(null);
                                                                        return;
                                                                    }
                                                                    catch (NoSuchFieldException ex) {}
                                                                    catch (JSONException ex8) {}
                                                                    Label_1009: {
                                                                        break Label_1009;
                                                                        while (true) {
                                                                            s = ex.getMessage();
                                                                            continue Label_0875_Outer;
                                                                            o.a(o.this).k();
                                                                            break Label_1017;
                                                                            try {
                                                                                ex = (NoSuchFieldException)o.this.k((JSONArray)ex);
                                                                                o.a(o.this).h((List)ex);
                                                                                d.a(null);
                                                                                return;
                                                                            }
                                                                            catch (NoSuchFieldException ex) {}
                                                                            catch (JSONException ex9) {}
                                                                            continue;
                                                                        }
                                                                    }
                                                                    s = ex.getMessage();
                                                                    continue Label_0875_Outer;
                                                                }
                                                            }
                                                            catch (NoSuchFieldException ex10) {}
                                                            continue Label_1093_Outer;
                                                        }
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                    }
                                    d.a(null);
                                    return;
                                }
                                d.a(jsonObject);
                                return;
                            }
                            catch (JSONException ex5) {}
                            final JSONException ex5;
                            charSequence = (CharSequence)ex5;
                            continue Label_1093;
                        }
                        final Enum e = null;
                        continue;
                    }
                }
            }
        };
        this.c = c;
        (this.a = new E5.k(a, "flutter/platform", E5.g.a)).e((E5.k.c)c);
    }
    
    public static /* synthetic */ h a(final o o) {
        return o.b;
    }
    
    public final c g(final JSONObject jsonObject) {
        int int1;
        final int n = int1 = jsonObject.getInt("primaryColor");
        if (n != 0) {
            int1 = (n | 0xFF000000);
        }
        return new c(int1, jsonObject.getString("label"));
    }
    
    public final int h(final JSONArray jsonArray) {
        int i = 0;
        int n2;
        int n = n2 = i;
        while (i < jsonArray.length()) {
            final int n3 = o$b.a[f.e(jsonArray.getString(i)).ordinal()];
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 != 3) {
                        if (n3 == 4) {
                            n |= 0x8;
                        }
                    }
                    else {
                        n |= 0x2;
                    }
                }
                else {
                    n |= 0x4;
                }
            }
            else {
                n |= 0x1;
            }
            int n4 = n2;
            if (n2 == 0) {
                n4 = n;
            }
            ++i;
            n2 = n4;
        }
        if (n == 0) {
            return -1;
        }
        int n5 = 9;
        switch (n) {
            default: {
                return 1;
            }
            case 15: {
                return 13;
            }
            case 11: {
                return 2;
            }
            case 10: {
                return 11;
            }
            case 8: {
                return 8;
            }
            case 5: {
                n5 = 12;
            }
            case 4: {
                return n5;
            }
            case 3:
            case 6:
            case 7:
            case 9:
            case 12:
            case 13:
            case 14: {
                if (n2 == 2) {
                    return 0;
                }
                if (n2 == 4) {
                    return 9;
                }
                if (n2 != 8) {
                    return 1;
                }
                return 8;
            }
            case 2: {
                return 0;
            }
        }
    }
    
    public final j i(final JSONObject jsonObject) {
        final boolean null = jsonObject.isNull("statusBarColor");
        Boolean value = null;
        Integer value2;
        if (!null) {
            value2 = jsonObject.getInt("statusBarColor");
        }
        else {
            value2 = null;
        }
        d e;
        if (!jsonObject.isNull("statusBarIconBrightness")) {
            e = d.e(jsonObject.getString("statusBarIconBrightness"));
        }
        else {
            e = null;
        }
        Boolean value3;
        if (!jsonObject.isNull("systemStatusBarContrastEnforced")) {
            value3 = jsonObject.getBoolean("systemStatusBarContrastEnforced");
        }
        else {
            value3 = null;
        }
        Integer value4;
        if (!jsonObject.isNull("systemNavigationBarColor")) {
            value4 = jsonObject.getInt("systemNavigationBarColor");
        }
        else {
            value4 = null;
        }
        d e2;
        if (!jsonObject.isNull("systemNavigationBarIconBrightness")) {
            e2 = d.e(jsonObject.getString("systemNavigationBarIconBrightness"));
        }
        else {
            e2 = null;
        }
        Integer value5;
        if (!jsonObject.isNull("systemNavigationBarDividerColor")) {
            value5 = jsonObject.getInt("systemNavigationBarDividerColor");
        }
        else {
            value5 = null;
        }
        if (!jsonObject.isNull("systemNavigationBarContrastEnforced")) {
            value = jsonObject.getBoolean("systemNavigationBarContrastEnforced");
        }
        return new j(value2, e, value3, value4, e2, value5, value);
    }
    
    public final k j(final String s) {
        final int n = o$b.c[k.e(s).ordinal()];
        if (n == 1) {
            return k.p;
        }
        if (n == 2) {
            return k.q;
        }
        if (n == 3) {
            return k.r;
        }
        if (n != 4) {
            return k.s;
        }
        return k.s;
    }
    
    public final List k(final JSONArray jsonArray) {
        final ArrayList<l> list = new ArrayList<l>();
        for (int i = 0; i < jsonArray.length(); ++i) {
            final int n = o$b.b[l.e(jsonArray.getString(i)).ordinal()];
            l l;
            if (n != 1) {
                if (n != 2) {
                    continue;
                }
                l = o.l.q;
            }
            else {
                l = o.l.p;
            }
            list.add(l);
        }
        return list;
    }
    
    public void l(final h b) {
        this.b = b;
    }
    
    public void m(final boolean b) {
        b.f("PlatformChannel", "Sending 'systemUIChange' message.");
        this.a.c("SystemChrome.systemUIChange", Arrays.asList(b));
    }
    
    public static class c
    {
        public final int a;
        public final String b;
        
        public c(final int a, final String b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public enum d
    {
        p("LIGHT", 0, "Brightness.light"), 
        q("DARK", 1, "Brightness.dark");
        
        public String o;
        
        static {
            r = c();
        }
        
        public d(final String name, final int ordinal, final String o) {
            this.o = o;
        }
        
        public static /* synthetic */ d[] c() {
            return new d[] { d.p, d.q };
        }
        
        public static d e(final String s) {
            final d[] values = values();
            for (int length = values.length, i = 0; i < length; ++i) {
                final d d = values[i];
                if (d.o.equals(s)) {
                    return d;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("No such Brightness: ");
            sb.append(s);
            throw new NoSuchFieldException(sb.toString());
        }
    }
    
    public enum e
    {
        p("PLAIN_TEXT", 0, "text/plain");
        
        public String o;
        
        static {
            q = c();
        }
        
        public e(final String name, final int ordinal, final String o) {
            this.o = o;
        }
        
        public static /* synthetic */ e[] c() {
            return new e[] { e.p };
        }
        
        public static e e(final String s) {
            final e[] values = values();
            for (int length = values.length, i = 0; i < length; ++i) {
                final e e = values[i];
                if (e.o.equals(s)) {
                    return e;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("No such ClipboardContentFormat: ");
            sb.append(s);
            throw new NoSuchFieldException(sb.toString());
        }
    }
    
    public enum f
    {
        p("PORTRAIT_UP", 0, "DeviceOrientation.portraitUp"), 
        q("PORTRAIT_DOWN", 1, "DeviceOrientation.portraitDown"), 
        r("LANDSCAPE_LEFT", 2, "DeviceOrientation.landscapeLeft"), 
        s("LANDSCAPE_RIGHT", 3, "DeviceOrientation.landscapeRight");
        
        public String o;
        
        static {
            t = c();
        }
        
        public f(final String name, final int ordinal, final String o) {
            this.o = o;
        }
        
        public static /* synthetic */ f[] c() {
            return new f[] { f.p, f.q, f.r, f.s };
        }
        
        public static f e(final String s) {
            final f[] values = values();
            for (int length = values.length, i = 0; i < length; ++i) {
                final f f = values[i];
                if (f.o.equals(s)) {
                    return f;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("No such DeviceOrientation: ");
            sb.append(s);
            throw new NoSuchFieldException(sb.toString());
        }
    }
    
    public enum g
    {
        p("STANDARD", 0, (String)null), 
        q("LIGHT_IMPACT", 1, "HapticFeedbackType.lightImpact"), 
        r("MEDIUM_IMPACT", 2, "HapticFeedbackType.mediumImpact"), 
        s("HEAVY_IMPACT", 3, "HapticFeedbackType.heavyImpact"), 
        t("SELECTION_CLICK", 4, "HapticFeedbackType.selectionClick");
        
        public final String o;
        
        static {
            u = c();
        }
        
        public g(final String name, final int ordinal, final String o) {
            this.o = o;
        }
        
        public static /* synthetic */ g[] c() {
            return new g[] { g.p, g.q, g.r, g.s, g.t };
        }
        
        public static g e(final String s) {
            final g[] values = values();
            for (int length = values.length, i = 0; i < length; ++i) {
                final g g = values[i];
                final String o = g.o;
                if ((o == null && s == null) || (o != null && o.equals(s))) {
                    return g;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("No such HapticFeedbackType: ");
            sb.append(s);
            throw new NoSuchFieldException(sb.toString());
        }
    }
    
    public interface h
    {
        void a();
        
        void f(final boolean p0);
        
        void g(final k p0);
        
        void h(final List p0);
        
        void i(final i p0);
        
        void j();
        
        void k();
        
        void l(final String p0);
        
        void m(final c p0);
        
        void n(final g p0);
        
        CharSequence o(final e p0);
        
        void p(final int p0);
        
        void q(final String p0);
        
        boolean r();
        
        void s(final j p0);
    }
    
    public enum i
    {
        p("CLICK", 0, "SystemSoundType.click"), 
        q("ALERT", 1, "SystemSoundType.alert");
        
        public final String o;
        
        static {
            r = c();
        }
        
        public i(final String name, final int ordinal, final String o) {
            this.o = o;
        }
        
        public static /* synthetic */ i[] c() {
            return new i[] { i.p, i.q };
        }
        
        public static i e(final String s) {
            final i[] values = values();
            for (int length = values.length, i = 0; i < length; ++i) {
                final i j = values[i];
                if (j.o.equals(s)) {
                    return j;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("No such SoundType: ");
            sb.append(s);
            throw new NoSuchFieldException(sb.toString());
        }
    }
    
    public static class j
    {
        public final Integer a;
        public final d b;
        public final Boolean c;
        public final Integer d;
        public final d e;
        public final Integer f;
        public final Boolean g;
        
        public j(final Integer a, final d b, final Boolean c, final Integer d, final d e, final Integer f, final Boolean g) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
        }
    }
    
    public enum k
    {
        p("LEAN_BACK", 0, "SystemUiMode.leanBack"), 
        q("IMMERSIVE", 1, "SystemUiMode.immersive"), 
        r("IMMERSIVE_STICKY", 2, "SystemUiMode.immersiveSticky"), 
        s("EDGE_TO_EDGE", 3, "SystemUiMode.edgeToEdge");
        
        public String o;
        
        static {
            t = c();
        }
        
        public k(final String name, final int ordinal, final String o) {
            this.o = o;
        }
        
        public static /* synthetic */ k[] c() {
            return new k[] { k.p, k.q, k.r, k.s };
        }
        
        public static k e(final String s) {
            final k[] values = values();
            for (int length = values.length, i = 0; i < length; ++i) {
                final k k = values[i];
                if (k.o.equals(s)) {
                    return k;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("No such SystemUiMode: ");
            sb.append(s);
            throw new NoSuchFieldException(sb.toString());
        }
    }
    
    public enum l
    {
        p("TOP_OVERLAYS", 0, "SystemUiOverlay.top"), 
        q("BOTTOM_OVERLAYS", 1, "SystemUiOverlay.bottom");
        
        public String o;
        
        static {
            r = c();
        }
        
        public l(final String name, final int ordinal, final String o) {
            this.o = o;
        }
        
        public static /* synthetic */ l[] c() {
            return new l[] { l.p, l.q };
        }
        
        public static l e(final String s) {
            final l[] values = values();
            for (int length = values.length, i = 0; i < length; ++i) {
                final l l = values[i];
                if (l.o.equals(s)) {
                    return l;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("No such SystemUiOverlay: ");
            sb.append(s);
            throw new NoSuchFieldException(sb.toString());
        }
    }
}
