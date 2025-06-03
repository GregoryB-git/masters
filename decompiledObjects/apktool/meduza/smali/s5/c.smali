.class public final Ls5/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls5/c$d;,
        Ls5/c$f;,
        Ls5/c$a;,
        Ls5/c$e;,
        Ls5/c$b;,
        Ls5/c$c;
    }
.end annotation


# static fields
.field public static G:I


# instance fields
.field public A:Z

.field public B:I

.field public C:I

.field public D:I

.field public E:Z

.field public F:Ljava/lang/String;

.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:Ls5/c$c;

.field public final e:Landroid/os/Handler;

.field public final f:Lu/u;

.field public final g:Landroid/content/IntentFilter;

.field public final h:Ls5/c$f;

.field public final i:Ls5/c$d;

.field public final j:Ljava/util/HashMap;

.field public final k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lu/n;",
            ">;"
        }
    .end annotation
.end field

.field public final l:Landroid/app/PendingIntent;

.field public final m:I

.field public n:Lu/q;

.field public o:Ljava/util/ArrayList;

.field public p:Lv3/f1;

.field public q:Z

.field public r:I

.field public s:Landroid/support/v4/media/session/MediaSessionCompat$Token;

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:Z

.field public x:Z

.field public y:Z

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;ILs5/c$c;IIIIIIII)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ls5/c;->a:Landroid/content/Context;

    iput-object p2, p0, Ls5/c;->b:Ljava/lang/String;

    iput p3, p0, Ls5/c;->c:I

    iput-object p4, p0, Ls5/c;->d:Ls5/c$c;

    const/4 p2, 0x0

    iput p5, p0, Ls5/c;->B:I

    iput-object p2, p0, Ls5/c;->F:Ljava/lang/String;

    sget p2, Ls5/c;->G:I

    add-int/lit8 p3, p2, 0x1

    sput p3, Ls5/c;->G:I

    iput p2, p0, Ls5/c;->m:I

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p3

    new-instance p4, Ls5/b;

    const/4 p5, 0x0

    invoke-direct {p4, p0, p5}, Ls5/b;-><init>(Ljava/lang/Object;I)V

    sget p5, Lv5/e0;->a:I

    .line 1
    new-instance p5, Landroid/os/Handler;

    invoke-direct {p5, p3, p4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 2
    iput-object p5, p0, Ls5/c;->e:Landroid/os/Handler;

    .line 3
    new-instance p3, Lu/u;

    invoke-direct {p3, p1}, Lu/u;-><init>(Landroid/content/Context;)V

    .line 4
    iput-object p3, p0, Ls5/c;->f:Lu/u;

    new-instance p3, Ls5/c$f;

    invoke-direct {p3, p0}, Ls5/c$f;-><init>(Ls5/c;)V

    iput-object p3, p0, Ls5/c;->h:Ls5/c$f;

    new-instance p3, Ls5/c$d;

    invoke-direct {p3, p0}, Ls5/c$d;-><init>(Ls5/c;)V

    iput-object p3, p0, Ls5/c;->i:Ls5/c$d;

    new-instance p3, Landroid/content/IntentFilter;

    invoke-direct {p3}, Landroid/content/IntentFilter;-><init>()V

    iput-object p3, p0, Ls5/c;->g:Landroid/content/IntentFilter;

    const/4 p3, 0x1

    iput-boolean p3, p0, Ls5/c;->t:Z

    iput-boolean p3, p0, Ls5/c;->u:Z

    iput-boolean p3, p0, Ls5/c;->x:Z

    iput-boolean p3, p0, Ls5/c;->v:Z

    iput-boolean p3, p0, Ls5/c;->w:Z

    iput-boolean p3, p0, Ls5/c;->A:Z

    iput-boolean p3, p0, Ls5/c;->E:Z

    const/4 p4, -0x1

    iput p4, p0, Ls5/c;->D:I

    iput p3, p0, Ls5/c;->z:I

    iput p3, p0, Ls5/c;->C:I

    .line 5
    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    new-instance p4, Lu/n;

    const p5, 0x7f12004b

    invoke-virtual {p1, p5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p5

    const-string v0, "com.google.android.exoplayer.play"

    invoke-static {p1, v0, p2}, Ls5/c;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-direct {p4, p6, p5, v1}, Lu/n;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    invoke-virtual {p3, v0, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p4, Lu/n;

    const p5, 0x7f12004a

    invoke-virtual {p1, p5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p5

    const-string p6, "com.google.android.exoplayer.pause"

    invoke-static {p1, p6, p2}, Ls5/c;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/app/PendingIntent;

    move-result-object v0

    invoke-direct {p4, p7, p5, v0}, Lu/n;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    invoke-virtual {p3, p6, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p4, Lu/n;

    const p5, 0x7f120057

    invoke-virtual {p1, p5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p5

    const-string p6, "com.google.android.exoplayer.stop"

    invoke-static {p1, p6, p2}, Ls5/c;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/app/PendingIntent;

    move-result-object p7

    invoke-direct {p4, p8, p5, p7}, Lu/n;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    invoke-virtual {p3, p6, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p4, Lu/n;

    const p5, 0x7f120051

    invoke-virtual {p1, p5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p5

    const-string p6, "com.google.android.exoplayer.rewind"

    invoke-static {p1, p6, p2}, Ls5/c;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/app/PendingIntent;

    move-result-object p7

    invoke-direct {p4, p9, p5, p7}, Lu/n;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    invoke-virtual {p3, p6, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p4, Lu/n;

    const p5, 0x7f120043

    invoke-virtual {p1, p5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p5

    const-string p6, "com.google.android.exoplayer.ffwd"

    invoke-static {p1, p6, p2}, Ls5/c;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/app/PendingIntent;

    move-result-object p7

    invoke-direct {p4, p10, p5, p7}, Lu/n;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    invoke-virtual {p3, p6, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p4, Lu/n;

    const p5, 0x7f12004d

    invoke-virtual {p1, p5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p5

    const-string p6, "com.google.android.exoplayer.prev"

    invoke-static {p1, p6, p2}, Ls5/c;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/app/PendingIntent;

    move-result-object p7

    invoke-direct {p4, p11, p5, p7}, Lu/n;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    invoke-virtual {p3, p6, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p4, Lu/n;

    const p5, 0x7f120047

    invoke-virtual {p1, p5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p5

    const-string p6, "com.google.android.exoplayer.next"

    invoke-static {p1, p6, p2}, Ls5/c;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/app/PendingIntent;

    move-result-object p2

    invoke-direct {p4, p12, p5, p2}, Lu/n;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    invoke-virtual {p3, p6, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    iput-object p3, p0, Ls5/c;->j:Ljava/util/HashMap;

    invoke-virtual {p3}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    iget-object p4, p0, Ls5/c;->g:Landroid/content/IntentFilter;

    invoke-virtual {p4, p3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p2

    iput-object p2, p0, Ls5/c;->k:Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    iget-object p4, p0, Ls5/c;->g:Landroid/content/IntentFilter;

    invoke-virtual {p4, p3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    iget p2, p0, Ls5/c;->m:I

    const-string p3, "com.google.android.exoplayer.dismiss"

    invoke-static {p1, p3, p2}, Ls5/c;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/app/PendingIntent;

    move-result-object p1

    iput-object p1, p0, Ls5/c;->l:Landroid/app/PendingIntent;

    iget-object p1, p0, Ls5/c;->g:Landroid/content/IntentFilter;

    invoke-virtual {p1, p3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;I)Landroid/app/PendingIntent;
    .locals 2

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    const-string v0, "INSTANCE_ID"

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    sget v0, Lv5/e0;->a:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    const/high16 v0, 0xc000000

    goto :goto_0

    :cond_0
    const/high16 v0, 0x8000000

    :goto_0
    invoke-static {p0, p2, p1, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Lv3/j0;)V
    .locals 4

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Lx6/b;->H(Z)V

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lv3/j0;->K()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    move v3, v2

    :cond_2
    :goto_1
    invoke-static {v3}, Lx6/b;->q(Z)V

    iget-object v0, p0, Ls5/c;->p:Lv3/f1;

    if-ne v0, p1, :cond_3

    return-void

    :cond_3
    if-eqz v0, :cond_4

    iget-object v1, p0, Ls5/c;->h:Ls5/c$f;

    invoke-interface {v0, v1}, Lv3/f1;->h(Lv3/f1$c;)V

    if-nez p1, :cond_4

    invoke-virtual {p0, v2}, Ls5/c;->d(Z)V

    :cond_4
    iput-object p1, p0, Ls5/c;->p:Lv3/f1;

    if-eqz p1, :cond_5

    iget-object v0, p0, Ls5/c;->h:Ls5/c$f;

    invoke-virtual {p1, v0}, Lv3/j0;->s(Lv3/f1$c;)V

    iget-object p1, p0, Ls5/c;->e:Landroid/os/Handler;

    invoke-virtual {p1, v2}, Landroid/os/Handler;->hasMessages(I)Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, p0, Ls5/c;->e:Landroid/os/Handler;

    invoke-virtual {p1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_5
    return-void
.end method

.method public final c(Lv3/f1;Landroid/graphics/Bitmap;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-interface/range {p1 .. p1}, Lv3/f1;->d()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    const/4 v5, 0x3

    .line 12
    const/4 v6, 0x2

    .line 13
    if-eq v2, v6, :cond_0

    .line 14
    .line 15
    if-ne v2, v5, :cond_1

    .line 16
    .line 17
    :cond_0
    invoke-interface/range {p1 .. p1}, Lv3/f1;->k()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    move v2, v4

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move v2, v3

    .line 26
    :goto_0
    iget-object v7, v0, Ls5/c;->n:Lu/q;

    .line 27
    .line 28
    invoke-interface/range {p1 .. p1}, Lv3/f1;->d()I

    .line 29
    .line 30
    .line 31
    move-result v8

    .line 32
    const/4 v9, 0x0

    .line 33
    if-ne v8, v4, :cond_2

    .line 34
    .line 35
    invoke-interface/range {p1 .. p1}, Lv3/f1;->J()Lv3/r1;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    invoke-virtual {v8}, Lv3/r1;->p()Z

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    if-eqz v8, :cond_2

    .line 44
    .line 45
    iput-object v9, v0, Ls5/c;->o:Ljava/util/ArrayList;

    .line 46
    .line 47
    goto/16 :goto_b

    .line 48
    .line 49
    :cond_2
    const/4 v8, 0x7

    .line 50
    invoke-interface {v1, v8}, Lv3/f1;->G(I)Z

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    const/16 v9, 0xb

    .line 55
    .line 56
    invoke-interface {v1, v9}, Lv3/f1;->G(I)Z

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    const/16 v10, 0xc

    .line 61
    .line 62
    invoke-interface {v1, v10}, Lv3/f1;->G(I)Z

    .line 63
    .line 64
    .line 65
    move-result v10

    .line 66
    const/16 v11, 0x9

    .line 67
    .line 68
    invoke-interface {v1, v11}, Lv3/f1;->G(I)Z

    .line 69
    .line 70
    .line 71
    move-result v11

    .line 72
    new-instance v12, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    iget-boolean v13, v0, Ls5/c;->t:Z

    .line 78
    .line 79
    if-eqz v13, :cond_3

    .line 80
    .line 81
    if-eqz v8, :cond_3

    .line 82
    .line 83
    const-string v8, "com.google.android.exoplayer.prev"

    .line 84
    .line 85
    invoke-virtual {v12, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    :cond_3
    iget-boolean v8, v0, Ls5/c;->v:Z

    .line 89
    .line 90
    if-eqz v8, :cond_4

    .line 91
    .line 92
    if-eqz v9, :cond_4

    .line 93
    .line 94
    const-string v8, "com.google.android.exoplayer.rewind"

    .line 95
    .line 96
    invoke-virtual {v12, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    :cond_4
    iget-boolean v8, v0, Ls5/c;->x:Z

    .line 100
    .line 101
    const-string v9, "com.google.android.exoplayer.pause"

    .line 102
    .line 103
    const-string v13, "com.google.android.exoplayer.play"

    .line 104
    .line 105
    const/4 v14, 0x4

    .line 106
    if-eqz v8, :cond_7

    .line 107
    .line 108
    invoke-interface/range {p1 .. p1}, Lv3/f1;->d()I

    .line 109
    .line 110
    .line 111
    move-result v8

    .line 112
    if-eq v8, v14, :cond_5

    .line 113
    .line 114
    invoke-interface/range {p1 .. p1}, Lv3/f1;->d()I

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    if-eq v8, v4, :cond_5

    .line 119
    .line 120
    invoke-interface/range {p1 .. p1}, Lv3/f1;->k()Z

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    if-eqz v8, :cond_5

    .line 125
    .line 126
    move v8, v4

    .line 127
    goto :goto_1

    .line 128
    :cond_5
    move v8, v3

    .line 129
    :goto_1
    if-eqz v8, :cond_6

    .line 130
    .line 131
    move-object v8, v9

    .line 132
    goto :goto_2

    .line 133
    :cond_6
    move-object v8, v13

    .line 134
    :goto_2
    invoke-virtual {v12, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    :cond_7
    iget-boolean v8, v0, Ls5/c;->w:Z

    .line 138
    .line 139
    if-eqz v8, :cond_8

    .line 140
    .line 141
    if-eqz v10, :cond_8

    .line 142
    .line 143
    const-string v8, "com.google.android.exoplayer.ffwd"

    .line 144
    .line 145
    invoke-virtual {v12, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    :cond_8
    iget-boolean v8, v0, Ls5/c;->u:Z

    .line 149
    .line 150
    if-eqz v8, :cond_9

    .line 151
    .line 152
    if-eqz v11, :cond_9

    .line 153
    .line 154
    const-string v8, "com.google.android.exoplayer.next"

    .line 155
    .line 156
    invoke-virtual {v12, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    :cond_9
    iget-boolean v8, v0, Ls5/c;->y:Z

    .line 160
    .line 161
    if-eqz v8, :cond_a

    .line 162
    .line 163
    const-string v8, "com.google.android.exoplayer.stop"

    .line 164
    .line 165
    invoke-virtual {v12, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    :cond_a
    new-instance v8, Ljava/util/ArrayList;

    .line 169
    .line 170
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 171
    .line 172
    .line 173
    move-result v10

    .line 174
    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 175
    .line 176
    .line 177
    move v10, v3

    .line 178
    :goto_3
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 179
    .line 180
    .line 181
    move-result v11

    .line 182
    if-ge v10, v11, :cond_d

    .line 183
    .line 184
    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v11

    .line 188
    check-cast v11, Ljava/lang/String;

    .line 189
    .line 190
    iget-object v15, v0, Ls5/c;->j:Ljava/util/HashMap;

    .line 191
    .line 192
    invoke-virtual {v15, v11}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v15

    .line 196
    if-eqz v15, :cond_b

    .line 197
    .line 198
    iget-object v15, v0, Ls5/c;->j:Ljava/util/HashMap;

    .line 199
    .line 200
    invoke-virtual {v15, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v11

    .line 204
    goto :goto_4

    .line 205
    :cond_b
    iget-object v15, v0, Ls5/c;->k:Ljava/util/Map;

    .line 206
    .line 207
    invoke-interface {v15, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v11

    .line 211
    :goto_4
    check-cast v11, Lu/n;

    .line 212
    .line 213
    if-eqz v11, :cond_c

    .line 214
    .line 215
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    :cond_c
    add-int/lit8 v10, v10, 0x1

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :cond_d
    if-eqz v7, :cond_e

    .line 222
    .line 223
    iget-object v10, v0, Ls5/c;->o:Ljava/util/ArrayList;

    .line 224
    .line 225
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v10

    .line 229
    if-nez v10, :cond_10

    .line 230
    .line 231
    :cond_e
    new-instance v7, Lu/q;

    .line 232
    .line 233
    iget-object v10, v0, Ls5/c;->a:Landroid/content/Context;

    .line 234
    .line 235
    iget-object v11, v0, Ls5/c;->b:Ljava/lang/String;

    .line 236
    .line 237
    invoke-direct {v7, v10, v11}, Lu/q;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    iput-object v8, v0, Ls5/c;->o:Ljava/util/ArrayList;

    .line 241
    .line 242
    move v10, v3

    .line 243
    :goto_5
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 244
    .line 245
    .line 246
    move-result v11

    .line 247
    if-ge v10, v11, :cond_10

    .line 248
    .line 249
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v11

    .line 253
    check-cast v11, Lu/n;

    .line 254
    .line 255
    if-eqz v11, :cond_f

    .line 256
    .line 257
    iget-object v15, v7, Lu/q;->b:Ljava/util/ArrayList;

    .line 258
    .line 259
    invoke-virtual {v15, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    :cond_f
    add-int/lit8 v10, v10, 0x1

    .line 263
    .line 264
    goto :goto_5

    .line 265
    :cond_10
    new-instance v8, Lh1/b;

    .line 266
    .line 267
    invoke-direct {v8}, Lh1/b;-><init>()V

    .line 268
    .line 269
    .line 270
    iget-object v10, v0, Ls5/c;->s:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 271
    .line 272
    if-eqz v10, :cond_11

    .line 273
    .line 274
    iput-object v10, v8, Lh1/b;->c:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 275
    .line 276
    :cond_11
    invoke-virtual {v12, v9}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 277
    .line 278
    .line 279
    move-result v9

    .line 280
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 281
    .line 282
    .line 283
    move-result v10

    .line 284
    new-array v5, v5, [I

    .line 285
    .line 286
    invoke-interface/range {p1 .. p1}, Lv3/f1;->d()I

    .line 287
    .line 288
    .line 289
    move-result v11

    .line 290
    if-eq v11, v14, :cond_12

    .line 291
    .line 292
    invoke-interface/range {p1 .. p1}, Lv3/f1;->d()I

    .line 293
    .line 294
    .line 295
    move-result v11

    .line 296
    if-eq v11, v4, :cond_12

    .line 297
    .line 298
    invoke-interface/range {p1 .. p1}, Lv3/f1;->k()Z

    .line 299
    .line 300
    .line 301
    move-result v11

    .line 302
    if-eqz v11, :cond_12

    .line 303
    .line 304
    move v11, v4

    .line 305
    goto :goto_6

    .line 306
    :cond_12
    move v11, v3

    .line 307
    :goto_6
    const/4 v12, -0x1

    .line 308
    if-eq v9, v12, :cond_13

    .line 309
    .line 310
    if-eqz v11, :cond_13

    .line 311
    .line 312
    aput v9, v5, v3

    .line 313
    .line 314
    goto :goto_7

    .line 315
    :cond_13
    if-eq v10, v12, :cond_14

    .line 316
    .line 317
    if-nez v11, :cond_14

    .line 318
    .line 319
    aput v10, v5, v3

    .line 320
    .line 321
    :goto_7
    move v9, v4

    .line 322
    goto :goto_8

    .line 323
    :cond_14
    move v9, v3

    .line 324
    :goto_8
    invoke-static {v5, v9}, Ljava/util/Arrays;->copyOf([II)[I

    .line 325
    .line 326
    .line 327
    move-result-object v5

    .line 328
    iput-object v5, v8, Lh1/b;->b:[I

    .line 329
    .line 330
    invoke-virtual {v7, v8}, Lu/q;->g(Lu/s;)V

    .line 331
    .line 332
    .line 333
    iget-object v5, v0, Ls5/c;->l:Landroid/app/PendingIntent;

    .line 334
    .line 335
    iget-object v8, v7, Lu/q;->B:Landroid/app/Notification;

    .line 336
    .line 337
    iput-object v5, v8, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 338
    .line 339
    iget v5, v0, Ls5/c;->z:I

    .line 340
    .line 341
    iput v5, v7, Lu/q;->z:I

    .line 342
    .line 343
    invoke-virtual {v7, v6, v2}, Lu/q;->d(IZ)V

    .line 344
    .line 345
    .line 346
    iput v3, v7, Lu/q;->w:I

    .line 347
    .line 348
    iget-boolean v2, v0, Ls5/c;->A:Z

    .line 349
    .line 350
    iput-boolean v2, v7, Lu/q;->t:Z

    .line 351
    .line 352
    iput-boolean v4, v7, Lu/q;->u:Z

    .line 353
    .line 354
    iget v2, v0, Ls5/c;->B:I

    .line 355
    .line 356
    iget-object v5, v7, Lu/q;->B:Landroid/app/Notification;

    .line 357
    .line 358
    iput v2, v5, Landroid/app/Notification;->icon:I

    .line 359
    .line 360
    iget v2, v0, Ls5/c;->C:I

    .line 361
    .line 362
    iput v2, v7, Lu/q;->x:I

    .line 363
    .line 364
    iget v2, v0, Ls5/c;->D:I

    .line 365
    .line 366
    iput v2, v7, Lu/q;->j:I

    .line 367
    .line 368
    iput v3, v5, Landroid/app/Notification;->defaults:I

    .line 369
    .line 370
    sget v2, Lv5/e0;->a:I

    .line 371
    .line 372
    const/16 v5, 0x15

    .line 373
    .line 374
    if-lt v2, v5, :cond_15

    .line 375
    .line 376
    iget-boolean v2, v0, Ls5/c;->E:Z

    .line 377
    .line 378
    if-eqz v2, :cond_15

    .line 379
    .line 380
    invoke-interface/range {p1 .. p1}, Lv3/f1;->D()Z

    .line 381
    .line 382
    .line 383
    move-result v2

    .line 384
    if-eqz v2, :cond_15

    .line 385
    .line 386
    invoke-interface/range {p1 .. p1}, Lv3/f1;->g()Z

    .line 387
    .line 388
    .line 389
    move-result v2

    .line 390
    if-nez v2, :cond_15

    .line 391
    .line 392
    invoke-interface/range {p1 .. p1}, Lv3/f1;->H()Z

    .line 393
    .line 394
    .line 395
    move-result v2

    .line 396
    if-nez v2, :cond_15

    .line 397
    .line 398
    invoke-interface/range {p1 .. p1}, Lv3/f1;->f()Lv3/e1;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    iget v2, v2, Lv3/e1;->a:F

    .line 403
    .line 404
    const/high16 v5, 0x3f800000    # 1.0f

    .line 405
    .line 406
    cmpl-float v2, v2, v5

    .line 407
    .line 408
    if-nez v2, :cond_15

    .line 409
    .line 410
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 411
    .line 412
    .line 413
    move-result-wide v5

    .line 414
    invoke-interface/range {p1 .. p1}, Lv3/f1;->y()J

    .line 415
    .line 416
    .line 417
    move-result-wide v8

    .line 418
    sub-long/2addr v5, v8

    .line 419
    iget-object v2, v7, Lu/q;->B:Landroid/app/Notification;

    .line 420
    .line 421
    iput-wide v5, v2, Landroid/app/Notification;->when:J

    .line 422
    .line 423
    iput-boolean v4, v7, Lu/q;->k:Z

    .line 424
    .line 425
    iput-boolean v4, v7, Lu/q;->l:Z

    .line 426
    .line 427
    goto :goto_9

    .line 428
    :cond_15
    iput-boolean v3, v7, Lu/q;->k:Z

    .line 429
    .line 430
    iput-boolean v3, v7, Lu/q;->l:Z

    .line 431
    .line 432
    :goto_9
    iget-object v2, v0, Ls5/c;->d:Ls5/c$c;

    .line 433
    .line 434
    invoke-interface {v2, v1}, Ls5/c$c;->a(Lv3/f1;)Ljava/lang/CharSequence;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    invoke-static {v2}, Lu/q;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    iput-object v2, v7, Lu/q;->e:Ljava/lang/CharSequence;

    .line 443
    .line 444
    iget-object v2, v0, Ls5/c;->d:Ls5/c$c;

    .line 445
    .line 446
    invoke-interface {v2, v1}, Ls5/c$c;->e(Lv3/f1;)Ljava/lang/CharSequence;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    invoke-virtual {v7, v2}, Lu/q;->c(Ljava/lang/CharSequence;)V

    .line 451
    .line 452
    .line 453
    iget-object v2, v0, Ls5/c;->d:Ls5/c$c;

    .line 454
    .line 455
    invoke-interface {v2}, Ls5/c$c;->c()V

    .line 456
    .line 457
    .line 458
    const/4 v2, 0x0

    .line 459
    invoke-static {v2}, Lu/q;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    iput-object v2, v7, Lu/q;->n:Ljava/lang/CharSequence;

    .line 464
    .line 465
    if-nez p2, :cond_16

    .line 466
    .line 467
    iget-object v2, v0, Ls5/c;->d:Ls5/c$c;

    .line 468
    .line 469
    new-instance v5, Ls5/c$a;

    .line 470
    .line 471
    iget v6, v0, Ls5/c;->r:I

    .line 472
    .line 473
    add-int/2addr v6, v4

    .line 474
    iput v6, v0, Ls5/c;->r:I

    .line 475
    .line 476
    invoke-direct {v5, v0, v6}, Ls5/c$a;-><init>(Ls5/c;I)V

    .line 477
    .line 478
    .line 479
    invoke-interface {v2, v1, v5}, Ls5/c$c;->b(Lv3/f1;Ls5/c$a;)Landroid/graphics/Bitmap;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    goto :goto_a

    .line 484
    :cond_16
    move-object/from16 v2, p2

    .line 485
    .line 486
    :goto_a
    invoke-virtual {v7, v2}, Lu/q;->e(Landroid/graphics/Bitmap;)V

    .line 487
    .line 488
    .line 489
    iget-object v2, v0, Ls5/c;->d:Ls5/c$c;

    .line 490
    .line 491
    invoke-interface {v2, v1}, Ls5/c$c;->d(Lv3/f1;)Landroid/app/PendingIntent;

    .line 492
    .line 493
    .line 494
    move-result-object v1

    .line 495
    iput-object v1, v7, Lu/q;->g:Landroid/app/PendingIntent;

    .line 496
    .line 497
    iget-object v1, v0, Ls5/c;->F:Ljava/lang/String;

    .line 498
    .line 499
    if-eqz v1, :cond_17

    .line 500
    .line 501
    iput-object v1, v7, Lu/q;->r:Ljava/lang/String;

    .line 502
    .line 503
    :cond_17
    const/16 v1, 0x8

    .line 504
    .line 505
    invoke-virtual {v7, v1, v4}, Lu/q;->d(IZ)V

    .line 506
    .line 507
    .line 508
    move-object v9, v7

    .line 509
    :goto_b
    iput-object v9, v0, Ls5/c;->n:Lu/q;

    .line 510
    .line 511
    if-nez v9, :cond_18

    .line 512
    .line 513
    invoke-virtual {v0, v3}, Ls5/c;->d(Z)V

    .line 514
    .line 515
    .line 516
    return-void

    .line 517
    :cond_18
    invoke-virtual {v9}, Lu/q;->a()Landroid/app/Notification;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    iget-object v2, v0, Ls5/c;->f:Lu/u;

    .line 522
    .line 523
    iget v3, v0, Ls5/c;->c:I

    .line 524
    .line 525
    invoke-virtual {v2, v3, v1}, Lu/u;->b(ILandroid/app/Notification;)V

    .line 526
    .line 527
    .line 528
    iget-boolean v1, v0, Ls5/c;->q:Z

    .line 529
    .line 530
    if-nez v1, :cond_19

    .line 531
    .line 532
    iget-object v1, v0, Ls5/c;->a:Landroid/content/Context;

    .line 533
    .line 534
    iget-object v2, v0, Ls5/c;->i:Ls5/c$d;

    .line 535
    .line 536
    iget-object v3, v0, Ls5/c;->g:Landroid/content/IntentFilter;

    .line 537
    .line 538
    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 539
    .line 540
    .line 541
    :cond_19
    iput-boolean v4, v0, Ls5/c;->q:Z

    .line 542
    .line 543
    return-void
.end method

.method public final d(Z)V
    .locals 2

    .line 1
    iget-boolean p1, p0, Ls5/c;->q:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Ls5/c;->q:Z

    .line 7
    .line 8
    iget-object v0, p0, Ls5/c;->e:Landroid/os/Handler;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeMessages(I)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Ls5/c;->f:Lu/u;

    .line 14
    .line 15
    iget v0, p0, Ls5/c;->c:I

    .line 16
    .line 17
    iget-object p1, p1, Lu/u;->b:Landroid/app/NotificationManager;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {p1, v1, v0}, Landroid/app/NotificationManager;->cancel(Ljava/lang/String;I)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Ls5/c;->a:Landroid/content/Context;

    .line 24
    .line 25
    iget-object v0, p0, Ls5/c;->i:Ls5/c$d;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
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
.end method
