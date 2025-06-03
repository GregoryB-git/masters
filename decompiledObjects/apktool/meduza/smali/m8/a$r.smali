.class public final Lm8/a$r;
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
    name = "r"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly8/d<",
        "Lm8/f0$e$d$a$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lm8/a$r;

.field public static final b:Ly8/c;

.field public static final c:Ly8/c;

.field public static final d:Ly8/c;

.field public static final e:Ly8/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm8/a$r;

    invoke-direct {v0}, Lm8/a$r;-><init>()V

    sput-object v0, Lm8/a$r;->a:Lm8/a$r;

    const-string v0, "processName"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$r;->b:Ly8/c;

    const-string v0, "pid"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$r;->c:Ly8/c;

    const-string v0, "importance"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$r;->d:Ly8/c;

    const-string v0, "defaultProcess"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$r;->e:Ly8/c;

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

    check-cast p1, Lm8/f0$e$d$a$c;

    check-cast p2, Ly8/e;

    sget-object v0, Lm8/a$r;->b:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$a$c;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$r;->c:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$a$c;->b()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ly8/e;->c(Ly8/c;I)Ly8/e;

    sget-object v0, Lm8/a$r;->d:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$a$c;->a()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ly8/e;->c(Ly8/c;I)Ly8/e;

    sget-object v0, Lm8/a$r;->e:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$a$c;->d()Z

    move-result p1

    invoke-interface {p2, v0, p1}, Ly8/e;->a(Ly8/c;Z)Ly8/e;

    return-void
.end method
