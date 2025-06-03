.class public final Lx2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/n;


# instance fields
.field public final a:Lp1/j;

.field public final b:Lx2/o$a;


# direct methods
.method public constructor <init>(Lp1/j;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx2/o;->a:Lp1/j;

    new-instance v0, Lx2/o$a;

    invoke-direct {v0, p1}, Lx2/o$a;-><init>(Lp1/j;)V

    iput-object v0, p0, Lx2/o;->b:Lx2/o$a;

    return-void
.end method


# virtual methods
.method public final a(Lx2/m;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx2/o;->a:Lp1/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp1/j;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lx2/o;->a:Lp1/j;

    .line 7
    .line 8
    invoke-virtual {v0}, Lp1/j;->c()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    iget-object v0, p0, Lx2/o;->b:Lx2/o$a;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lp1/d;->f(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lx2/o;->a:Lp1/j;

    .line 17
    .line 18
    invoke-virtual {p1}, Lp1/j;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lx2/o;->a:Lp1/j;

    .line 22
    .line 23
    invoke-virtual {p1}, Lp1/j;->j()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    iget-object v0, p0, Lx2/o;->a:Lp1/j;

    .line 29
    .line 30
    invoke-virtual {v0}, Lp1/j;->j()V

    .line 31
    .line 32
    .line 33
    throw p1
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

.method public final b(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 5

    const/4 v0, 0x1

    const-string v1, "SELECT name FROM workname WHERE work_spec_id=?"

    invoke-static {v0, v1}, Lp1/l;->C(ILjava/lang/String;)Lp1/l;

    move-result-object v1

    if-nez p1, :cond_0

    invoke-virtual {v1, v0}, Lp1/l;->d0(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v0, p1}, Lp1/l;->n(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lx2/o;->a:Lp1/j;

    invoke-virtual {p1}, Lp1/j;->b()V

    iget-object p1, p0, Lx2/o;->a:Lp1/j;

    const/4 v0, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v1, v0}, Lb/z;->o(Lp1/j;Lp1/l;Z)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p1, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_1

    move-object v4, v2

    goto :goto_2

    :cond_1
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    :goto_2
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v1}, Lp1/l;->H()V

    return-object v3

    :catchall_0
    move-exception v0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v1}, Lp1/l;->H()V

    throw v0
.end method
