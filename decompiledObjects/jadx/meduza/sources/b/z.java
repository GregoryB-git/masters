package b;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import b8.c1;
import b8.i0;
import b8.n0;
import com.google.android.gms.internal.p002firebaseauthapi.zzaic;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.Registrar;
import io.flutter.plugins.firebase.auth.Constants;
import io.meduza.meduza.R;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p2.m0;
import v5.e0;

/* loaded from: classes.dex */
public class z implements Continuation, o0.b, d8.e, v6.b {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f1656a = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "customer_buyer_stage", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f1657b = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_cbs", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f1658c = {"items"};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f1659d = {"affiliation", "coupon", "creative_name", "creative_slot", "currency", "_cbs", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", "transaction_id", "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};

    /* renamed from: e, reason: collision with root package name */
    public static final z f1660e = new z();
    public static final /* synthetic */ z f = new z();

    /* renamed from: o, reason: collision with root package name */
    public static final z f1661o = new z();

    /* renamed from: p, reason: collision with root package name */
    public static final z f1662p = new z();

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f1663q = {R.attr.swipeRefreshLayoutProgressSpinnerBackgroundColor};

    public static void A(Parcel parcel, int i10, int[] iArr, boolean z10) {
        if (iArr == null) {
            if (z10) {
                parcel.writeInt(i10 | 0);
            }
        } else {
            int J = J(i10, parcel);
            parcel.writeIntArray(iArr);
            L(J, parcel);
        }
    }

    public static void B(Parcel parcel, int i10, Integer num) {
        if (num == null) {
            return;
        }
        parcel.writeInt(i10 | 262144);
        parcel.writeInt(num.intValue());
    }

    public static void C(Parcel parcel, int i10, long j10) {
        parcel.writeInt(i10 | 524288);
        parcel.writeLong(j10);
    }

    public static void D(Parcel parcel, int i10, Long l10) {
        if (l10 == null) {
            return;
        }
        parcel.writeInt(i10 | 524288);
        parcel.writeLong(l10.longValue());
    }

    public static void E(Parcel parcel, int i10, Parcelable parcelable, int i11, boolean z10) {
        if (parcelable == null) {
            if (z10) {
                parcel.writeInt(i10 | 0);
            }
        } else {
            int J = J(i10, parcel);
            parcelable.writeToParcel(parcel, i11);
            L(J, parcel);
        }
    }

    public static void F(Parcel parcel, int i10, String str, boolean z10) {
        if (str == null) {
            if (z10) {
                parcel.writeInt(i10 | 0);
            }
        } else {
            int J = J(i10, parcel);
            parcel.writeString(str);
            L(J, parcel);
        }
    }

    public static void G(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int J = J(i10, parcel);
        parcel.writeStringList(list);
        L(J, parcel);
    }

