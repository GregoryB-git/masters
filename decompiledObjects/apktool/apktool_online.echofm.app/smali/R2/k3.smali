.class public final LR2/k3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic o:LR2/W5;

.field public final synthetic p:Landroid/os/Bundle;

.field public final synthetic q:LR2/R2;


# direct methods
.method public constructor <init>(LR2/R2;LR2/W5;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/k3;->q:LR2/R2;

    .line 2
    .line 3
    iput-object p2, p0, LR2/k3;->o:LR2/W5;

    .line 4
    .line 5
    iput-object p3, p0, LR2/k3;->p:Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, LR2/k3;->q:LR2/R2;

    .line 4
    .line 5
    invoke-static {v0}, LR2/R2;->o(LR2/R2;)LR2/D5;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, LR2/D5;->o0()V

    .line 10
    .line 11
    .line 12
    iget-object v0, v1, LR2/k3;->q:LR2/R2;

    .line 13
    .line 14
    invoke-static {v0}, LR2/R2;->o(LR2/R2;)LR2/D5;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-object v3, v1, LR2/k3;->o:LR2/W5;

    .line 19
    .line 20
    iget-object v0, v1, LR2/k3;->p:Landroid/os/Bundle;

    .line 21
    .line 22
    invoke-virtual {v2}, LR2/D5;->e()LR2/G2;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v4}, LR2/m3;->n()V

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lcom/google/android/gms/internal/measurement/g7;->a()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_4

    .line 34
    .line 35
    invoke-virtual {v2}, LR2/D5;->c0()LR2/g;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    iget-object v5, v3, LR2/W5;->o:Ljava/lang/String;

    .line 40
    .line 41
    sget-object v6, LR2/K;->L0:LR2/P1;

    .line 42
    .line 43
    invoke-virtual {v4, v5, v6}, LR2/g;->B(Ljava/lang/String;LR2/P1;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_4

    .line 48
    .line 49
    iget-object v4, v3, LR2/W5;->o:Ljava/lang/String;

    .line 50
    .line 51
    if-nez v4, :cond_0

    .line 52
    .line 53
    goto/16 :goto_3

    .line 54
    .line 55
    :cond_0
    if-eqz v0, :cond_3

    .line 56
    .line 57
    const-string v4, "uriSources"

    .line 58
    .line 59
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    const-string v5, "uriTimestamps"

    .line 64
    .line 65
    invoke-virtual {v0, v5}, Landroid/os/BaseBundle;->getLongArray(Ljava/lang/String;)[J

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    if-eqz v4, :cond_3

    .line 70
    .line 71
    if-eqz v5, :cond_2

    .line 72
    .line 73
    array-length v0, v5

    .line 74
    array-length v6, v4

    .line 75
    if-eq v0, v6, :cond_1

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_1
    const/4 v6, 0x0

    .line 79
    move v7, v6

    .line 80
    :goto_0
    array-length v0, v4

    .line 81
    if-ge v7, v0, :cond_3

    .line 82
    .line 83
    invoke-virtual {v2}, LR2/D5;->e0()LR2/p;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    iget-object v9, v3, LR2/W5;->o:Ljava/lang/String;

    .line 88
    .line 89
    aget v0, v4, v7

    .line 90
    .line 91
    aget-wide v10, v5, v7

    .line 92
    .line 93
    invoke-static {v9}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v8}, LR2/m3;->n()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v8}, LR2/C5;->u()V

    .line 100
    .line 101
    .line 102
    :try_start_0
    invoke-virtual {v8}, LR2/p;->B()Landroid/database/sqlite/SQLiteDatabase;

    .line 103
    .line 104
    .line 105
    move-result-object v12

    .line 106
    const-string v13, "trigger_uris"

    .line 107
    .line 108
    const-string v14, "app_id=? and source=? and timestamp_millis<=?"

    .line 109
    .line 110
    const/4 v15, 0x3

    .line 111
    new-array v15, v15, [Ljava/lang/String;

    .line 112
    .line 113
    aput-object v9, v15, v6

    .line 114
    .line 115
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v16

    .line 119
    const/16 v17, 0x1

    .line 120
    .line 121
    aput-object v16, v15, v17

    .line 122
    .line 123
    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v16

    .line 127
    const/16 v17, 0x2

    .line 128
    .line 129
    aput-object v16, v15, v17

    .line 130
    .line 131
    invoke-virtual {v12, v13, v14, v15}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    move-result v12

    .line 135
    invoke-virtual {v8}, LR2/m3;->j()LR2/Y1;

    .line 136
    .line 137
    .line 138
    move-result-object v13

    .line 139
    invoke-virtual {v13}, LR2/Y1;->K()LR2/a2;

    .line 140
    .line 141
    .line 142
    move-result-object v13

    .line 143
    new-instance v14, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    const-string v15, "Pruned "

    .line 146
    .line 147
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v12, " trigger URIs. appId, source, timestamp"

    .line 154
    .line 155
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v12

    .line 162
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 167
    .line 168
    .line 169
    move-result-object v10

    .line 170
    invoke-virtual {v13, v12, v9, v0, v10}, LR2/a2;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :catch_0
    move-exception v0

    .line 175
    invoke-virtual {v8}, LR2/m3;->j()LR2/Y1;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    invoke-virtual {v8}, LR2/Y1;->G()LR2/a2;

    .line 180
    .line 181
    .line 182
    move-result-object v8

    .line 183
    const-string v10, "Error pruning trigger URIs. appId"

    .line 184
    .line 185
    invoke-static {v9}, LR2/Y1;->v(Ljava/lang/String;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    invoke-virtual {v8, v10, v9, v0}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    :goto_1
    add-int/lit8 v7, v7, 0x1

    .line 193
    .line 194
    goto :goto_0

    .line 195
    :cond_2
    :goto_2
    invoke-virtual {v2}, LR2/D5;->j()LR2/Y1;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    const-string v4, "Uri sources and timestamps do not match"

    .line 204
    .line 205
    invoke-virtual {v0, v4}, LR2/a2;->a(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    :cond_3
    invoke-virtual {v2}, LR2/D5;->e0()LR2/p;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    iget-object v2, v3, LR2/W5;->o:Ljava/lang/String;

    .line 213
    .line 214
    invoke-virtual {v0, v2}, LR2/p;->K0(Ljava/lang/String;)Ljava/util/List;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    return-object v0

    .line 219
    :cond_4
    :goto_3
    new-instance v0, Ljava/util/ArrayList;

    .line 220
    .line 221
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 222
    .line 223
    .line 224
    return-object v0
.end method
