.class public final Lm8/a$m;
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
    name = "m"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly8/d<",
        "Lm8/f0$e$d$a$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lm8/a$m;

.field public static final b:Ly8/c;

.field public static final c:Ly8/c;

.field public static final d:Ly8/c;

.field public static final e:Ly8/c;

.field public static final f:Ly8/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm8/a$m;

    invoke-direct {v0}, Lm8/a$m;-><init>()V

    sput-object v0, Lm8/a$m;->a:Lm8/a$m;

    const-string v0, "threads"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$m;->b:Ly8/c;

    const-string v0, "exception"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$m;->c:Ly8/c;

    const-string v0, "appExitInfo"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$m;->d:Ly8/c;

    const-string v0, "signal"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$m;->e:Ly8/c;

    const-string v0, "binaries"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$m;->f:Ly8/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lm8/f0$e$d$a$b;

    check-cast p2, Ly8/e;

    sget-object v0, Lm8/a$m;->b:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$a$b;->e()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$m;->c:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$a$b;->c()Lm8/f0$e$d$a$b$b;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$m;->d:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$a$b;->a()Lm8/f0$a;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$m;->e:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$a$b;->d()Lm8/f0$e$d$a$b$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$m;->f:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$a$b;->b()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    return-void
.end method
