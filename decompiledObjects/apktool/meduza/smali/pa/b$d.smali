.class public final Lpa/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls5/c$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpa/b;->i(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lpa/b;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpa/b;)V
    .locals 0

    iput-object p1, p0, Lpa/b$d;->a:Ljava/lang/String;

    iput-object p2, p0, Lpa/b$d;->b:Landroid/content/Context;

    iput-object p3, p0, Lpa/b$d;->c:Ljava/lang/String;

    iput-object p4, p0, Lpa/b$d;->d:Ljava/lang/String;

    iput-object p5, p0, Lpa/b$d;->e:Ljava/lang/String;

    iput-object p6, p0, Lpa/b$d;->f:Lpa/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lv3/f1;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "player"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lpa/b$d;->a:Ljava/lang/String;

    return-object p1
.end method

.method public final b(Lv3/f1;Ls5/c$a;)Landroid/graphics/Bitmap;
    .locals 4

    .line 1
    const-string v0, "player"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lpa/b$d;->e:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object p1, p0, Lpa/b$d;->f:Lpa/b;

    .line 13
    .line 14
    iget-object p1, p1, Lpa/b;->m:Landroid/graphics/Bitmap;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_1
    new-instance p1, Lo2/l$a;

    .line 20
    .line 21
    const-class v1, Lcom/jhomlala/better_player/ImageWorker;

    .line 22
    .line 23
    invoke-direct {p1, v1}, Lo2/l$a;-><init>(Ljava/lang/Class;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lpa/b$d;->e:Ljava/lang/String;

    .line 27
    .line 28
    const-string v2, "tag"

    .line 29
    .line 30
    invoke-static {v1, v2}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, p1, Lo2/q$a;->d:Ljava/util/LinkedHashSet;

    .line 34
    .line 35
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    new-instance v1, Ljava/util/HashMap;

    .line 39
    .line 40
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 41
    .line 42
    .line 43
    iget-object v2, p0, Lpa/b$d;->e:Ljava/lang/String;

    .line 44
    .line 45
    const-string v3, "url"

    .line 46
    .line 47
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    new-instance v2, Landroidx/work/c;

    .line 51
    .line 52
    invoke-direct {v2, v1}, Landroidx/work/c;-><init>(Ljava/util/HashMap;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v2}, Landroidx/work/c;->e(Landroidx/work/c;)[B

    .line 56
    .line 57
    .line 58
    iget-object v1, p1, Lo2/q$a;->c:Lx2/s;

    .line 59
    .line 60
    iput-object v2, v1, Lx2/s;->e:Landroidx/work/c;

    .line 61
    .line 62
    invoke-virtual {p1}, Lo2/q$a;->a()Lo2/q;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    const-string v1, "build(...)"

    .line 67
    .line 68
    invoke-static {p1, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    check-cast p1, Lo2/l;

    .line 72
    .line 73
    iget-object v1, p0, Lpa/b$d;->f:Lpa/b;

    .line 74
    .line 75
    iget-object v1, v1, Lpa/b;->p:Lp2/k0;

    .line 76
    .line 77
    invoke-virtual {v1, p1}, Lo2/p;->a(Lo2/q;)Lo2/m;

    .line 78
    .line 79
    .line 80
    iget-object v1, p0, Lpa/b$d;->f:Lpa/b;

    .line 81
    .line 82
    new-instance v2, Lpa/c;

    .line 83
    .line 84
    invoke-direct {v2, v1, p1, p2}, Lpa/c;-><init>(Lpa/b;Lo2/l;Ls5/c$a;)V

    .line 85
    .line 86
    .line 87
    iget-object p1, p1, Lo2/q;->a:Ljava/util/UUID;

    .line 88
    .line 89
    const-string p2, "getId(...)"

    .line 90
    .line 91
    invoke-static {p1, p2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    iget-object p2, p0, Lpa/b$d;->f:Lpa/b;

    .line 95
    .line 96
    iget-object p2, p2, Lpa/b;->p:Lp2/k0;

    .line 97
    .line 98
    invoke-virtual {p2, p1}, Lp2/k0;->e(Ljava/util/UUID;)Lb1/u;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    invoke-virtual {p2, v2}, Lb1/t;->observeForever(Lb1/x;)V

    .line 103
    .line 104
    .line 105
    iget-object p2, p0, Lpa/b$d;->f:Lpa/b;

    .line 106
    .line 107
    iget-object p2, p2, Lpa/b;->q:Ljava/util/HashMap;

    .line 108
    .line 109
    invoke-virtual {p2, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    return-object v0
    .line 113
    .line 114
    .line 115
.end method

.method public final synthetic c()V
    .locals 0

    return-void
.end method

.method public final d(Lv3/f1;)Landroid/app/PendingIntent;
    .locals 3

    const-string v0, "player"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lpa/b$d;->b:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x2e

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lpa/b$d;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/high16 p1, 0x24000000

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    iget-object p1, p0, Lpa/b$d;->b:Landroid/content/Context;

    const/4 v1, 0x0

    const/high16 v2, 0x4000000

    invoke-static {p1, v1, v0, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lv3/f1;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "player"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lpa/b$d;->d:Ljava/lang/String;

    return-object p1
.end method
