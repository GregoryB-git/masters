.class public final Lgb/c3$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/c3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lgb/c3;


# direct methods
.method public constructor <init>(Lgb/c3;)V
    .locals 0

    iput-object p1, p0, Lgb/c3$b;->a:Lgb/c3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Leb/e1;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Leb/e1;->e()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lgb/c3$b;->a:Lgb/c3;

    .line 8
    .line 9
    iget-object p1, p1, Lgb/c3;->b:Lgb/b3;

    .line 10
    .line 11
    check-cast p1, Lgb/k;

    .line 12
    .line 13
    iget-object v0, p1, Lgb/k;->b:Leb/h1;

    .line 14
    .line 15
    invoke-virtual {v0}, Leb/h1;->d()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p1, Lgb/k;->b:Leb/h1;

    .line 19
    .line 20
    new-instance v1, Lb/d;

    .line 21
    .line 22
    const/16 v2, 0x17

    .line 23
    .line 24
    invoke-direct {v1, p1, v2}, Lb/d;-><init>(Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object p1, p0, Lgb/c3$b;->a:Lgb/c3;

    .line 32
    .line 33
    iget-object v0, p1, Lgb/c3;->b:Lgb/b3;

    .line 34
    .line 35
    new-instance v1, Lgb/c3$a;

    .line 36
    .line 37
    invoke-direct {v1, p1}, Lgb/c3$a;-><init>(Lgb/c3;)V

    .line 38
    .line 39
    .line 40
    check-cast v0, Lgb/k;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lgb/k;->a(Lgb/c3$a;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    return-void
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
