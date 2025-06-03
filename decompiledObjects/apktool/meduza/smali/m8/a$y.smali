.class public final Lm8/a$y;
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
    name = "y"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly8/d<",
        "Lm8/f0$e$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lm8/a$y;

.field public static final b:Ly8/c;

.field public static final c:Ly8/c;

.field public static final d:Ly8/c;

.field public static final e:Ly8/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm8/a$y;

    invoke-direct {v0}, Lm8/a$y;-><init>()V

    sput-object v0, Lm8/a$y;->a:Lm8/a$y;

    const-string v0, "platform"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$y;->b:Ly8/c;

    const-string v0, "version"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$y;->c:Ly8/c;

    const-string v0, "buildVersion"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$y;->d:Ly8/c;

    const-string v0, "jailbroken"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lm8/a$y;->e:Ly8/c;

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

    check-cast p1, Lm8/f0$e$e;

    check-cast p2, Ly8/e;

    sget-object v0, Lm8/a$y;->b:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$e;->b()I

    move-result v1

    invoke-interface {p2, v0, v1}, Ly8/e;->c(Ly8/c;I)Ly8/e;

    sget-object v0, Lm8/a$y;->c:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$y;->d:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    sget-object v0, Lm8/a$y;->e:Ly8/c;

    invoke-virtual {p1}, Lm8/f0$e$e;->d()Z

    move-result p1

    invoke-interface {p2, v0, p1}, Ly8/e;->a(Ly8/c;Z)Ly8/e;

    return-void
.end method
