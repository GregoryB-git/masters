.class public final synthetic Lm9/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lm9/q;->a:I

    iput-object p1, p0, Lm9/q;->b:Ljava/lang/Object;

    iput-object p2, p0, Lm9/q;->c:Ljava/lang/Object;

    iput-object p3, p0, Lm9/q;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 5

    .line 1
    iget v0, p0, Lm9/q;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    iget-object v0, p0, Lm9/q;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lm9/v;

    .line 10
    .line 11
    iget-object v1, p0, Lm9/q;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 14
    .line 15
    iget-object v2, p0, Lm9/q;->d:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Leb/e;

    .line 25
    .line 26
    new-instance v3, Lm9/u;

    .line 27
    .line 28
    invoke-direct {v3, v0, v1}, Lm9/u;-><init>(Lm9/v;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lm9/v;->a()Leb/s0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p1, v3, v0}, Leb/e;->e(Leb/e$a;Leb/s0;)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x2

    .line 39
    invoke-virtual {p1, v0}, Leb/e;->c(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v2}, Leb/e;->d(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Leb/e;->b()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :goto_0
    iget-object v0, p0, Lm9/q;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Lxa/b;

    .line 52
    .line 53
    iget-object v1, p0, Lm9/q;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Lio/flutter/plugin/common/MethodChannel$Result;

    .line 56
    .line 57
    iget-object v2, p0, Lm9/q;->d:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, Ll3/l;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    const-string v4, "InAppReviewPlugin"

    .line 69
    .line 70
    if-eqz v3, :cond_0

    .line 71
    .line 72
    const-string v3, "onComplete: Successfully requested review flow"

    .line 73
    .line 74
    invoke-static {v4, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, Lj7/b;

    .line 82
    .line 83
    invoke-virtual {v0, v1, v2, p1}, Lxa/b;->b(Lio/flutter/plugin/common/MethodChannel$Result;Ll3/l;Lj7/b;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_0
    const-string p1, "onComplete: Unsuccessfully requested review flow"

    .line 88
    .line 89
    invoke-static {v4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    const/4 p1, 0x0

    .line 93
    const-string v0, "error"

    .line 94
    .line 95
    const-string v2, "In-App Review API unavailable"

    .line 96
    .line 97
    invoke-interface {v1, v0, v2, p1}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :goto_1
    return-void

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
