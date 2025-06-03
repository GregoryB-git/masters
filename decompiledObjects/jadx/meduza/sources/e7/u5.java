package e7;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class u5 {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f4697b = {"GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4698a;

    public u5(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.f4698a = hashMap2;
        hashMap2.putAll(hashMap);
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        String[] strArr = f4697b;
        for (int i10 = 0; i10 < 6; i10++) {
            String str = strArr[i10];
            if (this.f4698a.containsKey(str)) {
                if (sb2.length() > 0) {
                    sb2.append(";");
                }
                sb2.append(str);
                sb2.append("=");
                sb2.append((String) this.f4698a.get(str));
            }
        }
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u5) {
            return a().equalsIgnoreCase(((u5) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}
