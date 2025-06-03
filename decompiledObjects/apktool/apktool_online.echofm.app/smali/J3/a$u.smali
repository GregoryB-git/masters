.class public final LJ3/a$u;
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
    name = "u"
.end annotation


# static fields
.field public static final a:LJ3/a$u;

.field public static final b:Lj4/c;

.field public static final c:Lj4/c;

.field public static final d:Lj4/c;

.field public static final e:Lj4/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LJ3/a$u;

    .line 2
    .line 3
    invoke-direct {v0}, LJ3/a$u;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LJ3/a$u;->a:LJ3/a$u;

    .line 7
    .line 8
    const-string v0, "platform"

    .line 9
    .line 10
    invoke-static {v0}, Lj4/c;->d(Ljava/lang/String;)Lj4/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, LJ3/a$u;->b:Lj4/c;

    .line 15
    .line 16
    const-string v0, "version"

    .line 17
    .line 18
    invoke-static {v0}, Lj4/c;->d(Ljava/lang/String;)Lj4/c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, LJ3/a$u;->c:Lj4/c;

    .line 23
    .line 24
    const-string v0, "buildVersion"

    .line 25
    .line 26
    invoke-static {v0}, Lj4/c;->d(Ljava/lang/String;)Lj4/c;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, LJ3/a$u;->d:Lj4/c;

    .line 31
    .line 32
    const-string v0, "jailbroken"

    .line 33
    .line 34
    invoke-static {v0}, Lj4/c;->d(Ljava/lang/String;)Lj4/c;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, LJ3/a$u;->e:Lj4/c;

    .line 39
    .line 40
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
    check-cast p1, LJ3/B$e$e;

    .line 2
    .line 3
    check-cast p2, Lj4/e;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LJ3/a$u;->b(LJ3/B$e$e;Lj4/e;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public b(LJ3/B$e$e;Lj4/e;)V
    .locals 2

    .line 1
    sget-object v0, LJ3/a$u;->b:Lj4/c;

    .line 2
    .line 3
    invoke-virtual {p1}, LJ3/B$e$e;->c()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-interface {p2, v0, v1}, Lj4/e;->c(Lj4/c;I)Lj4/e;

    .line 8
    .line 9
    .line 10
    sget-object v0, LJ3/a$u;->c:Lj4/c;

    .line 11
    .line 12
    invoke-virtual {p1}, LJ3/B$e$e;->d()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {p2, v0, v1}, Lj4/e;->g(Lj4/c;Ljava/lang/Object;)Lj4/e;

    .line 17
    .line 18
    .line 19
    sget-object v0, LJ3/a$u;->d:Lj4/c;

    .line 20
    .line 21
    invoke-virtual {p1}, LJ3/B$e$e;->b()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {p2, v0, v1}, Lj4/e;->g(Lj4/c;Ljava/lang/Object;)Lj4/e;

    .line 26
    .line 27
    .line 28
    sget-object v0, LJ3/a$u;->e:Lj4/c;

    .line 29
    .line 30
    invoke-virtual {p1}, LJ3/B$e$e;->e()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-interface {p2, v0, p1}, Lj4/e;->f(Lj4/c;Z)Lj4/e;

    .line 35
    .line 36
    .line 37
    return-void
.end method
