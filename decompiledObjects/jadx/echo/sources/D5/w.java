package D5;

import E5.k;
import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t5.AbstractC1995b;
import w5.C2105a;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final E5.k f1442a;

    /* renamed from: b, reason: collision with root package name */
    public f f1443b;

    /* renamed from: c, reason: collision with root package name */
    public final k.c f1444c;

    public class a implements k.c {
        public a() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // E5.k.c
        public void onMethodCall(E5.j jVar, k.d dVar) {
            Bundle bundle;
            if (w.this.f1443b == null) {
            }
            String str = jVar.f1670a;
            Object obj = jVar.f1671b;
            AbstractC1995b.f("TextInputChannel", "Received '" + str + "' message.");
            str.hashCode();
            char c7 = 65535;
            switch (str.hashCode()) {
                case -1779068172:
                    if (str.equals("TextInput.setPlatformViewClient")) {
                        c7 = 0;
                        break;
                    }
                    break;
                case -1015421462:
                    if (str.equals("TextInput.setEditingState")) {
                        c7 = 1;
                        break;
                    }
                    break;
                case -37561188:
                    if (str.equals("TextInput.setClient")) {
                        c7 = 2;
                        break;
                    }
                    break;
                case 270476819:
                    if (str.equals("TextInput.hide")) {
                        c7 = 3;
                        break;
                    }
                    break;
                case 270803918:
                    if (str.equals("TextInput.show")) {
                        c7 = 4;
                        break;
                    }
                    break;
                case 649192816:
                    if (str.equals("TextInput.sendAppPrivateCommand")) {
                        c7 = 5;
                        break;
                    }
                    break;
                case 1204752139:
                    if (str.equals("TextInput.setEditableSizeAndTransform")) {
                        c7 = 6;
                        break;
                    }
                    break;
                case 1727570905:
                    if (str.equals("TextInput.finishAutofillContext")) {
                        c7 = 7;
                        break;
                    }
                    break;
                case 1904427655:
                    if (str.equals("TextInput.clearClient")) {
                        c7 = '\b';
                        break;
                    }
                    break;
                case 2113369584:
                    if (str.equals("TextInput.requestAutofill")) {
                        c7 = '\t';
                        break;
                    }
                    break;
            }
            try {
                switch (c7) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        JSONObject jSONObject = (JSONObject) obj;
                        w.this.f1443b.d(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                        dVar.a(null);
                        break;
                    case 1:
                        w.this.f1443b.h(e.a((JSONObject) obj));
                        dVar.a(null);
                        break;
                    case 2:
                        try {
                            JSONArray jSONArray = (JSONArray) obj;
                            w.this.f1443b.g(jSONArray.getInt(0), b.a(jSONArray.getJSONObject(1)));
                            dVar.a(null);
                            break;
                        } catch (NoSuchFieldException e7) {
                            e = e7;
                            dVar.b("error", e.getMessage(), null);
                            return;
                        }
                    case 3:
                        w.this.f1443b.j();
                        dVar.a(null);
                        break;
                    case 4:
                        w.this.f1443b.a();
                        dVar.a(null);
                        break;
                    case 5:
                        JSONObject jSONObject2 = (JSONObject) obj;
                        String string = jSONObject2.getString("action");
                        String string2 = jSONObject2.getString("data");
                        if (string2 == null || string2.isEmpty()) {
                            bundle = null;
                        } else {
                            bundle = new Bundle();
                            bundle.putString("data", string2);
                        }
                        w.this.f1443b.c(string, bundle);
                        dVar.a(null);
                        break;
                    case 6:
                        JSONObject jSONObject3 = (JSONObject) obj;
                        double d7 = jSONObject3.getDouble("width");
                        double d8 = jSONObject3.getDouble("height");
                        JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                        double[] dArr = new double[16];
                        for (int i7 = 0; i7 < 16; i7++) {
                            dArr[i7] = jSONArray2.getDouble(i7);
                        }
                        w.this.f1443b.e(d7, d8, dArr);
                        dVar.a(null);
                        break;
                    case 7:
                        w.this.f1443b.i(((Boolean) obj).booleanValue());
                        dVar.a(null);
                        break;
                    case '\b':
                        w.this.f1443b.b();
                        dVar.a(null);
                        break;
                    case '\t':
                        w.this.f1443b.f();
                        dVar.a(null);
                        break;
                    default:
                        dVar.c();
                        break;
                }
            } catch (JSONException e8) {
                e = e8;
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f1446a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f1447b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f1448c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f1449d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f1450e;

        /* renamed from: f, reason: collision with root package name */
        public final d f1451f;

        /* renamed from: g, reason: collision with root package name */
        public final c f1452g;

        /* renamed from: h, reason: collision with root package name */
        public final Integer f1453h;

        /* renamed from: i, reason: collision with root package name */
        public final String f1454i;

        /* renamed from: j, reason: collision with root package name */
        public final a f1455j;

        /* renamed from: k, reason: collision with root package name */
        public final String[] f1456k;

        /* renamed from: l, reason: collision with root package name */
        public final b[] f1457l;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final String f1458a;

            /* renamed from: b, reason: collision with root package name */
            public final String[] f1459b;

            /* renamed from: c, reason: collision with root package name */
            public final e f1460c;

            /* renamed from: d, reason: collision with root package name */
            public final String f1461d;

            public a(String str, String[] strArr, String str2, e eVar) {
                this.f1458a = str;
                this.f1459b = strArr;
                this.f1461d = str2;
                this.f1460c = eVar;
            }

            public static a a(JSONObject jSONObject) {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray.length()];
                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                    strArr[i7] = b(jSONArray.getString(i7));
                }
                return new a(string, strArr, string2, e.a(jSONObject2));
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x00a6, code lost:
            
                if (r17.equals("familyName") == false) goto L7;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static java.lang.String b(java.lang.String r17) {
                /*
                    Method dump skipped, instructions count: 806
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: D5.w.b.a.b(java.lang.String):java.lang.String");
            }
        }

        public b(boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, d dVar, c cVar, Integer num, String str, a aVar, String[] strArr, b[] bVarArr) {
            this.f1446a = z7;
            this.f1447b = z8;
            this.f1448c = z9;
            this.f1449d = z10;
            this.f1450e = z11;
            this.f1451f = dVar;
            this.f1452g = cVar;
            this.f1453h = num;
            this.f1454i = str;
            this.f1455j = aVar;
            this.f1456k = strArr;
            this.f1457l = bVarArr;
        }

        public static b a(JSONObject jSONObject) {
            b[] bVarArr;
            String string = jSONObject.getString("inputAction");
            if (string == null) {
                throw new JSONException("Configuration JSON missing 'inputAction' property.");
            }
            if (jSONObject.isNull("fields")) {
                bVarArr = null;
            } else {
                JSONArray jSONArray = jSONObject.getJSONArray("fields");
                int length = jSONArray.length();
                b[] bVarArr2 = new b[length];
                for (int i7 = 0; i7 < length; i7++) {
                    bVarArr2[i7] = a(jSONArray.getJSONObject(i7));
                }
                bVarArr = bVarArr2;
            }
            Integer b7 = b(string);
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray2 = jSONObject.isNull("contentCommitMimeTypes") ? null : jSONObject.getJSONArray("contentCommitMimeTypes");
            if (jSONArray2 != null) {
                for (int i8 = 0; i8 < jSONArray2.length(); i8++) {
                    arrayList.add(jSONArray2.optString(i8));
                }
            }
            return new b(jSONObject.optBoolean("obscureText"), jSONObject.optBoolean("autocorrect", true), jSONObject.optBoolean("enableSuggestions"), jSONObject.optBoolean("enableIMEPersonalizedLearning"), jSONObject.optBoolean("enableDeltaModel"), d.e(jSONObject.getString("textCapitalization")), c.a(jSONObject.getJSONObject("inputType")), b7, jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel"), jSONObject.isNull("autofill") ? null : a.a(jSONObject.getJSONObject("autofill")), (String[]) arrayList.toArray(new String[arrayList.size()]), bVarArr);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
        
            if (r12.equals("TextInputAction.done") == false) goto L4;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Integer b(java.lang.String r12) {
            /*
                r12.hashCode()
                int r0 = r12.hashCode()
                r1 = 7
                r2 = 6
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                r9 = 0
                java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                r11 = -1
                switch(r0) {
                    case -810971940: goto L76;
                    case -737377923: goto L6d;
                    case -737089298: goto L62;
                    case -737080013: goto L57;
                    case -736940669: goto L4c;
                    case 469250275: goto L41;
                    case 1241689507: goto L36;
                    case 1539450297: goto L2b;
                    case 2110497650: goto L1e;
                    default: goto L1b;
                }
            L1b:
                r7 = r11
                goto L80
            L1e:
                java.lang.String r0 = "TextInputAction.previous"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L27
                goto L1b
            L27:
                r7 = 8
                goto L80
            L2b:
                java.lang.String r0 = "TextInputAction.newline"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L34
                goto L1b
            L34:
                r7 = r1
                goto L80
            L36:
                java.lang.String r0 = "TextInputAction.go"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L3f
                goto L1b
            L3f:
                r7 = r2
                goto L80
            L41:
                java.lang.String r0 = "TextInputAction.search"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L4a
                goto L1b
            L4a:
                r7 = r3
                goto L80
            L4c:
                java.lang.String r0 = "TextInputAction.send"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L55
                goto L1b
            L55:
                r7 = r4
                goto L80
            L57:
                java.lang.String r0 = "TextInputAction.none"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L60
                goto L1b
            L60:
                r7 = r5
                goto L80
            L62:
                java.lang.String r0 = "TextInputAction.next"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L6b
                goto L1b
            L6b:
                r7 = r6
                goto L80
            L6d:
                java.lang.String r0 = "TextInputAction.done"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L80
                goto L1b
            L76:
                java.lang.String r0 = "TextInputAction.unspecified"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L7f
                goto L1b
            L7f:
                r7 = r9
            L80:
                switch(r7) {
                    case 0: goto La4;
                    case 1: goto L9f;
                    case 2: goto L9a;
                    case 3: goto L99;
                    case 4: goto L94;
                    case 5: goto L8f;
                    case 6: goto L8a;
                    case 7: goto L89;
                    case 8: goto L84;
                    default: goto L83;
                }
            L83:
                return r10
            L84:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
                return r12
            L89:
                return r8
            L8a:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
                return r12
            L8f:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
                return r12
            L94:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
                return r12
            L99:
                return r8
            L9a:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
                return r12
            L9f:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
                return r12
            La4:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: D5.w.b.b(java.lang.String):java.lang.Integer");
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final g f1462a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f1463b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f1464c;

        public c(g gVar, boolean z7, boolean z8) {
            this.f1462a = gVar;
            this.f1463b = z7;
            this.f1464c = z8;
        }

        public static c a(JSONObject jSONObject) {
            return new c(g.e(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    public enum d {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");


        /* renamed from: o, reason: collision with root package name */
        public final String f1470o;

        d(String str) {
            this.f1470o = str;
        }

        public static d e(String str) {
            for (d dVar : values()) {
                if (dVar.f1470o.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final String f1471a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1472b;

        /* renamed from: c, reason: collision with root package name */
        public final int f1473c;

        /* renamed from: d, reason: collision with root package name */
        public final int f1474d;

        /* renamed from: e, reason: collision with root package name */
        public final int f1475e;

        public e(String str, int i7, int i8, int i9, int i10) {
            if (!(i7 == -1 && i8 == -1) && (i7 < 0 || i8 < 0)) {
                throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i7) + ", " + String.valueOf(i8) + ")");
            }
            if (!(i9 == -1 && i10 == -1) && (i9 < 0 || i9 > i10)) {
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i9) + ", " + String.valueOf(i10) + ")");
            }
            if (i10 > str.length()) {
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i9));
            }
            if (i7 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i7));
            }
            if (i8 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i8));
            }
            this.f1471a = str;
            this.f1472b = i7;
            this.f1473c = i8;
            this.f1474d = i9;
            this.f1475e = i10;
        }

        public static e a(JSONObject jSONObject) {
            return new e(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        public boolean b() {
            int i7 = this.f1474d;
            return i7 >= 0 && this.f1475e > i7;
        }

        public boolean c() {
            return this.f1472b >= 0;
        }
    }

    public interface f {
        void a();

        void b();

        void c(String str, Bundle bundle);

        void d(int i7, boolean z7);

        void e(double d7, double d8, double[] dArr);

        void f();

        void g(int i7, b bVar);

        void h(e eVar);

        void i(boolean z7);

        void j();
    }

    public enum g {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none");


        /* renamed from: o, reason: collision with root package name */
        public final String f1488o;

        g(String str) {
            this.f1488o = str;
        }

        public static g e(String str) {
            for (g gVar : values()) {
                if (gVar.f1488o.equals(str)) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    public w(C2105a c2105a) {
        a aVar = new a();
        this.f1444c = aVar;
        E5.k kVar = new E5.k(c2105a, "flutter/textinput", E5.g.f1669a);
        this.f1442a = kVar;
        kVar.e(aVar);
    }

    public static HashMap c(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(((io.flutter.plugin.editing.o) it.next()).b());
        }
        hashMap.put("deltas", jSONArray);
        return hashMap;
    }

    public static HashMap d(String str, int i7, int i8, int i9, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i7));
        hashMap.put("selectionExtent", Integer.valueOf(i8));
        hashMap.put("composingBase", Integer.valueOf(i9));
        hashMap.put("composingExtent", Integer.valueOf(i10));
        return hashMap;
    }

    public void b(int i7, Map map) {
        AbstractC1995b.f("TextInputChannel", "Sending 'commitContent' message.");
        this.f1442a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i7), "TextInputAction.commitContent", map));
    }

    public void e(int i7) {
        AbstractC1995b.f("TextInputChannel", "Sending 'done' message.");
        this.f1442a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i7), "TextInputAction.done"));
    }

    public void f(int i7) {
        AbstractC1995b.f("TextInputChannel", "Sending 'go' message.");
        this.f1442a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i7), "TextInputAction.go"));
    }

    public void g(int i7) {
        AbstractC1995b.f("TextInputChannel", "Sending 'newline' message.");
        this.f1442a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i7), "TextInputAction.newline"));
    }

    public void h(int i7) {
        AbstractC1995b.f("TextInputChannel", "Sending 'next' message.");
        this.f1442a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i7), "TextInputAction.next"));
    }

    public void i(int i7, String str, Bundle bundle) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        this.f1442a.c("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(i7), hashMap));
    }

    public void j(int i7) {
        AbstractC1995b.f("TextInputChannel", "Sending 'previous' message.");
        this.f1442a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i7), "TextInputAction.previous"));
    }

    public void k() {
        this.f1442a.c("TextInputClient.requestExistingInputState", null);
    }

    public void l(int i7) {
        AbstractC1995b.f("TextInputChannel", "Sending 'search' message.");
        this.f1442a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i7), "TextInputAction.search"));
    }

    public void m(int i7) {
        AbstractC1995b.f("TextInputChannel", "Sending 'send' message.");
        this.f1442a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i7), "TextInputAction.send"));
    }

    public void n(f fVar) {
        this.f1443b = fVar;
    }

    public void o(int i7) {
        AbstractC1995b.f("TextInputChannel", "Sending 'unspecified' message.");
        this.f1442a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i7), "TextInputAction.unspecified"));
    }

    public void p(int i7, String str, int i8, int i9, int i10, int i11) {
        AbstractC1995b.f("TextInputChannel", "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i8 + "\nSelection end: " + i9 + "\nComposing start: " + i10 + "\nComposing end: " + i11);
        this.f1442a.c("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i7), d(str, i8, i9, i10, i11)));
    }

    public void q(int i7, ArrayList arrayList) {
        AbstractC1995b.f("TextInputChannel", "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        this.f1442a.c("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i7), c(arrayList)));
    }

    public void r(int i7, HashMap hashMap) {
        AbstractC1995b.f("TextInputChannel", "Sending message to update editing state for " + String.valueOf(hashMap.size()) + " field(s).");
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            e eVar = (e) entry.getValue();
            hashMap2.put((String) entry.getKey(), d(eVar.f1471a, eVar.f1472b, eVar.f1473c, -1, -1));
        }
        this.f1442a.c("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i7), hashMap2));
    }
}
