.class public final Lokhttp3/internal/http1/Http1Codec;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/internal/http/HttpCodec;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/http1/Http1Codec$UnknownLengthSource;,
        Lokhttp3/internal/http1/Http1Codec$ChunkedSource;,
        Lokhttp3/internal/http1/Http1Codec$FixedLengthSource;,
        Lokhttp3/internal/http1/Http1Codec$AbstractSource;,
        Lokhttp3/internal/http1/Http1Codec$ChunkedSink;,
        Lokhttp3/internal/http1/Http1Codec$FixedLengthSink;
    }
.end annotation


# instance fields
.field public final a:Lokhttp3/OkHttpClient;

.field public final b:Lokhttp3/internal/connection/StreamAllocation;

.field public final c:Lxc/h;

.field public final d:Lxc/g;

.field public e:I

.field public f:J


# direct methods
.method public constructor <init>(Lokhttp3/OkHttpClient;Lokhttp3/internal/connection/StreamAllocation;Lxc/h;Lxc/g;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lokhttp3/internal/http1/Http1Codec;->e:I

    const-wide/32 v0, 0x40000

    iput-wide v0, p0, Lokhttp3/internal/http1/Http1Codec;->f:J

    iput-object p1, p0, Lokhttp3/internal/http1/Http1Codec;->a:Lokhttp3/OkHttpClient;

    iput-object p2, p0, Lokhttp3/internal/http1/Http1Codec;->b:Lokhttp3/internal/connection/StreamAllocation;

    iput-object p3, p0, Lokhttp3/internal/http1/Http1Codec;->c:Lxc/h;

    iput-object p4, p0, Lokhttp3/internal/http1/Http1Codec;->d:Lxc/g;

    return-void
.end method

.method public static g(Lxc/l;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lxc/l;->e:Lxc/z;

    .line 2
    .line 3
    sget-object v1, Lxc/z;->d:Lxc/z$a;

    .line 4
    .line 5
    const-string v2, "delegate"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iput-object v1, p0, Lxc/l;->e:Lxc/z;

    .line 11
    .line 12
    invoke-virtual {v0}, Lxc/z;->a()Lxc/z;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lxc/z;->b()Lxc/z;

    .line 16
    .line 17
    .line 18
    return-void
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


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lokhttp3/internal/http1/Http1Codec;->d:Lxc/g;

    invoke-interface {v0}, Lxc/g;->flush()V

    return-void
.end method

.method public final b(Lokhttp3/Request;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http1/Http1Codec;->b:Lokhttp3/internal/connection/StreamAllocation;

    .line 2
    .line 3
    invoke-virtual {v0}, Lokhttp3/internal/connection/StreamAllocation;->b()Lokhttp3/internal/connection/RealConnection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lokhttp3/internal/connection/RealConnection;->c:Lokhttp3/Route;

    .line 8
    .line 9
    iget-object v0, v0, Lokhttp3/Route;->b:Ljava/net/Proxy;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    iget-object v2, p1, Lokhttp3/Request;->b:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v2, 0x20

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v2, p1, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 31
    .line 32
    iget-object v2, v2, Lokhttp3/HttpUrl;->a:Ljava/lang/String;

    .line 33
    .line 34
    const-string v3, "https"

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_0

    .line 41
    .line 42
    sget-object v2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 43
    .line 44
    if-ne v0, v2, :cond_0

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/4 v0, 0x0

    .line 49
    :goto_0
    if-eqz v0, :cond_1

    .line 50
    .line 51
    iget-object v0, p1, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    iget-object v0, p1, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 58
    .line 59
    invoke-static {v0}, Lokhttp3/internal/http/RequestLine;->a(Lokhttp3/HttpUrl;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    :goto_1
    const-string v0, " HTTP/1.1"

    .line 67
    .line 68
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget-object p1, p1, Lokhttp3/Request;->c:Lokhttp3/Headers;

    .line 76
    .line 77
    invoke-virtual {p0, p1, v0}, Lokhttp3/internal/http1/Http1Codec;->i(Lokhttp3/Headers;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-void
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
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
.end method

.method public final c(Lokhttp3/Response;)Lokhttp3/internal/http/RealResponseBody;
    .locals 9

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http1/Http1Codec;->b:Lokhttp3/internal/connection/StreamAllocation;

    .line 2
    .line 3
    iget-object v0, v0, Lokhttp3/internal/connection/StreamAllocation;->f:Lokhttp3/EventListener;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v0, "Content-Type"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lokhttp3/Response;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {p1}, Lokhttp3/internal/http/HttpHeaders;->b(Lokhttp3/Response;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    const-wide/16 v1, 0x0

    .line 21
    .line 22
    invoke-virtual {p0, v1, v2}, Lokhttp3/internal/http1/Http1Codec;->h(J)Lxc/y;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance v3, Lokhttp3/internal/http/RealResponseBody;

    .line 27
    .line 28
    new-instance v4, Lxc/s;

    .line 29
    .line 30
    invoke-direct {v4, p1}, Lxc/s;-><init>(Lxc/y;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v3, v0, v1, v2, v4}, Lokhttp3/internal/http/RealResponseBody;-><init>(Ljava/lang/String;JLxc/s;)V

    .line 34
    .line 35
    .line 36
    return-object v3

    .line 37
    :cond_0
    const-string v1, "Transfer-Encoding"

    .line 38
    .line 39
    invoke-virtual {p1, v1}, Lokhttp3/Response;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v2, "chunked"

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    const/4 v2, 0x5

    .line 50
    const-string v3, "state: "

    .line 51
    .line 52
    const/4 v4, 0x4

    .line 53
    const-wide/16 v5, -0x1

    .line 54
    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    iget-object p1, p1, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 58
    .line 59
    iget-object p1, p1, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 60
    .line 61
    iget v1, p0, Lokhttp3/internal/http1/Http1Codec;->e:I

    .line 62
    .line 63
    if-ne v1, v4, :cond_1

    .line 64
    .line 65
    iput v2, p0, Lokhttp3/internal/http1/Http1Codec;->e:I

    .line 66
    .line 67
    new-instance v1, Lokhttp3/internal/http1/Http1Codec$ChunkedSource;

    .line 68
    .line 69
    invoke-direct {v1, p0, p1}, Lokhttp3/internal/http1/Http1Codec$ChunkedSource;-><init>(Lokhttp3/internal/http1/Http1Codec;Lokhttp3/HttpUrl;)V

    .line 70
    .line 71
    .line 72
    new-instance p1, Lokhttp3/internal/http/RealResponseBody;

    .line 73
    .line 74
    new-instance v2, Lxc/s;

    .line 75
    .line 76
    invoke-direct {v2, v1}, Lxc/s;-><init>(Lxc/y;)V

    .line 77
    .line 78
    .line 79
    invoke-direct {p1, v0, v5, v6, v2}, Lokhttp3/internal/http/RealResponseBody;-><init>(Ljava/lang/String;JLxc/s;)V

    .line 80
    .line 81
    .line 82
    return-object p1

    .line 83
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 84
    .line 85
    invoke-static {v3}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iget v1, p0, Lokhttp3/internal/http1/Http1Codec;->e:I

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p1

    .line 102
    :cond_2
    invoke-static {p1}, Lokhttp3/internal/http/HttpHeaders;->a(Lokhttp3/Response;)J

    .line 103
    .line 104
    .line 105
    move-result-wide v7

    .line 106
    cmp-long p1, v7, v5

    .line 107
    .line 108
    if-eqz p1, :cond_3

    .line 109
    .line 110
    invoke-virtual {p0, v7, v8}, Lokhttp3/internal/http1/Http1Codec;->h(J)Lxc/y;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    new-instance v1, Lokhttp3/internal/http/RealResponseBody;

    .line 115
    .line 116
    new-instance v2, Lxc/s;

    .line 117
    .line 118
    invoke-direct {v2, p1}, Lxc/s;-><init>(Lxc/y;)V

    .line 119
    .line 120
    .line 121
    invoke-direct {v1, v0, v7, v8, v2}, Lokhttp3/internal/http/RealResponseBody;-><init>(Ljava/lang/String;JLxc/s;)V

    .line 122
    .line 123
    .line 124
    return-object v1

    .line 125
    :cond_3
    new-instance p1, Lokhttp3/internal/http/RealResponseBody;

    .line 126
    .line 127
    iget v1, p0, Lokhttp3/internal/http1/Http1Codec;->e:I

    .line 128
    .line 129
    if-ne v1, v4, :cond_5

    .line 130
    .line 131
    iget-object v1, p0, Lokhttp3/internal/http1/Http1Codec;->b:Lokhttp3/internal/connection/StreamAllocation;

    .line 132
    .line 133
    if-eqz v1, :cond_4

    .line 134
    .line 135
    iput v2, p0, Lokhttp3/internal/http1/Http1Codec;->e:I

    .line 136
    .line 137
    invoke-virtual {v1}, Lokhttp3/internal/connection/StreamAllocation;->f()V

    .line 138
    .line 139
    .line 140
    new-instance v1, Lokhttp3/internal/http1/Http1Codec$UnknownLengthSource;

    .line 141
    .line 142
    invoke-direct {v1, p0}, Lokhttp3/internal/http1/Http1Codec$UnknownLengthSource;-><init>(Lokhttp3/internal/http1/Http1Codec;)V

    .line 143
    .line 144
    .line 145
    new-instance v2, Lxc/s;

    .line 146
    .line 147
    invoke-direct {v2, v1}, Lxc/s;-><init>(Lxc/y;)V

    .line 148
    .line 149
    .line 150
    invoke-direct {p1, v0, v5, v6, v2}, Lokhttp3/internal/http/RealResponseBody;-><init>(Ljava/lang/String;JLxc/s;)V

    .line 151
    .line 152
    .line 153
    return-object p1

    .line 154
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 155
    .line 156
    const-string v0, "streamAllocation == null"

    .line 157
    .line 158
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw p1

    .line 162
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 163
    .line 164
    invoke-static {v3}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    iget v1, p0, Lokhttp3/internal/http1/Http1Codec;->e:I

    .line 169
    .line 170
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw p1
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
.end method

.method public final cancel()V
    .locals 1

    iget-object v0, p0, Lokhttp3/internal/http1/Http1Codec;->b:Lokhttp3/internal/connection/StreamAllocation;

    invoke-virtual {v0}, Lokhttp3/internal/connection/StreamAllocation;->b()Lokhttp3/internal/connection/RealConnection;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lokhttp3/internal/connection/RealConnection;->d:Ljava/net/Socket;

    invoke-static {v0}, Lokhttp3/internal/Util;->f(Ljava/net/Socket;)V

    :cond_0
    return-void
.end method

.method public final d(Z)Lokhttp3/Response$Builder;
    .locals 9

    .line 1
    iget v0, p0, Lokhttp3/internal/http1/Http1Codec;->e:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eq v0, v2, :cond_1

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    const-string v0, "state: "

    .line 13
    .line 14
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget v1, p0, Lokhttp3/internal/http1/Http1Codec;->e:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    :goto_0
    :try_start_0
    iget-object v0, p0, Lokhttp3/internal/http1/Http1Codec;->c:Lxc/h;

    .line 32
    .line 33
    iget-wide v2, p0, Lokhttp3/internal/http1/Http1Codec;->f:J

    .line 34
    .line 35
    invoke-interface {v0, v2, v3}, Lxc/h;->E(J)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-wide v2, p0, Lokhttp3/internal/http1/Http1Codec;->f:J

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    int-to-long v4, v4

    .line 46
    sub-long/2addr v2, v4

    .line 47
    iput-wide v2, p0, Lokhttp3/internal/http1/Http1Codec;->f:J

    .line 48
    .line 49
    invoke-static {v0}, Lokhttp3/internal/http/StatusLine;->a(Ljava/lang/String;)Lokhttp3/internal/http/StatusLine;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    new-instance v2, Lokhttp3/Response$Builder;

    .line 54
    .line 55
    invoke-direct {v2}, Lokhttp3/Response$Builder;-><init>()V

    .line 56
    .line 57
    .line 58
    iget-object v3, v0, Lokhttp3/internal/http/StatusLine;->a:Lokhttp3/Protocol;

    .line 59
    .line 60
    iput-object v3, v2, Lokhttp3/Response$Builder;->b:Lokhttp3/Protocol;

    .line 61
    .line 62
    iget v3, v0, Lokhttp3/internal/http/StatusLine;->b:I

    .line 63
    .line 64
    iput v3, v2, Lokhttp3/Response$Builder;->c:I

    .line 65
    .line 66
    iget-object v3, v0, Lokhttp3/internal/http/StatusLine;->c:Ljava/lang/String;

    .line 67
    .line 68
    iput-object v3, v2, Lokhttp3/Response$Builder;->d:Ljava/lang/String;

    .line 69
    .line 70
    new-instance v3, Lokhttp3/Headers$Builder;

    .line 71
    .line 72
    invoke-direct {v3}, Lokhttp3/Headers$Builder;-><init>()V

    .line 73
    .line 74
    .line 75
    :goto_1
    iget-object v4, p0, Lokhttp3/internal/http1/Http1Codec;->c:Lxc/h;

    .line 76
    .line 77
    iget-wide v5, p0, Lokhttp3/internal/http1/Http1Codec;->f:J

    .line 78
    .line 79
    invoke-interface {v4, v5, v6}, Lxc/h;->E(J)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    iget-wide v5, p0, Lokhttp3/internal/http1/Http1Codec;->f:J

    .line 84
    .line 85
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    int-to-long v7, v7

    .line 90
    sub-long/2addr v5, v7

    .line 91
    iput-wide v5, p0, Lokhttp3/internal/http1/Http1Codec;->f:J

    .line 92
    .line 93
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-eqz v5, :cond_2

    .line 98
    .line 99
    sget-object v5, Lokhttp3/internal/Internal;->a:Lokhttp3/internal/Internal;

    .line 100
    .line 101
    invoke-virtual {v5, v3, v4}, Lokhttp3/internal/Internal;->a(Lokhttp3/Headers$Builder;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_2
    new-instance v4, Lokhttp3/Headers;

    .line 106
    .line 107
    invoke-direct {v4, v3}, Lokhttp3/Headers;-><init>(Lokhttp3/Headers$Builder;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4}, Lokhttp3/Headers;->e()Lokhttp3/Headers$Builder;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    iput-object v3, v2, Lokhttp3/Response$Builder;->f:Lokhttp3/Headers$Builder;

    .line 115
    .line 116
    const/16 v3, 0x64

    .line 117
    .line 118
    if-eqz p1, :cond_3

    .line 119
    .line 120
    iget p1, v0, Lokhttp3/internal/http/StatusLine;->b:I

    .line 121
    .line 122
    if-ne p1, v3, :cond_3

    .line 123
    .line 124
    const/4 p1, 0x0

    .line 125
    return-object p1

    .line 126
    :cond_3
    iget p1, v0, Lokhttp3/internal/http/StatusLine;->b:I

    .line 127
    .line 128
    if-ne p1, v3, :cond_4

    .line 129
    .line 130
    iput v1, p0, Lokhttp3/internal/http1/Http1Codec;->e:I

    .line 131
    .line 132
    return-object v2

    .line 133
    :cond_4
    const/4 p1, 0x4

    .line 134
    iput p1, p0, Lokhttp3/internal/http1/Http1Codec;->e:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 135
    .line 136
    return-object v2

    .line 137
    :catch_0
    move-exception p1

    .line 138
    new-instance v0, Ljava/io/IOException;

    .line 139
    .line 140
    const-string v1, "unexpected end of stream on "

    .line 141
    .line 142
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    iget-object v2, p0, Lokhttp3/internal/http1/Http1Codec;->b:Lokhttp3/internal/connection/StreamAllocation;

    .line 147
    .line 148
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 159
    .line 160
    .line 161
    throw v0
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
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, Lokhttp3/internal/http1/Http1Codec;->d:Lxc/g;

    invoke-interface {v0}, Lxc/g;->flush()V

    return-void
.end method

.method public final f(Lokhttp3/Request;J)Lxc/w;
    .locals 5

    .line 1
    const-string v0, "Transfer-Encoding"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lokhttp3/Request;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "chunked"

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 v0, 0x2

    .line 14
    const-string v1, "state: "

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    iget p1, p0, Lokhttp3/internal/http1/Http1Codec;->e:I

    .line 20
    .line 21
    if-ne p1, v2, :cond_0

    .line 22
    .line 23
    iput v0, p0, Lokhttp3/internal/http1/Http1Codec;->e:I

    .line 24
    .line 25
    new-instance p1, Lokhttp3/internal/http1/Http1Codec$ChunkedSink;

    .line 26
    .line 27
    invoke-direct {p1, p0}, Lokhttp3/internal/http1/Http1Codec$ChunkedSink;-><init>(Lokhttp3/internal/http1/Http1Codec;)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    iget p3, p0, Lokhttp3/internal/http1/Http1Codec;->e:I

    .line 38
    .line 39
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_1
    const-wide/16 v3, -0x1

    .line 51
    .line 52
    cmp-long p1, p2, v3

    .line 53
    .line 54
    if-eqz p1, :cond_3

    .line 55
    .line 56
    iget p1, p0, Lokhttp3/internal/http1/Http1Codec;->e:I

    .line 57
    .line 58
    if-ne p1, v2, :cond_2

    .line 59
    .line 60
    iput v0, p0, Lokhttp3/internal/http1/Http1Codec;->e:I

    .line 61
    .line 62
    new-instance p1, Lokhttp3/internal/http1/Http1Codec$FixedLengthSink;

    .line 63
    .line 64
    invoke-direct {p1, p0, p2, p3}, Lokhttp3/internal/http1/Http1Codec$FixedLengthSink;-><init>(Lokhttp3/internal/http1/Http1Codec;J)V

    .line 65
    .line 66
    .line 67
    return-object p1

    .line 68
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 69
    .line 70
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    iget p3, p0, Lokhttp3/internal/http1/Http1Codec;->e:I

    .line 75
    .line 76
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p1

    .line 87
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 88
    .line 89
    const-string p2, "Cannot stream a request body without chunked encoding or a known content length!"

    .line 90
    .line 91
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p1
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public final h(J)Lxc/y;
    .locals 2

    .line 1
    iget v0, p0, Lokhttp3/internal/http1/Http1Codec;->e:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    iput v0, p0, Lokhttp3/internal/http1/Http1Codec;->e:I

    .line 8
    .line 9
    new-instance v0, Lokhttp3/internal/http1/Http1Codec$FixedLengthSource;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1, p2}, Lokhttp3/internal/http1/Http1Codec$FixedLengthSource;-><init>(Lokhttp3/internal/http1/Http1Codec;J)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const-string p2, "state: "

    .line 18
    .line 19
    invoke-static {p2}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    iget v0, p0, Lokhttp3/internal/http1/Http1Codec;->e:I

    .line 24
    .line 25
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1
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

.method public final i(Lokhttp3/Headers;Ljava/lang/String;)V
    .locals 4

    .line 1
    iget v0, p0, Lokhttp3/internal/http1/Http1Codec;->e:I

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lokhttp3/internal/http1/Http1Codec;->d:Lxc/g;

    .line 6
    .line 7
    invoke-interface {v0, p2}, Lxc/g;->O(Ljava/lang/String;)Lxc/g;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    const-string v0, "\r\n"

    .line 12
    .line 13
    invoke-interface {p2, v0}, Lxc/g;->O(Ljava/lang/String;)Lxc/g;

    .line 14
    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    iget-object v1, p1, Lokhttp3/Headers;->a:[Ljava/lang/String;

    .line 18
    .line 19
    array-length v1, v1

    .line 20
    div-int/lit8 v1, v1, 0x2

    .line 21
    .line 22
    :goto_0
    if-ge p2, v1, :cond_0

    .line 23
    .line 24
    iget-object v2, p0, Lokhttp3/internal/http1/Http1Codec;->d:Lxc/g;

    .line 25
    .line 26
    invoke-virtual {p1, p2}, Lokhttp3/Headers;->d(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-interface {v2, v3}, Lxc/g;->O(Ljava/lang/String;)Lxc/g;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-string v3, ": "

    .line 35
    .line 36
    invoke-interface {v2, v3}, Lxc/g;->O(Ljava/lang/String;)Lxc/g;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {p1, p2}, Lokhttp3/Headers;->f(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-interface {v2, v3}, Lxc/g;->O(Ljava/lang/String;)Lxc/g;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-interface {v2, v0}, Lxc/g;->O(Ljava/lang/String;)Lxc/g;

    .line 49
    .line 50
    .line 51
    add-int/lit8 p2, p2, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    iget-object p1, p0, Lokhttp3/internal/http1/Http1Codec;->d:Lxc/g;

    .line 55
    .line 56
    invoke-interface {p1, v0}, Lxc/g;->O(Ljava/lang/String;)Lxc/g;

    .line 57
    .line 58
    .line 59
    const/4 p1, 0x1

    .line 60
    iput p1, p0, Lokhttp3/internal/http1/Http1Codec;->e:I

    .line 61
    .line 62
    return-void

    .line 63
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 64
    .line 65
    const-string p2, "state: "

    .line 66
    .line 67
    invoke-static {p2}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    iget v0, p0, Lokhttp3/internal/http1/Http1Codec;->e:I

    .line 72
    .line 73
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p1
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method
