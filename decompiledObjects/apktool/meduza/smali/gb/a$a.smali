.class public final Lgb/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:Leb/s0;

.field public b:Z

.field public final c:Lgb/l3;

.field public d:[B

.field public final synthetic e:Lgb/a;


# direct methods
.method public constructor <init>(Lgb/a;Leb/s0;Lgb/l3;)V
    .locals 0

    iput-object p1, p0, Lgb/a$a;->e:Lgb/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "headers"

    invoke-static {p2, p1}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object p2, p0, Lgb/a$a;->a:Leb/s0;

    iput-object p3, p0, Lgb/a$a;->c:Lgb/l3;

    return-void
.end method


# virtual methods
.method public final a(Leb/l;)Lgb/t0;
    .locals 0

    return-object p0
.end method

.method public final b(Ljava/io/InputStream;)V
    .locals 14

    .line 1
    iget-object v0, p0, Lgb/a$a;->d:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v0, v1

    .line 9
    :goto_0
    const-string v2, "writePayload should not be called multiple times"

    .line 10
    .line 11
    invoke-static {v0, v2}, Lx6/b;->I(ZLjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :try_start_0
    invoke-static {p1}, Lp7/b;->b(Ljava/io/InputStream;)[B

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lgb/a$a;->d:[B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    iget-object p1, p0, Lgb/a$a;->c:Lgb/l3;

    .line 21
    .line 22
    iget-object p1, p1, Lgb/l3;->a:[Lm/e;

    .line 23
    .line 24
    array-length v0, p1

    .line 25
    move v2, v1

    .line 26
    :goto_1
    if-ge v2, v0, :cond_1

    .line 27
    .line 28
    aget-object v3, p1, v2

    .line 29
    .line 30
    invoke-virtual {v3, v1}, Lm/e;->k(I)V

    .line 31
    .line 32
    .line 33
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    iget-object p1, p0, Lgb/a$a;->c:Lgb/l3;

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    iget-object v2, p0, Lgb/a$a;->d:[B

    .line 40
    .line 41
    array-length v3, v2

    .line 42
    int-to-long v8, v3

    .line 43
    array-length v2, v2

    .line 44
    int-to-long v10, v2

    .line 45
    iget-object p1, p1, Lgb/l3;->a:[Lm/e;

    .line 46
    .line 47
    array-length v12, p1

    .line 48
    move v13, v1

    .line 49
    :goto_2
    if-ge v13, v12, :cond_2

    .line 50
    .line 51
    aget-object v2, p1, v13

    .line 52
    .line 53
    move v3, v0

    .line 54
    move-wide v4, v8

    .line 55
    move-wide v6, v10

    .line 56
    invoke-virtual/range {v2 .. v7}, Lm/e;->l(IJJ)V

    .line 57
    .line 58
    .line 59
    add-int/lit8 v13, v13, 0x1

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    iget-object p1, p0, Lgb/a$a;->c:Lgb/l3;

    .line 63
    .line 64
    iget-object v0, p0, Lgb/a$a;->d:[B

    .line 65
    .line 66
    array-length v0, v0

    .line 67
    int-to-long v2, v0

    .line 68
    iget-object p1, p1, Lgb/l3;->a:[Lm/e;

    .line 69
    .line 70
    array-length v0, p1

    .line 71
    move v4, v1

    .line 72
    :goto_3
    if-ge v4, v0, :cond_3

    .line 73
    .line 74
    aget-object v5, p1, v4

    .line 75
    .line 76
    invoke-virtual {v5, v2, v3}, Lm/e;->m(J)V

    .line 77
    .line 78
    .line 79
    add-int/lit8 v4, v4, 0x1

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_3
    iget-object p1, p0, Lgb/a$a;->c:Lgb/l3;

    .line 83
    .line 84
    iget-object v0, p0, Lgb/a$a;->d:[B

    .line 85
    .line 86
    array-length v0, v0

    .line 87
    int-to-long v2, v0

    .line 88
    iget-object p1, p1, Lgb/l3;->a:[Lm/e;

    .line 89
    .line 90
    array-length v0, p1

    .line 91
    :goto_4
    if-ge v1, v0, :cond_4

    .line 92
    .line 93
    aget-object v4, p1, v1

    .line 94
    .line 95
    invoke-virtual {v4, v2, v3}, Lm/e;->n(J)V

    .line 96
    .line 97
    .line 98
    add-int/lit8 v1, v1, 0x1

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_4
    return-void

    .line 102
    :catch_0
    move-exception p1

    .line 103
    new-instance v0, Ljava/lang/RuntimeException;

    .line 104
    .line 105
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    throw v0
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

.method public final close()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lgb/a$a;->b:Z

    iget-object v1, p0, Lgb/a$a;->d:[B

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Lack of request message. GET request is only supported for unary requests"

    invoke-static {v0, v1}, Lx6/b;->I(ZLjava/lang/String;)V

    iget-object v0, p0, Lgb/a$a;->e:Lgb/a;

    invoke-virtual {v0}, Lgb/a;->r()Lhb/h$a;

    move-result-object v0

    iget-object v1, p0, Lgb/a$a;->a:Leb/s0;

    iget-object v2, p0, Lgb/a$a;->d:[B

    invoke-virtual {v0, v1, v2}, Lhb/h$a;->a(Leb/s0;[B)V

    const/4 v0, 0x0

    iput-object v0, p0, Lgb/a$a;->d:[B

    iput-object v0, p0, Lgb/a$a;->a:Leb/s0;

    return-void
.end method

.method public final flush()V
    .locals 0

    return-void
.end method

.method public final h(I)V
    .locals 0

    return-void
.end method

.method public final isClosed()Z
    .locals 1

    iget-boolean v0, p0, Lgb/a$a;->b:Z

    return v0
.end method
