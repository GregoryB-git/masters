.class public final Laa/z$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Laa/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:[Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:[Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;

.field public final m:Ljava/lang/String;

.field public final n:Landroid/net/Uri;

.field public final o:Ljava/lang/String;

.field public final p:Ljava/lang/Integer;

.field public final q:Ljava/lang/Integer;

.field public final r:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Laa/s;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "gcm.n.title"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Laa/s;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iput-object v1, p0, Laa/z$a;->a:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Laa/s;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, p0, Laa/z$a;->b:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Laa/s;->f(Ljava/lang/String;)[Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x0

    .line 23
    const/4 v2, 0x0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    move-object v3, v1

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    array-length v3, v0

    .line 29
    new-array v3, v3, [Ljava/lang/String;

    .line 30
    .line 31
    move v4, v2

    .line 32
    :goto_0
    array-length v5, v0

    .line 33
    if-ge v4, v5, :cond_1

    .line 34
    .line 35
    aget-object v5, v0, v4

    .line 36
    .line 37
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    aput-object v5, v3, v4

    .line 42
    .line 43
    add-int/lit8 v4, v4, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    :goto_1
    iput-object v3, p0, Laa/z$a;->c:[Ljava/lang/String;

    .line 47
    .line 48
    const-string v0, "gcm.n.body"

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Laa/s;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    iput-object v3, p0, Laa/z$a;->d:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Laa/s;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    iput-object v3, p0, Laa/z$a;->e:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Laa/s;->f(Ljava/lang/String;)[Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-nez v0, :cond_2

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_2
    array-length v1, v0

    .line 70
    new-array v1, v1, [Ljava/lang/String;

    .line 71
    .line 72
    :goto_2
    array-length v3, v0

    .line 73
    if-ge v2, v3, :cond_3

    .line 74
    .line 75
    aget-object v3, v0, v2

    .line 76
    .line 77
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    aput-object v3, v1, v2

    .line 82
    .line 83
    add-int/lit8 v2, v2, 0x1

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    :goto_3
    iput-object v1, p0, Laa/z$a;->f:[Ljava/lang/String;

    .line 87
    .line 88
    const-string v0, "gcm.n.icon"

    .line 89
    .line 90
    invoke-virtual {p1, v0}, Laa/s;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iput-object v0, p0, Laa/z$a;->g:Ljava/lang/String;

    .line 95
    .line 96
    const-string v0, "gcm.n.sound2"

    .line 97
    .line 98
    invoke-virtual {p1, v0}, Laa/s;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_4

    .line 107
    .line 108
    const-string v0, "gcm.n.sound"

    .line 109
    .line 110
    invoke-virtual {p1, v0}, Laa/s;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    :cond_4
    iput-object v0, p0, Laa/z$a;->i:Ljava/lang/String;

    .line 115
    .line 116
    const-string v0, "gcm.n.tag"

    .line 117
    .line 118
    invoke-virtual {p1, v0}, Laa/s;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    iput-object v0, p0, Laa/z$a;->j:Ljava/lang/String;

    .line 123
    .line 124
    const-string v0, "gcm.n.color"

    .line 125
    .line 126
    invoke-virtual {p1, v0}, Laa/s;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iput-object v0, p0, Laa/z$a;->k:Ljava/lang/String;

    .line 131
    .line 132
    const-string v0, "gcm.n.click_action"

    .line 133
    .line 134
    invoke-virtual {p1, v0}, Laa/s;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    iput-object v0, p0, Laa/z$a;->l:Ljava/lang/String;

    .line 139
    .line 140
    const-string v0, "gcm.n.android_channel_id"

    .line 141
    .line 142
    invoke-virtual {p1, v0}, Laa/s;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    iput-object v0, p0, Laa/z$a;->m:Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {p1}, Laa/s;->e()Landroid/net/Uri;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    iput-object v0, p0, Laa/z$a;->n:Landroid/net/Uri;

    .line 153
    .line 154
    const-string v0, "gcm.n.image"

    .line 155
    .line 156
    invoke-virtual {p1, v0}, Laa/s;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    iput-object v0, p0, Laa/z$a;->h:Ljava/lang/String;

    .line 161
    .line 162
    const-string v0, "gcm.n.ticker"

    .line 163
    .line 164
    invoke-virtual {p1, v0}, Laa/s;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    iput-object v0, p0, Laa/z$a;->o:Ljava/lang/String;

    .line 169
    .line 170
    const-string v0, "gcm.n.notification_priority"

    .line 171
    .line 172
    invoke-virtual {p1, v0}, Laa/s;->b(Ljava/lang/String;)Ljava/lang/Integer;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    iput-object v0, p0, Laa/z$a;->p:Ljava/lang/Integer;

    .line 177
    .line 178
    const-string v0, "gcm.n.visibility"

    .line 179
    .line 180
    invoke-virtual {p1, v0}, Laa/s;->b(Ljava/lang/String;)Ljava/lang/Integer;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    iput-object v0, p0, Laa/z$a;->q:Ljava/lang/Integer;

    .line 185
    .line 186
    const-string v0, "gcm.n.notification_count"

    .line 187
    .line 188
    invoke-virtual {p1, v0}, Laa/s;->b(Ljava/lang/String;)Ljava/lang/Integer;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    iput-object v0, p0, Laa/z$a;->r:Ljava/lang/Integer;

    .line 193
    .line 194
    const-string v0, "gcm.n.sticky"

    .line 195
    .line 196
    invoke-virtual {p1, v0}, Laa/s;->a(Ljava/lang/String;)Z

    .line 197
    .line 198
    .line 199
    const-string v0, "gcm.n.local_only"

    .line 200
    .line 201
    invoke-virtual {p1, v0}, Laa/s;->a(Ljava/lang/String;)Z

    .line 202
    .line 203
    .line 204
    const-string v0, "gcm.n.default_sound"

    .line 205
    .line 206
    invoke-virtual {p1, v0}, Laa/s;->a(Ljava/lang/String;)Z

    .line 207
    .line 208
    .line 209
    const-string v0, "gcm.n.default_vibrate_timings"

    .line 210
    .line 211
    invoke-virtual {p1, v0}, Laa/s;->a(Ljava/lang/String;)Z

    .line 212
    .line 213
    .line 214
    const-string v0, "gcm.n.default_light_settings"

    .line 215
    .line 216
    invoke-virtual {p1, v0}, Laa/s;->a(Ljava/lang/String;)Z

    .line 217
    .line 218
    .line 219
    invoke-virtual {p1}, Laa/s;->h()Ljava/lang/Long;

    .line 220
    .line 221
    .line 222
    invoke-virtual {p1}, Laa/s;->d()[I

    .line 223
    .line 224
    .line 225
    invoke-virtual {p1}, Laa/s;->k()[J

    .line 226
    .line 227
    .line 228
    return-void
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
.end method
