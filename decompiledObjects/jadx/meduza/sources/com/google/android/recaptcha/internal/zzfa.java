package com.google.android.recaptcha.internal;

import b.z;
import ec.i;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import rb.c;

/* loaded from: classes.dex */
public final class zzfa implements zzey {
    private final c zza;

    public zzfa() {
        int i10 = zzav.zza;
        this.zza = z.n(zzez.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzey
    public final zzsc zza(String str, zzto zztoVar) {
        zzew zzewVar = null;
        try {
            try {
                try {
                    zzewVar = ((zzex) this.zza.getValue()).zza(str);
                    zzewVar.zzc();
                    zzewVar.zze(zztoVar.zzd());
                    zzsc zzscVar = (zzsc) zzewVar.zza(zzsc.zzi());
                    zzewVar.zzd();
                    return zzscVar;
                } catch (Exception e10) {
                    throw new zzbd(zzbb.zzc, zzba.zzF, e10.getMessage());
                }
            } catch (zzbd e11) {
                if (zzewVar == null) {
                    throw e11;
                }
                if (!i.a(e11.zza(), zzba.zzau)) {
                    throw e11;
                }
                try {
                    throw zzbc.zza(zztu.zzg(zzewVar.zzb().getErrorStream()).zzi());
                } catch (Exception e12) {
                    throw new zzbd(zzbb.zzc, zzba.zzG, e12.getMessage());
                }
            }
        } catch (Throwable th) {
            if (zzewVar != null) {
                zzewVar.zzd();
            }
            throw th;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzey
    public final String zzb(String str) {
        try {
            try {
                URLConnection openConnection = new URL(str).openConnection();
                i.c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestProperty("Accept", "application/x-protobuffer");
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() != 200) {
                    throw new zzbd(zzbb.zzc, new zzba(httpURLConnection.getResponseCode()), null);
                }
                try {
                    InputStreamReader inputStreamReader = i.a("gzip", httpURLConnection.getContentEncoding()) ? new InputStreamReader(new GZIPInputStream(httpURLConnection.getInputStream())) : new InputStreamReader(httpURLConnection.getInputStream());
                    StringWriter stringWriter = new StringWriter();
                    char[] cArr = new char[8192];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read < 0) {
                            String stringWriter2 = stringWriter.toString();
                            i.d(stringWriter2, "toString(...)");
                            return stringWriter2;
                        }
                        stringWriter.write(cArr, 0, read);
                    }
                } catch (Exception unused) {
                    throw new zzbd(zzbb.zzc, zzba.zzP, null);
                }
            } catch (Exception unused2) {
                throw new zzbd(zzbb.zzc, zzba.zzO, null);
            }
        } catch (Exception unused3) {
            throw new zzbd(zzbb.zzb, zzba.zzN, null);
        }
    }
}
