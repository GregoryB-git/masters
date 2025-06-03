.class public final Lv3/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv5/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv3/k$a;
    }
.end annotation


# instance fields
.field public final a:Lv5/y;

.field public final b:Lv3/k$a;

.field public c:Lv3/j1;

.field public d:Lv5/o;

.field public e:Z

.field public f:Z


# direct methods
.method public constructor <init>(Lv3/k$a;Lv5/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/k;->b:Lv3/k$a;

    new-instance p1, Lv5/y;

    invoke-direct {p1, p2}, Lv5/y;-><init>(Lv5/c;)V

    iput-object p1, p0, Lv3/k;->a:Lv5/y;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lv3/k;->e:Z

    return-void
.end method


# virtual methods
.method public final c(Lv3/e1;)V
    .locals 1

    iget-object v0, p0, Lv3/k;->d:Lv5/o;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lv5/o;->c(Lv3/e1;)V

    iget-object p1, p0, Lv3/k;->d:Lv5/o;

    invoke-interface {p1}, Lv5/o;->f()Lv3/e1;

    move-result-object p1

    :cond_0
    iget-object v0, p0, Lv3/k;->a:Lv5/y;

    invoke-virtual {v0, p1}, Lv5/y;->c(Lv3/e1;)V

    return-void
.end method

.method public final f()Lv3/e1;
    .locals 1

    iget-object v0, p0, Lv3/k;->d:Lv5/o;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lv5/o;->f()Lv3/e1;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lv3/k;->a:Lv5/y;

    iget-object v0, v0, Lv5/y;->e:Lv3/e1;

    :goto_0
    return-object v0
.end method

.method public final l()J
    .locals 2

    .line 1
    iget-boolean v0, p0, Lv3/k;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lv3/k;->a:Lv5/y;

    .line 6
    .line 7
    invoke-virtual {v0}, Lv5/y;->l()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lv3/k;->d:Lv5/o;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Lv5/o;->l()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    :goto_0
    return-wide v0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
