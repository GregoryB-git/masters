/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  java.io.Serializable
 *  java.lang.Byte
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Enum
 *  java.lang.Float
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Integer
 *  java.lang.NoSuchFieldException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package D5;

import E5.j;
import E5.k;
import E5.l;
import android.os.Build;
import android.os.Bundle;
import io.flutter.plugin.editing.o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w5.a;

public class w {
    public final k a;
    public f b;
    public final k.c c;

    public w(a object) {
        k.c c8;
        this.c = c8 = new k.c(){

            /*
             * Exception decompiling
             */
            @Override
            public void onMethodCall(j var1_1, k.d var2_5) {
                // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [24[CASE]], but top level block is 3[TRYBLOCK]
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
        };
        this.a = object = new k((E5.c)object, "flutter/textinput", E5.g.a);
        object.e(c8);
    }

    public static /* synthetic */ f a(w w8) {
        return w8.b;
    }

    public static HashMap c(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        arrayList = arrayList.iterator();
        while (arrayList.hasNext()) {
            jSONArray.put((Object)((o)arrayList.next()).b());
        }
        hashMap.put((Object)"deltas", (Object)jSONArray);
        return hashMap;
    }

    public static HashMap d(String string2, int n8, int n9, int n10, int n11) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"text", (Object)string2);
        hashMap.put((Object)"selectionBase", (Object)n8);
        hashMap.put((Object)"selectionExtent", (Object)n9);
        hashMap.put((Object)"composingBase", (Object)n10);
        hashMap.put((Object)"composingExtent", (Object)n11);
        return hashMap;
    }

    public void b(int n8, Map map) {
        t5.b.f("TextInputChannel", "Sending 'commitContent' message.");
        this.a.c("TextInputClient.performAction", (Object)Arrays.asList((Object[])new Object[]{n8, "TextInputAction.commitContent", map}));
    }

    public void e(int n8) {
        t5.b.f("TextInputChannel", "Sending 'done' message.");
        this.a.c("TextInputClient.performAction", (Object)Arrays.asList((Object[])new Serializable[]{Integer.valueOf((int)n8), "TextInputAction.done"}));
    }

    public void f(int n8) {
        t5.b.f("TextInputChannel", "Sending 'go' message.");
        this.a.c("TextInputClient.performAction", (Object)Arrays.asList((Object[])new Serializable[]{Integer.valueOf((int)n8), "TextInputAction.go"}));
    }

    public void g(int n8) {
        t5.b.f("TextInputChannel", "Sending 'newline' message.");
        this.a.c("TextInputClient.performAction", (Object)Arrays.asList((Object[])new Serializable[]{Integer.valueOf((int)n8), "TextInputAction.newline"}));
    }

    public void h(int n8) {
        t5.b.f("TextInputChannel", "Sending 'next' message.");
        this.a.c("TextInputClient.performAction", (Object)Arrays.asList((Object[])new Serializable[]{Integer.valueOf((int)n8), "TextInputAction.next"}));
    }

    public void i(int n8, String string2, Bundle bundle) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"action", (Object)string2);
        if (bundle != null) {
            string2 = new HashMap();
            for (String string3 : bundle.keySet()) {
                Object object = bundle.get(string3);
                if (object instanceof byte[]) {
                    string2.put((Object)string3, (Object)bundle.getByteArray(string3));
                    continue;
                }
                if (object instanceof Byte) {
                    string2.put((Object)string3, (Object)bundle.getByte(string3));
                    continue;
                }
                if (object instanceof char[]) {
                    string2.put((Object)string3, (Object)bundle.getCharArray(string3));
                    continue;
                }
                if (object instanceof Character) {
                    string2.put((Object)string3, (Object)Character.valueOf((char)bundle.getChar(string3)));
                    continue;
                }
                if (object instanceof CharSequence[]) {
                    string2.put((Object)string3, (Object)bundle.getCharSequenceArray(string3));
                    continue;
                }
                if (object instanceof CharSequence) {
                    string2.put((Object)string3, (Object)bundle.getCharSequence(string3));
                    continue;
                }
                if (object instanceof float[]) {
                    string2.put((Object)string3, (Object)bundle.getFloatArray(string3));
                    continue;
                }
                if (!(object instanceof Float)) continue;
                string2.put((Object)string3, (Object)Float.valueOf((float)bundle.getFloat(string3)));
            }
            hashMap.put((Object)"data", (Object)string2);
        }
        this.a.c("TextInputClient.performPrivateCommand", (Object)Arrays.asList((Object[])new Serializable[]{Integer.valueOf((int)n8), hashMap}));
    }

    public void j(int n8) {
        t5.b.f("TextInputChannel", "Sending 'previous' message.");
        this.a.c("TextInputClient.performAction", (Object)Arrays.asList((Object[])new Serializable[]{Integer.valueOf((int)n8), "TextInputAction.previous"}));
    }

    public void k() {
        this.a.c("TextInputClient.requestExistingInputState", null);
    }

    public void l(int n8) {
        t5.b.f("TextInputChannel", "Sending 'search' message.");
        this.a.c("TextInputClient.performAction", (Object)Arrays.asList((Object[])new Serializable[]{Integer.valueOf((int)n8), "TextInputAction.search"}));
    }

    public void m(int n8) {
        t5.b.f("TextInputChannel", "Sending 'send' message.");
        this.a.c("TextInputClient.performAction", (Object)Arrays.asList((Object[])new Serializable[]{Integer.valueOf((int)n8), "TextInputAction.send"}));
    }

    public void n(f f8) {
        this.b = f8;
    }

    public void o(int n8) {
        t5.b.f("TextInputChannel", "Sending 'unspecified' message.");
        this.a.c("TextInputClient.performAction", (Object)Arrays.asList((Object[])new Serializable[]{Integer.valueOf((int)n8), "TextInputAction.unspecified"}));
    }

    public void p(int n8, String string2, int n9, int n10, int n11, int n12) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sending message to update editing state: \nText: ");
        stringBuilder.append(string2);
        stringBuilder.append("\nSelection start: ");
        stringBuilder.append(n9);
        stringBuilder.append("\nSelection end: ");
        stringBuilder.append(n10);
        stringBuilder.append("\nComposing start: ");
        stringBuilder.append(n11);
        stringBuilder.append("\nComposing end: ");
        stringBuilder.append(n12);
        t5.b.f("TextInputChannel", stringBuilder.toString());
        string2 = w.d(string2, n9, n10, n11, n12);
        this.a.c("TextInputClient.updateEditingState", (Object)Arrays.asList((Object[])new Serializable[]{Integer.valueOf((int)n8), string2}));
    }

    public void q(int n8, ArrayList arrayList) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sending message to update editing state with deltas: \nNumber of deltas: ");
        stringBuilder.append(arrayList.size());
        t5.b.f("TextInputChannel", stringBuilder.toString());
        arrayList = w.c(arrayList);
        this.a.c("TextInputClient.updateEditingStateWithDeltas", (Object)Arrays.asList((Object[])new Serializable[]{Integer.valueOf((int)n8), arrayList}));
    }

    public void r(int n8, HashMap hashMap) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sending message to update editing state for ");
        stringBuilder.append(String.valueOf((int)hashMap.size()));
        stringBuilder.append(" field(s).");
        t5.b.f("TextInputChannel", stringBuilder.toString());
        stringBuilder = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            e e8 = (e)entry.getValue();
            stringBuilder.put((Object)((String)entry.getKey()), (Object)w.d(e8.a, e8.b, e8.c, -1, -1));
        }
        this.a.c("TextInputClient.updateEditingStateWithTag", (Object)Arrays.asList((Object[])new Serializable[]{Integer.valueOf((int)n8), stringBuilder}));
    }

    public static class b {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final d f;
        public final c g;
        public final Integer h;
        public final String i;
        public final a j;
        public final String[] k;
        public final b[] l;

        public b(boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, d d8, c c8, Integer n8, String string2, a a8, String[] arrstring, b[] arrb) {
            this.a = bl;
            this.b = bl2;
            this.c = bl3;
            this.d = bl4;
            this.e = bl5;
            this.f = d8;
            this.g = c8;
            this.h = n8;
            this.i = string2;
            this.j = a8;
            this.k = arrstring;
            this.l = arrb;
        }

        public static b a(JSONObject object) {
            String string2 = object.getString("inputAction");
            if (string2 != null) {
                JSONArray jSONArray;
                b[] arrb;
                int n8;
                boolean bl = object.isNull("fields");
                int n9 = 0;
                Object var11_4 = null;
                if (!bl) {
                    jSONArray = object.getJSONArray("fields");
                    int n10 = jSONArray.length();
                    arrb = new b[n10];
                    for (n8 = 0; n8 < n10; ++n8) {
                        arrb[n8] = b.a(jSONArray.getJSONObject(n8));
                    }
                } else {
                    arrb = null;
                }
                jSONArray = b.b(string2);
                ArrayList arrayList = new ArrayList();
                string2 = object.isNull("contentCommitMimeTypes") ? null : object.getJSONArray("contentCommitMimeTypes");
                if (string2 != null) {
                    for (n8 = n9; n8 < string2.length(); ++n8) {
                        arrayList.add((Object)string2.optString(n8));
                    }
                }
                bl = object.optBoolean("obscureText");
                boolean bl2 = object.optBoolean("autocorrect", true);
                boolean bl3 = object.optBoolean("enableSuggestions");
                boolean bl4 = object.optBoolean("enableIMEPersonalizedLearning");
                boolean bl5 = object.optBoolean("enableDeltaModel");
                d d8 = d.e(object.getString("textCapitalization"));
                c c8 = c.a(object.getJSONObject("inputType"));
                string2 = object.isNull("actionLabel") ? null : object.getString("actionLabel");
                object = object.isNull("autofill") ? var11_4 : a.a(object.getJSONObject("autofill"));
                return new b(bl, bl2, bl3, bl4, bl5, d8, c8, (Integer)jSONArray, string2, (a)object, (String[])arrayList.toArray((Object[])new String[arrayList.size()]), arrb);
            }
            throw new JSONException("Configuration JSON missing 'inputAction' property.");
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public static Integer b(String var0) {
            block23 : {
                block24 : {
                    var0.hashCode();
                    var2_1 = var0.hashCode();
                    var1_2 = 1;
                    var3_3 = 1;
                    var4_4 = 0;
                    switch (var2_1) {
                        case 2110497650: {
                            if (!var0.equals((Object)"TextInputAction.previous")) break;
                            var1_2 = 8;
                            ** break;
                        }
                        case 1539450297: {
                            if (!var0.equals((Object)"TextInputAction.newline")) break;
                            var1_2 = 7;
                            ** break;
                        }
                        case 1241689507: {
                            if (!var0.equals((Object)"TextInputAction.go")) break;
                            var1_2 = 6;
                            ** break;
                        }
                        case 469250275: {
                            if (!var0.equals((Object)"TextInputAction.search")) break;
                            var1_2 = 5;
                            ** break;
                        }
                        case -736940669: {
                            if (!var0.equals((Object)"TextInputAction.send")) break;
                            var1_2 = 4;
                            ** break;
                        }
                        case -737080013: {
                            if (!var0.equals((Object)"TextInputAction.none")) break;
                            var1_2 = 3;
                            ** break;
                        }
                        case -737089298: {
                            if (!var0.equals((Object)"TextInputAction.next")) break;
                            var1_2 = 2;
                            ** break;
                        }
                        case -737377923: {
                            if (!var0.equals((Object)"TextInputAction.done")) {
                                break;
                            }
                            break block23;
                        }
                        case -810971940: {
                            if (var0.equals((Object)"TextInputAction.unspecified")) break block24;
                        }
                    }
                    var1_2 = -1;
                    ** break;
                }
                var1_2 = 0;
            }
            switch (var1_2) {
                default: {
                    return var4_4;
                }
                case 8: {
                    return 7;
                }
                case 7: {
                    return var3_3;
                }
                case 6: {
                    return 2;
                }
                case 5: {
                    return 3;
                }
                case 4: {
                    return 4;
                }
                case 3: {
                    return var3_3;
                }
                case 2: {
                    return 5;
                }
                case 1: {
                    return 6;
                }
                case 0: 
            }
            return var4_4;
        }

        public static class a {
            public final String a;
            public final String[] b;
            public final e c;
            public final String d;

            public a(String string2, String[] arrstring, String string3, e e8) {
                this.a = string2;
                this.b = arrstring;
                this.d = string3;
                this.c = e8;
            }

            public static a a(JSONObject jSONObject) {
                String string2 = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                String string3 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                jSONObject = jSONObject.getJSONObject("editingValue");
                String[] arrstring = new String[jSONArray.length()];
                for (int i8 = 0; i8 < jSONArray.length(); ++i8) {
                    arrstring[i8] = a.b(jSONArray.getString(i8));
                }
                return new a(string2, arrstring, string3, e.a(jSONObject));
            }

            /*
             * Unable to fully structure code
             * Enabled aggressive block sorting
             * Lifted jumps to return sites
             */
            public static String b(String var0) {
                block78 : {
                    block79 : {
                        var2_1 = Build.VERSION.SDK_INT;
                        var1_2 = 26;
                        if (var2_1 < 26) {
                            return var0;
                        }
                        var0.hashCode();
                        switch (var0.hashCode()) {
                            case 2011773919: {
                                if (!var0.equals((Object)"birthdayDay")) break;
                                var1_2 = 35;
                                ** break;
                            }
                            case 2011152728: {
                                if (!var0.equals((Object)"postalCode")) break;
                                var1_2 = 34;
                                ** break;
                            }
                            case 1921869058: {
                                if (!var0.equals((Object)"postalAddressExtended")) break;
                                var1_2 = 33;
                                ** break;
                            }
                            case 1662667945: {
                                if (!var0.equals((Object)"postalAddress")) break;
                                var1_2 = 32;
                                ** break;
                            }
                            case 1469046696: {
                                if (!var0.equals((Object)"givenName")) break;
                                var1_2 = 31;
                                ** break;
                            }
                            case 1216985755: {
                                if (!var0.equals((Object)"password")) break;
                                var1_2 = 30;
                                ** break;
                            }
                            case 1069376125: {
                                if (!var0.equals((Object)"birthday")) break;
                                var1_2 = 29;
                                ** break;
                            }
                            case 991032982: {
                                if (!var0.equals((Object)"newUsername")) break;
                                var1_2 = 28;
                                ** break;
                            }
                            case 892233837: {
                                if (!var0.equals((Object)"telephoneNumber")) break;
                                var1_2 = 27;
                                ** break;
                            }
                            case 798554127: {
                                if (!var0.equals((Object)"familyName")) {
                                    break;
                                }
                                break block78;
                            }
                            case 588174851: {
                                if (!var0.equals((Object)"birthdayMonth")) break;
                                var1_2 = 25;
                                ** break;
                            }
                            case 253202685: {
                                if (!var0.equals((Object)"addressState")) break;
                                var1_2 = 24;
                                ** break;
                            }
                            case 96619420: {
                                if (!var0.equals((Object)"email")) break;
                                var1_2 = 23;
                                ** break;
                            }
                            case 3373707: {
                                if (!var0.equals((Object)"name")) break;
                                var1_2 = 22;
                                ** break;
                            }
                            case -265713450: {
                                if (!var0.equals((Object)"username")) break;
                                var1_2 = 21;
                                ** break;
                            }
                            case -549230602: {
                                if (!var0.equals((Object)"telephoneNumberCountryCode")) break;
                                var1_2 = 20;
                                ** break;
                            }
                            case -613352043: {
                                if (!var0.equals((Object)"creditCardExpirationYear")) break;
                                var1_2 = 19;
                                ** break;
                            }
                            case -613980922: {
                                if (!var0.equals((Object)"creditCardExpirationDate")) break;
                                var1_2 = 18;
                                ** break;
                            }
                            case -747304516: {
                                if (!var0.equals((Object)"nameSuffix")) break;
                                var1_2 = 17;
                                ** break;
                            }
                            case -818219584: {
                                if (!var0.equals((Object)"middleName")) break;
                                var1_2 = 16;
                                ** break;
                            }
                            case -835992323: {
                                if (!var0.equals((Object)"namePrefix")) break;
                                var1_2 = 15;
                                ** break;
                            }
                            case -1151034798: {
                                if (!var0.equals((Object)"creditCardNumber")) break;
                                var1_2 = 14;
                                ** break;
                            }
                            case -1186060294: {
                                if (!var0.equals((Object)"postalAddressExtendedPostalCode")) break;
                                var1_2 = 13;
                                ** break;
                            }
                            case -1249512767: {
                                if (!var0.equals((Object)"gender")) break;
                                var1_2 = 12;
                                ** break;
                            }
                            case -1377792129: {
                                if (!var0.equals((Object)"addressCity")) break;
                                var1_2 = 11;
                                ** break;
                            }
                            case -1413737489: {
                                if (!var0.equals((Object)"middleInitial")) break;
                                var1_2 = 10;
                                ** break;
                            }
                            case -1476752575: {
                                if (!var0.equals((Object)"countryName")) break;
                                var1_2 = 9;
                                ** break;
                            }
                            case -1567118045: {
                                if (!var0.equals((Object)"telephoneNumberDevice")) break;
                                var1_2 = 8;
                                ** break;
                            }
                            case -1658955742: {
                                if (!var0.equals((Object)"fullStreetAddress")) break;
                                var1_2 = 7;
                                ** break;
                            }
                            case -1682373820: {
                                if (!var0.equals((Object)"creditCardExpirationDay")) break;
                                var1_2 = 6;
                                ** break;
                            }
                            case -1757573738: {
                                if (!var0.equals((Object)"creditCardSecurityCode")) break;
                                var1_2 = 5;
                                ** break;
                            }
                            case -1821235109: {
                                if (!var0.equals((Object)"newPassword")) break;
                                var1_2 = 4;
                                ** break;
                            }
                            case -1825589953: {
                                if (!var0.equals((Object)"telephoneNumberNational")) break;
                                var1_2 = 3;
                                ** break;
                            }
                            case -1844815832: {
                                if (!var0.equals((Object)"creditCardExpirationMonth")) break;
                                var1_2 = 2;
                                ** break;
                            }
                            case -1917283616: {
                                if (!var0.equals((Object)"oneTimeCode")) break;
                                var1_2 = 1;
                                ** break;
                            }
                            case -2058889126: {
                                if (var0.equals((Object)"birthdayYear")) break block79;
                            }
                        }
                        var1_2 = -1;
                        ** break;
                    }
                    var1_2 = 0;
                }
                switch (var1_2) {
                    default: {
                        return var0;
                    }
                    case 35: {
                        return "birthDateDay";
                    }
                    case 34: {
                        return "postalCode";
                    }
                    case 33: {
                        return "extendedAddress";
                    }
                    case 32: {
                        return "postalAddress";
                    }
                    case 31: {
                        return "personGivenName";
                    }
                    case 30: {
                        return "password";
                    }
                    case 29: {
                        return "birthDateFull";
                    }
                    case 28: {
                        return "newUsername";
                    }
                    case 27: {
                        return "phoneNumber";
                    }
                    case 26: {
                        return "personFamilyName";
                    }
                    case 25: {
                        return "birthDateMonth";
                    }
                    case 24: {
                        return "addressRegion";
                    }
                    case 23: {
                        return "emailAddress";
                    }
                    case 22: {
                        return "personName";
                    }
                    case 21: {
                        return "username";
                    }
                    case 20: {
                        return "phoneCountryCode";
                    }
                    case 19: {
                        return "creditCardExpirationYear";
                    }
                    case 18: {
                        return "creditCardExpirationDate";
                    }
                    case 17: {
                        return "personNameSuffix";
                    }
                    case 16: {
                        return "personMiddleName";
                    }
                    case 15: {
                        return "personNamePrefix";
                    }
                    case 14: {
                        return "creditCardNumber";
                    }
                    case 13: {
                        return "extendedPostalCode";
                    }
                    case 12: {
                        return "gender";
                    }
                    case 11: {
                        return "addressLocality";
                    }
                    case 10: {
                        return "personMiddleInitial";
                    }
                    case 9: {
                        return "addressCountry";
                    }
                    case 8: {
                        return "phoneNumberDevice";
                    }
                    case 7: {
                        return "streetAddress";
                    }
                    case 6: {
                        return "creditCardExpirationDay";
                    }
                    case 5: {
                        return "creditCardSecurityCode";
                    }
                    case 4: {
                        return "newPassword";
                    }
                    case 3: {
                        return "phoneNational";
                    }
                    case 2: {
                        return "creditCardExpirationMonth";
                    }
                    case 1: {
                        return "smsOTPCode";
                    }
                    case 0: 
                }
                return "birthDateYear";
            }
        }

    }

    public static class c {
        public final g a;
        public final boolean b;
        public final boolean c;

        public c(g g8, boolean bl, boolean bl2) {
            this.a = g8;
            this.b = bl;
            this.c = bl2;
        }

        public static c a(JSONObject jSONObject) {
            return new c(g.e(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    public static final class d
    extends Enum {
        public static final /* enum */ d p = new d("TextCapitalization.characters");
        public static final /* enum */ d q = new d("TextCapitalization.words");
        public static final /* enum */ d r = new d("TextCapitalization.sentences");
        public static final /* enum */ d s = new d("TextCapitalization.none");
        public static final /* synthetic */ d[] t;
        public final String o;

        static {
            t = d.c();
        }

        public d(String string3) {
            this.o = string3;
        }

        public static /* synthetic */ d[] c() {
            return new d[]{p, q, r, s};
        }

        public static d e(String string2) {
            for (d d8 : d.values()) {
                if (!d8.o.equals((Object)string2)) continue;
                return d8;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No such TextCapitalization: ");
            stringBuilder.append(string2);
            throw new NoSuchFieldException(stringBuilder.toString());
        }

        public static d valueOf(String string2) {
            return (d)Enum.valueOf(d.class, (String)string2);
        }

        public static d[] values() {
            return (d[])t.clone();
        }
    }

    public static class e {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public e(String string2, int n8, int n9, int n10, int n11) {
            if (n8 == -1 && n9 == -1 || n8 >= 0 && n9 >= 0) {
                if (n10 == -1 && n11 == -1 || n10 >= 0 && n10 <= n11) {
                    if (n11 <= string2.length()) {
                        if (n8 <= string2.length()) {
                            if (n9 <= string2.length()) {
                                this.a = string2;
                                this.b = n8;
                                this.c = n9;
                                this.d = n10;
                                this.e = n11;
                                return;
                            }
                            string2 = new StringBuilder();
                            string2.append("invalid selection end: ");
                            string2.append(String.valueOf((int)n9));
                            throw new IndexOutOfBoundsException(string2.toString());
                        }
                        string2 = new StringBuilder();
                        string2.append("invalid selection start: ");
                        string2.append(String.valueOf((int)n8));
                        throw new IndexOutOfBoundsException(string2.toString());
                    }
                    string2 = new StringBuilder();
                    string2.append("invalid composing start: ");
                    string2.append(String.valueOf((int)n10));
                    throw new IndexOutOfBoundsException(string2.toString());
                }
                string2 = new StringBuilder();
                string2.append("invalid composing range: (");
                string2.append(String.valueOf((int)n10));
                string2.append(", ");
                string2.append(String.valueOf((int)n11));
                string2.append(")");
                throw new IndexOutOfBoundsException(string2.toString());
            }
            string2 = new StringBuilder();
            string2.append("invalid selection: (");
            string2.append(String.valueOf((int)n8));
            string2.append(", ");
            string2.append(String.valueOf((int)n9));
            string2.append(")");
            throw new IndexOutOfBoundsException(string2.toString());
        }

        public static e a(JSONObject jSONObject) {
            return new e(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        public boolean b() {
            int n8 = this.d;
            if (n8 >= 0 && this.e > n8) {
                return true;
            }
            return false;
        }

        public boolean c() {
            if (this.b >= 0) {
                return true;
            }
            return false;
        }
    }

    public static interface f {
        public void a();

        public void b();

        public void c(String var1, Bundle var2);

        public void d(int var1, boolean var2);

        public void e(double var1, double var3, double[] var5);

        public void f();

        public void g(int var1, b var2);

        public void h(e var1);

        public void i(boolean var1);

        public void j();
    }

    public static final class g
    extends Enum {
        public static final /* synthetic */ g[] A;
        public static final /* enum */ g p = new g("TextInputType.text");
        public static final /* enum */ g q = new g("TextInputType.datetime");
        public static final /* enum */ g r = new g("TextInputType.name");
        public static final /* enum */ g s = new g("TextInputType.address");
        public static final /* enum */ g t = new g("TextInputType.number");
        public static final /* enum */ g u = new g("TextInputType.phone");
        public static final /* enum */ g v = new g("TextInputType.multiline");
        public static final /* enum */ g w = new g("TextInputType.emailAddress");
        public static final /* enum */ g x = new g("TextInputType.url");
        public static final /* enum */ g y = new g("TextInputType.visiblePassword");
        public static final /* enum */ g z = new g("TextInputType.none");
        public final String o;

        static {
            A = g.c();
        }

        public g(String string3) {
            this.o = string3;
        }

        public static /* synthetic */ g[] c() {
            return new g[]{p, q, r, s, t, u, v, w, x, y, z};
        }

        public static g e(String string2) {
            for (g g8 : g.values()) {
                if (!g8.o.equals((Object)string2)) continue;
                return g8;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No such TextInputType: ");
            stringBuilder.append(string2);
            throw new NoSuchFieldException(stringBuilder.toString());
        }

        public static g valueOf(String string2) {
            return (g)Enum.valueOf(g.class, (String)string2);
        }

        public static g[] values() {
            return (g[])A.clone();
        }
    }

}

