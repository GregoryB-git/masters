.class public final Lm8/a$p;
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
    name = "p"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly8/d<",
        "Lm8/f0$e$d$a$b$d;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lm8/a$p;

.field public static final b:Ly8/c;

.field public static final c:Ly8/c;

.field public static final d:Ly8/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm8/a$p;

    invoke-direct {v0}, Lm8/a$p;-><init>()V

    sput-object v0, Lm8/a$p;->a:Lm8/a$p;

    const-string v0, "name"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$p;->b:Ly8/c;

    const-string v0, "importance"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$p;->c:Ly8/c;

    const-string v0, "frames"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$p;->d:Ly8/c;

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

    check-cast p1, Lm8/f0$e$d$a$b$d;

    check-cast p2, Ly8/e;

    sget-object v0, Lm8/a$p;->b:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$a$b$d;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$p;->c:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$a$b$d;->b()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ly8/e;->c(Ly8/c;I)Ly8/e;

    sget-object v0, Lm8/a$p;->d:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$d$a$b$d;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    return-void
.end method
