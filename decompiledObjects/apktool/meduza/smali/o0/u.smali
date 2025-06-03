.class public final Lo0/u;
.super Lwb/i;
.source "SourceFile"

# interfaces
.implements Ldc/p;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lwb/i;",
        "Ldc/p<",
        "Lqc/f<",
        "Ljava/lang/Object;",
        ">;",
        "Lub/e<",
        "-",
        "Lrb/h;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lwb/e;
    c = "androidx.datastore.core.SingleProcessDataStore$data$1"
    f = "SingleProcessDataStore.kt"
    l = {
        0x75
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lo0/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo0/q<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo0/q;Lub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo0/q<",
            "Ljava/lang/Object;",
            ">;",
            "Lub/e<",
            "-",
            "Lo0/u;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lo0/u;->c:Lo0/q;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lwb/i;-><init>(ILub/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lub/e;)Lub/e;
    .locals 2
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

    new-instance v0, Lo0/u;

    iget-object v1, p0, Lo0/u;->c:Lo0/q;

    invoke-direct {v0, v1, p2}, Lo0/u;-><init>(Lo0/q;Lub/e;)V

    iput-object p1, v0, Lo0/u;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lqc/f;

    check-cast p2, Lub/e;

    invoke-virtual {p0, p1, p2}, Lo0/u;->create(Ljava/lang/Object;Lub/e;)Lub/e;

    move-result-object p1

    check-cast p1, Lo0/u;

    sget-object p2, Lrb/h;->a:Lrb/h;

    invoke-virtual {p1, p2}, Lo0/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Lvb/a;->a:Lvb/a;

    .line 2
    .line 3
    iget v1, p0, Lo0/u;->a:I

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
    goto :goto_3

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
    iget-object p1, p0, Lo0/u;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Lqc/f;

    .line 28
    .line 29
    iget-object v1, p0, Lo0/u;->c:Lo0/q;

    .line 30
    .line 31
    iget-object v1, v1, Lo0/q;->h:Lqc/t;

    .line 32
    .line 33
    invoke-virtual {v1}, Lqc/t;->b()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lo0/b0;

    .line 38
    .line 39
    instance-of v3, v1, Lo0/c;

    .line 40
    .line 41
    if-nez v3, :cond_2

    .line 42
    .line 43
    iget-object v3, p0, Lo0/u;->c:Lo0/q;

    .line 44
    .line 45
    iget-object v3, v3, Lo0/q;->j:Lo0/p;

    .line 46
    .line 47
    new-instance v4, Lo0/q$a$a;

    .line 48
    .line 49
    invoke-direct {v4, v1}, Lo0/q$a$a;-><init>(Lo0/b0;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v4}, Lo0/p;->a(Lo0/q$a;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    iget-object v3, p0, Lo0/u;->c:Lo0/q;

    .line 56
    .line 57
    iget-object v3, v3, Lo0/q;->h:Lqc/t;

    .line 58
    .line 59
    new-instance v4, Lo0/u$a;

    .line 60
    .line 61
    const/4 v5, 0x0

    .line 62
    invoke-direct {v4, v1, v5}, Lo0/u$a;-><init>(Lo0/b0;Lub/e;)V

    .line 63
    .line 64
    .line 65
    iput v2, p0, Lo0/u;->a:I

    .line 66
    .line 67
    instance-of v1, p1, Lqc/x;

    .line 68
    .line 69
    if-nez v1, :cond_7

    .line 70
    .line 71
    new-instance v1, Lo0/v;

    .line 72
    .line 73
    invoke-direct {v1, p1}, Lo0/v;-><init>(Lqc/f;)V

    .line 74
    .line 75
    .line 76
    new-instance p1, Lec/r;

    .line 77
    .line 78
    invoke-direct {p1}, Lec/r;-><init>()V

    .line 79
    .line 80
    .line 81
    new-instance v2, Lqc/l;

    .line 82
    .line 83
    invoke-direct {v2, p1, v1, v4}, Lqc/l;-><init>(Lec/r;Lqc/f;Ldc/p;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3, v2, p0}, Lqc/t;->collect(Lqc/f;Lub/e;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-ne p1, v0, :cond_3

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_3
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 94
    .line 95
    :goto_0
    if-ne p1, v0, :cond_4

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_4
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 99
    .line 100
    :goto_1
    if-ne p1, v0, :cond_5

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_5
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 104
    .line 105
    :goto_2
    if-ne p1, v0, :cond_6

    .line 106
    .line 107
    return-object v0

    .line 108
    :cond_6
    :goto_3
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 109
    .line 110
    return-object p1

    .line 111
    :cond_7
    check-cast p1, Lqc/x;

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    throw v5
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
