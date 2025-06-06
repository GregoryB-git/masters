.class public Lokhttp3/OkHttpClient;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Lokhttp3/Call$Factory;
.implements Lokhttp3/WebSocket$Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/OkHttpClient$Builder;
    }
.end annotation


# static fields
.field public static final K:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokhttp3/Protocol;",
            ">;"
        }
    .end annotation
.end field

.field public static final L:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokhttp3/ConnectionSpec;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final A:Lokhttp3/ConnectionPool;

.field public final B:Lokhttp3/Dns;

.field public final C:Z

.field public final D:Z

.field public final E:Z

.field public final F:I

.field public final G:I

.field public final H:I

.field public final I:I

.field public final J:I

.field public final a:Lokhttp3/Dispatcher;

.field public final b:Ljava/net/Proxy;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokhttp3/Protocol;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokhttp3/ConnectionSpec;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokhttp3/Interceptor;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokhttp3/Interceptor;",
            ">;"
        }
    .end annotation
.end field

.field public final o:Lokhttp3/EventListener$Factory;

.field public final p:Ljava/net/ProxySelector;

.field public final q:Lokhttp3/CookieJar;

.field public final r:Lokhttp3/Cache;

.field public final s:Lokhttp3/internal/cache/InternalCache;

.field public final t:Ljavax/net/SocketFactory;

.field public final u:Ljavax/net/ssl/SSLSocketFactory;

.field public final v:Lokhttp3/internal/tls/CertificateChainCleaner;

.field public final w:Ljavax/net/ssl/HostnameVerifier;

.field public final x:Lokhttp3/CertificatePinner;

.field public final y:Lokhttp3/Authenticator;

