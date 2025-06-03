.class public final Lo0/o;
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
    c = "androidx.datastore.core.SimpleActor$offer$2"
    f = "SimpleActor.kt"
    l = {
        0x7a,
        0x7a
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ldc/p;

.field public b:I

.field public final synthetic c:Lo0/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo0/p<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo0/p;Lub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo0/p<",
            "Ljava/lang/Object;",
            ">;",
            "Lub/e<",
            "-",
            "Lo0/o;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lo0/o;->c:Lo0/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lwb/i;-><init>(ILub/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lub/e;)Lub/e;
    .locals 1
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

    new-instance p1, Lo0/o;

    iget-object v0, p0, Lo0/o;->c:Lo0/p;

    invoke-direct {p1, v0, p2}, Lo0/o;-><init>(Lo0/p;Lub/e;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnc/d0;

    check-cast p2, Lub/e;

    invoke-virtual {p0, p1, p2}, Lo0/o;->create(Ljava/lang/Object;Lub/e;)Lub/e;

    move-result-object p1

    check-cast p1, Lo0/o;

    sget-object p2, Lrb/h;->a:Lrb/h;

    invoke-virtual {p1, p2}, Lo0/o;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Lvb/a;->a:Lvb/a;

    .line 2
    .line 3
    iget v1, p0, Lo0/o;->b:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x2

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    if-eq v1, v2, :cond_1

    .line 10
    .line 11
    if-ne v1, v3, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    move-object p1, p0

    .line 17
    goto :goto_2

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    iget-object v1, p0, Lo0/o;->a:Ldc/p;

    .line 27
    .line 28
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    move-object v4, v1

    .line 32
    move-object v1, p1

    .line 33
    move-object p1, p0

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    invoke-static {p1}, Lrb/f;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lo0/o;->c:Lo0/p;

    .line 39
    .line 40
    iget-object p1, p1, Lo0/p;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-lez p1, :cond_3

    .line 47
    .line 48
    move p1, v2

    .line 49
    goto :goto_0

    .line 50
    :cond_3
    const/4 p1, 0x0

    .line 51
    :goto_0
    if-eqz p1, :cond_7

    .line 52
    .line 53
    move-object p1, p0

    .line 54
    :cond_4
    iget-object v1, p1, Lo0/o;->c:Lo0/p;

    .line 55
    .line 56
    iget-object v1, v1, Lo0/p;->a:Lnc/d0;

    .line 57
    .line 58
    invoke-interface {v1}, Lnc/d0;->f()Lub/h;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-static {v1}, Lp2/m0;->C(Lub/h;)V

    .line 63
    .line 64
    .line 65
    iget-object v1, p1, Lo0/o;->c:Lo0/p;

    .line 66
    .line 67
    iget-object v4, v1, Lo0/p;->b:Ldc/p;

    .line 68
    .line 69
    iget-object v1, v1, Lo0/p;->c:Lpc/b;

    .line 70
    .line 71
    iput-object v4, p1, Lo0/o;->a:Ldc/p;

    .line 72
    .line 73
    iput v2, p1, Lo0/o;->b:I

    .line 74
    .line 75
    invoke-virtual {v1, p1}, Lpc/b;->C(Lub/e;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-ne v1, v0, :cond_5

    .line 80
    .line 81
    return-object v0

    .line 82
    :cond_5
    :goto_1
    const/4 v5, 0x0

    .line 83
    iput-object v5, p1, Lo0/o;->a:Ldc/p;

    .line 84
    .line 85
    iput v3, p1, Lo0/o;->b:I

    .line 86
    .line 87
    invoke-interface {v4, v1, p1}, Ldc/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    if-ne v1, v0, :cond_6

    .line 92
    .line 93
    return-object v0

    .line 94
    :cond_6
    :goto_2
    iget-object v1, p1, Lo0/o;->c:Lo0/p;

    .line 95
    .line 96
    iget-object v1, v1, Lo0/p;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-nez v1, :cond_4

    .line 103
    .line 104
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 105
    .line 106
    return-object p1

    .line 107
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 108
    .line 109
    const-string v0, "Check failed."

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw p1
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
