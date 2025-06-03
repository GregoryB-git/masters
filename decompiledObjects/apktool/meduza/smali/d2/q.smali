.class public Ld2/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/chromium/support_lib_boundary/ServiceWorkerClientBoundaryInterface;
.implements Lcom/google/android/gms/internal/measurement/zzv;
.implements Le7/c3;
.implements Le7/t6;
.implements Le7/f1;
.implements Lcom/google/android/gms/tasks/Continuation;
.implements Lh8/a;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Ld2/q;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ld2/q;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Le7/j2;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Ld2/q;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    iput-object p1, p0, Ld2/q;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 3
    iput p2, p0, Ld2/q;->a:I

    iput-object p1, p0, Ld2/q;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static g(Ljava/lang/String;)Ld2/q;
    .locals 2

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    invoke-static {p0}, Le7/e3;->e(C)Le7/g3;

    move-result-object p0

    goto :goto_1

    :cond_1
    :goto_0
    sget-object p0, Le7/g3;->b:Le7/g3;

    :goto_1
    new-instance v0, Ld2/q;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Ld2/q;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 8

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Ld2/q;->b:Ljava/lang/Object;

    .line 8
    .line 9
    move-object v0, p1

    .line 10
    check-cast v0, Le7/k3;

    .line 11
    .line 12
    invoke-virtual {v0}, Ld2/q;->zzb()Lv6/b;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lb/z;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 22
    .line 23
    .line 24
    move-result-wide v6

    .line 25
    const/4 v4, 0x1

    .line 26
    const/4 v5, 0x1

    .line 27
    const-string v1, "auto"

    .line 28
    .line 29
    move-object v2, p2

    .line 30
    move-object v3, p3

    .line 31
    invoke-virtual/range {v0 .. v7}, Le7/k3;->E(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    iget-object p1, p0, Ld2/q;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Le7/k3;

    .line 38
    .line 39
    iget-object p1, p1, Ld2/q;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Le7/j2;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "Unexpected call on client side"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1
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

.method public final c(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 7

    iget-object v0, p0, Ld2/q;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Le7/i6;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Le7/i6;->s(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    return-void
.end method

.method public final d(Landroid/os/Bundle;)V
    .locals 3

    iget-object v0, p0, Ld2/q;->b:Ljava/lang/Object;

    check-cast v0, Lw7/a;

    const-string v1, "clx"

    const-string v2, "_ae"

    invoke-interface {v0, v1, v2, p1}, Lw7/a;->b(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Ld2/q;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final f(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Ld2/q;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "="

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final getSupportedFeatures()[Ljava/lang/String;
    .locals 1

    const-string v0, "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final h()Le7/h;
    .locals 1

    iget-object v0, p0, Ld2/q;->b:Ljava/lang/Object;

    check-cast v0, Le7/j2;

    iget-object v0, v0, Le7/j2;->o:Le7/h;

    return-object v0
.end method

.method public final i()Le7/x0;
    .locals 1

    iget-object v0, p0, Ld2/q;->b:Ljava/lang/Object;

    check-cast v0, Le7/j2;

    iget-object v0, v0, Le7/j2;->u:Le7/x0;

    return-object v0
.end method

.method public final j()Le7/l1;
    .locals 1

    iget-object v0, p0, Ld2/q;->b:Ljava/lang/Object;

    check-cast v0, Le7/j2;

    invoke-virtual {v0}, Le7/j2;->j()Le7/l1;

    move-result-object v0

    return-object v0
.end method

.method public final k()Le7/r6;
    .locals 1

    iget-object v0, p0, Ld2/q;->b:Ljava/lang/Object;

    check-cast v0, Le7/j2;

    invoke-virtual {v0}, Le7/j2;->m()Le7/r6;

    move-result-object v0

    return-object v0
.end method

.method public l()V
    .locals 1

    iget-object v0, p0, Ld2/q;->b:Ljava/lang/Object;

    check-cast v0, Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->l()V

    return-void
.end method

.method public final shouldInterceptRequest(Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 1

    iget-object v0, p0, Ld2/q;->b:Ljava/lang/Object;

    check-cast v0, Lc2/f;

    invoke-virtual {v0, p1}, Lc2/f;->shouldInterceptRequest(Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;

    move-result-object p1

    return-object p1
.end method

.method public final then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Ld2/q;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lc8/m;

    .line 4
    .line 5
    iget-object v0, v0, Lc8/m;->d:Lb8/c1;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lb8/g;

    .line 21
    .line 22
    new-instance v0, Lc8/k1;

    .line 23
    .line 24
    invoke-interface {p1}, Lb8/g;->z()Lc8/i;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-interface {p1}, Lb8/g;->s()Lc8/i1;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object v2, p0, Ld2/q;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, Lc8/m;

    .line 35
    .line 36
    iget-object v2, v2, Lc8/m;->d:Lb8/c1;

    .line 37
    .line 38
    invoke-direct {v0, v1, p1, v2}, Lc8/k1;-><init>(Lc8/i;Lc8/i1;Lb8/c1;)V

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1

    .line 46
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    instance-of v0, p1, Lb8/p;

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    move-object v0, p1

    .line 55
    check-cast v0, Lb8/p;

    .line 56
    .line 57
    iget-object v1, p0, Ld2/q;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v1, Lc8/m;

    .line 60
    .line 61
    iget-object v1, v1, Lc8/m;->d:Lb8/c1;

    .line 62
    .line 63
    iput-object v1, v0, Lb8/p;->b:Lb8/f;

    .line 64
    .line 65
    :cond_2
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    return-object p1
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Ld2/q;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ld2/q;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
    .end packed-switch
.end method

.method public final zza()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Ld2/q;->b:Ljava/lang/Object;

    check-cast v0, Le7/j2;

    .line 1
    iget-object v0, v0, Le7/j2;->a:Landroid/content/Context;

    return-object v0
.end method

.method public final zza(Lcom/google/android/gms/internal/measurement/zzs;Ljava/lang/String;Ljava/util/List;ZZ)V
    .locals 3

    sget-object v0, Le7/c2;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq p1, v2, :cond_7

    if-eq p1, v1, :cond_4

    if-eq p1, v0, :cond_1

    const/4 p4, 0x4

    if-eq p1, p4, :cond_0

    iget-object p1, p0, Ld2/q;->b:Ljava/lang/Object;

    check-cast p1, Le7/w1;

    invoke-virtual {p1}, Ld2/q;->zzj()Le7/a1;

    move-result-object p1

    .line 2
    iget-object p1, p1, Le7/a1;->u:Le7/b1;

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Ld2/q;->b:Ljava/lang/Object;

    check-cast p1, Le7/w1;

    invoke-virtual {p1}, Ld2/q;->zzj()Le7/a1;

    move-result-object p1

    .line 4
    iget-object p1, p1, Le7/a1;->w:Le7/b1;

    goto :goto_0

    .line 5
    :cond_1
    iget-object p1, p0, Ld2/q;->b:Ljava/lang/Object;

    check-cast p1, Le7/w1;

    invoke-virtual {p1}, Ld2/q;->zzj()Le7/a1;

    move-result-object p1

    if-eqz p4, :cond_2

    .line 6
    iget-object p1, p1, Le7/a1;->s:Le7/b1;

    goto :goto_0

    :cond_2
    if-nez p5, :cond_3

    .line 7
    iget-object p1, p1, Le7/a1;->t:Le7/b1;

    goto :goto_0

    .line 8
    :cond_3
    iget-object p1, p1, Le7/a1;->r:Le7/b1;

    goto :goto_0

    .line 9
    :cond_4
    iget-object p1, p0, Ld2/q;->b:Ljava/lang/Object;

    check-cast p1, Le7/w1;

    invoke-virtual {p1}, Ld2/q;->zzj()Le7/a1;

    move-result-object p1

    if-eqz p4, :cond_5

    .line 10
    iget-object p1, p1, Le7/a1;->p:Le7/b1;

    goto :goto_0

    :cond_5
    if-nez p5, :cond_6

    .line 11
    iget-object p1, p1, Le7/a1;->q:Le7/b1;

    goto :goto_0

    .line 12
    :cond_6
    iget-object p1, p1, Le7/a1;->o:Le7/b1;

    goto :goto_0

    .line 13
    :cond_7
    iget-object p1, p0, Ld2/q;->b:Ljava/lang/Object;

    check-cast p1, Le7/w1;

    invoke-virtual {p1}, Ld2/q;->zzj()Le7/a1;

    move-result-object p1

    .line 14
    iget-object p1, p1, Le7/a1;->v:Le7/b1;

    .line 15
    :goto_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p4

    const/4 p5, 0x0

    if-eq p4, v2, :cond_a

    if-eq p4, v1, :cond_9

    if-eq p4, v0, :cond_8

    invoke-virtual {p1, p2}, Le7/b1;->b(Ljava/lang/String;)V

    return-void

    :cond_8
    invoke-interface {p3, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p5

    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p1, p4, p5, p3, p2}, Le7/b1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :cond_9
    invoke-interface {p3, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p1, p2, p4, p3}, Le7/b1;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_a
    invoke-interface {p3, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final zzb()Lv6/b;
    .locals 1

    iget-object v0, p0, Ld2/q;->b:Ljava/lang/Object;

    check-cast v0, Le7/j2;

    iget-object v0, v0, Le7/j2;->v:Lb/z;

    return-object v0
.end method

.method public final zzd()Lnc/g0;
    .locals 1

    iget-object v0, p0, Ld2/q;->b:Ljava/lang/Object;

    check-cast v0, Le7/j2;

    iget-object v0, v0, Le7/j2;->f:Lnc/g0;

    return-object v0
.end method

.method public final zzj()Le7/a1;
    .locals 1

    iget-object v0, p0, Ld2/q;->b:Ljava/lang/Object;

    check-cast v0, Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzj()Le7/a1;

    move-result-object v0

    return-object v0
.end method

.method public final zzl()Le7/e2;
    .locals 1

    iget-object v0, p0, Ld2/q;->b:Ljava/lang/Object;

    check-cast v0, Le7/j2;

    invoke-virtual {v0}, Le7/j2;->zzl()Le7/e2;

    move-result-object v0

    return-object v0
.end method
