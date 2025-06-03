.class public final Lm8/a$b;
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
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly8/d<",
        "Lm8/f0$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lm8/a$b;

.field public static final b:Ly8/c;

.field public static final c:Ly8/c;

.field public static final d:Ly8/c;

.field public static final e:Ly8/c;

.field public static final f:Ly8/c;

.field public static final g:Ly8/c;

.field public static final h:Ly8/c;

.field public static final i:Ly8/c;

.field public static final j:Ly8/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm8/a$b;

    invoke-direct {v0}, Lm8/a$b;-><init>()V

    sput-object v0, Lm8/a$b;->a:Lm8/a$b;

    const-string v0, "pid"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$b;->b:Ly8/c;

    const-string v0, "processName"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$b;->c:Ly8/c;

    const-string v0, "reasonCode"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$b;->d:Ly8/c;

    const-string v0, "importance"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$b;->e:Ly8/c;

    const-string v0, "pss"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$b;->f:Ly8/c;

    const-string v0, "rss"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$b;->g:Ly8/c;

    const-string v0, "timestamp"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$b;->h:Ly8/c;

    const-string v0, "traceFile"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$b;->i:Ly8/c;

    const-string v0, "buildIdMappingForArch"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$b;->j:Ly8/c;

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

    check-cast p1, Lm8/f0$a;

    check-cast p2, Ly8/e;

    sget-object v0, Lm8/a$b;->b:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$a;->c()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ly8/e;->c(Ly8/c;I)Ly8/e;

    sget-object v0, Lm8/a$b;->c:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$b;->d:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$a;->f()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ly8/e;->c(Ly8/c;I)Ly8/e;

    sget-object v0, Lm8/a$b;->e:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$a;->b()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ly8/e;->c(Ly8/c;I)Ly8/e;

    sget-object v0, Lm8/a$b;->f:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$a;->e()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ly8/e;->d(Ly8/c;J)Ly8/e;

    sget-object v0, Lm8/a$b;->g:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$a;->g()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ly8/e;->d(Ly8/c;J)Ly8/e;

    sget-object v0, Lm8/a$b;->h:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$a;->h()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ly8/e;->d(Ly8/c;J)Ly8/e;

    sget-object v0, Lm8/a$b;->i:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$a;->i()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$b;->j:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$a;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    return-void
.end method
