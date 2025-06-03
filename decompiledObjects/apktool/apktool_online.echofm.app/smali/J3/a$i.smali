.class public final LJ3/a$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj4/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation


# static fields
.field public static final a:LJ3/a$i;

.field public static final b:Lj4/c;

.field public static final c:Lj4/c;

.field public static final d:Lj4/c;

.field public static final e:Lj4/c;

.field public static final f:Lj4/c;

.field public static final g:Lj4/c;

.field public static final h:Lj4/c;

.field public static final i:Lj4/c;

.field public static final j:Lj4/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LJ3/a$i;

    .line 2
    .line 3
    invoke-direct {v0}, LJ3/a$i;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LJ3/a$i;->a:LJ3/a$i;

    .line 7
    .line 8
    const-string v0, "arch"

    .line 9
    .line 10
    invoke-static {v0}, Lj4/c;->d(Ljava/lang/String;)Lj4/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, LJ3/a$i;->b:Lj4/c;

    .line 15
    .line 16
    const-string v0, "model"

    .line 17
    .line 18
    invoke-static {v0}, Lj4/c;->d(Ljava/lang/String;)Lj4/c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, LJ3/a$i;->c:Lj4/c;

    .line 23
    .line 24
    const-string v0, "cores"

    .line 25
    .line 26
    invoke-static {v0}, Lj4/c;->d(Ljava/lang/String;)Lj4/c;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, LJ3/a$i;->d:Lj4/c;

    .line 31
    .line 32
    const-string v0, "ram"

    .line 33
    .line 34
    invoke-static {v0}, Lj4/c;->d(Ljava/lang/String;)Lj4/c;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, LJ3/a$i;->e:Lj4/c;

    .line 39
    .line 40
    const-string v0, "diskSpace"

    .line 41
    .line 42
    invoke-static {v0}, Lj4/c;->d(Ljava/lang/String;)Lj4/c;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, LJ3/a$i;->f:Lj4/c;

    .line 47
    .line 48
    const-string v0, "simulator"

    .line 49
    .line 50
    invoke-static {v0}, Lj4/c;->d(Ljava/lang/String;)Lj4/c;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sput-object v0, LJ3/a$i;->g:Lj4/c;

    .line 55
    .line 56
    const-string v0, "state"

    .line 57
    .line 58
    invoke-static {v0}, Lj4/c;->d(Ljava/lang/String;)Lj4/c;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sput-object v0, LJ3/a$i;->h:Lj4/c;

    .line 63
    .line 64
    const-string v0, "manufacturer"

    .line 65
    .line 66
    invoke-static {v0}, Lj4/c;->d(Ljava/lang/String;)Lj4/c;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    sput-object v0, LJ3/a$i;->i:Lj4/c;

    .line 71
    .line 72
    const-string v0, "modelClass"

    .line 73
    .line 74
    invoke-static {v0}, Lj4/c;->d(Ljava/lang/String;)Lj4/c;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    sput-object v0, LJ3/a$i;->j:Lj4/c;

    .line 79
    .line 80
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, LJ3/B$e$c;

    .line 2
    .line 3
    check-cast p2, Lj4/e;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LJ3/a$i;->b(LJ3/B$e$c;Lj4/e;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public b(LJ3/B$e$c;Lj4/e;)V
    .locals 3

    .line 1
    sget-object v0, LJ3/a$i;->b:Lj4/c;

    .line 2
    .line 3
    invoke-virtual {p1}, LJ3/B$e$c;->b()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-interface {p2, v0, v1}, Lj4/e;->c(Lj4/c;I)Lj4/e;

    .line 8
    .line 9
    .line 10
    sget-object v0, LJ3/a$i;->c:Lj4/c;

    .line 11
    .line 12
    invoke-virtual {p1}, LJ3/B$e$c;->f()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {p2, v0, v1}, Lj4/e;->g(Lj4/c;Ljava/lang/Object;)Lj4/e;

    .line 17
    .line 18
    .line 19
    sget-object v0, LJ3/a$i;->d:Lj4/c;

    .line 20
    .line 21
    invoke-virtual {p1}, LJ3/B$e$c;->c()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-interface {p2, v0, v1}, Lj4/e;->c(Lj4/c;I)Lj4/e;

    .line 26
    .line 27
    .line 28
    sget-object v0, LJ3/a$i;->e:Lj4/c;

    .line 29
    .line 30
    invoke-virtual {p1}, LJ3/B$e$c;->h()J

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    invoke-interface {p2, v0, v1, v2}, Lj4/e;->b(Lj4/c;J)Lj4/e;

    .line 35
    .line 36
    .line 37
    sget-object v0, LJ3/a$i;->f:Lj4/c;

    .line 38
    .line 39
    invoke-virtual {p1}, LJ3/B$e$c;->d()J

    .line 40
    .line 41
    .line 42
    move-result-wide v1

    .line 43
    invoke-interface {p2, v0, v1, v2}, Lj4/e;->b(Lj4/c;J)Lj4/e;

    .line 44
    .line 45
    .line 46
    sget-object v0, LJ3/a$i;->g:Lj4/c;

    .line 47
    .line 48
    invoke-virtual {p1}, LJ3/B$e$c;->j()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-interface {p2, v0, v1}, Lj4/e;->f(Lj4/c;Z)Lj4/e;

    .line 53
    .line 54
    .line 55
    sget-object v0, LJ3/a$i;->h:Lj4/c;

    .line 56
    .line 57
    invoke-virtual {p1}, LJ3/B$e$c;->i()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    invoke-interface {p2, v0, v1}, Lj4/e;->c(Lj4/c;I)Lj4/e;

    .line 62
    .line 63
    .line 64
    sget-object v0, LJ3/a$i;->i:Lj4/c;

    .line 65
    .line 66
    invoke-virtual {p1}, LJ3/B$e$c;->e()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-interface {p2, v0, v1}, Lj4/e;->g(Lj4/c;Ljava/lang/Object;)Lj4/e;

    .line 71
    .line 72
    .line 73
    sget-object v0, LJ3/a$i;->j:Lj4/c;

    .line 74
    .line 75
    invoke-virtual {p1}, LJ3/B$e$c;->g()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-interface {p2, v0, p1}, Lj4/e;->g(Lj4/c;Ljava/lang/Object;)Lj4/e;

    .line 80
    .line 81
    .line 82
    return-void
.end method
