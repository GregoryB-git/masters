package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import n1.e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final AssetManager f1135a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f1136b;

    /* renamed from: c, reason: collision with root package name */
    public final c.InterfaceC0016c f1137c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f1138d;

    /* renamed from: e, reason: collision with root package name */
    public final File f1139e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1140g = false;

    /* renamed from: h, reason: collision with root package name */
    public n1.b[] f1141h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f1142i;

    public b(AssetManager assetManager, m1.b bVar, c.InterfaceC0016c interfaceC0016c, String str, File file) {
        byte[] bArr;
        this.f1135a = assetManager;
        this.f1136b = bVar;
        this.f1137c = interfaceC0016c;
        this.f = str;
        this.f1139e = file;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24 && i10 <= 34) {
            switch (i10) {
                case 24:
                case 25:
                    bArr = e.f11198e;
                    break;
                case 26:
                    bArr = e.f11197d;
                    break;
                case 27:
                    bArr = e.f11196c;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = e.f11195b;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = e.f11194a;
                    break;
            }
            this.f1138d = bArr;
        }
        bArr = null;
        this.f1138d = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f1137c.a();
            }
            return null;
        }
    }

    public final void b(int i10, Serializable serializable) {
        this.f1136b.execute(new n1.a(this, i10, serializable, 0));
    }
}
