.class public final Lm8/a$n;
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
    name = "n"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly8/d<",
        "Lm8/f0$e$d$a$b$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lm8/a$n;

.field public static final b:Ly8/c;

.field public static final c:Ly8/c;

.field public static final d:Ly8/c;

.field public static final e:Ly8/c;

.field public static final f:Ly8/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm8/a$n;

    invoke-direct {v0}, Lm8/a$n;-><init>()V

    sput-object v0, Lm8/a$n;->a:Lm8/a$n;

    const-string v0, "type"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$n;->b:Ly8/c;

    const-string v0, "reason"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$n;->c:Ly8/c;

    const-string v0, "frames"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$n;->d:Ly8/c;

    const-string v0, "causedBy"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$n;->e:Ly8/c;

    const-string v0, "overflowCount"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$n;->f:Ly8/c;

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

    check-cast p1, Lm8/f0$e$d$a$b$b;

    check-cast p2, Ly8/e;

    sget-object v0, Lm8/a$n;->b:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$a$b$b;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$n;->c:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$a$b$b;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$n;->d:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$a$b$b;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$n;->e:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$a$b$b;->a()Lm8/f0$e$d$a$b$b;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$n;->f:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$a$b$b;->c()I

    move-result p1

    invoke-interface {p2, v0, p1}, Ly8/e;->c(Ly8/c;I)Ly8/e;

    return-void
.end method
