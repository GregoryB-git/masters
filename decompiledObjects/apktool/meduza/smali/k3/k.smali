.class public final Lk3/k;
.super Lk3/x;
.source "SourceFile"


# instance fields
.field public a:Lqb/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lqb/a<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public b:Lm3/c;

.field public c:Lqb/a;

.field public d:Lr3/a0;

.field public e:Lqb/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lqb/a<",
            "Lr3/t;",
            ">;"
        }
    .end annotation
.end field

.field public f:Lqb/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lqb/a<",
            "Lk3/w;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-direct/range {p0 .. p0}, Lk3/x;-><init>()V

    .line 6
    .line 7
    .line 8
    sget-object v2, Lk3/o$a;->a:Lk3/o;

    .line 9
    .line 10
    invoke-static {v2}, Lm3/a;->a(Lm3/b;)Lqb/a;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iput-object v2, v0, Lk3/k;->a:Lqb/a;

    .line 15
    .line 16
    new-instance v2, Lm3/c;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-direct {v2, v1}, Lm3/c;-><init>(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iput-object v2, v0, Lk3/k;->b:Lm3/c;

    .line 24
    .line 25
    sget-object v4, Lt3/b$a;->a:Lt3/b;

    .line 26
    .line 27
    sget-object v1, Lt3/c$a;->a:Lt3/c;

    .line 28
    .line 29
    new-instance v3, Ll3/j;

    .line 30
    .line 31
    invoke-direct {v3, v2, v4, v1}, Ll3/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    new-instance v5, Ll3/l;

    .line 35
    .line 36
    invoke-direct {v5, v2, v3}, Ll3/l;-><init>(Lm3/c;Ll3/j;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v5}, Lm3/a;->a(Lm3/b;)Lqb/a;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iput-object v2, v0, Lk3/k;->c:Lqb/a;

    .line 44
    .line 45
    iget-object v2, v0, Lk3/k;->b:Lm3/c;

    .line 46
    .line 47
    sget-object v3, Lr3/f$a;->a:Lr3/f;

    .line 48
    .line 49
    sget-object v5, Lr3/g$a;->a:Lr3/g;

    .line 50
    .line 51
    new-instance v6, Lr3/a0;

    .line 52
    .line 53
    invoke-direct {v6, v2, v3, v5}, Lr3/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iput-object v6, v0, Lk3/k;->d:Lr3/a0;

    .line 57
    .line 58
    new-instance v3, Lp3/e;

    .line 59
    .line 60
    const/4 v5, 0x1

    .line 61
    invoke-direct {v3, v2, v5}, Lp3/e;-><init>(Lqb/a;I)V

    .line 62
    .line 63
    .line 64
    invoke-static {v3}, Lm3/a;->a(Lm3/b;)Lqb/a;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    iget-object v3, v0, Lk3/k;->d:Lr3/a0;

    .line 69
    .line 70
    new-instance v5, Lr3/u;

    .line 71
    .line 72
    invoke-direct {v5, v3, v2}, Lr3/u;-><init>(Lqb/a;Lqb/a;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v5}, Lm3/a;->a(Lm3/b;)Lqb/a;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    iput-object v2, v0, Lk3/k;->e:Lqb/a;

    .line 80
    .line 81
    new-instance v8, Lp3/e;

    .line 82
    .line 83
    const/4 v3, 0x0

    .line 84
    invoke-direct {v8, v4, v3}, Lp3/e;-><init>(Lqb/a;I)V

    .line 85
    .line 86
    .line 87
    iget-object v3, v0, Lk3/k;->b:Lm3/c;

    .line 88
    .line 89
    new-instance v14, Lp3/f;

    .line 90
    .line 91
    const/4 v10, 0x0

    .line 92
    move-object v5, v14

    .line 93
    move-object v6, v3

    .line 94
    move-object v7, v2

    .line 95
    move-object v9, v1

    .line 96
    invoke-direct/range {v5 .. v10}, Lp3/f;-><init>(Lqb/a;Lqb/a;Lqb/a;Lqb/a;I)V

    .line 97
    .line 98
    .line 99
    iget-object v5, v0, Lk3/k;->a:Lqb/a;

    .line 100
    .line 101
    iget-object v13, v0, Lk3/k;->c:Lqb/a;

    .line 102
    .line 103
    new-instance v15, Lk3/y;

    .line 104
    .line 105
    const/4 v12, 0x1

    .line 106
    move-object v6, v15

    .line 107
    move-object v7, v5

    .line 108
    move-object v8, v13

    .line 109
    move-object v9, v14

    .line 110
    move-object v10, v2

    .line 111
    move-object v11, v2

    .line 112
    invoke-direct/range {v6 .. v12}, Lk3/y;-><init>(Lqb/a;Lqb/a;Lqb/a;Lqb/a;Lqb/a;I)V

    .line 113
    .line 114
    .line 115
    new-instance v16, Lq3/l;

    .line 116
    .line 117
    move-object/from16 v6, v16

    .line 118
    .line 119
    move-object v7, v3

    .line 120
    move-object v9, v2

    .line 121
    move-object v10, v14

    .line 122
    move-object v11, v5

    .line 123
    move-object v12, v2

    .line 124
    move-object v13, v2

    .line 125
    invoke-direct/range {v6 .. v13}, Lq3/l;-><init>(Lqb/a;Lqb/a;Lqb/a;Lp3/f;Lqb/a;Lqb/a;Lqb/a;)V

    .line 126
    .line 127
    .line 128
    new-instance v8, Lx0/f0;

    .line 129
    .line 130
    invoke-direct {v8, v5, v2, v14, v2}, Lx0/f0;-><init>(Lqb/a;Lqb/a;Lp3/f;Lqb/a;)V

    .line 131
    .line 132
    .line 133
    new-instance v2, Lk3/y;

    .line 134
    .line 135
    const/4 v9, 0x0

    .line 136
    move-object v3, v2

    .line 137
    move-object v5, v1

    .line 138
    move-object v6, v15

    .line 139
    move-object/from16 v7, v16

    .line 140
    .line 141
    invoke-direct/range {v3 .. v9}, Lk3/y;-><init>(Lqb/a;Lqb/a;Lqb/a;Lqb/a;Lqb/a;I)V

    .line 142
    .line 143
    .line 144
    invoke-static {v2}, Lm3/a;->a(Lm3/b;)Lqb/a;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    iput-object v1, v0, Lk3/k;->f:Lqb/a;

    .line 149
    .line 150
    return-void

    .line 151
    :cond_0
    new-instance v1, Ljava/lang/NullPointerException;

    .line 152
    .line 153
    const-string v2, "instance cannot be null"

    .line 154
    .line 155
    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw v1
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
