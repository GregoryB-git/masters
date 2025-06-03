package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import m6.j;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class zzaev {
    public static void zza(String str, zzaeb zzaebVar, zzaew<?> zzaewVar, Type type, zzaef zzaefVar) {
        String str2;
        try {
            j.i(zzaebVar);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = zzaebVar.zza().getBytes(Charset.defaultCharset());
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setConnectTimeout(60000);
            zzaefVar.zza(httpURLConnection);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), bytes.length);
            try {
                bufferedOutputStream.write(bytes, 0, bytes.length);
                bufferedOutputStream.close();
                zza(httpURLConnection, zzaewVar, type);
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e10) {
            e = e10;
            str2 = e.getMessage();
            zzaewVar.zza(str2);
        } catch (NullPointerException e11) {
            e = e11;
            str2 = e.getMessage();
            zzaewVar.zza(str2);
        } catch (SocketTimeoutException unused) {
            str2 = "TIMEOUT";
            zzaewVar.zza(str2);
        } catch (UnknownHostException unused2) {
            str2 = "<<Network Error>>";
            zzaewVar.zza(str2);
        } catch (JSONException e12) {
            e = e12;
            str2 = e.getMessage();
            zzaewVar.zza(str2);
        }
    }

    public static void zza(String str, zzaew<?> zzaewVar, Type type, zzaef zzaefVar) {
        String message;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(60000);
            zzaefVar.zza(httpURLConnection);
            zza(httpURLConnection, zzaewVar, type);
        } catch (SocketTimeoutException unused) {
            message = "TIMEOUT";
            zzaewVar.zza(message);
        } catch (UnknownHostException unused2) {
            message = "<<Network Error>>";
            zzaewVar.zza(message);
        } catch (IOException e10) {
            message = e10.getMessage();
            zzaewVar.zza(message);
        }
    }

    private static void zza(HttpURLConnection httpURLConnection, zzaew<?> zzaewVar, Type type) {
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                InputStream inputStream = zza(responseCode) ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                StringBuilder sb2 = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        } else {
                            sb2.append(readLine);
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                String sb3 = sb2.toString();
                if (zza(responseCode)) {
                    zzaewVar.zza((zzaew<?>) zzady.zza(sb3, type));
                } else {
                    zzaewVar.zza((String) zzady.zza(sb3, String.class));
                }
                httpURLConnection.disconnect();
            } catch (zzabr e10) {
                e = e10;
                zzaewVar.zza(e.getMessage());
                httpURLConnection.disconnect();
            } catch (SocketTimeoutException unused) {
                zzaewVar.zza("TIMEOUT");
                httpURLConnection.disconnect();
            } catch (IOException e11) {
                e = e11;
                zzaewVar.zza(e.getMessage());
                httpURLConnection.disconnect();
            }
        } catch (Throwable th3) {
            httpURLConnection.disconnect();
            throw th3;
        }
    }

    private static final boolean zza(int i10) {
        return i10 >= 200 && i10 < 300;
    }
}
