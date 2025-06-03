// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.nio.charset.Charset;
import android.util.Base64;
import kotlin.text.b;
import java.util.Iterator;
import java.util.List;
import kotlin.text.i;
import org.json.JSONObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public final class AFc1zSDK
{
    @NotNull
    public static final AFa1xSDK AFInAppEventParameterName;
    @NotNull
    public final String AFInAppEventType;
    @NotNull
    public final String AFKeystoreWrapper;
    public int valueOf;
    @NotNull
    public final String values;
    
    static {
        AFInAppEventParameterName = new AFa1xSDK((byte)0);
    }
    
    public AFc1zSDK(@NotNull final String afInAppEventType, @NotNull final String afKeystoreWrapper, @NotNull final String values, final int valueOf) {
        Intrinsics.checkNotNullParameter(afInAppEventType, "");
        Intrinsics.checkNotNullParameter(afKeystoreWrapper, "");
        Intrinsics.checkNotNullParameter(values, "");
        this.AFInAppEventType = afInAppEventType;
        this.AFKeystoreWrapper = afKeystoreWrapper;
        this.values = values;
        this.valueOf = valueOf;
    }
    
    @NotNull
    public final JSONObject AFInAppEventParameterName() {
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("label", (Object)this.AFInAppEventType);
        jsonObject.put("hash_name", (Object)this.AFKeystoreWrapper);
        jsonObject.put("st", (Object)this.values);
        jsonObject.put("c", (Object)String.valueOf(this.valueOf));
        return jsonObject;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AFc1zSDK)) {
            return false;
        }
        final AFc1zSDK aFc1zSDK = (AFc1zSDK)o;
        return Intrinsics.a(this.AFInAppEventType, aFc1zSDK.AFInAppEventType) && Intrinsics.a(this.AFKeystoreWrapper, aFc1zSDK.AFKeystoreWrapper) && Intrinsics.a(this.values, aFc1zSDK.values) && this.valueOf == aFc1zSDK.valueOf;
    }
    
    @Override
    public final int hashCode() {
        return ((this.AFInAppEventType.hashCode() * 31 + this.AFKeystoreWrapper.hashCode()) * 31 + this.values.hashCode()) * 31 + this.valueOf;
    }
    
    @NotNull
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ExceptionInfo(label=");
        sb.append(this.AFInAppEventType);
        sb.append(", hashName=");
        sb.append(this.AFKeystoreWrapper);
        sb.append(", stackTrace=");
        sb.append(this.values);
        sb.append(", counter=");
        sb.append(this.valueOf);
        sb.append(')');
        return sb.toString();
    }
    
    @Metadata
    public static final class AFa1xSDK
    {
        private AFa1xSDK() {
        }
        
        public static AFc1zSDK AFInAppEventParameterName(@NotNull String values) {
            Intrinsics.checkNotNullParameter(values, "");
            final List v = i.V(values, new String[] { "\n" }, false, 0, 6, null);
            if (v.size() != 4) {
                return null;
            }
            final Iterator<String> iterator = v.iterator();
            String values2 = values = null;
            Integer value;
            String values3 = (String)(value = (Integer)values);
            while (iterator.hasNext()) {
                final String s = iterator.next();
                if (i.s(s, "label=", false, 2, null)) {
                    values2 = values(s, "label=");
                }
                else if (i.s(s, "hashName=", false, 2, null)) {
                    values = values(s, "hashName=");
                }
                else if (i.s(s, "stackTrace=", false, 2, null)) {
                    values3 = values(s, "stackTrace=");
                }
                else {
                    if (!i.s(s, "c=", false, 2, null)) {
                        break;
                    }
                    final String substring = s.substring(2);
                    Intrinsics.checkNotNullExpressionValue(substring, "");
                    value = Integer.parseInt(i.f0(substring).toString());
                }
            }
            if (AFKeystoreWrapper(value, values2, values, values3)) {
                return null;
            }
            Intrinsics.b(values2);
            Intrinsics.b(values);
            Intrinsics.b(values3);
            Intrinsics.b(value);
            return new AFc1zSDK(values2, values, values3, value.intValue());
        }
        
        private static boolean AFKeystoreWrapper(final Integer n, final String... array) {
            boolean b = n == null;
            final int length = array.length;
            for (int i = 0; i < 3; ++i) {
                final String s = array[i];
                b = (b || s == null || s.length() == 0);
            }
            return b;
        }
        
        private static String values(String substring, String string) {
            substring = substring.substring(string.length());
            Intrinsics.checkNotNullExpressionValue(substring, "");
            string = i.f0(substring).toString();
            Intrinsics.checkNotNullParameter(string, "");
            final Charset b = kotlin.text.b.b;
            final byte[] bytes = string.getBytes(b);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Intrinsics.checkNotNullParameter(bytes, "");
            final byte[] decode = Base64.decode(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(decode, "");
            return new String(decode, b);
        }
    }
}
