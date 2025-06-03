.class public final Lm8/a$t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly8/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "t"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly8/d<",
        "Lm8/f0$e$d;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lm8/a$t;

.field public static final b:Ly8/c;

.field public static final c:Ly8/c;

.field public static final d:Ly8/c;

.field public static final e:Ly8/c;

.field public static final f:Ly8/c;

.field public static final g:Ly8/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm8/a$t;

    invoke-direct {v0}, Lm8/a$t;-><init>()V

    sput-object v0, Lm8/a$t;->a:Lm8/a$t;

    const-string v0, "timestamp"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$t;->b:Ly8/c;

    const-string v0, "type"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$t;->c:Ly8/c;

    const-string v0, "app"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$t;->d:Ly8/c;

    const-string v0, "device"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$t;->e:Ly8/c;

    const-string v0, "log"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$t;->f:Ly8/c;

    const-string v0, "rollouts"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$t;->g:Ly8/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lm8/f0$e$d;

    check-cast p2, Ly8/e;

    sget-object v0, Lm8/a$t;->b:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d;->e()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ly8/e;->d(Ly8/c;J)Ly8/e;

    sget-object v0, Lm8/a$t;->c:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d;->f()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$t;->d:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d;->a()Lm8/f0$e$d$a;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$t;->e:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d;->b()Lm8/f0$e$d$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$t;->f:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d;->c()Lm8/f0$e$d$d;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$t;->g:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d;->d()Lm8/f0$e$d$f;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    return-void
.end method