    public static void H(Parcel parcel, int i10, Parcelable[] parcelableArr, int i11) {
        if (parcelableArr == null) {
            return;
        }
        int J = J(i10, parcel);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                M(parcel, parcelable, i11);
            }
        }
        L(J, parcel);
    }

    public static void I(Parcel parcel, int i10, List list, boolean z10) {
        if (list == null) {
            if (z10) {
                parcel.writeInt(i10 | 0);
                return;
            }
            return;
        }
        int J = J(i10, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            Parcelable parcelable = (Parcelable) list.get(i11);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                M(parcel, parcelable, 0);
            }
        }
        L(J, parcel);
    }

    public static int J(int i10, Parcel parcel) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static zzaic K(b8.f fVar, String str) {
        m6.j.i(fVar);
        if (b8.u.class.isAssignableFrom(fVar.getClass())) {
            b8.u uVar = (b8.u) fVar;
            return new zzaic(uVar.f2143a, uVar.f2144b, Constants.SIGN_IN_METHOD_GOOGLE, null, null, null, str, null, null);
        }
        if (b8.i.class.isAssignableFrom(fVar.getClass())) {
            return new zzaic(null, ((b8.i) fVar).f2092a, Constants.SIGN_IN_METHOD_FACEBOOK, null, null, null, str, null, null);
        }
        if (n0.class.isAssignableFrom(fVar.getClass())) {
            n0 n0Var = (n0) fVar;
            return new zzaic(null, n0Var.f2117a, Constants.SIGN_IN_METHOD_TWITTER, null, n0Var.f2118b, null, str, null, null);
        }
        if (b8.t.class.isAssignableFrom(fVar.getClass())) {
            return new zzaic(null, ((b8.t) fVar).f2139a, Constants.SIGN_IN_METHOD_GITHUB, null, null, null, str, null, null);
        }
        if (i0.class.isAssignableFrom(fVar.getClass())) {
            return new zzaic(null, null, Constants.SIGN_IN_METHOD_PLAY_GAMES, null, null, ((i0) fVar).f2093a, str, null, null);
        }
        if (!c1.class.isAssignableFrom(fVar.getClass())) {
            throw new IllegalArgumentException("Unsupported credential type.");
        }
        c1 c1Var = (c1) fVar;
        zzaic zzaicVar = c1Var.f2062d;
        return zzaicVar != null ? zzaicVar : new zzaic(c1Var.f2060b, c1Var.f2061c, c1Var.f2059a, null, c1Var.f, null, str, c1Var.f2063e, c1Var.f2064o);
    }

    public static void L(int i10, Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(dataPosition - i10);
        parcel.setDataPosition(dataPosition);
    }

    public static void M(Parcel parcel, Parcelable parcelable, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i10);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static nc.s b() {
        return new nc.s(null);
    }

    public static void d(t5.k kVar) {
        if (kVar != null) {
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static String e(String str) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + String.valueOf(str).length() + 5);
        sb2.append(".");
        sb2.append(str);
        sb2.append(",.");
        sb2.append(str);
        sb2.append(" *");
        return sb2.toString();
    }

    public static String i(ma.h hVar) {
        String str;
        StringBuilder sb2 = new StringBuilder(hVar.size());
        for (int i10 = 0; i10 < hVar.size(); i10++) {
            int i11 = hVar.i(i10);
            if (i11 == 34) {
                str = "\\\"";
            } else if (i11 == 39) {
                str = "\\'";
            } else if (i11 != 92) {
                switch (i11) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (i11 < 32 || i11 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((i11 >>> 6) & 3) + 48));
                            sb2.append((char) (((i11 >>> 3) & 7) + 48));
                            i11 = (i11 & 7) + 48;
                        }
                        sb2.append((char) i11);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    public static int j(double d10, double d11) {
        if (d10 < d11) {
            return -1;
        }
        if (d10 > d11) {
            return 1;
        }
        if (d10 == d11) {
            return 0;
        }
        if (Double.isNaN(d11)) {
            return !Double.isNaN(d10) ? 1 : 0;
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0195, code lost:
    
        if (r0.equals("video/mp2t") == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int k(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b.z.k(java.lang.String):int");
    }

    public static int l(Map map) {
        List list = (List) map.get("Content-Type");
        return k((list == null || list.isEmpty()) ? null : (String) list.get(0));
    }

    public static int m(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        return lastPathSegment.endsWith(".avi") ? 16 : -1;
    }

    public static final rb.g n(dc.a aVar) {
        ec.i.e(aVar, "initializer");
        return new rb.g(aVar);
    }

    public static final Cursor o(p1.j jVar, p1.l lVar, boolean z10) {
        ec.i.e(jVar, "db");
        ec.i.e(lVar, "sqLiteQuery");
        Cursor l10 = jVar.l(lVar, null);
        if (z10 && (l10 instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) l10;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                ec.i.e(l10, "c");
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(l10.getColumnNames(), l10.getCount());
                    while (l10.moveToNext()) {
                        Object[] objArr = new Object[l10.getColumnCount()];
                        int columnCount = l10.getColumnCount();
                        for (int i10 = 0; i10 < columnCount; i10++) {
                            int type = l10.getType(i10);
                            if (type == 0) {
                                objArr[i10] = null;
                            } else if (type == 1) {
                                objArr[i10] = Long.valueOf(l10.getLong(i10));
                            } else if (type == 2) {
                                objArr[i10] = Double.valueOf(l10.getDouble(i10));
                            } else if (type == 3) {
                                objArr[i10] = l10.getString(i10);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i10] = l10.getBlob(i10);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    x6.b.L(l10, null);
                    return matrixCursor;
                } finally {
                }
            }
        }
        return l10;
    }

    public static String p(int i10) {
        return e0.m("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(Color.alpha(i10) / 255.0d));
    }

    public static void r(Object obj, String str, boolean z10) {
        if (!z10) {
            throw new n7.w(m0.X(str, obj));
        }
    }

    public static void t(Parcel parcel, int i10, boolean z10) {
        parcel.writeInt(i10 | 262144);
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static void u(Parcel parcel, int i10, Boolean bool) {
        if (bool == null) {
            return;
        }
        parcel.writeInt(i10 | 262144);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void v(Parcel parcel, int i10, Bundle bundle, boolean z10) {
        if (bundle == null) {
            if (z10) {
                parcel.writeInt(i10 | 0);
            }
        } else {
            int J = J(i10, parcel);
            parcel.writeBundle(bundle);
            L(J, parcel);
        }
    }

    public static void w(Parcel parcel, int i10, byte[] bArr, boolean z10) {
        if (bArr == null) {
            if (z10) {
                parcel.writeInt(i10 | 0);
            }
        } else {
            int J = J(i10, parcel);
            parcel.writeByteArray(bArr);
            L(J, parcel);
        }
    }

    public static void x(Parcel parcel, int i10, Double d10) {
        if (d10 == null) {
            return;
        }
        parcel.writeInt(i10 | 524288);
        parcel.writeDouble(d10.doubleValue());
    }

    public static void y(Parcel parcel, int i10, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int J = J(i10, parcel);
        parcel.writeStrongBinder(iBinder);
        L(J, parcel);
    }

    public static void z(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | 262144);
        parcel.writeInt(i11);
    }

    @Override // o0.b
    public Object a(o0.a aVar) {
        throw aVar;
    }

    public boolean c(int i10) {
        return 4 <= i10 || Log.isLoggable("FirebaseCrashlytics", i10);
    }

    public long f() {
        return System.currentTimeMillis();
    }

    @Override // d8.e
    public Object g(d8.u uVar) {
        return Registrar.lambda$getComponents$0$Registrar(uVar);
    }

    public void h(String str) {
        if (c(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public void q(String str) {
        if (c(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public void s(String str, Exception exc) {
        if (c(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(task.getException())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
    }
}
