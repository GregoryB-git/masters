.class public final synthetic Lpa/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/x;


# instance fields
.field public final synthetic a:Lpa/b;

.field public final synthetic b:Lo2/l;

.field public final synthetic c:Ls5/c$a;


# direct methods
.method public synthetic constructor <init>(Lpa/b;Lo2/l;Ls5/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpa/c;->a:Lpa/b;

    iput-object p2, p0, Lpa/c;->b:Lo2/l;

    iput-object p3, p0, Lpa/c;->c:Ls5/c$a;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lpa/c;->a:Lpa/b;

    .line 2
    .line 3
    iget-object v1, p0, Lpa/c;->b:Lo2/l;

    .line 4
    .line 5
    iget-object v2, p0, Lpa/c;->c:Ls5/c$a;

    .line 6
    .line 7
    check-cast p1, Lo2/o;

    .line 8
    .line 9
    if-eqz p1, :cond_2

    .line 10
    .line 11
    :try_start_0
    iget-object v3, p1, Lo2/o;->b:Lo2/o$b;

    .line 12
    .line 13
    const-string v4, "getState(...)"

    .line 14
    .line 15
    invoke-static {v3, v4}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    sget-object v4, Lo2/o$b;->c:Lo2/o$b;

    .line 19
    .line 20
    if-ne v3, v4, :cond_0

    .line 21
    .line 22
    iget-object p1, p1, Lo2/o;->d:Landroidx/work/c;

    .line 23
    .line 24
    const-string v5, "getOutputData(...)"

    .line 25
    .line 26
    invoke-static {p1, v5}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v5, "filePath"

    .line 30
    .line 31
    invoke-virtual {p1, v5}, Landroidx/work/c;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, v0, Lpa/b;->m:Landroid/graphics/Bitmap;

    .line 40
    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    iget-object v5, v2, Ls5/c$a;->b:Ls5/c;

    .line 44
    .line 45
    iget v2, v2, Ls5/c$a;->a:I

    .line 46
    .line 47
    iget-object v5, v5, Ls5/c;->e:Landroid/os/Handler;

    .line 48
    .line 49
    const/4 v6, 0x1

    .line 50
    const/4 v7, -0x1

    .line 51
    invoke-virtual {v5, v6, v2, v7, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 56
    .line 57
    .line 58
    :cond_0
    if-eq v3, v4, :cond_1

    .line 59
    .line 60
    sget-object p1, Lo2/o$b;->f:Lo2/o$b;

    .line 61
    .line 62
    if-eq v3, p1, :cond_1

    .line 63
    .line 64
    sget-object p1, Lo2/o$b;->d:Lo2/o$b;

    .line 65
    .line 66
    if-ne v3, p1, :cond_2

    .line 67
    .line 68
    :cond_1
    iget-object p1, v1, Lo2/q;->a:Ljava/util/UUID;

    .line 69
    .line 70
    const-string v1, "getId(...)"

    .line 71
    .line 72
    invoke-static {p1, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iget-object v1, v0, Lpa/b;->q:Ljava/util/HashMap;

    .line 76
    .line 77
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, Lb1/x;

    .line 82
    .line 83
    if-eqz v1, :cond_2

    .line 84
    .line 85
    iget-object v0, v0, Lpa/b;->p:Lp2/k0;

    .line 86
    .line 87
    invoke-virtual {v0, p1}, Lp2/k0;->e(Ljava/util/UUID;)Lb1/u;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p1, v1}, Lb1/t;->removeObserver(Lb1/x;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :catch_0
    move-exception p1

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    .line 100
    .line 101
    const-string v1, "Image select error: "

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    const-string v0, "BetterPlayer"

    .line 114
    .line 115
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    :cond_2
    :goto_0
    return-void
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
