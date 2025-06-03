.class public final Le7/l5;
.super Le7/h6;
.source "SourceFile"


# instance fields
.field public final e:Ljava/util/HashMap;

.field public final f:Le7/q1;

.field public final o:Le7/q1;

.field public final p:Le7/q1;

.field public final q:Le7/q1;

.field public final r:Le7/q1;

.field public final s:Le7/q1;


# direct methods
.method public constructor <init>(Le7/i6;)V
    .locals 4

    invoke-direct {p0, p1}, Le7/h6;-><init>(Le7/i6;)V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Le7/l5;->e:Ljava/util/HashMap;

    new-instance p1, Le7/q1;

    invoke-virtual {p0}, Ld2/q;->j()Le7/l1;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "last_delete_stale"

    const-wide/16 v2, 0x0

    invoke-direct {p1, v0, v1, v2, v3}, Le7/q1;-><init>(Le7/l1;Ljava/lang/String;J)V

    iput-object p1, p0, Le7/l5;->f:Le7/q1;

    new-instance p1, Le7/q1;

    invoke-virtual {p0}, Ld2/q;->j()Le7/l1;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "last_delete_stale_batch"

    invoke-direct {p1, v0, v1, v2, v3}, Le7/q1;-><init>(Le7/l1;Ljava/lang/String;J)V

    iput-object p1, p0, Le7/l5;->o:Le7/q1;

    new-instance p1, Le7/q1;

    invoke-virtual {p0}, Ld2/q;->j()Le7/l1;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "backoff"

    invoke-direct {p1, v0, v1, v2, v3}, Le7/q1;-><init>(Le7/l1;Ljava/lang/String;J)V

    iput-object p1, p0, Le7/l5;->p:Le7/q1;

    new-instance p1, Le7/q1;

    invoke-virtual {p0}, Ld2/q;->j()Le7/l1;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "last_upload"

    invoke-direct {p1, v0, v1, v2, v3}, Le7/q1;-><init>(Le7/l1;Ljava/lang/String;J)V

    iput-object p1, p0, Le7/l5;->q:Le7/q1;

    new-instance p1, Le7/q1;

    invoke-virtual {p0}, Ld2/q;->j()Le7/l1;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "last_upload_attempt"

    invoke-direct {p1, v0, v1, v2, v3}, Le7/q1;-><init>(Le7/l1;Ljava/lang/String;J)V

    iput-object p1, p0, Le7/l5;->r:Le7/q1;

    new-instance p1, Le7/q1;

    invoke-virtual {p0}, Ld2/q;->j()Le7/l1;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "midnight_offset"

    invoke-direct {p1, v0, v1, v2, v3}, Le7/q1;-><init>(Le7/l1;Ljava/lang/String;J)V

    iput-object p1, p0, Le7/l5;->s:Le7/q1;

    return-void
.end method


