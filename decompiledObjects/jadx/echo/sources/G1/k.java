package G1;

import android.os.AsyncTask;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final String f2054a;

    /* renamed from: b, reason: collision with root package name */
    public final File f2055b;

    /* renamed from: c, reason: collision with root package name */
    public final a f2056c;

    public interface a {
        void a(File file);
    }

    public k(String uriStr, File destFile, a onSuccess) {
        Intrinsics.checkNotNullParameter(uriStr, "uriStr");
        Intrinsics.checkNotNullParameter(destFile, "destFile");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        this.f2054a = uriStr;
        this.f2055b = destFile;
        this.f2056c = onSuccess;
    }

    public Boolean a(String... args) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(args, "args");
            try {
                URL url = new URL(this.f2054a);
                int contentLength = ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection())).getContentLength();
                DataInputStream dataInputStream = new DataInputStream(FirebasePerfUrlConnection.openStream(url));
                byte[] bArr = new byte[contentLength];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f2055b));
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public void b(boolean z7) {
        if (!T1.a.d(this) && z7) {
            try {
                this.f2056c.a(this.f2055b);
            } catch (Throwable th) {
                T1.a.b(th, this);
            }
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            return a((String[]) objArr);
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            b(((Boolean) obj).booleanValue());
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }
}
