package com.appsflyer.internal;

import androidx.annotation.NonNull;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class AFc1lSDK {
    private final int AFInAppEventType;

    public AFc1lSDK(int i7) {
        this.AFInAppEventType = i7;
    }

    @NonNull
    private static String AFKeystoreWrapper(HttpURLConnection httpURLConnection, boolean z7) {
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader = null;
        try {
            InputStream inputStream = z7 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
            if (inputStream == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            InputStreamReader inputStreamReader2 = new InputStreamReader(inputStream, Charset.defaultCharset());
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader2);
                boolean z8 = true;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            String obj = sb.toString();
                            inputStreamReader2.close();
                            bufferedReader2.close();
                            return obj;
                        }
                        if (!z8) {
                            sb.append('\n');
                        }
                        sb.append(readLine);
                        z8 = false;
                    } catch (Throwable th) {
                        inputStreamReader = inputStreamReader2;
                        bufferedReader = bufferedReader2;
                        th = th;
                        if (inputStreamReader != null) {
                            inputStreamReader.close();
                        }
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                inputStreamReader = inputStreamReader2;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0241  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.appsflyer.internal.AFc1gSDK<java.lang.String> AFInAppEventParameterName(com.appsflyer.internal.AFa1aSDK r21) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1lSDK.AFInAppEventParameterName(com.appsflyer.internal.AFa1aSDK):com.appsflyer.internal.AFc1gSDK");
    }
}
