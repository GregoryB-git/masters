package e3;

/* loaded from: classes.dex */
public final class h {
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c9, code lost:
    
        if (android.provider.Settings.Secure.getInt(r7.getContentResolver(), "location_mode") != 0) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(int r6, android.content.Context r7, e3.a r8, e3.b r9) {
        /*
            if (r7 != 0) goto L11
            java.lang.String r6 = "permissions_handler"
            java.lang.String r7 = "Context cannot be null."
            android.util.Log.d(r6, r7)
            java.lang.String r6 = "PermissionHandler.ServiceManager"
            java.lang.String r7 = "Android context cannot be null."
            r9.a(r6, r7)
            return
        L11:
            r9 = 3
            r0 = 1
            r1 = 0
            if (r6 == r9) goto La9
            r9 = 4
            if (r6 == r9) goto La9
            r9 = 5
            if (r6 != r9) goto L1e
            goto La9
        L1e:
            r2 = 21
            if (r6 != r2) goto L36
            java.lang.String r6 = "bluetooth"
            java.lang.Object r6 = r7.getSystemService(r6)
            android.bluetooth.BluetoothManager r6 = (android.bluetooth.BluetoothManager) r6
            android.bluetooth.BluetoothAdapter r6 = r6.getAdapter()
            boolean r6 = r6.isEnabled()
            r8.a(r6)
            return
        L36:
            r2 = 8
            r3 = 2
            if (r6 != r2) goto L9d
            android.content.pm.PackageManager r6 = r7.getPackageManager()
            java.lang.String r2 = "android.hardware.telephony"
            boolean r2 = r6.hasSystemFeature(r2)
            if (r2 != 0) goto L4b
            r8.a(r3)
            return
        L4b:
            java.lang.String r2 = "phone"
            java.lang.Object r7 = r7.getSystemService(r2)
            android.telephony.TelephonyManager r7 = (android.telephony.TelephonyManager) r7
            if (r7 == 0) goto L99
            int r2 = r7.getPhoneType()
            if (r2 != 0) goto L5c
            goto L99
        L5c:
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r4 = "android.intent.action.CALL"
            r2.<init>(r4)
            java.lang.String r4 = "tel:123123"
            android.net.Uri r4 = android.net.Uri.parse(r4)
            r2.setData(r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L7d
            r4 = 0
            android.content.pm.PackageManager$ResolveInfoFlags r4 = android.content.pm.PackageManager.ResolveInfoFlags.of(r4)
            java.util.List r6 = r6.queryIntentActivities(r2, r4)
            goto L81
        L7d:
            java.util.List r6 = r6.queryIntentActivities(r2, r1)
        L81:
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L8b
            r8.a(r3)
            return
        L8b:
            int r6 = r7.getSimState()
            if (r6 == r9) goto L95
            r8.a(r1)
            return
        L95:
            r8.a(r0)
            return
        L99:
            r8.a(r3)
            return
        L9d:
            r7 = 16
            if (r6 != r7) goto La5
            r8.a(r0)
            return
        La5:
            r8.a(r3)
            return
        La9:
            int r6 = android.os.Build.VERSION.SDK_INT
            r9 = 28
            if (r6 < r9) goto Lbf
            java.lang.Class<android.location.LocationManager> r6 = android.location.LocationManager.class
            java.lang.Object r6 = r7.getSystemService(r6)
            android.location.LocationManager r6 = (android.location.LocationManager) r6
            if (r6 != 0) goto Lba
            goto Ld2
        Lba:
            boolean r1 = android.support.v4.media.session.b.p(r6)
            goto Ld2
        Lbf:
            android.content.ContentResolver r6 = r7.getContentResolver()     // Catch: android.provider.Settings.SettingNotFoundException -> Lcc
            java.lang.String r7 = "location_mode"
            int r6 = android.provider.Settings.Secure.getInt(r6, r7)     // Catch: android.provider.Settings.SettingNotFoundException -> Lcc
            if (r6 == 0) goto Ld0
            goto Ld1
        Lcc:
            r6 = move-exception
            r6.printStackTrace()
        Ld0:
            r0 = r1
        Ld1:
            r1 = r0
        Ld2:
            r8.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.h.a(int, android.content.Context, e3.a, e3.b):void");
    }
}
