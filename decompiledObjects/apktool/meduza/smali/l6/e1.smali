.class public abstract Ll6/e1;
.super Ll6/f;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public volatile a:Z

.field public final b:Ljava/util/concurrent/atomic/AtomicReference;

.field public final c:Lcom/google/android/gms/internal/base/zau;

.field public final d:Lj6/e;


# direct methods
.method public constructor <init>(Ll6/g;Lj6/e;)V
    .locals 1

    invoke-direct {p0, p1}, Ll6/f;-><init>(Ll6/g;)V

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ll6/e1;->b:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p1, Lcom/google/android/gms/internal/base/zau;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/base/zau;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Ll6/e1;->c:Lcom/google/android/gms/internal/base/zau;

    iput-object p2, p0, Ll6/e1;->d:Lj6/e;

    return-void
.end method


# virtual methods
.method public final a(Lj6/b;I)V
    .locals 2

    iget-object v0, p0, Ll6/e1;->b:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    move-object v0, p0

    check-cast v0, Ll6/v;

    iget-object v0, v0, Ll6/v;->f:Ll6/d;

    invoke-virtual {v0, p1, p2}, Ll6/d;->h(Lj6/b;I)V

    return-void
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ll6/e1;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ll6/c1;

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x1

    .line 12
    if-eq p1, v3, :cond_2

    .line 13
    .line 14
    const/4 p2, 0x2

    .line 15
    if-eq p1, p2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object p1, p0, Ll6/e1;->d:Lj6/e;

    .line 19
    .line 20
    invoke-virtual {p0}, Ll6/f;->getActivity()Landroid/app/Activity;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p1, p2}, Lj6/e;->b(Landroid/content/Context;)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    iget-object p1, p0, Ll6/e1;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 31
    .line 32
    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    move-object p1, p0

    .line 36
    check-cast p1, Ll6/v;

    .line 37
    .line 38
    iget-object p1, p1, Ll6/v;->f:Ll6/d;

    .line 39
    .line 40
    iget-object p1, p1, Ll6/d;->v:Lcom/google/android/gms/internal/base/zau;

    .line 41
    .line 42
    invoke-virtual {p1, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    if-eqz v0, :cond_6

    .line 51
    .line 52
    iget-object p2, v0, Ll6/c1;->b:Lj6/b;

    .line 53
    .line 54
    iget p2, p2, Lj6/b;->b:I

    .line 55
    .line 56
    const/16 p3, 0x12

    .line 57
    .line 58
    if-ne p2, p3, :cond_5

    .line 59
    .line 60
    if-ne p1, p3, :cond_5

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    const/4 p1, -0x1

    .line 64
    if-ne p2, p1, :cond_3

    .line 65
    .line 66
    iget-object p1, p0, Ll6/e1;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 67
    .line 68
    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    move-object p1, p0

    .line 72
    check-cast p1, Ll6/v;

    .line 73
    .line 74
    iget-object p1, p1, Ll6/v;->f:Ll6/d;

    .line 75
    .line 76
    iget-object p1, p1, Ll6/d;->v:Lcom/google/android/gms/internal/base/zau;

    .line 77
    .line 78
    invoke-virtual {p1, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_3
    if-nez p2, :cond_5

    .line 87
    .line 88
    if-eqz v0, :cond_6

    .line 89
    .line 90
    const/16 p1, 0xd

    .line 91
    .line 92
    if-eqz p3, :cond_4

    .line 93
    .line 94
    const-string p2, "<<ResolutionFailureErrorDetail>>"

    .line 95
    .line 96
    invoke-virtual {p3, p2, p1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    :cond_4
    new-instance p2, Lj6/b;

    .line 101
    .line 102
    iget-object p3, v0, Ll6/c1;->b:Lj6/b;

    .line 103
    .line 104
    invoke-virtual {p3}, Lj6/b;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p3

    .line 108
    invoke-direct {p2, v3, p1, v2, p3}, Lj6/b;-><init>(IILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    iget p1, v0, Ll6/c1;->a:I

    .line 112
    .line 113
    invoke-virtual {p0, p2, p1}, Ll6/e1;->a(Lj6/b;I)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_5
    :goto_0
    if-eqz v0, :cond_6

    .line 118
    .line 119
    iget-object p1, v0, Ll6/c1;->b:Lj6/b;

    .line 120
    .line 121
    iget p2, v0, Ll6/c1;->a:I

    .line 122
    .line 123
    invoke-virtual {p0, p1, p2}, Ll6/e1;->a(Lj6/b;I)V

    .line 124
    .line 125
    .line 126
    :cond_6
    :goto_1
    return-void
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

.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 2

    .line 1
    new-instance p1, Lj6/b;

    .line 2
    .line 3
    const/16 v0, 0xd

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {p1, v0, v1}, Lj6/b;-><init>(ILandroid/app/PendingIntent;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Ll6/e1;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ll6/c1;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const/4 v0, -0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget v0, v0, Ll6/c1;->a:I

    .line 22
    .line 23
    :goto_0
    invoke-virtual {p0, p1, v0}, Ll6/e1;->a(Lj6/b;I)V

    .line 24
    .line 25
    .line 26
    return-void
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

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Ll6/f;->onCreate(Landroid/os/Bundle;)V

    if-eqz p1, :cond_1

    iget-object v0, p0, Ll6/e1;->b:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    const-string v2, "resolving_error"

    invoke-virtual {p1, v2, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lj6/b;

    const-string v2, "failed_status"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    const-string v3, "failed_resolution"

    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v3

    check-cast v3, Landroid/app/PendingIntent;

    invoke-direct {v1, v2, v3}, Lj6/b;-><init>(ILandroid/app/PendingIntent;)V

    const/4 v2, -0x1

    const-string v3, "failed_client_id"

    invoke-virtual {p1, v3, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    new-instance v2, Ll6/c1;

    invoke-direct {v2, v1, p1}, Ll6/c1;-><init>(Lj6/b;I)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Ll6/f;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ll6/e1;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ll6/c1;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const/4 v1, 0x1

    .line 16
    const-string v2, "resolving_error"

    .line 17
    .line 18
    invoke-virtual {p1, v2, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    iget v1, v0, Ll6/c1;->a:I

    .line 22
    .line 23
    const-string v2, "failed_client_id"

    .line 24
    .line 25
    invoke-virtual {p1, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    iget-object v1, v0, Ll6/c1;->b:Lj6/b;

    .line 29
    .line 30
    iget v1, v1, Lj6/b;->b:I

    .line 31
    .line 32
    const-string v2, "failed_status"

    .line 33
    .line 34
    invoke-virtual {p1, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, v0, Ll6/c1;->b:Lj6/b;

    .line 38
    .line 39
    iget-object v0, v0, Lj6/b;->c:Landroid/app/PendingIntent;

    .line 40
    .line 41
    const-string v1, "failed_resolution"

    .line 42
    .line 43
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 44
    .line 45
    .line 46
    return-void
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

.method public onStart()V
    .locals 1

    invoke-super {p0}, Ll6/f;->onStart()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ll6/e1;->a:Z

    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-super {p0}, Ll6/f;->onStop()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ll6/e1;->a:Z

    return-void
.end method
