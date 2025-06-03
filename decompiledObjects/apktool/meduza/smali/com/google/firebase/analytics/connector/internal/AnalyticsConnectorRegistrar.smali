.class public Lcom/google/firebase/analytics/connector/internal/AnalyticsConnectorRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static lambda$getComponents$0(Ld8/c;)Lw7/a;
    .locals 6

    .line 1
    const-class v0, Lu7/f;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Ld8/c;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lu7/f;

    .line 8
    .line 9
    const-class v1, Landroid/content/Context;

    .line 10
    .line 11
    invoke-interface {p0, v1}, Ld8/c;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Landroid/content/Context;

    .line 16
    .line 17
    const-class v2, Lc9/d;

    .line 18
    .line 19
    invoke-interface {p0, v2}, Ld8/c;->get(Ljava/lang/Class;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Lc9/d;

    .line 24
    .line 25
    invoke-static {v0}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p0}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-static {v2}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    sget-object v2, Lw7/c;->c:Lw7/c;

    .line 42
    .line 43
    if-nez v2, :cond_2

    .line 44
    .line 45
    const-class v2, Lw7/c;

    .line 46
    .line 47
    monitor-enter v2

    .line 48
    :try_start_0
    sget-object v3, Lw7/c;->c:Lw7/c;

    .line 49
    .line 50
    if-nez v3, :cond_1

    .line 51
    .line 52
    new-instance v3, Landroid/os/Bundle;

    .line 53
    .line 54
    const/4 v4, 0x1

    .line 55
    invoke-direct {v3, v4}, Landroid/os/Bundle;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Lu7/f;->a()V

    .line 59
    .line 60
    .line 61
    iget-object v4, v0, Lu7/f;->b:Ljava/lang/String;

    .line 62
    .line 63
    const-string v5, "[DEFAULT]"

    .line 64
    .line 65
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_0

    .line 70
    .line 71
    new-instance v4, Lw7/e;

    .line 72
    .line 73
    invoke-direct {v4}, Lw7/e;-><init>()V

    .line 74
    .line 75
    .line 76
    new-instance v5, Lw7/d;

    .line 77
    .line 78
    invoke-direct {v5}, Lw7/d;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-interface {p0, v4, v5}, Lc9/d;->d(Ljava/util/concurrent/Executor;Lc9/b;)V

    .line 82
    .line 83
    .line 84
    const-string p0, "dataCollectionDefaultEnabled"

    .line 85
    .line 86
    invoke-virtual {v0}, Lu7/f;->k()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    invoke-virtual {v3, p0, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 91
    .line 92
    .line 93
    :cond_0
    new-instance p0, Lw7/c;

    .line 94
    .line 95
    const/4 v0, 0x0

    .line 96
    invoke-static {v1, v0, v0, v0, v3}, Lcom/google/android/gms/internal/measurement/zzed;->zza(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lcom/google/android/gms/internal/measurement/zzed;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzed;->zzb()Ld7/a;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-direct {p0, v0}, Lw7/c;-><init>(Ld7/a;)V

    .line 105
    .line 106
    .line 107
    sput-object p0, Lw7/c;->c:Lw7/c;

    .line 108
    .line 109
    :cond_1
    monitor-exit v2

    .line 110
    goto :goto_0

    .line 111
    :catchall_0
    move-exception p0

    .line 112
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    throw p0

    .line 114
    :cond_2
    :goto_0
    sget-object p0, Lw7/c;->c:Lw7/c;

    .line 115
    .line 116
    return-object p0
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


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ld8/b<",
            "*>;>;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [Ld8/b;

    .line 3
    .line 4
    const-class v2, Lw7/a;

    .line 5
    .line 6
    invoke-static {v2}, Ld8/b;->b(Ljava/lang/Class;)Ld8/b$a;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const-class v3, Lu7/f;

    .line 11
    .line 12
    invoke-static {v3}, Ld8/k;->d(Ljava/lang/Class;)Ld8/k;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v2, v3}, Ld8/b$a;->a(Ld8/k;)V

    .line 17
    .line 18
    .line 19
    const-class v3, Landroid/content/Context;

    .line 20
    .line 21
    invoke-static {v3}, Ld8/k;->d(Ljava/lang/Class;)Ld8/k;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v2, v3}, Ld8/b$a;->a(Ld8/k;)V

    .line 26
    .line 27
    .line 28
    const-class v3, Lc9/d;

    .line 29
    .line 30
    invoke-static {v3}, Ld8/k;->d(Ljava/lang/Class;)Ld8/k;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v2, v3}, Ld8/b$a;->a(Ld8/k;)V

    .line 35
    .line 36
    .line 37
    new-instance v3, Leb/y;

    .line 38
    .line 39
    invoke-direct {v3}, Leb/y;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v3, v2, Ld8/b$a;->f:Ld8/e;

    .line 43
    .line 44
    invoke-virtual {v2, v0}, Ld8/b$a;->c(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ld8/b$a;->b()Ld8/b;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const/4 v2, 0x0

    .line 52
    aput-object v0, v1, v2

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    const-string v2, "fire-analytics"

    .line 56
    .line 57
    const-string v3, "22.2.0"

    .line 58
    .line 59
    invoke-static {v2, v3}, Lca/e;->a(Ljava/lang/String;Ljava/lang/String;)Ld8/b;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    aput-object v2, v1, v0

    .line 64
    .line 65
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    return-object v0
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
