package com.appsflyer.internal;

import android.content.Context;
import android.database.Cursor;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFf1mSDK extends AFf1rSDK {
    private final AFc1xSDK AFInAppEventType;

    public AFf1mSDK(Runnable runnable, AFc1xSDK aFc1xSDK) {
        super("store", "samsung", runnable);
        this.AFInAppEventType = aFc1xSDK;
    }

    @Override // com.appsflyer.internal.AFf1pSDK
    public final void valueOf(Context context) {
        AFInAppEventType(this.AFInAppEventType.values(), new AFb1hSDK<Map<String, Object>>(context, this.AFInAppEventType, "com.sec.android.app.samsungapps.referrer", "FBA3AF4E7757D9016E953FB3EE4671CA2BD9AF725F9A53D52ED4A38EAAA08901") { // from class: com.appsflyer.internal.AFf1mSDK.5
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x00c3, code lost:
            
                if (r2 != null) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x00c5, code lost:
            
                r2.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x00da, code lost:
            
                r0 = ((android.content.pm.PackageItemInfo) r10.AFInAppEventParameterName.getPackageManager().resolveContentProvider(r10.AFKeystoreWrapper, 128)).packageName;
                r10.valueOf.AFInAppEventParameterName.put("api_ver", java.lang.Long.valueOf(com.appsflyer.internal.AFa1fSDK.AFInAppEventType(r10.AFInAppEventParameterName, r0)));
                r10.valueOf.AFInAppEventParameterName.put("api_ver_name", com.appsflyer.internal.AFa1fSDK.AFKeystoreWrapper(r10.AFInAppEventParameterName, r0));
                r10.valueOf.values();
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0115, code lost:
            
                return r10.valueOf.AFInAppEventParameterName;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00d7, code lost:
            
                if (0 == 0) goto L26;
             */
            @Override // com.appsflyer.internal.AFb1hSDK
            /* renamed from: AFInAppEventParameterName, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.util.Map<java.lang.String, java.lang.Object> values() {
                /*
                    Method dump skipped, instructions count: 284
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1mSDK.AnonymousClass5.values():java.util.Map");
            }

            private static void AFKeystoreWrapper(String str, Map<String, Object> map, Cursor cursor) {
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1) {
                    return;
                }
                long j7 = cursor.getLong(columnIndex);
                if (j7 == 0) {
                    return;
                }
                map.put(str, Long.valueOf(j7));
            }

            private static void AFInAppEventParameterName(String str, Map<String, Object> map, Cursor cursor) {
                String string;
                int columnIndex = cursor.getColumnIndex(str);
                if (columnIndex == -1 || (string = cursor.getString(columnIndex)) == null) {
                    return;
                }
                map.put(str, string);
            }
        });
    }
}
