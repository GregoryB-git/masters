.class public final Lgb/d1$e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgb/d1$e;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lgb/d1$e;


# direct methods
.method public constructor <init>(Lgb/d1$e;)V
    .locals 0

    iput-object p1, p0, Lgb/d1$e$c;->a:Lgb/d1$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lgb/d1$e$c;->a:Lgb/d1$e;

    .line 2
    .line 3
    iget-object v1, v0, Lgb/d1$e;->c:Lgb/d1;

    .line 4
    .line 5
    iget-object v1, v1, Lgb/d1;->t:Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object v0, v0, Lgb/d1$e;->a:Lgb/x;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lgb/d1$e$c;->a:Lgb/d1$e;

    .line 13
    .line 14
    iget-object v0, v0, Lgb/d1$e;->c:Lgb/d1;

    .line 15
    .line 16
    iget-object v0, v0, Lgb/d1;->x:Leb/o;

    .line 17
    .line 18
    iget-object v0, v0, Leb/o;->a:Leb/n;

    .line 19
    .line 20
    sget-object v1, Leb/n;->e:Leb/n;

    .line 21
    .line 22
    if-ne v0, v1, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Lgb/d1$e$c;->a:Lgb/d1$e;

    .line 25
    .line 26
    iget-object v0, v0, Lgb/d1$e;->c:Lgb/d1;

    .line 27
    .line 28
    iget-object v0, v0, Lgb/d1;->t:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    iget-object v0, p0, Lgb/d1$e$c;->a:Lgb/d1$e;

    .line 37
    .line 38
    iget-object v0, v0, Lgb/d1$e;->c:Lgb/d1;

    .line 39
    .line 40
    iget-object v1, v0, Lgb/d1;->l:Leb/h1;

    .line 41
    .line 42
    new-instance v2, Lgb/i1;

    .line 43
    .line 44
    invoke-direct {v2, v0}, Lgb/i1;-><init>(Lgb/d1;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v2}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    return-void
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