# virtual methods
.method public final r()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final s(Ljava/lang/String;)Landroid/util/Pair;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-virtual {p0}, Ld2/q;->l()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ld2/q;->zzb()Lv6/b;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lb/z;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    iget-object v3, p0, Le7/l5;->e:Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-virtual {v3, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Le7/k5;

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    iget-wide v4, v3, Le7/k5;->c:J

    .line 30
    .line 31
    cmp-long v4, v1, v4

    .line 32
    .line 33
    if-gez v4, :cond_0

    .line 34
    .line 35
    new-instance p1, Landroid/util/Pair;

    .line 36
    .line 37
    iget-object v0, v3, Le7/k5;->a:Ljava/lang/String;

    .line 38
    .line 39
    iget-boolean v1, v3, Le7/k5;->b:Z

    .line 40
    .line 41
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-direct {p1, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_0
    invoke-virtual {p0}, Ld2/q;->h()Le7/h;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    sget-object v5, Le7/h0;->b:Le7/m0;

    .line 57
    .line 58
    invoke-virtual {v4, p1, v5}, Le7/h;->s(Ljava/lang/String;Le7/m0;)J

    .line 59
    .line 60
    .line 61
    move-result-wide v4

    .line 62
    add-long/2addr v4, v1

    .line 63
    const/4 v6, 0x0

    .line 64
    :try_start_0
    invoke-virtual {p0}, Ld2/q;->zza()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    invoke-static {v7}, Ly5/a;->a(Landroid/content/Context;)Ly5/a$a;

    .line 69
    .line 70
    .line 71
    move-result-object v6
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    goto :goto_0

    .line 73
    :catch_0
    move-exception v1

    .line 74
    goto :goto_1

    .line 75
    :catch_1
    if-eqz v3, :cond_1

    .line 76
    .line 77
    :try_start_1
    iget-wide v7, v3, Le7/k5;->c:J

    .line 78
    .line 79
    invoke-virtual {p0}, Ld2/q;->h()Le7/h;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    sget-object v10, Le7/h0;->c:Le7/m0;

    .line 84
    .line 85
    invoke-virtual {v9, p1, v10}, Le7/h;->s(Ljava/lang/String;Le7/m0;)J

    .line 86
    .line 87
    .line 88
    move-result-wide v9

    .line 89
    add-long/2addr v7, v9

    .line 90
    cmp-long v1, v1, v7

    .line 91
    .line 92
    if-gez v1, :cond_1

    .line 93
    .line 94
    new-instance v1, Landroid/util/Pair;

    .line 95
    .line 96
    iget-object v2, v3, Le7/k5;->a:Ljava/lang/String;

    .line 97
    .line 98
    iget-boolean v3, v3, Le7/k5;->b:Z

    .line 99
    .line 100
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-direct {v1, v2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    return-object v1

    .line 108
    :cond_1
    :goto_0
    if-nez v6, :cond_2

    .line 109
    .line 110
    new-instance v1, Landroid/util/Pair;

    .line 111
    .line 112
    const-string v2, "00000000-0000-0000-0000-000000000000"

    .line 113
    .line 114
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 115
    .line 116
    invoke-direct {v1, v2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    return-object v1

    .line 120
    :cond_2
    iget-object v1, v6, Ly5/a$a;->a:Ljava/lang/String;

    .line 121
    .line 122
    if-eqz v1, :cond_3

    .line 123
    .line 124
    new-instance v2, Le7/k5;

    .line 125
    .line 126
    iget-boolean v3, v6, Ly5/a$a;->b:Z

    .line 127
    .line 128
    invoke-direct {v2, v4, v5, v1, v3}, Le7/k5;-><init>(JLjava/lang/String;Z)V

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_3
    new-instance v2, Le7/k5;

    .line 133
    .line 134
    iget-boolean v1, v6, Ly5/a$a;->b:Z

    .line 135
    .line 136
    invoke-direct {v2, v4, v5, v0, v1}, Le7/k5;-><init>(JLjava/lang/String;Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :goto_1
    invoke-virtual {p0}, Ld2/q;->zzj()Le7/a1;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    iget-object v2, v2, Le7/a1;->v:Le7/b1;

    .line 145
    .line 146
    const-string v3, "Unable to get advertising id"

    .line 147
    .line 148
    invoke-virtual {v2, v3, v1}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    new-instance v2, Le7/k5;

    .line 152
    .line 153
    const/4 v1, 0x0

    .line 154
    invoke-direct {v2, v4, v5, v0, v1}, Le7/k5;-><init>(JLjava/lang/String;Z)V

    .line 155
    .line 156
    .line 157
    :goto_2
    iget-object v0, p0, Le7/l5;->e:Ljava/util/HashMap;

    .line 158
    .line 159
    invoke-virtual {v0, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    new-instance p1, Landroid/util/Pair;

    .line 163
    .line 164
    iget-object v0, v2, Le7/k5;->a:Ljava/lang/String;

    .line 165
    .line 166
    iget-boolean v1, v2, Le7/k5;->b:Z

    .line 167
    .line 168
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-direct {p1, v0, v1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    return-object p1
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

.method public final t(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 5
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Ld2/q;->l()V

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Le7/l5;->s(Ljava/lang/String;)Landroid/util/Pair;

    move-result-object p1

    iget-object p1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string p1, "00000000-0000-0000-0000-000000000000"

    :goto_0
    invoke-static {}, Le7/r6;->B0()Ljava/security/MessageDigest;

    move-result-object p2

    if-nez p2, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    new-instance v4, Ljava/math/BigInteger;

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p1

    invoke-direct {v4, v1, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    aput-object v4, v2, v3

    const-string p1, "%032X"

    invoke-static {v0, p1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
