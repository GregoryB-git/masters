/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.net.ServerSocket
 *  java.security.KeyStore
 *  javax.net.ssl.KeyManagerFactory
 *  javax.net.ssl.SSLContext
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.sh;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.security.KeyStore;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;

class ih
implements sh {
    @NonNull
    private final File a;

    public ih(@NonNull File file) {
        this.a = file;
    }

    @Override
    @NonNull
    public ServerSocket a(int n2) throws IOException, sh.a {
        SSLContext sSLContext;
        try {
            sSLContext = SSLContext.getInstance((String)"TLS");
            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance((String)KeyManagerFactory.getDefaultAlgorithm());
            KeyStore keyStore = KeyStore.getInstance((String)"PKCS12");
            FileInputStream fileInputStream = new FileInputStream(this.a);
            keyStore.load((InputStream)fileInputStream, "`0l}%01ny{jl~;|&".toCharArray());
            keyManagerFactory.init(keyStore, "`0l}%01ny{jl~;|&".toCharArray());
            sSLContext.init(keyManagerFactory.getKeyManagers(), null, null);
        }
        catch (Exception exception) {
            throw new sh.a("https_open_error", exception);
        }
        return sSLContext.getServerSocketFactory().createServerSocket(n2);
    }
}

