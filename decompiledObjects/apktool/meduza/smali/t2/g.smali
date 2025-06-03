.class public final Lt2/g;
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
    c = "androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1"
    f = "WorkConstraintsTracker.kt"
    l = {
        0x36
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lt2/e;

.field public final synthetic c:Lx2/s;

.field public final synthetic d:Lt2/d;


# direct methods
.method public constructor <init>(Lt2/e;Lx2/s;Lt2/d;Lub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt2/e;",
            "Lx2/s;",
            "Lt2/d;",
            "Lub/e<",
            "-",
            "Lt2/g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lt2/g;->b:Lt2/e;

    iput-object p2, p0, Lt2/g;->c:Lx2/s;

    iput-object p3, p0, Lt2/g;->d:Lt2/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lwb/i;-><init>(ILub/e;)V

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

    new-instance p1, Lt2/g;

    iget-object v0, p0, Lt2/g;->b:Lt2/e;

    iget-object v1, p0, Lt2/g;->c:Lx2/s;

    iget-object v2, p0, Lt2/g;->d:Lt2/d;

    invoke-direct {p1, v0, v1, v2, p2}, Lt2/g;-><init>(Lt2/e;Lx2/s;Lt2/d;Lub/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnc/d0;

    check-cast p2, Lub/e;

    invoke-virtual {p0, p1, p2}, Lt2/g;->create(Ljava/lang/Object;Lub/e;)Lub/e;

    move-result-object p1

    check-cast p1, Lt2/g;

    sget-object p2, Lrb/h;->a:Lrb/h;

    invoke-virtual {p1, p2}, Lt2/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lvb/a;->a:Lvb/a;

    .line 2
    .line 3
    iget v1, p0, Lt2/g;->a:I

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
    goto/16 :goto_3

    .line 14
    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 18
    .line 19
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1

    .line 23
    :cond_1
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lt2/g;->b:Lt2/e;

    .line 27
    .line 28
    iget-object v1, p0, Lt2/g;->c:Lx2/s;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    const-string v3, "spec"

    .line 34
    .line 35
    invoke-static {v1, v3}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p1, Lt2/e;->a:Ljava/util/List;

    .line 39
    .line 40
    new-instance v3, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_3

    .line 54
    .line 55
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    move-object v5, v4

    .line 60
    check-cast v5, Lu2/d;

    .line 61
    .line 62
    invoke-virtual {v5, v1}, Lu2/d;->b(Lx2/s;)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_2

    .line 67
    .line 68
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-static {v3}, Lsb/m;->j(Ljava/lang/Iterable;)I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-eqz v3, :cond_4

    .line 90
    .line 91
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    check-cast v3, Lu2/d;

    .line 96
    .line 97
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    new-instance v4, Lu2/c;

    .line 101
    .line 102
    const/4 v5, 0x0

    .line 103
    invoke-direct {v4, v3, v5}, Lu2/c;-><init>(Lu2/d;Lub/e;)V

    .line 104
    .line 105
    .line 106
    new-instance v3, Lqc/b;

    .line 107
    .line 108
    sget-object v5, Lub/i;->a:Lub/i;

    .line 109
    .line 110
    sget-object v6, Lpc/a;->a:Lpc/a;

    .line 111
    .line 112
    const/4 v7, -0x2

    .line 113
    invoke-direct {v3, v4, v5, v7, v6}, Lqc/b;-><init>(Ldc/p;Lub/h;ILpc/a;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_4
    invoke-static {p1}, Lsb/q;->u(Ljava/lang/Iterable;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    const/4 v1, 0x0

    .line 125
    new-array v1, v1, [Lqc/e;

    .line 126
    .line 127
    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    check-cast p1, [Lqc/e;

    .line 132
    .line 133
    new-instance v1, Lt2/f;

    .line 134
    .line 135
    invoke-direct {v1, p1}, Lt2/f;-><init>([Lqc/e;)V

    .line 136
    .line 137
    .line 138
    sget-object p1, Lqc/h;->a:Lqc/h$b;

    .line 139
    .line 140
    instance-of p1, v1, Lqc/s;

    .line 141
    .line 142
    if-eqz p1, :cond_5

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_5
    sget-object p1, Lqc/h;->a:Lqc/h$b;

    .line 146
    .line 147
    sget-object v3, Lqc/h;->b:Lqc/h$a;

    .line 148
    .line 149
    instance-of v4, v1, Lqc/d;

    .line 150
    .line 151
    if-eqz v4, :cond_6

    .line 152
    .line 153
    move-object v4, v1

    .line 154
    check-cast v4, Lqc/d;

    .line 155
    .line 156
    iget-object v5, v4, Lqc/d;->b:Ldc/l;

    .line 157
    .line 158
    if-ne v5, p1, :cond_6

    .line 159
    .line 160
    iget-object v4, v4, Lqc/d;->c:Ldc/p;

    .line 161
    .line 162
    if-ne v4, v3, :cond_6

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_6
    new-instance v4, Lqc/d;

    .line 166
    .line 167
    invoke-direct {v4, v1, p1, v3}, Lqc/d;-><init>(Lt2/f;Lqc/h$b;Lqc/h$a;)V

    .line 168
    .line 169
    .line 170
    move-object v1, v4

    .line 171
    :goto_2
    new-instance p1, Lt2/g$a;

    .line 172
    .line 173
    iget-object v3, p0, Lt2/g;->d:Lt2/d;

    .line 174
    .line 175
    iget-object v4, p0, Lt2/g;->c:Lx2/s;

    .line 176
    .line 177
    invoke-direct {p1, v3, v4}, Lt2/g$a;-><init>(Lt2/d;Lx2/s;)V

    .line 178
    .line 179
    .line 180
    iput v2, p0, Lt2/g;->a:I

    .line 181
    .line 182
    invoke-interface {v1, p1, p0}, Lqc/e;->collect(Lqc/f;Lub/e;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    if-ne p1, v0, :cond_7

    .line 187
    .line 188
    return-object v0

    .line 189
    :cond_7
    :goto_3
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 190
    .line 191
    return-object p1
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
