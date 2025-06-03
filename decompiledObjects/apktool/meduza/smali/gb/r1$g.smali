.class public final Lgb/r1$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/h2$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/r1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "g"
.end annotation


# instance fields
.field public final synthetic a:Lgb/r1;


# direct methods
.method public constructor <init>(Lgb/r1;)V
    .locals 0

    iput-object p1, p0, Lgb/r1$g;->a:Lgb/r1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Leb/e1;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lgb/r1$g;->a:Lgb/r1;

    .line 2
    .line 3
    iget-object p1, p1, Lgb/r1;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const-string v0, "Channel must have been shut down"

    .line 10
    .line 11
    invoke-static {p1, v0}, Lx6/b;->I(ZLjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
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
.end method

.method public final b()V
    .locals 0

    return-void
.end method

.method public final c(Leb/a;)Leb/a;
    .locals 0

    return-object p1
.end method

.method public final d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lgb/r1$g;->a:Lgb/r1;

    .line 2
    .line 3
    iget-object v0, v0, Lgb/r1;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const-string v1, "Channel must have been shut down"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lx6/b;->I(ZLjava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lgb/r1$g;->a:Lgb/r1;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    iput-boolean v1, v0, Lgb/r1;->J:Z

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1}, Lgb/r1;->Q(Z)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lgb/r1$g;->a:Lgb/r1;

    .line 24
    .line 25
    invoke-static {v0}, Lgb/r1;->J(Lgb/r1;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lgb/r1$g;->a:Lgb/r1;

    .line 29
    .line 30
    invoke-static {v0}, Lgb/r1;->K(Lgb/r1;)V

    .line 31
    .line 32
    .line 33
    return-void
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

.method public final e(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lgb/r1$g;->a:Lgb/r1;

    .line 2
    .line 3
    iget-object v1, v0, Lgb/r1;->b0:Lgb/r1$i;

    .line 4
    .line 5
    iget-object v0, v0, Lgb/r1;->F:Lgb/f0;

    .line 6
    .line 7
    invoke-virtual {v1, v0, p1}, Lgb/c1;->c(Ljava/lang/Object;Z)V

    .line 8
    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
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
.end method
