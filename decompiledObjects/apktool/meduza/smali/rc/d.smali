.class public final Lrc/d;
.super Lwb/i;
.source "SourceFile"

# interfaces
.implements Ldc/p;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lwb/i;",
        "Ldc/p<",
        "Lnc/d0;",
        "Lub/e<",
        "-",
        "Lrb/h;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lwb/e;
    c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2"
    f = "ChannelFlow.kt"
    l = {
        0x7b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lqc/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lqc/f<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic d:Lrc/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lrc/f<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lub/e;Lqc/f;Lrc/f;)V
    .locals 0

    iput-object p2, p0, Lrc/d;->c:Lqc/f;

    iput-object p3, p0, Lrc/d;->d:Lrc/f;

    const/4 p2, 0x2

    invoke-direct {p0, p2, p1}, Lwb/i;-><init>(ILub/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lub/e;)Lub/e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lub/e<",
            "*>;)",
            "Lub/e<",
            "Lrb/h;",
            ">;"
        }
    .end annotation

    new-instance v0, Lrc/d;

    iget-object v1, p0, Lrc/d;->c:Lqc/f;

    iget-object v2, p0, Lrc/d;->d:Lrc/f;

    invoke-direct {v0, p2, v1, v2}, Lrc/d;-><init>(Lub/e;Lqc/f;Lrc/f;)V

    iput-object p1, v0, Lrc/d;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnc/d0;

    check-cast p2, Lub/e;

    invoke-virtual {p0, p1, p2}, Lrc/d;->create(Ljava/lang/Object;Lub/e;)Lub/e;

    move-result-object p1

    check-cast p1, Lrc/d;

    sget-object p2, Lrb/h;->a:Lrb/h;

    invoke-virtual {p1, p2}, Lrc/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, Lvb/a;->a:Lvb/a;

    .line 2
    .line 3
    iget v1, p0, Lrc/d;->a:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lrc/d;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Lnc/d0;

    .line 28
    .line 29
    iget-object v1, p0, Lrc/d;->c:Lqc/f;

    .line 30
    .line 31
    iget-object v3, p0, Lrc/d;->d:Lrc/f;

    .line 32
    .line 33
    iget-object v4, v3, Lrc/f;->a:Lub/h;

    .line 34
    .line 35
    iget v5, v3, Lrc/f;->b:I

    .line 36
    .line 37
    const/4 v6, -0x3

    .line 38
    if-ne v5, v6, :cond_2

    .line 39
    .line 40
    const/4 v5, -0x2

    .line 41
    :cond_2
    iget-object v6, v3, Lrc/f;->c:Lpc/a;

    .line 42
    .line 43
    const/4 v7, 0x3

    .line 44
    new-instance v8, Lrc/e;

    .line 45
    .line 46
    const/4 v9, 0x0

    .line 47
    invoke-direct {v8, v3, v9}, Lrc/e;-><init>(Lrc/f;Lub/e;)V

    .line 48
    .line 49
    .line 50
    const/4 v3, 0x4

    .line 51
    invoke-static {v5, v6, v3}, Lpc/i;->a(ILpc/a;I)Lpc/b;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-static {p1, v4}, Lnc/y;->b(Lnc/d0;Lub/h;)Lub/h;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    new-instance v4, Lpc/p;

    .line 60
    .line 61
    invoke-direct {v4, p1, v3}, Lpc/p;-><init>(Lub/h;Lpc/b;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4, v7, v4, v8}, Lnc/a;->d0(ILnc/a;Ldc/p;)V

    .line 65
    .line 66
    .line 67
    iput v2, p0, Lrc/d;->a:I

    .line 68
    .line 69
    invoke-static {v1, v4, v2, p0}, Leb/y;->b(Lqc/f;Lpc/p;ZLub/e;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-ne p1, v0, :cond_3

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 77
    .line 78
    :goto_0
    if-ne p1, v0, :cond_4

    .line 79
    .line 80
    return-object v0

    .line 81
    :cond_4
    :goto_1
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 82
    .line 83
    return-object p1
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
.end method
