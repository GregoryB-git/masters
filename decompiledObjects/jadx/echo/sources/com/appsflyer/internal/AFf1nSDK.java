package com.appsflyer.internal;

import android.content.Context;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFf1nSDK extends AFf1rSDK {
    private final AFc1xSDK AFInAppEventType;

    public AFf1nSDK(Runnable runnable, AFc1xSDK aFc1xSDK) {
        super("store", "huawei", runnable);
        this.AFInAppEventType = aFc1xSDK;
    }

    @Override // com.appsflyer.internal.AFf1pSDK
    public final void valueOf(Context context) {
        AFInAppEventType(this.AFInAppEventType.values(), new AFb1hSDK<Map<String, Object>>(context, this.AFInAppEventType, "com.huawei.appmarket.commondata", "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212", "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F") { // from class: com.appsflyer.internal.AFf1nSDK.3
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x00fd, code lost:
            
                if (r2 != null) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x00ff, code lost:
            
                r2.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0114, code lost:
            
                r11.valueOf.values();
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x011d, code lost:
            
                return r11.valueOf.AFInAppEventParameterName;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0111, code lost:
            
                if (0 == 0) goto L24;
             */
            @Override // com.appsflyer.internal.AFb1hSDK
            /* renamed from: AFInAppEventType, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.util.Map<java.lang.String, java.lang.Object> values() {
                /*
                    Method dump skipped, instructions count: 292
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1nSDK.AnonymousClass3.values():java.util.Map");
            }
        });
    }
}
