.class public LL/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LL/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic o:LL/a;


# direct methods
.method public constructor <init>(LL/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LL/a$b;->o:LL/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, LL/a$b;->o:LL/a;

    .line 2
    .line 3
    iget-boolean v1, v0, LL/a;->C:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-boolean v1, v0, LL/a;->A:Z

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    iput-boolean v2, v0, LL/a;->A:Z

    .line 14
    .line 15
    iget-object v0, v0, LL/a;->o:LL/a$a;

    .line 16
    .line 17
    invoke-virtual {v0}, LL/a$a;->m()V

    .line 18
    .line 19
    .line 20
    :cond_1
    iget-object v0, p0, LL/a$b;->o:LL/a;

    .line 21
    .line 22
    iget-object v0, v0, LL/a;->o:LL/a$a;

    .line 23
    .line 24
    invoke-virtual {v0}, LL/a$a;->h()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_4

    .line 29
    .line 30
    iget-object v1, p0, LL/a$b;->o:LL/a;

    .line 31
    .line 32
    invoke-virtual {v1}, LL/a;->u()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    iget-object v1, p0, LL/a$b;->o:LL/a;

    .line 40
    .line 41
    iget-boolean v3, v1, LL/a;->B:Z

    .line 42
    .line 43
    if-eqz v3, :cond_3

    .line 44
    .line 45
    iput-boolean v2, v1, LL/a;->B:Z

    .line 46
    .line 47
    invoke-virtual {v1}, LL/a;->c()V

    .line 48
    .line 49
    .line 50
    :cond_3
    invoke-virtual {v0}, LL/a$a;->a()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, LL/a$a;->b()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-virtual {v0}, LL/a$a;->c()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iget-object v2, p0, LL/a$b;->o:LL/a;

    .line 62
    .line 63
    invoke-virtual {v2, v1, v0}, LL/a;->j(II)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, LL/a$b;->o:LL/a;

    .line 67
    .line 68
    iget-object v0, v0, LL/a;->q:Landroid/view/View;

    .line 69
    .line 70
    invoke-static {v0, p0}, LI/s;->y(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_4
    :goto_0
    iget-object v0, p0, LL/a$b;->o:LL/a;

    .line 75
    .line 76
    iput-boolean v2, v0, LL/a;->C:Z

    .line 77
    .line 78
    return-void
.end method
