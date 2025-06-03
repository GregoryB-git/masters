package v6;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static String f15995a;

    /* renamed from: b, reason: collision with root package name */
    public static int f15996b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f15997c;

    public static String a() {
        String str;
        String str2;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        String processName;
        if (f15995a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
                f15995a = processName;
            } else {
                int i10 = f15996b;
                if (i10 == 0) {
                    i10 = Process.myPid();
                    f15996b = i10;
                }
                String str3 = null;
                BufferedReader bufferedReader = null;
                BufferedReader bufferedReader2 = null;
                if (i10 > 0) {
                    try {
                        str2 = "/proc/" + i10 + "/cmdline";
                        allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    } catch (IOException unused) {
                        str = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        BufferedReader bufferedReader3 = new BufferedReader(new FileReader(str2));
                        try {
                            String readLine = bufferedReader3.readLine();
                            m6.j.i(readLine);
                            str = readLine.trim();
                        } catch (IOException unused2) {
                            str = null;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader3;
                            c.a(bufferedReader2);
                            throw th;
                        }
                        bufferedReader = bufferedReader3;
                        c.a(bufferedReader);
                        str3 = str;
                    } finally {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    }
                }
                f15995a = str3;
            }
        }
        return f15995a;
    }
}
