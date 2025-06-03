// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D5;

import android.os.BaseBundle;
import android.os.Build$VERSION;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.Iterator;
import io.flutter.plugin.editing.o;
import java.util.HashMap;
import java.util.ArrayList;
import E5.l;
import E5.c;
import E5.g;
import org.json.JSONException;
import org.json.JSONArray;
import android.os.Bundle;
import org.json.JSONObject;
import t5.b;
import E5.j;
import w5.a;
import E5.k;

public class w
{
    public final k a;
    public f b;
    public final k.c c;
    
    public w(final w5.a a) {
        final k.c c = new k.c() {
            @Override
            public void onMethodCall(final j j, final k.d d) {
                if (w.a(w.this) == null) {
                    return;
                }
                final String a = j.a;
                final Object b = j.b;
                final StringBuilder sb = new StringBuilder();
                sb.append("Received '");
                sb.append(a);
                sb.append("' message.");
                t5.b.f("TextInputChannel", sb.toString());
                a.hashCode();
                final int hashCode = a.hashCode();
                final int n = 0;
                int n2 = -1;
                switch (hashCode) {
                    case 2113369584: {
                        if (!a.equals("TextInput.requestAutofill")) {
                            break;
                        }
                        n2 = 9;
                        break;
                    }
                    case 1904427655: {
                        if (!a.equals("TextInput.clearClient")) {
                            break;
                        }
                        n2 = 8;
                        break;
                    }
                    case 1727570905: {
                        if (!a.equals("TextInput.finishAutofillContext")) {
                            break;
                        }
                        n2 = 7;
                        break;
                    }
                    case 1204752139: {
                        if (!a.equals("TextInput.setEditableSizeAndTransform")) {
                            break;
                        }
                        n2 = 6;
                        break;
                    }
                    case 649192816: {
                        if (!a.equals("TextInput.sendAppPrivateCommand")) {
                            break;
                        }
                        n2 = 5;
                        break;
                    }
                    case 270803918: {
                        if (!a.equals("TextInput.show")) {
                            break;
                        }
                        n2 = 4;
                        break;
                    }
                    case 270476819: {
                        if (!a.equals("TextInput.hide")) {
                            break;
                        }
                        n2 = 3;
                        break;
                    }
                    case -37561188: {
                        if (!a.equals("TextInput.setClient")) {
                            break;
                        }
                        n2 = 2;
                        break;
                    }
                    case -1015421462: {
                        if (!a.equals("TextInput.setEditingState")) {
                            break;
                        }
                        n2 = 1;
                        break;
                    }
                    case -1779068172: {
                        if (!a.equals("TextInput.setPlatformViewClient")) {
                            break;
                        }
                        n2 = 0;
                        break;
                    }
                }
            Label_0749:
                while (true) {
                    switch (n2) {
                        default: {
                            d.c();
                            return;
                        }
                        case 9: {
                            w.a(w.this).f();
                            break;
                        }
                        case 8: {
                            w.a(w.this).b();
                            break;
                        }
                        case 7: {
                            w.a(w.this).i((boolean)b);
                            break;
                        }
                        case 6: {
                            break Label_0749;
                        }
                        case 5: {
                            break Label_0749;
                        }
                        case 4: {
                            break Label_0749;
                        }
                        case 3: {
                            break Label_0749;
                        }
                        case 2: {
                            break Label_0749;
                        }
                        case 1: {
                            break Label_0749;
                        }
                        case 0: {
                            Label_0778: {
                                break Label_0778;
                            Label_0648_Outer:
                                while (true) {
                                Label_0648:
                                    while (true) {
                                        while (true) {
                                            try {
                                                final JSONObject jsonObject = (JSONObject)b;
                                                final double double1 = jsonObject.getDouble("width");
                                                final double double2 = jsonObject.getDouble("height");
                                                final JSONArray jsonArray = jsonObject.getJSONArray("transform");
                                                final double[] array = new double[16];
                                                for (int i = n; i < 16; ++i) {
                                                    array[i] = jsonArray.getDouble(i);
                                                }
                                                w.a(w.this).e(double1, double2, array);
                                                d.a(null);
                                                return;
                                                w.a(w.this).a();
                                                break Label_0749;
                                                // iftrue(Label_0828:, string == null || string.isEmpty())
                                                while (true) {
                                                    final Bundle bundle = new Bundle();
                                                    final String string;
                                                    ((BaseBundle)bundle).putString("data", string);
                                                    break Label_0648;
                                                    final JSONObject jsonObject2 = (JSONObject)b;
                                                    w.a(w.this).d(jsonObject2.getInt("platformViewId"), jsonObject2.optBoolean("usesVirtualDisplay", false));
                                                    d.a(null);
                                                    return;
                                                    final String string2;
                                                    w.a(w.this).c(string2, bundle);
                                                    d.a(null);
                                                    return;
                                                    w.a(w.this).h(e.a((JSONObject)b));
                                                    d.a(null);
                                                    return;
                                                    final JSONObject jsonObject3 = (JSONObject)b;
                                                    string2 = jsonObject3.getString("action");
                                                    string = jsonObject3.getString("data");
                                                    continue Label_0648_Outer;
                                                }
                                                w.a(w.this).j();
                                                break Label_0749;
                                                final NoSuchFieldException ex;
                                                d.b("error", ex.getMessage(), null);
                                                return;
                                                try {
                                                    final JSONArray jsonArray2 = (JSONArray)b;
                                                    w.a(w.this).g(jsonArray2.getInt(0), w.b.a(jsonArray2.getJSONObject(1)));
                                                    d.a(null);
                                                    return;
                                                }
                                                catch (NoSuchFieldException ex) {
                                                    continue;
                                                }
                                                continue Label_0749;
                                            }
                                            catch (JSONException ex) {
                                                continue;
                                            }
                                            break;
                                        }
                                        Label_0828: {
                                            final Bundle bundle = null;
                                        }
                                        continue Label_0648;
                                    }
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
                d.a(null);
            }
        };
        this.c = c;
        (this.a = new k(a, "flutter/textinput", E5.g.a)).e((k.c)c);
    }
    
    public static /* synthetic */ f a(final w w) {
        return w.b;
    }
    
    public static HashMap c(final ArrayList list) {
        final HashMap<String, JSONArray> hashMap = new HashMap<String, JSONArray>();
        final JSONArray value = new JSONArray();
        final Iterator<o> iterator = list.iterator();
        while (iterator.hasNext()) {
            value.put((Object)iterator.next().b());
        }
        hashMap.put("deltas", value);
        return hashMap;
    }
    
    public static HashMap d(final String value, final int i, final int j, final int k, final int l) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("text", value);
        hashMap.put("selectionBase", (String)i);
        hashMap.put("selectionExtent", (String)j);
        hashMap.put("composingBase", (String)k);
        hashMap.put("composingExtent", (String)l);
        return hashMap;
    }
    
    public void b(final int i, final Map map) {
        t5.b.f("TextInputChannel", "Sending 'commitContent' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(i, "TextInputAction.commitContent", map));
    }
    
    public void e(final int i) {
        t5.b.f("TextInputChannel", "Sending 'done' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(i, "TextInputAction.done"));
    }
    
    public void f(final int i) {
        t5.b.f("TextInputChannel", "Sending 'go' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(i, "TextInputAction.go"));
    }
    
    public void g(final int i) {
        t5.b.f("TextInputChannel", "Sending 'newline' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(i, "TextInputAction.newline"));
    }
    
    public void h(final int i) {
        t5.b.f("TextInputChannel", "Sending 'next' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(i, "TextInputAction.next"));
    }
    
    public void i(final int i, final String value, final Bundle bundle) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("action", value);
        if (bundle != null) {
            final HashMap<String, byte[]> value2 = new HashMap<String, byte[]>();
            for (final String s : ((BaseBundle)bundle).keySet()) {
                final Object value3 = ((BaseBundle)bundle).get(s);
                if (value3 instanceof byte[]) {
                    value2.put(s, bundle.getByteArray(s));
                }
                else if (value3 instanceof Byte) {
                    value2.put(s, (byte[])(Object)Byte.valueOf(bundle.getByte(s)));
                }
                else if (value3 instanceof char[]) {
                    value2.put(s, (byte[])bundle.getCharArray(s));
                }
                else if (value3 instanceof Character) {
                    value2.put(s, (byte[])(Object)Character.valueOf(bundle.getChar(s)));
                }
                else if (value3 instanceof CharSequence[]) {
                    value2.put(s, (byte[])bundle.getCharSequenceArray(s));
                }
                else if (value3 instanceof CharSequence) {
                    value2.put(s, (byte[])(Object)bundle.getCharSequence(s));
                }
                else if (value3 instanceof float[]) {
                    value2.put(s, (byte[])bundle.getFloatArray(s));
                }
                else {
                    if (!(value3 instanceof Float)) {
                        continue;
                    }
                    value2.put(s, (byte[])(Object)Float.valueOf(bundle.getFloat(s)));
                }
            }
            hashMap.put("data", (String)value2);
        }
        this.a.c("TextInputClient.performPrivateCommand", Arrays.asList(i, hashMap));
    }
    
    public void j(final int i) {
        t5.b.f("TextInputChannel", "Sending 'previous' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(i, "TextInputAction.previous"));
    }
    
    public void k() {
        this.a.c("TextInputClient.requestExistingInputState", null);
    }
    
    public void l(final int i) {
        t5.b.f("TextInputChannel", "Sending 'search' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(i, "TextInputAction.search"));
    }
    
    public void m(final int i) {
        t5.b.f("TextInputChannel", "Sending 'send' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(i, "TextInputAction.send"));
    }
    
    public void n(final f b) {
        this.b = b;
    }
    
    public void o(final int i) {
        t5.b.f("TextInputChannel", "Sending 'unspecified' message.");
        this.a.c("TextInputClient.performAction", Arrays.asList(i, "TextInputAction.unspecified"));
    }
    
    public void p(final int i, final String str, final int j, final int k, final int l, final int m) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Sending message to update editing state: \nText: ");
        sb.append(str);
        sb.append("\nSelection start: ");
        sb.append(j);
        sb.append("\nSelection end: ");
        sb.append(k);
        sb.append("\nComposing start: ");
        sb.append(l);
        sb.append("\nComposing end: ");
        sb.append(m);
        t5.b.f("TextInputChannel", sb.toString());
        this.a.c("TextInputClient.updateEditingState", Arrays.asList(i, d(str, j, k, l, m)));
    }
    
    public void q(final int i, final ArrayList list) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Sending message to update editing state with deltas: \nNumber of deltas: ");
        sb.append(list.size());
        t5.b.f("TextInputChannel", sb.toString());
        this.a.c("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(i, c(list)));
    }
    
    public void r(final int i, final HashMap hashMap) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Sending message to update editing state for ");
        sb.append(String.valueOf(hashMap.size()));
        sb.append(" field(s).");
        t5.b.f("TextInputChannel", sb.toString());
        final HashMap<String, HashMap> hashMap2 = new HashMap<String, HashMap>();
        for (final Map.Entry<K, e> entry : hashMap.entrySet()) {
            final e e = entry.getValue();
            hashMap2.put((String)entry.getKey(), d(e.a, e.b, e.c, -1, -1));
        }
        this.a.c("TextInputClient.updateEditingStateWithTag", Arrays.asList(i, hashMap2));
    }
    
    public static class b
    {
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
        
        public b(final boolean a, final boolean b, final boolean c, final boolean d, final boolean e, final d f, final c g, final Integer h, final String i, final a j, final String[] k, final b[] l) {
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
        }
        
        public static b a(final JSONObject jsonObject) {
            final String string = jsonObject.getString("inputAction");
            if (string != null) {
                final boolean null = jsonObject.isNull("fields");
                final int n = 0;
                final a a = null;
                b[] array;
                if (!null) {
                    final JSONArray jsonArray = jsonObject.getJSONArray("fields");
                    final int length = jsonArray.length();
                    array = new b[length];
                    for (int i = 0; i < length; ++i) {
                        array[i] = a(jsonArray.getJSONObject(i));
                    }
                }
                else {
                    array = null;
                }
                final Integer b = b(string);
                final ArrayList<String> list = new ArrayList<String>();
                JSONArray jsonArray2;
                if (jsonObject.isNull("contentCommitMimeTypes")) {
                    jsonArray2 = null;
                }
                else {
                    jsonArray2 = jsonObject.getJSONArray("contentCommitMimeTypes");
                }
                if (jsonArray2 != null) {
                    for (int j = n; j < jsonArray2.length(); ++j) {
                        list.add(jsonArray2.optString(j));
                    }
                }
                final boolean optBoolean = jsonObject.optBoolean("obscureText");
                final boolean optBoolean2 = jsonObject.optBoolean("autocorrect", true);
                final boolean optBoolean3 = jsonObject.optBoolean("enableSuggestions");
                final boolean optBoolean4 = jsonObject.optBoolean("enableIMEPersonalizedLearning");
                final boolean optBoolean5 = jsonObject.optBoolean("enableDeltaModel");
                final d e = d.e(jsonObject.getString("textCapitalization"));
                final c a2 = c.a(jsonObject.getJSONObject("inputType"));
                String string2;
                if (jsonObject.isNull("actionLabel")) {
                    string2 = null;
                }
                else {
                    string2 = jsonObject.getString("actionLabel");
                }
                a a3;
                if (jsonObject.isNull("autofill")) {
                    a3 = a;
                }
                else {
                    a3 = w.b.a.a(jsonObject.getJSONObject("autofill"));
                }
                return new b(optBoolean, optBoolean2, optBoolean3, optBoolean4, optBoolean5, e, a2, b, string2, a3, list.toArray(new String[list.size()]), array);
            }
            throw new JSONException("Configuration JSON missing 'inputAction' property.");
        }
        
        public static Integer b(final String s) {
            s.hashCode();
            final int hashCode = s.hashCode();
            int n = 1;
            final Integer value = 1;
            final Integer value2 = 0;
            Label_0261: {
                switch (hashCode) {
                    case 2110497650: {
                        if (!s.equals("TextInputAction.previous")) {
                            break;
                        }
                        n = 8;
                        break Label_0261;
                    }
                    case 1539450297: {
                        if (!s.equals("TextInputAction.newline")) {
                            break;
                        }
                        n = 7;
                        break Label_0261;
                    }
                    case 1241689507: {
                        if (!s.equals("TextInputAction.go")) {
                            break;
                        }
                        n = 6;
                        break Label_0261;
                    }
                    case 469250275: {
                        if (!s.equals("TextInputAction.search")) {
                            break;
                        }
                        n = 5;
                        break Label_0261;
                    }
                    case -736940669: {
                        if (!s.equals("TextInputAction.send")) {
                            break;
                        }
                        n = 4;
                        break Label_0261;
                    }
                    case -737080013: {
                        if (!s.equals("TextInputAction.none")) {
                            break;
                        }
                        n = 3;
                        break Label_0261;
                    }
                    case -737089298: {
                        if (!s.equals("TextInputAction.next")) {
                            break;
                        }
                        n = 2;
                        break Label_0261;
                    }
                    case -737377923: {
                        if (!s.equals("TextInputAction.done")) {
                            break;
                        }
                        break Label_0261;
                    }
                    case -810971940: {
                        if (!s.equals("TextInputAction.unspecified")) {
                            break;
                        }
                        n = 0;
                        break Label_0261;
                    }
                }
                n = -1;
            }
            switch (n) {
                default: {
                    return value2;
                }
                case 8: {
                    return 7;
                }
                case 7: {
                    return value;
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
                    return value;
                }
                case 2: {
                    return 5;
                }
                case 1: {
                    return 6;
                }
                case 0: {
                    return value2;
                }
            }
        }
        
        public static class a
        {
            public final String a;
            public final String[] b;
            public final e c;
            public final String d;
            
            public a(final String a, final String[] b, final String d, final e c) {
                this.a = a;
                this.b = b;
                this.d = d;
                this.c = c;
            }
            
            public static a a(JSONObject jsonObject) {
                final String string = jsonObject.getString("uniqueIdentifier");
                final JSONArray jsonArray = jsonObject.getJSONArray("hints");
                String string2;
                if (jsonObject.isNull("hintText")) {
                    string2 = null;
                }
                else {
                    string2 = jsonObject.getString("hintText");
                }
                jsonObject = jsonObject.getJSONObject("editingValue");
                final String[] array = new String[jsonArray.length()];
                for (int i = 0; i < jsonArray.length(); ++i) {
                    array[i] = b(jsonArray.getString(i));
                }
                return new a(string, array, string2, e.a(jsonObject));
            }
            
            public static String b(final String s) {
                final int sdk_INT = Build$VERSION.SDK_INT;
                int n = 26;
                if (sdk_INT < 26) {
                    return s;
                }
                s.hashCode();
                Label_0962: {
                    switch (s) {
                        case "birthdayDay": {
                            n = 35;
                            break Label_0962;
                        }
                        case "postalCode": {
                            n = 34;
                            break Label_0962;
                        }
                        case "postalAddressExtended": {
                            n = 33;
                            break Label_0962;
                        }
                        case "postalAddress": {
                            n = 32;
                            break Label_0962;
                        }
                        case "givenName": {
                            n = 31;
                            break Label_0962;
                        }
                        case "password": {
                            n = 30;
                            break Label_0962;
                        }
                        case "birthday": {
                            n = 29;
                            break Label_0962;
                        }
                        case "newUsername": {
                            n = 28;
                            break Label_0962;
                        }
                        case "telephoneNumber": {
                            n = 27;
                            break Label_0962;
                        }
                        case "familyName": {
                            break Label_0962;
                        }
                        case "birthdayMonth": {
                            n = 25;
                            break Label_0962;
                        }
                        case "addressState": {
                            n = 24;
                            break Label_0962;
                        }
                        case "email": {
                            n = 23;
                            break Label_0962;
                        }
                        case "name": {
                            n = 22;
                            break Label_0962;
                        }
                        case "username": {
                            n = 21;
                            break Label_0962;
                        }
                        case "telephoneNumberCountryCode": {
                            n = 20;
                            break Label_0962;
                        }
                        case "creditCardExpirationYear": {
                            n = 19;
                            break Label_0962;
                        }
                        case "creditCardExpirationDate": {
                            n = 18;
                            break Label_0962;
                        }
                        case "nameSuffix": {
                            n = 17;
                            break Label_0962;
                        }
                        case "middleName": {
                            n = 16;
                            break Label_0962;
                        }
                        case "namePrefix": {
                            n = 15;
                            break Label_0962;
                        }
                        case "creditCardNumber": {
                            n = 14;
                            break Label_0962;
                        }
                        case "postalAddressExtendedPostalCode": {
                            n = 13;
                            break Label_0962;
                        }
                        case "gender": {
                            n = 12;
                            break Label_0962;
                        }
                        case "addressCity": {
                            n = 11;
                            break Label_0962;
                        }
                        case "middleInitial": {
                            n = 10;
                            break Label_0962;
                        }
                        case "countryName": {
                            n = 9;
                            break Label_0962;
                        }
                        case "telephoneNumberDevice": {
                            n = 8;
                            break Label_0962;
                        }
                        case "fullStreetAddress": {
                            n = 7;
                            break Label_0962;
                        }
                        case "creditCardExpirationDay": {
                            n = 6;
                            break Label_0962;
                        }
                        case "creditCardSecurityCode": {
                            n = 5;
                            break Label_0962;
                        }
                        case "newPassword": {
                            n = 4;
                            break Label_0962;
                        }
                        case "telephoneNumberNational": {
                            n = 3;
                            break Label_0962;
                        }
                        case "creditCardExpirationMonth": {
                            n = 2;
                            break Label_0962;
                        }
                        case "oneTimeCode": {
                            n = 1;
                            break Label_0962;
                        }
                        case "birthdayYear": {
                            n = 0;
                            break Label_0962;
                        }
                        default:
                            break;
                    }
                    n = -1;
                }
                switch (n) {
                    default: {
                        return s;
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
                    case 0: {
                        return "birthDateYear";
                    }
                }
            }
        }
    }
    
    public static class c
    {
        public final g a;
        public final boolean b;
        public final boolean c;
        
        public c(final g a, final boolean b, final boolean c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public static c a(final JSONObject jsonObject) {
            return new c(g.e(jsonObject.getString("name")), jsonObject.optBoolean("signed", false), jsonObject.optBoolean("decimal", false));
        }
    }
    
    public enum d
    {
        p("CHARACTERS", 0, "TextCapitalization.characters"), 
        q("WORDS", 1, "TextCapitalization.words"), 
        r("SENTENCES", 2, "TextCapitalization.sentences"), 
        s("NONE", 3, "TextCapitalization.none");
        
        public final String o;
        
        static {
            t = c();
        }
        
        public d(final String name, final int ordinal, final String o) {
            this.o = o;
        }
        
        public static /* synthetic */ d[] c() {
            return new d[] { d.p, d.q, d.r, d.s };
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
            sb.append("No such TextCapitalization: ");
            sb.append(s);
            throw new NoSuchFieldException(sb.toString());
        }
    }
    
    public static class e
    {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        
        public e(final String a, final int b, final int i, final int d, final int n) {
            if ((b != -1 || i != -1) && (b < 0 || i < 0)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("invalid selection: (");
                sb.append(String.valueOf(b));
                sb.append(", ");
                sb.append(String.valueOf(i));
                sb.append(")");
                throw new IndexOutOfBoundsException(sb.toString());
            }
            if ((d != -1 || n != -1) && (d < 0 || d > n)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("invalid composing range: (");
                sb2.append(String.valueOf(d));
                sb2.append(", ");
                sb2.append(String.valueOf(n));
                sb2.append(")");
                throw new IndexOutOfBoundsException(sb2.toString());
            }
            if (n > a.length()) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("invalid composing start: ");
                sb3.append(String.valueOf(d));
                throw new IndexOutOfBoundsException(sb3.toString());
            }
            if (b > a.length()) {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append("invalid selection start: ");
                sb4.append(String.valueOf(b));
                throw new IndexOutOfBoundsException(sb4.toString());
            }
            if (i <= a.length()) {
                this.a = a;
                this.b = b;
                this.c = i;
                this.d = d;
                this.e = n;
                return;
            }
            final StringBuilder sb5 = new StringBuilder();
            sb5.append("invalid selection end: ");
            sb5.append(String.valueOf(i));
            throw new IndexOutOfBoundsException(sb5.toString());
        }
        
        public static e a(final JSONObject jsonObject) {
            return new e(jsonObject.getString("text"), jsonObject.getInt("selectionBase"), jsonObject.getInt("selectionExtent"), jsonObject.getInt("composingBase"), jsonObject.getInt("composingExtent"));
        }
        
        public boolean b() {
            final int d = this.d;
            return d >= 0 && this.e > d;
        }
        
        public boolean c() {
            return this.b >= 0;
        }
    }
    
    public interface f
    {
        void a();
        
        void b();
        
        void c(final String p0, final Bundle p1);
        
        void d(final int p0, final boolean p1);
        
        void e(final double p0, final double p1, final double[] p2);
        
        void f();
        
        void g(final int p0, final b p1);
        
        void h(final e p0);
        
        void i(final boolean p0);
        
        void j();
    }
    
    public enum g
    {
        p("TEXT", 0, "TextInputType.text"), 
        q("DATETIME", 1, "TextInputType.datetime"), 
        r("NAME", 2, "TextInputType.name"), 
        s("POSTAL_ADDRESS", 3, "TextInputType.address"), 
        t("NUMBER", 4, "TextInputType.number"), 
        u("PHONE", 5, "TextInputType.phone"), 
        v("MULTILINE", 6, "TextInputType.multiline"), 
        w("EMAIL_ADDRESS", 7, "TextInputType.emailAddress"), 
        x("URL", 8, "TextInputType.url"), 
        y("VISIBLE_PASSWORD", 9, "TextInputType.visiblePassword"), 
        z("NONE", 10, "TextInputType.none");
        
        public final String o;
        
        static {
            A = c();
        }
        
        public g(final String name, final int ordinal, final String o) {
            this.o = o;
        }
        
        public static /* synthetic */ g[] c() {
            return new g[] { g.p, g.q, g.r, g.s, g.t, g.u, g.v, g.w, g.x, g.y, g.z };
        }
        
        public static g e(final String s) {
            final g[] values = values();
            for (int length = values.length, i = 0; i < length; ++i) {
                final g g = values[i];
                if (g.o.equals(s)) {
                    return g;
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("No such TextInputType: ");
            sb.append(s);
            throw new NoSuchFieldException(sb.toString());
        }
    }
}
