.class public final Lb/j$a;
.super Ld/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Lb/j;


# direct methods
.method public constructor <init>(Lb/j;)V
    .locals 0

    iput-object p1, p0, Lb/j$a;->h:Lb/j;

    invoke-direct {p0}, Ld/g;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILe/a;Ljava/lang/Object;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lb/j$a;->h:Lb/j;

    .line 2
    .line 3
    invoke-virtual {p2, v0, p3}, Le/a;->b(Lb/j;Ljava/lang/Object;)Le/a$a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance p2, Landroid/os/Handler;

    .line 10
    .line 11
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-direct {p2, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 16
    .line 17
    .line 18
    new-instance p3, Lb/h;

    .line 19
    .line 20
    invoke-direct {p3, p0, p1, v1}, Lb/h;-><init>(Lb/j$a;ILe/a$a;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-virtual {p2, v0, p3}, Le/a;->a(Lb/j;Ljava/lang/Object;)Landroid/content/Intent;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    const/4 p3, 0x0

    .line 32
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Landroid/os/Bundle;->getClassLoader()Ljava/lang/ClassLoader;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-nez v1, :cond_1

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {p2, v1}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    const-string v1, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"

    .line 56
    .line 57
    invoke-virtual {p2, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    invoke-virtual {p2, v1}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    move-object v7, p3

    .line 71
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    const-string v1, "androidx.activity.result.contract.action.REQUEST_PERMISSIONS"

    .line 76
    .line 77
    invoke-virtual {v1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p3

    .line 81
    if-eqz p3, :cond_4

    .line 82
    .line 83
    const-string p3, "androidx.activity.result.contract.extra.PERMISSIONS"

    .line 84
    .line 85
    invoke-virtual {p2, p3}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    if-nez p2, :cond_3

    .line 90
    .line 91
    const/4 p2, 0x0

    .line 92
    new-array p2, p2, [Ljava/lang/String;

    .line 93
    .line 94
    :cond_3
    invoke-static {v0, p2, p1}, Lu/b;->a(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_4
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p3

    .line 102
    const-string v1, "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"

    .line 103
    .line 104
    invoke-virtual {v1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result p3

    .line 108
    if-eqz p3, :cond_5

    .line 109
    .line 110
    const-string p3, "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"

    .line 111
    .line 112
    invoke-virtual {p2, p3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    check-cast p2, Ld/i;

    .line 117
    .line 118
    :try_start_0
    iget-object v1, p2, Ld/i;->a:Landroid/content/IntentSender;

    .line 119
    .line 120
    iget-object v3, p2, Ld/i;->b:Landroid/content/Intent;

    .line 121
    .line 122
    iget v4, p2, Ld/i;->c:I

    .line 123
    .line 124
    iget v5, p2, Ld/i;->d:I

    .line 125
    .line 126
    const/4 v6, 0x0

    .line 127
    sget p2, Lu/b;->a:I

    .line 128
    .line 129
    move v2, p1

    .line 130
    invoke-virtual/range {v0 .. v7}, Lb/j;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :catch_0
    move-exception p2

    .line 135
    new-instance p3, Landroid/os/Handler;

    .line 136
    .line 137
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-direct {p3, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 142
    .line 143
    .line 144
    new-instance v0, Lb/i;

    .line 145
    .line 146
    invoke-direct {v0, p0, p1, p2}, Lb/i;-><init>(Lb/j$a;ILandroid/content/IntentSender$SendIntentException;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p3, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 150
    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_5
    sget p3, Lu/b;->a:I

    .line 154
    .line 155
    invoke-virtual {v0, p2, p1, v7}, Lb/j;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V

    .line 156
    .line 157
    .line 158
    :goto_0
    return-void
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
