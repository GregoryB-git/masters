.class public final Lokhttp3/OkHttpClient$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/OkHttpClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field public A:I

.field public B:I

.field public a:Lokhttp3/Dispatcher;

.field public b:Ljava/net/Proxy;

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokhttp3/Protocol;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokhttp3/ConnectionSpec;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;

.field public g:Lokhttp3/EventListener$Factory;

.field public h:Ljava/net/ProxySelector;

.field public i:Lokhttp3/CookieJar;

.field public j:Lokhttp3/Cache;

.field public k:Lokhttp3/internal/cache/InternalCache;

.field public l:Ljavax/net/SocketFactory;

.field public m:Ljavax/net/ssl/SSLSocketFactory;

.field public n:Lokhttp3/internal/tls/CertificateChainCleaner;

.field public o:Ljavax/net/ssl/HostnameVerifier;

.field public p:Lokhttp3/CertificatePinner;

.field public q:Lokhttp3/Authenticator;

.field public r:Lokhttp3/Authenticator;

.field public s:Lokhttp3/ConnectionPool;

.field public t:Lokhttp3/Dns;

.field public u:Z

.field public v:Z

.field public w:Z

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->e:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->f:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Lokhttp3/Dispatcher;

    .line 19
    .line 20
    invoke-direct {v0}, Lokhttp3/Dispatcher;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->a:Lokhttp3/Dispatcher;

    .line 24
    .line 25
    sget-object v0, Lokhttp3/OkHttpClient;->K:Ljava/util/List;

    .line 26
    .line 27
    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->c:Ljava/util/List;

    .line 28
    .line 29
    sget-object v0, Lokhttp3/OkHttpClient;->L:Ljava/util/List;

    .line 30
    .line 31
    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->d:Ljava/util/List;

    .line 32
    .line 33
    sget-object v0, Lokhttp3/EventListener;->a:Lokhttp3/EventListener;

    .line 34
    .line 35
    new-instance v1, Lokhttp3/EventListener$2;

    .line 36
    .line 37
    invoke-direct {v1, v0}, Lokhttp3/EventListener$2;-><init>(Lokhttp3/EventListener;)V

    .line 38
    .line 39
    .line 40
    iput-object v1, p0, Lokhttp3/OkHttpClient$Builder;->g:Lokhttp3/EventListener$Factory;

    .line 41
    .line 42
    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->h:Ljava/net/ProxySelector;

    .line 47
    .line 48
    if-nez v0, :cond_0

    .line 49
    .line 50
    new-instance v0, Lokhttp3/internal/proxy/NullProxySelector;

    .line 51
    .line 52
    invoke-direct {v0}, Lokhttp3/internal/proxy/NullProxySelector;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->h:Ljava/net/ProxySelector;

    .line 56
    .line 57
    :cond_0
    sget-object v0, Lokhttp3/CookieJar;->a:Lokhttp3/CookieJar;

    .line 58
    .line 59
    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->i:Lokhttp3/CookieJar;

    .line 60
    .line 61
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->l:Ljavax/net/SocketFactory;

    .line 66
    .line 67
    sget-object v0, Lokhttp3/internal/tls/OkHostnameVerifier;->a:Lokhttp3/internal/tls/OkHostnameVerifier;

    .line 68
    .line 69
    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->o:Ljavax/net/ssl/HostnameVerifier;

    .line 70
    .line 71
    sget-object v0, Lokhttp3/CertificatePinner;->c:Lokhttp3/CertificatePinner;

    .line 72
    .line 73
    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->p:Lokhttp3/CertificatePinner;

    .line 74
    .line 75
    sget-object v0, Lokhttp3/Authenticator;->a:Lokhttp3/Authenticator;

    .line 76
    .line 77
    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->q:Lokhttp3/Authenticator;

    .line 78
    .line 79
    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->r:Lokhttp3/Authenticator;

    .line 80
    .line 81
    new-instance v0, Lokhttp3/ConnectionPool;

    .line 82
    .line 83
    invoke-direct {v0}, Lokhttp3/ConnectionPool;-><init>()V

    .line 84
    .line 85
    .line 86
    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->s:Lokhttp3/ConnectionPool;

    .line 87
    .line 88
    sget-object v0, Lokhttp3/Dns;->a:Lokhttp3/Dns;

    .line 89
    .line 90
    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->t:Lokhttp3/Dns;

    .line 91
    .line 92
    const/4 v0, 0x1

    .line 93
    iput-boolean v0, p0, Lokhttp3/OkHttpClient$Builder;->u:Z

    .line 94
    .line 95
    iput-boolean v0, p0, Lokhttp3/OkHttpClient$Builder;->v:Z

    .line 96
    .line 97
    iput-boolean v0, p0, Lokhttp3/OkHttpClient$Builder;->w:Z

    .line 98
    .line 99
    const/4 v0, 0x0

    .line 100
    iput v0, p0, Lokhttp3/OkHttpClient$Builder;->x:I

    .line 101
    .line 102
    const/16 v1, 0x2710

    .line 103
    .line 104
    iput v1, p0, Lokhttp3/OkHttpClient$Builder;->y:I

    .line 105
    .line 106
    iput v1, p0, Lokhttp3/OkHttpClient$Builder;->z:I

    .line 107
    .line 108
    iput v1, p0, Lokhttp3/OkHttpClient$Builder;->A:I

    .line 109
    .line 110
    iput v0, p0, Lokhttp3/OkHttpClient$Builder;->B:I

    .line 111
    .line 112
    return-void
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
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
.end method

