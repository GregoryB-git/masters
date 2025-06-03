.class public final Lx0/y$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx0/y;->c(Lx0/t;Lx0/p;Lx0/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld/b<",
        "Ld/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lx0/y;


# direct methods
.method public constructor <init>(Lx0/y;)V
    .locals 0

    iput-object p1, p0, Lx0/y$h;->a:Lx0/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Ld/a;

    .line 2
    .line 3
    iget-object v0, p0, Lx0/y$h;->a:Lx0/y;

    .line 4
    .line 5
    iget-object v0, v0, Lx0/y;->F:Ljava/util/ArrayDeque;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollLast()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lx0/y$k;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    new-instance p1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v0, "No Activities were started for result for "

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v1, v0, Lx0/y$k;->a:Ljava/lang/String;

    .line 30
    .line 31
    iget v0, v0, Lx0/y$k;->b:I

    .line 32
    .line 33
    iget-object v2, p0, Lx0/y$h;->a:Lx0/y;

    .line 34
    .line 35
    iget-object v2, v2, Lx0/y;->c:Lx0/f0;

    .line 36
    .line 37
    invoke-virtual {v2, v1}, Lx0/f0;->d(Ljava/lang/String;)Lx0/i;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    if-nez v2, :cond_1

    .line 42
    .line 43
    const-string p1, "Activity result delivered for unknown Fragment "

    .line 44
    .line 45
    invoke-static {p1, v1}, Lg;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    :goto_0
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const-string v0, "FragmentManager"

    .line 54
    .line 55
    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    iget v1, p1, Ld/a;->a:I

    .line 60
    .line 61
    iget-object p1, p1, Ld/a;->b:Landroid/content/Intent;

    .line 62
    .line 63
    invoke-virtual {v2, v0, v1, p1}, Lx0/i;->onActivityResult(IILandroid/content/Intent;)V

    .line 64
    .line 65
    .line 66
    :goto_1
    return-void
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
