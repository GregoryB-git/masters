.class public final LJ3/a$c;
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
    name = "c"
.end annotation


# static fields
.field public static final a:LJ3/a$c;

.field public static final b:Lj4/c;

.field public static final c:Lj4/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LJ3/a$c;

    .line 2
    .line 3
    invoke-direct {v0}, LJ3/a$c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LJ3/a$c;->a:LJ3/a$c;

    .line 7
    .line 8
    const-string v0, "key"

    .line 9
    .line 10
    invoke-static {v0}, Lj4/c;->d(Ljava/lang/String;)Lj4/c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, LJ3/a$c;->b:Lj4/c;

    .line 15
    .line 16
    const-string v0, "value"

    .line 17
    .line 18
    invoke-static {v0}, Lj4/c;->d(Ljava/lang/String;)Lj4/c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, LJ3/a$c;->c:Lj4/c;

    .line 23
    .line 24
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
    check-cast p1, LJ3/B$c;

    .line 2
    .line 3
    check-cast p2, Lj4/e;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LJ3/a$c;->b(LJ3/B$c;Lj4/e;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public b(LJ3/B$c;Lj4/e;)V
    .locals 2

    .line 1
    sget-object v0, LJ3/a$c;->b:Lj4/c;

    .line 2
    .line 3
    invoke-virtual {p1}, LJ3/B$c;->b()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {p2, v0, v1}, Lj4/e;->g(Lj4/c;Ljava/lang/Object;)Lj4/e;

    .line 8
    .line 9
    .line 10
    sget-object v0, LJ3/a$c;->c:Lj4/c;

    .line 11
    .line 12
    invoke-virtual {p1}, LJ3/B$c;->c()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-interface {p2, v0, p1}, Lj4/e;->g(Lj4/c;Ljava/lang/Object;)Lj4/e;

    .line 17
    .line 18
    .line 19
    return-void
.end method
