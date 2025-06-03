.class public final Lm8/a$q;
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
    name = "q"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly8/d<",
        "Lm8/f0$e$d$a$b$d$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lm8/a$q;

.field public static final b:Ly8/c;

.field public static final c:Ly8/c;

.field public static final d:Ly8/c;

.field public static final e:Ly8/c;

.field public static final f:Ly8/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm8/a$q;

    invoke-direct {v0}, Lm8/a$q;-><init>()V

    sput-object v0, Lm8/a$q;->a:Lm8/a$q;

    const-string v0, "pc"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$q;->b:Ly8/c;

    const-string v0, "symbol"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$q;->c:Ly8/c;

    const-string v0, "file"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$q;->d:Ly8/c;

    const-string v0, "offset"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$q;->e:Ly8/c;

    const-string v0, "importance"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$q;->f:Ly8/c;

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

    check-cast p1, Lm8/f0$e$d$a$b$d$a;

    check-cast p2, Ly8/e;

    sget-object v0, Lm8/a$q;->b:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$a$b$d$a;->d()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ly8/e;->d(Ly8/c;J)Ly8/e;

    sget-object v0, Lm8/a$q;->c:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$a$b$d$a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$q;->d:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$a$b$d$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$q;->e:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$a$b$d$a;->c()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Ly8/e;->d(Ly8/c;J)Ly8/e;

    sget-object v0, Lm8/a$q;->f:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$a$b$d$a;->b()I

    move-result p1

    invoke-interface {p2, v0, p1}, Ly8/e;->c(Ly8/c;I)Ly8/e;

    return-void
.end method
