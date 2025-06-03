.class public final Lm8/a$s;
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
    name = "s"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly8/d<",
        "Lm8/f0$e$d$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lm8/a$s;

.field public static final b:Ly8/c;

.field public static final c:Ly8/c;

.field public static final d:Ly8/c;

.field public static final e:Ly8/c;

.field public static final f:Ly8/c;

.field public static final g:Ly8/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm8/a$s;

    invoke-direct {v0}, Lm8/a$s;-><init>()V

    sput-object v0, Lm8/a$s;->a:Lm8/a$s;

    const-string v0, "batteryLevel"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$s;->b:Ly8/c;

    const-string v0, "batteryVelocity"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$s;->c:Ly8/c;

    const-string v0, "proximityOn"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$s;->d:Ly8/c;

    const-string v0, "orientation"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$s;->e:Ly8/c;

    const-string v0, "ramUsed"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$s;->f:Ly8/c;

    const-string v0, "diskUsed"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$s;->g:Ly8/c;

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

    check-cast p1, Lm8/f0$e$d$c;

    check-cast p2, Ly8/e;

    sget-object v0, Lm8/a$s;->b:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$c;->a()Ljava/lang/Double;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$s;->c:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$c;->b()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ly8/e;->c(Ly8/c;I)Ly8/e;

    sget-object v0, Lm8/a$s;->d:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$c;->f()Z

    move-result v1

    invoke-interface {p2, v0, v1}, Ly8/e;->a(Ly8/c;Z)Ly8/e;

    sget-object v0, Lm8/a$s;->e:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$c;->d()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ly8/e;->c(Ly8/c;I)Ly8/e;

    sget-object v0, Lm8/a$s;->f:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$c;->e()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ly8/e;->d(Ly8/c;J)Ly8/e;

    sget-object v0, Lm8/a$s;->g:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$c;->c()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ly8/e;->d(Ly8/c;J)Ly8/e;

    return-void
.end method
