.class public final Lhb/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljb/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhb/b$a;
    }
.end annotation


# static fields
.field public static final d:Ljava/util/logging/Logger;


# instance fields
.field public final a:Lhb/b$a;

.field public final b:Ljb/c;

.field public final c:Lhb/j;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lhb/i;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lhb/b;->d:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Lhb/b$a;Lhb/a$d;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lhb/j;

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-direct {v0, v1}, Lhb/j;-><init>(Ljava/util/logging/Level;)V

    iput-object v0, p0, Lhb/b;->c:Lhb/j;

    const-string v0, "transportExceptionHandler"

    invoke-static {p1, v0}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, p0, Lhb/b;->a:Lhb/b$a;

    iput-object p2, p0, Lhb/b;->b:Ljb/c;

    return-void
.end method


# virtual methods
.method public final A(ZILjava/util/List;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lhb/b;->b:Ljb/c;

    invoke-interface {v0, p1, p2, p3}, Ljb/c;->A(ZILjava/util/List;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lhb/b;->a:Lhb/b$a;

    invoke-interface {p2, p1}, Lhb/b$a;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public final L(Lc4/x;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lhb/b;->c:Lhb/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Lhb/j;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, v0, Lhb/j;->a:Ljava/util/logging/Logger;

    .line 10
    .line 11
    iget-object v0, v0, Lhb/j;->b:Ljava/util/logging/Level;

    .line 12
    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    invoke-static {v3}, La0/j;->u(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v3, " SETTINGS: ack=true"

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v1, v0, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    :try_start_0
    iget-object v0, p0, Lhb/b;->b:Ljb/c;

    .line 39
    .line 40
    invoke-interface {v0, p1}, Ljb/c;->L(Lc4/x;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catch_0
    move-exception p1

    .line 45
    iget-object v0, p0, Lhb/b;->a:Lhb/b$a;

    .line 46
    .line 47
    invoke-interface {v0, p1}, Lhb/b$a;->a(Ljava/lang/Exception;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    return-void
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

.method public final R(ILjb/a;)V
    .locals 2

    iget-object v0, p0, Lhb/b;->c:Lhb/j;

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p1, p2}, Lhb/j;->e(IILjb/a;)V

    :try_start_0
    iget-object v0, p0, Lhb/b;->b:Ljb/c;

    invoke-interface {v0, p1, p2}, Ljb/c;->R(ILjb/a;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lhb/b;->a:Lhb/b$a;

    invoke-interface {p2, p1}, Lhb/b$a;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public final a0(Lc4/x;)V
    .locals 2

    iget-object v0, p0, Lhb/b;->c:Lhb/j;

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p1}, Lhb/j;->f(ILc4/x;)V

    :try_start_0
    iget-object v0, p0, Lhb/b;->b:Ljb/c;

    invoke-interface {v0, p1}, Ljb/c;->a0(Lc4/x;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object v0, p0, Lhb/b;->a:Lhb/b$a;

    invoke-interface {v0, p1}, Lhb/b$a;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public final close()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lhb/b;->b:Ljb/c;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    goto :goto_1

    .line 7
    :catch_0
    move-exception v0

    .line 8
    sget-object v1, Lhb/b;->d:Ljava/util/logging/Logger;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-class v3, Ljava/io/IOException;

    .line 15
    .line 16
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    sget-object v2, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    sget-object v2, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    .line 26
    .line 27
    :goto_0
    const-string v3, "Failed closing connection"

    .line 28
    .line 29
    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    :goto_1
    return-void
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public final d(IJ)V
    .locals 2

    iget-object v0, p0, Lhb/b;->c:Lhb/j;

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p1, p2, p3}, Lhb/j;->g(IIJ)V

    :try_start_0
    iget-object v0, p0, Lhb/b;->b:Ljb/c;

    invoke-interface {v0, p1, p2, p3}, Ljb/c;->d(IJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lhb/b;->a:Lhb/b$a;

    invoke-interface {p2, p1}, Lhb/b$a;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public final e(IIZ)V
    .locals 9

    .line 1
    const/4 v0, 0x2

    .line 2
    const-wide v1, 0xffffffffL

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    const/16 v3, 0x20

    .line 8
    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    iget-object v4, p0, Lhb/b;->c:Lhb/j;

    .line 12
    .line 13
    int-to-long v5, p1

    .line 14
    shl-long/2addr v5, v3

    .line 15
    int-to-long v7, p2

    .line 16
    and-long/2addr v1, v7

    .line 17
    or-long/2addr v1, v5

    .line 18
    invoke-virtual {v4}, Lhb/j;->a()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    iget-object v3, v4, Lhb/j;->a:Ljava/util/logging/Logger;

    .line 25
    .line 26
    iget-object v4, v4, Lhb/j;->b:Ljava/util/logging/Level;

    .line 27
    .line 28
    new-instance v5, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, La0/j;->u(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v0, " PING: ack=true bytes="

    .line 41
    .line 42
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v3, v4, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    iget-object v4, p0, Lhb/b;->c:Lhb/j;

    .line 57
    .line 58
    int-to-long v5, p1

    .line 59
    shl-long/2addr v5, v3

    .line 60
    int-to-long v7, p2

    .line 61
    and-long/2addr v1, v7

    .line 62
    or-long/2addr v1, v5

    .line 63
    invoke-virtual {v4, v0, v1, v2}, Lhb/j;->d(IJ)V

    .line 64
    .line 65
    .line 66
    :cond_1
    :goto_0
    :try_start_0
    iget-object v0, p0, Lhb/b;->b:Ljb/c;

    .line 67
    .line 68
    invoke-interface {v0, p1, p2, p3}, Ljb/c;->e(IIZ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :catch_0
    move-exception p1

    .line 73
    iget-object p2, p0, Lhb/b;->a:Lhb/b$a;

    .line 74
    .line 75
    invoke-interface {p2, p1}, Lhb/b$a;->a(Ljava/lang/Exception;)V

    .line 76
    .line 77
    .line 78
    :goto_1
    return-void
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
.end method

.method public final flush()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lhb/b;->b:Ljb/c;

    invoke-interface {v0}, Ljb/c;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lhb/b;->a:Lhb/b$a;

    invoke-interface {v1, v0}, Lhb/b$a;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public final o0(Ljb/a;[B)V
    .locals 4

    iget-object v0, p0, Lhb/b;->c:Lhb/j;

    invoke-static {p2}, Lxc/i;->o([B)Lxc/i;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, p1, v1}, Lhb/j;->c(IILjb/a;Lxc/i;)V

    :try_start_0
    iget-object v0, p0, Lhb/b;->b:Ljb/c;

    invoke-interface {v0, p1, p2}, Ljb/c;->o0(Ljb/a;[B)V

    iget-object p1, p0, Lhb/b;->b:Ljb/c;

    invoke-interface {p1}, Ljb/c;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lhb/b;->a:Lhb/b$a;

    invoke-interface {p2, p1}, Lhb/b$a;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public final t0()I
    .locals 1

    iget-object v0, p0, Lhb/b;->b:Ljb/c;

    invoke-interface {v0}, Ljb/c;->t0()I

    move-result v0

    return v0
.end method

.method public final u(ZILxc/f;I)V
    .locals 6

    iget-object v0, p0, Lhb/b;->c:Lhb/j;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x2

    move v2, p2

    move-object v3, p3

    move v4, p4

    move v5, p1

    invoke-virtual/range {v0 .. v5}, Lhb/j;->b(IILxc/f;IZ)V

    :try_start_0
    iget-object v0, p0, Lhb/b;->b:Ljb/c;

    invoke-interface {v0, p1, p2, p3, p4}, Ljb/c;->u(ZILxc/f;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lhb/b;->a:Lhb/b$a;

    invoke-interface {p2, p1}, Lhb/b$a;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public final w()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lhb/b;->b:Ljb/c;

    invoke-interface {v0}, Ljb/c;->w()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lhb/b;->a:Lhb/b$a;

    invoke-interface {v1, v0}, Lhb/b$a;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method
