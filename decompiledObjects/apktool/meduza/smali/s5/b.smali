.class public final synthetic Ls5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Ls5/b;->a:I

    iput-object p1, p0, Ls5/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 7

    .line 1
    iget v0, p0, Ls5/b;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    goto :goto_2

    .line 9
    :pswitch_0
    iget-object v0, p0, Ls5/b;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ls5/c;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget v3, p1, Landroid/os/Message;->what:I

    .line 17
    .line 18
    if-eqz v3, :cond_1

    .line 19
    .line 20
    if-eq v3, v2, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    iget-object v1, v0, Ls5/c;->p:Lv3/f1;

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    iget-boolean v3, v0, Ls5/c;->q:Z

    .line 28
    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    iget v3, v0, Ls5/c;->r:I

    .line 32
    .line 33
    iget v4, p1, Landroid/os/Message;->arg1:I

    .line 34
    .line 35
    if-ne v3, v4, :cond_2

    .line 36
    .line 37
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, Landroid/graphics/Bitmap;

    .line 40
    .line 41
    invoke-virtual {v0, v1, p1}, Ls5/c;->c(Lv3/f1;Landroid/graphics/Bitmap;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iget-object p1, v0, Ls5/c;->p:Lv3/f1;

    .line 46
    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-virtual {v0, p1, v1}, Ls5/c;->c(Lv3/f1;Landroid/graphics/Bitmap;)V

    .line 51
    .line 52
    .line 53
    :cond_2
    :goto_0
    move v1, v2

    .line 54
    :goto_1
    return v1

    .line 55
    :goto_2
    iget-object p1, p0, Ls5/b;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, Lv5/l;

    .line 58
    .line 59
    iget-object v0, p1, Lv5/l;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_5

    .line 70
    .line 71
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    check-cast v3, Lv5/l$c;

    .line 76
    .line 77
    iget-object v4, p1, Lv5/l;->c:Lv5/l$b;

    .line 78
    .line 79
    iget-boolean v5, v3, Lv5/l$c;->d:Z

    .line 80
    .line 81
    if-nez v5, :cond_4

    .line 82
    .line 83
    iget-boolean v5, v3, Lv5/l$c;->c:Z

    .line 84
    .line 85
    if-eqz v5, :cond_4

    .line 86
    .line 87
    iget-object v5, v3, Lv5/l$c;->b:Lv5/h$a;

    .line 88
    .line 89
    invoke-virtual {v5}, Lv5/h$a;->b()Lv5/h;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    new-instance v6, Lv5/h$a;

    .line 94
    .line 95
    invoke-direct {v6}, Lv5/h$a;-><init>()V

    .line 96
    .line 97
    .line 98
    iput-object v6, v3, Lv5/l$c;->b:Lv5/h$a;

    .line 99
    .line 100
    iput-boolean v1, v3, Lv5/l$c;->c:Z

    .line 101
    .line 102
    iget-object v3, v3, Lv5/l$c;->a:Ljava/lang/Object;

    .line 103
    .line 104
    invoke-interface {v4, v3, v5}, Lv5/l$b;->d(Ljava/lang/Object;Lv5/h;)V

    .line 105
    .line 106
    .line 107
    :cond_4
    iget-object v3, p1, Lv5/l;->b:Lv5/k;

    .line 108
    .line 109
    invoke-interface {v3}, Lv5/k;->a()Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-eqz v3, :cond_3

    .line 114
    .line 115
    :cond_5
    return v2

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
