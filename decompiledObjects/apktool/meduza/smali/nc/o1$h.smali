.class public final synthetic Lnc/o1$h;
.super Lec/h;
.source "SourceFile"

# interfaces
.implements Ldc/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnc/o1;->getOnJoin()Luc/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lec/h;",
        "Ldc/q<",
        "Lnc/o1;",
        "Luc/f<",
        "*>;",
        "Ljava/lang/Object;",
        "Lrb/h;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lnc/o1$h;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnc/o1$h;

    invoke-direct {v0}, Lnc/o1$h;-><init>()V

    sput-object v0, Lnc/o1$h;->a:Lnc/o1$h;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-class v2, Lnc/o1;

    const/4 v1, 0x3

    const-string v3, "registerSelectForOnJoin"

    const-string v4, "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lec/h;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final f(Lqc/f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lnc/o1;

    .line 2
    .line 3
    check-cast p2, Luc/f;

    .line 4
    .line 5
    sget-object p3, Lnc/o1;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p1}, Lnc/o1;->F()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p3

    .line 11
    instance-of v0, p3, Lnc/f1;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    const/4 p3, 0x0

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {p1, p3}, Lnc/o1;->U(Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    if-ltz p3, :cond_0

    .line 22
    .line 23
    const/4 p3, 0x1

    .line 24
    :goto_0
    if-nez p3, :cond_2

    .line 25
    .line 26
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 27
    .line 28
    invoke-interface {p2, p1}, Luc/f;->g(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    new-instance p3, Lnc/o1$e;

    .line 33
    .line 34
    invoke-direct {p3, p1, p2}, Lnc/o1$e;-><init>(Lnc/o1;Luc/f;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p3}, Lnc/o1;->invokeOnCompletion(Ldc/l;)Lnc/t0;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-interface {p2, p1}, Luc/f;->b(Lnc/t0;)V

    .line 42
    .line 43
    .line 44
    :goto_1
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 45
    .line 46
    return-object p1
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
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
