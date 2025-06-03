.class public final Lk1/b;
.super Lec/j;
.source "SourceFile"

# interfaces
.implements Ldc/l;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lec/j;",
        "Ldc/l<",
        "Ljava/lang/Throwable;",
        "Lrb/h;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ls/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls/b<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic b:Lnc/j0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnc/j0<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ls/b;Lnc/j0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls/b<",
            "Ljava/lang/Object;",
            ">;",
            "Lnc/j0<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lk1/b;->a:Ls/b;

    iput-object p2, p0, Lk1/b;->b:Lnc/j0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lec/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz p1, :cond_3

    .line 7
    .line 8
    instance-of v3, p1, Ljava/util/concurrent/CancellationException;

    .line 9
    .line 10
    if-eqz v3, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, Lk1/b;->a:Ls/b;

    .line 13
    .line 14
    iput-boolean v2, p1, Ls/b;->d:Z

    .line 15
    .line 16
    iget-object v3, p1, Ls/b;->b:Ls/d;

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    iget-object v3, v3, Ls/d;->b:Ls/d$a;

    .line 21
    .line 22
    invoke-virtual {v3, v2}, Ls/a;->cancel(Z)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    move v1, v2

    .line 29
    :cond_0
    if-eqz v1, :cond_5

    .line 30
    .line 31
    iput-object v0, p1, Ls/b;->a:Ljava/lang/Object;

    .line 32
    .line 33
    iput-object v0, p1, Ls/b;->b:Ls/d;

    .line 34
    .line 35
    iput-object v0, p1, Ls/b;->c:Ls/e;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget-object v3, p0, Lk1/b;->a:Ls/b;

    .line 39
    .line 40
    iput-boolean v2, v3, Ls/b;->d:Z

    .line 41
    .line 42
    iget-object v4, v3, Ls/b;->b:Ls/d;

    .line 43
    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    iget-object v4, v4, Ls/d;->b:Ls/d$a;

    .line 47
    .line 48
    invoke-virtual {v4, p1}, Ls/a;->q(Ljava/lang/Throwable;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    move v1, v2

    .line 55
    :cond_2
    if-eqz v1, :cond_5

    .line 56
    .line 57
    iput-object v0, v3, Ls/b;->a:Ljava/lang/Object;

    .line 58
    .line 59
    iput-object v0, v3, Ls/b;->b:Ls/d;

    .line 60
    .line 61
    iput-object v0, v3, Ls/b;->c:Ls/e;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    iget-object p1, p0, Lk1/b;->a:Ls/b;

    .line 65
    .line 66
    iget-object v3, p0, Lk1/b;->b:Lnc/j0;

    .line 67
    .line 68
    invoke-interface {v3}, Lnc/j0;->getCompleted()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    iput-boolean v2, p1, Ls/b;->d:Z

    .line 73
    .line 74
    iget-object v4, p1, Ls/b;->b:Ls/d;

    .line 75
    .line 76
    if-eqz v4, :cond_4

    .line 77
    .line 78
    iget-object v4, v4, Ls/d;->b:Ls/d$a;

    .line 79
    .line 80
    invoke-virtual {v4, v3}, Ls/a;->p(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_4

    .line 85
    .line 86
    move v1, v2

    .line 87
    :cond_4
    if-eqz v1, :cond_5

    .line 88
    .line 89
    iput-object v0, p1, Ls/b;->a:Ljava/lang/Object;

    .line 90
    .line 91
    iput-object v0, p1, Ls/b;->b:Ls/d;

    .line 92
    .line 93
    iput-object v0, p1, Ls/b;->c:Ls/e;

    .line 94
    .line 95
    :cond_5
    :goto_0
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 96
    .line 97
    return-object p1
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
.end method
