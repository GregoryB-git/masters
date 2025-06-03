.class public final Lka/x;
.super Lma/w;
.source "SourceFile"

# interfaces
.implements Lma/t0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lka/x$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lma/w<",
        "Lka/x;",
        "Lka/x$a;",
        ">;",
        "Lma/t0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lka/x;

.field private static volatile PARSER:Lma/b1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma/b1<",
            "Lka/x;",
            ">;"
        }
    .end annotation
.end field

.field public static final READ_TIME_FIELD_NUMBER:I = 0x3

.field public static final RESULT_FIELD_NUMBER:I = 0x1

.field public static final TRANSACTION_FIELD_NUMBER:I = 0x2


# instance fields
.field private bitField0_:I

.field private readTime_:Lma/n1;

.field private result_:Lka/a;

.field private transaction_:Lma/h;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lka/x;

    invoke-direct {v0}, Lka/x;-><init>()V

    sput-object v0, Lka/x;->DEFAULT_INSTANCE:Lka/x;

    const-class v1, Lka/x;

    invoke-static {v1, v0}, Lma/w;->D(Ljava/lang/Class;Lma/w;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lma/w;-><init>()V

    sget-object v0, Lma/h;->b:Lma/h$h;

    iput-object v0, p0, Lka/x;->transaction_:Lma/h;

    return-void
.end method

.method public static synthetic F()Lka/x;
    .locals 1

    sget-object v0, Lka/x;->DEFAULT_INSTANCE:Lka/x;

    return-object v0
.end method

.method public static G()Lka/x;
    .locals 1

    sget-object v0, Lka/x;->DEFAULT_INSTANCE:Lka/x;

    return-object v0
.end method


# virtual methods
.method public final H()Lka/a;
    .locals 1

    iget-object v0, p0, Lka/x;->result_:Lka/a;

    if-nez v0, :cond_0

    invoke-static {}, Lka/a;->H()Lka/a;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final t(Lma/w$f;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 12
    .line 13
    .line 14
    throw p1

    .line 15
    :pswitch_0
    sget-object p1, Lka/x;->PARSER:Lma/b1;

    .line 16
    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    const-class v0, Lka/x;

    .line 20
    .line 21
    monitor-enter v0

    .line 22
    :try_start_0
    sget-object p1, Lka/x;->PARSER:Lma/b1;

    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    new-instance p1, Lma/w$b;

    .line 27
    .line 28
    sget-object v1, Lka/x;->DEFAULT_INSTANCE:Lka/x;

    .line 29
    .line 30
    invoke-direct {p1, v1}, Lma/w$b;-><init>(Lma/w;)V

    .line 31
    .line 32
    .line 33
    sput-object p1, Lka/x;->PARSER:Lma/b1;

    .line 34
    .line 35
    :cond_0
    monitor-exit v0

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    throw p1

    .line 40
    :cond_1
    :goto_0
    return-object p1

    .line 41
    :pswitch_1
    sget-object p1, Lka/x;->DEFAULT_INSTANCE:Lka/x;

    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_2
    new-instance p1, Lka/x$a;

    .line 45
    .line 46
    invoke-direct {p1}, Lka/x$a;-><init>()V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    :pswitch_3
    new-instance p1, Lka/x;

    .line 51
    .line 52
    invoke-direct {p1}, Lka/x;-><init>()V

    .line 53
    .line 54
    .line 55
    return-object p1

    .line 56
    :pswitch_4
    const/4 p1, 0x4

    .line 57
    new-array p1, p1, [Ljava/lang/Object;

    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    const-string v2, "bitField0_"

    .line 61
    .line 62
    aput-object v2, p1, v1

    .line 63
    .line 64
    const-string v1, "result_"

    .line 65
    .line 66
    aput-object v1, p1, v0

    .line 67
    .line 68
    const/4 v0, 0x2

    .line 69
    const-string v1, "transaction_"

    .line 70
    .line 71
    aput-object v1, p1, v0

    .line 72
    .line 73
    const/4 v0, 0x3

    .line 74
    const-string v1, "readTime_"

    .line 75
    .line 76
    aput-object v1, p1, v0

    .line 77
    .line 78
    const-string v0, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\n\u0003\u1009\u0001"

    .line 79
    .line 80
    sget-object v1, Lka/x;->DEFAULT_INSTANCE:Lka/x;

    .line 81
    .line 82
    new-instance v2, Lma/f1;

    .line 83
    .line 84
    invoke-direct {v2, v1, v0, p1}, Lma/f1;-><init>(Lma/w;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    return-object v2

    .line 88
    :pswitch_5
    const/4 p1, 0x0

    .line 89
    return-object p1

    .line 90
    :pswitch_6
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    return-object p1

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
