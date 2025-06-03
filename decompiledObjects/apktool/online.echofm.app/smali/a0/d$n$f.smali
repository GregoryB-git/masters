.class public La0/d$n$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La0/d$n;->e(La0/d$o;Ljava/lang/String;IILandroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:La0/d$o;

.field public final synthetic p:I

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:I

.field public final synthetic s:Landroid/os/Bundle;

.field public final synthetic t:La0/d$n;


# direct methods
.method public constructor <init>(La0/d$n;La0/d$o;ILjava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    .line 1
    iput-object p1, p0, La0/d$n$f;->t:La0/d$n;

    .line 2
    .line 3
    iput-object p2, p0, La0/d$n$f;->o:La0/d$o;

    .line 4
    .line 5
    iput p3, p0, La0/d$n$f;->p:I

    .line 6
    .line 7
    iput-object p4, p0, La0/d$n$f;->q:Ljava/lang/String;

    .line 8
    .line 9
    iput p5, p0, La0/d$n$f;->r:I

    .line 10
    .line 11
    iput-object p6, p0, La0/d$n$f;->s:Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    .line 1
    iget-object v0, p0, La0/d$n$f;->o:La0/d$o;

    .line 2
    .line 3
    invoke-interface {v0}, La0/d$o;->asBinder()Landroid/os/IBinder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, La0/d$n$f;->t:La0/d$n;

    .line 8
    .line 9
    iget-object v1, v1, La0/d$n;->a:La0/d;

    .line 10
    .line 11
    iget-object v1, v1, La0/d;->s:Lt/a;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lt/h;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, La0/d$n$f;->t:La0/d$n;

    .line 17
    .line 18
    iget-object v1, v1, La0/d$n;->a:La0/d;

    .line 19
    .line 20
    iget-object v1, v1, La0/d;->r:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v2, :cond_3

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, La0/d$f;

    .line 38
    .line 39
    iget v4, v2, La0/d$f;->c:I

    .line 40
    .line 41
    iget v5, p0, La0/d$n$f;->p:I

    .line 42
    .line 43
    if-ne v4, v5, :cond_0

    .line 44
    .line 45
    iget-object v4, p0, La0/d$n$f;->q:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-nez v4, :cond_1

    .line 52
    .line 53
    iget v4, p0, La0/d$n$f;->r:I

    .line 54
    .line 55
    if-gtz v4, :cond_2

    .line 56
    .line 57
    :cond_1
    new-instance v3, La0/d$f;

    .line 58
    .line 59
    iget-object v4, p0, La0/d$n$f;->t:La0/d$n;

    .line 60
    .line 61
    iget-object v6, v4, La0/d$n;->a:La0/d;

    .line 62
    .line 63
    iget-object v7, v2, La0/d$f;->a:Ljava/lang/String;

    .line 64
    .line 65
    iget v8, v2, La0/d$f;->b:I

    .line 66
    .line 67
    iget v9, v2, La0/d$f;->c:I

    .line 68
    .line 69
    iget-object v10, p0, La0/d$n$f;->s:Landroid/os/Bundle;

    .line 70
    .line 71
    iget-object v11, p0, La0/d$n$f;->o:La0/d$o;

    .line 72
    .line 73
    move-object v5, v3

    .line 74
    invoke-direct/range {v5 .. v11}, La0/d$f;-><init>(La0/d;Ljava/lang/String;IILandroid/os/Bundle;La0/d$o;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 78
    .line 79
    .line 80
    :cond_3
    if-nez v3, :cond_4

    .line 81
    .line 82
    new-instance v3, La0/d$f;

    .line 83
    .line 84
    iget-object v1, p0, La0/d$n$f;->t:La0/d$n;

    .line 85
    .line 86
    iget-object v5, v1, La0/d$n;->a:La0/d;

    .line 87
    .line 88
    iget-object v6, p0, La0/d$n$f;->q:Ljava/lang/String;

    .line 89
    .line 90
    iget v7, p0, La0/d$n$f;->r:I

    .line 91
    .line 92
    iget v8, p0, La0/d$n$f;->p:I

    .line 93
    .line 94
    iget-object v9, p0, La0/d$n$f;->s:Landroid/os/Bundle;

    .line 95
    .line 96
    iget-object v10, p0, La0/d$n$f;->o:La0/d$o;

    .line 97
    .line 98
    move-object v4, v3

    .line 99
    invoke-direct/range {v4 .. v10}, La0/d$f;-><init>(La0/d;Ljava/lang/String;IILandroid/os/Bundle;La0/d$o;)V

    .line 100
    .line 101
    .line 102
    :cond_4
    iget-object v1, p0, La0/d$n$f;->t:La0/d$n;

    .line 103
    .line 104
    iget-object v1, v1, La0/d$n;->a:La0/d;

    .line 105
    .line 106
    iget-object v1, v1, La0/d;->s:Lt/a;

    .line 107
    .line 108
    invoke-virtual {v1, v0, v3}, Lt/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    const/4 v1, 0x0

    .line 112
    :try_start_0
    invoke-interface {v0, v3, v1}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :catch_0
    const-string v0, "MBServiceCompat"

    .line 117
    .line 118
    const-string v1, "IBinder is already dead."

    .line 119
    .line 120
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    :goto_0
    return-void
.end method
