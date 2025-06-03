package io.flutter.plugins.firebase.firestore.utils;

import com.google.firebase.firestore.d;

/* loaded from: classes.dex */
public class ServerTimestampBehaviorConverter {
    public static d.a toServerTimestampBehavior(String str) {
        d.a aVar = d.a.NONE;
        if (str == null) {
            return aVar;
        }
        char c10 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1959779032) {
            if (hashCode != -1273775369) {
                if (hashCode == 3387192 && str.equals("none")) {
                    c10 = 2;
                }
            } else if (str.equals("previous")) {
                c10 = 1;
            }
        } else if (str.equals("estimate")) {
            c10 = 0;
        }
        return c10 != 0 ? c10 != 1 ? aVar : d.a.PREVIOUS : d.a.ESTIMATE;
    }
}
