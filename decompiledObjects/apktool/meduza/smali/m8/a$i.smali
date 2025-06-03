.class public final Lm8/a$i;
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
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly8/d<",
        "Lm8/f0$e$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lm8/a$i;

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

    new-instance v0, Lm8/a$i;

    invoke-direct {v0}, Lm8/a$i;-><init>()V

    sput-object v0, Lm8/a$i;->a:Lm8/a$i;

    const-string v0, "arch"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$i;->b:Ly8/c;

    const-string v0, "model"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$i;->c:Ly8/c;

    const-string v0, "cores"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$i;->d:Ly8/c;

    const-string v0, "ram"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$i;->e:Ly8/c;

    const-string v0, "diskSpace"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$i;->f:Ly8/c;

    const-string v0, "simulator"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$i;->g:Ly8/c;

    const-string v0, "state"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$i;->h:Ly8/c;

    const-string v0, "manufacturer"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$i;->i:Ly8/c;

    const-string v0, "modelClass"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$i;->j:Ly8/c;

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

    check-cast p1, Lm8/f0$e$c;

    check-cast p2, Ly8/e;

    sget-object v0, Lm8/a$i;->b:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$c;->a()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ly8/e;->c(Ly8/c;I)Ly8/e;

    sget-object v0, Lm8/a$i;->c:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$c;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$i;->d:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$c;->b()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ly8/e;->c(Ly8/c;I)Ly8/e;

    sget-object v0, Lm8/a$i;->e:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$c;->g()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ly8/e;->d(Ly8/c;J)Ly8/e;

    sget-object v0, Lm8/a$i;->f:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$c;->c()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ly8/e;->d(Ly8/c;J)Ly8/e;

    sget-object v0, Lm8/a$i;->g:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$c;->i()Z

    move-result v1

    invoke-interface {p2, v0, v1}, Ly8/e;->a(Ly8/c;Z)Ly8/e;

    sget-object v0, Lm8/a$i;->h:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$c;->h()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ly8/e;->c(Ly8/c;I)Ly8/e;

    sget-object v0, Lm8/a$i;->i:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$c;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$i;->j:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$c;->f()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    return-void
.end method
