.class public final Lokhttp3/internal/Util;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[B

.field public static final b:[Ljava/lang/String;

.field public static final c:Lokhttp3/ResponseBody;

.field public static final d:Lxc/i;

.field public static final e:Lxc/i;

.field public static final f:Lxc/i;

.field public static final g:Lxc/i;

.field public static final h:Lxc/i;

.field public static final i:Ljava/nio/charset/Charset;

.field public static final j:Ljava/nio/charset/Charset;

.field public static final k:Ljava/nio/charset/Charset;

.field public static final l:Ljava/nio/charset/Charset;

.field public static final m:Ljava/nio/charset/Charset;

.field public static final n:Ljava/util/TimeZone;

.field public static final o:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final p:Ljava/lang/reflect/Method;

.field public static final q:Ljava/util/regex/Pattern;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x0

    new-array v1, v0, [B

    sput-object v1, Lokhttp3/internal/Util;->a:[B

    new-array v2, v0, [Ljava/lang/String;

    sput-object v2, Lokhttp3/internal/Util;->b:[Ljava/lang/String;

    invoke-static {v1}, Lokhttp3/ResponseBody;->C([B)Lokhttp3/ResponseBody;

    move-result-object v2

    sput-object v2, Lokhttp3/internal/Util;->c:Lokhttp3/ResponseBody;

    const/4 v2, 0x0

    invoke-static {v2, v1}, Lokhttp3/RequestBody;->c(Lokhttp3/MediaType;[B)Lokhttp3/RequestBody;

    const-string v1, "efbbbf"

    invoke-static {v1}, Lxc/i;->g(Ljava/lang/String;)Lxc/i;

    move-result-object v1

    sput-object v1, Lokhttp3/internal/Util;->d:Lxc/i;

    const-string v1, "feff"

    invoke-static {v1}, Lxc/i;->g(Ljava/lang/String;)Lxc/i;

    move-result-object v1

    sput-object v1, Lokhttp3/internal/Util;->e:Lxc/i;

    const-string v1, "fffe"

    invoke-static {v1}, Lxc/i;->g(Ljava/lang/String;)Lxc/i;

    move-result-object v1

    sput-object v1, Lokhttp3/internal/Util;->f:Lxc/i;

    const-string v1, "0000ffff"

    invoke-static {v1}, Lxc/i;->g(Ljava/lang/String;)Lxc/i;

    move-result-object v1

    sput-object v1, Lokhttp3/internal/Util;->g:Lxc/i;

    const-string v1, "ffff0000"

    invoke-static {v1}, Lxc/i;->g(Ljava/lang/String;)Lxc/i;

    move-result-object v1

    sput-object v1, Lokhttp3/internal/Util;->h:Lxc/i;

    const-string v1, "UTF-8"

    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    sput-object v1, Lokhttp3/internal/Util;->i:Ljava/nio/charset/Charset;

    const-string v1, "ISO-8859-1"

    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    const-string v1, "UTF-16BE"

    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    sput-object v1, Lokhttp3/internal/Util;->j:Ljava/nio/charset/Charset;

    const-string v1, "UTF-16LE"

    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    sput-object v1, Lokhttp3/internal/Util;->k:Ljava/nio/charset/Charset;

    const-string v1, "UTF-32BE"

    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    sput-object v1, Lokhttp3/internal/Util;->l:Ljava/nio/charset/Charset;

    const-string v1, "UTF-32LE"

    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1

    sput-object v1, Lokhttp3/internal/Util;->m:Ljava/nio/charset/Charset;

    const-string v1, "GMT"

    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    sput-object v1, Lokhttp3/internal/Util;->n:Ljava/util/TimeZone;

    new-instance v1, Lokhttp3/internal/Util$1;

    invoke-direct {v1}, Lokhttp3/internal/Util$1;-><init>()V

    sput-object v1, Lokhttp3/internal/Util;->o:Ljava/util/Comparator;

    :try_start_0
    const-class v1, Ljava/lang/Throwable;

    const-string v3, "addSuppressed"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Class;

    const-class v5, Ljava/lang/Throwable;

    aput-object v5, v4, v0

    invoke-virtual {v1, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    sput-object v2, Lokhttp3/internal/Util;->p:Ljava/lang/reflect/Method;

    const-string v0, "([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lokhttp3/internal/Util;->q:Ljava/util/regex/Pattern;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/AssertionError;
    .locals 1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    :try_start_0
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public static b(Lxc/h;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;
    .locals 2

    .line 1
    sget-object v0, Lokhttp3/internal/Util;->d:Lxc/i;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lxc/h;->K(Lxc/i;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object p1, v0, Lxc/i;->a:[B

    .line 10
    .line 11
    array-length p1, p1

    .line 12
    int-to-long v0, p1

    .line 13
    invoke-interface {p0, v0, v1}, Lxc/h;->skip(J)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lokhttp3/internal/Util;->i:Ljava/nio/charset/Charset;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    sget-object v0, Lokhttp3/internal/Util;->e:Lxc/i;

    .line 20
    .line 21
    invoke-interface {p0, v0}, Lxc/h;->K(Lxc/i;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    iget-object p1, v0, Lxc/i;->a:[B

    .line 28
    .line 29
    array-length p1, p1

    .line 30
    int-to-long v0, p1

    .line 31
    invoke-interface {p0, v0, v1}, Lxc/h;->skip(J)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lokhttp3/internal/Util;->j:Ljava/nio/charset/Charset;

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_1
    sget-object v0, Lokhttp3/internal/Util;->f:Lxc/i;

    .line 38
    .line 39
    invoke-interface {p0, v0}, Lxc/h;->K(Lxc/i;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    iget-object p1, v0, Lxc/i;->a:[B

    .line 46
    .line 47
    array-length p1, p1

    .line 48
    int-to-long v0, p1

    .line 49
    invoke-interface {p0, v0, v1}, Lxc/h;->skip(J)V

    .line 50
    .line 51
    .line 52
    sget-object p0, Lokhttp3/internal/Util;->k:Ljava/nio/charset/Charset;

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_2
    sget-object v0, Lokhttp3/internal/Util;->g:Lxc/i;

    .line 56
    .line 57
    invoke-interface {p0, v0}, Lxc/h;->K(Lxc/i;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    iget-object p1, v0, Lxc/i;->a:[B

    .line 64
    .line 65
    array-length p1, p1

    .line 66
    int-to-long v0, p1

    .line 67
    invoke-interface {p0, v0, v1}, Lxc/h;->skip(J)V

    .line 68
    .line 69
    .line 70
    sget-object p0, Lokhttp3/internal/Util;->l:Ljava/nio/charset/Charset;

    .line 71
    .line 72
    return-object p0

    .line 73
    :cond_3
    sget-object v0, Lokhttp3/internal/Util;->h:Lxc/i;

    .line 74
    .line 75
    invoke-interface {p0, v0}, Lxc/h;->K(Lxc/i;)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_4

    .line 80
    .line 81
    iget-object p1, v0, Lxc/i;->a:[B

    .line 82
    .line 83
    array-length p1, p1

    .line 84
    int-to-long v0, p1

    .line 85
    invoke-interface {p0, v0, v1}, Lxc/h;->skip(J)V

    .line 86
    .line 87
    .line 88
    sget-object p0, Lokhttp3/internal/Util;->m:Ljava/nio/charset/Charset;

    .line 89
    .line 90
    return-object p0

    .line 91
    :cond_4
    return-object p1
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

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, ":"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, -0x1

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    if-eqz v0, :cond_a

    .line 12
    .line 13
    const-string v0, "["

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const-string v0, "]"

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    sub-int/2addr v0, v1

    .line 34
    invoke-static {v1, v0, p0}, Lokhttp3/internal/Util;->h(IILjava/lang/String;)Ljava/net/InetAddress;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-static {v3, v0, p0}, Lokhttp3/internal/Util;->h(IILjava/lang/String;)Ljava/net/InetAddress;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :goto_0
    if-nez v0, :cond_1

    .line 48
    .line 49
    return-object v4

    .line 50
    :cond_1
    invoke-virtual {v0}, Ljava/net/InetAddress;->getAddress()[B

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    array-length v1, v0

    .line 55
    const/16 v4, 0x10

    .line 56
    .line 57
    if-ne v1, v4, :cond_9

    .line 58
    .line 59
    move p0, v3

    .line 60
    move v1, p0

    .line 61
    :goto_1
    array-length v5, v0

    .line 62
    if-ge p0, v5, :cond_4

    .line 63
    .line 64
    move v5, p0

    .line 65
    :goto_2
    if-ge v5, v4, :cond_2

    .line 66
    .line 67
    aget-byte v6, v0, v5

    .line 68
    .line 69
    if-nez v6, :cond_2

    .line 70
    .line 71
    add-int/lit8 v6, v5, 0x1

    .line 72
    .line 73
    aget-byte v6, v0, v6

    .line 74
    .line 75
    if-nez v6, :cond_2

    .line 76
    .line 77
    add-int/lit8 v5, v5, 0x2

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_2
    sub-int v6, v5, p0

    .line 81
    .line 82
    if-le v6, v1, :cond_3

    .line 83
    .line 84
    const/4 v7, 0x4

    .line 85
    if-lt v6, v7, :cond_3

    .line 86
    .line 87
    move v2, p0

    .line 88
    move v1, v6

    .line 89
    :cond_3
    add-int/lit8 p0, v5, 0x2

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_4
    new-instance p0, Lxc/f;

    .line 93
    .line 94
    invoke-direct {p0}, Lxc/f;-><init>()V

    .line 95
    .line 96
    .line 97
    :cond_5
    :goto_3
    array-length v5, v0

    .line 98
    if-ge v3, v5, :cond_8

    .line 99
    .line 100
    const/16 v5, 0x3a

    .line 101
    .line 102
    if-ne v3, v2, :cond_6

    .line 103
    .line 104
    invoke-virtual {p0, v5}, Lxc/f;->B0(I)V

    .line 105
    .line 106
    .line 107
    add-int/2addr v3, v1

    .line 108
    if-ne v3, v4, :cond_5

    .line 109
    .line 110
    invoke-virtual {p0, v5}, Lxc/f;->B0(I)V

    .line 111
    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_6
    if-lez v3, :cond_7

    .line 115
    .line 116
    invoke-virtual {p0, v5}, Lxc/f;->B0(I)V

    .line 117
    .line 118
    .line 119
    :cond_7
    aget-byte v5, v0, v3

    .line 120
    .line 121
    and-int/lit16 v5, v5, 0xff

    .line 122
    .line 123
    shl-int/lit8 v5, v5, 0x8

    .line 124
    .line 125
    add-int/lit8 v6, v3, 0x1

    .line 126
    .line 127
    aget-byte v6, v0, v6

    .line 128
    .line 129
    and-int/lit16 v6, v6, 0xff

    .line 130
    .line 131
    or-int/2addr v5, v6

    .line 132
    int-to-long v5, v5

    .line 133
    invoke-virtual {p0, v5, v6}, Lxc/f;->C0(J)Lxc/f;

    .line 134
    .line 135
    .line 136
    add-int/lit8 v3, v3, 0x2

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_8
    invoke-virtual {p0}, Lxc/f;->k0()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    return-object p0

    .line 144
    :cond_9
    new-instance v0, Ljava/lang/AssertionError;

    .line 145
    .line 146
    const-string v1, "Invalid IPv6 address: \'"

    .line 147
    .line 148
    const-string v2, "\'"

    .line 149
    .line 150
    invoke-static {v1, p0, v2}, Lg;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    throw v0

    .line 158
    :cond_a
    :try_start_0
    invoke-static {p0}, Ljava/net/IDN;->toASCII(Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 163
    .line 164
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-eqz v0, :cond_b

    .line 173
    .line 174
    return-object v4

    .line 175
    :cond_b
    move v0, v3

    .line 176
    :goto_4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    if-ge v0, v5, :cond_e

    .line 181
    .line 182
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    const/16 v6, 0x1f

    .line 187
    .line 188
    if-le v5, v6, :cond_f

    .line 189
    .line 190
    const/16 v6, 0x7f

    .line 191
    .line 192
    if-lt v5, v6, :cond_c

    .line 193
    .line 194
    goto :goto_5

    .line 195
    :cond_c
    const-string v6, " #%/:?@[\\]"

    .line 196
    .line 197
    invoke-virtual {v6, v5}, Ljava/lang/String;->indexOf(I)I

    .line 198
    .line 199
    .line 200
    move-result v5
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 201
    if-eq v5, v2, :cond_d

    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_d
    add-int/lit8 v0, v0, 0x1

    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_e
    move v1, v3

    .line 208
    :cond_f
    :goto_5
    if-eqz v1, :cond_10

    .line 209
    .line 210
    return-object v4

    .line 211
    :cond_10
    return-object p0

    .line 212
    :catch_0
    return-object v4
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

.method public static d(JLjava/util/concurrent/TimeUnit;)I
    .locals 5

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-ltz v2, :cond_4

    if-eqz p2, :cond_3

    invoke-virtual {p2, p0, p1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p0

    const-wide/32 v3, 0x7fffffff

    cmp-long p2, p0, v3

    if-gtz p2, :cond_2

    cmp-long p2, p0, v0

    if-nez p2, :cond_1

    if-gtz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "timeout too small."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    long-to-int p0, p0

    return p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "timeout too large."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "unit == null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "timeout < 0"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static e(Ljava/io/Closeable;)V
    .locals 0

    if-eqz p0, :cond_0

    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception p0

    throw p0

    :catch_1
    :cond_0
    :goto_0
    return-void
.end method

.method public static f(Ljava/net/Socket;)V
    .locals 2

    if-eqz p0, :cond_2

    :try_start_0
    invoke-virtual {p0}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "bio == null"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    throw p0

    :catch_1
    move-exception p0

    invoke-static {p0}, Lokhttp3/internal/Util;->q(Ljava/lang/AssertionError;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    throw p0

    :catch_2
    :cond_2
    :goto_0
    return-void
.end method

.method public static g(C)I
    .locals 2

    const/16 v0, 0x30

    if-lt p0, v0, :cond_0

    const/16 v1, 0x39

    if-gt p0, v1, :cond_0

    sub-int/2addr p0, v0

    return p0

    :cond_0
    const/16 v0, 0x61

    if-lt p0, v0, :cond_1

    const/16 v1, 0x66

    if-gt p0, v1, :cond_1

    :goto_0
    sub-int/2addr p0, v0

    add-int/lit8 p0, p0, 0xa

    return p0

    :cond_1
    const/16 v0, 0x41

    if-lt p0, v0, :cond_2

    const/16 v1, 0x46

    if-gt p0, v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 p0, -0x1

    return p0
.end method

.method public static h(IILjava/lang/String;)Ljava/net/InetAddress;
    .locals 16

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const/16 v2, 0x10

    .line 6
    .line 7
    new-array v3, v2, [B

    .line 8
    .line 9
    const/4 v4, -0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    move/from16 v6, p0

    .line 12
    .line 13
    move v8, v4

    .line 14
    move v9, v8

    .line 15
    move v7, v5

    .line 16
    :goto_0
    const/4 v10, 0x0

    .line 17
    if-ge v6, v0, :cond_16

    .line 18
    .line 19
    if-ne v7, v2, :cond_0

    .line 20
    .line 21
    return-object v10

    .line 22
    :cond_0
    add-int/lit8 v11, v6, 0x2

    .line 23
    .line 24
    const/16 v12, 0xff

    .line 25
    .line 26
    const/4 v13, 0x4

    .line 27
    if-gt v11, v0, :cond_3

    .line 28
    .line 29
    const-string v14, "::"

    .line 30
    .line 31
    const/4 v15, 0x2

    .line 32
    invoke-virtual {v1, v6, v14, v5, v15}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 33
    .line 34
    .line 35
    move-result v14

    .line 36
    if-eqz v14, :cond_3

    .line 37
    .line 38
    if-eq v8, v4, :cond_1

    .line 39
    .line 40
    return-object v10

    .line 41
    :cond_1
    add-int/lit8 v7, v7, 0x2

    .line 42
    .line 43
    if-ne v11, v0, :cond_2

    .line 44
    .line 45
    move v0, v2

    .line 46
    move v8, v7

    .line 47
    goto/16 :goto_c

    .line 48
    .line 49
    :cond_2
    move v8, v7

    .line 50
    move v9, v11

    .line 51
    goto/16 :goto_8

    .line 52
    .line 53
    :cond_3
    if-eqz v7, :cond_11

    .line 54
    .line 55
    const-string v11, ":"

    .line 56
    .line 57
    const/4 v14, 0x1

    .line 58
    invoke-virtual {v1, v6, v11, v5, v14}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 59
    .line 60
    .line 61
    move-result v11

    .line 62
    if-eqz v11, :cond_4

    .line 63
    .line 64
    add-int/lit8 v6, v6, 0x1

    .line 65
    .line 66
    goto/16 :goto_7

    .line 67
    .line 68
    :cond_4
    const-string v11, "."

    .line 69
    .line 70
    invoke-virtual {v1, v6, v11, v5, v14}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-eqz v6, :cond_10

    .line 75
    .line 76
    add-int/lit8 v6, v7, -0x2

    .line 77
    .line 78
    move v11, v6

    .line 79
    :goto_1
    if-ge v9, v0, :cond_d

    .line 80
    .line 81
    if-ne v11, v2, :cond_5

    .line 82
    .line 83
    :goto_2
    move v14, v5

    .line 84
    goto :goto_6

    .line 85
    :cond_5
    if-eq v11, v6, :cond_7

    .line 86
    .line 87
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    .line 88
    .line 89
    .line 90
    move-result v15

    .line 91
    const/16 v14, 0x2e

    .line 92
    .line 93
    if-eq v15, v14, :cond_6

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_6
    add-int/lit8 v9, v9, 0x1

    .line 97
    .line 98
    :cond_7
    move v15, v5

    .line 99
    move v14, v9

    .line 100
    :goto_3
    if-ge v14, v0, :cond_b

    .line 101
    .line 102
    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    const/16 v2, 0x30

    .line 107
    .line 108
    if-lt v5, v2, :cond_b

    .line 109
    .line 110
    const/16 v4, 0x39

    .line 111
    .line 112
    if-le v5, v4, :cond_8

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_8
    if-nez v15, :cond_9

    .line 116
    .line 117
    if-eq v9, v14, :cond_9

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_9
    mul-int/lit8 v15, v15, 0xa

    .line 121
    .line 122
    add-int/2addr v15, v5

    .line 123
    sub-int/2addr v15, v2

    .line 124
    if-le v15, v12, :cond_a

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_a
    add-int/lit8 v14, v14, 0x1

    .line 128
    .line 129
    const/16 v2, 0x10

    .line 130
    .line 131
    const/4 v4, -0x1

    .line 132
    const/4 v5, 0x0

    .line 133
    goto :goto_3

    .line 134
    :cond_b
    :goto_4
    sub-int v2, v14, v9

    .line 135
    .line 136
    if-nez v2, :cond_c

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_c
    add-int/lit8 v2, v11, 0x1

    .line 140
    .line 141
    int-to-byte v4, v15

    .line 142
    aput-byte v4, v3, v11

    .line 143
    .line 144
    move v11, v2

    .line 145
    move v9, v14

    .line 146
    const/16 v2, 0x10

    .line 147
    .line 148
    const/4 v4, -0x1

    .line 149
    const/4 v5, 0x0

    .line 150
    const/4 v14, 0x1

    .line 151
    goto :goto_1

    .line 152
    :cond_d
    add-int/2addr v6, v13

    .line 153
    if-eq v11, v6, :cond_e

    .line 154
    .line 155
    :goto_5
    const/4 v14, 0x0

    .line 156
    goto :goto_6

    .line 157
    :cond_e
    const/4 v14, 0x1

    .line 158
    :goto_6
    if-nez v14, :cond_f

    .line 159
    .line 160
    return-object v10

    .line 161
    :cond_f
    add-int/lit8 v7, v7, 0x2

    .line 162
    .line 163
    const/16 v0, 0x10

    .line 164
    .line 165
    goto :goto_c

    .line 166
    :cond_10
    return-object v10

    .line 167
    :cond_11
    :goto_7
    move v9, v6

    .line 168
    :goto_8
    move v6, v9

    .line 169
    const/4 v2, 0x0

    .line 170
    :goto_9
    if-ge v6, v0, :cond_13

    .line 171
    .line 172
    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    invoke-static {v4}, Lokhttp3/internal/Util;->g(C)I

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    const/4 v5, -0x1

    .line 181
    if-ne v4, v5, :cond_12

    .line 182
    .line 183
    goto :goto_a

    .line 184
    :cond_12
    shl-int/lit8 v2, v2, 0x4

    .line 185
    .line 186
    add-int/2addr v2, v4

    .line 187
    add-int/lit8 v6, v6, 0x1

    .line 188
    .line 189
    goto :goto_9

    .line 190
    :cond_13
    :goto_a
    sub-int v4, v6, v9

    .line 191
    .line 192
    if-eqz v4, :cond_15

    .line 193
    .line 194
    if-le v4, v13, :cond_14

    .line 195
    .line 196
    goto :goto_b

    .line 197
    :cond_14
    add-int/lit8 v4, v7, 0x1

    .line 198
    .line 199
    ushr-int/lit8 v5, v2, 0x8

    .line 200
    .line 201
    and-int/2addr v5, v12

    .line 202
    int-to-byte v5, v5

    .line 203
    aput-byte v5, v3, v7

    .line 204
    .line 205
    add-int/lit8 v7, v4, 0x1

    .line 206
    .line 207
    and-int/lit16 v2, v2, 0xff

    .line 208
    .line 209
    int-to-byte v2, v2

    .line 210
    aput-byte v2, v3, v4

    .line 211
    .line 212
    const/16 v2, 0x10

    .line 213
    .line 214
    const/4 v4, -0x1

    .line 215
    const/4 v5, 0x0

    .line 216
    goto/16 :goto_0

    .line 217
    .line 218
    :cond_15
    :goto_b
    return-object v10

    .line 219
    :cond_16
    move v0, v2

    .line 220
    :goto_c
    if-eq v7, v0, :cond_18

    .line 221
    .line 222
    const/4 v1, -0x1

    .line 223
    if-ne v8, v1, :cond_17

    .line 224
    .line 225
    return-object v10

    .line 226
    :cond_17
    sub-int v1, v7, v8

    .line 227
    .line 228
    rsub-int/lit8 v2, v1, 0x10

    .line 229
    .line 230
    invoke-static {v3, v8, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 231
    .line 232
    .line 233
    rsub-int/lit8 v2, v7, 0x10

    .line 234
    .line 235
    add-int/2addr v2, v8

    .line 236
    const/4 v0, 0x0

    .line 237
    invoke-static {v3, v8, v2, v0}, Ljava/util/Arrays;->fill([BIIB)V

    .line 238
    .line 239
    .line 240
    :cond_18
    :try_start_0
    invoke-static {v3}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    .line 241
    .line 242
    .line 243
    move-result-object v0
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    .line 244
    return-object v0

    .line 245
    :catch_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 246
    .line 247
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 248
    .line 249
    .line 250
    throw v0
    .line 251
.end method

.method public static i(Ljava/lang/String;IIC)I
    .locals 1

    :goto_0
    if-ge p1, p2, :cond_1

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    if-ne v0, p3, :cond_0

    return p1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return p2
.end method

.method public static j(Ljava/lang/String;IILjava/lang/String;)I
    .locals 2

    :goto_0
    if-ge p1, p2, :cond_1

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {p3, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return p1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return p2
.end method

.method public static k(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    if-eq p0, p1, :cond_1

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static varargs l(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v0, p0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static m(Lokhttp3/HttpUrl;Z)Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, ":"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string v0, "["

    .line 12
    .line 13
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v2, p0, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 18
    .line 19
    const-string v3, "]"

    .line 20
    .line 21
    invoke-static {v0, v2, v3}, Lg;->f(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 27
    .line 28
    :goto_0
    if-nez p1, :cond_1

    .line 29
    .line 30
    iget p1, p0, Lokhttp3/HttpUrl;->e:I

    .line 31
    .line 32
    iget-object v2, p0, Lokhttp3/HttpUrl;->a:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v2}, Lokhttp3/HttpUrl;->c(Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eq p1, v2, :cond_2

    .line 39
    .line 40
    :cond_1
    invoke-static {v0, v1}, Lg;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget p0, p0, Lokhttp3/HttpUrl;->e:I

    .line 45
    .line 46
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :cond_2
    return-object v0
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
    .line 78
    .line 79
    .line 80
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
.end method

.method public static n(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static varargs o([Ljava/lang/Object;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Object;

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static p(Ljava/util/Comparator;[Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "-",
            "Ljava/lang/String;",
            ">;[",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ")[",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, p1, v3

    array-length v5, p2

    move v6, v2

    :goto_1
    if-ge v6, v5, :cond_1

    aget-object v7, p2, v6

    invoke-interface {p0, v4, v7}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v7

    if-nez v7, :cond_0

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p0

    new-array p0, p0, [Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    return-object p0
.end method

.method public static q(Ljava/lang/AssertionError;)Z
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    const-string v0, "getsockname failed"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static r(Ljava/util/Comparator;[Ljava/lang/String;[Ljava/lang/String;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "Ljava/lang/String;",
            ">;[",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ")Z"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    array-length v1, p1

    if-eqz v1, :cond_3

    array-length v1, p2

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    array-length v1, p1

    move v2, v0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v3, p1, v2

    array-length v4, p2

    move v5, v0

    :goto_1
    if-ge v5, v4, :cond_2

    aget-object v6, p2, v5

    invoke-interface {p0, v3, v6}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v6

    if-nez v6, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    return v0
.end method

.method public static s(Lxc/y;ILjava/util/concurrent/TimeUnit;)Z
    .locals 11

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    invoke-interface {p0}, Lxc/y;->c()Lxc/z;

    move-result-object v2

    invoke-virtual {v2}, Lxc/z;->e()Z

    move-result v2

    const-wide v3, 0x7fffffffffffffffL

    if-eqz v2, :cond_0

    invoke-interface {p0}, Lxc/y;->c()Lxc/z;

    move-result-object v2

    invoke-virtual {v2}, Lxc/z;->c()J

    move-result-wide v5

    sub-long/2addr v5, v0

    goto :goto_0

    :cond_0
    move-wide v5, v3

    :goto_0
    invoke-interface {p0}, Lxc/y;->c()Lxc/z;

    move-result-object v2

    int-to-long v7, p1

    invoke-virtual {p2, v7, v8}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p1

    invoke-static {v5, v6, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    add-long/2addr p1, v0

    invoke-virtual {v2, p1, p2}, Lxc/z;->d(J)Lxc/z;

    :try_start_0
    new-instance p1, Lxc/f;

    invoke-direct {p1}, Lxc/f;-><init>()V

    :goto_1
    const-wide/16 v7, 0x2000

    invoke-interface {p0, p1, v7, v8}, Lxc/y;->e0(Lxc/f;J)J

    move-result-wide v7

    const-wide/16 v9, -0x1

    cmp-long p2, v7, v9

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lxc/f;->f()V
    :try_end_0
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_1
    const/4 p1, 0x1

    cmp-long p2, v5, v3

    invoke-interface {p0}, Lxc/y;->c()Lxc/z;

    move-result-object p0

    if-nez p2, :cond_2

    invoke-virtual {p0}, Lxc/z;->a()Lxc/z;

    goto :goto_2

    :cond_2
    add-long/2addr v0, v5

    invoke-virtual {p0, v0, v1}, Lxc/z;->d(J)Lxc/z;

    :goto_2
    return p1

    :catchall_0
    move-exception p1

    cmp-long p2, v5, v3

    invoke-interface {p0}, Lxc/y;->c()Lxc/z;

    move-result-object p0

    if-nez p2, :cond_3

    invoke-virtual {p0}, Lxc/z;->a()Lxc/z;

    goto :goto_3

    :cond_3
    add-long/2addr v0, v5

    invoke-virtual {p0, v0, v1}, Lxc/z;->d(J)Lxc/z;

    :goto_3
    throw p1

    :catch_0
    const/4 p1, 0x0

    cmp-long p2, v5, v3

    invoke-interface {p0}, Lxc/y;->c()Lxc/z;

    move-result-object p0

    if-nez p2, :cond_4

    invoke-virtual {p0}, Lxc/z;->a()Lxc/z;

    goto :goto_4

    :cond_4
    add-long/2addr v0, v5

    invoke-virtual {p0, v0, v1}, Lxc/z;->d(J)Lxc/z;

    :goto_4
    return p1
.end method

.method public static t(IILjava/lang/String;)I
    .locals 2

    :goto_0
    if-ge p0, p1, :cond_1

    invoke-virtual {p2, p0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    const/16 v1, 0xa

    if-eq v0, v1, :cond_0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_0

    const/16 v1, 0xd

    if-eq v0, v1, :cond_0

    const/16 v1, 0x20

    if-eq v0, v1, :cond_0

    return p0

    :cond_0
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_1
    return p1
.end method

.method public static u(IILjava/lang/String;)I
    .locals 2

    add-int/lit8 p1, p1, -0x1

    :goto_0
    if-lt p1, p0, :cond_1

    invoke-virtual {p2, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    const/16 v1, 0xa

    if-eq v0, v1, :cond_0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_0

    const/16 v1, 0xd

    if-eq v0, v1, :cond_0

    const/16 v1, 0x20

    if-eq v0, v1, :cond_0

    add-int/lit8 p1, p1, 0x1

    return p1

    :cond_0
    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    return p0
.end method

.method public static v(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;
    .locals 1

    new-instance v0, Lokhttp3/internal/Util$2;

    invoke-direct {v0, p0, p1}, Lokhttp3/internal/Util$2;-><init>(Ljava/lang/String;Z)V

    return-object v0
.end method

.method public static w(Ljava/util/ArrayList;)Lokhttp3/Headers;
    .locals 4

    new-instance v0, Lokhttp3/Headers$Builder;

    invoke-direct {v0}, Lokhttp3/Headers$Builder;-><init>()V

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lokhttp3/internal/http2/Header;

    sget-object v2, Lokhttp3/internal/Internal;->a:Lokhttp3/internal/Internal;

    iget-object v3, v1, Lokhttp3/internal/http2/Header;->a:Lxc/i;

    invoke-virtual {v3}, Lxc/i;->t()Ljava/lang/String;

    move-result-object v3

    iget-object v1, v1, Lokhttp3/internal/http2/Header;->b:Lxc/i;

    invoke-virtual {v1}, Lxc/i;->t()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v3, v1}, Lokhttp3/internal/Internal;->b(Lokhttp3/Headers$Builder;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance p0, Lokhttp3/Headers;

    invoke-direct {p0, v0}, Lokhttp3/Headers;-><init>(Lokhttp3/Headers$Builder;)V

    return-object p0
.end method

.method public static x(IILjava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1, p2}, Lokhttp3/internal/Util;->t(IILjava/lang/String;)I

    move-result p0

    invoke-static {p0, p1, p2}, Lokhttp3/internal/Util;->u(IILjava/lang/String;)I

    move-result p1

    invoke-virtual {p2, p0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
