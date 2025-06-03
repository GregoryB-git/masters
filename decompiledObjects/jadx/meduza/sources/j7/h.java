package j7;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import k7.n;
import k7.o;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final k7.d f8538c = new k7.d("ReviewService");

    /* renamed from: a, reason: collision with root package name */
    public n f8539a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8540b;

    public h(Context context) {
        String str;
        this.f8540b = context.getPackageName();
        k7.d dVar = o.f9131a;
        boolean z10 = true;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                    if (signatureArr == null || (signatureArr.length) == 0) {
                        o.f9131a.b("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Signature signature : signatureArr) {
                            byte[] byteArray = signature.toByteArray();
                            try {
                                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                messageDigest.update(byteArray);
                                str = Base64.encodeToString(messageDigest.digest(), 11);
                            } catch (NoSuchAlgorithmException unused) {
                                str = "";
                            }
                            arrayList.add(str);
                            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(str) || ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(str))) {
                                break;
                            }
                        }
                        k7.d dVar2 = o.f9131a;
                        Object[] objArr = new Object[1];
                        StringBuilder sb2 = new StringBuilder();
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            while (true) {
                                sb2.append((CharSequence) it.next());
                                if (!it.hasNext()) {
                                    break;
                                } else {
                                    sb2.append((CharSequence) ", ");
                                }
                            }
                        }
                        objArr[0] = sb2.toString();
                        dVar2.b(String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", objArr), new Object[0]);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    o.f9131a.b("Play Store package is not found.", new Object[0]);
                }
            } else {
                o.f9131a.b("Play Store package is disabled.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            o.f9131a.b("Play Store package is not found.", new Object[0]);
        }
        z10 = false;
        if (z10) {
            this.f8539a = new n(context, f8538c, new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"));
        }
    }
}
