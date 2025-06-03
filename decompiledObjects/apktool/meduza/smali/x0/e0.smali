.class public final Lx0/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lx0/v;

.field public final b:Lx0/f0;

.field public final c:Lx0/i;

.field public d:Z

.field public e:I


# direct methods
.method public constructor <init>(Lx0/v;Lx0/f0;Ljava/lang/ClassLoader;Lx0/s;Landroid/os/Bundle;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lx0/e0;->d:Z

    const/4 v0, -0x1

    iput v0, p0, Lx0/e0;->e:I

    iput-object p1, p0, Lx0/e0;->a:Lx0/v;

    iput-object p2, p0, Lx0/e0;->b:Lx0/f0;

    const-string p1, "state"

    invoke-virtual {p5, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lx0/d0;

    .line 1
    iget-object p2, p1, Lx0/d0;->a:Ljava/lang/String;

    .line 2
    check-cast p4, Lx0/y$d;

    .line 3
    iget-object p4, p4, Lx0/y$d;->b:Lx0/y;

    .line 4
    iget-object p4, p4, Lx0/y;->w:Lx0/t;

    .line 5
    iget-object p4, p4, Lx0/t;->b:Landroid/content/Context;

    const/4 v0, 0x0

    .line 6
    invoke-static {p4, p2, v0}, Lx0/i;->instantiate(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Lx0/i;

    move-result-object p2

    .line 7
    iget-object p4, p1, Lx0/d0;->b:Ljava/lang/String;

    iput-object p4, p2, Lx0/i;->mWho:Ljava/lang/String;

    iget-boolean p4, p1, Lx0/d0;->c:Z

    iput-boolean p4, p2, Lx0/i;->mFromLayout:Z

    const/4 p4, 0x1

    iput-boolean p4, p2, Lx0/i;->mRestored:Z

    iget p4, p1, Lx0/d0;->d:I

    iput p4, p2, Lx0/i;->mFragmentId:I

    iget p4, p1, Lx0/d0;->e:I

    iput p4, p2, Lx0/i;->mContainerId:I

    iget-object p4, p1, Lx0/d0;->f:Ljava/lang/String;

    iput-object p4, p2, Lx0/i;->mTag:Ljava/lang/String;

    iget-boolean p4, p1, Lx0/d0;->o:Z

    iput-boolean p4, p2, Lx0/i;->mRetainInstance:Z

    iget-boolean p4, p1, Lx0/d0;->p:Z

    iput-boolean p4, p2, Lx0/i;->mRemoving:Z

    iget-boolean p4, p1, Lx0/d0;->q:Z

    iput-boolean p4, p2, Lx0/i;->mDetached:Z

    iget-boolean p4, p1, Lx0/d0;->r:Z

    iput-boolean p4, p2, Lx0/i;->mHidden:Z

    invoke-static {}, Lb1/k$b;->values()[Lb1/k$b;

    move-result-object p4

    iget v0, p1, Lx0/d0;->s:I

    aget-object p4, p4, v0

    iput-object p4, p2, Lx0/i;->mMaxState:Lb1/k$b;

    iget-object p4, p1, Lx0/d0;->t:Ljava/lang/String;

    iput-object p4, p2, Lx0/i;->mTargetWho:Ljava/lang/String;

    iget p4, p1, Lx0/d0;->u:I

    iput p4, p2, Lx0/i;->mTargetRequestCode:I

    iget-boolean p1, p1, Lx0/d0;->v:Z

    iput-boolean p1, p2, Lx0/i;->mUserVisibleHint:Z

    .line 8
    iput-object p2, p0, Lx0/e0;->c:Lx0/i;

    iput-object p5, p2, Lx0/i;->mSavedFragmentState:Landroid/os/Bundle;

    const-string p1, "arguments"

    invoke-virtual {p5, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1, p3}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    :cond_0
    invoke-virtual {p2, p1}, Lx0/i;->setArguments(Landroid/os/Bundle;)V

    const/4 p1, 0x2

    invoke-static {p1}, Lx0/y;->L(I)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Instantiated fragment "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "FragmentManager"

    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    return-void
.end method

.method public constructor <init>(Lx0/v;Lx0/f0;Lx0/i;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lx0/e0;->d:Z

    const/4 v0, -0x1

    iput v0, p0, Lx0/e0;->e:I

    iput-object p1, p0, Lx0/e0;->a:Lx0/v;

    iput-object p2, p0, Lx0/e0;->b:Lx0/f0;

    iput-object p3, p0, Lx0/e0;->c:Lx0/i;

    return-void
.end method

.method public constructor <init>(Lx0/v;Lx0/f0;Lx0/i;Landroid/os/Bundle;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lx0/e0;->d:Z

    const/4 v1, -0x1

    iput v1, p0, Lx0/e0;->e:I

    iput-object p1, p0, Lx0/e0;->a:Lx0/v;

    iput-object p2, p0, Lx0/e0;->b:Lx0/f0;

    iput-object p3, p0, Lx0/e0;->c:Lx0/i;

    const/4 p1, 0x0

    iput-object p1, p3, Lx0/i;->mSavedViewState:Landroid/util/SparseArray;

    iput-object p1, p3, Lx0/i;->mSavedViewRegistryState:Landroid/os/Bundle;

    iput v0, p3, Lx0/i;->mBackStackNesting:I

    iput-boolean v0, p3, Lx0/i;->mInLayout:Z

    iput-boolean v0, p3, Lx0/i;->mAdded:Z

    iget-object p2, p3, Lx0/i;->mTarget:Lx0/i;

    if-eqz p2, :cond_0

    iget-object p2, p2, Lx0/i;->mWho:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    iput-object p2, p3, Lx0/i;->mTargetWho:Ljava/lang/String;

    iput-object p1, p3, Lx0/i;->mTarget:Lx0/i;

    iput-object p4, p3, Lx0/i;->mSavedFragmentState:Landroid/os/Bundle;

    const-string p1, "arguments"

    invoke-virtual {p4, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    iput-object p1, p3, Lx0/i;->mArguments:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lx0/y;->L(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "moveto ACTIVITY_CREATED: "

    .line 9
    .line 10
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "FragmentManager"

    .line 24
    .line 25
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 30
    .line 31
    iget-object v1, v1, Lx0/i;->mSavedFragmentState:Landroid/os/Bundle;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    const-string v0, "savedInstanceState"

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :cond_1
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Lx0/i;->performActivityCreated(Landroid/os/Bundle;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lx0/e0;->a:Lx0/v;

    .line 47
    .line 48
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    invoke-virtual {v0, v1, v2}, Lx0/v;->a(Lx0/i;Z)V

    .line 52
    .line 53
    .line 54
    return-void
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
.end method

.method public final b()V
    .locals 6

    .line 1
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 2
    .line 3
    iget-object v0, v0, Lx0/i;->mContainer:Landroid/view/ViewGroup;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-eqz v0, :cond_3

    .line 7
    .line 8
    const v2, 0x7f0a00a3

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    instance-of v3, v2, Lx0/i;

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    check-cast v2, Lx0/i;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    move-object v2, v1

    .line 23
    :goto_1
    if-eqz v2, :cond_1

    .line 24
    .line 25
    move-object v1, v2

    .line 26
    goto :goto_2

    .line 27
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    instance-of v2, v0, Landroid/view/View;

    .line 32
    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    check-cast v0, Landroid/view/View;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    move-object v0, v1

    .line 39
    goto :goto_0

    .line 40
    :cond_3
    :goto_2
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 41
    .line 42
    invoke-virtual {v0}, Lx0/i;->getParentFragment()Lx0/i;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-eqz v1, :cond_4

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Lx0/i;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_4

    .line 53
    .line 54
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 55
    .line 56
    iget v2, v0, Lx0/i;->mContainerId:I

    .line 57
    .line 58
    sget-object v3, Ly0/b;->a:Ly0/b$c;

    .line 59
    .line 60
    new-instance v3, Ly0/m;

    .line 61
    .line 62
    invoke-direct {v3, v0, v1, v2}, Ly0/m;-><init>(Lx0/i;Lx0/i;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {v3}, Ly0/b;->c(Ly0/k;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Ly0/b;->a(Lx0/i;)Ly0/b$c;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    iget-object v2, v1, Ly0/b$c;->a:Ljava/util/Set;

    .line 73
    .line 74
    sget-object v4, Ly0/b$a;->e:Ly0/b$a;

    .line 75
    .line 76
    invoke-interface {v2, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_4

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const-class v2, Ly0/m;

    .line 87
    .line 88
    invoke-static {v1, v0, v2}, Ly0/b;->f(Ly0/b$c;Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_4

    .line 93
    .line 94
    invoke-static {v1, v3}, Ly0/b;->b(Ly0/b$c;Ly0/k;)V

    .line 95
    .line 96
    .line 97
    :cond_4
    iget-object v0, p0, Lx0/e0;->b:Lx0/f0;

    .line 98
    .line 99
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    iget-object v2, v1, Lx0/i;->mContainer:Landroid/view/ViewGroup;

    .line 105
    .line 106
    if-nez v2, :cond_5

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_5
    iget-object v3, v0, Lx0/f0;->a:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v3, Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    add-int/lit8 v3, v1, -0x1

    .line 118
    .line 119
    :goto_3
    if-ltz v3, :cond_7

    .line 120
    .line 121
    iget-object v4, v0, Lx0/f0;->a:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v4, Ljava/util/ArrayList;

    .line 124
    .line 125
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    check-cast v4, Lx0/i;

    .line 130
    .line 131
    iget-object v5, v4, Lx0/i;->mContainer:Landroid/view/ViewGroup;

    .line 132
    .line 133
    if-ne v5, v2, :cond_6

    .line 134
    .line 135
    iget-object v4, v4, Lx0/i;->mView:Landroid/view/View;

    .line 136
    .line 137
    if-eqz v4, :cond_6

    .line 138
    .line 139
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    add-int/lit8 v0, v0, 0x1

    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_6
    add-int/lit8 v3, v3, -0x1

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 150
    .line 151
    iget-object v3, v0, Lx0/f0;->a:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v3, Ljava/util/ArrayList;

    .line 154
    .line 155
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-ge v1, v3, :cond_8

    .line 160
    .line 161
    iget-object v3, v0, Lx0/f0;->a:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v3, Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    check-cast v3, Lx0/i;

    .line 170
    .line 171
    iget-object v4, v3, Lx0/i;->mContainer:Landroid/view/ViewGroup;

    .line 172
    .line 173
    if-ne v4, v2, :cond_7

    .line 174
    .line 175
    iget-object v3, v3, Lx0/i;->mView:Landroid/view/View;

    .line 176
    .line 177
    if-eqz v3, :cond_7

    .line 178
    .line 179
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    goto :goto_5

    .line 184
    :cond_8
    :goto_4
    const/4 v0, -0x1

    .line 185
    :goto_5
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 186
    .line 187
    iget-object v2, v1, Lx0/i;->mContainer:Landroid/view/ViewGroup;

    .line 188
    .line 189
    iget-object v1, v1, Lx0/i;->mView:Landroid/view/View;

    .line 190
    .line 191
    invoke-virtual {v2, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 192
    .line 193
    .line 194
    return-void
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
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
.end method

.method public final c()V
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lx0/y;->L(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "moveto ATTACHED: "

    .line 9
    .line 10
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "FragmentManager"

    .line 24
    .line 25
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 29
    .line 30
    iget-object v1, v0, Lx0/i;->mTarget:Lx0/i;

    .line 31
    .line 32
    const-string v2, " that does not belong to this FragmentManager!"

    .line 33
    .line 34
    const-string v3, " declared target fragment "

    .line 35
    .line 36
    const-string v4, "Fragment "

    .line 37
    .line 38
    const/4 v5, 0x0

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    iget-object v0, p0, Lx0/e0;->b:Lx0/f0;

    .line 42
    .line 43
    iget-object v1, v1, Lx0/i;->mWho:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v0, v0, Lx0/f0;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Ljava/util/HashMap;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lx0/e0;

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 58
    .line 59
    iget-object v2, v1, Lx0/i;->mTarget:Lx0/i;

    .line 60
    .line 61
    iget-object v2, v2, Lx0/i;->mWho:Ljava/lang/String;

    .line 62
    .line 63
    iput-object v2, v1, Lx0/i;->mTargetWho:Ljava/lang/String;

    .line 64
    .line 65
    iput-object v5, v1, Lx0/i;->mTarget:Lx0/i;

    .line 66
    .line 67
    move-object v5, v0

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 70
    .line 71
    invoke-static {v4}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iget-object v4, p0, Lx0/e0;->c:Lx0/i;

    .line 76
    .line 77
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    iget-object v3, p0, Lx0/e0;->c:Lx0/i;

    .line 84
    .line 85
    iget-object v3, v3, Lx0/i;->mTarget:Lx0/i;

    .line 86
    .line 87
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw v0

    .line 101
    :cond_2
    iget-object v0, v0, Lx0/i;->mTargetWho:Ljava/lang/String;

    .line 102
    .line 103
    if-eqz v0, :cond_4

    .line 104
    .line 105
    iget-object v1, p0, Lx0/e0;->b:Lx0/f0;

    .line 106
    .line 107
    iget-object v1, v1, Lx0/f0;->b:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v1, Ljava/util/HashMap;

    .line 110
    .line 111
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    move-object v5, v0

    .line 116
    check-cast v5, Lx0/e0;

    .line 117
    .line 118
    if-eqz v5, :cond_3

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 122
    .line 123
    invoke-static {v4}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    iget-object v4, p0, Lx0/e0;->c:Lx0/i;

    .line 128
    .line 129
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    iget-object v3, p0, Lx0/e0;->c:Lx0/i;

    .line 136
    .line 137
    iget-object v3, v3, Lx0/i;->mTargetWho:Ljava/lang/String;

    .line 138
    .line 139
    invoke-static {v1, v3, v2}, Lg;->f(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw v0

    .line 147
    :cond_4
    :goto_0
    if-eqz v5, :cond_5

    .line 148
    .line 149
    invoke-virtual {v5}, Lx0/e0;->k()V

    .line 150
    .line 151
    .line 152
    :cond_5
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 153
    .line 154
    iget-object v1, v0, Lx0/i;->mFragmentManager:Lx0/y;

    .line 155
    .line 156
    iget-object v2, v1, Lx0/y;->w:Lx0/t;

    .line 157
    .line 158
    iput-object v2, v0, Lx0/i;->mHost:Lx0/t;

    .line 159
    .line 160
    iget-object v1, v1, Lx0/y;->y:Lx0/i;

    .line 161
    .line 162
    iput-object v1, v0, Lx0/i;->mParentFragment:Lx0/i;

    .line 163
    .line 164
    iget-object v1, p0, Lx0/e0;->a:Lx0/v;

    .line 165
    .line 166
    const/4 v2, 0x0

    .line 167
    invoke-virtual {v1, v0, v2}, Lx0/v;->g(Lx0/i;Z)V

    .line 168
    .line 169
    .line 170
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 171
    .line 172
    invoke-virtual {v0}, Lx0/i;->performAttach()V

    .line 173
    .line 174
    .line 175
    iget-object v0, p0, Lx0/e0;->a:Lx0/v;

    .line 176
    .line 177
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 178
    .line 179
    invoke-virtual {v0, v1, v2}, Lx0/v;->b(Lx0/i;Z)V

    .line 180
    .line 181
    .line 182
    return-void
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
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
.end method

.method public final d()I
    .locals 11

    .line 1
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 2
    .line 3
    iget-object v1, v0, Lx0/i;->mFragmentManager:Lx0/y;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget v0, v0, Lx0/i;->mState:I

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    iget v1, p0, Lx0/e0;->e:I

    .line 11
    .line 12
    iget-object v0, v0, Lx0/i;->mMaxState:Lb1/k$b;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v2, 0x5

    .line 19
    const/4 v3, -0x1

    .line 20
    const/4 v4, 0x4

    .line 21
    const/4 v5, 0x1

    .line 22
    const/4 v6, 0x2

    .line 23
    const/4 v7, 0x3

    .line 24
    const/4 v8, 0x0

    .line 25
    if-eq v0, v5, :cond_3

    .line 26
    .line 27
    if-eq v0, v6, :cond_2

    .line 28
    .line 29
    if-eq v0, v7, :cond_1

    .line 30
    .line 31
    if-eq v0, v4, :cond_4

    .line 32
    .line 33
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    goto :goto_0

    .line 48
    :cond_3
    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    :cond_4
    :goto_0
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 53
    .line 54
    iget-boolean v9, v0, Lx0/i;->mFromLayout:Z

    .line 55
    .line 56
    if-eqz v9, :cond_7

    .line 57
    .line 58
    iget-boolean v9, v0, Lx0/i;->mInLayout:Z

    .line 59
    .line 60
    if-eqz v9, :cond_5

    .line 61
    .line 62
    iget v0, p0, Lx0/e0;->e:I

    .line 63
    .line 64
    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 69
    .line 70
    iget-object v0, v0, Lx0/i;->mView:Landroid/view/View;

    .line 71
    .line 72
    if-eqz v0, :cond_7

    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-nez v0, :cond_7

    .line 79
    .line 80
    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    goto :goto_1

    .line 85
    :cond_5
    iget v9, p0, Lx0/e0;->e:I

    .line 86
    .line 87
    if-ge v9, v4, :cond_6

    .line 88
    .line 89
    iget v0, v0, Lx0/i;->mState:I

    .line 90
    .line 91
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    goto :goto_1

    .line 96
    :cond_6
    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    :cond_7
    :goto_1
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 101
    .line 102
    iget-boolean v0, v0, Lx0/i;->mAdded:Z

    .line 103
    .line 104
    if-nez v0, :cond_8

    .line 105
    .line 106
    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    :cond_8
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 111
    .line 112
    iget-object v9, v0, Lx0/i;->mContainer:Landroid/view/ViewGroup;

    .line 113
    .line 114
    if-eqz v9, :cond_c

    .line 115
    .line 116
    invoke-virtual {v0}, Lx0/i;->getParentFragmentManager()Lx0/y;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-static {v9, v0}, Lx0/r0;->m(Landroid/view/ViewGroup;Lx0/y;)Lx0/r0;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    iget-object v9, p0, Lx0/e0;->c:Lx0/i;

    .line 128
    .line 129
    const-string v10, "fragmentStateManager.fragment"

    .line 130
    .line 131
    invoke-static {v9, v10}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v9}, Lx0/r0;->j(Lx0/i;)Lx0/r0$c;

    .line 135
    .line 136
    .line 137
    move-result-object v10

    .line 138
    if-eqz v10, :cond_9

    .line 139
    .line 140
    iget v10, v10, Lx0/r0$c;->b:I

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_9
    move v10, v8

    .line 144
    :goto_2
    invoke-virtual {v0, v9}, Lx0/r0;->k(Lx0/i;)Lx0/r0$c;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    if-eqz v0, :cond_a

    .line 149
    .line 150
    iget v8, v0, Lx0/r0$c;->b:I

    .line 151
    .line 152
    :cond_a
    if-nez v10, :cond_b

    .line 153
    .line 154
    move v0, v3

    .line 155
    goto :goto_3

    .line 156
    :cond_b
    sget-object v0, Lx0/r0$d;->a:[I

    .line 157
    .line 158
    invoke-static {v10}, Lq0/g;->c(I)I

    .line 159
    .line 160
    .line 161
    move-result v9

    .line 162
    aget v0, v0, v9

    .line 163
    .line 164
    :goto_3
    if-eq v0, v3, :cond_c

    .line 165
    .line 166
    if-eq v0, v5, :cond_c

    .line 167
    .line 168
    move v8, v10

    .line 169
    :cond_c
    if-ne v8, v6, :cond_d

    .line 170
    .line 171
    const/4 v0, 0x6

    .line 172
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    goto :goto_4

    .line 177
    :cond_d
    if-ne v8, v7, :cond_e

    .line 178
    .line 179
    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    goto :goto_4

    .line 184
    :cond_e
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 185
    .line 186
    iget-boolean v8, v0, Lx0/i;->mRemoving:Z

    .line 187
    .line 188
    if-eqz v8, :cond_10

    .line 189
    .line 190
    invoke-virtual {v0}, Lx0/i;->isInBackStack()Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-eqz v0, :cond_f

    .line 195
    .line 196
    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    goto :goto_4

    .line 201
    :cond_f
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    :cond_10
    :goto_4
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 206
    .line 207
    iget-boolean v3, v0, Lx0/i;->mDeferStart:Z

    .line 208
    .line 209
    if-eqz v3, :cond_11

    .line 210
    .line 211
    iget v0, v0, Lx0/i;->mState:I

    .line 212
    .line 213
    if-ge v0, v2, :cond_11

    .line 214
    .line 215
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    :cond_11
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 220
    .line 221
    iget-boolean v2, v0, Lx0/i;->mTransitioning:Z

    .line 222
    .line 223
    if-eqz v2, :cond_12

    .line 224
    .line 225
    iget-object v0, v0, Lx0/i;->mContainer:Landroid/view/ViewGroup;

    .line 226
    .line 227
    if-eqz v0, :cond_12

    .line 228
    .line 229
    invoke-static {v1, v7}, Ljava/lang/Math;->max(II)I

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    :cond_12
    invoke-static {v6}, Lx0/y;->L(I)Z

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    if-eqz v0, :cond_13

    .line 238
    .line 239
    const-string v0, "computeExpectedState() of "

    .line 240
    .line 241
    const-string v2, " for "

    .line 242
    .line 243
    invoke-static {v0, v1, v2}, La0/j;->n(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    iget-object v2, p0, Lx0/e0;->c:Lx0/i;

    .line 248
    .line 249
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    const-string v2, "FragmentManager"

    .line 257
    .line 258
    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 259
    .line 260
    .line 261
    :cond_13
    return v1
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
.end method

.method public final e()V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lx0/y;->L(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "moveto CREATED: "

    .line 9
    .line 10
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "FragmentManager"

    .line 24
    .line 25
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 30
    .line 31
    iget-object v1, v1, Lx0/i;->mSavedFragmentState:Landroid/os/Bundle;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    const-string v0, "savedInstanceState"

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :cond_1
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 42
    .line 43
    iget-boolean v2, v1, Lx0/i;->mIsCreated:Z

    .line 44
    .line 45
    if-nez v2, :cond_2

    .line 46
    .line 47
    iget-object v2, p0, Lx0/e0;->a:Lx0/v;

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    invoke-virtual {v2, v1, v3}, Lx0/v;->h(Lx0/i;Z)V

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 54
    .line 55
    invoke-virtual {v1, v0}, Lx0/i;->performCreate(Landroid/os/Bundle;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lx0/e0;->a:Lx0/v;

    .line 59
    .line 60
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 61
    .line 62
    invoke-virtual {v0, v1, v3}, Lx0/v;->c(Lx0/i;Z)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    const/4 v0, 0x1

    .line 67
    iput v0, v1, Lx0/i;->mState:I

    .line 68
    .line 69
    invoke-virtual {v1}, Lx0/i;->restoreChildFragmentState()V

    .line 70
    .line 71
    .line 72
    :goto_0
    return-void
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
.end method

.method public final f()V
    .locals 10

    .line 1
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 2
    .line 3
    iget-boolean v0, v0, Lx0/i;->mFromLayout:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x3

    .line 9
    invoke-static {v0}, Lx0/y;->L(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const-string v2, "FragmentManager"

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    const-string v1, "moveto CREATE_VIEW: "

    .line 18
    .line 19
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v3, p0, Lx0/e0;->c:Lx0/i;

    .line 24
    .line 25
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    :cond_1
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 36
    .line 37
    iget-object v1, v1, Lx0/i;->mSavedFragmentState:Landroid/os/Bundle;

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    const-string v4, "savedInstanceState"

    .line 43
    .line 44
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    move-object v1, v3

    .line 50
    :goto_0
    iget-object v4, p0, Lx0/e0;->c:Lx0/i;

    .line 51
    .line 52
    invoke-virtual {v4, v1}, Lx0/i;->performGetLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    iget-object v5, p0, Lx0/e0;->c:Lx0/i;

    .line 57
    .line 58
    iget-object v6, v5, Lx0/i;->mContainer:Landroid/view/ViewGroup;

    .line 59
    .line 60
    if-eqz v6, :cond_3

    .line 61
    .line 62
    move-object v3, v6

    .line 63
    goto/16 :goto_2

    .line 64
    .line 65
    :cond_3
    iget v6, v5, Lx0/i;->mContainerId:I

    .line 66
    .line 67
    if-eqz v6, :cond_7

    .line 68
    .line 69
    const/4 v3, -0x1

    .line 70
    if-eq v6, v3, :cond_6

    .line 71
    .line 72
    iget-object v3, v5, Lx0/i;->mFragmentManager:Lx0/y;

    .line 73
    .line 74
    iget-object v3, v3, Lx0/y;->x:Lx0/p;

    .line 75
    .line 76
    invoke-virtual {v3, v6}, Lx0/p;->b(I)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    check-cast v3, Landroid/view/ViewGroup;

    .line 81
    .line 82
    if-nez v3, :cond_5

    .line 83
    .line 84
    iget-object v5, p0, Lx0/e0;->c:Lx0/i;

    .line 85
    .line 86
    iget-boolean v6, v5, Lx0/i;->mRestored:Z

    .line 87
    .line 88
    if-eqz v6, :cond_4

    .line 89
    .line 90
    goto/16 :goto_2

    .line 91
    .line 92
    :cond_4
    :try_start_0
    invoke-virtual {v5}, Lx0/i;->getResources()Landroid/content/res/Resources;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 97
    .line 98
    iget v1, v1, Lx0/i;->mContainerId:I

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 104
    goto :goto_1

    .line 105
    :catch_0
    const-string v0, "unknown"

    .line 106
    .line 107
    :goto_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 108
    .line 109
    const-string v2, "No view found for id 0x"

    .line 110
    .line 111
    invoke-static {v2}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    iget-object v3, p0, Lx0/e0;->c:Lx0/i;

    .line 116
    .line 117
    iget v3, v3, Lx0/i;->mContainerId:I

    .line 118
    .line 119
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    const-string v3, " ("

    .line 127
    .line 128
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const-string v0, ") for fragment "

    .line 135
    .line 136
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 140
    .line 141
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw v1

    .line 152
    :cond_5
    instance-of v5, v3, Lx0/q;

    .line 153
    .line 154
    if-nez v5, :cond_7

    .line 155
    .line 156
    iget-object v5, p0, Lx0/e0;->c:Lx0/i;

    .line 157
    .line 158
    sget-object v6, Ly0/b;->a:Ly0/b$c;

    .line 159
    .line 160
    const-string v6, "fragment"

    .line 161
    .line 162
    invoke-static {v5, v6}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    new-instance v6, Ly0/l;

    .line 166
    .line 167
    invoke-direct {v6, v5, v3}, Ly0/l;-><init>(Lx0/i;Landroid/view/ViewGroup;)V

    .line 168
    .line 169
    .line 170
    invoke-static {v6}, Ly0/b;->c(Ly0/k;)V

    .line 171
    .line 172
    .line 173
    invoke-static {v5}, Ly0/b;->a(Lx0/i;)Ly0/b$c;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    iget-object v8, v7, Ly0/b$c;->a:Ljava/util/Set;

    .line 178
    .line 179
    sget-object v9, Ly0/b$a;->q:Ly0/b$a;

    .line 180
    .line 181
    invoke-interface {v8, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v8

    .line 185
    if-eqz v8, :cond_7

    .line 186
    .line 187
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    const-class v8, Ly0/l;

    .line 192
    .line 193
    invoke-static {v7, v5, v8}, Ly0/b;->f(Ly0/b$c;Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    if-eqz v5, :cond_7

    .line 198
    .line 199
    invoke-static {v7, v6}, Ly0/b;->b(Ly0/b$c;Ly0/k;)V

    .line 200
    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 204
    .line 205
    const-string v1, "Cannot create fragment "

    .line 206
    .line 207
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    iget-object v2, p0, Lx0/e0;->c:Lx0/i;

    .line 212
    .line 213
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    const-string v2, " for a container view with no id"

    .line 217
    .line 218
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    throw v0

    .line 229
    :cond_7
    :goto_2
    iget-object v5, p0, Lx0/e0;->c:Lx0/i;

    .line 230
    .line 231
    iput-object v3, v5, Lx0/i;->mContainer:Landroid/view/ViewGroup;

    .line 232
    .line 233
    invoke-virtual {v5, v4, v3, v1}, Lx0/i;->performCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 234
    .line 235
    .line 236
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 237
    .line 238
    iget-object v1, v1, Lx0/i;->mView:Landroid/view/View;

    .line 239
    .line 240
    const/4 v4, 0x2

    .line 241
    if-eqz v1, :cond_d

    .line 242
    .line 243
    invoke-static {v0}, Lx0/y;->L(I)Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-eqz v0, :cond_8

    .line 248
    .line 249
    const-string v0, "moveto VIEW_CREATED: "

    .line 250
    .line 251
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 256
    .line 257
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 265
    .line 266
    .line 267
    :cond_8
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 268
    .line 269
    iget-object v0, v0, Lx0/i;->mView:Landroid/view/View;

    .line 270
    .line 271
    const/4 v1, 0x0

    .line 272
    invoke-virtual {v0, v1}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 273
    .line 274
    .line 275
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 276
    .line 277
    iget-object v5, v0, Lx0/i;->mView:Landroid/view/View;

    .line 278
    .line 279
    const v6, 0x7f0a00a3

    .line 280
    .line 281
    .line 282
    invoke-virtual {v5, v6, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    if-eqz v3, :cond_9

    .line 286
    .line 287
    invoke-virtual {p0}, Lx0/e0;->b()V

    .line 288
    .line 289
    .line 290
    :cond_9
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 291
    .line 292
    iget-boolean v3, v0, Lx0/i;->mHidden:Z

    .line 293
    .line 294
    if-eqz v3, :cond_a

    .line 295
    .line 296
    iget-object v0, v0, Lx0/i;->mView:Landroid/view/View;

    .line 297
    .line 298
    const/16 v3, 0x8

    .line 299
    .line 300
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 301
    .line 302
    .line 303
    :cond_a
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 304
    .line 305
    iget-object v0, v0, Lx0/i;->mView:Landroid/view/View;

    .line 306
    .line 307
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    if-eqz v0, :cond_b

    .line 312
    .line 313
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 314
    .line 315
    iget-object v0, v0, Lx0/i;->mView:Landroid/view/View;

    .line 316
    .line 317
    sget-object v3, Le0/d0;->a:Ljava/util/WeakHashMap;

    .line 318
    .line 319
    invoke-static {v0}, Le0/d0$c;->c(Landroid/view/View;)V

    .line 320
    .line 321
    .line 322
    goto :goto_3

    .line 323
    :cond_b
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 324
    .line 325
    iget-object v0, v0, Lx0/i;->mView:Landroid/view/View;

    .line 326
    .line 327
    new-instance v3, Lx0/e0$a;

    .line 328
    .line 329
    invoke-direct {v3, v0}, Lx0/e0$a;-><init>(Landroid/view/View;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v0, v3}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 333
    .line 334
    .line 335
    :goto_3
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 336
    .line 337
    invoke-virtual {v0}, Lx0/i;->performViewCreated()V

    .line 338
    .line 339
    .line 340
    iget-object v0, p0, Lx0/e0;->a:Lx0/v;

    .line 341
    .line 342
    iget-object v3, p0, Lx0/e0;->c:Lx0/i;

    .line 343
    .line 344
    iget-object v5, v3, Lx0/i;->mView:Landroid/view/View;

    .line 345
    .line 346
    invoke-virtual {v0, v3, v5, v1}, Lx0/v;->m(Lx0/i;Landroid/view/View;Z)V

    .line 347
    .line 348
    .line 349
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 350
    .line 351
    iget-object v0, v0, Lx0/i;->mView:Landroid/view/View;

    .line 352
    .line 353
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 354
    .line 355
    .line 356
    move-result v0

    .line 357
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 358
    .line 359
    iget-object v1, v1, Lx0/i;->mView:Landroid/view/View;

    .line 360
    .line 361
    invoke-virtual {v1}, Landroid/view/View;->getAlpha()F

    .line 362
    .line 363
    .line 364
    move-result v1

    .line 365
    iget-object v3, p0, Lx0/e0;->c:Lx0/i;

    .line 366
    .line 367
    invoke-virtual {v3, v1}, Lx0/i;->setPostOnViewCreatedAlpha(F)V

    .line 368
    .line 369
    .line 370
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 371
    .line 372
    iget-object v3, v1, Lx0/i;->mContainer:Landroid/view/ViewGroup;

    .line 373
    .line 374
    if-eqz v3, :cond_d

    .line 375
    .line 376
    if-nez v0, :cond_d

    .line 377
    .line 378
    iget-object v0, v1, Lx0/i;->mView:Landroid/view/View;

    .line 379
    .line 380
    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    if-eqz v0, :cond_c

    .line 385
    .line 386
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 387
    .line 388
    invoke-virtual {v1, v0}, Lx0/i;->setFocusedView(Landroid/view/View;)V

    .line 389
    .line 390
    .line 391
    invoke-static {v4}, Lx0/y;->L(I)Z

    .line 392
    .line 393
    .line 394
    move-result v1

    .line 395
    if-eqz v1, :cond_c

    .line 396
    .line 397
    new-instance v1, Ljava/lang/StringBuilder;

    .line 398
    .line 399
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 400
    .line 401
    .line 402
    const-string v3, "requestFocus: Saved focused view "

    .line 403
    .line 404
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    const-string v0, " for Fragment "

    .line 411
    .line 412
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 416
    .line 417
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 425
    .line 426
    .line 427
    :cond_c
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 428
    .line 429
    iget-object v0, v0, Lx0/i;->mView:Landroid/view/View;

    .line 430
    .line 431
    const/4 v1, 0x0

    .line 432
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 433
    .line 434
    .line 435
    :cond_d
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 436
    .line 437
    iput v4, v0, Lx0/i;->mState:I

    .line 438
    .line 439
    return-void
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
.end method

.method public final g()V
    .locals 7

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lx0/y;->L(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "movefrom CREATED: "

    .line 9
    .line 10
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "FragmentManager"

    .line 24
    .line 25
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 29
    .line 30
    iget-boolean v1, v0, Lx0/i;->mRemoving:Z

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0}, Lx0/i;->isInBackStack()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    move v0, v3

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    move v0, v2

    .line 45
    :goto_0
    const/4 v1, 0x0

    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    iget-object v4, p0, Lx0/e0;->c:Lx0/i;

    .line 49
    .line 50
    iget-boolean v5, v4, Lx0/i;->mBeingSaved:Z

    .line 51
    .line 52
    if-nez v5, :cond_2

    .line 53
    .line 54
    iget-object v5, p0, Lx0/e0;->b:Lx0/f0;

    .line 55
    .line 56
    iget-object v4, v4, Lx0/i;->mWho:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v5, v1, v4}, Lx0/f0;->j(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    .line 59
    .line 60
    .line 61
    :cond_2
    if-nez v0, :cond_6

    .line 62
    .line 63
    iget-object v4, p0, Lx0/e0;->b:Lx0/f0;

    .line 64
    .line 65
    iget-object v4, v4, Lx0/f0;->d:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v4, Lx0/b0;

    .line 68
    .line 69
    iget-object v5, p0, Lx0/e0;->c:Lx0/i;

    .line 70
    .line 71
    iget-object v6, v4, Lx0/b0;->d:Ljava/util/HashMap;

    .line 72
    .line 73
    iget-object v5, v5, Lx0/i;->mWho:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-nez v5, :cond_3

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    iget-boolean v5, v4, Lx0/b0;->g:Z

    .line 83
    .line 84
    if-eqz v5, :cond_4

    .line 85
    .line 86
    iget-boolean v4, v4, Lx0/b0;->h:Z

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_4
    :goto_1
    move v4, v3

    .line 90
    :goto_2
    if-eqz v4, :cond_5

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_5
    move v4, v2

    .line 94
    goto :goto_4

    .line 95
    :cond_6
    :goto_3
    move v4, v3

    .line 96
    :goto_4
    if-eqz v4, :cond_f

    .line 97
    .line 98
    iget-object v4, p0, Lx0/e0;->c:Lx0/i;

    .line 99
    .line 100
    iget-object v4, v4, Lx0/i;->mHost:Lx0/t;

    .line 101
    .line 102
    instance-of v5, v4, Lb1/t0;

    .line 103
    .line 104
    if-eqz v5, :cond_7

    .line 105
    .line 106
    iget-object v3, p0, Lx0/e0;->b:Lx0/f0;

    .line 107
    .line 108
    iget-object v3, v3, Lx0/f0;->d:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v3, Lx0/b0;

    .line 111
    .line 112
    iget-boolean v3, v3, Lx0/b0;->h:Z

    .line 113
    .line 114
    goto :goto_5

    .line 115
    :cond_7
    iget-object v4, v4, Lx0/t;->b:Landroid/content/Context;

    .line 116
    .line 117
    instance-of v5, v4, Landroid/app/Activity;

    .line 118
    .line 119
    if-eqz v5, :cond_8

    .line 120
    .line 121
    check-cast v4, Landroid/app/Activity;

    .line 122
    .line 123
    invoke-virtual {v4}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    xor-int/2addr v3, v4

    .line 128
    :cond_8
    :goto_5
    if-eqz v0, :cond_9

    .line 129
    .line 130
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 131
    .line 132
    iget-boolean v0, v0, Lx0/i;->mBeingSaved:Z

    .line 133
    .line 134
    if-eqz v0, :cond_a

    .line 135
    .line 136
    :cond_9
    if-eqz v3, :cond_b

    .line 137
    .line 138
    :cond_a
    iget-object v0, p0, Lx0/e0;->b:Lx0/f0;

    .line 139
    .line 140
    iget-object v0, v0, Lx0/f0;->d:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v0, Lx0/b0;

    .line 143
    .line 144
    iget-object v3, p0, Lx0/e0;->c:Lx0/i;

    .line 145
    .line 146
    invoke-virtual {v0, v3, v2}, Lx0/b0;->e(Lx0/i;Z)V

    .line 147
    .line 148
    .line 149
    :cond_b
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 150
    .line 151
    invoke-virtual {v0}, Lx0/i;->performDestroy()V

    .line 152
    .line 153
    .line 154
    iget-object v0, p0, Lx0/e0;->a:Lx0/v;

    .line 155
    .line 156
    iget-object v3, p0, Lx0/e0;->c:Lx0/i;

    .line 157
    .line 158
    invoke-virtual {v0, v3, v2}, Lx0/v;->d(Lx0/i;Z)V

    .line 159
    .line 160
    .line 161
    iget-object v0, p0, Lx0/e0;->b:Lx0/f0;

    .line 162
    .line 163
    invoke-virtual {v0}, Lx0/f0;->e()Ljava/util/ArrayList;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    :cond_c
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-eqz v2, :cond_d

    .line 176
    .line 177
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    check-cast v2, Lx0/e0;

    .line 182
    .line 183
    if-eqz v2, :cond_c

    .line 184
    .line 185
    iget-object v2, v2, Lx0/e0;->c:Lx0/i;

    .line 186
    .line 187
    iget-object v3, p0, Lx0/e0;->c:Lx0/i;

    .line 188
    .line 189
    iget-object v3, v3, Lx0/i;->mWho:Ljava/lang/String;

    .line 190
    .line 191
    iget-object v4, v2, Lx0/i;->mTargetWho:Ljava/lang/String;

    .line 192
    .line 193
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v3

    .line 197
    if-eqz v3, :cond_c

    .line 198
    .line 199
    iget-object v3, p0, Lx0/e0;->c:Lx0/i;

    .line 200
    .line 201
    iput-object v3, v2, Lx0/i;->mTarget:Lx0/i;

    .line 202
    .line 203
    iput-object v1, v2, Lx0/i;->mTargetWho:Ljava/lang/String;

    .line 204
    .line 205
    goto :goto_6

    .line 206
    :cond_d
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 207
    .line 208
    iget-object v1, v0, Lx0/i;->mTargetWho:Ljava/lang/String;

    .line 209
    .line 210
    if-eqz v1, :cond_e

    .line 211
    .line 212
    iget-object v2, p0, Lx0/e0;->b:Lx0/f0;

    .line 213
    .line 214
    invoke-virtual {v2, v1}, Lx0/f0;->c(Ljava/lang/String;)Lx0/i;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    iput-object v1, v0, Lx0/i;->mTarget:Lx0/i;

    .line 219
    .line 220
    :cond_e
    iget-object v0, p0, Lx0/e0;->b:Lx0/f0;

    .line 221
    .line 222
    invoke-virtual {v0, p0}, Lx0/f0;->i(Lx0/e0;)V

    .line 223
    .line 224
    .line 225
    goto :goto_7

    .line 226
    :cond_f
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 227
    .line 228
    iget-object v0, v0, Lx0/i;->mTargetWho:Ljava/lang/String;

    .line 229
    .line 230
    if-eqz v0, :cond_10

    .line 231
    .line 232
    iget-object v1, p0, Lx0/e0;->b:Lx0/f0;

    .line 233
    .line 234
    invoke-virtual {v1, v0}, Lx0/f0;->c(Ljava/lang/String;)Lx0/i;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    if-eqz v0, :cond_10

    .line 239
    .line 240
    iget-boolean v1, v0, Lx0/i;->mRetainInstance:Z

    .line 241
    .line 242
    if-eqz v1, :cond_10

    .line 243
    .line 244
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 245
    .line 246
    iput-object v0, v1, Lx0/i;->mTarget:Lx0/i;

    .line 247
    .line 248
    :cond_10
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 249
    .line 250
    iput v2, v0, Lx0/i;->mState:I

    .line 251
    .line 252
    :goto_7
    return-void
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
.end method

.method public final h()V
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lx0/y;->L(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "movefrom CREATE_VIEW: "

    .line 9
    .line 10
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "FragmentManager"

    .line 24
    .line 25
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 29
    .line 30
    iget-object v1, v0, Lx0/i;->mContainer:Landroid/view/ViewGroup;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    iget-object v0, v0, Lx0/i;->mView:Landroid/view/View;

    .line 35
    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 42
    .line 43
    invoke-virtual {v0}, Lx0/i;->performDestroyView()V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lx0/e0;->a:Lx0/v;

    .line 47
    .line 48
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    invoke-virtual {v0, v1, v2}, Lx0/v;->n(Lx0/i;Z)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 55
    .line 56
    const/4 v1, 0x0

    .line 57
    iput-object v1, v0, Lx0/i;->mContainer:Landroid/view/ViewGroup;

    .line 58
    .line 59
    iput-object v1, v0, Lx0/i;->mView:Landroid/view/View;

    .line 60
    .line 61
    iput-object v1, v0, Lx0/i;->mViewLifecycleOwner:Lx0/o0;

    .line 62
    .line 63
    iget-object v0, v0, Lx0/i;->mViewLifecycleOwnerLiveData:Lb1/w;

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Lb1/w;->setValue(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 69
    .line 70
    iput-boolean v2, v0, Lx0/i;->mInLayout:Z

    .line 71
    .line 72
    return-void
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
.end method

.method public final i()V
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lx0/y;->L(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "FragmentManager"

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const-string v1, "movefrom ATTACHED: "

    .line 11
    .line 12
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v3, p0, Lx0/e0;->c:Lx0/i;

    .line 17
    .line 18
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 29
    .line 30
    invoke-virtual {v1}, Lx0/i;->performDetach()V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lx0/e0;->a:Lx0/v;

    .line 34
    .line 35
    iget-object v3, p0, Lx0/e0;->c:Lx0/i;

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    invoke-virtual {v1, v3, v4}, Lx0/v;->e(Lx0/i;Z)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 42
    .line 43
    const/4 v3, -0x1

    .line 44
    iput v3, v1, Lx0/i;->mState:I

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    iput-object v3, v1, Lx0/i;->mHost:Lx0/t;

    .line 48
    .line 49
    iput-object v3, v1, Lx0/i;->mParentFragment:Lx0/i;

    .line 50
    .line 51
    iput-object v3, v1, Lx0/i;->mFragmentManager:Lx0/y;

    .line 52
    .line 53
    iget-boolean v3, v1, Lx0/i;->mRemoving:Z

    .line 54
    .line 55
    const/4 v5, 0x1

    .line 56
    if-eqz v3, :cond_1

    .line 57
    .line 58
    invoke-virtual {v1}, Lx0/i;->isInBackStack()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_1

    .line 63
    .line 64
    move v4, v5

    .line 65
    :cond_1
    if-nez v4, :cond_4

    .line 66
    .line 67
    iget-object v1, p0, Lx0/e0;->b:Lx0/f0;

    .line 68
    .line 69
    iget-object v1, v1, Lx0/f0;->d:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, Lx0/b0;

    .line 72
    .line 73
    iget-object v3, p0, Lx0/e0;->c:Lx0/i;

    .line 74
    .line 75
    iget-object v4, v1, Lx0/b0;->d:Ljava/util/HashMap;

    .line 76
    .line 77
    iget-object v3, v3, Lx0/i;->mWho:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-nez v3, :cond_2

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    iget-boolean v3, v1, Lx0/b0;->g:Z

    .line 87
    .line 88
    if-eqz v3, :cond_3

    .line 89
    .line 90
    iget-boolean v5, v1, Lx0/b0;->h:Z

    .line 91
    .line 92
    :cond_3
    :goto_0
    if-eqz v5, :cond_6

    .line 93
    .line 94
    :cond_4
    invoke-static {v0}, Lx0/y;->L(I)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_5

    .line 99
    .line 100
    const-string v0, "initState called for fragment: "

    .line 101
    .line 102
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    :cond_5
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 119
    .line 120
    invoke-virtual {v0}, Lx0/i;->initState()V

    .line 121
    .line 122
    .line 123
    :cond_6
    return-void
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
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
.end method

.method public final j()V
    .locals 4

    .line 1
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 2
    .line 3
    iget-boolean v1, v0, Lx0/i;->mFromLayout:Z

    .line 4
    .line 5
    if-eqz v1, :cond_3

    .line 6
    .line 7
    iget-boolean v1, v0, Lx0/i;->mInLayout:Z

    .line 8
    .line 9
    if-eqz v1, :cond_3

    .line 10
    .line 11
    iget-boolean v0, v0, Lx0/i;->mPerformedCreateView:Z

    .line 12
    .line 13
    if-nez v0, :cond_3

    .line 14
    .line 15
    const/4 v0, 0x3

    .line 16
    invoke-static {v0}, Lx0/y;->L(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const-string v0, "moveto CREATE_VIEW: "

    .line 23
    .line 24
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v1, "FragmentManager"

    .line 38
    .line 39
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    :cond_0
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 43
    .line 44
    iget-object v0, v0, Lx0/i;->mSavedFragmentState:Landroid/os/Bundle;

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    const-string v2, "savedInstanceState"

    .line 50
    .line 51
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    move-object v0, v1

    .line 57
    :goto_0
    iget-object v2, p0, Lx0/e0;->c:Lx0/i;

    .line 58
    .line 59
    invoke-virtual {v2, v0}, Lx0/i;->performGetLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v2, v3, v1, v0}, Lx0/i;->performCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 67
    .line 68
    iget-object v0, v0, Lx0/i;->mView:Landroid/view/View;

    .line 69
    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    invoke-virtual {v0, v1}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 77
    .line 78
    iget-object v2, v0, Lx0/i;->mView:Landroid/view/View;

    .line 79
    .line 80
    const v3, 0x7f0a00a3

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v3, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 87
    .line 88
    iget-boolean v2, v0, Lx0/i;->mHidden:Z

    .line 89
    .line 90
    if-eqz v2, :cond_2

    .line 91
    .line 92
    iget-object v0, v0, Lx0/i;->mView:Landroid/view/View;

    .line 93
    .line 94
    const/16 v2, 0x8

    .line 95
    .line 96
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 97
    .line 98
    .line 99
    :cond_2
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 100
    .line 101
    invoke-virtual {v0}, Lx0/i;->performViewCreated()V

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, Lx0/e0;->a:Lx0/v;

    .line 105
    .line 106
    iget-object v2, p0, Lx0/e0;->c:Lx0/i;

    .line 107
    .line 108
    iget-object v3, v2, Lx0/i;->mView:Landroid/view/View;

    .line 109
    .line 110
    invoke-virtual {v0, v2, v3, v1}, Lx0/v;->m(Lx0/i;Landroid/view/View;Z)V

    .line 111
    .line 112
    .line 113
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 114
    .line 115
    const/4 v1, 0x2

    .line 116
    iput v1, v0, Lx0/i;->mState:I

    .line 117
    .line 118
    :cond_3
    return-void
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
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
.end method

.method public final k()V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lx0/e0;->d:Z

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const-string v2, "FragmentManager"

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-static {v1}, Lx0/y;->L(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const-string v0, "Ignoring re-entrant call to moveToExpectedState() for "

    .line 15
    .line 16
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void

    .line 33
    :cond_1
    const/4 v0, 0x0

    .line 34
    const/4 v3, 0x1

    .line 35
    :try_start_0
    iput-boolean v3, p0, Lx0/e0;->d:Z

    .line 36
    .line 37
    move v4, v0

    .line 38
    :goto_0
    invoke-virtual {p0}, Lx0/e0;->d()I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    iget-object v6, p0, Lx0/e0;->c:Lx0/i;

    .line 43
    .line 44
    iget v7, v6, Lx0/i;->mState:I

    .line 45
    .line 46
    const/4 v8, 0x3

    .line 47
    if-eq v5, v7, :cond_c

    .line 48
    .line 49
    if-le v5, v7, :cond_6

    .line 50
    .line 51
    add-int/lit8 v7, v7, 0x1

    .line 52
    .line 53
    packed-switch v7, :pswitch_data_0

    .line 54
    .line 55
    .line 56
    goto/16 :goto_3

    .line 57
    .line 58
    :pswitch_0
    invoke-virtual {p0}, Lx0/e0;->n()V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_3

    .line 62
    .line 63
    :pswitch_1
    const/4 v4, 0x6

    .line 64
    iput v4, v6, Lx0/i;->mState:I

    .line 65
    .line 66
    goto/16 :goto_3

    .line 67
    .line 68
    :pswitch_2
    invoke-virtual {p0}, Lx0/e0;->q()V

    .line 69
    .line 70
    .line 71
    goto/16 :goto_3

    .line 72
    .line 73
    :pswitch_3
    iget-object v4, v6, Lx0/i;->mView:Landroid/view/View;

    .line 74
    .line 75
    const/4 v5, 0x4

    .line 76
    if-eqz v4, :cond_5

    .line 77
    .line 78
    iget-object v4, v6, Lx0/i;->mContainer:Landroid/view/ViewGroup;

    .line 79
    .line 80
    if-eqz v4, :cond_5

    .line 81
    .line 82
    invoke-virtual {v6}, Lx0/i;->getParentFragmentManager()Lx0/y;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-static {v4, v6}, Lx0/r0;->m(Landroid/view/ViewGroup;Lx0/y;)Lx0/r0;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    iget-object v6, p0, Lx0/e0;->c:Lx0/i;

    .line 91
    .line 92
    iget-object v6, v6, Lx0/i;->mView:Landroid/view/View;

    .line 93
    .line 94
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    if-eqz v6, :cond_4

    .line 99
    .line 100
    if-eq v6, v5, :cond_3

    .line 101
    .line 102
    const/16 v7, 0x8

    .line 103
    .line 104
    if-ne v6, v7, :cond_2

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 108
    .line 109
    new-instance v2, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    const-string v3, "Unknown visibility "

    .line 115
    .line 116
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw v1

    .line 130
    :cond_3
    move v8, v5

    .line 131
    goto :goto_1

    .line 132
    :cond_4
    move v8, v1

    .line 133
    :goto_1
    invoke-virtual {v4, v8, p0}, Lx0/r0;->e(ILx0/e0;)V

    .line 134
    .line 135
    .line 136
    :cond_5
    iget-object v4, p0, Lx0/e0;->c:Lx0/i;

    .line 137
    .line 138
    iput v5, v4, Lx0/i;->mState:I

    .line 139
    .line 140
    goto/16 :goto_3

    .line 141
    .line 142
    :pswitch_4
    invoke-virtual {p0}, Lx0/e0;->a()V

    .line 143
    .line 144
    .line 145
    goto/16 :goto_3

    .line 146
    .line 147
    :pswitch_5
    invoke-virtual {p0}, Lx0/e0;->j()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0}, Lx0/e0;->f()V

    .line 151
    .line 152
    .line 153
    goto/16 :goto_3

    .line 154
    .line 155
    :pswitch_6
    invoke-virtual {p0}, Lx0/e0;->e()V

    .line 156
    .line 157
    .line 158
    goto/16 :goto_3

    .line 159
    .line 160
    :pswitch_7
    invoke-virtual {p0}, Lx0/e0;->c()V

    .line 161
    .line 162
    .line 163
    goto/16 :goto_3

    .line 164
    .line 165
    :cond_6
    add-int/lit8 v7, v7, -0x1

    .line 166
    .line 167
    packed-switch v7, :pswitch_data_1

    .line 168
    .line 169
    .line 170
    goto/16 :goto_3

    .line 171
    .line 172
    :pswitch_8
    invoke-virtual {p0}, Lx0/e0;->l()V

    .line 173
    .line 174
    .line 175
    goto/16 :goto_3

    .line 176
    .line 177
    :pswitch_9
    const/4 v4, 0x5

    .line 178
    iput v4, v6, Lx0/i;->mState:I

    .line 179
    .line 180
    goto/16 :goto_3

    .line 181
    .line 182
    :pswitch_a
    invoke-virtual {p0}, Lx0/e0;->r()V

    .line 183
    .line 184
    .line 185
    goto/16 :goto_3

    .line 186
    .line 187
    :pswitch_b
    invoke-static {v8}, Lx0/y;->L(I)Z

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    if-eqz v4, :cond_7

    .line 192
    .line 193
    new-instance v4, Ljava/lang/StringBuilder;

    .line 194
    .line 195
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 196
    .line 197
    .line 198
    const-string v5, "movefrom ACTIVITY_CREATED: "

    .line 199
    .line 200
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    iget-object v5, p0, Lx0/e0;->c:Lx0/i;

    .line 204
    .line 205
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    invoke-static {v2, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 213
    .line 214
    .line 215
    :cond_7
    iget-object v4, p0, Lx0/e0;->c:Lx0/i;

    .line 216
    .line 217
    iget-boolean v5, v4, Lx0/i;->mBeingSaved:Z

    .line 218
    .line 219
    if-eqz v5, :cond_8

    .line 220
    .line 221
    iget-object v5, p0, Lx0/e0;->b:Lx0/f0;

    .line 222
    .line 223
    iget-object v4, v4, Lx0/i;->mWho:Ljava/lang/String;

    .line 224
    .line 225
    invoke-virtual {p0}, Lx0/e0;->o()Landroid/os/Bundle;

    .line 226
    .line 227
    .line 228
    move-result-object v6

    .line 229
    invoke-virtual {v5, v6, v4}, Lx0/f0;->j(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    .line 230
    .line 231
    .line 232
    goto :goto_2

    .line 233
    :cond_8
    iget-object v5, v4, Lx0/i;->mView:Landroid/view/View;

    .line 234
    .line 235
    if-eqz v5, :cond_9

    .line 236
    .line 237
    iget-object v4, v4, Lx0/i;->mSavedViewState:Landroid/util/SparseArray;

    .line 238
    .line 239
    if-nez v4, :cond_9

    .line 240
    .line 241
    invoke-virtual {p0}, Lx0/e0;->p()V

    .line 242
    .line 243
    .line 244
    :cond_9
    :goto_2
    iget-object v4, p0, Lx0/e0;->c:Lx0/i;

    .line 245
    .line 246
    iget-object v5, v4, Lx0/i;->mView:Landroid/view/View;

    .line 247
    .line 248
    if-eqz v5, :cond_a

    .line 249
    .line 250
    iget-object v5, v4, Lx0/i;->mContainer:Landroid/view/ViewGroup;

    .line 251
    .line 252
    if-eqz v5, :cond_a

    .line 253
    .line 254
    invoke-virtual {v4}, Lx0/i;->getParentFragmentManager()Lx0/y;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    invoke-static {v5, v4}, Lx0/r0;->m(Landroid/view/ViewGroup;Lx0/y;)Lx0/r0;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    invoke-virtual {v4, p0}, Lx0/r0;->g(Lx0/e0;)V

    .line 263
    .line 264
    .line 265
    :cond_a
    iget-object v4, p0, Lx0/e0;->c:Lx0/i;

    .line 266
    .line 267
    iput v8, v4, Lx0/i;->mState:I

    .line 268
    .line 269
    goto :goto_3

    .line 270
    :pswitch_c
    iput-boolean v0, v6, Lx0/i;->mInLayout:Z

    .line 271
    .line 272
    iput v1, v6, Lx0/i;->mState:I

    .line 273
    .line 274
    goto :goto_3

    .line 275
    :pswitch_d
    invoke-virtual {p0}, Lx0/e0;->h()V

    .line 276
    .line 277
    .line 278
    iget-object v4, p0, Lx0/e0;->c:Lx0/i;

    .line 279
    .line 280
    iput v3, v4, Lx0/i;->mState:I

    .line 281
    .line 282
    goto :goto_3

    .line 283
    :pswitch_e
    iget-boolean v4, v6, Lx0/i;->mBeingSaved:Z

    .line 284
    .line 285
    if-eqz v4, :cond_b

    .line 286
    .line 287
    iget-object v4, p0, Lx0/e0;->b:Lx0/f0;

    .line 288
    .line 289
    iget-object v5, v6, Lx0/i;->mWho:Ljava/lang/String;

    .line 290
    .line 291
    iget-object v4, v4, Lx0/f0;->c:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v4, Ljava/util/HashMap;

    .line 294
    .line 295
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    check-cast v4, Landroid/os/Bundle;

    .line 300
    .line 301
    if-nez v4, :cond_b

    .line 302
    .line 303
    iget-object v4, p0, Lx0/e0;->b:Lx0/f0;

    .line 304
    .line 305
    iget-object v5, p0, Lx0/e0;->c:Lx0/i;

    .line 306
    .line 307
    iget-object v5, v5, Lx0/i;->mWho:Ljava/lang/String;

    .line 308
    .line 309
    invoke-virtual {p0}, Lx0/e0;->o()Landroid/os/Bundle;

    .line 310
    .line 311
    .line 312
    move-result-object v6

    .line 313
    invoke-virtual {v4, v6, v5}, Lx0/f0;->j(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    .line 314
    .line 315
    .line 316
    :cond_b
    invoke-virtual {p0}, Lx0/e0;->g()V

    .line 317
    .line 318
    .line 319
    goto :goto_3

    .line 320
    :pswitch_f
    invoke-virtual {p0}, Lx0/e0;->i()V

    .line 321
    .line 322
    .line 323
    :goto_3
    move v4, v3

    .line 324
    goto/16 :goto_0

    .line 325
    .line 326
    :cond_c
    if-nez v4, :cond_f

    .line 327
    .line 328
    const/4 v1, -0x1

    .line 329
    if-ne v7, v1, :cond_f

    .line 330
    .line 331
    iget-boolean v1, v6, Lx0/i;->mRemoving:Z

    .line 332
    .line 333
    if-eqz v1, :cond_f

    .line 334
    .line 335
    invoke-virtual {v6}, Lx0/i;->isInBackStack()Z

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    if-nez v1, :cond_f

    .line 340
    .line 341
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 342
    .line 343
    iget-boolean v1, v1, Lx0/i;->mBeingSaved:Z

    .line 344
    .line 345
    if-nez v1, :cond_f

    .line 346
    .line 347
    invoke-static {v8}, Lx0/y;->L(I)Z

    .line 348
    .line 349
    .line 350
    move-result v1

    .line 351
    if-eqz v1, :cond_d

    .line 352
    .line 353
    new-instance v1, Ljava/lang/StringBuilder;

    .line 354
    .line 355
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 356
    .line 357
    .line 358
    const-string v4, "Cleaning up state of never attached fragment: "

    .line 359
    .line 360
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    iget-object v4, p0, Lx0/e0;->c:Lx0/i;

    .line 364
    .line 365
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 373
    .line 374
    .line 375
    :cond_d
    iget-object v1, p0, Lx0/e0;->b:Lx0/f0;

    .line 376
    .line 377
    iget-object v1, v1, Lx0/f0;->d:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v1, Lx0/b0;

    .line 380
    .line 381
    iget-object v4, p0, Lx0/e0;->c:Lx0/i;

    .line 382
    .line 383
    invoke-virtual {v1, v4, v3}, Lx0/b0;->e(Lx0/i;Z)V

    .line 384
    .line 385
    .line 386
    iget-object v1, p0, Lx0/e0;->b:Lx0/f0;

    .line 387
    .line 388
    invoke-virtual {v1, p0}, Lx0/f0;->i(Lx0/e0;)V

    .line 389
    .line 390
    .line 391
    invoke-static {v8}, Lx0/y;->L(I)Z

    .line 392
    .line 393
    .line 394
    move-result v1

    .line 395
    if-eqz v1, :cond_e

    .line 396
    .line 397
    new-instance v1, Ljava/lang/StringBuilder;

    .line 398
    .line 399
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 400
    .line 401
    .line 402
    const-string v4, "initState called for fragment: "

    .line 403
    .line 404
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    iget-object v4, p0, Lx0/e0;->c:Lx0/i;

    .line 408
    .line 409
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v1

    .line 416
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 417
    .line 418
    .line 419
    :cond_e
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 420
    .line 421
    invoke-virtual {v1}, Lx0/i;->initState()V

    .line 422
    .line 423
    .line 424
    :cond_f
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 425
    .line 426
    iget-boolean v2, v1, Lx0/i;->mHiddenChanged:Z

    .line 427
    .line 428
    if-eqz v2, :cond_13

    .line 429
    .line 430
    iget-object v2, v1, Lx0/i;->mView:Landroid/view/View;

    .line 431
    .line 432
    if-eqz v2, :cond_11

    .line 433
    .line 434
    iget-object v2, v1, Lx0/i;->mContainer:Landroid/view/ViewGroup;

    .line 435
    .line 436
    if-eqz v2, :cond_11

    .line 437
    .line 438
    invoke-virtual {v1}, Lx0/i;->getParentFragmentManager()Lx0/y;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    invoke-static {v2, v1}, Lx0/r0;->m(Landroid/view/ViewGroup;Lx0/y;)Lx0/r0;

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    iget-object v2, p0, Lx0/e0;->c:Lx0/i;

    .line 447
    .line 448
    iget-boolean v2, v2, Lx0/i;->mHidden:Z

    .line 449
    .line 450
    if-eqz v2, :cond_10

    .line 451
    .line 452
    invoke-virtual {v1, p0}, Lx0/r0;->f(Lx0/e0;)V

    .line 453
    .line 454
    .line 455
    goto :goto_4

    .line 456
    :cond_10
    invoke-virtual {v1, p0}, Lx0/r0;->h(Lx0/e0;)V

    .line 457
    .line 458
    .line 459
    :cond_11
    :goto_4
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 460
    .line 461
    iget-object v2, v1, Lx0/i;->mFragmentManager:Lx0/y;

    .line 462
    .line 463
    if-eqz v2, :cond_12

    .line 464
    .line 465
    iget-boolean v4, v1, Lx0/i;->mAdded:Z

    .line 466
    .line 467
    if-eqz v4, :cond_12

    .line 468
    .line 469
    invoke-static {v1}, Lx0/y;->M(Lx0/i;)Z

    .line 470
    .line 471
    .line 472
    move-result v1

    .line 473
    if-eqz v1, :cond_12

    .line 474
    .line 475
    iput-boolean v3, v2, Lx0/y;->G:Z

    .line 476
    .line 477
    :cond_12
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 478
    .line 479
    iput-boolean v0, v1, Lx0/i;->mHiddenChanged:Z

    .line 480
    .line 481
    iget-boolean v2, v1, Lx0/i;->mHidden:Z

    .line 482
    .line 483
    invoke-virtual {v1, v2}, Lx0/i;->onHiddenChanged(Z)V

    .line 484
    .line 485
    .line 486
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 487
    .line 488
    iget-object v1, v1, Lx0/i;->mChildFragmentManager:Lx0/y;

    .line 489
    .line 490
    invoke-virtual {v1}, Lx0/y;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 491
    .line 492
    .line 493
    :cond_13
    iput-boolean v0, p0, Lx0/e0;->d:Z

    .line 494
    .line 495
    return-void

    .line 496
    :catchall_0
    move-exception v1

    .line 497
    iput-boolean v0, p0, Lx0/e0;->d:Z

    .line 498
    .line 499
    throw v1

    .line 500
    nop

    .line 501
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
.end method

.method public final l()V
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lx0/y;->L(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "movefrom RESUMED: "

    .line 9
    .line 10
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "FragmentManager"

    .line 24
    .line 25
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 29
    .line 30
    invoke-virtual {v0}, Lx0/i;->performPause()V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lx0/e0;->a:Lx0/v;

    .line 34
    .line 35
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-virtual {v0, v1, v2}, Lx0/v;->f(Lx0/i;Z)V

    .line 39
    .line 40
    .line 41
    return-void
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
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
.end method

.method public final m(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 2
    .line 3
    iget-object v0, v0, Lx0/i;->mSavedFragmentState:Landroid/os/Bundle;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lx0/e0;->c:Lx0/i;

    .line 12
    .line 13
    iget-object p1, p1, Lx0/i;->mSavedFragmentState:Landroid/os/Bundle;

    .line 14
    .line 15
    const-string v0, "savedInstanceState"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    iget-object p1, p0, Lx0/e0;->c:Lx0/i;

    .line 24
    .line 25
    iget-object p1, p1, Lx0/i;->mSavedFragmentState:Landroid/os/Bundle;

    .line 26
    .line 27
    new-instance v1, Landroid/os/Bundle;

    .line 28
    .line 29
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    :try_start_0
    iget-object p1, p0, Lx0/e0;->c:Lx0/i;

    .line 36
    .line 37
    iget-object v0, p1, Lx0/i;->mSavedFragmentState:Landroid/os/Bundle;

    .line 38
    .line 39
    const-string v1, "viewState"

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p1, Lx0/i;->mSavedViewState:Landroid/util/SparseArray;
    :try_end_0
    .catch Landroid/os/BadParcelableException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    iget-object p1, p0, Lx0/e0;->c:Lx0/i;

    .line 48
    .line 49
    iget-object v0, p1, Lx0/i;->mSavedFragmentState:Landroid/os/Bundle;

    .line 50
    .line 51
    const-string v1, "viewRegistryState"

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p1, Lx0/i;->mSavedViewRegistryState:Landroid/os/Bundle;

    .line 58
    .line 59
    iget-object p1, p0, Lx0/e0;->c:Lx0/i;

    .line 60
    .line 61
    iget-object p1, p1, Lx0/i;->mSavedFragmentState:Landroid/os/Bundle;

    .line 62
    .line 63
    const-string v0, "state"

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Lx0/d0;

    .line 70
    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 74
    .line 75
    iget-object v1, p1, Lx0/d0;->t:Ljava/lang/String;

    .line 76
    .line 77
    iput-object v1, v0, Lx0/i;->mTargetWho:Ljava/lang/String;

    .line 78
    .line 79
    iget v1, p1, Lx0/d0;->u:I

    .line 80
    .line 81
    iput v1, v0, Lx0/i;->mTargetRequestCode:I

    .line 82
    .line 83
    iget-object v1, v0, Lx0/i;->mSavedUserVisibleHint:Ljava/lang/Boolean;

    .line 84
    .line 85
    if-eqz v1, :cond_2

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    iput-boolean p1, v0, Lx0/i;->mUserVisibleHint:Z

    .line 92
    .line 93
    iget-object p1, p0, Lx0/e0;->c:Lx0/i;

    .line 94
    .line 95
    const/4 v0, 0x0

    .line 96
    iput-object v0, p1, Lx0/i;->mSavedUserVisibleHint:Ljava/lang/Boolean;

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    iget-boolean p1, p1, Lx0/d0;->v:Z

    .line 100
    .line 101
    iput-boolean p1, v0, Lx0/i;->mUserVisibleHint:Z

    .line 102
    .line 103
    :cond_3
    :goto_0
    iget-object p1, p0, Lx0/e0;->c:Lx0/i;

    .line 104
    .line 105
    iget-boolean v0, p1, Lx0/i;->mUserVisibleHint:Z

    .line 106
    .line 107
    if-nez v0, :cond_4

    .line 108
    .line 109
    const/4 v0, 0x1

    .line 110
    iput-boolean v0, p1, Lx0/i;->mDeferStart:Z

    .line 111
    .line 112
    :cond_4
    return-void

    .line 113
    :catch_0
    move-exception p1

    .line 114
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 115
    .line 116
    const-string v1, "Failed to restore view hierarchy state for fragment "

    .line 117
    .line 118
    invoke-static {v1}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    iget-object v2, p0, Lx0/e0;->c:Lx0/i;

    .line 123
    .line 124
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    throw v0
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

.method public final n()V
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lx0/y;->L(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const-string v1, "FragmentManager"

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, "moveto RESUMED: "

    .line 11
    .line 12
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v2, p0, Lx0/e0;->c:Lx0/i;

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 29
    .line 30
    invoke-virtual {v0}, Lx0/i;->getFocusedView()Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v2, 0x0

    .line 35
    if-eqz v0, :cond_5

    .line 36
    .line 37
    iget-object v3, p0, Lx0/e0;->c:Lx0/i;

    .line 38
    .line 39
    iget-object v3, v3, Lx0/i;->mView:Landroid/view/View;

    .line 40
    .line 41
    const/4 v4, 0x1

    .line 42
    if-ne v0, v3, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    :goto_0
    if-eqz v3, :cond_3

    .line 50
    .line 51
    iget-object v5, p0, Lx0/e0;->c:Lx0/i;

    .line 52
    .line 53
    iget-object v5, v5, Lx0/i;->mView:Landroid/view/View;

    .line 54
    .line 55
    if-ne v3, v5, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    invoke-interface {v3}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    goto :goto_0

    .line 63
    :cond_3
    move v4, v2

    .line 64
    :goto_1
    if-eqz v4, :cond_5

    .line 65
    .line 66
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    const/4 v4, 0x2

    .line 71
    invoke-static {v4}, Lx0/y;->L(I)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_5

    .line 76
    .line 77
    new-instance v4, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    .line 82
    const-string v5, "requestFocus: Restoring focused view "

    .line 83
    .line 84
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v0, " "

    .line 91
    .line 92
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    if-eqz v3, :cond_4

    .line 96
    .line 97
    const-string v0, "succeeded"

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_4
    const-string v0, "failed"

    .line 101
    .line 102
    :goto_2
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v0, " on Fragment "

    .line 106
    .line 107
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 111
    .line 112
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string v0, " resulting in focused view "

    .line 116
    .line 117
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 121
    .line 122
    iget-object v0, v0, Lx0/i;->mView:Landroid/view/View;

    .line 123
    .line 124
    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 136
    .line 137
    .line 138
    :cond_5
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 139
    .line 140
    const/4 v1, 0x0

    .line 141
    invoke-virtual {v0, v1}, Lx0/i;->setFocusedView(Landroid/view/View;)V

    .line 142
    .line 143
    .line 144
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 145
    .line 146
    invoke-virtual {v0}, Lx0/i;->performResume()V

    .line 147
    .line 148
    .line 149
    iget-object v0, p0, Lx0/e0;->a:Lx0/v;

    .line 150
    .line 151
    iget-object v3, p0, Lx0/e0;->c:Lx0/i;

    .line 152
    .line 153
    invoke-virtual {v0, v3, v2}, Lx0/v;->i(Lx0/i;Z)V

    .line 154
    .line 155
    .line 156
    iget-object v0, p0, Lx0/e0;->b:Lx0/f0;

    .line 157
    .line 158
    iget-object v2, p0, Lx0/e0;->c:Lx0/i;

    .line 159
    .line 160
    iget-object v2, v2, Lx0/i;->mWho:Ljava/lang/String;

    .line 161
    .line 162
    invoke-virtual {v0, v1, v2}, Lx0/f0;->j(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;

    .line 163
    .line 164
    .line 165
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 166
    .line 167
    iput-object v1, v0, Lx0/i;->mSavedFragmentState:Landroid/os/Bundle;

    .line 168
    .line 169
    iput-object v1, v0, Lx0/i;->mSavedViewState:Landroid/util/SparseArray;

    .line 170
    .line 171
    iput-object v1, v0, Lx0/i;->mSavedViewRegistryState:Landroid/os/Bundle;

    .line 172
    .line 173
    return-void
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
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
.end method

.method public final o()Landroid/os/Bundle;
    .locals 5

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    iget v2, v1, Lx0/i;->mState:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    iget-object v1, v1, Lx0/i;->mSavedFragmentState:Landroid/os/Bundle;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_0
    new-instance v1, Lx0/d0;

    iget-object v2, p0, Lx0/e0;->c:Lx0/i;

    invoke-direct {v1, v2}, Lx0/d0;-><init>(Lx0/i;)V

    const-string v2, "state"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    iget v1, v1, Lx0/i;->mState:I

    if-le v1, v3, :cond_6

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-object v2, p0, Lx0/e0;->c:Lx0/i;

    invoke-virtual {v2, v1}, Lx0/i;->performSaveInstanceState(Landroid/os/Bundle;)V

    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "savedInstanceState"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_1
    iget-object v2, p0, Lx0/e0;->a:Lx0/v;

    iget-object v3, p0, Lx0/e0;->c:Lx0/i;

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v1, v4}, Lx0/v;->j(Lx0/i;Landroid/os/Bundle;Z)V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-object v2, p0, Lx0/e0;->c:Lx0/i;

    iget-object v2, v2, Lx0/i;->mSavedStateRegistryController:Ls1/d;

    invoke-virtual {v2, v1}, Ls1/d;->c(Landroid/os/Bundle;)V

    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "registryState"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_2
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    iget-object v1, v1, Lx0/i;->mChildFragmentManager:Lx0/y;

    invoke-virtual {v1}, Lx0/y;->W()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "childFragmentManager"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_3
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    iget-object v1, v1, Lx0/i;->mView:Landroid/view/View;

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lx0/e0;->p()V

    :cond_4
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    iget-object v1, v1, Lx0/i;->mSavedViewState:Landroid/util/SparseArray;

    if-eqz v1, :cond_5

    const-string v2, "viewState"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    :cond_5
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    iget-object v1, v1, Lx0/i;->mSavedViewRegistryState:Landroid/os/Bundle;

    if-eqz v1, :cond_6

    const-string v2, "viewRegistryState"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_6
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    iget-object v1, v1, Lx0/i;->mArguments:Landroid/os/Bundle;

    if-eqz v1, :cond_7

    const-string v2, "arguments"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_7
    return-object v0
.end method

.method public final p()V
    .locals 2

    .line 1
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 2
    .line 3
    iget-object v0, v0, Lx0/i;->mView:Landroid/view/View;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x2

    .line 9
    invoke-static {v0}, Lx0/y;->L(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const-string v0, "Saving view state for fragment "

    .line 16
    .line 17
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, " with view "

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 32
    .line 33
    iget-object v1, v1, Lx0/i;->mView:Landroid/view/View;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v1, "FragmentManager"

    .line 43
    .line 44
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    :cond_1
    new-instance v0, Landroid/util/SparseArray;

    .line 48
    .line 49
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 53
    .line 54
    iget-object v1, v1, Lx0/i;->mView:Landroid/view/View;

    .line 55
    .line 56
    invoke-virtual {v1, v0}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-lez v1, :cond_2

    .line 64
    .line 65
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 66
    .line 67
    iput-object v0, v1, Lx0/i;->mSavedViewState:Landroid/util/SparseArray;

    .line 68
    .line 69
    :cond_2
    new-instance v0, Landroid/os/Bundle;

    .line 70
    .line 71
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 72
    .line 73
    .line 74
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 75
    .line 76
    iget-object v1, v1, Lx0/i;->mViewLifecycleOwner:Lx0/o0;

    .line 77
    .line 78
    iget-object v1, v1, Lx0/o0;->e:Ls1/d;

    .line 79
    .line 80
    invoke-virtual {v1, v0}, Ls1/d;->c(Landroid/os/Bundle;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_3

    .line 88
    .line 89
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 90
    .line 91
    iput-object v0, v1, Lx0/i;->mSavedViewRegistryState:Landroid/os/Bundle;

    .line 92
    .line 93
    :cond_3
    return-void
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
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
.end method

.method public final q()V
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lx0/y;->L(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "moveto STARTED: "

    .line 9
    .line 10
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "FragmentManager"

    .line 24
    .line 25
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 29
    .line 30
    invoke-virtual {v0}, Lx0/i;->performStart()V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lx0/e0;->a:Lx0/v;

    .line 34
    .line 35
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-virtual {v0, v1, v2}, Lx0/v;->k(Lx0/i;Z)V

    .line 39
    .line 40
    .line 41
    return-void
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
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
.end method

.method public final r()V
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, Lx0/y;->L(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "movefrom STARTED: "

    .line 9
    .line 10
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "FragmentManager"

    .line 24
    .line 25
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lx0/e0;->c:Lx0/i;

    .line 29
    .line 30
    invoke-virtual {v0}, Lx0/i;->performStop()V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lx0/e0;->a:Lx0/v;

    .line 34
    .line 35
    iget-object v1, p0, Lx0/e0;->c:Lx0/i;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-virtual {v0, v1, v2}, Lx0/v;->l(Lx0/i;Z)V

    .line 39
    .line 40
    .line 41
    return-void
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
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
.end method