.method public constructor <init>(Lokhttp3/OkHttpClient;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->e:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lokhttp3/OkHttpClient$Builder;->f:Ljava/util/ArrayList;

    iget-object v2, p1, Lokhttp3/OkHttpClient;->a:Lokhttp3/Dispatcher;

    iput-object v2, p0, Lokhttp3/OkHttpClient$Builder;->a:Lokhttp3/Dispatcher;

    iget-object v2, p1, Lokhttp3/OkHttpClient;->b:Ljava/net/Proxy;

    iput-object v2, p0, Lokhttp3/OkHttpClient$Builder;->b:Ljava/net/Proxy;

    iget-object v2, p1, Lokhttp3/OkHttpClient;->c:Ljava/util/List;

    iput-object v2, p0, Lokhttp3/OkHttpClient$Builder;->c:Ljava/util/List;

    iget-object v2, p1, Lokhttp3/OkHttpClient;->d:Ljava/util/List;

    iput-object v2, p0, Lokhttp3/OkHttpClient$Builder;->d:Ljava/util/List;

    iget-object v2, p1, Lokhttp3/OkHttpClient;->e:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p1, Lokhttp3/OkHttpClient;->f:Ljava/util/List;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p1, Lokhttp3/OkHttpClient;->o:Lokhttp3/EventListener$Factory;

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->g:Lokhttp3/EventListener$Factory;

    iget-object v0, p1, Lokhttp3/OkHttpClient;->p:Ljava/net/ProxySelector;

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->h:Ljava/net/ProxySelector;

    iget-object v0, p1, Lokhttp3/OkHttpClient;->q:Lokhttp3/CookieJar;

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->i:Lokhttp3/CookieJar;

    iget-object v0, p1, Lokhttp3/OkHttpClient;->s:Lokhttp3/internal/cache/InternalCache;

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->k:Lokhttp3/internal/cache/InternalCache;

    iget-object v0, p1, Lokhttp3/OkHttpClient;->r:Lokhttp3/Cache;

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->j:Lokhttp3/Cache;

    iget-object v0, p1, Lokhttp3/OkHttpClient;->t:Ljavax/net/SocketFactory;

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->l:Ljavax/net/SocketFactory;

    iget-object v0, p1, Lokhttp3/OkHttpClient;->u:Ljavax/net/ssl/SSLSocketFactory;

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->m:Ljavax/net/ssl/SSLSocketFactory;

    iget-object v0, p1, Lokhttp3/OkHttpClient;->v:Lokhttp3/internal/tls/CertificateChainCleaner;

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->n:Lokhttp3/internal/tls/CertificateChainCleaner;

    iget-object v0, p1, Lokhttp3/OkHttpClient;->w:Ljavax/net/ssl/HostnameVerifier;

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->o:Ljavax/net/ssl/HostnameVerifier;

    iget-object v0, p1, Lokhttp3/OkHttpClient;->x:Lokhttp3/CertificatePinner;

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->p:Lokhttp3/CertificatePinner;

    iget-object v0, p1, Lokhttp3/OkHttpClient;->y:Lokhttp3/Authenticator;

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->q:Lokhttp3/Authenticator;

    iget-object v0, p1, Lokhttp3/OkHttpClient;->z:Lokhttp3/Authenticator;

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->r:Lokhttp3/Authenticator;

    iget-object v0, p1, Lokhttp3/OkHttpClient;->A:Lokhttp3/ConnectionPool;

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->s:Lokhttp3/ConnectionPool;

    iget-object v0, p1, Lokhttp3/OkHttpClient;->B:Lokhttp3/Dns;

    iput-object v0, p0, Lokhttp3/OkHttpClient$Builder;->t:Lokhttp3/Dns;

    iget-boolean v0, p1, Lokhttp3/OkHttpClient;->C:Z

    iput-boolean v0, p0, Lokhttp3/OkHttpClient$Builder;->u:Z

    iget-boolean v0, p1, Lokhttp3/OkHttpClient;->D:Z

    iput-boolean v0, p0, Lokhttp3/OkHttpClient$Builder;->v:Z

    iget-boolean v0, p1, Lokhttp3/OkHttpClient;->E:Z

    iput-boolean v0, p0, Lokhttp3/OkHttpClient$Builder;->w:Z

    iget v0, p1, Lokhttp3/OkHttpClient;->F:I

    iput v0, p0, Lokhttp3/OkHttpClient$Builder;->x:I

    iget v0, p1, Lokhttp3/OkHttpClient;->G:I

    iput v0, p0, Lokhttp3/OkHttpClient$Builder;->y:I

    iget v0, p1, Lokhttp3/OkHttpClient;->H:I

    iput v0, p0, Lokhttp3/OkHttpClient$Builder;->z:I

    iget v0, p1, Lokhttp3/OkHttpClient;->I:I

    iput v0, p0, Lokhttp3/OkHttpClient$Builder;->A:I

    iget p1, p1, Lokhttp3/OkHttpClient;->J:I

    iput p1, p0, Lokhttp3/OkHttpClient$Builder;->B:I

    return-void
.end method