.field public final z:Lokhttp3/Authenticator;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x2

    new-array v1, v0, [Lokhttp3/Protocol;

    sget-object v2, Lokhttp3/Protocol;->e:Lokhttp3/Protocol;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lokhttp3/Protocol;->c:Lokhttp3/Protocol;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    invoke-static {v1}, Lokhttp3/internal/Util;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lokhttp3/OkHttpClient;->K:Ljava/util/List;

    new-array v0, v0, [Lokhttp3/ConnectionSpec;

    sget-object v1, Lokhttp3/ConnectionSpec;->e:Lokhttp3/ConnectionSpec;

    aput-object v1, v0, v3

    sget-object v1, Lokhttp3/ConnectionSpec;->f:Lokhttp3/ConnectionSpec;

    aput-object v1, v0, v4

    invoke-static {v0}, Lokhttp3/internal/Util;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lokhttp3/OkHttpClient;->L:Ljava/util/List;

    new-instance v0, Lokhttp3/OkHttpClient$1;

    invoke-direct {v0}, Lokhttp3/OkHttpClient$1;-><init>()V

    sput-object v0, Lokhttp3/internal/Internal;->a:Lokhttp3/internal/Internal;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    new-instance v0, Lokhttp3/OkHttpClient$Builder;

    invoke-direct {v0}, Lokhttp3/OkHttpClient$Builder;-><init>()V

    invoke-direct {p0, v0}, Lokhttp3/OkHttpClient;-><init>(Lokhttp3/OkHttpClient$Builder;)V

    return-void
.end method

.method public constructor <init>(Lokhttp3/OkHttpClient$Builder;)V
    .locals 7

    .line 1
    const-string v0, "No System TLS"

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p1, Lokhttp3/OkHttpClient$Builder;->a:Lokhttp3/Dispatcher;

    .line 7
    .line 8
    iput-object v1, p0, Lokhttp3/OkHttpClient;->a:Lokhttp3/Dispatcher;

    .line 9
    .line 10
    iget-object v1, p1, Lokhttp3/OkHttpClient$Builder;->b:Ljava/net/Proxy;

    .line 11
    .line 12
    iput-object v1, p0, Lokhttp3/OkHttpClient;->b:Ljava/net/Proxy;

    .line 13
    .line 14
    iget-object v1, p1, Lokhttp3/OkHttpClient$Builder;->c:Ljava/util/List;

    .line 15
    .line 16
    iput-object v1, p0, Lokhttp3/OkHttpClient;->c:Ljava/util/List;

    .line 17
    .line 18
    iget-object v1, p1, Lokhttp3/OkHttpClient$Builder;->d:Ljava/util/List;

    .line 19
    .line 20
    iput-object v1, p0, Lokhttp3/OkHttpClient;->d:Ljava/util/List;

    .line 21
    .line 22
    iget-object v2, p1, Lokhttp3/OkHttpClient$Builder;->e:Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-static {v2}, Lokhttp3/internal/Util;->n(Ljava/util/List;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iput-object v2, p0, Lokhttp3/OkHttpClient;->e:Ljava/util/List;

    .line 29
    .line 30
    iget-object v2, p1, Lokhttp3/OkHttpClient$Builder;->f:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-static {v2}, Lokhttp3/internal/Util;->n(Ljava/util/List;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iput-object v2, p0, Lokhttp3/OkHttpClient;->f:Ljava/util/List;

    .line 37
    .line 38
    iget-object v2, p1, Lokhttp3/OkHttpClient$Builder;->g:Lokhttp3/EventListener$Factory;

    .line 39
    .line 40
    iput-object v2, p0, Lokhttp3/OkHttpClient;->o:Lokhttp3/EventListener$Factory;

    .line 41
    .line 42
    iget-object v2, p1, Lokhttp3/OkHttpClient$Builder;->h:Ljava/net/ProxySelector;

    .line 43
    .line 44
    iput-object v2, p0, Lokhttp3/OkHttpClient;->p:Ljava/net/ProxySelector;

    .line 45
    .line 46
    iget-object v2, p1, Lokhttp3/OkHttpClient$Builder;->i:Lokhttp3/CookieJar;

    .line 47
    .line 48
    iput-object v2, p0, Lokhttp3/OkHttpClient;->q:Lokhttp3/CookieJar;

    .line 49
    .line 50
    iget-object v2, p1, Lokhttp3/OkHttpClient$Builder;->j:Lokhttp3/Cache;

    .line 51
    .line 52
    iput-object v2, p0, Lokhttp3/OkHttpClient;->r:Lokhttp3/Cache;

    .line 53
    .line 54
    iget-object v2, p1, Lokhttp3/OkHttpClient$Builder;->k:Lokhttp3/internal/cache/InternalCache;

    .line 55
    .line 56
    iput-object v2, p0, Lokhttp3/OkHttpClient;->s:Lokhttp3/internal/cache/InternalCache;

    .line 57
    .line 58
    iget-object v2, p1, Lokhttp3/OkHttpClient$Builder;->l:Ljavax/net/SocketFactory;

    .line 59
    .line 60
    iput-object v2, p0, Lokhttp3/OkHttpClient;->t:Ljavax/net/SocketFactory;

    .line 61
    .line 62
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    :cond_0
    const/4 v2, 0x0

    .line 67
    move v3, v2

    .line 68
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    const/4 v5, 0x1

    .line 73
    if-eqz v4, :cond_2

    .line 74
    .line 75
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    check-cast v4, Lokhttp3/ConnectionSpec;

    .line 80
    .line 81
    if-nez v3, :cond_1

    .line 82
    .line 83
    iget-boolean v3, v4, Lokhttp3/ConnectionSpec;->a:Z

    .line 84
    .line 85
    if-eqz v3, :cond_0

    .line 86
    .line 87
    :cond_1
    move v3, v5

    .line 88
    goto :goto_0

    .line 89
    :cond_2
    iget-object v1, p1, Lokhttp3/OkHttpClient$Builder;->m:Ljavax/net/ssl/SSLSocketFactory;

    .line 90
    .line 91
    const/4 v4, 0x0

    .line 92
    if-nez v1, :cond_5

    .line 93
    .line 94
    if-nez v3, :cond_3

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    :try_start_0
    invoke-static {}, Ljavax/net/ssl/TrustManagerFactory;->getDefaultAlgorithm()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-static {v1}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v1, v4}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    array-length v3, v1

    .line 113
    if-ne v3, v5, :cond_4

    .line 114
    .line 115
    aget-object v3, v1, v2

    .line 116
    .line 117
    instance-of v6, v3, Ljavax/net/ssl/X509TrustManager;

    .line 118
    .line 119
    if-eqz v6, :cond_4

    .line 120
    .line 121
    check-cast v3, Ljavax/net/ssl/X509TrustManager;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1

    .line 122
    .line 123
    :try_start_1
    sget-object v1, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 124
    .line 125
    invoke-virtual {v1}, Lokhttp3/internal/platform/Platform;->h()Ljavax/net/ssl/SSLContext;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    new-array v5, v5, [Ljavax/net/ssl/TrustManager;

    .line 130
    .line 131
    aput-object v3, v5, v2

    .line 132
    .line 133
    invoke-virtual {v6, v4, v5, v4}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v6}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    .line 137
    .line 138
    .line 139
    move-result-object v0
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_0

    .line 140
    iput-object v0, p0, Lokhttp3/OkHttpClient;->u:Ljavax/net/ssl/SSLSocketFactory;

    .line 141
    .line 142
    invoke-virtual {v1, v3}, Lokhttp3/internal/platform/Platform;->c(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/CertificateChainCleaner;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    goto :goto_2

    .line 147
    :catch_0
    move-exception p1

    .line 148
    invoke-static {v0, p1}, Lokhttp3/internal/Util;->a(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/AssertionError;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    throw p1

    .line 153
    :cond_4
    :try_start_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 154
    .line 155
    new-instance v2, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 158
    .line 159
    .line 160
    const-string v3, "Unexpected default trust managers:"

    .line 161
    .line 162
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw p1
    :try_end_2
    .catch Ljava/security/GeneralSecurityException; {:try_start_2 .. :try_end_2} :catch_1

    .line 180
    :catch_1
    move-exception p1

    .line 181
    invoke-static {v0, p1}, Lokhttp3/internal/Util;->a(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/AssertionError;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    throw p1

    .line 186
    :cond_5
    :goto_1
    iput-object v1, p0, Lokhttp3/OkHttpClient;->u:Ljavax/net/ssl/SSLSocketFactory;

    .line 187
    .line 188
    iget-object v0, p1, Lokhttp3/OkHttpClient$Builder;->n:Lokhttp3/internal/tls/CertificateChainCleaner;

    .line 189
    .line 190
    :goto_2
    iput-object v0, p0, Lokhttp3/OkHttpClient;->v:Lokhttp3/internal/tls/CertificateChainCleaner;

    .line 191
    .line 192
    iget-object v1, p0, Lokhttp3/OkHttpClient;->u:Ljavax/net/ssl/SSLSocketFactory;

    .line 193
    .line 194
    if-eqz v1, :cond_6

    .line 195
    .line 196
    sget-object v2, Lokhttp3/internal/platform/Platform;->a:Lokhttp3/internal/platform/Platform;

    .line 197
    .line 198
    invoke-virtual {v2, v1}, Lokhttp3/internal/platform/Platform;->e(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 199
    .line 200
    .line 201
    :cond_6
    iget-object v1, p1, Lokhttp3/OkHttpClient$Builder;->o:Ljavax/net/ssl/HostnameVerifier;

    .line 202
    .line 203
    iput-object v1, p0, Lokhttp3/OkHttpClient;->w:Ljavax/net/ssl/HostnameVerifier;

    .line 204
    .line 205
    iget-object v1, p1, Lokhttp3/OkHttpClient$Builder;->p:Lokhttp3/CertificatePinner;

    .line 206
    .line 207
    iget-object v2, v1, Lokhttp3/CertificatePinner;->b:Lokhttp3/internal/tls/CertificateChainCleaner;

    .line 208
    .line 209
    invoke-static {v2, v0}, Lokhttp3/internal/Util;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    if-eqz v2, :cond_7

    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_7
    new-instance v2, Lokhttp3/CertificatePinner;

    .line 217
    .line 218
    iget-object v1, v1, Lokhttp3/CertificatePinner;->a:Ljava/util/Set;

    .line 219
    .line 220
    invoke-direct {v2, v1, v0}, Lokhttp3/CertificatePinner;-><init>(Ljava/util/Set;Lokhttp3/internal/tls/CertificateChainCleaner;)V

    .line 221
    .line 222
    .line 223
    move-object v1, v2

    .line 224
    :goto_3
    iput-object v1, p0, Lokhttp3/OkHttpClient;->x:Lokhttp3/CertificatePinner;

    .line 225
    .line 226
    iget-object v0, p1, Lokhttp3/OkHttpClient$Builder;->q:Lokhttp3/Authenticator;

    .line 227
    .line 228
    iput-object v0, p0, Lokhttp3/OkHttpClient;->y:Lokhttp3/Authenticator;

    .line 229
    .line 230
    iget-object v0, p1, Lokhttp3/OkHttpClient$Builder;->r:Lokhttp3/Authenticator;

    .line 231
    .line 232
    iput-object v0, p0, Lokhttp3/OkHttpClient;->z:Lokhttp3/Authenticator;

    .line 233
    .line 234
    iget-object v0, p1, Lokhttp3/OkHttpClient$Builder;->s:Lokhttp3/ConnectionPool;

    .line 235
    .line 236
    iput-object v0, p0, Lokhttp3/OkHttpClient;->A:Lokhttp3/ConnectionPool;

    .line 237
    .line 238
    iget-object v0, p1, Lokhttp3/OkHttpClient$Builder;->t:Lokhttp3/Dns;

    .line 239
    .line 240
    iput-object v0, p0, Lokhttp3/OkHttpClient;->B:Lokhttp3/Dns;

    .line 241
    .line 242
    iget-boolean v0, p1, Lokhttp3/OkHttpClient$Builder;->u:Z

    .line 243
    .line 244
    iput-boolean v0, p0, Lokhttp3/OkHttpClient;->C:Z

    .line 245
    .line 246
    iget-boolean v0, p1, Lokhttp3/OkHttpClient$Builder;->v:Z

    .line 247
    .line 248
    iput-boolean v0, p0, Lokhttp3/OkHttpClient;->D:Z

    .line 249
    .line 250
    iget-boolean v0, p1, Lokhttp3/OkHttpClient$Builder;->w:Z

    .line 251
    .line 252
    iput-boolean v0, p0, Lokhttp3/OkHttpClient;->E:Z

    .line 253
    .line 254
    iget v0, p1, Lokhttp3/OkHttpClient$Builder;->x:I

    .line 255
    .line 256
    iput v0, p0, Lokhttp3/OkHttpClient;->F:I

    .line 257
    .line 258
    iget v0, p1, Lokhttp3/OkHttpClient$Builder;->y:I

    .line 259
    .line 260
    iput v0, p0, Lokhttp3/OkHttpClient;->G:I

    .line 261
    .line 262
    iget v0, p1, Lokhttp3/OkHttpClient$Builder;->z:I

    .line 263
    .line 264
    iput v0, p0, Lokhttp3/OkHttpClient;->H:I

    .line 265
    .line 266
    iget v0, p1, Lokhttp3/OkHttpClient$Builder;->A:I

    .line 267
    .line 268
    iput v0, p0, Lokhttp3/OkHttpClient;->I:I

    .line 269
    .line 270
    iget p1, p1, Lokhttp3/OkHttpClient$Builder;->B:I

    .line 271
    .line 272
    iput p1, p0, Lokhttp3/OkHttpClient;->J:I

    .line 273
    .line 274
    iget-object p1, p0, Lokhttp3/OkHttpClient;->e:Ljava/util/List;

    .line 275
    .line 276
    invoke-interface {p1, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result p1

    .line 280
    if-nez p1, :cond_9

    .line 281
    .line 282
    iget-object p1, p0, Lokhttp3/OkHttpClient;->f:Ljava/util/List;

    .line 283
    .line 284
    invoke-interface {p1, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result p1

    .line 288
    if-nez p1, :cond_8

    .line 289
    .line 290
    return-void

    .line 291
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 292
    .line 293
    const-string v0, "Null network interceptor: "

    .line 294
    .line 295
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    iget-object v1, p0, Lokhttp3/OkHttpClient;->f:Ljava/util/List;

    .line 300
    .line 301
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    throw p1

    .line 312
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 313
    .line 314
    const-string v0, "Null interceptor: "

    .line 315
    .line 316
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    iget-object v1, p0, Lokhttp3/OkHttpClient;->e:Ljava/util/List;

    .line 321
    .line 322
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    throw p1
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
.end method


# virtual methods
.method public final a(Lokhttp3/Request;)Lokhttp3/Call;
    .locals 2

    .line 1
    new-instance v0, Lokhttp3/RealCall;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, Lokhttp3/RealCall;-><init>(Lokhttp3/OkHttpClient;Lokhttp3/Request;Z)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lokhttp3/OkHttpClient;->o:Lokhttp3/EventListener$Factory;

    .line 8
    .line 9
    invoke-interface {p1}, Lokhttp3/EventListener$Factory;->a()Lokhttp3/EventListener;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, v0, Lokhttp3/RealCall;->d:Lokhttp3/EventListener;

    .line 14
    .line 15
    return-object v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method
