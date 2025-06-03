/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.net.InetAddress
 *  java.net.Socket
 *  javax.net.ssl.SSLSocket
 *  javax.net.ssl.SSLSocketFactory
 */
package com.onesignal;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class TLS12SocketFactory
extends SSLSocketFactory {
    public SSLSocketFactory sslSocketFactory;

    public TLS12SocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    private Socket enableTLS(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket)socket).setEnabledProtocols(new String[]{"TLSv1.2"});
        }
        return socket;
    }

    public Socket createSocket() throws IOException {
        return this.enableTLS(this.sslSocketFactory.createSocket());
    }

    public Socket createSocket(String string2, int n) throws IOException {
        return this.enableTLS(this.sslSocketFactory.createSocket(string2, n));
    }

    public Socket createSocket(String string2, int n, InetAddress inetAddress, int n2) throws IOException {
        return this.enableTLS(this.sslSocketFactory.createSocket(string2, n, inetAddress, n2));
    }

    public Socket createSocket(InetAddress inetAddress, int n) throws IOException {
        return this.enableTLS(this.sslSocketFactory.createSocket(inetAddress, n));
    }

    public Socket createSocket(InetAddress inetAddress, int n, InetAddress inetAddress2, int n2) throws IOException {
        return this.enableTLS(this.sslSocketFactory.createSocket(inetAddress, n, inetAddress2, n2));
    }

    public Socket createSocket(Socket socket, String string2, int n, boolean bl) throws IOException {
        return this.enableTLS(this.sslSocketFactory.createSocket(socket, string2, n, bl));
    }

    public String[] getDefaultCipherSuites() {
        return this.sslSocketFactory.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.sslSocketFactory.getSupportedCipherSuites();
    }
}

