package com.google.android.recaptcha.internal;

import ec.i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import x6.b;

/* loaded from: classes.dex */
public final class zzew {
    private final HttpURLConnection zza;

    public zzew(HttpURLConnection httpURLConnection) {
        this.zza = httpURLConnection;
    }

    private final InputStream zzf() {
        try {
            return this.zza.getInputStream();
        } catch (UnknownServiceException e10) {
            throw new zzbd(zzbb.zzc, zzba.zzaf, e10.getMessage());
        } catch (IOException e11) {
            throw new zzbd(zzbb.zzc, zzba.zzae, e11.getMessage());
        } catch (Exception e12) {
            throw new zzbd(zzbb.zzc, zzba.zzak, e12.getMessage());
        }
    }

    private final OutputStream zzg() {
        try {
            return this.zza.getOutputStream();
        } catch (UnknownServiceException e10) {
            throw new zzbd(zzbb.zzc, zzba.zzaf, e10.getMessage());
        } catch (IOException e11) {
            throw new zzbd(zzbb.zzc, zzba.zzae, e11.getMessage());
        } catch (Exception e12) {
            throw new zzbd(zzbb.zzc, zzba.zzak, e12.getMessage());
        }
    }

    public final zzoi zza(zzoi zzoiVar) {
        try {
            int responseCode = this.zza.getResponseCode();
            if (responseCode != 200) {
                if (responseCode == 400) {
                    throw new zzbd(zzbb.zzc, zzba.zzau, null);
                }
                if (responseCode != 503 && responseCode != 403) {
                    if (responseCode != 404) {
                        throw new zzbd(zzbb.zzc, zzba.zzK, null);
                    }
                    throw new zzbd(zzbb.zzc, zzba.zzi, null);
                }
                throw new zzbd(zzbb.zzi, zzba.zzJ, null);
            }
            InputStream zzf = zzf();
            i.e(zzf, "<this>");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, zzf.available()));
            b.N(zzf, byteArrayOutputStream, 8192);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            i.d(byteArray, "toByteArray(...)");
            if (byteArray.length == 0) {
                throw new zzbd(zzbb.zzc, zzba.zzat, null);
            }
            try {
                Object zzb = zzoiVar.zzD().zzb(byteArray);
                i.c(zzb, "null cannot be cast to non-null type T of com.google.android.libraries.abuse.recaptcha.network.CaptchaFeConnection.getResponse");
                return (zzoi) zzb;
            } catch (Exception e10) {
                throw new zzbd(zzbb.zzc, zzba.zzG, e10.getMessage());
            }
        } catch (Exception e11) {
            throw new zzbd(zzbb.zzc, zzba.zzah, e11.getMessage());
        }
    }

    public final HttpURLConnection zzb() {
        return this.zza;
    }

    public final void zzc() {
        try {
            this.zza.connect();
        } catch (SocketTimeoutException e10) {
            throw new zzbd(zzbb.zzc, zzba.zzac, e10.getMessage());
        } catch (IOException e11) {
            throw new zzbd(zzbb.zzc, zzba.zzad, e11.getMessage());
        } catch (Exception e12) {
            throw new zzbd(zzbb.zzc, zzba.zzaj, e12.getMessage());
        }
    }

    public final void zzd() {
        this.zza.disconnect();
    }

    public final void zze(byte[] bArr) {
        try {
            zzg().write(bArr);
        } catch (zzbd e10) {
            throw e10;
        } catch (IOException e11) {
            throw new zzbd(zzbb.zzc, zzba.zzag, e11.getMessage());
        } catch (Exception e12) {
            throw new zzbd(zzbb.zzc, zzba.zzal, e12.getMessage());
        }
    }
}
