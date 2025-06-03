// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package K1;

import java.util.regex.Pattern;
import android.util.Patterns;
import kotlin.text.i;
import W5.C;
import V5.q;
import V5.m;
import kotlin.text.b;
import java.io.FileInputStream;
import java.io.File;
import org.json.JSONException;
import org.json.JSONArray;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import java.util.Map;

public final class a
{
    public static final a a;
    public static Map b;
    public static Map c;
    public static Map d;
    public static JSONObject e;
    public static boolean f;
    
    static {
        a = new a();
    }
    
    public static final float[] a(final JSONObject jsonObject, String lowerCase) {
        if (T1.a.d(a.class)) {
            return null;
        }
        Label_0188: {
            float[] array;
            try {
                Intrinsics.checkNotNullParameter(jsonObject, "viewHierarchy");
                Intrinsics.checkNotNullParameter(lowerCase, "appName");
                if (!K1.a.f) {
                    return null;
                }
                array = new float[30];
                for (int i = 0; i < 30; ++i) {
                    array[i] = 0.0f;
                }
            }
            finally {
                break Label_0188;
            }
            try {
                lowerCase = lowerCase.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                final JSONObject jsonObject3;
                final JSONObject jsonObject2 = new JSONObject(jsonObject3.optJSONObject("view").toString());
                final String optString = jsonObject3.optString("screenname");
                final JSONArray jsonArray = new JSONArray();
                final a a = K1.a.a;
                a.j(jsonObject2, jsonArray);
                a.m(array, a.i(jsonObject2));
                final JSONObject b = a.b(jsonObject2);
                if (b == null) {
                    return null;
                }
                Intrinsics.checkNotNullExpressionValue(optString, "screenName");
                final String string = jsonObject2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "viewTree.toString()");
                a.m(array, a.h(b, jsonArray, optString, string, lowerCase));
                return array;
                T1.a.b((Throwable)jsonObject3, a.class);
                return null;
            }
            catch (JSONException ex) {
                return array;
            }
        }
    }
    
    public static final String c(String str, final String str2, final String str3) {
        if (T1.a.d(a.class)) {
            return null;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(str, "buttonText");
                Intrinsics.checkNotNullParameter(str2, "activityName");
                Intrinsics.checkNotNullParameter(str3, "appName");
                final StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(" | ");
                sb.append(str2);
                sb.append(", ");
                sb.append(str);
                str = sb.toString();
                if (str != null) {
                    str = str.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.String).toLowerCase()");
                    return str;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                final Throwable t;
                T1.a.b(t, a.class);
                return null;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final void d(final File file) {
        if (T1.a.d(a.class)) {
            return;
        }
        try {
            try {
                K1.a.e = new JSONObject();
                final FileInputStream fileInputStream = new FileInputStream(file);
                final byte[] array = new byte[fileInputStream.available()];
                fileInputStream.read(array);
                fileInputStream.close();
                K1.a.e = new JSONObject(new String(array, kotlin.text.b.b));
                K1.a.b = C.f(q.a("ENGLISH", "1"), q.a("GERMAN", "2"), q.a("SPANISH", "3"), q.a("JAPANESE", "4"));
                K1.a.c = C.f(q.a("VIEW_CONTENT", "0"), q.a("SEARCH", "1"), q.a("ADD_TO_CART", "2"), q.a("ADD_TO_WISHLIST", "3"), q.a("INITIATE_CHECKOUT", "4"), q.a("ADD_PAYMENT_INFO", "5"), q.a("PURCHASE", "6"), q.a("LEAD", "7"), q.a("COMPLETE_REGISTRATION", "8"));
                K1.a.d = C.f(q.a("BUTTON_TEXT", "1"), q.a("PAGE_TITLE", "2"), q.a("RESOLVED_DOCUMENT_LINK", "3"), q.a("BUTTON_ID", "4"));
                K1.a.f = true;
            }
            finally {
                final Throwable t;
                T1.a.b(t, a.class);
            }
        }
        catch (Exception ex) {}
    }
    
    public static final boolean f() {
        if (T1.a.d(a.class)) {
            return false;
        }
        try {
            return K1.a.f;
        }
        finally {
            final Throwable t;
            T1.a.b(t, a.class);
            return false;
        }
    }
    
    public final JSONObject b(final JSONObject jsonObject) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            if (jsonObject.optBoolean("is_interacted")) {
                return jsonObject;
            }
            final JSONArray optJSONArray = jsonObject.optJSONArray("childviews");
            if (optJSONArray == null) {
                return null;
            }
            final int length = optJSONArray.length();
            if (length <= 0) {
                goto Label_0099;
            }
            int n = 0;
            while (true) {
                final int n2 = n + 1;
                final JSONObject jsonObject2 = optJSONArray.getJSONObject(n);
                Intrinsics.checkNotNullExpressionValue(jsonObject2, "children.getJSONObject(i)");
                final JSONObject b = this.b(jsonObject2);
                if (b != null) {
                    return b;
                }
                if (n2 >= length) {
                    return null;
                }
                n = n2;
            }
        }
        catch (JSONException ex) {
            return null;
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
        }
    }
    
    public final boolean e(final JSONObject jsonObject) {
        final boolean d = T1.a.d(this);
        boolean b = false;
        if (d) {
            return false;
        }
        try {
            if ((jsonObject.optInt("classtypebitmask") & 0x1) << 5 > 0) {
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
    
    public final boolean g(final String[] array, final String[] array2) {
        if (T1.a.d(this)) {
            return false;
        }
        Label_0085: {
            try {
                final int length = array.length;
                int i = 0;
            Label_0015:
                while (i < length) {
                    final String s = array[i];
                    final int n = i + 1;
                    final int length2 = array2.length;
                    int n2 = 0;
                    String s2;
                    do {
                        i = n;
                        if (n2 >= length2) {
                            continue Label_0015;
                        }
                        s2 = array2[n2];
                        ++n2;
                    } while (!kotlin.text.i.v(s2, s, false, 2, null));
                    return true;
                }
                return false;
            }
            finally {
                break Label_0085;
            }
            return false;
        }
        final Throwable t;
        T1.a.b(t, this);
        return false;
    }
    
    public final float[] h(JSONObject string, JSONArray string2, String string3, final String s, String str) {
        if (T1.a.d(this)) {
            return null;
        }
        float[] array;
        int n;
        int length;
        float n2;
        int length2;
        int n3;
        int n4;
        JSONObject jsonObject;
        float n5;
        float n6;
        float n7;
        float n8;
        float n9;
        float n10;
        float n11;
        float n12;
        float n13;
        float n14;
        float n15;
        float n16;
        float n17;
        final JSONObject jsonObject2;
        Label_0242_Outer:Label_0269_Outer:Label_0296_Outer:Label_0323_Outer:Label_0348_Outer:Label_0373_Outer:Label_0398_Outer:Label_0425_Outer:Label_0452_Outer:Label_0476_Outer:Label_0500_Outer:Label_0527_Outer:Label_0554_Outer:
        while (true) {
            while (true) {
            Label_0679:
                while (true) {
                Label_0673:
                    while (true) {
                    Label_0667:
                        while (true) {
                        Label_0661:
                            while (true) {
                            Label_0655:
                                while (true) {
                                Label_0649:
                                    while (true) {
                                    Label_0643:
                                        while (true) {
                                        Label_0637:
                                            while (true) {
                                            Label_0631:
                                                while (true) {
                                                Label_0625:
                                                    while (true) {
                                                    Label_0619:
                                                        while (true) {
                                                        Label_0613:
                                                            while (true) {
                                                            Label_0607:
                                                                while (true) {
                                                                    Label_0601: {
                                                                        while (true) {
                                                                            try {
                                                                                array = new float[30];
                                                                                n = 0;
                                                                                while (true) {
                                                                                    if (n < 30) {
                                                                                        array[n] = 0.0f;
                                                                                        ++n;
                                                                                    }
                                                                                    else {
                                                                                        length = ((JSONArray)string2).length();
                                                                                        if (length <= 1) {
                                                                                            break Label_0601;
                                                                                        }
                                                                                        n2 = length - 1.0f;
                                                                                        array[3] = n2;
                                                                                        while (true) {
                                                                                            try {
                                                                                                length2 = ((JSONArray)string2).length();
                                                                                                if (length2 > 0) {
                                                                                                    n3 = 0;
                                                                                                    while (true) {
                                                                                                        n4 = n3 + 1;
                                                                                                        jsonObject = ((JSONArray)string2).getJSONObject(n3);
                                                                                                        Intrinsics.checkNotNullExpressionValue(jsonObject, "siblings.getJSONObject(i)");
                                                                                                        if (this.e(jsonObject)) {
                                                                                                            ++array[9];
                                                                                                        }
                                                                                                        if (n4 >= length2) {
                                                                                                            break;
                                                                                                        }
                                                                                                        n3 = n4;
                                                                                                    }
                                                                                                }
                                                                                                array[14] = (array[13] = -1.0f);
                                                                                                string2 = (JSONException)new StringBuilder();
                                                                                                ((StringBuilder)string2).append(string3);
                                                                                                ((StringBuilder)string2).append('|');
                                                                                                ((StringBuilder)string2).append(str);
                                                                                                string2 = (JSONException)((StringBuilder)string2).toString();
                                                                                                str = (String)new StringBuilder();
                                                                                                string3 = (String)new StringBuilder();
                                                                                                this.n(string, (StringBuilder)string3, (StringBuilder)str);
                                                                                                string = (JSONObject)((StringBuilder)str).toString();
                                                                                                Intrinsics.checkNotNullExpressionValue(string, "hintSB.toString()");
                                                                                                string3 = ((StringBuilder)string3).toString();
                                                                                                Intrinsics.checkNotNullExpressionValue(string3, "textSB.toString()");
                                                                                                if (!this.l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", string3)) {
                                                                                                    break Label_0607;
                                                                                                }
                                                                                                n5 = 1.0f;
                                                                                                array[15] = n5;
                                                                                                if (!this.l("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", (String)string2)) {
                                                                                                    break Label_0613;
                                                                                                }
                                                                                                n6 = 1.0f;
                                                                                                array[16] = n6;
                                                                                                if (!this.l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", (String)string)) {
                                                                                                    break Label_0619;
                                                                                                }
                                                                                                n7 = 1.0f;
                                                                                                array[17] = n7;
                                                                                                if (!i.v(s, "password", false, 2, null)) {
                                                                                                    break Label_0625;
                                                                                                }
                                                                                                n8 = 1.0f;
                                                                                                array[18] = n8;
                                                                                                if (!this.k("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", s)) {
                                                                                                    break Label_0631;
                                                                                                }
                                                                                                n9 = 1.0f;
                                                                                                array[19] = n9;
                                                                                                if (!this.k("(?i)(sign in)|login|signIn", s)) {
                                                                                                    break Label_0637;
                                                                                                }
                                                                                                n10 = 1.0f;
                                                                                                array[20] = n10;
                                                                                                if (!this.k("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", s)) {
                                                                                                    break Label_0643;
                                                                                                }
                                                                                                n11 = 1.0f;
                                                                                                array[21] = n11;
                                                                                                if (!this.l("ENGLISH", "PURCHASE", "BUTTON_TEXT", string3)) {
                                                                                                    break Label_0649;
                                                                                                }
                                                                                                n12 = 1.0f;
                                                                                                array[22] = n12;
                                                                                                if (!this.l("ENGLISH", "PURCHASE", "PAGE_TITLE", (String)string2)) {
                                                                                                    break Label_0655;
                                                                                                }
                                                                                                n13 = 1.0f;
                                                                                                array[24] = n13;
                                                                                                if (!this.k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", string3)) {
                                                                                                    break Label_0661;
                                                                                                }
                                                                                                n14 = 1.0f;
                                                                                                array[25] = n14;
                                                                                                if (!this.k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", (String)string2)) {
                                                                                                    break Label_0667;
                                                                                                }
                                                                                                n15 = 1.0f;
                                                                                                array[27] = n15;
                                                                                                if (!this.l("ENGLISH", "LEAD", "BUTTON_TEXT", string3)) {
                                                                                                    break Label_0673;
                                                                                                }
                                                                                                n16 = 1.0f;
                                                                                                array[28] = n16;
                                                                                                if (this.l("ENGLISH", "LEAD", "PAGE_TITLE", (String)string2)) {
                                                                                                    n17 = 1.0f;
                                                                                                    array[29] = n17;
                                                                                                    return array;
                                                                                                }
                                                                                                break Label_0679;
                                                                                                T1.a.b((Throwable)string, this);
                                                                                                return null;
                                                                                            }
                                                                                            catch (JSONException string2) {
                                                                                                continue Label_0242_Outer;
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {}
                                                                            string = jsonObject2;
                                                                            continue;
                                                                        }
                                                                    }
                                                                    n2 = 0.0f;
                                                                    continue Label_0242_Outer;
                                                                }
                                                                n5 = 0.0f;
                                                                continue Label_0269_Outer;
                                                            }
                                                            n6 = 0.0f;
                                                            continue Label_0296_Outer;
                                                        }
                                                        n7 = 0.0f;
                                                        continue Label_0323_Outer;
                                                    }
                                                    n8 = 0.0f;
                                                    continue Label_0348_Outer;
                                                }
                                                n9 = 0.0f;
                                                continue Label_0373_Outer;
                                            }
                                            n10 = 0.0f;
                                            continue Label_0398_Outer;
                                        }
                                        n11 = 0.0f;
                                        continue Label_0425_Outer;
                                    }
                                    n12 = 0.0f;
                                    continue Label_0452_Outer;
                                }
                                n13 = 0.0f;
                                continue Label_0476_Outer;
                            }
                            n14 = 0.0f;
                            continue Label_0500_Outer;
                        }
                        n15 = 0.0f;
                        continue Label_0527_Outer;
                    }
                    n16 = 0.0f;
                    continue Label_0554_Outer;
                }
                n17 = 0.0f;
                continue;
            }
        }
    }
    
    public final float[] i(final JSONObject jsonObject) {
        if (T1.a.d(this)) {
            return null;
        }
        float[] array = null;
        int n;
        int i = 0;
        Object input;
        String optString;
        String lowerCase;
        String s;
        String[] array2;
        Throwable t;
        JSONArray optJSONArray;
        int length;
        final Throwable t2;
        Block_15_Outer:Label_0504_Outer:Label_0314_Outer:
        while (true) {
            Label_0314:Label_0291_Outer:
            while (true) {
                while (true) {
                Label_0396_Outer:
                    while (true) {
                        try {
                            array = new float[30];
                            n = 0;
                            i = 0;
                            // iftrue(Label_0340:, !i.v((CharSequence)s, (CharSequence)"checkbox", false, 2, (Object)null))
                            // iftrue(Label_0396:, !this.g(new String[] { "complete", "confirm", "done", "submit" }, new String[] { input }))
                            // iftrue(Label_0436:, !i.v((CharSequence)s, (CharSequence)"radio", false, 2, (Object)null) || !i.v((CharSequence)s, (CharSequence)"button", false, 2, (Object)null))
                            // iftrue(Label_0576:, i == 32 || Patterns.EMAIL_ADDRESS.matcher((CharSequence)input).matches())
                            while (true) {
                            Block_12:
                                while (true) {
                                    Block_11: {
                                        while (true) {
                                            while (true) {
                                                while (true) {
                                                    while (i < 30) {
                                                        array[i] = 0.0f;
                                                        ++i;
                                                    }
                                                    input = jsonObject.optString("text");
                                                    Intrinsics.checkNotNullExpressionValue(input, "node.optString(TEXT_KEY)");
                                                    input = ((String)input).toLowerCase();
                                                    Intrinsics.checkNotNullExpressionValue(input, "(this as java.lang.String).toLowerCase()");
                                                    optString = jsonObject.optString("hint");
                                                    Intrinsics.checkNotNullExpressionValue(optString, "node.optString(HINT_KEY)");
                                                    lowerCase = optString.toLowerCase();
                                                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                                                    s = jsonObject.optString("classname");
                                                    Intrinsics.checkNotNullExpressionValue(s, "node.optString(CLASS_NAME_KEY)");
                                                    s = s.toLowerCase();
                                                    Intrinsics.checkNotNullExpressionValue(s, "(this as java.lang.String).toLowerCase()");
                                                    i = jsonObject.optInt("inputtype", -1);
                                                    array2 = new String[] { (String)input, lowerCase };
                                                    if (this.g(new String[] { "$", "amount", "price", "total" }, array2)) {
                                                        ++array[0];
                                                    }
                                                    if (this.g(new String[] { "password", "pwd" }, array2)) {
                                                        ++array[1];
                                                    }
                                                    if (this.g(new String[] { "tel", "phone" }, array2)) {
                                                        ++array[2];
                                                    }
                                                    if (this.g(new String[] { "search" }, array2)) {
                                                        ++array[4];
                                                    }
                                                    break Label_0396_Outer;
                                                    try {
                                                        Label_0436: {
                                                            optJSONArray = ((JSONObject)t).optJSONArray("childviews");
                                                        }
                                                        length = optJSONArray.length();
                                                        if (length > 0) {
                                                            i = n;
                                                            while (true) {
                                                                n = i + 1;
                                                                input = optJSONArray.getJSONObject(i);
                                                                Intrinsics.checkNotNullExpressionValue(input, "childViews.getJSONObject(i)");
                                                                this.m(array, this.i((JSONObject)input));
                                                                if (n >= length) {
                                                                    break;
                                                                }
                                                                i = n;
                                                            }
                                                            return array;
                                                        }
                                                        return array;
                                                        T1.a.b(t, this);
                                                        return null;
                                                    }
                                                    catch (JSONException ex) {
                                                        return array;
                                                    }
                                                    continue Block_15_Outer;
                                                }
                                                break Block_11;
                                                break Block_12;
                                                ++array[12];
                                                continue Label_0504_Outer;
                                            }
                                            continue Label_0396_Outer;
                                        }
                                        continue Label_0314;
                                    }
                                    ++array[8];
                                    continue Label_0396_Outer;
                                }
                                ++array[10];
                                continue Label_0291_Outer;
                            }
                        }
                        finally {}
                        t = t2;
                        continue Label_0314_Outer;
                    }
                    if (i >= 0) {
                        ++array[5];
                    }
                    if (i == 3 || i == 2) {
                        ++array[6];
                        continue;
                    }
                    continue;
                }
                Label_0576: {
                    ++array[7];
                }
                continue Label_0314;
            }
        }
    }
    
    public final boolean j(final JSONObject jsonObject, final JSONArray jsonArray) {
        if (T1.a.d(this)) {
            return false;
        }
    Label_0214_Outer:
        while (true) {
            while (true) {
                int n3 = 0;
                boolean b = false;
            Label_0099_Outer:
                while (true) {
                    int n = 0;
                Label_0099:
                    while (true) {
                        JSONArray optJSONArray;
                        int n2;
                        Throwable t;
                        JSONArray jsonArray2;
                        boolean b2;
                        int n4;
                        int n5;
                        JSONObject jsonObject2;
                        final Throwable t2;
                        Label_0214:Label_0204_Outer:
                        while (true) {
                            Label_0241: {
                                while (true) {
                                    while (true) {
                                        Label_0221: {
                                            while (true) {
                                                try {
                                                    if (jsonObject.optBoolean("is_interacted")) {
                                                        return true;
                                                    }
                                                    optJSONArray = jsonObject.optJSONArray("childviews");
                                                    n = optJSONArray.length();
                                                    if (n <= 0) {
                                                        break Label_0241;
                                                    }
                                                    n2 = 0;
                                                    n3 = n2 + 1;
                                                    if (optJSONArray.getJSONObject(n2).optBoolean("is_interacted")) {
                                                        b = true;
                                                        break Label_0214;
                                                    }
                                                    break Label_0221;
                                                    ((JSONObject)t).put("childviews", (Object)jsonArray2);
                                                    Label_0201: {
                                                        return b;
                                                    }
                                                    jsonArray2 = new JSONArray();
                                                    // iftrue(Label_0125:, !b)
                                                    Block_7: {
                                                        break Block_7;
                                                        T1.a.b(t, this);
                                                        return false;
                                                    }
                                                    n = optJSONArray.length();
                                                    b = b2;
                                                    // iftrue(Label_0201:, n <= 0)
                                                    // iftrue(Label_0247:, n3 < n)
                                                    Block_8: {
                                                        break Block_8;
                                                        n3 = n4 + 1;
                                                        jsonArray.put((Object)optJSONArray.getJSONObject(n4));
                                                        return b2;
                                                    }
                                                    n4 = 0;
                                                    continue Label_0099;
                                                    Label_0125:
                                                    n = optJSONArray.length();
                                                    b = b2;
                                                    // iftrue(Label_0192:, n <= 0)
                                                    n5 = 0;
                                                    n3 = n5 + 1;
                                                    jsonObject2 = optJSONArray.getJSONObject(n5);
                                                    Intrinsics.checkNotNullExpressionValue(jsonObject2, "child");
                                                    b = b2;
                                                    // iftrue(Label_0253:, !this.j(jsonObject2, jsonArray))
                                                    jsonArray2.put((Object)jsonObject2);
                                                    b = true;
                                                    break Label_0099;
                                                }
                                                catch (JSONException ex) {
                                                    return false;
                                                    while (true) {
                                                        break Label_0241;
                                                        Label_0231: {
                                                            n2 = n3;
                                                        }
                                                        continue Label_0214_Outer;
                                                        b2 = b;
                                                        continue Label_0204_Outer;
                                                        continue;
                                                    }
                                                }
                                                // iftrue(Label_0231:, n3 < n)
                                                break;
                                            }
                                        }
                                        break;
                                    }
                                    t = t2;
                                    continue Label_0099_Outer;
                                }
                            }
                            b = false;
                            continue Label_0214;
                        }
                        Label_0247: {
                            n4 = n3;
                        }
                        continue Label_0099;
                    }
                    if (n3 >= n) {
                        continue Label_0099_Outer;
                    }
                    break;
                }
                int n5 = n3;
                boolean b2 = b;
                continue;
            }
        }
    }
    
    public final boolean k(final String regex, final String input) {
        if (T1.a.d(this)) {
            return false;
        }
        try {
            return Pattern.compile(regex).matcher(input).find();
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
            return false;
        }
    }
    
    public final boolean l(String optString, final String s, final String s2, final String s3) {
        if (T1.a.d(this)) {
            return false;
        }
        while (true) {
            try {
                final JSONObject e = K1.a.e;
                final String s4 = null;
                if (e != null) {
                    final JSONObject optJSONObject = e.optJSONObject("rulesForLanguage");
                    JSONObject optJSONObject2;
                    if (optJSONObject == null) {
                        optJSONObject2 = null;
                    }
                    else {
                        final Map b = K1.a.b;
                        if (b == null) {
                            Intrinsics.n("languageInfo");
                            throw null;
                        }
                        optJSONObject2 = optJSONObject.optJSONObject((String)b.get(optString));
                    }
                    JSONObject optJSONObject4 = null;
                    Label_0213: {
                        if (optJSONObject2 != null) {
                            final JSONObject optJSONObject3 = optJSONObject2.optJSONObject("rulesForEvent");
                            if (optJSONObject3 != null) {
                                final Map c = K1.a.c;
                                if (c != null) {
                                    optJSONObject4 = optJSONObject3.optJSONObject((String)c.get(s));
                                    break Label_0213;
                                }
                                Intrinsics.n("eventInfo");
                                throw null;
                            }
                        }
                        optJSONObject4 = null;
                    }
                    if (optJSONObject4 == null) {
                        optString = s4;
                    }
                    else {
                        final JSONObject optJSONObject5 = optJSONObject4.optJSONObject("positiveRules");
                        if (optJSONObject5 == null) {
                            optString = s4;
                        }
                        else {
                            final Map d = K1.a.d;
                            if (d == null) {
                                Intrinsics.n("textTypeInfo");
                                throw null;
                            }
                            optString = optJSONObject5.optString((String)d.get(s2));
                        }
                    }
                    return optString != null && this.k(optString, s3);
                }
                Intrinsics.n("rules");
                throw null;
                final Throwable t;
                T1.a.b(t, this);
                return false;
            }
            finally {}
            final Throwable t2;
            final Throwable t = t2;
            continue;
        }
    }
    
    public final void m(final float[] array, final float[] array2) {
        if (T1.a.d(this)) {
            return;
        }
        Label_0055: {
            try {
                final int n = array.length - 1;
                if (n >= 0) {
                    int n2 = 0;
                    while (true) {
                        final int n3 = n2 + 1;
                        array[n2] += array2[n2];
                        if (n3 > n) {
                            break;
                        }
                        n2 = n3;
                    }
                    return;
                }
            }
            finally {
                break Label_0055;
            }
            return;
        }
        final Throwable t;
        T1.a.b(t, this);
    }
    
    public final void n(JSONObject optJSONArray, final StringBuilder sb, final StringBuilder sb2) {
        if (T1.a.d(this)) {
            return;
        }
        while (true) {
            try {
                final String optString = optJSONArray.optString("text", "");
                Intrinsics.checkNotNullExpressionValue(optString, "view.optString(TEXT_KEY, \"\")");
                final String lowerCase = optString.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                final String optString2 = optJSONArray.optString("hint", "");
                Intrinsics.checkNotNullExpressionValue(optString2, "view.optString(HINT_KEY, \"\")");
                final String lowerCase2 = optString2.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
                if (lowerCase.length() > 0) {
                    sb.append(lowerCase);
                    sb.append(" ");
                }
                if (lowerCase2.length() > 0) {
                    sb2.append(lowerCase2);
                    sb2.append(" ");
                }
                optJSONArray = (JSONObject)optJSONArray.optJSONArray("childviews");
                if (optJSONArray == null) {
                    return;
                }
                final int length = ((JSONArray)optJSONArray).length();
                if (length <= 0) {
                    return;
                }
                int n = 0;
                while (true) {
                    final int n2 = n + 1;
                    try {
                        final JSONObject jsonObject = ((JSONArray)optJSONArray).getJSONObject(n);
                        Intrinsics.checkNotNullExpressionValue(jsonObject, "currentChildView");
                        this.n(jsonObject, sb, sb2);
                        if (n2 >= length) {
                            return;
                        }
                        n = n2;
                        continue;
                        T1.a.b((Throwable)optJSONArray, this);
                        return;
                    }
                    catch (JSONException ex) {}
                }
            }
            finally {}
            final JSONObject jsonObject2;
            optJSONArray = jsonObject2;
            continue;
        }
    }
}
